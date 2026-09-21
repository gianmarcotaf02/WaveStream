package Z;

public final class B0 extends p117n6.i implements p194x6.m {
    @Override
    public final p100l6.c create(Object obj, p100l6.c cVar) {
        return new B0(2, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        B0 b9 = (B0) create((K0.B) obj, (p100l6.c) obj2);
        p070h6.A a2 = p070h6.A.f22523a;
        b9.invokeSuspend(a2);
        return a2;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        com.google.common.util.concurrent.P.u0(obj);
        return p070h6.A.f22523a;
    }
}
