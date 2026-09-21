package J5;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public J5.K f6106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6107i;
    public final /* synthetic */ J5.K j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6108k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J5.K k9, p117n6.c cVar) {
        super(cVar);
        this.j = k9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6107i = obj;
        this.f6108k |= Integer.MIN_VALUE;
        return J5.K.e(this.j, this);
    }
}
