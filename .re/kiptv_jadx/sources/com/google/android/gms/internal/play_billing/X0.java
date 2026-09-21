package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class X0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.X0 f19300f = new com.google.android.gms.internal.play_billing.X0(0, new int[0], new java.lang.Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f19302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f19303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19304d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19305e;

    public X0(int i3, int[] iArr, java.lang.Object[] objArr, boolean z6) {
        this.f19301a = i3;
        this.f19302b = iArr;
        this.f19303c = objArr;
        this.f19305e = z6;
    }

    public static com.google.android.gms.internal.play_billing.X0 b() {
        return new com.google.android.gms.internal.play_billing.X0(0, new int[8], new java.lang.Object[8], true);
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
                        com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) this.f19303c[i9];
                        int iU3 = com.google.android.gms.internal.play_billing.C1866p0.U(i13);
                        int iN = abstractC1859m0.n();
                        iD = com.google.android.gms.internal.play_billing.M0.d(iN, iN, iU3, iD);
                    } else if (i12 == 3) {
                        int iU4 = com.google.android.gms.internal.play_billing.C1866p0.U(i11 << 3);
                        iU = iU4 + iU4;
                        iV = ((com.google.android.gms.internal.play_billing.X0) this.f19303c[i9]).a();
                    } else {
                        if (i12 != 5) {
                            throw new java.lang.IllegalStateException(new com.google.android.gms.internal.play_billing.C0());
                        }
                        ((java.lang.Integer) this.f19303c[i9]).getClass();
                        iU2 = com.google.android.gms.internal.play_billing.C1866p0.U(i11 << 3) + 4;
                    }
                } else {
                    ((java.lang.Long) this.f19303c[i9]).getClass();
                    iU2 = com.google.android.gms.internal.play_billing.C1866p0.U(i11 << 3) + 8;
                }
                iD = iU2 + iD;
            } else {
                int i14 = i11 << 3;
                long jLongValue = ((java.lang.Long) this.f19303c[i9]).longValue();
                iU = com.google.android.gms.internal.play_billing.C1866p0.U(i14);
                iV = com.google.android.gms.internal.play_billing.C1866p0.V(jLongValue);
            }
            iD = iV + iU + iD;
        }
        this.f19304d = iD;
        return iD;
    }

    public final void c(int i3, java.lang.Object obj) {
        if (!this.f19305e) {
            throw new java.lang.UnsupportedOperationException();
        }
        e(this.f19301a + 1);
        int[] iArr = this.f19302b;
        int i9 = this.f19301a;
        iArr[i9] = i3;
        this.f19303c[i9] = obj;
        this.f19301a = i9 + 1;
    }

    public final void d(com.google.android.gms.internal.play_billing.G0 g9) throws androidx.datastore.preferences.protobuf.C1504k {
        if (this.f19301a != 0) {
            for (int i3 = 0; i3 < this.f19301a; i3++) {
                int i9 = this.f19302b[i3];
                java.lang.Object obj = this.f19303c[i3];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).S(i11, ((java.lang.Long) obj).longValue());
                } else if (i10 == 1) {
                    ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).L(i11, ((java.lang.Long) obj).longValue());
                } else if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) obj;
                    com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a;
                    c1866p0.R((i11 << 3) | 2);
                    c1866p0.R(abstractC1859m0.n());
                    abstractC1859m0.p(c1866p0);
                } else if (i10 == 3) {
                    ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).P(i11, 3);
                    ((com.google.android.gms.internal.play_billing.X0) obj).d(g9);
                    ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).P(i11, 4);
                } else {
                    if (i10 != 5) {
                        throw new java.lang.RuntimeException(new com.google.android.gms.internal.play_billing.C0());
                    }
                    ((com.google.android.gms.internal.play_billing.C1866p0) g9.f19215a).J(i11, ((java.lang.Integer) obj).intValue());
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
            this.f19302b = java.util.Arrays.copyOf(iArr, i3);
            this.f19303c = java.util.Arrays.copyOf(this.f19303c, i3);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.play_billing.X0)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.X0 x9 = (com.google.android.gms.internal.play_billing.X0) obj;
        int i3 = this.f19301a;
        if (i3 == x9.f19301a) {
            int[] iArr = this.f19302b;
            int[] iArr2 = x9.f19302b;
            for (int i9 = 0; i9 < i3; i9++) {
                if (iArr[i9] == iArr2[i9]) {
                }
            }
            java.lang.Object[] objArr = this.f19303c;
            java.lang.Object[] objArr2 = x9.f19303c;
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
        java.lang.Object[] objArr = this.f19303c;
        int i13 = this.f19301a;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return i12 + iHashCode;
    }
}
