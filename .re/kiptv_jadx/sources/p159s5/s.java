package p159s5;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p159s5.w f27326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f27327i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f27328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p159s5.w f27329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27330m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p159s5.w wVar, p117n6.c cVar) {
        super(cVar);
        this.f27329l = wVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f27328k = obj;
        this.f27330m |= Integer.MIN_VALUE;
        return p159s5.w.e(this.f27329l, null, this);
    }
}
