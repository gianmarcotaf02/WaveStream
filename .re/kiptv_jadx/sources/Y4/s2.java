package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y4.v2 f12079i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(Y4.v2 v2Var, p117n6.c cVar) {
        super(cVar);
        this.f12079i = v2Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12078h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f12079i.p(this);
    }
}
