package j7;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24257i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24259l;

    public /* synthetic */ a(int i3) {
        this.f24257i = i3;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        switch (this.f24257i) {
            case 0:
                j7.b bVarE = e();
                bVarE.isInitialized();
                return bVarE;
            default:
                j7.c cVarF = f();
                cVarF.isInitialized();
                return cVarF;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        switch (this.f24257i) {
            case 0:
                j7.b bVar = null;
                try {
                    try {
                        j7.b.f24261o.getClass();
                        g(new j7.b(c2633f));
                        return this;
                    } catch (p110m7.r e6) {
                        j7.b bVar2 = (j7.b) e6.f25503h;
                        try {
                            throw e6;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            bVar = bVar2;
                            if (bVar != null) {
                                g(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        g(bVar);
                    }
                    throw th;
                }
            default:
                j7.c cVar = null;
                try {
                    try {
                        j7.c.f24268o.getClass();
                        h(new j7.c(c2633f));
                        return this;
                    } catch (p110m7.r e9) {
                        j7.c cVar2 = (j7.c) e9.f25503h;
                        try {
                            throw e9;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            cVar = cVar2;
                            if (cVar != null) {
                                h(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    if (cVar != null) {
                        h(cVar);
                    }
                    throw th;
                }
        }
    }

    public final java.lang.Object clone() {
        switch (this.f24257i) {
            case 0:
                j7.a aVar = new j7.a(0);
                aVar.g(e());
                return aVar;
            default:
                j7.a aVar2 = new j7.a(1);
                aVar2.h(f());
                return aVar2;
        }
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        switch (this.f24257i) {
            case 0:
                g((j7.b) oVar);
                break;
            default:
                h((j7.c) oVar);
                break;
        }
        return this;
    }

    public j7.b e() {
        j7.b bVar = new j7.b(this);
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

    public j7.c f() {
        j7.c cVar = new j7.c(this);
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

    public void g(j7.b bVar) {
        if (bVar == j7.b.f24260n) {
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

    public void h(j7.c cVar) {
        if (cVar == j7.c.f24267n) {
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
