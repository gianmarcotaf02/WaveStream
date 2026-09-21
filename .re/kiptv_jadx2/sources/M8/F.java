package M8;

public final class F {

    public final byte[] f7219a;

    public int f7220b;

    public int f7221c;

    public boolean f7222d;

    public final boolean f7223e;

    public F f7224f;
    public F g;

    public F() {
        this.f7219a = new byte[8192];
        this.f7223e = true;
        this.f7222d = false;
    }

    public final F a() {
        F f9 = this.f7224f;
        if (f9 == this) {
            f9 = null;
        }
        F f10 = this.g;
        kotlin.jvm.internal.m.b(f10);
        f10.f7224f = this.f7224f;
        F f11 = this.f7224f;
        kotlin.jvm.internal.m.b(f11);
        f11.g = this.g;
        this.f7224f = null;
        this.g = null;
        return f9;
    }

    public final void b(F segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        segment.g = this;
        segment.f7224f = this.f7224f;
        F f9 = this.f7224f;
        kotlin.jvm.internal.m.b(f9);
        f9.g = segment;
        this.f7224f = segment;
    }

    public final F c() {
        this.f7222d = true;
        return new F(this.f7219a, this.f7220b, this.f7221c, true, false);
    }

    public final void d(F sink, int i3) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (!sink.f7223e) {
            throw new IllegalStateException("only owner can write");
        }
        int i9 = sink.f7221c;
        int i10 = i9 + i3;
        byte[] bArr = sink.f7219a;
        if (i10 > 8192) {
            if (sink.f7222d) {
                throw new IllegalArgumentException();
            }
            int i11 = sink.f7220b;
            if (i10 - i11 > 8192) {
                throw new IllegalArgumentException();
            }
            p078i6.m.a0(bArr, 0, i11, bArr, i9);
            sink.f7221c -= sink.f7220b;
            sink.f7220b = 0;
        }
        int i12 = sink.f7221c;
        int i13 = this.f7220b;
        p078i6.m.a0(this.f7219a, i12, i13, bArr, i13 + i3);
        sink.f7221c += i3;
        this.f7220b += i3;
    }

    public F(byte[] data, int i3, int i9, boolean z6, boolean z9) {
        kotlin.jvm.internal.m.e(data, "data");
        this.f7219a = data;
        this.f7220b = i3;
        this.f7221c = i9;
        this.f7222d = z6;
        this.f7223e = z9;
    }
}
