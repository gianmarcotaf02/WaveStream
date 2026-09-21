package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class P1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I5.P2 f4864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f4865i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I5.P2 f4867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4868m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(I5.P2 p2, p117n6.c cVar) {
        super(cVar);
        this.f4867l = p2;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4866k = obj;
        this.f4868m |= Integer.MIN_VALUE;
        return this.f4867l.r(null, false, this);
    }
}
