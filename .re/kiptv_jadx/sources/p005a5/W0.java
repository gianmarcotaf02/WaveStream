package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1218a1 f14047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f14048i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1218a1 f14049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14050l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(p005a5.C1218a1 c1218a1, p117n6.c cVar) {
        super(cVar);
        this.f14049k = c1218a1;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f14050l |= Integer.MIN_VALUE;
        return this.f14049k.d(null, null, this);
    }
}
