package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class P0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p208z5.J1 f32549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f32550i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f32551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p208z5.J1 f32552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32553m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(p208z5.J1 j9, p117n6.c cVar) {
        super(cVar);
        this.f32552l = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f32551k = obj;
        this.f32553m |= Integer.MIN_VALUE;
        return this.f32552l.p(null, false, this);
    }
}
