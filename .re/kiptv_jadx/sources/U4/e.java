package U4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U4.g f10131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f10132i;
    public U4.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U4.g f10134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10135m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(U4.g gVar, p117n6.c cVar) {
        super(cVar);
        this.f10134l = gVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10133k = obj;
        this.f10135m |= Integer.MIN_VALUE;
        return this.f10134l.d(null, null, this);
    }
}
