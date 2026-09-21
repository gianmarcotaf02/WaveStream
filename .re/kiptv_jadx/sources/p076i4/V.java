package p076i4;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {
    public static int b(int i3, int i9) {
        if (i9 < 0) {
            throw new java.lang.IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i9 <= i3) {
            return i3;
        }
        int iHighestOneBit = i3 + (i3 >> 1) + 1;
        if (iHighestOneBit < i9) {
            iHighestOneBit = java.lang.Integer.highestOneBit(i9 - 1) << 1;
        }
        return iHighestOneBit < 0 ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : iHighestOneBit;
    }

    public abstract p076i4.V a(java.lang.Object obj);
}
