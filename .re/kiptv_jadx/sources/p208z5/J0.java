package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class J0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p208z5.J1 f32483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.XtreamVODStream f32484i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p208z5.J1 f32485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32486l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(p208z5.J1 j9, p117n6.c cVar) {
        super(cVar);
        this.f32485k = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f32486l |= Integer.MIN_VALUE;
        return this.f32485k.h(null, null, this);
    }
}
