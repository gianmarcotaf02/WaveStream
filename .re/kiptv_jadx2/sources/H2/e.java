package H2;

import D5.C0261o;
import S7.C;
import S7.C0885e0;
import com.google.common.util.concurrent.P;

public final class e implements k {

    public final q f3880a;

    public final S2.o f3881b;

    public final p028c8.j f3882c;

    public final n f3883d;

    public e(q qVar, S2.o oVar, p028c8.j jVar, n nVar) {
        this.f3880a = qVar;
        this.f3881b = oVar;
        this.f3882c = jVar;
        this.f3883d = nVar;
    }

    @Override
    public final Object a(p100l6.c cVar) throws Throwable {
        d dVar;
        p028c8.j jVar;
        e eVar;
        Object obj;
        Throwable th;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i3 = dVar.f3879l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.f3879l = i3 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, (p117n6.c) cVar);
            }
        } else {
            dVar = new d(this, (p117n6.c) cVar);
        }
        Object obj2 = dVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = dVar.f3879l;
        try {
            if (i9 == 0) {
                P.u0(obj2);
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
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = (p028c8.f) dVar.f3876h;
                try {
                    P.u0(obj2);
                    i iVar = (i) obj2;
                    ((p028c8.i) obj).c();
                    return iVar;
                } catch (Throwable th2) {
                    th = th2;
                    ((p028c8.i) obj).c();
                    throw th;
                }
            }
            p028c8.j jVar2 = dVar.f3877i;
            eVar = (e) dVar.f3876h;
            P.u0(obj2);
            jVar = jVar2;
            C0261o c0261o = new C0261o(7, eVar);
            dVar.f3876h = jVar;
            dVar.f3877i = null;
            dVar.f3879l = 2;
            Object objK = C.K(p100l6.i.f24820h, new C0885e0(c0261o, null), dVar);
            if (objK != aVar) {
                obj = jVar;
                obj2 = objK;
                i iVar2 = (i) obj2;
                ((p028c8.i) obj).c();
                return iVar2;
            }
            return aVar;
        } catch (Throwable th3) {
            obj = jVar;
            th = th3;
            ((p028c8.i) obj).c();
            throw th;
        }
    }
}
