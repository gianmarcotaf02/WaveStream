package p005a5;

/* JADX INFO: renamed from: a5.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1288h1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.D1 f14530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.Playlist f14531i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.D1 f14533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14534m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1288h1(p005a5.D1 d4, p117n6.c cVar) {
        super(cVar);
        this.f14533l = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14532k = obj;
        this.f14534m |= Integer.MIN_VALUE;
        return p005a5.D1.b(this.f14533l, null, this);
    }
}
