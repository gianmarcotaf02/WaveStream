package O1;

/* JADX INFO: loaded from: classes.dex */
public final class U extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f7797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p028c8.d f7798i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O1.X f7799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7800l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(O1.X x9, p117n6.c cVar) {
        super(cVar);
        this.f7799k = x9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f7800l |= Integer.MIN_VALUE;
        return this.f7799k.b(null, this);
    }
}
