package p062g7;

import Z2.M;
import java.io.IOException;
import p110m7.AbstractC2632e;
import p110m7.AbstractC2637j;
import p110m7.C2631d;
import p110m7.C2633f;
import p110m7.o;
import p110m7.r;

public final class d0 extends o {

    public static final d0 f22166r;

    public static final C2154a f22167s = new C2154a(22);

    public final AbstractC2632e f22168h;

    public int f22169i;
    public int j;

    public int f22170k;

    public b0 f22171l;

    public int f22172m;

    public int f22173n;

    public c0 f22174o;

    public byte f22175p;

    public int f22176q;

    static {
        d0 d0Var = new d0();
        f22166r = d0Var;
        d0Var.j = 0;
        d0Var.f22170k = 0;
        d0Var.f22171l = b0.ERROR;
        d0Var.f22172m = 0;
        d0Var.f22173n = 0;
        d0Var.f22174o = c0.LANGUAGE_VERSION;
    }

    public d0() {
        this.f22175p = (byte) -1;
        this.f22176q = -1;
        this.f22168h = AbstractC2632e.f25476h;
    }

    @Override
    public final int b() {
        int i3 = this.f22176q;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f22169i & 1) == 1 ? M.m(1, this.j) : 0;
        if ((this.f22169i & 2) == 2) {
            iM += M.m(2, this.f22170k);
        }
        if ((this.f22169i & 4) == 4) {
            iM += M.l(3, this.f22171l.f22131h);
        }
        if ((this.f22169i & 8) == 8) {
            iM += M.m(4, this.f22172m);
        }
        if ((this.f22169i & 16) == 16) {
            iM += M.m(5, this.f22173n);
        }
        if ((this.f22169i & 32) == 32) {
            iM += M.l(6, this.f22174o.f22149h);
        }
        int size = this.f22168h.size() + iM;
        this.f22176q = size;
        return size;
    }

    @Override
    public final AbstractC2637j c() {
        return a0.f();
    }

    @Override
    public final AbstractC2637j d() {
        a0 a0VarF = a0.f();
        a0VarF.g(this);
        return a0VarF;
    }

    @Override
    public final void e(M m8) throws IOException {
        b();
        if ((this.f22169i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f22169i & 2) == 2) {
            m8.Z(2, this.f22170k);
        }
        if ((this.f22169i & 4) == 4) {
            m8.Y(3, this.f22171l.f22131h);
        }
        if ((this.f22169i & 8) == 8) {
            m8.Z(4, this.f22172m);
        }
        if ((this.f22169i & 16) == 16) {
            m8.Z(5, this.f22173n);
        }
        if ((this.f22169i & 32) == 32) {
            m8.Y(6, this.f22174o.f22149h);
        }
        m8.e0(this.f22168h);
    }

    @Override
    public final boolean isInitialized() {
        if (this.f22175p == 1) {
            return true;
        }
        this.f22175p = (byte) 1;
        return true;
    }

    public d0(a0 a0Var) {
        this.f22175p = (byte) -1;
        this.f22176q = -1;
        this.f22168h = a0Var.f25492h;
    }

    public d0(C2633f c2633f) {
        this.f22175p = (byte) -1;
        this.f22176q = -1;
        boolean z6 = false;
        this.j = 0;
        this.f22170k = 0;
        b0 b0Var = b0.ERROR;
        this.f22171l = b0Var;
        this.f22172m = 0;
        this.f22173n = 0;
        c0 c0Var = c0.LANGUAGE_VERSION;
        this.f22174o = c0Var;
        C2631d c2631d = new C2631d();
        M mH = M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f22169i |= 1;
                            this.j = c2633f.k();
                        } else if (iN != 16) {
                            c0 c0Var2 = null;
                            b0 b0Var2 = null;
                            if (iN == 24) {
                                int iK = c2633f.k();
                                if (iK == 0) {
                                    b0Var2 = b0.WARNING;
                                } else if (iK == 1) {
                                    b0Var2 = b0Var;
                                } else if (iK == 2) {
                                    b0Var2 = b0.HIDDEN;
                                }
                                if (b0Var2 == null) {
                                    mH.i0(iN);
                                    mH.i0(iK);
                                } else {
                                    this.f22169i |= 4;
                                    this.f22171l = b0Var2;
                                }
                            } else if (iN == 32) {
                                this.f22169i |= 8;
                                this.f22172m = c2633f.k();
                            } else if (iN == 40) {
                                this.f22169i |= 16;
                                this.f22173n = c2633f.k();
                            } else if (iN != 48) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                int iK2 = c2633f.k();
                                if (iK2 == 0) {
                                    c0Var2 = c0Var;
                                } else if (iK2 == 1) {
                                    c0Var2 = c0.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    c0Var2 = c0.API_VERSION;
                                }
                                if (c0Var2 == null) {
                                    mH.i0(iN);
                                    mH.i0(iK2);
                                } else {
                                    this.f22169i |= 32;
                                    this.f22174o = c0Var2;
                                }
                            }
                        } else {
                            this.f22169i |= 2;
                            this.f22170k = c2633f.k();
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    try {
                        mH.y();
                    } catch (IOException unused) {
                    } finally {
                        this.f22168h = c2631d.i();
                    }
                    throw th;
                }
            } catch (r e6) {
                e6.f25503h = this;
                throw e6;
            } catch (IOException e9) {
                r rVar = new r(e9.getMessage());
                rVar.f25503h = this;
                throw rVar;
            }
        }
        try {
            mH.y();
        } catch (IOException unused2) {
        } finally {
            this.f22168h = c2631d.i();
        }
    }
}
