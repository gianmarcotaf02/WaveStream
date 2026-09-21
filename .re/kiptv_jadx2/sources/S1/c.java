package S1;

import com.google.common.util.concurrent.P;
import p070h6.A;
import p194x6.m;

public final class c extends p117n6.i implements m {

    public int f9202h;

    public Object f9203i;
    public final p117n6.i j;

    public c(m mVar, p100l6.c cVar) {
        super(2, cVar);
        this.j = (p117n6.i) mVar;
    }

    @Override
    public final p100l6.c create(Object obj, p100l6.c cVar) {
        c cVar2 = new c(this.j, cVar);
        cVar2.f9203i = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (p100l6.c) obj2)).invokeSuspend(A.f22523a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f9202h;
        if (i3 == 0) {
            P.u0(obj);
            b bVar = (b) this.f9203i;
            this.f9202h = 1;
            obj = this.j.invoke(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
        }
        b bVar2 = (b) obj;
        kotlin.jvm.internal.m.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        bVar2.f9201b.f8491a.set(true);
        return bVar2;
    }
}
