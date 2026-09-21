package U;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U.i0 f10000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10001i;
    public final /* synthetic */ U.i0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10002k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(U.i0 i0Var, p117n6.c cVar) {
        super(cVar);
        this.j = i0Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10001i = obj;
        this.f10002k |= Integer.MIN_VALUE;
        return this.j.s(this);
    }
}
