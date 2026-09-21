package j7;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24291i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f24293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j7.h f24294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.List f24295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.List f24296o;

    public static j7.g f() {
        j7.g gVar = new j7.g();
        gVar.j = 1;
        gVar.f24293l = "";
        gVar.f24294m = j7.h.NONE;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        gVar.f24295n = list;
        gVar.f24296o = list;
        return gVar;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        j7.i iVarE = e();
        iVarE.isInitialized();
        return iVarE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        j7.i iVar = null;
        try {
            try {
                j7.i.f24302u.getClass();
                g(new j7.i(c2633f));
                return this;
            } catch (p110m7.r e6) {
                j7.i iVar2 = (j7.i) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    iVar = iVar2;
                    if (iVar != null) {
                        g(iVar);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (iVar != null) {
                g(iVar);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        j7.g gVarF = f();
        gVarF.g(e());
        return gVarF;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        g((j7.i) oVar);
        return this;
    }

    public final j7.i e() {
        j7.i iVar = new j7.i(this);
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
            this.f24295n = java.util.Collections.unmodifiableList(this.f24295n);
            this.f24291i &= -17;
        }
        iVar.f24308n = this.f24295n;
        if ((this.f24291i & 32) == 32) {
            this.f24296o = java.util.Collections.unmodifiableList(this.f24296o);
            this.f24291i &= -33;
        }
        iVar.f24310p = this.f24296o;
        iVar.f24304i = i9;
        return iVar;
    }

    public final void g(j7.i iVar) {
        if (iVar == j7.i.f24301t) {
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
            j7.h hVar = iVar.f24307m;
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
                    this.f24295n = new java.util.ArrayList(this.f24295n);
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
                    this.f24296o = new java.util.ArrayList(this.f24296o);
                    this.f24291i |= 32;
                }
                this.f24296o.addAll(iVar.f24310p);
            }
        }
        this.f25492h = this.f25492h.e(iVar.f24303h);
    }
}
