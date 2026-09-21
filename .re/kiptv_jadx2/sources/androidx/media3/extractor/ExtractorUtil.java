package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.container.OpusUtil;
import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;

public final class ExtractorUtil {
    private ExtractorUtil() {
    }

    @Pure
    public static void checkContainerInput(boolean z6, String str) throws ParserException {
        if (!z6) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }

    public static int getMaximumEncodedRateBytesPerSecond(int i3) {
        if (i3 == 20) {
            return OpusUtil.MAX_BYTES_PER_SECOND;
        }
        if (i3 == 30) {
            return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
        }
        switch (i3) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
                return 768000;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return 7000;
            default:
                switch (i3) {
                    case 14:
                        return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
                    case 15:
                        return 8000;
                    case 16:
                        return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
                    case 17:
                        return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
                    case 18:
                        return 768000;
                    default:
                        return C.RATE_UNSET_INT;
                }
        }
    }

    public static boolean peekFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i3, int i9, boolean z6) throws EOFException {
        try {
            return extractorInput.peekFully(bArr, i3, i9, z6);
        } catch (EOFException e6) {
            if (z6) {
                return false;
            }
            throw e6;
        }
    }

    public static int peekToLength(ExtractorInput extractorInput, byte[] bArr, int i3, int i9) {
        int i10 = 0;
        while (i10 < i9) {
            int iPeek = extractorInput.peek(bArr, i3 + i10, i9 - i10);
            if (iPeek == -1) {
                break;
            }
            i10 += iPeek;
        }
        return i10;
    }

    public static boolean readFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i3, int i9) {
        try {
            extractorInput.readFully(bArr, i3, i9);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(ExtractorInput extractorInput, int i3) {
        try {
            extractorInput.skipFully(i3);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
