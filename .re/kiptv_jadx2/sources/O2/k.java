package O2;

import com.google.common.util.concurrent.P;
import p070h6.A;

public final class k extends p117n6.i implements p194x6.m {

    public int f7906h;

    public Object f7907i;
    public final p117n6.i j;

    public k(p194x6.m mVar, p100l6.c cVar) {
        super(2, cVar);
        this.j = (p117n6.i) mVar;
    }

    @Override
    public final p100l6.c create(Object obj, p100l6.c cVar) {
        k kVar = new k(this.j, cVar);
        kVar.f7907i = obj;
        return kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((u) obj, (p100l6.c) obj2)).invokeSuspend(A.f22523a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f7906h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
            return obj;
        }
        P.u0(obj);
        u uVar = (u) this.f7907i;
        int i9 = uVar.f7943a;
        if ((200 > i9 || i9 >= 300) && i9 != 304) {
            throw new I3.b("HTTP " + uVar.f7943a);
        }
        this.f7906h = 1;
        Object objInvoke = this.j.invoke(uVar, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
