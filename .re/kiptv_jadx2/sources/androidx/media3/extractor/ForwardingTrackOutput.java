package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;

public class ForwardingTrackOutput implements TrackOutput {
    private final TrackOutput trackOutput;

    public ForwardingTrackOutput(TrackOutput trackOutput) {
        this.trackOutput = trackOutput;
    }

    @Override
    public void durationUs(long j) {
        this.trackOutput.durationUs(j);
    }

    @Override
    public void format(Format format) {
        this.trackOutput.format(format);
    }

    @Override
    public int sampleData(DataReader dataReader, int i3, boolean z6) {
        return this.trackOutput.sampleData(dataReader, i3, z6);
    }

    @Override
    public void sampleMetadata(long j, int i3, int i9, int i10, TrackOutput.CryptoData cryptoData) {
        this.trackOutput.sampleMetadata(j, i3, i9, i10, cryptoData);
    }

    @Override
    public void sampleData(ParsableByteArray parsableByteArray, int i3) {
        this.trackOutput.sampleData(parsableByteArray, i3);
    }

    @Override
    public int sampleData(DataReader dataReader, int i3, boolean z6, int i9) {
        return this.trackOutput.sampleData(dataReader, i3, z6, i9);
    }

    @Override
    public void sampleData(ParsableByteArray parsableByteArray, int i3, int i9) {
        this.trackOutput.sampleData(parsableByteArray, i3, i9);
    }
}
