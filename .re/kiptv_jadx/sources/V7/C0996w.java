package V7;

/* JADX INFO: renamed from: V7.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0996w extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10525i;
    public final /* synthetic */ V4.C0963f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public V4.C0963f f10526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V7.InterfaceC0982h f10527l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0996w(V4.C0963f c0963f, p100l6.c cVar) {
        super(cVar);
        this.j = c0963f;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10524h = obj;
        this.f10525i |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
