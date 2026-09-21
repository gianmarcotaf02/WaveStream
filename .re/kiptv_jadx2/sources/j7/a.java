package j7;

import p110m7.AbstractC2629b;
import p110m7.AbstractC2637j;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.o;
import p110m7.r;
import p110m7.v;

public final class a extends AbstractC2637j implements v {

    public final int f24257i;
    public int j;

    public int f24258k;

    public int f24259l;

    public a(int i3) {
        this.f24257i = i3;
    }

    @Override
    public final AbstractC2629b b() {
        switch (this.f24257i) {
            case 0:
                b bVarE = e();
                bVarE.isInitialized();
                return bVarE;
            default:
                c cVarF = f();
                cVarF.isInitialized();
                return cVarF;
        }
    }

    @Override
    public final AbstractC2637j c(C2633f c2633f, C2635h c2635h) throws Throwable {
        switch (this.f24257i) {
            case 0:
                b bVar = null;
                try {
                    try {
                        b.f24261o.getClass();
                        g(new b(c2633f));
                        return this;
                    } catch (r e6) {
                        b bVar2 = (b) e6.f25503h;
                        try {
                            throw e6;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar2;
                            if (bVar != null) {
                                g(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        g(bVar);
                    }
                    throw th;
                }
            default:
                c cVar = null;
                try {
                    try {
                        c.f24268o.getClass();
                        h(new c(c2633f));
                        return this;
                    } catch (r e9) {
                        c cVar2 = (c) e9.f25503h;
                        try {
                            throw e9;
                        } catch (Throwable th3) {
                            th = th3;
                            cVar = cVar2;
                            if (cVar != null) {
                                h(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (cVar != null) {
                        h(cVar);
                    }
                    throw th;
                }
        }
    }

    public final Object clone() {
        switch (this.f24257i) {
            case 0:
                a aVar = new a(0);
                aVar.g(e());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.h(f());
                return aVar2;
        }
    }

    @Override
    public final AbstractC2637j d(o oVar) {
        switch (this.f24257i) {
            case 0:
                g((b) oVar);
                break;
            default:
                h((c) oVar);
                break;
        }
        return this;
    }

    public b e() {
        b bVar = new b(this);
        int i3 = this.j;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        bVar.j = this.f24258k;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        bVar.f24264k = this.f24259l;
        bVar.f24263i = i9;
        return bVar;
    }

    public c f() {
        c cVar = new c(this);
        int i3 = this.j;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        cVar.j = this.f24258k;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        cVar.f24271k = this.f24259l;
        cVar.f24270i = i9;
        return cVar;
    }

    public void g(b bVar) {
        if (bVar == b.f24260n) {
            return;
        }
        int i3 = bVar.f24263i;
        if ((i3 & 1) == 1) {
            int i9 = bVar.j;
            this.j = 1 | this.j;
            this.f24258k = i9;
        }
        if ((i3 & 2) == 2) {
            int i10 = bVar.f24264k;
            this.j = 2 | this.j;
            this.f24259l = i10;
        }
        this.f25492h = this.f25492h.e(bVar.f24262h);
    }

    public void h(c cVar) {
        if (cVar == c.f24267n) {
            return;
        }
        int i3 = cVar.f24270i;
        if ((i3 & 1) == 1) {
            int i9 = cVar.j;
            this.j = 1 | this.j;
            this.f24258k = i9;
        }
        if ((i3 & 2) == 2) {
            int i10 = cVar.f24271k;
            this.j = 2 | this.j;
            this.f24259l = i10;
        }
        this.f25492h = this.f25492h.e(cVar.f24269h);
    }
}
