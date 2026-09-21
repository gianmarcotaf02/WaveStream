package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class B3 {
    public static final p005a5.O2 Companion = new p005a5.O2();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final O7.o f13173A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a5.C1366p f13174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1451x5 f13175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U4.q f13176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.n9 f13177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1291h4 f13178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.kiptv.core.local.cache.a f13179f;
    public final X7.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p028c8.d f13180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.n0 f13181i;
    public final V7.W j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.n0 f13182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.W f13183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V7.n0 f13184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V7.W f13185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.List f13186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.List f13187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.lang.String f13188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p070h6.k f13190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final V7.n0 f13191t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f13192u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final O7.o f13193v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final O7.o f13194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final O7.o f13195x;
    public final O7.o y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final O7.o f13196z;

    public B3(p005a5.C1366p contentCache, p005a5.C1451x5 tmdbRepository, p005a5.M1 playlistRepository, U4.q diskCache, p005a5.n9 xmltvRepository, p005a5.C1291h4 settingsRepository, com.kiptv.core.local.cache.a collectionStore) {
        kotlin.jvm.internal.m.e(contentCache, "contentCache");
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(playlistRepository, "playlistRepository");
        kotlin.jvm.internal.m.e(diskCache, "diskCache");
        kotlin.jvm.internal.m.e(xmltvRepository, "xmltvRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(collectionStore, "collectionStore");
        this.f13174a = contentCache;
        this.f13175b = tmdbRepository;
        this.f13176c = diskCache;
        this.f13177d = xmltvRepository;
        this.f13178e = settingsRepository;
        this.f13179f = collectionStore;
        X7.c cVarC = S7.C.c(S7.M.f9549a.plus(S7.C.e()));
        this.g = cVarC;
        this.f13180h = new p028c8.d();
        V7.n0 n0VarB = V7.r.b(java.lang.Boolean.FALSE);
        this.f13181i = n0VarB;
        this.j = new V7.W(n0VarB);
        V7.n0 n0VarB2 = V7.r.b(java.lang.Float.valueOf(0.0f));
        this.f13182k = n0VarB2;
        this.f13183l = new V7.W(n0VarB2);
        V7.n0 n0VarB3 = V7.r.b(null);
        this.f13184m = n0VarB3;
        this.f13185n = new V7.W(n0VarB3);
        p078i6.w wVar = p078i6.w.f23205h;
        this.f13186o = wVar;
        this.f13187p = wVar;
        this.f13190s = new p070h6.k(0, 0);
        V7.n0 n0VarB4 = V7.r.b(0);
        this.f13191t = n0VarB4;
        p005a5.C1280g3 c1280g3 = new p005a5.C1280g3(5, null);
        V7.W w6 = contentCache.f14912f;
        V7.W w9 = contentCache.f14916l;
        V7.W w10 = playlistRepository.f13659k;
        V7.Q qI = V7.r.i(w6, w9, w10, n0VarB4, c1280g3);
        X7.t tVar = new X7.t(2);
        kotlin.jvm.internal.E.c(2, tVar);
        V7.r.s(new V7.C0999z(V7.r.k(new V7.C0980f(qI, tVar), 500L), new p005a5.M2(this, null), 1), cVarC);
        X7.t tVar2 = new X7.t(3);
        kotlin.jvm.internal.E.c(2, tVar2);
        V7.r.s(new V7.C0999z(new V7.C0980f(w10, tVar2), new p005a5.N2(this, null), 1), cVarC);
        kotlin.jvm.internal.m.d(java.util.regex.Pattern.compile("\\((\\d{4})\\)"), "compile(...)");
        O7.p[] pVarArr = O7.p.f8061h;
        this.f13193v = new O7.o("\\b(4k|uhd|2160p|1080p|fhd|720p|hd|bluray|blu-ray|web-dl|webdl|webrip|cam|ts|dvdrip|hdrip|bdrip|brrip)\\b", 0);
        this.f13194w = new O7.o("\\b(ita|eng|sub|dub|subita|dubbed|italian|english|multi|dual)\\b", 0);
        this.f13195x = new O7.o("\\[.*?\\]");
        this.y = new O7.o("\\s*[-–—]\\s*$");
        this.f13196z = new O7.o("\\s+");
        this.f13173A = new O7.o("\\bhd\\b", 0);
    }

    public static final int a(p005a5.B3 b9, java.lang.String str) {
        b9.getClass();
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        if (O7.q.B0(lowerCase, "4k", false) || O7.q.B0(lowerCase, "uhd", false) || O7.q.B0(lowerCase, "2160p", false)) {
            return 5;
        }
        if (O7.q.B0(lowerCase, "1080p", false) || O7.q.B0(lowerCase, "fhd", false) || O7.q.B0(lowerCase, "bluray", false) || O7.q.B0(lowerCase, "blu-ray", false) || O7.q.B0(lowerCase, "bdrip", false) || O7.q.B0(lowerCase, "brrip", false)) {
            return 4;
        }
        if (O7.q.B0(lowerCase, "720p", false) || b9.f13173A.f8060h.matcher(lowerCase).find()) {
            return 3;
        }
        if (O7.q.B0(lowerCase, "web-dl", false) || O7.q.B0(lowerCase, "webdl", false) || O7.q.B0(lowerCase, "webrip", false)) {
            return 2;
        }
        return (O7.q.B0(lowerCase, "cam", false) || O7.q.B0(lowerCase, "ts", false) || O7.q.B0(lowerCase, "dvdrip", false)) ? 0 : 1;
    }

    public static final boolean b(p005a5.B3 b9, com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, java.util.Map map) {
        b9.getClass();
        if (!kotlin.jvm.internal.m.a(xtreamLiveStream.j, androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && !O7.x.r0(xtreamLiveStream.j, "true", true)) {
            p005a5.C1381q4 c1381q4 = p005a5.C1451x5.Companion;
            java.lang.String strE = e(xtreamLiveStream.f20660h, xtreamLiveStream.f20661i, map);
            c1381q4.getClass();
            if (!p005a5.C1381q4.b(strE)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(p005a5.B3 b9, com.kiptv.core.model.XtreamVODStream xtreamVODStream, com.kiptv.core.model.C1944g0 c1944g0, java.util.LinkedHashMap linkedHashMap) {
        b9.getClass();
        java.lang.String str = xtreamVODStream.f20731l;
        if (str == null) {
            str = "";
        }
        java.lang.String strE = e(str, xtreamVODStream.f20732m, linkedHashMap);
        java.lang.String strValueOf = java.lang.String.valueOf(xtreamVODStream.f20725d);
        com.kiptv.core.model.EnumC1937d enumC1937d = com.kiptv.core.model.EnumC1937d.MOVIES;
        return (c1944g0.c(strValueOf, enumC1937d) || c1944g0.b(strE, str, enumC1937d)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x027f A[Catch: all -> 0x00bc, Exception -> 0x027b, TryCatch #13 {Exception -> 0x027b, blocks: (B:97:0x0265, B:99:0x026d, B:104:0x027f, B:105:0x0294), top: B:150:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0294 A[Catch: all -> 0x00bc, Exception -> 0x027b, TRY_LEAVE, TryCatch #13 {Exception -> 0x027b, blocks: (B:97:0x0265, B:99:0x026d, B:104:0x027f, B:105:0x0294), top: B:150:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c2 A[Catch: all -> 0x0090, Exception -> 0x02f6, TRY_LEAVE, TryCatch #5 {Exception -> 0x02f6, blocks: (B:109:0x02be, B:111:0x02c2), top: B:144:0x02be }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ef A[Catch: all -> 0x01f3, Exception -> 0x01f8, TryCatch #16 {Exception -> 0x01f8, all -> 0x01f3, blocks: (B:77:0x01eb, B:79:0x01ef, B:86:0x0201), top: B:153:0x01eb }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x026d A[Catch: all -> 0x00bc, Exception -> 0x027b, TryCatch #13 {Exception -> 0x027b, blocks: (B:97:0x0265, B:99:0x026d, B:104:0x027f, B:105:0x0294), top: B:150:0x0265 }] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
    
        if (r1.e(r7) == r8) goto L113;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x027f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [c8.a, c8.d] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v4, types: [c8.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [c8.a] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [c8.a] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [c8.a] */
    /* JADX WARN: Type inference failed for: r6v21, types: [c8.a] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [c8.a] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [a5.h3, l6.c] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a5.B3] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [c8.a] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v8 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object d(p005a5.B3 b9, p005a5.S2 s9, p117n6.c cVar) throws java.lang.Throwable {
        ?? c1290h3;
        ?? r9;
        java.util.ArrayList arrayList;
        long jCurrentTimeMillis;
        java.lang.String str;
        p070h6.k kVar;
        ?? r10;
        java.util.List list;
        p005a5.B3 b10;
        ?? r11;
        ?? r12;
        java.util.List list2;
        java.lang.String str2;
        java.lang.String str3;
        p005a5.B3 b11;
        ?? r13;
        boolean z6;
        java.lang.String str4;
        java.util.List list3;
        java.util.List list4;
        S4.x xVar;
        p005a5.B3 b12;
        java.lang.String str5;
        p070h6.k kVar2;
        long j;
        java.util.List list5;
        java.util.List list6;
        java.lang.Object obj;
        java.lang.Object objK;
        p070h6.k kVar3;
        java.util.List list7;
        java.util.List list8;
        java.lang.String str6;
        p005a5.B3 b13;
        long j9;
        S4.x xVar2;
        U4.q qVar;
        p070h6.k kVar4;
        S4.x xVar3;
        ?? r14;
        ?? r15;
        java.util.List list9;
        java.util.List list10;
        java.util.List list11;
        ?? r16;
        p028c8.a aVar;
        java.util.List list12;
        p005a5.B3 b14 = b9;
        b14.getClass();
        if (cVar instanceof p005a5.C1290h3) {
            p005a5.C1290h3 c1290h4 = (p005a5.C1290h3) cVar;
            int i3 = c1290h4.f14548r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1290h4.f14548r = i3 - Integer.MIN_VALUE;
                c1290h3 = c1290h4;
            } else {
                c1290h3 = new p005a5.C1290h3(b14, cVar);
            }
        } else {
            c1290h3 = new p005a5.C1290h3(b14, cVar);
        }
        java.lang.Object obj2 = c1290h3.f14546p;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = c1290h3.f14548r;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            try {
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(obj2);
                    java.lang.String str7 = s9.f13876a;
                    arrayList = s9.f13877b;
                    java.util.ArrayList arrayList2 = s9.f13878c;
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        r11 = b14.f13180h;
                        c1290h3.f14539h = b14;
                        c1290h3.f14540i = r11;
                        c1290h3.f14548r = 1;
                    } else {
                        p070h6.k kVar5 = new p070h6.k(new java.lang.Integer(arrayList.size()), new java.lang.Integer(arrayList2.size()));
                        jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        ?? r17 = b14.f13180h;
                        c1290h3.f14539h = b14;
                        c1290h3.f14540i = str7;
                        c1290h3.j = arrayList;
                        c1290h3.f14541k = arrayList2;
                        c1290h3.f14542l = kVar5;
                        c1290h3.f14543m = r17;
                        c1290h3.f14545o = jCurrentTimeMillis;
                        c1290h3.f14548r = 2;
                        if (r17.e(c1290h3) != aVar2) {
                            str = str7;
                            kVar = kVar5;
                            r10 = r17;
                            list = arrayList2;
                            b10 = b9;
                            if (str != null) {
                                list2 = arrayList;
                                r10 = aVar;
                                list2 = list12;
                                str2 = "Index rebuild failed: ";
                                if (!str.equals(b10.f13188q)) {
                                }
                            } else {
                                list2 = arrayList;
                                r10 = aVar;
                                list2 = list12;
                                str2 = "Index rebuild failed: ";
                            }
                            str3 = "Index rebuilt: ";
                            V7.n0 n0Var = b10.f13181i;
                            java.lang.Boolean bool = java.lang.Boolean.TRUE;
                            n0Var.getClass();
                            n0Var.i(null, bool);
                            V7.n0 n0Var2 = b10.f13182k;
                            java.lang.Float f9 = new java.lang.Float(0.0f);
                            n0Var2.getClass();
                            n0Var2.i(null, f9);
                            z6 = b10.f13192u;
                            if (z6) {
                                b10.f13192u = false;
                            }
                            if (z6) {
                            }
                            r13 = r10;
                            str4 = str;
                            list3 = list2;
                            list4 = list;
                            xVar = null;
                            if (!kotlin.jvm.internal.m.a(str4, b10.f13188q)) {
                                S4.x.Companion.getClass();
                                S4.x.f9477k.clear();
                            }
                            if (xVar != null) {
                                android.util.Log.d("SearchRepository", "Index disk hit for playlist=" + str4 + " — skip rebuild");
                                b11 = b10;
                                r13 = r13;
                                list9 = list3;
                            } else {
                                Z7.e eVar = S7.M.f9549a;
                                p005a5.C1300i3 c1300i3 = new p005a5.C1300i3(list3, list4, b10, null);
                                c1290h3.f14539h = b10;
                                c1290h3.f14540i = str4;
                                c1290h3.j = list3;
                                c1290h3.f14541k = list4;
                                c1290h3.f14542l = kVar;
                                c1290h3.f14543m = r13;
                                c1290h3.f14545o = jCurrentTimeMillis;
                                c1290h3.f14548r = 4;
                                objK = S7.C.K(eVar, c1300i3, c1290h3);
                                if (objK != aVar2) {
                                    kVar3 = kVar;
                                    obj2 = objK;
                                    list7 = list4;
                                    list8 = list3;
                                    long j10 = jCurrentTimeMillis;
                                    str6 = str4;
                                    b13 = b10;
                                    j9 = j10;
                                    r13 = r13;
                                    xVar2 = (S4.x) obj2;
                                    if (str6 != null) {
                                        qVar = b13.f13176c;
                                        c1290h3.f14539h = b13;
                                        c1290h3.f14540i = str6;
                                        c1290h3.j = list8;
                                        c1290h3.f14541k = list7;
                                        c1290h3.f14542l = kVar3;
                                        c1290h3.f14543m = r13;
                                        c1290h3.f14544n = xVar2;
                                        c1290h3.f14545o = j9;
                                        c1290h3.f14548r = 5;
                                        qVar.getClass();
                                        Z7.e eVar2 = S7.M.f9549a;
                                        if (S7.C.K(Z7.d.f13044i, new com.kiptv.core.local.cache.c(xVar2, str6, qVar, null), c1290h3) != aVar2) {
                                            kVar4 = kVar3;
                                            b11 = b13;
                                            xVar3 = xVar2;
                                            r16 = r13;
                                            list11 = list8;
                                            long j11 = j9;
                                            str4 = str6;
                                            jCurrentTimeMillis = j11;
                                            xVar = xVar3;
                                            kVar = kVar4;
                                            r13 = r16;
                                            list10 = list11;
                                        }
                                    } else {
                                        xVar = xVar2;
                                        kVar = kVar3;
                                        b11 = b13;
                                        long j12 = j9;
                                        str4 = str6;
                                        jCurrentTimeMillis = j12;
                                        r13 = r13;
                                        list10 = list8;
                                    }
                                    list4 = list7;
                                    java.util.List list13 = list10;
                                    android.util.Log.d("SearchRepository", str3 + list13.size() + " movies + " + list4.size() + " series (playlist=" + str4 + ")");
                                    r13 = r13;
                                    list9 = list13;
                                }
                            }
                            S4.x.Companion.getClass();
                            S4.v.f(xVar);
                            b11.f13186o = list9;
                            b11.f13187p = list4;
                            V7.n0 n0Var3 = b11.f13184m;
                            n0Var3.getClass();
                            n0Var3.i(null, xVar);
                            V7.n0 n0Var4 = b11.f13182k;
                            java.lang.Float f10 = new java.lang.Float(1.0f);
                            n0Var4.getClass();
                            n0Var4.i(null, f10);
                            b11.f13188q = str4;
                            b11.f13189r = jCurrentTimeMillis;
                            b11.f13190s = kVar;
                            V7.n0 n0Var5 = b11.f13181i;
                            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                            n0Var5.getClass();
                            n0Var5.i(null, bool2);
                            obj = null;
                            r15 = r13;
                            r14 = r15;
                        }
                    }
                    r12 = r11;
                    return aVar2;
                }
                if (i9 == 1) {
                    p028c8.a aVar3 = (p028c8.a) c1290h3.f14540i;
                    p005a5.B3 b15 = c1290h3.f14539h;
                    com.google.common.util.concurrent.P.u0(obj2);
                    r12 = aVar3;
                    b14 = b15;
                    try {
                        r12 = r11;
                        p078i6.w wVar = p078i6.w.f23205h;
                        b14.f13186o = wVar;
                        b14.f13187p = wVar;
                        java.lang.String str8 = null;
                        b14.f13184m.h(str8);
                        V7.n0 n0Var6 = b14.f13182k;
                        java.lang.Float f11 = new java.lang.Float(0.0f);
                        n0Var6.getClass();
                        n0Var6.i(str8, f11);
                        V7.n0 n0Var7 = b14.f13181i;
                        java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                        n0Var7.getClass();
                        n0Var7.i(str8, bool3);
                        b14.f13188q = str8;
                        b14.f13189r = 0L;
                        p028c8.d dVar = (p028c8.d) r12;
                        return a2;
                    } finally {
                        ((p028c8.d) r12).g(null);
                    }
                }
                if (i9 != 2) {
                    if (i9 != 3) {
                        try {
                            if (i9 == 4) {
                                j9 = c1290h3.f14545o;
                                r13 = c1290h3.f14543m;
                                kVar3 = c1290h3.f14542l;
                                list7 = c1290h3.f14541k;
                                java.util.List list14 = c1290h3.j;
                                str6 = (java.lang.String) c1290h3.f14540i;
                                b13 = c1290h3.f14539h;
                                try {
                                    try {
                                        com.google.common.util.concurrent.P.u0(obj2);
                                        str2 = "Index rebuild failed: ";
                                        str3 = "Index rebuilt: ";
                                        a2 = a2;
                                        r13 = r13;
                                        list8 = list14;
                                        try {
                                            xVar2 = (S4.x) obj2;
                                            if (str6 != null) {
                                                qVar = b13.f13176c;
                                                c1290h3.f14539h = b13;
                                                c1290h3.f14540i = str6;
                                                c1290h3.j = list8;
                                                c1290h3.f14541k = list7;
                                                c1290h3.f14542l = kVar3;
                                                c1290h3.f14543m = r13;
                                                c1290h3.f14544n = xVar2;
                                                c1290h3.f14545o = j9;
                                                c1290h3.f14548r = 5;
                                                qVar.getClass();
                                                Z7.e eVar3 = S7.M.f9549a;
                                                if (S7.C.K(Z7.d.f13044i, new com.kiptv.core.local.cache.c(xVar2, str6, qVar, null), c1290h3) != aVar2) {
                                                    kVar4 = kVar3;
                                                    b11 = b13;
                                                    xVar3 = xVar2;
                                                    r16 = r13;
                                                    list11 = list8;
                                                }
                                                r12 = r11;
                                                return aVar2;
                                            }
                                            xVar = xVar2;
                                            kVar = kVar3;
                                            b11 = b13;
                                            long j13 = j9;
                                            str4 = str6;
                                            jCurrentTimeMillis = j13;
                                            r13 = r13;
                                            list10 = list8;
                                            list4 = list7;
                                            java.util.List list15 = list10;
                                            android.util.Log.d("SearchRepository", str3 + list15.size() + " movies + " + list4.size() + " series (playlist=" + str4 + ")");
                                            r13 = r13;
                                            list9 = list15;
                                            S4.x.Companion.getClass();
                                            S4.v.f(xVar);
                                            b11.f13186o = list9;
                                            b11.f13187p = list4;
                                            V7.n0 n0Var8 = b11.f13184m;
                                            n0Var8.getClass();
                                            n0Var8.i(null, xVar);
                                            V7.n0 n0Var9 = b11.f13182k;
                                            java.lang.Float f12 = new java.lang.Float(1.0f);
                                            n0Var9.getClass();
                                            n0Var9.i(null, f12);
                                            b11.f13188q = str4;
                                            b11.f13189r = jCurrentTimeMillis;
                                            b11.f13190s = kVar;
                                            V7.n0 n0Var10 = b11.f13181i;
                                            java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
                                            n0Var10.getClass();
                                            n0Var10.i(null, bool4);
                                            obj = null;
                                            r15 = r13;
                                        } catch (java.lang.Exception e6) {
                                            e = e6;
                                            b11 = b13;
                                            android.util.Log.e("SearchRepository", str2 + e.getMessage());
                                            V7.n0 n0Var11 = b11.f13181i;
                                            java.lang.Boolean bool5 = java.lang.Boolean.FALSE;
                                            n0Var11.getClass();
                                            obj = null;
                                            n0Var11.i(null, bool5);
                                            r15 = r13;
                                        }
                                    } catch (java.lang.Exception e9) {
                                        e = e9;
                                        str2 = "Index rebuild failed: ";
                                        a2 = a2;
                                        b11 = b13;
                                        android.util.Log.e("SearchRepository", str2 + e.getMessage());
                                        V7.n0 n0Var12 = b11.f13181i;
                                        java.lang.Boolean bool6 = java.lang.Boolean.FALSE;
                                        n0Var12.getClass();
                                        obj = null;
                                        n0Var12.i(null, bool6);
                                        r15 = r13;
                                        r14 = r15;
                                        ((p028c8.d) r14).g(obj);
                                        return a2;
                                    }
                                    r14 = r15;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    c1290h3 = b13;
                                    V7.n0 n0Var13 = c1290h3.f13181i;
                                    java.lang.Boolean bool7 = java.lang.Boolean.FALSE;
                                    n0Var13.getClass();
                                    n0Var13.i(null, bool7);
                                    throw th;
                                }
                            } else {
                                if (i9 != 5) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                j9 = c1290h3.f14545o;
                                xVar3 = c1290h3.f14544n;
                                r13 = c1290h3.f14543m;
                                kVar4 = c1290h3.f14542l;
                                list7 = c1290h3.f14541k;
                                java.util.List list16 = c1290h3.j;
                                str6 = (java.lang.String) c1290h3.f14540i;
                                b11 = c1290h3.f14539h;
                                try {
                                    com.google.common.util.concurrent.P.u0(obj2);
                                    str2 = "Index rebuild failed: ";
                                    str3 = "Index rebuilt: ";
                                    a2 = a2;
                                    r16 = r13;
                                    list11 = list16;
                                } catch (java.lang.Exception e10) {
                                    e = e10;
                                    str2 = "Index rebuild failed: ";
                                    a2 = a2;
                                    android.util.Log.e("SearchRepository", str2 + e.getMessage());
                                    V7.n0 n0Var14 = b11.f13181i;
                                    java.lang.Boolean bool8 = java.lang.Boolean.FALSE;
                                    n0Var14.getClass();
                                    obj = null;
                                    n0Var14.i(null, bool8);
                                    r15 = r13;
                                }
                            }
                            android.util.Log.d("SearchRepository", str3 + list15.size() + " movies + " + list4.size() + " series (playlist=" + str4 + ")");
                            r13 = r13;
                            list9 = list15;
                            S4.x.Companion.getClass();
                            S4.v.f(xVar);
                            b11.f13186o = list9;
                            b11.f13187p = list4;
                            V7.n0 n0Var15 = b11.f13184m;
                            n0Var15.getClass();
                            n0Var15.i(null, xVar);
                            V7.n0 n0Var16 = b11.f13182k;
                            java.lang.Float f13 = new java.lang.Float(1.0f);
                            n0Var16.getClass();
                            n0Var16.i(null, f13);
                            b11.f13188q = str4;
                            b11.f13189r = jCurrentTimeMillis;
                            b11.f13190s = kVar;
                            V7.n0 n0Var17 = b11.f13181i;
                            java.lang.Boolean bool9 = java.lang.Boolean.FALSE;
                            n0Var17.getClass();
                            n0Var17.i(null, bool9);
                            obj = null;
                            r15 = r13;
                        } catch (java.lang.Exception e11) {
                            e = e11;
                            android.util.Log.e("SearchRepository", str2 + e.getMessage());
                            V7.n0 n0Var18 = b11.f13181i;
                            java.lang.Boolean bool10 = java.lang.Boolean.FALSE;
                            n0Var18.getClass();
                            obj = null;
                            n0Var18.i(null, bool10);
                            r15 = r13;
                        }
                        long j14 = j9;
                        str4 = str6;
                        jCurrentTimeMillis = j14;
                        xVar = xVar3;
                        kVar = kVar4;
                        r13 = r16;
                        list10 = list11;
                        list4 = list7;
                        java.util.List list17 = list10;
                        r14 = r15;
                    } else {
                        long j15 = c1290h3.f14545o;
                        r13 = c1290h3.f14543m;
                        kVar2 = c1290h3.f14542l;
                        list6 = c1290h3.f14541k;
                        java.util.List list18 = c1290h3.j;
                        str5 = (java.lang.String) c1290h3.f14540i;
                        p005a5.B3 b16 = c1290h3.f14539h;
                        try {
                            try {
                                com.google.common.util.concurrent.P.u0(obj2);
                                str2 = "Index rebuild failed: ";
                                str3 = "Index rebuilt: ";
                                a2 = a2;
                                b12 = b16;
                                j = j15;
                                r13 = r13;
                                list5 = list18;
                                try {
                                    list4 = list6;
                                    p005a5.B3 b17 = b12;
                                    xVar = (S4.x) obj2;
                                    kVar = kVar2;
                                    long j16 = j;
                                    b10 = b17;
                                    str4 = str5;
                                    list3 = list5;
                                    jCurrentTimeMillis = j16;
                                    r13 = r13;
                                    try {
                                        if (!kotlin.jvm.internal.m.a(str4, b10.f13188q)) {
                                            S4.x.Companion.getClass();
                                            S4.x.f9477k.clear();
                                        }
                                        if (xVar != null) {
                                            Z7.e eVar4 = S7.M.f9549a;
                                            p005a5.C1300i3 c1300i4 = new p005a5.C1300i3(list3, list4, b10, null);
                                            c1290h3.f14539h = b10;
                                            c1290h3.f14540i = str4;
                                            c1290h3.j = list3;
                                            c1290h3.f14541k = list4;
                                            c1290h3.f14542l = kVar;
                                            c1290h3.f14543m = r13;
                                            c1290h3.f14545o = jCurrentTimeMillis;
                                            c1290h3.f14548r = 4;
                                            objK = S7.C.K(eVar4, c1300i4, c1290h3);
                                            if (objK != aVar2) {
                                                kVar3 = kVar;
                                                obj2 = objK;
                                                list7 = list4;
                                                list8 = list3;
                                                long j17 = jCurrentTimeMillis;
                                                str6 = str4;
                                                b13 = b10;
                                                j9 = j17;
                                                r13 = r13;
                                                xVar2 = (S4.x) obj2;
                                                if (str6 != null) {
                                                    qVar = b13.f13176c;
                                                    c1290h3.f14539h = b13;
                                                    c1290h3.f14540i = str6;
                                                    c1290h3.j = list8;
                                                    c1290h3.f14541k = list7;
                                                    c1290h3.f14542l = kVar3;
                                                    c1290h3.f14543m = r13;
                                                    c1290h3.f14544n = xVar2;
                                                    c1290h3.f14545o = j9;
                                                    c1290h3.f14548r = 5;
                                                    qVar.getClass();
                                                    Z7.e eVar5 = S7.M.f9549a;
                                                    if (S7.C.K(Z7.d.f13044i, new com.kiptv.core.local.cache.c(xVar2, str6, qVar, null), c1290h3) != aVar2) {
                                                        kVar4 = kVar3;
                                                        b11 = b13;
                                                        xVar3 = xVar2;
                                                        r16 = r13;
                                                        list11 = list8;
                                                        long j18 = j9;
                                                        str4 = str6;
                                                        jCurrentTimeMillis = j18;
                                                        xVar = xVar3;
                                                        kVar = kVar4;
                                                        r13 = r16;
                                                        list10 = list11;
                                                    }
                                                } else {
                                                    xVar = xVar2;
                                                    kVar = kVar3;
                                                    b11 = b13;
                                                    long j19 = j9;
                                                    str4 = str6;
                                                    jCurrentTimeMillis = j19;
                                                    r13 = r13;
                                                    list10 = list8;
                                                }
                                                list4 = list7;
                                                java.util.List list19 = list10;
                                                android.util.Log.d("SearchRepository", str3 + list19.size() + " movies + " + list4.size() + " series (playlist=" + str4 + ")");
                                                r13 = r13;
                                                list9 = list19;
                                            }
                                            r12 = r11;
                                            return aVar2;
                                        }
                                        android.util.Log.d("SearchRepository", "Index disk hit for playlist=" + str4 + " — skip rebuild");
                                        b11 = b10;
                                        r13 = r13;
                                        list9 = list3;
                                        S4.x.Companion.getClass();
                                        S4.v.f(xVar);
                                        b11.f13186o = list9;
                                        b11.f13187p = list4;
                                        V7.n0 n0Var19 = b11.f13184m;
                                        n0Var19.getClass();
                                        n0Var19.i(null, xVar);
                                        V7.n0 n0Var110 = b11.f13182k;
                                        java.lang.Float f14 = new java.lang.Float(1.0f);
                                        n0Var110.getClass();
                                        n0Var110.i(null, f14);
                                        b11.f13188q = str4;
                                        b11.f13189r = jCurrentTimeMillis;
                                        b11.f13190s = kVar;
                                        V7.n0 n0Var111 = b11.f13181i;
                                        java.lang.Boolean bool11 = java.lang.Boolean.FALSE;
                                        n0Var111.getClass();
                                        n0Var111.i(null, bool11);
                                        obj = null;
                                        r15 = r13;
                                    } catch (java.lang.Exception e12) {
                                        e = e12;
                                        b11 = b10;
                                        android.util.Log.e("SearchRepository", str2 + e.getMessage());
                                        V7.n0 n0Var112 = b11.f13181i;
                                        java.lang.Boolean bool12 = java.lang.Boolean.FALSE;
                                        n0Var112.getClass();
                                        obj = null;
                                        n0Var112.i(null, bool12);
                                        r15 = r13;
                                    }
                                } catch (java.lang.Exception e13) {
                                    e = e13;
                                    b11 = b12;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    c1290h3 = b12;
                                    V7.n0 n0Var113 = c1290h3.f13181i;
                                    java.lang.Boolean bool13 = java.lang.Boolean.FALSE;
                                    n0Var113.getClass();
                                    n0Var113.i(null, bool13);
                                    throw th;
                                }
                            } catch (java.lang.Exception e14) {
                                e = e14;
                                b11 = b16;
                                str2 = "Index rebuild failed: ";
                                a2 = a2;
                            }
                            r14 = r15;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            c1290h3 = b16;
                            V7.n0 n0Var114 = c1290h3.f13181i;
                            java.lang.Boolean bool14 = java.lang.Boolean.FALSE;
                            n0Var114.getClass();
                            n0Var114.i(null, bool14);
                            throw th;
                        }
                    }
                    str2 = "Index rebuild failed: ";
                    a2 = a2;
                    android.util.Log.e("SearchRepository", str2 + e.getMessage());
                    V7.n0 n0Var115 = b11.f13181i;
                    java.lang.Boolean bool15 = java.lang.Boolean.FALSE;
                    n0Var115.getClass();
                    obj = null;
                    n0Var115.i(null, bool15);
                    r15 = r13;
                    r14 = r15;
                } else {
                    long j20 = c1290h3.f14545o;
                    aVar = c1290h3.f14543m;
                    p070h6.k kVar6 = c1290h3.f14542l;
                    java.util.List list20 = c1290h3.f14541k;
                    list12 = c1290h3.j;
                    str = (java.lang.String) c1290h3.f14540i;
                    b10 = c1290h3.f14539h;
                    com.google.common.util.concurrent.P.u0(obj2);
                    kVar = kVar6;
                    list = list20;
                    jCurrentTimeMillis = j20;
                    try {
                        if (str != null) {
                            list2 = arrayList;
                            r10 = aVar;
                            list2 = list12;
                            str2 = "Index rebuild failed: ";
                            try {
                                if (!str.equals(b10.f13188q) && kotlin.jvm.internal.m.a(kVar, b10.f13190s)) {
                                    str3 = "Index rebuilt: ";
                                    if (jCurrentTimeMillis - b10.f13189r < 21600000 && b10.f13184m.getValue() != null) {
                                        android.util.Log.d("SearchRepository", "Index memory hit for playlist=" + str + " — skip rebuild");
                                        obj = null;
                                        r14 = r10;
                                    }
                                }
                                V7.n0 n0Var20 = b10.f13181i;
                                java.lang.Boolean bool16 = java.lang.Boolean.TRUE;
                                n0Var20.getClass();
                                n0Var20.i(null, bool16);
                                V7.n0 n0Var21 = b10.f13182k;
                                java.lang.Float f15 = new java.lang.Float(0.0f);
                                n0Var21.getClass();
                                n0Var21.i(null, f15);
                                z6 = b10.f13192u;
                                if (z6) {
                                    b10.f13192u = false;
                                }
                                if (!z6 || str == null) {
                                    r13 = r10;
                                    str4 = str;
                                    list3 = list2;
                                    list4 = list;
                                    xVar = null;
                                    if (!kotlin.jvm.internal.m.a(str4, b10.f13188q)) {
                                        S4.x.Companion.getClass();
                                        S4.x.f9477k.clear();
                                    }
                                    if (xVar != null) {
                                        android.util.Log.d("SearchRepository", "Index disk hit for playlist=" + str4 + " — skip rebuild");
                                        b11 = b10;
                                        r13 = r13;
                                        list9 = list3;
                                    } else {
                                        Z7.e eVar6 = S7.M.f9549a;
                                        p005a5.C1300i3 c1300i5 = new p005a5.C1300i3(list3, list4, b10, null);
                                        c1290h3.f14539h = b10;
                                        c1290h3.f14540i = str4;
                                        c1290h3.j = list3;
                                        c1290h3.f14541k = list4;
                                        c1290h3.f14542l = kVar;
                                        c1290h3.f14543m = r13;
                                        c1290h3.f14545o = jCurrentTimeMillis;
                                        c1290h3.f14548r = 4;
                                        objK = S7.C.K(eVar6, c1300i5, c1290h3);
                                        if (objK != aVar2) {
                                            kVar3 = kVar;
                                            obj2 = objK;
                                            list7 = list4;
                                            list8 = list3;
                                            long j110 = jCurrentTimeMillis;
                                            str6 = str4;
                                            b13 = b10;
                                            j9 = j110;
                                            r13 = r13;
                                            xVar2 = (S4.x) obj2;
                                            if (str6 != null) {
                                                qVar = b13.f13176c;
                                                c1290h3.f14539h = b13;
                                                c1290h3.f14540i = str6;
                                                c1290h3.j = list8;
                                                c1290h3.f14541k = list7;
                                                c1290h3.f14542l = kVar3;
                                                c1290h3.f14543m = r13;
                                                c1290h3.f14544n = xVar2;
                                                c1290h3.f14545o = j9;
                                                c1290h3.f14548r = 5;
                                                qVar.getClass();
                                                Z7.e eVar7 = S7.M.f9549a;
                                                if (S7.C.K(Z7.d.f13044i, new com.kiptv.core.local.cache.c(xVar2, str6, qVar, null), c1290h3) != aVar2) {
                                                    kVar4 = kVar3;
                                                    b11 = b13;
                                                    xVar3 = xVar2;
                                                    r16 = r13;
                                                    list11 = list8;
                                                    long j111 = j9;
                                                    str4 = str6;
                                                    jCurrentTimeMillis = j111;
                                                    xVar = xVar3;
                                                    kVar = kVar4;
                                                    r13 = r16;
                                                    list10 = list11;
                                                }
                                            } else {
                                                xVar = xVar2;
                                                kVar = kVar3;
                                                b11 = b13;
                                                long j112 = j9;
                                                str4 = str6;
                                                jCurrentTimeMillis = j112;
                                                r13 = r13;
                                                list10 = list8;
                                            }
                                            list4 = list7;
                                            java.util.List list110 = list10;
                                            android.util.Log.d("SearchRepository", str3 + list110.size() + " movies + " + list4.size() + " series (playlist=" + str4 + ")");
                                            r13 = r13;
                                            list9 = list110;
                                        }
                                    }
                                    S4.x.Companion.getClass();
                                    S4.v.f(xVar);
                                    b11.f13186o = list9;
                                    b11.f13187p = list4;
                                    V7.n0 n0Var116 = b11.f13184m;
                                    n0Var116.getClass();
                                    n0Var116.i(null, xVar);
                                    V7.n0 n0Var117 = b11.f13182k;
                                    java.lang.Float f16 = new java.lang.Float(1.0f);
                                    n0Var117.getClass();
                                    n0Var117.i(null, f16);
                                    b11.f13188q = str4;
                                    b11.f13189r = jCurrentTimeMillis;
                                    b11.f13190s = kVar;
                                    V7.n0 n0Var118 = b11.f13181i;
                                    java.lang.Boolean bool17 = java.lang.Boolean.FALSE;
                                    n0Var118.getClass();
                                    n0Var118.i(null, bool17);
                                    obj = null;
                                    r15 = r13;
                                    r14 = r15;
                                } else {
                                    U4.q qVar2 = b10.f13176c;
                                    c1290h3.f14539h = b10;
                                    c1290h3.f14540i = str;
                                    c1290h3.j = list2;
                                    c1290h3.f14541k = list;
                                    c1290h3.f14542l = kVar;
                                    c1290h3.f14543m = r10;
                                    c1290h3.f14545o = jCurrentTimeMillis;
                                    c1290h3.f14548r = 3;
                                    qVar2.getClass();
                                    Z7.e eVar8 = S7.M.f9549a;
                                    java.lang.String str9 = str;
                                    java.util.List list21 = list;
                                    java.util.List list22 = list2;
                                    java.lang.Object objK2 = S7.C.K(Z7.d.f13044i, new com.kiptv.core.local.cache.b(qVar2, str9, list22, list21, null), c1290h3);
                                    if (objK2 != aVar2) {
                                        b12 = b10;
                                        r13 = r10;
                                        str5 = str9;
                                        kVar2 = kVar;
                                        obj2 = objK2;
                                        j = jCurrentTimeMillis;
                                        list5 = list22;
                                        list6 = list21;
                                        list4 = list6;
                                        p005a5.B3 b18 = b12;
                                        xVar = (S4.x) obj2;
                                        kVar = kVar2;
                                        long j113 = j;
                                        b10 = b18;
                                        str4 = str5;
                                        list3 = list5;
                                        jCurrentTimeMillis = j113;
                                        r13 = r13;
                                        if (!kotlin.jvm.internal.m.a(str4, b10.f13188q)) {
                                            S4.x.Companion.getClass();
                                            S4.x.f9477k.clear();
                                        }
                                        if (xVar != null) {
                                            android.util.Log.d("SearchRepository", "Index disk hit for playlist=" + str4 + " — skip rebuild");
                                            b11 = b10;
                                            r13 = r13;
                                            list9 = list3;
                                        } else {
                                            Z7.e eVar9 = S7.M.f9549a;
                                            p005a5.C1300i3 c1300i6 = new p005a5.C1300i3(list3, list4, b10, null);
                                            c1290h3.f14539h = b10;
                                            c1290h3.f14540i = str4;
                                            c1290h3.j = list3;
                                            c1290h3.f14541k = list4;
                                            c1290h3.f14542l = kVar;
                                            c1290h3.f14543m = r13;
                                            c1290h3.f14545o = jCurrentTimeMillis;
                                            c1290h3.f14548r = 4;
                                            objK = S7.C.K(eVar9, c1300i6, c1290h3);
                                            if (objK != aVar2) {
                                                kVar3 = kVar;
                                                obj2 = objK;
                                                list7 = list4;
                                                list8 = list3;
                                                long j114 = jCurrentTimeMillis;
                                                str6 = str4;
                                                b13 = b10;
                                                j9 = j114;
                                                r13 = r13;
                                                xVar2 = (S4.x) obj2;
                                                if (str6 != null) {
                                                    qVar = b13.f13176c;
                                                    c1290h3.f14539h = b13;
                                                    c1290h3.f14540i = str6;
                                                    c1290h3.j = list8;
                                                    c1290h3.f14541k = list7;
                                                    c1290h3.f14542l = kVar3;
                                                    c1290h3.f14543m = r13;
                                                    c1290h3.f14544n = xVar2;
                                                    c1290h3.f14545o = j9;
                                                    c1290h3.f14548r = 5;
                                                    qVar.getClass();
                                                    Z7.e eVar10 = S7.M.f9549a;
                                                    if (S7.C.K(Z7.d.f13044i, new com.kiptv.core.local.cache.c(xVar2, str6, qVar, null), c1290h3) != aVar2) {
                                                        kVar4 = kVar3;
                                                        b11 = b13;
                                                        xVar3 = xVar2;
                                                        r16 = r13;
                                                        list11 = list8;
                                                        long j115 = j9;
                                                        str4 = str6;
                                                        jCurrentTimeMillis = j115;
                                                        xVar = xVar3;
                                                        kVar = kVar4;
                                                        r13 = r16;
                                                        list10 = list11;
                                                    }
                                                } else {
                                                    xVar = xVar2;
                                                    kVar = kVar3;
                                                    b11 = b13;
                                                    long j116 = j9;
                                                    str4 = str6;
                                                    jCurrentTimeMillis = j116;
                                                    r13 = r13;
                                                    list10 = list8;
                                                }
                                                list4 = list7;
                                                java.util.List list111 = list10;
                                                android.util.Log.d("SearchRepository", str3 + list111.size() + " movies + " + list4.size() + " series (playlist=" + str4 + ")");
                                                r13 = r13;
                                                list9 = list111;
                                            }
                                        }
                                        S4.x.Companion.getClass();
                                        S4.v.f(xVar);
                                        b11.f13186o = list9;
                                        b11.f13187p = list4;
                                        V7.n0 n0Var119 = b11.f13184m;
                                        n0Var119.getClass();
                                        n0Var119.i(null, xVar);
                                        V7.n0 n0Var1110 = b11.f13182k;
                                        java.lang.Float f17 = new java.lang.Float(1.0f);
                                        n0Var1110.getClass();
                                        n0Var1110.i(null, f17);
                                        b11.f13188q = str4;
                                        b11.f13189r = jCurrentTimeMillis;
                                        b11.f13190s = kVar;
                                        V7.n0 n0Var1111 = b11.f13181i;
                                        java.lang.Boolean bool18 = java.lang.Boolean.FALSE;
                                        n0Var1111.getClass();
                                        n0Var1111.i(null, bool18);
                                        obj = null;
                                        r15 = r13;
                                        r14 = r15;
                                    }
                                }
                                r12 = r11;
                                return aVar2;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                r9 = r10;
                                ((p028c8.d) r9).g(null);
                                throw th;
                            }
                        }
                        list2 = arrayList;
                        r10 = aVar;
                        list2 = list12;
                        str2 = "Index rebuild failed: ";
                        z6 = b10.f13192u;
                        if (z6) {
                            b10.f13192u = false;
                        }
                        if (z6) {
                        }
                        r13 = r10;
                        str4 = str;
                        list3 = list2;
                        list4 = list;
                        xVar = null;
                        if (!kotlin.jvm.internal.m.a(str4, b10.f13188q)) {
                            S4.x.Companion.getClass();
                            S4.x.f9477k.clear();
                        }
                        if (xVar != null) {
                            Z7.e eVar11 = S7.M.f9549a;
                            p005a5.C1300i3 c1300i7 = new p005a5.C1300i3(list3, list4, b10, null);
                            c1290h3.f14539h = b10;
                            c1290h3.f14540i = str4;
                            c1290h3.j = list3;
                            c1290h3.f14541k = list4;
                            c1290h3.f14542l = kVar;
                            c1290h3.f14543m = r13;
                            c1290h3.f14545o = jCurrentTimeMillis;
                            c1290h3.f14548r = 4;
                            objK = S7.C.K(eVar11, c1300i7, c1290h3);
                            if (objK != aVar2) {
                                kVar3 = kVar;
                                obj2 = objK;
                                list7 = list4;
                                list8 = list3;
                                long j117 = jCurrentTimeMillis;
                                str6 = str4;
                                b13 = b10;
                                j9 = j117;
                                r13 = r13;
                                xVar2 = (S4.x) obj2;
                                if (str6 != null) {
                                    qVar = b13.f13176c;
                                    c1290h3.f14539h = b13;
                                    c1290h3.f14540i = str6;
                                    c1290h3.j = list8;
                                    c1290h3.f14541k = list7;
                                    c1290h3.f14542l = kVar3;
                                    c1290h3.f14543m = r13;
                                    c1290h3.f14544n = xVar2;
                                    c1290h3.f14545o = j9;
                                    c1290h3.f14548r = 5;
                                    qVar.getClass();
                                    Z7.e eVar12 = S7.M.f9549a;
                                    if (S7.C.K(Z7.d.f13044i, new com.kiptv.core.local.cache.c(xVar2, str6, qVar, null), c1290h3) != aVar2) {
                                        kVar4 = kVar3;
                                        b11 = b13;
                                        xVar3 = xVar2;
                                        r16 = r13;
                                        list11 = list8;
                                        long j118 = j9;
                                        str4 = str6;
                                        jCurrentTimeMillis = j118;
                                        xVar = xVar3;
                                        kVar = kVar4;
                                        r13 = r16;
                                        list10 = list11;
                                    }
                                } else {
                                    xVar = xVar2;
                                    kVar = kVar3;
                                    b11 = b13;
                                    long j119 = j9;
                                    str4 = str6;
                                    jCurrentTimeMillis = j119;
                                    r13 = r13;
                                    list10 = list8;
                                }
                                list4 = list7;
                                java.util.List list112 = list10;
                                android.util.Log.d("SearchRepository", str3 + list112.size() + " movies + " + list4.size() + " series (playlist=" + str4 + ")");
                                r13 = r13;
                                list9 = list112;
                            }
                            r12 = r11;
                            return aVar2;
                        }
                        android.util.Log.d("SearchRepository", "Index disk hit for playlist=" + str4 + " — skip rebuild");
                        b11 = b10;
                        r13 = r13;
                        list9 = list3;
                        S4.x.Companion.getClass();
                        S4.v.f(xVar);
                        b11.f13186o = list9;
                        b11.f13187p = list4;
                        V7.n0 n0Var1112 = b11.f13184m;
                        n0Var1112.getClass();
                        n0Var1112.i(null, xVar);
                        V7.n0 n0Var1113 = b11.f13182k;
                        java.lang.Float f18 = new java.lang.Float(1.0f);
                        n0Var1113.getClass();
                        n0Var1113.i(null, f18);
                        b11.f13188q = str4;
                        b11.f13189r = jCurrentTimeMillis;
                        b11.f13190s = kVar;
                        V7.n0 n0Var1114 = b11.f13181i;
                        java.lang.Boolean bool19 = java.lang.Boolean.FALSE;
                        n0Var1114.getClass();
                        n0Var1114.i(null, bool19);
                        obj = null;
                        r15 = r13;
                    } catch (java.lang.Exception e15) {
                        e = e15;
                        b11 = b10;
                        r13 = r10;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        c1290h3 = b10;
                        V7.n0 n0Var1115 = c1290h3.f13181i;
                        java.lang.Boolean bool110 = java.lang.Boolean.FALSE;
                        n0Var1115.getClass();
                        n0Var1115.i(null, bool110);
                        throw th;
                    }
                    str3 = "Index rebuilt: ";
                    V7.n0 n0Var22 = b10.f13181i;
                    java.lang.Boolean bool111 = java.lang.Boolean.TRUE;
                    n0Var22.getClass();
                    n0Var22.i(null, bool111);
                    V7.n0 n0Var23 = b10.f13182k;
                    java.lang.Float f19 = new java.lang.Float(0.0f);
                    n0Var23.getClass();
                    n0Var23.i(null, f19);
                    r14 = r15;
                }
                ((p028c8.d) r14).g(obj);
                return a2;
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            r9 = "Index memory hit for playlist=";
        }
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        if (str2 != null) {
            if (O7.q.N0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        java.lang.String str3 = str != null ? (java.lang.String) map.get(str) : null;
        return str3 == null ? "" : str3;
    }

    public static boolean l(com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, com.kiptv.core.model.C1944g0 c1944g0, java.util.Map map) {
        java.lang.String str = xtreamLiveStream.f20660h;
        if (str == null) {
            str = "";
        }
        java.lang.String strE = e(str, xtreamLiveStream.f20661i, map);
        java.lang.String strValueOf = java.lang.String.valueOf(xtreamLiveStream.f20657d);
        com.kiptv.core.model.EnumC1937d enumC1937d = com.kiptv.core.model.EnumC1937d.LIVE;
        return (c1944g0.c(strValueOf, enumC1937d) || c1944g0.b(strE, str, enumC1937d)) ? false : true;
    }

    public final void f() {
        this.f13184m.h(null);
        S4.x.Companion.getClass();
        S4.x.f9477k.clear();
        p078i6.w wVar = p078i6.w.f23205h;
        this.f13186o = wVar;
        this.f13187p = wVar;
        V7.n0 n0Var = this.f13181i;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        n0Var.getClass();
        n0Var.i(null, bool);
        V7.n0 n0Var2 = this.f13182k;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        n0Var2.getClass();
        n0Var2.i(null, fValueOf);
        V7.n0 n0Var3 = this.f13191t;
        n0Var3.i(null, java.lang.Integer.valueOf(((java.lang.Number) n0Var3.getValue()).intValue() + 1));
        this.f13192u = true;
    }

    public final com.kiptv.core.model.C1944g0 g() {
        com.kiptv.core.model.C1944g0 c1944g0;
        com.kiptv.core.model.PlaylistSettings playlistSettingsA = this.f13178e.a();
        if (playlistSettingsA != null && (c1944g0 = playlistSettingsA.f20062i) != null) {
            return c1944g0;
        }
        com.kiptv.core.model.C1944g0.Companion.getClass();
        return com.kiptv.core.model.C1944g0.f20753p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(p194x6.j jVar, p117n6.c cVar) {
        p005a5.C1260e3 c1260e3;
        if (cVar instanceof p005a5.C1260e3) {
            c1260e3 = (p005a5.C1260e3) cVar;
            int i3 = c1260e3.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1260e3.j = i3 - Integer.MIN_VALUE;
            } else {
                c1260e3 = new p005a5.C1260e3(this, cVar);
            }
        } else {
            c1260e3 = new p005a5.C1260e3(this, cVar);
        }
        java.lang.Object obj = c1260e3.f14392h;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = c1260e3.j;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            }
            com.google.common.util.concurrent.P.u0(obj);
            c1260e3.j = 1;
            java.lang.Object objInvoke = jVar.invoke(c1260e3);
            return objInvoke == obj2 ? obj2 : objInvoke;
        } catch (java.util.concurrent.CancellationException e6) {
            throw e6;
        } catch (java.lang.Exception e9) {
            B2.a.v("collection fetch failed: ", e9.getMessage(), "SearchRepository");
            return null;
        }
    }

    public final com.kiptv.core.model.XtreamVODStream i(int i3) {
        java.util.Map map;
        S4.w wVar;
        S4.x xVar = (S4.x) this.f13184m.getValue();
        if (xVar == null || (map = xVar.f9480c) == null || (wVar = (S4.w) map.get(java.lang.Integer.valueOf(i3))) == null) {
            return null;
        }
        int size = this.f13186o.size();
        int i9 = wVar.f9471a;
        if (i9 < size) {
            return (com.kiptv.core.model.XtreamVODStream) this.f13186o.get(i9);
        }
        return null;
    }

    public final com.kiptv.core.model.XtreamSeries j(int i3) {
        java.util.Map map;
        S4.w wVar;
        S4.x xVar = (S4.x) this.f13184m.getValue();
        if (xVar == null || (map = xVar.f9480c) == null || (wVar = (S4.w) map.get(java.lang.Integer.valueOf(i3))) == null) {
            return null;
        }
        return (com.kiptv.core.model.XtreamSeries) p078i6.o.k1(wVar.f9471a - this.f13186o.size(), this.f13187p);
    }

    public final java.util.AbstractList k(java.util.List hits) {
        boolean zIsEmpty;
        java.lang.Integer numValueOf;
        com.kiptv.core.local.cache.MovieCollectionStore$Part movieCollectionStore$Part;
        java.lang.Integer numValueOf2;
        java.lang.String str;
        java.lang.Object next;
        kotlin.jvm.internal.m.e(hits, "hits");
        if (!hits.isEmpty()) {
            com.kiptv.core.local.cache.a aVar = this.f13179f;
            synchronized (aVar.f19637c) {
                aVar.c();
                zIsEmpty = aVar.f19640f.isEmpty();
            }
            if (!zIsEmpty) {
                java.util.Map map = g().f20755b.f19696i;
                java.util.HashMap map2 = new java.util.HashMap();
                java.util.ArrayList arrayList = new java.util.ArrayList(hits.size());
                java.util.Iterator it = hits.iterator();
                while (it.hasNext()) {
                    p005a5.C1250d3 c1250d3 = (p005a5.C1250d3) it.next();
                    S4.C0869h c0869hU = O2.g.U((com.kiptv.core.model.XtreamVODStream) c1250d3.f14349a, map);
                    java.lang.Integer num = c1250d3.f14351c;
                    if (num == null) {
                        num = c0869hU.f9397e;
                    }
                    if (num != null) {
                        E6.G gE = this.f13179f.e(num.intValue());
                        if (gE instanceof U4.k) {
                            U4.k kVar = (U4.k) gE;
                            numValueOf2 = java.lang.Integer.valueOf(kVar.f10145p);
                            com.kiptv.core.local.cache.MovieCollectionStore$Summary movieCollectionStore$SummaryB = this.f13179f.b(kVar.f10145p);
                            if (movieCollectionStore$SummaryB != null) {
                                int iIntValue = num.intValue();
                                java.util.Iterator it2 = movieCollectionStore$SummaryB.f19616f.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (((com.kiptv.core.local.cache.MovieCollectionStore$Part) next).f19602a != iIntValue);
                                movieCollectionStore$Part = (com.kiptv.core.local.cache.MovieCollectionStore$Part) next;
                            } else {
                                movieCollectionStore$Part = null;
                            }
                        } else {
                            if (!gE.equals(U4.l.f10146p)) {
                                if (!gE.equals(U4.m.f10147p)) {
                                    throw new I3.b();
                                }
                                U4.n nVarF = this.f13179f.f(c0869hU);
                                if (nVarF != null) {
                                    numValueOf = java.lang.Integer.valueOf(nVarF.f10148a);
                                    movieCollectionStore$Part = nVarF.f10149b;
                                    numValueOf2 = numValueOf;
                                }
                            }
                            numValueOf2 = null;
                            movieCollectionStore$Part = null;
                        }
                    } else {
                        U4.n nVarF2 = this.f13179f.f(c0869hU);
                        if (nVarF2 != null) {
                            numValueOf = java.lang.Integer.valueOf(nVarF2.f10148a);
                            movieCollectionStore$Part = nVarF2.f10149b;
                            numValueOf2 = numValueOf;
                        } else {
                            numValueOf2 = null;
                            movieCollectionStore$Part = null;
                        }
                    }
                    com.kiptv.core.local.cache.MovieCollectionStore$Summary movieCollectionStore$SummaryB2 = numValueOf2 != null ? this.f13179f.b(numValueOf2.intValue()) : null;
                    if (numValueOf2 == null || movieCollectionStore$SummaryB2 == null) {
                        arrayList.add(new p070h6.k(c1250d3, null));
                    } else {
                        if (movieCollectionStore$Part == null || (str = movieCollectionStore$Part.f19604c) == null) {
                            str = "9999";
                        }
                        p005a5.C1270f3 c1270f3 = (p005a5.C1270f3) map2.get(numValueOf2);
                        if (c1270f3 != null) {
                            c1270f3.f14456b.add(new p070h6.k(c1250d3, str));
                            arrayList.add(new p070h6.k(null, null));
                        } else {
                            p005a5.C1270f3 c1270f4 = new p005a5.C1270f3(movieCollectionStore$SummaryB2);
                            c1270f4.f14456b.add(new p070h6.k(c1250d3, str));
                            map2.put(numValueOf2, c1270f4);
                            arrayList.add(new p070h6.k(null, numValueOf2));
                        }
                    }
                }
                p086j6.b bVar = new p086j6.b(hits.size());
                java.util.Iterator it3 = arrayList.iterator();
                kotlin.jvm.internal.m.d(it3, "iterator(...)");
                while (it3.hasNext()) {
                    java.lang.Object next2 = it3.next();
                    kotlin.jvm.internal.m.d(next2, "next(...)");
                    p070h6.k kVar2 = (p070h6.k) next2;
                    p005a5.C1250d3 c1250d4 = (p005a5.C1250d3) kVar2.f22539h;
                    java.lang.Integer num2 = (java.lang.Integer) kVar2.f22540i;
                    if (c1250d4 != null) {
                        bVar.add(new p005a5.V2(c1250d4));
                    } else if (num2 != null) {
                        p005a5.C1270f3 c1270f5 = (p005a5.C1270f3) p078i6.C.M0(num2, map2);
                        if (c1270f5.f14456b.size() >= 2) {
                            java.util.List listI1 = p078i6.o.I1(c1270f5.f14456b, com.google.crypto.tink.shaded.protobuf.q0.n(new U4.h(12), new U4.h(13)));
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(listI1, 10));
                            java.util.Iterator it4 = listI1.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add((p005a5.C1250d3) ((p070h6.k) it4.next()).f22539h);
                            }
                            com.kiptv.core.local.cache.MovieCollectionStore$Summary movieCollectionStore$Summary = c1270f5.f14455a;
                            bVar.add(new p005a5.U2(new p005a5.T2(movieCollectionStore$Summary.f19611a, movieCollectionStore$Summary.f19612b, movieCollectionStore$Summary.f19613c, movieCollectionStore$Summary.f19614d, arrayList2, movieCollectionStore$Summary.f19616f.size())));
                        } else {
                            bVar.add(new p005a5.V2((p005a5.C1250d3) ((p070h6.k) c1270f5.f14456b.get(0)).f22539h));
                        }
                    }
                }
                return com.google.common.util.concurrent.P.M(bVar);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p078i6.q.I0(hits, 10));
        java.util.Iterator it5 = hits.iterator();
        while (it5.hasNext()) {
            arrayList3.add(new p005a5.V2((p005a5.C1250d3) it5.next()));
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0271  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:37:0x010a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0115  */
    /* JADX WARN: Code duplicated, block: B:42:0x0126  */
    /* JADX WARN: Code duplicated, block: B:44:0x012c  */
    /* JADX WARN: Code duplicated, block: B:57:0x017c  */
    /* JADX WARN: Code duplicated, block: B:59:0x018e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x020e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0218  */
    /* JADX WARN: Code duplicated, block: B:85:0x021c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0220  */
    /* JADX WARN: Code duplicated, block: B:89:0x022a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0257  */
    /* JADX WARN: Code duplicated, block: B:98:0x0262  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0257 -> B:96:0x025b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0264 -> B:31:0x00ef). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(java.util.List r20, java.util.List r21, p117n6.c r22) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a5.B3.m(java.util.List, java.util.List, n6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[LOOP:0: B:34:0x00ad->B:36:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object n(int i3, java.util.List list, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.C1370p3 c1370p3;
        com.kiptv.core.local.cache.MovieCollectionStore$Summary movieCollectionStore$SummaryB;
        java.util.List list2;
        p005a5.B3 b9;
        p005a5.B3 b10;
        com.kiptv.core.local.cache.MovieCollectionStore$Summary movieCollectionStore$Summary;
        int iI0;
        java.util.LinkedHashMap linkedHashMap;
        java.util.List list3;
        java.util.List list4;
        java.lang.Object objK;
        int i9 = i3;
        if (cVar instanceof p005a5.C1370p3) {
            c1370p3 = (p005a5.C1370p3) cVar;
            int i10 = c1370p3.f14939m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1370p3.f14939m = i10 - Integer.MIN_VALUE;
            } else {
                c1370p3 = new p005a5.C1370p3(this, cVar);
            }
        } else {
            c1370p3 = new p005a5.C1370p3(this, cVar);
        }
        java.lang.Object obj = c1370p3.f14937k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1370p3.f14939m;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            movieCollectionStore$SummaryB = this.f13179f.b(i9);
            if (movieCollectionStore$SummaryB == null || !(!movieCollectionStore$SummaryB.f19616f.isEmpty())) {
                p005a5.C1380q3 c1380q3 = new p005a5.C1380q3(this, i9, null);
                c1370p3.f14935h = this;
                list2 = list;
                c1370p3.f14936i = list2;
                c1370p3.j = i9;
                c1370p3.f14939m = 1;
                if (h(c1380q3, c1370p3) != aVar) {
                    b9 = this;
                }
            } else {
                list2 = list;
                b10 = this;
                movieCollectionStore$Summary = movieCollectionStore$SummaryB;
                if (movieCollectionStore$Summary == null) {
                    return null;
                }
                com.kiptv.core.model.C1944g0 c1944g0G = b10.g();
                java.util.Map map = c1944g0G.f20755b.f19696i;
                java.lang.Iterable<com.kiptv.core.model.XtreamCategory> iterable = (java.lang.Iterable) ((V7.n0) b10.f13174a.f14910d.f10419h).getValue();
                iI0 = p078i6.D.I0(p078i6.q.I0(iterable, 10));
                if (iI0 < 16) {
                    iI0 = 16;
                }
                linkedHashMap = new java.util.LinkedHashMap(iI0);
                for (com.kiptv.core.model.XtreamCategory xtreamCategory : iterable) {
                    linkedHashMap.put(xtreamCategory.f20649a, xtreamCategory.f20650b);
                }
                list3 = b10.f13186o;
                if (list3.isEmpty()) {
                    list4 = list2;
                } else {
                    list4 = list3;
                }
                Z7.e eVar = S7.M.f9549a;
                p005a5.C1399s3 c1399s3 = new p005a5.C1399s3(movieCollectionStore$Summary, list4, b10, c1944g0G, linkedHashMap, map, null);
                c1370p3.f14935h = null;
                c1370p3.f14936i = null;
                c1370p3.f14939m = 2;
                objK = S7.C.K(eVar, c1399s3, c1370p3);
                if (objK != aVar) {
                    return objK;
                }
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            return obj;
        }
        i9 = c1370p3.j;
        list2 = c1370p3.f14936i;
        b9 = c1370p3.f14935h;
        com.google.common.util.concurrent.P.u0(obj);
        movieCollectionStore$SummaryB = b9.f13179f.b(i9);
        b10 = b9;
        movieCollectionStore$Summary = movieCollectionStore$SummaryB;
        if (movieCollectionStore$Summary == null) {
            return null;
        }
        com.kiptv.core.model.C1944g0 c1944g0G2 = b10.g();
        java.util.Map map2 = c1944g0G2.f20755b.f19696i;
        java.lang.Iterable<com.kiptv.core.model.XtreamCategory> iterable2 = (java.lang.Iterable) ((V7.n0) b10.f13174a.f14910d.f10419h).getValue();
        iI0 = p078i6.D.I0(p078i6.q.I0(iterable2, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        linkedHashMap = new java.util.LinkedHashMap(iI0);
        while (r1.hasNext()) {
            linkedHashMap.put(xtreamCategory.f20649a, xtreamCategory.f20650b);
        }
        list3 = b10.f13186o;
        if (list3.isEmpty()) {
            list4 = list2;
        } else {
            list4 = list3;
        }
        Z7.e eVar2 = S7.M.f9549a;
        p005a5.C1399s3 c1399s4 = new p005a5.C1399s3(movieCollectionStore$Summary, list4, b10, c1944g0G2, linkedHashMap, map2, null);
        c1370p3.f14935h = null;
        c1370p3.f14936i = null;
        c1370p3.f14939m = 2;
        objK = S7.C.K(eVar2, c1399s4, c1370p3);
        if (objK != aVar) {
            return aVar;
        }
        return objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(int i3, java.lang.String str, p117n6.c cVar) {
        p005a5.C1439w3 c1439w3;
        if (cVar instanceof p005a5.C1439w3) {
            c1439w3 = (p005a5.C1439w3) cVar;
            int i9 = c1439w3.f15236k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1439w3.f15236k = i9 - Integer.MIN_VALUE;
            } else {
                c1439w3 = new p005a5.C1439w3(this, cVar);
            }
        } else {
            c1439w3 = new p005a5.C1439w3(this, cVar);
        }
        java.lang.Object objI = c1439w3.f15235i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1439w3.f15236k;
        p078i6.w wVar = p078i6.w.f23205h;
        try {
            if (i10 == 0) {
                com.google.common.util.concurrent.P.u0(objI);
                if (str.length() >= 2) {
                    p005a5.C1451x5 c1451x5 = this.f13175b;
                    c1439w3.f15234h = i3;
                    c1439w3.f15236k = 1;
                    objI = c1451x5.I(str, c1439w3);
                    if (objI == aVar) {
                        return aVar;
                    }
                }
                return wVar;
            }
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1439w3.f15234h;
            com.google.common.util.concurrent.P.u0(objI);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : (java.lang.Iterable) objI) {
                java.lang.String str2 = ((com.kiptv.core.model.TMDBPersonSearchResult) obj).f20268c;
                if (str2 != null && !O7.q.N0(str2)) {
                    arrayList.add(obj);
                }
            }
            return p078i6.o.J1(p078i6.o.I1(arrayList, new B5.w(13, new p005a5.B(13))), i3);
        } catch (java.lang.Exception e6) {
            android.util.Log.d("SearchRepository", "searchPeople failed: " + e6.getMessage());
        }
    }
}
