package androidx.media3.exoplayer;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.ShuffleOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class PlaylistTimeline extends AbstractConcatenatedTimeline {
    private final HashMap<Object, Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final Timeline[] timelines;
    private final Object[] uids;
    private final int windowCount;

    public PlaylistTimeline(Collection<? extends MediaSourceInfoHolder> collection, ShuffleOrder shuffleOrder) {
        this(getTimelines(collection), getUids(collection), shuffleOrder);
    }

    private static Timeline[] getTimelines(Collection<? extends MediaSourceInfoHolder> collection) {
        Timeline[] timelineArr = new Timeline[collection.size()];
        Iterator<? extends MediaSourceInfoHolder> it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            timelineArr[i3] = it.next().getTimeline();
            i3++;
        }
        return timelineArr;
    }

    private static Object[] getUids(Collection<? extends MediaSourceInfoHolder> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends MediaSourceInfoHolder> it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            objArr[i3] = it.next().getUid();
            i3++;
        }
        return objArr;
    }

    public PlaylistTimeline copyWithPlaceholderTimeline(ShuffleOrder shuffleOrder) {
        Timeline[] timelineArr = new Timeline[this.timelines.length];
        int i3 = 0;
        while (true) {
            Timeline[] timelineArr2 = this.timelines;
            if (i3 >= timelineArr2.length) {
                return new PlaylistTimeline(timelineArr, this.uids, shuffleOrder);
            }
            timelineArr[i3] = new ForwardingTimeline(timelineArr2[i3]) {
                private final Timeline.Window window = new Timeline.Window();

                @Override
                public Timeline.Period getPeriod(int i9, Timeline.Period period, boolean z6) {
                    Timeline.Period period2 = super.getPeriod(i9, period, z6);
                    if (getWindow(period2.windowIndex, this.window).isLive()) {
                        period2.set(period.id, period.uid, period.windowIndex, period.durationUs, period.positionInWindowUs, AdPlaybackState.NONE, true);
                        return period2;
                    }
                    period2.isPlaceholder = true;
                    return period2;
                }
            };
            i3++;
        }
    }

    @Override
    public int getChildIndexByChildUid(Object obj) {
        Integer num = this.childIndexByUid.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public int getChildIndexByPeriodIndex(int i3) {
        return Util.binarySearchFloor(this.firstPeriodInChildIndices, i3 + 1, false, false);
    }

    @Override
    public int getChildIndexByWindowIndex(int i3) {
        return Util.binarySearchFloor(this.firstWindowInChildIndices, i3 + 1, false, false);
    }

    public List<Timeline> getChildTimelines() {
        return Arrays.asList(this.timelines);
    }

    @Override
    public Object getChildUidByChildIndex(int i3) {
        return this.uids[i3];
    }

    @Override
    public int getFirstPeriodIndexByChildIndex(int i3) {
        return this.firstPeriodInChildIndices[i3];
    }

    @Override
    public int getFirstWindowIndexByChildIndex(int i3) {
        return this.firstWindowInChildIndices[i3];
    }

    @Override
    public int getPeriodCount() {
        return this.periodCount;
    }

    @Override
    public Timeline getTimelineByChildIndex(int i3) {
        return this.timelines[i3];
    }

    @Override
    public int getWindowCount() {
        return this.windowCount;
    }

    private PlaylistTimeline(Timeline[] timelineArr, Object[] objArr, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int i3 = 0;
        int length = timelineArr.length;
        this.timelines = timelineArr;
        this.firstPeriodInChildIndices = new int[length];
        this.firstWindowInChildIndices = new int[length];
        this.uids = objArr;
        this.childIndexByUid = new HashMap<>();
        int length2 = timelineArr.length;
        int windowCount = 0;
        int periodCount = 0;
        int i9 = 0;
        while (i3 < length2) {
            Timeline timeline = timelineArr[i3];
            this.timelines[i9] = timeline;
            this.firstWindowInChildIndices[i9] = windowCount;
            this.firstPeriodInChildIndices[i9] = periodCount;
            windowCount += timeline.getWindowCount();
            periodCount += this.timelines[i9].getPeriodCount();
            this.childIndexByUid.put(objArr[i9], Integer.valueOf(i9));
            i3++;
            i9++;
        }
        this.windowCount = windowCount;
        this.periodCount = periodCount;
    }
}
