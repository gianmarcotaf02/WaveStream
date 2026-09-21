package Q0;

/* JADX INFO: renamed from: Q0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0784s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8468b;

    public C0784s() {
        this.f8467a = new int[10];
    }

    public int a(int i3) {
        int i9 = this.f8468b - 1;
        return i9 >= 0 ? this.f8467a[i9] : i3;
    }

    public int b() {
        int[] iArr = this.f8467a;
        int i3 = this.f8468b - 1;
        this.f8468b = i3;
        return iArr[i3];
    }

    public void c(int i3) {
        int[] iArrCopyOf = this.f8467a;
        if (this.f8468b >= iArrCopyOf.length) {
            iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f8467a = iArrCopyOf;
        }
        int i9 = this.f8468b;
        this.f8468b = i9 + 1;
        iArrCopyOf[i9] = i3;
    }

    public void d(int i3, int i9, int i10) {
        int i11 = this.f8468b;
        int[] iArrCopyOf = this.f8467a;
        int i12 = i11 + 3;
        if (i12 >= iArrCopyOf.length) {
            iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f8467a = iArrCopyOf;
        }
        iArrCopyOf[i11] = i3 + i10;
        iArrCopyOf[i11 + 1] = i9 + i10;
        iArrCopyOf[i11 + 2] = i10;
        this.f8468b = i12;
    }

    public void e(int i3, int i9, int i10, int i11) {
        int i12 = this.f8468b;
        int[] iArrCopyOf = this.f8467a;
        int i13 = i12 + 4;
        if (i13 >= iArrCopyOf.length) {
            iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f8467a = iArrCopyOf;
        }
        iArrCopyOf[i12] = i3;
        iArrCopyOf[i12 + 1] = i9;
        iArrCopyOf[i12 + 2] = i10;
        iArrCopyOf[i12 + 3] = i11;
        this.f8468b = i13;
    }

    public void f(int i3, int i9) {
        if (i3 < i9) {
            int i10 = i3 - 3;
            for (int i11 = i3; i11 < i9; i11 += 3) {
                int[] iArr = this.f8467a;
                int i12 = iArr[i11];
                int i13 = iArr[i9];
                if (i12 < i13 || (i12 == i13 && iArr[i11 + 1] <= iArr[i9 + 1])) {
                    i10 += 3;
                    g(i10, i11);
                }
            }
            g(i10 + 3, i9);
            f(i3, i10);
            f(i10 + 6, i9);
        }
    }

    public void g(int i3, int i9) {
        int[] iArr = this.f8467a;
        int i10 = iArr[i3];
        iArr[i3] = iArr[i9];
        iArr[i9] = i10;
        int i11 = i3 + 1;
        int i12 = i9 + 1;
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
        int i14 = i3 + 2;
        int i15 = i9 + 2;
        int i16 = iArr[i14];
        iArr[i14] = iArr[i15];
        iArr[i15] = i16;
    }

    public C0784s(int i3) {
        this.f8467a = new int[i3];
    }
}
