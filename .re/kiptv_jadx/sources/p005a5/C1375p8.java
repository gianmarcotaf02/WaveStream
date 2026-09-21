package p005a5;

/* JADX INFO: renamed from: a5.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1375p8 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1434v8 f14952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f14953i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1434v8 f14954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14955l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375p8(p005a5.C1434v8 c1434v8, p117n6.c cVar) {
        super(cVar);
        this.f14954k = c1434v8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f14955l |= Integer.MIN_VALUE;
        return this.f14954k.i(this);
    }
}
