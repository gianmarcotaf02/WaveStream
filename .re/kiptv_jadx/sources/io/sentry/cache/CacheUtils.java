package io.sentry.cache;

/* JADX INFO: loaded from: classes4.dex */
final class CacheUtils {
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");

    public static void delete(io.sentry.SentryOptions sentryOptions, java.lang.String str, java.lang.String str2) {
        java.io.File fileEnsureCacheDir = ensureCacheDir(sentryOptions, str);
        if (fileEnsureCacheDir == null) {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.INFO, "Cache dir is not set, cannot delete from scope cache", new java.lang.Object[0]);
            return;
        }
        java.io.File file = new java.io.File(fileEnsureCacheDir, str2);
        if (file.exists()) {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Deleting %s from scope cache", str2);
            if (file.delete()) {
                return;
            }
            sentryOptions.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    private static java.io.File ensureCacheDir(io.sentry.SentryOptions sentryOptions, java.lang.String str) {
        java.lang.String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        java.io.File file = new java.io.File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    public static <T, R> T read(io.sentry.SentryOptions sentryOptions, java.lang.String str, java.lang.String str2, java.lang.Class<T> cls, io.sentry.JsonDeserializer<R> jsonDeserializer) {
        java.io.File fileEnsureCacheDir = ensureCacheDir(sentryOptions, str);
        if (fileEnsureCacheDir == null) {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.INFO, "Cache dir is not set, cannot read from scope cache", new java.lang.Object[0]);
            return null;
        }
        java.io.File file = new java.io.File(fileEnsureCacheDir, str2);
        if (file.exists()) {
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), UTF_8));
                try {
                    T t9 = jsonDeserializer == null ? (T) sentryOptions.getSerializer().deserialize(bufferedReader, cls) : (T) sentryOptions.getSerializer().deserializeCollection(bufferedReader, cls, jsonDeserializer);
                    bufferedReader.close();
                    return t9;
                } catch (java.lang.Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                sentryOptions.getLogger().log(io.sentry.SentryLevel.ERROR, th3, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    public static <T> void store(io.sentry.SentryOptions sentryOptions, T t9, java.lang.String str, java.lang.String str2) {
        java.io.File fileEnsureCacheDir = ensureCacheDir(sentryOptions, str);
        if (fileEnsureCacheDir == null) {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new java.lang.Object[0]);
            return;
        }
        java.io.File file = new java.io.File(fileEnsureCacheDir, str2);
        if (file.exists()) {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file.delete()) {
                sentryOptions.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(fileOutputStream, UTF_8));
                try {
                    sentryOptions.getSerializer().serialize(t9, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (java.lang.Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.lang.Throwable th5) {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.ERROR, th5, "Error persisting entity: %s", str2);
        }
    }
}
