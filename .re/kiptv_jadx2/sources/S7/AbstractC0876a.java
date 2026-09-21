package S7;

public abstract class AbstractC0876a extends p0 implements p100l6.c, A {
    public final p100l6.h j;

    public AbstractC0876a(p100l6.h hVar, boolean z6, boolean z9) {
        super(z9);
        if (z6) {
            G((InterfaceC0891h0) hVar.get(C0889g0.f9584h));
        }
        this.j = hVar.plus(this);
    }

    @Override
    public final void F(I3.b bVar) {
        C.v(this.j, bVar);
    }

    @Override
    public final void R(Object obj) {
        if (!(obj instanceof C0903t)) {
            a0(obj);
        } else {
            C0903t c0903t = (C0903t) obj;
            Z(c0903t.f9620a, C0903t.f9619b.get(c0903t) == 1);
        }
    }

    public final void b0(B b9, AbstractC0876a abstractC0876a, p194x6.m mVar) {
        Object objInvoke;
        int iOrdinal = b9.ordinal();
        p070h6.A a2 = p070h6.A.f22523a;
        if (iOrdinal == 0) {
            try {
                X7.a.h(a2, com.google.common.util.concurrent.P.h0(com.google.common.util.concurrent.P.S(abstractC0876a, this, mVar)));
                return;
            } catch (Throwable th) {
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
                Object objN = X7.a.n(hVar, null);
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
                } catch (Throwable th2) {
                    X7.a.g(hVar, objN);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof J) {
                    th = ((J) th).f9547h;
                }
                resumeWith(com.google.common.util.concurrent.P.T(th));
            }
        }
    }

    @Override
    public final p100l6.h getContext() {
        return this.j;
    }

    @Override
    public final p100l6.h getCoroutineContext() {
        return this.j;
    }

    @Override
    public final String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable thA = p070h6.n.a(obj);
        if (thA != null) {
            obj = new C0903t(thA, false);
        }
        Object objK = K(obj);
        if (objK == C.f9530e) {
            return;
        }
        h(objK);
    }

    public void a0(Object obj) {
    }

    public void Z(Throwable th, boolean z6) {
    }
}
