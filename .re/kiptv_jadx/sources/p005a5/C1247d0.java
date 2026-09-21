package p005a5;

/* JADX INFO: renamed from: a5.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1247d0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f14341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f14342i;
    public p005a5.T j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1357o0 f14344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14345m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1247d0(p005a5.C1357o0 c1357o0, p117n6.c cVar) {
        super(cVar);
        this.f14344l = c1357o0;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14343k = obj;
        this.f14345m |= Integer.MIN_VALUE;
        return this.f14344l.j(null, this);
    }
}
