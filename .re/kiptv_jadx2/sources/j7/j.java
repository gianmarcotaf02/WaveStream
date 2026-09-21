package j7;

import Z2.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p062g7.C2154a;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2632e;
import p110m7.AbstractC2637j;
import p110m7.C2631d;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.o;
import p110m7.r;

public final class j extends o {

    public static final j f24314n;

    public static final C2154a f24315o = new C2154a(27);

    public final AbstractC2632e f24316h;

    public List f24317i;
    public List j;

    public int f24318k;

    public byte f24319l;

    public int f24320m;

    static {
        j jVar = new j();
        f24314n = jVar;
        List list = Collections.EMPTY_LIST;
        jVar.f24317i = list;
        jVar.j = list;
    }

    public j() {
        this.f24318k = -1;
        this.f24319l = (byte) -1;
        this.f24320m = -1;
        this.f24316h = AbstractC2632e.f25476h;
    }

    @Override
    public final int b() {
        int i3 = this.f24320m;
        if (i3 != -1) {
            return i3;
        }
        int iO = 0;
        for (int i9 = 0; i9 < this.f24317i.size(); i9++) {
            iO += M.o(1, (AbstractC2629b) this.f24317i.get(i9));
        }
        int iN = 0;
        for (int i10 = 0; i10 < this.j.size(); i10++) {
            iN += M.n(((Integer) this.j.get(i10)).intValue());
        }
        int iN2 = iO + iN;
        if (!this.j.isEmpty()) {
            iN2 = iN2 + 1 + M.n(iN);
        }
        this.f24318k = iN;
        int size = this.f24316h.size() + iN2;
        this.f24320m = size;
        return size;
    }

    @Override
    public final AbstractC2637j c() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.j = list;
        fVar.f24290k = list;
        return fVar;
    }

    @Override
    public final AbstractC2637j d() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.j = list;
        fVar.f24290k = list;
        fVar.f(this);
        return fVar;
    }

    @Override
    public final void e(M m8) throws IOException {
        b();
        for (int i3 = 0; i3 < this.f24317i.size(); i3++) {
            m8.b0(1, (AbstractC2629b) this.f24317i.get(i3));
        }
        if (this.j.size() > 0) {
            m8.i0(42);
            m8.i0(this.f24318k);
        }
        for (int i9 = 0; i9 < this.j.size(); i9++) {
            m8.a0(((Integer) this.j.get(i9)).intValue());
        }
        m8.e0(this.f24316h);
    }

    @Override
    public final boolean isInitialized() {
        if (this.f24319l == 1) {
            return true;
        }
        this.f24319l = (byte) 1;
        return true;
    }

    public j(f fVar) {
        this.f24318k = -1;
        this.f24319l = (byte) -1;
        this.f24320m = -1;
        this.f24316h = fVar.f25492h;
    }

    public j(C2633f c2633f, C2635h c2635h) {
        this.f24318k = -1;
        this.f24319l = (byte) -1;
        this.f24320m = -1;
        List list = Collections.EMPTY_LIST;
        this.f24317i = list;
        this.j = list;
        C2631d c2631d = new C2631d();
        M mH = M.H(c2631d, 1);
        boolean z6 = false;
        int i3 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i3 & 1) != 1) {
                                this.f24317i = new ArrayList();
                                i3 |= 1;
                            }
                            this.f24317i.add(c2633f.g(i.f24302u, c2635h));
                        } else if (iN == 40) {
                            if ((i3 & 2) != 2) {
                                this.j = new ArrayList();
                                i3 |= 2;
                            }
                            this.j.add(Integer.valueOf(c2633f.k()));
                        } else if (iN != 42) {
                            if (!c2633f.q(iN, mH)) {
                            }
                        } else {
                            int iD = c2633f.d(c2633f.k());
                            if ((i3 & 2) != 2 && c2633f.b() > 0) {
                                this.j = new ArrayList();
                                i3 |= 2;
                            }
                            while (c2633f.b() > 0) {
                                this.j.add(Integer.valueOf(c2633f.k()));
                            }
                            c2633f.c(iD);
                        }
                    }
                    z6 = true;
                } catch (r e6) {
                    e6.f25503h = this;
                    throw e6;
                } catch (IOException e9) {
                    r rVar = new r(e9.getMessage());
                    rVar.f25503h = this;
                    throw rVar;
                }
            } catch (Throwable th) {
                if ((i3 & 1) == 1) {
                    this.f24317i = Collections.unmodifiableList(this.f24317i);
                }
                if ((i3 & 2) == 2) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                try {
                    mH.y();
                } catch (IOException unused) {
                } finally {
                    this.f24316h = c2631d.i();
                }
                throw th;
            }
        }
        if ((i3 & 1) == 1) {
            this.f24317i = Collections.unmodifiableList(this.f24317i);
        }
        if ((i3 & 2) == 2) {
            this.j = Collections.unmodifiableList(this.j);
        }
        try {
            mH.y();
        } catch (IOException unused2) {
        } finally {
            this.f24316h = c2631d.i();
        }
    }
}
