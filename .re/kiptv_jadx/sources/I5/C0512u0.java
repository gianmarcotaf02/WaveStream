package I5;

/* JADX INFO: renamed from: I5.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0512u0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I5.D0 f5368i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0512u0(I5.D0 d4, p117n6.c cVar) {
        super(cVar);
        this.f5368i = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5367h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f5368i.u(null, this);
    }
}
