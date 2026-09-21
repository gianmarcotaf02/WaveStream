package V4;

/* JADX INFO: loaded from: classes.dex */
public final class N extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10284i;
    public final /* synthetic */ U.O j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(U.O o8, p100l6.c cVar) {
        super(cVar);
        this.j = o8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10283h = obj;
        this.f10284i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
