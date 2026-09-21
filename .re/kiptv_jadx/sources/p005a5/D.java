package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.H f13277i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(p005a5.H h9, p117n6.c cVar) {
        super(cVar);
        this.f13277i = h9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13276h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f13277i.d(this);
    }
}
