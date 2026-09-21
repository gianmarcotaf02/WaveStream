package androidx.media3.extractor.mp4;

import androidx.media3.common.C;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.extractor.ts.PsExtractor;

public final class SmtaAtomUtil {
    private static final int CAMCORDER_FRC_SUPERSLOW_MOTION = 9;
    private static final int CAMCORDER_FRC_SUPERSLOW_MOTION_HEVC = 22;
    private static final int CAMCORDER_NORMAL = 0;
    private static final int CAMCORDER_QFRC_SUPERSLOW_MOTION = 23;
    private static final int CAMCORDER_SINGLE_SUPERSLOW_MOTION = 7;
    private static final int CAMCORDER_SLOW_MOTION_V2 = 12;
    private static final int CAMCORDER_SLOW_MOTION_V2_120 = 13;
    private static final int CAMCORDER_SLOW_MOTION_V2_HEVC = 21;
    private static final int NO_VALUE = -1;

    private SmtaAtomUtil() {
    }

    private static int getCaptureFrameRate(int i3, ParsableByteArray parsableByteArray, int i9) {
        if (i3 == 12) {
            return PsExtractor.VIDEO_STREAM_MASK;
        }
        if (i3 == 13) {
            return 120;
        }
        if (i3 == 21 && parsableByteArray.bytesLeft() >= 8 && parsableByteArray.getPosition() + 8 <= i9) {
            int i10 = parsableByteArray.readInt();
            int i11 = parsableByteArray.readInt();
            if (i10 >= 12 && i11 == 1936877170) {
                return parsableByteArray.readUnsignedFixedPoint1616();
            }
        }
        return C.RATE_UNSET_INT;
    }

    public static Metadata parseSmta(ParsableByteArray parsableByteArray, int i3) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i3) {
            int position = parsableByteArray.getPosition();
            int i9 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (i9 < 16) {
                    return null;
                }
                parsableByteArray.skipBytes(4);
                int i10 = -1;
                int i11 = 0;
                for (int i12 = 0; i12 < 2; i12++) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte == 0) {
                        i10 = unsignedByte2;
                    } else if (unsignedByte == 1) {
                        i11 = unsignedByte2;
                    }
                }
                int captureFrameRate = getCaptureFrameRate(i10, parsableByteArray, i3);
                if (captureFrameRate == -2147483647) {
                    return null;
                }
                return new Metadata(new SmtaMetadataEntry(captureFrameRate, i11));
            }
            parsableByteArray.setPosition(position + i9);
        }
        return null;
    }
}
