package androidx.media3.extractor.avif;

import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;

public final class AvifExtractor implements Extractor {
    private static final int AVIF_FILE_SIGNATURE_PART_1 = 1718909296;
    private static final int AVIF_FILE_SIGNATURE_PART_2 = 1635150182;
    private static final int FILE_SIGNATURE_SEGMENT_LENGTH = 4;
    private final ParsableByteArray scratch = new ParsableByteArray(4);
    private final SingleSampleExtractor imageExtractor = new SingleSampleExtractor(-1, -1, MimeTypes.IMAGE_AVIF);

    private boolean readAndCompareFourBytes(ExtractorInput extractorInput, int i3) {
        this.scratch.reset(4);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        return this.scratch.readUnsignedInt() == ((long) i3);
    }

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
        extractorInput.advancePeekPosition(4);
        return readAndCompareFourBytes(extractorInput, 1718909296) && readAndCompareFourBytes(extractorInput, AVIF_FILE_SIGNATURE_PART_2);
    }
}
