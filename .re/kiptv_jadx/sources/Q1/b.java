package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f8492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public M8.E f8493i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q1.c f8494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8495l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Q1.c cVar, p117n6.c cVar2) {
        super(cVar2);
        this.f8494k = cVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f8495l |= Integer.MIN_VALUE;
        return Q1.c.a(this.f8494k, this);
    }
}
