package p034d5;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p034d5.c f21246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p028c8.d f21247i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p034d5.c f21248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21249l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p034d5.c cVar, p117n6.c cVar2) {
        super(cVar2);
        this.f21248k = cVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f21249l |= Integer.MIN_VALUE;
        return this.f21248k.a(this);
    }
}
