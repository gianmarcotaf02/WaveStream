package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.v2 f12092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f12093i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y4.v2 f12094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12095l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(Y4.v2 v2Var, p117n6.c cVar) {
        super(cVar);
        this.f12094k = v2Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f12095l |= Integer.MIN_VALUE;
        return this.f12094k.q(null, this);
    }
}
