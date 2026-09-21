package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y4.v2 f11965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f11966i;
    public final /* synthetic */ Y4.v2 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11967k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Y4.v2 v2Var, p117n6.c cVar) {
        super(cVar);
        this.j = v2Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f11966i = obj;
        this.f11967k |= Integer.MIN_VALUE;
        return this.j.l(this);
    }
}
