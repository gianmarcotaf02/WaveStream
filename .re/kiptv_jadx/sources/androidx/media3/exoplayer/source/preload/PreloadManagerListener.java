package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public interface PreloadManagerListener {
    default void onCompleted(androidx.media3.common.MediaItem mediaItem) {
    }

    default void onError(androidx.media3.exoplayer.source.preload.PreloadException preloadException) {
    }
}
