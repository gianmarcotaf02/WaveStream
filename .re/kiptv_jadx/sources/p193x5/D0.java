package p193x5;

/* JADX INFO: loaded from: classes4.dex */
public final class D0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p193x5.s1 f31238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f31239i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f31240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p193x5.s1 f31241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31242m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(p193x5.s1 s1Var, p117n6.c cVar) {
        super(cVar);
        this.f31241l = s1Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f31240k = obj;
        this.f31242m |= Integer.MIN_VALUE;
        return this.f31241l.p(null, false, this);
    }
}
