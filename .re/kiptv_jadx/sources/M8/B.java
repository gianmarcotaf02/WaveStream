package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements M8.K {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.InterfaceC0684l f7209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M8.C0682j f7210i;
    public M8.F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7213m;

    public B(M8.InterfaceC0684l interfaceC0684l) {
        this.f7209h = interfaceC0684l;
        M8.C0682j c0682jA = interfaceC0684l.a();
        this.f7210i = c0682jA;
        M8.F f9 = c0682jA.f7259h;
        this.j = f9;
        this.f7211k = f9 != null ? f9.f7220b : -1;
    }

    @Override // M8.K
    public final M8.M c() {
        return this.f7209h.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7212l = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f7220b) goto L15;
     */
    @Override // M8.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m(long j, M8.C0682j sink) {
        M8.F f9;
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        if (this.f7212l) {
            throw new java.lang.IllegalStateException("closed");
        }
        M8.F f10 = this.j;
        M8.C0682j c0682j = this.f7210i;
        if (f10 != null) {
            M8.F f11 = c0682j.f7259h;
            if (f10 == f11) {
                int i3 = this.f7211k;
                kotlin.jvm.internal.m.b(f11);
            }
            throw new java.lang.IllegalStateException("Peek source is invalid because upstream source was used");
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
        long jMin = java.lang.Math.min(j, c0682j.f7260i - this.f7213m);
        this.f7210i.e(sink, this.f7213m, jMin);
        this.f7213m += jMin;
        return jMin;
    }
}
