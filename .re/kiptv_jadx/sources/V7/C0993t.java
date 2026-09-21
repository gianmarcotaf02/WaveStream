package V7;

/* JADX INFO: renamed from: V7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0993t extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10514i;
    public final /* synthetic */ V7.C0994u j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f10515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V7.InterfaceC0982h f10516l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0993t(V7.C0994u c0994u, p100l6.c cVar) {
        super(cVar);
        this.j = c0994u;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10513h = obj;
        this.f10514i |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
