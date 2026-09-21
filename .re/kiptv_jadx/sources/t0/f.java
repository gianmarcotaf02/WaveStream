package t0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p137q0.o implements Q0.C0, Q0.InterfaceC0787v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t0.f f27750v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t0.f f27751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f27752x;

    @Override // p137q0.o
    public final void G0() {
        this.f27751w = null;
        this.f27750v = null;
    }

    public final boolean N0(p020c0.C1704s0 c1704s0) {
        t0.f fVar = this.f27750v;
        if (fVar != null) {
            return fVar.N0(c1704s0);
        }
        t0.f fVar2 = this.f27751w;
        if (fVar2 != null) {
            return fVar2.N0(c1704s0);
        }
        return false;
    }

    public final void O0(p020c0.C1704s0 c1704s0) {
        t0.f fVar = this.f27751w;
        if (fVar != null) {
            fVar.O0(c1704s0);
            return;
        }
        t0.f fVar2 = this.f27750v;
        if (fVar2 != null) {
            fVar2.O0(c1704s0);
        }
    }

    public final void P0(p020c0.C1704s0 c1704s0) {
        t0.f fVar = this.f27751w;
        if (fVar != null) {
            fVar.P0(c1704s0);
        }
        t0.f fVar2 = this.f27750v;
        if (fVar2 != null) {
            fVar2.P0(c1704s0);
        }
        this.f27750v = null;
    }

    public final void Q0(p020c0.C1704s0 c1704s0) {
        Q0.C0 c9;
        t0.f fVar;
        t0.f fVar2 = this.f27750v;
        if (fVar2 == null || !com.google.android.gms.internal.play_billing.AbstractC1853k0.e(fVar2, com.google.android.gms.internal.play_billing.AbstractC1864o0.g0(c1704s0))) {
            if (this.f26475h.f26487u) {
                kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
                Q0.AbstractC0777k.y(this, new p029d.b(a2, this, c1704s0, 6));
                c9 = (Q0.C0) a2.f24539h;
            } else {
                c9 = null;
            }
            fVar = (t0.f) c9;
        } else {
            fVar = fVar2;
        }
        if (fVar != null && fVar2 == null) {
            fVar.O0(c1704s0);
            fVar.Q0(c1704s0);
            t0.f fVar3 = this.f27751w;
            if (fVar3 != null) {
                fVar3.P0(c1704s0);
            }
        } else if (fVar == null && fVar2 != null) {
            t0.f fVar4 = this.f27751w;
            if (fVar4 != null) {
                fVar4.O0(c1704s0);
                fVar4.Q0(c1704s0);
            }
            fVar2.P0(c1704s0);
        } else if (!kotlin.jvm.internal.m.a(fVar, fVar2)) {
            if (fVar != null) {
                fVar.O0(c1704s0);
                fVar.Q0(c1704s0);
            }
            if (fVar2 != null) {
                fVar2.P0(c1704s0);
            }
        } else if (fVar != null) {
            fVar.Q0(c1704s0);
        } else {
            t0.f fVar5 = this.f27751w;
            if (fVar5 != null) {
                fVar5.Q0(c1704s0);
            }
        }
        this.f27750v = fVar;
    }

    public final void R0(p020c0.C1704s0 c1704s0) {
        t0.f fVar = this.f27751w;
        if (fVar != null) {
            fVar.R0(c1704s0);
            return;
        }
        t0.f fVar2 = this.f27750v;
        if (fVar2 != null) {
            fVar2.R0(c1704s0);
        }
    }

    @Override // Q0.C0
    public final java.lang.Object g() {
        return t0.e.f27749a;
    }

    @Override // Q0.InterfaceC0787v
    public final void k(long j) {
        this.f27752x = j;
    }
}
