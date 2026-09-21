package androidx.media3.exoplayer.source.ads;

import D1.RunnableC0239y;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.ClippingMediaPeriod;
import androidx.media3.exoplayer.source.CompositeMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.android.gms.internal.play_billing.M0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
    private final List<AdMediaSourceHolder> activeMediaSourceHolders;
    private final MediaSource.Factory adMediaSourceFactory;
    private AdMediaSourceHolder[][] adMediaSourceHolders;
    private AdPlaybackState adPlaybackState;
    private final DataSpec adTagDataSpec;
    private final AdViewProvider adViewProvider;
    private final Object adsId;
    private final AdsLoader adsLoader;
    private ComponentListener componentListener;
    final MediaItem.DrmConfiguration contentDrmConfiguration;
    private final MaskingMediaSource contentMediaSource;
    private Timeline contentTimeline;
    private final Handler mainHandler;
    private final Timeline.Period period;
    private Handler playerHandler;
    private final boolean useAdMediaSourceClipping;
    private final boolean useLazyContentSourcePreparation;

    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private AdLoadException(int i3, Exception exc) {
            super(exc);
            this.type = i3;
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i3) {
            return new AdLoadException(1, new IOException(M0.l(i3, "Failed to load ad group "), exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            AbstractC1864o0.Y(this.type == 3);
            Throwable cause = getCause();
            cause.getClass();
            return (RuntimeException) cause;
        }
    }

    public final class AdMediaSourceHolder {
        private final List<MediaPeriod> activeMediaPeriods;
        private MediaItem adMediaItem;
        private MediaSource adMediaSource;
        private long endPositionUs;
        private final MediaSource.MediaPeriodId id;
        private Timeline timeline;

        public MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j, boolean z6) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
            MediaPeriod clippingMediaPeriod = z6 ? new ClippingMediaPeriod(maskingMediaPeriod, false, j, this.endPositionUs) : maskingMediaPeriod;
            this.activeMediaPeriods.add(clippingMediaPeriod);
            MediaSource mediaSource = this.adMediaSource;
            if (mediaSource != null) {
                maskingMediaPeriod.setMediaSource(mediaSource);
                AdsMediaSource adsMediaSource = AdsMediaSource.this;
                MediaItem mediaItem = this.adMediaItem;
                mediaItem.getClass();
                maskingMediaPeriod.setPrepareListener(adsMediaSource.new AdPrepareListener(mediaItem));
            }
            Timeline timeline = this.timeline;
            if (timeline != null) {
                maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
            }
            return clippingMediaPeriod;
        }

        private MaskingMediaPeriod getActiveMaskingMediaPeriod(int i3) {
            MediaPeriod mediaPeriod = this.activeMediaPeriods.get(i3);
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaPeriod = ((ClippingMediaPeriod) mediaPeriod).mediaPeriod;
            }
            return (MaskingMediaPeriod) mediaPeriod;
        }

        public long getDurationUs() {
            Timeline timeline = this.timeline;
            return timeline == null ? C.TIME_UNSET : timeline.getPeriod(0, AdsMediaSource.this.period).getDurationUs();
        }

        public void handleSourceInfoRefresh(Timeline timeline) {
            AbstractC1864o0.L(timeline.getPeriodCount() == 1);
            if (this.timeline == null) {
                Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i3 = 0; i3 < this.activeMediaPeriods.size(); i3++) {
                    MaskingMediaPeriod activeMaskingMediaPeriod = getActiveMaskingMediaPeriod(i3);
                    activeMaskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(uidOfPeriod, activeMaskingMediaPeriod.id.windowSequenceNumber));
                }
                setEndPositionUs(this.endPositionUs);
            }
            this.timeline = timeline;
        }

        public boolean hasMediaSource() {
            return this.adMediaSource != null;
        }

        public void initializeWithMediaSource(MediaSource mediaSource, MediaItem mediaItem) {
            this.adMediaSource = mediaSource;
            this.adMediaItem = mediaItem;
            for (int i3 = 0; i3 < this.activeMediaPeriods.size(); i3++) {
                MaskingMediaPeriod activeMaskingMediaPeriod = getActiveMaskingMediaPeriod(i3);
                activeMaskingMediaPeriod.setMediaSource(mediaSource);
                activeMaskingMediaPeriod.setPrepareListener(AdsMediaSource.this.new AdPrepareListener(mediaItem));
            }
            AdsMediaSource.this.prepareChildSource(this.id, mediaSource);
        }

        public boolean isInactive() {
            return this.activeMediaPeriods.isEmpty();
        }

        public void release() {
            if (hasMediaSource()) {
                AdsMediaSource.this.releaseChildSource(this.id);
            }
        }

        public void releaseMediaPeriod(MediaPeriod mediaPeriod) {
            this.activeMediaPeriods.remove(mediaPeriod);
            if (mediaPeriod instanceof ClippingMediaPeriod) {
                mediaPeriod = ((ClippingMediaPeriod) mediaPeriod).mediaPeriod;
            }
            ((MaskingMediaPeriod) mediaPeriod).releasePeriod();
        }

        public void setEndPositionUs(long j) {
            if (AdsMediaSource.this.useAdMediaSourceClipping && this.endPositionUs == Long.MIN_VALUE && j != Long.MIN_VALUE) {
                this.endPositionUs = j;
                for (int i3 = 0; i3 < this.activeMediaPeriods.size(); i3++) {
                    if (this.activeMediaPeriods.get(i3) instanceof ClippingMediaPeriod) {
                        ((ClippingMediaPeriod) this.activeMediaPeriods.get(i3)).updateClipping(0L, j);
                    }
                }
            }
        }

        private AdMediaSourceHolder(MediaSource.MediaPeriodId mediaPeriodId, long j) {
            this.id = mediaPeriodId;
            this.endPositionUs = j;
            this.activeMediaPeriods = new ArrayList();
        }
    }

    public final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {
        private final MediaItem adMediaItem;

        public AdPrepareListener(MediaItem mediaItem) {
            this.adMediaItem = mediaItem;
        }

        public void lambda$onPrepareComplete$0(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.adsLoader.handlePrepareComplete(AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        }

        public void lambda$onPrepareError$1(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            AdsMediaSource.this.adsLoader.handlePrepareError(AdsMediaSource.this, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, iOException);
        }

        @Override
        public void onPrepareComplete(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.mainHandler.post(new c(this, mediaPeriodId, 0));
        }

        @Override
        public void onPrepareError(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException) {
            MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = AdsMediaSource.this.createEventDispatcher(mediaPeriodId);
            long newId = LoadEventInfo.getNewId();
            MediaItem.LocalConfiguration localConfiguration = this.adMediaItem.localConfiguration;
            localConfiguration.getClass();
            eventDispatcherCreateEventDispatcher.loadError(new LoadEventInfo(newId, new DataSpec(localConfiguration.uri), SystemClock.elapsedRealtime()), 6, (IOException) AdLoadException.createForAd(iOException), true);
            AdsMediaSource.this.mainHandler.post(new b(this, mediaPeriodId, iOException, 0));
        }
    }

    public final class ComponentListener implements AdsLoader.EventListener {
        private final Handler playerHandler;
        private volatile boolean stopped;

        public ComponentListener(Handler handler) {
            this.playerHandler = handler;
        }

        public void lambda$onAdPlaybackState$0(AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            AdsMediaSource.this.onAdPlaybackState(adPlaybackState);
        }

        @Override
        public void onAdLoadError(AdLoadException adLoadException, DataSpec dataSpec) {
            if (this.stopped) {
                return;
            }
            AdsMediaSource.this.createEventDispatcher(null).loadError(new LoadEventInfo(LoadEventInfo.getNewId(), dataSpec, SystemClock.elapsedRealtime()), 6, (IOException) adLoadException, true);
        }

        @Override
        public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
            if (this.stopped) {
                return;
            }
            this.playerHandler.post(new c(this, adPlaybackState, 1));
        }

        public void stop() {
            this.stopped = true;
            this.playerHandler.removeCallbacksAndMessages(null);
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider) {
        this(mediaSource, dataSpec, obj, factory, adsLoader, adViewProvider, true, false);
    }

    private static int checkValidAdPlaybackStateUpdate(AdPlaybackState adPlaybackState, AdPlaybackState adPlaybackState2) {
        AbstractC1864o0.Y(adPlaybackState.endsWithLivePostrollPlaceHolder() == adPlaybackState2.endsWithLivePostrollPlaceHolder());
        int i3 = adPlaybackState2.adGroupCount - adPlaybackState.adGroupCount;
        AbstractC1864o0.Y(i3 >= 0);
        int i9 = adPlaybackState2.removedAdGroupCount;
        while (i9 < adPlaybackState.adGroupCount) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i9);
            if (adGroup.isLivePostrollPlaceholder()) {
                AbstractC1864o0.Y(i9 == adPlaybackState.adGroupCount - 1);
                return i3;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState2.getAdGroup(i9);
            AbstractC1864o0.Y(adGroup.count <= adGroup2.count);
            AbstractC1864o0.Y(adGroup.timeUs == adGroup2.timeUs);
            for (int i10 = 0; i10 < adGroup.count; i10++) {
                MediaItem mediaItem = adGroup.mediaItems[i10];
                if (mediaItem != null) {
                    AbstractC1864o0.Y(mediaItem.equals(adGroup2.mediaItems[i10]));
                }
            }
            i9++;
        }
        return i3;
    }

    @RequiresNonNull({"adPlaybackState"})
    private long[][] getAdDurationsUs() {
        AdMediaSourceHolder adMediaSourceHolder;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        adPlaybackState.getClass();
        boolean zEndsWithLivePostrollPlaceHolder = adPlaybackState.endsWithLivePostrollPlaceHolder();
        int length = this.adMediaSourceHolders.length + (zEndsWithLivePostrollPlaceHolder ? 1 : 0);
        long[][] jArr = new long[length][];
        int i3 = 0;
        while (true) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
            if (i3 >= adMediaSourceHolderArr.length) {
                break;
            }
            int iMax = this.useAdMediaSourceClipping ? Math.max(adPlaybackState.getAdGroup(i3).count, 0) : adMediaSourceHolderArr[i3].length;
            jArr[i3] = new long[iMax];
            int i9 = 0;
            while (i9 < iMax) {
                long j = adPlaybackState.getAdGroup(i3).durationsUs.length > i9 ? adPlaybackState.getAdGroup(i3).durationsUs[i9] : -9223372036854775807L;
                if (j == C.TIME_UNSET || !this.useAdMediaSourceClipping) {
                    AdMediaSourceHolder[] adMediaSourceHolderArr2 = this.adMediaSourceHolders[i3];
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

    private static MediaItem.AdsConfiguration getAdsConfiguration(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        if (localConfiguration == null) {
            return null;
        }
        return localConfiguration.adsConfiguration;
    }

    private static AdMediaSourceHolder[][] growAdMediaSourceHolderGrid(AdMediaSourceHolder[][] adMediaSourceHolderArr, int i3) {
        int length = adMediaSourceHolderArr.length + i3;
        AdMediaSourceHolder[][] adMediaSourceHolderArr2 = new AdMediaSourceHolder[length][];
        System.arraycopy(adMediaSourceHolderArr, 0, adMediaSourceHolderArr2, 0, adMediaSourceHolderArr.length);
        for (int length2 = adMediaSourceHolderArr.length; length2 < length; length2++) {
            adMediaSourceHolderArr2[length2] = new AdMediaSourceHolder[0];
        }
        return adMediaSourceHolderArr2;
    }

    public void lambda$onChildSourceInfoRefreshed$2(Timeline timeline) {
        boolean zHandleContentTimelineChanged = this.adsLoader.handleContentTimelineChanged(this, timeline);
        AbstractC1864o0.Y((zHandleContentTimelineChanged && this.useLazyContentSourcePreparation) ? false : true);
        if (zHandleContentTimelineChanged || this.useLazyContentSourcePreparation) {
            return;
        }
        Handler handler = this.playerHandler;
        handler.getClass();
        handler.post(new RunnableC0239y(10, this));
    }

    public void lambda$prepareSourceInternal$0(ComponentListener componentListener) {
        this.adsLoader.start(this, this.adTagDataSpec, this.adsId, this.adViewProvider, componentListener);
    }

    public void lambda$releaseSourceInternal$1(ComponentListener componentListener) {
        this.adsLoader.stop(this, componentListener);
    }

    private void maybeUpdateAdMediaSources() {
        MediaItem mediaItemBuild;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null) {
            return;
        }
        for (int i3 = 0; i3 < this.adMediaSourceHolders.length; i3++) {
            int i9 = 0;
            while (true) {
                AdMediaSourceHolder[] adMediaSourceHolderArr = this.adMediaSourceHolders[i3];
                if (i9 < adMediaSourceHolderArr.length) {
                    AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr[i9];
                    AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
                    if (adMediaSourceHolder != null && !adMediaSourceHolder.hasMediaSource()) {
                        MediaItem[] mediaItemArr = adGroup.mediaItems;
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

    public void maybeUpdateSourceInfo() {
        Timeline timeline = this.contentTimeline;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || timeline == null) {
            return;
        }
        if (adPlaybackState.adGroupCount == 0) {
            refreshSourceInfo(timeline);
        } else {
            this.adPlaybackState = adPlaybackState.withAdDurationsUs(getAdDurationsUs());
            refreshSourceInfo(new SinglePeriodAdTimeline(timeline, this.adPlaybackState));
        }
    }

    public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        if (adPlaybackState2 == null) {
            AdMediaSourceHolder[][] adMediaSourceHolderArr = new AdMediaSourceHolder[adPlaybackState.adGroupCount - (adPlaybackState.endsWithLivePostrollPlaceHolder() ? 1 : 0)][];
            this.adMediaSourceHolders = adMediaSourceHolderArr;
            Arrays.fill(adMediaSourceHolderArr, new AdMediaSourceHolder[0]);
        } else {
            int iCheckValidAdPlaybackStateUpdate = checkValidAdPlaybackStateUpdate(adPlaybackState2, adPlaybackState);
            if (iCheckValidAdPlaybackStateUpdate > 0) {
                this.adMediaSourceHolders = growAdMediaSourceHolderGrid(this.adMediaSourceHolders, iCheckValidAdPlaybackStateUpdate);
            }
            if (this.useAdMediaSourceClipping) {
                for (int i3 = 0; i3 < this.activeMediaSourceHolders.size(); i3++) {
                    AdMediaSourceHolder adMediaSourceHolder = this.activeMediaSourceHolders.get(i3);
                    MediaSource.MediaPeriodId mediaPeriodId = adMediaSourceHolder.id;
                    long j = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex).durationsUs[mediaPeriodId.adIndexInAdGroup];
                    if (j != C.TIME_UNSET) {
                        adMediaSourceHolder.setEndPositionUs(j);
                    }
                }
            }
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    @Override
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return Objects.equals(getAdsConfiguration(getMediaItem()), getAdsConfiguration(mediaItem)) && this.contentMediaSource.canUpdateMediaItem(mediaItem);
    }

    @Override
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        AdMediaSourceHolder adMediaSourceHolder;
        long j9;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        adPlaybackState.getClass();
        if (adPlaybackState.adGroupCount <= 0 || !mediaPeriodId.isAd()) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
            maskingMediaPeriod.setMediaSource(this.contentMediaSource);
            maskingMediaPeriod.createPeriod(mediaPeriodId);
            return maskingMediaPeriod;
        }
        int i3 = mediaPeriodId.adGroupIndex;
        int i9 = mediaPeriodId.adIndexInAdGroup;
        AdMediaSourceHolder[][] adMediaSourceHolderArr = this.adMediaSourceHolders;
        AdMediaSourceHolder[] adMediaSourceHolderArr2 = adMediaSourceHolderArr[i3];
        if (adMediaSourceHolderArr2.length <= i9) {
            adMediaSourceHolderArr[i3] = (AdMediaSourceHolder[]) Arrays.copyOf(adMediaSourceHolderArr2, i9 + 1);
        }
        AdMediaSourceHolder adMediaSourceHolder2 = this.adMediaSourceHolders[i3][i9];
        if (adMediaSourceHolder2 == null) {
            if (this.useAdMediaSourceClipping) {
                AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex);
                adGroup.getClass();
                long[] jArr = adGroup.durationsUs;
                if (jArr.length > i9) {
                    j9 = jArr[i9];
                    if (j9 == C.TIME_UNSET) {
                        j9 = Long.MIN_VALUE;
                    }
                } else {
                    j9 = Long.MIN_VALUE;
                }
            } else {
                j9 = Long.MIN_VALUE;
            }
            adMediaSourceHolder = new AdMediaSourceHolder(mediaPeriodId, j9);
            this.adMediaSourceHolders[i3][i9] = adMediaSourceHolder;
            this.activeMediaSourceHolders.add(adMediaSourceHolder);
            maybeUpdateAdMediaSources();
        } else {
            adMediaSourceHolder = adMediaSourceHolder2;
        }
        return adMediaSourceHolder.createMediaPeriod(mediaPeriodId, allocator, j, this.useAdMediaSourceClipping);
    }

    public Object getAdsId() {
        return this.adsId;
    }

    @Override
    public MediaItem getMediaItem() {
        return this.contentMediaSource.getMediaItem();
    }

    @Override
    public void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        this.playerHandler = handlerCreateHandlerForCurrentLooper;
        ComponentListener componentListener = new ComponentListener(handlerCreateHandlerForCurrentLooper);
        this.componentListener = componentListener;
        this.contentTimeline = this.contentMediaSource.getTimeline();
        prepareChildSource(CHILD_SOURCE_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new a(this, componentListener, 0));
    }

    @Override
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) (mediaPeriod instanceof ClippingMediaPeriod ? ((ClippingMediaPeriod) mediaPeriod).mediaPeriod : mediaPeriod);
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.id;
        if (!mediaPeriodId.isAd()) {
            maskingMediaPeriod.releasePeriod();
            return;
        }
        AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup];
        adMediaSourceHolder.getClass();
        adMediaSourceHolder.releaseMediaPeriod(mediaPeriod);
        if (adMediaSourceHolder.isInactive()) {
            adMediaSourceHolder.release();
            this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
            this.activeMediaSourceHolders.remove(adMediaSourceHolder);
        }
    }

    @Override
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        ComponentListener componentListener = this.componentListener;
        componentListener.getClass();
        this.componentListener = null;
        this.playerHandler = null;
        componentListener.stop();
        this.contentTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        this.mainHandler.post(new a(this, componentListener, 1));
    }

    @Override
    public void updateMediaItem(MediaItem mediaItem) {
        this.contentMediaSource.updateMediaItem(mediaItem);
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider, boolean z6, boolean z9) {
        this.contentMediaSource = new MaskingMediaSource(mediaSource, z6);
        MediaItem.LocalConfiguration localConfiguration = mediaSource.getMediaItem().localConfiguration;
        localConfiguration.getClass();
        this.contentDrmConfiguration = localConfiguration.drmConfiguration;
        this.adMediaSourceFactory = factory;
        this.adsLoader = adsLoader;
        this.adViewProvider = adViewProvider;
        this.adTagDataSpec = dataSpec;
        this.adsId = obj;
        this.useLazyContentSourcePreparation = z6;
        this.useAdMediaSourceClipping = z9;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.period = new Timeline.Period();
        this.adMediaSourceHolders = new AdMediaSourceHolder[0][];
        this.activeMediaSourceHolders = new ArrayList();
        adsLoader.setSupportedContentTypes(factory.getSupportedTypes());
    }

    @Override
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.isAd() ? mediaPeriodId : mediaPeriodId2;
    }

    @Override
    public void lambda$prepareChildSource$0(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
        if (mediaPeriodId.isAd()) {
            AdMediaSourceHolder adMediaSourceHolder = this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup];
            adMediaSourceHolder.getClass();
            adMediaSourceHolder.handleSourceInfoRefresh(timeline);
            maybeUpdateSourceInfo();
            return;
        }
        AbstractC1864o0.L(timeline.getPeriodCount() == 1);
        this.contentTimeline = timeline;
        this.mainHandler.post(new c(this, timeline, 2));
        if (this.useLazyContentSourcePreparation) {
            maybeUpdateSourceInfo();
        }
    }
}
