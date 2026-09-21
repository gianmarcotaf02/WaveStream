package p005a5;

/* JADX INFO: renamed from: a5.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1315j8 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f14672i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1434v8 f14673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14674l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1315j8(p005a5.C1434v8 c1434v8, p117n6.c cVar) {
        super(cVar);
        this.f14673k = c1434v8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f14674l |= Integer.MIN_VALUE;
        return p005a5.C1434v8.e(this.f14673k, null, 0, null, this);
    }
}
