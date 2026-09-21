package H5;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public H5.E0 f4295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f4296i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ H5.E0 f4297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4298l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(H5.E0 e6, p117n6.c cVar) {
        super(cVar);
        this.f4297k = e6;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f4298l |= Integer.MIN_VALUE;
        return H5.E0.e(this.f4297k, null, this);
    }
}
