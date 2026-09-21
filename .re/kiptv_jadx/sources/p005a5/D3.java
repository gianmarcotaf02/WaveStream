package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class D3 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.J3 f13306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f13307i;
    public com.kiptv.core.model.XtreamSeries j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p005a5.J3 f13310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13311n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3(p005a5.J3 j9, p117n6.c cVar) {
        super(cVar);
        this.f13310m = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13309l = obj;
        this.f13311n |= Integer.MIN_VALUE;
        return this.f13310m.a(0, null, null, this);
    }
}
