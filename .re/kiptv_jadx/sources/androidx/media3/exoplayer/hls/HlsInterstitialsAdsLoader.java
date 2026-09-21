package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class HlsInterstitialsAdsLoader implements androidx.media3.exoplayer.source.ads.AdsLoader {
    private static final java.lang.String TAG = "HlsInterstitiaAdsLoader";
    private static final int TARGET_DURATION_MULTIPLIER = 3;
    private final androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.ContentMediaSourceAdDataHolder contentMediaSourceAdDataHolder;
    private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private boolean isReleased;
    private final java.util.List<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener> listeners;
    private androidx.media3.exoplayer.upstream.Loader loader;
    private androidx.media3.exoplayer.PlayerMessage pendingAssetListResolutionMessage;
    private androidx.media3.exoplayer.ExoPlayer player;
    private final androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener playerListener;
    private final java.util.Map<java.lang.Object, androidx.media3.common.AdPlaybackState> resumptionStates;

    public static final class AdsMediaSourceFactory implements androidx.media3.exoplayer.source.MediaSource.Factory {
        private final androidx.media3.common.AdViewProvider adViewProvider;
        private final androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader adsLoader;
        private final androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory;

        public AdsMediaSourceFactory(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, androidx.media3.common.AdViewProvider adViewProvider, android.content.Context context) {
            this(hlsInterstitialsAdsLoader, context, null, adViewProvider);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem) {
            mediaItem.localConfiguration.getClass();
            androidx.media3.exoplayer.source.MediaSource mediaSourceCreateMediaSource = this.mediaSourceFactory.createMediaSource(mediaItem);
            androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
            if (adsConfiguration == null) {
                return mediaSourceCreateMediaSource;
            }
            if (!(adsConfiguration.adsId instanceof java.lang.String)) {
                throw new java.lang.IllegalArgumentException("Please use an AdsConfiguration with an adsId of type String when using HlsInterstitialsAdsLoader");
            }
            androidx.media3.datasource.DataSpec dataSpec = new androidx.media3.datasource.DataSpec(mediaItem.localConfiguration.adsConfiguration.adTagUri);
            java.lang.Object obj = mediaItem.localConfiguration.adsConfiguration.adsId;
            obj.getClass();
            return new androidx.media3.exoplayer.source.ads.AdsMediaSource(mediaSourceCreateMediaSource, dataSpec, obj, this.mediaSourceFactory, this.adsLoader, this.adViewProvider, false, true);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        public AdsMediaSourceFactory(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, androidx.media3.common.AdViewProvider adViewProvider, androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            this(hlsInterstitialsAdsLoader, null, factory, adViewProvider);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AdsMediaSourceFactory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AdsMediaSourceFactory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        private AdsMediaSourceFactory(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, android.content.Context context, androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.common.AdViewProvider adViewProvider) {
            boolean z6 = true;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L((context == null && factory == null) ? false : true);
            this.adsLoader = hlsInterstitialsAdsLoader;
            if (factory == null) {
                context.getClass();
                factory = new androidx.media3.exoplayer.hls.HlsMediaSource.Factory(new androidx.media3.datasource.DefaultDataSource.Factory(context));
            }
            this.mediaSourceFactory = factory;
            this.adViewProvider = adViewProvider;
            int[] supportedTypes = factory.getSupportedTypes();
            for (int i3 : supportedTypes) {
                if (i3 == 2) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(z6);
                }
            }
            z6 = false;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(z6);
        }
    }

    public static class AdsResumptionState {
        private static final java.lang.String FIELD_ADS_ID = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_AD_PLAYBACK_STATE = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private final androidx.media3.common.AdPlaybackState adPlaybackState;
        public final java.lang.String adsId;

        public AdsResumptionState(java.lang.String str, androidx.media3.common.AdPlaybackState adPlaybackState) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(str.equals(adPlaybackState.adsId));
            this.adsId = str;
            this.adPlaybackState = adPlaybackState;
        }

        public static androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AdsResumptionState fromBundle(android.os.Bundle bundle) {
            java.lang.String string = bundle.getString(FIELD_ADS_ID);
            string.getClass();
            android.os.Bundle bundle2 = bundle.getBundle(FIELD_AD_PLAYBACK_STATE);
            bundle2.getClass();
            return new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AdsResumptionState(string, androidx.media3.common.AdPlaybackState.fromBundle(bundle2, 9).withAdsId(string));
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AdsResumptionState)) {
                return false;
            }
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AdsResumptionState adsResumptionState = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AdsResumptionState) obj;
            return java.util.Objects.equals(this.adsId, adsResumptionState.adsId) && java.util.Objects.equals(this.adPlaybackState, adsResumptionState.adPlaybackState);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.adsId, this.adPlaybackState);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(FIELD_ADS_ID, this.adsId);
            bundle.putBundle(FIELD_AD_PLAYBACK_STATE, this.adPlaybackState.toBundle(9));
            return bundle;
        }
    }

    public static final class Asset {
        public final long durationUs;
        public final android.net.Uri uri;

        public Asset(android.net.Uri uri, long j) {
            this.uri = uri;
            this.durationUs = j;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Asset)) {
                return false;
            }
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Asset asset = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Asset) obj;
            return this.durationUs == asset.durationUs && java.util.Objects.equals(this.uri, asset.uri);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.uri, java.lang.Long.valueOf(this.durationUs));
        }
    }

    public static final class AssetList {
        static final androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList EMPTY;
        public final p076i4.AbstractC2186b0 assets;
        public final androidx.media3.common.AdPlaybackState.SkipInfo skipInfo;

        static {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            EMPTY = new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList(p076i4.S0.f22832l, null);
        }

        public AssetList(p076i4.AbstractC2186b0 abstractC2186b0, androidx.media3.common.AdPlaybackState.SkipInfo skipInfo) {
            this.assets = abstractC2186b0;
            this.skipInfo = skipInfo;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList)) {
                return false;
            }
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList assetList = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList) obj;
            return java.util.Objects.equals(this.assets, assetList.assets) && java.util.Objects.equals(this.skipInfo, assetList.skipInfo);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.assets, this.skipInfo);
        }
    }

    public static class AssetListData {
        private final int adGroupIndex;
        private final int adIndexInAdGroup;
        private final java.lang.Object adsId;
        private final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial;
        private final androidx.media3.common.MediaItem mediaItem;
        private final long targetDurationUs;

        public AssetListData(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial, int i3, int i9, long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(interstitial.assetListUri != null);
            this.mediaItem = mediaItem;
            this.adsId = obj;
            this.adGroupIndex = i3;
            this.adIndexInAdGroup = i9;
            this.targetDurationUs = j;
            this.interstitial = interstitial;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData)) {
                return false;
            }
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData assetListData = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData) obj;
            return this.adGroupIndex == assetListData.adGroupIndex && this.adIndexInAdGroup == assetListData.adIndexInAdGroup && this.targetDurationUs == assetListData.targetDurationUs && java.util.Objects.equals(this.mediaItem, assetListData.mediaItem) && java.util.Objects.equals(this.adsId, assetListData.adsId) && java.util.Objects.equals(this.interstitial, assetListData.interstitial);
        }

        public int hashCode() {
            return (int) ((((long) (((((this.interstitial.hashCode() + ((this.adsId.hashCode() + (this.mediaItem.hashCode() * 31)) * 31)) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup)) * 31) + this.targetDurationUs);
        }
    }

    public static final class ContentMediaSourceAdDataHolder {
        private final java.util.Map<java.lang.Object, androidx.media3.exoplayer.source.ads.AdsLoader.EventListener> activeEventListeners = new java.util.HashMap();
        private final java.util.Map<java.lang.Object, androidx.media3.common.AdPlaybackState> activeAdPlaybackStates = new java.util.HashMap();
        private final java.util.Map<java.lang.Object, java.util.Set<java.lang.String>> insertedInterstitialIds = new java.util.HashMap();
        private final java.util.Map<java.lang.Object, java.util.TreeMap<java.lang.Long, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData>> unresolvedAssetLists = new java.util.HashMap();
        private final java.util.Map<java.lang.Object, java.util.List<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PendingSnapInResolution>> pendingSnapInResolutions = new java.util.HashMap();
        private final java.util.Set<java.lang.Object> contentSourceAwaitingFirstAdToStart = new java.util.HashSet();
        private final java.util.Set<java.lang.Object> unsupportedAdsIds = new java.util.HashSet();

        public void addInsertedInterstitialId(java.lang.Object obj, java.lang.String str) {
            java.util.Set<java.lang.String> set = this.insertedInterstitialIds.get(obj);
            if (set != null) {
                set.add(str);
            }
        }

        public void addUnsupportedContentMediaSource(java.lang.Object obj) {
            this.unsupportedAdsIds.add(obj);
        }

        public boolean awaitingFirstAdToStartFor(java.lang.Object obj) {
            return this.contentSourceAwaitingFirstAdToStart.contains(obj);
        }

        public androidx.media3.common.AdPlaybackState getAdPlaybackState(java.lang.Object obj) {
            return this.activeAdPlaybackStates.get(obj);
        }

        public java.util.Collection<androidx.media3.common.AdPlaybackState> getAdPlaybackStates() {
            return this.activeAdPlaybackStates.values();
        }

        public androidx.media3.exoplayer.source.ads.AdsLoader.EventListener getEventListener(java.lang.Object obj) {
            return this.activeEventListeners.get(obj);
        }

        public java.util.List<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PendingSnapInResolution> getPendingSnapInResolutions(java.lang.Object obj) {
            java.util.List<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PendingSnapInResolution> list = this.pendingSnapInResolutions.get(obj);
            return list == null ? java.util.Collections.EMPTY_LIST : list;
        }

        public int getUnresolvedAssetListCount(java.lang.Object obj) {
            java.util.TreeMap<java.lang.Long, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData> treeMap = this.unresolvedAssetLists.get(obj);
            if (treeMap != null) {
                return treeMap.size();
            }
            return 0;
        }

        public java.util.Map<java.lang.Long, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData> getUnresolvedAssetLists(java.lang.Object obj) {
            return this.unresolvedAssetLists.get(obj);
        }

        public boolean isIdle() {
            return this.activeEventListeners.isEmpty();
        }

        public boolean isInsertedInterstitialId(java.lang.Object obj, java.lang.String str) {
            java.util.Set<java.lang.String> set = this.insertedInterstitialIds.get(obj);
            return set != null && set.contains(str);
        }

        public boolean isManagedContentSource(java.lang.Object obj) {
            return this.activeAdPlaybackStates.containsKey(obj);
        }

        public boolean isStartedContentMediaSource(java.lang.Object obj) {
            return this.activeEventListeners.containsKey(obj);
        }

        public boolean isUnsupportedContentMediaSource(java.lang.Object obj) {
            return this.unsupportedAdsIds.contains(obj);
        }

        public void notifyAdStarted(java.lang.Object obj) {
            this.contentSourceAwaitingFirstAdToStart.remove(obj);
        }

        public androidx.media3.common.AdPlaybackState putAdPlaybackState(java.lang.Object obj, androidx.media3.common.AdPlaybackState adPlaybackState) {
            return this.activeAdPlaybackStates.put(obj, adPlaybackState);
        }

        public void putPendingSnapInResolution(java.lang.Object obj, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PendingSnapInResolution pendingSnapInResolution) {
            java.util.List<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PendingSnapInResolution> arrayList = this.pendingSnapInResolutions.get(obj);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
                this.pendingSnapInResolutions.put(obj, arrayList);
            }
            arrayList.add(pendingSnapInResolution);
        }

        public void removePendingSnapInResolutionUntilIndexInclusive(java.lang.Object obj, int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            java.util.List<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PendingSnapInResolution> pendingSnapInResolutions = getPendingSnapInResolutions(obj);
            pendingSnapInResolutions.getClass();
            pendingSnapInResolutions.subList(0, java.lang.Math.min(i3, pendingSnapInResolutions.size() - 1) + 1).clear();
        }

        public androidx.media3.exoplayer.source.ads.AdsLoader.EventListener startContentSource(java.lang.Object obj, androidx.media3.exoplayer.source.ads.AdsLoader.EventListener eventListener) {
            this.insertedInterstitialIds.put(obj, new java.util.HashSet());
            this.unresolvedAssetLists.put(obj, new java.util.TreeMap<>());
            this.contentSourceAwaitingFirstAdToStart.add(obj);
            return this.activeEventListeners.put(obj, eventListener);
        }

        public androidx.media3.common.AdPlaybackState stopContentSource(java.lang.Object obj) {
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
        default void onAdCompleted(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, int i3, int i9) {
        }

        default void onAdSkipped(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, int i3, int i9) {
        }

        default void onAdStarted(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, int i3, int i9) {
        }

        default void onAssetListLoadCompleted(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, int i3, int i9, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList assetList, org.json.JSONObject jSONObject) {
        }

        default void onAssetListLoadFailed(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, int i3, int i9, java.io.IOException iOException, boolean z6) {
        }

        default void onAssetListLoadStarted(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, int i3, int i9) {
        }

        default void onContentTimelineChanged(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, androidx.media3.common.Timeline timeline) {
        }

        default void onMetadata(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, int i3, int i9, androidx.media3.common.Metadata metadata) {
        }

        default void onPrepareCompleted(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, int i3, int i9) {
        }

        default void onPrepareError(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, int i3, int i9, java.io.IOException iOException) {
        }

        default void onStart(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, androidx.media3.common.AdViewProvider adViewProvider) {
        }

        default void onStop(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, androidx.media3.common.AdPlaybackState adPlaybackState) {
        }
    }

    public class LoaderCallback implements androidx.media3.exoplayer.upstream.Loader.Callback<androidx.media3.exoplayer.upstream.ParsingLoadable<android.util.Pair<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList, org.json.JSONObject>>> {
        private final androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData assetListData;
        private final androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();

        public LoaderCallback(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData assetListData) {
            this.assetListData = assetListData;
        }

        private void handleAssetResolutionFailed(final java.io.IOException iOException, final boolean z6) {
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.notifyAssetResolutionFailed(this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup);
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.notifyListeners(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.hls.c
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f16653h.lambda$handleAssetResolutionFailed$2(iOException, z6, (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj);
                }
            });
            maybeContinueAssetResolution();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleAssetResolutionFailed$2(java.io.IOException iOException, boolean z6, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
            listener.onAssetListLoadFailed(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, iOException, z6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCompleted$0(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
            listener.onAssetListLoadFailed(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, null, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCompleted$1(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList assetList, android.util.Pair pair, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
            listener.onAssetListLoadCompleted(this.assetListData.mediaItem, this.assetListData.adsId, this.assetListData.adGroupIndex, this.assetListData.adIndexInAdGroup, assetList, (org.json.JSONObject) pair.second);
        }

        private void maybeContinueAssetResolution() {
            androidx.media3.exoplayer.ExoPlayer exoPlayer = androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.player;
            if (exoPlayer == null || exoPlayer.getPlaybackState() == 1 || !this.assetListData.mediaItem.equals(exoPlayer.getCurrentMediaItem())) {
                return;
            }
            long jMsToUs = androidx.media3.common.util.Util.msToUs(exoPlayer.getContentPosition());
            androidx.media3.common.Timeline currentTimeline = exoPlayer.getCurrentTimeline();
            int currentMediaItemIndex = exoPlayer.getCurrentMediaItemIndex();
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.maybeExecuteOrSetNextAssetListResolutionMessage(this.assetListData.adsId, currentTimeline, currentMediaItemIndex, currentTimeline.getWindow(currentMediaItemIndex, this.window).positionInFirstPeriodUs, jMsToUs);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(androidx.media3.exoplayer.upstream.ParsingLoadable<android.util.Pair<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList, org.json.JSONObject>> parsingLoadable, long j, long j9, boolean z6) {
            handleAssetResolutionFailed(null, true);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(androidx.media3.exoplayer.upstream.ParsingLoadable<android.util.Pair<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList, org.json.JSONObject>> parsingLoadable, long j, long j9) {
            android.util.Pair<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList, org.json.JSONObject> result = parsingLoadable.getResult();
            result.getClass();
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList assetList = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList) result.first;
            androidx.media3.common.AdPlaybackState adPlaybackState = androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.getAdPlaybackState(this.assetListData.adsId);
            if ((adPlaybackState != null ? adPlaybackState.getAdGroup(this.assetListData.adGroupIndex).states[this.assetListData.adIndexInAdGroup] : 4) != 0) {
                maybeContinueAssetResolution();
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.notifyListeners(new androidx.media3.exoplayer.hls.b(2, this));
                return;
            }
            if (assetList == null || assetList.assets.isEmpty()) {
                handleAssetResolutionFailed(new java.io.IOException("empty asset list"), false);
                return;
            }
            adPlaybackState.getClass();
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(this.assetListData.adGroupIndex);
            int i3 = adGroup.count;
            if (assetList.assets.size() > 1) {
                adPlaybackState = adPlaybackState.withAdCount(this.assetListData.adGroupIndex, (assetList.assets.size() + i3) - 1);
                adGroup = adPlaybackState.getAdGroup(this.assetListData.adGroupIndex);
            }
            int i9 = this.assetListData.adIndexInAdGroup;
            long[] jArr = (long[]) adGroup.durationsUs.clone();
            long j10 = 0;
            for (int i10 = 0; i10 < assetList.assets.size(); i10++) {
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Asset asset = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Asset) assetList.assets.get(i10);
                if (i10 > 0) {
                    i9 = (i3 + i10) - 1;
                }
                long j11 = asset.durationUs;
                jArr[i9] = j11;
                j10 += j11;
                adPlaybackState = adPlaybackState.withAvailableAdMediaItem(this.assetListData.adGroupIndex, i9, new androidx.media3.common.MediaItem.Builder().setUri(asset.uri).setMimeType(androidx.media3.common.MimeTypes.APPLICATION_M3U8).build());
                if (assetList.skipInfo != null) {
                    adPlaybackState = adPlaybackState.withAdSkipInfo(this.assetListData.adGroupIndex, i9, assetList.skipInfo);
                }
            }
            androidx.media3.common.AdPlaybackState adPlaybackStateWithAdDurationsUs = adPlaybackState.withAdDurationsUs(this.assetListData.adGroupIndex, jArr);
            if (this.assetListData.interstitial.resumeOffsetUs == androidx.media3.common.C.TIME_UNSET) {
                adPlaybackStateWithAdDurationsUs = adPlaybackStateWithAdDurationsUs.withContentResumeOffsetUs(this.assetListData.adGroupIndex, (adPlaybackStateWithAdDurationsUs.getAdGroup(this.assetListData.adGroupIndex).contentResumeOffsetUs - androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.resolveInterstitialDurationUs(this.assetListData.interstitial, 0L)) + j10);
            }
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.putAndNotifyAdPlaybackStateUpdate(this.assetListData.adsId, adPlaybackStateWithAdDurationsUs);
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.notifyListeners(new androidx.media3.exoplayer.hls.d(this, assetList, result, 0));
            maybeContinueAssetResolution();
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public androidx.media3.exoplayer.upstream.Loader.LoadErrorAction onLoadError(androidx.media3.exoplayer.upstream.ParsingLoadable<android.util.Pair<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList, org.json.JSONObject>> parsingLoadable, long j, long j9, java.io.IOException iOException, int i3) {
            handleAssetResolutionFailed(iOException, false);
            return androidx.media3.exoplayer.upstream.Loader.DONT_RETRY;
        }
    }

    public static class PendingSnapInResolution {
        private final int adGroupIndex;
        private final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial;
        private final long resumeTimeUs;

        public PendingSnapInResolution(long j, int i3, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial) {
            this.resumeTimeUs = j;
            this.adGroupIndex = i3;
            this.interstitial = interstitial;
        }
    }

    public class PlayerListener implements androidx.media3.common.Player.Listener {
        private final androidx.media3.common.Timeline.Period period;

        private PlayerListener() {
            this.period = new androidx.media3.common.Timeline.Period();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$onPlaybackStateChanged$4(androidx.media3.common.Player player, java.lang.Object obj, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
            androidx.media3.common.MediaItem currentMediaItem = player.getCurrentMediaItem();
            currentMediaItem.getClass();
            listener.onAdStarted(currentMediaItem, obj, player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$onPositionDiscontinuity$1(androidx.media3.common.Player.PositionInfo positionInfo, java.lang.Object obj, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
            androidx.media3.common.MediaItem mediaItem = positionInfo.mediaItem;
            mediaItem.getClass();
            listener.onAdStarted(mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$onPositionDiscontinuity$2(androidx.media3.common.Player.PositionInfo positionInfo, java.lang.Object obj, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
            androidx.media3.common.MediaItem mediaItem = positionInfo.mediaItem;
            mediaItem.getClass();
            listener.onAdStarted(mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lambda$onPositionDiscontinuity$3(androidx.media3.common.Player.PositionInfo positionInfo, java.lang.Object obj, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
            androidx.media3.common.MediaItem mediaItem = positionInfo.mediaItem;
            mediaItem.getClass();
            listener.onAdSkipped(mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        }

        private void markAdAsPlayedAndNotifyListeners(androidx.media3.common.MediaItem mediaItem, java.lang.Object obj, int i3, int i9) {
            androidx.media3.common.AdPlaybackState adPlaybackState = androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.getAdPlaybackState(obj);
            if (adPlaybackState == null || adPlaybackState.getAdGroup(i3).states[i9] != 1) {
                return;
            }
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState.withPlayedAd(i3, i9));
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.notifyListeners(new androidx.media3.exoplayer.hls.g(i3, i9, 0, mediaItem, obj));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMetadata(androidx.media3.common.Metadata metadata) {
            androidx.media3.exoplayer.ExoPlayer exoPlayer = androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.player;
            if (exoPlayer == null || !exoPlayer.isPlayingAd()) {
                return;
            }
            exoPlayer.getCurrentTimeline().getPeriod(exoPlayer.getCurrentPeriodIndex(), this.period);
            java.lang.Object obj = this.period.adPlaybackState.adsId;
            if (obj == null || !androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.isManagedContentSource(obj)) {
                return;
            }
            androidx.media3.common.MediaItem currentMediaItem = exoPlayer.getCurrentMediaItem();
            currentMediaItem.getClass();
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.notifyListeners(new androidx.media3.exoplayer.hls.h(currentMediaItem, obj, exoPlayer.getCurrentAdGroupIndex(), exoPlayer.getCurrentAdIndexInAdGroup(), metadata, 0));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i3) {
            androidx.media3.exoplayer.ExoPlayer exoPlayer = androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.player;
            if (i3 == 3 && exoPlayer != null && exoPlayer.isPlayingAd()) {
                exoPlayer.getCurrentTimeline().getPeriod(exoPlayer.getCurrentPeriodIndex(), this.period);
                java.lang.Object obj = this.period.adPlaybackState.adsId;
                if (obj == null || !androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.awaitingFirstAdToStartFor(obj)) {
                    return;
                }
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.notifyAdStarted(obj);
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.notifyListeners(new androidx.media3.exoplayer.hls.f(exoPlayer, obj, 0));
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(final androidx.media3.common.Player.PositionInfo positionInfo, final androidx.media3.common.Player.PositionInfo positionInfo2, int i3) {
            if (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.player == null || positionInfo.mediaItem == null || positionInfo2.mediaItem == null || i3 == 4 || i3 == 6 || i3 == 5) {
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
                return;
            }
            androidx.media3.common.Timeline currentTimeline = androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.player.getCurrentTimeline();
            currentTimeline.getPeriod(positionInfo2.periodIndex, this.period);
            final java.lang.Object obj = this.period.adPlaybackState.adsId;
            if (obj == null || !androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.isManagedContentSource(obj)) {
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
                return;
            }
            if (i3 == 0) {
                int i9 = positionInfo.adGroupIndex;
                if (i9 != -1) {
                    markAdAsPlayedAndNotifyListeners(positionInfo.mediaItem, obj, i9, positionInfo.adIndexInAdGroup);
                }
                if (positionInfo2.adIndexInAdGroup != -1) {
                    androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.contentMediaSourceAdDataHolder.notifyAdStarted(obj);
                    final int i10 = 0;
                    androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.notifyListeners(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.hls.e
                        @Override // androidx.media3.common.util.Consumer
                        public final void accept(java.lang.Object obj2) {
                            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj2;
                            switch (i10) {
                                case 0:
                                    androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$1(positionInfo2, obj, listener);
                                    break;
                                case 1:
                                    androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$2(positionInfo2, obj, listener);
                                    break;
                                default:
                                    androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$3(positionInfo2, obj, listener);
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
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.notifyListeners(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.hls.e
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(java.lang.Object obj2) {
                        androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj2;
                        switch (i11) {
                            case 0:
                                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$1(positionInfo, obj, listener);
                                break;
                            case 1:
                                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$2(positionInfo, obj, listener);
                                break;
                            default:
                                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$3(positionInfo, obj, listener);
                                break;
                        }
                    }
                });
                return;
            }
            long jMsToUs = androidx.media3.common.util.Util.msToUs(positionInfo2.contentPositionMs);
            long unresolvedAssetListWindowPositionForContentPositionUs = androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.getUnresolvedAssetListWindowPositionForContentPositionUs(jMsToUs, currentTimeline, positionInfo2.periodIndex);
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.maybeExecuteOrSetNextAssetListResolutionMessage(obj, currentTimeline, positionInfo2.mediaItemIndex, -this.period.positionInWindowUs, unresolvedAssetListWindowPositionForContentPositionUs != androidx.media3.common.C.TIME_UNSET ? unresolvedAssetListWindowPositionForContentPositionUs : jMsToUs);
            if (positionInfo.adIndexInAdGroup != -1 || positionInfo2.adIndexInAdGroup == -1) {
                return;
            }
            final int i12 = 1;
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.notifyListeners(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.hls.e
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj2) {
                    androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj2;
                    switch (i12) {
                        case 0:
                            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$1(positionInfo2, obj, listener);
                            break;
                        case 1:
                            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$2(positionInfo2, obj, listener);
                            break;
                        default:
                            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener.lambda$onPositionDiscontinuity$3(positionInfo2, obj, listener);
                            break;
                    }
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTimelineChanged(androidx.media3.common.Timeline timeline, int i3) {
            if (timeline.isEmpty()) {
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.this.cancelPendingAssetListResolutionMessage();
            }
        }
    }

    public static class RunnableAtPosition implements java.lang.Runnable {
        public final long adStartTimeUs;
        private final java.lang.Runnable runnable;
        private final long targetDurationUs;

        public RunnableAtPosition(long j, long j9, java.lang.Runnable runnable) {
            this.adStartTimeUs = j;
            this.targetDurationUs = j9;
            this.runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.runnable.run();
        }
    }

    public HlsInterstitialsAdsLoader(android.content.Context context) {
        this(new androidx.media3.datasource.DefaultDataSource.Factory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelPendingAssetListResolutionMessage() {
        androidx.media3.exoplayer.PlayerMessage playerMessage = this.pendingAssetListResolutionMessage;
        if (playerMessage != null) {
            playerMessage.cancel();
            this.pendingAssetListResolutionMessage = null;
        }
    }

    private android.util.LongSparseArray<java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial>> filterAndSortWithResolvedStartPositions(p076i4.AbstractC2186b0 abstractC2186b0, java.lang.Object obj, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, long j, boolean z6) {
        android.util.LongSparseArray<java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial>> longSparseArray = new android.util.LongSparseArray<>();
        for (int i3 = 0; i3 < abstractC2186b0.size(); i3++) {
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial) abstractC2186b0.get(i3);
            if (!this.contentMediaSourceAdDataHolder.isInsertedInterstitialId(obj, interstitial.id) && (!z6 || !interstitial.cue.contains(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST))) {
                long jResolveInterstitialStartTimeUs = resolveInterstitialStartTimeUs(interstitial, hlsMediaPlaylist, j);
                java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial> arrayList = longSparseArray.indexOfKey(jResolveInterstitialStartTimeUs) < 0 ? new java.util.ArrayList<>() : longSparseArray.get(jResolveInterstitialStartTimeUs);
                longSparseArray.put(jResolveInterstitialStartTimeUs, arrayList);
                arrayList.add(interstitial);
            }
        }
        return longSparseArray;
    }

    private androidx.media3.common.AdPlaybackState getAdPlaybackState() {
        java.lang.Object obj;
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return null;
        }
        androidx.media3.common.Timeline currentTimeline = exoPlayer.getCurrentTimeline();
        if (currentTimeline.isEmpty() || (obj = currentTimeline.getPeriod(exoPlayer.getCurrentPeriodIndex(), new androidx.media3.common.Timeline.Period()).adPlaybackState.adsId) == null) {
            return null;
        }
        return this.contentMediaSourceAdDataHolder.getAdPlaybackState(obj);
    }

    public static long getClosestSegmentBoundaryUs(long j, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
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
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i9);
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
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment2 = hlsMediaPlaylist.segments.get(i9);
            long j14 = segment2.relativeStartTimeUs;
            if (j10 - j14 < java.lang.Math.abs(j10 - (j14 + segment2.durationUs))) {
                j9 = hlsMediaPlaylist.startTimeUs;
                j11 = segment2.relativeStartTimeUs;
            } else {
                j9 = hlsMediaPlaylist.startTimeUs + segment2.relativeStartTimeUs;
                j11 = segment2.durationUs;
            }
        }
        return j9 + j11;
    }

    private androidx.media3.exoplayer.upstream.Loader getLoader() {
        if (this.loader == null) {
            this.loader = new androidx.media3.exoplayer.upstream.Loader("HLS-interstitials");
        }
        return this.loader;
    }

    private static int getLowestValidAdGroupInsertionIndex(androidx.media3.common.AdPlaybackState adPlaybackState) {
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

    private androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.RunnableAtPosition getNextAssetResolution(java.lang.Object obj, long j) {
        java.util.Map<java.lang.Long, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData> unresolvedAssetLists = this.contentMediaSourceAdDataHolder.getUnresolvedAssetLists(obj);
        unresolvedAssetLists.getClass();
        final java.util.Map<java.lang.Long, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData> map = unresolvedAssetLists;
        for (final java.lang.Long l2 : map.keySet()) {
            if (j <= l2.longValue()) {
                final androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData assetListData = map.get(l2);
                assetListData.getClass();
                return new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.RunnableAtPosition(l2.longValue(), assetListData.targetDurationUs, new java.lang.Runnable() { // from class: androidx.media3.exoplayer.hls.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16648h.lambda$getNextAssetResolution$7(map, l2, assetListData);
                    }
                });
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getUnresolvedAssetListWindowPositionForContentPositionUs(long j, androidx.media3.common.Timeline timeline, int i3) {
        int adGroupIndexForPositionUs;
        androidx.media3.common.Timeline.Period period = timeline.getPeriod(i3, new androidx.media3.common.Timeline.Period());
        long j9 = j - period.positionInWindowUs;
        androidx.media3.common.AdPlaybackState adPlaybackState = period.adPlaybackState;
        if (adPlaybackState.adsId != null && (adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(j9, androidx.media3.common.C.TIME_UNSET)) != -1) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(adGroupIndexForPositionUs);
            java.util.Map<java.lang.Long, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData> unresolvedAssetLists = this.contentMediaSourceAdDataHolder.getUnresolvedAssetLists(adPlaybackState.adsId);
            if (unresolvedAssetLists != null && unresolvedAssetLists.containsKey(java.lang.Long.valueOf(adGroup.timeUs))) {
                return adGroup.timeUs - timeline.getWindow(period.windowIndex, new androidx.media3.common.Timeline.Window()).positionInFirstPeriodUs;
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private androidx.media3.common.AdPlaybackState insertOrUpdateInterstitialInAdGroup(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial, androidx.media3.common.AdPlaybackState adPlaybackState, int i3, long j) {
        long[] jArr;
        long j9;
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
        if (adGroup.getIndexOfAdId(interstitial.id) != -1) {
            return adPlaybackState;
        }
        int iMax = java.lang.Math.max(adGroup.count, 0);
        long jResolveInterstitialDurationUs = resolveInterstitialDurationUs(interstitial, androidx.media3.common.C.TIME_UNSET);
        if (iMax == 0) {
            jArr = new long[1];
        } else {
            long[] jArr2 = adGroup.durationsUs;
            long[] jArr3 = new long[jArr2.length + 1];
            java.lang.System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
            jArr = jArr3;
        }
        jArr[jArr.length - 1] = interstitial.playoutLimitUs;
        long j10 = interstitial.resumeOffsetUs;
        if (j10 != androidx.media3.common.C.TIME_UNSET) {
            jResolveInterstitialDurationUs = j10;
        } else if (jResolveInterstitialDurationUs == androidx.media3.common.C.TIME_UNSET) {
            jResolveInterstitialDurationUs = 0;
        }
        if (interstitial.snapTypes.contains(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN)) {
            long j11 = interstitial.startDateUnixUs + jResolveInterstitialDurationUs;
            j9 = -9223372036854775807L;
            if (j11 < hlsMediaPlaylist.startTimeUs + hlsMediaPlaylist.durationUs) {
                jResolveInterstitialDurationUs = resolveInterstitialResumeOffsetUs(interstitial, hlsMediaPlaylist);
            } else {
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.ContentMediaSourceAdDataHolder contentMediaSourceAdDataHolder = this.contentMediaSourceAdDataHolder;
                java.lang.Object obj = adPlaybackState.adsId;
                obj.getClass();
                contentMediaSourceAdDataHolder.putPendingSnapInResolution(obj, new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PendingSnapInResolution(j11, i3, interstitial));
            }
        } else {
            j9 = -9223372036854775807L;
        }
        androidx.media3.common.AdPlaybackState adPlaybackStateWithContentResumeOffsetUs = adPlaybackState.withAdCount(i3, iMax + 1).withAdId(i3, iMax, interstitial.id).withAdDurationsUs(i3, jArr).withContentResumeOffsetUs(i3, adGroup.contentResumeOffsetUs + jResolveInterstitialDurationUs);
        if (interstitial.skipControlDurationUs != j9 || interstitial.skipControlOffsetUs != j9 || interstitial.skipControlLabelId != null) {
            adPlaybackStateWithContentResumeOffsetUs = adPlaybackStateWithContentResumeOffsetUs.withAdSkipInfo(i3, iMax, new androidx.media3.common.AdPlaybackState.SkipInfo(interstitial.skipControlOffsetUs, interstitial.skipControlDurationUs, interstitial.skipControlLabelId));
        }
        androidx.media3.common.AdPlaybackState adPlaybackState2 = adPlaybackStateWithContentResumeOffsetUs;
        if (interstitial.assetUri != null) {
            return adPlaybackState2.withAvailableAdMediaItem(i3, iMax, new androidx.media3.common.MediaItem.Builder().setUri(interstitial.assetUri).setMimeType(androidx.media3.common.MimeTypes.APPLICATION_M3U8).build());
        }
        java.lang.Object obj2 = adPlaybackState2.adsId;
        obj2.getClass();
        java.util.Map<java.lang.Long, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData> unresolvedAssetLists = this.contentMediaSourceAdDataHolder.getUnresolvedAssetLists(obj2);
        unresolvedAssetLists.getClass();
        java.util.Map<java.lang.Long, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData> map = unresolvedAssetLists;
        long j12 = adGroup.timeUs;
        if (j12 == Long.MIN_VALUE) {
            j12 = Long.MAX_VALUE;
        }
        map.put(java.lang.Long.valueOf(j12), new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData(mediaItem, obj2, interstitial, i3, iMax, j));
        return adPlaybackState2;
    }

    private static boolean isHlsMediaItem(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        localConfiguration.getClass();
        return java.util.Objects.equals(localConfiguration.mimeType, androidx.media3.common.MimeTypes.APPLICATION_M3U8) || androidx.media3.common.util.Util.inferContentType(localConfiguration.uri) == 2;
    }

    private static boolean isLiveMediaItem(androidx.media3.common.MediaItem mediaItem, androidx.media3.common.Timeline timeline) {
        int firstWindowIndex = timeline.getFirstWindowIndex(false);
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        while (firstWindowIndex != -1) {
            timeline.getWindow(firstWindowIndex, window);
            if (window.mediaItem.equals(mediaItem)) {
                return window.isLive();
            }
            firstWindowIndex = timeline.getNextWindowIndex(firstWindowIndex, 0, false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getNextAssetResolution$7(java.util.Map map, java.lang.Long l2, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData assetListData) {
        if (map.remove(l2) != null) {
            startLoadingAssetList(assetListData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleContentTimelineChanged$1(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, java.lang.Object obj, androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
        listener.onContentTimelineChanged(adsMediaSource.getMediaItem(), obj, timeline);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handlePrepareComplete$2(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, java.lang.Object obj, int i3, int i9, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
        listener.onPrepareCompleted(adsMediaSource.getMediaItem(), obj, i3, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handlePrepareError$3(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, java.lang.Object obj, int i3, int i9, java.io.IOException iOException, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
        listener.onPrepareError(adsMediaSource.getMediaItem(), obj, i3, i9, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startLoadingAssetList$5(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData assetListData, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
        listener.onAssetListLoadStarted(assetListData.mediaItem, assetListData.adsId, assetListData.adGroupIndex, assetListData.adIndexInAdGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$stop$4(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, androidx.media3.common.AdPlaybackState adPlaybackState, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
        androidx.media3.common.MediaItem mediaItem = adsMediaSource.getMediaItem();
        java.lang.Object adsId = adsMediaSource.getAdsId();
        adPlaybackState.getClass();
        listener.onStop(mediaItem, adsId, adPlaybackState);
    }

    private androidx.media3.common.AdPlaybackState mapInterstitialsForLive(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.common.AdPlaybackState adPlaybackState, long j, long j9) {
        int i3;
        boolean z6;
        androidx.media3.common.AdPlaybackState adPlaybackStateInsertOrUpdateInterstitialInAdGroup = adPlaybackState;
        java.lang.Object obj = adPlaybackStateInsertOrUpdateInterstitialInAdGroup.adsId;
        obj.getClass();
        android.util.LongSparseArray<java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial>> longSparseArrayFilterAndSortWithResolvedStartPositions = filterAndSortWithResolvedStartPositions(hlsMediaPlaylist.interstitials, obj, hlsMediaPlaylist, j9, true);
        int i9 = 0;
        while (i9 < longSparseArrayFilterAndSortWithResolvedStartPositions.size()) {
            long jKeyAt = longSparseArrayFilterAndSortWithResolvedStartPositions.keyAt(i9);
            java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial> list = longSparseArrayFilterAndSortWithResolvedStartPositions.get(jKeyAt);
            int i10 = 0;
            while (i10 < list.size()) {
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial = list.get(i10);
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
                                androidx.media3.common.util.Log.w(TAG, "Skipping insertion of interstitial attempted to be inserted behind an already initialized ad group.");
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

    private androidx.media3.common.AdPlaybackState mapInterstitialsForVod(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.common.AdPlaybackState adPlaybackState, long j, long j9, long j10) {
        androidx.media3.common.AdPlaybackState adPlaybackStateWithNewAdGroup = adPlaybackState;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(adPlaybackStateWithNewAdGroup.adGroupCount == adPlaybackStateWithNewAdGroup.removedAdGroupCount);
        p076i4.AbstractC2186b0 abstractC2186b0 = hlsMediaPlaylist.interstitials;
        java.lang.Object obj = adPlaybackStateWithNewAdGroup.adsId;
        obj.getClass();
        android.util.LongSparseArray<java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial>> longSparseArrayFilterAndSortWithResolvedStartPositions = filterAndSortWithResolvedStartPositions(abstractC2186b0, obj, hlsMediaPlaylist, j9, false);
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        long j11 = hlsMediaPlaylist2.startTimeUs + j9;
        long j12 = j11 + j;
        int i3 = 0;
        while (i3 < longSparseArrayFilterAndSortWithResolvedStartPositions.size()) {
            java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial> list = longSparseArrayFilterAndSortWithResolvedStartPositions.get(longSparseArrayFilterAndSortWithResolvedStartPositions.keyAt(i3));
            int i9 = 0;
            while (i9 < list.size()) {
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial = list.get(i9);
                long jResolveInterstitialStartTimeUs = resolveInterstitialStartTimeUs(interstitial, hlsMediaPlaylist2, j10);
                if (jResolveInterstitialStartTimeUs < j11 && interstitial.cue.contains(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
                    jResolveInterstitialStartTimeUs = j11;
                } else if (jResolveInterstitialStartTimeUs <= j12 || !interstitial.cue.contains(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
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
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.ContentMediaSourceAdDataHolder contentMediaSourceAdDataHolder = this.contentMediaSourceAdDataHolder;
                java.lang.Object obj2 = adPlaybackStateWithNewAdGroup.adsId;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeExecuteOrSetNextAssetListResolutionMessage(java.lang.Object obj, androidx.media3.common.Timeline timeline, int i3, long j, long j9) {
        androidx.media3.exoplayer.upstream.Loader loader = this.loader;
        if (loader == null || !loader.isLoading()) {
            cancelPendingAssetListResolutionMessage();
            androidx.media3.common.Timeline.Window window = timeline.getWindow(i3, new androidx.media3.common.Timeline.Window());
            long j10 = j9 + j;
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.RunnableAtPosition nextAssetResolution = getNextAssetResolution(obj, j10);
            if (nextAssetResolution == null) {
                return;
            }
            long j11 = nextAssetResolution.adStartTimeUs;
            if (j11 == Long.MAX_VALUE) {
                j11 = window.durationUs;
            }
            long jMax = java.lang.Math.max(j10, j11 - (nextAssetResolution.targetDurationUs * 3));
            if (jMax - j10 < 200000) {
                nextAssetResolution.run();
                return;
            }
            long jMax2 = jMax - j;
            androidx.media3.common.AdPlaybackState adPlaybackState = this.contentMediaSourceAdDataHolder.getAdPlaybackState(obj);
            adPlaybackState.getClass();
            int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(jMax, timeline.getPeriod(0, new androidx.media3.common.Timeline.Period()).durationUs);
            if (adGroupIndexForPositionUs != -1) {
                androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(adGroupIndexForPositionUs);
                jMax2 = java.lang.Math.max(jMax2, (adGroup.timeUs + adGroup.contentResumeOffsetUs) - j);
            }
            androidx.media3.exoplayer.ExoPlayer exoPlayer = this.player;
            exoPlayer.getClass();
            androidx.media3.exoplayer.PlayerMessage payload = exoPlayer.createMessage(new androidx.media3.exoplayer.hls.b(1, nextAssetResolution)).setPayload(window.mediaItem);
            android.os.Looper looperMyLooper = android.os.Looper.myLooper();
            looperMyLooper.getClass();
            androidx.media3.exoplayer.PlayerMessage position = payload.setLooper(looperMyLooper).setPosition(java.lang.Math.max(androidx.media3.common.util.Util.usToMs(jMax2), 0L));
            this.pendingAssetListResolutionMessage = position;
            position.send();
        }
    }

    private androidx.media3.common.AdPlaybackState maybeResolvePendingSnapInResolutions(androidx.media3.common.AdPlaybackState adPlaybackState, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        androidx.media3.common.AdPlaybackState adPlaybackStateWithContentResumeOffsetUs = adPlaybackState;
        java.lang.Object obj = adPlaybackStateWithContentResumeOffsetUs.adsId;
        obj.getClass();
        long j = hlsMediaPlaylist.startTimeUs + hlsMediaPlaylist.durationUs;
        java.util.List<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PendingSnapInResolution> pendingSnapInResolutions = this.contentMediaSourceAdDataHolder.getPendingSnapInResolutions(obj);
        int i3 = 0;
        int i9 = -1;
        while (i3 < pendingSnapInResolutions.size()) {
            androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PendingSnapInResolution pendingSnapInResolution = pendingSnapInResolutions.get(i3);
            if (pendingSnapInResolution.resumeTimeUs > j) {
                break;
            }
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial = pendingSnapInResolution.interstitial;
            long jResolveInterstitialResumeOffsetUs = resolveInterstitialResumeOffsetUs(interstitial, hlsMediaPlaylist);
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackStateWithContentResumeOffsetUs.getAdGroup(pendingSnapInResolution.adGroupIndex);
            int i10 = i3;
            long jResolveInterstitialDurationUs = resolveInterstitialDurationUs(interstitial, androidx.media3.common.C.TIME_UNSET);
            long j9 = interstitial.resumeOffsetUs;
            if (j9 != androidx.media3.common.C.TIME_UNSET) {
                jResolveInterstitialDurationUs = j9;
            } else if (jResolveInterstitialDurationUs == androidx.media3.common.C.TIME_UNSET) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAssetResolutionFailed(java.lang.Object obj, int i3, int i9) {
        androidx.media3.common.AdPlaybackState adPlaybackState = this.contentMediaSourceAdDataHolder.getAdPlaybackState(obj);
        if (adPlaybackState == null) {
            return;
        }
        putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState.withAdLoadError(i3, i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListeners(androidx.media3.common.util.Consumer<androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener> consumer) {
        for (int i3 = 0; i3 < this.listeners.size(); i3++) {
            consumer.accept(this.listeners.get(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean putAndNotifyAdPlaybackStateUpdate(java.lang.Object obj, androidx.media3.common.AdPlaybackState adPlaybackState) {
        if (adPlaybackState.equals(this.contentMediaSourceAdDataHolder.putAdPlaybackState(obj, adPlaybackState))) {
            return false;
        }
        androidx.media3.exoplayer.source.ads.AdsLoader.EventListener eventListener = this.contentMediaSourceAdDataHolder.getEventListener(obj);
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
            return true;
        }
        this.contentMediaSourceAdDataHolder.stopContentSource(obj);
        return false;
    }

    private void removeUnresolvedAssetListOfAdGroup(androidx.media3.common.AdPlaybackState adPlaybackState, androidx.media3.common.AdPlaybackState.AdGroup adGroup) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(adPlaybackState.adsId != null);
        java.util.Map<java.lang.Long, androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData> unresolvedAssetLists = this.contentMediaSourceAdDataHolder.getUnresolvedAssetLists(adPlaybackState.adsId);
        if (unresolvedAssetLists != null) {
            long j = adGroup.timeUs;
            if (j == Long.MIN_VALUE) {
                j = Long.MAX_VALUE;
            }
            unresolvedAssetLists.remove(java.lang.Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long resolveInterstitialDurationUs(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial, long j) {
        long j9 = interstitial.playoutLimitUs;
        if (j9 != androidx.media3.common.C.TIME_UNSET) {
            return j9;
        }
        long j10 = interstitial.durationUs;
        if (j10 != androidx.media3.common.C.TIME_UNSET) {
            return j10;
        }
        long j11 = interstitial.endDateUnixUs;
        if (j11 != androidx.media3.common.C.TIME_UNSET) {
            return j11 - interstitial.startDateUnixUs;
        }
        long j12 = interstitial.plannedDurationUs;
        return j12 != androidx.media3.common.C.TIME_UNSET ? j12 : j;
    }

    private static long resolveInterstitialResumeOffsetUs(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        if (!interstitial.snapTypes.contains(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.SNAP_TYPE_IN)) {
            long j = interstitial.resumeOffsetUs;
            return j != androidx.media3.common.C.TIME_UNSET ? j : resolveInterstitialDurationUs(interstitial, androidx.media3.common.C.TIME_UNSET);
        }
        long jResolveInterstitialDurationUs = interstitial.resumeOffsetUs;
        if (jResolveInterstitialDurationUs == androidx.media3.common.C.TIME_UNSET) {
            jResolveInterstitialDurationUs = resolveInterstitialDurationUs(interstitial, 0L);
        }
        long closestSegmentBoundaryUs = interstitial.snapTypes.contains(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT) ? getClosestSegmentBoundaryUs(interstitial.startDateUnixUs, hlsMediaPlaylist) : interstitial.startDateUnixUs;
        return getClosestSegmentBoundaryUs(jResolveInterstitialDurationUs + closestSegmentBoundaryUs, hlsMediaPlaylist) - closestSegmentBoundaryUs;
    }

    private static long resolveInterstitialStartTimeUs(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial interstitial, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, long j) {
        if (interstitial.cue.contains(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE)) {
            return hlsMediaPlaylist.startTimeUs + j;
        }
        if (interstitial.cue.contains(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) {
            return hlsMediaPlaylist.startTimeUs + hlsMediaPlaylist.durationUs;
        }
        return interstitial.snapTypes.contains(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.SNAP_TYPE_OUT) ? getClosestSegmentBoundaryUs(interstitial.startDateUnixUs, hlsMediaPlaylist) : interstitial.startDateUnixUs;
    }

    private void startLoadingAssetList(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData assetListData) {
        cancelPendingAssetListResolutionMessage();
        androidx.media3.exoplayer.upstream.Loader loader = getLoader();
        androidx.media3.datasource.DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
        android.net.Uri uri = assetListData.interstitial.assetListUri;
        uri.getClass();
        loader.startLoading(new androidx.media3.exoplayer.upstream.ParsingLoadable(dataSourceCreateDataSource, uri, 6, new androidx.media3.exoplayer.hls.AssetListParser()), new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.LoaderCallback(assetListData), 1);
        notifyListeners(new androidx.media3.exoplayer.hls.b(0, assetListData));
    }

    public void addAdResumptionState(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AdsResumptionState adsResumptionState) {
        addAdResumptionState(adsResumptionState.adsId, adsResumptionState.adPlaybackState);
    }

    public void addListener(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
        this.listeners.add(listener);
    }

    public void clearAllAdResumptionStates() {
        this.resumptionStates.clear();
    }

    public p076i4.AbstractC2186b0 getAdsResumptionStates() {
        p076i4.AbstractC2230y.d(4, "initialCapacity");
        java.lang.Object[] objArrCopyOf = new java.lang.Object[4];
        int i3 = 0;
        for (androidx.media3.common.AdPlaybackState adPlaybackState : this.contentMediaSourceAdDataHolder.getAdPlaybackStates()) {
            boolean zEndsWithLivePostrollPlaceHolder = adPlaybackState.endsWithLivePostrollPlaceHolder();
            if (zEndsWithLivePostrollPlaceHolder || !(adPlaybackState.adsId instanceof java.lang.String)) {
                androidx.media3.common.util.Log.i(TAG, zEndsWithLivePostrollPlaceHolder ? "getAdsResumptionStates(): ignoring active ad playback state of live stream. adsId=" + adPlaybackState.adsId : "getAdsResumptionStates(): ignoring active ad playback state when creating resumption states. `adsId` is not of type String: " + androidx.media3.common.util.Util.castNonNull(adPlaybackState.adsId).getClass());
            } else {
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AdsResumptionState adsResumptionState = new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AdsResumptionState((java.lang.String) adPlaybackState.adsId, adPlaybackState.copy());
                int i9 = i3 + 1;
                int iB = p076i4.V.b(objArrCopyOf.length, i9);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i3] = adsResumptionState;
                i3 = i9;
            }
        }
        return p076i4.AbstractC2186b0.r(objArrCopyOf, i3);
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public boolean handleContentTimelineChanged(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, androidx.media3.common.Timeline timeline) {
        androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader;
        androidx.media3.common.Timeline timeline2;
        androidx.media3.common.AdPlaybackState adPlaybackStateMapInterstitialsForVod;
        java.lang.Object adsId = adsMediaSource.getAdsId();
        if (this.isReleased) {
            androidx.media3.exoplayer.source.ads.AdsLoader.EventListener eventListener = this.contentMediaSourceAdDataHolder.getEventListener(adsId);
            if (eventListener != null) {
                androidx.media3.common.AdPlaybackState adPlaybackStateStopContentSource = this.contentMediaSourceAdDataHolder.stopContentSource(adsId);
                adPlaybackStateStopContentSource.getClass();
                if (adPlaybackStateStopContentSource.equals(androidx.media3.common.AdPlaybackState.NONE)) {
                    eventListener.onAdPlaybackState(new androidx.media3.common.AdPlaybackState(adsId, new long[0]));
                    return false;
                }
            }
        } else {
            androidx.media3.common.AdPlaybackState adPlaybackState = this.contentMediaSourceAdDataHolder.getAdPlaybackState(adsId);
            adPlaybackState.getClass();
            androidx.media3.common.AdPlaybackState adPlaybackState2 = androidx.media3.common.AdPlaybackState.NONE;
            if (adPlaybackState.equals(adPlaybackState2) || adPlaybackState.endsWithLivePostrollPlaceHolder()) {
                if (adPlaybackState.equals(adPlaybackState2)) {
                    adPlaybackState = new androidx.media3.common.AdPlaybackState(adsId, new long[0]);
                    if (isLiveMediaItem(adsMediaSource.getMediaItem(), timeline)) {
                        adPlaybackState = adPlaybackState.withLivePostrollPlaceholderAppended(false);
                    }
                }
                androidx.media3.common.AdPlaybackState adPlaybackState3 = adPlaybackState;
                androidx.media3.common.Timeline.Window window = timeline.getWindow(0, new androidx.media3.common.Timeline.Window());
                java.lang.Object obj = window.manifest;
                if (obj instanceof androidx.media3.exoplayer.hls.HlsManifest) {
                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist = ((androidx.media3.exoplayer.hls.HlsManifest) obj).mediaPlaylist;
                    int unresolvedAssetListCount = this.contentMediaSourceAdDataHolder.getUnresolvedAssetListCount(adsId);
                    if (window.isLive()) {
                        hlsInterstitialsAdsLoader = this;
                        adPlaybackStateMapInterstitialsForVod = hlsInterstitialsAdsLoader.mapInterstitialsForLive(window.mediaItem, hlsMediaPlaylist, adPlaybackState3, window.positionInFirstPeriodUs, window.defaultPositionUs);
                    } else {
                        hlsInterstitialsAdsLoader = this;
                        adPlaybackStateMapInterstitialsForVod = hlsInterstitialsAdsLoader.mapInterstitialsForVod(window.mediaItem, hlsMediaPlaylist, adPlaybackState3, window.durationUs, window.positionInFirstPeriodUs, window.defaultPositionUs);
                    }
                    androidx.media3.common.AdPlaybackState adPlaybackState4 = adPlaybackStateMapInterstitialsForVod;
                    androidx.media3.exoplayer.ExoPlayer exoPlayer = hlsInterstitialsAdsLoader.player;
                    if (unresolvedAssetListCount == hlsInterstitialsAdsLoader.contentMediaSourceAdDataHolder.getUnresolvedAssetListCount(adsId) || exoPlayer == null || !java.util.Objects.equals(window.mediaItem, exoPlayer.getCurrentMediaItem())) {
                        timeline2 = timeline;
                    } else {
                        int currentPeriodIndex = exoPlayer.getCurrentPeriodIndex();
                        long jMsToUs = androidx.media3.common.util.Util.msToUs(exoPlayer.getContentPosition());
                        androidx.media3.common.Timeline.Period period = exoPlayer.getCurrentTimeline().getPeriod(currentPeriodIndex, new androidx.media3.common.Timeline.Period());
                        long j = -period.positionInWindowUs;
                        if (period.isPlaceholder) {
                            long j9 = window.durationUs;
                            if (jMsToUs >= j9) {
                                jMsToUs = j9 - 1;
                            }
                            if (window.isLive()) {
                                jMsToUs = window.defaultPositionUs;
                            }
                            int adGroupIndexForPositionUs = adPlaybackState4.getAdGroupIndexForPositionUs(jMsToUs, window.isLive() ? androidx.media3.common.C.TIME_UNSET : window.durationUs);
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
                    notifyListeners(new androidx.media3.exoplayer.hls.d(adsMediaSource, adsId, timeline2, 1));
                }
                return zPutAndNotifyAdPlaybackStateUpdate;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareComplete(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, int i3, int i9) {
        java.lang.Object adsId = adsMediaSource.getAdsId();
        if (this.isReleased || this.contentMediaSourceAdDataHolder.isUnsupportedContentMediaSource(adsId)) {
            return;
        }
        notifyListeners(new androidx.media3.exoplayer.hls.g(i3, i9, 1, adsMediaSource, adsId));
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareError(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, int i3, int i9, java.io.IOException iOException) {
        java.lang.Object adsId = adsMediaSource.getAdsId();
        androidx.media3.common.AdPlaybackState adPlaybackState = this.contentMediaSourceAdDataHolder.getAdPlaybackState(adsId);
        adPlaybackState.getClass();
        putAndNotifyAdPlaybackStateUpdate(adsId, adPlaybackState.withAdLoadError(i3, i9));
        if (this.isReleased || this.contentMediaSourceAdDataHolder.isUnsupportedContentMediaSource(adsId)) {
            return;
        }
        notifyListeners(new androidx.media3.exoplayer.hls.h(adsMediaSource, adsId, i3, i9, iOException, 1));
    }

    public boolean isReleased() {
        return this.isReleased;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void release() {
        if (this.contentMediaSourceAdDataHolder.isIdle()) {
            this.player = null;
        }
        clearAllAdResumptionStates();
        cancelPendingAssetListResolutionMessage();
        androidx.media3.exoplayer.upstream.Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.isReleased = true;
    }

    public boolean removeAdResumptionState(java.lang.Object obj) {
        return this.resumptionStates.remove(obj) != null;
    }

    public void removeListener(androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setPlayer(androidx.media3.common.Player player) {
        boolean z6 = true;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.isReleased);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(player == null || (player instanceof androidx.media3.exoplayer.ExoPlayer));
        if (java.util.Objects.equals(this.player, player)) {
            return;
        }
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null && !this.contentMediaSourceAdDataHolder.isIdle()) {
            exoPlayer.removeListener(this.playerListener);
        }
        if (player != null && !this.contentMediaSourceAdDataHolder.isIdle()) {
            z6 = false;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(z6);
        this.player = (androidx.media3.exoplayer.ExoPlayer) player;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setSupportedContentTypes(int... iArr) {
        for (int i3 : iArr) {
            if (i3 == 2) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException();
    }

    public void setWithAvailableAdGroup(int i3) {
        androidx.media3.common.MediaItem mediaItem;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.player != null);
        androidx.media3.common.AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState == null) {
            return;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 < adPlaybackState.adGroupCount);
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
        int i9 = 0;
        while (true) {
            int[] iArr = adGroup.states;
            if (i9 >= iArr.length) {
                java.lang.Object obj = adPlaybackState.adsId;
                obj.getClass();
                putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState);
                removeUnresolvedAssetListOfAdGroup(adPlaybackState, adGroup);
                return;
            }
            int i10 = iArr[i9];
            if ((i10 == 3 || i10 == 2) && (mediaItem = adGroup.mediaItems[i9]) != null) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(mediaItem != null);
                adPlaybackState = adPlaybackState.withAvailableAdMediaItem(i3, i9, mediaItem);
            }
            i9++;
        }
    }

    public void setWithAvailableAdMediaItem(int i3, int i9, androidx.media3.common.MediaItem mediaItem) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.player != null);
        if (mediaItem != null) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(isHlsMediaItem(mediaItem));
        }
        androidx.media3.common.AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState != null) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 < adPlaybackState.adGroupCount);
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i9 < adGroup.count);
            if (mediaItem == null) {
                mediaItem = adGroup.mediaItems[i9];
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(mediaItem != null);
            }
            if (adGroup.states[i9] != 1) {
                androidx.media3.common.AdPlaybackState adPlaybackStateWithAvailableAdMediaItem = adPlaybackState.withAvailableAdMediaItem(i3, i9, mediaItem);
                java.lang.Object obj = adPlaybackStateWithAvailableAdMediaItem.adsId;
                obj.getClass();
                putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackStateWithAvailableAdMediaItem);
                removeUnresolvedAssetListOfAdGroup(adPlaybackStateWithAvailableAdMediaItem, adGroup);
            }
        }
    }

    public void setWithSkippedAd(int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.player != null);
        androidx.media3.common.AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState != null) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 < adPlaybackState.adGroupCount);
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i9 < adGroup.count);
            int i10 = adGroup.states[i9];
            if (i10 == 3 || i10 == 4) {
                androidx.media3.common.util.Log.w(TAG, "ignoring request to set ad for state AD_STATE_SKIPPED for played or failed ad at adGroupIndex=" + i3 + ", adIndexInAgGroup=" + i9);
                return;
            }
            if (i10 != 2) {
                androidx.media3.common.AdPlaybackState adPlaybackStateWithSkippedAd = adPlaybackState.withSkippedAd(i3, i9);
                java.lang.Object obj = adPlaybackStateWithSkippedAd.adsId;
                obj.getClass();
                putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackStateWithSkippedAd);
                removeUnresolvedAssetListOfAdGroup(adPlaybackStateWithSkippedAd, adGroup);
            }
        }
    }

    public void setWithSkippedAdGroup(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.player != null);
        androidx.media3.common.AdPlaybackState adPlaybackState = getAdPlaybackState();
        if (adPlaybackState != null) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 < adPlaybackState.adGroupCount);
            androidx.media3.common.AdPlaybackState adPlaybackStateWithSkippedAdGroup = adPlaybackState.withSkippedAdGroup(i3);
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackStateWithSkippedAdGroup.getAdGroup(i3);
            java.lang.Object obj = adPlaybackStateWithSkippedAdGroup.adsId;
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

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void start(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, androidx.media3.datasource.DataSpec dataSpec, java.lang.Object obj, androidx.media3.common.AdViewProvider adViewProvider, androidx.media3.exoplayer.source.ads.AdsLoader.EventListener eventListener) {
        if (this.isReleased) {
            eventListener.onAdPlaybackState(new androidx.media3.common.AdPlaybackState(obj, new long[0]));
            return;
        }
        if (this.contentMediaSourceAdDataHolder.isStartedContentMediaSource(obj)) {
            throw new java.lang.IllegalStateException("media item with adsId='" + obj + "' already started. Make sure adsIds are unique within the same playlist.");
        }
        if (this.contentMediaSourceAdDataHolder.isIdle()) {
            androidx.media3.exoplayer.ExoPlayer exoPlayer = this.player;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.U(exoPlayer, "setPlayer(Player) needs to be called");
            exoPlayer.addListener(this.playerListener);
        }
        this.contentMediaSourceAdDataHolder.startContentSource(obj, eventListener);
        androidx.media3.common.MediaItem mediaItem = adsMediaSource.getMediaItem();
        if (!isHlsMediaItem(mediaItem)) {
            androidx.media3.common.util.Log.w(TAG, "Unsupported media item. Playing without ads for adsId=" + obj);
            putAndNotifyAdPlaybackStateUpdate(obj, new androidx.media3.common.AdPlaybackState(obj, new long[0]));
            this.contentMediaSourceAdDataHolder.addUnsupportedContentMediaSource(obj);
            return;
        }
        if ((obj instanceof java.lang.String) && this.resumptionStates.containsKey(obj)) {
            androidx.media3.common.AdPlaybackState adPlaybackStateRemove = this.resumptionStates.remove(obj);
            adPlaybackStateRemove.getClass();
            putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackStateRemove);
        } else {
            this.contentMediaSourceAdDataHolder.putAdPlaybackState(obj, androidx.media3.common.AdPlaybackState.NONE);
        }
        notifyListeners(new androidx.media3.exoplayer.hls.d(mediaItem, obj, adViewProvider, 2));
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void stop(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, androidx.media3.exoplayer.source.ads.AdsLoader.EventListener eventListener) {
        java.lang.Object adsId = adsMediaSource.getAdsId();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.contentMediaSourceAdDataHolder.isStartedContentMediaSource(adsId) || this.isReleased);
        boolean zIsUnsupportedContentMediaSource = this.contentMediaSourceAdDataHolder.isUnsupportedContentMediaSource(adsId);
        androidx.media3.common.AdPlaybackState adPlaybackStateStopContentSource = this.contentMediaSourceAdDataHolder.stopContentSource(adsId);
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null && this.contentMediaSourceAdDataHolder.isIdle()) {
            exoPlayer.removeListener(this.playerListener);
            if (this.isReleased) {
                this.player = null;
            }
        }
        if (!this.isReleased && !zIsUnsupportedContentMediaSource) {
            if (adPlaybackStateStopContentSource != null && (adsId instanceof java.lang.String) && this.resumptionStates.containsKey(adsId)) {
                this.resumptionStates.put(adsId, adPlaybackStateStopContentSource);
            }
            notifyListeners(new androidx.media3.exoplayer.hls.f(adsMediaSource, adPlaybackStateStopContentSource, 1));
        }
        if (this.pendingAssetListResolutionMessage == null || !adsMediaSource.getMediaItem().equals(((androidx.media3.exoplayer.PlayerMessage) androidx.media3.common.util.Util.castNonNull(this.pendingAssetListResolutionMessage)).getPayload())) {
            return;
        }
        cancelPendingAssetListResolutionMessage();
    }

    public HlsInterstitialsAdsLoader(androidx.media3.datasource.DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.playerListener = new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener();
        this.contentMediaSourceAdDataHolder = new androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.ContentMediaSourceAdDataHolder();
        this.resumptionStates = new java.util.HashMap();
        this.listeners = new java.util.ArrayList();
    }

    public void addAdResumptionState(java.lang.Object obj, androidx.media3.common.AdPlaybackState adPlaybackState) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!adPlaybackState.endsWithLivePostrollPlaceHolder());
        if (!this.contentMediaSourceAdDataHolder.isStartedContentMediaSource(obj)) {
            this.resumptionStates.put(obj, adPlaybackState.copy().withAdsId(obj));
            return;
        }
        androidx.media3.common.util.Log.w(TAG, "Attempting to add an ad resumption state for an adsId that is currently active. adsId=" + obj);
    }
}
