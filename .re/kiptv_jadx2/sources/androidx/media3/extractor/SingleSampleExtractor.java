package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class SingleSampleExtractor implements Extractor {
    private static final int FIXED_READ_LENGTH = 1024;
    public static final int IMAGE_TRACK_ID = 1024;
    private static final int STATE_ENDED = 2;
    private static final int STATE_READING = 1;
    private ExtractorOutput extractorOutput;
    private final int fileSignature;
    private final int fileSignatureLength;
    private final String sampleMimeType;
    private int size;
    private int state;
    private TrackOutput trackOutput;

    public SingleSampleExtractor(int i3, int i9, String str) {
        this.fileSignature = i3;
        this.fileSignatureLength = i9;
        this.sampleMimeType = str;
    }

    @RequiresNonNull({"this.extractorOutput"})
    private void outputImageTrackAndSeekMap(String str) {
        TrackOutput trackOutputTrack = this.extractorOutput.track(1024, 4);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(new Format.Builder().setContainerMimeType(str).setSampleMimeType(str).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SingleSampleSeekMap(C.TIME_UNSET));
        this.state = 1;
    }

    private void readSegment(ExtractorInput extractorInput) {
        TrackOutput trackOutput = this.trackOutput;
        trackOutput.getClass();
        int iSampleData = trackOutput.sampleData((DataReader) extractorInput, 1024, true);
        if (iSampleData != -1) {
            this.size += iSampleData;
            return;
        }
        this.state = 2;
        this.trackOutput.sampleMetadata(0L, 1, this.size, 0, null);
        this.size = 0;
    }

    @Override
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        outputImageTrackAndSeekMap(this.sampleMimeType);
    }

    @Override
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i3 = this.state;
        if (i3 == 1) {
            readSegment(extractorInput);
            return 0;
        }
        if (i3 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override
    public void release() {
    }

    @Override
    public void seek(long j, long j9) {
        if (j == 0 || this.state == 1) {
            this.state = 1;
            this.size = 0;
        }
    }

    @Override
    public boolean sniff(ExtractorInput extractorInput) {
        AbstractC1864o0.Y((this.fileSignature == -1 || this.fileSignatureLength == -1) ? false : true);
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.fileSignatureLength);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.fileSignatureLength);
        return parsableByteArray.readUnsignedShort() == this.fileSignature;
    }
}
