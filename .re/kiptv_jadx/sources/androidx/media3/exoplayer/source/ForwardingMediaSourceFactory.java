package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingMediaSourceFactory implements androidx.media3.exoplayer.source.MediaSource.Factory {
    private final androidx.media3.exoplayer.source.MediaSource.Factory factory;

    public ForwardingMediaSourceFactory(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
        this.factory = factory;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem) {
        return this.factory.createMediaSource(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z6) {
        return this.factory.experimentalParseSubtitlesDuringExtraction(z6);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i3) {
        return this.factory.experimentalSetCodecsToParseWithinGopSampleDependencies(i3);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public int[] getSupportedTypes() {
        return this.factory.getSupportedTypes();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource.Factory setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
        return this.factory.setCmcdConfigurationFactory(factory);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource.Factory setDownloadExecutor(p068h4.v vVar) {
        return this.factory.setDownloadExecutor(vVar);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource.Factory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider) {
        return this.factory.setDrmSessionManagerProvider(drmSessionManagerProvider);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource.Factory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        return this.factory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public androidx.media3.exoplayer.source.MediaSource.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return this.factory.setSubtitleParserFactory(factory);
    }
}
