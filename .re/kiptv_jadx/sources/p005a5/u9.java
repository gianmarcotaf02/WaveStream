package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class u9 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.x9 f15156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f15157i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.x9 f15158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15159l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(p005a5.x9 x9Var, p117n6.c cVar) {
        super(cVar);
        this.f15158k = x9Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f15159l |= Integer.MIN_VALUE;
        return this.f15158k.g(0, this);
    }
}
