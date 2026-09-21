package O2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p117n6.i implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f7907i;
    public final /* synthetic */ p117n6.i j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(p194x6.m mVar, p100l6.c cVar) {
        super(2, cVar);
        this.j = (p117n6.i) mVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n6.i, x6.m] */
    @Override // p117n6.a
    public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
        O2.k kVar = new O2.k(this.j, cVar);
        kVar.f7907i = obj;
        return kVar;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((O2.k) create((O2.u) obj, (p100l6.c) obj2)).invokeSuspend(p070h6.A.f22523a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [n6.i, x6.m] */
    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f7906h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            return obj;
        }
        com.google.common.util.concurrent.P.u0(obj);
        O2.u uVar = (O2.u) this.f7907i;
        int i9 = uVar.f7943a;
        if ((200 > i9 || i9 >= 300) && i9 != 304) {
            throw new I3.b("HTTP " + uVar.f7943a);
        }
        this.f7906h = 1;
        java.lang.Object objInvoke = this.j.invoke(uVar, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
