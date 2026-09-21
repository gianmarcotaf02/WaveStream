package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

public final class C1862n0 extends AbstractC1859m0 {
    public final byte[] j;

    public C1862n0(byte[] bArr) {
        bArr.getClass();
        this.j = bArr;
    }

    @Override
    public final byte d(int i3) {
        return this.j[i3];
    }

    @Override
    public final byte e(int i3) {
        return this.j[i3];
    }

    @Override
    public final int f(int i3, int i9) {
        return B0.a(i3, 0, i9, this.j);
    }

    @Override
    public final int n() {
        return this.j.length;
    }

    @Override
    public final AbstractC1859m0 o(int i3, int i9) {
        byte[] bArr = this.j;
        int iR = AbstractC1859m0.r(0, i9, bArr.length);
        return iR == 0 ? AbstractC1859m0.f19359i : new C1856l0(bArr, 0, iR);
    }

    @Override
    public final void p(C1866p0 c1866p0) {
        byte[] bArr = this.j;
        c1866p0.I(bArr, 0, bArr.length);
    }

    @Override
    public final boolean q(AbstractC1859m0 abstractC1859m0) {
        boolean z6 = abstractC1859m0 instanceof C1862n0;
        byte[] bArr = this.j;
        if (z6) {
            return Arrays.equals(bArr, ((C1862n0) abstractC1859m0).j);
        }
        boolean z9 = abstractC1859m0 instanceof C1856l0;
        if (!z9) {
            return abstractC1859m0.q(this);
        }
        C1856l0 c1856l0 = (C1856l0) abstractC1859m0;
        int i3 = c1856l0.f19354l;
        int length = bArr.length;
        if (length > i3) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i3) {
            throw new IllegalArgumentException(M0.k(length, c1856l0.f19354l, "Ran off end of other: 0, ", ", "));
        }
        if (z6) {
            return AbstractC1859m0.t(bArr, 0, 0, ((C1862n0) abstractC1859m0).j, length);
        }
        if (!z9) {
            return abstractC1859m0.o(0, length).equals(o(0, length));
        }
        C1856l0 c1856l1 = (C1856l0) abstractC1859m0;
        return AbstractC1859m0.t(bArr, 0, c1856l1.f19353k, c1856l1.j, length);
    }
}
