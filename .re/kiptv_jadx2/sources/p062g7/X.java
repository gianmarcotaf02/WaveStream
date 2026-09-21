package p062g7;

import Z2.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2632e;
import p110m7.AbstractC2637j;
import p110m7.C2631d;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.o;
import p110m7.r;

public final class X extends o {

    public static final X f22085n;

    public static final C2154a f22086o = new C2154a(20);

    public final AbstractC2632e f22087h;

    public int f22088i;
    public List j;

    public int f22089k;

    public byte f22090l;

    public int f22091m;

    static {
        X x9 = new X();
        f22085n = x9;
        x9.j = Collections.EMPTY_LIST;
        x9.f22089k = -1;
    }

    public X() {
        this.f22090l = (byte) -1;
        this.f22091m = -1;
        this.f22087h = AbstractC2632e.f25476h;
    }

    public static C2159f h(X x9) {
        C2159f c2159fH = C2159f.h();
        c2159fH.k(x9);
        return c2159fH;
    }

    @Override
    public final int b() {
        int i3 = this.f22091m;
        if (i3 != -1) {
            return i3;
        }
        int iM = 0;
        for (int i9 = 0; i9 < this.j.size(); i9++) {
            iM += M.o(1, (AbstractC2629b) this.j.get(i9));
        }
        if ((this.f22088i & 1) == 1) {
            iM += M.m(2, this.f22089k);
        }
        int size = this.f22087h.size() + iM;
        this.f22091m = size;
        return size;
    }

    @Override
    public final AbstractC2637j c() {
        return C2159f.h();
    }

    @Override
    public final AbstractC2637j d() {
        return h(this);
    }

    @Override
    public final void e(M m8) throws IOException {
        b();
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            m8.b0(1, (AbstractC2629b) this.j.get(i3));
        }
        if ((this.f22088i & 1) == 1) {
            m8.Z(2, this.f22089k);
        }
        m8.e0(this.f22087h);
    }

    public final C2159f i() {
        return h(this);
    }

    @Override
    public final boolean isInitialized() {
        byte b9 = this.f22090l;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            if (!((Q) this.j.get(i3)).isInitialized()) {
                this.f22090l = (byte) 0;
                return false;
            }
        }
        this.f22090l = (byte) 1;
        return true;
    }

    public X(C2159f c2159f) {
        this.f22090l = (byte) -1;
        this.f22091m = -1;
        this.f22087h = c2159f.f25492h;
    }

    public X(C2633f c2633f, C2635h c2635h) {
        this.f22090l = (byte) -1;
        this.f22091m = -1;
        this.j = Collections.EMPTY_LIST;
        this.f22089k = -1;
        C2631d c2631d = new C2631d();
        M mH = M.H(c2631d, 1);
        boolean z6 = false;
        boolean z9 = false;
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if (!z9) {
                                this.j = new ArrayList();
                                z9 = true;
                            }
                            this.j.add(c2633f.g(Q.f22021B, c2635h));
                        } else if (iN != 16) {
                            if (!c2633f.q(iN, mH)) {
                            }
                        } else {
                            this.f22088i |= 1;
                            this.f22089k = c2633f.k();
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if (z9) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
                    try {
                        mH.y();
                    } catch (IOException unused) {
                    } finally {
                        this.f22087h = c2631d.i();
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
        if (z9) {
            this.j = Collections.unmodifiableList(this.j);
        }
        try {
            mH.y();
        } catch (IOException unused2) {
        } finally {
            this.f22087h = c2631d.i();
        }
    }
}
