package H2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f3876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p028c8.j f3877i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ H2.e f3878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3879l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(H2.e eVar, p117n6.c cVar) {
        super(cVar);
        this.f3878k = eVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f3879l |= Integer.MIN_VALUE;
        return this.f3878k.a(this);
    }
}
