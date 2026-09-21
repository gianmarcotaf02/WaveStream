package androidx.media3.exoplayer.source;

import androidx.media3.common.Timeline;

public abstract class ForwardingTimeline extends Timeline {
    protected final Timeline timeline;

    public ForwardingTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int getFirstWindowIndex(boolean z6) {
        return this.timeline.getFirstWindowIndex(z6);
    }

    @Override
    public int getIndexOfPeriod(Object obj) {
        return this.timeline.getIndexOfPeriod(obj);
    }

    @Override
    public int getLastWindowIndex(boolean z6) {
        return this.timeline.getLastWindowIndex(z6);
    }

    @Override
    public int getNextWindowIndex(int i3, int i9, boolean z6) {
        return this.timeline.getNextWindowIndex(i3, i9, z6);
    }

    @Override
    public Timeline.Period getPeriod(int i3, Timeline.Period period, boolean z6) {
        return this.timeline.getPeriod(i3, period, z6);
    }

    @Override
    public final Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
        return super.getPeriodByUid(obj, period);
    }

    @Override
    public int getPeriodCount() {
        return this.timeline.getPeriodCount();
    }

    @Override
    public int getPreviousWindowIndex(int i3, int i9, boolean z6) {
        return this.timeline.getPreviousWindowIndex(i3, i9, z6);
    }

    @Override
    public Object getUidOfPeriod(int i3) {
        return this.timeline.getUidOfPeriod(i3);
    }

    @Override
    public Timeline.Window getWindow(int i3, Timeline.Window window, long j) {
        return this.timeline.getWindow(i3, window, j);
    }

    @Override
    public int getWindowCount() {
        return this.timeline.getWindowCount();
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }
}
