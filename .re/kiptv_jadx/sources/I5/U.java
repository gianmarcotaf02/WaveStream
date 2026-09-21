package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I5.D0 f4950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.XtreamSeries f4951i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I5.D0 f4952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4953l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(I5.D0 d4, p117n6.c cVar) {
        super(cVar);
        this.f4952k = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f4953l |= Integer.MIN_VALUE;
        return this.f4952k.j(null, this);
    }
}
