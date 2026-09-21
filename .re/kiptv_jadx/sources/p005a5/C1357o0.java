package p005a5;

/* JADX INFO: renamed from: a5.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1357o0 {
    public static final p005a5.P Companion = new p005a5.P();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f14848A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a5.C1451x5 f14849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.i9 f14850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.D0 f14851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.F6 f14852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1263e6 f14853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a5.B3 f14854f;
    public final V7.n0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.W f14855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.n0 f14856i;
    public final V7.W j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.n0 f14857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.W f14858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V7.n0 f14859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V7.W f14860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.String f14861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.lang.String f14862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.LinkedHashMap f14863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.util.LinkedHashMap f14864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.util.LinkedHashMap f14865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.LinkedHashMap f14866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.util.LinkedHashSet f14867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p028c8.d f14868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f14870x;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f14871z;

    public C1357o0(p005a5.C1451x5 tmdbRepository, p005a5.x9 xtreamRepository, p005a5.i9 watchProgressRepository, p005a5.D0 myListRepository, p005a5.F6 traktLists, p005a5.C1263e6 traktAccount, p005a5.B3 searchRepository) {
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(xtreamRepository, "xtreamRepository");
        kotlin.jvm.internal.m.e(watchProgressRepository, "watchProgressRepository");
        kotlin.jvm.internal.m.e(myListRepository, "myListRepository");
        kotlin.jvm.internal.m.e(traktLists, "traktLists");
        kotlin.jvm.internal.m.e(traktAccount, "traktAccount");
        kotlin.jvm.internal.m.e(searchRepository, "searchRepository");
        this.f14849a = tmdbRepository;
        this.f14850b = watchProgressRepository;
        this.f14851c = myListRepository;
        this.f14852d = traktLists;
        this.f14853e = traktAccount;
        this.f14854f = searchRepository;
        V7.n0 n0VarB = V7.r.b(p078i6.w.f23205h);
        this.g = n0VarB;
        this.f14855h = new V7.W(n0VarB);
        V7.n0 n0VarB2 = V7.r.b(p005a5.V.f14006h);
        this.f14856i = n0VarB2;
        this.j = new V7.W(n0VarB2);
        p078i6.x xVar = p078i6.x.f23206h;
        V7.n0 n0VarB3 = V7.r.b(xVar);
        this.f14857k = n0VarB3;
        this.f14858l = new V7.W(n0VarB3);
        V7.n0 n0VarB4 = V7.r.b(xVar);
        this.f14859m = n0VarB4;
        this.f14860n = new V7.W(n0VarB4);
        this.f14863q = new java.util.LinkedHashMap();
        this.f14864r = new java.util.LinkedHashMap();
        this.f14865s = new java.util.LinkedHashMap();
        this.f14866t = new java.util.LinkedHashMap();
        this.f14867u = new java.util.LinkedHashSet();
        this.f14868v = new p028c8.d();
        this.f14869w = 6;
        this.f14870x = 3;
        this.y = 1;
        this.f14871z = 200;
        this.f14848A = 20000L;
    }

    public static final com.kiptv.core.model.XtreamVODStream a(p005a5.C1357o0 c1357o0, com.kiptv.core.model.TMDBSearchResult tMDBSearchResult, S4.x xVar) {
        c1357o0.getClass();
        p005a5.C1381q4 c1381q4 = p005a5.C1451x5.Companion;
        java.lang.String strA = tMDBSearchResult.a();
        java.lang.Integer numB = tMDBSearchResult.b();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(tMDBSearchResult.f20292a);
        c1381q4.getClass();
        P3.e eVarC = p005a5.C1381q4.c(strA, numB, numValueOf, xVar);
        p005a5.C1361o4 c1361o4 = eVarC instanceof p005a5.C1361o4 ? (p005a5.C1361o4) eVarC : null;
        if (c1361o4 != null) {
            return c1361o4.f14884n;
        }
        return null;
    }

    public static final com.kiptv.core.model.XtreamSeries b(p005a5.C1357o0 c1357o0, com.kiptv.core.model.TMDBSearchResult tMDBSearchResult, S4.x xVar) {
        c1357o0.getClass();
        p005a5.C1381q4 c1381q4 = p005a5.C1451x5.Companion;
        java.lang.String strA = tMDBSearchResult.a();
        java.lang.Integer numB = tMDBSearchResult.b();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(tMDBSearchResult.f20292a);
        c1381q4.getClass();
        P3.e eVarC = p005a5.C1381q4.c(strA, numB, numValueOf, xVar);
        p005a5.C1371p4 c1371p4 = eVarC instanceof p005a5.C1371p4 ? (p005a5.C1371p4) eVarC : null;
        if (c1371p4 != null) {
            return c1371p4.f14940n;
        }
        return null;
    }

    public static final p005a5.S f(java.lang.Integer num, com.kiptv.core.model.HomeSectionConfig homeSectionConfig, boolean z6) {
        p070h6.k kVar = new p070h6.k("with_watch_providers", num.toString());
        com.kiptv.core.model.CustomFeedDefinition.Companion companion = com.kiptv.core.model.CustomFeedDefinition.INSTANCE;
        java.lang.String strH = homeSectionConfig.h("sortBy");
        if (strH == null) {
            strH = "popularity.desc";
        }
        companion.getClass();
        return new p005a5.S(z6, p078i6.C.N0(kVar, new p070h6.k("sort_by", com.kiptv.core.model.CustomFeedDefinition.Companion.a(strH, z6)), new p070h6.k("vote_count.gte", "20")), null);
    }

    public static java.util.ArrayList i(java.util.List list, int i3, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i9 = 0;
        int i10 = 0;
        while (arrayList.size() < i3 && (i9 < list.size() || i10 < list2.size())) {
            if (i9 < list.size()) {
                arrayList.add(list.get(i9));
                i9++;
            }
            if (arrayList.size() >= i3) {
                break;
            }
            if (i10 < list2.size()) {
                arrayList.add(list2.get(i10));
                i10++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.lang.String str, p117n6.c cVar) {
        p005a5.Y y;
        p028c8.d dVar;
        p005a5.C1357o0 c1357o0;
        if (cVar instanceof p005a5.Y) {
            y = (p005a5.Y) cVar;
            int i3 = y.f14109m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y.f14109m = i3 - Integer.MIN_VALUE;
            } else {
                y = new p005a5.Y(this, cVar);
            }
        } else {
            y = new p005a5.Y(this, cVar);
        }
        java.lang.Object obj = y.f14107k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = y.f14109m;
        boolean z6 = true;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            y.f14105h = this;
            y.f14106i = str;
            dVar = this.f14868v;
            y.j = dVar;
            y.f14109m = 1;
            if (dVar.e(y) == aVar) {
                return aVar;
            }
            c1357o0 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p028c8.d dVar2 = y.j;
            java.lang.String str2 = y.f14106i;
            c1357o0 = y.f14105h;
            com.google.common.util.concurrent.P.u0(obj);
            dVar = dVar2;
            str = str2;
        }
        try {
            if (c1357o0.f14867u.contains(str)) {
                z6 = false;
            } else {
                c1357o0.f14867u.add(str);
            }
            return java.lang.Boolean.valueOf(z6);
        } finally {
            dVar.g(null);
        }
    }

    public final boolean d(java.lang.String sectionId) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.m.e(sectionId, "sectionId");
        if (((java.util.Map) this.f14859m.getValue()).get(sectionId) == p005a5.V.j) {
            java.util.List list = (java.util.List) ((java.util.Map) this.f14857k.getValue()).get(sectionId);
            if ((list != null ? list.size() : 0) < this.f14871z && (bool = (java.lang.Boolean) this.f14865s.get(sectionId)) != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    public final p005a5.T e(com.kiptv.core.model.HomeSectionConfig homeSectionConfig) {
        java.util.List listB0;
        p005a5.C1353n6 c1353n6;
        java.util.List listB1;
        com.kiptv.core.model.F fG;
        switch (homeSectionConfig.f19794b.ordinal()) {
            case 13:
                java.lang.String strH = homeSectionConfig.h("providerId");
                java.lang.Integer numZ0 = strH != null ? O7.x.z0(strH) : null;
                if (numZ0 != null) {
                    int iOrdinal = homeSectionConfig.c().ordinal();
                    if (iOrdinal == 0) {
                        listB0 = p078i6.p.B0(f(numZ0, homeSectionConfig, true), f(numZ0, homeSectionConfig, false));
                    } else if (iOrdinal == 1) {
                        listB0 = com.google.common.util.concurrent.P.i0(f(numZ0, homeSectionConfig, true));
                    } else {
                        if (iOrdinal != 2) {
                            throw new I3.b();
                        }
                        listB0 = com.google.common.util.concurrent.P.i0(f(numZ0, homeSectionConfig, false));
                    }
                    return new p005a5.T(listB0);
                }
                return null;
            case 14:
                com.kiptv.core.model.CustomFeedDefinition customFeedDefinitionB = homeSectionConfig.b();
                if (customFeedDefinitionB != null) {
                    boolean zB = customFeedDefinitionB.b();
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    com.kiptv.core.model.CustomFeedDefinition.Companion companion = com.kiptv.core.model.CustomFeedDefinition.INSTANCE;
                    boolean zB2 = customFeedDefinitionB.b();
                    companion.getClass();
                    linkedHashMap.put("sort_by", com.kiptv.core.model.CustomFeedDefinition.Companion.a(customFeedDefinitionB.f19706c, zB2));
                    if (!customFeedDefinitionB.f19707d.isEmpty()) {
                        linkedHashMap.put("with_genres", p078i6.o.o1(customFeedDefinitionB.f19707d, ",", null, null, null, 62));
                    }
                    if (!customFeedDefinitionB.f19708e.isEmpty()) {
                        linkedHashMap.put("without_genres", p078i6.o.o1(customFeedDefinitionB.f19708e, ",", null, null, null, 62));
                    }
                    java.lang.String str = customFeedDefinitionB.b() ? "primary_release_date.gte" : "first_air_date.gte";
                    java.lang.String str2 = customFeedDefinitionB.b() ? "primary_release_date.lte" : "first_air_date.lte";
                    java.lang.Integer num = customFeedDefinitionB.f19709f;
                    if (num != null) {
                        linkedHashMap.put(str, num.intValue() + "-01-01");
                    }
                    java.lang.Integer num2 = customFeedDefinitionB.g;
                    if (num2 != null) {
                        linkedHashMap.put(str2, num2.intValue() + "-12-31");
                    }
                    java.lang.String str3 = customFeedDefinitionB.f19710h;
                    if (str3 != null) {
                        if (str3.length() <= 0) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            linkedHashMap.put("with_original_language", str3);
                        }
                    }
                    if (!customFeedDefinitionB.f19711i.isEmpty()) {
                        linkedHashMap.put("with_watch_providers", p078i6.o.o1(customFeedDefinitionB.f19711i, "|", null, null, null, 62));
                    }
                    int i3 = customFeedDefinitionB.j;
                    if (i3 > 0) {
                        linkedHashMap.put("vote_count.gte", java.lang.String.valueOf(i3));
                    }
                    java.util.Iterator it = O7.q.b1(customFeedDefinitionB.f19712k, new java.lang.String[]{"&"}, 0, 6).iterator();
                    while (it.hasNext()) {
                        java.util.List listB2 = O7.q.b1((java.lang.String) it.next(), new java.lang.String[]{"="}, 2, 2);
                        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(listB2, 10));
                        java.util.Iterator it2 = listB2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(O7.q.r1((java.lang.String) it2.next()).toString());
                        }
                        if (arrayList.size() == 2 && ((java.lang.CharSequence) arrayList.get(0)).length() != 0) {
                            linkedHashMap.put(arrayList.get(0), arrayList.get(1));
                        }
                    }
                    return new p005a5.T(com.google.common.util.concurrent.P.i0(new p005a5.S(zB, linkedHashMap, null)));
                }
                return null;
            case 15:
                if (this.f14853e.i()) {
                    p005a5.C1353n6.Companion.getClass();
                    if (homeSectionConfig.f19794b == com.kiptv.core.model.A.TRAKT_LIST && !((fG = homeSectionConfig.g()) == com.kiptv.core.model.F.LIST && homeSectionConfig.h("traktListId") == null)) {
                        java.lang.String strH2 = homeSectionConfig.h("traktListOwner");
                        if (strH2 == null) {
                            strH2 = "me";
                        }
                        c1353n6 = new p005a5.C1353n6(fG, strH2, homeSectionConfig.h("traktListId"), homeSectionConfig.f());
                    } else {
                        c1353n6 = null;
                    }
                } else {
                    c1353n6 = null;
                }
                if (c1353n6 != null) {
                    int iOrdinal2 = homeSectionConfig.c().ordinal();
                    p078i6.x xVar = p078i6.x.f23206h;
                    if (iOrdinal2 == 0) {
                        listB1 = p078i6.p.B0(new p005a5.S(true, xVar, c1353n6), new p005a5.S(false, xVar, c1353n6));
                    } else if (iOrdinal2 == 1) {
                        listB1 = com.google.common.util.concurrent.P.i0(new p005a5.S(true, xVar, c1353n6));
                    } else {
                        if (iOrdinal2 != 2) {
                            throw new I3.b();
                        }
                        listB1 = com.google.common.util.concurrent.P.i0(new p005a5.S(false, xVar, c1353n6));
                    }
                    return new p005a5.T(listB1);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02be  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:108:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:110:0x0312  */
    /* JADX WARN: Code duplicated, block: B:114:0x0346  */
    /* JADX WARN: Code duplicated, block: B:116:0x034f  */
    /* JADX WARN: Code duplicated, block: B:119:0x036b  */
    /* JADX WARN: Code duplicated, block: B:146:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:89:0x0273  */
    /* JADX WARN: Code duplicated, block: B:92:0x0287 A[LOOP:4: B:87:0x026d->B:92:0x0287, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x029d A[LOOP:1: B:95:0x0297->B:97:0x029d, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x036b -> B:120:0x0376). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(java.lang.String r31, p005a5.T r32, boolean r33, p117n6.c r34) {
        /*
            Method dump skipped, instruction units count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a5.C1357o0.g(java.lang.String, a5.T, boolean, n6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0103  */
    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    /* JADX WARN: Code duplicated, block: B:44:0x013b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0153  */
    /* JADX WARN: Code duplicated, block: B:50:0x0181  */
    /* JADX WARN: Code duplicated, block: B:51:0x0187  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bf A[LOOP:0: B:56:0x01b9->B:58:0x01bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:92:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01a8 -> B:55:0x01b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(p005a5.C1353n6 r19, boolean r20, int r21, int r22, java.util.Set r23, S4.x r24, p117n6.c r25) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a5.C1357o0.h(a5.n6, boolean, int, int, java.util.Set, S4.x, n6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0118 A[Catch: all -> 0x0055, CancellationException -> 0x0058, TryCatch #1 {all -> 0x0055, blocks: (B:20:0x0050, B:47:0x0102, B:49:0x010d, B:51:0x0115, B:53:0x011a, B:52:0x0118, B:64:0x014e, B:65:0x0158), top: B:71:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final java.lang.Object j(com.kiptv.core.model.HomeSectionConfig homeSectionConfig, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.C1247d0 c1247d0;
        p005a5.T t9;
        java.lang.String str;
        p005a5.C1357o0 c1357o0;
        java.lang.String str2;
        p005a5.C1357o0 c1357o1;
        p005a5.U u6;
        p005a5.V v6;
        if (cVar instanceof p005a5.C1247d0) {
            c1247d0 = (p005a5.C1247d0) cVar;
            int i3 = c1247d0.f14345m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1247d0.f14345m = i3 - Integer.MIN_VALUE;
            } else {
                c1247d0 = new p005a5.C1247d0(this, cVar);
            }
        } else {
            c1247d0 = new p005a5.C1247d0(this, cVar);
        }
        java.lang.Object objG = c1247d0.f14343k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1247d0.f14345m;
        p070h6.A a2 = p070h6.A.f22523a;
        java.lang.String str3 = 2;
        p005a5.C1357o0 c1357o2 = 1;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objG);
                java.lang.String str4 = homeSectionConfig.f19793a;
                p005a5.T tE = e(homeSectionConfig);
                if (tE == null) {
                    o(str4, p078i6.w.f23205h);
                    p(str4, p005a5.V.j);
                    return a2;
                }
                if (!kotlin.jvm.internal.m.a(this.f14863q.get(str4), p078i6.o.o1(tE.f13908a, "|", null, null, new U4.h(7), 30)) || ((java.util.Map) this.f14859m.getValue()).get(str4) != p005a5.V.j) {
                    c1247d0.f14341h = this;
                    c1247d0.f14342i = str4;
                    c1247d0.j = tE;
                    c1247d0.f14345m = 1;
                    java.lang.Object objC = c(str4, c1247d0);
                    if (objC != aVar) {
                        t9 = tE;
                        objG = objC;
                        str = str4;
                        c1357o0 = this;
                    }
                }
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        com.google.common.util.concurrent.P.u0(objG);
                        return a2;
                    }
                    if (i9 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th = (java.lang.Throwable) c1247d0.f14341h;
                    com.google.common.util.concurrent.P.u0(objG);
                    throw th;
                }
                t9 = c1247d0.j;
                str2 = c1247d0.f14342i;
                c1357o1 = (p005a5.C1357o0) c1247d0.f14341h;
                try {
                    com.google.common.util.concurrent.P.u0(objG);
                    c1357o1 = c1357o1;
                    u6 = (p005a5.U) objG;
                    c1357o1.o(str2, u6.f13956a);
                    if (u6.f13957b || !u6.f13956a.isEmpty()) {
                        v6 = p005a5.V.j;
                    } else {
                        v6 = p005a5.V.f14008k;
                    }
                    c1357o1.p(str2, v6);
                    c1357o1.f14863q.put(str2, p078i6.o.o1(t9.f13908a, "|", null, null, new U4.h(7), 30));
                    c1247d0.f14341h = null;
                    c1247d0.f14342i = null;
                    c1247d0.j = null;
                    c1247d0.f14345m = 3;
                    return c1357o1.m(str2, c1247d0) == aVar ? aVar : a2;
                } catch (java.util.concurrent.CancellationException e6) {
                    e = e6;
                    c1357o1.p(str2, p005a5.V.f14006h);
                    c1357o1.f14863q.remove(str2);
                    throw e;
                }
            }
            t9 = c1247d0.j;
            str = c1247d0.f14342i;
            c1357o0 = (p005a5.C1357o0) c1247d0.f14341h;
            com.google.common.util.concurrent.P.u0(objG);
            if (((java.lang.Boolean) objG).booleanValue()) {
                try {
                    c1357o0.p(str, p005a5.V.f14007i);
                    c1357o0.f14864r.put(str, new java.lang.Integer(1));
                    c1357o0.f14865s.put(str, java.lang.Boolean.TRUE);
                    c1357o0.f14866t.put(str, new java.util.LinkedHashSet());
                    c1247d0.f14341h = c1357o0;
                    c1247d0.f14342i = str;
                    c1247d0.j = t9;
                    c1247d0.f14345m = 2;
                    objG = c1357o0.g(str, t9, true, c1247d0);
                    if (objG != aVar) {
                        str2 = str;
                        c1357o1 = c1357o0;
                        u6 = (p005a5.U) objG;
                        c1357o1.o(str2, u6.f13956a);
                        if (u6.f13957b) {
                            v6 = p005a5.V.j;
                        } else {
                            v6 = p005a5.V.j;
                        }
                        c1357o1.p(str2, v6);
                        c1357o1.f14863q.put(str2, p078i6.o.o1(t9.f13908a, "|", null, null, new U4.h(7), 30));
                        c1247d0.f14341h = null;
                        c1247d0.f14342i = null;
                        c1247d0.j = null;
                        c1247d0.f14345m = 3;
                        if (c1357o1.m(str2, c1247d0) == aVar) {
                        }
                    }
                } catch (java.util.concurrent.CancellationException e9) {
                    e = e9;
                    str2 = str;
                    c1357o1 = c1357o0;
                    c1357o1.p(str2, p005a5.V.f14006h);
                    c1357o1.f14863q.remove(str2);
                    throw e;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    str3 = str;
                    c1357o2 = c1357o0;
                    c1247d0.f14341h = th;
                    c1247d0.f14342i = null;
                    c1247d0.j = null;
                    c1247d0.f14345m = 4;
                    if (c1357o2.m(str3, c1247d0) != aVar) {
                        throw th;
                    }
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009a A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:18:0x0050, B:41:0x00af, B:43:0x00b9, B:45:0x00c9, B:46:0x00cb, B:50:0x00e4, B:38:0x009a), top: B:64:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: all -> 0x0054, PHI: r2 r8 r9 r10 r13 r14
  0x00af: PHI (r2v6 int) = (r2v5 int), (r2v7 int) binds: [B:39:0x00ab, B:18:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r8v6 a5.T) = (r8v5 a5.T), (r8v7 a5.T) binds: [B:39:0x00ab, B:18:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v4 java.lang.String) binds: [B:39:0x00ab, B:18:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r10v3 a5.o0) = (r10v2 a5.o0), (r10v5 a5.o0) binds: [B:39:0x00ab, B:18:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r13v9 int) = (r13v6 int), (r13v22 int) binds: [B:39:0x00ab, B:18:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r14v11 java.lang.Object) = (r14v10 java.lang.Object), (r14v1 java.lang.Object) binds: [B:39:0x00ab, B:18:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0054, blocks: (B:18:0x0050, B:41:0x00af, B:43:0x00b9, B:45:0x00c9, B:46:0x00cb, B:50:0x00e4, B:38:0x009a), top: B:64:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:18:0x0050, B:41:0x00af, B:43:0x00b9, B:45:0x00c9, B:46:0x00cb, B:50:0x00e4, B:38:0x009a), top: B:64:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ab -> B:41:0x00af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(com.kiptv.core.model.HomeSectionConfig r13, p117n6.c r14) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a5.C1357o0.k(com.kiptv.core.model.HomeSectionConfig, n6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0234 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:23:0x0069, B:30:0x0084, B:95:0x0202, B:96:0x0223, B:98:0x0229, B:100:0x0234, B:102:0x0239, B:103:0x024a, B:105:0x0250, B:106:0x0261, B:107:0x026e, B:109:0x0274, B:111:0x027f, B:112:0x0283, B:113:0x0292, B:115:0x0298, B:116:0x02a9, B:117:0x02b1, B:130:0x031c), top: B:222:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0250 A[Catch: all -> 0x0073, LOOP:4: B:103:0x024a->B:105:0x0250, LOOP_END, TryCatch #0 {all -> 0x0073, blocks: (B:23:0x0069, B:30:0x0084, B:95:0x0202, B:96:0x0223, B:98:0x0229, B:100:0x0234, B:102:0x0239, B:103:0x024a, B:105:0x0250, B:106:0x0261, B:107:0x026e, B:109:0x0274, B:111:0x027f, B:112:0x0283, B:113:0x0292, B:115:0x0298, B:116:0x02a9, B:117:0x02b1, B:130:0x031c), top: B:222:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0274 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:23:0x0069, B:30:0x0084, B:95:0x0202, B:96:0x0223, B:98:0x0229, B:100:0x0234, B:102:0x0239, B:103:0x024a, B:105:0x0250, B:106:0x0261, B:107:0x026e, B:109:0x0274, B:111:0x027f, B:112:0x0283, B:113:0x0292, B:115:0x0298, B:116:0x02a9, B:117:0x02b1, B:130:0x031c), top: B:222:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0298 A[Catch: all -> 0x0073, LOOP:6: B:113:0x0292->B:115:0x0298, LOOP_END, TryCatch #0 {all -> 0x0073, blocks: (B:23:0x0069, B:30:0x0084, B:95:0x0202, B:96:0x0223, B:98:0x0229, B:100:0x0234, B:102:0x0239, B:103:0x024a, B:105:0x0250, B:106:0x0261, B:107:0x026e, B:109:0x0274, B:111:0x027f, B:112:0x0283, B:113:0x0292, B:115:0x0298, B:116:0x02a9, B:117:0x02b1, B:130:0x031c), top: B:222:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02d5 A[Catch: all -> 0x033d, TryCatch #7 {all -> 0x033d, blocks: (B:119:0x02b7, B:120:0x02cf, B:122:0x02d5, B:124:0x02dd, B:126:0x02fb, B:128:0x030a), top: B:235:0x02b7 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02dd A[Catch: all -> 0x033d, TryCatch #7 {all -> 0x033d, blocks: (B:119:0x02b7, B:120:0x02cf, B:122:0x02d5, B:124:0x02dd, B:126:0x02fb, B:128:0x030a), top: B:235:0x02b7 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02fb A[Catch: all -> 0x033d, TryCatch #7 {all -> 0x033d, blocks: (B:119:0x02b7, B:120:0x02cf, B:122:0x02d5, B:124:0x02dd, B:126:0x02fb, B:128:0x030a), top: B:235:0x02b7 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x030a A[Catch: all -> 0x033d, TRY_LEAVE, TryCatch #7 {all -> 0x033d, blocks: (B:119:0x02b7, B:120:0x02cf, B:122:0x02d5, B:124:0x02dd, B:126:0x02fb, B:128:0x030a), top: B:235:0x02b7 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x031c A[Catch: all -> 0x0073, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:23:0x0069, B:30:0x0084, B:95:0x0202, B:96:0x0223, B:98:0x0229, B:100:0x0234, B:102:0x0239, B:103:0x024a, B:105:0x0250, B:106:0x0261, B:107:0x026e, B:109:0x0274, B:111:0x027f, B:112:0x0283, B:113:0x0292, B:115:0x0298, B:116:0x02a9, B:117:0x02b1, B:130:0x031c), top: B:222:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0341  */
    /* JADX WARN: Code duplicated, block: B:138:0x0346 A[Catch: all -> 0x0337, TryCatch #1 {all -> 0x0337, blocks: (B:132:0x0326, B:138:0x0346, B:140:0x0359, B:142:0x036b, B:143:0x036f, B:145:0x0391, B:146:0x0396, B:152:0x03bc, B:154:0x03ce, B:160:0x03f7, B:162:0x0409), top: B:223:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0359 A[Catch: all -> 0x0337, TryCatch #1 {all -> 0x0337, blocks: (B:132:0x0326, B:138:0x0346, B:140:0x0359, B:142:0x036b, B:143:0x036f, B:145:0x0391, B:146:0x0396, B:152:0x03bc, B:154:0x03ce, B:160:0x03f7, B:162:0x0409), top: B:223:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x036b A[Catch: all -> 0x0337, TryCatch #1 {all -> 0x0337, blocks: (B:132:0x0326, B:138:0x0346, B:140:0x0359, B:142:0x036b, B:143:0x036f, B:145:0x0391, B:146:0x0396, B:152:0x03bc, B:154:0x03ce, B:160:0x03f7, B:162:0x0409), top: B:223:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x03bc A[Catch: all -> 0x0337, TRY_ENTER, TryCatch #1 {all -> 0x0337, blocks: (B:132:0x0326, B:138:0x0346, B:140:0x0359, B:142:0x036b, B:143:0x036f, B:145:0x0391, B:146:0x0396, B:152:0x03bc, B:154:0x03ce, B:160:0x03f7, B:162:0x0409), top: B:223:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x03f7 A[Catch: all -> 0x0337, TRY_ENTER, TryCatch #1 {all -> 0x0337, blocks: (B:132:0x0326, B:138:0x0346, B:140:0x0359, B:142:0x036b, B:143:0x036f, B:145:0x0391, B:146:0x0396, B:152:0x03bc, B:154:0x03ce, B:160:0x03f7, B:162:0x0409), top: B:223:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x042c  */
    /* JADX WARN: Code duplicated, block: B:167:0x042d A[Catch: all -> 0x0559, TRY_LEAVE, TryCatch #3 {all -> 0x0559, blocks: (B:149:0x039d, B:150:0x03b6, B:157:0x03d4, B:158:0x03f1, B:164:0x040d, B:167:0x042d), top: B:226:0x039d }] */
    /* JADX WARN: Code duplicated, block: B:170:0x043e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0447 A[Catch: all -> 0x046a, TRY_LEAVE, TryCatch #4 {all -> 0x046a, blocks: (B:171:0x0442, B:173:0x0447), top: B:228:0x0442 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x046e  */
    /* JADX WARN: Code duplicated, block: B:184:0x049a A[Catch: all -> 0x04ab, TryCatch #5 {all -> 0x04ab, blocks: (B:181:0x0470, B:182:0x0494, B:184:0x049a, B:186:0x04a7, B:189:0x04ad, B:190:0x04bc, B:192:0x04c2, B:193:0x04ce, B:194:0x04e7, B:196:0x04ed, B:198:0x04f9, B:201:0x04ff, B:202:0x0503), top: B:230:0x0470 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x04c2 A[Catch: all -> 0x04ab, LOOP:1: B:190:0x04bc->B:192:0x04c2, LOOP_END, TryCatch #5 {all -> 0x04ab, blocks: (B:181:0x0470, B:182:0x0494, B:184:0x049a, B:186:0x04a7, B:189:0x04ad, B:190:0x04bc, B:192:0x04c2, B:193:0x04ce, B:194:0x04e7, B:196:0x04ed, B:198:0x04f9, B:201:0x04ff, B:202:0x0503), top: B:230:0x0470 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x04ed A[Catch: all -> 0x04ab, TryCatch #5 {all -> 0x04ab, blocks: (B:181:0x0470, B:182:0x0494, B:184:0x049a, B:186:0x04a7, B:189:0x04ad, B:190:0x04bc, B:192:0x04c2, B:193:0x04ce, B:194:0x04e7, B:196:0x04ed, B:198:0x04f9, B:201:0x04ff, B:202:0x0503), top: B:230:0x0470 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x04f9 A[Catch: all -> 0x04ab, TryCatch #5 {all -> 0x04ab, blocks: (B:181:0x0470, B:182:0x0494, B:184:0x049a, B:186:0x04a7, B:189:0x04ad, B:190:0x04bc, B:192:0x04c2, B:193:0x04ce, B:194:0x04e7, B:196:0x04ed, B:198:0x04f9, B:201:0x04ff, B:202:0x0503), top: B:230:0x0470 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:205:0x0522  */
    /* JADX WARN: Code duplicated, block: B:220:0x0575  */
    /* JADX WARN: Code duplicated, block: B:233:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x02b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x04a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x04ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0409 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b5 A[Catch: all -> 0x01dc, TRY_LEAVE, TryCatch #6 {all -> 0x01dc, blocks: (B:81:0x01af, B:83:0x01b5, B:89:0x01e1, B:91:0x01eb), top: B:233:0x01af }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01e1 A[Catch: all -> 0x01dc, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x01dc, blocks: (B:81:0x01af, B:83:0x01b5, B:89:0x01e1, B:91:0x01eb), top: B:233:0x01af }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0200  */
    /* JADX WARN: Code duplicated, block: B:98:0x0229 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:23:0x0069, B:30:0x0084, B:95:0x0202, B:96:0x0223, B:98:0x0229, B:100:0x0234, B:102:0x0239, B:103:0x024a, B:105:0x0250, B:106:0x0261, B:107:0x026e, B:109:0x0274, B:111:0x027f, B:112:0x0283, B:113:0x0292, B:115:0x0298, B:116:0x02a9, B:117:0x02b1, B:130:0x031c), top: B:222:0x0029 }] */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0463, code lost:
    
        if (r8.m(r25, r2) == r3) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0553, code lost:
    
        if (r7.m(r1, r2) == r3) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d8, code lost:
    
        if (r12.m("recommended", r2) == r3) goto L232;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x02dd, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v20, types: [a5.o0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [a5.o0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [a5.o0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [a5.o0] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [a5.o0] */
    /* JADX WARN: Type inference failed for: r7v34, types: [a5.o0] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r8v38, types: [a5.o0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(p117n6.c cVar) throws java.lang.Throwable {
        p005a5.C1267f0 c1267f0;
        ?? r9;
        ?? r10;
        int i3;
        java.util.List listN1;
        java.lang.String str;
        ?? linkedHashMap;
        java.lang.Integer num;
        ?? r11;
        java.util.List list;
        java.util.LinkedHashMap linkedHashMap2;
        java.util.LinkedHashMap linkedHashMap3;
        java.util.LinkedHashMap linkedHashMap4;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.Iterator it;
        java.util.Set setR1;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        java.util.Iterator it2;
        java.util.Set setR2;
        java.util.Iterator it3;
        ?? r25;
        java.util.ArrayList arrayList5;
        java.util.Iterator it4;
        java.util.List listJ1;
        java.util.ArrayList arrayList6;
        java.util.Iterator it5;
        java.util.List listJ2;
        java.lang.Object objL;
        com.kiptv.core.model.TMDBSearchResult tMDBSearchResult;
        com.kiptv.core.model.TMDBSearchResult tMDBSearchResult2;
        ?? r26;
        boolean zBooleanValue;
        java.util.Iterator it6;
        int i9;
        java.lang.Object next;
        int i10;
        com.kiptv.core.model.TMDBSearchResult tMDBSearchResult3;
        boolean z6;
        double dMax;
        java.util.Set set;
        int i11;
        int i12;
        ?? r27;
        ?? r12;
        ?? r13;
        S4.x xVar;
        ?? r14;
        java.util.ArrayList arrayList7;
        java.util.ArrayList arrayList8;
        java.util.Iterator it7;
        java.util.ArrayList arrayList9;
        java.lang.String str2;
        if (cVar instanceof p005a5.C1267f0) {
            c1267f0 = (p005a5.C1267f0) cVar;
            int i13 = c1267f0.f14451n;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1267f0.f14451n = i13 - Integer.MIN_VALUE;
            } else {
                c1267f0 = new p005a5.C1267f0(this, cVar);
            }
        } else {
            c1267f0 = new p005a5.C1267f0(this, cVar);
        }
        java.lang.Object objM = c1267f0.f14449l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = c1267f0.f14451n;
        p070h6.A a2 = p070h6.A.f22523a;
        ?? r15 = "recommended";
        try {
            switch (i14) {
                case 0:
                    com.google.common.util.concurrent.P.u0(objM);
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                    java.util.Iterator it8 = p078i6.o.I1((java.lang.Iterable) ((V7.n0) this.f14850b.f14628l.f10419h).getValue(), new p005a5.B(6)).iterator();
                    while (true) {
                        boolean zHasNext = it8.hasNext();
                        i3 = this.f14869w;
                        if (zHasNext) {
                            com.kiptv.core.model.WatchProgress watchProgress = (com.kiptv.core.model.WatchProgress) it8.next();
                            if (linkedHashSet.size() < i3) {
                                java.lang.Integer num2 = watchProgress.f20622o;
                                if (num2 != null) {
                                    if (num2.intValue() <= 0) {
                                        num2 = null;
                                    }
                                    if (num2 != null) {
                                        int iIntValue = num2.intValue();
                                        int iOrdinal = watchProgress.f20614e.ordinal();
                                        if (iOrdinal == 0) {
                                            linkedHashSet.add(new p005a5.W(iIntValue, true));
                                        } else if (iOrdinal == 1) {
                                            linkedHashSet.add(new p005a5.W(iIntValue, false));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashSet.size() < 3) {
                        com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20885i;
                        p005a5.D0 d4 = this.f14851c;
                        for (com.kiptv.core.model.MyListItem myListItem : d4.a(z0Var)) {
                            if (linkedHashSet.size() < i3) {
                                java.lang.Integer num3 = myListItem.f19879i;
                                if (num3 != null) {
                                    linkedHashSet.add(new p005a5.W(num3.intValue(), true));
                                }
                            } else {
                                for (com.kiptv.core.model.MyListItem myListItem2 : d4.a(com.kiptv.core.model.z0.j)) {
                                    if (linkedHashSet.size() < i3) {
                                        num = myListItem2.f19879i;
                                        if (num != null) {
                                            linkedHashSet.add(new p005a5.W(num.intValue(), false));
                                        }
                                    }
                                }
                            }
                        }
                        while (r4.hasNext()) {
                            if (linkedHashSet.size() < i3) {
                                num = myListItem2.f19879i;
                                if (num != null) {
                                    linkedHashSet.add(new p005a5.W(num.intValue(), false));
                                }
                            }
                        }
                    }
                    listN1 = p078i6.o.N1(linkedHashSet);
                    java.lang.String strO1 = p078i6.o.o1(listN1, ",", null, null, new U4.h(6), 30);
                    if (!kotlin.jvm.internal.m.a(strO1, this.f14862p) || this.f14856i.getValue() != p005a5.V.j) {
                        c1267f0.f14446h = this;
                        c1267f0.f14447i = listN1;
                        c1267f0.j = strO1;
                        c1267f0.f14451n = 1;
                        java.lang.Object objC = c("recommended", c1267f0);
                        if (objC != aVar) {
                            str = strO1;
                            objM = objC;
                            linkedHashMap = this;
                            if (((java.lang.Boolean) objM).booleanValue()) {
                                try {
                                    if (!listN1.isEmpty()) {
                                        V7.n0 n0Var = linkedHashMap.g;
                                        p078i6.w wVar = p078i6.w.f23205h;
                                        n0Var.getClass();
                                        n0Var.i(null, wVar);
                                        V7.n0 n0Var2 = linkedHashMap.f14856i;
                                        p005a5.V v6 = p005a5.V.j;
                                        n0Var2.getClass();
                                        n0Var2.i(null, v6);
                                        linkedHashMap.f14862p = str;
                                        c1267f0.f14446h = a2;
                                        c1267f0.f14447i = null;
                                        c1267f0.j = null;
                                        c1267f0.f14451n = 2;
                                    } else {
                                        V7.n0 n0Var3 = linkedHashMap.f14856i;
                                        p005a5.V v9 = p005a5.V.f14007i;
                                        try {
                                            n0Var3.getClass();
                                            n0Var3.i(null, v9);
                                            p005a5.C1297i0 c1297i0 = new p005a5.C1297i0(listN1, linkedHashMap, null);
                                            c1267f0.f14446h = linkedHashMap;
                                            c1267f0.f14447i = listN1;
                                            c1267f0.j = str;
                                            c1267f0.f14451n = 3;
                                            objM = S7.C.m(c1297i0, c1267f0);
                                            if (objM != aVar) {
                                                r11 = linkedHashMap;
                                                list = listN1;
                                                java.util.List list2 = (java.util.List) objM;
                                                linkedHashMap = new java.util.LinkedHashMap();
                                                linkedHashMap2 = new java.util.LinkedHashMap();
                                                linkedHashMap3 = new java.util.LinkedHashMap();
                                                linkedHashMap4 = new java.util.LinkedHashMap();
                                                arrayList = new java.util.ArrayList();
                                                for (java.lang.Object obj : list) {
                                                    if (((p005a5.W) obj).f14046b) {
                                                        arrayList.add(obj);
                                                    }
                                                }
                                                arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
                                                it = arrayList.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add(new java.lang.Integer(((p005a5.W) it.next()).f14045a));
                                                }
                                                setR1 = p078i6.o.R1(arrayList2);
                                                arrayList3 = new java.util.ArrayList();
                                                for (java.lang.Object obj2 : list) {
                                                    if (!((p005a5.W) obj2).f14046b) {
                                                        arrayList3.add(obj2);
                                                    }
                                                }
                                                arrayList4 = new java.util.ArrayList(p078i6.q.I0(arrayList3, 10));
                                                it2 = arrayList3.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList4.add(new java.lang.Integer(((p005a5.W) it2.next()).f14045a));
                                                }
                                                setR2 = p078i6.o.R1(arrayList4);
                                                it3 = list2.iterator();
                                                r15 = r15;
                                                while (it3.hasNext()) {
                                                    try {
                                                        p070h6.k kVar = (p070h6.k) it3.next();
                                                        zBooleanValue = ((java.lang.Boolean) kVar.f22539h).booleanValue();
                                                        it6 = ((java.util.List) kVar.f22540i).iterator();
                                                        i9 = 0;
                                                        r15 = r15;
                                                        while (it6.hasNext()) {
                                                            next = it6.next();
                                                            i10 = i9 + 1;
                                                            if (i9 < 0) {
                                                                p078i6.p.H0();
                                                                throw null;
                                                            }
                                                            tMDBSearchResult3 = (com.kiptv.core.model.TMDBSearchResult) next;
                                                            java.util.Iterator it9 = it3;
                                                            int i15 = 14 - i9;
                                                            java.util.Iterator it10 = it6;
                                                            z6 = zBooleanValue;
                                                            dMax = (((double) java.lang.Math.max(0, i15)) / 14.0d) + 1.0d;
                                                            if (z6) {
                                                                i12 = tMDBSearchResult3.f20292a;
                                                                if (setR1.contains(new java.lang.Integer(i12))) {
                                                                    set = setR1;
                                                                    r26 = r15;
                                                                } else {
                                                                    java.lang.Integer num4 = new java.lang.Integer(i12);
                                                                    java.lang.Double d6 = (java.lang.Double) linkedHashMap.get(new java.lang.Integer(i12));
                                                                    r26 = r15;
                                                                    set = setR1;
                                                                    try {
                                                                        linkedHashMap.put(num4, new java.lang.Double((d6 != null ? d6.doubleValue() : 0.0d) + dMax));
                                                                        linkedHashMap3.put(new java.lang.Integer(i12), tMDBSearchResult3);
                                                                    } catch (java.lang.Throwable th) {
                                                                        th = th;
                                                                    }
                                                                }
                                                            } else {
                                                                set = setR1;
                                                                r26 = r15;
                                                                i11 = tMDBSearchResult3.f20292a;
                                                                if (!setR2.contains(new java.lang.Integer(i11))) {
                                                                    java.lang.Integer num5 = new java.lang.Integer(i11);
                                                                    java.lang.Double d9 = (java.lang.Double) linkedHashMap2.get(new java.lang.Integer(i11));
                                                                    linkedHashMap2.put(num5, new java.lang.Double((d9 != null ? d9.doubleValue() : 0.0d) + dMax));
                                                                    linkedHashMap4.put(new java.lang.Integer(i11), tMDBSearchResult3);
                                                                }
                                                            }
                                                            it6 = it10;
                                                            zBooleanValue = z6;
                                                            it3 = it9;
                                                            i9 = i10;
                                                            r15 = r26;
                                                            setR1 = set;
                                                            r10 = r11;
                                                            r9 = r26;
                                                            c1267f0.f14446h = th;
                                                            c1267f0.f14447i = null;
                                                            c1267f0.j = null;
                                                            c1267f0.f14448k = null;
                                                            c1267f0.f14451n = 8;
                                                            if (r10.m(r9, c1267f0) != aVar) {
                                                                throw th;
                                                            }
                                                        }
                                                        r15 = r15;
                                                    } catch (java.lang.Throwable th2) {
                                                        th = th2;
                                                        r26 = r15;
                                                    }
                                                }
                                                r25 = r15;
                                                try {
                                                    java.util.List listI1 = p078i6.o.I1(linkedHashMap.entrySet(), new p005a5.B(4));
                                                    arrayList5 = new java.util.ArrayList();
                                                    it4 = listI1.iterator();
                                                    while (it4.hasNext()) {
                                                        tMDBSearchResult2 = (com.kiptv.core.model.TMDBSearchResult) linkedHashMap3.get(((java.util.Map.Entry) it4.next()).getKey());
                                                        if (tMDBSearchResult2 != null) {
                                                            arrayList5.add(tMDBSearchResult2);
                                                        }
                                                    }
                                                    listJ1 = p078i6.o.J1(arrayList5, 40);
                                                    java.util.List listI2 = p078i6.o.I1(linkedHashMap2.entrySet(), new p005a5.B(5));
                                                    arrayList6 = new java.util.ArrayList();
                                                    it5 = listI2.iterator();
                                                    while (it5.hasNext()) {
                                                        tMDBSearchResult = (com.kiptv.core.model.TMDBSearchResult) linkedHashMap4.get(((java.util.Map.Entry) it5.next()).getKey());
                                                        if (tMDBSearchResult != null) {
                                                            arrayList6.add(tMDBSearchResult);
                                                        }
                                                    }
                                                    listJ2 = p078i6.o.J1(arrayList6, 40);
                                                    c1267f0.f14446h = r11;
                                                    c1267f0.f14447i = str;
                                                    c1267f0.j = listJ1;
                                                    c1267f0.f14448k = listJ2;
                                                    c1267f0.f14451n = 4;
                                                    objL = (S4.x) ((V7.n0) r11.f14854f.f13185n.f10419h).getValue();
                                                    if (objL == null) {
                                                        objL = S7.C.L(r11.f14848A, new p005a5.C1327l0(r11, null), c1267f0);
                                                        break;
                                                    }
                                                    if (objL != aVar) {
                                                        linkedHashMap = listJ2;
                                                        objM = objL;
                                                        r15 = r15;
                                                        r12 = r11;
                                                        r27 = r25;
                                                        r13 = r12;
                                                        try {
                                                            xVar = (S4.x) objM;
                                                            if (xVar != null) {
                                                                V7.n0 n0Var4 = r13.f14856i;
                                                                p005a5.V v10 = p005a5.V.f14006h;
                                                                n0Var4.getClass();
                                                                n0Var4.i(null, v10);
                                                                c1267f0.f14446h = a2;
                                                                c1267f0.f14447i = null;
                                                                c1267f0.j = null;
                                                                c1267f0.f14448k = null;
                                                                c1267f0.f14451n = 5;
                                                            } else {
                                                                r14 = r27;
                                                                try {
                                                                    p005a5.i9 i9Var = r13.f14850b;
                                                                    r15 = (java.util.Set) ((V7.n0) i9Var.f14630n.f10419h).getValue();
                                                                    java.lang.Iterable iterable = (java.lang.Iterable) ((V7.n0) i9Var.f14628l.f10419h).getValue();
                                                                    arrayList7 = new java.util.ArrayList();
                                                                    for (java.lang.Object obj3 : iterable) {
                                                                        if (((com.kiptv.core.model.WatchProgress) obj3).f20614e == com.kiptv.core.model.z0.f20885i) {
                                                                            arrayList7.add(obj3);
                                                                        }
                                                                    }
                                                                    arrayList8 = new java.util.ArrayList(p078i6.q.I0(arrayList7, 10));
                                                                    it7 = arrayList7.iterator();
                                                                    while (it7.hasNext()) {
                                                                        arrayList8.add(((com.kiptv.core.model.WatchProgress) it7.next()).f20613d);
                                                                    }
                                                                    java.util.Set setR3 = p078i6.o.R1(arrayList8);
                                                                    java.lang.Iterable<com.kiptv.core.model.WatchProgress> iterable2 = (java.lang.Iterable) ((V7.n0) i9Var.f14628l.f10419h).getValue();
                                                                    arrayList9 = new java.util.ArrayList();
                                                                    for (com.kiptv.core.model.WatchProgress watchProgress2 : iterable2) {
                                                                        if (watchProgress2.f20614e == com.kiptv.core.model.z0.j) {
                                                                            str2 = watchProgress2.g;
                                                                        } else {
                                                                            str2 = null;
                                                                        }
                                                                        if (str2 != null) {
                                                                            arrayList9.add(str2);
                                                                        }
                                                                    }
                                                                    java.util.Set setR4 = p078i6.o.R1(arrayList9);
                                                                    Z7.e eVar = S7.M.f9549a;
                                                                    p005a5.C1277g0 c1277g0 = new p005a5.C1277g0(listJ1, r13, xVar, r15, setR3, linkedHashMap, setR4, null);
                                                                    c1267f0.f14446h = r13;
                                                                    c1267f0.f14447i = str;
                                                                    c1267f0.j = null;
                                                                    c1267f0.f14448k = null;
                                                                    c1267f0.f14451n = 6;
                                                                    objM = S7.C.K(eVar, c1277g0, c1267f0);
                                                                    if (objM != aVar) {
                                                                        r10 = r13;
                                                                        r9 = r14;
                                                                        r15 = r15;
                                                                        try {
                                                                            p070h6.k kVar2 = (p070h6.k) objM;
                                                                            java.util.List list3 = (java.util.List) kVar2.f22539h;
                                                                            java.util.List list4 = (java.util.List) kVar2.f22540i;
                                                                            V7.n0 n0Var5 = r10.g;
                                                                            java.util.ArrayList arrayListI = i(list3, 24, list4);
                                                                            n0Var5.getClass();
                                                                            n0Var5.i(null, arrayListI);
                                                                            V7.n0 n0Var6 = r10.f14856i;
                                                                            p005a5.V v11 = p005a5.V.j;
                                                                            n0Var6.getClass();
                                                                            n0Var6.i(null, v11);
                                                                            r10.f14862p = str;
                                                                            c1267f0.f14446h = null;
                                                                            c1267f0.f14447i = null;
                                                                            c1267f0.f14451n = 7;
                                                                        } catch (java.lang.Throwable th3) {
                                                                            th = th3;
                                                                            c1267f0.f14446h = th;
                                                                            c1267f0.f14447i = null;
                                                                            c1267f0.j = null;
                                                                            c1267f0.f14448k = null;
                                                                            c1267f0.f14451n = 8;
                                                                            if (r10.m(r9, c1267f0) != aVar) {
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th4) {
                                                                    th = th4;
                                                                    r9 = r14;
                                                                    r10 = r13;
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th5) {
                                                            th = th5;
                                                            r9 = r27;
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                    r9 = r25;
                                                    r10 = r11;
                                                }
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            r9 = r15;
                                            r10 = linkedHashMap;
                                        }
                                    }
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                }
                            }
                            break;
                        }
                        return aVar;
                    }
                    return a2;
                case 1:
                    str = (java.lang.String) c1267f0.j;
                    java.util.List list5 = (java.util.List) c1267f0.f14447i;
                    p005a5.C1357o0 c1357o0 = (p005a5.C1357o0) c1267f0.f14446h;
                    com.google.common.util.concurrent.P.u0(objM);
                    listN1 = list5;
                    linkedHashMap = c1357o0;
                    if (((java.lang.Boolean) objM).booleanValue()) {
                        if (!listN1.isEmpty()) {
                            V7.n0 n0Var7 = linkedHashMap.f14856i;
                            p005a5.V v12 = p005a5.V.f14007i;
                            n0Var7.getClass();
                            n0Var7.i(null, v12);
                            p005a5.C1297i0 c1297i1 = new p005a5.C1297i0(listN1, linkedHashMap, null);
                            c1267f0.f14446h = linkedHashMap;
                            c1267f0.f14447i = listN1;
                            c1267f0.j = str;
                            c1267f0.f14451n = 3;
                            objM = S7.C.m(c1297i1, c1267f0);
                            if (objM != aVar) {
                                r11 = linkedHashMap;
                                list = listN1;
                                java.util.List list6 = (java.util.List) objM;
                                linkedHashMap = new java.util.LinkedHashMap();
                                linkedHashMap2 = new java.util.LinkedHashMap();
                                linkedHashMap3 = new java.util.LinkedHashMap();
                                linkedHashMap4 = new java.util.LinkedHashMap();
                                arrayList = new java.util.ArrayList();
                                while (r16.hasNext()) {
                                    if (((p005a5.W) obj).f14046b) {
                                        arrayList.add(obj);
                                    }
                                }
                                arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(new java.lang.Integer(((p005a5.W) it.next()).f14045a));
                                }
                                setR1 = p078i6.o.R1(arrayList2);
                                arrayList3 = new java.util.ArrayList();
                                while (r7.hasNext()) {
                                    if (!((p005a5.W) obj2).f14046b) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                arrayList4 = new java.util.ArrayList(p078i6.q.I0(arrayList3, 10));
                                it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(new java.lang.Integer(((p005a5.W) it2.next()).f14045a));
                                }
                                setR2 = p078i6.o.R1(arrayList4);
                                it3 = list6.iterator();
                                r15 = r15;
                                while (it3.hasNext()) {
                                    p070h6.k kVar3 = (p070h6.k) it3.next();
                                    zBooleanValue = ((java.lang.Boolean) kVar3.f22539h).booleanValue();
                                    it6 = ((java.util.List) kVar3.f22540i).iterator();
                                    i9 = 0;
                                    r15 = r15;
                                    while (it6.hasNext()) {
                                        next = it6.next();
                                        i10 = i9 + 1;
                                        if (i9 < 0) {
                                            p078i6.p.H0();
                                            throw null;
                                        }
                                        tMDBSearchResult3 = (com.kiptv.core.model.TMDBSearchResult) next;
                                        java.util.Iterator it11 = it3;
                                        int i16 = 14 - i9;
                                        java.util.Iterator it12 = it6;
                                        z6 = zBooleanValue;
                                        dMax = (((double) java.lang.Math.max(0, i16)) / 14.0d) + 1.0d;
                                        if (z6) {
                                            i12 = tMDBSearchResult3.f20292a;
                                            if (setR1.contains(new java.lang.Integer(i12))) {
                                                java.lang.Integer num6 = new java.lang.Integer(i12);
                                                java.lang.Double d10 = (java.lang.Double) linkedHashMap.get(new java.lang.Integer(i12));
                                                r26 = r15;
                                                set = setR1;
                                                linkedHashMap.put(num6, new java.lang.Double((d10 != null ? d10.doubleValue() : 0.0d) + dMax));
                                                linkedHashMap3.put(new java.lang.Integer(i12), tMDBSearchResult3);
                                            } else {
                                                set = setR1;
                                                r26 = r15;
                                            }
                                        } else {
                                            set = setR1;
                                            r26 = r15;
                                            i11 = tMDBSearchResult3.f20292a;
                                            if (!setR2.contains(new java.lang.Integer(i11))) {
                                                java.lang.Integer num7 = new java.lang.Integer(i11);
                                                java.lang.Double d11 = (java.lang.Double) linkedHashMap2.get(new java.lang.Integer(i11));
                                                linkedHashMap2.put(num7, new java.lang.Double((d11 != null ? d11.doubleValue() : 0.0d) + dMax));
                                                linkedHashMap4.put(new java.lang.Integer(i11), tMDBSearchResult3);
                                            }
                                        }
                                        it6 = it12;
                                        zBooleanValue = z6;
                                        it3 = it11;
                                        i9 = i10;
                                        r15 = r26;
                                        setR1 = set;
                                        r10 = r11;
                                        r9 = r26;
                                        c1267f0.f14446h = th;
                                        c1267f0.f14447i = null;
                                        c1267f0.j = null;
                                        c1267f0.f14448k = null;
                                        c1267f0.f14451n = 8;
                                        if (r10.m(r9, c1267f0) != aVar) {
                                            throw th;
                                        }
                                        return aVar;
                                    }
                                    r15 = r15;
                                }
                                r25 = r15;
                                java.util.List listI3 = p078i6.o.I1(linkedHashMap.entrySet(), new p005a5.B(4));
                                arrayList5 = new java.util.ArrayList();
                                it4 = listI3.iterator();
                                while (it4.hasNext()) {
                                    tMDBSearchResult2 = (com.kiptv.core.model.TMDBSearchResult) linkedHashMap3.get(((java.util.Map.Entry) it4.next()).getKey());
                                    if (tMDBSearchResult2 != null) {
                                        arrayList5.add(tMDBSearchResult2);
                                    }
                                }
                                listJ1 = p078i6.o.J1(arrayList5, 40);
                                java.util.List listI4 = p078i6.o.I1(linkedHashMap2.entrySet(), new p005a5.B(5));
                                arrayList6 = new java.util.ArrayList();
                                it5 = listI4.iterator();
                                while (it5.hasNext()) {
                                    tMDBSearchResult = (com.kiptv.core.model.TMDBSearchResult) linkedHashMap4.get(((java.util.Map.Entry) it5.next()).getKey());
                                    if (tMDBSearchResult != null) {
                                        arrayList6.add(tMDBSearchResult);
                                    }
                                }
                                listJ2 = p078i6.o.J1(arrayList6, 40);
                                c1267f0.f14446h = r11;
                                c1267f0.f14447i = str;
                                c1267f0.j = listJ1;
                                c1267f0.f14448k = listJ2;
                                c1267f0.f14451n = 4;
                                objL = (S4.x) ((V7.n0) r11.f14854f.f13185n.f10419h).getValue();
                                if (objL == null) {
                                    objL = S7.C.L(r11.f14848A, new p005a5.C1327l0(r11, null), c1267f0);
                                    break;
                                }
                                if (objL != aVar) {
                                    linkedHashMap = listJ2;
                                    objM = objL;
                                    r15 = r15;
                                    r12 = r11;
                                    r27 = r25;
                                    r13 = r12;
                                    xVar = (S4.x) objM;
                                    if (xVar != null) {
                                        V7.n0 n0Var8 = r13.f14856i;
                                        p005a5.V v13 = p005a5.V.f14006h;
                                        n0Var8.getClass();
                                        n0Var8.i(null, v13);
                                        c1267f0.f14446h = a2;
                                        c1267f0.f14447i = null;
                                        c1267f0.j = null;
                                        c1267f0.f14448k = null;
                                        c1267f0.f14451n = 5;
                                    } else {
                                        r14 = r27;
                                        p005a5.i9 i9Var2 = r13.f14850b;
                                        r15 = (java.util.Set) ((V7.n0) i9Var2.f14630n.f10419h).getValue();
                                        java.lang.Iterable iterable3 = (java.lang.Iterable) ((V7.n0) i9Var2.f14628l.f10419h).getValue();
                                        arrayList7 = new java.util.ArrayList();
                                        while (r6.hasNext()) {
                                            if (((com.kiptv.core.model.WatchProgress) obj3).f20614e == com.kiptv.core.model.z0.f20885i) {
                                                arrayList7.add(obj3);
                                            }
                                        }
                                        arrayList8 = new java.util.ArrayList(p078i6.q.I0(arrayList7, 10));
                                        it7 = arrayList7.iterator();
                                        while (it7.hasNext()) {
                                            arrayList8.add(((com.kiptv.core.model.WatchProgress) it7.next()).f20613d);
                                        }
                                        java.util.Set setR5 = p078i6.o.R1(arrayList8);
                                        java.lang.Iterable<com.kiptv.core.model.WatchProgress> iterable4 = (java.lang.Iterable) ((V7.n0) i9Var2.f14628l.f10419h).getValue();
                                        arrayList9 = new java.util.ArrayList();
                                        while (r0.hasNext()) {
                                            if (watchProgress2.f20614e == com.kiptv.core.model.z0.j) {
                                                str2 = watchProgress2.g;
                                            } else {
                                                str2 = null;
                                            }
                                            if (str2 != null) {
                                                arrayList9.add(str2);
                                            }
                                        }
                                        java.util.Set setR6 = p078i6.o.R1(arrayList9);
                                        Z7.e eVar2 = S7.M.f9549a;
                                        p005a5.C1277g0 c1277g1 = new p005a5.C1277g0(listJ1, r13, xVar, r15, setR5, linkedHashMap, setR6, null);
                                        c1267f0.f14446h = r13;
                                        c1267f0.f14447i = str;
                                        c1267f0.j = null;
                                        c1267f0.f14448k = null;
                                        c1267f0.f14451n = 6;
                                        objM = S7.C.K(eVar2, c1277g1, c1267f0);
                                        if (objM != aVar) {
                                            r10 = r13;
                                            r9 = r14;
                                            r15 = r15;
                                            p070h6.k kVar4 = (p070h6.k) objM;
                                            java.util.List list7 = (java.util.List) kVar4.f22539h;
                                            java.util.List list8 = (java.util.List) kVar4.f22540i;
                                            V7.n0 n0Var9 = r10.g;
                                            java.util.ArrayList arrayListI2 = i(list7, 24, list8);
                                            n0Var9.getClass();
                                            n0Var9.i(null, arrayListI2);
                                            V7.n0 n0Var10 = r10.f14856i;
                                            p005a5.V v14 = p005a5.V.j;
                                            n0Var10.getClass();
                                            n0Var10.i(null, v14);
                                            r10.f14862p = str;
                                            c1267f0.f14446h = null;
                                            c1267f0.f14447i = null;
                                            c1267f0.f14451n = 7;
                                        }
                                    }
                                }
                            }
                            break;
                        } else {
                            V7.n0 n0Var11 = linkedHashMap.g;
                            p078i6.w wVar2 = p078i6.w.f23205h;
                            n0Var11.getClass();
                            n0Var11.i(null, wVar2);
                            V7.n0 n0Var12 = linkedHashMap.f14856i;
                            p005a5.V v15 = p005a5.V.j;
                            n0Var12.getClass();
                            n0Var12.i(null, v15);
                            linkedHashMap.f14862p = str;
                            c1267f0.f14446h = a2;
                            c1267f0.f14447i = null;
                            c1267f0.j = null;
                            c1267f0.f14451n = 2;
                            break;
                        }
                        return aVar;
                    }
                    return a2;
                case 2:
                case 5:
                    p070h6.A a9 = (p070h6.A) c1267f0.f14446h;
                    com.google.common.util.concurrent.P.u0(objM);
                    return a9;
                case 3:
                    str = (java.lang.String) c1267f0.j;
                    list = (java.util.List) c1267f0.f14447i;
                    p005a5.C1357o0 c1357o1 = (p005a5.C1357o0) c1267f0.f14446h;
                    com.google.common.util.concurrent.P.u0(objM);
                    r11 = c1357o1;
                    java.util.List list9 = (java.util.List) objM;
                    linkedHashMap = new java.util.LinkedHashMap();
                    linkedHashMap2 = new java.util.LinkedHashMap();
                    linkedHashMap3 = new java.util.LinkedHashMap();
                    linkedHashMap4 = new java.util.LinkedHashMap();
                    arrayList = new java.util.ArrayList();
                    while (r16.hasNext()) {
                        if (((p005a5.W) obj).f14046b) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new java.lang.Integer(((p005a5.W) it.next()).f14045a));
                    }
                    setR1 = p078i6.o.R1(arrayList2);
                    arrayList3 = new java.util.ArrayList();
                    while (r7.hasNext()) {
                        if (!((p005a5.W) obj2).f14046b) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList4 = new java.util.ArrayList(p078i6.q.I0(arrayList3, 10));
                    it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(new java.lang.Integer(((p005a5.W) it2.next()).f14045a));
                    }
                    setR2 = p078i6.o.R1(arrayList4);
                    it3 = list9.iterator();
                    r15 = r15;
                    while (it3.hasNext()) {
                        p070h6.k kVar5 = (p070h6.k) it3.next();
                        zBooleanValue = ((java.lang.Boolean) kVar5.f22539h).booleanValue();
                        it6 = ((java.util.List) kVar5.f22540i).iterator();
                        i9 = 0;
                        r15 = r15;
                        while (it6.hasNext()) {
                            next = it6.next();
                            i10 = i9 + 1;
                            if (i9 < 0) {
                                p078i6.p.H0();
                                throw null;
                            }
                            tMDBSearchResult3 = (com.kiptv.core.model.TMDBSearchResult) next;
                            java.util.Iterator it13 = it3;
                            int i17 = 14 - i9;
                            java.util.Iterator it14 = it6;
                            z6 = zBooleanValue;
                            dMax = (((double) java.lang.Math.max(0, i17)) / 14.0d) + 1.0d;
                            if (z6) {
                                i12 = tMDBSearchResult3.f20292a;
                                if (setR1.contains(new java.lang.Integer(i12))) {
                                    java.lang.Integer num8 = new java.lang.Integer(i12);
                                    java.lang.Double d12 = (java.lang.Double) linkedHashMap.get(new java.lang.Integer(i12));
                                    r26 = r15;
                                    set = setR1;
                                    linkedHashMap.put(num8, new java.lang.Double((d12 != null ? d12.doubleValue() : 0.0d) + dMax));
                                    linkedHashMap3.put(new java.lang.Integer(i12), tMDBSearchResult3);
                                } else {
                                    set = setR1;
                                    r26 = r15;
                                }
                            } else {
                                set = setR1;
                                r26 = r15;
                                i11 = tMDBSearchResult3.f20292a;
                                if (!setR2.contains(new java.lang.Integer(i11))) {
                                    java.lang.Integer num9 = new java.lang.Integer(i11);
                                    java.lang.Double d13 = (java.lang.Double) linkedHashMap2.get(new java.lang.Integer(i11));
                                    linkedHashMap2.put(num9, new java.lang.Double((d13 != null ? d13.doubleValue() : 0.0d) + dMax));
                                    linkedHashMap4.put(new java.lang.Integer(i11), tMDBSearchResult3);
                                }
                            }
                            it6 = it14;
                            zBooleanValue = z6;
                            it3 = it13;
                            i9 = i10;
                            r15 = r26;
                            setR1 = set;
                            r10 = r11;
                            r9 = r26;
                            c1267f0.f14446h = th;
                            c1267f0.f14447i = null;
                            c1267f0.j = null;
                            c1267f0.f14448k = null;
                            c1267f0.f14451n = 8;
                            if (r10.m(r9, c1267f0) != aVar) {
                                throw th;
                            }
                            return aVar;
                        }
                        r15 = r15;
                    }
                    r25 = r15;
                    java.util.List listI5 = p078i6.o.I1(linkedHashMap.entrySet(), new p005a5.B(4));
                    arrayList5 = new java.util.ArrayList();
                    it4 = listI5.iterator();
                    while (it4.hasNext()) {
                        tMDBSearchResult2 = (com.kiptv.core.model.TMDBSearchResult) linkedHashMap3.get(((java.util.Map.Entry) it4.next()).getKey());
                        if (tMDBSearchResult2 != null) {
                            arrayList5.add(tMDBSearchResult2);
                        }
                    }
                    listJ1 = p078i6.o.J1(arrayList5, 40);
                    java.util.List listI6 = p078i6.o.I1(linkedHashMap2.entrySet(), new p005a5.B(5));
                    arrayList6 = new java.util.ArrayList();
                    it5 = listI6.iterator();
                    while (it5.hasNext()) {
                        tMDBSearchResult = (com.kiptv.core.model.TMDBSearchResult) linkedHashMap4.get(((java.util.Map.Entry) it5.next()).getKey());
                        if (tMDBSearchResult != null) {
                            arrayList6.add(tMDBSearchResult);
                        }
                    }
                    listJ2 = p078i6.o.J1(arrayList6, 40);
                    c1267f0.f14446h = r11;
                    c1267f0.f14447i = str;
                    c1267f0.j = listJ1;
                    c1267f0.f14448k = listJ2;
                    c1267f0.f14451n = 4;
                    objL = (S4.x) ((V7.n0) r11.f14854f.f13185n.f10419h).getValue();
                    if (objL == null) {
                        objL = S7.C.L(r11.f14848A, new p005a5.C1327l0(r11, null), c1267f0);
                        break;
                    }
                    if (objL != aVar) {
                        linkedHashMap = listJ2;
                        objM = objL;
                        r15 = r15;
                        r12 = r11;
                        r27 = r25;
                        r13 = r12;
                        xVar = (S4.x) objM;
                        if (xVar != null) {
                            V7.n0 n0Var13 = r13.f14856i;
                            p005a5.V v16 = p005a5.V.f14006h;
                            n0Var13.getClass();
                            n0Var13.i(null, v16);
                            c1267f0.f14446h = a2;
                            c1267f0.f14447i = null;
                            c1267f0.j = null;
                            c1267f0.f14448k = null;
                            c1267f0.f14451n = 5;
                        } else {
                            r14 = r27;
                            p005a5.i9 i9Var3 = r13.f14850b;
                            r15 = (java.util.Set) ((V7.n0) i9Var3.f14630n.f10419h).getValue();
                            java.lang.Iterable iterable5 = (java.lang.Iterable) ((V7.n0) i9Var3.f14628l.f10419h).getValue();
                            arrayList7 = new java.util.ArrayList();
                            while (r6.hasNext()) {
                                if (((com.kiptv.core.model.WatchProgress) obj3).f20614e == com.kiptv.core.model.z0.f20885i) {
                                    arrayList7.add(obj3);
                                }
                            }
                            arrayList8 = new java.util.ArrayList(p078i6.q.I0(arrayList7, 10));
                            it7 = arrayList7.iterator();
                            while (it7.hasNext()) {
                                arrayList8.add(((com.kiptv.core.model.WatchProgress) it7.next()).f20613d);
                            }
                            java.util.Set setR7 = p078i6.o.R1(arrayList8);
                            java.lang.Iterable<com.kiptv.core.model.WatchProgress> iterable6 = (java.lang.Iterable) ((V7.n0) i9Var3.f14628l.f10419h).getValue();
                            arrayList9 = new java.util.ArrayList();
                            while (r0.hasNext()) {
                                if (watchProgress2.f20614e == com.kiptv.core.model.z0.j) {
                                    str2 = watchProgress2.g;
                                } else {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    arrayList9.add(str2);
                                }
                            }
                            java.util.Set setR8 = p078i6.o.R1(arrayList9);
                            Z7.e eVar3 = S7.M.f9549a;
                            p005a5.C1277g0 c1277g2 = new p005a5.C1277g0(listJ1, r13, xVar, r15, setR7, linkedHashMap, setR8, null);
                            c1267f0.f14446h = r13;
                            c1267f0.f14447i = str;
                            c1267f0.j = null;
                            c1267f0.f14448k = null;
                            c1267f0.f14451n = 6;
                            objM = S7.C.K(eVar3, c1277g2, c1267f0);
                            if (objM != aVar) {
                                r10 = r13;
                                r9 = r14;
                                r15 = r15;
                                p070h6.k kVar6 = (p070h6.k) objM;
                                java.util.List list10 = (java.util.List) kVar6.f22539h;
                                java.util.List list11 = (java.util.List) kVar6.f22540i;
                                V7.n0 n0Var14 = r10.g;
                                java.util.ArrayList arrayListI3 = i(list10, 24, list11);
                                n0Var14.getClass();
                                n0Var14.i(null, arrayListI3);
                                V7.n0 n0Var15 = r10.f14856i;
                                p005a5.V v17 = p005a5.V.j;
                                n0Var15.getClass();
                                n0Var15.i(null, v17);
                                r10.f14862p = str;
                                c1267f0.f14446h = null;
                                c1267f0.f14447i = null;
                                c1267f0.f14451n = 7;
                            }
                        }
                        break;
                    }
                    return aVar;
                case 4:
                    java.util.List list12 = c1267f0.f14448k;
                    listJ1 = (java.util.List) c1267f0.j;
                    java.lang.String str3 = (java.lang.String) c1267f0.f14447i;
                    p005a5.C1357o0 c1357o2 = (p005a5.C1357o0) c1267f0.f14446h;
                    com.google.common.util.concurrent.P.u0(objM);
                    linkedHashMap = list12;
                    str = str3;
                    r27 = "recommended";
                    r15 = r15;
                    r12 = c1357o2;
                    r13 = r12;
                    xVar = (S4.x) objM;
                    if (xVar != null) {
                        r14 = r27;
                        p005a5.i9 i9Var4 = r13.f14850b;
                        r15 = (java.util.Set) ((V7.n0) i9Var4.f14630n.f10419h).getValue();
                        java.lang.Iterable iterable7 = (java.lang.Iterable) ((V7.n0) i9Var4.f14628l.f10419h).getValue();
                        arrayList7 = new java.util.ArrayList();
                        while (r6.hasNext()) {
                            if (((com.kiptv.core.model.WatchProgress) obj3).f20614e == com.kiptv.core.model.z0.f20885i) {
                                arrayList7.add(obj3);
                            }
                        }
                        arrayList8 = new java.util.ArrayList(p078i6.q.I0(arrayList7, 10));
                        it7 = arrayList7.iterator();
                        while (it7.hasNext()) {
                            arrayList8.add(((com.kiptv.core.model.WatchProgress) it7.next()).f20613d);
                        }
                        java.util.Set setR9 = p078i6.o.R1(arrayList8);
                        java.lang.Iterable<com.kiptv.core.model.WatchProgress> iterable8 = (java.lang.Iterable) ((V7.n0) i9Var4.f14628l.f10419h).getValue();
                        arrayList9 = new java.util.ArrayList();
                        while (r0.hasNext()) {
                            if (watchProgress2.f20614e == com.kiptv.core.model.z0.j) {
                                str2 = watchProgress2.g;
                            } else {
                                str2 = null;
                            }
                            if (str2 != null) {
                                arrayList9.add(str2);
                            }
                        }
                        java.util.Set setR10 = p078i6.o.R1(arrayList9);
                        Z7.e eVar4 = S7.M.f9549a;
                        p005a5.C1277g0 c1277g3 = new p005a5.C1277g0(listJ1, r13, xVar, r15, setR9, linkedHashMap, setR10, null);
                        c1267f0.f14446h = r13;
                        c1267f0.f14447i = str;
                        c1267f0.j = null;
                        c1267f0.f14448k = null;
                        c1267f0.f14451n = 6;
                        objM = S7.C.K(eVar4, c1277g3, c1267f0);
                        if (objM != aVar) {
                            r10 = r13;
                            r9 = r14;
                            r15 = r15;
                            p070h6.k kVar7 = (p070h6.k) objM;
                            java.util.List list13 = (java.util.List) kVar7.f22539h;
                            java.util.List list14 = (java.util.List) kVar7.f22540i;
                            V7.n0 n0Var16 = r10.g;
                            java.util.ArrayList arrayListI4 = i(list13, 24, list14);
                            n0Var16.getClass();
                            n0Var16.i(null, arrayListI4);
                            V7.n0 n0Var17 = r10.f14856i;
                            p005a5.V v18 = p005a5.V.j;
                            n0Var17.getClass();
                            n0Var17.i(null, v18);
                            r10.f14862p = str;
                            c1267f0.f14446h = null;
                            c1267f0.f14447i = null;
                            c1267f0.f14451n = 7;
                        }
                        break;
                    } else {
                        V7.n0 n0Var18 = r13.f14856i;
                        p005a5.V v19 = p005a5.V.f14006h;
                        n0Var18.getClass();
                        n0Var18.i(null, v19);
                        c1267f0.f14446h = a2;
                        c1267f0.f14447i = null;
                        c1267f0.j = null;
                        c1267f0.f14448k = null;
                        c1267f0.f14451n = 5;
                        break;
                    }
                    return aVar;
                case 6:
                    str = (java.lang.String) c1267f0.f14447i;
                    r10 = (p005a5.C1357o0) c1267f0.f14446h;
                    try {
                        com.google.common.util.concurrent.P.u0(objM);
                        r9 = "recommended";
                        r10 = r10;
                        r15 = r15;
                        p070h6.k kVar8 = (p070h6.k) objM;
                        java.util.List list15 = (java.util.List) kVar8.f22539h;
                        java.util.List list16 = (java.util.List) kVar8.f22540i;
                        V7.n0 n0Var19 = r10.g;
                        java.util.ArrayList arrayListI5 = i(list15, 24, list16);
                        n0Var19.getClass();
                        n0Var19.i(null, arrayListI5);
                        V7.n0 n0Var110 = r10.f14856i;
                        p005a5.V v110 = p005a5.V.j;
                        n0Var110.getClass();
                        n0Var110.i(null, v110);
                        r10.f14862p = str;
                        c1267f0.f14446h = null;
                        c1267f0.f14447i = null;
                        c1267f0.f14451n = 7;
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        r9 = "recommended";
                    }
                    break;
                case 7:
                    com.google.common.util.concurrent.P.u0(objM);
                    return a2;
                case 8:
                    java.lang.Throwable th10 = (java.lang.Throwable) c1267f0.f14446h;
                    com.google.common.util.concurrent.P.u0(objM);
                    throw th10;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Throwable th11) {
            th = th11;
            r9 = "recommended";
        }
    }

    public final java.lang.Object m(java.lang.String str, p117n6.c cVar) throws java.lang.Throwable {
        java.lang.Object objK = S7.C.K(S7.s0.f9618h, new p005a5.C1337m0(this, str, null), cVar);
        return objK == p109m6.a.f25430h ? objK : p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(java.lang.String str, p117n6.c cVar) {
        p005a5.C1347n0 c1347n0;
        p028c8.d dVar;
        p005a5.C1357o0 c1357o0;
        if (cVar instanceof p005a5.C1347n0) {
            c1347n0 = (p005a5.C1347n0) cVar;
            int i3 = c1347n0.f14801m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1347n0.f14801m = i3 - Integer.MIN_VALUE;
            } else {
                c1347n0 = new p005a5.C1347n0(this, cVar);
            }
        } else {
            c1347n0 = new p005a5.C1347n0(this, cVar);
        }
        java.lang.Object obj = c1347n0.f14799k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1347n0.f14801m;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (kotlin.jvm.internal.m.a(str, this.f14861o)) {
                return a2;
            }
            c1347n0.f14797h = this;
            c1347n0.f14798i = str;
            dVar = this.f14868v;
            c1347n0.j = dVar;
            c1347n0.f14801m = 1;
            if (dVar.e(c1347n0) == aVar) {
                return aVar;
            }
            c1357o0 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p028c8.d dVar2 = c1347n0.j;
            java.lang.String str2 = c1347n0.f14798i;
            c1357o0 = c1347n0.f14797h;
            com.google.common.util.concurrent.P.u0(obj);
            dVar = dVar2;
            str = str2;
        }
        try {
            c1357o0.f14861o = str;
            V7.n0 n0Var = c1357o0.g;
            p078i6.w wVar = p078i6.w.f23205h;
            n0Var.getClass();
            n0Var.i(null, wVar);
            V7.n0 n0Var2 = c1357o0.f14856i;
            p005a5.V v6 = p005a5.V.f14006h;
            n0Var2.getClass();
            n0Var2.i(null, v6);
            c1357o0.f14862p = null;
            V7.n0 n0Var3 = c1357o0.f14857k;
            p078i6.x xVar = p078i6.x.f23206h;
            n0Var3.getClass();
            n0Var3.i(null, xVar);
            V7.n0 n0Var4 = c1357o0.f14859m;
            n0Var4.getClass();
            n0Var4.i(null, xVar);
            c1357o0.f14863q.clear();
            c1357o0.f14864r.clear();
            c1357o0.f14865s.clear();
            c1357o0.f14866t.clear();
            c1357o0.f14867u.clear();
            return a2;
        } finally {
            dVar.g(null);
        }
    }

    public final void o(java.lang.String str, java.util.List list) {
        V7.n0 n0Var = this.f14857k;
        java.util.Map mapS0 = p078i6.C.S0((java.util.Map) n0Var.getValue(), new p070h6.k(str, list));
        n0Var.getClass();
        n0Var.i(null, mapS0);
    }

    public final void p(java.lang.String str, p005a5.V v6) {
        V7.n0 n0Var = this.f14859m;
        java.util.Map mapS0 = p078i6.C.S0((java.util.Map) n0Var.getValue(), new p070h6.k(str, v6));
        n0Var.getClass();
        n0Var.i(null, mapS0);
    }
}
