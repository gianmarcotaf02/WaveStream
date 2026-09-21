package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class H3 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.J3 f13465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f13466i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.J3 f13468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13469m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H3(p005a5.J3 j9, p117n6.c cVar) {
        super(cVar);
        this.f13468l = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13467k = obj;
        this.f13469m |= Integer.MIN_VALUE;
        return this.f13468l.d(null, 0, this);
    }
}
