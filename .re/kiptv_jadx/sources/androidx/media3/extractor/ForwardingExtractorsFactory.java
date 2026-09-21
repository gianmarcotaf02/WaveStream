package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingExtractorsFactory implements androidx.media3.extractor.ExtractorsFactory {
    private final androidx.media3.extractor.ExtractorsFactory factory;

    public ForwardingExtractorsFactory(androidx.media3.extractor.ExtractorsFactory extractorsFactory) {
        this.factory = extractorsFactory;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public androidx.media3.extractor.Extractor[] createExtractors() {
        return this.factory.createExtractors();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public androidx.media3.extractor.ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i3) {
        return this.factory.experimentalSetCodecsToParseWithinGopSampleDependencies(i3);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public androidx.media3.extractor.ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z6) {
        return this.factory.experimentalSetTextTrackTranscodingEnabled(z6);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public androidx.media3.extractor.ExtractorsFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return this.factory.setSubtitleParserFactory(factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public androidx.media3.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        return this.factory.createExtractors(uri, map);
    }
}
