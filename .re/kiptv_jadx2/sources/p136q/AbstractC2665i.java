package p136q;

import p078i6.m;

public abstract class AbstractC2665i {

    public static final float[] f26394a;

    static {
        long[] jArr = P.f26351a;
        int iD = P.d(0);
        int iMax = iD > 0 ? Math.max(7, P.c(iD)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            m.j0(jArr, -9187201950435737472L);
        }
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        float[] fArr = new float[iMax];
        f26394a = new float[0];
    }
}
