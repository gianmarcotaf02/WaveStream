package p171u0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p137q0.o implements Q0.j0, p171u0.a, Q0.InterfaceC0779m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p171u0.c f28649v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f28650w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p194x6.j f28651x;

    public b(p171u0.c cVar, p194x6.j jVar) {
        this.f28649v = cVar;
        this.f28651x = jVar;
        cVar.f28652h = this;
    }

    @Override // p137q0.o
    public final void H0() {
        N0();
    }

    @Override // Q0.InterfaceC0779m
    public final void I() {
        N0();
    }

    @Override // Q0.InterfaceC0775i
    public final void M() {
        N0();
    }

    public final void N0() {
        this.f28650w = false;
        this.f28649v.f28653i = null;
        Q0.AbstractC0777k.j(this);
    }

    @Override // Q0.InterfaceC0779m
    public final void T(Q0.H h9) {
        boolean z6 = this.f28650w;
        p171u0.c cVar = this.f28649v;
        if (!z6) {
            cVar.f28653i = null;
            Q0.AbstractC0777k.p(this, new K0.C0656d(this, cVar, 13));
            if (cVar.f28653i == null) {
                throw p121o0.p.h("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f28650w = true;
        }
        p020c0.C1704s0 c1704s0 = cVar.f28653i;
        kotlin.jvm.internal.m.b(c1704s0);
        ((p194x6.j) c1704s0.f18362i).invoke(h9);
    }

    @Override // Q0.InterfaceC0775i, Q0.t0
    public final void a() {
        N0();
    }

    @Override // p171u0.a
    public final long d() {
        return com.google.common.util.concurrent.AbstractC1903s.K(Q0.AbstractC0777k.r(this, 4).j);
    }

    @Override // Q0.j0
    public final void f0() {
        N0();
    }

    @Override // p171u0.a
    public final p113n1.c getDensity() {
        return Q0.AbstractC0777k.t(this).f8226G;
    }

    @Override // p171u0.a
    public final p113n1.n getLayoutDirection() {
        return Q0.AbstractC0777k.t(this).H;
    }

    @Override // p137q0.o
    public final void G0() {
    }
}
