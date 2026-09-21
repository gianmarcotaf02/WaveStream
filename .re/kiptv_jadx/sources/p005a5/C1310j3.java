package p005a5;

/* JADX INFO: renamed from: a5.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1310j3 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f14656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f14657i;
    public java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.Map f14658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.Iterator f14659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14662o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p005a5.B3 f14663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14664q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310j3(p005a5.B3 b9, p117n6.c cVar) {
        super(cVar);
        this.f14663p = b9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f14662o = obj;
        this.f14664q |= Integer.MIN_VALUE;
        return this.f14663p.m(null, null, this);
    }
}
