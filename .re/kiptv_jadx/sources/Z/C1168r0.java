package Z;

/* JADX INFO: renamed from: Z.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1168r0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Z.C1170s0 f12487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Z.C1167q0 f12488i;
    public p028c8.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12489k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z.C1170s0 f12490l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12491m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1168r0(Z.C1170s0 c1170s0, p117n6.c cVar) {
        super(cVar);
        this.f12490l = c1170s0;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12489k = obj;
        this.f12491m |= Integer.MIN_VALUE;
        return this.f12490l.a(null, this);
    }
}
