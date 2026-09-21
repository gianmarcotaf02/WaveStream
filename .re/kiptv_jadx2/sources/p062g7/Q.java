package p062g7;

import Z2.M;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p079i7.f;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2632e;
import p110m7.AbstractC2637j;
import p110m7.AbstractC2639l;
import p110m7.C2631d;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.r;

public final class Q extends AbstractC2639l {

    public static final Q f22020A;

    public static final C2154a f22021B = new C2154a(16);

    public final AbstractC2632e f22022i;
    public int j;

    public List f22023k;

    public boolean f22024l;

    public int f22025m;

    public Q f22026n;

    public int f22027o;

    public int f22028p;

    public int f22029q;

    public int f22030r;

    public int f22031s;

    public Q f22032t;

    public int f22033u;

    public Q f22034v;

    public int f22035w;

    public int f22036x;
    public byte y;

    public int f22037z;

    static {
        Q q9 = new Q();
        f22020A = q9;
        q9.o();
    }

    public Q(P p2) {
        super(p2);
        this.y = (byte) -1;
        this.f22037z = -1;
        this.f22022i = p2.f25492h;
    }

    public static P p(Q q9) {
        P pG = P.g();
        pG.h(q9);
        return pG;
    }

    @Override
    public final AbstractC2629b a() {
        return f22020A;
    }

