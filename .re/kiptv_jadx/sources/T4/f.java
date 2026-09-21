package T4;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public T4.g f9825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f9826i;
    public U4.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p028c8.d f9827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f9828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T4.g f9829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9830n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(T4.g gVar, p117n6.c cVar) {
        super(cVar);
        this.f9829m = gVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f9828l = obj;
        this.f9830n |= Integer.MIN_VALUE;
        return this.f9829m.c(null, null, this);
    }
}
