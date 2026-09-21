package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class VideoFrameProcessingException extends java.lang.Exception {
    public final long presentationTimeUs;

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoFrameProcessingException(java.lang.String str, long j) {
        java.lang.StringBuilder sbV = p121o0.p.v(str);
        sbV.append(getPresentationTimeUsString(j));
        super(sbV.toString());
        this.presentationTimeUs = j;
    }

    public static androidx.media3.common.VideoFrameProcessingException from(java.lang.Exception exc) {
        return from(exc, androidx.media3.common.C.TIME_UNSET);
    }

    private static java.lang.String getPresentationTimeUsString(long j) {
        return j == androidx.media3.common.C.TIME_UNSET ? " @UNSET" : B2.a.j(j, " @");
    }

    public static androidx.media3.common.VideoFrameProcessingException from(java.lang.Exception exc, long j) {
        return exc instanceof androidx.media3.common.VideoFrameProcessingException ? (androidx.media3.common.VideoFrameProcessingException) exc : new androidx.media3.common.VideoFrameProcessingException(exc, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoFrameProcessingException(java.lang.String str, java.lang.Throwable th, long j) {
        java.lang.StringBuilder sbV = p121o0.p.v(str);
        sbV.append(getPresentationTimeUsString(j));
        super(sbV.toString(), th);
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(java.lang.String str) {
        this(str, androidx.media3.common.C.TIME_UNSET);
    }

    public VideoFrameProcessingException(java.lang.String str, java.lang.Throwable th) {
        this(str, th, androidx.media3.common.C.TIME_UNSET);
    }

    public VideoFrameProcessingException(java.lang.Throwable th) {
        this(th, androidx.media3.common.C.TIME_UNSET);
    }

    public VideoFrameProcessingException(java.lang.Throwable th, long j) {
        super(getPresentationTimeUsString(j), th);
        this.presentationTimeUs = j;
    }
}
