package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10408i;
    public final /* synthetic */ U.O j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f10409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V7.InterfaceC0982h f10410l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(U.O o8, p100l6.c cVar) {
        super(cVar);
        this.j = o8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10407h = obj;
        this.f10408i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
