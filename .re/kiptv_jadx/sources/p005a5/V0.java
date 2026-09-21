package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1218a1 f14010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.io.File f14011i;
    public java.io.File j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.kiptv.core.model.OSDownloadResponse f14012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1218a1 f14014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14015n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(p005a5.C1218a1 c1218a1, p117n6.c cVar) {
        super(cVar);
        this.f14014m = c1218a1;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14013l = obj;
        this.f14015n |= Integer.MIN_VALUE;
        return this.f14014m.c(0, null, null, null, null, this);
    }
}
