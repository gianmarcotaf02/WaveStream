package p062g7;

import Z2.M;
import java.io.IOException;
import p079i7.f;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2632e;
import p110m7.AbstractC2637j;
import p110m7.AbstractC2639l;
import p110m7.C2631d;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.r;

public final class C2172t extends AbstractC2639l {

    public static final C2172t f22305n;

    public static final C2154a f22306o = new C2154a(7);

    public final AbstractC2632e f22307i;
    public int j;

    public int f22308k;

    public byte f22309l;

    public int f22310m;

    static {
        C2172t c2172t = new C2172t();
        f22305n = c2172t;
        c2172t.f22308k = 0;
    }

    public C2172t(C2171s c2171s) {
        super(c2171s);
        this.f22309l = (byte) -1;
        this.f22310m = -1;
        this.f22307i = c2171s.f25492h;
    }

    @Override
    public final AbstractC2629b a() {
        return f22305n;
    }

    @Override
    public final int b() {
        int i3 = this.f22310m;
        if (i3 != -1) {
            return i3;
        }
        int size = this.f22307i.size() + i() + ((this.j & 1) == 1 ? M.m(1, this.f22308k) : 0);
        this.f22310m = size;
        return size;
    }

    @Override
    public final AbstractC2637j c() {
        return new C2171s();
    }

    @Override
    public final AbstractC2637j d() {
        C2171s c2171s = new C2171s();
        c2171s.f(this);
        return c2171s;
    }

    @Override
    public final void e(M m8) throws IOException {
        b();
        f fVar = new f(this);
        if ((this.j & 1) == 1) {
            m8.Z(1, this.f22308k);
        }
        fVar.X0(200, m8);
        m8.e0(this.f22307i);
    }

    @Override
    public final boolean isInitialized() {
        byte b9 = this.f22309l;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        if (h()) {
            this.f22309l = (byte) 1;
            return true;
        }
        this.f22309l = (byte) 0;
        return false;
    }

    public C2172t() {
        this.f22309l = (byte) -1;
        this.f22310m = -1;
        this.f22307i = AbstractC2632e.f25476h;
    }

    public C2172t(C2633f c2633f, C2635h c2635h) {
        this.f22309l = (byte) -1;
        this.f22310m = -1;
        boolean z6 = false;
        this.f22308k = 0;
        C2631d c2631d = new C2631d();
        M mH = M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        if (iN != 8) {
                            if (!m(c2633f, mH, c2635h, iN)) {
                            }
                        } else {
                            this.j |= 1;
                            this.f22308k = c2633f.k();
                        }
                    }
                    z6 = true;
                } catch (Throwable th) {
                    try {
                        mH.y();
                    } catch (IOException unused) {
                    } finally {
                        this.f22307i = c2631d.i();
                    }
                    l();
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
            this.f22307i = c2631d.i();
        }
        l();
    }
}
