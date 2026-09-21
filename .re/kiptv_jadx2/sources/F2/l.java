package F2;

import B.C0073k;
import O0.B;
import O0.Q;
import O0.T;
import O0.U;
import O0.g0;
import com.google.common.util.concurrent.P;
import p070h6.A;
import p078i6.x;

public final class l implements T2.i, B {

    public long f3543b;

    public p100l6.j f3544c;

    @Override
    public final T b(U u6, Q q9, long j) {
        f(j);
        g0 g0VarC = q9.C(j);
        return u6.q0(g0VarC.f7639h, g0VarC.f7640i, x.f23206h, new C0073k(g0VarC, 6));
    }

    @Override
    public final Object e(p100l6.c cVar) {
        k kVar;
        l lVar;
        p100l6.j jVar;
        int iH;
        T2.c aVar;
        T2.c aVar2;
        int iG;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i3 = kVar.f3542l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.f3542l = i3 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, (p117n6.c) cVar);
            }
        } else {
            kVar = new k(this, (p117n6.c) cVar);
        }
        Object obj = kVar.j;
        p109m6.a aVar3 = p109m6.a.f25430h;
        int i9 = kVar.f3542l;
        if (i9 == 0) {
            P.u0(obj);
            if (p113n1.a.k(this.f3543b)) {
                p100l6.j jVar2 = this.f3544c;
                kVar.f3539h = this;
                kVar.f3540i = jVar2;
                kVar.f3542l = 1;
                p100l6.j jVar3 = new p100l6.j(P.h0(kVar), p109m6.a.f25431i);
                this.f3544c = jVar3;
                if (jVar3.a() == aVar3) {
                    return aVar3;
                }
                lVar = this;
                jVar = jVar2;
            } else {
                lVar = this;
            }
            long j = lVar.f3543b;
            iH = p113n1.a.h(j);
            aVar = T2.b.f9732a;
            if (iH != Integer.MAX_VALUE) {
                R8.i.b(iH);
                aVar2 = new T2.a(iH);
            } else {
                aVar2 = aVar;
            }
            iG = p113n1.a.g(j);
            if (iG != Integer.MAX_VALUE) {
                R8.i.b(iG);
                aVar = new T2.a(iG);
            }
            return new T2.h(aVar2, aVar);
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jVar = kVar.f3540i;
        lVar = kVar.f3539h;
        P.u0(obj);
        if (jVar != null) {
            jVar.resumeWith(A.f22523a);
        }
        long j9 = lVar.f3543b;
        iH = p113n1.a.h(j9);
        aVar = T2.b.f9732a;
        if (iH != Integer.MAX_VALUE) {
            R8.i.b(iH);
            aVar2 = new T2.a(iH);
        } else {
            aVar2 = aVar;
        }
        iG = p113n1.a.g(j9);
        if (iG != Integer.MAX_VALUE) {
            R8.i.b(iG);
            aVar = new T2.a(iG);
        }
        return new T2.h(aVar2, aVar);
    }

    public final void f(long j) {
        this.f3543b = j;
        if (p113n1.a.k(j)) {
            return;
        }
        p100l6.j jVar = this.f3544c;
        if (jVar != null) {
            jVar.resumeWith(A.f22523a);
        }
        this.f3544c = null;
    }
}
