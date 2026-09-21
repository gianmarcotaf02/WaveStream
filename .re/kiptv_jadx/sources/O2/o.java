package O2;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public O2.q f7921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public M8.C0682j f7922i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O2.q f7923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7924l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(O2.q qVar, p117n6.c cVar) {
        super(cVar);
        this.f7923k = qVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f7924l |= Integer.MIN_VALUE;
        return O2.q.b(this.f7923k, null, this);
    }
}
