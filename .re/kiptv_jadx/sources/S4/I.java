package S4;

/* JADX INFO: loaded from: classes.dex */
public final class I extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S4.J f9318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p028c8.d f9319i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f9321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S4.J f9322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9323n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(S4.J j, p117n6.c cVar) {
        super(cVar);
        this.f9322m = j;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f9321l = obj;
        this.f9323n |= Integer.MIN_VALUE;
        return this.f9322m.b(0, 0, this);
    }
}
