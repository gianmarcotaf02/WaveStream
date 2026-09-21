package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class B2 {
    public static final p005a5.C1408t2 Companion = new p005a5.C1408t2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long[] f13163l = {500, 1000, 2000};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.github.jan.supabase.SupabaseClient f13164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1296i f13165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.M1 f13166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.x9 f13167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1291h4 f13168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X7.c f13169f;
    public final V7.n0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.W f13170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.n0 f13171i;
    public volatile java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile java.lang.String f13172k;

    public B2(io.github.jan.supabase.SupabaseClient supabaseClient, p005a5.C1296i authRepository, p005a5.M1 playlistRepository, p005a5.x9 xtreamRepository, p005a5.C1291h4 settingsRepository) {
        kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
        kotlin.jvm.internal.m.e(authRepository, "authRepository");
        kotlin.jvm.internal.m.e(playlistRepository, "playlistRepository");
        kotlin.jvm.internal.m.e(xtreamRepository, "xtreamRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        this.f13164a = supabaseClient;
        this.f13165b = authRepository;
        this.f13166c = playlistRepository;
        this.f13167d = xtreamRepository;
        this.f13168e = settingsRepository;
        Z7.e eVar = S7.M.f9549a;
        X7.c cVarC = S7.C.c(Z7.d.f13044i.plus(S7.C.e()));
        this.f13169f = cVarC;
        p078i6.w wVar = p078i6.w.f23205h;
        V7.n0 n0VarB = V7.r.b(wVar);
        this.g = n0VarB;
        this.f13170h = new V7.W(n0VarB);
        this.f13171i = V7.r.b(java.lang.Boolean.FALSE);
        this.j = wVar;
        S7.C.A(cVarC, null, new p005a5.C1398s2(this, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:61|128|62|63|140|64|65|144|66|67|136|68|134|69|(4:142|72|147|70)|146|76|(1:78)|79|80|81|82|130|83|(1:150)(1:86)) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:138|41|(1:148)(5:44|126|45|46|(4:48|132|49|(1:149)(1:52))(25:61|128|62|63|140|64|65|144|66|67|136|68|134|69|(4:142|72|147|70)|146|76|(1:78)|79|80|81|82|130|83|(1:150)(1:86)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:142|72|147|70) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:48|132|49|(1:149)(1:52)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:44|126|45|46|(4:48|132|49|(1:149)(1:52))(25:61|128|62|63|140|64|65|144|66|67|136|68|134|69|(4:142|72|147|70)|146|76|(1:78)|79|80|81|82|130|83|(1:150)(1:86))) */
    /* JADX WARN: Code duplicated, block: B:111:0x035f  */
    /* JADX WARN: Code duplicated, block: B:114:0x037b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0388  */
    /* JADX WARN: Code duplicated, block: B:138:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0270 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x0299 A[Catch: Exception -> 0x0284, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x0284, blocks: (B:72:0x0270, B:78:0x0299), top: B:142:0x0270 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0305  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0326, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0327, code lost:
    
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0329, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x032a, code lost:
    
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x032c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x032d, code lost:
    
        r26 = r2;
        r9 = r8;
        r7 = r14;
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0333, code lost:
    
        r7 = r10;
        r10 = r13;
        r13 = r12;
        r12 = r3;
        r3 = r5;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x033a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x033b, code lost:
    
        r26 = r2;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d8, code lost:
    
        r7 = r12;
        r12 = r11;
        r11 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0284, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0285, code lost:
    
        r9 = r12;
        r12 = r11;
        r11 = r9;
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0317, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0318, code lost:
    
        r14 = r12;
        r12 = r11;
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x031b, code lost:
    
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x031d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x031e, code lost:
    
        r9 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0320, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0322, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0323, code lost:
    
        r10 = r22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x006e: MOVE (r13 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:111), block:B:21:0x006d */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x006f: MOVE (r11 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:112), block:B:21:0x006d */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x006d: MOVE (r7 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:110), block:B:21:0x006d */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x038f -> B:40:0x00eb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(p005a5.B2 b9, com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, p117n6.c cVar) {
        p005a5.A2 a2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        int i3;
        int i9;
        java.lang.String str7;
        java.lang.String str8;
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStream2;
        p005a5.B2 b10;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStream3;
        p005a5.B2 b11;
        int i10;
        java.lang.String str14;
        java.lang.String str15;
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStream4;
        p005a5.B2 b12;
        char c9;
        char c10;
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStream5;
        p005a5.B2 b13;
        java.lang.String str16;
        java.lang.String str17;
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStream6;
        java.lang.String str18;
        p005a5.A2 a9;
        int i11;
        p005a5.A2 a10;
        long j;
        com.kiptv.core.model.WatchProgress watchProgress;
        io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder insertRequestBuilder;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.util.List listC1;
        java.lang.Object objExecute;
        java.lang.Object objB;
        java.lang.String id;
        com.kiptv.core.model.Playlist playlist;
        java.lang.String str19;
        int i12 = 1;
        b9.getClass();
        if (cVar instanceof p005a5.A2) {
            a2 = (p005a5.A2) cVar;
            int i13 = a2.f13113q;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                a2.f13113q = i13 - Integer.MIN_VALUE;
            } else {
                a2 = new p005a5.A2(b9, cVar);
            }
        } else {
            a2 = new p005a5.A2(b9, cVar);
        }
        java.lang.Object objExecute2 = a2.f13111o;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = a2.f13113q;
        p070h6.A a11 = p070h6.A.f22523a;
        int i15 = 3;
        if (i14 == 0) {
            com.google.common.util.concurrent.P.u0(objExecute2);
            io.github.jan.supabase.auth.user.UserInfo userInfoE = b9.f13165b.e();
            if (userInfoE == null || (id = userInfoE.getId()) == null || (playlist = (com.kiptv.core.model.Playlist) ((V7.n0) b9.f13166c.f13659k.f10419h).getValue()) == null || (str19 = playlist.f20033a) == null) {
                return a11;
            }
            xtreamLiveStream6 = xtreamLiveStream;
            java.lang.String strValueOf = java.lang.String.valueOf(xtreamLiveStream6.f20657d);
            java.lang.String string = j$.time.Instant.now().toString();
            kotlin.jvm.internal.m.d(string, "toString(...)");
            i11 = 0;
            str16 = string;
            str17 = strValueOf;
            str5 = str19;
            a10 = a2;
            str18 = id;
            b13 = b9;
            if (i11 < i15) {
                a10.f13105h = b13;
                a10.f13106i = xtreamLiveStream6;
                a10.j = str18;
                a10.f13107k = str5;
                a10.f13108l = str17;
                a10.f13109m = str16;
                a10.f13110n = i11;
                a10.f13113q = i12;
                objB = b13.b(str18, str5, str17, a10);
                if (objB == aVar) {
                    return aVar;
                }
                java.lang.String str20 = str5;
                str9 = str18;
                a2 = a10;
                i14 = i11;
                xtreamLiveStream2 = xtreamLiveStream6;
                str7 = str16;
                str3 = str17;
                str8 = str20;
                b10 = b13;
                objExecute2 = objB;
                watchProgress = (com.kiptv.core.model.WatchProgress) objExecute2;
                if (watchProgress != null) {
                    i3 = i12;
                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b10.f13164a).from("watch_progress");
                    com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate recentlyWatchedLiveRepository$RecentlyWatchedUpdate = new com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate(xtreamLiveStream2.f20655b, xtreamLiveStream2.f20658e, str7, str7);
                    io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                    new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder.getPropertyConversionMethod(), postgrestRequestBuilder.getParams(), false, 4, null).eq("id", watchProgress.f20610a);
                    io.github.jan.supabase.postgrest.query.Returning returning = postgrestRequestBuilder.getReturning();
                    io.github.jan.supabase.postgrest.query.Count count = postgrestRequestBuilder.getCount();
                    java.util.Map mapMapToFirstValue = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams());
                    io.github.jan.supabase.SupabaseSerializer serializer = postgrestQueryBuilderFrom.getPostgrest().getSerializer();
                    p162s8.c cVar2 = p162s8.d.f27387d;
                    java.lang.String strEncode = serializer.encode(kotlin.jvm.internal.B.a(com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate.class), recentlyWatchedLiveRepository$RecentlyWatchedUpdate);
                    cVar2.getClass();
                    io.github.jan.supabase.postgrest.request.UpdateRequest updateRequest = new io.github.jan.supabase.postgrest.request.UpdateRequest(returning, count, mapMapToFirstValue, (kotlinx.serialization.json.b) cVar2.b(strEncode, kotlinx.serialization.json.b.Companion.serializer()), postgrestQueryBuilderFrom.getSchema(), postgrestRequestBuilder.getHeaders().build());
                    io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                    io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                    java.lang.String table = postgrestQueryBuilderFrom.getTable();
                    a2.f13105h = b10;
                    a2.f13106i = xtreamLiveStream2;
                    a2.j = str9;
                    a2.f13107k = str8;
                    a2.f13108l = str3;
                    a2.f13109m = str7;
                    a2.f13110n = i14;
                    a2.f13113q = 2;
                    objExecute2 = restRequestExecutor.execute(postgrest, table, updateRequest, a2);
                    if (objExecute2 == aVar) {
                        return aVar;
                    }
                    java.lang.String str21 = str3;
                    str11 = str9;
                    str10 = str21;
                } else {
                    i3 = i12;
                    b13 = b10;
                    java.lang.String str22 = str7;
                    xtreamLiveStream5 = xtreamLiveStream2;
                    com.kiptv.core.model.WatchProgressUpsert watchProgressUpsert = new com.kiptv.core.model.WatchProgressUpsert(str9, str8, str3, "live", xtreamLiveStream2.f20655b, null, null, null, 0, 0, false, str22, null, xtreamLiveStream2.f20658e, 251872);
                    str7 = str22;
                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom2 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b13.f13164a).from("watch_progress");
                    java.util.List listI0 = com.google.common.util.concurrent.P.i0(watchProgressUpsert);
                    insertRequestBuilder = new io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom2.getPostgrest().getConfig()).getPropertyConversionMethod());
                    io.github.jan.supabase.SupabaseSerializer serializer2 = postgrestQueryBuilderFrom2.getPostgrest().getSerializer();
                    p162s8.c cVar3 = p162s8.d.f27387d;
                    E6.y yVar = E6.y.f3222c;
                    java.lang.String strEncode2 = serializer2.encode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.WatchProgressUpsert.class))), listI0);
                    cVar3.getClass();
                    kotlinx.serialization.json.a aVarH = p162s8.l.h((kotlinx.serialization.json.b) cVar3.b(strEncode2, kotlinx.serialization.json.b.Companion.serializer()));
                    arrayList = new java.util.ArrayList(p078i6.q.I0(aVarH, 10));
                    it = aVarH.f24557h.iterator();
                    while (it.hasNext()) {
                        arrayList.add(p162s8.l.i((kotlinx.serialization.json.b) it.next()).f24558h.keySet());
                    }
                    listC1 = p078i6.o.c1(p078i6.q.J0(arrayList));
                    if (!listC1.isEmpty()) {
                        insertRequestBuilder.getParams().put("columns", com.google.common.util.concurrent.P.i0(p078i6.o.o1(listC1, ",", null, null, null, 62)));
                    }
                    io.github.jan.supabase.postgrest.request.InsertRequest insertRequest = new io.github.jan.supabase.postgrest.request.InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVarH, io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilderFrom2.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null);
                    io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor2 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                    io.github.jan.supabase.postgrest.Postgrest postgrest2 = postgrestQueryBuilderFrom2.getPostgrest();
                    java.lang.String table2 = postgrestQueryBuilderFrom2.getTable();
                    a2.f13105h = b13;
                    a2.f13106i = xtreamLiveStream5;
                    a2.j = str9;
                    a2.f13107k = str8;
                    a2.f13108l = str3;
                    a2.f13109m = str7;
                    a2.f13110n = i14;
                    i9 = 3;
                    a2.f13113q = 3;
                    objExecute = restRequestExecutor2.execute(postgrest2, table2, insertRequest, a2);
                    if (objExecute == aVar) {
                        return aVar;
                    }
                    java.lang.String str23 = str3;
                    str13 = str9;
                    str12 = str23;
                    b11 = b13;
                    xtreamLiveStream3 = xtreamLiveStream5;
                    objExecute2 = objExecute;
                }
            }
            return a11;
        }
        try {
            if (i14 == 1) {
                i14 = a2.f13110n;
                str7 = a2.f13109m;
                java.lang.String str24 = a2.f13108l;
                str8 = a2.f13107k;
                java.lang.String str25 = a2.j;
                xtreamLiveStream2 = a2.f13106i;
                b10 = a2.f13105h;
                com.google.common.util.concurrent.P.u0(objExecute2);
                str3 = str24;
                str9 = str25;
                watchProgress = (com.kiptv.core.model.WatchProgress) objExecute2;
                if (watchProgress != null) {
                    i3 = i12;
                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom3 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b10.f13164a).from("watch_progress");
                    com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate recentlyWatchedLiveRepository$RecentlyWatchedUpdate2 = new com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate(xtreamLiveStream2.f20655b, xtreamLiveStream2.f20658e, str7, str7);
                    io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder2 = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom3.getPostgrest().getConfig()).getPropertyConversionMethod());
                    new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder2.getPropertyConversionMethod(), postgrestRequestBuilder2.getParams(), false, 4, null).eq("id", watchProgress.f20610a);
                    io.github.jan.supabase.postgrest.query.Returning returning2 = postgrestRequestBuilder2.getReturning();
                    io.github.jan.supabase.postgrest.query.Count count2 = postgrestRequestBuilder2.getCount();
                    java.util.Map mapMapToFirstValue2 = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder2.getParams());
                    io.github.jan.supabase.SupabaseSerializer serializer3 = postgrestQueryBuilderFrom3.getPostgrest().getSerializer();
                    p162s8.c cVar4 = p162s8.d.f27387d;
                    java.lang.String strEncode3 = serializer3.encode(kotlin.jvm.internal.B.a(com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate.class), recentlyWatchedLiveRepository$RecentlyWatchedUpdate2);
                    cVar4.getClass();
                    io.github.jan.supabase.postgrest.request.UpdateRequest updateRequest2 = new io.github.jan.supabase.postgrest.request.UpdateRequest(returning2, count2, mapMapToFirstValue2, (kotlinx.serialization.json.b) cVar4.b(strEncode3, kotlinx.serialization.json.b.Companion.serializer()), postgrestQueryBuilderFrom3.getSchema(), postgrestRequestBuilder2.getHeaders().build());
                    io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor3 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                    io.github.jan.supabase.postgrest.Postgrest postgrest3 = postgrestQueryBuilderFrom3.getPostgrest();
                    java.lang.String table3 = postgrestQueryBuilderFrom3.getTable();
                    a2.f13105h = b10;
                    a2.f13106i = xtreamLiveStream2;
                    a2.j = str9;
                    a2.f13107k = str8;
                    a2.f13108l = str3;
                    a2.f13109m = str7;
                    a2.f13110n = i14;
                    a2.f13113q = 2;
                    objExecute2 = restRequestExecutor3.execute(postgrest3, table3, updateRequest2, a2);
                    if (objExecute2 == aVar) {
                        return aVar;
                    }
                    java.lang.String str26 = str3;
                    str11 = str9;
                    str10 = str26;
                    return a11;
                }
                i3 = i12;
                b13 = b10;
                java.lang.String str27 = str7;
                xtreamLiveStream5 = xtreamLiveStream2;
                com.kiptv.core.model.WatchProgressUpsert watchProgressUpsert2 = new com.kiptv.core.model.WatchProgressUpsert(str9, str8, str3, "live", xtreamLiveStream2.f20655b, null, null, null, 0, 0, false, str27, null, xtreamLiveStream2.f20658e, 251872);
                str7 = str27;
                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom4 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b13.f13164a).from("watch_progress");
                java.util.List listI1 = com.google.common.util.concurrent.P.i0(watchProgressUpsert2);
                insertRequestBuilder = new io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom4.getPostgrest().getConfig()).getPropertyConversionMethod());
                io.github.jan.supabase.SupabaseSerializer serializer4 = postgrestQueryBuilderFrom4.getPostgrest().getSerializer();
                p162s8.c cVar5 = p162s8.d.f27387d;
                E6.y yVar2 = E6.y.f3222c;
                java.lang.String strEncode4 = serializer4.encode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.WatchProgressUpsert.class))), listI1);
                cVar5.getClass();
                kotlinx.serialization.json.a aVarH2 = p162s8.l.h((kotlinx.serialization.json.b) cVar5.b(strEncode4, kotlinx.serialization.json.b.Companion.serializer()));
                arrayList = new java.util.ArrayList(p078i6.q.I0(aVarH2, 10));
                it = aVarH2.f24557h.iterator();
                while (it.hasNext()) {
                    arrayList.add(p162s8.l.i((kotlinx.serialization.json.b) it.next()).f24558h.keySet());
                }
                listC1 = p078i6.o.c1(p078i6.q.J0(arrayList));
                if (!listC1.isEmpty()) {
                    insertRequestBuilder.getParams().put("columns", com.google.common.util.concurrent.P.i0(p078i6.o.o1(listC1, ",", null, null, null, 62)));
                }
                io.github.jan.supabase.postgrest.request.InsertRequest insertRequest2 = new io.github.jan.supabase.postgrest.request.InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVarH2, io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilderFrom4.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null);
                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor4 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                io.github.jan.supabase.postgrest.Postgrest postgrest4 = postgrestQueryBuilderFrom4.getPostgrest();
                java.lang.String table4 = postgrestQueryBuilderFrom4.getTable();
                a2.f13105h = b13;
                a2.f13106i = xtreamLiveStream5;
                a2.j = str9;
                a2.f13107k = str8;
                a2.f13108l = str3;
                a2.f13109m = str7;
                a2.f13110n = i14;
                i9 = 3;
                a2.f13113q = 3;
                objExecute = restRequestExecutor4.execute(postgrest4, table4, insertRequest2, a2);
                if (objExecute == aVar) {
                    return aVar;
                }
                java.lang.String str28 = str3;
                str13 = str9;
                str12 = str28;
                b11 = b13;
                xtreamLiveStream3 = xtreamLiveStream5;
                objExecute2 = objExecute;
                return a11;
            }
            try {
                if (i14 != 2) {
                    try {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i10 = a2.f13110n;
                            str14 = a2.f13109m;
                            str15 = a2.f13108l;
                            str5 = a2.f13107k;
                            str6 = a2.j;
                            xtreamLiveStream4 = a2.f13106i;
                            b12 = a2.f13105h;
                            com.google.common.util.concurrent.P.u0(objExecute2);
                            i9 = 3;
                            c9 = 2;
                            i3 = 1;
                            c10 = 4;
                            java.lang.String str29 = str14;
                            i14 = i10;
                            a9 = a2;
                            str18 = str6;
                            str17 = str15;
                            xtreamLiveStream6 = xtreamLiveStream4;
                            str16 = str29;
                            b13 = b12;
                            i11 = i14 + 1;
                            i15 = i9;
                            a10 = a9;
                            i12 = i3;
                            if (i11 < i15) {
                                a10.f13105h = b13;
                                a10.f13106i = xtreamLiveStream6;
                                a10.j = str18;
                                a10.f13107k = str5;
                                a10.f13108l = str17;
                                a10.f13109m = str16;
                                a10.f13110n = i11;
                                a10.f13113q = i12;
                                objB = b13.b(str18, str5, str17, a10);
                                if (objB == aVar) {
                                    return aVar;
                                }
                                java.lang.String str210 = str5;
                                str9 = str18;
                                a2 = a10;
                                i14 = i11;
                                xtreamLiveStream2 = xtreamLiveStream6;
                                str7 = str16;
                                str3 = str17;
                                str8 = str210;
                                b10 = b13;
                                objExecute2 = objB;
                                watchProgress = (com.kiptv.core.model.WatchProgress) objExecute2;
                                if (watchProgress != null) {
                                    i3 = i12;
                                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom5 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b10.f13164a).from("watch_progress");
                                    com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate recentlyWatchedLiveRepository$RecentlyWatchedUpdate3 = new com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate(xtreamLiveStream2.f20655b, xtreamLiveStream2.f20658e, str7, str7);
                                    io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder3 = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom5.getPostgrest().getConfig()).getPropertyConversionMethod());
                                    new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder3.getPropertyConversionMethod(), postgrestRequestBuilder3.getParams(), false, 4, null).eq("id", watchProgress.f20610a);
                                    io.github.jan.supabase.postgrest.query.Returning returning3 = postgrestRequestBuilder3.getReturning();
                                    io.github.jan.supabase.postgrest.query.Count count3 = postgrestRequestBuilder3.getCount();
                                    java.util.Map mapMapToFirstValue3 = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder3.getParams());
                                    io.github.jan.supabase.SupabaseSerializer serializer5 = postgrestQueryBuilderFrom5.getPostgrest().getSerializer();
                                    p162s8.c cVar6 = p162s8.d.f27387d;
                                    java.lang.String strEncode5 = serializer5.encode(kotlin.jvm.internal.B.a(com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate.class), recentlyWatchedLiveRepository$RecentlyWatchedUpdate3);
                                    cVar6.getClass();
                                    io.github.jan.supabase.postgrest.request.UpdateRequest updateRequest3 = new io.github.jan.supabase.postgrest.request.UpdateRequest(returning3, count3, mapMapToFirstValue3, (kotlinx.serialization.json.b) cVar6.b(strEncode5, kotlinx.serialization.json.b.Companion.serializer()), postgrestQueryBuilderFrom5.getSchema(), postgrestRequestBuilder3.getHeaders().build());
                                    io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor5 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                                    io.github.jan.supabase.postgrest.Postgrest postgrest5 = postgrestQueryBuilderFrom5.getPostgrest();
                                    java.lang.String table5 = postgrestQueryBuilderFrom5.getTable();
                                    a2.f13105h = b10;
                                    a2.f13106i = xtreamLiveStream2;
                                    a2.j = str9;
                                    a2.f13107k = str8;
                                    a2.f13108l = str3;
                                    a2.f13109m = str7;
                                    a2.f13110n = i14;
                                    a2.f13113q = 2;
                                    objExecute2 = restRequestExecutor5.execute(postgrest5, table5, updateRequest3, a2);
                                    if (objExecute2 == aVar) {
                                        return aVar;
                                    }
                                    java.lang.String str211 = str3;
                                    str11 = str9;
                                    str10 = str211;
                                } else {
                                    i3 = i12;
                                    b13 = b10;
                                    java.lang.String str212 = str7;
                                    xtreamLiveStream5 = xtreamLiveStream2;
                                    com.kiptv.core.model.WatchProgressUpsert watchProgressUpsert3 = new com.kiptv.core.model.WatchProgressUpsert(str9, str8, str3, "live", xtreamLiveStream2.f20655b, null, null, null, 0, 0, false, str212, null, xtreamLiveStream2.f20658e, 251872);
                                    str7 = str212;
                                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom6 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b13.f13164a).from("watch_progress");
                                    java.util.List listI2 = com.google.common.util.concurrent.P.i0(watchProgressUpsert3);
                                    insertRequestBuilder = new io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom6.getPostgrest().getConfig()).getPropertyConversionMethod());
                                    io.github.jan.supabase.SupabaseSerializer serializer6 = postgrestQueryBuilderFrom6.getPostgrest().getSerializer();
                                    p162s8.c cVar7 = p162s8.d.f27387d;
                                    E6.y yVar3 = E6.y.f3222c;
                                    java.lang.String strEncode6 = serializer6.encode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.WatchProgressUpsert.class))), listI2);
                                    cVar7.getClass();
                                    kotlinx.serialization.json.a aVarH3 = p162s8.l.h((kotlinx.serialization.json.b) cVar7.b(strEncode6, kotlinx.serialization.json.b.Companion.serializer()));
                                    arrayList = new java.util.ArrayList(p078i6.q.I0(aVarH3, 10));
                                    it = aVarH3.f24557h.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(p162s8.l.i((kotlinx.serialization.json.b) it.next()).f24558h.keySet());
                                    }
                                    listC1 = p078i6.o.c1(p078i6.q.J0(arrayList));
                                    if (!listC1.isEmpty()) {
                                        insertRequestBuilder.getParams().put("columns", com.google.common.util.concurrent.P.i0(p078i6.o.o1(listC1, ",", null, null, null, 62)));
                                    }
                                    io.github.jan.supabase.postgrest.request.InsertRequest insertRequest3 = new io.github.jan.supabase.postgrest.request.InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVarH3, io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilderFrom6.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null);
                                    io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor6 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                                    io.github.jan.supabase.postgrest.Postgrest postgrest6 = postgrestQueryBuilderFrom6.getPostgrest();
                                    java.lang.String table6 = postgrestQueryBuilderFrom6.getTable();
                                    a2.f13105h = b13;
                                    a2.f13106i = xtreamLiveStream5;
                                    a2.j = str9;
                                    a2.f13107k = str8;
                                    a2.f13108l = str3;
                                    a2.f13109m = str7;
                                    a2.f13110n = i14;
                                    i9 = 3;
                                    a2.f13113q = 3;
                                    objExecute = restRequestExecutor6.execute(postgrest6, table6, insertRequest3, a2);
                                    if (objExecute == aVar) {
                                        return aVar;
                                    }
                                    java.lang.String str213 = str3;
                                    str13 = str9;
                                    str12 = str213;
                                    b11 = b13;
                                    xtreamLiveStream3 = xtreamLiveStream5;
                                    objExecute2 = objExecute;
                                }
                            }
                            return a11;
                        }
                        i14 = a2.f13110n;
                        str7 = a2.f13109m;
                        str12 = a2.f13108l;
                        str8 = a2.f13107k;
                        str13 = a2.j;
                        xtreamLiveStream3 = a2.f13106i;
                        b11 = a2.f13105h;
                        com.google.common.util.concurrent.P.u0(objExecute2);
                        i3 = 1;
                        i9 = 3;
                    } catch (java.lang.Exception e6) {
                        e = e6;
                        java.lang.String str30 = str13;
                        str3 = str12;
                        str5 = str8;
                        str6 = str30;
                        xtreamLiveStream5 = xtreamLiveStream3;
                        b12 = b11;
                        android.util.Log.d("RecentlyWatchedLiveRepo", "syncRecordWatch attempt " + (i14 + 1) + " failed: " + e);
                        c9 = 2;
                        if (i14 < 2) {
                            j = f13163l[i14];
                            a2.f13105h = b12;
                            a2.f13106i = xtreamLiveStream5;
                            a2.j = str6;
                            a2.f13107k = str5;
                            a2.f13108l = str3;
                            a2.f13109m = str7;
                            a2.f13110n = i14;
                            c10 = 4;
                            a2.f13113q = 4;
                            if (S7.C.n(j, a2) == aVar) {
                                return aVar;
                            }
                            i10 = i14;
                            str14 = str7;
                            str15 = str3;
                            xtreamLiveStream4 = xtreamLiveStream5;
                            java.lang.String str214 = str14;
                            i14 = i10;
                            a9 = a2;
                            str18 = str6;
                            str17 = str15;
                            xtreamLiveStream6 = xtreamLiveStream4;
                            str16 = str214;
                        } else {
                            c10 = 4;
                            a9 = a2;
                            str18 = str6;
                            str17 = str3;
                            str16 = str7;
                            xtreamLiveStream6 = xtreamLiveStream5;
                        }
                        b13 = b12;
                        i11 = i14 + 1;
                        i15 = i9;
                        a10 = a9;
                        i12 = i3;
                        if (i11 < i15) {
                            a10.f13105h = b13;
                            a10.f13106i = xtreamLiveStream6;
                            a10.j = str18;
                            a10.f13107k = str5;
                            a10.f13108l = str17;
                            a10.f13109m = str16;
                            a10.f13110n = i11;
                            a10.f13113q = i12;
                            objB = b13.b(str18, str5, str17, a10);
                            if (objB == aVar) {
                                return aVar;
                            }
                            java.lang.String str215 = str5;
                            str9 = str18;
                            a2 = a10;
                            i14 = i11;
                            xtreamLiveStream2 = xtreamLiveStream6;
                            str7 = str16;
                            str3 = str17;
                            str8 = str215;
                            b10 = b13;
                            objExecute2 = objB;
                            watchProgress = (com.kiptv.core.model.WatchProgress) objExecute2;
                            if (watchProgress != null) {
                                i3 = i12;
                                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom7 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b10.f13164a).from("watch_progress");
                                com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate recentlyWatchedLiveRepository$RecentlyWatchedUpdate4 = new com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate(xtreamLiveStream2.f20655b, xtreamLiveStream2.f20658e, str7, str7);
                                io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder4 = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom7.getPostgrest().getConfig()).getPropertyConversionMethod());
                                new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder4.getPropertyConversionMethod(), postgrestRequestBuilder4.getParams(), false, 4, null).eq("id", watchProgress.f20610a);
                                io.github.jan.supabase.postgrest.query.Returning returning4 = postgrestRequestBuilder4.getReturning();
                                io.github.jan.supabase.postgrest.query.Count count4 = postgrestRequestBuilder4.getCount();
                                java.util.Map mapMapToFirstValue4 = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder4.getParams());
                                io.github.jan.supabase.SupabaseSerializer serializer7 = postgrestQueryBuilderFrom7.getPostgrest().getSerializer();
                                p162s8.c cVar8 = p162s8.d.f27387d;
                                java.lang.String strEncode7 = serializer7.encode(kotlin.jvm.internal.B.a(com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate.class), recentlyWatchedLiveRepository$RecentlyWatchedUpdate4);
                                cVar8.getClass();
                                io.github.jan.supabase.postgrest.request.UpdateRequest updateRequest4 = new io.github.jan.supabase.postgrest.request.UpdateRequest(returning4, count4, mapMapToFirstValue4, (kotlinx.serialization.json.b) cVar8.b(strEncode7, kotlinx.serialization.json.b.Companion.serializer()), postgrestQueryBuilderFrom7.getSchema(), postgrestRequestBuilder4.getHeaders().build());
                                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor7 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                                io.github.jan.supabase.postgrest.Postgrest postgrest7 = postgrestQueryBuilderFrom7.getPostgrest();
                                java.lang.String table7 = postgrestQueryBuilderFrom7.getTable();
                                a2.f13105h = b10;
                                a2.f13106i = xtreamLiveStream2;
                                a2.j = str9;
                                a2.f13107k = str8;
                                a2.f13108l = str3;
                                a2.f13109m = str7;
                                a2.f13110n = i14;
                                a2.f13113q = 2;
                                objExecute2 = restRequestExecutor7.execute(postgrest7, table7, updateRequest4, a2);
                                if (objExecute2 == aVar) {
                                    return aVar;
                                }
                                java.lang.String str216 = str3;
                                str11 = str9;
                                str10 = str216;
                            } else {
                                i3 = i12;
                                b13 = b10;
                                java.lang.String str217 = str7;
                                xtreamLiveStream5 = xtreamLiveStream2;
                                com.kiptv.core.model.WatchProgressUpsert watchProgressUpsert4 = new com.kiptv.core.model.WatchProgressUpsert(str9, str8, str3, "live", xtreamLiveStream2.f20655b, null, null, null, 0, 0, false, str217, null, xtreamLiveStream2.f20658e, 251872);
                                str7 = str217;
                                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom8 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b13.f13164a).from("watch_progress");
                                java.util.List listI3 = com.google.common.util.concurrent.P.i0(watchProgressUpsert4);
                                insertRequestBuilder = new io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom8.getPostgrest().getConfig()).getPropertyConversionMethod());
                                io.github.jan.supabase.SupabaseSerializer serializer8 = postgrestQueryBuilderFrom8.getPostgrest().getSerializer();
                                p162s8.c cVar9 = p162s8.d.f27387d;
                                E6.y yVar4 = E6.y.f3222c;
                                java.lang.String strEncode8 = serializer8.encode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.WatchProgressUpsert.class))), listI3);
                                cVar9.getClass();
                                kotlinx.serialization.json.a aVarH4 = p162s8.l.h((kotlinx.serialization.json.b) cVar9.b(strEncode8, kotlinx.serialization.json.b.Companion.serializer()));
                                arrayList = new java.util.ArrayList(p078i6.q.I0(aVarH4, 10));
                                it = aVarH4.f24557h.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(p162s8.l.i((kotlinx.serialization.json.b) it.next()).f24558h.keySet());
                                }
                                listC1 = p078i6.o.c1(p078i6.q.J0(arrayList));
                                if (!listC1.isEmpty()) {
                                    insertRequestBuilder.getParams().put("columns", com.google.common.util.concurrent.P.i0(p078i6.o.o1(listC1, ",", null, null, null, 62)));
                                }
                                io.github.jan.supabase.postgrest.request.InsertRequest insertRequest4 = new io.github.jan.supabase.postgrest.request.InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVarH4, io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilderFrom8.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null);
                                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor8 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                                io.github.jan.supabase.postgrest.Postgrest postgrest8 = postgrestQueryBuilderFrom8.getPostgrest();
                                java.lang.String table8 = postgrestQueryBuilderFrom8.getTable();
                                a2.f13105h = b13;
                                a2.f13106i = xtreamLiveStream5;
                                a2.j = str9;
                                a2.f13107k = str8;
                                a2.f13108l = str3;
                                a2.f13109m = str7;
                                a2.f13110n = i14;
                                i9 = 3;
                                a2.f13113q = 3;
                                objExecute = restRequestExecutor8.execute(postgrest8, table8, insertRequest4, a2);
                                if (objExecute == aVar) {
                                    return aVar;
                                }
                                java.lang.String str218 = str3;
                                str13 = str9;
                                str12 = str218;
                                b11 = b13;
                                xtreamLiveStream3 = xtreamLiveStream5;
                                objExecute2 = objExecute;
                            }
                        }
                        return a11;
                    }
                    return a11;
                }
                i14 = a2.f13110n;
                str7 = a2.f13109m;
                str10 = a2.f13108l;
                str8 = a2.f13107k;
                str11 = a2.j;
                xtreamLiveStream2 = a2.f13106i;
                b10 = a2.f13105h;
                com.google.common.util.concurrent.P.u0(objExecute2);
                i3 = 1;
            } catch (java.lang.Exception e9) {
                e = e9;
                java.lang.String str31 = str11;
                str3 = str10;
                str5 = str8;
                str6 = str31;
                xtreamLiveStream5 = xtreamLiveStream2;
                b12 = b10;
                i9 = 3;
                android.util.Log.d("RecentlyWatchedLiveRepo", "syncRecordWatch attempt " + (i14 + 1) + " failed: " + e);
                c9 = 2;
                if (i14 < 2) {
                    j = f13163l[i14];
                    a2.f13105h = b12;
                    a2.f13106i = xtreamLiveStream5;
                    a2.j = str6;
                    a2.f13107k = str5;
                    a2.f13108l = str3;
                    a2.f13109m = str7;
                    a2.f13110n = i14;
                    c10 = 4;
                    a2.f13113q = 4;
                    if (S7.C.n(j, a2) == aVar) {
                        return aVar;
                    }
                    i10 = i14;
                    str14 = str7;
                    str15 = str3;
                    xtreamLiveStream4 = xtreamLiveStream5;
                    java.lang.String str219 = str14;
                    i14 = i10;
                    a9 = a2;
                    str18 = str6;
                    str17 = str15;
                    xtreamLiveStream6 = xtreamLiveStream4;
                    str16 = str219;
                } else {
                    c10 = 4;
                    a9 = a2;
                    str18 = str6;
                    str17 = str3;
                    str16 = str7;
                    xtreamLiveStream6 = xtreamLiveStream5;
                }
                b13 = b12;
                i11 = i14 + 1;
                i15 = i9;
                a10 = a9;
                i12 = i3;
                if (i11 < i15) {
                    a10.f13105h = b13;
                    a10.f13106i = xtreamLiveStream6;
                    a10.j = str18;
                    a10.f13107k = str5;
                    a10.f13108l = str17;
                    a10.f13109m = str16;
                    a10.f13110n = i11;
                    a10.f13113q = i12;
                    objB = b13.b(str18, str5, str17, a10);
                    if (objB == aVar) {
                        return aVar;
                    }
                    java.lang.String str2110 = str5;
                    str9 = str18;
                    a2 = a10;
                    i14 = i11;
                    xtreamLiveStream2 = xtreamLiveStream6;
                    str7 = str16;
                    str3 = str17;
                    str8 = str2110;
                    b10 = b13;
                    objExecute2 = objB;
                    watchProgress = (com.kiptv.core.model.WatchProgress) objExecute2;
                    if (watchProgress != null) {
                        i3 = i12;
                        io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom9 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b10.f13164a).from("watch_progress");
                        com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate recentlyWatchedLiveRepository$RecentlyWatchedUpdate5 = new com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate(xtreamLiveStream2.f20655b, xtreamLiveStream2.f20658e, str7, str7);
                        io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder5 = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom9.getPostgrest().getConfig()).getPropertyConversionMethod());
                        new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder5.getPropertyConversionMethod(), postgrestRequestBuilder5.getParams(), false, 4, null).eq("id", watchProgress.f20610a);
                        io.github.jan.supabase.postgrest.query.Returning returning5 = postgrestRequestBuilder5.getReturning();
                        io.github.jan.supabase.postgrest.query.Count count5 = postgrestRequestBuilder5.getCount();
                        java.util.Map mapMapToFirstValue5 = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder5.getParams());
                        io.github.jan.supabase.SupabaseSerializer serializer9 = postgrestQueryBuilderFrom9.getPostgrest().getSerializer();
                        p162s8.c cVar10 = p162s8.d.f27387d;
                        java.lang.String strEncode9 = serializer9.encode(kotlin.jvm.internal.B.a(com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate.class), recentlyWatchedLiveRepository$RecentlyWatchedUpdate5);
                        cVar10.getClass();
                        io.github.jan.supabase.postgrest.request.UpdateRequest updateRequest5 = new io.github.jan.supabase.postgrest.request.UpdateRequest(returning5, count5, mapMapToFirstValue5, (kotlinx.serialization.json.b) cVar10.b(strEncode9, kotlinx.serialization.json.b.Companion.serializer()), postgrestQueryBuilderFrom9.getSchema(), postgrestRequestBuilder5.getHeaders().build());
                        io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor9 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                        io.github.jan.supabase.postgrest.Postgrest postgrest9 = postgrestQueryBuilderFrom9.getPostgrest();
                        java.lang.String table9 = postgrestQueryBuilderFrom9.getTable();
                        a2.f13105h = b10;
                        a2.f13106i = xtreamLiveStream2;
                        a2.j = str9;
                        a2.f13107k = str8;
                        a2.f13108l = str3;
                        a2.f13109m = str7;
                        a2.f13110n = i14;
                        a2.f13113q = 2;
                        objExecute2 = restRequestExecutor9.execute(postgrest9, table9, updateRequest5, a2);
                        if (objExecute2 == aVar) {
                            return aVar;
                        }
                        java.lang.String str2111 = str3;
                        str11 = str9;
                        str10 = str2111;
                    } else {
                        i3 = i12;
                        b13 = b10;
                        java.lang.String str2112 = str7;
                        xtreamLiveStream5 = xtreamLiveStream2;
                        com.kiptv.core.model.WatchProgressUpsert watchProgressUpsert5 = new com.kiptv.core.model.WatchProgressUpsert(str9, str8, str3, "live", xtreamLiveStream2.f20655b, null, null, null, 0, 0, false, str2112, null, xtreamLiveStream2.f20658e, 251872);
                        str7 = str2112;
                        io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom10 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b13.f13164a).from("watch_progress");
                        java.util.List listI4 = com.google.common.util.concurrent.P.i0(watchProgressUpsert5);
                        insertRequestBuilder = new io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom10.getPostgrest().getConfig()).getPropertyConversionMethod());
                        io.github.jan.supabase.SupabaseSerializer serializer10 = postgrestQueryBuilderFrom10.getPostgrest().getSerializer();
                        p162s8.c cVar11 = p162s8.d.f27387d;
                        E6.y yVar5 = E6.y.f3222c;
                        java.lang.String strEncode10 = serializer10.encode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.WatchProgressUpsert.class))), listI4);
                        cVar11.getClass();
                        kotlinx.serialization.json.a aVarH5 = p162s8.l.h((kotlinx.serialization.json.b) cVar11.b(strEncode10, kotlinx.serialization.json.b.Companion.serializer()));
                        arrayList = new java.util.ArrayList(p078i6.q.I0(aVarH5, 10));
                        it = aVarH5.f24557h.iterator();
                        while (it.hasNext()) {
                            arrayList.add(p162s8.l.i((kotlinx.serialization.json.b) it.next()).f24558h.keySet());
                        }
                        listC1 = p078i6.o.c1(p078i6.q.J0(arrayList));
                        if (!listC1.isEmpty()) {
                            insertRequestBuilder.getParams().put("columns", com.google.common.util.concurrent.P.i0(p078i6.o.o1(listC1, ",", null, null, null, 62)));
                        }
                        io.github.jan.supabase.postgrest.request.InsertRequest insertRequest5 = new io.github.jan.supabase.postgrest.request.InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVarH5, io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilderFrom10.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null);
                        io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor10 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                        io.github.jan.supabase.postgrest.Postgrest postgrest10 = postgrestQueryBuilderFrom10.getPostgrest();
                        java.lang.String table10 = postgrestQueryBuilderFrom10.getTable();
                        a2.f13105h = b13;
                        a2.f13106i = xtreamLiveStream5;
                        a2.j = str9;
                        a2.f13107k = str8;
                        a2.f13108l = str3;
                        a2.f13109m = str7;
                        a2.f13110n = i14;
                        i9 = 3;
                        a2.f13113q = 3;
                        objExecute = restRequestExecutor10.execute(postgrest10, table10, insertRequest5, a2);
                        if (objExecute == aVar) {
                            return aVar;
                        }
                        java.lang.String str2113 = str3;
                        str13 = str9;
                        str12 = str2113;
                        b11 = b13;
                        xtreamLiveStream3 = xtreamLiveStream5;
                        objExecute2 = objExecute;
                    }
                }
                return a11;
            }
            return a11;
        } catch (java.lang.Exception e10) {
            e = e10;
            str3 = str2;
            str5 = str4;
            str6 = str;
            i3 = 1;
            i9 = 3;
            xtreamLiveStream5 = xtreamLiveStream3;
            b12 = b11;
            android.util.Log.d("RecentlyWatchedLiveRepo", "syncRecordWatch attempt " + (i14 + 1) + " failed: " + e);
            c9 = 2;
            if (i14 < 2) {
                j = f13163l[i14];
                a2.f13105h = b12;
                a2.f13106i = xtreamLiveStream5;
                a2.j = str6;
                a2.f13107k = str5;
                a2.f13108l = str3;
                a2.f13109m = str7;
                a2.f13110n = i14;
                c10 = 4;
                a2.f13113q = 4;
                if (S7.C.n(j, a2) == aVar) {
                    return aVar;
                }
                i10 = i14;
                str14 = str7;
                str15 = str3;
                xtreamLiveStream4 = xtreamLiveStream5;
            } else {
                c10 = 4;
                a9 = a2;
                str18 = str6;
                str17 = str3;
                str16 = str7;
                xtreamLiveStream6 = xtreamLiveStream5;
            }
            b13 = b12;
            i11 = i14 + 1;
            i15 = i9;
            a10 = a9;
            i12 = i3;
            if (i11 < i15) {
                a10.f13105h = b13;
                a10.f13106i = xtreamLiveStream6;
                a10.j = str18;
                a10.f13107k = str5;
                a10.f13108l = str17;
                a10.f13109m = str16;
                a10.f13110n = i11;
                a10.f13113q = i12;
                objB = b13.b(str18, str5, str17, a10);
                if (objB == aVar) {
                    return aVar;
                }
                java.lang.String str2114 = str5;
                str9 = str18;
                a2 = a10;
                i14 = i11;
                xtreamLiveStream2 = xtreamLiveStream6;
                str7 = str16;
                str3 = str17;
                str8 = str2114;
                b10 = b13;
                objExecute2 = objB;
                watchProgress = (com.kiptv.core.model.WatchProgress) objExecute2;
                if (watchProgress != null) {
                    i3 = i12;
                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom11 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b10.f13164a).from("watch_progress");
                    com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate recentlyWatchedLiveRepository$RecentlyWatchedUpdate6 = new com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate(xtreamLiveStream2.f20655b, xtreamLiveStream2.f20658e, str7, str7);
                    io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder6 = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom11.getPostgrest().getConfig()).getPropertyConversionMethod());
                    new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder6.getPropertyConversionMethod(), postgrestRequestBuilder6.getParams(), false, 4, null).eq("id", watchProgress.f20610a);
                    io.github.jan.supabase.postgrest.query.Returning returning6 = postgrestRequestBuilder6.getReturning();
                    io.github.jan.supabase.postgrest.query.Count count6 = postgrestRequestBuilder6.getCount();
                    java.util.Map mapMapToFirstValue6 = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder6.getParams());
                    io.github.jan.supabase.SupabaseSerializer serializer11 = postgrestQueryBuilderFrom11.getPostgrest().getSerializer();
                    p162s8.c cVar12 = p162s8.d.f27387d;
                    java.lang.String strEncode11 = serializer11.encode(kotlin.jvm.internal.B.a(com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate.class), recentlyWatchedLiveRepository$RecentlyWatchedUpdate6);
                    cVar12.getClass();
                    io.github.jan.supabase.postgrest.request.UpdateRequest updateRequest6 = new io.github.jan.supabase.postgrest.request.UpdateRequest(returning6, count6, mapMapToFirstValue6, (kotlinx.serialization.json.b) cVar12.b(strEncode11, kotlinx.serialization.json.b.Companion.serializer()), postgrestQueryBuilderFrom11.getSchema(), postgrestRequestBuilder6.getHeaders().build());
                    io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor11 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                    io.github.jan.supabase.postgrest.Postgrest postgrest11 = postgrestQueryBuilderFrom11.getPostgrest();
                    java.lang.String table11 = postgrestQueryBuilderFrom11.getTable();
                    a2.f13105h = b10;
                    a2.f13106i = xtreamLiveStream2;
                    a2.j = str9;
                    a2.f13107k = str8;
                    a2.f13108l = str3;
                    a2.f13109m = str7;
                    a2.f13110n = i14;
                    a2.f13113q = 2;
                    objExecute2 = restRequestExecutor11.execute(postgrest11, table11, updateRequest6, a2);
                    if (objExecute2 == aVar) {
                        return aVar;
                    }
                    java.lang.String str2115 = str3;
                    str11 = str9;
                    str10 = str2115;
                } else {
                    i3 = i12;
                    b13 = b10;
                    java.lang.String str2116 = str7;
                    xtreamLiveStream5 = xtreamLiveStream2;
                    com.kiptv.core.model.WatchProgressUpsert watchProgressUpsert6 = new com.kiptv.core.model.WatchProgressUpsert(str9, str8, str3, "live", xtreamLiveStream2.f20655b, null, null, null, 0, 0, false, str2116, null, xtreamLiveStream2.f20658e, 251872);
                    str7 = str2116;
                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom12 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(b13.f13164a).from("watch_progress");
                    java.util.List listI5 = com.google.common.util.concurrent.P.i0(watchProgressUpsert6);
                    insertRequestBuilder = new io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom12.getPostgrest().getConfig()).getPropertyConversionMethod());
                    io.github.jan.supabase.SupabaseSerializer serializer12 = postgrestQueryBuilderFrom12.getPostgrest().getSerializer();
                    p162s8.c cVar13 = p162s8.d.f27387d;
                    E6.y yVar6 = E6.y.f3222c;
                    java.lang.String strEncode12 = serializer12.encode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.WatchProgressUpsert.class))), listI5);
                    cVar13.getClass();
                    kotlinx.serialization.json.a aVarH6 = p162s8.l.h((kotlinx.serialization.json.b) cVar13.b(strEncode12, kotlinx.serialization.json.b.Companion.serializer()));
                    arrayList = new java.util.ArrayList(p078i6.q.I0(aVarH6, 10));
                    it = aVarH6.f24557h.iterator();
                    while (it.hasNext()) {
                        arrayList.add(p162s8.l.i((kotlinx.serialization.json.b) it.next()).f24558h.keySet());
                    }
                    listC1 = p078i6.o.c1(p078i6.q.J0(arrayList));
                    if (!listC1.isEmpty()) {
                        insertRequestBuilder.getParams().put("columns", com.google.common.util.concurrent.P.i0(p078i6.o.o1(listC1, ",", null, null, null, 62)));
                    }
                    io.github.jan.supabase.postgrest.request.InsertRequest insertRequest6 = new io.github.jan.supabase.postgrest.request.InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVarH6, io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilderFrom12.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null);
                    io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor12 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                    io.github.jan.supabase.postgrest.Postgrest postgrest12 = postgrestQueryBuilderFrom12.getPostgrest();
                    java.lang.String table12 = postgrestQueryBuilderFrom12.getTable();
                    a2.f13105h = b13;
                    a2.f13106i = xtreamLiveStream5;
                    a2.j = str9;
                    a2.f13107k = str8;
                    a2.f13108l = str3;
                    a2.f13109m = str7;
                    a2.f13110n = i14;
                    i9 = 3;
                    a2.f13113q = 3;
                    objExecute = restRequestExecutor12.execute(postgrest12, table12, insertRequest6, a2);
                    if (objExecute == aVar) {
                        return aVar;
                    }
                    java.lang.String str2117 = str3;
                    str13 = str9;
                    str12 = str2117;
                    b11 = b13;
                    xtreamLiveStream3 = xtreamLiveStream5;
                    objExecute2 = objExecute;
                }
            }
            return a11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.String str3, p117n6.c cVar) {
        p005a5.C1418u2 c1418u2;
        if (cVar instanceof p005a5.C1418u2) {
            c1418u2 = (p005a5.C1418u2) cVar;
            int i3 = c1418u2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1418u2.j = i3 - Integer.MIN_VALUE;
            } else {
                c1418u2 = new p005a5.C1418u2(this, cVar);
            }
        } else {
            c1418u2 = new p005a5.C1418u2(this, cVar);
        }
        java.lang.Object objExecute = c1418u2.f15127h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1418u2.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13164a).from("watch_progress");
                java.lang.String strM299getALLU9NzzuM = io.github.jan.supabase.postgrest.query.Columns.INSTANCE.m299getALLU9NzzuM();
                io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder selectRequestBuilder = new io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(selectRequestBuilder.getPropertyConversionMethod(), selectRequestBuilder.getParams(), false, 4, null);
                postgrestFilterBuilder.eq(io.sentry.TraceContext.JsonKeys.USER_ID, str);
                postgrestFilterBuilder.eq("playlist_id", str2);
                postgrestFilterBuilder.eq(androidx.media3.exoplayer.offline.DownloadService.KEY_CONTENT_ID, str3);
                postgrestFilterBuilder.eq(io.sentry.SentryEnvelopeItemHeader.JsonKeys.CONTENT_TYPE, "live");
                io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder.limit$default(selectRequestBuilder, 1L, null, 2, null);
                selectRequestBuilder.getParams().put("select", com.google.common.util.concurrent.P.i0(strM299getALLU9NzzuM));
                io.github.jan.supabase.postgrest.request.SelectRequest selectRequest = new io.github.jan.supabase.postgrest.request.SelectRequest(selectRequestBuilder.getHead(), selectRequestBuilder.getCount(), io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(selectRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), selectRequestBuilder.getHeaders().build());
                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                java.lang.String table = postgrestQueryBuilderFrom.getTable();
                c1418u2.j = 1;
                objExecute = restRequestExecutor.execute(postgrest, table, selectRequest, c1418u2);
                if (objExecute == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objExecute);
            }
            io.github.jan.supabase.postgrest.result.PostgrestResult postgrestResult = (io.github.jan.supabase.postgrest.result.PostgrestResult) objExecute;
            io.github.jan.supabase.SupabaseSerializer serializer = postgrestResult.getPostgrest().getSerializer();
            java.lang.String data = postgrestResult.getData();
            E6.y yVar = E6.y.f3222c;
            return (com.kiptv.core.model.WatchProgress) p078i6.o.j1((java.util.List) serializer.decode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.WatchProgress.class))), data));
        } catch (java.lang.Exception e6) {
            Y6.f.u(e6, "findExisting failed: ", "RecentlyWatchedLiveRepo");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object c(p117n6.c cVar) {
        p005a5.C1428v2 c1428v2;
        java.lang.String id;
        com.kiptv.core.model.Playlist playlist;
        java.lang.String str;
        p005a5.B2 b9;
        java.lang.String str2;
        java.util.List<java.lang.String> list;
        if (cVar instanceof p005a5.C1428v2) {
            c1428v2 = (p005a5.C1428v2) cVar;
            int i3 = c1428v2.f15174l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1428v2.f15174l = i3 - Integer.MIN_VALUE;
            } else {
                c1428v2 = new p005a5.C1428v2(this, cVar);
            }
        } else {
            c1428v2 = new p005a5.C1428v2(this, cVar);
        }
        java.lang.Object objExecute = c1428v2.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1428v2.f15174l;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f13165b.e();
                if (userInfoE != null && (id = userInfoE.getId()) != null && (playlist = (com.kiptv.core.model.Playlist) ((V7.n0) this.f13166c.f13659k.f10419h).getValue()) != null && (str = playlist.f20033a) != null && (!((java.lang.Boolean) this.f13171i.getValue()).booleanValue() || !kotlin.jvm.internal.m.a(this.f13172k, str))) {
                    V7.n0 n0Var = this.g;
                    java.util.List<java.lang.String> list2 = p078i6.w.f23205h;
                    n0Var.getClass();
                    n0Var.i(null, list2);
                    this.j = list2;
                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13164a).from("watch_progress");
                    java.lang.String strM299getALLU9NzzuM = io.github.jan.supabase.postgrest.query.Columns.INSTANCE.m299getALLU9NzzuM();
                    io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder selectRequestBuilder = new io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                    io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(selectRequestBuilder.getPropertyConversionMethod(), selectRequestBuilder.getParams(), false, 4, null);
                    postgrestFilterBuilder.eq(io.sentry.TraceContext.JsonKeys.USER_ID, id);
                    postgrestFilterBuilder.eq("playlist_id", str);
                    postgrestFilterBuilder.eq(io.sentry.SentryEnvelopeItemHeader.JsonKeys.CONTENT_TYPE, "live");
                    io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder2 = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestFilterBuilder.getPropertyConversionMethod(), null, true, 2, null);
                    postgrestFilterBuilder2.exact("hidden_from_continue_watching", null);
                    postgrestFilterBuilder2.eq("hidden_from_continue_watching", java.lang.Boolean.FALSE);
                    java.lang.String str3 = "(" + p078i6.o.o1(p078i6.C.V0(postgrestFilterBuilder2.getParams()), ",", null, null, p005a5.C1448x2.f15287i, 30) + ')';
                    if (!kotlin.jvm.internal.m.a(str3, "()")) {
                        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = postgrestFilterBuilder.get_params();
                        java.util.List listI0 = com.google.common.util.concurrent.P.i0(str3);
                        if (postgrestFilterBuilder.getIsInLogicalExpression() && (list = postgrestFilterBuilder.get_params().get("or")) != null) {
                            list2 = list;
                        }
                        map.put("or", p078i6.o.A1(listI0, list2));
                    }
                    io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder.order$default(selectRequestBuilder, "last_watched_at", io.github.jan.supabase.postgrest.query.Order.DESCENDING, false, null, 12, null);
                    io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder.limit$default(selectRequestBuilder, 20L, null, 2, null);
                    selectRequestBuilder.getParams().put("select", com.google.common.util.concurrent.P.i0(strM299getALLU9NzzuM));
                    io.github.jan.supabase.postgrest.request.SelectRequest selectRequest = new io.github.jan.supabase.postgrest.request.SelectRequest(selectRequestBuilder.getHead(), selectRequestBuilder.getCount(), io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(selectRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), selectRequestBuilder.getHeaders().build());
                    io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                    io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                    java.lang.String table = postgrestQueryBuilderFrom.getTable();
                    c1428v2.f15171h = this;
                    c1428v2.f15172i = str;
                    c1428v2.f15174l = 1;
                    objExecute = restRequestExecutor.execute(postgrest, table, selectRequest, c1428v2);
                    if (objExecute == aVar) {
                        return aVar;
                    }
                    b9 = this;
                    str2 = str;
                }
                return a2;
            }
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c1428v2.f15172i;
            b9 = c1428v2.f15171h;
            com.google.common.util.concurrent.P.u0(objExecute);
            io.github.jan.supabase.postgrest.result.PostgrestResult postgrestResult = (io.github.jan.supabase.postgrest.result.PostgrestResult) objExecute;
            io.github.jan.supabase.SupabaseSerializer serializer = postgrestResult.getPostgrest().getSerializer();
            java.lang.String data = postgrestResult.getData();
            E6.y yVar = E6.y.f3222c;
            b9.f((java.util.List) serializer.decode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.WatchProgress.class))), data));
            b9.f13172k = str2;
            V7.n0 n0Var2 = b9.f13171i;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            n0Var2.getClass();
            n0Var2.i(null, bool);
            return a2;
        } catch (java.lang.Exception e6) {
            Y6.f.u(e6, "load failed: ", "RecentlyWatchedLiveRepo");
        }
    }

    public final p070h6.A d(com.kiptv.core.model.XtreamLiveStream xtreamLiveStream) {
        boolean zG = this.f13168e.g();
        p070h6.A a2 = p070h6.A.f22523a;
        if (zG) {
            android.util.Log.d("RecentlyWatchedLiveRepo", "Skip recordWatch: incognito mode active");
            return a2;
        }
        V7.n0 n0Var = this.g;
        java.util.ArrayList arrayListO1 = p078i6.o.O1((java.util.Collection) n0Var.getValue());
        p078i6.u.Q0(arrayListO1, new p005a5.C1388r2(xtreamLiveStream, 0));
        arrayListO1.add(0, xtreamLiveStream);
        if (arrayListO1.size() > 20) {
            arrayListO1.subList(20, arrayListO1.size()).clear();
        }
        n0Var.getClass();
        n0Var.i(null, arrayListO1);
        S7.C.A(this.f13169f, null, new p005a5.C1458y2(this, xtreamLiveStream, null), 3);
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object e(int i3, p117n6.c cVar) {
        p005a5.C1468z2 c1468z2;
        java.lang.String id;
        com.kiptv.core.model.Playlist playlist;
        java.lang.String str;
        if (cVar instanceof p005a5.C1468z2) {
            c1468z2 = (p005a5.C1468z2) cVar;
            int i9 = c1468z2.j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1468z2.j = i9 - Integer.MIN_VALUE;
            } else {
                c1468z2 = new p005a5.C1468z2(this, cVar);
            }
        } else {
            c1468z2 = new p005a5.C1468z2(this, cVar);
        }
        java.lang.Object obj = c1468z2.f15392h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1468z2.j;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return a2;
            }
            com.google.common.util.concurrent.P.u0(obj);
            V7.n0 n0Var = this.g;
            java.lang.Iterable iterable = (java.lang.Iterable) n0Var.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : iterable) {
                if (((com.kiptv.core.model.XtreamLiveStream) obj2).f20657d != i3) {
                    arrayList.add(obj2);
                }
            }
            n0Var.getClass();
            n0Var.i(null, arrayList);
            io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f13165b.e();
            if (userInfoE != null && (id = userInfoE.getId()) != null && (playlist = (com.kiptv.core.model.Playlist) ((V7.n0) this.f13166c.f13659k.f10419h).getValue()) != null && (str = playlist.f20033a) != null) {
                java.lang.String string = j$.time.Instant.now().toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13164a).from("watch_progress");
                com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate recentlyWatchedLiveRepository$RecentlyWatchedHideUpdate = new com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate(string);
                io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder.getPropertyConversionMethod(), postgrestRequestBuilder.getParams(), false, 4, null);
                postgrestFilterBuilder.eq(io.sentry.TraceContext.JsonKeys.USER_ID, id);
                postgrestFilterBuilder.eq("playlist_id", str);
                postgrestFilterBuilder.eq(androidx.media3.exoplayer.offline.DownloadService.KEY_CONTENT_ID, java.lang.String.valueOf(i3));
                postgrestFilterBuilder.eq(io.sentry.SentryEnvelopeItemHeader.JsonKeys.CONTENT_TYPE, "live");
                io.github.jan.supabase.postgrest.query.Returning returning = postgrestRequestBuilder.getReturning();
                io.github.jan.supabase.postgrest.query.Count count = postgrestRequestBuilder.getCount();
                java.util.Map mapMapToFirstValue = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams());
                io.github.jan.supabase.SupabaseSerializer serializer = postgrestQueryBuilderFrom.getPostgrest().getSerializer();
                p162s8.c cVar2 = p162s8.d.f27387d;
                java.lang.String strEncode = serializer.encode(kotlin.jvm.internal.B.a(com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate.class), recentlyWatchedLiveRepository$RecentlyWatchedHideUpdate);
                cVar2.getClass();
                io.github.jan.supabase.postgrest.request.UpdateRequest updateRequest = new io.github.jan.supabase.postgrest.request.UpdateRequest(returning, count, mapMapToFirstValue, (kotlinx.serialization.json.b) cVar2.b(strEncode, kotlinx.serialization.json.b.Companion.serializer()), postgrestQueryBuilderFrom.getSchema(), postgrestRequestBuilder.getHeaders().build());
                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                java.lang.String table = postgrestQueryBuilderFrom.getTable();
                c1468z2.j = 1;
                if (restRequestExecutor.execute(postgrest, table, updateRequest, c1468z2) == aVar) {
                    return aVar;
                }
            }
            return a2;
        } catch (java.lang.Exception e6) {
            Y6.f.u(e6, "remove failed: ", "RecentlyWatchedLiveRepo");
        }
    }

    public final void f(java.util.List list) {
        this.j = list;
        java.util.List list2 = (java.util.List) ((V7.n0) this.f13167d.f15326r.f10419h).getValue();
        if (list2 == null) {
            return;
        }
        int iI0 = p078i6.D.I0(p078i6.q.I0(list2, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
        for (java.lang.Object obj : list2) {
            linkedHashMap.put(java.lang.Integer.valueOf(((com.kiptv.core.model.XtreamLiveStream) obj).f20657d), obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Integer numZ0 = O7.x.z0(((com.kiptv.core.model.WatchProgress) it.next()).f20613d);
            com.kiptv.core.model.XtreamLiveStream xtreamLiveStream = numZ0 != null ? (com.kiptv.core.model.XtreamLiveStream) linkedHashMap.get(numZ0) : null;
            if (xtreamLiveStream != null) {
                arrayList.add(xtreamLiveStream);
            }
        }
        V7.n0 n0Var = this.g;
        n0Var.getClass();
        n0Var.i(null, arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        this.j = p078i6.w.f23205h;
    }
}
