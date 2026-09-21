package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Q1.i f8508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Q1.c f8509i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q1.i f8511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8512m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Q1.i iVar, p117n6.c cVar) {
        super(cVar);
        this.f8511l = iVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f8510k = obj;
        this.f8512m |= Integer.MIN_VALUE;
        return this.f8511l.a(null, this);
    }
}
