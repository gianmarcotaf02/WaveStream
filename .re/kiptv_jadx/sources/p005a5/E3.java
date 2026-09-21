package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class E3 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.J3 f13340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f13341i;
    public com.kiptv.core.model.XtreamSeries j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.String f13342k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13343l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p005a5.J3 f13344m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13345n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(p005a5.J3 j9, p117n6.c cVar) {
        super(cVar);
        this.f13344m = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13343l = obj;
        this.f13345n |= Integer.MIN_VALUE;
        return this.f13344m.c(null, null, null, this);
    }
}
