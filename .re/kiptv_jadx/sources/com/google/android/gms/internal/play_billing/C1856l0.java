package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1856l0 extends com.google.android.gms.internal.play_billing.AbstractC1859m0 {
    public final byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f19353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19354l;

    public C1856l0(byte[] bArr, int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1859m0.r(i3, i3 + i9, bArr.length);
        this.j = bArr;
        this.f19353k = i3;
        this.f19354l = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final byte d(int i3) {
        int i9 = this.f19354l;
        if (((i9 - (i3 + 1)) | i3) >= 0) {
            return this.j[this.f19353k + i3];
        }
        if (i3 < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.l(i3, "Index < 0: "));
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final byte e(int i3) {
        return this.j[this.f19353k + i3];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final int f(int i3, int i9) {
        return com.google.android.gms.internal.play_billing.B0.a(i3, this.f19353k, i9, this.j);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final int n() {
        return this.f19354l;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final com.google.android.gms.internal.play_billing.AbstractC1859m0 o(int i3, int i9) {
        int iR = com.google.android.gms.internal.play_billing.AbstractC1859m0.r(i3, i9, this.f19354l);
        if (iR == 0) {
            return com.google.android.gms.internal.play_billing.AbstractC1859m0.f19359i;
        }
        return new com.google.android.gms.internal.play_billing.C1856l0(this.j, this.f19353k + i3, iR);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final void p(com.google.android.gms.internal.play_billing.C1866p0 c1866p0) {
        c1866p0.I(this.j, this.f19353k, this.f19354l);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final boolean q(com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0) {
        boolean z6 = abstractC1859m0 instanceof com.google.android.gms.internal.play_billing.C1862n0;
        if (!z6 && !(abstractC1859m0 instanceof com.google.android.gms.internal.play_billing.C1856l0)) {
            return abstractC1859m0.q(this);
        }
        int iN = abstractC1859m0.n();
        int i3 = this.f19354l;
        if (i3 > iN) {
            throw new java.lang.IllegalArgumentException("Length too large: " + i3 + i3);
        }
        if (i3 > abstractC1859m0.n()) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(i3, abstractC1859m0.n(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.j;
        int i9 = this.f19353k;
        if (z6) {
            return com.google.android.gms.internal.play_billing.AbstractC1859m0.t(bArr, i9, 0, ((com.google.android.gms.internal.play_billing.C1862n0) abstractC1859m0).j, i3);
        }
        if (!(abstractC1859m0 instanceof com.google.android.gms.internal.play_billing.C1856l0)) {
            return abstractC1859m0.o(0, i3).equals(o(i9, i3 + i9));
        }
        com.google.android.gms.internal.play_billing.C1856l0 c1856l0 = (com.google.android.gms.internal.play_billing.C1856l0) abstractC1859m0;
        return com.google.android.gms.internal.play_billing.AbstractC1859m0.t(bArr, i9, c1856l0.f19353k, c1856l0.j, i3);
    }
}
