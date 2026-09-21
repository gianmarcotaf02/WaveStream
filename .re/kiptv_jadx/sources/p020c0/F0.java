package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements S7.A, p020c0.C0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p020c0.C1680g f18115k = new p020c0.C1680g();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p100l6.h f18116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p020c0.F0 f18117i = this;
    public volatile p100l6.h j;

    public F0(p100l6.h hVar) {
        this.f18116h = hVar;
    }

    @Override // p020c0.C0
    public final void a() {
        b();
    }

    public final void b() {
        synchronized (this.f18117i) {
            try {
                p100l6.h hVar = this.j;
                if (hVar == null) {
                    this.j = f18115k;
                } else {
                    S7.C.k(hVar, new p020c0.K(0));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // p020c0.C0
    public final void c() {
        b();
    }

    @Override // S7.A
    public final p100l6.h getCoroutineContext() {
        p100l6.h hVarPlus;
        p100l6.h hVar = this.j;
        if (hVar == null || hVar == f18115k) {
            p129p0.d dVar = (p129p0.d) this.f18116h.get(p129p0.d.f26173i);
            p100l6.h e6 = dVar != null ? new p020c0.E0(dVar, this) : p100l6.i.f24820h;
            synchronized (this.f18117i) {
                try {
                    p100l6.h hVar2 = this.j;
                    if (hVar2 == null) {
                        p100l6.h hVar3 = this.f18116h;
                        hVarPlus = hVar3.plus(new S7.j0((S7.InterfaceC0891h0) hVar3.get(S7.C0889g0.f9584h))).plus(p100l6.i.f24820h).plus(e6);
                    } else if (hVar2 == f18115k) {
                        p100l6.h hVar4 = this.f18116h;
                        S7.j0 j0Var = new S7.j0((S7.InterfaceC0891h0) hVar4.get(S7.C0889g0.f9584h));
                        j0Var.l(new p020c0.K(0));
                        hVarPlus = hVar4.plus(j0Var).plus(p100l6.i.f24820h).plus(e6);
                    } else {
                        hVarPlus = hVar2;
                    }
                    this.j = hVarPlus;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            hVar = hVarPlus;
        }
        kotlin.jvm.internal.m.b(hVar);
        return hVar;
    }

    @Override // p020c0.C0
    public final void d() {
    }
}
