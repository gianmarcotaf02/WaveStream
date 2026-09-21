package J0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5990i;
    public final /* synthetic */ J0.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5991k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(J0.i iVar, p117n6.c cVar) {
        super(cVar);
        this.j = iVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5990i = obj;
        this.f5991k |= Integer.MIN_VALUE;
        return this.j.i(0L, this);
    }
}
