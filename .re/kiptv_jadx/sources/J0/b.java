package J0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J0.d f5977i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(J0.d dVar, p117n6.c cVar) {
        super(cVar);
        this.f5977i = dVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5976h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f5977i.a(0L, 0L, this);
    }
}
