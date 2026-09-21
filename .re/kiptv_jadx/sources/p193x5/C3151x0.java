package p193x5;

/* JADX INFO: renamed from: x5.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3151x0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p193x5.s1 f31683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.kiptv.core.model.XtreamLiveStream f31684i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p193x5.s1 f31685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31686l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3151x0(p193x5.s1 s1Var, p117n6.c cVar) {
        super(cVar);
        this.f31685k = s1Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f31686l |= Integer.MIN_VALUE;
        return this.f31685k.g(null, null, this);
    }
}
