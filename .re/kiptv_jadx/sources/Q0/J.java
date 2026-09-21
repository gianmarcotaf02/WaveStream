package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q0.F f8269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8271c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8274f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8276i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8281o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Q0.S f8283q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Q0.B f8272d = Q0.B.f8205l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Q0.W f8282p = new Q0.W(this);

    public J(Q0.F f9) {
        this.f8269a = f9;
    }

    public final androidx.compose.ui.node.NodeCoordinator a() {
        return this.f8269a.f8232N.f8389d;
    }

    public final void b() {
        Q0.B b9 = this.f8269a.f8233O.f8272d;
        if (b9 == Q0.B.j || b9 == Q0.B.f8204k) {
            if (this.f8282p.H) {
                g(true);
            } else {
                f(true);
            }
        }
        if (b9 == Q0.B.f8204k) {
            Q0.S s9 = this.f8283q;
            if (s9 == null || !s9.f8316B) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        Q0.S s9 = this.f8283q;
        if (s9 != null) {
            Q0.B b9 = Q0.B.f8203i;
            Q0.J j9 = s9.f8323m;
            j9.f8272d = b9;
            j9.f8273e = false;
            s9.f8320F = j;
            Q0.F f9 = j9.f8269a;
            Q0.q0 snapshotObserver = Q0.I.a(f9).getSnapshotObserver();
            snapshotObserver.f8460a.d(f9, snapshotObserver.f8461b, s9.f8321G);
            j9.f8274f = true;
            j9.g = true;
            boolean zO = Q0.AbstractC0777k.o(f9);
            Q0.W w6 = j9.f8282p;
            if (zO) {
                w6.f8351C = true;
                w6.f8352D = true;
            } else {
                w6.f8350B = true;
            }
            j9.f8272d = Q0.B.f8205l;
        }
    }

    public final void d(int i3) {
        int i9 = this.f8278l;
        this.f8278l = i3;
        if ((i9 == 0) != (i3 == 0)) {
            Q0.F fX = this.f8269a.x();
            Q0.J j = fX != null ? fX.f8233O : null;
            if (j != null) {
                if (i3 == 0) {
                    j.d(j.f8278l - 1);
                } else {
                    j.d(j.f8278l + 1);
                }
            }
        }
    }

    public final void e(int i3) {
        int i9 = this.f8281o;
        this.f8281o = i3;
        if ((i9 == 0) != (i3 == 0)) {
            Q0.F fX = this.f8269a.x();
            Q0.J j = fX != null ? fX.f8233O : null;
            if (j != null) {
                if (i3 == 0) {
                    j.e(j.f8281o - 1);
                } else {
                    j.e(j.f8281o + 1);
                }
            }
        }
    }

    public final void f(boolean z6) {
        if (this.f8277k != z6) {
            this.f8277k = z6;
            if (z6 && !this.j) {
                d(this.f8278l + 1);
            } else {
                if (z6 || this.j) {
                    return;
                }
                d(this.f8278l - 1);
            }
        }
    }

    public final void g(boolean z6) {
        if (this.j != z6) {
            this.j = z6;
            if (z6 && !this.f8277k) {
                d(this.f8278l + 1);
            } else {
                if (z6 || this.f8277k) {
                    return;
                }
                d(this.f8278l - 1);
            }
        }
    }

    public final void h(boolean z6) {
        if (this.f8280n != z6) {
            this.f8280n = z6;
            if (z6 && !this.f8279m) {
                e(this.f8281o + 1);
            } else {
                if (z6 || this.f8279m) {
                    return;
                }
                e(this.f8281o - 1);
            }
        }
    }

    public final void i(boolean z6) {
        if (this.f8279m != z6) {
            this.f8279m = z6;
            if (z6 && !this.f8280n) {
                e(this.f8281o + 1);
            } else {
                if (z6 || this.f8280n) {
                    return;
                }
                e(this.f8281o - 1);
            }
        }
    }

    public final void j() {
        Q0.W w6 = this.f8282p;
        java.lang.Object obj = w6.y;
        Q0.F f9 = this.f8269a;
        Q0.J j = w6.f8366m;
        if ((obj != null || j.a().E() != null) && w6.f8377x) {
            w6.f8377x = false;
            w6.y = j.a().E();
            Q0.F fX = f9.x();
            if (fX != null) {
                Q0.F.a0(fX, false, 7);
            }
        }
        Q0.S s9 = this.f8283q;
        if (s9 != null) {
            java.lang.Object obj2 = s9.f8319E;
            Q0.J j9 = s9.f8323m;
            if (obj2 == null) {
                Q0.O oS0 = j9.a().S0();
                kotlin.jvm.internal.m.b(oS0);
                if (oS0.f8306v.E() == null) {
                    return;
                }
            }
            if (s9.f8318D) {
                s9.f8318D = false;
                Q0.O oS1 = j9.a().S0();
                kotlin.jvm.internal.m.b(oS1);
                s9.f8319E = oS1.f8306v.E();
                if (Q0.AbstractC0777k.o(f9)) {
                    Q0.F fX2 = f9.x();
                    if (fX2 != null) {
                        Q0.F.a0(fX2, false, 7);
                        return;
                    }
                    return;
                }
                Q0.F fX3 = f9.x();
                if (fX3 != null) {
                    Q0.F.Y(fX3, false, 7);
                }
            }
        }
    }
}
