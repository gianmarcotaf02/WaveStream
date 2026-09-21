package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p208z5.J1 f32912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.XtreamVODStream f32913i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f32914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p208z5.J1 f32915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32916m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p208z5.J1 j9, p117n6.c cVar) {
        super(cVar);
        this.f32915l = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f32914k = obj;
        this.f32916m |= Integer.MIN_VALUE;
        return this.f32915l.t(null, false, this);
    }
}
