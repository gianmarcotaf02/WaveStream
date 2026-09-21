package p005a5;

/* JADX INFO: renamed from: a5.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1404s8 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1434v8 f15080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f15081i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1434v8 f15082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15083l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404s8(p005a5.C1434v8 c1434v8, p117n6.c cVar) {
        super(cVar);
        this.f15082k = c1434v8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f15083l |= Integer.MIN_VALUE;
        return this.f15082k.j(this);
    }
}
