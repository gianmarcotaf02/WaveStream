package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1218a1 f14110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p005a5.O0 f14111i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1218a1 f14112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14113l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(p005a5.C1218a1 c1218a1, p117n6.c cVar) {
        super(cVar);
        this.f14112k = c1218a1;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f14113l |= Integer.MIN_VALUE;
        return this.f14112k.f(this);
    }
}
