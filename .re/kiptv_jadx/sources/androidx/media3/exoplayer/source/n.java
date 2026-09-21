package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements androidx.media3.common.util.Consumer, androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16750h;

    public /* synthetic */ n(int i3) {
        this.f16750h = i3;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        switch (this.f16750h) {
            case 0:
                androidx.media3.exoplayer.source.SampleQueue.lambda$new$0((androidx.media3.exoplayer.source.SampleQueue.SharedSampleMetadata) obj);
                break;
            default:
                androidx.media3.exoplayer.source.SpannedData.lambda$new$0(obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public androidx.media3.exoplayer.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return androidx.media3.exoplayer.source.MediaParserExtractorAdapter.lambda$static$0(playerId);
    }
}
