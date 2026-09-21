package U7;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.j implements p194x6.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final U7.f f10180h = new U7.f(3, U7.j.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        U7.s sVar;
        U7.j jVar = (U7.j) obj;
        p008a8.h hVar = (p008a8.h) obj2;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = U7.j.f10186i;
        jVar.getClass();
        U7.s sVar2 = (U7.s) U7.j.f10190n.get(jVar);
        while (!jVar.t()) {
            long andIncrement = U7.j.j.getAndIncrement(jVar);
            long j = U7.l.f10197b;
            long j9 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (sVar2.j != j9) {
                U7.s sVarM = jVar.m(j9, sVar2);
                if (sVarM == null) {
                    continue;
                } else {
                    sVar = sVarM;
                }
            } else {
                sVar = sVar2;
            }
            java.lang.Object objD = jVar.D(sVar, i3, andIncrement, hVar);
            U7.s sVar3 = sVar;
            if (objD == U7.l.f10206m) {
                S7.H0 h9 = hVar instanceof S7.H0 ? (S7.H0) hVar : null;
                if (h9 != null) {
                    h9.a(sVar3, i3);
                }
            } else if (objD == U7.l.f10208o) {
                if (andIncrement < jVar.q()) {
                    sVar3.a();
                }
                sVar2 = sVar3;
            } else {
                if (objD == U7.l.f10207n) {
                    throw new java.lang.IllegalStateException("unexpected");
                }
                sVar3.a();
                ((p008a8.g) hVar).f15537l = objD;
            }
            return p070h6.A.f22523a;
        }
        ((p008a8.g) hVar).f15537l = U7.l.f10205l;
        return p070h6.A.f22523a;
    }
}
