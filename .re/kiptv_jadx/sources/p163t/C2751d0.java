package p163t;

/* JADX INFO: renamed from: t.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2751d0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f27577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f27578i;
    public final /* synthetic */ p163t.C2755f0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27579k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2751d0(p163t.C2755f0 c2755f0, p117n6.c cVar) {
        super(cVar);
        this.j = c2755f0;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f27578i = obj;
        this.f27579k |= Integer.MIN_VALUE;
        return p163t.C2755f0.G0(this.j, this);
    }
}
