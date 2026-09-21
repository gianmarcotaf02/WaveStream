package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultPreloadManager extends androidx.media3.exoplayer.source.preload.BasePreloadManager<java.lang.Integer, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus> {
    private final androidx.media3.exoplayer.source.preload.PreCacheHelper.Factory preCacheHelperFactory;
    private final android.os.HandlerThread preCacheThread;
    private final androidx.media3.common.util.HandlerWrapper preloadHandler;
    private final androidx.media3.exoplayer.PlaybackLooperProvider preloadLooperProvider;
    private final androidx.media3.exoplayer.source.preload.PreloadMediaSource.Factory preloadMediaSourceFactory;
    private boolean releaseCalled;
    private final androidx.media3.exoplayer.RendererCapabilitiesList rendererCapabilitiesList;
    private final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector;

    public static final class Builder extends androidx.media3.exoplayer.source.preload.BasePreloadManager.BuilderBase<java.lang.Integer, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus> {
        private p068h4.v bandwidthMeterSupplier;
        private boolean buildCalled;
        private boolean buildExoPlayerCalled;
        private androidx.media3.datasource.cache.Cache cache;
        private java.util.concurrent.Executor cachingExecutor;
        private androidx.media3.common.util.Clock clock;
        private final android.content.Context context;
        private androidx.media3.datasource.DataSource.Factory dataSourceFactory;
        private p068h4.v loadControlSupplier;
        private androidx.media3.exoplayer.PlaybackLooperProvider preloadLooperProvider;
        private p068h4.v renderersFactorySupplier;
        private androidx.media3.exoplayer.trackselection.TrackSelector.Factory trackSelectorFactory;

        public Builder(android.content.Context context, androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl<java.lang.Integer, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus> targetPreloadStatusControl) {
            super(new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.SimpleRankingDataComparator(), targetPreloadStatusControl, new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.DefaultMediaSourceFactorySupplier(context));
            this.context = context;
            this.preloadLooperProvider = new androidx.media3.exoplayer.PlaybackLooperProvider();
            this.trackSelectorFactory = new androidx.media3.exoplayer.source.preload.f();
            this.bandwidthMeterSupplier = new androidx.media3.exoplayer.source.preload.h(context, 1);
            this.renderersFactorySupplier = com.google.android.gms.internal.play_billing.V0.x(new androidx.media3.exoplayer.source.preload.h(context, 2));
            this.loadControlSupplier = com.google.android.gms.internal.play_billing.V0.x(new androidx.media3.exoplayer.C1558m());
            this.cachingExecutor = new androidx.media3.exoplayer.dash.offline.a();
            this.clock = androidx.media3.common.util.Clock.DEFAULT;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$1(android.content.Context context) {
            return new androidx.media3.exoplayer.DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.upstream.BandwidthMeter lambda$setBandwidthMeter$4(androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.LoadControl lambda$setLoadControl$3(androidx.media3.exoplayer.LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$setRenderersFactory$2(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public androidx.media3.exoplayer.ExoPlayer buildExoPlayer() {
            return buildExoPlayer(new androidx.media3.exoplayer.ExoPlayer.Builder(this.context));
        }

        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setBandwidthMeter(androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.bandwidthMeterSupplier = new androidx.media3.exoplayer.source.preload.g(2, bandwidthMeter);
            return this;
        }

        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setCache(androidx.media3.datasource.cache.Cache cache) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.cache = cache;
            this.mediaSourceFactorySupplier.setCache(cache);
            return this;
        }

        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setCachingExecutor(java.util.concurrent.Executor executor) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.cachingExecutor = executor;
            return this;
        }

        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setClock(androidx.media3.common.util.Clock clock) {
            this.clock = clock;
            return this;
        }

        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.dataSourceFactory = factory;
            this.mediaSourceFactorySupplier.setDataSourceFactory(factory);
            return this;
        }

        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setLoadControl(androidx.media3.exoplayer.LoadControl loadControl) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.loadControlSupplier = new androidx.media3.exoplayer.source.preload.g(0, loadControl);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setMediaSourceFactory(final androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.mediaSourceFactorySupplier = new androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier() { // from class: androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder.1
                @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
                public androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier setCache(androidx.media3.datasource.cache.Cache cache) {
                    return this;
                }

                @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
                public androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier setDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory2) {
                    return this;
                }

                @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier, p068h4.v
                public androidx.media3.exoplayer.source.MediaSource.Factory get() {
                    return factory;
                }
            };
            return this;
        }

        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setMediaSourceFactorySupplier(androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier mediaSourceFactorySupplier) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.mediaSourceFactorySupplier = mediaSourceFactorySupplier.setCache(this.cache).setDataSourceFactory(this.dataSourceFactory);
            return this;
        }

        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setPreloadLooper(android.os.Looper looper) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || this.buildExoPlayerCalled || looper == android.os.Looper.getMainLooper()) ? false : true);
            this.preloadLooperProvider = new androidx.media3.exoplayer.PlaybackLooperProvider(looper);
            return this;
        }

        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setRenderersFactory(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.renderersFactorySupplier = new androidx.media3.exoplayer.source.preload.g(1, renderersFactory);
            return this;
        }

        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder setTrackSelectorFactory(androidx.media3.exoplayer.trackselection.TrackSelector.Factory factory) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || this.buildExoPlayerCalled) ? false : true);
            this.trackSelectorFactory = factory;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.BuilderBase
        public androidx.media3.exoplayer.source.preload.BasePreloadManager<java.lang.Integer, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus> build() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.buildCalled = true;
            return new androidx.media3.exoplayer.source.preload.DefaultPreloadManager(this);
        }

        public androidx.media3.exoplayer.ExoPlayer buildExoPlayer(androidx.media3.exoplayer.ExoPlayer.Builder builder) {
            this.buildExoPlayerCalled = true;
            return builder.setMediaSourceFactory((androidx.media3.exoplayer.source.MediaSource.Factory) this.mediaSourceFactorySupplier.get()).setBandwidthMeter((androidx.media3.exoplayer.upstream.BandwidthMeter) this.bandwidthMeterSupplier.get()).setRenderersFactory((androidx.media3.exoplayer.RenderersFactory) this.renderersFactorySupplier.get()).setLoadControl((androidx.media3.exoplayer.LoadControl) this.loadControlSupplier.get()).setPlaybackLooperProvider(this.preloadLooperProvider).setTrackSelector(this.trackSelectorFactory.createTrackSelector(this.context)).build();
        }
    }

    public static class DefaultMediaSourceFactorySupplier implements androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier {
        private androidx.media3.datasource.cache.Cache cache;
        private final android.content.Context context;
        private androidx.media3.datasource.DataSource.Factory dataSourceFactory;
        private final p068h4.v defaultMediaSourceFactorySupplier;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.source.DefaultMediaSourceFactory lambda$new$0(android.content.Context context) {
            return new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(context);
        }

        private DefaultMediaSourceFactorySupplier(android.content.Context context) {
            this.context = context;
            this.defaultMediaSourceFactorySupplier = com.google.android.gms.internal.play_billing.V0.x(new androidx.media3.exoplayer.source.preload.h(context, 0));
        }

        @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier, p068h4.v
        public androidx.media3.exoplayer.source.MediaSource.Factory get() {
            androidx.media3.exoplayer.source.DefaultMediaSourceFactory defaultMediaSourceFactory = (androidx.media3.exoplayer.source.DefaultMediaSourceFactory) this.defaultMediaSourceFactorySupplier.get();
            androidx.media3.datasource.DataSource.Factory factory = this.dataSourceFactory;
            if (factory == null) {
                factory = new androidx.media3.datasource.DefaultDataSource.Factory(this.context);
            }
            androidx.media3.datasource.cache.Cache cache = this.cache;
            if (cache != null) {
                defaultMediaSourceFactory.setDataSourceFactory(new androidx.media3.datasource.cache.CacheDataSource.Factory().setUpstreamDataSourceFactory(factory).setCache(cache).setCacheWriteDataSinkFactory(null));
                return defaultMediaSourceFactory;
            }
            defaultMediaSourceFactory.setDataSourceFactory(factory);
            return defaultMediaSourceFactory;
        }

        @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.DefaultMediaSourceFactorySupplier setCache(androidx.media3.datasource.cache.Cache cache) {
            this.cache = cache;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.preload.MediaSourceFactorySupplier
        public androidx.media3.exoplayer.source.preload.DefaultPreloadManager.DefaultMediaSourceFactorySupplier setDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }
    }

    public final class PreCacheHelperListener implements androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener {
        private PreCacheHelperListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onDownloadError$2(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onPreCacheProgress$0(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onPrepareError$1(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onDownloadError(androidx.media3.common.MediaItem mediaItem, java.io.IOException iOException) {
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus targetPreloadStatusIfCurrentlyPreloading = androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onError(new androidx.media3.exoplayer.source.preload.PreloadException(mediaItem, null, iOException), mediaItem, new androidx.media3.exoplayer.source.preload.i(targetPreloadStatusIfCurrentlyPreloading, 2));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onPreCacheProgress(androidx.media3.common.MediaItem mediaItem, long j, long j9, float f9) {
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus targetPreloadStatusIfCurrentlyPreloading;
            if (f9 == 100.0f && (targetPreloadStatusIfCurrentlyPreloading = androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem)) != null && targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onCompleted(mediaItem, new androidx.media3.exoplayer.source.preload.i(targetPreloadStatusIfCurrentlyPreloading, 1));
            }
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onPrepareError(androidx.media3.common.MediaItem mediaItem, java.io.IOException iOException) {
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus targetPreloadStatusIfCurrentlyPreloading = androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onError(new androidx.media3.exoplayer.source.preload.PreloadException(mediaItem, null, iOException), mediaItem, new androidx.media3.exoplayer.source.preload.i(targetPreloadStatusIfCurrentlyPreloading, 0));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener
        public void onPrepared(androidx.media3.common.MediaItem mediaItem, androidx.media3.common.MediaItem mediaItem2) {
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus targetPreloadStatusIfCurrentlyPreloading = androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(mediaItem);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreCachingCategory()) {
                return;
            }
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onMediaSourceUpdated(mediaItem, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.preloadMediaSourceFactory.createMediaSource(mediaItem2));
        }
    }

    public final class PreloadMediaSourceControl implements androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl {
        private PreloadMediaSourceControl() {
        }

        private boolean continueOrCompletePreloading(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource, p068h4.l lVar) {
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus targetPreloadStatusIfCurrentlyPreloading = androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return false;
            }
            if (lVar.apply(targetPreloadStatusIfCurrentlyPreloading)) {
                return true;
            }
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onCompleted(preloadMediaSource, new androidx.media3.exoplayer.source.preload.i(targetPreloadStatusIfCurrentlyPreloading, 6));
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$continueOrCompletePreloading$6(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onContinueLoadingRequested$2(long j, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus) {
            if (preloadStatus.stage != 2) {
                return false;
            }
            long j9 = preloadStatus.durationMs;
            return j9 != androidx.media3.common.C.TIME_UNSET && j9 > androidx.media3.common.util.Util.usToMs(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onLoadedToTheEndOfSource$4(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onPreloadError$5(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onSourcePrepared$0(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus) {
            return preloadStatus.stage > 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onTracksSelected$1(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus) {
            return preloadStatus.stage > 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$onUsedByPlayer$3(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus2) {
            return preloadStatus2.equals(preloadStatus);
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onContinueLoadingRequested(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource, final long j) {
            return continueOrCompletePreloading(preloadMediaSource, new p068h4.l() { // from class: androidx.media3.exoplayer.source.preload.k
                @Override // p068h4.l
                public final boolean apply(java.lang.Object obj) {
                    return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceControl.lambda$onContinueLoadingRequested$2(j, (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus) obj);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onLoadedToTheEndOfSource(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus targetPreloadStatusIfCurrentlyPreloading = androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return;
            }
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onCompleted(preloadMediaSource, new androidx.media3.exoplayer.source.preload.i(targetPreloadStatusIfCurrentlyPreloading, 5));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onLoadingUnableToContinue(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
            androidx.media3.exoplayer.source.preload.BasePreloadManager<java.lang.Integer, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus>.MediaSourceHolder mediaSourceHolderToClear = androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.getMediaSourceHolderToClear();
            if (mediaSourceHolderToClear == null) {
                return false;
            }
            ((androidx.media3.exoplayer.source.preload.PreloadMediaSource) mediaSourceHolderToClear.getMediaSource()).clear();
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onSourceCleared();
            return true;
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onPreloadError(androidx.media3.exoplayer.source.preload.PreloadException preloadException, androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus targetPreloadStatusIfCurrentlyPreloading = androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return;
            }
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onError(preloadException, preloadMediaSource, new androidx.media3.exoplayer.source.preload.i(targetPreloadStatusIfCurrentlyPreloading, 4));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onSourcePrepared(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new androidx.media3.exoplayer.source.preload.j(0));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public boolean onTracksSelected(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
            return continueOrCompletePreloading(preloadMediaSource, new androidx.media3.exoplayer.source.preload.j(1));
        }

        @Override // androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadControl
        public void onUsedByPlayer(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource) {
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus targetPreloadStatusIfCurrentlyPreloading = androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.getTargetPreloadStatusIfCurrentlyPreloading(preloadMediaSource);
            if (targetPreloadStatusIfCurrentlyPreloading == null || !targetPreloadStatusIfCurrentlyPreloading.isPreloadingCategory()) {
                return;
            }
            androidx.media3.exoplayer.source.preload.DefaultPreloadManager.this.onSkipped(preloadMediaSource, new androidx.media3.exoplayer.source.preload.i(targetPreloadStatusIfCurrentlyPreloading, 3));
        }
    }

    public final class PreloadMediaSourceHolder extends androidx.media3.exoplayer.source.preload.BasePreloadManager<java.lang.Integer, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus>.MediaSourceHolder {
        public androidx.media3.exoplayer.source.preload.PreCacheHelper preCacheHelper;

        public PreloadMediaSourceHolder(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource, java.lang.Integer num) {
            super(mediaItem, num, preloadMediaSource);
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder
        public synchronized void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
            getMediaSource().releasePreloadMediaSource();
            super.setMediaSource(mediaSource);
        }

        @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager.MediaSourceHolder
        public synchronized androidx.media3.exoplayer.source.preload.PreloadMediaSource getMediaSource() {
            return (androidx.media3.exoplayer.source.preload.PreloadMediaSource) super.getMediaSource();
        }
    }

    public static final class PreloadStatus {
        public static final androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus PRELOAD_STATUS_NOT_PRELOADED = new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus(Integer.MIN_VALUE, androidx.media3.common.C.TIME_UNSET, 0);
        public static final androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus PRELOAD_STATUS_SOURCE_PREPARED = new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus(0, androidx.media3.common.C.TIME_UNSET, 0);
        public static final androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus PRELOAD_STATUS_TRACKS_SELECTED = new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus(1, androidx.media3.common.C.TIME_UNSET, 0);
        public static final int STAGE_NOT_PRELOADED = Integer.MIN_VALUE;
        public static final int STAGE_SOURCE_PREPARED = 0;
        public static final int STAGE_SPECIFIED_RANGE_CACHED = -1;
        public static final int STAGE_SPECIFIED_RANGE_LOADED = 2;
        public static final int STAGE_TRACKS_SELECTED = 1;
        public final long durationMs;
        public final int stage;
        public final long startPositionMs;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Stage {
        }

        private PreloadStatus(int i3, long j, long j9) {
            boolean z6 = true;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j == androidx.media3.common.C.TIME_UNSET || j >= 0);
            if (j9 != androidx.media3.common.C.TIME_UNSET && j9 < 0) {
                z6 = false;
            }
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z6);
            this.stage = i3;
            this.startPositionMs = j;
            this.durationMs = j9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isPreCachingCategory() {
            return this.stage == -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isPreloadingCategory() {
            int i3 = this.stage;
            return i3 == 0 || i3 == 1 || i3 == 2;
        }

        public static androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus specifiedRangeCached(long j) {
            return new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus(-1, androidx.media3.common.C.TIME_UNSET, j);
        }

        public static androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus specifiedRangeLoaded(long j) {
            return new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus(2, androidx.media3.common.C.TIME_UNSET, j);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus.class == obj.getClass()) {
                androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus = (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus) obj;
                if (this.stage == preloadStatus.stage && this.startPositionMs == preloadStatus.startPositionMs && this.durationMs == preloadStatus.durationMs) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.stage) * 31) + ((int) this.startPositionMs)) * 31) + ((int) this.durationMs);
        }

        public static androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus specifiedRangeCached(long j, long j9) {
            return new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus(-1, j, j9);
        }

        public static androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus specifiedRangeLoaded(long j, long j9) {
            return new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus(2, j, j9);
        }
    }

    public static final class SimpleRankingDataComparator implements androidx.media3.exoplayer.source.preload.RankingDataComparator<java.lang.Integer> {
        private int currentPlayingIndex = -1;
        private androidx.media3.exoplayer.source.preload.RankingDataComparator.InvalidationListener invalidationListener;

        public void setCurrentPlayingIndex(int i3) {
            if (i3 != this.currentPlayingIndex) {
                this.currentPlayingIndex = i3;
                androidx.media3.exoplayer.source.preload.RankingDataComparator.InvalidationListener invalidationListener = this.invalidationListener;
                if (invalidationListener != null) {
                    invalidationListener.onRankingDataComparatorInvalidated();
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.preload.RankingDataComparator
        public void setInvalidationListener(androidx.media3.exoplayer.source.preload.RankingDataComparator.InvalidationListener invalidationListener) {
            this.invalidationListener = invalidationListener;
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Integer num, java.lang.Integer num2) {
            return java.lang.Integer.compare(java.lang.Math.abs(num.intValue() - this.currentPlayingIndex), java.lang.Math.abs(num2.intValue() - this.currentPlayingIndex));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$preloadMediaSourceHolderInternal$1(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus) {
        return preloadStatus.stage == Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasePreloadUtils$2() {
        this.rendererCapabilitiesList.release();
        this.trackSelector.release();
        this.preloadLooperProvider.releaseLooper();
    }

    private void maybeClearPreloadMediaSource(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus) {
        int i3 = preloadStatus.stage;
        if (i3 == Integer.MIN_VALUE || i3 == -1 || i3 == 0) {
            preloadMediaSource.clear();
        }
    }

    private void releasePreCacheUtils() {
        android.os.HandlerThread handlerThread = this.preCacheThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    private void releasePreloadUtils() {
        this.preloadHandler.post(new androidx.media3.exoplayer.source.preload.e(0, this));
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void releaseInternal() {
        this.releaseCalled = true;
        releasePreloadUtils();
        releasePreCacheUtils();
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void releaseMediaSourceHolderInternal(androidx.media3.exoplayer.source.preload.BasePreloadManager<java.lang.Integer, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus>.MediaSourceHolder mediaSourceHolder) {
        if (this.releaseCalled) {
            return;
        }
        super.releaseMediaSourceHolderInternal(mediaSourceHolder);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(mediaSourceHolder instanceof androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceHolder);
        androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceHolder preloadMediaSourceHolder = (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceHolder) mediaSourceHolder;
        preloadMediaSourceHolder.getMediaSource().releasePreloadMediaSource();
        androidx.media3.exoplayer.source.preload.PreCacheHelper preCacheHelper = preloadMediaSourceHolder.preCacheHelper;
        if (preCacheHelper != null) {
            preCacheHelper.release(true);
            preloadMediaSourceHolder.preCacheHelper = null;
        }
    }

    public void setCurrentPlayingIndex(int i3) {
        ((androidx.media3.exoplayer.source.preload.DefaultPreloadManager.SimpleRankingDataComparator) this.rankingDataComparator).setCurrentPlayingIndex(i3);
    }

    private DefaultPreloadManager(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder builder) {
        super(new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.SimpleRankingDataComparator(), builder.targetPreloadStatusControl, (androidx.media3.exoplayer.source.MediaSource.Factory) builder.mediaSourceFactorySupplier.get());
        androidx.media3.exoplayer.DefaultRendererCapabilitiesList defaultRendererCapabilitiesListCreateRendererCapabilitiesList = new androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory((androidx.media3.exoplayer.RenderersFactory) builder.renderersFactorySupplier.get()).createRendererCapabilitiesList();
        this.rendererCapabilitiesList = defaultRendererCapabilitiesListCreateRendererCapabilitiesList;
        androidx.media3.exoplayer.PlaybackLooperProvider playbackLooperProvider = builder.preloadLooperProvider;
        this.preloadLooperProvider = playbackLooperProvider;
        androidx.media3.exoplayer.trackselection.TrackSelector trackSelectorCreateTrackSelector = builder.trackSelectorFactory.createTrackSelector(builder.context);
        this.trackSelector = trackSelectorCreateTrackSelector;
        androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter = (androidx.media3.exoplayer.upstream.BandwidthMeter) builder.bandwidthMeterSupplier.get();
        trackSelectorCreateTrackSelector.init(new androidx.media3.exoplayer.source.preload.f(), bandwidthMeter);
        android.os.Looper looperObtainLooper = playbackLooperProvider.obtainLooper();
        this.preloadMediaSourceFactory = new androidx.media3.exoplayer.source.preload.PreloadMediaSource.Factory((androidx.media3.exoplayer.source.MediaSource.Factory) builder.mediaSourceFactorySupplier.get(), new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceControl(), trackSelectorCreateTrackSelector, bandwidthMeter, defaultRendererCapabilitiesListCreateRendererCapabilitiesList.getRendererCapabilities(), (androidx.media3.exoplayer.LoadControl) builder.loadControlSupplier.get(), looperObtainLooper).setClock(builder.clock);
        androidx.media3.datasource.cache.Cache cache = builder.cache;
        if (cache != null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("DefaultPreloadManager:PreCacheHelper");
            this.preCacheThread = handlerThread;
            handlerThread.start();
            this.preCacheHelperFactory = new androidx.media3.exoplayer.source.preload.PreCacheHelper.Factory(builder.context, cache, builder.dataSourceFactory != null ? builder.dataSourceFactory : new androidx.media3.datasource.DefaultDataSource.Factory(builder.context), handlerThread.getLooper()).setDownloadExecutor(builder.cachingExecutor).setListener(new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreCacheHelperListener());
        } else {
            this.preCacheThread = null;
            this.preCacheHelperFactory = null;
        }
        this.preloadHandler = builder.clock.createHandler(looperObtainLooper, null);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public androidx.media3.exoplayer.source.preload.BasePreloadManager<java.lang.Integer, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus>.MediaSourceHolder createMediaSourceHolder(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.source.MediaSource mediaSource, java.lang.Integer num) {
        return new androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceHolder(mediaItem, mediaSource != null ? this.preloadMediaSourceFactory.createMediaSource(mediaSource) : this.preloadMediaSourceFactory.createMediaSource(mediaItem), num);
    }

    @Override // androidx.media3.exoplayer.source.preload.BasePreloadManager
    public void preloadMediaSourceHolderInternal(androidx.media3.exoplayer.source.preload.BasePreloadManager<java.lang.Integer, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus>.MediaSourceHolder mediaSourceHolder, androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus) {
        if (this.releaseCalled) {
            return;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(mediaSourceHolder instanceof androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceHolder);
        androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceHolder preloadMediaSourceHolder = (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceHolder) mediaSourceHolder;
        androidx.media3.exoplayer.source.preload.PreloadMediaSource mediaSource = preloadMediaSourceHolder.getMediaSource();
        maybeClearPreloadMediaSource(mediaSource, preloadStatus);
        if (preloadStatus.equals(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus.PRELOAD_STATUS_NOT_PRELOADED)) {
            onSkipped(mediaSource, new androidx.media3.exoplayer.source.preload.j(2));
            return;
        }
        if (preloadStatus.stage != -1) {
            mediaSource.preload(androidx.media3.common.util.Util.msToUs(preloadStatus.startPositionMs));
            return;
        }
        if (preloadMediaSourceHolder.preCacheHelper == null) {
            androidx.media3.exoplayer.source.preload.PreCacheHelper.Factory factory = this.preCacheHelperFactory;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.U(factory, "DefaultPreloadManager wasn't configured with a Cache");
            preloadMediaSourceHolder.preCacheHelper = factory.create(mediaSourceHolder.mediaItem);
        }
        androidx.media3.exoplayer.source.preload.PreCacheHelper preCacheHelper = preloadMediaSourceHolder.preCacheHelper;
        preCacheHelper.getClass();
        preCacheHelper.preCache(preloadStatus.startPositionMs, preloadStatus.durationMs);
    }
}
