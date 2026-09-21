package I5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI5/D0;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class D0 extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.x9 f4694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1451x5 f4695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.repository.b f4696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1263e6 f4697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a5.i9 f4698f;
    public final p005a5.D0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p005a5.B3 f4699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p005a5.C1291h4 f4700i;
    public final p005a5.C1379q2 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.kiptv.core.repository.a f4701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p005a5.J3 f4702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p005a5.C1366p f4703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E2.d f4704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p005a5.I6 f4705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.Integer f4707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V7.n0 f4708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final V7.W f4709s;

    public D0(androidx.lifecycle.U savedStateHandle, p005a5.x9 xtreamRepository, p005a5.C1451x5 tmdbRepository, com.kiptv.core.repository.b traktRatingsRepository, p005a5.C1263e6 traktAccountRepository, p005a5.i9 watchProgressRepository, p005a5.D0 myListRepository, p005a5.B3 searchRepository, p005a5.C1291h4 settingsRepository, p005a5.C1379q2 purchaseRepository, p132p5.a appConfig, com.kiptv.core.repository.a newContentRepository, p005a5.J3 seriesMetadataRepository, p005a5.C1366p contentCacheRepository, E2.d dVar, p005a5.I6 traktRatingPrompter) {
        kotlin.jvm.internal.m.e(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.m.e(xtreamRepository, "xtreamRepository");
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(traktRatingsRepository, "traktRatingsRepository");
        kotlin.jvm.internal.m.e(traktAccountRepository, "traktAccountRepository");
        kotlin.jvm.internal.m.e(watchProgressRepository, "watchProgressRepository");
        kotlin.jvm.internal.m.e(myListRepository, "myListRepository");
        kotlin.jvm.internal.m.e(searchRepository, "searchRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(purchaseRepository, "purchaseRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        kotlin.jvm.internal.m.e(newContentRepository, "newContentRepository");
        kotlin.jvm.internal.m.e(seriesMetadataRepository, "seriesMetadataRepository");
        kotlin.jvm.internal.m.e(contentCacheRepository, "contentCacheRepository");
        kotlin.jvm.internal.m.e(traktRatingPrompter, "traktRatingPrompter");
        this.f4694b = xtreamRepository;
        this.f4695c = tmdbRepository;
        this.f4696d = traktRatingsRepository;
        this.f4697e = traktAccountRepository;
        this.f4698f = watchProgressRepository;
        this.g = myListRepository;
        this.f4699h = searchRepository;
        this.f4700i = settingsRepository;
        this.j = purchaseRepository;
        this.f4701k = newContentRepository;
        this.f4702l = seriesMetadataRepository;
        this.f4703m = contentCacheRepository;
        this.f4704n = dVar;
        this.f4705o = traktRatingPrompter;
        java.lang.Integer num = (java.lang.Integer) savedStateHandle.a("seriesId");
        int iIntValue = num != null ? num.intValue() : 0;
        this.f4706p = iIntValue;
        java.lang.Integer numValueOf = iIntValue < 0 ? java.lang.Integer.valueOf(iIntValue) : null;
        this.f4707q = numValueOf != null ? java.lang.Integer.valueOf(-numValueOf.intValue()) : null;
        p078i6.w wVar = p078i6.w.f23205h;
        p078i6.x xVar = p078i6.x.f23206h;
        V7.n0 n0VarB = V7.r.b(new I5.S(true, iIntValue, null, null, null, wVar, wVar, wVar, wVar, wVar, 1, xVar, xVar, xVar, null, false, "https://image.tmdb.org/t/p", wVar, null));
        this.f4708r = n0VarB;
        this.f4709s = new V7.W(n0VarB);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.X(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0473j0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0481l0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0485m0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0489n0(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final java.lang.Object e(I5.D0 d4, int i3, int i9, p117n6.c cVar) {
        I5.C0437a0 c0437a0;
        java.lang.Object value;
        I5.S s9;
        java.util.LinkedHashMap linkedHashMapZ0;
        I5.D0 d6 = d4;
        int i10 = i9;
        d6.getClass();
        if (cVar instanceof I5.C0437a0) {
            c0437a0 = (I5.C0437a0) cVar;
            int i11 = c0437a0.f5029l;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0437a0.f5029l = i11 - Integer.MIN_VALUE;
            } else {
                c0437a0 = new I5.C0437a0(d6, cVar);
            }
        } else {
            c0437a0 = new I5.C0437a0(d6, cVar);
        }
        java.lang.Object objD = c0437a0.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i12 = c0437a0.f5029l;
        if (i12 == 0) {
            com.google.common.util.concurrent.P.u0(objD);
            java.lang.Integer num = new java.lang.Integer(i3);
            c0437a0.f5026h = d6;
            c0437a0.f5027i = i10;
            c0437a0.f5029l = 1;
            objD = d6.f4702l.d(num, i10, c0437a0);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = c0437a0.f5027i;
            I5.D0 d9 = c0437a0.f5026h;
            com.google.common.util.concurrent.P.u0(objD);
            i10 = i13;
            d6 = d9;
        }
        java.util.List list = (java.util.List) objD;
        V7.n0 n0Var = d6.f4708r;
        do {
            value = n0Var.getValue();
            s9 = (I5.S) value;
            linkedHashMapZ0 = p078i6.C.Z0(s9.f4924n);
            java.lang.Integer num2 = new java.lang.Integer(i10);
            int iI0 = p078i6.D.I0(p078i6.q.I0(list, 10));
            if (iI0 < 16) {
                iI0 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
            for (java.lang.Object obj : list) {
                linkedHashMap.put(new java.lang.Integer(((S4.C0875n) obj).f9417a), obj);
            }
            linkedHashMapZ0.put(num2, linkedHashMap);
        } while (!n0Var.g(value, I5.S.a(s9, null, null, null, null, null, null, null, null, 0, null, null, linkedHashMapZ0, null, false, null, null, 516095)));
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object f(I5.D0 d4, int i3, p117n6.c cVar) {
        I5.C0441b0 c0441b0;
        d4.getClass();
        if (cVar instanceof I5.C0441b0) {
            c0441b0 = (I5.C0441b0) cVar;
            int i9 = c0441b0.j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0441b0.j = i9 - Integer.MIN_VALUE;
            } else {
                c0441b0 = new I5.C0441b0(d4, cVar);
            }
        } else {
            c0441b0 = new I5.C0441b0(d4, cVar);
        }
        java.lang.Object obj = c0441b0.f5037h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c0441b0.j;
        try {
            if (i10 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                I5.C0461g0 c0461g0 = new I5.C0461g0(d4, i3, null);
                c0441b0.j = 1;
                if (S7.C.m(c0461g0, c0441b0) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
        } catch (java.lang.Exception unused) {
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final java.lang.Object g(I5.D0 d4, p100l6.c cVar) {
        I5.C0497p0 c0497p0;
        boolean z6;
        boolean z9;
        ?? r9;
        I5.D0 d6 = d4;
        d6.getClass();
        if (cVar instanceof I5.C0497p0) {
            c0497p0 = (I5.C0497p0) cVar;
            int i3 = c0497p0.f5313k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0497p0.f5313k = i3 - Integer.MIN_VALUE;
            } else {
                c0497p0 = new I5.C0497p0(d6, cVar);
            }
        } else {
            c0497p0 = new I5.C0497p0(d6, cVar);
        }
        java.lang.Object objO = c0497p0.f5312i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0497p0.f5313k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objO);
            java.lang.String strValueOf = java.lang.String.valueOf(d6.f4706p);
            c0497p0.f5311h = d6;
            c0497p0.f5313k = 1;
            objO = d6.f4698f.o(strValueOf, c0497p0);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6 = c0497p0.f5311h;
            com.google.common.util.concurrent.P.u0(objO);
        }
        java.util.List list = (java.util.List) objO;
        int iI0 = p078i6.D.I0(p078i6.q.I0(list, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
        java.util.Iterator it = list.iterator();
        while (true) {
            z6 = false;
            int iIntValue = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.kiptv.core.model.WatchProgress watchProgress = (com.kiptv.core.model.WatchProgress) next;
            java.lang.Integer num = watchProgress.f20616h;
            int iIntValue2 = num != null ? num.intValue() : 0;
            java.lang.Integer num2 = watchProgress.f20617i;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            linkedHashMap.put(iIntValue2 + "-" + iIntValue, next);
        }
        V7.n0 n0Var = d6.f4708r;
        while (true) {
            java.lang.Object value = n0Var.getValue();
            z9 = z6;
            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
            if (n0Var.g(value, I5.S.a((I5.S) value, null, null, null, null, null, null, null, null, 0, null, linkedHashMap2, null, null, false, null, null, 520191))) {
                break;
            }
            z6 = z9;
            linkedHashMap = linkedHashMap2;
        }
        java.util.Iterator it2 = ((I5.S) d6.f4708r.getValue()).f4922l.values().iterator();
        ?? size = z9;
        while (it2.hasNext()) {
            size += ((java.util.List) it2.next()).size();
        }
        if (size > 0) {
            if (list.isEmpty()) {
                r9 = z9;
            } else {
                java.util.Iterator it3 = list.iterator();
                r9 = z9;
                while (it3.hasNext()) {
                    if (((com.kiptv.core.model.WatchProgress) it3.next()).g() && (r9 = r9 + 1) < 0) {
                        p078i6.p.G0();
                        throw null;
                    }
                }
            }
            d6.f4698f.x(java.lang.String.valueOf(d6.f4706p), r9 < size ? z9 : true, z9);
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final java.lang.Object h(I5.D0 d4, com.kiptv.core.model.XtreamSeries xtreamSeries, p117n6.c cVar) {
        I5.C0509t0 c0509t0;
        java.lang.Object objT;
        java.lang.Integer numE;
        d4.getClass();
        if (cVar instanceof I5.C0509t0) {
            c0509t0 = (I5.C0509t0) cVar;
            int i3 = c0509t0.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0509t0.j = i3 - Integer.MIN_VALUE;
            } else {
                c0509t0 = new I5.C0509t0(d4, cVar);
            }
        } else {
            c0509t0 = new I5.C0509t0(d4, cVar);
        }
        I5.C0509t0 c0509t1 = c0509t0;
        java.lang.Object objI = c0509t1.f5359h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0509t1.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objI);
                java.lang.Integer numT = d4.f4700i.t(d4.f4706p);
                if (numT != null) {
                    java.lang.Integer num = new java.lang.Integer(numT.intValue());
                    if (num.intValue() > 0) {
                        return num;
                    }
                } else {
                    if (xtreamSeries != null && (numE = xtreamSeries.e()) != null) {
                        return new java.lang.Integer(numE.intValue());
                    }
                    if (xtreamSeries != null) {
                        p005a5.C1451x5 c1451x5 = d4.f4695c;
                        java.lang.String str = xtreamSeries.f20683b;
                        java.lang.String str2 = xtreamSeries.f20694o;
                        c0509t1.j = 1;
                        objI = p005a5.C1451x5.i(c1451x5, str, null, str2, false, c0509t1, 10);
                        if (objI == aVar) {
                            return aVar;
                        }
                    }
                }
                return null;
            }
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objI);
            objT = (com.kiptv.core.model.p0) objI;
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        if (objT instanceof p070h6.m) {
            objT = null;
        }
        com.kiptv.core.model.p0 p0Var = (com.kiptv.core.model.p0) objT;
        if (p0Var != null) {
            return new java.lang.Integer(p0Var.f20815a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final java.lang.Object i(I5.D0 d4, p117n6.c cVar) {
        I5.B0 b9;
        java.util.Map map;
        java.lang.Object value;
        I5.D0 d6 = d4;
        d6.getClass();
        if (cVar instanceof I5.B0) {
            b9 = (I5.B0) cVar;
            int i3 = b9.f4631k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b9.f4631k = i3 - Integer.MIN_VALUE;
            } else {
                b9 = new I5.B0(d6, cVar);
            }
        } else {
            b9 = new I5.B0(d6, cVar);
        }
        I5.B0 b10 = b9;
        java.lang.Object objE = b10.f4630i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = b10.f4631k;
        p078i6.y yVar = p078i6.y.f23207h;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objE);
                I5.S s9 = (I5.S) d6.f4708r.getValue();
                java.lang.Integer num = s9.f4925o;
                if (num != null) {
                    int iIntValue = num.intValue();
                    com.kiptv.core.model.I0 i10 = s9.f4916d;
                    if (i10 != null && (map = i10.f19803c) != null) {
                        java.util.List list = s9.j;
                        if (!list.isEmpty()) {
                            S4.z zVar = S4.z.f9500a;
                            java.util.Map map2 = s9.f4924n;
                            I5.C0 c9 = new I5.C0(d6, null);
                            b10.f4629h = d6;
                            b10.f4631k = 1;
                            objE = zVar.e(iIntValue, list, map, map2, c9, b10);
                            if (objE == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
                return yVar;
            }
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6 = b10.f4629h;
            com.google.common.util.concurrent.P.u0(objE);
            java.util.Map map3 = (java.util.Map) objE;
            if (map3 != null) {
                V7.n0 n0Var = d6.f4708r;
                do {
                    value = n0Var.getValue();
                } while (!n0Var.g(value, I5.S.a((I5.S) value, null, null, null, null, null, null, null, null, 0, null, null, map3, null, false, null, null, 516095)));
                return map3.keySet();
            }
        } catch (java.lang.Exception unused) {
        }
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object j(java.lang.String str, p117n6.c cVar) {
        I5.U u6;
        com.kiptv.core.model.XtreamSeries xtreamSeries;
        I5.D0 d4;
        if (cVar instanceof I5.U) {
            u6 = (I5.U) cVar;
            int i3 = u6.f4953l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u6.f4953l = i3 - Integer.MIN_VALUE;
            } else {
                u6 = new I5.U(this, cVar);
            }
        } else {
            u6 = new I5.U(this, cVar);
        }
        I5.U u7 = u6;
        java.lang.Object obj = u7.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = u7.f4953l;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            com.kiptv.core.model.XtreamSeries xtreamSeries2 = ((I5.S) this.f4708r.getValue()).f4915c;
            if (xtreamSeries2 != null) {
                com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.j;
                u7.f4950h = this;
                u7.f4951i = xtreamSeries2;
                u7.f4953l = 1;
                java.lang.Object objC = this.g.c(str, z0Var, u7);
                if (objC != aVar) {
                    obj = objC;
                    xtreamSeries = xtreamSeries2;
                    d4 = this;
                }
                return aVar;
            }
            return a2;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            return a2;
        }
        xtreamSeries = u7.f4951i;
        d4 = u7.f4950h;
        com.google.common.util.concurrent.P.u0(obj);
        java.lang.String str2 = (java.lang.String) obj;
        if (str2 != null) {
            I5.D0 d6 = d4;
            p005a5.D0 d9 = d6.g;
            java.lang.String strValueOf = java.lang.String.valueOf(d6.f4706p);
            com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.j;
            java.lang.String strH = ((I5.S) d6.f4708r.getValue()).h();
            java.lang.String strC = xtreamSeries.c();
            u7.f4950h = null;
            u7.f4951i = null;
            u7.f4953l = 2;
            if (p005a5.D0.n(d9, strValueOf, z0Var2, str2, strH, strC, u7, 32) == aVar) {
                return aVar;
            }
        }
        return a2;
    }

    public final java.lang.Integer k() {
        return this.f4700i.t(this.f4706p);
    }

    public final boolean l() {
        if (this.f4705o.f13518a.i()) {
            java.lang.Integer num = ((I5.S) this.f4708r.getValue()).f4925o;
            if ((num != null ? num.intValue() : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    public final V7.l0 m() {
        return this.f4709s;
    }

    public final boolean n() {
        java.lang.String str;
        com.kiptv.core.model.XtreamSeries xtreamSeries = ((I5.S) this.f4708r.getValue()).f4915c;
        if (xtreamSeries == null || (str = xtreamSeries.f20693n) == null) {
            return false;
        }
        return ((com.kiptv.core.model.ParentalControlSettings) ((V7.n0) this.f4700i.f14559m.f10419h).getValue()).f20019f.b(str, com.kiptv.core.model.EnumC1937d.SERIES);
    }

    public final boolean o(int i3, com.kiptv.core.model.E0 e6) {
        java.lang.Integer num = e6.g;
        if (num != null) {
            i3 = num.intValue();
        }
        com.kiptv.core.model.WatchProgress watchProgress = (com.kiptv.core.model.WatchProgress) ((I5.S) this.f4708r.getValue()).f4923m.get(i3 + "-" + e6.a());
        return watchProgress != null && watchProgress.g();
    }

    public final boolean p() {
        int i3;
        V7.n0 n0Var = this.f4708r;
        java.util.Iterator it = ((I5.S) n0Var.getValue()).f4922l.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((java.util.List) it.next()).size();
        }
        if (size != 0) {
            java.util.Collection collectionValues = ((I5.S) n0Var.getValue()).f4923m.values();
            if ((collectionValues instanceof java.util.Collection) && collectionValues.isEmpty()) {
                i3 = 0;
            } else {
                java.util.Iterator it2 = collectionValues.iterator();
                i3 = 0;
                while (it2.hasNext()) {
                    if (((com.kiptv.core.model.WatchProgress) it2.next()).g() && (i3 = i3 + 1) < 0) {
                        p078i6.p.G0();
                        throw null;
                    }
                }
            }
            if (i3 >= size) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        return ((com.kiptv.core.model.ParentalControlSettings) ((V7.n0) this.f4700i.f14559m.f10419h).getValue()).g.b(java.lang.String.valueOf(this.f4706p), com.kiptv.core.model.EnumC1937d.SERIES);
    }

    public final boolean r() {
        return this.f4700i.h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(java.lang.String str, boolean z6, p117n6.c cVar) {
        I5.C0469i0 c0469i0;
        I5.D0 d4;
        if (cVar instanceof I5.C0469i0) {
            c0469i0 = (I5.C0469i0) cVar;
            int i3 = c0469i0.f5167m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0469i0.f5167m = i3 - Integer.MIN_VALUE;
            } else {
                c0469i0 = new I5.C0469i0(this, cVar);
            }
        } else {
            c0469i0 = new I5.C0469i0(this, cVar);
        }
        java.lang.Object objH = c0469i0.f5165k;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = c0469i0.f5167m;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.j;
            c0469i0.f5163h = this;
            c0469i0.f5164i = str;
            c0469i0.j = z6;
            c0469i0.f5167m = 1;
            objH = this.g.h(z0Var, c0469i0);
            if (objH != obj) {
                d4 = this;
            }
            return obj;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objH);
            return a2;
        }
        z6 = c0469i0.j;
        str = c0469i0.f5164i;
        d4 = c0469i0.f5163h;
        com.google.common.util.concurrent.P.u0(objH);
        java.lang.Iterable iterable = (java.lang.Iterable) objH;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((p070h6.k) it.next()).f22539h);
        }
        java.util.ArrayList arrayListO1 = p078i6.o.O1(arrayList);
        int iIndexOf = arrayListO1.indexOf(str);
        int i10 = z6 ? iIndexOf - 1 : iIndexOf + 1;
        if (iIndexOf >= 0 && i10 >= 0 && i10 < arrayListO1.size()) {
            java.lang.Object obj2 = arrayListO1.get(i10);
            arrayListO1.set(i10, str);
            arrayListO1.set(iIndexOf, obj2);
            p005a5.D0 d6 = d4.g;
            com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.j;
            c0469i0.f5163h = null;
            c0469i0.f5164i = null;
            c0469i0.f5167m = 2;
            if (d6.l(arrayListO1, z0Var2, c0469i0) == obj) {
                return obj;
            }
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    public final java.lang.String t(int i3, com.kiptv.core.model.E0 e6) {
        java.lang.String str;
        java.lang.String strK;
        S4.C0875n c0875n;
        int iA = e6.a();
        V7.n0 n0Var = this.f4708r;
        java.util.Map map = (java.util.Map) ((I5.S) n0Var.getValue()).f4924n.get(java.lang.Integer.valueOf(i3));
        java.lang.String str2 = null;
        if (map == null || (c0875n = (S4.C0875n) map.get(java.lang.Integer.valueOf(iA))) == null || (strK = c0875n.f9419c) == null) {
            str = e6.f19733c;
            if (str != null && !O7.q.N0(str)) {
                str2 = str;
            }
            if (str2 == null) {
                strK = com.google.android.gms.internal.play_billing.M0.k(i3, iA, "S", "E");
            } else {
                strK = str2;
            }
        } else {
            if (O7.q.N0(strK)) {
                strK = null;
            }
            if (strK == null) {
                str = e6.f19733c;
                if (str != null) {
                    str2 = str;
                }
                if (str2 == null) {
                    strK = com.google.android.gms.internal.play_billing.M0.k(i3, iA, "S", "E");
                } else {
                    strK = str2;
                }
            }
        }
        return p121o0.p.p(((I5.S) n0Var.getValue()).h(), " - ", strK);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.io.Serializable u(java.lang.String str, p117n6.c cVar) {
        I5.C0512u0 c0512u0;
        if (cVar instanceof I5.C0512u0) {
            c0512u0 = (I5.C0512u0) cVar;
            int i3 = c0512u0.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0512u0.j = i3 - Integer.MIN_VALUE;
            } else {
                c0512u0 = new I5.C0512u0(this, cVar);
            }
        } else {
            c0512u0 = new I5.C0512u0(this, cVar);
        }
        java.lang.Object objG = c0512u0.f5367h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0512u0.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            c0512u0.j = 1;
            objG = this.f4695c.G(str, false, c0512u0);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objG);
        }
        java.lang.Iterable<com.kiptv.core.model.TMDBSearchResult> iterable = (java.lang.Iterable) objG;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(iterable, 10));
        for (com.kiptv.core.model.TMDBSearchResult tMDBSearchResult : iterable) {
            java.lang.String strL = tMDBSearchResult.f20294c;
            int i10 = tMDBSearchResult.f20292a;
            if (strL == null && (strL = tMDBSearchResult.f20293b) == null && (strL = tMDBSearchResult.f20296e) == null) {
                strL = com.google.android.gms.internal.play_billing.M0.l(i10, "#");
            }
            java.lang.String str2 = tMDBSearchResult.j;
            if (str2 == null) {
                str2 = tMDBSearchResult.f20299i;
            }
            java.lang.String strP1 = str2 != null ? O7.q.p1(4, str2) : null;
            java.lang.Integer num = new java.lang.Integer(i10);
            if (strP1 != null && !O7.q.N0(strP1)) {
                strL = strL + " (" + strP1 + ")";
            }
            arrayList.add(new p070h6.k(num, strL));
        }
        return arrayList;
    }

    public final void v(int i3) {
        V7.n0 n0Var;
        java.lang.Object value;
        do {
            n0Var = this.f4708r;
            value = n0Var.getValue();
        } while (!n0Var.g(value, I5.S.a((I5.S) value, null, null, null, null, null, null, null, null, i3, null, null, null, null, false, null, null, 523263)));
        java.lang.Integer num = ((I5.S) n0Var.getValue()).f4925o;
        if (num != null) {
            int iIntValue = num.intValue();
            if (((I5.S) n0Var.getValue()).f4924n.containsKey(java.lang.Integer.valueOf(i3))) {
                return;
            }
            S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0515v0(this, iIntValue, i3, null), 3);
        }
    }
}
