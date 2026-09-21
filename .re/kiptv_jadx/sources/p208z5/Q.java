package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f32554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p208z5.X f32555i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(p208z5.X x9, p117n6.c cVar) {
        super(cVar);
        this.f32555i = x9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f32554h = obj;
        this.j |= Integer.MIN_VALUE;
        return p208z5.X.g(this.f32555i, null, this);
    }
}
