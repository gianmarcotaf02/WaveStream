package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.android.gms.internal.play_billing.M0;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p068h4.v;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2230y;
import p076i4.Z;

public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DMediaSourceFactory";
    private AdViewProvider adViewProvider;
    private AdsLoader.Provider adsLoaderProvider;
    private DataSource.Factory dataSourceFactory;
    private final DelegateFactoryLoader delegateFactoryLoader;
    private boolean enableClippingInMediaPeriod;
    private ExternalLoader externalImageLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean loadOnlySelectedTracks;
    private boolean parseSubtitlesDuringExtraction;
    private MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private SubtitleParser.Factory subtitleParserFactory;

    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    public static final class DelegateFactoryLoader {
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private DataSource.Factory dataSourceFactory;
        private v downloadExecutorSupplier;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private final ExtractorsFactory extractorsFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private boolean loadOnlySelectedTracks;
        private SubtitleParser.Factory subtitleParserFactory;
        private final Map<Integer, v> mediaSourceFactorySuppliers = new HashMap();
        private final Map<Integer, MediaSource.Factory> mediaSourceFactories = new HashMap();
        private boolean parseSubtitlesDuringExtraction = true;
        private int codecsToParseWithinGopSampleDependencies = 3;

        public DelegateFactoryLoader(ExtractorsFactory extractorsFactory, SubtitleParser.Factory factory) {
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

        public MediaSource.Factory lambda$loadSupplier$4(DataSource.Factory factory) {
            return new ProgressiveMediaSource.Factory(factory, this.extractorsFactory).setLoadOnlySelectedTracks(this.loadOnlySelectedTracks);
        }

        private v loadSupplier(int i3) {
            v vVar;
            v mVar;
            v vVar2;
            final int i9 = 1;
            final int i10 = 2;
            v vVar3 = this.mediaSourceFactorySuppliers.get(Integer.valueOf(i3));
            if (vVar3 != null) {
                return vVar3;
            }
            final DataSource.Factory factory = this.dataSourceFactory;
            factory.getClass();
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i11 = HlsMediaSource.Factory.f16647a;
                        final Class clsAsSubclass = HlsMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
                        vVar2 = new v() {
                            @Override
                            public final Object get() {
                                switch (i10) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                }
                                return DefaultMediaSourceFactory.access$300(clsAsSubclass, factory);
                            }
                        };
                    } else if (i3 == 3) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                        vVar = new v() {
                            @Override
                            public final Object get() {
                                return DefaultMediaSourceFactory.access$200(clsAsSubclass2);
                            }
                        };
                    } else {
                        if (i3 != 4) {
                            throw new IllegalArgumentException(M0.l(i3, "Unrecognized contentType: "));
                        }
                        mVar = new m(this, factory, i10);
                    }
                    this.mediaSourceFactorySuppliers.put(Integer.valueOf(i3), mVar);
                    return mVar;
                }
                final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                vVar2 = new v() {
                    @Override
                    public final Object get() {
                        switch (i9) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                        return DefaultMediaSourceFactory.access$300(clsAsSubclass3, factory);
                    }
                };
                mVar = vVar2;
                this.mediaSourceFactorySuppliers.put(Integer.valueOf(i3), mVar);
                return mVar;
            }
            int i12 = DashMediaSource.Factory.f16614a;
            final Class clsAsSubclass4 = DashMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
            final int i13 = 0;
            vVar = new v() {
                @Override
                public final Object get() {
                    switch (i13) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
                    return DefaultMediaSourceFactory.access$300(clsAsSubclass4, factory);
                }
            };
            mVar = vVar;
            this.mediaSourceFactorySuppliers.put(Integer.valueOf(i3), mVar);
            return mVar;
        }

        private v maybeLoadSupplier(int i3) {
            try {
                return loadSupplier(i3);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public void setHeifExtractorFlags(int i3) {
            ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof DefaultExtractorsFactory) {
                ((DefaultExtractorsFactory) extractorsFactory).setHeifExtractorFlags(i3);
            }
        }

        public void setLoadOnlySelectedTracks(boolean z6) {
            this.loadOnlySelectedTracks = z6;
        }

        public MediaSource.Factory getMediaSourceFactory(int i3) {
            MediaSource.Factory factory = this.mediaSourceFactories.get(Integer.valueOf(i3));
            if (factory != null) {
                return factory;
            }
            MediaSource.Factory factory2 = (MediaSource.Factory) loadSupplier(i3).get();
            CmcdConfiguration.Factory factory3 = this.cmcdConfigurationFactory;
            if (factory3 != null) {
                factory2.setCmcdConfigurationFactory(factory3);
            }
            DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            v vVar = this.downloadExecutorSupplier;
            if (vVar != null) {
                factory2.setDownloadExecutor(vVar);
            }
            factory2.setSubtitleParserFactory(this.subtitleParserFactory);
            factory2.experimentalParseSubtitlesDuringExtraction(this.parseSubtitlesDuringExtraction);
            factory2.experimentalSetCodecsToParseWithinGopSampleDependencies(this.codecsToParseWithinGopSampleDependencies);
            this.mediaSourceFactories.put(Integer.valueOf(i3), factory2);
            return factory2;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return q0.H(this.mediaSourceFactorySuppliers.keySet());
        }

        public void setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = factory;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setCmcdConfigurationFactory(factory);
            }
        }

        public void setCodecsToParseWithinGopSampleDependencies(int i3) {
            this.codecsToParseWithinGopSampleDependencies = i3;
            this.extractorsFactory.experimentalSetCodecsToParseWithinGopSampleDependencies(i3);
        }

        public void setDataSourceFactory(DataSource.Factory factory) {
            if (factory != this.dataSourceFactory) {
                this.dataSourceFactory = factory;
                this.mediaSourceFactorySuppliers.clear();
                this.mediaSourceFactories.clear();
            }
        }

        public void setDownloadExecutor(v vVar) {
            this.downloadExecutorSupplier = vVar;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDownloadExecutor(vVar);
            }
        }

        public void setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setJpegExtractorFlags(int i3) {
            ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof DefaultExtractorsFactory) {
                ((DefaultExtractorsFactory) extractorsFactory).setJpegExtractorFlags(i3);
            }
        }

        public void setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        public void setParseSubtitlesDuringExtraction(boolean z6) {
            this.parseSubtitlesDuringExtraction = z6;
            this.extractorsFactory.experimentalSetTextTrackTranscodingEnabled(z6);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().experimentalParseSubtitlesDuringExtraction(z6);
            }
        }

        public void setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.subtitleParserFactory = factory;
            this.extractorsFactory.setSubtitleParserFactory(factory);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setSubtitleParserFactory(factory);
            }
        }
    }

    public static final class UnknownSubtitlesExtractor implements Extractor {
        private final Format format;

        public UnknownSubtitlesExtractor(Format format) {
            this.format = format;
        }

        @Override
        public void init(ExtractorOutput extractorOutput) {
            TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
            extractorOutput.endTracks();
            trackOutputTrack.format(this.format.buildUpon().setSampleMimeType(MimeTypes.TEXT_UNKNOWN).setCodecs(this.format.sampleMimeType).build());
        }

        @Override
        public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
            return extractorInput.skip(Log.LOG_LEVEL_OFF) == -1 ? -1 : 0;
        }

        @Override
        public void release() {
        }

        @Override
        public void seek(long j, long j9) {
        }

        @Override
        public boolean sniff(ExtractorInput extractorInput) {
            return true;
        }
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSource.Factory(context));
    }

    public static MediaSource.Factory access$200(Class cls) {
        return newInstance(cls);
    }

    public static MediaSource.Factory access$300(Class cls, DataSource.Factory factory) {
        return newInstance(cls, factory);
    }

    public Extractor[] lambda$createMediaSource$0(Format format) {
        return new Extractor[]{this.subtitleParserFactory.supportsFormat(format) ? new SubtitleExtractor(this.subtitleParserFactory.create(format), null) : new UnknownSubtitlesExtractor(format)};
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource, boolean z6) {
        MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
        return (clippingConfiguration.startPositionUs == 0 && clippingConfiguration.endPositionUs == Long.MIN_VALUE && !clippingConfiguration.relativeToDefaultPosition) ? mediaSource : new ClippingMediaSource.Builder(mediaSource).setStartPositionUs(mediaItem.clippingConfiguration.startPositionUs).setEndPositionUs(mediaItem.clippingConfiguration.endPositionUs).setEnableInitialDiscontinuity(!mediaItem.clippingConfiguration.startsAtKeyFrame).setAllowDynamicClippingUpdates(mediaItem.clippingConfiguration.relativeToLiveWindow).setRelativeToDefaultPosition(mediaItem.clippingConfiguration.relativeToDefaultPosition).setAllowUnseekableMedia(mediaItem.clippingConfiguration.allowUnseekableMedia).setEnableClippingInMediaPeriod(z6).build();
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        mediaItem.localConfiguration.getClass();
        MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        AdsLoader.Provider provider = this.adsLoaderProvider;
        AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            Log.w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            Log.w(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        DataSpec dataSpec = new DataSpec(adsConfiguration.adTagUri);
        Object objR = adsConfiguration.adsId;
        if (objR == null) {
            String str = mediaItem.mediaId;
            Uri uri = mediaItem.localConfiguration.uri;
            Uri uri2 = adsConfiguration.adTagUri;
            Z z6 = AbstractC2186b0.f22868i;
            Object[] objArr = {str, uri, uri2};
            AbstractC2230y.b(objArr, 3);
            objR = AbstractC2186b0.r(objArr, 3);
        }
        return new AdsMediaSource(mediaSource, dataSpec, objR, this, adsLoader, adViewProvider, true, false);
    }

    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls, DataSource.Factory factory) {
        try {
            return cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e6) {
            throw new IllegalStateException(e6);
        }
    }

    public DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
        this.adsLoaderProvider = null;
        this.adViewProvider = null;
        return this;
    }

    @Override
    public MediaSource createMediaSource(MediaItem mediaItem) {
        mediaItem.localConfiguration.getClass();
        String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals(C.SSAI_SCHEME)) {
            MediaSource.Factory factory = this.serverSideAdInsertionMediaSourceFactory;
            factory.getClass();
            return factory.createMediaSource(mediaItem);
        }
        if (Objects.equals(mediaItem.localConfiguration.mimeType, MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE)) {
            long jMsToUs = Util.msToUs(mediaItem.localConfiguration.imageDurationMs);
            ExternalLoader externalLoader = this.externalImageLoader;
            externalLoader.getClass();
            return new ExternallyLoadedMediaSource.Factory(jMsToUs, externalLoader).createMediaSource(mediaItem);
        }
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (mediaItem.localConfiguration.imageDurationMs != C.TIME_UNSET) {
            this.delegateFactoryLoader.setJpegExtractorFlags(1);
            this.delegateFactoryLoader.setHeifExtractorFlags(1);
        }
        try {
            MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
            MediaItem.LiveConfiguration.Builder builderBuildUpon = mediaItem.liveConfiguration.buildUpon();
            if (mediaItem.liveConfiguration.targetOffsetMs == C.TIME_UNSET) {
                builderBuildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
            }
            if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
                builderBuildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
            }
            if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
                builderBuildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
            }
            if (mediaItem.liveConfiguration.minOffsetMs == C.TIME_UNSET) {
                builderBuildUpon.setMinOffsetMs(this.liveMinOffsetMs);
            }
            if (mediaItem.liveConfiguration.maxOffsetMs == C.TIME_UNSET) {
                builderBuildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
            }
            MediaItem.LiveConfiguration liveConfigurationBuild = builderBuildUpon.build();
            if (!liveConfigurationBuild.equals(mediaItem.liveConfiguration)) {
                mediaItem = mediaItem.buildUpon().setLiveConfiguration(liveConfigurationBuild).build();
            }
            MediaSource mediaSourceCreateMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
            AbstractC2186b0 abstractC2186b0 = ((MediaItem.LocalConfiguration) Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
            if (!abstractC2186b0.isEmpty()) {
                MediaSource[] mediaSourceArr = new MediaSource[abstractC2186b0.size() + 1];
                mediaSourceArr[0] = mediaSourceCreateMediaSource;
                for (int i3 = 0; i3 < abstractC2186b0.size(); i3++) {
                    if (this.parseSubtitlesDuringExtraction) {
                        final Format formatBuild = new Format.Builder().setSampleMimeType(((MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).mimeType).setLanguage(((MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).language).setSelectionFlags(((MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).selectionFlags).setRoleFlags(((MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).roleFlags).setLabel(((MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).label).setId(((MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).id).build();
                        ProgressiveMediaSource.Factory factory2 = new ProgressiveMediaSource.Factory(this.dataSourceFactory, new ExtractorsFactory() {
                            @Override
                            public final Extractor[] createExtractors() {
                                return this.f16729a.lambda$createMediaSource$0(formatBuild);
                            }
                        });
                        if (this.subtitleParserFactory.supportsFormat(formatBuild)) {
                            formatBuild = formatBuild.buildUpon().setSampleMimeType(MimeTypes.APPLICATION_MEDIA3_CUES).setCodecs(formatBuild.sampleMimeType).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(formatBuild)).build();
                        }
                        ProgressiveMediaSource.Factory loadOnlySelectedTracks = factory2.enableLazyLoadingWithSingleTrack(0, formatBuild).setLoadOnlySelectedTracks(this.loadOnlySelectedTracks);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy != null) {
                            loadOnlySelectedTracks.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                        }
                        mediaSourceArr[i3 + 1] = loadOnlySelectedTracks.createMediaSource(MediaItem.fromUri(((MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).uri.toString()));
                    } else {
                        SingleSampleMediaSource.Factory factory3 = new SingleSampleMediaSource.Factory(this.dataSourceFactory);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy2 != null) {
                            factory3.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                        }
                        mediaSourceArr[i3 + 1] = factory3.createMediaSource((MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3), C.TIME_UNSET);
                    }
                }
                mediaSourceCreateMediaSource = new MergingMediaSource(mediaSourceArr);
            }
            return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, mediaSourceCreateMediaSource, this.enableClippingInMediaPeriod));
        } catch (ClassNotFoundException e6) {
            throw new IllegalStateException(e6);
        }
    }

    @Override
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    @Deprecated
    public DefaultMediaSourceFactory setAdViewProvider(AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    @Deprecated
    public DefaultMediaSourceFactory setAdsLoaderProvider(AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    public DefaultMediaSourceFactory setDataSourceFactory(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.delegateFactoryLoader.setDataSourceFactory(factory);
        return this;
    }

    @Override
    public MediaSource.Factory setDownloadExecutor(v vVar) {
        this.delegateFactoryLoader.setDownloadExecutor(vVar);
        return this;
    }

    public DefaultMediaSourceFactory setEnableClippingInMediaPeriod(boolean z6) {
        this.enableClippingInMediaPeriod = z6;
        return this;
    }

    public DefaultMediaSourceFactory setExternalImageLoader(ExternalLoader externalLoader) {
        this.externalImageLoader = externalLoader;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long j) {
        this.liveMaxOffsetMs = j;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxSpeed(float f9) {
        this.liveMaxSpeed = f9;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinOffsetMs(long j) {
        this.liveMinOffsetMs = j;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinSpeed(float f9) {
        this.liveMinSpeed = f9;
        return this;
    }

    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long j) {
        this.liveTargetOffsetMs = j;
        return this;
    }

    public DefaultMediaSourceFactory setLoadOnlySelectedTracks(boolean z6) {
        this.loadOnlySelectedTracks = z6;
        this.delegateFactoryLoader.setLoadOnlySelectedTracks(z6);
        return this;
    }

    public DefaultMediaSourceFactory setLocalAdInsertionComponents(AdsLoader.Provider provider, AdViewProvider adViewProvider) {
        provider.getClass();
        this.adsLoaderProvider = provider;
        adViewProvider.getClass();
        this.adViewProvider = adViewProvider;
        return this;
    }

    public DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
        this(new DefaultDataSource.Factory(context), extractorsFactory);
    }

    @Override
    @Deprecated
    public DefaultMediaSourceFactory experimentalParseSubtitlesDuringExtraction(boolean z6) {
        this.parseSubtitlesDuringExtraction = z6;
        this.delegateFactoryLoader.setParseSubtitlesDuringExtraction(z6);
        return this;
    }

    @Override
    public DefaultMediaSourceFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i3) {
        this.delegateFactoryLoader.setCodecsToParseWithinGopSampleDependencies(i3);
        return this;
    }

    @Override
    public DefaultMediaSourceFactory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
        DelegateFactoryLoader delegateFactoryLoader = this.delegateFactoryLoader;
        factory.getClass();
        delegateFactoryLoader.setCmcdConfigurationFactory(factory);
        return this;
    }

    @Override
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        DelegateFactoryLoader delegateFactoryLoader = this.delegateFactoryLoader;
        AbstractC1864o0.U(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        delegateFactoryLoader.setDrmSessionManagerProvider(drmSessionManagerProvider);
        return this;
    }

    @Override
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        AbstractC1864o0.U(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    @Override
    public DefaultMediaSourceFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        factory.getClass();
        this.subtitleParserFactory = factory;
        this.delegateFactoryLoader.setSubtitleParserFactory(factory);
        return this;
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory) {
        this(factory, new DefaultExtractorsFactory());
    }

    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e6) {
            throw new IllegalStateException(e6);
        }
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
        this(factory, extractorsFactory, new DefaultSubtitleParserFactory());
    }

    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory, SubtitleParser.Factory factory2) {
        this.dataSourceFactory = factory;
        this.subtitleParserFactory = factory2;
        DelegateFactoryLoader delegateFactoryLoader = new DelegateFactoryLoader(extractorsFactory, factory2);
        this.delegateFactoryLoader = delegateFactoryLoader;
        delegateFactoryLoader.setDataSourceFactory(factory);
        this.liveTargetOffsetMs = C.TIME_UNSET;
        this.liveMinOffsetMs = C.TIME_UNSET;
        this.liveMaxOffsetMs = C.TIME_UNSET;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
        this.parseSubtitlesDuringExtraction = true;
    }
}
