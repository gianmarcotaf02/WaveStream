package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface ExtractorsFactory {
    public static final androidx.media3.extractor.ExtractorsFactory EMPTY = new androidx.media3.extractor.a(0);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[0];
    }

    androidx.media3.extractor.Extractor[] createExtractors();

    default androidx.media3.extractor.Extractor[] createExtractors(android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        return createExtractors();
    }

    default androidx.media3.extractor.ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i3) {
        return this;
    }

    @java.lang.Deprecated
    default androidx.media3.extractor.ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z6) {
        return this;
    }

    default androidx.media3.extractor.ExtractorsFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return this;
    }
}
