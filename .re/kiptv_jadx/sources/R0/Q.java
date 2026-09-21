package R0;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ R0.T f8841i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(R0.T t9, p117n6.c cVar) {
        super(cVar);
        this.f8841i = t9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f8840h = obj;
        this.j |= Integer.MIN_VALUE;
        this.f8841i.a(null, this);
        return p109m6.a.f25430h;
    }
}
