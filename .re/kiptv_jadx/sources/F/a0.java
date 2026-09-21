package F;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends p117n6.i implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F.b0 f3405i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(F.b0 b0Var, int i3, p100l6.c cVar) {
        super(2, cVar);
        this.f3405i = b0Var;
        this.j = i3;
    }

    @Override // p117n6.a
    public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
        return new F.a0(this.f3405i, this.j, cVar);
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.a0) create((S7.A) obj, (p100l6.c) obj2)).invokeSuspend(p070h6.A.f22523a);
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f3404h;
        if (i3 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            F.W w6 = this.f3405i.f3416w;
            this.f3404h = 1;
            if (w6.f(this.j, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        return p070h6.A.f22523a;
    }
}
