package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U.O f10461i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(U.O o8, p100l6.c cVar) {
        super(cVar);
        this.f10461i = o8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10460h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10461i.a(0, this);
    }
}
