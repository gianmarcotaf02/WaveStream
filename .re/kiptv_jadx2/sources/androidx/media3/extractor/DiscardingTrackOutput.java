package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import java.io.EOFException;

public final class DiscardingTrackOutput implements TrackOutput {
    private final byte[] readBuffer = new byte[4096];

    @Override
    public void format(Format format) {
    }

    @Override
    public int sampleData(DataReader dataReader, int i3, boolean z6, int i9) throws EOFException {
        int i10 = dataReader.read(this.readBuffer, 0, Math.min(this.readBuffer.length, i3));
        if (i10 != -1) {
            return i10;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override
    public void sampleMetadata(long j, int i3, int i9, int i10, TrackOutput.CryptoData cryptoData) {
    }

    @Override
    public void sampleData(ParsableByteArray parsableByteArray, int i3, int i9) {
        parsableByteArray.skipBytes(i3);
    }
}
