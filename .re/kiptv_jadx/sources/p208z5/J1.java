package p208z5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz5/J1;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class J1 extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public java.util.Set f32487A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public java.util.Set f32488B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public java.util.Map f32489C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public S7.w0 f32490D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public S7.w0 f32491E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final p005a5.T1 f32492F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final p005a5.T1 f32493G;
    public final java.util.concurrent.ConcurrentHashMap.KeySetView H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final V7.W f32494I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1366p f32495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1451x5 f32496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.i9 f32497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.D0 f32498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a5.C1434v8 f32499f;
    public final p005a5.C1291h4 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p005a5.x9 f32500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p005a5.C1379q2 f32501i;
    public final p132p5.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.kiptv.core.repository.a f32502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p005a5.Z1 f32503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E2.d f32504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.String f32505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V7.n0 f32506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V7.W f32507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.LinkedHashMap f32508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.util.LinkedHashMap f32509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f32510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public S7.w0 f32511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public S7.w0 f32512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public java.util.List f32513v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public java.util.Map f32514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public S4.EnumC0862a f32515x;
    public S4.EnumC0868g y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public java.util.List f32516z;

    public J1(p005a5.C1366p contentCacheRepository, p005a5.C1451x5 tmdbRepository, p005a5.i9 watchProgressRepository, p005a5.D0 myListRepository, p005a5.C1434v8 trendingRepository, p005a5.B3 searchRepository, p005a5.C1291h4 settingsRepository, p005a5.x9 xtreamRepository, p005a5.C1379q2 purchaseRepository, p132p5.a appConfig, com.kiptv.core.repository.a newContentRepository, p005a5.Z1 posterFallbackResolver, E2.d dVar) {
        kotlin.jvm.internal.m.e(contentCacheRepository, "contentCacheRepository");
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(watchProgressRepository, "watchProgressRepository");
        kotlin.jvm.internal.m.e(myListRepository, "myListRepository");
        kotlin.jvm.internal.m.e(trendingRepository, "trendingRepository");
        kotlin.jvm.internal.m.e(searchRepository, "searchRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(xtreamRepository, "xtreamRepository");
        kotlin.jvm.internal.m.e(purchaseRepository, "purchaseRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        kotlin.jvm.internal.m.e(newContentRepository, "newContentRepository");
        kotlin.jvm.internal.m.e(posterFallbackResolver, "posterFallbackResolver");
        this.f32495b = contentCacheRepository;
        this.f32496c = tmdbRepository;
        this.f32497d = watchProgressRepository;
        this.f32498e = myListRepository;
        this.f32499f = trendingRepository;
        this.g = settingsRepository;
        this.f32500h = xtreamRepository;
        this.f32501i = purchaseRepository;
        this.j = appConfig;
        this.f32502k = newContentRepository;
        this.f32503l = posterFallbackResolver;
        this.f32504m = dVar;
        p078i6.w wVar = p078i6.w.f23205h;
        p078i6.x xVar = p078i6.x.f23206h;
        S4.EnumC0862a enumC0862a = S4.EnumC0862a.f9358h;
        S4.EnumC0868g enumC0868g = S4.EnumC0868g.f9389h;
        p078i6.y yVar = p078i6.y.f23207h;
        V7.n0 n0VarB = V7.r.b(new p208z5.B0(false, wVar, xVar, wVar, xVar, xVar, xVar, xVar, wVar, wVar, wVar, false, true, wVar, null, null, null, "https://image.tmdb.org/t/p", enumC0862a, enumC0868g, false, xVar, xVar, xVar, yVar, yVar, yVar, yVar, yVar, xVar, false, false));
        this.f32506o = n0VarB;
        this.f32507p = new V7.W(n0VarB);
        this.f32508q = new java.util.LinkedHashMap();
        this.f32509r = new java.util.LinkedHashMap();
        this.f32510s = new java.util.concurrent.ConcurrentHashMap();
        this.f32513v = wVar;
        this.f32514w = xVar;
        this.f32515x = enumC0862a;
        this.y = enumC0868g;
        this.f32516z = wVar;
        this.f32487A = yVar;
        this.f32488B = yVar;
        this.f32489C = xVar;
        p057g2.a aVarH = androidx.lifecycle.X.h(this);
        Z7.e eVar = S7.M.f9549a;
        p100l6.c cVar = null;
        final int i3 = 0;
        this.f32492F = new p005a5.T1(aVarH, new p208z5.C3214l(13), new I5.q2(2, this, cVar), new p194x6.m(this) { // from class: z5.C0

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p208z5.J1 f32430i;

            {
                this.f32430i = this;
            }

            @Override // p194x6.m
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object value;
                p208z5.B0 b9;
                java.lang.Object value2;
                p208z5.B0 b10;
                switch (i3) {
                    case 0:
                        java.lang.Integer num = (java.lang.Integer) obj;
                        num.getClass();
                        java.lang.String url = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(url, "url");
                        V7.n0 n0Var = this.f32430i.f32506o;
                        do {
                            value = n0Var.getValue();
                            b9 = (p208z5.B0) value;
                        } while (!n0Var.g(value, p208z5.B0.a(b9, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, p078i6.C.S0(b9.f32421v, new p070h6.k(num, url)), null, null, null, null, null, null, null, null, false, false, -2097153)));
                        break;
                    default:
                        java.lang.Integer num2 = (java.lang.Integer) obj;
                        num2.getClass();
                        java.lang.String label = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(label, "label");
                        V7.n0 n0Var2 = this.f32430i.f32506o;
                        do {
                            value2 = n0Var2.getValue();
                            b10 = (p208z5.B0) value2;
                        } while (!n0Var2.g(value2, p208z5.B0.a(b10, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, p078i6.C.S0(b10.f32423x, new p070h6.k(num2, label)), null, null, null, null, null, null, false, false, -8388609)));
                        break;
                }
                return p070h6.A.f22523a;
            }
        }, eVar, 48);
        final int i9 = 1;
        this.f32493G = new p005a5.T1(androidx.lifecycle.X.h(this), new p208z5.C3214l(14), new I5.r2(2, this, cVar), new p194x6.m(this) { // from class: z5.C0

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p208z5.J1 f32430i;

            {
                this.f32430i = this;
            }

            @Override // p194x6.m
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object value;
                p208z5.B0 b9;
                java.lang.Object value2;
                p208z5.B0 b10;
                switch (i9) {
                    case 0:
                        java.lang.Integer num = (java.lang.Integer) obj;
                        num.getClass();
                        java.lang.String url = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(url, "url");
                        V7.n0 n0Var = this.f32430i.f32506o;
                        do {
                            value = n0Var.getValue();
                            b9 = (p208z5.B0) value;
                        } while (!n0Var.g(value, p208z5.B0.a(b9, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, p078i6.C.S0(b9.f32421v, new p070h6.k(num, url)), null, null, null, null, null, null, null, null, false, false, -2097153)));
                        break;
                    default:
                        java.lang.Integer num2 = (java.lang.Integer) obj;
                        num2.getClass();
                        java.lang.String label = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(label, "label");
                        V7.n0 n0Var2 = this.f32430i.f32506o;
                        do {
                            value2 = n0Var2.getValue();
                            b10 = (p208z5.B0) value2;
                        } while (!n0Var2.g(value2, p208z5.B0.a(b10, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, p078i6.C.S0(b10.f32423x, new p070h6.k(num2, label)), null, null, null, null, null, null, false, false, -8388609)));
                        break;
                }
                return p070h6.A.f22523a;
            }
        }, eVar, 32);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.R0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.T0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.V0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.C3187b1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.C3193d1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.Z0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.E0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.G0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.X0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.C3199f1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.C3205h1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.C3211j1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.H0(this, null), 3);
        this.H = java.util.concurrent.ConcurrentHashMap.newKeySet();
        this.f32494I = newContentRepository.f20960d;
    }

    public static final java.lang.String e(p208z5.J1 j9, java.lang.String str) {
        j9.getClass();
        java.lang.String lowerCase = O7.q.r1(S4.K.c(S4.K.f9329a, str, false, 6)).toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("\\s+");
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        java.lang.String strReplaceAll = patternCompile.matcher(lowerCase).replaceAll(io.ktor.sse.ServerSentEventKt.SPACE);
        kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final java.lang.Object f(p208z5.J1 j9, p117n6.c cVar) {
        p208z5.p1 p1Var;
        java.util.LinkedHashMap linkedHashMap;
        java.lang.String strValueOf;
        p208z5.J1 j10 = j9;
        j10.getClass();
        if (cVar instanceof p208z5.p1) {
            p1Var = (p208z5.p1) cVar;
            int i3 = p1Var.f32786l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p1Var.f32786l = i3 - Integer.MIN_VALUE;
            } else {
                p1Var = new p208z5.p1(j10, cVar);
            }
        } else {
            p1Var = new p208z5.p1(j10, cVar);
        }
        java.lang.Object objH = p1Var.j;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = p1Var.f32786l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            java.util.List list = ((p208z5.B0) j10.f32506o.getValue()).j;
            int iI0 = p078i6.D.I0(p078i6.q.I0(list, 10));
            if (iI0 < 16) {
                iI0 = 16;
            }
            linkedHashMap = new java.util.LinkedHashMap(iI0);
            for (java.lang.Object obj2 : list) {
                int i10 = ((com.kiptv.core.model.XtreamVODStream) obj2).f20725d;
                if (i10 < 0) {
                    com.kiptv.core.model.MyListItem.INSTANCE.getClass();
                    strValueOf = "tmdb:" + (-i10);
                } else {
                    strValueOf = java.lang.String.valueOf(i10);
                }
                linkedHashMap.put(strValueOf, obj2);
            }
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20885i;
            p1Var.f32783h = j10;
            p1Var.f32784i = linkedHashMap;
            p1Var.f32786l = 1;
            objH = j10.f32498e.h(z0Var, p1Var);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.LinkedHashMap linkedHashMap2 = p1Var.f32784i;
            p208z5.J1 j11 = p1Var.f32783h;
            com.google.common.util.concurrent.P.u0(objH);
            linkedHashMap = linkedHashMap2;
            j10 = j11;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p070h6.k kVar : (java.lang.Iterable) objH) {
            java.lang.String str = (java.lang.String) kVar.f22539h;
            java.lang.String str2 = (java.lang.String) kVar.f22540i;
            java.util.ArrayList arrayListG = j10.f32498e.g(str, com.kiptv.core.model.z0.f20885i);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayListG.iterator();
            while (it.hasNext()) {
                com.kiptv.core.model.XtreamVODStream xtreamVODStream = (com.kiptv.core.model.XtreamVODStream) linkedHashMap.get(((com.kiptv.core.model.MyListItem) it.next()).f19875d);
                if (xtreamVODStream != null) {
                    arrayList2.add(xtreamVODStream);
                }
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList2) {
                if (hashSet.add(new java.lang.Integer(((com.kiptv.core.model.XtreamVODStream) obj3).f20725d))) {
                    arrayList3.add(obj3);
                }
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            p208z5.Y y = arrayList3 != null ? new p208z5.Y(str, str2, arrayList3) : null;
            if (y != null) {
                arrayList.add(y);
            }
        }
        V7.n0 n0Var = j10.f32506o;
        while (true) {
            java.lang.Object value = n0Var.getValue();
            java.util.ArrayList arrayList4 = arrayList;
            if (n0Var.g(value, p208z5.B0.a((p208z5.B0) value, false, null, null, null, null, null, null, null, null, null, arrayList4, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, -1025))) {
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
    public static final java.lang.Object g(p208z5.J1 j9, com.kiptv.core.model.XtreamVODStream xtreamVODStream, p117n6.c cVar) {
        p208z5.y1 y1Var;
        java.lang.Object objT;
        j9.getClass();
        if (cVar instanceof p208z5.y1) {
            y1Var = (p208z5.y1) cVar;
            int i3 = y1Var.f32929l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y1Var.f32929l = i3 - Integer.MIN_VALUE;
            } else {
                y1Var = new p208z5.y1(j9, cVar);
            }
        } else {
            y1Var = new p208z5.y1(j9, cVar);
        }
        java.lang.Object objT2 = y1Var.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = y1Var.f32929l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objT2);
                if (j9.H.contains(new java.lang.Integer(xtreamVODStream.f20725d))) {
                    return null;
                }
                y1Var.f32926h = j9;
                y1Var.f32927i = xtreamVODStream;
                y1Var.f32929l = 1;
                objT2 = j9.t(xtreamVODStream, true, y1Var);
                if (objT2 != aVar) {
                }
                return aVar;
            }
            if (i9 == 1) {
                xtreamVODStream = y1Var.f32927i;
                j9 = y1Var.f32926h;
                com.google.common.util.concurrent.P.u0(objT2);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objT2);
            }
            objT = (com.kiptv.core.model.TMDBMovieDetail) objT2;
            if (objT instanceof p070h6.m) {
                objT = null;
            }
            com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = (com.kiptv.core.model.TMDBMovieDetail) objT;
            if (tMDBMovieDetail == null) {
                return null;
            }
            return t5.AbstractC2793d1.l0(tMDBMovieDetail.j);
            java.lang.Integer num = (java.lang.Integer) objT2;
            if (num == null) {
                java.util.concurrent.ConcurrentHashMap.KeySetView ratingMisses = j9.H;
                kotlin.jvm.internal.m.d(ratingMisses, "ratingMisses");
                ratingMisses.add(new java.lang.Integer(xtreamVODStream.f20725d));
                return null;
            }
            p005a5.C1451x5 c1451x5 = j9.f32496c;
            int iIntValue = num.intValue();
            y1Var.f32926h = null;
            y1Var.f32927i = null;
            y1Var.f32929l = 2;
            objT2 = c1451x5.p(iIntValue, y1Var);
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
    }

    public static java.lang.String q(com.kiptv.core.model.XtreamVODStream xtreamVODStream) {
        int i3 = xtreamVODStream.f20725d;
        return i3 < 0 ? com.google.android.gms.internal.play_billing.M0.l(-i3, "tmdb:") : java.lang.String.valueOf(i3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object h(com.kiptv.core.model.XtreamVODStream xtreamVODStream, java.lang.String str, p117n6.c cVar) {
        p208z5.J0 j9;
        p208z5.J1 j10;
        if (cVar instanceof p208z5.J0) {
            j9 = (p208z5.J0) cVar;
            int i3 = j9.f32486l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j9.f32486l = i3 - Integer.MIN_VALUE;
            } else {
                j9 = new p208z5.J0(this, cVar);
            }
        } else {
            j9 = new p208z5.J0(this, cVar);
        }
        p208z5.J0 j11 = j9;
        java.lang.Object objC = j11.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = j11.f32486l;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objC);
                com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20885i;
                j11.f32483h = this;
                j11.f32484i = xtreamVODStream;
                j11.f32486l = 1;
                objC = this.f32498e.c(str, z0Var, j11);
                if (objC != aVar) {
                    j10 = this;
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
            xtreamVODStream = j11.f32484i;
            j10 = j11.f32483h;
            com.google.common.util.concurrent.P.u0(objC);
            java.lang.String str2 = (java.lang.String) objC;
            if (str2 != null) {
                p005a5.D0 d4 = j10.f32498e;
                java.lang.String strQ = q(xtreamVODStream);
                com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.f20885i;
                java.lang.String str3 = xtreamVODStream.f20723b;
                java.lang.String strA = xtreamVODStream.a();
                int i10 = xtreamVODStream.f20725d;
                java.lang.Integer numValueOf = i10 < 0 ? java.lang.Integer.valueOf(-i10) : null;
                if (numValueOf == null) {
                    numValueOf = xtreamVODStream.c();
                }
                j11.f32483h = null;
                j11.f32484i = null;
                j11.f32486l = 2;
                if (d4.m(strQ, z0Var2, str2, str3, strA, numValueOf, j11) == aVar) {
                    return aVar;
                }
            }
        } catch (java.lang.Throwable th) {
            com.google.common.util.concurrent.P.T(th);
        }
        return a2;
    }

    public final java.util.Set i(com.kiptv.core.model.XtreamVODStream xtreamVODStream) {
        return p078i6.o.R1(this.f32498e.o(q(xtreamVODStream), com.kiptv.core.model.z0.f20885i));
    }

    public final java.lang.String j(java.lang.String str) {
        return (java.lang.String) this.f32489C.get(str);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final V7.W getF32494I() {
        return this.f32494I;
    }

    public final java.lang.Object l() {
        return this.f32505n;
    }

    public final V7.l0 m() {
        return this.f32507p;
    }

    public final boolean n(java.lang.String str) {
        com.kiptv.core.model.C1944g0 c1944g0;
        com.kiptv.core.model.ContentTypeSettings contentTypeSettings;
        com.kiptv.core.model.PlaylistSettings playlistSettingsA = this.g.a();
        if (playlistSettingsA == null || (c1944g0 = playlistSettingsA.f20062i) == null || (contentTypeSettings = c1944g0.f20755b) == null) {
            return false;
        }
        return E8.l.C(str, this.f32513v, contentTypeSettings);
    }

    public final java.lang.Integer o(com.kiptv.core.model.XtreamVODStream xtreamVODStream) {
        return this.g.o(xtreamVODStream.f20725d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(java.lang.String str, boolean z6, p117n6.c cVar) {
        p208z5.P0 p2;
        p208z5.J1 j9;
        if (cVar instanceof p208z5.P0) {
            p2 = (p208z5.P0) cVar;
            int i3 = p2.f32553m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p2.f32553m = i3 - Integer.MIN_VALUE;
            } else {
                p2 = new p208z5.P0(this, cVar);
            }
        } else {
            p2 = new p208z5.P0(this, cVar);
        }
        java.lang.Object objH = p2.f32551k;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = p2.f32553m;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20885i;
            p2.f32549h = this;
            p2.f32550i = str;
            p2.j = z6;
            p2.f32553m = 1;
            objH = this.f32498e.h(z0Var, p2);
            if (objH != obj) {
                j9 = this;
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
        str = p2.f32550i;
        j9 = p2.f32549h;
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
            p005a5.D0 d4 = j9.f32498e;
            com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.f20885i;
            p2.f32549h = null;
            p2.f32550i = null;
            p2.f32553m = 2;
            if (d4.l(arrayListO1, z0Var2, p2) == obj) {
                return obj;
            }
        }
        return a2;
    }

    public final void r(com.kiptv.core.model.XtreamVODStream movie) {
        V7.n0 n0Var;
        java.lang.Object value;
        p208z5.J1 j9;
        kotlin.jvm.internal.m.e(movie, "movie");
        do {
            n0Var = this.f32506o;
            value = n0Var.getValue();
        } while (!n0Var.g(value, p208z5.B0.a((p208z5.B0) value, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, movie, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, -32769)));
        java.lang.String strA = movie.a();
        if ((strA == null || strA.length() == 0) && !((p208z5.B0) n0Var.getValue()).f32421v.containsKey(java.lang.Integer.valueOf(movie.f20725d))) {
            j9 = this;
            j9.f32492F.c(movie, true);
        } else {
            j9 = this;
        }
        p208z5.k1 k1Var = new p208z5.k1(movie, null, j9);
        S7.w0 w0Var = j9.f32512u;
        if (w0Var != null) {
            w0Var.e(null);
        }
        j9.f32512u = S7.C.A(androidx.lifecycle.X.h(j9), null, new p208z5.A1(k1Var, null), 3);
    }

    public final void s(com.kiptv.core.model.XtreamVODStream movie) {
        kotlin.jvm.internal.m.e(movie, "movie");
        this.f32492F.c(movie, false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object t(com.kiptv.core.model.XtreamVODStream xtreamVODStream, boolean z6, p117n6.c cVar) {
        p208z5.x1 x1Var;
        java.lang.Throwable th;
        p208z5.J1 j9;
        boolean z9;
        java.lang.Object objT;
        if (cVar instanceof p208z5.x1) {
            x1Var = (p208z5.x1) cVar;
            int i3 = x1Var.f32916m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x1Var.f32916m = i3 - Integer.MIN_VALUE;
            } else {
                x1Var = new p208z5.x1(this, cVar);
            }
        } else {
            x1Var = new p208z5.x1(this, cVar);
        }
        p208z5.x1 x1Var2 = x1Var;
        java.lang.Object objH = x1Var2.f32914k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = x1Var2.f32916m;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            java.lang.Integer numO = this.g.o(xtreamVODStream.f20725d);
            if (numO != null) {
                java.lang.Integer num = new java.lang.Integer(numO.intValue());
                if (num.intValue() > 0) {
                    return num;
                }
            } else {
                java.lang.Integer numC = xtreamVODStream.c();
                if (numC != null) {
                    return new java.lang.Integer(numC.intValue());
                }
                java.lang.Integer num2 = (java.lang.Integer) this.f32510s.get(new java.lang.Integer(xtreamVODStream.f20725d));
                if (num2 != null) {
                    java.lang.Integer num3 = new java.lang.Integer(num2.intValue());
                    if (num3.intValue() > 0) {
                        return num3;
                    }
                } else {
                    try {
                        p005a5.C1451x5 c1451x5 = this.f32496c;
                        try {
                            java.lang.String str = xtreamVODStream.f20723b;
                            java.lang.String str2 = xtreamVODStream.f20732m;
                            x1Var2.f32912h = this;
                            x1Var2.f32913i = xtreamVODStream;
                            x1Var2.j = z6;
                            x1Var2.f32916m = 1;
                            z9 = z6;
                            try {
                                objH = p005a5.C1451x5.h(c1451x5, str, null, str2, z9, x1Var2, 2);
                                if (objH == aVar) {
                                    return aVar;
                                }
                                j9 = this;
                                z6 = z9;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                th = th;
                                j9 = this;
                                z6 = z9;
                                objT = com.google.common.util.concurrent.P.T(th);
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            z9 = z6;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        j9 = this;
                    }
                }
            }
            return null;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z6 = x1Var2.j;
        xtreamVODStream = x1Var2.f32913i;
        j9 = x1Var2.f32912h;
        try {
            com.google.common.util.concurrent.P.u0(objH);
        } catch (java.lang.Throwable th5) {
            th = th5;
            objT = com.google.common.util.concurrent.P.T(th);
        }
        com.kiptv.core.model.p0 p0Var = (com.kiptv.core.model.p0) objH;
        objT = p0Var != null ? new java.lang.Integer(p0Var.f20815a) : null;
        java.lang.Integer num4 = (java.lang.Integer) (objT instanceof p070h6.m ? null : objT);
        if (num4 != null || !z6) {
            j9.f32510s.put(new java.lang.Integer(xtreamVODStream.f20725d), new java.lang.Integer(num4 != null ? num4.intValue() : 0));
        }
        return num4;
    }

    public final com.kiptv.core.model.XtreamVODStream u(com.kiptv.core.model.TMDBSearchResult tMDBSearchResult) {
        return (com.kiptv.core.model.XtreamVODStream) ((java.util.Map) ((V7.n0) this.f32499f.f15210q.f10419h).getValue()).get(java.lang.Integer.valueOf(tMDBSearchResult.f20292a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.io.Serializable v(java.lang.String str, p117n6.c cVar) {
        p208z5.B1 b9;
        if (cVar instanceof p208z5.B1) {
            b9 = (p208z5.B1) cVar;
            int i3 = b9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b9.j = i3 - Integer.MIN_VALUE;
            } else {
                b9 = new p208z5.B1(this, cVar);
            }
        } else {
            b9 = new p208z5.B1(this, cVar);
        }
        java.lang.Object objG = b9.f32425h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = b9.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            b9.j = 1;
            objG = this.f32496c.G(str, true, b9);
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
            java.lang.String strL = tMDBSearchResult.f20293b;
            int i10 = tMDBSearchResult.f20292a;
            if (strL == null && (strL = tMDBSearchResult.f20294c) == null && (strL = tMDBSearchResult.f20295d) == null) {
                strL = com.google.android.gms.internal.play_billing.M0.l(i10, "#");
            }
            java.lang.String str2 = tMDBSearchResult.f20299i;
            if (str2 == null) {
                str2 = tMDBSearchResult.j;
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

    public final void w(java.lang.String categoryId) {
        kotlin.jvm.internal.m.e(categoryId, "categoryId");
        S7.C.A(androidx.lifecycle.X.h(this), null, new p208z5.E1(this, categoryId, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object x(com.kiptv.core.model.XtreamVODStream xtreamVODStream, java.lang.String str, p117n6.c cVar) {
        p208z5.G1 g9;
        if (cVar instanceof p208z5.G1) {
            g9 = (p208z5.G1) cVar;
            int i3 = g9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g9.j = i3 - Integer.MIN_VALUE;
            } else {
                g9 = new p208z5.G1(this, cVar);
            }
        } else {
            g9 = new p208z5.G1(this, cVar);
        }
        p208z5.G1 g10 = g9;
        java.lang.Object obj = g10.f32467h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = g10.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                p005a5.D0 d4 = this.f32498e;
                java.lang.String strQ = q(xtreamVODStream);
                com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20885i;
                java.lang.String str2 = xtreamVODStream.f20723b;
                java.lang.String strA = xtreamVODStream.a();
                int i10 = xtreamVODStream.f20725d;
                java.lang.Integer numValueOf = i10 < 0 ? java.lang.Integer.valueOf(-i10) : null;
                if (numValueOf == null) {
                    numValueOf = xtreamVODStream.c();
                }
                g10.j = 1;
                if (d4.m(strQ, z0Var, str, str2, strA, numValueOf, g10) == aVar) {
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
}
