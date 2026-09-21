package androidx.media3.exoplayer.hls;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.LongSparseArray;
import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2230y;
import p076i4.S0;
import p076i4.V;
import p076i4.Z;

public final class HlsInterstitialsAdsLoader implements AdsLoader {
    private static final String TAG = "HlsInterstitiaAdsLoader";
    private static final int TARGET_DURATION_MULTIPLIER = 3;
    private final ContentMediaSourceAdDataHolder contentMediaSourceAdDataHolder;
    private final DataSource.Factory dataSourceFactory;
    private boolean isReleased;
    private final List<Listener> listeners;
    private Loader loader;
    private PlayerMessage pendingAssetListResolutionMessage;
    private ExoPlayer player;
    private final PlayerListener playerListener;
    private final Map<Object, AdPlaybackState> resumptionStates;

    public static final class AdsMediaSourceFactory implements MediaSource.Factory {
        private final AdViewProvider adViewProvider;
        private final HlsInterstitialsAdsLoader adsLoader;
        private final MediaSource.Factory mediaSourceFactory;

        public AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, AdViewProvider adViewProvider, Context context) {
            this(hlsInterstitialsAdsLoader, context, null, adViewProvider);
        }

        @Override
        public MediaSource createMediaSource(MediaItem mediaItem) {
            mediaItem.localConfiguration.getClass();
            MediaSource mediaSourceCreateMediaSource = this.mediaSourceFactory.createMediaSource(mediaItem);
            MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
            if (adsConfiguration == null) {
                return mediaSourceCreateMediaSource;
            }
            if (!(adsConfiguration.adsId instanceof String)) {
                throw new IllegalArgumentException("Please use an AdsConfiguration with an adsId of type String when using HlsInterstitialsAdsLoader");
            }
            DataSpec dataSpec = new DataSpec(mediaItem.localConfiguration.adsConfiguration.adTagUri);
            Object obj = mediaItem.localConfiguration.adsConfiguration.adsId;
            obj.getClass();
            return new AdsMediaSource(mediaSourceCreateMediaSource, dataSpec, obj, this.mediaSourceFactory, this.adsLoader, this.adViewProvider, false, true);
        }

