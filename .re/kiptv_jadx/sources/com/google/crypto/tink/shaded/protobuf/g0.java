package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.g0 f19531f = new com.google.crypto.tink.shaded.protobuf.g0(0, new int[0], new java.lang.Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f19533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f19534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19535d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19536e;

    public g0(int i3, int[] iArr, java.lang.Object[] objArr, boolean z6) {
        this.f19532a = i3;
        this.f19533b = iArr;
        this.f19534c = objArr;
        this.f19536e = z6;
    }

    public static com.google.crypto.tink.shaded.protobuf.g0 c() {
        return new com.google.crypto.tink.shaded.protobuf.g0(0, new int[8], new java.lang.Object[8], true);
    }

    public final void a(int i3) {
        int[] iArr = this.f19533b;
        if (i3 > iArr.length) {
            int i9 = this.f19532a;
            int i10 = (i9 / 2) + i9;
            if (i10 >= i3) {
                i3 = i10;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f19533b = java.util.Arrays.copyOf(iArr, i3);
            this.f19534c = java.util.Arrays.copyOf(this.f19534c, i3);
        }
    }

    public final int b() {
        int iM;
        int iO;
        int I9;
        int i3 = this.f19535d;
        if (i3 != -1) {
            return i3;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f19532a; i10++) {
            int i11 = this.f19533b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((java.lang.Long) this.f19534c[i10]).getClass();
                    I9 = com.google.crypto.tink.shaded.protobuf.C1918m.I(i12);
                } else if (i13 == 2) {
                    I9 = com.google.crypto.tink.shaded.protobuf.C1918m.F(i12, (com.google.crypto.tink.shaded.protobuf.AbstractC1915j) this.f19534c[i10]);
                } else if (i13 == 3) {
                    iM = com.google.crypto.tink.shaded.protobuf.C1918m.M(i12) * 2;
                    iO = ((com.google.crypto.tink.shaded.protobuf.g0) this.f19534c[i10]).b();
                } else {
                    if (i13 != 5) {
                        throw new java.lang.IllegalStateException(com.google.crypto.tink.shaded.protobuf.D.c());
                    }
                    ((java.lang.Integer) this.f19534c[i10]).getClass();
                    I9 = com.google.crypto.tink.shaded.protobuf.C1918m.H(i12);
                }
                i9 = I9 + i9;
            } else {
                long jLongValue = ((java.lang.Long) this.f19534c[i10]).longValue();
                iM = com.google.crypto.tink.shaded.protobuf.C1918m.M(i12);
                iO = com.google.crypto.tink.shaded.protobuf.C1918m.O(jLongValue);
            }
            i9 = iO + iM + i9;
        }
        this.f19535d = i9;
        return i9;
    }

    public final void d(int i3, java.lang.Object obj) {
        if (!this.f19536e) {
            throw new java.lang.UnsupportedOperationException();
        }
        a(this.f19532a + 1);
        int[] iArr = this.f19533b;
        int i9 = this.f19532a;
        iArr[i9] = i3;
        this.f19534c[i9] = obj;
        this.f19532a = i9 + 1;
    }

    public final void e(com.google.crypto.tink.shaded.protobuf.M m8) {
        if (this.f19532a == 0) {
            return;
        }
        m8.getClass();
        for (int i3 = 0; i3 < this.f19532a; i3++) {
            int i9 = this.f19533b[i3];
            java.lang.Object obj = this.f19534c[i3];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            com.google.crypto.tink.shaded.protobuf.C1918m c1918m = (com.google.crypto.tink.shaded.protobuf.C1918m) m8.f19486a;
            if (i11 == 0) {
                c1918m.Y(i10, ((java.lang.Long) obj).longValue());
            } else if (i11 == 1) {
                c1918m.T(i10, ((java.lang.Long) obj).longValue());
            } else if (i11 == 2) {
                m8.a(i10, (com.google.crypto.tink.shaded.protobuf.AbstractC1915j) obj);
            } else if (i11 == 3) {
                c1918m.W(i10, 3);
                ((com.google.crypto.tink.shaded.protobuf.g0) obj).e(m8);
                c1918m.W(i10, 4);
            } else {
                if (i11 != 5) {
                    throw new java.lang.RuntimeException(com.google.crypto.tink.shaded.protobuf.D.c());
                }
                c1918m.R(i10, ((java.lang.Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.crypto.tink.shaded.protobuf.g0)) {
            return false;
        }
        com.google.crypto.tink.shaded.protobuf.g0 g0Var = (com.google.crypto.tink.shaded.protobuf.g0) obj;
        int i3 = this.f19532a;
        if (i3 == g0Var.f19532a) {
            int[] iArr = this.f19533b;
            int[] iArr2 = g0Var.f19533b;
            for (int i9 = 0; i9 < i3; i9++) {
                if (iArr[i9] == iArr2[i9]) {
                }
            }
            java.lang.Object[] objArr = this.f19534c;
            java.lang.Object[] objArr2 = g0Var.f19534c;
            int i10 = this.f19532a;
            for (int i11 = 0; i11 < i10; i11++) {
                if (objArr[i11].equals(objArr2[i11])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f19532a;
        int i9 = (527 + i3) * 31;
        int[] iArr = this.f19533b;
        int iHashCode = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i9 + i10) * 31;
        java.lang.Object[] objArr = this.f19534c;
        int i13 = this.f19532a;
        for (int i14 = 0; i14 < i13; i14++) {
            iHashCode = (iHashCode * 31) + objArr[i14].hashCode();
        }
        return i12 + iHashCode;
    }
}
