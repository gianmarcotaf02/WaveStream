package p163t;

/* JADX INFO: renamed from: t.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2750d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p163t.C2770n f27561a = new p163t.C2770n(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p163t.C2771o f27562b = new p163t.C2771o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p163t.C2772p f27563c = new p163t.C2772p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p163t.C2773q f27564d = new p163t.C2773q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p163t.C2770n f27565e = new p163t.C2770n(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p163t.C2771o f27566f = new p163t.C2771o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final p163t.C2772p g = new p163t.C2772p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p163t.C2773q f27567h = new p163t.C2773q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f27568i = new float[91];
    public static final p163t.E0 j = new p163t.E0(new q5.i(17), new p163t.F0(4));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p163t.E0 f27569k = new p163t.E0(new q5.i(18), new q5.i(19));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p163t.E0 f27570l = new p163t.E0(new q5.i(20), new q5.i(21));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p163t.E0 f27571m = new p163t.E0(new q5.i(22), new q5.i(23));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p163t.E0 f27572n = new p163t.E0(new q5.i(24), new q5.i(25));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p163t.E0 f27573o = new p163t.E0(new q5.i(26), new q5.i(27));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p163t.E0 f27574p = new p163t.E0(new q5.i(28), new q5.i(29));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p163t.E0 f27575q = new p163t.E0(new p163t.F0(0), new p163t.F0(1));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p163t.E0 f27576r = new p163t.E0(new p163t.F0(2), new p163t.F0(3));

    public static p163t.C2748c a(float f9) {
        return new p163t.C2748c(java.lang.Float.valueOf(f9), j, java.lang.Float.valueOf(0.01f), 8);
    }

    public static p163t.C2768m b(float f9, int i3) {
        if ((i3 & 2) != 0) {
            f9 = 0.0f;
        }
        return new p163t.C2768m(j, java.lang.Float.valueOf(0.0f), new p163t.C2770n(f9), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final java.lang.Object c(p163t.C2768m c2768m, p163t.InterfaceC2758h interfaceC2758h, long j9, final p194x6.j jVar, p117n6.c cVar) {
        p163t.n0 n0Var;
        final kotlin.jvm.internal.A a2;
        final p163t.C2768m c2768m2;
        p163t.C2768m c2768m3;
        kotlin.jvm.internal.A a9;
        java.lang.Object objA;
        p194x6.j jVar2;
        p163t.C2764k c2764k;
        p163t.C2764k c2764k2;
        java.lang.Object objA2;
        final p163t.InterfaceC2758h interfaceC2758h2 = interfaceC2758h;
        if (cVar instanceof p163t.n0) {
            n0Var = (p163t.n0) cVar;
            int i3 = n0Var.f27653m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n0Var.f27653m = i3 - Integer.MIN_VALUE;
            } else {
                n0Var = new p163t.n0(cVar);
            }
        } else {
            n0Var = new p163t.n0(cVar);
        }
        p163t.n0 n0Var2 = n0Var;
        java.lang.Object obj = n0Var2.f27652l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = n0Var2.f27653m;
        R0.C0861z0 c0861z0 = R0.C0861z0.f9034h;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            final java.lang.Object objF = interfaceC2758h2.f(0L);
            final p163t.r rVarD = interfaceC2758h2.d(0L);
            a2 = new kotlin.jvm.internal.A();
            if (j9 == Long.MIN_VALUE) {
                try {
                    final float fL = l(n0Var2.getContext());
                    c2768m2 = c2768m;
                    try {
                        p194x6.j jVar3 = new p194x6.j() { // from class: t.l0
                            @Override // p194x6.j
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                long jLongValue = ((java.lang.Long) obj2).longValue();
                                p163t.InterfaceC2758h interfaceC2758h3 = interfaceC2758h2;
                                p163t.E0 e0C = interfaceC2758h3.c();
                                java.lang.Object objG = interfaceC2758h3.g();
                                p163t.C2768m c2768m4 = c2768m2;
                                p163t.C2764k c2764k3 = new p163t.C2764k(objF, e0C, rVarD, jLongValue, objG, jLongValue, new U.M(2, c2768m4));
                                p163t.AbstractC2750d.k(c2764k3, jLongValue, fL, interfaceC2758h3, c2768m4, jVar);
                                a2.f24539h = c2764k3;
                                return p070h6.A.f22523a;
                            }
                        };
                        a9 = a2;
                        try {
                            n0Var2.f27649h = c2768m2;
                            n0Var2.f27650i = interfaceC2758h2;
                            n0Var2.j = jVar;
                            n0Var2.f27651k = a9;
                            n0Var2.f27653m = 1;
                            if (!interfaceC2758h2.a()) {
                                objA = p020c0.AbstractC1703s.v(n0Var2.getContext()).a(new H5.O(16, jVar3), n0Var2);
                            } else {
                                if (n0Var2.getContext().get(c0861z0) != null) {
                                    throw new java.lang.ClassCastException();
                                }
                                objA = p020c0.AbstractC1703s.v(n0Var2.getContext()).a(jVar3, n0Var2);
                            }
                            if (objA != aVar) {
                                c2768m3 = c2768m2;
                                jVar2 = jVar;
                                a2 = a9;
                            }
                            return aVar;
                        } catch (java.util.concurrent.CancellationException e6) {
                            e = e6;
                            c2768m3 = c2768m2;
                            a2 = a9;
                            c2764k = (p163t.C2764k) a2.f24539h;
                            if (c2764k != null) {
                                c2764k.f27630i.setValue(java.lang.Boolean.FALSE);
                            }
                            c2764k2 = (p163t.C2764k) a2.f24539h;
                            if (c2764k2 != null) {
                                c2768m3.f27643m = false;
                            }
                            throw e;
                        }
                    } catch (java.util.concurrent.CancellationException e9) {
                        e = e9;
                        c2768m3 = c2768m2;
                        c2764k = (p163t.C2764k) a2.f24539h;
                        if (c2764k != null) {
                            c2764k.f27630i.setValue(java.lang.Boolean.FALSE);
                        }
                        c2764k2 = (p163t.C2764k) a2.f24539h;
                        if (c2764k2 != null) {
                            c2768m3.f27643m = false;
                        }
                        throw e;
                    }
                } catch (java.util.concurrent.CancellationException e10) {
                    e = e10;
                    c2768m2 = c2768m;
                }
            } else {
                a9 = a2;
                try {
                    p163t.C2764k c2764k3 = new p163t.C2764k(objF, interfaceC2758h2.c(), rVarD, j9, interfaceC2758h2.g(), j9, new U.M(1, c2768m));
                    k(c2764k3, j9, l(n0Var2.getContext()), interfaceC2758h2, c2768m, jVar);
                    a9.f24539h = c2764k3;
                    c2768m3 = c2768m;
                    interfaceC2758h2 = interfaceC2758h;
                    jVar2 = jVar;
                    a2 = a9;
                } catch (java.util.concurrent.CancellationException e11) {
                    e = e11;
                    c2768m3 = c2768m;
                    a2 = a9;
                    c2764k = (p163t.C2764k) a2.f24539h;
                    if (c2764k != null) {
                        c2764k.f27630i.setValue(java.lang.Boolean.FALSE);
                    }
                    c2764k2 = (p163t.C2764k) a2.f24539h;
                    if (c2764k2 != null && c2764k2.g == c2768m3.f27641k) {
                        c2768m3.f27643m = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i9 != 1 && i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = n0Var2.f27651k;
            jVar2 = n0Var2.j;
            interfaceC2758h2 = n0Var2.f27650i;
            c2768m3 = n0Var2.f27649h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (java.util.concurrent.CancellationException e12) {
                e = e12;
                c2764k = (p163t.C2764k) a2.f24539h;
                if (c2764k != null) {
                    c2764k.f27630i.setValue(java.lang.Boolean.FALSE);
                }
                c2764k2 = (p163t.C2764k) a2.f24539h;
                if (c2764k2 != null) {
                    c2768m3.f27643m = false;
                }
                throw e;
            }
        }
        do {
            java.lang.Object obj2 = a2.f24539h;
            kotlin.jvm.internal.m.b(obj2);
            if (!((java.lang.Boolean) ((p163t.C2764k) obj2).f27630i.getValue()).booleanValue()) {
                return p070h6.A.f22523a;
            }
            final float fL2 = l(n0Var2.getContext());
            final kotlin.jvm.internal.A a10 = a2;
            final p194x6.j jVar4 = jVar2;
            final p163t.InterfaceC2758h interfaceC2758h3 = interfaceC2758h2;
            final p163t.C2768m c2768m4 = c2768m3;
            try {
                p194x6.j jVar5 = new p194x6.j() { // from class: t.m0
                    @Override // p194x6.j
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        long jLongValue = ((java.lang.Long) obj3).longValue();
                        java.lang.Object obj4 = a10.f24539h;
                        kotlin.jvm.internal.m.b(obj4);
                        p163t.AbstractC2750d.k((p163t.C2764k) obj4, jLongValue, fL2, interfaceC2758h3, c2768m4, jVar4);
                        return p070h6.A.f22523a;
                    }
                };
                a2 = a10;
                interfaceC2758h2 = interfaceC2758h3;
                c2768m3 = c2768m4;
                jVar2 = jVar4;
                n0Var2.f27649h = c2768m3;
                n0Var2.f27650i = interfaceC2758h2;
                n0Var2.j = jVar2;
                n0Var2.f27651k = a2;
                n0Var2.f27653m = 2;
                if (!interfaceC2758h2.a()) {
                    objA2 = p020c0.AbstractC1703s.v(n0Var2.getContext()).a(new H5.O(16, jVar5), n0Var2);
                } else {
                    if (n0Var2.getContext().get(c0861z0) != null) {
                        throw new java.lang.ClassCastException();
                    }
                    objA2 = p020c0.AbstractC1703s.v(n0Var2.getContext()).a(jVar5, n0Var2);
                }
            } catch (java.util.concurrent.CancellationException e13) {
                e = e13;
                a2 = a10;
                c2768m3 = c2768m4;
                c2764k = (p163t.C2764k) a2.f24539h;
                if (c2764k != null) {
                    c2764k.f27630i.setValue(java.lang.Boolean.FALSE);
                }
                c2764k2 = (p163t.C2764k) a2.f24539h;
                if (c2764k2 != null) {
                    c2768m3.f27643m = false;
                }
                throw e;
            }
        } while (objA2 != aVar);
        return aVar;
    }

    public static java.lang.Object d(float f9, float f10, p163t.A a2, p194x6.m mVar, p117n6.i iVar, int i3) {
        if ((i3 & 8) != 0) {
            a2 = o(0.0f, 0.0f, null, 7);
        }
        p163t.A a9 = a2;
        p163t.E0 e6 = j;
        java.lang.Float f11 = new java.lang.Float(f9);
        java.lang.Float f12 = new java.lang.Float(f10);
        java.lang.Float f13 = new java.lang.Float(0.0f);
        p194x6.j jVar = e6.f27453a;
        p163t.r rVarC = (p163t.r) jVar.invoke(f13);
        if (rVarC == null) {
            rVarC = ((p163t.r) jVar.invoke(f11)).c();
        }
        p163t.r rVar = rVarC;
        java.lang.Object objC = c(new p163t.C2768m(e6, f11, rVar, 56), new p163t.o0(a9, e6, f11, f12, rVar), Long.MIN_VALUE, new io.ktor.client.plugins.logging.a(2, mVar), iVar);
        p109m6.a aVar = p109m6.a.f25430h;
        p070h6.A a10 = p070h6.A.f22523a;
        if (objC != aVar) {
            objC = a10;
        }
        return objC == aVar ? objC : a10;
    }

    public static final p163t.F e(p163t.I i3, float f9, float f10, p163t.E e6, java.lang.String str, p020c0.C1700q c1700q, int i9, int i10) {
        if ((i10 & 8) != 0) {
            str = "FloatAnimation";
        }
        return h(i3, java.lang.Float.valueOf(f9), java.lang.Float.valueOf(f10), j, e6, str, c1700q, (i9 & androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | 32768 | ((i9 << 3) & 458752), 0);
    }

    public static final java.lang.Object f(p163t.C2768m c2768m, java.lang.Float f9, p163t.InterfaceC2766l interfaceC2766l, boolean z6, p194x6.j jVar, p117n6.c cVar) {
        java.lang.Object objC = c(c2768m, new p163t.o0(interfaceC2766l, c2768m.f27639h, c2768m.f27640i.getValue(), f9, c2768m.j), z6 ? c2768m.f27641k : Long.MIN_VALUE, jVar, cVar);
        return objC == p109m6.a.f25430h ? objC : p070h6.A.f22523a;
    }

    public static /* synthetic */ java.lang.Object g(p163t.C2768m c2768m, java.lang.Float f9, p163t.C2761i0 c2761i0, boolean z6, p194x6.j jVar, p117n6.c cVar, int i3) {
        if ((i3 & 2) != 0) {
            c2761i0 = o(0.0f, 0.0f, null, 7);
        }
        p163t.C2761i0 c2761i1 = c2761i0;
        if ((i3 & 8) != 0) {
            jVar = new q5.i(14);
        }
        return f(c2768m, f9, c2761i1, z6, jVar, cVar);
    }

    public static final p163t.F h(p163t.I i3, java.lang.Number number, java.lang.Number number2, p163t.E0 e6, p163t.E e9, java.lang.String str, p020c0.C1700q c1700q, int i9, int i10) {
        p163t.I i11;
        java.lang.Number number3;
        java.lang.Object objQ = c1700q.Q();
        p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
        if (objQ == c1676e) {
            i11 = i3;
            p163t.F f9 = new p163t.F(i11, number, number2, e6, e9);
            number3 = number2;
            c1700q.n0(f9);
            objQ = f9;
        } else {
            i11 = i3;
            number3 = number2;
        }
        p163t.F f10 = (p163t.F) objQ;
        boolean z6 = true;
        boolean z9 = (((i9 & 112) ^ 48) > 32 && c1700q.h(number)) || (i9 & 48) == 32;
        if ((((57344 & i9) ^ 24576) <= 16384 || !c1700q.h(e9)) && (i9 & 24576) != 16384) {
            z6 = false;
        }
        boolean z10 = z9 | z6;
        java.lang.Object objQ2 = c1700q.Q();
        if (z10 || objQ2 == c1676e) {
            A5.d dVar = new A5.d(number, f10, number3, e9, 6);
            c1700q.n0(dVar);
            objQ2 = dVar;
        }
        p020c0.AbstractC1703s.i((kotlin.jvm.functions.Function0) objQ2, c1700q);
        boolean zH = c1700q.h(i11);
        java.lang.Object objQ3 = c1700q.Q();
        if (zH || objQ3 == c1676e) {
            objQ3 = new p028c8.b(i11, f10, 18);
            c1700q.n0(objQ3);
        }
        p020c0.AbstractC1703s.d(f10, (p194x6.j) objQ3, c1700q);
        return f10;
    }

    public static final p163t.r i(p163t.r rVar) {
        p163t.r rVarC = rVar.c();
        int iB = rVarC.b();
        for (int i3 = 0; i3 < iB; i3++) {
            rVarC.e(rVar.a(i3), i3);
        }
        return rVarC;
    }

    public static p163t.C2768m j(p163t.C2768m c2768m, float f9) {
        float f10 = ((p163t.C2770n) c2768m.j).f27648a;
        return new p163t.C2768m(c2768m.f27639h, java.lang.Float.valueOf(f9), new p163t.C2770n(f10), c2768m.f27641k, c2768m.f27642l, c2768m.f27643m);
    }

    public static final void k(p163t.C2764k c2764k, long j9, float f9, p163t.InterfaceC2758h interfaceC2758h, p163t.C2768m c2768m, p194x6.j jVar) {
        long jB = f9 == 0.0f ? interfaceC2758h.b() : (long) ((j9 - c2764k.f27625c) / f9);
        c2764k.g = j9;
        c2764k.f27627e.setValue(interfaceC2758h.f(jB));
        c2764k.f27628f = interfaceC2758h.d(jB);
        if (interfaceC2758h.e(jB)) {
            c2764k.f27629h = c2764k.g;
            c2764k.f27630i.setValue(java.lang.Boolean.FALSE);
        }
        q(c2764k, c2768m);
        jVar.invoke(c2764k);
    }

    public static final float l(p100l6.h hVar) {
        p137q0.q qVar = (p137q0.q) hVar.get(p137q0.c.f26463w);
        float fU = qVar != null ? qVar.u() : 1.0f;
        if (fU >= 0.0f) {
            return fU;
        }
        p163t.S.b("negative scale factor");
        return fU;
    }

    public static p163t.E m(p163t.InterfaceC2779x interfaceC2779x, p163t.T t9, int i3) {
        if ((i3 & 2) != 0) {
            t9 = p163t.T.f27506h;
        }
        return new p163t.E(interfaceC2779x, t9, 0);
    }

    public static final p163t.I n(java.lang.String str, p020c0.C1700q c1700q, int i3) {
        java.lang.Object objQ = c1700q.Q();
        if (objQ == p020c0.C1690l.f18284a) {
            objQ = new p163t.I();
            c1700q.n0(objQ);
        }
        p163t.I i9 = (p163t.I) objQ;
        i9.a(0, c1700q);
        return i9;
    }

    public static p163t.C2761i0 o(float f9, float f10, java.lang.Object obj, int i3) {
        if ((i3 & 1) != 0) {
            f9 = 1.0f;
        }
        if ((i3 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i3 & 4) != 0) {
            obj = null;
        }
        return new p163t.C2761i0(f9, f10, obj);
    }

    public static p163t.D0 p(int i3, int i9, p163t.InterfaceC2780y interfaceC2780y, int i10) {
        if ((i10 & 1) != 0) {
            i3 = com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.UNSUCCESSFUL;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            interfaceC2780y = p163t.AbstractC2781z.f27737a;
        }
        return new p163t.D0(i3, i9, interfaceC2780y);
    }

    public static final void q(p163t.C2764k c2764k, p163t.C2768m c2768m) {
        c2768m.f27640i.setValue(c2764k.f27627e.getValue());
        p163t.r rVar = c2768m.j;
        p163t.r rVar2 = c2764k.f27628f;
        int iB = rVar.b();
        for (int i3 = 0; i3 < iB; i3++) {
            rVar.e(rVar2.a(i3), i3);
        }
        c2768m.f27642l = c2764k.f27629h;
        c2768m.f27641k = c2764k.g;
        c2768m.f27643m = ((java.lang.Boolean) c2764k.f27630i.getValue()).booleanValue();
    }
}
