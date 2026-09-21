package p020c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class M0 {
    public static final int a(int[] iArr, int i3) {
        return iArr[(i3 * 5) + 3];
    }

    public static final int b(java.util.ArrayList arrayList, int i3, int i9) {
        int iE = e(arrayList, i3, i9);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int c(int[] iArr, int i3) {
        int i9 = i3 * 5;
        return java.lang.Integer.bitCount(iArr[i9 + 1] >> 28) + iArr[i9 + 4];
    }

    public static final void d(int i3, int i9, int[] iArr) {
        if (i9 >= 0) {
        }
        int i10 = (i3 * 5) + 1;
        iArr[i10] = i9 | (iArr[i10] & (-67108864));
    }

    public static final int e(java.util.ArrayList arrayList, int i3, int i9) {
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int i12 = ((p020c0.C1668a) arrayList.get(i11)).f18215a;
            if (i12 < 0) {
                i12 += i9;
            }
            int iF = kotlin.jvm.internal.m.f(i12, i3);
            if (iF < 0) {
                i10 = i11 + 1;
            } else {
                if (iF <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void f() {
        throw new java.util.ConcurrentModificationException();
    }
}
