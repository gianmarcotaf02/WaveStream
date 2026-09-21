package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class A2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.B2 f13105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.XtreamLiveStream f13106i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.String f13107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f13108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.String f13109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p005a5.B2 f13112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13113q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(p005a5.B2 b9, p117n6.c cVar) {
        super(cVar);
        this.f13112p = b9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13111o = obj;
        this.f13113q |= Integer.MIN_VALUE;
        return p005a5.B2.a(this.f13112p, null, this);
    }
}
