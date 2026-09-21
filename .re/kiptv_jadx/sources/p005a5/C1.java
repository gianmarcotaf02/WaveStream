package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class C1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.D1 f13233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13234i;
    public final /* synthetic */ p005a5.D1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13235k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(p005a5.D1 d4, p117n6.c cVar) {
        super(cVar);
        this.j = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13234i = obj;
        this.f13235k |= Integer.MIN_VALUE;
        return this.j.f(null, this);
    }
}
