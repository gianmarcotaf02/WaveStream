package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerId {
    private final androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31 logSessionIdApi31;
    public final java.lang.String name;
    public static final androidx.media3.exoplayer.analytics.PlayerId UNSET = new androidx.media3.exoplayer.analytics.PlayerId("");
    public static final androidx.media3.exoplayer.analytics.PlayerId PRELOAD = new androidx.media3.exoplayer.analytics.PlayerId(io.ktor.http.LinkHeader.Rel.PreLoad);

    public static final class LogSessionIdApi31 {
        public android.media.metrics.LogSessionId logSessionId = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE;

        public void setLogSessionId(android.media.metrics.LogSessionId logSessionId) {
            android.media.metrics.LogSessionId logSessionId2 = this.logSessionId;
            android.media.metrics.LogSessionId unused = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(logSessionId2.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE));
            this.logSessionId = logSessionId;
        }
    }

    public PlayerId(java.lang.String str) {
        this.name = str;
        this.logSessionIdApi31 = android.os.Build.VERSION.SDK_INT >= 31 ? new androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31() : null;
    }

    public synchronized android.media.metrics.LogSessionId getLogSessionId() {
        androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31 logSessionIdApi31;
        logSessionIdApi31 = this.logSessionIdApi31;
        logSessionIdApi31.getClass();
        return logSessionIdApi31.logSessionId;
    }

    public synchronized void setLogSessionId(android.media.metrics.LogSessionId logSessionId) {
        androidx.media3.exoplayer.analytics.PlayerId.LogSessionIdApi31 logSessionIdApi31 = this.logSessionIdApi31;
        logSessionIdApi31.getClass();
        logSessionIdApi31.setLogSessionId(logSessionId);
    }
}
