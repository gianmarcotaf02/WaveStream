package Z;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends p117n6.i implements p194x6.m {
    @Override // p117n6.a
    public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
        return new Z.B0(2, cVar);
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        Z.B0 b9 = (Z.B0) create((K0.B) obj, (p100l6.c) obj2);
        p070h6.A a2 = p070h6.A.f22523a;
        b9.invokeSuspend(a2);
        return a2;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        com.google.common.util.concurrent.P.u0(obj);
        return p070h6.A.f22523a;
    }
}
