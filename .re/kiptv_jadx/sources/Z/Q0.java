package Z;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends p137q0.o implements Q0.InterfaceC0788w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f12302A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f12303B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p202z.k f12304v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12305w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12306x;
    public p163t.C2748c y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p163t.C2748c f12307z;

    @Override // p137q0.o
    public final boolean C0() {
        return false;
    }

    @Override // p137q0.o
    public final void F0() {
        S7.C.A(B0(), null, new Z.P0(this, null), 3);
    }

    @Override // Q0.InterfaceC0788w
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        float f9;
        boolean z6 = (q9.a(p113n1.a.h(j)) == 0 || q9.z(p113n1.a.g(j)) == 0) ? false : true;
        if (this.f12306x) {
            f9 = p010b0.k.f17619a;
        } else {
            f9 = (z6 || this.f12305w) ? Z.I0.f12246a : Z.I0.f12247b;
        }
        float fY = u6.Y(f9);
        p163t.C2748c c2748c = this.f12307z;
        int iFloatValue = (int) (c2748c != null ? ((java.lang.Number) c2748c.d()).floatValue() : fY);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            p113n1.j.a("width and height must be >= 0");
        }
        O0.g0 g0VarC = q9.C(p113n1.b.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fY2 = u6.Y((Z.I0.f12249d - u6.N(fY)) / 2.0f);
        float fY3 = u6.Y((Z.I0.f12248c - Z.I0.f12246a) - Z.I0.f12250e);
        boolean z9 = this.f12306x;
        if (z9 && this.f12305w) {
            fY2 = fY3 - u6.Y(p010b0.k.f17623e);
        } else if (z9 && !this.f12305w) {
            fY2 = u6.Y(p010b0.k.f17623e);
        } else if (this.f12305w) {
            fY2 = fY3;
        }
        p163t.C2748c c2748c2 = this.f12307z;
        java.lang.Float f10 = c2748c2 != null ? (java.lang.Float) c2748c2.f27553e.getValue() : null;
        if (f10 == null || f10.floatValue() != fY) {
            S7.C.A(B0(), null, new Z.M0(this, fY, null), 3);
        }
        p163t.C2748c c2748c3 = this.y;
        java.lang.Float f11 = c2748c3 != null ? (java.lang.Float) c2748c3.f27553e.getValue() : null;
        if (f11 == null || f11.floatValue() != fY2) {
            S7.C.A(B0(), null, new Z.N0(this, fY2, null), 3);
        }
        if (java.lang.Float.isNaN(this.f12303B) && java.lang.Float.isNaN(this.f12302A)) {
            this.f12303B = fY;
            this.f12302A = fY2;
        }
        return u6.q0(iFloatValue, iFloatValue, p078i6.x.f23206h, new Z.O0(g0VarC, this, fY2));
    }
}
