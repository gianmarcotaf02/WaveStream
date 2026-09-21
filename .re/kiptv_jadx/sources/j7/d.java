package j7;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24274i;
    public j7.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j7.c f24275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j7.c f24276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j7.c f24277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j7.c f24278n;

    public static j7.d f() {
        j7.d dVar = new j7.d();
        dVar.j = j7.b.f24260n;
        j7.c cVar = j7.c.f24267n;
        dVar.f24275k = cVar;
        dVar.f24276l = cVar;
        dVar.f24277m = cVar;
        dVar.f24278n = cVar;
        return dVar;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        j7.e eVarE = e();
        eVarE.isInitialized();
        return eVarE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        j7.e eVar = null;
        try {
            try {
                j7.e.f24280r.getClass();
                g(new j7.e(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                j7.e eVar2 = (j7.e) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    eVar = eVar2;
                    if (eVar != null) {
                        g(eVar);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (eVar != null) {
                g(eVar);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        j7.d dVarF = f();
        dVarF.g(e());
        return dVarF;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        g((j7.e) oVar);
        return this;
    }

    public final j7.e e() {
        j7.e eVar = new j7.e(this);
        int i3 = this.f24274i;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        eVar.j = this.j;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        eVar.f24283k = this.f24275k;
        if ((i3 & 4) == 4) {
            i9 |= 4;
        }
        eVar.f24284l = this.f24276l;
        if ((i3 & 8) == 8) {
            i9 |= 8;
        }
        eVar.f24285m = this.f24277m;
        if ((i3 & 16) == 16) {
            i9 |= 16;
        }
        eVar.f24286n = this.f24278n;
        eVar.f24282i = i9;
        return eVar;
    }

    public final void g(j7.e eVar) {
        j7.c cVar;
        j7.c cVar2;
        j7.c cVar3;
        j7.c cVar4;
        j7.b bVar;
        if (eVar == j7.e.f24279q) {
            return;
        }
        if ((eVar.f24282i & 1) == 1) {
            j7.b bVar2 = eVar.j;
            if ((this.f24274i & 1) != 1 || (bVar = this.j) == j7.b.f24260n) {
                this.j = bVar2;
            } else {
                j7.a aVar = new j7.a(0);
                aVar.g(bVar);
                aVar.g(bVar2);
                this.j = aVar.e();
            }
            this.f24274i |= 1;
        }
        if ((eVar.f24282i & 2) == 2) {
            j7.c cVar5 = eVar.f24283k;
            if ((this.f24274i & 2) != 2 || (cVar4 = this.f24275k) == j7.c.f24267n) {
                this.f24275k = cVar5;
            } else {
                j7.a aVarH = j7.c.h(cVar4);
                aVarH.h(cVar5);
                this.f24275k = aVarH.f();
            }
            this.f24274i |= 2;
        }
        if ((eVar.f24282i & 4) == 4) {
            j7.c cVar6 = eVar.f24284l;
            if ((this.f24274i & 4) != 4 || (cVar3 = this.f24276l) == j7.c.f24267n) {
                this.f24276l = cVar6;
            } else {
                j7.a aVarH2 = j7.c.h(cVar3);
                aVarH2.h(cVar6);
                this.f24276l = aVarH2.f();
            }
            this.f24274i |= 4;
        }
        if ((eVar.f24282i & 8) == 8) {
            j7.c cVar7 = eVar.f24285m;
            if ((this.f24274i & 8) != 8 || (cVar2 = this.f24277m) == j7.c.f24267n) {
                this.f24277m = cVar7;
            } else {
                j7.a aVarH3 = j7.c.h(cVar2);
                aVarH3.h(cVar7);
                this.f24277m = aVarH3.f();
            }
            this.f24274i |= 8;
        }
        if ((eVar.f24282i & 16) == 16) {
            j7.c cVar8 = eVar.f24286n;
            if ((this.f24274i & 16) != 16 || (cVar = this.f24278n) == j7.c.f24267n) {
                this.f24278n = cVar8;
            } else {
                j7.a aVarH4 = j7.c.h(cVar);
                aVarH4.h(cVar8);
                this.f24278n = aVarH4.f();
            }
            this.f24274i |= 16;
        }
        this.f25492h = this.f25492h.e(eVar.f24281h);
    }
}
