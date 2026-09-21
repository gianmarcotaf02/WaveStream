package androidx.media3.exoplayer.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final class AdsMediaSource extends androidx.media3.exoplayer.source.CompositeMediaSource<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> {
    private static final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(new java.lang.Object());
    private final java.util.List<androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder> activeMediaSourceHolders;
    private final androidx.media3.exoplayer.source.MediaSource.Factory adMediaSourceFactory;
    private androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolders;
    private androidx.media3.common.AdPlaybackState adPlaybackState;
    private final androidx.media3.datasource.DataSpec adTagDataSpec;
    private final androidx.media3.common.AdViewProvider adViewProvider;
    private final java.lang.Object adsId;
    private final androidx.media3.exoplayer.source.ads.AdsLoader adsLoader;
    private androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener;
    final androidx.media3.common.MediaItem.DrmConfiguration contentDrmConfiguration;
    private final androidx.media3.exoplayer.source.MaskingMediaSource contentMediaSource;
    private androidx.media3.common.Timeline contentTimeline;
    private final android.os.Handler mainHandler;
    private final androidx.media3.common.Timeline.Period period;
    private android.os.Handler playerHandler;
    private final boolean useAdMediaSourceClipping;
    private final boolean useLazyContentSourcePreparation;

    public static final class AdLoadException extends java.io.IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private AdLoadException(int i3, java.lang.Exception exc) {
            super(exc);
            this.type = i3;
        }

        public static androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException createForAd(java.lang.Exception exc) {
            return new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException(0, exc);
        }

        public static androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException createForAdGroup(java.lang.Exception exc, int i3) {
            return new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException(1, new java.io.IOException(com.google.android.gms.internal.play_billing.M0.l(i3, "Failed to load ad group "), exc));
        }

        public static androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException createForAllAds(java.lang.Exception exc) {
            return new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException(2, exc);
        }

        public static androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException createForUnexpected(java.lang.RuntimeException runtimeException) {
            return new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException(3, runtimeException);
        }

        public java.lang.RuntimeException getRuntimeExceptionForUnexpected() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.type == 3);
            java.lang.Throwable cause = getCause();
            cause.getClass();
            return (java.lang.RuntimeException) cause;
        }
    }

    public final class AdMediaSourceHolder {
        private final java.util.List<androidx.media3.exoplayer.source.MediaPeriod> activeMediaPeriods;
        private androidx.media3.common.MediaItem adMediaItem;
        private androidx.media3.exoplayer.source.MediaSource adMediaSource;
        private long endPositionUs;
        private final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId id;
        private androidx.media3.common.Timeline timeline;

        /* JADX INFO: Access modifiers changed from: private */
        public androidx.media3.exoplayer.source.MediaPeriod createMediaPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j, boolean z6) {
            androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = new androidx.media3.exoplayer.source.MaskingMediaPeriod(mediaPeriodId, allocator, j);
            androidx.media3.exoplayer.source.MediaPeriod clippingMediaPeriod = z6 ? new androidx.media3.exoplayer.source.ClippingMediaPeriod(maskingMediaPeriod, false, j, this.endPositionUs) : maskingMediaPeriod;
            this.activeMediaPeriods.add(clippingMediaPeriod);
            androidx.media3.exoplayer.source.MediaSource mediaSource = this.adMediaSource;
            if (mediaSource != null) {
                maskingMediaPeriod.setMediaSource(mediaSource);
                androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource = androidx.media3.exoplayer.source.ads.AdsMediaSource.this;
                androidx.media3.common.MediaItem mediaItem = this.adMediaItem;
                mediaItem.getClass();
                maskingMediaPeriod.setPrepareListener(adsMediaSource.new AdPrepareListener(mediaItem));
            }
            androidx.media3.common.Timeline timeline = this.timeline;
            if (timeline != null) {
                maskingMediaPeriod.createPeriod(new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
            }
            return clippingMediaPeriod;
        }

        private androidx.media3.exoplayer.source.MaskingMediaPeriod getActiveMaskingMediaPeriod(int i3) {
            androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = this.activeMediaPeriods.get(i3);
            if (mediaPeriod instanceof androidx.media3.exoplayer.source.ClippingMediaPeriod) {
                mediaPeriod = ((androidx.media3.exoplayer.source.ClippingMediaPeriod) mediaPeriod).mediaPeriod;
            }
            return (androidx.media3.exoplayer.source.MaskingMediaPeriod) mediaPeriod;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getDurationUs() {
            androidx.media3.common.Timeline timeline = this.timeline;
            return timeline == null ? androidx.media3.common.C.TIME_UNSET : timeline.getPeriod(0, androidx.media3.exoplayer.source.ads.AdsMediaSource.this.period).getDurationUs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleSourceInfoRefresh(androidx.media3.common.Timeline timeline) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(timeline.getPeriodCount() == 1);
            if (this.timeline == null) {
                java.lang.Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i3 = 0; i3 < this.activeMediaPeriods.size(); i3++) {
                    androidx.media3.exoplayer.source.MaskingMediaPeriod activeMaskingMediaPeriod = getActiveMaskingMediaPeriod(i3);
                    activeMaskingMediaPeriod.createPeriod(new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(uidOfPeriod, activeMaskingMediaPeriod.id.windowSequenceNumber));
                }
                setEndPositionUs(this.endPositionUs);
            }
            this.timeline = timeline;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasMediaSource() {
            return this.adMediaSource != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initializeWithMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.MediaItem mediaItem) {
            this.adMediaSource = mediaSource;
            this.adMediaItem = mediaItem;
            for (int i3 = 0; i3 < this.activeMediaPeriods.size(); i3++) {
                androidx.media3.exoplayer.source.MaskingMediaPeriod activeMaskingMediaPeriod = getActiveMaskingMediaPeriod(i3);
                activeMaskingMediaPeriod.setMediaSource(mediaSource);
                activeMaskingMediaPeriod.setPrepareListener(androidx.media3.exoplayer.source.ads.AdsMediaSource.this.new AdPrepareListener(mediaItem));
            }
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.prepareChildSource(this.id, mediaSource);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isInactive() {
            return this.activeMediaPeriods.isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            if (hasMediaSource()) {
                androidx.media3.exoplayer.source.ads.AdsMediaSource.this.releaseChildSource(this.id);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void releaseMediaPeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
            this.activeMediaPeriods.remove(mediaPeriod);
            if (mediaPeriod instanceof androidx.media3.exoplayer.source.ClippingMediaPeriod) {
                mediaPeriod = ((androidx.media3.exoplayer.source.ClippingMediaPeriod) mediaPeriod).mediaPeriod;
            }
            ((androidx.media3.exoplayer.source.MaskingMediaPeriod) mediaPeriod).releasePeriod();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndPositionUs(long j) {
            if (androidx.media3.exoplayer.source.ads.AdsMediaSource.this.useAdMediaSourceClipping && this.endPositionUs == Long.MIN_VALUE && j != Long.MIN_VALUE) {
                this.endPositionUs = j;
                for (int i3 = 0; i3 < this.activeMediaPeriods.size(); i3++) {
                    if (this.activeMediaPeriods.get(i3) instanceof androidx.media3.exoplayer.source.ClippingMediaPeriod) {
                        ((androidx.media3.exoplayer.source.ClippingMediaPeriod) this.activeMediaPeriods.get(i3)).updateClipping(0L, j);
                    }
                }
            }
        }

        private AdMediaSourceHolder(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
            this.id = mediaPeriodId;
            this.endPositionUs = j;
            this.activeMediaPeriods = new java.util.ArrayList();
        }
    }

    public final class AdPrepareListener implements androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener {
        private final androidx.media3.common.MediaItem adMediaItem;

        public AdPrepareListener(androidx.media3.common.MediaItem mediaItem) {
            this.adMediaItem = mediaItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareComplete$0(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.adsLoader.handlePrepareComplete(androidx.media3.exoplayer.source.ads.AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareError$1(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.io.IOException iOException) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.adsLoader.handlePrepareError(androidx.media3.exoplayer.source.ads.AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, iOException);
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareComplete(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.mainHandler.post(new androidx.media3.exoplayer.source.ads.c(this, mediaPeriodId, 0));
        }

        @Override // androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener
        public void onPrepareError(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.io.IOException iOException) {
            androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = androidx.media3.exoplayer.source.ads.AdsMediaSource.this.createEventDispatcher(mediaPeriodId);
            long newId = androidx.media3.exoplayer.source.LoadEventInfo.getNewId();
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = this.adMediaItem.localConfiguration;
            localConfiguration.getClass();
            eventDispatcherCreateEventDispatcher.loadError(new androidx.media3.exoplayer.source.LoadEventInfo(newId, new androidx.media3.datasource.DataSpec(localConfiguration.uri), android.os.SystemClock.elapsedRealtime()), 6, (java.io.IOException) androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException.createForAd(iOException), true);
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.mainHandler.post(new androidx.media3.exoplayer.source.ads.b(this, mediaPeriodId, iOException, 0));
        }
    }

    public final class ComponentListener implements androidx.media3.exoplayer.source.ads.AdsLoader.EventListener {
        private final android.os.Handler playerHandler;
        private volatile boolean stopped;

        public ComponentListener(android.os.Handler handler) {
            this.playerHandler = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPlaybackState$0(androidx.media3.common.AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdLoadError(androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException adLoadException, androidx.media3.datasource.DataSpec dataSpec) {
            if (this.stopped) {
                return;
            }
            androidx.media3.exoplayer.source.ads.AdsMediaSource.this.createEventDispatcher(null).loadError(new androidx.media3.exoplayer.source.LoadEventInfo(androidx.media3.exoplayer.source.LoadEventInfo.getNewId(), dataSpec, android.os.SystemClock.elapsedRealtime()), 6, (java.io.IOException) adLoadException, true);
        }

        @Override // androidx.media3.exoplayer.source.ads.AdsLoader.EventListener
        public void onAdPlaybackState(androidx.media3.common.AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            this.playerHandler.post(new androidx.media3.exoplayer.source.ads.c(this, adPlaybackState, 1));
        }

        public void stop() {
            this.stopped = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }
    }

    public AdsMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.datasource.DataSpec dataSpec, java.lang.Object obj, androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.exoplayer.source.ads.AdsLoader adsLoader, androidx.media3.common.AdViewProvider adViewProvider) {
        this(mediaSource, dataSpec, obj, factory, adsLoader, adViewProvider, true, false);
    }

    private static int checkValidAdPlaybackStateUpdate(androidx.media3.common.AdPlaybackState adPlaybackState, androidx.media3.common.AdPlaybackState adPlaybackState2) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(adPlaybackState.endsWithLivePostrollPlaceHolder() == adPlaybackState2.endsWithLivePostrollPlaceHolder());
        int i3 = adPlaybackState2.adGroupCount - adPlaybackState.adGroupCount;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(i3 >= 0);
        int i9 = adPlaybackState2.removedAdGroupCount;
        while (i9 < adPlaybackState.adGroupCount) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i9);
            if (adGroup.isLivePostrollPlaceholder()) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(i9 == adPlaybackState.adGroupCount - 1);
                return i3;
            }
            androidx.media3.common.AdPlaybackState.AdGroup adGroup2 = adPlaybackState2.getAdGroup(i9);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(adGroup.count <= adGroup2.count);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(adGroup.timeUs == adGroup2.timeUs);
            for (int i10 = 0; i10 < adGroup.count; i10++) {
                androidx.media3.common.MediaItem mediaItem = adGroup.mediaItems[i10];
                if (mediaItem != null) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(mediaItem.equals(adGroup2.mediaItems[i10]));
                }
            }
            i9++;
        }
        return i3;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"adPlaybackState"})
    private long[][] getAdDurationsUs() {
        androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder;
        androidx.media3.common.AdPlaybackState adPlaybackState = this.adPlaybackState;
        adPlaybackState.getClass();
        boolean zEndsWithLivePostrollPlaceHolder = adPlaybackState.endsWithLivePostrollPlaceHolder();
        int length = this.adMediaSourceHolders.length + (zEndsWithLivePostrollPlaceHolder ? 1 : 0);
        long[][] jArr = new long[length][];
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            if (i3 >= adMediaSourceHolderArr.length) {
                break;
            }
            int iMax = this.useAdMediaSourceClipping ? java.lang.Math.max(adPlaybackState.getAdGroup(i3).count, 0) : adMediaSourceHolderArr[i3].length;
            jArr[i3] = new long[iMax];
            int i9 = 0;
            while (i9 < iMax) {
                long j = adPlaybackState.getAdGroup(i3).durationsUs.length > i9 ? adPlaybackState.getAdGroup(i3).durationsUs[i9] : -9223372036854775807L;
                if (j == androidx.media3.common.C.TIME_UNSET || !this.useAdMediaSourceClipping) {
                    androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.adMediaSourceHolders[i3];
                    if (adMediaSourceHolderArr2.length <= i9 || (adMediaSourceHolder = adMediaSourceHolderArr2[i9]) == null) {
                        jArr[i3][i9] = -9223372036854775807L;
                    } else {
                        jArr[i3][i9] = adMediaSourceHolder.getDurationUs();
                    }
                } else {
                    jArr[i3][i9] = j;
                }
                i9++;
            }
            i3++;
        }
        if (zEndsWithLivePostrollPlaceHolder) {
            jArr[length - 1] = new long[0];
        }
        return jArr;
    }

    private static androidx.media3.common.MediaItem.AdsConfiguration getAdsConfiguration(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return null;
        }
        return localConfiguration.adsConfiguration;
    }

    private static androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] growAdMediaSourceHolderGrid(androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr, int i3) {
        int length = adMediaSourceHolderArr.length + i3;
        androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr2 = new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[length][];
        java.lang.System.arraycopy(adMediaSourceHolderArr, 0, adMediaSourceHolderArr2, 0, adMediaSourceHolderArr.length);
        for (int length2 = adMediaSourceHolderArr.length; length2 < length; length2++) {
            adMediaSourceHolderArr2[length2] = new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[0];
        }
        return adMediaSourceHolderArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onChildSourceInfoRefreshed$2(androidx.media3.common.Timeline timeline) {
        boolean zHandleContentTimelineChanged = this.adsLoader.handleContentTimelineChanged(this, timeline);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((zHandleContentTimelineChanged && this.useLazyContentSourcePreparation) ? false : true);
        if (zHandleContentTimelineChanged || this.useLazyContentSourcePreparation) {
            return;
        }
        android.os.Handler handler = this.playerHandler;
        handler.getClass();
        handler.post(new D1.RunnableC0239y(10, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSourceInternal$0(androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener) {
        this.adsLoader.start(this, this.adTagDataSpec, this.adsId, this.adViewProvider, componentListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseSourceInternal$1(androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener) {
        this.adsLoader.stop(this, componentListener);
    }

    private void maybeUpdateAdMediaSources() {
        androidx.media3.common.MediaItem mediaItemBuild;
        androidx.media3.common.AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null) {
            return;
        }
        for (int i3 = 0; i3 < this.adMediaSourceHolders.length; i3++) {
            int i9 = 0;
            while (true) {
                androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[] adMediaSourceHolderArr = this.adMediaSourceHolders[i3];
                if (i9 < adMediaSourceHolderArr.length) {
                    androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr[i9];
                    androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
                    if (adMediaSourceHolder != null && !adMediaSourceHolder.hasMediaSource()) {
                        androidx.media3.common.MediaItem[] mediaItemArr = adGroup.mediaItems;
                        if (i9 < mediaItemArr.length && (mediaItemBuild = mediaItemArr[i9]) != null) {
                            if (this.contentDrmConfiguration != null) {
                                mediaItemBuild = mediaItemBuild.buildUpon().setDrmConfiguration(this.contentDrmConfiguration).build();
                            }
                            adMediaSourceHolder.initializeWithMediaSource(this.adMediaSourceFactory.createMediaSource(mediaItemBuild), mediaItemBuild);
                        }
                    }
                    i9++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeUpdateSourceInfo() {
        androidx.media3.common.Timeline timeline = this.contentTimeline;
        androidx.media3.common.AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || timeline == null) {
            return;
        }
        if (adPlaybackState.adGroupCount == 0) {
            refreshSourceInfo(timeline);
        } else {
            this.adPlaybackState = adPlaybackState.withAdDurationsUs(getAdDurationsUs());
            refreshSourceInfo(new androidx.media3.exoplayer.source.ads.SinglePeriodAdTimeline(timeline, this.adPlaybackState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(androidx.media3.common.AdPlaybackState adPlaybackState) {
        androidx.media3.common.AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        if (adPlaybackState2 == null) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr = new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[adPlaybackState.adGroupCount - (adPlaybackState.endsWithLivePostrollPlaceHolder() ? 1 : 0)][];
            this.adMediaSourceHolders = adMediaSourceHolderArr;
            java.util.Arrays.fill(adMediaSourceHolderArr, new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[0]);
        } else {
            int iCheckValidAdPlaybackStateUpdate = checkValidAdPlaybackStateUpdate(adPlaybackState2, adPlaybackState);
            if (iCheckValidAdPlaybackStateUpdate > 0) {
                this.adMediaSourceHolders = growAdMediaSourceHolderGrid(this.adMediaSourceHolders, iCheckValidAdPlaybackStateUpdate);
            }
            if (this.useAdMediaSourceClipping) {
                for (int i3 = 0; i3 < this.activeMediaSourceHolders.size(); i3++) {
                    androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = this.activeMediaSourceHolders.get(i3);
                    androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = adMediaSourceHolder.id;
                    long j = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex).durationsUs[mediaPeriodId.adIndexInAdGroup];
                    if (j != androidx.media3.common.C.TIME_UNSET) {
                        adMediaSourceHolder.setEndPositionUs(j);
                    }
                }
            }
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        return java.util.Objects.equals(getAdsConfiguration(getMediaItem()), getAdsConfiguration(mediaItem)) && this.contentMediaSource.canUpdateMediaItem(mediaItem);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j) {
        androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder;
        long j9;
        androidx.media3.common.AdPlaybackState adPlaybackState = this.adPlaybackState;
        adPlaybackState.getClass();
        if (adPlaybackState.adGroupCount <= 0 || !mediaPeriodId.isAd()) {
            androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = new androidx.media3.exoplayer.source.MaskingMediaPeriod(mediaPeriodId, allocator, j);
            maskingMediaPeriod.setMediaSource(this.contentMediaSource);
            maskingMediaPeriod.createPeriod(mediaPeriodId);
            return maskingMediaPeriod;
        }
        int i3 = mediaPeriodId.adGroupIndex;
        int i9 = mediaPeriodId.adIndexInAdGroup;
        androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
        androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i3];
        if (adMediaSourceHolderArr2.length <= i9) {
            adMediaSourceHolderArr[i3] = (androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[]) java.util.Arrays.copyOf(adMediaSourceHolderArr2, i9 + 1);
        }
        androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder2 = this.adMediaSourceHolders[i3][i9];
        if (adMediaSourceHolder2 == null) {
            if (this.useAdMediaSourceClipping) {
                androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex);
                adGroup.getClass();
                long[] jArr = adGroup.durationsUs;
                if (jArr.length > i9) {
                    j9 = jArr[i9];
                    if (j9 == androidx.media3.common.C.TIME_UNSET) {
                        j9 = Long.MIN_VALUE;
                    }
                } else {
                    j9 = Long.MIN_VALUE;
                }
            } else {
                j9 = Long.MIN_VALUE;
            }
            adMediaSourceHolder = new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder(mediaPeriodId, j9);
            this.adMediaSourceHolders[i3][i9] = adMediaSourceHolder;
            this.activeMediaSourceHolders.add(adMediaSourceHolder);
            maybeUpdateAdMediaSources();
        } else {
            adMediaSourceHolder = adMediaSourceHolder2;
        }
        return adMediaSourceHolder.createMediaPeriod(mediaPeriodId, allocator, j, this.useAdMediaSourceClipping);
    }

    public java.lang.Object getAdsId() {
        return this.adsId;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public androidx.media3.common.MediaItem getMediaItem() {
        return this.contentMediaSource.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        android.os.Handler handlerCreateHandlerForCurrentLooper = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
        this.playerHandler = handlerCreateHandlerForCurrentLooper;
        androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener = new androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener(handlerCreateHandlerForCurrentLooper);
        this.componentListener = componentListener;
        this.contentTimeline = this.contentMediaSource.getTimeline();
        prepareChildSource(CHILD_SOURCE_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new androidx.media3.exoplayer.source.ads.a(this, componentListener, 0));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.source.MaskingMediaPeriod maskingMediaPeriod = (androidx.media3.exoplayer.source.MaskingMediaPeriod) (mediaPeriod instanceof androidx.media3.exoplayer.source.ClippingMediaPeriod ? ((androidx.media3.exoplayer.source.ClippingMediaPeriod) mediaPeriod).mediaPeriod : mediaPeriod);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.id;
        if (!mediaPeriodId.isAd()) {
            maskingMediaPeriod.releasePeriod();
            return;
        }
        androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup];
        adMediaSourceHolder.getClass();
        adMediaSourceHolder.releaseMediaPeriod(mediaPeriod);
        if (adMediaSourceHolder.isInactive()) {
            adMediaSourceHolder.release();
            this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
            this.activeMediaSourceHolders.remove(adMediaSourceHolder);
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener = this.componentListener;
        componentListener.getClass();
        this.componentListener = null;
        this.playerHandler = null;
        componentListener.stop();
        this.contentTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[0][];
        this.mainHandler.post(new androidx.media3.exoplayer.source.ads.a(this, componentListener, 1));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        this.contentMediaSource.updateMediaItem(mediaItem);
    }

    public AdsMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.datasource.DataSpec dataSpec, java.lang.Object obj, androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.exoplayer.source.ads.AdsLoader adsLoader, androidx.media3.common.AdViewProvider adViewProvider, boolean z6, boolean z9) {
        this.contentMediaSource = new androidx.media3.exoplayer.source.MaskingMediaSource(mediaSource, z6);
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaSource.getMediaItem().localConfiguration;
        localConfiguration.getClass();
        this.contentDrmConfiguration = localConfiguration.drmConfiguration;
        this.adMediaSourceFactory = factory;
        this.adsLoader = adsLoader;
        this.adViewProvider = adViewProvider;
        this.adTagDataSpec = dataSpec;
        this.adsId = obj;
        this.useLazyContentSourcePreparation = z6;
        this.useAdMediaSourceClipping = z9;
        this.mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.period = new androidx.media3.common.Timeline.Period();
        this.adMediaSourceHolders = new androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder[0][];
        this.activeMediaSourceHolders = new java.util.ArrayList();
        adsLoader.setSupportedContentTypes(factory.getSupportedTypes());
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public void lambda$prepareChildSource$0(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline) {
        if (mediaPeriodId.isAd()) {
            androidx.media3.exoplayer.source.ads.AdsMediaSource.AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup];
            adMediaSourceHolder.getClass();
            adMediaSourceHolder.handleSourceInfoRefresh(timeline);
            maybeUpdateSourceInfo();
            return;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(timeline.getPeriodCount() == 1);
        this.contentTimeline = timeline;
        this.mainHandler.post(new androidx.media3.exoplayer.source.ads.c(this, timeline, 2));
        if (this.useLazyContentSourcePreparation) {
            maybeUpdateSourceInfo();
        }
    }
}