    @Override
    public final int b() {
        int i3 = this.f22037z;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.j & 4096) == 4096 ? M.m(1, this.f22036x) : 0;
        for (int i9 = 0; i9 < this.f22023k.size(); i9++) {
            iM += M.o(2, (AbstractC2629b) this.f22023k.get(i9));
        }
        if ((this.j & 1) == 1) {
            iM += M.s(3) + 1;
        }
        if ((this.j & 2) == 2) {
            iM += M.m(4, this.f22025m);
        }
        if ((this.j & 4) == 4) {
            iM += M.o(5, this.f22026n);
        }
        if ((this.j & 16) == 16) {
            iM += M.m(6, this.f22028p);
        }
        if ((this.j & 32) == 32) {
            iM += M.m(7, this.f22029q);
        }
        if ((this.j & 8) == 8) {
            iM += M.m(8, this.f22027o);
        }
        if ((this.j & 64) == 64) {
            iM += M.m(9, this.f22030r);
        }
        if ((this.j & 256) == 256) {
            iM += M.o(10, this.f22032t);
        }
        if ((this.j & 512) == 512) {
            iM += M.m(11, this.f22033u);
        }
        if ((this.j & 128) == 128) {
            iM += M.m(12, this.f22031s);
        }
        if ((this.j & 1024) == 1024) {
            iM += M.o(13, this.f22034v);
        }
        if ((this.j & 2048) == 2048) {
            iM += M.m(14, this.f22035w);
        }
        int size = this.f22022i.size() + i() + iM;
        this.f22037z = size;
        return size;
    }

    @Override
    public final AbstractC2637j c() {
        return P.g();
    }

    @Override
    public final void e(M m8) throws IOException {
        b();
        f fVar = new f(this);
        if ((this.j & 4096) == 4096) {
            m8.Z(1, this.f22036x);
        }
        for (int i3 = 0; i3 < this.f22023k.size(); i3++) {
            m8.b0(2, (AbstractC2629b) this.f22023k.get(i3));
        }
        if ((this.j & 1) == 1) {
            boolean z6 = this.f22024l;
            m8.k0(3, 0);
            m8.d0(z6 ? 1 : 0);
        }
        if ((this.j & 2) == 2) {
            m8.Z(4, this.f22025m);
        }
        if ((this.j & 4) == 4) {
            m8.b0(5, this.f22026n);
        }
        if ((this.j & 16) == 16) {
            m8.Z(6, this.f22028p);
        }
        if ((this.j & 32) == 32) {
            m8.Z(7, this.f22029q);
        }
        if ((this.j & 8) == 8) {
            m8.Z(8, this.f22027o);
        }
        if ((this.j & 64) == 64) {
            m8.Z(9, this.f22030r);
        }
        if ((this.j & 256) == 256) {
            m8.b0(10, this.f22032t);
        }
        if ((this.j & 512) == 512) {
            m8.Z(11, this.f22033u);
        }
        if ((this.j & 128) == 128) {
            m8.Z(12, this.f22031s);
        }
        if ((this.j & 1024) == 1024) {
            m8.b0(13, this.f22034v);
        }
        if ((this.j & 2048) == 2048) {
            m8.Z(14, this.f22035w);
        }
        fVar.X0(200, m8);
        m8.e0(this.f22022i);
    }

    @Override
    public final boolean isInitialized() {
        byte b9 = this.y;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        for (int i3 = 0; i3 < this.f22023k.size(); i3++) {
            if (!((O) this.f22023k.get(i3)).isInitialized()) {
                this.y = (byte) 0;
                return false;
            }
        }
        if ((this.j & 4) == 4 && !this.f22026n.isInitialized()) {
            this.y = (byte) 0;
            return false;
        }
        if ((this.j & 256) == 256 && !this.f22032t.isInitialized()) {
            this.y = (byte) 0;
            return false;
        }
        if ((this.j & 1024) == 1024 && !this.f22034v.isInitialized()) {
            this.y = (byte) 0;
            return false;
        }
        if (h()) {
            this.y = (byte) 1;
            return true;
        }
        this.y = (byte) 0;
        return false;
    }

    public final void o() {
        this.f22023k = Collections.EMPTY_LIST;
        this.f22024l = false;
        this.f22025m = 0;
        Q q9 = f22020A;
        this.f22026n = q9;
        this.f22027o = 0;
        this.f22028p = 0;
        this.f22029q = 0;
        this.f22030r = 0;
        this.f22031s = 0;
        this.f22032t = q9;
        this.f22033u = 0;
        this.f22034v = q9;
        this.f22035w = 0;
        this.f22036x = 0;
    }

    @Override
    public final P d() {
        return p(this);
    }

    public Q() {
        this.y = (byte) -1;
        this.f22037z = -1;
        this.f22022i = AbstractC2632e.f25476h;
    }

    public Q(C2633f c2633f, C2635h c2635h) {
        this.y = (byte) -1;
        this.f22037z = -1;
        o();
        C2631d c2631d = new C2631d();
        M mH = M.H(c2631d, 1);
        boolean z6 = false;
        boolean z9 = false;
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    C2154a c2154a = f22021B;
                    P p2 = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.j |= 4096;
                            this.f22036x = c2633f.k();
                            continue;
                        case 18:
                            if (!z9) {
                                this.f22023k = new ArrayList();
                                z9 = true;
                            }
                            this.f22023k.add(c2633f.g(O.f21999p, c2635h));
                            continue;
                        case 24:
                            this.j |= 1;
                            this.f22024l = c2633f.l() != 0;
                            continue;
                        case 32:
                            this.j |= 2;
                            this.f22025m = c2633f.k();
                            continue;
                        case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE:
                            if ((this.j & 4) == 4) {
                                Q q9 = this.f22026n;
                                q9.getClass();
                                p2 = p(q9);
                            }
                            Q q10 = (Q) c2633f.g(c2154a, c2635h);
                            this.f22026n = q10;
                            if (p2 != null) {
                                p2.h(q10);
                                this.f22026n = p2.f();
                            }
                            this.j |= 4;
                            continue;
                        case NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED:
                            this.j |= 16;
                            this.f22028p = c2633f.k();
                            continue;
                        case 56:
                            this.j |= 32;
                            this.f22029q = c2633f.k();
                            continue;
                        case 64:
                            this.j |= 8;
                            this.f22027o = c2633f.k();
                            continue;
                        case 72:
                            this.j |= 64;
                            this.f22030r = c2633f.k();
                            continue;
                        case 82:
                            if ((this.j & 256) == 256) {
                                Q q11 = this.f22032t;
                                q11.getClass();
                                p2 = p(q11);
                            }
                            Q q12 = (Q) c2633f.g(c2154a, c2635h);
                            this.f22032t = q12;
                            if (p2 != null) {
                                p2.h(q12);
                                this.f22032t = p2.f();
                            }
                            this.j |= 256;
                            continue;
                        case 88:
                            this.j |= 512;
                            this.f22033u = c2633f.k();
                            continue;
                        case 96:
                            this.j |= 128;
                            this.f22031s = c2633f.k();
                            continue;
                        case 106:
                            if ((this.j & 1024) == 1024) {
                                Q q13 = this.f22034v;
                                q13.getClass();
                                p2 = p(q13);
                            }
                            Q q14 = (Q) c2633f.g(c2154a, c2635h);
                            this.f22034v = q14;
                            if (p2 != null) {
                                p2.h(q14);
                                this.f22034v = p2.f();
                            }
                            this.j |= 1024;
                            continue;
                        case 112:
                            this.j |= 2048;
                            this.f22035w = c2633f.k();
                            continue;
                        default:
                            if (!m(c2633f, mH, c2635h, iN)) {
                                break;
                            }
                            break;
                    }
                    z6 = true;
                } catch (Throwable th) {
                    if (z9) {
                        this.f22023k = Collections.unmodifiableList(this.f22023k);
                    }
                    try {
                        mH.y();
                    } catch (IOException unused) {
                    } finally {
                        this.f22022i = c2631d.i();
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
        if (z9) {
            this.f22023k = Collections.unmodifiableList(this.f22023k);
        }
        try {
            mH.y();
        } catch (IOException unused2) {
        } finally {
            this.f22022i = c2631d.i();
        }
        l();
    }
}
