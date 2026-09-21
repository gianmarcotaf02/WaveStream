package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

public final class e0 {

    public static final e0 f16194f = new e0(0, new int[0], new Object[0], false);

    public int f16195a;

    public int[] f16196b;

    public Object[] f16197c;

    public int f16198d = -1;

    public boolean f16199e;

    public e0(int i3, int[] iArr, Object[] objArr, boolean z6) {
        this.f16195a = i3;
        this.f16196b = iArr;
        this.f16197c = objArr;
        this.f16199e = z6;
    }

    public final void a(int i3) {
        int[] iArr = this.f16196b;
        if (i3 > iArr.length) {
            int i9 = this.f16195a;
            int i10 = (i9 / 2) + i9;
            if (i10 >= i3) {
                i3 = i10;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f16196b = Arrays.copyOf(iArr, i3);
            this.f16197c = Arrays.copyOf(this.f16197c, i3);
        }
    }

    public final int b() {
        int iN0;
        int iP0;
        int iN1;
        int i3 = this.f16198d;
        if (i3 != -1) {
            return i3;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f16195a; i10++) {
            int i11 = this.f16196b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f16197c[i10]).getClass();
                    iN1 = C1505l.n0(i12) + 8;
                } else if (i13 == 2) {
                    iN1 = C1505l.l0(i12, (C1500g) this.f16197c[i10]);
                } else if (i13 == 3) {
                    iN0 = C1505l.n0(i12) * 2;
                    iP0 = ((e0) this.f16197c[i10]).b();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(C1518z.b());
                    }
                    ((Integer) this.f16197c[i10]).getClass();
                    iN1 = C1505l.n0(i12) + 4;
                }
                i9 = iN1 + i9;
            } else {
                long jLongValue = ((Long) this.f16197c[i10]).longValue();
                iN0 = C1505l.n0(i12);
                iP0 = C1505l.p0(jLongValue);
            }
            i9 = iP0 + iN0 + i9;
        }
        this.f16198d = i9;
        return i9;
    }

    public final void c(int i3, Object obj) {
        if (!this.f16199e) {
            throw new UnsupportedOperationException();
        }
        a(this.f16195a + 1);
        int[] iArr = this.f16196b;
        int i9 = this.f16195a;
        iArr[i9] = i3;
        this.f16197c[i9] = obj;
        this.f16195a = i9 + 1;
    }

    public final void d(F f9) {
        if (this.f16195a == 0) {
            return;
        }
        f9.getClass();
        for (int i3 = 0; i3 < this.f16195a; i3++) {
            int i9 = this.f16196b[i3];
            Object obj = this.f16197c[i3];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            C1505l c1505l = (C1505l) f9.f16134a;
            if (i11 == 0) {
                c1505l.J0(i10, ((Long) obj).longValue());
            } else if (i11 == 1) {
                c1505l.z0(i10, ((Long) obj).longValue());
            } else if (i11 == 2) {
                c1505l.v0(i10, (C1500g) obj);
            } else if (i11 == 3) {
                c1505l.G0(i10, 3);
                ((e0) obj).d(f9);
                c1505l.G0(i10, 4);
            } else {
                if (i11 != 5) {
                    throw new RuntimeException(C1518z.b());
                }
                c1505l.x0(i10, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        int i3 = this.f16195a;
        if (i3 == e0Var.f16195a) {
            int[] iArr = this.f16196b;
            int[] iArr2 = e0Var.f16196b;
            for (int i9 = 0; i9 < i3; i9++) {
                if (iArr[i9] == iArr2[i9]) {
                }
            }
            Object[] objArr = this.f16197c;
            Object[] objArr2 = e0Var.f16197c;
            int i10 = this.f16195a;
            for (int i11 = 0; i11 < i10; i11++) {
                if (objArr[i11].equals(objArr2[i11])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f16195a;
        int i9 = (527 + i3) * 31;
        int[] iArr = this.f16196b;
        int iHashCode = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i9 + i10) * 31;
        Object[] objArr = this.f16197c;
        int i13 = this.f16195a;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return i12 + iHashCode;
    }
}
