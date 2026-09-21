package p062g7;

import Z2.M;
import androidx.media3.extractor.AacUtil;
import com.revenuecat.purchases.utils.EventsFileHelper;
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

public final class G extends AbstractC2639l {

    public static final G f21946B;

    public static final C2154a f21947C = new C2154a(12);

    public int f21948A;

    public final AbstractC2632e f21949i;
    public int j;

    public int f21950k;

    public int f21951l;

    public int f21952m;

    public Q f21953n;

    public int f21954o;

    public List f21955p;

    public Q f21956q;

    public int f21957r;

    public List f21958s;

    public List f21959t;

    public int f21960u;

    public Z f21961v;

    public int f21962w;

    public int f21963x;
    public List y;

    public byte f21964z;

    static {
        G g = new G();
        f21946B = g;
        g.o();
    }

    public G(F f9) {
        super(f9);
        this.f21960u = -1;
        this.f21964z = (byte) -1;
        this.f21948A = -1;
        this.f21949i = f9.f25492h;
    }

    @Override
    public final AbstractC2629b a() {
        return f21946B;
    }

    @Override
    public final int b() {
        int i3 = this.f21948A;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.j & 2) == 2 ? M.m(1, this.f21951l) : 0;
        if ((this.j & 4) == 4) {
            iM += M.m(2, this.f21952m);
        }
        if ((this.j & 8) == 8) {
            iM += M.o(3, this.f21953n);
        }
        for (int i9 = 0; i9 < this.f21955p.size(); i9++) {
            iM += M.o(4, (AbstractC2629b) this.f21955p.get(i9));
        }
        if ((this.j & 32) == 32) {
            iM += M.o(5, this.f21956q);
        }
        if ((this.j & 128) == 128) {
            iM += M.o(6, this.f21961v);
        }
        if ((this.j & 256) == 256) {
            iM += M.m(7, this.f21962w);
        }
        if ((this.j & 512) == 512) {
            iM += M.m(8, this.f21963x);
        }
        if ((this.j & 16) == 16) {
            iM += M.m(9, this.f21954o);
        }
        if ((this.j & 64) == 64) {
            iM += M.m(10, this.f21957r);
        }
        if ((this.j & 1) == 1) {
            iM += M.m(11, this.f21950k);
        }
        for (int i10 = 0; i10 < this.f21958s.size(); i10++) {
            iM += M.o(12, (AbstractC2629b) this.f21958s.get(i10));
        }
        int iN = 0;
        for (int i11 = 0; i11 < this.f21959t.size(); i11++) {
            iN += M.n(((Integer) this.f21959t.get(i11)).intValue());
        }
        int iN2 = iM + iN;
        if (!this.f21959t.isEmpty()) {
            iN2 = iN2 + 1 + M.n(iN);
        }
        this.f21960u = iN;
        int iN3 = 0;
        for (int i12 = 0; i12 < this.y.size(); i12++) {
            iN3 += M.n(((Integer) this.y.get(i12)).intValue());
        }
        int size = this.f21949i.size() + i() + (this.y.size() * 2) + iN2 + iN3;
        this.f21948A = size;
        return size;
    }

    @Override
    public final AbstractC2637j c() {
        return F.g();
    }

    @Override
    public final AbstractC2637j d() {
        F fG = F.g();
        fG.h(this);
        return fG;
    }

    @Override
    public final void e(M m8) throws IOException {
        b();
        f fVar = new f(this);
        if ((this.j & 2) == 2) {
            m8.Z(1, this.f21951l);
        }
        if ((this.j & 4) == 4) {
            m8.Z(2, this.f21952m);
        }
        if ((this.j & 8) == 8) {
            m8.b0(3, this.f21953n);
        }
        for (int i3 = 0; i3 < this.f21955p.size(); i3++) {
            m8.b0(4, (AbstractC2629b) this.f21955p.get(i3));
        }
        if ((this.j & 32) == 32) {
            m8.b0(5, this.f21956q);
        }
        if ((this.j & 128) == 128) {
            m8.b0(6, this.f21961v);
        }
        if ((this.j & 256) == 256) {
            m8.Z(7, this.f21962w);
        }
        if ((this.j & 512) == 512) {
            m8.Z(8, this.f21963x);
        }
        if ((this.j & 16) == 16) {
            m8.Z(9, this.f21954o);
        }
        if ((this.j & 64) == 64) {
            m8.Z(10, this.f21957r);
        }
        if ((this.j & 1) == 1) {
            m8.Z(11, this.f21950k);
        }
        for (int i9 = 0; i9 < this.f21958s.size(); i9++) {
            m8.b0(12, (AbstractC2629b) this.f21958s.get(i9));
        }
        if (this.f21959t.size() > 0) {
            m8.i0(106);
            m8.i0(this.f21960u);
        }
        for (int i10 = 0; i10 < this.f21959t.size(); i10++) {
            m8.a0(((Integer) this.f21959t.get(i10)).intValue());
        }
        for (int i11 = 0; i11 < this.y.size(); i11++) {
            m8.Z(31, ((Integer) this.y.get(i11)).intValue());
        }
        fVar.X0(19000, m8);
        m8.e0(this.f21949i);
    }

    @Override
    public final boolean isInitialized() {
        byte b9 = this.f21964z;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        int i3 = this.j;
        if ((i3 & 4) != 4) {
            this.f21964z = (byte) 0;
            return false;
        }
        if ((i3 & 8) == 8 && !this.f21953n.isInitialized()) {
            this.f21964z = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.f21955p.size(); i9++) {
            if (!((W) this.f21955p.get(i9)).isInitialized()) {
                this.f21964z = (byte) 0;
                return false;
            }
        }
        if ((this.j & 32) == 32 && !this.f21956q.isInitialized()) {
            this.f21964z = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f21958s.size(); i10++) {
            if (!((Q) this.f21958s.get(i10)).isInitialized()) {
                this.f21964z = (byte) 0;
                return false;
            }
        }
        if ((this.j & 128) == 128 && !this.f21961v.isInitialized()) {
            this.f21964z = (byte) 0;
            return false;
        }
        if (h()) {
            this.f21964z = (byte) 1;
            return true;
        }
        this.f21964z = (byte) 0;
        return false;
    }

    public final void o() {
        this.f21950k = 518;
        this.f21951l = 2054;
        this.f21952m = 0;
        Q q9 = Q.f22020A;
        this.f21953n = q9;
        this.f21954o = 0;
        List list = Collections.EMPTY_LIST;
        this.f21955p = list;
        this.f21956q = q9;
        this.f21957r = 0;
        this.f21958s = list;
        this.f21959t = list;
        this.f21961v = Z.f22099s;
        this.f21962w = 0;
        this.f21963x = 0;
        this.y = list;
    }

    public G() {
        this.f21960u = -1;
        this.f21964z = (byte) -1;
        this.f21948A = -1;
        this.f21949i = AbstractC2632e.f25476h;
    }

    public G(C2633f c2633f, C2635h c2635h) {
        this.f21960u = -1;
        this.f21964z = (byte) -1;
        this.f21948A = -1;
        o();
        C2631d c2631d = new C2631d();
        M mH = M.H(c2631d, 1);
        boolean z6 = false;
        int i3 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        P p2 = null;
                        Y y = null;
                        P p9 = null;
                        switch (iN) {
                            case 0:
                                break;
                            case 8:
                                this.j |= 2;
                                this.f21951l = c2633f.k();
                                continue;
                            case 16:
                                this.j |= 4;
                                this.f21952m = c2633f.k();
                                continue;
                            case 26:
                                if ((this.j & 8) == 8) {
                                    Q q9 = this.f21953n;
                                    q9.getClass();
                                    p2 = Q.p(q9);
                                }
                                Q q10 = (Q) c2633f.g(Q.f22021B, c2635h);
                                this.f21953n = q10;
                                if (p2 != null) {
                                    p2.h(q10);
                                    this.f21953n = p2.f();
                                }
                                this.j |= 8;
                                continue;
                            case 34:
                                int i9 = (i3 == true ? 1 : 0) & 32;
                                i3 = i3;
                                if (i9 != 32) {
                                    this.f21955p = new ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 32;
                                }
                                this.f21955p.add(c2633f.g(W.f22074u, c2635h));
                                continue;
                            case AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE:
                                if ((this.j & 32) == 32) {
                                    Q q11 = this.f21956q;
                                    q11.getClass();
                                    p9 = Q.p(q11);
                                }
                                Q q12 = (Q) c2633f.g(Q.f22021B, c2635h);
                                this.f21956q = q12;
                                if (p9 != null) {
                                    p9.h(q12);
                                    this.f21956q = p9.f();
                                }
                                this.j |= 32;
                                continue;
                            case 50:
                                if ((this.j & 128) == 128) {
                                    Z z9 = this.f21961v;
                                    z9.getClass();
                                    y = new Y();
                                    Q q13 = Q.f22020A;
                                    y.f22095n = q13;
                                    y.f22097p = q13;
                                    y.g(z9);
                                }
                                Z z10 = (Z) c2633f.g(Z.f22100t, c2635h);
                                this.f21961v = z10;
                                if (y != null) {
                                    y.g(z10);
                                    this.f21961v = y.f();
                                }
                                this.j |= 128;
                                continue;
                            case 56:
                                this.j |= 256;
                                this.f21962w = c2633f.k();
                                continue;
                            case 64:
                                this.j |= 512;
                                this.f21963x = c2633f.k();
                                continue;
                            case 72:
                                this.j |= 16;
                                this.f21954o = c2633f.k();
                                continue;
                            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                                this.j |= 64;
                                this.f21957r = c2633f.k();
                                continue;
                            case 88:
                                this.j |= 1;
                                this.f21950k = c2633f.k();
                                continue;
                            case 98:
                                int i10 = (i3 == true ? 1 : 0) & 256;
                                i3 = i3;
                                if (i10 != 256) {
                                    this.f21958s = new ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 256;
                                }
                                this.f21958s.add(c2633f.g(Q.f22021B, c2635h));
                                continue;
                            case 104:
                                int i11 = (i3 == true ? 1 : 0) & 512;
                                i3 = i3;
                                if (i11 != 512) {
                                    this.f21959t = new ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 512;
                                }
                                this.f21959t.add(Integer.valueOf(c2633f.k()));
                                continue;
                            case 106:
                                int iD = c2633f.d(c2633f.k());
                                int i12 = (i3 == true ? 1 : 0) & 512;
                                i3 = i3;
                                if (i12 != 512 && c2633f.b() > 0) {
                                    i3 = i3;
                                    this.f21959t = new ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 512;
                                }
                                i3 = i3;
                                while (c2633f.b() > 0) {
                                    this.f21959t.add(Integer.valueOf(c2633f.k()));
                                }
                                c2633f.c(iD);
                                continue;
                            case 248:
                                int i13 = (i3 == true ? 1 : 0) & 8192;
                                i3 = i3;
                                if (i13 != 8192) {
                                    this.y = new ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 8192;
                                }
                                this.y.add(Integer.valueOf(c2633f.k()));
                                continue;
                            case 250:
                                int iD2 = c2633f.d(c2633f.k());
                                int i14 = (i3 == true ? 1 : 0) & 8192;
                                i3 = i3;
                                if (i14 != 8192 && c2633f.b() > 0) {
                                    i3 = i3;
                                    this.y = new ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 8192;
                                }
                                i3 = i3;
                                while (c2633f.b() > 0) {
                                    this.y.add(Integer.valueOf(c2633f.k()));
                                }
                                c2633f.c(iD2);
                                continue;
                            default:
                                if (!m(c2633f, mH, c2635h, iN)) {
                                    break;
                                }
                                break;
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
                if (((i3 == true ? 1 : 0) & 32) == 32) {
                    this.f21955p = Collections.unmodifiableList(this.f21955p);
                }
                if (((i3 == true ? 1 : 0) & 256) == 256) {
                    this.f21958s = Collections.unmodifiableList(this.f21958s);
                }
                if (((i3 == true ? 1 : 0) & 512) == 512) {
                    this.f21959t = Collections.unmodifiableList(this.f21959t);
                }
                if (((i3 == true ? 1 : 0) & 8192) == 8192) {
                    this.y = Collections.unmodifiableList(this.y);
                }
                try {
                    mH.y();
                } catch (IOException unused) {
                } finally {
                    this.f21949i = c2631d.i();
                }
                l();
                throw th;
            }
        }
        if (((i3 == true ? 1 : 0) & 32) == 32) {
            this.f21955p = Collections.unmodifiableList(this.f21955p);
        }
        if (((i3 == true ? 1 : 0) & 256) == 256) {
            this.f21958s = Collections.unmodifiableList(this.f21958s);
        }
        if (((i3 == true ? 1 : 0) & 512) == 512) {
            this.f21959t = Collections.unmodifiableList(this.f21959t);
        }
        if (((i3 == true ? 1 : 0) & 8192) == 8192) {
            this.y = Collections.unmodifiableList(this.y);
        }
        try {
            mH.y();
        } catch (IOException unused2) {
        } finally {
            this.f21949i = c2631d.i();
        }
        l();
    }
}
