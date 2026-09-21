package androidx.media3.common;

public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public VideoFrameProcessingException(String str, long j) {
        StringBuilder sbV = p121o0.p.v(str);
        sbV.append(getPresentationTimeUsString(j));
        super(sbV.toString());
        this.presentationTimeUs = j;
    }

    public static VideoFrameProcessingException from(Exception exc) {
        return from(exc, C.TIME_UNSET);
    }

    private static String getPresentationTimeUsString(long j) {
        return j == C.TIME_UNSET ? " @UNSET" : B2.a.j(j, " @");
    }

    public static VideoFrameProcessingException from(Exception exc, long j) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j);
    }

    public VideoFrameProcessingException(String str, Throwable th, long j) {
        StringBuilder sbV = p121o0.p.v(str);
        sbV.append(getPresentationTimeUsString(j));
        super(sbV.toString(), th);
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(String str) {
        this(str, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(String str, Throwable th) {
        this(str, th, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(Throwable th) {
        this(th, C.TIME_UNSET);
    }

    public VideoFrameProcessingException(Throwable th, long j) {
        super(getPresentationTimeUsString(j), th);
        this.presentationTimeUs = j;
    }
}
