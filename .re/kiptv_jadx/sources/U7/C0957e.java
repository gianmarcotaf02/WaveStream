package U7;

/* JADX INFO: renamed from: U7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0957e implements S7.H0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f10178h = U7.l.f10209p;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public S7.C0895k f10179i;
    public final /* synthetic */ U7.j j;

    public C0957e(U7.j jVar) {
        this.j = jVar;
    }

    @Override // S7.H0
    public final void a(X7.q qVar, int i3) {
        S7.C0895k c0895k = this.f10179i;
        if (c0895k != null) {
            c0895k.a(qVar, i3);
        }
    }

    public final java.lang.Object b(p117n6.c cVar) throws java.lang.Throwable {
        U7.s sVarM;
        java.lang.Boolean bool;
        java.lang.Object obj = this.f10178h;
        boolean z6 = true;
        if (obj == U7.l.f10209p || obj == U7.l.f10205l) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U7.j.f10190n;
            U7.j jVar = this.j;
            U7.s sVar = (U7.s) atomicReferenceFieldUpdater.get(jVar);
            while (!jVar.t()) {
                long andIncrement = U7.j.j.getAndIncrement(jVar);
                long j = U7.l.f10197b;
                long j9 = andIncrement / j;
                int i3 = (int) (andIncrement % j);
                if (sVar.j != j9) {
                    sVarM = jVar.m(j9, sVar);
                    if (sVarM == null) {
                        continue;
                    }
                } else {
                    sVarM = sVar;
                }
                java.lang.Object objD = jVar.D(sVarM, i3, andIncrement, null);
                N6.A a2 = U7.l.f10206m;
                if (objD == a2) {
                    throw new java.lang.IllegalStateException("unreachable");
                }
                N6.A a9 = U7.l.f10208o;
                if (objD == a9) {
                    if (andIncrement < jVar.q()) {
                        sVarM.a();
                    }
                    sVar = sVarM;
                } else {
                    if (objD == U7.l.f10207n) {
                        U7.j jVar2 = this.j;
                        S7.C0895k c0895kU = S7.C.u(com.google.common.util.concurrent.P.h0(cVar));
                        try {
                            this.f10179i = c0895kU;
                            java.lang.Object objD2 = jVar2.D(sVarM, i3, andIncrement, this);
                            if (objD2 != a2) {
                                if (objD2 == a9) {
                                    if (andIncrement < jVar2.q()) {
                                        sVarM.a();
                                    }
                                    U7.s sVar2 = (U7.s) U7.j.f10190n.get(jVar2);
                                    while (true) {
                                        if (jVar2.t()) {
                                            S7.C0895k c0895k = this.f10179i;
                                            kotlin.jvm.internal.m.b(c0895k);
                                            this.f10179i = null;
                                            this.f10178h = U7.l.f10205l;
                                            java.lang.Throwable thN = jVar.n();
                                            if (thN != null) {
                                                c0895k.resumeWith(com.google.common.util.concurrent.P.T(thN));
                                                break;
                                            }
                                            c0895k.resumeWith(java.lang.Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = U7.j.j.getAndIncrement(jVar2);
                                        long j10 = U7.l.f10197b;
                                        long j11 = andIncrement2 / j10;
                                        int i9 = (int) (andIncrement2 % j10);
                                        if (sVar2.j != j11) {
                                            U7.s sVarM2 = jVar2.m(j11, sVar2);
                                            if (sVarM2 != null) {
                                                sVar2 = sVarM2;
                                            }
                                        }
                                        java.lang.Object objD3 = jVar2.D(sVar2, i9, andIncrement2, this);
                                        if (objD3 == U7.l.f10206m) {
                                            a(sVar2, i9);
                                            break;
                                        }
                                        if (objD3 == U7.l.f10208o) {
                                            if (andIncrement2 < jVar2.q()) {
                                                sVar2.a();
                                            }
                                        } else {
                                            if (objD3 == U7.l.f10207n) {
                                                throw new java.lang.IllegalStateException("unexpected");
                                            }
                                            sVar2.a();
                                            this.f10178h = objD3;
                                            this.f10179i = null;
                                            bool = java.lang.Boolean.TRUE;
                                        }
                                    }
                                } else {
                                    sVarM.a();
                                    this.f10178h = objD2;
                                    this.f10179i = null;
                                    bool = java.lang.Boolean.TRUE;
                                }
                                c0895kU.g(bool, null);
                                break;
                            }
                            a(sVarM, i3);
                            java.lang.Object objQ = c0895kU.q();
                            p109m6.a aVar = p109m6.a.f25430h;
                            return objQ;
                        } catch (java.lang.Throwable th) {
                            c0895kU.y();
                            throw th;
                        }
                    }
                    sVarM.a();
                    this.f10178h = objD;
                }
            }
            this.f10178h = U7.l.f10205l;
            java.lang.Throwable thN2 = jVar.n();
            if (thN2 != null) {
                int i10 = X7.r.f10934a;
                throw thN2;
            }
            z6 = false;
        }
        return java.lang.Boolean.valueOf(z6);
    }

    public final java.lang.Object c() throws java.lang.Throwable {
        java.lang.Object obj = this.f10178h;
        N6.A a2 = U7.l.f10209p;
        if (obj == a2) {
            throw new java.lang.IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f10178h = a2;
        if (obj != U7.l.f10205l) {
            return obj;
        }
        java.lang.Throwable thO = this.j.o();
        int i3 = X7.r.f10934a;
        throw thO;
    }
}
