package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;

public interface ChunkExtractor {

    public interface Factory {
        ChunkExtractor createProgressiveMediaExtractor(int i3, Format format, boolean z6, List<Format> list, TrackOutput trackOutput, PlayerId playerId);

        default Factory experimentalParseSubtitlesDuringExtraction(boolean z6) {
            return this;
        }

        default Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i3) {
            return this;
        }

        default Format getOutputTextFormat(Format format) {
            return format;
        }

        default Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }
    }

    public interface TrackOutputProvider {
        TrackOutput track(int i3, int i9);
    }

    ChunkIndex getChunkIndex();

    Format[] getSampleFormats();

    void init(TrackOutputProvider trackOutputProvider, long j, long j9);

    boolean read(ExtractorInput extractorInput);

    void release();
}
