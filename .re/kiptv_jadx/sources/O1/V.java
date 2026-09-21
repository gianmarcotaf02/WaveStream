package O1;

/* JADX INFO: loaded from: classes.dex */
public final class V extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p028c8.d f7801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7802i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O1.X f7803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7804l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(O1.X x9, p117n6.c cVar) {
        super(cVar);
        this.f7803k = x9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f7804l |= Integer.MIN_VALUE;
        return this.f7803k.c(null, this);
    }
}
