package A8;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements M8.I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.I f375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f376i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A8.e f379m;

    public c(A8.e eVar, M8.I delegate, long j) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f379m = eVar;
        this.f375h = delegate;
        this.f376i = j;
    }

    @Override // M8.I
    public final void J(long j, M8.C0682j source) throws java.io.IOException {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.f378l) {
            throw new java.lang.IllegalStateException("closed");
        }
        long j9 = this.f376i;
        if (j9 != -1 && this.f377k + j > j9) {
            java.lang.StringBuilder sbU = p121o0.p.u(j9, "expected ", " bytes but received ");
            sbU.append(this.f377k + j);
            throw new java.net.ProtocolException(sbU.toString());
        }
        try {
            this.f375h.J(j, source);
            this.f377k += j;
        } catch (java.io.IOException e6) {
            throw e(e6);
        }
    }

    public final void b() {
        this.f375h.close();
    }

    @Override // M8.I
    public final M8.M c() {
        return this.f375h.c();
    }

    @Override // M8.I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.f378l) {
            return;
        }
        this.f378l = true;
        long j = this.f376i;
        if (j != -1 && this.f377k != j) {
            throw new java.net.ProtocolException("unexpected end of stream");
        }
        try {
            b();
            e(null);
        } catch (java.io.IOException e6) {
            throw e(e6);
        }
    }

    public final java.io.IOException e(java.io.IOException iOException) {
        if (this.j) {
            return iOException;
        }
        this.j = true;
        return this.f379m.a(false, true, iOException);
    }

    @Override // M8.I, java.io.Flushable
    public final void flush() throws java.io.IOException {
        try {
            i();
        } catch (java.io.IOException e6) {
            throw e(e6);
        }
    }

    public final void i() {
        this.f375h.flush();
    }

    public final java.lang.String toString() {
        return A8.c.class.getSimpleName() + '(' + this.f375h + ')';
    }
}
