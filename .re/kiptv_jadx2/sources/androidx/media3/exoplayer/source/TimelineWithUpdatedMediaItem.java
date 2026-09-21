package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;

public final class TimelineWithUpdatedMediaItem extends ForwardingTimeline {
    private final MediaItem updatedMediaItem;

    private TimelineWithUpdatedMediaItem(Timeline timeline, MediaItem mediaItem) {
        super(timeline);
        this.updatedMediaItem = mediaItem;
    }

    public static TimelineWithUpdatedMediaItem create(Timeline timeline, MediaItem mediaItem) {
        return timeline instanceof TimelineWithUpdatedMediaItem ? new TimelineWithUpdatedMediaItem(((TimelineWithUpdatedMediaItem) timeline).timeline, mediaItem) : new TimelineWithUpdatedMediaItem(timeline, mediaItem);
    }

    @Override
    public Timeline.Window getWindow(int i3, Timeline.Window window, long j) {
        super.getWindow(i3, window, j);
        MediaItem mediaItem = this.updatedMediaItem;
        window.mediaItem = mediaItem;
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        window.tag = localConfiguration != null ? localConfiguration.tag : null;
        return window;
    }
}
