package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class B1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.D1 f13158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.Playlist f13159i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.D1 f13161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13162m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(p005a5.D1 d4, p117n6.c cVar) {
        super(cVar);
        this.f13161l = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13160k = obj;
        this.f13162m |= Integer.MIN_VALUE;
        return this.f13161l.e(null, this);
    }
}
