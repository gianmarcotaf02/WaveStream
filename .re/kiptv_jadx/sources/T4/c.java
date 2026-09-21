package T4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public T4.g f9815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p028c8.d f9816i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T4.g f9817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9818l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(T4.g gVar, p117n6.c cVar) {
        super(cVar);
        this.f9817k = gVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f9818l |= Integer.MIN_VALUE;
        return this.f9817k.a(this);
    }
}
