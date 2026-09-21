package Z;

import Q0.C0770e;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.ts.TsExtractor;
import p020c0.C1700q;

public abstract class AbstractC1149h0 {

    public static final int[] f12411a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 131, 132, 133, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, TsExtractor.TS_STREAM_TYPE_E_AC3, TsExtractor.TS_STREAM_TYPE_DTS_HD, 137, TsExtractor.TS_STREAM_TYPE_DTS, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 140, 141};

    public static boolean a(int i3, int i9) {
        if (i3 != 0) {
            return i3 == i9;
        }
        throw null;
    }

    public static void b(int i3, C1700q c1700q, int i9, C0770e c0770e) {
        c1700q.n0(Integer.valueOf(i3));
        c1700q.b(Integer.valueOf(i9), c0770e);
    }

    public static int c(int i3) {
        if (i3 != 0) {
            return i3 - 1;
        }
        throw null;
    }

    public static int[] d(int i3) {
        int[] iArr = new int[i3];
        System.arraycopy(f12411a, 0, iArr, 0, i3);
        return iArr;
    }
}
