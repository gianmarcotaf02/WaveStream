package p085j5;

/* JADX INFO: loaded from: classes.dex */
public final class V extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p085j5.a0 f24055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f24056i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p085j5.a0 f24057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24058l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(p085j5.a0 a0Var, p117n6.c cVar) {
        super(cVar);
        this.f24057k = a0Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f24058l |= Integer.MIN_VALUE;
        return this.f24057k.h(0L, this);
    }
}
