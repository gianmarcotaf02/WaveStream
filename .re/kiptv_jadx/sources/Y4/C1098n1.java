package Y4;

/* JADX INFO: renamed from: Y4.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1098n1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y4.C1118u1 f12005i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098n1(Y4.C1118u1 c1118u1, p117n6.c cVar) {
        super(cVar);
        this.f12005i = c1118u1;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12004h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f12005i.t(null, this);
    }
}
