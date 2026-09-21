package androidx.media3.extractor.png;

import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;

public final class PngExtractor implements Extractor {
    private static final int PNG_FILE_SIGNATURE = 35152;
    private static final int PNG_FILE_SIGNATURE_LENGTH = 2;
    private final SingleSampleExtractor imageExtractor = new SingleSampleExtractor(PNG_FILE_SIGNATURE, 2, MimeTypes.IMAGE_PNG);

    @Override
    public void init(ExtractorOutput extractorOutput) {
        this.imageExtractor.init(extractorOutput);
    }

    @Override
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.imageExtractor.read(extractorInput, positionHolder);
    }

    @Override
    public void release() {
    }

    @Override
    public void seek(long j, long j9) {
        this.imageExtractor.seek(j, j9);
    }

    @Override
    public boolean sniff(ExtractorInput extractorInput) {
        return this.imageExtractor.sniff(extractorInput);
    }
}
