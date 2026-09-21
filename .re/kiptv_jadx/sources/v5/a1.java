package v5;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f29400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v5.d1 f29401i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(v5.d1 d1Var, p117n6.c cVar) {
        super(cVar);
        this.f29401i = d1Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f29400h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f29401i.s(null, null, this);
    }
}
