package O1;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p028c8.d f7805a = new p028c8.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A.a f7806b = new A.a(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O1.C0754s f7807c = new O1.C0754s(new O1.W(2, null));

    public X(java.lang.String str) {
    }

    public final java.lang.Integer a() {
        return new java.lang.Integer(((java.util.concurrent.atomic.AtomicInteger) this.f7806b.f9i).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(p194x6.j jVar, p117n6.c cVar) {
        O1.U u6;
        p028c8.d dVar;
        java.lang.Throwable th;
        p028c8.a aVar;
        if (cVar instanceof O1.U) {
            u6 = (O1.U) cVar;
            int i3 = u6.f7800l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u6.f7800l = i3 - Integer.MIN_VALUE;
            } else {
                u6 = new O1.U(this, cVar);
            }
        } else {
            u6 = new O1.U(this, cVar);
        }
        java.lang.Object obj = u6.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = u6.f7800l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                u6.f7797h = jVar;
                dVar = this.f7805a;
                u6.f7798i = dVar;
                u6.f7800l = 1;
                if (dVar.e(u6) != aVar2) {
                }
                return aVar2;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (p028c8.a) u6.f7797h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                    ((p028c8.d) aVar).g(null);
                    return obj;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((p028c8.d) aVar).g(null);
                    throw th;
                }
            }
            p028c8.d dVar2 = u6.f7798i;
            p194x6.j jVar2 = (p194x6.j) u6.f7797h;
            com.google.common.util.concurrent.P.u0(obj);
            dVar = dVar2;
            jVar = jVar2;
            u6.f7797h = dVar;
            u6.f7798i = null;
            u6.f7800l = 2;
            java.lang.Object objInvoke = jVar.invoke(u6);
            if (objInvoke != aVar2) {
                p028c8.d dVar3 = dVar;
                obj = objInvoke;
                aVar = dVar3;
                ((p028c8.d) aVar).g(null);
                return obj;
            }
            return aVar2;
        } catch (java.lang.Throwable th3) {
            p028c8.d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((p028c8.d) aVar).g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(p194x6.m mVar, p117n6.c cVar) throws java.lang.Throwable {
        O1.V v6;
        p028c8.d dVar;
        java.lang.Throwable th;
        boolean z6;
        if (cVar instanceof O1.V) {
            v6 = (O1.V) cVar;
            int i3 = v6.f7804l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v6.f7804l = i3 - Integer.MIN_VALUE;
            } else {
                v6 = new O1.V(this, cVar);
            }
        } else {
            v6 = new O1.V(this, cVar);
        }
        java.lang.Object obj = v6.j;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = v6.f7804l;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z6 = v6.f7802i;
            dVar = v6.f7801h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                if (z6) {
                    dVar.g(null);
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (z6) {
                    dVar.g(null);
                }
                throw th;
            }
        }
        com.google.common.util.concurrent.P.u0(obj);
        p028c8.d dVar2 = this.f7805a;
        boolean zF = dVar2.f();
        try {
            java.lang.Object objValueOf = java.lang.Boolean.valueOf(zF);
            v6.f7801h = dVar2;
            v6.f7802i = zF;
            v6.f7804l = 1;
            java.lang.Object objInvoke = mVar.invoke(objValueOf, v6);
            if (objInvoke == obj2) {
                return obj2;
            }
            dVar = dVar2;
            obj = objInvoke;
            z6 = zF;
            if (z6) {
                dVar.g(null);
            }
            return obj;
        } catch (java.lang.Throwable th3) {
            dVar = dVar2;
            th = th3;
            z6 = zF;
            if (z6) {
                dVar.g(null);
            }
            throw th;
        }
    }
}
