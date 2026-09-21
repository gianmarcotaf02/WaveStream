package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1862n0 extends com.google.android.gms.internal.play_billing.AbstractC1859m0 {
    public final byte[] j;

    public C1862n0(byte[] bArr) {
        bArr.getClass();
        this.j = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final byte d(int i3) {
        return this.j[i3];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final byte e(int i3) {
        return this.j[i3];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final int f(int i3, int i9) {
        return com.google.android.gms.internal.play_billing.B0.a(i3, 0, i9, this.j);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final int n() {
        return this.j.length;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final com.google.android.gms.internal.play_billing.AbstractC1859m0 o(int i3, int i9) {
        byte[] bArr = this.j;
        int iR = com.google.android.gms.internal.play_billing.AbstractC1859m0.r(0, i9, bArr.length);
        return iR == 0 ? com.google.android.gms.internal.play_billing.AbstractC1859m0.f19359i : new com.google.android.gms.internal.play_billing.C1856l0(bArr, 0, iR);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final void p(com.google.android.gms.internal.play_billing.C1866p0 c1866p0) {
        byte[] bArr = this.j;
        c1866p0.I(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1859m0
    public final boolean q(com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0) {
        boolean z6 = abstractC1859m0 instanceof com.google.android.gms.internal.play_billing.C1862n0;
        byte[] bArr = this.j;
        if (z6) {
            return java.util.Arrays.equals(bArr, ((com.google.android.gms.internal.play_billing.C1862n0) abstractC1859m0).j);
        }
        boolean z9 = abstractC1859m0 instanceof com.google.android.gms.internal.play_billing.C1856l0;
        if (!z9) {
            return abstractC1859m0.q(this);
        }
        com.google.android.gms.internal.play_billing.C1856l0 c1856l0 = (com.google.android.gms.internal.play_billing.C1856l0) abstractC1859m0;
        int i3 = c1856l0.f19354l;
        int length = bArr.length;
        if (length > i3) {
            throw new java.lang.IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i3) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(length, c1856l0.f19354l, "Ran off end of other: 0, ", ", "));
        }
        if (z6) {
            return com.google.android.gms.internal.play_billing.AbstractC1859m0.t(bArr, 0, 0, ((com.google.android.gms.internal.play_billing.C1862n0) abstractC1859m0).j, length);
        }
        if (!z9) {
            return abstractC1859m0.o(0, length).equals(o(0, length));
        }
        com.google.android.gms.internal.play_billing.C1856l0 c1856l1 = (com.google.android.gms.internal.play_billing.C1856l0) abstractC1859m0;
        return com.google.android.gms.internal.play_billing.AbstractC1859m0.t(bArr, 0, c1856l1.f19353k, c1856l1.j, length);
    }
}
