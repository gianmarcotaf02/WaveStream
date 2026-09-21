package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements androidx.media3.exoplayer.hls.HlsExtractorFactory {
    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final androidx.media3.exoplayer.hls.HlsMediaChunkExtractor createExtractor(android.net.Uri uri, androidx.media3.common.Format format, java.util.List list, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, java.util.Map map, androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput, playerId);
    }
}
