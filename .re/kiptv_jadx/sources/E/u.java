package E;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v.n0 f2707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p194x6.m f2708i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E.w f2709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2710l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(E.w wVar, p100l6.c cVar) {
        super(cVar);
        this.f2709k = wVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f2710l |= Integer.MIN_VALUE;
        return this.f2709k.c(null, null, this);
    }
}
