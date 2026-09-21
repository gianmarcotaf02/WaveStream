package U4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f10125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f10126i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U4.g f10127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10128l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(U4.g gVar, p117n6.c cVar) {
        super(cVar);
        this.f10127k = gVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f10128l |= Integer.MIN_VALUE;
        return this.f10127k.b(null, this);
    }
}
