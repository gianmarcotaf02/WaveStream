package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.text.SubtitleParser;
import p068h4.v;

public class ForwardingMediaSourceFactory implements MediaSource.Factory {
    private final MediaSource.Factory factory;

    public ForwardingMediaSourceFactory(MediaSource.Factory factory) {
        this.factory = factory;
    }

    @Override
    public MediaSource createMediaSource(MediaItem mediaItem) {
        return this.factory.createMediaSource(mediaItem);
    }

    @Override
    public MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z6) {
        return this.factory.experimentalParseSubtitlesDuringExtraction(z6);
    }

    @Override
    public MediaSource.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i3) {
        return this.factory.experimentalSetCodecsToParseWithinGopSampleDependencies(i3);
    }

    @Override
    public int[] getSupportedTypes() {
        return this.factory.getSupportedTypes();
    }

    @Override
    public MediaSource.Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
        return this.factory.setCmcdConfigurationFactory(factory);
    }

    @Override
    public MediaSource.Factory setDownloadExecutor(v vVar) {
        return this.factory.setDownloadExecutor(vVar);
    }

    @Override
    public MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        return this.factory.setDrmSessionManagerProvider(drmSessionManagerProvider);
    }

    @Override
    public MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        return this.factory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
    }

    @Override
    public MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this.factory.setSubtitleParserFactory(factory);
    }
}
