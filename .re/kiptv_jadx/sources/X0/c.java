package X0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f10790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p113n1.l f10791i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X0.f f10794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10795n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(X0.f fVar, p117n6.c cVar) {
        super(cVar);
        this.f10794m = fVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10793l = obj;
        this.f10795n |= Integer.MIN_VALUE;
        return X0.f.a(this.f10794m, null, null, this);
    }
}
