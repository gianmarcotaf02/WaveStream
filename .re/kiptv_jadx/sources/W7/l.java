package W7;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public J.C0559y f10747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f10748i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J.C0559y f10749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10750l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(J.C0559y c0559y, p100l6.c cVar) {
        super(cVar);
        this.f10749k = c0559y;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f10750l |= Integer.MIN_VALUE;
        return this.f10749k.emit(null, this);
    }
}
