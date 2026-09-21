package p005a5;

/* JADX INFO: renamed from: a5.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1370p3 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.B3 f14935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f14936i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.B3 f14938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14939m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370p3(p005a5.B3 b9, p117n6.c cVar) {
        super(cVar);
        this.f14938l = b9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14937k = obj;
        this.f14939m |= Integer.MIN_VALUE;
        return this.f14938l.n(0, null, this);
    }
}
