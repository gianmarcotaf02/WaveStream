package W7;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W7.q f10756i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(W7.q qVar, p100l6.c cVar) {
        super(cVar);
        this.f10756i = qVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10755h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10756i.emit(null, this);
    }
}
