package p121o0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p121o0.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p194x6.j f25972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p121o0.f f25973f;

    public d(long j, p121o0.j jVar, p194x6.j jVar2, p121o0.f fVar) {
        super(j, jVar);
        this.f25972e = jVar2;
        this.f25973f = fVar;
        fVar.k();
    }

    @Override // p121o0.f
    public final void c() {
        if (this.f25978c) {
            return;
        }
        long j = this.f25977b;
        p121o0.f fVar = this.f25973f;
        if (j != fVar.g()) {
            a();
        }
        fVar.l();
        this.f25978c = true;
        synchronized (p121o0.k.f25993c) {
            o();
        }
    }

    @Override // p121o0.f
    public final p194x6.j e() {
        return this.f25972e;
    }

    @Override // p121o0.f
    public final boolean f() {
        return true;
    }

    @Override // p121o0.f
    public final p194x6.j i() {
        return null;
    }

    @Override // p121o0.f
    public final void k() {
        p121o0.o.l();
        throw null;
    }

    @Override // p121o0.f
    public final void l() {
        p121o0.o.l();
        throw null;
    }

    @Override // p121o0.f
    public final void n(p121o0.t tVar) {
        p108m5.c cVar = p121o0.k.f25991a;
        throw new java.lang.IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p121o0.f
    public final p121o0.f u(p194x6.j jVar) {
        return new p121o0.d(this.f25977b, this.f25976a, p121o0.k.k(true, jVar, this.f25972e), this.f25973f);
    }

    @Override // p121o0.f
    public final void m() {
    }
}