        @Override
        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        public AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, AdViewProvider adViewProvider, MediaSource.Factory factory) {
            this(hlsInterstitialsAdsLoader, null, factory, adViewProvider);
        }

        @Override
        public AdsMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override
        public AdsMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        private AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, Context context, MediaSource.Factory factory, AdViewProvider adViewProvider) {
            boolean z6 = true;
            AbstractC1864o0.L((context == null && factory == null) ? false : true);
            this.adsLoader = hlsInterstitialsAdsLoader;
            if (factory == null) {
                context.getClass();
                factory = new HlsMediaSource.Factory(new DefaultDataSource.Factory(context));
            }
            this.mediaSourceFactory = factory;
            this.adViewProvider = adViewProvider;
            int[] supportedTypes = factory.getSupportedTypes();
            for (int i3 : supportedTypes) {
                if (i3 == 2) {
                    AbstractC1864o0.Y(z6);
                }
            }
            z6 = false;
            AbstractC1864o0.Y(z6);
        }
    }

    public static class AdsResumptionState {
        private static final String FIELD_ADS_ID = Util.intToStringMaxRadix(0);
        private static final String FIELD_AD_PLAYBACK_STATE = Util.intToStringMaxRadix(1);
        private final AdPlaybackState adPlaybackState;
        public final String adsId;

        public AdsResumptionState(String str, AdPlaybackState adPlaybackState) {
            AbstractC1864o0.L(str.equals(adPlaybackState.adsId));
            this.adsId = str;
            this.adPlaybackState = adPlaybackState;
        }

        public static AdsResumptionState fromBundle(Bundle bundle) {
            String string = bundle.getString(FIELD_ADS_ID);
            string.getClass();
            Bundle bundle2 = bundle.getBundle(FIELD_AD_PLAYBACK_STATE);
            bundle2.getClass();
            return new AdsResumptionState(string, AdPlaybackState.fromBundle(bundle2, 9).withAdsId(string));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AdsResumptionState)) {
                return false;
            }
            AdsResumptionState adsResumptionState = (AdsResumptionState) obj;
            return Objects.equals(this.adsId, adsResumptionState.adsId) && Objects.equals(this.adPlaybackState, adsResumptionState.adPlaybackState);
        }

        public int hashCode() {
            return Objects.hash(this.adsId, this.adPlaybackState);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(FIELD_ADS_ID, this.adsId);
            bundle.putBundle(FIELD_AD_PLAYBACK_STATE, this.adPlaybackState.toBundle(9));
            return bundle;
        }
    }

    public static final class Asset {
        public final long durationUs;
        public final Uri uri;

        public Asset(Uri uri, long j) {
            this.uri = uri;
            this.durationUs = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Asset)) {
                return false;
            }
            Asset asset = (Asset) obj;
            return this.durationUs == asset.durationUs && Objects.equals(this.uri, asset.uri);
        }

        public int hashCode() {
            return Objects.hash(this.uri, Long.valueOf(this.durationUs));
        }
    }

    public static final class AssetList {
        static final AssetList EMPTY;
        public final AbstractC2186b0 assets;
        public final AdPlaybackState.SkipInfo skipInfo;

        static {
            Z z6 = AbstractC2186b0.f22868i;
            EMPTY = new AssetList(S0.f22832l, null);
        }

        public AssetList(AbstractC2186b0 abstractC2186b0, AdPlaybackState.SkipInfo skipInfo) {
            this.assets = abstractC2186b0;
            this.skipInfo = skipInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetList)) {
                return false;
            }
            AssetList assetList = (AssetList) obj;
            return Objects.equals(this.assets, assetList.assets) && Objects.equals(this.skipInfo, assetList.skipInfo);
        }

        public int hashCode() {
            return Objects.hash(this.assets, this.skipInfo);
        }
    }

    public static class AssetListData {
        private final int adGroupIndex;
        private final int adIndexInAdGroup;
        private final Object adsId;
        private final HlsMediaPlaylist.Interstitial interstitial;
        private final MediaItem mediaItem;
        private final long targetDurationUs;

        public AssetListData(MediaItem mediaItem, Object obj, HlsMediaPlaylist.Interstitial interstitial, int i3, int i9, long j) {
            AbstractC1864o0.L(interstitial.assetListUri != null);
            this.mediaItem = mediaItem;
            this.adsId = obj;
            this.adGroupIndex = i3;
            this.adIndexInAdGroup = i9;
            this.targetDurationUs = j;
            this.interstitial = interstitial;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AssetListData)) {
                return false;
            }
            AssetListData assetListData = (AssetListData) obj;
            return this.adGroupIndex == assetListData.adGroupIndex && this.adIndexInAdGroup == assetListData.adIndexInAdGroup && this.targetDurationUs == assetListData.targetDurationUs && Objects.equals(this.mediaItem, assetListData.mediaItem) && Objects.equals(this.adsId, assetListData.adsId) && Objects.equals(this.interstitial, assetListData.interstitial);
        }

        public int hashCode() {
            return (int) ((((long) (((((this.interstitial.hashCode() + ((this.adsId.hashCode() + (this.mediaItem.hashCode() * 31)) * 31)) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup)) * 31) + this.targetDurationUs);
        }
    }

    public static final class ContentMediaSourceAdDataHolder {
        private final Map<Object, AdsLoader.EventListener> activeEventListeners = new HashMap();
        private final Map<Object, AdPlaybackState> activeAdPlaybackStates = new HashMap();
        private final Map<Object, Set<String>> insertedInterstitialIds = new HashMap();
        private final Map<Object, TreeMap<Long, AssetListData>> unresolvedAssetLists = new HashMap();
        private final Map<Object, List<PendingSnapInResolution>> pendingSnapInResolutions = new HashMap();
        private final Set<Object> contentSourceAwaitingFirstAdToStart = new HashSet();
        private final Set<Object> unsupportedAdsIds = new HashSet();

        public void addInsertedInterstitialId(Object obj, String str) {
            Set<String> set = this.insertedInterstitialIds.get(obj);
            if (set != null) {
                set.add(str);
            }
        }

        public void addUnsupportedContentMediaSource(Object obj) {
            this.unsupportedAdsIds.add(obj);
        }

        public boolean awaitingFirstAdToStartFor(Object obj) {
            return this.contentSourceAwaitingFirstAdToStart.contains(obj);
        }

        public AdPlaybackState getAdPlaybackState(Object obj) {
            return this.activeAdPlaybackStates.get(obj);
        }

        public Collection<AdPlaybackState> getAdPlaybackStates() {
            return this.activeAdPlaybackStates.values();
        }

        public AdsLoader.EventListener getEventListener(Object obj) {
            return this.activeEventListeners.get(obj);
        }

        public List<PendingSnapInResolution> getPendingSnapInResolutions(Object obj) {
            List<PendingSnapInResolution> list = this.pendingSnapInResolutions.get(obj);
            return list == null ? Collections.EMPTY_LIST : list;
        }

        public int getUnresolvedAssetListCount(Object obj) {
            TreeMap<Long, AssetListData> treeMap = this.unresolvedAssetLists.get(obj);
            if (treeMap != null) {
                return treeMap.size();
            }
            return 0;
        }

        public Map<Long, AssetListData> getUnresolvedAssetLists(Object obj) {
            return this.unresolvedAssetLists.get(obj);
        }

        public boolean isIdle() {
            return this.activeEventListeners.isEmpty();
        }

        public boolean isInsertedInterstitialId(Object obj, String str) {
            Set<String> set = this.insertedInterstitialIds.get(obj);
            return set != null && set.contains(str);
        }

        public boolean isManagedContentSource(Object obj) {
            return this.activeAdPlaybackStates.containsKey(obj);
        }

        public boolean isStartedContentMediaSource(Object obj) {
            return this.activeEventListeners.containsKey(obj);
        }

        public boolean isUnsupportedContentMediaSource(Object obj) {
            return this.unsupportedAdsIds.contains(obj);
        }

        public void notifyAdStarted(Object obj) {
            this.contentSourceAwaitingFirstAdToStart.remove(obj);
        }

        public AdPlaybackState putAdPlaybackState(Object obj, AdPlaybackState adPlaybackState) {
            return this.activeAdPlaybackStates.put(obj, adPlaybackState);
        }

        public void putPendingSnapInResolution(Object obj, PendingSnapInResolution pendingSnapInResolution) {
            List<PendingSnapInResolution> arrayList = this.pendingSnapInResolutions.get(obj);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.pendingSnapInResolutions.put(obj, arrayList);
            }
            arrayList.add(pendingSnapInResolution);
        }

        public void removePendingSnapInResolutionUntilIndexInclusive(Object obj, int i3) {
            AbstractC1864o0.L(i3 >= 0);
            List<PendingSnapInResolution> pendingSnapInResolutions = getPendingSnapInResolutions(obj);
            pendingSnapInResolutions.getClass();
            pendingSnapInResolutions.subList(0, Math.min(i3, pendingSnapInResolutions.size() - 1) + 1).clear();
        }

        public AdsLoader.EventListener startContentSource(Object obj, AdsLoader.EventListener eventListener) {
            this.insertedInterstitialIds.put(obj, new HashSet());
            this.unresolvedAssetLists.put(obj, new TreeMap<>());
            this.contentSourceAwaitingFirstAdToStart.add(obj);
            return this.activeEventListeners.put(obj, eventListener);
        }

        public AdPlaybackState stopContentSource(Object obj) {
            this.activeEventListeners.remove(obj);
            this.insertedInterstitialIds.remove(obj);
            this.unresolvedAssetLists.remove(obj);
            this.unsupportedAdsIds.remove(obj);
            this.contentSourceAwaitingFirstAdToStart.remove(obj);
            this.pendingSnapInResolutions.remove(obj);
            return this.activeAdPlaybackStates.remove(obj);
        }
    }

    public interface Listener {
        default void onAdCompleted(MediaItem mediaItem, Object obj, int i3, int i9) {
        }

        default void onAdSkipped(MediaItem mediaItem, Object obj, int i3, int i9) {
        }

        default void onAdStarted(MediaItem mediaItem, Object obj, int i3, int i9) {
        }

        default void onAssetListLoadCompleted(MediaItem mediaItem, Object obj, int i3, int i9, AssetList assetList, JSONObject jSONObject) {
        }

        default void onAssetListLoadFailed(MediaItem mediaItem, Object obj, int i3, int i9, IOException iOException, boolean z6) {
        }

        default void onAssetListLoadStarted(MediaItem mediaItem, Object obj, int i3, int i9) {
        }

        default void onContentTimelineChanged(MediaItem mediaItem, Object obj, Timeline timeline) {
        }

        default void onMetadata(MediaItem mediaItem, Object obj, int i3, int i9, Metadata metadata) {
        }

        default void onPrepareCompleted(MediaItem mediaItem, Object obj, int i3, int i9) {
        }

        default void onPrepareError(MediaItem mediaItem, Object obj, int i3, int i9, IOException iOException) {
        }

        default void onStart(MediaItem mediaItem, Object obj, AdViewProvider adViewProvider) {
        }

        default void onStop(MediaItem mediaItem, Object obj, AdPlaybackState adPlaybackState) {
        }
    }

    public class LoaderCallback implements Loader.Callback<ParsingLoadable<Pair<AssetList, JSONObject>>> {
        private final AssetListData assetListData;
        private final Timeline.Window window = new Timeline.Window();

        public LoaderCallback(AssetListData assetListData) {
            this.assetListData = assetListData;
        }

        private void handleAssetResolutionFailed(final IOException iOException, final boolean z6) {
            HlsInterstitialsAdsLoader.this.notifyAssetResolutionFailed(this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup);
            HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f16653h.lambda$handleAssetResolutionFailed$2(iOException, z6, (HlsInterstitialsAdsLoader.Listener) obj);
                }
            });
            maybeContinueAssetResolution();
        }

        public void lambda$handleAssetResolutionFailed$2(IOException iOException, boolean z6, Listener listener) {
            listener.onAssetListLoadFailed(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, iOException, z6);
        }

        public void lambda$onLoadCompleted$0(Listener listener) {
            listener.onAssetListLoadFailed(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, null, true);
        }

        public void lambda$onLoadCompleted$1(AssetList assetList, Pair pair, Listener listener) {
            listener.onAssetListLoadCompleted(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, assetList, (JSONObject) pair.second);
        }

        private void maybeContinueAssetResolution() {
            ExoPlayer exoPlayer = HlsInterstitialsAdsLoader.this.player;
            if (exoPlayer == null || exoPlayer.getPlaybackState() == 1 || !this.assetListData.mediaItem.equals(exoPlayer.getCurrentMediaItem())) {
                return;
            }
            long jMsToUs = Util.msToUs(exoPlayer.getContentPosition());
            Timeline currentTimeline = exoPlayer.getCurrentTimeline();
            int currentMediaItemIndex = exoPlayer.getCurrentMediaItemIndex();
            HlsInterstitialsAdsLoader.this.maybeExecuteOrSetNextAssetListResolutionMessage(this.assetListData.adsId, currentTimeline, currentMediaItemIndex, currentTimeline.getWindow(currentMediaItemIndex, this.window).positionInFirstPeriodUs, jMsToUs);
        }

        @Override
        public void onLoadCanceled(ParsingLoadable<Pair<AssetList, JSONObject>> parsingLoadable, long j, long j9, boolean z6) {
            handleAssetResolutionFailed(null, true);
        }

        @Override
        public void onLoadCompleted(ParsingLoadable<Pair<AssetList, JSONObject>> parsingLoadable, long j, long j9) {
            Pair<AssetList, JSONObject> result = parsingLoadable.getResult();
            result.getClass();
            AssetList assetList = (AssetList) result.first;
            AdPlaybackState adPlaybackState = HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.getAdPlaybackState(this.assetListData.adsId);
            if ((adPlaybackState != null ? adPlaybackState.getAdGroup(this.assetListData.adGroupIndex).states[this.assetListData.adIndexInAdGroup] : 4) != 0) {
                maybeContinueAssetResolution();
                HlsInterstitialsAdsLoader.this.notifyListeners(new b(2, this));
                return;
            }
            if (assetList == null || assetList.assets.isEmpty()) {
                handleAssetResolutionFailed(new IOException("empty asset list"), false);
                return;
            }
            adPlaybackState.getClass();
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(this.assetListData.adGroupIndex);
            int i3 = adGroup.count;
            if (assetList.assets.size() > 1) {
                adPlaybackState = adPlaybackState.withAdCount(this.assetListData.adGroupIndex, (assetList.assets.size() + i3) - 1);
                adGroup = adPlaybackState.getAdGroup(this.assetListData.adGroupIndex);
            }
            int i9 = this.assetListData.adIndexInAdGroup;
            long[] jArr = (long[]) adGroup.durationsUs.clone();
            long j10 = 0;
            for (int i10 = 0; i10 < assetList.assets.size(); i10++) {
                Asset asset = (Asset) assetList.assets.get(i10);
                if (i10 > 0) {
                    i9 = (i3 + i10) - 1;
                }
                long j11 = asset.durationUs;
                jArr[i9] = j11;
                j10 += j11;
                adPlaybackState = adPlaybackState.withAvailableAdMediaItem(this.assetListData.adGroupIndex, i9, new MediaItem.Builder().setUri(asset.uri).setMimeType(MimeTypes.APPLICATION_M3U8).build());
                if (assetList.skipInfo != null) {
                    adPlaybackState = adPlaybackState.withAdSkipInfo(this.assetListData.adGroupIndex, i9, assetList.skipInfo);
                }
            }
            AdPlaybackState adPlaybackStateWithAdDurationsUs = adPlaybackState.withAdDurationsUs(this.assetListData.adGroupIndex, jArr);
            if (this.assetListData.interstitial.resumeOffsetUs == C.TIME_UNSET) {
                adPlaybackStateWithAdDurationsUs = adPlaybackStateWithAdDurationsUs.withContentResumeOffsetUs(this.assetListData.adGroupIndex, (adPlaybackStateWithAdDurationsUs.getAdGroup(this.assetListData.adGroupIndex).contentResumeOffsetUs - HlsInterstitialsAdsLoader.resolveInterstitialDurationUs(this.assetListData.interstitial, 0L)) + j10);
            }
            HlsInterstitialsAdsLoader.this.putAndNotifyAdPlaybackStateUpdate(this.assetListData.adsId, adPlaybackStateWithAdDurationsUs);
            HlsInterstitialsAdsLoader.this.notifyListeners(new d(this, assetList, result, 0));
            maybeContinueAssetResolution();
        }

        @Override
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<Pair<AssetList, JSONObject>> parsingLoadable, long j, long j9, IOException iOException, int i3) {
            handleAssetResolutionFailed(iOException, false);
            return Loader.DONT_RETRY;
        }
    }

    public static class PendingSnapInResolution {
        private final int adGroupIndex;
        private final HlsMediaPlaylist.Interstitial interstitial;
        private final long resumeTimeUs;

        public PendingSnapInResolution(long j, int i3, HlsMediaPlaylist.Interstitial interstitial) {
            this.resumeTimeUs = j;
            this.adGroupIndex = i3;
            this.interstitial = interstitial;
        }
    }

    public class PlayerListener implements Player.Listener {
        private final Timeline.Period period;

        private PlayerListener() {
            this.period = new Timeline.Period();
        }

        public static void lambda$onPlaybackStateChanged$4(Player player, Object obj, Listener listener) {
            MediaItem currentMediaItem = player.getCurrentMediaItem();
            currentMediaItem.getClass();
            listener.onAdStarted(currentMediaItem, obj, player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup());
        }

        public static void lambda$onPositionDiscontinuity$1(Player.PositionInfo positionInfo, Object obj, Listener listener) {
            MediaItem mediaItem = positionInfo.mediaItem;
            mediaItem.getClass();
            listener.onAdStarted(mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        }

        public static void lambda$onPositionDiscontinuity$2(Player.PositionInfo positionInfo, Object obj, Listener listener) {
            MediaItem mediaItem = positionInfo.mediaItem;
            mediaItem.getClass();
            listener.onAdStarted(mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        }

        public static void lambda$onPositionDiscontinuity$3(Player.PositionInfo positionInfo, Object obj, Listener listener) {
            MediaItem mediaItem = positionInfo.mediaItem;
            mediaItem.getClass();
            listener.onAdSkipped(mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        }

        private void markAdAsPlayedAndNotifyListeners(MediaItem mediaItem, Object obj, int i3, int i9) {
            AdPlaybackState adPlaybackState = HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.getAdPlaybackState(obj);
            if (adPlaybackState == null || adPlaybackState.getAdGroup(i3).states[i9] != 1) {
                return;
            }
            HlsInterstitialsAdsLoader.this.putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState.withPlayedAd(i3, i9));
            HlsInterstitialsAdsLoader.this.notifyListeners(new g(i3, i9, 0, mediaItem, obj));
        }

        @Override
        public void onMetadata(Metadata metadata) {
            ExoPlayer exoPlayer = HlsInterstitialsAdsLoader.this.player;
            if (exoPlayer == null || !exoPlayer.isPlayingAd()) {
                return;
            }
            exoPlayer.getCurrentTimeline().getPeriod(exoPlayer.getCurrentPeriodIndex(), this.period);
            Object obj = this.period.adPlaybackState.adsId;
            if (obj == null || !HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.isManagedContentSource(obj)) {
                return;
            }
            MediaItem currentMediaItem = exoPlayer.getCurrentMediaItem();
            currentMediaItem.getClass();
            HlsInterstitialsAdsLoader.this.notifyListeners(new h(currentMediaItem, obj, exoPlayer.getCurrentAdGroupIndex(), exoPlayer.getCurrentAdIndexInAdGroup(), metadata, 0));
        }

        @Override
        public void onPlaybackStateChanged(int i3) {
            ExoPlayer exoPlayer = HlsInterstitialsAdsLoader.this.player;
            if (i3 == 3 && exoPlayer != null && exoPlayer.isPlayingAd()) {
                exoPlayer.getCurrentTimeline().getPeriod(exoPlayer.getCurrentPeriodIndex(), this.period);
                Object obj = this.period.adPlaybackState.adsId;
                if (obj == null || !HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.awaitingFirstAdToStartFor(obj)) {
                    return;
                }
                HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.notifyAdStarted(obj);
                HlsInterstitialsAdsLoader.this.notifyListeners(new f(exoPlayer, obj, 0));
            }
        }

        @Override
        public void onPositionDiscontinuity(final Player.PositionInfo positionInfo, final Player.PositionInfo positionInfo2, int i3) {
            if (HlsInterstitialsAdsLoader.this.player == null || positionInfo.mediaItem == null || positionInfo2.mediaItem == null || i3 == 4 || i3 == 6 || i3 == 5) {
                HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
                return;
            }
            Timeline currentTimeline = HlsInterstitialsAdsLoader.this.player.getCurrentTimeline();
            currentTimeline.getPeriod(positionInfo2.periodIndex, this.period);
            final Object obj = this.period.adPlaybackState.adsId;
            if (obj == null || !HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.isManagedContentSource(obj)) {
                HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
                return;
            }
            if (i3 == 0) {
                int i9 = positionInfo.adGroupIndex;
                if (i9 != -1) {
                    markAdAsPlayedAndNotifyListeners(positionInfo.mediaItem, obj, i9, positionInfo.adIndexInAdGroup);
                }
                if (positionInfo2.adIndexInAdGroup != -1) {
                    HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.notifyAdStarted(obj);
                    final int i10 = 0;
                    HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() {
                        @Override
                        public final void accept(Object obj2) {
                            HlsInterstitialsAdsLoader.Listener listener = (HlsInterstitialsAdsLoader.Listener) obj2;
                            switch (i10) {
                                case 0:
                                    HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$1(positionInfo2, obj, listener);
                                    break;
                                case 1:
                                    HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$2(positionInfo2, obj, listener);
                                    break;
                                default:
                                    HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$3(positionInfo2, obj, listener);
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (i3 != 1 && i3 != 2) {
                if (positionInfo.adGroupIndex == -1 || i3 != 3) {
                    return;
                }
                final int i11 = 2;
                HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() {
                    @Override
                    public final void accept(Object obj2) {
                        HlsInterstitialsAdsLoader.Listener listener = (HlsInterstitialsAdsLoader.Listener) obj2;
                        switch (i11) {
                            case 0:
                                HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$1(positionInfo, obj, listener);
                                break;
                            case 1:
                                HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$2(positionInfo, obj, listener);
                                break;
                            default:
                                HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$3(positionInfo, obj, listener);
                                break;
                        }
                    }
                });
                return;
            }
            long jMsToUs = Util.msToUs(positionInfo2.contentPositionMs);
            long unresolvedAssetListWindowPositionForContentPositionUs = HlsInterstitialsAdsLoader.this.getUnresolvedAssetListWindowPositionForContentPositionUs(jMsToUs, currentTimeline, positionInfo2.periodIndex);
            HlsInterstitialsAdsLoader.this.maybeExecuteOrSetNextAssetListResolutionMessage(obj, currentTimeline, positionInfo2.mediaItemIndex, -this.period.positionInWindowUs, unresolvedAssetListWindowPositionForContentPositionUs != C.TIME_UNSET ? unresolvedAssetListWindowPositionForContentPositionUs : jMsToUs);
            if (positionInfo.adIndexInAdGroup != -1 || positionInfo2.adIndexInAdGroup == -1) {
                return;
            }
            final int i12 = 1;
            HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() {
                @Override
                public final void accept(Object obj2) {
                    HlsInterstitialsAdsLoader.Listener listener = (HlsInterstitialsAdsLoader.Listener) obj2;
                    switch (i12) {
                        case 0:
                            HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$1(positionInfo2, obj, listener);
                            break;
                        case 1:
                            HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$2(positionInfo2, obj, listener);
                            break;
                        default:
                            HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$3(positionInfo2, obj, listener);
                            break;
                    }
                }
            });
        }

        @Override
        public void onTimelineChanged(Timeline timeline, int i3) {
            if (timeline.isEmpty()) {
                HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
            }
        }
    }

    public static class RunnableAtPosition implements Runnable {
        public final long adStartTimeUs;
        private final Runnable runnable;
        private final long targetDurationUs;

        public RunnableAtPosition(long j, long j9, Runnable runnable) {
            this.adStartTimeUs = j;
            this.targetDurationUs = j9;
            this.runnable = runnable;
        }

        @Override
        public void run() {
            this.runnable.run();
        }
    }

    public HlsInterstitialsAdsLoader(Context context) {
        this(new DefaultDataSource.Factory(context));
    }

    public void cancelPendingAssetListResolutionMessage() {
        PlayerMessage playerMessage = this.pendingAssetListResolutionMessage;
        if (playerMessage != null) {
            playerMessage.cancel();
            this.pendingAssetListResolutionMessage = null;
        }
    }

    private LongSparseArray<List<HlsMediaPlaylist.Interstitial>> filterAndSortWithResolvedStartPositions(AbstractC2186b0 abstractC2186b0, Object obj, HlsMediaPlaylist hlsMediaPlaylist, long j, boolean z6) {
        LongSparseArray<List<HlsMediaPlaylist.Interstitial>> longSparseArray = new LongSparseArray<>();
        for (int i3 = 0; i3 < abstractC2186b0.size(); i3++) {
            HlsMediaPlaylist.Interstitial interstitial = (HlsMediaPlaylist.Interstitial) abstractC2186b0.get(i3);
            if (!this.contentMediaSourceAdDataHolder.isInsertedInterstitialId(obj, interstitial.id) && (!z6 || !interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST))) {
                long jResolveInterstitialStartTimeUs = resolveInterstitialStartTimeUs(interstitial, hlsMediaPlaylist, j);
                List<HlsMediaPlaylist.Interstitial> arrayList = longSparseArray.indexOfKey(jResolveInterstitialStartTimeUs) < 0 ? new ArrayList<>() : longSparseArray.get(jResolveInterstitialStartTimeUs);
                longSparseArray.put(jResolveInterstitialStartTimeUs, arrayList);
                arrayList.add(interstitial);
            }
        }
        return longSparseArray;
    }

    private AdPlaybackState getAdPlaybackState() {
        Object obj;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return null;
        }
        Timeline currentTimeline = exoPlayer.getCurrentTimeline();
        if (currentTimeline.isEmpty() || (obj = currentTimeline.getPeriod(exoPlayer.getCurrentPeriodIndex(), new Timeline.Period()).adPlaybackState.adsId) == null) {
            return null;
        }
        return this.contentMediaSourceAdDataHolder.getAdPlaybackState(obj);
    }

    public static long getClosestSegmentBoundaryUs(long j, HlsMediaPlaylist hlsMediaPlaylist) {
        long j9;
        long j10 = j - hlsMediaPlaylist.startTimeUs;
        if (j10 <= 0 || hlsMediaPlaylist.segments.isEmpty()) {
            return hlsMediaPlaylist.startTimeUs;
        }
        long j11 = hlsMediaPlaylist.durationUs;
        if (j10 >= j11) {
            j9 = hlsMediaPlaylist.startTimeUs;
        } else {
            int size = hlsMediaPlaylist.segments.size() - 1;
            int i3 = 0;
            int i9 = 0;
            while (i3 <= size) {
                i9 = ((size - i3) / 2) + i3;
                HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i9);
                long j12 = segment.relativeStartTimeUs;
                long j13 = segment.durationUs + j12;
                if (j10 >= j12 && j10 <= j13) {
                    break;
                }
                if (j10 < j12) {
                    size = i9 - 1;
                } else {
                    i3 = i9 + 1;
                }
            }
            HlsMediaPlaylist.Segment segment2 = hlsMediaPlaylist.segments.get(i9);
            long j14 = segment2.relativeStartTimeUs;
            if (j10 - j14 < Math.abs(j10 - (j14 + segment2.durationUs))) {
                j9 = hlsMediaPlaylist.startTimeUs;
                j11 = segment2.relativeStartTimeUs;
            } else {
                j9 = hlsMediaPlaylist.startTimeUs + segment2.relativeStartTimeUs;
                j11 = segment2.durationUs;
            }
        }
        return j9 + j11;
    }

    private Loader getLoader() {
        if (this.loader == null) {
            this.loader = new Loader("HLS-interstitials");
        }
        return this.loader;
    }

    private static int getLowestValidAdGroupInsertionIndex(AdPlaybackState adPlaybackState) {
        int i3 = adPlaybackState.adGroupCount;
        while (true) {
            i3--;
            int i9 = adPlaybackState.removedAdGroupCount;
            if (i3 < i9) {
                return i9;
            }
            for (int i10 : adPlaybackState.getAdGroup(i3).states) {
                if (i10 != 0) {
                    return i3 + 1;
                }
            }
        }
    }

    private RunnableAtPosition getNextAssetResolution(Object obj, long j) {
        Map<Long, AssetListData> unresolvedAssetLists = this.contentMediaSourceAdDataHolder.getUnresolvedAssetLists(obj);
        unresolvedAssetLists.getClass();
        final Map<Long, AssetListData> map = unresolvedAssetLists;
        for (final Long l2 : map.keySet()) {
            if (j <= l2.longValue()) {
                final AssetListData assetListData = map.get(l2);
                assetListData.getClass();
                return new RunnableAtPosition(l2.longValue(), assetListData.targetDurationUs, new Runnable() {
                    @Override
                    public final void run() {
                        this.f16648h.lambda$getNextAssetResolution$7(map, l2, assetListData);
                    }
                });
            }
        }
        return null;
    }

    public long getUnresolvedAssetListWindowPositionForContentPositionUs(long j, Timeline timeline, int i3) {
        int adGroupIndexForPositionUs;
        Timeline.Period period = timeline.getPeriod(i3, new Timeline.Period());
        long j9 = j - period.positionInWindowUs;
        AdPlaybackState adPlaybackState = period.adPlaybackState;
        if (adPlaybackState.adsId != null && (adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(j9, C.TIME_UNSET)) != -1) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(adGroupIndexForPositionUs);
            Map<Long, AssetListData> unresolvedAssetLists = this.contentMediaSourceAdDataHolder.getUnresolvedAssetLists(adPlaybackState.adsId);
            if (unresolvedAssetLists != null && unresolvedAssetLists.containsKey(Long.valueOf(adGroup.timeUs))) {
                return adGroup.timeUs - timeline.getWindow(period.windowIndex, new Timeline.Window()).positionInFirstPeriodUs;
            }
        }
        return C.TIME_UNSET;
    }

    private AdPlaybackState insertOrUpdateInterstitialInAdGroup(HlsMediaPlaylist hlsMediaPlaylist, MediaItem mediaItem, HlsMediaPlaylist.Interstitial interstitial, AdPlaybackState adPlaybackState, int i3, long j) {
        long[] jArr;
        long j9;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
        if (adGroup.getIndexOfAdId(interstitial.id) != -1) {
            return adPlaybackState;
        }
        int iMax = Math.max(adGroup.count, 0);
        long jResolveInterstitialDurationUs = resolveInterstitialDurationUs(interstitial, C.TIME_UNSET);
        if (iMax == 0) {
            jArr = new long[1];
        } else {
            long[] jArr2 = adGroup.durationsUs;
            long[] jArr3 = new long[jArr2.length + 1];
            System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
            jArr = jArr3;
        }
        jArr[jArr.length - 1] = interstitial.playoutLimitUs;
        long j10 = interstitial.resumeOffsetUs;
        if (j10 != C.TIME_UNSET) {
            jResolveInterstitialDurationUs = j10;
        } else if (jResolveInterstitialDurationUs == C.TIME_UNSET) {
            jResolveInterstitialDurationUs = 0;
        }
        if (interstitial.snapTypes.contains(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN)) {
            long j11 = interstitial.startDateUnixUs + jResolveInterstitialDurationUs;
            j9 = -9223372036854775807L;
            if (j11 < hlsMediaPlaylist.startTimeUs + hlsMediaPlaylist.durationUs) {
                jResolveInterstitialDurationUs = resolveInterstitialResumeOffsetUs(interstitial, hlsMediaPlaylist);
            } else {
                ContentMediaSourceAdDataHolder contentMediaSourceAdDataHolder = this.contentMediaSourceAdDataHolder;
                Object obj = adPlaybackState.adsId;
                obj.getClass();
                contentMediaSourceAdDataHolder.putPendingSnapInResolution(obj, new PendingSnapInResolution(j11, i3, interstitial));
            }
        } else {
            j9 = -9223372036854775807L;
        }
        AdPlaybackState adPlaybackStateWithContentResumeOffsetUs = adPlaybackState.withAdCount(i3, iMax + 1).withAdId(i3, iMax, interstitial.id).withAdDurationsUs(i3, jArr).withContentResumeOffsetUs(i3, adGroup.contentResumeOffsetUs + jResolveInterstitialDurationUs);
        if (interstitial.skipControlDurationUs != j9 || interstitial.skipControlOffsetUs != j9 || interstitial.skipControlLabelId != null) {
            adPlaybackStateWithContentResumeOffsetUs = adPlaybackStateWithContentResumeOffsetUs.withAdSkipInfo(i3, iMax, new AdPlaybackState.SkipInfo(interstitial.skipControlOffsetUs, interstitial.skipControlDurationUs, interstitial.skipControlLabelId));
        }
        AdPlaybackState adPlaybackState2 = adPlaybackStateWithContentResumeOffsetUs;
        if (interstitial.assetUri != null) {
            return adPlaybackState2.withAvailableAdMediaItem(i3, iMax, new MediaItem.Builder().setUri(interstitial.assetUri).setMimeType(MimeTypes.APPLICATION_M3U8).build());
        }
        Object obj2 = adPlaybackState2.adsId;
        obj2.getClass();
        Map<Long, AssetListData> unresolvedAssetLists = this.contentMediaSourceAdDataHolder.getUnresolvedAssetLists(obj2);
        unresolvedAssetLists.getClass();
        Map<Long, AssetListData> map = unresolvedAssetLists;
        long j12 = adGroup.timeUs;
        if (j12 == Long.MIN_VALUE) {
            j12 = Long.MAX_VALUE;
        }
        map.put(Long.valueOf(j12), new AssetListData(mediaItem, obj2, interstitial, i3, iMax, j));
        return adPlaybackState2;
    }

    private static boolean isHlsMediaItem(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        localConfiguration.getClass();
        return Objects.equals(localConfiguration.mimeType, MimeTypes.APPLICATION_M3U8) || Util.inferContentType(localConfiguration.uri) == 2;
    }

    private static boolean isLiveMediaItem(MediaItem mediaItem, Timeline timeline) {
        int firstWindowIndex = timeline.getFirstWindowIndex(false);
        Timeline.Window window = new Timeline.Window();
        while (firstWindowIndex != -1) {
            timeline.getWindow(firstWindowIndex, window);
            if (window.mediaItem.equals(mediaItem)) {
                return window.isLive();
            }
            firstWindowIndex = timeline.getNextWindowIndex(firstWindowIndex, 0, false);
        }
        return false;
    }

    public void lambda$getNextAssetResolution$7(Map map, Long l2, AssetListData assetListData) {
        if (map.remove(l2) != null) {
            startLoadingAssetList(assetListData);
        }
    }

    public static void lambda$handleContentTimelineChanged$1(AdsMediaSource adsMediaSource, Object obj, Timeline timeline, Listener listener) {
        listener.onContentTimelineChanged(adsMediaSource.getMediaItem(), obj, timeline);
    }

    public static void lambda$handlePrepareComplete$2(AdsMediaSource adsMediaSource, Object obj, int i3, int i9, Listener listener) {
        listener.onPrepareCompleted(adsMediaSource.getMediaItem(), obj, i3, i9);
    }

    public static void lambda$handlePrepareError$3(AdsMediaSource adsMediaSource, Object obj, int i3, int i9, IOException iOException, Listener listener) {
        listener.onPrepareError(adsMediaSource.getMediaItem(), obj, i3, i9, iOException);
    }

    public static void lambda$startLoadingAssetList$5(AssetListData assetListData, Listener listener) {
        listener.onAssetListLoadStarted(assetListData.mediaItem, assetListData.adsId, assetListData.adGroupIndex, assetListData.adIndexInAdGroup);
    }

    public static void lambda$stop$4(AdsMediaSource adsMediaSource, AdPlaybackState adPlaybackState, Listener listener) {
        MediaItem mediaItem = adsMediaSource.getMediaItem();
        Object adsId = adsMediaSource.getAdsId();
        adPlaybackState.getClass();
        listener.onStop(mediaItem, adsId, adPlaybackState);
    }

    private AdPlaybackState mapInterstitialsForLive(MediaItem mediaItem, HlsMediaPlaylist hlsMediaPlaylist, AdPlaybackState adPlaybackState, long j, long j9) {
        int i3;
        boolean z6;
        AdPlaybackState adPlaybackStateInsertOrUpdateInterstitialInAdGroup = adPlaybackState;
        Object obj = adPlaybackStateInsertOrUpdateInterstitialInAdGroup.adsId;
        obj.getClass();
        LongSparseArray<List<HlsMediaPlaylist.Interstitial>> longSparseArrayFilterAndSortWithResolvedStartPositions = filterAndSortWithResolvedStartPositions(hlsMediaPlaylist.interstitials, obj, hlsMediaPlaylist, j9, true);
        int i9 = 0;
        while (i9 < longSparseArrayFilterAndSortWithResolvedStartPositions.size()) {
            long jKeyAt = longSparseArrayFilterAndSortWithResolvedStartPositions.keyAt(i9);
            List<HlsMediaPlaylist.Interstitial> list = longSparseArrayFilterAndSortWithResolvedStartPositions.get(jKeyAt);
            int i10 = 0;
            while (i10 < list.size()) {
                HlsMediaPlaylist.Interstitial interstitial = list.get(i10);
                long j10 = jKeyAt - hlsMediaPlaylist.startTimeUs;
                if (j10 >= 0) {
                    i3 = i9;
                    if ((hlsMediaPlaylist.targetDurationUs * 3) + hlsMediaPlaylist.durationUs >= j10) {
                        long j11 = j + j10;
                        int i11 = adPlaybackStateInsertOrUpdateInterstitialInAdGroup.adGroupCount;
                        int i12 = i11 - 1;
                        int i13 = i11 - 2;
                        while (true) {
                            int i14 = i12;
                            i12 = i13;
                            z6 = true;
                            if (i12 < adPlaybackStateInsertOrUpdateInterstitialInAdGroup.removedAdGroupCount) {
                                i12 = i14;
                                break;
                            }
                            long j12 = adPlaybackStateInsertOrUpdateInterstitialInAdGroup.getAdGroup(i12).timeUs;
                            if (j12 == j11) {
                                z6 = false;
                                break;
                            }
                            if (j12 < j11) {
                                i12++;
                                break;
                            }
                            i13 = i12 - 1;
                        }
                        if (z6) {
                            if (i12 < getLowestValidAdGroupInsertionIndex(adPlaybackStateInsertOrUpdateInterstitialInAdGroup)) {
                                Log.w(TAG, "Skipping insertion of interstitial attempted to be inserted behind an already initialized ad group.");
                            } else {
                                adPlaybackStateInsertOrUpdateInterstitialInAdGroup = adPlaybackStateInsertOrUpdateInterstitialInAdGroup.withNewAdGroup(i12, j11);
                            }
                        }
                        adPlaybackStateInsertOrUpdateInterstitialInAdGroup = insertOrUpdateInterstitialInAdGroup(hlsMediaPlaylist, mediaItem, interstitial, adPlaybackStateInsertOrUpdateInterstitialInAdGroup, i12, hlsMediaPlaylist.targetDurationUs);
                        this.contentMediaSourceAdDataHolder.addInsertedInterstitialId(obj, interstitial.id);
                    }
                } else {
                    i3 = i9;
                }
                i10++;
                i9 = i3;
            }
            i9++;
        }
        return maybeResolvePendingSnapInResolutions(adPlaybackStateInsertOrUpdateInterstitialInAdGroup, hlsMediaPlaylist);
    }

    private AdPlaybackState mapInterstitialsForVod(MediaItem mediaItem, HlsMediaPlaylist hlsMediaPlaylist, AdPlaybackState adPlaybackState, long j, long j9, long j10) {
        AdPlaybackState adPlaybackStateWithNewAdGroup = adPlaybackState;
        AbstractC1864o0.L(adPlaybackStateWithNewAdGroup.adGroupCount == adPlaybackStateWithNewAdGroup.removedAdGroupCount);
        AbstractC2186b0 abstractC2186b0 = hlsMediaPlaylist.interstitials;
        Object obj = adPlaybackStateWithNewAdGroup.adsId;
        obj.getClass();
        LongSparseArray<List<HlsMediaPlaylist.Interstitial>> longSparseArrayFilterAndSortWithResolvedStartPositions = filterAndSortWithResolvedStartPositions(abstractC2186b0, obj, hlsMediaPlaylist, j9, false);
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        long j11 = hlsMediaPlaylist2.startTimeUs + j9;
        long j12 = j11 + j;
        int i3 = 0;
        while (i3 < longSparseArrayFilterAndSortWithResolvedStartPositions.size()) {
            List<HlsMediaPlaylist.Interstitial> list = longSparseArrayFilterAndSortWithResolvedStartPositions.get(longSparseArrayFilterAndSortWithResolvedStartPositions.keyAt(i3));
            int i9 = 0;
            while (i9 < list.size()) {
                HlsMediaPlaylist.Interstitial interstitial = list.get(i9);
                long jResolveInterstitialStartTimeUs = resolveInterstitialStartTimeUs(interstitial, hlsMediaPlaylist2, j10);
                if (jResolveInterstitialStartTimeUs < j11 && interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
                    jResolveInterstitialStartTimeUs = j11;
                } else if (jResolveInterstitialStartTimeUs <= j12 || !interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
                    if (jResolveInterstitialStartTimeUs < j11 || j12 < jResolveInterstitialStartTimeUs) {
                    }
                    i9++;
                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                } else {
                    jResolveInterstitialStartTimeUs = j12;
                }
                long j13 = j12 == jResolveInterstitialStartTimeUs ? Long.MIN_VALUE : jResolveInterstitialStartTimeUs - hlsMediaPlaylist2.startTimeUs;
                int adGroupIndexForPositionUs = adPlaybackStateWithNewAdGroup.getAdGroupIndexForPositionUs(j13, hlsMediaPlaylist2.durationUs);
                if (adGroupIndexForPositionUs == -1) {
                    adGroupIndexForPositionUs = adPlaybackStateWithNewAdGroup.removedAdGroupCount;
                    adPlaybackStateWithNewAdGroup = adPlaybackStateWithNewAdGroup.withNewAdGroup(adGroupIndexForPositionUs, j13);
                } else if (adPlaybackStateWithNewAdGroup.getAdGroup(adGroupIndexForPositionUs).timeUs != j13) {
                    adGroupIndexForPositionUs++;
                    adPlaybackStateWithNewAdGroup = adPlaybackStateWithNewAdGroup.withNewAdGroup(adGroupIndexForPositionUs, j13);
                }
                adPlaybackStateWithNewAdGroup = insertOrUpdateInterstitialInAdGroup(hlsMediaPlaylist2, mediaItem, interstitial, adPlaybackStateWithNewAdGroup, adGroupIndexForPositionUs, hlsMediaPlaylist2.targetDurationUs);
                ContentMediaSourceAdDataHolder contentMediaSourceAdDataHolder = this.contentMediaSourceAdDataHolder;
                Object obj2 = adPlaybackStateWithNewAdGroup.adsId;
                obj2.getClass();
                contentMediaSourceAdDataHolder.addInsertedInterstitialId(obj2, interstitial.id);
                i9++;
                hlsMediaPlaylist2 = hlsMediaPlaylist;
            }
            i3++;
            hlsMediaPlaylist2 = hlsMediaPlaylist;
        }
        return adPlaybackStateWithNewAdGroup;
    }

    public void maybeExecuteOrSetNextAssetListResolutionMessage(Object obj, Timeline timeline, int i3, long j, long j9) {
        Loader loader = this.loader;
        if (loader == null || !loader.isLoading()) {
            cancelPendingAssetListResolutionMessage();
            Timeline.Window window = timeline.getWindow(i3, new Timeline.Window());
            long j10 = j9 + j;
            RunnableAtPosition nextAssetResolution = getNextAssetResolution(obj, j10);
            if (nextAssetResolution == null) {
                return;
            }
            long j11 = nextAssetResolution.adStartTimeUs;
            if (j11 == Long.MAX_VALUE) {
                j11 = window.durationUs;
            }
            long jMax = Math.max(j10, j11 - (nextAssetResolution.targetDurationUs * 3));
            if (jMax - j10 < 200000) {
                nextAssetResolution.run();
                return;
            }
            long jMax2 = jMax - j;
            AdPlaybackState adPlaybackState = this.contentMediaSourceAdDataHolder.getAdPlaybackState(obj);
            adPlaybackState.getClass();
            int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(jMax, timeline.getPeriod(0, new Timeline.Period()).durationUs);
            if (adGroupIndexForPositionUs != -1) {
                AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(adGroupIndexForPositionUs);
                jMax2 = Math.max(jMax2, (adGroup.timeUs + adGroup.contentResumeOffsetUs) - j);
            }
            ExoPlayer exoPlayer = this.player;
            exoPlayer.getClass();
            PlayerMessage payload = exoPlayer.createMessage(new b(1, nextAssetResolution)).setPayload(window.mediaItem);
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            PlayerMessage position = payload.setLooper(looperMyLooper).setPosition(Math.max(Util.usToMs(jMax2), 0L));
            this.pendingAssetListResolutionMessage = position;
            position.send();
        }
    }

    private AdPlaybackState maybeResolvePendingSnapInResolutions(AdPlaybackState adPlaybackState, HlsMediaPlaylist hlsMediaPlaylist) {
        AdPlaybackState adPlaybackStateWithContentResumeOffsetUs = adPlaybackState;
        Object obj = adPlaybackStateWithContentResumeOffsetUs.adsId;
        obj.getClass();
        long j = hlsMediaPlaylist.startTimeUs + hlsMediaPlaylist.durationUs;
        List<PendingSnapInResolution> pendingSnapInResolutions = this.contentMediaSourceAdDataHolder.getPendingSnapInResolutions(obj);
        int i3 = 0;
        int i9 = -1;
        while (i3 < pendingSnapInResolutions.size()) {
            PendingSnapInResolution pendingSnapInResolution = pendingSnapInResolutions.get(i3);
            if (pendingSnapInResolution.resumeTimeUs > j) {
                break;
            }
            HlsMediaPlaylist.Interstitial interstitial = pendingSnapInResolution.interstitial;
            long jResolveInterstitialResumeOffsetUs = resolveInterstitialResumeOffsetUs(interstitial, hlsMediaPlaylist);
            AdPlaybackState.AdGroup adGroup = adPlaybackStateWithContentResumeOffsetUs.getAdGroup(pendingSnapInResolution.adGroupIndex);
            int i10 = i3;
            long jResolveInterstitialDurationUs = resolveInterstitialDurationUs(interstitial, C.TIME_UNSET);
            long j9 = interstitial.resumeOffsetUs;
            if (j9 != C.TIME_UNSET) {
                jResolveInterstitialDurationUs = j9;
            } else if (jResolveInterstitialDurationUs == C.TIME_UNSET) {
                jResolveInterstitialDurationUs = 0;
            }
            adPlaybackStateWithContentResumeOffsetUs = adPlaybackStateWithContentResumeOffsetUs.withContentResumeOffsetUs(pendingSnapInResolution.adGroupIndex, (adGroup.contentResumeOffsetUs - jResolveInterstitialDurationUs) + jResolveInterstitialResumeOffsetUs);
            i9++;
            i3 = i10 + 1;
        }
        if (i9 != -1) {
            this.contentMediaSourceAdDataHolder.removePendingSnapInResolutionUntilIndexInclusive(obj, i9);
        }
        return adPlaybackStateWithContentResumeOffsetUs;
    }

    public void notifyAssetResolutionFailed(Object obj, int i3, int i9) {
        AdPlaybackState adPlaybackState = this.contentMediaSourceAdDataHolder.getAdPlaybackState(obj);
        if (adPlaybackState == null) {
            return;
        }
        putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState.withAdLoadError(i3, i9));
    }

    public void notifyListeners(Consumer<Listener> consumer) {
        for (int i3 = 0; i3 < this.listeners.size(); i3++) {
            consumer.accept(this.listeners.get(i3));
        }
    }

    public boolean putAndNotifyAdPlaybackStateUpdate(Object obj, AdPlaybackState adPlaybackState) {
        if (adPlaybackState.equals(this.contentMediaSourceAdDataHolder.putAdPlaybackState(obj, adPlaybackState))) {
            return false;
        }
        AdsLoader.EventListener eventListener = this.contentMediaSourceAdDataHolder.getEventListener(obj);
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
            return true;
        }
        this.contentMediaSourceAdDataHolder.stopContentSource(obj);
        return false;
    }

    private void removeUnresolvedAssetListOfAdGroup(AdPlaybackState adPlaybackState, AdPlaybackState.AdGroup adGroup) {
        AbstractC1864o0.L(adPlaybackState.adsId != null);
        Map<Long, AssetListData> unresolvedAssetLists = this.contentMediaSourceAdDataHolder.getUnresolvedAssetLists(adPlaybackState.adsId);
        if (unresolvedAssetLists != null) {
            long j = adGroup.timeUs;
            if (j == Long.MIN_VALUE) {
                j = Long.MAX_VALUE;
            }
            unresolvedAssetLists.remove(Long.valueOf(j));
        }
    }

    public static long resolveInterstitialDurationUs(HlsMediaPlaylist.Interstitial interstitial, long j) {
        long j9 = interstitial.playoutLimitUs;
        if (j9 != C.TIME_UNSET) {
            return j9;
        }
        long j10 = interstitial.durationUs;
        if (j10 != C.TIME_UNSET) {
            return j10;
        }
        long j11 = interstitial.endDateUnixUs;
        if (j11 != C.TIME_UNSET) {
            return j11 - interstitial.startDateUnixUs;
        }
        long j12 = interstitial.plannedDurationUs;
        return j12 != C.TIME_UNSET ? j12 : j;
    }

    private static long resolveInterstitialResumeOffsetUs(HlsMediaPlaylist.Interstitial interstitial, HlsMediaPlaylist hlsMediaPlaylist) {
        if (!interstitial.snapTypes.contains(HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN)) {
            long j = interstitial.resumeOffsetUs;
            return j != C.TIME_UNSET ? j : resolveInterstitialDurationUs(interstitial, C.TIME_UNSET);
        }
        long jResolveInterstitialDurationUs = interstitial.resumeOffsetUs;
        if (jResolveInterstitialDurationUs == C.TIME_UNSET) {
            jResolveInterstitialDurationUs = resolveInterstitialDurationUs(interstitial, 0L);
        }
        long closestSegmentBoundaryUs = interstitial.snapTypes.contains(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT) ? getClosestSegmentBoundaryUs(interstitial.startDateUnixUs, hlsMediaPlaylist) : interstitial.startDateUnixUs;
        return getClosestSegmentBoundaryUs(jResolveInterstitialDurationUs + closestSegmentBoundaryUs, hlsMediaPlaylist) - closestSegmentBoundaryUs;
    }

    private static long resolveInterstitialStartTimeUs(HlsMediaPlaylist.Interstitial interstitial, HlsMediaPlaylist hlsMediaPlaylist, long j) {
        if (interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
            return hlsMediaPlaylist.startTimeUs + j;
        }
        if (interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
            return hlsMediaPlaylist.startTimeUs + hlsMediaPlaylist.durationUs;
        }
        return interstitial.snapTypes.contains(HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT) ? getClosestSegmentBoundaryUs(interstitial.startDateUnixUs, hlsMediaPlaylist) : interstitial.startDateUnixUs;
    }

    private void startLoadingAssetList(AssetListData assetListData) {
        cancelPendingAssetListResolutionMessage();
        Loader loader = getLoader();
        DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
        Uri uri = assetListData.interstitial.assetListUri;
        uri.getClass();
        loader.startLoading(new ParsingLoadable(dataSourceCreateDataSource, uri, 6, new AssetListParser()), new LoaderCallback(assetListData), 1);
        notifyListeners(new b(0, assetListData));
    }

    public void addAdResumptionState(AdsResumptionState adsResumptionState) {
        addAdResumptionState(adsResumptionState.adsId, adsResumptionState.adPlaybackState);
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void clearAllAdResumptionStates() {
        this.resumptionStates.clear();
    }

    public AbstractC2186b0 getAdsResumptionStates() {
        AbstractC2230y.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = 0;
        for (AdPlaybackState adPlaybackState : this.contentMediaSourceAdDataHolder.getAdPlaybackStates()) {
            boolean zEndsWithLivePostrollPlaceHolder = adPlaybackState.endsWithLivePostrollPlaceHolder();
            if (zEndsWithLivePostrollPlaceHolder || !(adPlaybackState.adsId instanceof String)) {
                Log.i(TAG, zEndsWithLivePostrollPlaceHolder ? "getAdsResumptionStates(): ignoring active ad playback state of live stream. adsId=" + adPlaybackState.adsId : "getAdsResumptionStates(): ignoring active ad playback state when creating resumption states. `adsId` is not of type String: " + Util.castNonNull(adPlaybackState.adsId).getClass());
            } else {
                AdsResumptionState adsResumptionState = new AdsResumptionState((String) adPlaybackState.adsId, adPlaybackState.copy());
                int i9 = i3 + 1;
                int iB = V.b(objArrCopyOf.length, i9);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i3] = adsResumptionState;
                i3 = i9;
            }
        }
        return AbstractC2186b0.r(objArrCopyOf, i3);
    }

    @Override
    public boolean handleContentTimelineChanged(AdsMediaSource adsMediaSource, Timeline timeline) {
        HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader;
        Timeline timeline2;
        AdPlaybackState adPlaybackStateMapInterstitialsForVod;
        Object adsId = adsMediaSource.getAdsId();
        if (this.isReleased) {
            AdsLoader.EventListener eventListener = this.contentMediaSourceAdDataHolder.getEventListener(adsId);
            if (eventListener != null) {
                AdPlaybackState adPlaybackStateStopContentSource = this.contentMediaSourceAdDataHolder.stopContentSource(adsId);
                adPlaybackStateStopContentSource.getClass();
                if (adPlaybackStateStopContentSource.equals(AdPlaybackState.NONE)) {
                    eventListener.onAdPlaybackState(new AdPlaybackState(adsId, new long[0]));
                    return false;
                }
            }
        } else {
            AdPlaybackState adPlaybackState = this.contentMediaSourceAdDataHolder.getAdPlaybackState(adsId);
            adPlaybackState.getClass();
            AdPlaybackState adPlaybackState2 = AdPlaybackState.NONE;
            if (adPlaybackState.equals(adPlaybackState2) || adPlaybackState.endsWithLivePostrollPlaceHolder()) {
                if (adPlaybackState.equals(adPlaybackState2)) {
                    adPlaybackState = new AdPlaybackState(adsId, new long[0]);
                    if (isLiveMediaItem(adsMediaSource.getMediaItem(), timeline)) {
                        adPlaybackState = adPlaybackState.withLivePostrollPlaceholderAppended(false);
                    }
                }
                AdPlaybackState adPlaybackState3 = adPlaybackState;
                Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
                Object obj = window.manifest;
                if (obj instanceof HlsManifest) {
                    HlsMediaPlaylist hlsMediaPlaylist = ((HlsManifest) obj).mediaPlaylist;
                    int unresolvedAssetListCount = this.contentMediaSourceAdDataHolder.getUnresolvedAssetListCount(adsId);
                    if (window.isLive()) {
                        hlsInterstitialsAdsLoader = this;
                        adPlaybackStateMapInterstitialsForVod = hlsInterstitialsAdsLoader.mapInterstitialsForLive(window.mediaItem, hlsMediaPlaylist, adPlaybackState3, window.positionInFirstPeriodUs, window.defaultPositionUs);
                    } else {
                        hlsInterstitialsAdsLoader = this;
                        adPlaybackStateMapInterstitialsForVod = hlsInterstitialsAdsLoader.mapInterstitialsForVod(window.mediaItem, hlsMediaPlaylist, adPlaybackState3, window.durationUs, window.positionInFirstPeriodUs, window.defaultPositionUs);
                    }
                    AdPlaybackState adPlaybackState4 = adPlaybackStateMapInterstitialsForVod;
                    ExoPlayer exoPlayer = hlsInterstitialsAdsLoader.player;
                    if (unresolvedAssetListCount == hlsInterstitialsAdsLoader.contentMediaSourceAdDataHolder.getUnresolvedAssetListCount(adsId) || exoPlayer == null || !Objects.equals(window.mediaItem, exoPlayer.getCurrentMediaItem())) {
                        timeline2 = timeline;
                    } else {
                        int currentPeriodIndex = exoPlayer.getCurrentPeriodIndex();
                        long jMsToUs = Util.msToUs(exoPlayer.getContentPosition());
                        Timeline.Period period = exoPlayer.getCurrentTimeline().getPeriod(currentPeriodIndex, new Timeline.Period());
                        long j = -period.positionInWindowUs;
                        if (period.isPlaceholder) {
                            long j9 = window.durationUs;
                            if (jMsToUs >= j9) {
                                jMsToUs = j9 - 1;
                            }
                            if (window.isLive()) {
                                jMsToUs = window.defaultPositionUs;
                            }
                            int adGroupIndexForPositionUs = adPlaybackState4.getAdGroupIndexForPositionUs(jMsToUs, window.isLive() ? C.TIME_UNSET : window.durationUs);
                            if (adGroupIndexForPositionUs != -1) {
                                jMsToUs = adPlaybackState4.getAdGroup(adGroupIndexForPositionUs).timeUs;
                            }
                            j = window.positionInFirstPeriodUs;
                        }
                        timeline2 = timeline;
                        maybeExecuteOrSetNextAssetListResolutionMessage(adsId, timeline2, 0, j, jMsToUs);
                        hlsInterstitialsAdsLoader = this;
                    }
                    adPlaybackState3 = adPlaybackState4;
                } else {
                    hlsInterstitialsAdsLoader = this;
                    timeline2 = timeline;
                }
                boolean zPutAndNotifyAdPlaybackStateUpdate = putAndNotifyAdPlaybackStateUpdate(adsId, adPlaybackState3);
                if (!hlsInterstitialsAdsLoader.contentMediaSourceAdDataHolder.isUnsupportedContentMediaSource(adsId)) {
                    notifyListeners(new d(adsMediaSource, adsId, timeline2, 1));
                }
                return zPutAndNotifyAdPlaybackStateUpdate;
            }
        }
        return false;
    }

    @Override
    public void handlePrepareComplete(AdsMediaSource adsMediaSource, int i3, int i9) {
        Object adsId = adsMediaSource.getAdsId();
        if (this.isReleased || this.contentMediaSourceAdDataHolder.isUnsupportedContentMediaSource(adsId)) {
            return;
        }
        notifyListeners(new g(i3, i9, 1, adsMediaSource, adsId));
    }

    @Override
    public void handlePrepareError(AdsMediaSource adsMediaSource, int i3, int i9, IOException iOException) {
        Object adsId = adsMediaSource.getAdsId();
        AdPlaybackState adPlaybackState = this.contentMediaSourceAdDataHolder.getAdPlaybackState(adsId);
        adPlaybackState.getClass();
        putAndNotifyAdPlaybackStateUpdate(adsId, adPlaybackState.withAdLoadError(i3, i9));
        if (this.isReleased || this.contentMediaSourceAdDataHolder.isUnsupportedContentMediaSource(adsId)) {
            return;
        }
        notifyListeners(new h(adsMediaSource, adsId, i3, i9, iOException, 1));
    }

    public boolean isReleased() {
        return this.isReleased;
    }

    @Override
    public void release() {
        if (this.contentMediaSourceAdDataHolder.isIdle()) {
            this.player = null;
        }
        clearAllAdResumptionStates();
        cancelPendingAssetListResolutionMessage();
        Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.isReleased = true;
    }

    public boolean removeAdResumptionState(Object obj) {
        return this.resumptionStates.remove(obj) != null;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void setPlayer(Player player) {
        boolean z6 = true;
        AbstractC1864o0.Y(!this.isReleased);
        AbstractC1864o0.L(player == null || (player instanceof ExoPlayer));
        if (Objects.equals(this.player, player)) {
            return;
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null && !this.contentMediaSourceAdDataHolder.isIdle()) {
            exoPlayer.removeListener(this.playerListener);
        }
        if (player != null && !this.contentMediaSourceAdDataHolder.isIdle()) {
            z6 = false;
        }
        AbstractC1864o0.Y(z6);
        this.player = (ExoPlayer) player;
    }

    @Override
    public void setSupportedContentTypes(int... iArr) {
        for (int i3 : iArr) {
            if (i3 == 2) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public void setWithAvailableAdGroup(int i3) {
        MediaItem mediaItem;
        AbstractC1864o0.Y(this.player != null);
        AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState == null) {
            return;
        }
        AbstractC1864o0.L(i3 < adPlaybackState.adGroupCount);
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
        int i9 = 0;
        while (true) {
            int[] iArr = adGroup.states;
            if (i9 >= iArr.length) {
                Object obj = adPlaybackState.adsId;
                obj.getClass();
                putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState);
                removeUnresolvedAssetListOfAdGroup(adPlaybackState, adGroup);
                return;
            }
            int i10 = iArr[i9];
            if ((i10 == 3 || i10 == 2) && (mediaItem = adGroup.mediaItems[i9]) != null) {
                AbstractC1864o0.Y(mediaItem != null);
                adPlaybackState = adPlaybackState.withAvailableAdMediaItem(i3, i9, mediaItem);
            }
            i9++;
        }
    }

    public void setWithAvailableAdMediaItem(int i3, int i9, MediaItem mediaItem) {
        AbstractC1864o0.Y(this.player != null);
        if (mediaItem != null) {
            AbstractC1864o0.L(isHlsMediaItem(mediaItem));
        }
        AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState != null) {
            AbstractC1864o0.L(i3 < adPlaybackState.adGroupCount);
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
            AbstractC1864o0.L(i9 < adGroup.count);
            if (mediaItem == null) {
                mediaItem = adGroup.mediaItems[i9];
                AbstractC1864o0.Y(mediaItem != null);
            }
            if (adGroup.states[i9] != 1) {
                AdPlaybackState adPlaybackStateWithAvailableAdMediaItem = adPlaybackState.withAvailableAdMediaItem(i3, i9, mediaItem);
                Object obj = adPlaybackStateWithAvailableAdMediaItem.adsId;
                obj.getClass();
                putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackStateWithAvailableAdMediaItem);
                removeUnresolvedAssetListOfAdGroup(adPlaybackStateWithAvailableAdMediaItem, adGroup);
            }
        }
    }

    public void setWithSkippedAd(int i3, int i9) {
        AbstractC1864o0.Y(this.player != null);
        AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState != null) {
            AbstractC1864o0.L(i3 < adPlaybackState.adGroupCount);
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
            AbstractC1864o0.L(i9 < adGroup.count);
            int i10 = adGroup.states[i9];
            if (i10 == 3 || i10 == 4) {
                Log.w(TAG, "ignoring request to set ad for state AD_STATE_SKIPPED for played or failed ad at adGroupIndex=" + i3 + ", adIndexInAgGroup=" + i9);
                return;
            }
            if (i10 != 2) {
                AdPlaybackState adPlaybackStateWithSkippedAd = adPlaybackState.withSkippedAd(i3, i9);
                Object obj = adPlaybackStateWithSkippedAd.adsId;
                obj.getClass();
                putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackStateWithSkippedAd);
                removeUnresolvedAssetListOfAdGroup(adPlaybackStateWithSkippedAd, adGroup);
            }
        }
    }

    public void setWithSkippedAdGroup(int i3) {
        AbstractC1864o0.Y(this.player != null);
        AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState != null) {
            AbstractC1864o0.L(i3 < adPlaybackState.adGroupCount);
            AdPlaybackState adPlaybackStateWithSkippedAdGroup = adPlaybackState.withSkippedAdGroup(i3);
            AdPlaybackState.AdGroup adGroup = adPlaybackStateWithSkippedAdGroup.getAdGroup(i3);
            Object obj = adPlaybackStateWithSkippedAdGroup.adsId;
            obj.getClass();
            putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackStateWithSkippedAdGroup);
            removeUnresolvedAssetListOfAdGroup(adPlaybackStateWithSkippedAdGroup, adGroup);
        }
    }

    public void skipCurrentAd() {
        this.player.getClass();
        if (this.player.isPlayingAd()) {
            setWithSkippedAd(this.player.getCurrentAdGroupIndex(), this.player.getCurrentAdIndexInAdGroup());
        }
    }

    public void skipCurrentAdGroup() {
        this.player.getClass();
        if (this.player.isPlayingAd()) {
            setWithSkippedAdGroup(this.player.getCurrentAdGroupIndex());
        }
    }

    @Override
    public void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, AdsLoader.EventListener eventListener) {
        if (this.isReleased) {
            eventListener.onAdPlaybackState(new AdPlaybackState(obj, new long[0]));
            return;
        }
        if (this.contentMediaSourceAdDataHolder.isStartedContentMediaSource(obj)) {
            throw new IllegalStateException("media item with adsId='" + obj + "' already started. Make sure adsIds are unique within the same playlist.");
        }
        if (this.contentMediaSourceAdDataHolder.isIdle()) {
            ExoPlayer exoPlayer = this.player;
            AbstractC1864o0.U(exoPlayer, "setPlayer(Player) needs to be called");
            exoPlayer.addListener(this.playerListener);
        }
        this.contentMediaSourceAdDataHolder.startContentSource(obj, eventListener);
        MediaItem mediaItem = adsMediaSource.getMediaItem();
        if (!isHlsMediaItem(mediaItem)) {
            Log.w(TAG, "Unsupported media item. Playing without ads for adsId=" + obj);
            putAndNotifyAdPlaybackStateUpdate(obj, new AdPlaybackState(obj, new long[0]));
            this.contentMediaSourceAdDataHolder.addUnsupportedContentMediaSource(obj);
            return;
        }
        if ((obj instanceof String) && this.resumptionStates.containsKey(obj)) {
            AdPlaybackState adPlaybackStateRemove = this.resumptionStates.remove(obj);
            adPlaybackStateRemove.getClass();
            putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackStateRemove);
        } else {
            this.contentMediaSourceAdDataHolder.putAdPlaybackState(obj, AdPlaybackState.NONE);
        }
        notifyListeners(new d(mediaItem, obj, adViewProvider, 2));
    }

    @Override
    public void stop(AdsMediaSource adsMediaSource, AdsLoader.EventListener eventListener) {
        Object adsId = adsMediaSource.getAdsId();
        AbstractC1864o0.Y(this.contentMediaSourceAdDataHolder.isStartedContentMediaSource(adsId) || this.isReleased);
        boolean zIsUnsupportedContentMediaSource = this.contentMediaSourceAdDataHolder.isUnsupportedContentMediaSource(adsId);
        AdPlaybackState adPlaybackStateStopContentSource = this.contentMediaSourceAdDataHolder.stopContentSource(adsId);
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null && this.contentMediaSourceAdDataHolder.isIdle()) {
            exoPlayer.removeListener(this.playerListener);
            if (this.isReleased) {
                this.player = null;
            }
        }
        if (!this.isReleased && !zIsUnsupportedContentMediaSource) {
            if (adPlaybackStateStopContentSource != null && (adsId instanceof String) && this.resumptionStates.containsKey(adsId)) {
                this.resumptionStates.put(adsId, adPlaybackStateStopContentSource);
            }
            notifyListeners(new f(adsMediaSource, adPlaybackStateStopContentSource, 1));
        }
        if (this.pendingAssetListResolutionMessage == null || !adsMediaSource.getMediaItem().equals(((PlayerMessage) Util.castNonNull(this.pendingAssetListResolutionMessage)).getPayload())) {
            return;
        }
        cancelPendingAssetListResolutionMessage();
    }

    public HlsInterstitialsAdsLoader(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.playerListener = new PlayerListener();
        this.contentMediaSourceAdDataHolder = new ContentMediaSourceAdDataHolder();
        this.resumptionStates = new HashMap();
        this.listeners = new ArrayList();
    }

    public void addAdResumptionState(Object obj, AdPlaybackState adPlaybackState) {
        AbstractC1864o0.L(!adPlaybackState.endsWithLivePostrollPlaceHolder());
        if (!this.contentMediaSourceAdDataHolder.isStartedContentMediaSource(obj)) {
            this.resumptionStates.put(obj, adPlaybackState.copy().withAdsId(obj));
            return;
        }
        Log.w(TAG, "Attempting to add an ad resumption state for an adsId that is currently active. adsId=" + obj);
    }
}
