package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadException extends java.lang.Exception {
    public final androidx.media3.common.MediaItem mediaItem;

    public PreloadException(androidx.media3.common.MediaItem mediaItem, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.mediaItem = mediaItem;
    }

    public boolean errorInfoEquals(androidx.media3.exoplayer.source.preload.PreloadException preloadException) {
        if (this == preloadException) {
            return true;
        }
        if (preloadException != null) {
            java.lang.Throwable cause = getCause();
            java.lang.Throwable cause2 = preloadException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!java.util.Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (java.util.Objects.equals(this.mediaItem, preloadException.mediaItem) && java.util.Objects.equals(getMessage(), preloadException.getMessage())) {
                return true;
            }
        }
        return false;
    }
}
