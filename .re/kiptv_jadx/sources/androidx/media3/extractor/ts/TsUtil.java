package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class TsUtil {
    private TsUtil() {
    }

    public static int findSyncBytePosition(byte[] bArr, int i3, int i9) {
        while (i3 < i9 && bArr[i3] != 71) {
            i3++;
        }
        return i3;
    }

    public static boolean isStartOfTsPacket(byte[] bArr, int i3, int i9, int i10) {
        int i11 = 0;
        for (int i12 = -4; i12 <= 4; i12++) {
            int i13 = (i12 * androidx.media3.extractor.ts.TsExtractor.TS_PACKET_SIZE) + i10;
            if (i13 < i3 || i13 >= i9 || bArr[i13] != 71) {
                i11 = 0;
            } else {
                i11++;
                if (i11 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long readPcrFromPacket(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3, int i9) {
        parsableByteArray.setPosition(i3);
        if (parsableByteArray.bytesLeft() < 5) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        int i10 = parsableByteArray.readInt();
        if ((8388608 & i10) != 0 || ((2096896 & i10) >> 8) != i9 || (i10 & 32) == 0 || parsableByteArray.readUnsignedByte() < 7 || parsableByteArray.bytesLeft() < 7 || (parsableByteArray.readUnsignedByte() & 16) != 16) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        parsableByteArray.readBytes(bArr, 0, 6);
        return readPcrValueFromPcrBytes(bArr);
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
