package W7;

import V7.InterfaceC0982h;
import com.google.common.util.concurrent.P;

public final class q implements InterfaceC0982h {

    public final U7.j f10757h;

    public final int f10758i;

    public q(U7.j jVar, int i3) {
        this.f10757h = jVar;
        this.f10758i = i3;
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, p100l6.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i3 = pVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.j = i3 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj2 = pVar.f10755h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = pVar.j;
        if (i9 == 0) {
            P.u0(obj2);
            p078i6.z zVar = new p078i6.z(this.f10758i, obj);
            pVar.j = 1;
            if (this.f10757h.send(zVar, pVar) != aVar) {
            }
            return aVar;
        }
        if (i9 == 1) {
            P.u0(obj2);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj2);
        }
        return p070h6.A.f22523a;
        pVar.j = 2;
    }
}
