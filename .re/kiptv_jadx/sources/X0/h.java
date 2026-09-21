package X0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X0.i f10809i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(X0.i iVar, p117n6.c cVar) {
        super(cVar);
        this.f10809i = iVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10808h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10809i.b(0.0f, this);
    }
}
