package j7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2637j;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.o;
import p110m7.r;
import p110m7.v;

public final class g extends AbstractC2637j implements v {

    public int f24291i;
    public int j;

    public int f24292k;

    public Object f24293l;

    public h f24294m;

    public List f24295n;

    public List f24296o;

    public static g f() {
        g gVar = new g();
        gVar.j = 1;
        gVar.f24293l = "";
        gVar.f24294m = h.NONE;
        List list = Collections.EMPTY_LIST;
        gVar.f24295n = list;
        gVar.f24296o = list;
        return gVar;
    }

    @Override
    public final AbstractC2629b b() {
        i iVarE = e();
        iVarE.isInitialized();
        return iVarE;
    }

    @Override
    public final AbstractC2637j c(C2633f c2633f, C2635h c2635h) throws Throwable {
        i iVar = null;
        try {
            try {
                i.f24302u.getClass();
                g(new i(c2633f));
                return this;
            } catch (r e6) {
                i iVar2 = (i) e6.f25503h;
                try {
                    throw e6;
                } catch (Throwable th) {
                    th = th;
                    iVar = iVar2;
                    if (iVar != null) {
                        g(iVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (iVar != null) {
                g(iVar);
            }
            throw th;
        }
    }

    public final Object clone() {
        g gVarF = f();
        gVarF.g(e());
        return gVarF;
    }

    @Override
    public final AbstractC2637j d(o oVar) {
        g((i) oVar);
        return this;
    }

    public final i e() {
        i iVar = new i(this);
        int i3 = this.f24291i;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        iVar.j = this.j;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        iVar.f24305k = this.f24292k;
        if ((i3 & 4) == 4) {
            i9 |= 4;
        }
        iVar.f24306l = this.f24293l;
        if ((i3 & 8) == 8) {
            i9 |= 8;
        }
        iVar.f24307m = this.f24294m;
        if ((i3 & 16) == 16) {
            this.f24295n = Collections.unmodifiableList(this.f24295n);
            this.f24291i &= -17;
        }
        iVar.f24308n = this.f24295n;
        if ((this.f24291i & 32) == 32) {
            this.f24296o = Collections.unmodifiableList(this.f24296o);
            this.f24291i &= -33;
        }
        iVar.f24310p = this.f24296o;
        iVar.f24304i = i9;
        return iVar;
    }

    public final void g(i iVar) {
        if (iVar == i.f24301t) {
            return;
        }
        int i3 = iVar.f24304i;
        if ((i3 & 1) == 1) {
            int i9 = iVar.j;
            this.f24291i = 1 | this.f24291i;
            this.j = i9;
        }
        if ((i3 & 2) == 2) {
            int i10 = iVar.f24305k;
            this.f24291i = 2 | this.f24291i;
            this.f24292k = i10;
        }
        if ((i3 & 4) == 4) {
            this.f24291i |= 4;
            this.f24293l = iVar.f24306l;
        }
        if ((i3 & 8) == 8) {
            h hVar = iVar.f24307m;
            hVar.getClass();
            this.f24291i = 8 | this.f24291i;
            this.f24294m = hVar;
        }
        if (!iVar.f24308n.isEmpty()) {
            if (this.f24295n.isEmpty()) {
                this.f24295n = iVar.f24308n;
                this.f24291i &= -17;
            } else {
                if ((this.f24291i & 16) != 16) {
                    this.f24295n = new ArrayList(this.f24295n);
                    this.f24291i |= 16;
                }
                this.f24295n.addAll(iVar.f24308n);
            }
        }
        if (!iVar.f24310p.isEmpty()) {
            if (this.f24296o.isEmpty()) {
                this.f24296o = iVar.f24310p;
                this.f24291i &= -33;
            } else {
                if ((this.f24291i & 32) != 32) {
                    this.f24296o = new ArrayList(this.f24296o);
                    this.f24291i |= 32;
                }
                this.f24296o.addAll(iVar.f24310p);
            }
        }
        this.f25492h = this.f25492h.e(iVar.f24303h);
    }
}
