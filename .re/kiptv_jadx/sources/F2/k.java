package F2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public F2.l f3539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p100l6.j f3540i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F2.l f3541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3542l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(F2.l lVar, p117n6.c cVar) {
        super(cVar);
        this.f3541k = lVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f3542l |= Integer.MIN_VALUE;
        return this.f3541k.e(this);
    }
}
