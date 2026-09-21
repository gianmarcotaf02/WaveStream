package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f13603i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.O f13604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13605l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(p005a5.O o8, p117n6.c cVar) {
        super(cVar);
        this.f13604k = o8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f13605l |= Integer.MIN_VALUE;
        return this.f13604k.e(0, 0, 0, null, null, this);
    }
}
