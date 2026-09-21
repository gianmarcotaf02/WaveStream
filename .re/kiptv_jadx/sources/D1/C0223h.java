package D1;

/* JADX INFO: renamed from: D1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0223h implements p020c0.H0, androidx.media3.common.DebugViewProvider, androidx.media3.common.util.ListenerSet.Event, androidx.media3.common.audio.DefaultGainProvider.FadeProvider, androidx.media3.datasource.cache.CacheKeyFactory, androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory, androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.ManifestFormatMerger, androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate, p020c0.InterfaceC1678f, Y2.InterfaceC1049t, g1.F, io.github.jan.supabase.postgrest.PropertyConversionMethod, io.sentry.ScopeCallback {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f2017i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2018h;

    public /* synthetic */ C0223h(int i3) {
        this.f2018h = i3;
    }

    @Override // g1.F
    public g1.D a(p011b1.C1650g c1650g) {
        return new g1.D(c1650g, g1.p.f21833a);
    }

    @Override // p020c0.H0
    public boolean b() {
        return false;
    }

    @Override // androidx.media3.datasource.cache.CacheKeyFactory
    public java.lang.String buildCacheKey(androidx.media3.datasource.DataSpec dataSpec) {
        return androidx.media3.datasource.cache.CacheKeyFactory.lambda$static$0(dataSpec);
    }

    @Override // p020c0.InterfaceC1678f
    public void cancel() {
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.Factory
    public androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker createTracker(androidx.media3.exoplayer.hls.HlsDataSourceFactory hlsDataSourceFactory, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory hlsPlaylistParserFactory, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration, p068h4.v vVar) {
        return new androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory, cmcdConfiguration, vVar);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i3, int i9, int i10, int i11, int i12) {
        switch (this.f2018h) {
            case 18:
                return androidx.media3.extractor.metadata.id3.Id3Decoder.lambda$static$0(i3, i9, i10, i11, i12);
            default:
                return androidx.media3.extractor.mp3.Mp3Extractor.lambda$static$1(i3, i9, i10, i11, i12);
        }
    }

    @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public java.lang.reflect.Constructor getConstructor() {
        switch (this.f2018h) {
            case 16:
                return androidx.media3.extractor.DefaultExtractorsFactory.getFlacExtractorConstructor();
            default:
                return androidx.media3.extractor.DefaultExtractorsFactory.getMidiExtractorConstructor();
        }
    }

    @Override // androidx.media3.common.DebugViewProvider
    public android.view.SurfaceView getDebugPreviewSurfaceView(int i3, int i9) {
        return androidx.media3.common.DebugViewProvider.lambda$static$0(i3, i9);
    }

    @Override // androidx.media3.common.audio.DefaultGainProvider.FadeProvider
    public float getGainFactorAt(long j, long j9) {
        switch (this.f2018h) {
            case 9:
                return androidx.media3.common.audio.DefaultGainProvider.lambda$static$0(j, j9);
            case 10:
                return androidx.media3.common.audio.DefaultGainProvider.lambda$static$1(j, j9);
            case 11:
                return androidx.media3.common.audio.DefaultGainProvider.lambda$static$2(j, j9);
            default:
                return androidx.media3.common.audio.DefaultGainProvider.lambda$static$3(j, j9);
        }
    }

    @Override // io.github.jan.supabase.postgrest.PropertyConversionMethod
    public java.lang.String invoke(E6.t tVar) {
        switch (this.f2018h) {
            case 26:
                return io.github.jan.supabase.postgrest.PropertyConversionMethod.Companion.SERIAL_NAME$lambda$0(tVar);
            case 27:
                return io.github.jan.supabase.postgrest.PropertyConversionMethod.Companion.CAMEL_CASE_TO_SNAKE_CASE$lambda$1(tVar);
            default:
                return io.github.jan.supabase.postgrest.PropertyConversionMethod.Companion.NONE$lambda$2(tVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.ManifestFormatMerger
    public androidx.media3.common.Format merge(androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        return androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.ManifestFormatMerger.lambda$static$0(format, format2);
    }

    @Override // Y2.InterfaceC1049t
    public void onPurchasesUpdated(Y2.C1040j c1040j, java.util.List list) {
        kotlin.jvm.internal.m.e(c1040j, "<anonymous parameter 0>");
    }

    @Override // io.sentry.ScopeCallback
    public void run(io.sentry.IScope iScope) {
        io.sentry.android.replay.capture.SessionCaptureStrategy.stop$lambda$1(iScope);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        ((androidx.media3.common.Player.Listener) obj).onRenderedFirstFrame();
    }
}
