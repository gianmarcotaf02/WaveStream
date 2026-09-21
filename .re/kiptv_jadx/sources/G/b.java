package G;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p181w0.b f3739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object[] f3740i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f3742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G.c f3743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3744n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(G.c cVar, p117n6.c cVar2) {
        super(cVar2);
        this.f3743m = cVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f3742l = obj;
        this.f3744n |= Integer.MIN_VALUE;
        return this.f3743m.a(null, this);
    }
}
