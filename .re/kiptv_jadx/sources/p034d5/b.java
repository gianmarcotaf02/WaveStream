package p034d5;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p034d5.c f21233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f21234i;
    public p028c8.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f21235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p034d5.c f21236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21237m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p034d5.c cVar, p117n6.c cVar2) {
        super(cVar2);
        this.f21236l = cVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f21235k = obj;
        this.f21237m |= Integer.MIN_VALUE;
        return this.f21236l.b(null, this);
    }
}
