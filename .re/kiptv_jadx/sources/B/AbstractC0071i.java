package B;

/* JADX INFO: renamed from: B.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0071i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B.C0064b f536a = new B.C0064b(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B.C0064b f537b = new B.C0064b(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B.C0066d f538c = new B.C0066d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B.C0067e f539d = new B.C0067e(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B.C0067e f540e = new B.C0067e(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B.C0067e f541f = new B.C0067e(2);

    static {
        new B.C0067e(1);
    }

    public static void a(int i3, int[] iArr, int[] iArr2, boolean z6) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float f9 = (i3 - i10) / 2;
        if (!z6) {
            int length = iArr.length;
            int i12 = 0;
            while (i9 < length) {
                int i13 = iArr[i9];
                iArr2[i12] = java.lang.Math.round(f9);
                f9 += i13;
                i9++;
                i12++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = java.lang.Math.round(f9);
            f9 += i14;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z6) {
        int i3 = 0;
        if (!z6) {
            int length = iArr.length;
            int i9 = 0;
            int i10 = 0;
            while (i3 < length) {
                int i11 = iArr[i3];
                iArr2[i9] = i10;
                i10 += i11;
                i3++;
                i9++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i12 = iArr[length2];
            iArr2[length2] = i3;
            i3 += i12;
        }
    }

    public static void c(int i3, int[] iArr, int[] iArr2, boolean z6) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int i12 = i3 - i10;
        if (!z6) {
            int length = iArr.length;
            int i13 = 0;
            while (i9 < length) {
                int i14 = iArr[i9];
                iArr2[i13] = i12;
                i12 += i14;
                i9++;
                i13++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = iArr[length2];
            iArr2[length2] = i12;
            i12 += i15;
        }
    }

    public static void d(int i3, int[] iArr, int[] iArr2, boolean z6) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float length = iArr.length == 0 ? 0.0f : (i3 - i10) / iArr.length;
        float f9 = length / 2;
        if (!z6) {
            int length2 = iArr.length;
            int i12 = 0;
            while (i9 < length2) {
                int i13 = iArr[i9];
                iArr2[i12] = java.lang.Math.round(f9);
                f9 += i13 + length;
                i9++;
                i12++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i14 = iArr[length3];
            iArr2[length3] = java.lang.Math.round(f9);
            f9 += i14 + length;
        }
    }

    public static void e(int i3, int[] iArr, int[] iArr2, boolean z6) {
        if (iArr.length == 0) {
            return;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float fMax = (i3 - i10) / java.lang.Math.max(iArr.length - 1, 1);
        float f9 = (z6 && iArr.length == 1) ? fMax : 0.0f;
        if (z6) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i12 = iArr[length];
                iArr2[length] = java.lang.Math.round(f9);
                f9 += i12 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i13 = 0;
        while (i9 < length2) {
            int i14 = iArr[i9];
            iArr2[i13] = java.lang.Math.round(f9);
            f9 += i14 + fMax;
            i9++;
            i13++;
        }
    }

    public static void f(int i3, int[] iArr, int[] iArr2, boolean z6) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        float length = (i3 - i10) / (iArr.length + 1);
        if (z6) {
            float f9 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i12 = iArr[length2];
                iArr2[length2] = java.lang.Math.round(f9);
                f9 += i12 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f10 = length;
        int i13 = 0;
        while (i9 < length3) {
            int i14 = iArr[i9];
            iArr2[i13] = java.lang.Math.round(f10);
            f10 += i14 + length;
            i9++;
            i13++;
        }
    }

    public static B.C0069g g(float f9) {
        return new B.C0069g(f9, new B.C0063a(1));
    }

    public static B.C0069g h(float f9) {
        return new B.C0069g(f9, new B.C0063a(0));
    }
}
