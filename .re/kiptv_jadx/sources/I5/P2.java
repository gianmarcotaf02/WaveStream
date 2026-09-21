package I5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI5/P2;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class P2 extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public java.util.Set f4869A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public java.util.Set f4870B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public java.util.Map f4871C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public S7.w0 f4872D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p005a5.T1 f4873E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final p005a5.T1 f4874F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f4875G;
    public final V7.W H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final V7.W f4876I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1366p f4877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1451x5 f4878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.i9 f4879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.D0 f4880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a5.C1434v8 f4881f;
    public final p005a5.J3 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p005a5.C1291h4 f4882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p005a5.x9 f4883i;
    public final p132p5.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.kiptv.core.repository.a f4884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p005a5.Z1 f4885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E2.d f4886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.String f4887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V7.n0 f4888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V7.W f4889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.LinkedHashMap f4890q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.util.LinkedHashMap f4891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f4892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public S7.w0 f4893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public S7.w0 f4894u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public java.util.List f4895v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public java.util.Map f4896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public S4.EnumC0862a f4897x;
    public S4.EnumC0868g y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public java.util.List f4898z;

    public P2(p005a5.C1366p contentCacheRepository, p005a5.C1451x5 tmdbRepository, p005a5.i9 watchProgressRepository, p005a5.D0 myListRepository, p005a5.C1434v8 trendingRepository, p005a5.B3 searchRepository, p005a5.J3 seriesMetadataRepository, p005a5.C1291h4 settingsRepository, p005a5.x9 xtreamRepository, p132p5.a appConfig, com.kiptv.core.repository.a newContentRepository, p005a5.Z1 posterFallbackResolver, E2.d dVar) {
        kotlin.jvm.internal.m.e(contentCacheRepository, "contentCacheRepository");
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(watchProgressRepository, "watchProgressRepository");
        kotlin.jvm.internal.m.e(myListRepository, "myListRepository");
        kotlin.jvm.internal.m.e(trendingRepository, "trendingRepository");
        kotlin.jvm.internal.m.e(searchRepository, "searchRepository");
        kotlin.jvm.internal.m.e(seriesMetadataRepository, "seriesMetadataRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(xtreamRepository, "xtreamRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        kotlin.jvm.internal.m.e(newContentRepository, "newContentRepository");
        kotlin.jvm.internal.m.e(posterFallbackResolver, "posterFallbackResolver");
        this.f4877b = contentCacheRepository;
        this.f4878c = tmdbRepository;
        this.f4879d = watchProgressRepository;
        this.f4880e = myListRepository;
        this.f4881f = trendingRepository;
        this.g = seriesMetadataRepository;
        this.f4882h = settingsRepository;
        this.f4883i = xtreamRepository;
        this.j = appConfig;
        this.f4884k = newContentRepository;
        this.f4885l = posterFallbackResolver;
        this.f4886m = dVar;
        p078i6.w wVar = p078i6.w.f23205h;
        p078i6.x xVar = p078i6.x.f23206h;
        S4.EnumC0862a enumC0862a = S4.EnumC0862a.f9358h;
        S4.EnumC0868g enumC0868g = S4.EnumC0868g.f9389h;
        p078i6.y yVar = p078i6.y.f23207h;
        V7.n0 n0VarB = V7.r.b(new I5.B1(false, wVar, xVar, wVar, xVar, xVar, xVar, wVar, wVar, wVar, false, true, wVar, null, null, null, "https://image.tmdb.org/t/p", enumC0862a, enumC0868g, false, xVar, xVar, xVar, yVar, yVar, xVar, false, false, yVar, yVar, yVar));
        this.f4888o = n0VarB;
        this.f4889p = new V7.W(n0VarB);
        this.f4890q = new java.util.LinkedHashMap();
        this.f4891r = new java.util.LinkedHashMap();
        this.f4892s = new java.util.concurrent.ConcurrentHashMap();
        this.f4895v = wVar;
        this.f4896w = xVar;
        this.f4897x = enumC0862a;
        this.y = enumC0868g;
        this.f4898z = wVar;
        this.f4869A = yVar;
        this.f4870B = yVar;
        this.f4871C = xVar;
        p057g2.a aVarH = androidx.lifecycle.X.h(this);
        Z7.e eVar = S7.M.f9549a;
        p100l6.c cVar = null;
        final int i3 = 0;
        this.f4873E = new p005a5.T1(aVarH, new I5.W0(6), new I5.q2(0, this, cVar), new p194x6.m(this) { // from class: I5.C1

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ I5.P2 f4680i;

            {
                this.f4680i = this;
            }

            @Override // p194x6.m
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object value;
                I5.B1 b9;
                java.lang.Object value2;
                I5.B1 b10;
                switch (i3) {
                    case 0:
                        java.lang.Integer num = (java.lang.Integer) obj;
                        num.getClass();
                        java.lang.String url = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(url, "url");
                        V7.n0 n0Var = this.f4680i.f4888o;
                        do {
                            value = n0Var.getValue();
                            b9 = (I5.B1) value;
                        } while (!n0Var.g(value, I5.B1.a(b9, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, p078i6.C.S0(b9.f4655u, new p070h6.k(num, url)), null, null, null, null, null, false, false, null, null, null, 2146435071)));
                        break;
                    default:
                        java.lang.Integer num2 = (java.lang.Integer) obj;
                        num2.getClass();
                        java.lang.String label = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(label, "label");
                        V7.n0 n0Var2 = this.f4680i.f4888o;
                        do {
                            value2 = n0Var2.getValue();
                            b10 = (I5.B1) value2;
                        } while (!n0Var2.g(value2, I5.B1.a(b10, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, p078i6.C.S0(b10.f4657w, new p070h6.k(num2, label)), null, null, null, false, false, null, null, null, 2143289343)));
                        break;
                }
                return p070h6.A.f22523a;
            }
        }, eVar, 48);
        final int i9 = 1;
        this.f4874F = new p005a5.T1(androidx.lifecycle.X.h(this), new I5.W0(7), new I5.r2(0, this, cVar), new p194x6.m(this) { // from class: I5.C1

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ I5.P2 f4680i;

            {
                this.f4680i = this;
            }

            @Override // p194x6.m
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object value;
                I5.B1 b9;
                java.lang.Object value2;
                I5.B1 b10;
                switch (i9) {
                    case 0:
                        java.lang.Integer num = (java.lang.Integer) obj;
                        num.getClass();
                        java.lang.String url = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(url, "url");
                        V7.n0 n0Var = this.f4680i.f4888o;
                        do {
                            value = n0Var.getValue();
                            b9 = (I5.B1) value;
                        } while (!n0Var.g(value, I5.B1.a(b9, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, p078i6.C.S0(b9.f4655u, new p070h6.k(num, url)), null, null, null, null, null, false, false, null, null, null, 2146435071)));
                        break;
                    default:
                        java.lang.Integer num2 = (java.lang.Integer) obj;
                        num2.getClass();
                        java.lang.String label = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(label, "label");
                        V7.n0 n0Var2 = this.f4680i.f4888o;
                        do {
                            value2 = n0Var2.getValue();
                            b10 = (I5.B1) value2;
                        } while (!n0Var2.g(value2, I5.B1.a(b10, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, p078i6.C.S0(b10.f4657w, new p070h6.k(num2, label)), null, null, null, false, false, null, null, null, 2143289343)));
                        break;
                }
                return p070h6.A.f22523a;
            }
        }, eVar, 32);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.S1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.U1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.X1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0455e2(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0467h2(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0443b2(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.E1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.G1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.Z1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0475j2(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0483l2(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.C0491n2(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.H1(this, null), 3);
        this.f4875G = java.util.concurrent.ConcurrentHashMap.newKeySet();
        this.H = newContentRepository.f20962f;
        this.f4876I = newContentRepository.f20963h;
    }

    public static final java.lang.Object e(I5.P2 p2, p117n6.i iVar) throws java.lang.Throwable {
        p2.getClass();
        java.lang.Object objK = S7.C.K(S7.M.f9549a, new I5.v2(p2, null), iVar);
        return objK == p109m6.a.f25430h ? objK : p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final java.lang.Object f(I5.P2 p2, p117n6.c cVar) {
        I5.w2 w2Var;
        java.util.LinkedHashMap linkedHashMap;
        java.lang.String strValueOf;
        I5.P2 p9 = p2;
        p9.getClass();
        if (cVar instanceof I5.w2) {
            w2Var = (I5.w2) cVar;
            int i3 = w2Var.f5438l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w2Var.f5438l = i3 - Integer.MIN_VALUE;
            } else {
                w2Var = new I5.w2(p9, cVar);
            }
        } else {
            w2Var = new I5.w2(p9, cVar);
        }
        java.lang.Object objH = w2Var.j;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = w2Var.f5438l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            java.util.List list = ((I5.B1) p9.f4888o.getValue()).f4644i;
            int iI0 = p078i6.D.I0(p078i6.q.I0(list, 10));
            if (iI0 < 16) {
                iI0 = 16;
            }
            linkedHashMap = new java.util.LinkedHashMap(iI0);
            for (java.lang.Object obj2 : list) {
                int i10 = ((com.kiptv.core.model.XtreamSeries) obj2).f20684c;
                if (i10 < 0) {
                    com.kiptv.core.model.MyListItem.INSTANCE.getClass();
                    strValueOf = "tmdb:" + (-i10);
                } else {
                    strValueOf = java.lang.String.valueOf(i10);
                }
                linkedHashMap.put(strValueOf, obj2);
            }
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.j;
            w2Var.f5435h = p9;
            w2Var.f5436i = linkedHashMap;
            w2Var.f5438l = 1;
            objH = p9.f4880e.h(z0Var, w2Var);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.LinkedHashMap linkedHashMap2 = w2Var.f5436i;
            I5.P2 p10 = w2Var.f5435h;
            com.google.common.util.concurrent.P.u0(objH);
            linkedHashMap = linkedHashMap2;
            p9 = p10;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p070h6.k kVar : (java.lang.Iterable) objH) {
            java.lang.String str = (java.lang.String) kVar.f22539h;
            java.lang.String str2 = (java.lang.String) kVar.f22540i;
            java.util.ArrayList arrayListG = p9.f4880e.g(str, com.kiptv.core.model.z0.j);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayListG.iterator();
            while (it.hasNext()) {
                com.kiptv.core.model.XtreamSeries xtreamSeries = (com.kiptv.core.model.XtreamSeries) linkedHashMap.get(((com.kiptv.core.model.MyListItem) it.next()).f19875d);
                if (xtreamSeries != null) {
                    arrayList2.add(xtreamSeries);
                }
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList2) {
                if (hashSet.add(new java.lang.Integer(((com.kiptv.core.model.XtreamSeries) obj3).f20684c))) {
                    arrayList3.add(obj3);
                }
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            I5.E0 e6 = arrayList3 != null ? new I5.E0(str, str2, arrayList3) : null;
            if (e6 != null) {
                arrayList.add(e6);
            }
        }
        V7.n0 n0Var = p9.f4888o;
        while (true) {
            java.lang.Object value = n0Var.getValue();
            java.util.ArrayList arrayList4 = arrayList;
            if (n0Var.g(value, I5.B1.a((I5.B1) value, false, null, null, null, null, null, null, null, null, arrayList4, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, false, false, null, null, null, 2147483135))) {
                return p070h6.A.f22523a;
            }
            arrayList = arrayList4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r8 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object g(I5.P2 p2, com.kiptv.core.model.XtreamSeries xtreamSeries, p117n6.c cVar) {
        I5.E2 e6;
        java.lang.Object objT;
        p2.getClass();
        if (cVar instanceof I5.E2) {
            e6 = (I5.E2) cVar;
            int i3 = e6.f4729l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6.f4729l = i3 - Integer.MIN_VALUE;
            } else {
                e6 = new I5.E2(p2, cVar);
            }
        } else {
            e6 = new I5.E2(p2, cVar);
        }
        java.lang.Object objV = e6.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = e6.f4729l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objV);
                if (p2.f4875G.contains(new java.lang.Integer(xtreamSeries.f20684c))) {
                    return null;
                }
                e6.f4726h = p2;
                e6.f4727i = xtreamSeries;
                e6.f4729l = 1;
                objV = p2.v(xtreamSeries, true, e6);
                if (objV != aVar) {
                }
                return aVar;
            }
            if (i9 == 1) {
                xtreamSeries = e6.f4727i;
                p2 = e6.f4726h;
                com.google.common.util.concurrent.P.u0(objV);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objV);
            }
            objT = (com.kiptv.core.model.TMDBSeriesDetail) objV;
            if (objT instanceof p070h6.m) {
                objT = null;
            }
            com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail = (com.kiptv.core.model.TMDBSeriesDetail) objT;
            if (tMDBSeriesDetail == null) {
                return null;
            }
            return t5.AbstractC2793d1.l0(tMDBSeriesDetail.f20323l);
            java.lang.Integer num = (java.lang.Integer) objV;
            if (num == null) {
                java.util.concurrent.ConcurrentHashMap.KeySetView ratingMisses = p2.f4875G;
                kotlin.jvm.internal.m.d(ratingMisses, "ratingMisses");
                ratingMisses.add(new java.lang.Integer(xtreamSeries.f20684c));
                return null;
            }
            p005a5.C1451x5 c1451x5 = p2.f4878c;
            int iIntValue = num.intValue();
            e6.f4726h = null;
            e6.f4727i = null;
            e6.f4729l = 2;
            objV = c1451x5.w(iIntValue, e6);
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
    }

    public static final t5.C2819m0 h(I5.P2 p2, t5.C2819m0 c2819m0, java.util.List list) {
        p2.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList<com.kiptv.core.model.TMDBWatchProvider> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (hashSet.add(java.lang.Integer.valueOf(((com.kiptv.core.model.TMDBWatchProvider) obj).f20351a))) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.kiptv.core.model.TMDBWatchProvider tMDBWatchProvider : arrayList) {
            Y4.A a2 = Y4.Q0.Companion;
            java.lang.String str = tMDBWatchProvider.f20353c;
            a2.getClass();
            java.lang.String strB = Y4.A.b(str, "w92", "https://image.tmdb.org/t/p");
            if (strB != null) {
                arrayList2.add(strB);
            }
        }
        return t5.C2819m0.a(c2819m0, arrayList2);
    }

    public static java.lang.String s(com.kiptv.core.model.XtreamSeries xtreamSeries) {
        int i3 = xtreamSeries.f20684c;
        return i3 < 0 ? com.google.android.gms.internal.play_billing.M0.l(-i3, "tmdb:") : java.lang.String.valueOf(i3);
    }

    public static com.kiptv.core.model.T y(int i3, java.util.Set newSeriesIds, java.util.Map episodeBadges) {
        kotlin.jvm.internal.m.e(newSeriesIds, "newSeriesIds");
        kotlin.jvm.internal.m.e(episodeBadges, "episodeBadges");
        com.kiptv.core.model.T t9 = (com.kiptv.core.model.T) episodeBadges.get(java.lang.Integer.valueOf(i3));
        if (t9 != null) {
            return t9;
        }
        if (newSeriesIds.contains(java.lang.Integer.valueOf(i3))) {
            return com.kiptv.core.model.T.NEW_SERIES;
        }
        return null;
    }

    public static t5.C2819m0 z(com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail) {
        com.kiptv.core.model.TMDBImage tMDBImageA;
        kotlin.jvm.internal.m.e(tMDBSeriesDetail, "<this>");
        com.kiptv.core.model.TMDBCredits tMDBCredits = tMDBSeriesDetail.f20326o;
        java.util.List list = tMDBCredits != null ? tMDBCredits.f20147a : null;
        java.util.List list2 = p078i6.w.f23205h;
        if (list == null) {
            list = list2;
        }
        java.util.List listJ1 = p078i6.o.J1(list, 4);
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(listJ1, 10));
        java.util.Iterator it = listJ1.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.kiptv.core.model.TMDBCastMember) it.next()).f20123b);
        }
        com.kiptv.core.model.TMDBImages tMDBImages = tMDBSeriesDetail.f20327p;
        java.lang.String str = (tMDBImages == null || (tMDBImageA = com.kiptv.core.model.TMDBImages.a(tMDBImages)) == null) ? null : tMDBImageA.f20180a;
        Y4.Q0.Companion.getClass();
        java.lang.String strB = Y4.A.b(str, "w300", "https://image.tmdb.org/t/p");
        java.lang.Integer numB = tMDBSeriesDetail.b();
        java.util.List list3 = tMDBSeriesDetail.f20325n;
        if (list3 != null) {
            list2 = list3;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(list2, 10));
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((com.kiptv.core.model.TMDBGenre) it2.next()).f20179b);
        }
        return new t5.C2819m0(tMDBSeriesDetail.f20315b, strB, (java.lang.String) null, numB, (java.lang.Integer) null, tMDBSeriesDetail.f20321i, tMDBSeriesDetail.f20323l, tMDBSeriesDetail.f20324m, arrayList2, arrayList, tMDBSeriesDetail.f20317d, tMDBSeriesDetail.a(null), (java.util.List) null, 12308);
    }

    public final void A(java.lang.String categoryId) {
        kotlin.jvm.internal.m.e(categoryId, "categoryId");
        S7.C.A(androidx.lifecycle.X.h(this), null, new I5.K2(this, categoryId, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object B(com.kiptv.core.model.XtreamSeries xtreamSeries, java.lang.String str, p117n6.c cVar) {
        I5.L2 l2;
        if (cVar instanceof I5.L2) {
            l2 = (I5.L2) cVar;
            int i3 = l2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l2.j = i3 - Integer.MIN_VALUE;
            } else {
                l2 = new I5.L2(this, cVar);
            }
        } else {
            l2 = new I5.L2(this, cVar);
        }
        I5.L2 l9 = l2;
        java.lang.Object obj = l9.f4813h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = l9.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                p005a5.D0 d4 = this.f4880e;
                java.lang.String strS = s(xtreamSeries);
                com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.j;
                java.lang.String str2 = xtreamSeries.f20683b;
                java.lang.String strC = xtreamSeries.c();
                int i10 = xtreamSeries.f20684c;
                java.lang.Integer numValueOf = i10 < 0 ? java.lang.Integer.valueOf(-i10) : null;
                if (numValueOf == null) {
                    numValueOf = xtreamSeries.e();
                }
                l9.j = 1;
                if (d4.m(strS, z0Var, str, str2, strC, numValueOf, l9) == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
        } catch (java.lang.Throwable th) {
            com.google.common.util.concurrent.P.T(th);
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object i(com.kiptv.core.model.XtreamSeries xtreamSeries, java.lang.String str, p117n6.c cVar) {
        I5.J1 j9;
        I5.P2 p2;
        if (cVar instanceof I5.J1) {
            j9 = (I5.J1) cVar;
            int i3 = j9.f4783l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j9.f4783l = i3 - Integer.MIN_VALUE;
            } else {
                j9 = new I5.J1(this, cVar);
            }
        } else {
            j9 = new I5.J1(this, cVar);
        }
        I5.J1 j10 = j9;
        java.lang.Object objC = j10.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = j10.f4783l;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objC);
                com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.j;
                j10.f4780h = this;
                j10.f4781i = xtreamSeries;
                j10.f4783l = 1;
                objC = this.f4880e.c(str, z0Var, j10);
                if (objC != aVar) {
                    p2 = this;
                }
                return aVar;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objC);
                return a2;
            }
            xtreamSeries = j10.f4781i;
            p2 = j10.f4780h;
            com.google.common.util.concurrent.P.u0(objC);
            java.lang.String str2 = (java.lang.String) objC;
            if (str2 != null) {
                p005a5.D0 d4 = p2.f4880e;
                java.lang.String strS = s(xtreamSeries);
                com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.j;
                java.lang.String str3 = xtreamSeries.f20683b;
                java.lang.String strC = xtreamSeries.c();
                int i10 = xtreamSeries.f20684c;
                java.lang.Integer numValueOf = i10 < 0 ? java.lang.Integer.valueOf(-i10) : null;
                if (numValueOf == null) {
                    numValueOf = xtreamSeries.e();
                }
                j10.f4780h = null;
                j10.f4781i = null;
                j10.f4783l = 2;
                if (d4.m(strS, z0Var2, str2, str3, strC, numValueOf, j10) == aVar) {
                    return aVar;
                }
            }
        } catch (java.lang.Throwable th) {
            com.google.common.util.concurrent.P.T(th);
        }
        return a2;
    }

    public final java.util.Set j(com.kiptv.core.model.XtreamSeries xtreamSeries) {
        return p078i6.o.R1(this.f4880e.o(s(xtreamSeries), com.kiptv.core.model.z0.j));
    }

    public final java.lang.String k(java.lang.String str) {
        return (java.lang.String) this.f4871C.get(str);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final V7.W getF4876I() {
        return this.f4876I;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final V7.W getH() {
        return this.H;
    }

    public final java.lang.Object n() {
        return this.f4887n;
    }

    public final V7.l0 o() {
        return this.f4889p;
    }

    public final boolean p(java.lang.String str) {
        com.kiptv.core.model.C1944g0 c1944g0;
        com.kiptv.core.model.ContentTypeSettings contentTypeSettings;
        com.kiptv.core.model.PlaylistSettings playlistSettingsA = this.f4882h.a();
        if (playlistSettingsA == null || (c1944g0 = playlistSettingsA.f20062i) == null || (contentTypeSettings = c1944g0.f20756c) == null) {
            return false;
        }
        return E8.l.C(str, this.f4895v, contentTypeSettings);
    }

    public final java.lang.Integer q(com.kiptv.core.model.XtreamSeries xtreamSeries) {
        return this.f4882h.t(xtreamSeries.f20684c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(java.lang.String str, boolean z6, p117n6.c cVar) {
        I5.P1 p2;
        I5.P2 p9;
        if (cVar instanceof I5.P1) {
            p2 = (I5.P1) cVar;
            int i3 = p2.f4868m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p2.f4868m = i3 - Integer.MIN_VALUE;
            } else {
                p2 = new I5.P1(this, cVar);
            }
        } else {
            p2 = new I5.P1(this, cVar);
        }
        java.lang.Object objH = p2.f4866k;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = p2.f4868m;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.j;
            p2.f4864h = this;
            p2.f4865i = str;
            p2.j = z6;
            p2.f4868m = 1;
            objH = this.f4880e.h(z0Var, p2);
            if (objH != obj) {
                p9 = this;
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
        z6 = p2.j;
        str = p2.f4865i;
        p9 = p2.f4864h;
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
            p005a5.D0 d4 = p9.f4880e;
            com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.j;
            p2.f4864h = null;
            p2.f4865i = null;
            p2.f4868m = 2;
            if (d4.l(arrayListO1, z0Var2, p2) == obj) {
                return obj;
            }
        }
        return a2;
    }

    public final void t(com.kiptv.core.model.XtreamSeries series) {
        kotlin.jvm.internal.m.e(series, "series");
        this.f4873E.c(series, false);
    }

    public final void u(com.kiptv.core.model.XtreamSeries series) {
        V7.n0 n0Var;
        java.lang.Object value;
        I5.P2 p2;
        kotlin.jvm.internal.m.e(series, "series");
        do {
            n0Var = this.f4888o;
            value = n0Var.getValue();
        } while (!n0Var.g(value, I5.B1.a((I5.B1) value, false, null, null, null, null, null, null, null, null, null, false, false, null, null, series, null, null, null, false, null, null, null, null, null, null, false, false, null, null, null, 2147467263)));
        java.lang.String strC = series.c();
        if ((strC == null || strC.length() == 0) && !((I5.B1) n0Var.getValue()).f4655u.containsKey(java.lang.Integer.valueOf(series.f20684c))) {
            p2 = this;
            p2.f4873E.c(series, true);
        } else {
            p2 = this;
        }
        I5.C0495o2 c0495o2 = new I5.C0495o2(p2, series, null);
        S7.w0 w0Var = p2.f4894u;
        if (w0Var != null) {
            w0Var.e(null);
        }
        p2.f4894u = S7.C.A(androidx.lifecycle.X.h(p2), null, new I5.G2(c0495o2, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object v(com.kiptv.core.model.XtreamSeries xtreamSeries, boolean z6, p117n6.c cVar) {
        I5.D2 d4;
        java.lang.Throwable th;
        I5.P2 p2;
        boolean z9;
        java.lang.Object objT;
        if (cVar instanceof I5.D2) {
            d4 = (I5.D2) cVar;
            int i3 = d4.f4716m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d4.f4716m = i3 - Integer.MIN_VALUE;
            } else {
                d4 = new I5.D2(this, cVar);
            }
        } else {
            d4 = new I5.D2(this, cVar);
        }
        I5.D2 d6 = d4;
        java.lang.Object objI = d6.f4714k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = d6.f4716m;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objI);
            java.lang.Integer numT = this.f4882h.t(xtreamSeries.f20684c);
            if (numT != null) {
                java.lang.Integer num = new java.lang.Integer(numT.intValue());
                if (num.intValue() > 0) {
                    return num;
                }
            } else {
                java.lang.Integer numE = xtreamSeries.e();
                if (numE != null) {
                    return new java.lang.Integer(numE.intValue());
                }
                java.lang.Integer num2 = (java.lang.Integer) this.f4892s.get(new java.lang.Integer(xtreamSeries.f20684c));
                if (num2 != null) {
                    java.lang.Integer num3 = new java.lang.Integer(num2.intValue());
                    if (num3.intValue() > 0) {
                        return num3;
                    }
                } else {
                    try {
                        p005a5.C1451x5 c1451x5 = this.f4878c;
                        try {
                            java.lang.String str = xtreamSeries.f20683b;
                            java.lang.String str2 = xtreamSeries.f20694o;
                            d6.f4712h = this;
                            d6.f4713i = xtreamSeries;
                            d6.j = z6;
                            d6.f4716m = 1;
                            z9 = z6;
                            try {
                                objI = p005a5.C1451x5.i(c1451x5, str, null, str2, z9, d6, 2);
                                if (objI == aVar) {
                                    return aVar;
                                }
                                p2 = this;
                                z6 = z9;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                th = th;
                                p2 = this;
                                z6 = z9;
                                objT = com.google.common.util.concurrent.P.T(th);
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            z9 = z6;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        p2 = this;
                    }
                }
            }
            return null;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z6 = d6.j;
        xtreamSeries = d6.f4713i;
        p2 = d6.f4712h;
        try {
            com.google.common.util.concurrent.P.u0(objI);
        } catch (java.lang.Throwable th5) {
            th = th5;
            objT = com.google.common.util.concurrent.P.T(th);
        }
        com.kiptv.core.model.p0 p0Var = (com.kiptv.core.model.p0) objI;
        objT = p0Var != null ? new java.lang.Integer(p0Var.f20815a) : null;
        java.lang.Integer num4 = (java.lang.Integer) (objT instanceof p070h6.m ? null : objT);
        if (num4 != null || !z6) {
            p2.f4892s.put(new java.lang.Integer(xtreamSeries.f20684c), new java.lang.Integer(num4 != null ? num4.intValue() : 0));
        }
        return num4;
    }

    public final com.kiptv.core.model.XtreamSeries w(com.kiptv.core.model.TMDBSearchResult tMDBSearchResult) {
        return (com.kiptv.core.model.XtreamSeries) ((java.util.Map) ((V7.n0) this.f4881f.f15212s.f10419h).getValue()).get(java.lang.Integer.valueOf(tMDBSearchResult.f20292a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.io.Serializable x(java.lang.String str, p117n6.c cVar) {
        I5.H2 h9;
        if (cVar instanceof I5.H2) {
            h9 = (I5.H2) cVar;
            int i3 = h9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h9.j = i3 - Integer.MIN_VALUE;
            } else {
                h9 = new I5.H2(this, cVar);
            }
        } else {
            h9 = new I5.H2(this, cVar);
        }
        java.lang.Object objG = h9.f4758h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = h9.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            h9.j = 1;
            objG = this.f4878c.G(str, false, h9);
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
}
