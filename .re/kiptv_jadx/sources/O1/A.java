package O1;

/* JADX INFO: loaded from: classes.dex */
public final class A extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public O1.N f7726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public O1.Y f7727i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f7728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O1.N f7729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7730m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(O1.N n3, p100l6.c cVar) {
        super(cVar);
        this.f7729l = n3;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f7728k = obj;
        this.f7730m |= Integer.MIN_VALUE;
        return O1.N.e(this.f7729l, false, this);
    }
}
