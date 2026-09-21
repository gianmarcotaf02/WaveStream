package R2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.InterfaceC3024d f9045a;

    public /* synthetic */ b(w8.InterfaceC3024d interfaceC3024d) {
        this.f9045a = interfaceC3024d;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static java.lang.Object a(w8.InterfaceC3024d interfaceC3024d, O2.t tVar, O2.k kVar, p117n6.c cVar) {
        R2.a aVar;
        p194x6.m mVar;
        p194x6.m mVar2;
        java.io.Closeable closeable;
        java.lang.Throwable th;
        java.io.Closeable closeable2;
        if (cVar instanceof R2.a) {
            aVar = (R2.a) cVar;
            int i3 = aVar.f9044k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f9044k = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new R2.a(cVar);
            }
        } else {
            aVar = new R2.a(cVar);
        }
        java.lang.Object objJ = aVar.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = aVar.f9044k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objJ);
            aVar.f9042h = kVar;
            aVar.f9043i = interfaceC3024d;
            aVar.f9044k = 1;
            objJ = p000a.a.j(tVar, aVar);
            if (objJ != aVar2) {
            }
            mVar = kVar;
            return aVar2;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = (java.io.Closeable) aVar.f9042h;
                try {
                    com.google.common.util.concurrent.P.u0(objJ);
                    com.google.android.gms.internal.play_billing.AbstractC1833d1.l(closeable2, null);
                    return objJ;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(closeable2, th);
                        throw th3;
                    }
                }
            }
            p194x6.m mVar3 = (p194x6.m) aVar.f9042h;
            com.google.common.util.concurrent.P.u0(objJ);
            mVar2 = mVar3;
            closeable = (java.io.Closeable) objJ;
            try {
                O2.u uVarI = p000a.a.i((w8.B) closeable);
                aVar.f9042h = closeable;
                aVar.f9044k = 3;
                objJ = mVar2.invoke(uVarI, aVar);
                if (objJ != aVar2) {
                    closeable2 = closeable;
                    com.google.android.gms.internal.play_billing.AbstractC1833d1.l(closeable2, null);
                    return objJ;
                }
                mVar = kVar;
                return aVar2;
            } catch (java.lang.Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        interfaceC3024d = aVar.f9043i;
        p194x6.m mVar4 = (p194x6.m) aVar.f9042h;
        com.google.common.util.concurrent.P.u0(objJ);
        mVar = mVar4;
        mVar = kVar;
        w8.v request = (w8.v) objJ;
        w8.s sVar = (w8.s) interfaceC3024d;
        sVar.getClass();
        kotlin.jvm.internal.m.e(request, "request");
        A8.j jVar = new A8.j(sVar, request, false);
        aVar.f9042h = mVar;
        aVar.f9043i = null;
        aVar.f9044k = 2;
        S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(aVar));
        c0895k.r();
        I5.C0507s1 c0507s1 = new I5.C0507s1(jVar, c0895k, 7);
        jVar.e(c0507s1);
        c0895k.t(c0507s1);
        objJ = c0895k.q();
        if (objJ != aVar2) {
            mVar2 = mVar;
            closeable = (java.io.Closeable) objJ;
            O2.u uVarI2 = p000a.a.i((w8.B) closeable);
            aVar.f9042h = closeable;
            aVar.f9044k = 3;
            objJ = mVar2.invoke(uVarI2, aVar);
            if (objJ != aVar2) {
                closeable2 = closeable;
                com.google.android.gms.internal.play_billing.AbstractC1833d1.l(closeable2, null);
                return objJ;
            }
        }
        mVar = kVar;
        return aVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof R2.b) {
            return kotlin.jvm.internal.m.a(this.f9045a, ((R2.b) obj).f9045a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9045a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f9045a + ')';
    }
}
