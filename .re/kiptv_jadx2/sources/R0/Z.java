package R0;

import C7.C0173e;
import I5.C0507s1;
import S7.C0895k;
import android.view.Choreographer;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import java.util.ArrayList;
import p020c0.C1674d;
import p020c0.C1676e;
import p020c0.C1683h0;
import p020c0.C1702r0;

public final class Z implements p100l6.f {

    public final int f8867h;

    public final Object f8868i;
    public final Object j;

    public Z(Choreographer choreographer, X x9) {
        this.f8867h = 0;
        this.f8868i = choreographer;
        this.j = x9;
    }

    public final Object a(p194x6.j jVar, p100l6.c cVar) {
        C1683h0 c1683h0;
        boolean z6;
        Object objQ;
        X x9 = null;
        switch (this.f8867h) {
            case 0:
                X x10 = (X) this.j;
                if (x10 == null) {
                    p100l6.f fVar = cVar.getContext().get(p100l6.d.f24819h);
                    if (fVar instanceof X) {
                        x9 = (X) fVar;
                    }
                } else {
                    x9 = x10;
                }
                C0895k c0895k = new C0895k(1, com.google.common.util.concurrent.P.h0(cVar));
                c0895k.r();
                Y y = new Y(c0895k, this, jVar);
                if (x9 == null || !kotlin.jvm.internal.m.a(x9.f8855i, (Choreographer) this.f8868i)) {
                    ((Choreographer) this.f8868i).postFrameCallback(y);
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
                Object objQ2 = c0895k.q();
                p109m6.a aVar = p109m6.a.f25430h;
                return objQ2;
            case 1:
                C0895k c0895k2 = new C0895k(1, com.google.common.util.concurrent.P.h0(cVar));
                c0895k2.r();
                C1674d c1674d = new C1674d();
                c1674d.f18234a = c0895k2;
                c1674d.f18235b = jVar;
                c0895k2.t(new C0173e(19, ((E2.d) this.j).h(c1674d, (C1702r0) this.f8868i)));
                Object objQ3 = c0895k2.q();
                p109m6.a aVar2 = p109m6.a.f25430h;
                return objQ3;
            default:
                if (cVar instanceof C1683h0) {
                    c1683h0 = (C1683h0) cVar;
                    int i3 = c1683h0.f18251k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c1683h0.f18251k = i3 - Integer.MIN_VALUE;
                    } else {
                        c1683h0 = new C1683h0(this, cVar);
                    }
                } else {
                    c1683h0 = new C1683h0(this, cVar);
                }
                Object obj = c1683h0.f18250i;
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
                        C0895k c0895k3 = new C0895k(1, com.google.common.util.concurrent.P.h0(c1683h0));
                        c0895k3.r();
                        synchronized (i0Var.f3465b) {
                            ((ArrayList) i0Var.f3466c).add(c0895k3);
                        }
                        c0895k3.t(new C0507s1(i0Var, c0895k3, 11));
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
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                    return obj;
                }
                jVar = c1683h0.f18249h;
                com.google.common.util.concurrent.P.u0(obj);
                Z z9 = (Z) this.f8868i;
                c1683h0.f18249h = null;
                c1683h0.f18251k = 2;
                Object objA = z9.a(jVar, c1683h0);
                if (objA != aVar3) {
                    return objA;
                }
                return aVar3;
        }
    }

    @Override
    public final Object fold(Object obj, p194x6.m mVar) {
        switch (this.f8867h) {
            case 0:
                break;
            case 1:
                break;
        }
        return mVar.invoke(obj, this);
    }

    @Override
    public final p100l6.f get(p100l6.g gVar) {
        switch (this.f8867h) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC1833d1.t(this, gVar);
    }

    @Override
    public p100l6.g getKey() {
        return C1676e.j;
    }

    @Override
    public final p100l6.h minusKey(p100l6.g gVar) {
        switch (this.f8867h) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC1833d1.G(this, gVar);
    }

    @Override
    public final p100l6.h plus(p100l6.h hVar) {
        switch (this.f8867h) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC1833d1.H(this, hVar);
    }

    public Z(Z z6) {
        this.f8867h = 2;
        this.f8868i = z6;
        this.j = new F.i0();
    }

    public Z(C1702r0 c1702r0) {
        this.f8867h = 1;
        this.f8868i = c1702r0;
        this.j = new E2.d(8);
    }
}
