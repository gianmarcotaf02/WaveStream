package D;

/* JADX INFO: loaded from: classes.dex */
public final class B extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v.n0 f1635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p194x6.m f1636i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D.D f1637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1638l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D.D d4, p100l6.c cVar) {
        super(cVar);
        this.f1637k = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f1638l |= Integer.MIN_VALUE;
        return this.f1637k.c(null, null, this);
    }
}
