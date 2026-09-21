package p020c0;

/* JADX INFO: renamed from: c0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1683h0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p194x6.j f18249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f18250i;
    public final /* synthetic */ R0.Z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18251k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683h0(R0.Z z6, p100l6.c cVar) {
        super(cVar);
        this.j = z6;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f18250i = obj;
        this.f18251k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
