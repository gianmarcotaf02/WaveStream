package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.play_billing.M0;

public final class C1913h extends C1914i {

    public final int f19537l;

    public final int f19538m;

    public C1913h(byte[] bArr, int i3, int i9) {
        super(bArr);
        AbstractC1915j.e(i3, i3 + i9, bArr.length);
        this.f19537l = i3;
        this.f19538m = i9;
    }

    @Override
    public final byte d(int i3) {
        int i9 = this.f19538m;
        if (((i9 - (i3 + 1)) | i3) >= 0) {
            return this.f19539k[this.f19537l + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(M0.l(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(M0.k(i3, i9, "Index > length: ", ", "));
    }

    @Override
    public final void n(byte[] bArr, int i3) {
        System.arraycopy(this.f19539k, this.f19537l, bArr, 0, i3);
    }

    @Override
    public final int p() {
        return this.f19537l;
    }

    @Override
    public final byte q(int i3) {
        return this.f19539k[this.f19537l + i3];
    }

    @Override
    public final int size() {
        return this.f19538m;
    }
}
