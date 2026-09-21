package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U.O f10372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10373i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U.O f10374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f10375l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(U.O o8, p100l6.c cVar) {
        super(cVar);
        this.f10374k = o8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10373i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10374k.emit(null, this);
    }
}
