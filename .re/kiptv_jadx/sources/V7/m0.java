package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public V7.n0 f10482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public V7.InterfaceC0982h f10483i;
    public V7.o0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public S7.InterfaceC0891h0 f10484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f10485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V7.n0 f10487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10488o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(V7.n0 n0Var, p100l6.c cVar) {
        super(cVar);
        this.f10487n = n0Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10486m = obj;
        this.f10488o |= Integer.MIN_VALUE;
        this.f10487n.collect(null, this);
        return p109m6.a.f25430h;
    }
}
