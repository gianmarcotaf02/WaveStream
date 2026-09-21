package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class W1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.Z1 f14051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f14052i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.Z1 f14053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14054l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(p005a5.Z1 z6, p117n6.c cVar) {
        super(cVar);
        this.f14053k = z6;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f14054l |= Integer.MIN_VALUE;
        return this.f14053k.c(0, false, this);
    }
}
