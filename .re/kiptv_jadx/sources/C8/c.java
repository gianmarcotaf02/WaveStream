package C8;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements M8.I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.s f1621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1622i;
    public final /* synthetic */ A8.t j;

    public c(A8.t tVar) {
        this.j = tVar;
        this.f1621h = new M8.s(((M8.D) tVar.f456f).f7215h.c());
    }

    @Override // M8.I
    public final void J(long j, M8.C0682j source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.f1622i) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        A8.t tVar = this.j;
        M8.D d4 = (M8.D) tVar.f456f;
        if (d4.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        d4.f7216i.a0(j);
        d4.b();
        M8.D d6 = (M8.D) tVar.f456f;
        d6.w(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        d6.J(j, source);
        d6.w(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
    }

    @Override // M8.I
    public final M8.M c() {
        return this.f1621h;
    }

    @Override // M8.I, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1622i) {
            return;
        }
        this.f1622i = true;
        ((M8.D) this.j.f456f).w("0\r\n\r\n");
        A8.t tVar = this.j;
        M8.s sVar = this.f1621h;
        tVar.getClass();
        M8.M m8 = sVar.f7278e;
        sVar.f7278e = M8.M.f7231d;
        m8.a();
        m8.b();
        this.j.f452b = 3;
    }

    @Override // M8.I, java.io.Flushable
    public final synchronized void flush() {
        if (this.f1622i) {
            return;
        }
        ((M8.D) this.j.f456f).flush();
    }
}
