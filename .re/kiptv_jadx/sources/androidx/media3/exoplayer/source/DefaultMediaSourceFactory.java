package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaSourceFactory implements androidx.media3.exoplayer.source.MediaSourceFactory {
    private static final java.lang.String TAG = "DMediaSourceFactory";
    private androidx.media3.common.AdViewProvider adViewProvider;
    private androidx.media3.exoplayer.source.ads.AdsLoader.Provider adsLoaderProvider;
    private androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private final androidx.media3.exoplayer.source.DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader;
    private boolean enableClippingInMediaPeriod;
    private androidx.media3.exoplayer.source.ExternalLoader externalImageLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean loadOnlySelectedTracks;
    private boolean parseSubtitlesDuringExtraction;
    private androidx.media3.exoplayer.source.MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;

    @java.lang.Deprecated
    public interface AdsLoaderProvider extends androidx.media3.exoplayer.source.ads.AdsLoader.Provider {
    }

    public static final class DelegateFactoryLoader {
        private androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfigurationFactory;
        private androidx.media3.datasource.DataSource.Factory dataSourceFactory;
        private p068h4.v downloadExecutorSupplier;
        private androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider;
        private final androidx.media3.extractor.ExtractorsFactory extractorsFactory;
        private androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private boolean loadOnlySelectedTracks;
        private androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
        private final java.util.Map<java.lang.Integer, p068h4.v> mediaSourceFactorySuppliers = new java.util.HashMap();
        private final java.util.Map<java.lang.Integer, androidx.media3.exoplayer.source.MediaSource.Factory> mediaSourceFactories = new java.util.HashMap();
        private boolean parseSubtitlesDuringExtraction = true;
        private int codecsToParseWithinGopSampleDependencies = 3;

        public DelegateFactoryLoader(androidx.media3.extractor.ExtractorsFactory extractorsFactory, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            this.extractorsFactory = extractorsFactory;
            this.subtitleParserFactory = factory;
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$loadSupplier$4(androidx.media3.datasource.DataSource.Factory factory) {
            return new androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory(factory, this.extractorsFactory).setLoadOnlySelectedTracks(this.loadOnlySelectedTracks);
        }

        private p068h4.v loadSupplier(int i3) {
            p068h4.v vVar;
            p068h4.v mVar;
            p068h4.v vVar2;
            final int i9 = 1;
            final int i10 = 2;
            p068h4.v vVar3 = this.mediaSourceFactorySuppliers.get(java.lang.Integer.valueOf(i3));
            if (vVar3 != null) {
                return vVar3;
            }
            final androidx.media3.datasource.DataSource.Factory factory = this.dataSourceFactory;
            factory.getClass();
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i11 = androidx.media3.exoplayer.hls.HlsMediaSource.Factory.f16647a;
                        final java.lang.Class clsAsSubclass = androidx.media3.exoplayer.hls.HlsMediaSource.Factory.class.asSubclass(androidx.media3.exoplayer.source.MediaSource.Factory.class);
                        vVar2 = new p068h4.v() { // from class: androidx.media3.exoplayer.source.d
                            @Override // p068h4.v
                            public final java.lang.Object get() {
                                switch (i10) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                }
                                return androidx.media3.exoplayer.source.DefaultMediaSourceFactory.access$300(clsAsSubclass, factory);
                            }
                        };
                    } else if (i3 == 3) {
                        final java.lang.Class<? extends U> clsAsSubclass2 = java.lang.Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(androidx.media3.exoplayer.source.MediaSource.Factory.class);
                        vVar = new p068h4.v() { // from class: androidx.media3.exoplayer.source.e
                            @Override // p068h4.v
                            public final java.lang.Object get() {
                                return androidx.media3.exoplayer.source.DefaultMediaSourceFactory.access$200(clsAsSubclass2);
                            }
                        };
                    } else {
                        if (i3 != 4) {
                            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "Unrecognized contentType: "));
                        }
                        mVar = new androidx.media3.exoplayer.source.m(this, factory, i10);
                    }
                    this.mediaSourceFactorySuppliers.put(java.lang.Integer.valueOf(i3), mVar);
                    return mVar;
                }
                final java.lang.Class<? extends U> clsAsSubclass3 = java.lang.Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(androidx.media3.exoplayer.source.MediaSource.Factory.class);
                vVar2 = new p068h4.v() { // from class: androidx.media3.exoplayer.source.d
                    @Override // p068h4.v
                    public final java.lang.Object get() {
                        switch (i9) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                        return androidx.media3.exoplayer.source.DefaultMediaSourceFactory.access$300(clsAsSubclass3, factory);
                    }
                };
                mVar = vVar2;
                this.mediaSourceFactorySuppliers.put(java.lang.Integer.valueOf(i3), mVar);
                return mVar;
            }
            int i12 = androidx.media3.exoplayer.dash.DashMediaSource.Factory.f16614a;
            final java.lang.Class clsAsSubclass4 = androidx.media3.exoplayer.dash.DashMediaSource.Factory.class.asSubclass(androidx.media3.exoplayer.source.MediaSource.Factory.class);
            final int i13 = 0;
            vVar = new p068h4.v() { // from class: androidx.media3.exoplayer.source.d
                @Override // p068h4.v
                public final java.lang.Object get() {
                    switch (i13) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
                    return androidx.media3.exoplayer.source.DefaultMediaSourceFactory.access$300(clsAsSubclass4, factory);
                }
            };
            mVar = vVar;
            this.mediaSourceFactorySuppliers.put(java.lang.Integer.valueOf(i3), mVar);
            return mVar;
        }

        private p068h4.v maybeLoadSupplier(int i3) {
            try {
                return loadSupplier(i3);
            } catch (java.lang.ClassNotFoundException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeifExtractorFlags(int i3) {
            androidx.media3.extractor.ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof androidx.media3.extractor.DefaultExtractorsFactory) {
                ((androidx.media3.extractor.DefaultExtractorsFactory) extractorsFactory).setHeifExtractorFlags(i3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadOnlySelectedTracks(boolean z6) {
            this.loadOnlySelectedTracks = z6;
        }

        public androidx.media3.exoplayer.source.MediaSource.Factory getMediaSourceFactory(int i3) {
            androidx.media3.exoplayer.source.MediaSource.Factory factory = this.mediaSourceFactories.get(java.lang.Integer.valueOf(i3));
            if (factory != null) {
                return factory;
            }
            androidx.media3.exoplayer.source.MediaSource.Factory factory2 = (androidx.media3.exoplayer.source.MediaSource.Factory) loadSupplier(i3).get();
            androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory3 = this.cmcdConfigurationFactory;
            if (factory3 != null) {
                factory2.setCmcdConfigurationFactory(factory3);
            }
            androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            p068h4.v vVar = this.downloadExecutorSupplier;
            if (vVar != null) {
                factory2.setDownloadExecutor(vVar);
            }
            factory2.setSubtitleParserFactory(this.subtitleParserFactory);
            factory2.experimentalParseSubtitlesDuringExtraction(this.parseSubtitlesDuringExtraction);
            factory2.experimentalSetCodecsToParseWithinGopSampleDependencies(this.codecsToParseWithinGopSampleDependencies);
            this.mediaSourceFactories.put(java.lang.Integer.valueOf(i3), factory2);
            return factory2;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return com.google.crypto.tink.shaded.protobuf.q0.H(this.mediaSourceFactorySuppliers.keySet());
        }

        public void setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = factory;
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setCmcdConfigurationFactory(factory);
            }
        }

        public void setCodecsToParseWithinGopSampleDependencies(int i3) {
            this.codecsToParseWithinGopSampleDependencies = i3;
            this.extractorsFactory.experimentalSetCodecsToParseWithinGopSampleDependencies(i3);
        }

        public void setDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
            if (factory != this.dataSourceFactory) {
                this.dataSourceFactory = factory;
                this.mediaSourceFactorySuppliers.clear();
                this.mediaSourceFactories.clear();
            }
        }

        public void setDownloadExecutor(p068h4.v vVar) {
            this.downloadExecutorSupplier = vVar;
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDownloadExecutor(vVar);
            }
        }

        public void setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setJpegExtractorFlags(int i3) {
            androidx.media3.extractor.ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof androidx.media3.extractor.DefaultExtractorsFactory) {
                ((androidx.media3.extractor.DefaultExtractorsFactory) extractorsFactory).setJpegExtractorFlags(i3);
            }
        }

        public void setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        public void setParseSubtitlesDuringExtraction(boolean z6) {
            this.parseSubtitlesDuringExtraction = z6;
            this.extractorsFactory.experimentalSetTextTrackTranscodingEnabled(z6);
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().experimentalParseSubtitlesDuringExtraction(z6);
            }
        }

        public void setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            this.subtitleParserFactory = factory;
            this.extractorsFactory.setSubtitleParserFactory(factory);
            java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setSubtitleParserFactory(factory);
            }
        }
    }

    public static final class UnknownSubtitlesExtractor implements androidx.media3.extractor.Extractor {
        private final androidx.media3.common.Format format;

        public UnknownSubtitlesExtractor(androidx.media3.common.Format format) {
            this.format = format;
        }

        @Override // androidx.media3.extractor.Extractor
        public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
            androidx.media3.extractor.TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET));
            extractorOutput.endTracks();
            trackOutputTrack.format(this.format.buildUpon().setSampleMimeType(androidx.media3.common.MimeTypes.TEXT_UNKNOWN).setCodecs(this.format.sampleMimeType).build());
        }

        @Override // androidx.media3.extractor.Extractor
        public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
            return extractorInput.skip(androidx.media3.common.util.Log.LOG_LEVEL_OFF) == -1 ? -1 : 0;
        }

        @Override // androidx.media3.extractor.Extractor
        public void release() {
        }

        @Override // androidx.media3.extractor.Extractor
        public void seek(long j, long j9) {
        }

        @Override // androidx.media3.extractor.Extractor
        public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
            return true;
        }
    }

    public DefaultMediaSourceFactory(android.content.Context context) {
        this(new androidx.media3.datasource.DefaultDataSource.Factory(context));
    }

    public static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory access$200(java.lang.Class cls) {
        return newInstance(cls);
    }

    public static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory access$300(java.lang.Class cls, androidx.media3.datasource.DataSource.Factory factory) {
        return newInstance(cls, factory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ androidx.media3.extractor.Extractor[] lambda$createMediaSource$0(androidx.media3.common.Format format) {
        return new androidx.media3.extractor.Extractor[]{this.subtitleParserFactory.supportsFormat(format) ? new androidx.media3.extractor.text.SubtitleExtractor(this.subtitleParserFactory.create(format), null) : new androidx.media3.exoplayer.source.DefaultMediaSourceFactory.UnknownSubtitlesExtractor(format)};
    }

    private static androidx.media3.exoplayer.source.MediaSource maybeClipMediaSource(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z6) {
        androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
        return (clippingConfiguration.startPositionUs == 0 && clippingConfiguration.endPositionUs == Long.MIN_VALUE && !clippingConfiguration.relativeToDefaultPosition) ? mediaSource : new androidx.media3.exoplayer.source.ClippingMediaSource.Builder(mediaSource).setStartPositionUs(mediaItem.clippingConfiguration.startPositionUs).setEndPositionUs(mediaItem.clippingConfiguration.endPositionUs).setEnableInitialDiscontinuity(!mediaItem.clippingConfiguration.startsAtKeyFrame).setAllowDynamicClippingUpdates(mediaItem.clippingConfiguration.relativeToLiveWindow).setRelativeToDefaultPosition(mediaItem.clippingConfiguration.relativeToDefaultPosition).setAllowUnseekableMedia(mediaItem.clippingConfiguration.allowUnseekableMedia).setEnableClippingInMediaPeriod(z6).build();
    }

    private androidx.media3.exoplayer.source.MediaSource maybeWrapWithAdsMediaSource(androidx.media3.common.MediaItem mediaItem, androidx.media3.exoplayer.source.MediaSource mediaSource) {
        mediaItem.localConfiguration.getClass();
        androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        androidx.media3.exoplayer.source.ads.AdsLoader.Provider provider = this.adsLoaderProvider;
        androidx.media3.common.AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            androidx.media3.common.util.Log.w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        androidx.media3.exoplayer.source.ads.AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            androidx.media3.common.util.Log.w(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        androidx.media3.datasource.DataSpec dataSpec = new androidx.media3.datasource.DataSpec(adsConfiguration.adTagUri);
        java.lang.Object objR = adsConfiguration.adsId;
        if (objR == null) {
            java.lang.String str = mediaItem.mediaId;
            android.net.Uri uri = mediaItem.localConfiguration.uri;
            android.net.Uri uri2 = adsConfiguration.adTagUri;
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            java.lang.Object[] objArr = {str, uri, uri2};
            p076i4.AbstractC2230y.b(objArr, 3);
            objR = p076i4.AbstractC2186b0.r(objArr, 3);
        }
        return new androidx.media3.exoplayer.source.ads.AdsMediaSource(mediaSource, dataSpec, objR, this, adsLoader, adViewProvider, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.source.MediaSource.Factory newInstance(java.lang.Class<? extends androidx.media3.exoplayer.source.MediaSource.Factory> cls, androidx.media3.datasource.DataSource.Factory factory) {
        try {
            return cls.getConstructor(androidx.media3.datasource.DataSource.Factory.class).newInstance(factory);
        } catch (java.lang.Exception e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
        this.adsLoaderProvider = null;
        this.adViewProvider = null;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem) {
        mediaItem.localConfiguration.getClass();
        java.lang.String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals(androidx.media3.common.C.SSAI_SCHEME)) {
            androidx.media3.exoplayer.source.MediaSource.Factory factory = this.serverSideAdInsertionMediaSourceFactory;
            factory.getClass();
            return factory.createMediaSource(mediaItem);
        }
        if (java.util.Objects.equals(mediaItem.localConfiguration.mimeType, androidx.media3.common.MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE)) {
            long jMsToUs = androidx.media3.common.util.Util.msToUs(mediaItem.localConfiguration.imageDurationMs);
            androidx.media3.exoplayer.source.ExternalLoader externalLoader = this.externalImageLoader;
            externalLoader.getClass();
            return new androidx.media3.exoplayer.source.ExternallyLoadedMediaSource.Factory(jMsToUs, externalLoader).createMediaSource(mediaItem);
        }
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        int iInferContentTypeForUriAndMimeType = androidx.media3.common.util.Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (mediaItem.localConfiguration.imageDurationMs != androidx.media3.common.C.TIME_UNSET) {
            this.delegateFactoryLoader.setJpegExtractorFlags(1);
            this.delegateFactoryLoader.setHeifExtractorFlags(1);
        }
        try {
            androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
            androidx.media3.common.MediaItem.LiveConfiguration.Builder builderBuildUpon = mediaItem.liveConfiguration.buildUpon();
            if (mediaItem.liveConfiguration.targetOffsetMs == androidx.media3.common.C.TIME_UNSET) {
                builderBuildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
            }
            if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
                builderBuildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
            }
            if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
                builderBuildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
            }
            if (mediaItem.liveConfiguration.minOffsetMs == androidx.media3.common.C.TIME_UNSET) {
                builderBuildUpon.setMinOffsetMs(this.liveMinOffsetMs);
            }
            if (mediaItem.liveConfiguration.maxOffsetMs == androidx.media3.common.C.TIME_UNSET) {
                builderBuildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
            }
            androidx.media3.common.MediaItem.LiveConfiguration liveConfigurationBuild = builderBuildUpon.build();
            if (!liveConfigurationBuild.equals(mediaItem.liveConfiguration)) {
                mediaItem = mediaItem.buildUpon().setLiveConfiguration(liveConfigurationBuild).build();
            }
            androidx.media3.exoplayer.source.MediaSource mediaSourceCreateMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
            p076i4.AbstractC2186b0 abstractC2186b0 = ((androidx.media3.common.MediaItem.LocalConfiguration) androidx.media3.common.util.Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
            if (!abstractC2186b0.isEmpty()) {
                androidx.media3.exoplayer.source.MediaSource[] mediaSourceArr = new androidx.media3.exoplayer.source.MediaSource[abstractC2186b0.size() + 1];
                mediaSourceArr[0] = mediaSourceCreateMediaSource;
                for (int i3 = 0; i3 < abstractC2186b0.size(); i3++) {
                    if (this.parseSubtitlesDuringExtraction) {
                        final androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setSampleMimeType(((androidx.media3.common.MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).mimeType).setLanguage(((androidx.media3.common.MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).language).setSelectionFlags(((androidx.media3.common.MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).selectionFlags).setRoleFlags(((androidx.media3.common.MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).roleFlags).setLabel(((androidx.media3.common.MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).label).setId(((androidx.media3.common.MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).id).build();
                        androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory factory2 = new androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory(this.dataSourceFactory, new androidx.media3.extractor.ExtractorsFactory() { // from class: androidx.media3.exoplayer.source.c
                            @Override // androidx.media3.extractor.ExtractorsFactory
                            public final androidx.media3.extractor.Extractor[] createExtractors() {
                                return this.f16729a.lambda$createMediaSource$0(formatBuild);
                            }
                        });
                        if (this.subtitleParserFactory.supportsFormat(formatBuild)) {
                            formatBuild = formatBuild.buildUpon().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_MEDIA3_CUES).setCodecs(formatBuild.sampleMimeType).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(formatBuild)).build();
                        }
                        androidx.media3.exoplayer.source.ProgressiveMediaSource.Factory loadOnlySelectedTracks = factory2.enableLazyLoadingWithSingleTrack(0, formatBuild).setLoadOnlySelectedTracks(this.loadOnlySelectedTracks);
                        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy != null) {
                            loadOnlySelectedTracks.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                        }
                        mediaSourceArr[i3 + 1] = loadOnlySelectedTracks.createMediaSource(androidx.media3.common.MediaItem.fromUri(((androidx.media3.common.MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).uri.toString()));
                    } else {
                        androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory factory3 = new androidx.media3.exoplayer.source.SingleSampleMediaSource.Factory(this.dataSourceFactory);
                        androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy2 != null) {
                            factory3.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                        }
                        mediaSourceArr[i3 + 1] = factory3.createMediaSource((androidx.media3.common.MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3), androidx.media3.common.C.TIME_UNSET);
                    }
                }
                mediaSourceCreateMediaSource = new androidx.media3.exoplayer.source.MergingMediaSource(mediaSourceArr);
            }
            return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, mediaSourceCreateMediaSource, this.enableClippingInMediaPeriod));
        } catch (java.lang.ClassNotFoundException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    @java.lang.Deprecated
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setAdViewProvider(androidx.media3.common.AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    @java.lang.Deprecated
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setAdsLoaderProvider(androidx.media3.exoplayer.source.ads.AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setDataSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.delegateFactoryLoader.setDataSourceFactory(factory);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource.Factory setDownloadExecutor(p068h4.v vVar) {
        this.delegateFactoryLoader.setDownloadExecutor(vVar);
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setEnableClippingInMediaPeriod(boolean z6) {
        this.enableClippingInMediaPeriod = z6;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setExternalImageLoader(androidx.media3.exoplayer.source.ExternalLoader externalLoader) {
        this.externalImageLoader = externalLoader;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLiveMaxOffsetMs(long j) {
        this.liveMaxOffsetMs = j;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLiveMaxSpeed(float f9) {
        this.liveMaxSpeed = f9;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLiveMinOffsetMs(long j) {
        this.liveMinOffsetMs = j;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLiveMinSpeed(float f9) {
        this.liveMinSpeed = f9;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLiveTargetOffsetMs(long j) {
        this.liveTargetOffsetMs = j;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLoadOnlySelectedTracks(boolean z6) {
        this.loadOnlySelectedTracks = z6;
        this.delegateFactoryLoader.setLoadOnlySelectedTracks(z6);
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLocalAdInsertionComponents(androidx.media3.exoplayer.source.ads.AdsLoader.Provider provider, androidx.media3.common.AdViewProvider adViewProvider) {
        provider.getClass();
        this.adsLoaderProvider = provider;
        adViewProvider.getClass();
        this.adViewProvider = adViewProvider;
        return this;
    }

    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    public DefaultMediaSourceFactory(android.content.Context context, androidx.media3.extractor.ExtractorsFactory extractorsFactory) {
        this(new androidx.media3.datasource.DefaultDataSource.Factory(context), extractorsFactory);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @java.lang.Deprecated
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory experimentalParseSubtitlesDuringExtraction(boolean z6) {
        this.parseSubtitlesDuringExtraction = z6;
        this.delegateFactoryLoader.setParseSubtitlesDuringExtraction(z6);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i3) {
        this.delegateFactoryLoader.setCodecsToParseWithinGopSampleDependencies(i3);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
        androidx.media3.exoplayer.source.DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader = this.delegateFactoryLoader;
        factory.getClass();
        delegateFactoryLoader.setCmcdConfigurationFactory(factory);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
        androidx.media3.exoplayer.source.DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader = this.delegateFactoryLoader;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        delegateFactoryLoader.setDrmSessionManagerProvider(drmSessionManagerProvider);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.DefaultMediaSourceFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        factory.getClass();
        this.subtitleParserFactory = factory;
        this.delegateFactoryLoader.setSubtitleParserFactory(factory);
        return this;
    }

    public DefaultMediaSourceFactory(androidx.media3.datasource.DataSource.Factory factory) {
        this(factory, new androidx.media3.extractor.DefaultExtractorsFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.source.MediaSource.Factory newInstance(java.lang.Class<? extends androidx.media3.exoplayer.source.MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (java.lang.Exception e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }

    public DefaultMediaSourceFactory(androidx.media3.datasource.DataSource.Factory factory, androidx.media3.extractor.ExtractorsFactory extractorsFactory) {
        this(factory, extractorsFactory, new androidx.media3.extractor.text.DefaultSubtitleParserFactory());
    }

    public DefaultMediaSourceFactory(androidx.media3.datasource.DataSource.Factory factory, androidx.media3.extractor.ExtractorsFactory extractorsFactory, androidx.media3.extractor.text.SubtitleParser.Factory factory2) {
        this.dataSourceFactory = factory;
        this.subtitleParserFactory = factory2;
        androidx.media3.exoplayer.source.DefaultMediaSourceFactory.DelegateFactoryLoader delegateFactoryLoader = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory.DelegateFactoryLoader(extractorsFactory, factory2);
        this.delegateFactoryLoader = delegateFactoryLoader;
        delegateFactoryLoader.setDataSourceFactory(factory);
        this.liveTargetOffsetMs = androidx.media3.common.C.TIME_UNSET;
        this.liveMinOffsetMs = androidx.media3.common.C.TIME_UNSET;
        this.liveMaxOffsetMs = androidx.media3.common.C.TIME_UNSET;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
        this.parseSubtitlesDuringExtraction = true;
    }
}
