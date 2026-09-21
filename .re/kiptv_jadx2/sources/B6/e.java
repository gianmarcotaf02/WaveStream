package B6;

import java.io.Serializable;

public final class e extends d implements Serializable {
    public int j;

    public int f819k;

    public int f820l;

    public int f821m;

    public int f822n;

    public int f823o;

    @Override
    public final int a(int i3) {
        return ((-i3) >> 31) & (d() >>> (32 - i3));
    }

    @Override
    public final int d() {
        int i3 = this.j;
        int i9 = i3 ^ (i3 >>> 2);
        this.j = this.f819k;
        this.f819k = this.f820l;
        this.f820l = this.f821m;
        int i10 = this.f822n;
        this.f821m = i10;
        int i11 = ((i9 ^ (i9 << 1)) ^ i10) ^ (i10 << 4);
        this.f822n = i11;
        int i12 = this.f823o + 362437;
        this.f823o = i12;
        return i11 + i12;
    }
}
