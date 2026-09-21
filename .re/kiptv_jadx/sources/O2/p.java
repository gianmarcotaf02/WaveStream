package O2;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f7925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f7926i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f7927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O2.q f7928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7929m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(O2.q qVar, p117n6.c cVar) {
        super(cVar);
        this.f7928l = qVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f7927k = obj;
        this.f7929m |= Integer.MIN_VALUE;
        return O2.q.c(this.f7928l, null, null, null, this);
    }
}
