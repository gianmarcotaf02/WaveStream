package p005a5;

/* JADX INFO: renamed from: a5.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1347n0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1357o0 f14797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f14798i;
    public p028c8.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1357o0 f14800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14801m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347n0(p005a5.C1357o0 c1357o0, p117n6.c cVar) {
        super(cVar);
        this.f14800l = c1357o0;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14799k = obj;
        this.f14801m |= Integer.MIN_VALUE;
        return this.f14800l.n(null, this);
    }
}
