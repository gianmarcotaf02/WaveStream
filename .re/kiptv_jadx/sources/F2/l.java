package F2;

/* JADX INFO: loaded from: classes.dex */
public final class l implements T2.i, O0.B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p100l6.j f3544c;

    @Override // O0.B
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        f(j);
        O0.g0 g0VarC = q9.C(j);
        return u6.q0(g0VarC.f7639h, g0VarC.f7640i, p078i6.x.f23206h, new B.C0073k(g0VarC, 6));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // T2.i
    public final java.lang.Object e(p100l6.c cVar) {
        F2.k kVar;
        F2.l lVar;
        p100l6.j jVar;
        int iH;
        T2.c aVar;
        T2.c aVar2;
        int iG;
        if (cVar instanceof F2.k) {
            kVar = (F2.k) cVar;
            int i3 = kVar.f3542l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.f3542l = i3 - Integer.MIN_VALUE;
            } else {
                kVar = new F2.k(this, (p117n6.c) cVar);
            }
        } else {
            kVar = new F2.k(this, (p117n6.c) cVar);
        }
        java.lang.Object obj = kVar.j;
        p109m6.a aVar3 = p109m6.a.f25430h;
        int i9 = kVar.f3542l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (p113n1.a.k(this.f3543b)) {
                p100l6.j jVar2 = this.f3544c;
                kVar.f3539h = this;
                kVar.f3540i = jVar2;
                kVar.f3542l = 1;
                p100l6.j jVar3 = new p100l6.j(com.google.common.util.concurrent.P.h0(kVar), p109m6.a.f25431i);
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
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jVar = kVar.f3540i;
        lVar = kVar.f3539h;
        com.google.common.util.concurrent.P.u0(obj);
        if (jVar != null) {
            jVar.resumeWith(p070h6.A.f22523a);
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
            jVar.resumeWith(p070h6.A.f22523a);
        }
        this.f3544c = null;
    }
}
