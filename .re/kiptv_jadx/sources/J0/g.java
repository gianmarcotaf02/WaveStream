package J0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5986i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J0.i f5987k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5988l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(J0.i iVar, p117n6.c cVar) {
        super(cVar);
        this.f5987k = iVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f5988l |= Integer.MIN_VALUE;
        return this.f5987k.h0(0L, 0L, this);
    }
}
