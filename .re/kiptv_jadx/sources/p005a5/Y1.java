package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.Z1 f14114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f14115i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.Z1 f14117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14118m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(p005a5.Z1 z6, p117n6.c cVar) {
        super(cVar);
        this.f14117l = z6;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14116k = obj;
        this.f14118m |= Integer.MIN_VALUE;
        return this.f14117l.e(null, false, null, this);
    }
}
