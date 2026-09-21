package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class w2 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I5.P2 f5435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.LinkedHashMap f5436i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I5.P2 f5437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5438l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(I5.P2 p2, p117n6.c cVar) {
        super(cVar);
        this.f5437k = p2;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f5438l |= Integer.MIN_VALUE;
        return I5.P2.f(this.f5437k, this);
    }
}
