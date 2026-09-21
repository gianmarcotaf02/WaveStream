package S;

import R0.T;
import S7.C;
import com.google.common.util.concurrent.P;
import p070h6.A;

public final class c extends p117n6.i implements p194x6.m {

    public int f9113h;

    public Object f9114i;
    public final G5.a j;

    public final d f9115k;

    public final s f9116l;

    public c(G5.a aVar, d dVar, s sVar, p100l6.c cVar) {
        super(2, cVar);
        this.j = aVar;
        this.f9115k = dVar;
        this.f9116l = sVar;
    }

    @Override
    public final p100l6.c create(Object obj, p100l6.c cVar) {
        c cVar2 = new c(this.j, this.f9115k, this.f9116l, cVar);
        cVar2.f9114i = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        ((c) create((T) obj, (p100l6.c) obj2)).invokeSuspend(A.f22523a);
        return p109m6.a.f25430h;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f9113h;
        if (i3 == 0) {
            P.u0(obj);
            b bVar = new b((T) this.f9114i, this.j, this.f9115k, this.f9116l, null);
            this.f9113h = 1;
            if (C.m(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
        }
        throw new I3.b();
    }
}
