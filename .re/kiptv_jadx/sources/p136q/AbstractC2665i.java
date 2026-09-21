package p136q;

/* JADX INFO: renamed from: q.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2665i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f26394a;

    static {
        long[] jArr = p136q.P.f26351a;
        int iD = p136q.P.d(0);
        int iMax = iD > 0 ? java.lang.Math.max(7, p136q.P.c(iD)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p078i6.m.j0(jArr, -9187201950435737472L);
        }
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        float[] fArr = new float[iMax];
        f26394a = new float[0];
    }
}
