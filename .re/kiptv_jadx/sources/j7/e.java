package j7;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends p110m7.o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j7.e f24279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p062g7.C2154a f24280r = new p062g7.C2154a(26);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f24281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24282i;
    public j7.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j7.c f24283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j7.c f24284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j7.c f24285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j7.c f24286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f24287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24288p;

    static {
        j7.e eVar = new j7.e();
        f24279q = eVar;
        eVar.j = j7.b.f24260n;
        j7.c cVar = j7.c.f24267n;
        eVar.f24283k = cVar;
        eVar.f24284l = cVar;
        eVar.f24285m = cVar;
        eVar.f24286n = cVar;
    }

    public e() {
        this.f24287o = (byte) -1;
        this.f24288p = -1;
        this.f24281h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f24288p;
        if (i3 != -1) {
            return i3;
        }
        int iO = (this.f24282i & 1) == 1 ? Z2.M.o(1, this.j) : 0;
        if ((this.f24282i & 2) == 2) {
            iO += Z2.M.o(2, this.f24283k);
        }
        if ((this.f24282i & 4) == 4) {
            iO += Z2.M.o(3, this.f24284l);
        }
        if ((this.f24282i & 8) == 8) {
            iO += Z2.M.o(4, this.f24285m);
        }
        if ((this.f24282i & 16) == 16) {
            iO += Z2.M.o(5, this.f24286n);
        }
        int size = this.f24281h.size() + iO;
        this.f24288p = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return j7.d.f();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        j7.d dVarF = j7.d.f();
        dVarF.g(this);
        return dVarF;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f24282i & 1) == 1) {
            m8.b0(1, this.j);
        }
        if ((this.f24282i & 2) == 2) {
            m8.b0(2, this.f24283k);
        }
        if ((this.f24282i & 4) == 4) {
            m8.b0(3, this.f24284l);
        }
        if ((this.f24282i & 8) == 8) {
            m8.b0(4, this.f24285m);
        }
        if ((this.f24282i & 16) == 16) {
            m8.b0(5, this.f24286n);
        }
        m8.e0(this.f24281h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        if (this.f24287o == 1) {
            return true;
        }
        this.f24287o = (byte) 1;
        return true;
    }

    public e(j7.d dVar) {
        this.f24287o = (byte) -1;
        this.f24288p = -1;
        this.f24281h = dVar.f25492h;
    }

    public e(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f24287o = (byte) -1;
        this.f24288p = -1;
        this.j = j7.b.f24260n;
        j7.c cVar = j7.c.f24267n;
        this.f24283k = cVar;
        this.f24284l = cVar;
        this.f24285m = cVar;
        this.f24286n = cVar;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        boolean z6 = false;
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        j7.a aVarH = null;
                        if (iN == 10) {
                            if ((this.f24282i & 1) == 1) {
                                j7.b bVar = this.j;
                                bVar.getClass();
                                aVarH = new j7.a(0);
                                aVarH.g(bVar);
                            }
                            j7.b bVar2 = (j7.b) c2633f.g(j7.b.f24261o, c2635h);
                            this.j = bVar2;
                            if (aVarH != null) {
                                aVarH.g(bVar2);
                                this.j = aVarH.e();
                            }
                            this.f24282i |= 1;
                        } else if (iN == 18) {
                            if ((this.f24282i & 2) == 2) {
                                j7.c cVar2 = this.f24283k;
                                cVar2.getClass();
                                aVarH = j7.c.h(cVar2);
                            }
                            j7.c cVar3 = (j7.c) c2633f.g(j7.c.f24268o, c2635h);
                            this.f24283k = cVar3;
                            if (aVarH != null) {
                                aVarH.h(cVar3);
                                this.f24283k = aVarH.f();
                            }
                            this.f24282i |= 2;
                        } else if (iN == 26) {
                            if ((this.f24282i & 4) == 4) {
                                j7.c cVar4 = this.f24284l;
                                cVar4.getClass();
                                aVarH = j7.c.h(cVar4);
                            }
                            j7.c cVar5 = (j7.c) c2633f.g(j7.c.f24268o, c2635h);
                            this.f24284l = cVar5;
                            if (aVarH != null) {
                                aVarH.h(cVar5);
                                this.f24284l = aVarH.f();
                            }
                            this.f24282i |= 4;
                        } else if (iN == 34) {
                            if ((this.f24282i & 8) == 8) {
                                j7.c cVar6 = this.f24285m;
                                cVar6.getClass();
                                aVarH = j7.c.h(cVar6);
                            }
                            j7.c cVar7 = (j7.c) c2633f.g(j7.c.f24268o, c2635h);
                            this.f24285m = cVar7;
                            if (aVarH != null) {
                                aVarH.h(cVar7);
                                this.f24285m = aVarH.f();
                            }
                            this.f24282i |= 8;
                        } else if (iN != 42) {
                            if (!c2633f.q(iN, mH)) {
                            }
                        } else {
                            if ((this.f24282i & 16) == 16) {
                                j7.c cVar8 = this.f24286n;
                                cVar8.getClass();
                                aVarH = j7.c.h(cVar8);
                            }
                            j7.c cVar9 = (j7.c) c2633f.g(j7.c.f24268o, c2635h);
                            this.f24286n = cVar9;
                            if (aVarH != null) {
                                aVarH.h(cVar9);
                                this.f24286n = aVarH.f();
                            }
                            this.f24282i |= 16;
                        }
                    }
                    z6 = true;
                } catch (p110m7.r e6) {
                    e6.f25503h = this;
                    throw e6;
                } catch (java.io.IOException e9) {
                    p110m7.r rVar = new p110m7.r(e9.getMessage());
                    rVar.f25503h = this;
                    throw rVar;
                }
            } catch (java.lang.Throwable th) {
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f24281h = c2631d.i();
                }
                throw th;
            }
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f24281h = c2631d.i();
        }
    }
}
