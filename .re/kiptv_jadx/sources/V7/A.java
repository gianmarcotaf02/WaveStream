package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public E5.D0 f10365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f10366i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E5.D0 f10367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10368l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(E5.D0 d4, p100l6.c cVar) {
        super(cVar);
        this.f10367k = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f10368l |= Integer.MIN_VALUE;
        return this.f10367k.emit(null, this);
    }
}
