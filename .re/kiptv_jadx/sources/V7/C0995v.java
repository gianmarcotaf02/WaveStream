package V7;

/* JADX INFO: renamed from: V7.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0995v extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10520i;
    public final /* synthetic */ V4.C0963f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public V4.C0963f f10521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V7.InterfaceC0982h f10522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public W7.y f10523m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0995v(V4.C0963f c0963f, p100l6.c cVar) {
        super(cVar);
        this.j = c0963f;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10519h = obj;
        this.f10520i |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
