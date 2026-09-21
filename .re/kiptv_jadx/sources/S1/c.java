package S1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p117n6.i implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f9203i;
    public final /* synthetic */ p117n6.i j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p194x6.m mVar, p100l6.c cVar) {
        super(2, cVar);
        this.j = (p117n6.i) mVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n6.i, x6.m] */
    @Override // p117n6.a
    public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
        S1.c cVar2 = new S1.c(this.j, cVar);
        cVar2.f9203i = obj;
        return cVar2;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((S1.c) create((S1.b) obj, (p100l6.c) obj2)).invokeSuspend(p070h6.A.f22523a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [n6.i, x6.m] */
    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f9202h;
        if (i3 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            S1.b bVar = (S1.b) this.f9203i;
            this.f9202h = 1;
            obj = this.j.invoke(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        S1.b bVar2 = (S1.b) obj;
        kotlin.jvm.internal.m.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        bVar2.f9201b.f8491a.set(true);
        return bVar2;
    }
}
