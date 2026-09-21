package H2;

/* JADX INFO: loaded from: classes.dex */
public final class v extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public H2.y f3914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p028c8.j f3915i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ H2.y f3916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3917l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(H2.y yVar, p117n6.c cVar) {
        super(cVar);
        this.f3916k = yVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f3917l |= Integer.MIN_VALUE;
        return this.f3916k.a(this);
    }
}
