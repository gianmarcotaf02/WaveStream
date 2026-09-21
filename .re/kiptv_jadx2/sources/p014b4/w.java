package p014b4;

import com.google.android.gms.internal.play_billing.M0;

public final class w extends x {

    public final int f17912k;

    public final int f17913l;

    public w(byte[] bArr, int i3, int i9) {
        super(bArr);
        x.p(i3, i3 + i9, bArr.length);
        this.f17912k = i3;
        this.f17913l = i9;
    }

    @Override
    public final byte d(int i3) {
        int i9 = this.f17913l;
        if (((i9 - (i3 + 1)) | i3) >= 0) {
            return this.f17915i[this.f17912k + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(M0.l(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(M0.k(i3, i9, "Index > length: ", ", "));
    }

    @Override
    public final byte e(int i3) {
        return this.f17915i[this.f17912k + i3];
    }

    @Override
    public final int f() {
        return this.f17912k;
    }

    @Override
    public final int n() {
        return this.f17913l;
    }

    @Override
    public final void o(byte[] bArr, int i3) {
        System.arraycopy(this.f17915i, this.f17912k, bArr, 0, i3);
    }
}
