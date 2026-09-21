package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1357o0 f14105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f14106i;
    public p028c8.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1357o0 f14108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14109m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(p005a5.C1357o0 c1357o0, p117n6.c cVar) {
        super(cVar);
        this.f14108l = c1357o0;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14107k = obj;
        this.f14109m |= Integer.MIN_VALUE;
        return this.f14108l.c(null, this);
    }
}
