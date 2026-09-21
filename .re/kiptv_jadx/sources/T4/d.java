package T4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public T4.g f9819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f9820i;
    public p028c8.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f9821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T4.g f9822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9823m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(T4.g gVar, p117n6.c cVar) {
        super(cVar);
        this.f9822l = gVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f9821k = obj;
        this.f9823m |= Integer.MIN_VALUE;
        return this.f9822l.b(null, this);
    }
}
