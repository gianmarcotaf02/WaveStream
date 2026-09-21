package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1218a1 f14074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14075i;
    public final /* synthetic */ p005a5.C1218a1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14076k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(p005a5.C1218a1 c1218a1, p117n6.c cVar) {
        super(cVar);
        this.j = c1218a1;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14075i = obj;
        this.f14076k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
