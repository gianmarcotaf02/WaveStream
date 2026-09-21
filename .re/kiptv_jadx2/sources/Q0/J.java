package Q0;

import androidx.compose.ui.node.NodeCoordinator;

public final class J {

    public final F f8269a;

    public boolean f8270b;

    public boolean f8271c;

    public boolean f8273e;

    public boolean f8274f;
    public boolean g;

    public int f8275h;

    public int f8276i;
    public boolean j;

    public boolean f8277k;

    public int f8278l;

    public boolean f8279m;

    public boolean f8280n;

    public int f8281o;

    public S f8283q;

    public B f8272d = B.f8205l;

    public final W f8282p = new W(this);

    public J(F f9) {
        this.f8269a = f9;
    }

    public final NodeCoordinator a() {
        return this.f8269a.f8232N.f8389d;
    }

    public final void b() {
        B b9 = this.f8269a.f8233O.f8272d;
        if (b9 == B.j || b9 == B.f8204k) {
            if (this.f8282p.H) {
                g(true);
            } else {
                f(true);
            }
        }
        if (b9 == B.f8204k) {
            S s9 = this.f8283q;
            if (s9 == null || !s9.f8316B) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        S s9 = this.f8283q;
        if (s9 != null) {
            B b9 = B.f8203i;
            J j9 = s9.f8323m;
            j9.f8272d = b9;
            j9.f8273e = false;
            s9.f8320F = j;
            F f9 = j9.f8269a;
            q0 snapshotObserver = I.a(f9).getSnapshotObserver();
            snapshotObserver.f8460a.d(f9, snapshotObserver.f8461b, s9.f8321G);
            j9.f8274f = true;
            j9.g = true;
            boolean zO = AbstractC0777k.o(f9);
            W w6 = j9.f8282p;
            if (zO) {
                w6.f8351C = true;
                w6.f8352D = true;
            } else {
                w6.f8350B = true;
            }
            j9.f8272d = B.f8205l;
        }
    }

    public final void d(int i3) {
        int i9 = this.f8278l;
        this.f8278l = i3;
        if ((i9 == 0) != (i3 == 0)) {
            F fX = this.f8269a.x();
            J j = fX != null ? fX.f8233O : null;
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
            F fX = this.f8269a.x();
            J j = fX != null ? fX.f8233O : null;
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
        W w6 = this.f8282p;
        Object obj = w6.y;
        F f9 = this.f8269a;
        J j = w6.f8366m;
        if ((obj != null || j.a().E() != null) && w6.f8377x) {
            w6.f8377x = false;
            w6.y = j.a().E();
            F fX = f9.x();
            if (fX != null) {
                F.a0(fX, false, 7);
            }
        }
        S s9 = this.f8283q;
        if (s9 != null) {
            Object obj2 = s9.f8319E;
            J j9 = s9.f8323m;
            if (obj2 == null) {
                O oS0 = j9.a().S0();
                kotlin.jvm.internal.m.b(oS0);
                if (oS0.f8306v.E() == null) {
                    return;
                }
            }
            if (s9.f8318D) {
                s9.f8318D = false;
                O oS1 = j9.a().S0();
                kotlin.jvm.internal.m.b(oS1);
                s9.f8319E = oS1.f8306v.E();
                if (AbstractC0777k.o(f9)) {
                    F fX2 = f9.x();
                    if (fX2 != null) {
                        F.a0(fX2, false, 7);
                        return;
                    }
                    return;
                }
                F fX3 = f9.x();
                if (fX3 != null) {
                    F.Y(fX3, false, 7);
                }
            }
        }
    }
}
