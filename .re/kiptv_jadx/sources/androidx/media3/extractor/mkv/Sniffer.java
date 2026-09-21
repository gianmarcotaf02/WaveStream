package androidx.media3.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final androidx.media3.common.util.ParsableByteArray scratch = new androidx.media3.common.util.ParsableByteArray(8);

    private long readUint(androidx.media3.extractor.ExtractorInput extractorInput) {
        int i3 = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i9 = this.scratch.getData()[0] & 255;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int i10 = 128;
        int i11 = 0;
        while ((i9 & i10) == 0) {
            i10 >>= 1;
            i11++;
        }
        int i12 = i9 & (~i10);
        extractorInput.peekFully(this.scratch.getData(), 1, i11);
        while (i3 < i11) {
            i3++;
            i12 = (this.scratch.getData()[i3] & 255) + (i12 << 8);
        }
        this.peekLength = i11 + 1 + this.peekLength;
        return i12;
    }

    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
        long length = extractorInput.getLength();
        long j = androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (length != -1 && length <= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = length;
        }
        int i3 = (int) j;
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long unsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (unsignedInt != 440786851) {
            int i9 = this.peekLength + 1;
            this.peekLength = i9;
            if (i9 == i3) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | ((long) (this.scratch.getData()[0] & 255));
        }
        long uint = readUint(extractorInput);
        long j9 = this.peekLength;
        if (uint != Long.MIN_VALUE && (length == -1 || j9 + uint < length)) {
            while (true) {
                int i10 = this.peekLength;
                long j10 = j9 + uint;
                if (i10 < j10) {
                    if (readUint(extractorInput) == Long.MIN_VALUE) {
                        return false;
                    }
                    long uint2 = readUint(extractorInput);
                    if (uint2 < 0 || uint2 > 2147483647L) {
                        return false;
                    }
                    if (uint2 != 0) {
                        int i11 = (int) uint2;
                        extractorInput.advancePeekPosition(i11);
                        this.peekLength += i11;
                    }
                } else if (i10 == j10) {
                    return true;
                }
            }
        }
        return false;
    }
}
