package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class PlaylistTimeline extends androidx.media3.exoplayer.AbstractConcatenatedTimeline {
    private final java.util.HashMap<java.lang.Object, java.lang.Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final androidx.media3.common.Timeline[] timelines;
    private final java.lang.Object[] uids;
    private final int windowCount;

    public PlaylistTimeline(java.util.Collection<? extends androidx.media3.exoplayer.MediaSourceInfoHolder> collection, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this(getTimelines(collection), getUids(collection), shuffleOrder);
    }

    private static androidx.media3.common.Timeline[] getTimelines(java.util.Collection<? extends androidx.media3.exoplayer.MediaSourceInfoHolder> collection) {
        androidx.media3.common.Timeline[] timelineArr = new androidx.media3.common.Timeline[collection.size()];
        java.util.Iterator<? extends androidx.media3.exoplayer.MediaSourceInfoHolder> it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            timelineArr[i3] = it.next().getTimeline();
            i3++;
        }
        return timelineArr;
    }

    private static java.lang.Object[] getUids(java.util.Collection<? extends androidx.media3.exoplayer.MediaSourceInfoHolder> collection) {
        java.lang.Object[] objArr = new java.lang.Object[collection.size()];
        java.util.Iterator<? extends androidx.media3.exoplayer.MediaSourceInfoHolder> it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            objArr[i3] = it.next().getUid();
            i3++;
        }
        return objArr;
    }

    public androidx.media3.exoplayer.PlaylistTimeline copyWithPlaceholderTimeline(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        androidx.media3.common.Timeline[] timelineArr = new androidx.media3.common.Timeline[this.timelines.length];
        int i3 = 0;
        while (true) {
            androidx.media3.common.Timeline[] timelineArr2 = this.timelines;
            if (i3 >= timelineArr2.length) {
                return new androidx.media3.exoplayer.PlaylistTimeline(timelineArr, this.uids, shuffleOrder);
            }
            timelineArr[i3] = new androidx.media3.exoplayer.source.ForwardingTimeline(timelineArr2[i3]) { // from class: androidx.media3.exoplayer.PlaylistTimeline.1
                private final androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();

                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                public androidx.media3.common.Timeline.Period getPeriod(int i9, androidx.media3.common.Timeline.Period period, boolean z6) {
                    androidx.media3.common.Timeline.Period period2 = super.getPeriod(i9, period, z6);
                    if (getWindow(period2.windowIndex, this.window).isLive()) {
                        period2.set(period.id, period.uid, period.windowIndex, period.durationUs, period.positionInWindowUs, androidx.media3.common.AdPlaybackState.NONE, true);
                        return period2;
                    }
                    period2.isPlaceholder = true;
                    return period2;
                }
            };
            i3++;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByChildUid(java.lang.Object obj) {
        java.lang.Integer num = this.childIndexByUid.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByPeriodIndex(int i3) {
        return androidx.media3.common.util.Util.binarySearchFloor(this.firstPeriodInChildIndices, i3 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByWindowIndex(int i3) {
        return androidx.media3.common.util.Util.binarySearchFloor(this.firstWindowInChildIndices, i3 + 1, false, false);
    }

    public java.util.List<androidx.media3.common.Timeline> getChildTimelines() {
        return java.util.Arrays.asList(this.timelines);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public java.lang.Object getChildUidByChildIndex(int i3) {
        return this.uids[i3];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getFirstPeriodIndexByChildIndex(int i3) {
        return this.firstPeriodInChildIndices[i3];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getFirstWindowIndexByChildIndex(int i3) {
        return this.firstWindowInChildIndices[i3];
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return this.periodCount;
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public androidx.media3.common.Timeline getTimelineByChildIndex(int i3) {
        return this.timelines[i3];
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return this.windowCount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PlaylistTimeline(androidx.media3.common.Timeline[] timelineArr, java.lang.Object[] objArr, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int i3 = 0;
        int length = timelineArr.length;
        this.timelines = timelineArr;
        this.firstPeriodInChildIndices = new int[length];
        this.firstWindowInChildIndices = new int[length];
        this.uids = objArr;
        this.childIndexByUid = new java.util.HashMap<>();
        int length2 = timelineArr.length;
        int windowCount = 0;
        int periodCount = 0;
        int i9 = 0;
        while (i3 < length2) {
            androidx.media3.common.Timeline timeline = timelineArr[i3];
            this.timelines[i9] = timeline;
            this.firstWindowInChildIndices[i9] = windowCount;
            this.firstPeriodInChildIndices[i9] = periodCount;
            windowCount += timeline.getWindowCount();
            periodCount += this.timelines[i9].getPeriodCount();
            this.childIndexByUid.put(objArr[i9], java.lang.Integer.valueOf(i9));
            i3++;
            i9++;
        }
        this.windowCount = windowCount;
        this.periodCount = periodCount;
    }
}
