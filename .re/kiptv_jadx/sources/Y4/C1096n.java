package Y4;

/* JADX INFO: renamed from: Y4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1096n extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f11997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y4.C1105q f11998i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096n(Y4.C1105q c1105q, p117n6.c cVar) {
        super(cVar);
        this.f11998i = c1105q;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f11997h = obj;
        this.j |= Integer.MIN_VALUE;
        return Y4.C1105q.a(this.f11998i, null, this);
    }
}
