package androidx.media3.extractor.heif;

/* JADX INFO: loaded from: classes.dex */
final class HeifSniffer {
    private HeifSniffer() {
    }

    public static boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput, boolean z6) {
        int i3;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(16);
        boolean z9 = true;
        while (true) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.getData(), 0, 8, true)) {
                return false;
            }
            long unsignedInt = parsableByteArray.readUnsignedInt();
            int i9 = parsableByteArray.readInt();
            if (unsignedInt != 1) {
                i3 = 8;
            } else {
                if (!extractorInput.peekFully(parsableByteArray.getData(), 8, 8, true)) {
                    return false;
                }
                unsignedInt = parsableByteArray.readUnsignedLongToLong();
                i3 = 16;
            }
            long j = i3;
            if (unsignedInt < j) {
                return false;
            }
            int i10 = (int) (unsignedInt - j);
            if (z9) {
                if (i9 != 1718909296 || i10 < 8) {
                    return false;
                }
                parsableByteArray.reset(4);
                extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
                if (parsableByteArray.readInt() != 1751476579) {
                    return false;
                }
                if (!z6) {
                    return true;
                }
                extractorInput.advancePeekPosition(i10 - 4);
                z9 = false;
            } else {
                if (i9 == 1836086884) {
                    return true;
                }
                if (i10 != 0) {
                    extractorInput.advancePeekPosition(i10);
                }
            }
        }
    }
}
