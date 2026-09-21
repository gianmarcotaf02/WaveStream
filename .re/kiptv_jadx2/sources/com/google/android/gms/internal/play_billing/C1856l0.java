package com.google.android.gms.internal.play_billing;

public final class C1856l0 extends AbstractC1859m0 {
    public final byte[] j;

    public final int f19353k;

    public final int f19354l;

    public C1856l0(byte[] bArr, int i3, int i9) {
        AbstractC1859m0.r(i3, i3 + i9, bArr.length);
        this.j = bArr;
        this.f19353k = i3;
        this.f19354l = i9;
    }

    @Override
    public final byte d(int i3) {
        int i9 = this.f19354l;
        if (((i9 - (i3 + 1)) | i3) >= 0) {
            return this.j[this.f19353k + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(M0.l(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(M0.k(i3, i9, "Index > length: ", ", "));
    }

    @Override
    public final byte e(int i3) {
        return this.j[this.f19353k + i3];
    }

    @Override
    public final int f(int i3, int i9) {
        return B0.a(i3, this.f19353k, i9, this.j);
    }

    @Override
    public final int n() {
        return this.f19354l;
    }

    @Override
    public final AbstractC1859m0 o(int i3, int i9) {
        int iR = AbstractC1859m0.r(i3, i9, this.f19354l);
        if (iR == 0) {
            return AbstractC1859m0.f19359i;
        }
        return new C1856l0(this.j, this.f19353k + i3, iR);
    }

    @Override
    public final void p(C1866p0 c1866p0) {
        c1866p0.I(this.j, this.f19353k, this.f19354l);
    }

    @Override
    public final boolean q(AbstractC1859m0 abstractC1859m0) {
        boolean z6 = abstractC1859m0 instanceof C1862n0;
        if (!z6 && !(abstractC1859m0 instanceof C1856l0)) {
            return abstractC1859m0.q(this);
        }
        int iN = abstractC1859m0.n();
        int i3 = this.f19354l;
        if (i3 > iN) {
            throw new IllegalArgumentException("Length too large: " + i3 + i3);
        }
        if (i3 > abstractC1859m0.n()) {
            throw new IllegalArgumentException(M0.k(i3, abstractC1859m0.n(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.j;
        int i9 = this.f19353k;
        if (z6) {
            return AbstractC1859m0.t(bArr, i9, 0, ((C1862n0) abstractC1859m0).j, i3);
        }
        if (!(abstractC1859m0 instanceof C1856l0)) {
            return abstractC1859m0.o(0, i3).equals(o(i9, i3 + i9));
        }
        C1856l0 c1856l0 = (C1856l0) abstractC1859m0;
        return AbstractC1859m0.t(bArr, i9, c1856l0.f19353k, c1856l0.j, i3);
    }
}
