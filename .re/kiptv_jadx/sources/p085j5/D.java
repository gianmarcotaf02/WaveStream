package p085j5;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p085j5.K f23941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23942i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p085j5.K f23943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23944l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(p085j5.K k9, p117n6.c cVar) {
        super(cVar);
        this.f23943k = k9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f23944l |= Integer.MIN_VALUE;
        return this.f23943k.h(0L, this);
    }
}
