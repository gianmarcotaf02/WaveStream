package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

public final class SubtitleTranscodingExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput delegate;
    private boolean hasTracksOtherThanTextAndMetadata;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final SparseArray<SubtitleTranscodingTrackOutput> textTrackOutputs = new SparseArray<>();

    public SubtitleTranscodingExtractorOutput(ExtractorOutput extractorOutput, SubtitleParser.Factory factory) {
        this.delegate = extractorOutput;
        this.subtitleParserFactory = factory;
    }

    @Override
    public void endTracks() {
        this.delegate.endTracks();
        if (this.hasTracksOtherThanTextAndMetadata) {
            for (int i3 = 0; i3 < this.textTrackOutputs.size(); i3++) {
                this.textTrackOutputs.valueAt(i3).shouldSuppressParsingErrors(true);
            }
        }
    }

    public void resetSubtitleParsers() {
        for (int i3 = 0; i3 < this.textTrackOutputs.size(); i3++) {
            this.textTrackOutputs.valueAt(i3).resetSubtitleParser();
        }
    }

    @Override
    public void seekMap(SeekMap seekMap) {
        this.delegate.seekMap(seekMap);
    }

    @Override
    public TrackOutput track(int i3, int i9) {
        if (i9 != 3 && i9 != 5) {
            this.hasTracksOtherThanTextAndMetadata = true;
        }
        if (i9 != 3) {
            return this.delegate.track(i3, i9);
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = this.textTrackOutputs.get(i3);
        if (subtitleTranscodingTrackOutput != null) {
            return subtitleTranscodingTrackOutput;
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput2 = new SubtitleTranscodingTrackOutput(this.delegate.track(i3, i9), this.subtitleParserFactory);
        this.textTrackOutputs.put(i3, subtitleTranscodingTrackOutput2);
        return subtitleTranscodingTrackOutput2;
    }
}
