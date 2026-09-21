package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class MaskingMediaSource extends androidx.media3.exoplayer.source.WrappingMediaSource {
    private boolean hasRealTimeline;
    private boolean hasStartedPreparing;
    private boolean isPrepared;
    private final androidx.media3.common.Timeline.Period period;
    private androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline timeline;
    private androidx.media3.exoplayer.source.MaskingMediaPeriod unpreparedMaskingMediaPeriod;
    private final boolean useLazyPreparation;
    private final androidx.media3.common.Timeline.Window window;

    public static final class MaskingTimeline extends androidx.media3.exoplayer.source.ForwardingTimeline {
        public static final java.lang.Object MASKING_EXTERNAL_PERIOD_UID = new java.lang.Object();
        private final java.lang.Object replacedInternalPeriodUid;
        private final java.lang.Object replacedInternalWindowUid;

        private MaskingTimeline(androidx.media3.common.Timeline timeline, java.lang.Object obj, java.lang.Object obj2) {
            super(timeline);
            this.replacedInternalWindowUid = obj;
            this.replacedInternalPeriodUid = obj2;
        }

        public static androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline createWithPlaceholderTimeline(androidx.media3.common.MediaItem mediaItem) {
            return new androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline(new androidx.media3.exoplayer.source.MaskingMediaSource.PlaceholderTimeline(mediaItem), androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID, MASKING_EXTERNAL_PERIOD_UID);
        }

        public static androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline createWithRealTimeline(androidx.media3.common.Timeline timeline, java.lang.Object obj, java.lang.Object obj2) {
            return new androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline(timeline, obj, obj2);
        }

        public androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline cloneWithUpdatedTimeline(androidx.media3.common.Timeline timeline) {
            return new androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline(timeline, this.replacedInternalWindowUid, this.replacedInternalPeriodUid);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            java.lang.Object obj2;
            androidx.media3.common.Timeline timeline = this.timeline;
            if (MASKING_EXTERNAL_PERIOD_UID.equals(obj) && (obj2 = this.replacedInternalPeriodUid) != null) {
                obj = obj2;
            }
            return timeline.getIndexOfPeriod(obj);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i3, androidx.media3.common.Timeline.Period period, boolean z6) {
            this.timeline.getPeriod(i3, period, z6);
            if (java.util.Objects.equals(period.uid, this.replacedInternalPeriodUid) && z6) {
                period.uid = MASKING_EXTERNAL_PERIOD_UID;
            }
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public java.lang.Object getUidOfPeriod(int i3) {
            java.lang.Object uidOfPeriod = this.timeline.getUidOfPeriod(i3);
            return java.util.Objects.equals(uidOfPeriod, this.replacedInternalPeriodUid) ? MASKING_EXTERNAL_PERIOD_UID : uidOfPeriod;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i3, androidx.media3.common.Timeline.Window window, long j) {
            this.timeline.getWindow(i3, window, j);
            if (java.util.Objects.equals(window.uid, this.replacedInternalWindowUid)) {
                window.uid = androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID;
            }
            return window;
        }
    }

    public static final class PlaceholderTimeline extends androidx.media3.common.Timeline {
        private final androidx.media3.common.MediaItem mediaItem;

        public PlaceholderTimeline(androidx.media3.common.MediaItem mediaItem) {
            this.mediaItem = mediaItem;
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            return obj == androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID ? 0 : -1;
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i3, androidx.media3.common.Timeline.Period period, boolean z6) {
            period.set(z6 ? 0 : null, z6 ? androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID : null, 0, androidx.media3.common.C.TIME_UNSET, 0L, androidx.media3.common.AdPlaybackState.NONE, true);
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // androidx.media3.common.Timeline
        public java.lang.Object getUidOfPeriod(int i3) {
            return androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID;
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i3, androidx.media3.common.Timeline.Window window, long j) {
            window.set(androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, false, true, null, 0L, androidx.media3.common.C.TIME_UNSET, 0, 0, 0L);
            window.isPlaceholder = true;
            return window;
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public MaskingMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z6) {
        super(mediaSource);
        this.useLazyPreparation = z6 && mediaSource.isSingleWindow();
        this.window = new androidx.media3.common.Timeline.Window();
        this.period = new androidx.media3.common.Timeline.Period();
        androidx.media3.common.Timeline initialTimeline = mediaSource.getInitialTimeline();
        if (initialTimeline == null) {
            this.timeline = androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.createWithPlaceholderTimeline(mediaSource.getMediaItem());
        } else {
            this.timeline = androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(initialTimeline, null, null);
            this.hasRealTimeline = true;
        }
    }

    private java.lang.Object getExternalPeriodUid(java.lang.Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !this.timeline.replacedInternalPeriodUid.equals(obj)) ? obj : androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID;
    }

    private java.lang.Object getInternalPeriodUid(java.lang.Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !obj.equals(androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID)) ? obj : this.timeline.replacedInternalPeriodUid;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private boolean setPreparePositionOverrideToUnpreparedMaskingPeriod(long j) {
        androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
        int indexOfPeriod = this.timeline.getIndexOfPeriod(maskingMediaPeriod.id.periodUid);
        if (indexOfPeriod == -1) {
            return false;
        }
        long j9 = this.timeline.getPeriod(indexOfPeriod, this.period).durationUs;
        if (j9 != androidx.media3.common.C.TIME_UNSET && j >= j9) {
            j = java.lang.Math.max(0L, j9 - 1);
        }
        maskingMediaPeriod.overridePreparePositionUs(j);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        return this.mediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId.copyWithPeriodUid(getExternalPeriodUid(mediaPeriodId.periodUid));
    }

    public androidx.media3.common.Timeline getTimeline() {
        return this.timeline;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(androidx.media3.common.Timeline timeline) {
        long j;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid;
        if (this.isPrepared) {
            this.timeline = this.timeline.cloneWithUpdatedTimeline(timeline);
            androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
            if (maskingMediaPeriod != null) {
                setPreparePositionOverrideToUnpreparedMaskingPeriod(maskingMediaPeriod.getPreparePositionOverrideUs());
            }
        } else {
            if (!timeline.isEmpty()) {
                timeline.getWindow(0, this.window);
                long defaultPositionUs = this.window.getDefaultPositionUs();
                java.lang.Object obj = this.window.uid;
                androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod2 = this.unpreparedMaskingMediaPeriod;
                if (maskingMediaPeriod2 != null) {
                    long preparePositionUs = maskingMediaPeriod2.getPreparePositionUs();
                    this.timeline.getPeriodByUid(this.unpreparedMaskingMediaPeriod.id.periodUid, this.period);
                    long positionInWindowUs = this.period.getPositionInWindowUs() + preparePositionUs;
                    if (positionInWindowUs != this.timeline.getWindow(0, this.window).getDefaultPositionUs()) {
                        j = positionInWindowUs;
                    } else {
                        j = defaultPositionUs;
                    }
                } else {
                    j = defaultPositionUs;
                }
                android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, 0, j);
                java.lang.Object obj2 = periodPositionUs.first;
                long jLongValue = ((java.lang.Long) periodPositionUs.second).longValue();
                this.timeline = this.hasRealTimeline ? this.timeline.cloneWithUpdatedTimeline(timeline) : androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(timeline, obj, obj2);
                androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod3 = this.unpreparedMaskingMediaPeriod;
                if (maskingMediaPeriod3 != null && setPreparePositionOverrideToUnpreparedMaskingPeriod(jLongValue)) {
                    androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod3.id;
                    mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid));
                }
                this.hasRealTimeline = true;
                this.isPrepared = true;
                refreshSourceInfo(this.timeline);
                if (mediaPeriodIdCopyWithPeriodUid != null) {
                    androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod4 = this.unpreparedMaskingMediaPeriod;
                    maskingMediaPeriod4.getClass();
                    maskingMediaPeriod4.createPeriod(mediaPeriodIdCopyWithPeriodUid);
                }
            }
            this.timeline = this.hasRealTimeline ? this.timeline.cloneWithUpdatedTimeline(timeline) : androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(timeline, androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID, androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID);
        }
        mediaPeriodIdCopyWithPeriodUid = null;
        this.hasRealTimeline = true;
        this.isPrepared = true;
        refreshSourceInfo(this.timeline);
        if (mediaPeriodIdCopyWithPeriodUid != null) {
            androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod5 = this.unpreparedMaskingMediaPeriod;
            maskingMediaPeriod5.getClass();
            maskingMediaPeriod5.createPeriod(mediaPeriodIdCopyWithPeriodUid);
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public void prepareSourceInternal() {
        if (this.useLazyPreparation) {
            return;
        }
        this.hasStartedPreparing = true;
        prepareChildSource();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.MaskingMediaPeriod) mediaPeriod).releasePeriod();
        if (mediaPeriod == this.unpreparedMaskingMediaPeriod) {
            this.unpreparedMaskingMediaPeriod = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.isPrepared = false;
        this.hasStartedPreparing = false;
        super.releaseSourceInternal();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        if (this.hasRealTimeline) {
            androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline maskingTimeline = this.timeline;
            this.timeline = maskingTimeline.cloneWithUpdatedTimeline(androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem.create(maskingTimeline.timeline, mediaItem));
        } else {
            this.timeline = androidx.media3.exoplayer.source.MaskingMediaSource.MaskingTimeline.createWithPlaceholderTimeline(mediaItem);
        }
        this.mediaSource.updateMediaItem(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MaskingMediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = new androidx.media3.exoplayer.source.MaskingMediaPeriod(mediaPeriodId, allocator, j);
        maskingMediaPeriod.setMediaSource(this.mediaSource);
        if (this.isPrepared) {
            maskingMediaPeriod.createPeriod(mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid)));
            return maskingMediaPeriod;
        }
        this.unpreparedMaskingMediaPeriod = maskingMediaPeriod;
        if (!this.hasStartedPreparing) {
            this.hasStartedPreparing = true;
            prepareChildSource();
        }
        return maskingMediaPeriod;
    }
}
