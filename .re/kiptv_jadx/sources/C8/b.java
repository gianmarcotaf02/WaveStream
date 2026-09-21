package C8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements M8.K {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.s f1619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1620i;
    public final /* synthetic */ A8.t j;

    public b(A8.t tVar) {
        this.j = tVar;
        this.f1619h = new M8.s(((M8.E) tVar.f455e).f7217h.c());
    }

    public final void b() {
        A8.t tVar = this.j;
        int i3 = tVar.f452b;
        if (i3 == 6) {
            return;
        }
        if (i3 != 5) {
            throw new java.lang.IllegalStateException("state: " + tVar.f452b);
        }
        M8.s sVar = this.f1619h;
        M8.M m8 = sVar.f7278e;
        sVar.f7278e = M8.M.f7231d;
        m8.a();
        m8.b();
        tVar.f452b = 6;
    }

    @Override // M8.K
    public final M8.M c() {
        return this.f1619h;
    }

    @Override // M8.K
    public long m(long j, M8.C0682j sink) throws java.io.IOException {
        A8.t tVar = this.j;
        kotlin.jvm.internal.m.e(sink, "sink");
        try {
            return ((M8.E) tVar.f455e).m(j, sink);
        } catch (java.io.IOException e6) {
            ((A8.o) tVar.f454d).k();
            b();
            throw e6;
        }
    }
}
