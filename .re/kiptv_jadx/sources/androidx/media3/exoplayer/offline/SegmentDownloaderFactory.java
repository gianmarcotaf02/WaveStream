package androidx.media3.exoplayer.offline;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public interface SegmentDownloaderFactory {
    androidx.media3.exoplayer.offline.SegmentDownloader<?> create(androidx.media3.common.MediaItem mediaItem);

    androidx.media3.exoplayer.offline.SegmentDownloaderFactory setDurationUs(long j);

    androidx.media3.exoplayer.offline.SegmentDownloaderFactory setExecutor(java.util.concurrent.Executor executor);

    androidx.media3.exoplayer.offline.SegmentDownloaderFactory setMaxMergedSegmentStartTimeDiffMs(long j);

    androidx.media3.exoplayer.offline.SegmentDownloaderFactory setStartPositionUs(long j);
}
