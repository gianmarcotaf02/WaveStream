package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

public final class ExoPlaybackException extends PlaybackException {
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;
    public final MediaSource.MediaPeriodId mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private ExoPlaybackException(int i3, Throwable th, int i9) {
        this(i3, th, null, i9, null, -1, null, 4, null, false);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, null, false);
    }

    @Deprecated
    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i3, Format format, int i9, boolean z6, int i10) {
        return createForRenderer(th, str, i3, format, i9, null, z6, i10);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i3) {
        return new ExoPlaybackException(0, iOException, i3);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i3, String str, String str2, int i9, Format format, int i10) {
        String str3;
        if (i3 == 0) {
            str3 = "Source error";
        } else if (i3 != 1) {
            str3 = i3 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i9 + ", format=" + format + ", format_supported=" + Util.getFormatSupportString(i10);
        }
        return !TextUtils.isEmpty(str) ? p121o0.p.p(str3, ": ", str) : str3;
    }

    public ExoPlaybackException copyWithMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return new ExoPlaybackException((String) Util.castNonNull(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    @Override
    public boolean errorInfoEquals(PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) Util.castNonNull(playbackException);
        return this.type == exoPlaybackException.type && Objects.equals(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && Objects.equals(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && Objects.equals(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    public Exception getRendererException() {
        AbstractC1864o0.Y(this.type == 1);
        Throwable cause = getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public IOException getSourceException() {
        AbstractC1864o0.Y(this.type == 0);
        Throwable cause = getCause();
        cause.getClass();
        return (IOException) cause;
    }

    public RuntimeException getUnexpectedException() {
        AbstractC1864o0.Y(this.type == 2);
        Throwable cause = getCause();
        cause.getClass();
        return (RuntimeException) cause;
    }

    private ExoPlaybackException(int i3, Throwable th, String str, int i9, String str2, int i10, Format format, int i11, MediaSource.MediaPeriodId mediaPeriodId, boolean z6) {
        this(deriveMessage(i3, str, str2, i10, format, i11), th, i9, i3, str2, i10, format, i11, mediaPeriodId, SystemClock.elapsedRealtime(), z6);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i3, Format format, int i9, MediaSource.MediaPeriodId mediaPeriodId, boolean z6, int i10) {
        if (format == null) {
            i9 = 4;
        }
        return new ExoPlaybackException(1, th, null, i10, str, i3, format, i9, mediaPeriodId, z6);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i3) {
        return new ExoPlaybackException(2, runtimeException, i3);
    }

    private ExoPlaybackException(String str, Throwable th, int i3, int i9, String str2, int i10, Format format, int i11, MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z6) {
        super(str, th, i3, Bundle.EMPTY, j);
        AbstractC1864o0.L(!z6 || i9 == 1);
        AbstractC1864o0.L(th != null || i9 == 3);
        this.type = i9;
        this.rendererName = str2;
        this.rendererIndex = i10;
        this.rendererFormat = format;
        this.rendererFormatSupport = i11;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z6;
    }
}
