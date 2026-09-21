package V7;

public final class C0994u implements InterfaceC0981g {

    public final InterfaceC0981g f10517h;

    public final p117n6.i f10518i;

    public C0994u(InterfaceC0981g interfaceC0981g, p194x6.n nVar) {
        this.f10517h = interfaceC0981g;
        this.f10518i = (p117n6.i) nVar;
    }

    @Override
    public final Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar) throws Throwable {
        C0993t c0993t;
        C0994u c0994u;
        p0 p0Var;
        ?? r9;
        W7.y yVar;
        Throwable th;
        W7.y yVar2;
        ?? r10;
        if (cVar instanceof C0993t) {
            c0993t = (C0993t) cVar;
            int i3 = c0993t.f10514i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0993t.f10514i = i3 - Integer.MIN_VALUE;
            } else {
                c0993t = new C0993t(this, cVar);
            }
        } else {
            c0993t = new C0993t(this, cVar);
        }
        Object obj = c0993t.f10513h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0993t.f10514i;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            try {
                InterfaceC0981g interfaceC0981g = this.f10517h;
                c0993t.f10515k = this;
                c0993t.f10516l = interfaceC0982h;
                c0993t.f10514i = 1;
                if (interfaceC0981g.collect(interfaceC0982h, c0993t) != aVar) {
                    c0994u = this;
                    yVar = new W7.y(interfaceC0982h, c0993t.getContext());
                    r10 = c0994u.f10518i;
                    c0993t.f10515k = yVar;
                    c0993t.f10516l = null;
                    c0993t.f10514i = 3;
                    if (r10.invoke(yVar, null, c0993t) != aVar) {
                        yVar2 = yVar;
                        yVar2.releaseIntercepted();
                        return p070h6.A.f22523a;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c0994u = this;
                p0Var = new p0(th);
                r9 = c0994u.f10518i;
                c0993t.f10515k = th;
                c0993t.f10516l = null;
                c0993t.f10514i = 2;
                if (r.c(p0Var, r9, th, c0993t) == aVar) {
                    throw th;
                }
            }
            return aVar;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                Throwable th3 = (Throwable) c0993t.f10515k;
                com.google.common.util.concurrent.P.u0(obj);
                throw th3;
            }
            if (i9 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar2 = (W7.y) c0993t.f10515k;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                yVar2.releaseIntercepted();
                return p070h6.A.f22523a;
            } catch (Throwable th4) {
                th = th4;
                yVar2.releaseIntercepted();
                throw th;
            }
        }
        interfaceC0982h = c0993t.f10516l;
        c0994u = (C0994u) c0993t.f10515k;
        try {
            com.google.common.util.concurrent.P.u0(obj);
            yVar = new W7.y(interfaceC0982h, c0993t.getContext());
            try {
                r10 = c0994u.f10518i;
                c0993t.f10515k = yVar;
                c0993t.f10516l = null;
                c0993t.f10514i = 3;
                if (r10.invoke(yVar, null, c0993t) != aVar) {
                    yVar2 = yVar;
                    yVar2.releaseIntercepted();
                    return p070h6.A.f22523a;
                }
            } catch (Throwable th5) {
                th = th5;
                yVar2 = yVar;
                yVar2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            p0Var = new p0(th);
            r9 = c0994u.f10518i;
            c0993t.f10515k = th;
            c0993t.f10516l = null;
            c0993t.f10514i = 2;
            if (r.c(p0Var, r9, th, c0993t) == aVar) {
                throw th;
            }
        }
        return aVar;
    }
}
