package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;

final class VarintReader {
    private static final int STATE_BEGIN_READING = 0;
    private static final int STATE_READ_CONTENTS = 1;
    private static final long[] VARINT_LENGTH_MASKS = {128, 64, 32, 16, 8, 4, 2, 1};
    private int length;
    private final byte[] scratch = new byte[8];
    private int state;

    public static long assembleVarint(byte[] bArr, int i3, boolean z6) {
        long j = ((long) bArr[0]) & 255;
        if (z6) {
            j &= ~VARINT_LENGTH_MASKS[i3 - 1];
        }
        for (int i9 = 1; i9 < i3; i9++) {
            j = (j << 8) | (((long) bArr[i9]) & 255);
        }
        return j;
    }

    public static int parseUnsignedVarintLength(int i3) {
        int i9 = 0;
        while (true) {
            long[] jArr = VARINT_LENGTH_MASKS;
            if (i9 >= jArr.length) {
                return -1;
            }
            if ((jArr[i9] & ((long) i3)) != 0) {
                return i9 + 1;
            }
            i9++;
        }
    }

    public int getLastLength() {
        return this.length;
    }

    public long readUnsignedVarint(ExtractorInput extractorInput, boolean z6, boolean z9, int i3) {
        if (this.state == 0) {
            if (!extractorInput.readFully(this.scratch, 0, 1, z6)) {
                return -1L;
            }
            int unsignedVarintLength = parseUnsignedVarintLength(this.scratch[0] & 255);
            this.length = unsignedVarintLength;
            if (unsignedVarintLength == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.state = 1;
        }
        int i9 = this.length;
        if (i9 > i3) {
            this.state = 0;
            return -2L;
        }
        if (i9 != 1) {
            extractorInput.readFully(this.scratch, 1, i9 - 1);
        }
        this.state = 0;
        return assembleVarint(this.scratch, this.length, z9);
    }

    public void reset() {
        this.state = 0;
        this.length = 0;
    }
}
