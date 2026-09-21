package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;
import java.util.Map;

public class ForwardingExtractorsFactory implements ExtractorsFactory {
    private final ExtractorsFactory factory;

    public ForwardingExtractorsFactory(ExtractorsFactory extractorsFactory) {
        this.factory = extractorsFactory;
    }

    @Override
    public Extractor[] createExtractors() {
        return this.factory.createExtractors();
    }

    @Override
    public ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i3) {
        return this.factory.experimentalSetCodecsToParseWithinGopSampleDependencies(i3);
    }

    @Override
    public ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z6) {
        return this.factory.experimentalSetTextTrackTranscodingEnabled(z6);
    }

    @Override
    public ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return this.factory.setSubtitleParserFactory(factory);
    }

    @Override
    public Extractor[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return this.factory.createExtractors(uri, map);
    }
}
