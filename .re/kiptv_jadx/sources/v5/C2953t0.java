package v5;

/* JADX INFO: renamed from: v5.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2953t0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v5.d1 f29602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f29603i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f29604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v5.d1 f29605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29606m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2953t0(v5.d1 d1Var, p117n6.c cVar) {
        super(cVar);
        this.f29605l = d1Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f29604k = obj;
        this.f29606m |= Integer.MIN_VALUE;
        return this.f29605l.m(null, false, this);
    }
}
