package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class H1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f13459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f13460i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.M1 f13461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13462l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(p005a5.M1 m8, p117n6.c cVar) {
        super(cVar);
        this.f13461k = m8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f13462l |= Integer.MIN_VALUE;
        return this.f13461k.b(null, this);
    }
}
