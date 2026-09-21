package p121o0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p121o0.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p194x6.j f25974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25975f;

    public e(long j, p121o0.j jVar, p194x6.j jVar2) {
        super(j, jVar);
        this.f25974e = jVar2;
        this.f25975f = 1;
    }

    @Override // p121o0.f
    public final void c() {
        if (this.f25978c) {
            return;
        }
        l();
        this.f25978c = true;
        synchronized (p121o0.k.f25993c) {
            o();
        }
    }

    @Override // p121o0.f
    public final p194x6.j e() {
        return this.f25974e;
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
        this.f25975f++;
    }

    @Override // p121o0.f
    public final void l() {
        int i3 = this.f25975f - 1;
        this.f25975f = i3;
        if (i3 == 0) {
            a();
        }
    }

    @Override // p121o0.f
    public final void n(p121o0.t tVar) {
        p108m5.c cVar = p121o0.k.f25991a;
        throw new java.lang.IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p121o0.f
    public final p121o0.f u(p194x6.j jVar) {
        p121o0.k.c(this);
        return new p121o0.d(this.f25977b, this.f25976a, p121o0.k.k(true, jVar, this.f25974e), this);
    }

    @Override // p121o0.f
    public final void m() {
    }
}
