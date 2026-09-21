package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class TimelineWithUpdatedMediaItem extends androidx.media3.exoplayer.source.ForwardingTimeline {
    private final androidx.media3.common.MediaItem updatedMediaItem;

    private TimelineWithUpdatedMediaItem(androidx.media3.common.Timeline timeline, androidx.media3.common.MediaItem mediaItem) {
        super(timeline);
        this.updatedMediaItem = mediaItem;
    }

    public static androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem create(androidx.media3.common.Timeline timeline, androidx.media3.common.MediaItem mediaItem) {
        return timeline instanceof androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem ? new androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem(((androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem) timeline).timeline, mediaItem) : new androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem(timeline, mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Window getWindow(int i3, androidx.media3.common.Timeline.Window window, long j) {
        super.getWindow(i3, window, j);
        androidx.media3.common.MediaItem mediaItem = this.updatedMediaItem;
        window.mediaItem = mediaItem;
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        window.tag = localConfiguration != null ? localConfiguration.tag : null;
        return window;
    }
}
