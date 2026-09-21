package j7;

import Z2.M;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p062g7.C2154a;
import p110m7.AbstractC2632e;
import p110m7.AbstractC2637j;
import p110m7.C2631d;
import p110m7.C2633f;
import p110m7.o;
import p110m7.r;
import p110m7.u;

public final class i extends o {

    public static final i f24301t;

    public static final C2154a f24302u = new C2154a(28);

    public final AbstractC2632e f24303h;

    public int f24304i;
    public int j;

    public int f24305k;

    public Object f24306l;

    public h f24307m;

    public List f24308n;

    public int f24309o;

    public List f24310p;

    public int f24311q;

    public byte f24312r;

    public int f24313s;

    static {
        i iVar = new i();
        f24301t = iVar;
        iVar.j = 1;
        iVar.f24305k = 0;
        iVar.f24306l = "";
        iVar.f24307m = h.NONE;
        List list = Collections.EMPTY_LIST;
        iVar.f24308n = list;
        iVar.f24310p = list;
    }

    public i() {
        this.f24309o = -1;
        this.f24311q = -1;
        this.f24312r = (byte) -1;
        this.f24313s = -1;
        this.f24303h = AbstractC2632e.f25476h;
    }

    @Override
    public final int b() {
        AbstractC2632e uVar;
        int i3 = this.f24313s;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f24304i & 1) == 1 ? M.m(1, this.j) : 0;
        if ((this.f24304i & 2) == 2) {
            iM += M.m(2, this.f24305k);
        }
        if ((this.f24304i & 8) == 8) {
            iM += M.l(3, this.f24307m.f24300h);
        }
        int iN = 0;
        for (int i9 = 0; i9 < this.f24308n.size(); i9++) {
            iN += M.n(((Integer) this.f24308n.get(i9)).intValue());
        }
        int iN2 = iM + iN;
        if (!this.f24308n.isEmpty()) {
            iN2 = iN2 + 1 + M.n(iN);
        }
        this.f24309o = iN;
        int iN3 = 0;
        for (int i10 = 0; i10 < this.f24310p.size(); i10++) {
            iN3 += M.n(((Integer) this.f24310p.get(i10)).intValue());
        }
        int size = iN2 + iN3;
        if (!this.f24310p.isEmpty()) {
            size = size + 1 + M.n(iN3);
        }
        this.f24311q = iN3;
        if ((this.f24304i & 4) == 4) {
            Object obj = this.f24306l;
            if (obj instanceof String) {
                try {
                    uVar = new u(((String) obj).getBytes("UTF-8"));
                    this.f24306l = uVar;
                } catch (UnsupportedEncodingException e6) {
                    throw new RuntimeException("UTF-8 not supported?", e6);
                }
            } else {
                uVar = (AbstractC2632e) obj;
            }
            size += uVar.size() + M.q(uVar.size()) + M.s(6);
        }
        int size2 = this.f24303h.size() + size;
        this.f24313s = size2;
        return size2;
    }

    @Override
    public final AbstractC2637j c() {
        return g.f();
    }

    @Override
    public final AbstractC2637j d() {
        g gVarF = g.f();
        gVarF.g(this);
        return gVarF;
    }

    @Override
    public final void e(M m8) throws IOException {
        AbstractC2632e uVar;
        b();
        if ((this.f24304i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f24304i & 2) == 2) {
            m8.Z(2, this.f24305k);
        }
        if ((this.f24304i & 8) == 8) {
            m8.Y(3, this.f24307m.f24300h);
        }
        if (this.f24308n.size() > 0) {
            m8.i0(34);
            m8.i0(this.f24309o);
        }
        for (int i3 = 0; i3 < this.f24308n.size(); i3++) {
            m8.a0(((Integer) this.f24308n.get(i3)).intValue());
        }
        if (this.f24310p.size() > 0) {
            m8.i0(42);
            m8.i0(this.f24311q);
        }
        for (int i9 = 0; i9 < this.f24310p.size(); i9++) {
            m8.a0(((Integer) this.f24310p.get(i9)).intValue());
        }
        if ((this.f24304i & 4) == 4) {
            Object obj = this.f24306l;
            if (obj instanceof String) {
                try {
                    uVar = new u(((String) obj).getBytes("UTF-8"));
                    this.f24306l = uVar;
                } catch (UnsupportedEncodingException e6) {
                    throw new RuntimeException("UTF-8 not supported?", e6);
                }
            } else {
                uVar = (AbstractC2632e) obj;
            }
            m8.k0(6, 2);
            m8.i0(uVar.size());
            m8.e0(uVar);
        }
        m8.e0(this.f24303h);
    }

    @Override
    public final boolean isInitialized() {
        if (this.f24312r == 1) {
            return true;
        }
        this.f24312r = (byte) 1;
        return true;
    }

    public i(g gVar) {
        this.f24309o = -1;
        this.f24311q = -1;
        this.f24312r = (byte) -1;
        this.f24313s = -1;
        this.f24303h = gVar.f25492h;
    }

    public i(C2633f c2633f) {
        h hVar;
        this.f24309o = -1;
        this.f24311q = -1;
        this.f24312r = (byte) -1;
        this.f24313s = -1;
        this.j = 1;
        boolean z6 = false;
        this.f24305k = 0;
        this.f24306l = "";
        h hVar2 = h.NONE;
        this.f24307m = hVar2;
        List list = Collections.EMPTY_LIST;
        this.f24308n = list;
        this.f24310p = list;
        C2631d c2631d = new C2631d();
        M mH = M.H(c2631d, 1);
        int i3 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f24304i |= 1;
                                this.j = c2633f.k();
                            } else if (iN == 16) {
                                this.f24304i |= 2;
                                this.f24305k = c2633f.k();
                            } else if (iN == 24) {
                                int iK = c2633f.k();
                                if (iK == 0) {
                                    hVar = hVar2;
                                } else if (iK != 1) {
                                    hVar = iK != 2 ? null : h.DESC_TO_CLASS_ID;
                                } else {
                                    hVar = h.INTERNAL_TO_CLASS_ID;
                                }
                                if (hVar == null) {
                                    mH.i0(iN);
                                    mH.i0(iK);
                                } else {
                                    this.f24304i |= 8;
                                    this.f24307m = hVar;
                                }
                            } else if (iN == 32) {
                                if ((i3 & 16) != 16) {
                                    this.f24308n = new ArrayList();
                                    i3 |= 16;
                                }
                                this.f24308n.add(Integer.valueOf(c2633f.k()));
                            } else if (iN == 34) {
                                int iD = c2633f.d(c2633f.k());
                                if ((i3 & 16) != 16 && c2633f.b() > 0) {
                                    this.f24308n = new ArrayList();
                                    i3 |= 16;
                                }
                                while (c2633f.b() > 0) {
                                    this.f24308n.add(Integer.valueOf(c2633f.k()));
                                }
                                c2633f.c(iD);
                            } else if (iN == 40) {
                                if ((i3 & 32) != 32) {
                                    this.f24310p = new ArrayList();
                                    i3 |= 32;
                                }
                                this.f24310p.add(Integer.valueOf(c2633f.k()));
                            } else if (iN == 42) {
                                int iD2 = c2633f.d(c2633f.k());
                                if ((i3 & 32) != 32 && c2633f.b() > 0) {
                                    this.f24310p = new ArrayList();
                                    i3 |= 32;
                                }
                                while (c2633f.b() > 0) {
                                    this.f24310p.add(Integer.valueOf(c2633f.k()));
                                }
                                c2633f.c(iD2);
                            } else if (iN != 50) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                u uVarE = c2633f.e();
                                this.f24304i |= 4;
                                this.f24306l = uVarE;
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
                if ((i3 & 16) == 16) {
                    this.f24308n = Collections.unmodifiableList(this.f24308n);
                }
                if ((i3 & 32) == 32) {
                    this.f24310p = Collections.unmodifiableList(this.f24310p);
                }
                try {
                    mH.y();
                } catch (IOException unused) {
                } finally {
                    this.f24303h = c2631d.i();
                }
                throw th;
            }
        }
        if ((i3 & 16) == 16) {
            this.f24308n = Collections.unmodifiableList(this.f24308n);
        }
        if ((i3 & 32) == 32) {
            this.f24310p = Collections.unmodifiableList(this.f24310p);
        }
        try {
            mH.y();
        } catch (IOException unused2) {
        } finally {
            this.f24303h = c2631d.i();
        }
    }
}
