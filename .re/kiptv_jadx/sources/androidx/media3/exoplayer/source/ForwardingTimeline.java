package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingTimeline extends androidx.media3.common.Timeline {
    protected final androidx.media3.common.Timeline timeline;

    public ForwardingTimeline(androidx.media3.common.Timeline timeline) {
        this.timeline = timeline;
    }

    @Override // androidx.media3.common.Timeline
    public final boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.media3.common.Timeline
    public int getFirstWindowIndex(boolean z6) {
        return this.timeline.getFirstWindowIndex(z6);
    }

    @Override // androidx.media3.common.Timeline
    public int getIndexOfPeriod(java.lang.Object obj) {
        return this.timeline.getIndexOfPeriod(obj);
    }

    @Override // androidx.media3.common.Timeline
    public int getLastWindowIndex(boolean z6) {
        return this.timeline.getLastWindowIndex(z6);
    }

    @Override // androidx.media3.common.Timeline
    public int getNextWindowIndex(int i3, int i9, boolean z6) {
        return this.timeline.getNextWindowIndex(i3, i9, z6);
    }

    @Override // androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Period getPeriod(int i3, androidx.media3.common.Timeline.Period period, boolean z6) {
        return this.timeline.getPeriod(i3, period, z6);
    }

    @Override // androidx.media3.common.Timeline
    public final androidx.media3.common.Timeline.Period getPeriodByUid(java.lang.Object obj, androidx.media3.common.Timeline.Period period) {
        return super.getPeriodByUid(obj, period);
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return this.timeline.getPeriodCount();
    }

    @Override // androidx.media3.common.Timeline
    public int getPreviousWindowIndex(int i3, int i9, boolean z6) {
        return this.timeline.getPreviousWindowIndex(i3, i9, z6);
    }

    @Override // androidx.media3.common.Timeline
    public java.lang.Object getUidOfPeriod(int i3) {
        return this.timeline.getUidOfPeriod(i3);
    }

    @Override // androidx.media3.common.Timeline
    public androidx.media3.common.Timeline.Window getWindow(int i3, androidx.media3.common.Timeline.Window window, long j) {
        return this.timeline.getWindow(i3, window, j);
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return this.timeline.getWindowCount();
    }

    @Override // androidx.media3.common.Timeline
    public final int hashCode() {
        return super.hashCode();
    }
}
