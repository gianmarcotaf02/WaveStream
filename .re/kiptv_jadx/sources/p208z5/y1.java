package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p208z5.J1 f32926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.XtreamVODStream f32927i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p208z5.J1 f32928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32929l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(p208z5.J1 j9, p117n6.c cVar) {
        super(cVar);
        this.f32928k = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f32929l |= Integer.MIN_VALUE;
        return p208z5.J1.g(this.f32928k, null, this);
    }
}
