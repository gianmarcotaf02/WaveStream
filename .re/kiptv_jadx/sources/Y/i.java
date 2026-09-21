package Y;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Y.p f10981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10982i;
    public final /* synthetic */ Y.p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10983k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Y.p pVar, p117n6.c cVar) {
        super(cVar);
        this.j = pVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10982i = obj;
        this.f10983k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
