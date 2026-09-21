package M8;

public final class B implements K {

    public final InterfaceC0684l f7209h;

    public final C0682j f7210i;
    public F j;

    public int f7211k;

    public boolean f7212l;

    public long f7213m;

    public B(InterfaceC0684l interfaceC0684l) {
        this.f7209h = interfaceC0684l;
        C0682j c0682jA = interfaceC0684l.a();
        this.f7210i = c0682jA;
        F f9 = c0682jA.f7259h;
        this.j = f9;
        this.f7211k = f9 != null ? f9.f7220b : -1;
    }

    @Override
    public final M c() {
        return this.f7209h.c();
    }

    @Override
    public final void close() {
        this.f7212l = true;
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m(long j, C0682j sink) {
        F f9;
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        if (this.f7212l) {
            throw new IllegalStateException("closed");
        }
        F f10 = this.j;
        C0682j c0682j = this.f7210i;
        if (f10 != null) {
            F f11 = c0682j.f7259h;
            if (f10 == f11) {
                int i3 = this.f7211k;
                kotlin.jvm.internal.m.b(f11);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f7209h.d(this.f7213m + 1)) {
            return -1L;
        }
        if (this.j == null && (f9 = c0682j.f7259h) != null) {
            this.j = f9;
            this.f7211k = f9.f7220b;
        }
        long jMin = Math.min(j, c0682j.f7260i - this.f7213m);
        this.f7210i.e(sink, this.f7213m, jMin);
        this.f7213m += jMin;
        return jMin;
    }
}
