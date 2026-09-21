package p076i4;

import androidx.media3.common.util.Log;

public abstract class V {
    public static int b(int i3, int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i9 <= i3) {
            return i3;
        }
        int iHighestOneBit = i3 + (i3 >> 1) + 1;
        if (iHighestOneBit < i9) {
            iHighestOneBit = Integer.highestOneBit(i9 - 1) << 1;
        }
        return iHighestOneBit < 0 ? Log.LOG_LEVEL_OFF : iHighestOneBit;
    }

    public abstract V a(Object obj);
}
