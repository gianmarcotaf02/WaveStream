package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.C1504k;
import java.util.Arrays;

public final class X0 {

    public static final X0 f19300f = new X0(0, new int[0], new Object[0], false);

    public int f19301a;

    public int[] f19302b;

    public Object[] f19303c;

    public int f19304d = -1;

    public boolean f19305e;

    public X0(int i3, int[] iArr, Object[] objArr, boolean z6) {
        this.f19301a = i3;
        this.f19302b = iArr;
        this.f19303c = objArr;
        this.f19305e = z6;
    }

    public static X0 b() {
        return new X0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iU;
        int iV;
        int iU2;
        int i3 = this.f19304d;
        if (i3 != -1) {
            return i3;
        }
        int iD = 0;
        for (int i9 = 0; i9 < this.f19301a; i9++) {
            int i10 = this.f19302b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = i11 << 3;
                        AbstractC1859m0 abstractC1859m0 = (AbstractC1859m0) this.f19303c[i9];
                        int iU3 = C1866p0.U(i13);
                        int iN = abstractC1859m0.n();
                        iD = M0.d(iN, iN, iU3, iD);
                    } else if (i12 == 3) {
                        int iU4 = C1866p0.U(i11 << 3);
                        iU = iU4 + iU4;
                        iV = ((X0) this.f19303c[i9]).a();
                    } else {
                        if (i12 != 5) {
                            throw new IllegalStateException(new C0());
                        }
                        ((Integer) this.f19303c[i9]).getClass();
                        iU2 = C1866p0.U(i11 << 3) + 4;
                    }
                } else {
                    ((Long) this.f19303c[i9]).getClass();
                    iU2 = C1866p0.U(i11 << 3) + 8;
                }
                iD = iU2 + iD;
            } else {
                int i14 = i11 << 3;
                long jLongValue = ((Long) this.f19303c[i9]).longValue();
                iU = C1866p0.U(i14);
                iV = C1866p0.V(jLongValue);
            }
            iD = iV + iU + iD;
        }
        this.f19304d = iD;
        return iD;
    }

    public final void c(int i3, Object obj) {
        if (!this.f19305e) {
            throw new UnsupportedOperationException();
        }
        e(this.f19301a + 1);
        int[] iArr = this.f19302b;
        int i9 = this.f19301a;
        iArr[i9] = i3;
        this.f19303c[i9] = obj;
        this.f19301a = i9 + 1;
    }

    public final void d(G0 g9) throws C1504k {
        if (this.f19301a != 0) {
            for (int i3 = 0; i3 < this.f19301a; i3++) {
                int i9 = this.f19302b[i3];
                Object obj = this.f19303c[i3];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    ((C1866p0) g9.f19215a).S(i11, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    ((C1866p0) g9.f19215a).L(i11, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    AbstractC1859m0 abstractC1859m0 = (AbstractC1859m0) obj;
                    C1866p0 c1866p0 = (C1866p0) g9.f19215a;
                    c1866p0.R((i11 << 3) | 2);
                    c1866p0.R(abstractC1859m0.n());
                    abstractC1859m0.p(c1866p0);
                } else if (i10 == 3) {
                    ((C1866p0) g9.f19215a).P(i11, 3);
                    ((X0) obj).d(g9);
                    ((C1866p0) g9.f19215a).P(i11, 4);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(new C0());
                    }
                    ((C1866p0) g9.f19215a).J(i11, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i3) {
        int[] iArr = this.f19302b;
        if (i3 > iArr.length) {
            int i9 = this.f19301a;
            int i10 = (i9 / 2) + i9;
            if (i10 >= i3) {
                i3 = i10;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f19302b = Arrays.copyOf(iArr, i3);
            this.f19303c = Arrays.copyOf(this.f19303c, i3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof X0)) {
            return false;
        }
        X0 x9 = (X0) obj;
        int i3 = this.f19301a;
        if (i3 == x9.f19301a) {
            int[] iArr = this.f19302b;
            int[] iArr2 = x9.f19302b;
            for (int i9 = 0; i9 < i3; i9++) {
                if (iArr[i9] == iArr2[i9]) {
                }
            }
            Object[] objArr = this.f19303c;
            Object[] objArr2 = x9.f19303c;
            int i10 = this.f19301a;
            for (int i11 = 0; i11 < i10; i11++) {
                if (objArr[i11].equals(objArr2[i11])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f19301a;
        int i9 = i3 + 527;
        int[] iArr = this.f19302b;
        int iHashCode = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i9 * 31) + i10) * 31;
        Object[] objArr = this.f19303c;
        int i13 = this.f19301a;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return i12 + iHashCode;
    }
}
