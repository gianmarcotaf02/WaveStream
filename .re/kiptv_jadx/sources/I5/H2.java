package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class H2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I5.P2 f4759i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2(I5.P2 p2, p117n6.c cVar) {
        super(cVar);
        this.f4759i = p2;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4758h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f4759i.x(null, this);
    }
}
