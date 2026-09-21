package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundExecutor {
    private static java.util.concurrent.Executor staticInstance;

    private BackgroundExecutor() {
    }

    public static synchronized java.util.concurrent.Executor get() {
        try {
            if (staticInstance == null) {
                staticInstance = androidx.media3.common.util.Util.newSingleThreadExecutor("ExoPlayer:BackgroundExecutor");
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return staticInstance;
    }

    public static synchronized void set(java.util.concurrent.Executor executor) {
        staticInstance = executor;
    }
}
