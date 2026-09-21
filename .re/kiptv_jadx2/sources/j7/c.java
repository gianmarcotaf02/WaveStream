package j7;

import Z2.M;
import java.io.IOException;
import p062g7.C2154a;
import p110m7.AbstractC2632e;
import p110m7.AbstractC2637j;
import p110m7.C2631d;
import p110m7.C2633f;
import p110m7.o;
import p110m7.r;

public final class c extends o {

    public static final c f24267n;

    public static final C2154a f24268o = new C2154a(25);

    public final AbstractC2632e f24269h;

    public int f24270i;
    public int j;

    public int f24271k;

    public byte f24272l;

    public int f24273m;

    static {
        c cVar = new c();
        f24267n = cVar;
        cVar.j = 0;
        cVar.f24271k = 0;
    }

    public c() {
        this.f24272l = (byte) -1;
        this.f24273m = -1;
        this.f24269h = AbstractC2632e.f25476h;
    }

    public static a h(c cVar) {
        a aVar = new a(1);
        aVar.h(cVar);
        return aVar;
    }

    @Override
    public final int b() {
        int i3 = this.f24273m;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f24270i & 1) == 1 ? M.m(1, this.j) : 0;
        if ((this.f24270i & 2) == 2) {
            iM += M.m(2, this.f24271k);
        }
        int size = this.f24269h.size() + iM;
        this.f24273m = size;
        return size;
    }

    @Override
    public final AbstractC2637j c() {
        return new a(1);
    }

    @Override
    public final AbstractC2637j d() {
        return h(this);
    }

    @Override
    public final void e(M m8) throws IOException {
        b();
        if ((this.f24270i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f24270i & 2) == 2) {
            m8.Z(2, this.f24271k);
        }
        m8.e0(this.f24269h);
    }

    @Override
    public final boolean isInitialized() {
        if (this.f24272l == 1) {
            return true;
        }
        this.f24272l = (byte) 1;
        return true;
    }

    public c(a aVar) {
        this.f24272l = (byte) -1;
        this.f24273m = -1;
        this.f24269h = aVar.f25492h;
    }

    public c(C2633f c2633f) {
        this.f24272l = (byte) -1;
        this.f24273m = -1;
        boolean z6 = false;
        this.j = 0;
        this.f24271k = 0;
        C2631d c2631d = new C2631d();
        M mH = M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f24270i |= 1;
                                this.j = c2633f.k();
                            } else if (iN != 16) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                this.f24270i |= 2;
                                this.f24271k = c2633f.k();
                            }
                        }
                        z6 = true;
                    } catch (r e6) {
                        e6.f25503h = this;
                        throw e6;
                    }
                } catch (IOException e9) {
                    r rVar = new r(e9.getMessage());
                    rVar.f25503h = this;
                    throw rVar;
                }
            } catch (Throwable th) {
                try {
                    mH.y();
                } catch (IOException unused) {
                } finally {
                    this.f24269h = c2631d.i();
                }
                throw th;
            }
        }
        try {
            mH.y();
        } catch (IOException unused2) {
        } finally {
            this.f24269h = c2631d.i();
        }
    }
}
