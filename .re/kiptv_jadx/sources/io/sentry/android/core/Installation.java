package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
final class Installation {
    static final java.lang.String INSTALLATION = "INSTALLATION";
    static java.lang.String deviceId;
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    protected static final io.sentry.util.AutoClosableReentrantLock staticLock = new io.sentry.util.AutoClosableReentrantLock();

    private Installation() {
    }

    public static java.lang.String id(android.content.Context context) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
        try {
            if (deviceId == null) {
                java.io.File file = new java.io.File(context.getFilesDir(), INSTALLATION);
                try {
                    if (!file.exists()) {
                        java.lang.String strWriteInstallationFile = writeInstallationFile(file);
                        deviceId = strWriteInstallationFile;
                        if (iSentryLifecycleTokenAcquire != null) {
                            iSentryLifecycleTokenAcquire.close();
                        }
                        return strWriteInstallationFile;
                    }
                    deviceId = readInstallationFile(file);
                } catch (java.lang.Throwable th) {
                    throw new java.lang.RuntimeException(th);
                }
            }
            java.lang.String str = deviceId;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return str;
        } catch (java.lang.Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static java.lang.String readInstallationFile(java.io.File file) throws java.io.IOException {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            java.lang.String str = new java.lang.String(bArr, UTF_8);
            randomAccessFile.close();
            return str;
        } catch (java.lang.Throwable th) {
            try {
                randomAccessFile.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static java.lang.String writeInstallationFile(java.io.File file) throws java.io.IOException {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            java.lang.String strGenerateSentryId = io.sentry.SentryUUID.generateSentryId();
            fileOutputStream.write(strGenerateSentryId.getBytes(UTF_8));
            fileOutputStream.flush();
            fileOutputStream.close();
            return strGenerateSentryId;
        } catch (java.lang.Throwable th) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
