package p062g7;

import Z2.M;
import java.io.IOException;
import p110m7.AbstractC2632e;
import p110m7.AbstractC2637j;
import p110m7.C2631d;
import p110m7.C2633f;
import p110m7.o;
import p110m7.r;

public final class J extends o {

    public static final J f21972o;

    public static final C2154a f21973p = new C2154a(14);

    public final AbstractC2632e f21974h;

    public int f21975i;
    public int j;

    public int f21976k;

    public I f21977l;

    public byte f21978m;

    public int f21979n;

    static {
        J j = new J();
        f21972o = j;
        j.j = -1;
        j.f21976k = 0;
        j.f21977l = I.PACKAGE;
    }

    public J() {
        this.f21978m = (byte) -1;
        this.f21979n = -1;
        this.f21974h = AbstractC2632e.f25476h;
    }

    @Override
    public final int b() {
        int i3 = this.f21979n;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f21975i & 1) == 1 ? M.m(1, this.j) : 0;
        if ((this.f21975i & 2) == 2) {
            iM += M.m(2, this.f21976k);
        }
        if ((this.f21975i & 4) == 4) {
            iM += M.l(3, this.f21977l.f21971h);
        }
        int size = this.f21974h.size() + iM;
        this.f21979n = size;
        return size;
    }

    @Override
    public final AbstractC2637j c() {
        return H.f();
    }

    @Override
    public final AbstractC2637j d() {
        H hF = H.f();
        hF.g(this);
        return hF;
    }

    @Override
    public final void e(M m8) throws IOException {
        b();
        if ((this.f21975i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f21975i & 2) == 2) {
            m8.Z(2, this.f21976k);
        }
        if ((this.f21975i & 4) == 4) {
            m8.Y(3, this.f21977l.f21971h);
        }
        m8.e0(this.f21974h);
    }

    @Override
    public final boolean isInitialized() {
        byte b9 = this.f21978m;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        if ((this.f21975i & 2) == 2) {
            this.f21978m = (byte) 1;
            return true;
        }
        this.f21978m = (byte) 0;
        return false;
    }

    public J(H h9) {
        this.f21978m = (byte) -1;
        this.f21979n = -1;
        this.f21974h = h9.f25492h;
    }

    public J(C2633f c2633f) {
        I i3;
        this.f21978m = (byte) -1;
        this.f21979n = -1;
        this.j = -1;
        boolean z6 = false;
        this.f21976k = 0;
        I i9 = I.PACKAGE;
        this.f21977l = i9;
        C2631d c2631d = new C2631d();
        M mH = M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f21975i |= 1;
                                this.j = c2633f.k();
                            } else if (iN == 16) {
                                this.f21975i |= 2;
                                this.f21976k = c2633f.k();
                            } else if (iN != 24) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                int iK = c2633f.k();
                                if (iK == 0) {
                                    i3 = I.CLASS;
                                } else if (iK != 1) {
                                    i3 = iK != 2 ? null : I.LOCAL;
                                } else {
                                    i3 = i9;
                                }
                                if (i3 == null) {
                                    mH.i0(iN);
                                    mH.i0(iK);
                                } else {
                                    this.f21975i |= 4;
                                    this.f21977l = i3;
                                }
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
                    this.f21974h = c2631d.i();
                }
                throw th;
            }
        }
        try {
            mH.y();
        } catch (IOException unused2) {
        } finally {
            this.f21974h = c2631d.i();
        }
    }
}
