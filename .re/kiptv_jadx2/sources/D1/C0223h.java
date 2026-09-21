package D1;

import Y2.C1040j;
import Y2.InterfaceC1049t;
import android.view.SurfaceView;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Format;
import androidx.media3.common.Player;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.exoplayer.hls.HlsDataSourceFactory;
import androidx.media3.exoplayer.hls.playlist.DefaultHlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParserFactory;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import io.github.jan.supabase.postgrest.PropertyConversionMethod;
import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import java.lang.reflect.Constructor;
import java.util.List;
import p011b1.C1650g;
import p020c0.H0;
import p020c0.InterfaceC1678f;

public final class C0223h implements H0, DebugViewProvider, ListenerSet.Event, DefaultGainProvider.FadeProvider, CacheKeyFactory, HlsPlaylistTracker.Factory, BundledChunkExtractor.ManifestFormatMerger, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier, Id3Decoder.FramePredicate, InterfaceC1678f, InterfaceC1049t, g1.F, PropertyConversionMethod, ScopeCallback {

    public static final int f2017i = 0;

    public final int f2018h;

    public C0223h(int i3) {
        this.f2018h = i3;
    }

    @Override
    public g1.D a(C1650g c1650g) {
        return new g1.D(c1650g, g1.p.f21833a);
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public String buildCacheKey(DataSpec dataSpec) {
        return CacheKeyFactory.lambda$static$0(dataSpec);
    }

    @Override
    public void cancel() {
    }

    @Override
    public HlsPlaylistTracker createTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory, CmcdConfiguration cmcdConfiguration, p068h4.v vVar) {
        return new DefaultHlsPlaylistTracker(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory, cmcdConfiguration, vVar);
    }

    @Override
    public boolean evaluate(int i3, int i9, int i10, int i11, int i12) {
        switch (this.f2018h) {
            case 18:
                return Id3Decoder.lambda$static$0(i3, i9, i10, i11, i12);
            default:
                return Mp3Extractor.lambda$static$1(i3, i9, i10, i11, i12);
        }
    }

    @Override
    public Constructor getConstructor() {
        switch (this.f2018h) {
            case 16:
                return DefaultExtractorsFactory.getFlacExtractorConstructor();
            default:
                return DefaultExtractorsFactory.getMidiExtractorConstructor();
        }
    }

    @Override
    public SurfaceView getDebugPreviewSurfaceView(int i3, int i9) {
        return DebugViewProvider.lambda$static$0(i3, i9);
    }

    @Override
    public float getGainFactorAt(long j, long j9) {
        switch (this.f2018h) {
            case 9:
                return DefaultGainProvider.lambda$static$0(j, j9);
            case 10:
                return DefaultGainProvider.lambda$static$1(j, j9);
            case 11:
                return DefaultGainProvider.lambda$static$2(j, j9);
            default:
                return DefaultGainProvider.lambda$static$3(j, j9);
        }
    }

    @Override
    public String invoke(E6.t tVar) {
        switch (this.f2018h) {
            case 26:
                return PropertyConversionMethod.Companion.SERIAL_NAME$lambda$0(tVar);
            case 27:
                return PropertyConversionMethod.Companion.CAMEL_CASE_TO_SNAKE_CASE$lambda$1(tVar);
            default:
                return PropertyConversionMethod.Companion.NONE$lambda$2(tVar);
        }
    }

    @Override
    public Format merge(Format format, Format format2) {
        return BundledChunkExtractor.ManifestFormatMerger.lambda$static$0(format, format2);
    }

    @Override
    public void onPurchasesUpdated(C1040j c1040j, List list) {
        kotlin.jvm.internal.m.e(c1040j, "<anonymous parameter 0>");
    }

    @Override
    public void run(IScope iScope) {
        SessionCaptureStrategy.stop$lambda$1(iScope);
    }

    @Override
    public void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }
}
