package p005a5;

/* JADX INFO: renamed from: a5.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1267f0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f14446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f14447i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.List f14448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1357o0 f14450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14451n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1267f0(p005a5.C1357o0 c1357o0, p117n6.c cVar) {
        super(cVar);
        this.f14450m = c1357o0;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14449l = obj;
        this.f14451n |= Integer.MIN_VALUE;
        return this.f14450m.l(this);
    }
}
