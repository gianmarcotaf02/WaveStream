package p045e8;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements p045e8.InterfaceC2119b, p045e8.InterfaceC2139w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z2.C1202m f21578a;

    public l0(Z2.C1202m c1202m) {
        this.f21578a = c1202m;
    }

    @Override // p045e8.InterfaceC2119b
    public final Z2.C1202m a() {
        return this.f21578a;
    }

    @Override // p045e8.InterfaceC2140x
    public final void b(java.lang.String str) {
        com.google.android.gms.internal.play_billing.V0.j(this, str);
    }

    @Override // p045e8.InterfaceC2139w
    public final void i() {
        p045e8.a0 a0Var = p045e8.a0.f21530h;
        r(new p063g8.s(new p063g8.c(new p045e8.q0())));
    }

    @Override // p045e8.InterfaceC2139w
    public final void j() {
        p045e8.a0 a0Var = p045e8.a0.f21530h;
        r(new p063g8.c(new p045e8.p0()));
    }

    @Override // p045e8.InterfaceC2119b
    public final void k(java.lang.String str, p194x6.j jVar) {
        com.google.android.gms.internal.play_billing.V0.f(this, str, jVar);
    }

    @Override // p045e8.InterfaceC2119b
    public final void m(p194x6.j[] jVarArr, p194x6.j jVar) {
        com.google.android.gms.internal.play_billing.V0.e(this, jVarArr, jVar);
    }

    @Override // p045e8.InterfaceC2139w
    public final void n() {
        p045e8.a0 a0Var = p045e8.a0.f21530h;
        r(new p063g8.c(new p045e8.o0()));
    }

    @Override // p045e8.InterfaceC2119b
    public final p045e8.InterfaceC2119b q() {
        return new p045e8.l0(new Z2.C1202m(1));
    }

    public final void r(p063g8.k kVar) {
        this.f21578a.b(kVar);
    }
}
