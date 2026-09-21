package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class Download {
    public static final int FAILURE_REASON_NONE = 0;
    public static final int FAILURE_REASON_UNKNOWN = 1;
    public static final int STATE_COMPLETED = 3;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_FAILED = 4;
    public static final int STATE_QUEUED = 0;
    public static final int STATE_REMOVING = 5;
    public static final int STATE_RESTARTING = 7;
    public static final int STATE_STOPPED = 1;
    public static final int STOP_REASON_NONE = 0;
    public final long contentLength;
    public final int failureReason;
    final androidx.media3.exoplayer.offline.DownloadProgress progress;
    public final androidx.media3.exoplayer.offline.DownloadRequest request;
    public final long startTimeMs;
    public final int state;
    public final int stopReason;
    public final long updateTimeMs;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FailureReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    public Download(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i3, long j, long j9, long j10, int i9, int i10) {
        this(downloadRequest, i3, j, j9, j10, i9, i10, new androidx.media3.exoplayer.offline.DownloadProgress());
    }

    public long getBytesDownloaded() {
        return this.progress.bytesDownloaded;
    }

    public float getPercentDownloaded() {
        return this.progress.percentDownloaded;
    }

    public boolean isTerminalState() {
        int i3 = this.state;
        return i3 == 3 || i3 == 4;
    }

    public Download(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i3, long j, long j9, long j10, int i9, int i10, androidx.media3.exoplayer.offline.DownloadProgress downloadProgress) {
        downloadProgress.getClass();
        boolean z6 = false;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L((i10 == 0) == (i3 != 4));
        if (i9 != 0) {
            if (i3 != 2 && i3 != 0) {
                z6 = true;
            }
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z6);
        }
        this.request = downloadRequest;
        this.state = i3;
        this.startTimeMs = j;
        this.updateTimeMs = j9;
        this.contentLength = j10;
        this.stopReason = i9;
        this.failureReason = i10;
        this.progress = downloadProgress;
    }
}
