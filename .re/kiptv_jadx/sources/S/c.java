package S;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p117n6.i implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f9114i;
    public final /* synthetic */ G5.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S.d f9115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S.s f9116l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(G5.a aVar, S.d dVar, S.s sVar, p100l6.c cVar) {
        super(2, cVar);
        this.j = aVar;
        this.f9115k = dVar;
        this.f9116l = sVar;
    }

    @Override // p117n6.a
    public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
        S.c cVar2 = new S.c(this.j, this.f9115k, this.f9116l, cVar);
        cVar2.f9114i = obj;
        return cVar2;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((S.c) create((R0.T) obj, (p100l6.c) obj2)).invokeSuspend(p070h6.A.f22523a);
        return p109m6.a.f25430h;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f9113h;
        if (i3 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            S.b bVar = new S.b((R0.T) this.f9114i, this.j, this.f9115k, this.f9116l, null);
            this.f9113h = 1;
            if (S7.C.m(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        throw new I3.b();
    }
}
