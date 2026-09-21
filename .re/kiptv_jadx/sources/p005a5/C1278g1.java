package p005a5;

/* JADX INFO: renamed from: a5.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1278g1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.D1 f14481i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1278g1(p005a5.D1 d4, p117n6.c cVar) {
        super(cVar);
        this.f14481i = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14480h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f14481i.d(this);
    }
}
