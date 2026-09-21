package R2;

import A8.j;
import I5.C0507s1;
import O2.k;
import O2.t;
import O2.u;
import S7.C0895k;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.P;
import java.io.Closeable;
import p194x6.m;
import w8.B;
import w8.InterfaceC3024d;
import w8.s;
import w8.v;

public final class b {

    public final InterfaceC3024d f9045a;

    public b(InterfaceC3024d interfaceC3024d) {
        this.f9045a = interfaceC3024d;
    }

    public static Object a(InterfaceC3024d interfaceC3024d, t tVar, k kVar, p117n6.c cVar) {
        a aVar;
        m mVar;
        m mVar2;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i3 = aVar.f9044k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f9044k = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar);
            }
        } else {
            aVar = new a(cVar);
        }
        Object objJ = aVar.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = aVar.f9044k;
        if (i9 == 0) {
            P.u0(objJ);
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
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = (Closeable) aVar.f9042h;
                try {
                    P.u0(objJ);
                    AbstractC1833d1.l(closeable2, null);
                    return objJ;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        AbstractC1833d1.l(closeable2, th);
                        throw th3;
                    }
                }
            }
            m mVar3 = (m) aVar.f9042h;
            P.u0(objJ);
            mVar2 = mVar3;
            closeable = (Closeable) objJ;
            try {
                u uVarI = p000a.a.i((B) closeable);
                aVar.f9042h = closeable;
                aVar.f9044k = 3;
                objJ = mVar2.invoke(uVarI, aVar);
                if (objJ != aVar2) {
                    closeable2 = closeable;
                    AbstractC1833d1.l(closeable2, null);
                    return objJ;
                }
                mVar = kVar;
                return aVar2;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        interfaceC3024d = aVar.f9043i;
        m mVar4 = (m) aVar.f9042h;
        P.u0(objJ);
        mVar = mVar4;
        mVar = kVar;
        v request = (v) objJ;
        s sVar = (s) interfaceC3024d;
        sVar.getClass();
        kotlin.jvm.internal.m.e(request, "request");
        j jVar = new j(sVar, request, false);
        aVar.f9042h = mVar;
        aVar.f9043i = null;
        aVar.f9044k = 2;
        C0895k c0895k = new C0895k(1, P.h0(aVar));
        c0895k.r();
        C0507s1 c0507s1 = new C0507s1(jVar, c0895k, 7);
        jVar.e(c0507s1);
        c0895k.t(c0507s1);
        objJ = c0895k.q();
        if (objJ != aVar2) {
            mVar2 = mVar;
            closeable = (Closeable) objJ;
            u uVarI2 = p000a.a.i((B) closeable);
            aVar.f9042h = closeable;
            aVar.f9044k = 3;
            objJ = mVar2.invoke(uVarI2, aVar);
            if (objJ != aVar2) {
                closeable2 = closeable;
                AbstractC1833d1.l(closeable2, null);
                return objJ;
            }
        }
        mVar = kVar;
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return kotlin.jvm.internal.m.a(this.f9045a, ((b) obj).f9045a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9045a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f9045a + ')';
    }
}
