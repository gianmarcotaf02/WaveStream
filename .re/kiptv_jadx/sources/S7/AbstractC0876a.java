package S7;

/* JADX INFO: renamed from: S7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0876a extends S7.p0 implements p100l6.c, S7.A {
    public final p100l6.h j;

    public AbstractC0876a(p100l6.h hVar, boolean z6, boolean z9) {
        super(z9);
        if (z6) {
            G((S7.InterfaceC0891h0) hVar.get(S7.C0889g0.f9584h));
        }
        this.j = hVar.plus(this);
    }

    @Override // S7.p0
    public final void F(I3.b bVar) {
        S7.C.v(this.j, bVar);
    }

    @Override // S7.p0
    public final void R(java.lang.Object obj) {
        if (!(obj instanceof S7.C0903t)) {
            a0(obj);
        } else {
            S7.C0903t c0903t = (S7.C0903t) obj;
            Z(c0903t.f9620a, S7.C0903t.f9619b.get(c0903t) == 1);
        }
    }

    public final void b0(S7.B b9, S7.AbstractC0876a abstractC0876a, p194x6.m mVar) {
        java.lang.Object objInvoke;
        int iOrdinal = b9.ordinal();
        p070h6.A a2 = p070h6.A.f22523a;
        if (iOrdinal == 0) {
            try {
                X7.a.h(a2, com.google.common.util.concurrent.P.h0(com.google.common.util.concurrent.P.S(abstractC0876a, this, mVar)));
                return;
            } catch (java.lang.Throwable th) {
                O2.g.G(th, this);
                throw null;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                kotlin.jvm.internal.m.e(mVar, "<this>");
                com.google.common.util.concurrent.P.h0(com.google.common.util.concurrent.P.S(abstractC0876a, this, mVar)).resumeWith(a2);
                return;
            }
            if (iOrdinal != 3) {
                throw new I3.b();
            }
            try {
                p100l6.h hVar = this.j;
                java.lang.Object objN = X7.a.n(hVar, null);
                try {
                    if (mVar instanceof p117n6.a) {
                        kotlin.jvm.internal.E.c(2, mVar);
                        objInvoke = mVar.invoke(abstractC0876a, this);
                    } else {
                        objInvoke = com.google.common.util.concurrent.P.w0(mVar, abstractC0876a, this);
                    }
                    X7.a.g(hVar, objN);
                    if (objInvoke != p109m6.a.f25430h) {
                        resumeWith(objInvoke);
                    }
                } catch (java.lang.Throwable th2) {
                    X7.a.g(hVar, objN);
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (th instanceof S7.J) {
                    th = ((S7.J) th).f9547h;
                }
                resumeWith(com.google.common.util.concurrent.P.T(th));
            }
        }
    }

    @Override // p100l6.c
    public final p100l6.h getContext() {
        return this.j;
    }

    @Override // S7.A
    public final p100l6.h getCoroutineContext() {
        return this.j;
    }

    @Override // S7.p0
    public final java.lang.String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p100l6.c
    public final void resumeWith(java.lang.Object obj) {
        java.lang.Throwable thA = p070h6.n.a(obj);
        if (thA != null) {
            obj = new S7.C0903t(thA, false);
        }
        java.lang.Object objK = K(obj);
        if (objK == S7.C.f9530e) {
            return;
        }
        h(objK);
    }

    public void a0(java.lang.Object obj) {
    }

    public void Z(java.lang.Throwable th, boolean z6) {
    }
}
