package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends androidx.media3.common.PlaybackException {
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;
    public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
    public final androidx.media3.common.Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final java.lang.String rendererName;
    public final int type;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private ExoPlaybackException(int i3, java.lang.Throwable th, int i9) {
        this(i3, th, null, i9, null, -1, null, 4, null, false);
    }

    public static androidx.media3.exoplayer.ExoPlaybackException createForRemote(java.lang.String str) {
        return new androidx.media3.exoplayer.ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, null, false);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.ExoPlaybackException createForRenderer(java.lang.Throwable th, java.lang.String str, int i3, androidx.media3.common.Format format, int i9, boolean z6, int i10) {
        return createForRenderer(th, str, i3, format, i9, null, z6, i10);
    }

    public static androidx.media3.exoplayer.ExoPlaybackException createForSource(java.io.IOException iOException, int i3) {
        return new androidx.media3.exoplayer.ExoPlaybackException(0, iOException, i3);
    }

    @java.lang.Deprecated
    public static androidx.media3.exoplayer.ExoPlaybackException createForUnexpected(java.lang.RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static java.lang.String deriveMessage(int i3, java.lang.String str, java.lang.String str2, int i9, androidx.media3.common.Format format, int i10) {
        java.lang.String str3;
        if (i3 == 0) {
            str3 = "Source error";
        } else if (i3 != 1) {
            str3 = i3 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i9 + ", format=" + format + ", format_supported=" + androidx.media3.common.util.Util.getFormatSupportString(i10);
        }
        return !android.text.TextUtils.isEmpty(str) ? p121o0.p.p(str3, ": ", str) : str3;
    }

    public androidx.media3.exoplayer.ExoPlaybackException copyWithMediaPeriodId(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return new androidx.media3.exoplayer.ExoPlaybackException((java.lang.String) androidx.media3.common.util.Util.castNonNull(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    @Override // androidx.media3.common.PlaybackException
    public boolean errorInfoEquals(androidx.media3.common.PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException = (androidx.media3.exoplayer.ExoPlaybackException) androidx.media3.common.util.Util.castNonNull(playbackException);
        return this.type == exoPlaybackException.type && java.util.Objects.equals(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && java.util.Objects.equals(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && java.util.Objects.equals(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    public java.lang.Exception getRendererException() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.type == 1);
        java.lang.Throwable cause = getCause();
        cause.getClass();
        return (java.lang.Exception) cause;
    }

    public java.io.IOException getSourceException() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.type == 0);
        java.lang.Throwable cause = getCause();
        cause.getClass();
        return (java.io.IOException) cause;
    }

    public java.lang.RuntimeException getUnexpectedException() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.type == 2);
        java.lang.Throwable cause = getCause();
        cause.getClass();
        return (java.lang.RuntimeException) cause;
    }

    private ExoPlaybackException(int i3, java.lang.Throwable th, java.lang.String str, int i9, java.lang.String str2, int i10, androidx.media3.common.Format format, int i11, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, boolean z6) {
        this(deriveMessage(i3, str, str2, i10, format, i11), th, i9, i3, str2, i10, format, i11, mediaPeriodId, android.os.SystemClock.elapsedRealtime(), z6);
    }

    public static androidx.media3.exoplayer.ExoPlaybackException createForRenderer(java.lang.Throwable th, java.lang.String str, int i3, androidx.media3.common.Format format, int i9, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, boolean z6, int i10) {
        if (format == null) {
            i9 = 4;
        }
        return new androidx.media3.exoplayer.ExoPlaybackException(1, th, null, i10, str, i3, format, i9, mediaPeriodId, z6);
    }

    public static androidx.media3.exoplayer.ExoPlaybackException createForUnexpected(java.lang.RuntimeException runtimeException, int i3) {
        return new androidx.media3.exoplayer.ExoPlaybackException(2, runtimeException, i3);
    }

    private ExoPlaybackException(java.lang.String str, java.lang.Throwable th, int i3, int i9, java.lang.String str2, int i10, androidx.media3.common.Format format, int i11, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z6) {
        super(str, th, i3, android.os.Bundle.EMPTY, j);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!z6 || i9 == 1);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(th != null || i9 == 3);
        this.type = i9;
        this.rendererName = str2;
        this.rendererIndex = i10;
        this.rendererFormat = format;
        this.rendererFormatSupport = i11;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z6;
    }
}
