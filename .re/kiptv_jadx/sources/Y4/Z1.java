package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.v2 f11799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f11800i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y4.v2 f11801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11802l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(Y4.v2 v2Var, p117n6.c cVar) {
        super(cVar);
        this.f11801k = v2Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f11802l |= Integer.MIN_VALUE;
        return this.f11801k.e(null, this);
    }
}
