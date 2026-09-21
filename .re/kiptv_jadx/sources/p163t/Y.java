package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f27525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p163t.C2755f0 f27526i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(p163t.C2755f0 c2755f0, p117n6.c cVar) {
        super(cVar);
        this.f27526i = c2755f0;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f27525h = obj;
        this.j |= Integer.MIN_VALUE;
        return p163t.C2755f0.F0(this.f27526i, this);
    }
}
