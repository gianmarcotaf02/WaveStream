package p005a5;

/* JADX INFO: renamed from: a5.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1285g8 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1434v8 f14498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.TMDBSearchResult f14499i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1434v8 f14501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14502m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1285g8(p005a5.C1434v8 c1434v8, p117n6.c cVar) {
        super(cVar);
        this.f14501l = c1434v8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14500k = obj;
        this.f14502m |= Integer.MIN_VALUE;
        return p005a5.C1434v8.c(this.f14501l, null, this);
    }
}
