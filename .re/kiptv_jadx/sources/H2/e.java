package H2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements H2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H2.q f3880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S2.o f3881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p028c8.j f3882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H2.n f3883d;

    public e(H2.q qVar, S2.o oVar, p028c8.j jVar, H2.n nVar) {
        this.f3880a = qVar;
        this.f3881b = oVar;
        this.f3882c = jVar;
        this.f3883d = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // H2.k
    public final java.lang.Object a(p100l6.c cVar) throws java.lang.Throwable {
        H2.d dVar;
        p028c8.j jVar;
        H2.e eVar;
        java.lang.Object obj;
        java.lang.Throwable th;
        if (cVar instanceof H2.d) {
            dVar = (H2.d) cVar;
            int i3 = dVar.f3879l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.f3879l = i3 - Integer.MIN_VALUE;
            } else {
                dVar = new H2.d(this, (p117n6.c) cVar);
            }
        } else {
            dVar = new H2.d(this, (p117n6.c) cVar);
        }
        java.lang.Object obj2 = dVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = dVar.f3879l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj2);
                dVar.f3876h = this;
                jVar = this.f3882c;
                dVar.f3877i = jVar;
                dVar.f3879l = 1;
                if (jVar.a(dVar) != aVar) {
                    eVar = this;
                }
                return aVar;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = (p028c8.f) dVar.f3876h;
                try {
                    com.google.common.util.concurrent.P.u0(obj2);
                    H2.i iVar = (H2.i) obj2;
                    ((p028c8.i) obj).c();
                    return iVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((p028c8.i) obj).c();
                    throw th;
                }
            }
            p028c8.j jVar2 = dVar.f3877i;
            eVar = (H2.e) dVar.f3876h;
            com.google.common.util.concurrent.P.u0(obj2);
            jVar = jVar2;
            D5.C0261o c0261o = new D5.C0261o(7, eVar);
            dVar.f3876h = jVar;
            dVar.f3877i = null;
            dVar.f3879l = 2;
            java.lang.Object objK = S7.C.K(p100l6.i.f24820h, new S7.C0885e0(c0261o, null), dVar);
            if (objK != aVar) {
                obj = jVar;
                obj2 = objK;
                H2.i iVar2 = (H2.i) obj2;
                ((p028c8.i) obj).c();
                return iVar2;
            }
            return aVar;
        } catch (java.lang.Throwable th3) {
            obj = jVar;
            th = th3;
            ((p028c8.i) obj).c();
            throw th;
        }
    }
}
