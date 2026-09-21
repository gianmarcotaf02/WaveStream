package p159s5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Ls5/w;", "Landroidx/lifecycle/e0;", "Companion", "s5/p", "s5/o", "s5/n", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class w extends androidx.lifecycle.e0 {
    public static final p159s5.n Companion = new p159s5.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1291h4 f27339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.Z1 f27340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.C1451x5 f27341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.D0 f27342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a5.x9 f27343f;
    public java.lang.Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p159s5.e f27344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f27345i;
    public final p159s5.C j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f27346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.W f27347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V7.n0 f27348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V7.W f27349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p005a5.T1 f27350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V7.n0 f27351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V7.W f27352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p005a5.T1 f27353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f27354s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f27355t;

    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    public w(androidx.lifecycle.U savedStateHandle, p005a5.C1366p contentCache, p005a5.C1291h4 settingsRepository, p005a5.i9 watchProgressRepository, p005a5.Z1 posterFallbackResolver, p005a5.C1451x5 tmdbRepository, p005a5.D0 myListRepository, p005a5.x9 xtreamRepository) {
        p159s5.e eVar;
        int i3;
        int i9;
        p159s5.C a2;
        java.lang.Integer numZ0;
        V7.W w6;
        final int i10 = 1;
        kotlin.jvm.internal.m.e(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.m.e(contentCache, "contentCache");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(watchProgressRepository, "watchProgressRepository");
        kotlin.jvm.internal.m.e(posterFallbackResolver, "posterFallbackResolver");
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(myListRepository, "myListRepository");
        kotlin.jvm.internal.m.e(xtreamRepository, "xtreamRepository");
        this.f27339b = settingsRepository;
        this.f27340c = posterFallbackResolver;
        this.f27341d = tmdbRepository;
        this.f27342e = myListRepository;
        this.f27343f = xtreamRepository;
        p159s5.n nVar = Companion;
        java.lang.String str = (java.lang.String) savedStateHandle.a("type");
        str = str == null ? "movies" : str;
        nVar.getClass();
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        if (lowerCase.equals("series")) {
            eVar = p159s5.e.f27275i;
        } else {
            eVar = lowerCase.equals("live") ? p159s5.e.j : p159s5.e.f27274h;
        }
        this.f27344h = eVar;
        java.lang.String str2 = (java.lang.String) savedStateHandle.a("categoryId");
        java.lang.String strDecode = android.net.Uri.decode(str2 == null ? "" : str2);
        kotlin.jvm.internal.m.d(strDecode, "decode(...)");
        this.f27345i = strDecode;
        p159s5.C.Companion.getClass();
        int i11 = 4;
        if (O7.x.x0(strDecode, "home:", false)) {
            i3 = 3;
            java.util.List listB1 = O7.q.b1(O7.q.V0(strDecode, "home:"), new java.lang.String[]{":"}, 0, 6);
            java.lang.String str3 = (java.lang.String) p078i6.o.k1(1, listB1);
            int iIntValue = (str3 == null || (numZ0 = O7.x.z0(str3)) == null) ? 30 : numZ0.intValue();
            java.lang.String str4 = (java.lang.String) p078i6.o.j1(listB1);
            i9 = 0;
            if (str4 == null) {
                a2 = null;
            } else {
                int iHashCode = str4.hashCode();
                if (iHashCode != -1060275094) {
                    if (iHashCode != 1200187774) {
                        if (iHashCode == 1362608306 && str4.equals("recentSeries")) {
                            a2 = new p159s5.B(iIntValue);
                        } else {
                            a2 = null;
                        }
                    } else if (str4.equals("recentMovies")) {
                        a2 = new p159s5.A(iIntValue);
                    } else {
                        a2 = null;
                    }
                } else if (str4.equals("myList")) {
                    a2 = kotlin.jvm.internal.m.a(p078i6.o.k1(1, listB1), "series") ? p159s5.z.f27358a : p159s5.y.f27357a;
                } else {
                    a2 = null;
                }
            }
        } else {
            i9 = 0;
            a2 = null;
            i3 = 3;
        }
        this.j = a2;
        V7.n0 n0VarB = V7.r.b(p159s5.D.f27269h);
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            w6 = contentCache.f14910d;
        } else if (iOrdinal == 1) {
            w6 = contentCache.j;
        } else {
            if (iOrdinal != 2) {
                throw new I3.b();
            }
            w6 = contentCache.f14920p;
        }
        java.lang.String str5 = (java.lang.String) savedStateHandle.a(io.ktor.http.LinkHeader.Parameters.Title);
        java.lang.String strDecode2 = android.net.Uri.decode(str5 != null ? str5 : "");
        kotlin.jvm.internal.m.d(strDecode2, "decode(...)");
        this.f27346k = strDecode2;
        p159s5.q qVar = new p159s5.q(this, null);
        V7.W w9 = contentCache.f14912f;
        V7.W w10 = contentCache.f14916l;
        V7.W w11 = contentCache.f14922r;
        V7.InterfaceC0981g[] interfaceC0981gArr = new V7.InterfaceC0981g[5];
        interfaceC0981gArr[i9] = w9;
        interfaceC0981gArr[1] = w10;
        interfaceC0981gArr[2] = w11;
        interfaceC0981gArr[i3] = w6;
        interfaceC0981gArr[4] = n0VarB;
        int i12 = i3;
        p100l6.c cVar = null;
        this.f27347l = V7.r.u(V7.r.i(new V7.Q(interfaceC0981gArr, qVar), settingsRepository.f14559m, V7.r.j(new V4.I(watchProgressRepository.f14630n, watchProgressRepository.f14636t, new p159s5.v(i12, cVar, i9)), new V4.I(watchProgressRepository.f14634r, watchProgressRepository.f14638v, new p159s5.v(i12, cVar, i10)), new V4.I(watchProgressRepository.f14632p, watchProgressRepository.f14640x, new p159s5.v(i12, cVar, 2)), new p005a5.V6(i11, cVar, i10)), settingsRepository.f14556i, new p159s5.u(0, this, cVar)), androidx.lifecycle.X.h(this), V7.d0.a(2), new p159s5.l(eVar, strDecode, strDecode, null, null, 8184));
        p078i6.x xVar = p078i6.x.f23206h;
        V7.n0 n0VarB2 = V7.r.b(xVar);
        this.f27348m = n0VarB2;
        this.f27349n = new V7.W(n0VarB2);
        p057g2.a aVarH = androidx.lifecycle.X.h(this);
        Z7.e eVar2 = S7.M.f9549a;
        final int i13 = 0;
        this.f27350o = new p005a5.T1(aVarH, new q5.i(8), new I5.q2(i10, this, null), new p194x6.m(this) { // from class: s5.m

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p159s5.w f27312i;

            {
                this.f27312i = this;
            }

            @Override // p194x6.m
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object value;
                java.lang.Object value2;
                switch (i13) {
                    case 0:
                        java.lang.String key = (java.lang.String) obj;
                        java.lang.String url = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(key, "key");
                        kotlin.jvm.internal.m.e(url, "url");
                        V7.n0 n0Var = this.f27312i.f27348m;
                        do {
                            value = n0Var.getValue();
                        } while (!n0Var.g(value, p078i6.C.S0((java.util.Map) value, new p070h6.k(key, url))));
                        break;
                    default:
                        java.lang.String key2 = (java.lang.String) obj;
                        java.lang.String label = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(key2, "key");
                        kotlin.jvm.internal.m.e(label, "label");
                        V7.n0 n0Var2 = this.f27312i.f27351p;
                        do {
                            value2 = n0Var2.getValue();
                        } while (!n0Var2.g(value2, p078i6.C.S0((java.util.Map) value2, new p070h6.k(key2, label))));
                        break;
                }
                return p070h6.A.f22523a;
            }
        }, eVar2, 48);
        V7.n0 n0VarB3 = V7.r.b(xVar);
        this.f27351p = n0VarB3;
        this.f27352q = new V7.W(n0VarB3);
        this.f27353r = new p005a5.T1(androidx.lifecycle.X.h(this), new q5.i(9), new I5.r2(i10, this, null), new p194x6.m(this) { // from class: s5.m

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p159s5.w f27312i;

            {
                this.f27312i = this;
            }

            @Override // p194x6.m
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object value;
                java.lang.Object value2;
                switch (i10) {
                    case 0:
                        java.lang.String key = (java.lang.String) obj;
                        java.lang.String url = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(key, "key");
                        kotlin.jvm.internal.m.e(url, "url");
                        V7.n0 n0Var = this.f27312i.f27348m;
                        do {
                            value = n0Var.getValue();
                        } while (!n0Var.g(value, p078i6.C.S0((java.util.Map) value, new p070h6.k(key, url))));
                        break;
                    default:
                        java.lang.String key2 = (java.lang.String) obj;
                        java.lang.String label = (java.lang.String) obj2;
                        kotlin.jvm.internal.m.e(key2, "key");
                        kotlin.jvm.internal.m.e(label, "label");
                        V7.n0 n0Var2 = this.f27312i.f27351p;
                        do {
                            value2 = n0Var2.getValue();
                        } while (!n0Var2.g(value2, p078i6.C.S0((java.util.Map) value2, new p070h6.k(key2, label))));
                        break;
                }
                return p070h6.A.f22523a;
            }
        }, eVar2, 32);
        this.f27354s = new java.util.concurrent.ConcurrentHashMap();
        this.f27355t = java.util.concurrent.ConcurrentHashMap.newKeySet();
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0147 A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #1 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x016a, B:21:0x0043, B:83:0x0156, B:80:0x0147, B:84:0x015b), top: B:103:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x015b A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:15:0x0032, B:87:0x016a, B:21:0x0043, B:83:0x0156, B:80:0x0147, B:84:0x015b), top: B:103:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0169  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x0178  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r12v10, types: [s5.w] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [s5.w] */
    /* JADX WARN: Type inference failed for: r13v0, types: [s5.d] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static final java.lang.Object e(p159s5.w wVar, p159s5.AbstractC2743d abstractC2743d, p117n6.c cVar) {
        p159s5.s sVar;
        java.lang.Object objT;
        ?? r14;
        ?? r13;
        ?? r12;
        java.lang.Object objT2;
        ?? r15;
        ?? r16;
        ?? r17;
        int iIntValue;
        ?? r18;
        ?? r19;
        ?? r110;
        ?? r111;
        java.lang.Object objP;
        java.lang.Object objW;
        ?? r9;
        ?? r112;
        p159s5.w wVar2;
        ?? r10;
        ?? r113;
        p159s5.w wVar3;
        java.lang.String str;
        com.kiptv.core.model.p0 p0Var;
        java.lang.String str2;
        ?? r114;
        p159s5.o oVar;
        java.lang.String strZ;
        wVar.getClass();
        if (cVar instanceof p159s5.s) {
            sVar = (p159s5.s) cVar;
            int i3 = sVar.f27330m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sVar.f27330m = i3 - Integer.MIN_VALUE;
            } else {
                sVar = new p159s5.s(wVar, cVar);
            }
        } else {
            sVar = new p159s5.s(wVar, cVar);
        }
        p159s5.s sVar2 = sVar;
        ?? r115 = sVar2.f27328k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = sVar2.f27330m;
        try {
            try {
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(r115);
                    r114 = abstractC2743d instanceof p159s5.C2742c;
                    boolean z6 = abstractC2743d instanceof p159s5.C2741b;
                    p005a5.C1291h4 c1291h4 = wVar.f27339b;
                    if (z6) {
                        p159s5.C2741b c2741b = (p159s5.C2741b) abstractC2743d;
                        java.lang.Integer numO = c1291h4.o(c2741b.f27272a.f20725d);
                        com.kiptv.core.model.XtreamVODStream xtreamVODStream = c2741b.f27272a;
                        oVar = new p159s5.o(numO, xtreamVODStream.c(), xtreamVODStream.f20723b, xtreamVODStream.f20732m);
                    } else {
                        if (r114 == 0) {
                            if (abstractC2743d instanceof p159s5.C2740a) {
                                return null;
                            }
                            throw new I3.b();
                        }
                        p159s5.C2742c c2742c = (p159s5.C2742c) abstractC2743d;
                        java.lang.Integer numT = c1291h4.t(c2742c.f27273a.f20684c);
                        com.kiptv.core.model.XtreamSeries xtreamSeries = c2742c.f27273a;
                        oVar = new p159s5.o(numT, xtreamSeries.e(), xtreamSeries.f20683b, xtreamSeries.f20694o);
                    }
                    java.lang.Integer num = oVar.f27313a;
                    if (num == null || num.intValue() != 0) {
                        strZ = com.google.android.gms.internal.play_billing.AbstractC1853k0.z(abstractC2743d);
                        if (!wVar.f27355t.contains(strZ)) {
                            if (num == null && (num = oVar.f27314b) == null && (num = (java.lang.Integer) wVar.f27354s.get(strZ)) == null) {
                                java.lang.String str3 = oVar.f27315c;
                                java.lang.String str4 = oVar.f27316d;
                                if (r114 != 0) {
                                    p005a5.C1451x5 c1451x5 = wVar.f27341d;
                                    sVar2.f27326h = wVar;
                                    sVar2.f27327i = strZ;
                                    sVar2.j = r114;
                                    sVar2.f27330m = 1;
                                    java.lang.Object objI = p005a5.C1451x5.i(c1451x5, str3, null, str4, true, sVar2, 2);
                                    if (objI == aVar) {
                                        r9 = objI;
                                        wVar2 = wVar;
                                        str2 = strZ;
                                        r112 = r114;
                                        return aVar;
                                    }
                                    r9 = objI;
                                    wVar2 = wVar;
                                    str2 = strZ;
                                    r112 = r114;
                                    p0Var = (com.kiptv.core.model.p0) r9;
                                    wVar = wVar2;
                                    abstractC2743d = str2;
                                    r115 = r112;
                                } else {
                                    p005a5.C1451x5 c1451x6 = wVar.f27341d;
                                    sVar2.f27326h = wVar;
                                    sVar2.f27327i = strZ;
                                    sVar2.j = r114;
                                    sVar2.f27330m = 2;
                                    java.lang.Object objH = p005a5.C1451x5.h(c1451x6, str3, null, str4, true, sVar2, 2);
                                    if (objH == aVar) {
                                        r10 = objH;
                                        wVar3 = wVar;
                                        str = strZ;
                                        r113 = r114;
                                        return aVar;
                                    }
                                    r10 = objH;
                                    wVar3 = wVar;
                                    str = strZ;
                                    r113 = r114;
                                    p0Var = (com.kiptv.core.model.p0) r10;
                                    wVar = wVar3;
                                    abstractC2743d = str;
                                    r115 = r113;
                                }
                            } else {
                                iIntValue = num.intValue();
                                r111 = wVar;
                                r110 = r114;
                            }
                            if (r110 != 0) {
                                r111 = r17;
                                r110 = r15;
                                p005a5.C1451x5 c1451x7 = r111.f27341d;
                                sVar2.f27326h = null;
                                sVar2.f27327i = null;
                                sVar2.f27330m = 3;
                                objW = c1451x7.w(iIntValue, sVar2);
                                if (objW == aVar) {
                                    r19 = objW;
                                    return aVar;
                                }
                                r19 = objW;
                                objT = ((com.kiptv.core.model.TMDBSeriesDetail) r19).f20323l;
                                return t5.AbstractC2793d1.l0((java.lang.Double) (objT instanceof p070h6.m ? null : objT));
                            }
                            r111 = r17;
                            r110 = r15;
                            p005a5.C1451x5 c1451x8 = r111.f27341d;
                            sVar2.f27326h = null;
                            sVar2.f27327i = null;
                            sVar2.f27330m = 4;
                            objP = c1451x8.p(iIntValue, sVar2);
                            if (objP == aVar) {
                                r18 = objP;
                                return aVar;
                            }
                            r18 = objP;
                            objT = ((com.kiptv.core.model.TMDBMovieDetail) r18).j;
                            return t5.AbstractC2793d1.l0((java.lang.Double) (objT instanceof p070h6.m ? null : objT));
                        }
                    }
                    return null;
                }
                try {
                    if (i9 == 1) {
                        int i10 = sVar2.j;
                        java.lang.String str5 = sVar2.f27327i;
                        p159s5.w wVar4 = sVar2.f27326h;
                        com.google.common.util.concurrent.P.u0(r115);
                        r9 = r115;
                        r112 = i10;
                        wVar2 = wVar4;
                        str2 = str5;
                        r9 = objI;
                        wVar2 = wVar;
                        str2 = strZ;
                        r112 = r114;
                        p0Var = (com.kiptv.core.model.p0) r9;
                        wVar = wVar2;
                        abstractC2743d = str2;
                        r115 = r112;
                    } else {
                        if (i9 != 2) {
                            if (i9 == 3) {
                                com.google.common.util.concurrent.P.u0(r115);
                                r19 = r115;
                                r19 = objW;
                                objT = ((com.kiptv.core.model.TMDBSeriesDetail) r19).f20323l;
                                return t5.AbstractC2793d1.l0((java.lang.Double) (objT instanceof p070h6.m ? null : objT));
                            }
                            if (i9 != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.google.common.util.concurrent.P.u0(r115);
                            r18 = r115;
                            r18 = objP;
                            objT = ((com.kiptv.core.model.TMDBMovieDetail) r18).j;
                            return t5.AbstractC2793d1.l0((java.lang.Double) (objT instanceof p070h6.m ? null : objT));
                        }
                        int i11 = sVar2.j;
                        java.lang.String str6 = sVar2.f27327i;
                        p159s5.w wVar5 = sVar2.f27326h;
                        com.google.common.util.concurrent.P.u0(r115);
                        r10 = r115;
                        r113 = i11;
                        wVar3 = wVar5;
                        str = str6;
                        r10 = objH;
                        wVar3 = wVar;
                        str = strZ;
                        r113 = r114;
                        p0Var = (com.kiptv.core.model.p0) r10;
                        wVar = wVar3;
                        abstractC2743d = str;
                        r115 = r113;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    r14 = wVar;
                    r12 = 2;
                    r13 = abstractC2743d;
                    objT2 = com.google.common.util.concurrent.P.T(th);
                    r17 = r12;
                    r16 = r13;
                    r15 = r14;
                }
                if (p0Var != null) {
                    objT2 = new java.lang.Integer(p0Var.f20815a);
                    r17 = wVar;
                    r16 = abstractC2743d;
                    r15 = r115;
                } else {
                    objT2 = null;
                    r17 = wVar;
                    r16 = abstractC2743d;
                    r15 = r115;
                }
            } catch (java.lang.Throwable th2) {
                objT = com.google.common.util.concurrent.P.T(th2);
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            r12 = wVar;
            r13 = abstractC2743d;
            r14 = r115;
        }
        if (objT2 instanceof p070h6.m) {
            objT2 = null;
        }
        java.lang.Integer num2 = (java.lang.Integer) objT2;
        if (num2 != null) {
            r17.f27354s.put(r16, new java.lang.Integer(num2.intValue()));
        } else {
            num2 = null;
        }
        if (num2 == null) {
            java.util.concurrent.ConcurrentHashMap.KeySetView ratingMisses = r17.f27355t;
            kotlin.jvm.internal.m.d(ratingMisses, "ratingMisses");
            ratingMisses.add(r16);
            return null;
        }
        iIntValue = num2.intValue();
        if (r110 != 0) {
            r111 = r17;
            r110 = r15;
            p005a5.C1451x5 c1451x9 = r111.f27341d;
            sVar2.f27326h = null;
            sVar2.f27327i = null;
            sVar2.f27330m = 3;
            objW = c1451x9.w(iIntValue, sVar2);
            if (objW == aVar) {
                r19 = objW;
                return aVar;
            }
            r19 = objW;
            objT = ((com.kiptv.core.model.TMDBSeriesDetail) r19).f20323l;
            return t5.AbstractC2793d1.l0((java.lang.Double) (objT instanceof p070h6.m ? null : objT));
        }
        r111 = r17;
        r110 = r15;
        p005a5.C1451x5 c1451x10 = r111.f27341d;
        sVar2.f27326h = null;
        sVar2.f27327i = null;
        sVar2.f27330m = 4;
        objP = c1451x10.p(iIntValue, sVar2);
        if (objP == aVar) {
            r18 = objP;
            return aVar;
        }
        r18 = objP;
        objT = ((com.kiptv.core.model.TMDBMovieDetail) r18).j;
        return t5.AbstractC2793d1.l0((java.lang.Double) (objT instanceof p070h6.m ? null : objT));
    }

    public static final java.lang.String f(p159s5.w wVar, p159s5.AbstractC2743d abstractC2743d) {
        wVar.getClass();
        if (abstractC2743d instanceof p159s5.C2741b) {
            return ((p159s5.C2741b) abstractC2743d).f27272a.f20723b;
        }
        if (abstractC2743d instanceof p159s5.C2742c) {
            return ((p159s5.C2742c) abstractC2743d).f27273a.f20683b;
        }
        if (abstractC2743d instanceof p159s5.C2740a) {
            return P3.e.a0(((p159s5.C2740a) abstractC2743d).f27271a);
        }
        throw new I3.b();
    }

    public static java.util.List g(int i3, java.util.List list, p194x6.j jVar) {
        if (i3 >= 30) {
            return list;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - (((long) i3) * 86400000);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.Long l2 = (java.lang.Long) jVar.invoke(obj);
            if ((l2 != null ? l2.longValue() : 0L) >= jCurrentTimeMillis) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
