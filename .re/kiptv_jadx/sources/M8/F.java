package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public M8.F f7224f;
    public M8.F g;

    public F() {
        this.f7219a = new byte[8192];
        this.f7223e = true;
        this.f7222d = false;
    }

    public final M8.F a() {
        M8.F f9 = this.f7224f;
        if (f9 == this) {
            f9 = null;
        }
        M8.F f10 = this.g;
        kotlin.jvm.internal.m.b(f10);
        f10.f7224f = this.f7224f;
        M8.F f11 = this.f7224f;
        kotlin.jvm.internal.m.b(f11);
        f11.g = this.g;
        this.f7224f = null;
        this.g = null;
        return f9;
    }

    public final void b(M8.F segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        segment.g = this;
        segment.f7224f = this.f7224f;
        M8.F f9 = this.f7224f;
        kotlin.jvm.internal.m.b(f9);
        f9.g = segment;
        this.f7224f = segment;
    }

    public final M8.F c() {
        this.f7222d = true;
        return new M8.F(this.f7219a, this.f7220b, this.f7221c, true, false);
    }

    public final void d(M8.F sink, int i3) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (!sink.f7223e) {
            throw new java.lang.IllegalStateException("only owner can write");
        }
        int i9 = sink.f7221c;
        int i10 = i9 + i3;
        byte[] bArr = sink.f7219a;
        if (i10 > 8192) {
            if (sink.f7222d) {
                throw new java.lang.IllegalArgumentException();
            }
            int i11 = sink.f7220b;
            if (i10 - i11 > 8192) {
                throw new java.lang.IllegalArgumentException();
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
