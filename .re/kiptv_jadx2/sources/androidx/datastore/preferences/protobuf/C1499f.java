package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.M0;

public final class C1499f extends C1500g {

    public final int f16200l;

    public final int f16201m;

    public C1499f(byte[] bArr, int i3, int i9) {
        super(bArr);
        C1500g.e(i3, i3 + i9, bArr.length);
        this.f16200l = i3;
        this.f16201m = i9;
    }

    @Override
    public final byte d(int i3) {
        int i9 = this.f16201m;
        if (((i9 - (i3 + 1)) | i3) >= 0) {
            return this.f16204i[this.f16200l + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(M0.l(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(M0.k(i3, i9, "Index > length: ", ", "));
    }

    @Override
    public final void n(byte[] bArr, int i3) {
        System.arraycopy(this.f16204i, this.f16200l, bArr, 0, i3);
    }

    @Override
    public final int o() {
        return this.f16200l;
    }

    @Override
    public final byte p(int i3) {
        return this.f16204i[this.f16200l + i3];
    }

    @Override
    public final int size() {
        return this.f16201m;
    }
}
