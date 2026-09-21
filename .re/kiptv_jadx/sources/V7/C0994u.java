package V7;

/* JADX INFO: renamed from: V7.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0994u implements V7.InterfaceC0981g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ V7.InterfaceC0981g f10517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p117n6.i f10518i;

    /* JADX WARN: Multi-variable type inference failed */
    public C0994u(V7.InterfaceC0981g interfaceC0981g, p194x6.n nVar) {
        this.f10517h = interfaceC0981g;
        this.f10518i = (p117n6.i) nVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [n6.i, x6.n] */
    /* JADX WARN: Type inference failed for: r9v6, types: [n6.i, x6.n] */
    @Override // V7.InterfaceC0981g
    public final java.lang.Object collect(V7.InterfaceC0982h interfaceC0982h, p100l6.c cVar) throws java.lang.Throwable {
        V7.C0993t c0993t;
        V7.C0994u c0994u;
        V7.p0 p0Var;
        ?? r9;
        W7.y yVar;
        java.lang.Throwable th;
        W7.y yVar2;
        ?? r10;
        if (cVar instanceof V7.C0993t) {
            c0993t = (V7.C0993t) cVar;
            int i3 = c0993t.f10514i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0993t.f10514i = i3 - Integer.MIN_VALUE;
            } else {
                c0993t = new V7.C0993t(this, cVar);
            }
        } else {
            c0993t = new V7.C0993t(this, cVar);
        }
        java.lang.Object obj = c0993t.f10513h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0993t.f10514i;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            try {
                V7.InterfaceC0981g interfaceC0981g = this.f10517h;
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
            } catch (java.lang.Throwable th2) {
                th = th2;
                c0994u = this;
                p0Var = new V7.p0(th);
                r9 = c0994u.f10518i;
                c0993t.f10515k = th;
                c0993t.f10516l = null;
                c0993t.f10514i = 2;
                if (V7.r.c(p0Var, r9, th, c0993t) == aVar) {
                    throw th;
                }
            }
            return aVar;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                java.lang.Throwable th3 = (java.lang.Throwable) c0993t.f10515k;
                com.google.common.util.concurrent.P.u0(obj);
                throw th3;
            }
            if (i9 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar2 = (W7.y) c0993t.f10515k;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                yVar2.releaseIntercepted();
                return p070h6.A.f22523a;
            } catch (java.lang.Throwable th4) {
                th = th4;
                yVar2.releaseIntercepted();
                throw th;
            }
        }
        interfaceC0982h = c0993t.f10516l;
        c0994u = (V7.C0994u) c0993t.f10515k;
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
            } catch (java.lang.Throwable th5) {
                th = th5;
                yVar2 = yVar;
                yVar2.releaseIntercepted();
                throw th;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            p0Var = new V7.p0(th);
            r9 = c0994u.f10518i;
            c0993t.f10515k = th;
            c0993t.f10516l = null;
            c0993t.f10514i = 2;
            if (V7.r.c(p0Var, r9, th, c0993t) == aVar) {
                throw th;
            }
        }
        return aVar;
    }
}
