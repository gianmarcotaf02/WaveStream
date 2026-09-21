package v5;

/* JADX INFO: renamed from: v5.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2938l0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v5.d1 f29539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.XtreamLiveStream f29540i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v5.d1 f29541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29542l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2938l0(v5.d1 d1Var, p117n6.c cVar) {
        super(cVar);
        this.f29541k = d1Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f29542l |= Integer.MIN_VALUE;
        return this.f29541k.f(null, null, this);
    }
}
