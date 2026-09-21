package R0;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements p100l6.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f8868i;
    public final java.lang.Object j;

    public Z(android.view.Choreographer choreographer, R0.X x9) {
        this.f8867h = 0;
        this.f8868i = choreographer;
        this.j = x9;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final java.lang.Object a(p194x6.j jVar, p100l6.c cVar) {
        p020c0.C1683h0 c1683h0;
        boolean z6;
        java.lang.Object objQ;
        R0.X x9 = null;
        switch (this.f8867h) {
            case 0:
                R0.X x10 = (R0.X) this.j;
                if (x10 == null) {
                    p100l6.f fVar = cVar.getContext().get(p100l6.d.f24819h);
                    if (fVar instanceof R0.X) {
                        x9 = (R0.X) fVar;
                    }
                } else {
                    x9 = x10;
                }
                S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(cVar));
                c0895k.r();
                R0.Y y = new R0.Y(c0895k, this, jVar);
                if (x9 == null || !kotlin.jvm.internal.m.a(x9.f8855i, (android.view.Choreographer) this.f8868i)) {
                    ((android.view.Choreographer) this.f8868i).postFrameCallback(y);
                    c0895k.t(new K0.D(this, y, 7));
                } else {
                    synchronized (x9.f8856k) {
                        x9.f8858m.add(y);
                        if (!x9.f8861p) {
                            x9.f8861p = true;
                            x9.f8855i.postFrameCallback(x9.f8862q);
                        }
                        break;
                    }
                    c0895k.t(new K0.D(x9, y, 6));
                }
                java.lang.Object objQ2 = c0895k.q();
                p109m6.a aVar = p109m6.a.f25430h;
                return objQ2;
            case 1:
                S7.C0895k c0895k2 = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(cVar));
                c0895k2.r();
                p020c0.C1674d c1674d = new p020c0.C1674d();
                c1674d.f18234a = c0895k2;
                c1674d.f18235b = jVar;
                c0895k2.t(new C7.C0173e(19, ((E2.d) this.j).h(c1674d, (p020c0.C1702r0) this.f8868i)));
                java.lang.Object objQ3 = c0895k2.q();
                p109m6.a aVar2 = p109m6.a.f25430h;
                return objQ3;
            default:
                if (cVar instanceof p020c0.C1683h0) {
                    c1683h0 = (p020c0.C1683h0) cVar;
                    int i3 = c1683h0.f18251k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c1683h0.f18251k = i3 - Integer.MIN_VALUE;
                    } else {
                        c1683h0 = new p020c0.C1683h0(this, cVar);
                    }
                } else {
                    c1683h0 = new p020c0.C1683h0(this, cVar);
                }
                java.lang.Object obj = c1683h0.f18250i;
                p109m6.a aVar3 = p109m6.a.f25430h;
                int i9 = c1683h0.f18251k;
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(obj);
                    F.i0 i0Var = (F.i0) this.j;
                    c1683h0.f18249h = jVar;
                    c1683h0.f18251k = 1;
                    synchronized (i0Var.f3465b) {
                        z6 = i0Var.f3464a;
                    }
                    if (z6) {
                        objQ = p070h6.A.f22523a;
                    } else {
                        S7.C0895k c0895k3 = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(c1683h0));
                        c0895k3.r();
                        synchronized (i0Var.f3465b) {
                            ((java.util.ArrayList) i0Var.f3466c).add(c0895k3);
                        }
                        c0895k3.t(new I5.C0507s1(i0Var, c0895k3, 11));
                        objQ = c0895k3.q();
                        if (objQ != aVar3) {
                            objQ = p070h6.A.f22523a;
                        }
                    }
                    if (objQ != aVar3) {
                    }
                    return aVar3;
                }
                if (i9 != 1) {
                    if (i9 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                    return obj;
                }
                jVar = c1683h0.f18249h;
                com.google.common.util.concurrent.P.u0(obj);
                R0.Z z9 = (R0.Z) this.f8868i;
                c1683h0.f18249h = null;
                c1683h0.f18251k = 2;
                java.lang.Object objA = z9.a(jVar, c1683h0);
                if (objA != aVar3) {
                    return objA;
                }
                return aVar3;
        }
    }

    @Override // p100l6.h
    public final java.lang.Object fold(java.lang.Object obj, p194x6.m mVar) {
        switch (this.f8867h) {
            case 0:
                break;
            case 1:
                break;
        }
        return mVar.invoke(obj, this);
    }

    @Override // p100l6.h
    public final p100l6.f get(p100l6.g gVar) {
        switch (this.f8867h) {
            case 0:
                break;
            case 1:
                break;
        }
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.t(this, gVar);
    }

    @Override // p100l6.f
    public p100l6.g getKey() {
        return p020c0.C1676e.j;
    }

    @Override // p100l6.h
    public final p100l6.h minusKey(p100l6.g gVar) {
        switch (this.f8867h) {
            case 0:
                break;
            case 1:
                break;
        }
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.G(this, gVar);
    }

    @Override // p100l6.h
    public final p100l6.h plus(p100l6.h hVar) {
        switch (this.f8867h) {
            case 0:
                break;
            case 1:
                break;
        }
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.H(this, hVar);
    }

    public Z(R0.Z z6) {
        this.f8867h = 2;
        this.f8868i = z6;
        this.j = new F.i0();
    }

    public Z(p020c0.C1702r0 c1702r0) {
        this.f8867h = 1;
        this.f8868i = c1702r0;
        this.j = new E2.d(8);
    }
}
