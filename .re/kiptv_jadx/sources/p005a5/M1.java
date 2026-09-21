package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class M1 {
    public static final p005a5.F1 Companion = new p005a5.F1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.github.jan.supabase.SupabaseClient f13651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1296i f13652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1291h4 f13653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y4.v2 f13654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1379q2 f13655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p076i4.Z0 f13656f;
    public final p028c8.d g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.n0 f13657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.W f13658i;
    public final V7.n0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.W f13659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.n0 f13660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V7.n0 f13661m;

    public M1(io.github.jan.supabase.SupabaseClient supabaseClient, p005a5.C1296i authRepository, p005a5.C1291h4 settingsRepository, Y4.v2 xtreamApiClient, p005a5.C1379q2 purchaseRepository, p076i4.Z0 playlistDeletionListeners) {
        kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
        kotlin.jvm.internal.m.e(authRepository, "authRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(xtreamApiClient, "xtreamApiClient");
        kotlin.jvm.internal.m.e(purchaseRepository, "purchaseRepository");
        kotlin.jvm.internal.m.e(playlistDeletionListeners, "playlistDeletionListeners");
        this.f13651a = supabaseClient;
        this.f13652b = authRepository;
        this.f13653c = settingsRepository;
        this.f13654d = xtreamApiClient;
        this.f13655e = purchaseRepository;
        this.f13656f = playlistDeletionListeners;
        Z7.e eVar = S7.M.f9549a;
        S7.C.c(Z7.d.f13044i.plus(S7.C.e()));
        this.g = new p028c8.d();
        V7.n0 n0VarB = V7.r.b(p078i6.w.f23205h);
        this.f13657h = n0VarB;
        this.f13658i = new V7.W(n0VarB);
        V7.n0 n0VarB2 = V7.r.b(null);
        this.j = n0VarB2;
        this.f13659k = new V7.W(n0VarB2);
        this.f13660l = V7.r.b(java.lang.Boolean.FALSE);
        this.f13661m = V7.r.b(null);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0287 A[Catch: all -> 0x00f5, Exception -> 0x01ba, f0 -> 0x01be, TryCatch #0 {all -> 0x00f5, blocks: (B:77:0x0241, B:79:0x0287, B:80:0x028f, B:38:0x00b7, B:40:0x00bf, B:42:0x00c5, B:44:0x00cf, B:46:0x00e1, B:48:0x00eb, B:61:0x011c, B:62:0x0138, B:63:0x01a0, B:65:0x01a6, B:70:0x01c2, B:72:0x01d0, B:73:0x01f1, B:53:0x00f9, B:54:0x00fd, B:56:0x0103, B:59:0x0112, B:60:0x011b, B:94:0x02d8, B:95:0x02df, B:96:0x02e0, B:97:0x02e9), top: B:100:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x02a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [c8.d] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [a5.G1, l6.c, n6.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v11, types: [io.github.jan.supabase.postgrest.executor.RestRequestExecutor] */
    /* JADX WARN: Type inference failed for: r4v16, types: [a5.h4] */
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
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, p117n6.c cVar) throws java.lang.Throwable {
        ?? g9;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        p005a5.M1 m8;
        ?? r13;
        java.lang.String id;
        p005a5.M1 m9;
        com.kiptv.core.model.Playlist playlist;
        ?? r9;
        java.lang.String str11;
        com.kiptv.core.model.Playlist playlist2;
        ?? r10;
        if (cVar instanceof p005a5.G1) {
            p005a5.G1 g10 = (p005a5.G1) cVar;
            int i3 = g10.f13420q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g10.f13420q = i3 - Integer.MIN_VALUE;
                g9 = g10;
            } else {
                g9 = new p005a5.G1(this, cVar);
            }
        } else {
            g9 = new p005a5.G1(this, cVar);
        }
        java.lang.Object objExecute = g9.f13418o;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = g9.f13420q;
        try {
            try {
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(objExecute);
                    g9.f13412h = this;
                    g9.f13413i = str;
                    g9.j = str2;
                    g9.f13414k = str3;
                    g9.f13415l = str4;
                    g9.f13416m = str5;
                    ?? r14 = this.g;
                    g9.f13417n = r14;
                    g9.f13420q = 1;
                    if (r14.e(g9) != aVar) {
                        str6 = str;
                        str7 = str2;
                        str8 = str3;
                        str9 = str4;
                        str10 = str5;
                        m8 = this;
                        r13 = r14;
                    }
                    return aVar;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        p028c8.a aVar2 = (p028c8.a) g9.f13413i;
                        m9 = (p005a5.M1) g9.f13412h;
                        try {
                            com.google.common.util.concurrent.P.u0(objExecute);
                            r13 = aVar2;
                            io.github.jan.supabase.postgrest.result.PostgrestResult postgrestResult = (io.github.jan.supabase.postgrest.result.PostgrestResult) objExecute;
                            io.github.jan.supabase.SupabaseSerializer serializer = postgrestResult.getPostgrest().getSerializer();
                            java.lang.String data = postgrestResult.getData();
                            E6.y yVar = E6.y.f3222c;
                            playlist = (com.kiptv.core.model.Playlist) p078i6.o.h1((java.util.List) serializer.decode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.Playlist.class))), data));
                            V7.n0 n0Var = m9.f13657h;
                            java.util.ArrayList arrayListA1 = p078i6.o.A1(com.google.common.util.concurrent.P.i0(playlist), (java.lang.Iterable) m9.f13657h.getValue());
                            n0Var.getClass();
                            n0Var.i(null, arrayListA1);
                            if (playlist.f20040i) {
                                V7.n0 n0Var2 = m9.j;
                                n0Var2.getClass();
                                n0Var2.i(null, playlist);
                            }
                            r9 = m9.f13653c;
                            str11 = playlist.f20033a;
                            g9.f13412h = r13;
                            g9.f13413i = playlist;
                            g9.f13420q = 3;
                            if (r9.j(str11, g9) != aVar) {
                                playlist2 = playlist;
                                r10 = r13;
                                ((p028c8.d) r10).g(null);
                                return playlist2;
                            }
                            return aVar;
                        } catch (com.kiptv.core.model.C1942f0 e6) {
                            throw e6;
                        } catch (java.lang.Exception e9) {
                            e = e9;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            g9 = aVar2;
                            ((p028c8.d) g9).g(null);
                            throw th;
                        }
                    } else {
                        if (i9 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        playlist2 = (com.kiptv.core.model.Playlist) g9.f13413i;
                        p028c8.a aVar3 = (p028c8.a) g9.f13412h;
                        try {
                            com.google.common.util.concurrent.P.u0(objExecute);
                            r10 = aVar3;
                            ((p028c8.d) r10).g(null);
                            return playlist2;
                        } catch (com.kiptv.core.model.C1942f0 e10) {
                            throw e10;
                        } catch (java.lang.Exception e11) {
                            e = e11;
                        }
                    }
                    android.util.Log.d("PlaylistRepository", "addXtreamPlaylist failed: " + e);
                    java.lang.String message = e.getMessage();
                    if (message == null || !O7.q.B0(message, "Playlist limit reached", true)) {
                        throw e;
                    }
                    com.kiptv.core.model.EnumC1940e0[] enumC1940e0Arr = com.kiptv.core.model.EnumC1940e0.f20749h;
                    throw new com.kiptv.core.model.C1942f0("PlaylistLimitReached");
                }
                p028c8.d dVar = g9.f13417n;
                java.lang.String str12 = g9.f13416m;
                java.lang.String str13 = g9.f13415l;
                java.lang.String str14 = g9.f13414k;
                str7 = g9.j;
                str6 = (java.lang.String) g9.f13413i;
                m8 = (p005a5.M1) g9.f13412h;
                com.google.common.util.concurrent.P.u0(objExecute);
                str10 = str12;
                str9 = str13;
                str8 = str14;
                r13 = dVar;
                io.github.jan.supabase.auth.user.UserInfo userInfoE = m8.f13652b.e();
                if (userInfoE == null || (id = userInfoE.getId()) == null) {
                    com.kiptv.core.model.EnumC1940e0[] enumC1940e0Arr2 = com.kiptv.core.model.EnumC1940e0.f20749h;
                    throw new com.kiptv.core.model.C1942f0("NotAuthenticated");
                }
                java.lang.String string = O7.q.r1(str6).toString();
                V7.n0 n0Var3 = m8.f13657h;
                if (((java.util.List) n0Var3.getValue()).size() >= m8.f13655e.f()) {
                    com.kiptv.core.model.EnumC1940e0[] enumC1940e0Arr3 = com.kiptv.core.model.EnumC1940e0.f20749h;
                    throw new com.kiptv.core.model.C1942f0("PlaylistLimitReached");
                }
                java.lang.Iterable iterable = (java.lang.Iterable) n0Var3.getValue();
                if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                    java.util.Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (O7.x.r0(((com.kiptv.core.model.Playlist) it.next()).f20035c, string, true)) {
                            com.kiptv.core.model.EnumC1940e0[] enumC1940e0Arr4 = com.kiptv.core.model.EnumC1940e0.f20749h;
                            throw new com.kiptv.core.model.C1942f0("DuplicateName");
                        }
                    }
                }
                Companion.getClass();
                com.kiptv.core.model.PlaylistInsert playlistInsert = new com.kiptv.core.model.PlaylistInsert(id, string, p005a5.F1.a(str7), str8, str9, null, str10, ((java.util.List) n0Var3.getValue()).isEmpty());
                try {
                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(m8.f13651a).from("playlists");
                    java.util.List listI0 = com.google.common.util.concurrent.P.i0(playlistInsert);
                    io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder insertRequestBuilder = new io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                    io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder.m307selectfYsiLaM$default(insertRequestBuilder, null, 1, null);
                    io.github.jan.supabase.SupabaseSerializer serializer2 = postgrestQueryBuilderFrom.getPostgrest().getSerializer();
                    p162s8.c cVar2 = p162s8.d.f27387d;
                    E6.y yVar2 = E6.y.f3222c;
                    java.lang.String strEncode = serializer2.encode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.PlaylistInsert.class))), listI0);
                    cVar2.getClass();
                    kotlinx.serialization.json.a aVarH = p162s8.l.h((kotlinx.serialization.json.b) cVar2.b(strEncode, kotlinx.serialization.json.b.Companion.serializer()));
                    java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(aVarH, 10));
                    java.util.Iterator it2 = aVarH.f24557h.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(p162s8.l.i((kotlinx.serialization.json.b) it2.next()).f24558h.keySet());
                    }
                    java.util.List listC1 = p078i6.o.c1(p078i6.q.J0(arrayList));
                    if (!listC1.isEmpty()) {
                        insertRequestBuilder.getParams().put("columns", com.google.common.util.concurrent.P.i0(p078i6.o.o1(listC1, ",", null, null, null, 62)));
                    }
                    io.github.jan.supabase.postgrest.request.InsertRequest insertRequest = new io.github.jan.supabase.postgrest.request.InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVarH, io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null);
                    ?? r11 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                    io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                    java.lang.String table = postgrestQueryBuilderFrom.getTable();
                    g9.f13412h = m8;
                    g9.f13413i = r13;
                    g9.j = null;
                    g9.f13414k = null;
                    g9.f13415l = null;
                    g9.f13416m = null;
                    g9.f13417n = null;
                    g9.f13420q = 2;
                    objExecute = r11.execute(postgrest, table, insertRequest, g9);
                    if (objExecute != aVar) {
                        m9 = m8;
                        r13 = r13;
                        io.github.jan.supabase.postgrest.result.PostgrestResult postgrestResult2 = (io.github.jan.supabase.postgrest.result.PostgrestResult) objExecute;
                        io.github.jan.supabase.SupabaseSerializer serializer3 = postgrestResult2.getPostgrest().getSerializer();
                        java.lang.String data2 = postgrestResult2.getData();
                        E6.y yVar3 = E6.y.f3222c;
                        playlist = (com.kiptv.core.model.Playlist) p078i6.o.h1((java.util.List) serializer3.decode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.Playlist.class))), data2));
                        V7.n0 n0Var4 = m9.f13657h;
                        java.util.ArrayList arrayListA2 = p078i6.o.A1(com.google.common.util.concurrent.P.i0(playlist), (java.lang.Iterable) m9.f13657h.getValue());
                        n0Var4.getClass();
                        n0Var4.i(null, arrayListA2);
                        if (playlist.f20040i) {
                            V7.n0 n0Var5 = m9.j;
                            n0Var5.getClass();
                            n0Var5.i(null, playlist);
                        }
                        r9 = m9.f13653c;
                        str11 = playlist.f20033a;
                        g9.f13412h = r13;
                        g9.f13413i = playlist;
                        g9.f13420q = 3;
                        if (r9.j(str11, g9) != aVar) {
                            playlist2 = playlist;
                            r10 = r13;
                            ((p028c8.d) r10).g(null);
                            return playlist2;
                        }
                    }
                    return aVar;
                } catch (com.kiptv.core.model.C1942f0 e12) {
                    throw e12;
                } catch (java.lang.Exception e13) {
                    e = e13;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                g9 = r13;
                ((p028c8.d) g9).g(null);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x013b  */
    /* JADX WARN: Code duplicated, block: B:51:0x013e A[Catch: Exception -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0052, blocks: (B:47:0x0135, B:51:0x013e, B:56:0x014e, B:57:0x0153, B:55:0x014d, B:19:0x004d, B:46:0x012e, B:24:0x005d, B:31:0x00d4, B:32:0x00e5, B:34:0x00eb, B:36:0x00fc, B:37:0x0100, B:39:0x010a, B:41:0x011f, B:27:0x0064, B:14:0x0038, B:53:0x0144, B:54:0x014c), top: B:62:0x0028, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0144 A[Catch: all -> 0x014d, TRY_ENTER, TryCatch #0 {all -> 0x014d, blocks: (B:14:0x0038, B:53:0x0144, B:54:0x014c), top: B:60:0x0038, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x014e A[Catch: Exception -> 0x0052, TryCatch #1 {Exception -> 0x0052, blocks: (B:47:0x0135, B:51:0x013e, B:56:0x014e, B:57:0x0153, B:55:0x014d, B:19:0x004d, B:46:0x012e, B:24:0x005d, B:31:0x00d4, B:32:0x00e5, B:34:0x00eb, B:36:0x00fc, B:37:0x0100, B:39:0x010a, B:41:0x011f, B:27:0x0064, B:14:0x0038, B:53:0x0144, B:54:0x014c), top: B:62:0x0028, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(com.kiptv.core.model.Playlist playlist, p117n6.c cVar) throws java.lang.Exception {
        p005a5.H1 h9;
        p005a5.M1 m8;
        p005a5.M1 m9;
        com.kiptv.core.model.Playlist playlist2;
        java.util.Iterator it;
        com.kiptv.core.model.Playlist playlist3 = playlist;
        if (cVar instanceof p005a5.H1) {
            h9 = (p005a5.H1) cVar;
            int i3 = h9.f13462l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h9.f13462l = i3 - Integer.MIN_VALUE;
            } else {
                h9 = new p005a5.H1(this, cVar);
            }
        } else {
            h9 = new p005a5.H1(this, cVar);
        }
        java.lang.Object obj = h9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = h9.f13462l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13651a).from("playlists");
                io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder.getPropertyConversionMethod(), postgrestRequestBuilder.getParams(), false, 4, null).eq("id", playlist3.f20033a);
                io.github.jan.supabase.postgrest.request.DeleteRequest deleteRequest = new io.github.jan.supabase.postgrest.request.DeleteRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), postgrestRequestBuilder.getHeaders().build());
                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                java.lang.String table = postgrestQueryBuilderFrom.getTable();
                h9.f13459h = this;
                h9.f13460i = playlist3;
                h9.f13462l = 1;
                if (restRequestExecutor.execute(postgrest, table, deleteRequest, h9) != aVar) {
                    m8 = this;
                }
                return aVar;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) h9.f13460i;
                    playlist2 = (com.kiptv.core.model.Playlist) h9.f13459h;
                    try {
                        com.google.common.util.concurrent.P.u0(obj);
                        if (!it.hasNext()) {
                            return p070h6.A.f22523a;
                        }
                        if (it.next() != null) {
                            throw new java.lang.ClassCastException();
                        }
                        java.lang.String str = playlist2.f20033a;
                        h9.f13459h = playlist2;
                        h9.f13460i = it;
                        h9.f13462l = 3;
                        throw null;
                    } catch (java.lang.Throwable unused) {
                        throw null;
                    }
                }
                playlist3 = (com.kiptv.core.model.Playlist) h9.f13460i;
                m9 = (p005a5.M1) h9.f13459h;
                com.google.common.util.concurrent.P.u0(obj);
                m8 = m9;
                playlist2 = playlist3;
                it = m8.f13656f.iterator();
                if (!it.hasNext()) {
                    return p070h6.A.f22523a;
                }
                if (it.next() != null) {
                    throw new java.lang.ClassCastException();
                }
                java.lang.String str2 = playlist2.f20033a;
                h9.f13459h = playlist2;
                h9.f13460i = it;
                h9.f13462l = 3;
                throw null;
            }
            playlist3 = (com.kiptv.core.model.Playlist) h9.f13460i;
            m8 = (p005a5.M1) h9.f13459h;
            com.google.common.util.concurrent.P.u0(obj);
            V7.n0 n0Var = m8.f13657h;
            java.lang.Iterable iterable = (java.lang.Iterable) n0Var.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : iterable) {
                if (!kotlin.jvm.internal.m.a(((com.kiptv.core.model.Playlist) obj2).f20033a, playlist3.f20033a)) {
                    arrayList.add(obj2);
                }
            }
            n0Var.getClass();
            n0Var.i(null, arrayList);
            if (playlist3.f20040i) {
                com.kiptv.core.model.Playlist playlist4 = (com.kiptv.core.model.Playlist) p078i6.o.j1((java.util.List) m8.f13657h.getValue());
                m8.j.h(playlist4);
                if (playlist4 != null) {
                    h9.f13459h = m8;
                    h9.f13460i = playlist3;
                    h9.f13462l = 2;
                    if (m8.i(playlist4, h9) != aVar) {
                        m9 = m8;
                        m8 = m9;
                    }
                    return aVar;
                }
            }
            playlist2 = playlist3;
            it = m8.f13656f.iterator();
            if (!it.hasNext()) {
                return p070h6.A.f22523a;
            }
            if (it.next() != null) {
                throw new java.lang.ClassCastException();
            }
            java.lang.String str3 = playlist2.f20033a;
            h9.f13459h = playlist2;
            h9.f13460i = it;
            h9.f13462l = 3;
            throw null;
        } catch (java.lang.Exception e6) {
            Y6.f.u(e6, "deletePlaylist failed: ", "PlaylistRepository");
            throw e6;
        }
    }

    public final void c(java.lang.String str) throws com.kiptv.core.model.C1942f0 {
        java.lang.Object next;
        java.util.Iterator it = ((java.lang.Iterable) this.f13657h.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m.a(((com.kiptv.core.model.Playlist) next).f20033a, str));
        com.kiptv.core.model.Playlist playlist = (com.kiptv.core.model.Playlist) next;
        if (playlist != null && f(playlist, this.f13655e.f())) {
            com.kiptv.core.model.EnumC1940e0[] enumC1940e0Arr = com.kiptv.core.model.EnumC1940e0.f20749h;
            throw new com.kiptv.core.model.C1942f0("PlaylistLimitReached");
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee A[Catch: Exception -> 0x0034, f0 -> 0x0037, TryCatch #7 {f0 -> 0x0037, Exception -> 0x0034, blocks: (B:15:0x002f, B:70:0x00db, B:71:0x00dd, B:72:0x00e8, B:74:0x00ee, B:78:0x00fb, B:80:0x00ff, B:81:0x0106), top: B:105:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff A[Catch: Exception -> 0x0034, f0 -> 0x0037, TryCatch #7 {f0 -> 0x0037, Exception -> 0x0034, blocks: (B:15:0x002f, B:70:0x00db, B:71:0x00dd, B:72:0x00e8, B:74:0x00ee, B:78:0x00fb, B:80:0x00ff, B:81:0x0106), top: B:105:0x002f }] */
    public final java.lang.Object d(p117n6.c cVar) throws java.lang.Exception {
        p005a5.I1 i3;
        java.lang.String id;
        p005a5.M1 m8;
        p005a5.M1 m9;
        p005a5.M1 m10;
        java.lang.String message;
        p005a5.M1 m11;
        java.util.List list;
        java.util.Iterator it;
        java.lang.Object next;
        com.kiptv.core.model.Playlist playlist;
        if (cVar instanceof p005a5.I1) {
            i3 = (p005a5.I1) cVar;
            int i9 = i3.f13502l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                i3.f13502l = i9 - Integer.MIN_VALUE;
            } else {
                i3 = new p005a5.I1(this, cVar);
            }
        } else {
            i3 = new p005a5.I1(this, cVar);
        }
        java.lang.Object objH = i3.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = i3.f13502l;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            p005a5.C1296i c1296i = this.f13652b;
            io.github.jan.supabase.auth.user.UserInfo userInfoE = c1296i.e();
            if (userInfoE == null || (id = userInfoE.getId()) == null) {
                com.kiptv.core.model.EnumC1940e0[] enumC1940e0Arr = com.kiptv.core.model.EnumC1940e0.f20749h;
                throw new com.kiptv.core.model.C1942f0("NotAuthenticated");
            }
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            V7.n0 n0Var = this.f13660l;
            n0Var.getClass();
            n0Var.i(null, bool);
            this.f13661m.h(null);
            try {
                i3.f13499h = this;
                i3.f13500i = id;
                i3.f13502l = 1;
                if (c1296i.c(i3) != aVar) {
                    m9 = this;
                    i3.f13499h = m9;
                    i3.f13500i = id;
                    i3.f13502l = 2;
                    objH = m9.h(id, i3);
                    if (objH != aVar) {
                        m10 = m9;
                        list = (java.util.List) objH;
                        m8 = m10;
                    }
                }
                return aVar;
            } catch (com.kiptv.core.model.C1942f0 e6) {
                e = e6;
                m8 = this;
                V7.n0 n0Var2 = m8.f13660l;
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                n0Var2.getClass();
                n0Var2.i(null, bool2);
                throw e;
            } catch (java.lang.Exception e9) {
                e = e9;
                m8 = this;
                Y6.f.u(e, "fetchPlaylists failed: ", "PlaylistRepository");
                V7.n0 n0Var3 = m8.f13660l;
                java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                n0Var3.getClass();
                n0Var3.i(null, bool3);
                V7.n0 n0Var4 = m8.f13661m;
                n0Var4.getClass();
                n0Var4.i(null, "errors.loadError");
                throw e;
            }
        }
        if (i10 == 1) {
            id = i3.f13500i;
            m9 = i3.f13499h;
            try {
                com.google.common.util.concurrent.P.u0(objH);
                try {
                    i3.f13499h = m9;
                    i3.f13500i = id;
                    i3.f13502l = 2;
                    objH = m9.h(id, i3);
                    if (objH != aVar) {
                        m10 = m9;
                        list = (java.util.List) objH;
                        m8 = m10;
                    }
                } catch (java.lang.Exception e10) {
                    e = e10;
                    message = e.getMessage();
                    if (message != null || !O7.q.B0(message, "JWT expired", true)) {
                        throw e;
                    }
                    p005a5.C1296i c1296i2 = m9.f13652b;
                    i3.f13499h = m9;
                    i3.f13500i = id;
                    i3.f13502l = 3;
                    if (c1296i2.d(i3) != aVar) {
                        m11 = m9;
                        i3.f13499h = m11;
                        i3.f13500i = null;
                        i3.f13502l = 4;
                        objH = m11.h(id, i3);
                        if (objH != aVar) {
                            m8 = m11;
                            list = (java.util.List) objH;
                            m8.f13657h.h(list);
                            V7.n0 n0Var5 = m8.j;
                            it = list.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!((com.kiptv.core.model.Playlist) next).f20040i);
                            playlist = (com.kiptv.core.model.Playlist) next;
                            if (playlist == null) {
                                playlist = (com.kiptv.core.model.Playlist) p078i6.o.j1(list);
                            }
                            n0Var5.h(playlist);
                            V7.n0 n0Var6 = m8.f13660l;
                            java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
                            n0Var6.getClass();
                            n0Var6.i(null, bool4);
                            return list;
                        }
                    }
                }
                return aVar;
            } catch (com.kiptv.core.model.C1942f0 e11) {
                e = e11;
                m8 = m9;
                V7.n0 n0Var7 = m8.f13660l;
                java.lang.Boolean bool5 = java.lang.Boolean.FALSE;
                n0Var7.getClass();
                n0Var7.i(null, bool5);
                throw e;
            } catch (java.lang.Exception e12) {
                e = e12;
                m8 = m9;
                Y6.f.u(e, "fetchPlaylists failed: ", "PlaylistRepository");
                V7.n0 n0Var8 = m8.f13660l;
                java.lang.Boolean bool6 = java.lang.Boolean.FALSE;
                n0Var8.getClass();
                n0Var8.i(null, bool6);
                V7.n0 n0Var9 = m8.f13661m;
                n0Var9.getClass();
                n0Var9.i(null, "errors.loadError");
                throw e;
            }
        }
        if (i10 == 2) {
            id = i3.f13500i;
            m10 = i3.f13499h;
            try {
                com.google.common.util.concurrent.P.u0(objH);
                list = (java.util.List) objH;
                m8 = m10;
            } catch (java.lang.Exception e13) {
                e = e13;
                m9 = m10;
                message = e.getMessage();
                if (message != null) {
                }
                throw e;
            }
        } else {
            if (i10 == 3) {
                id = i3.f13500i;
                m11 = i3.f13499h;
                try {
                    com.google.common.util.concurrent.P.u0(objH);
                    i3.f13499h = m11;
                    i3.f13500i = null;
                    i3.f13502l = 4;
                    objH = m11.h(id, i3);
                    if (objH != aVar) {
                        m8 = m11;
                        list = (java.util.List) objH;
                    }
                    return aVar;
                } catch (com.kiptv.core.model.C1942f0 e14) {
                    e = e14;
                    m8 = m11;
                    V7.n0 n0Var10 = m8.f13660l;
                    java.lang.Boolean bool7 = java.lang.Boolean.FALSE;
                    n0Var10.getClass();
                    n0Var10.i(null, bool7);
                    throw e;
                } catch (java.lang.Exception e15) {
                    e = e15;
                    m8 = m11;
                    Y6.f.u(e, "fetchPlaylists failed: ", "PlaylistRepository");
                    V7.n0 n0Var11 = m8.f13660l;
                    java.lang.Boolean bool8 = java.lang.Boolean.FALSE;
                    n0Var11.getClass();
                    n0Var11.i(null, bool8);
                    V7.n0 n0Var12 = m8.f13661m;
                    n0Var12.getClass();
                    n0Var12.i(null, "errors.loadError");
                    throw e;
                }
            }
            if (i10 != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m8 = i3.f13499h;
            try {
                com.google.common.util.concurrent.P.u0(objH);
                list = (java.util.List) objH;
            } catch (com.kiptv.core.model.C1942f0 e16) {
                e = e16;
                V7.n0 n0Var13 = m8.f13660l;
                java.lang.Boolean bool9 = java.lang.Boolean.FALSE;
                n0Var13.getClass();
                n0Var13.i(null, bool9);
                throw e;
            } catch (java.lang.Exception e17) {
                e = e17;
                Y6.f.u(e, "fetchPlaylists failed: ", "PlaylistRepository");
                V7.n0 n0Var14 = m8.f13660l;
                java.lang.Boolean bool10 = java.lang.Boolean.FALSE;
                n0Var14.getClass();
                n0Var14.i(null, bool10);
                V7.n0 n0Var15 = m8.f13661m;
                n0Var15.getClass();
                n0Var15.i(null, "errors.loadError");
                throw e;
            }
        }
        m8.f13657h.h(list);
        V7.n0 n0Var16 = m8.j;
        it = list.iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.kiptv.core.model.Playlist) next).f20040i);
        playlist = (com.kiptv.core.model.Playlist) next;
        if (playlist == null) {
            playlist = (com.kiptv.core.model.Playlist) p078i6.o.j1(list);
        }
        n0Var16.h(playlist);
        V7.n0 n0Var17 = m8.f13660l;
        java.lang.Boolean bool11 = java.lang.Boolean.FALSE;
        n0Var17.getClass();
        n0Var17.i(null, bool11);
        return list;
    }

    public final V7.W e() {
        return this.f13659k;
    }

    public final boolean f(com.kiptv.core.model.Playlist playlist, int i3) {
        java.lang.Object next;
        java.lang.String str;
        kotlin.jvm.internal.m.e(playlist, "playlist");
        java.util.List list = (java.util.List) this.f13657h.getValue();
        com.kiptv.core.model.Playlist playlist2 = (com.kiptv.core.model.Playlist) this.j.getValue();
        if (playlist2 == null || (str = playlist2.f20033a) == null) {
            java.util.Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((com.kiptv.core.model.Playlist) next).f20040i);
            com.kiptv.core.model.Playlist playlist3 = (com.kiptv.core.model.Playlist) next;
            if (playlist3 != null) {
                str = playlist3.f20033a;
            } else {
                com.kiptv.core.model.Playlist playlist4 = (com.kiptv.core.model.Playlist) p078i6.o.j1(list);
                str = playlist4 != null ? playlist4.f20033a : null;
            }
        }
        int size = list.size();
        boolean zBooleanValue = ((java.lang.Boolean) ((V7.n0) this.f13655e.f14995u.f10419h).getValue()).booleanValue();
        java.lang.String playlistId = playlist.f20033a;
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        return (zBooleanValue || size <= i3 || playlistId.equals(str)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object h(java.lang.String str, p117n6.c cVar) {
        p005a5.J1 j9;
        if (cVar instanceof p005a5.J1) {
            j9 = (p005a5.J1) cVar;
            int i3 = j9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j9.j = i3 - Integer.MIN_VALUE;
            } else {
                j9 = new p005a5.J1(this, cVar);
            }
        } else {
            j9 = new p005a5.J1(this, cVar);
        }
        java.lang.Object objExecute = j9.f13533h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = j9.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objExecute);
            io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13651a).from("playlists");
            java.lang.String strM299getALLU9NzzuM = io.github.jan.supabase.postgrest.query.Columns.INSTANCE.m299getALLU9NzzuM();
            io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder selectRequestBuilder = new io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
            new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(selectRequestBuilder.getPropertyConversionMethod(), selectRequestBuilder.getParams(), false, 4, null).eq(io.sentry.TraceContext.JsonKeys.USER_ID, str);
            io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder.order$default(selectRequestBuilder, "created_at", io.github.jan.supabase.postgrest.query.Order.DESCENDING, false, null, 12, null);
            selectRequestBuilder.getParams().put("select", com.google.common.util.concurrent.P.i0(strM299getALLU9NzzuM));
            io.github.jan.supabase.postgrest.request.SelectRequest selectRequest = new io.github.jan.supabase.postgrest.request.SelectRequest(selectRequestBuilder.getHead(), selectRequestBuilder.getCount(), io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(selectRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), selectRequestBuilder.getHeaders().build());
            io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
            io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
            java.lang.String table = postgrestQueryBuilderFrom.getTable();
            j9.j = 1;
            objExecute = restRequestExecutor.execute(postgrest, table, selectRequest, j9);
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
        return (java.util.List) serializer.decode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.Playlist.class))), data);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01de A[Catch: Exception -> 0x0037, LOOP:0: B:37:0x01d8->B:39:0x01de, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:20:0x0046, B:36:0x01c1, B:37:0x01d8, B:39:0x01de, B:40:0x01f4, B:41:0x0209, B:43:0x020f, B:47:0x0222, B:23:0x004f, B:33:0x0103, B:29:0x006a), top: B:58:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x020f A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0033, B:20:0x0046, B:36:0x01c1, B:37:0x01d8, B:39:0x01de, B:40:0x01f4, B:41:0x0209, B:43:0x020f, B:47:0x0222, B:23:0x004f, B:33:0x0103, B:29:0x006a), top: B:58:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x023d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0241 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object i(com.kiptv.core.model.Playlist playlist, p117n6.c cVar) throws java.lang.Exception {
        p005a5.K1 k1;
        java.lang.String id;
        p005a5.M1 m8;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.lang.Object next;
        java.lang.Object objJ;
        com.kiptv.core.model.Playlist playlist2 = playlist;
        if (cVar instanceof p005a5.K1) {
            k1 = (p005a5.K1) cVar;
            int i3 = k1.f13574l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k1.f13574l = i3 - Integer.MIN_VALUE;
            } else {
                k1 = new p005a5.K1(this, cVar);
            }
        } else {
            k1 = new p005a5.K1(this, cVar);
        }
        java.lang.Object obj = k1.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = k1.f13574l;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                c(playlist2.f20033a);
                io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f13652b.e();
                if (userInfoE == null || (id = userInfoE.getId()) == null) {
                    com.kiptv.core.model.EnumC1940e0[] enumC1940e0Arr = com.kiptv.core.model.EnumC1940e0.f20749h;
                    throw new com.kiptv.core.model.C1942f0("NotAuthenticated");
                }
                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13651a).from("playlists");
                com.kiptv.core.model.PlaylistDeactivate playlistDeactivate = new com.kiptv.core.model.PlaylistDeactivate();
                io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder.getPropertyConversionMethod(), postgrestRequestBuilder.getParams(), false, 4, null).eq(io.sentry.TraceContext.JsonKeys.USER_ID, id);
                io.github.jan.supabase.postgrest.query.Returning returning = postgrestRequestBuilder.getReturning();
                io.github.jan.supabase.postgrest.query.Count count = postgrestRequestBuilder.getCount();
                java.util.Map mapMapToFirstValue = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams());
                io.github.jan.supabase.SupabaseSerializer serializer = postgrestQueryBuilderFrom.getPostgrest().getSerializer();
                p162s8.c cVar2 = p162s8.d.f27387d;
                java.lang.String strEncode = serializer.encode(kotlin.jvm.internal.B.a(com.kiptv.core.model.PlaylistDeactivate.class), playlistDeactivate);
                cVar2.getClass();
                io.github.jan.supabase.postgrest.request.UpdateRequest updateRequest = new io.github.jan.supabase.postgrest.request.UpdateRequest(returning, count, mapMapToFirstValue, (kotlinx.serialization.json.b) cVar2.b(strEncode, kotlinx.serialization.json.b.Companion.serializer()), postgrestQueryBuilderFrom.getSchema(), postgrestRequestBuilder.getHeaders().build());
                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                java.lang.String table = postgrestQueryBuilderFrom.getTable();
                k1.f13571h = this;
                k1.f13572i = playlist2;
                k1.f13574l = 1;
                if (restRequestExecutor.execute(postgrest, table, updateRequest, k1) != aVar) {
                    m8 = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                playlist2 = k1.f13572i;
                m8 = k1.f13571h;
                com.google.common.util.concurrent.P.u0(obj);
            } else {
                if (i9 != 2) {
                    if (i9 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                    return a2;
                }
                playlist2 = k1.f13572i;
                m8 = k1.f13571h;
                com.google.common.util.concurrent.P.u0(obj);
            }
            V7.n0 n0Var = m8.f13657h;
            java.lang.Iterable<com.kiptv.core.model.Playlist> iterable = (java.lang.Iterable) n0Var.getValue();
            arrayList = new java.util.ArrayList(p078i6.q.I0(iterable, 10));
            for (com.kiptv.core.model.Playlist playlist3 : iterable) {
                arrayList.add(com.kiptv.core.model.Playlist.a(playlist3, kotlin.jvm.internal.m.a(playlist3.f20033a, playlist2.f20033a)));
            }
            n0Var.getClass();
            n0Var.i(null, arrayList);
            V7.n0 n0Var2 = m8.j;
            it = ((java.lang.Iterable) m8.f13657h.getValue()).iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.m.a(((com.kiptv.core.model.Playlist) next).f20033a, playlist2.f20033a));
            n0Var2.h(next);
            p005a5.C1291h4 c1291h4 = m8.f13653c;
            java.lang.String str = playlist2.f20033a;
            k1.f13571h = null;
            k1.f13572i = null;
            k1.f13574l = 3;
            c1291h4.f14564r.h(str);
            objJ = c1291h4.j(str, k1);
            if (objJ != p109m6.a.f25430h) {
                objJ = a2;
            }
            if (objJ != aVar) {
                return aVar;
            }
            return a2;
            io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom2 = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(m8.f13651a).from("playlists");
            com.kiptv.core.model.PlaylistActivate.INSTANCE.getClass();
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
            simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
            java.lang.String str2 = simpleDateFormat.format(new java.util.Date());
            kotlin.jvm.internal.m.d(str2, "format(...)");
            com.kiptv.core.model.PlaylistActivate playlistActivate = new com.kiptv.core.model.PlaylistActivate(str2);
            io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder2 = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom2.getPostgrest().getConfig()).getPropertyConversionMethod());
            new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder2.getPropertyConversionMethod(), postgrestRequestBuilder2.getParams(), false, 4, null).eq("id", playlist2.f20033a);
            io.github.jan.supabase.postgrest.query.Returning returning2 = postgrestRequestBuilder2.getReturning();
            io.github.jan.supabase.postgrest.query.Count count2 = postgrestRequestBuilder2.getCount();
            java.util.Map mapMapToFirstValue2 = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder2.getParams());
            io.github.jan.supabase.SupabaseSerializer serializer2 = postgrestQueryBuilderFrom2.getPostgrest().getSerializer();
            p162s8.c cVar3 = p162s8.d.f27387d;
            java.lang.String strEncode2 = serializer2.encode(kotlin.jvm.internal.B.a(com.kiptv.core.model.PlaylistActivate.class), playlistActivate);
            cVar3.getClass();
            io.github.jan.supabase.postgrest.request.UpdateRequest updateRequest2 = new io.github.jan.supabase.postgrest.request.UpdateRequest(returning2, count2, mapMapToFirstValue2, (kotlinx.serialization.json.b) cVar3.b(strEncode2, kotlinx.serialization.json.b.Companion.serializer()), postgrestQueryBuilderFrom2.getSchema(), postgrestRequestBuilder2.getHeaders().build());
            io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor2 = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
            io.github.jan.supabase.postgrest.Postgrest postgrest2 = postgrestQueryBuilderFrom2.getPostgrest();
            java.lang.String table2 = postgrestQueryBuilderFrom2.getTable();
            k1.f13571h = m8;
            k1.f13572i = playlist2;
            k1.f13574l = 2;
            if (restRequestExecutor2.execute(postgrest2, table2, updateRequest2, k1) != aVar) {
                V7.n0 n0Var3 = m8.f13657h;
                java.lang.Iterable<com.kiptv.core.model.Playlist> iterable2 = (java.lang.Iterable) n0Var3.getValue();
                arrayList = new java.util.ArrayList(p078i6.q.I0(iterable2, 10));
                while (r7.hasNext()) {
                    arrayList.add(com.kiptv.core.model.Playlist.a(playlist3, kotlin.jvm.internal.m.a(playlist3.f20033a, playlist2.f20033a)));
                }
                n0Var3.getClass();
                n0Var3.i(null, arrayList);
                V7.n0 n0Var4 = m8.j;
                it = ((java.lang.Iterable) m8.f13657h.getValue()).iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.m.a(((com.kiptv.core.model.Playlist) next).f20033a, playlist2.f20033a));
                n0Var4.h(next);
                p005a5.C1291h4 c1291h5 = m8.f13653c;
                java.lang.String str3 = playlist2.f20033a;
                k1.f13571h = null;
                k1.f13572i = null;
                k1.f13574l = 3;
                c1291h5.f14564r.h(str3);
                objJ = c1291h5.j(str3, k1);
                if (objJ != p109m6.a.f25430h) {
                    objJ = a2;
                }
                if (objJ != aVar) {
                    return a2;
                }
            }
            return aVar;
        } catch (java.lang.Exception e6) {
            Y6.f.u(e6, "setActivePlaylist failed: ", "PlaylistRepository");
            throw e6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object j(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, p117n6.c cVar) throws java.lang.Exception {
        p005a5.L1 l2;
        java.lang.Object next;
        com.kiptv.core.model.Playlist playlist;
        java.lang.Object objExecute;
        p005a5.M1 m8;
        java.lang.String str8 = str;
        if (cVar instanceof p005a5.L1) {
            l2 = (p005a5.L1) cVar;
            int i3 = l2.f13614m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l2.f13614m = i3 - Integer.MIN_VALUE;
            } else {
                l2 = new p005a5.L1(this, cVar);
            }
        } else {
            l2 = new p005a5.L1(this, cVar);
        }
        java.lang.Object obj = l2.f13612k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = l2.f13614m;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                c(str);
                java.lang.String string = O7.q.r1(str2).toString();
                V7.n0 n0Var = this.f13657h;
                java.lang.Iterable<com.kiptv.core.model.Playlist> iterable = (java.lang.Iterable) n0Var.getValue();
                if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                    for (com.kiptv.core.model.Playlist playlist2 : iterable) {
                        if (!kotlin.jvm.internal.m.a(playlist2.f20033a, str8) && O7.x.r0(playlist2.f20035c, string, true)) {
                            com.kiptv.core.model.EnumC1940e0[] enumC1940e0Arr = com.kiptv.core.model.EnumC1940e0.f20749h;
                            throw new com.kiptv.core.model.C1942f0("DuplicateName");
                        }
                    }
                }
                java.util.Iterator it = ((java.lang.Iterable) n0Var.getValue()).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.m.a(((com.kiptv.core.model.Playlist) next).f20033a, str8));
                playlist = (com.kiptv.core.model.Playlist) next;
                Companion.getClass();
                java.lang.String strA = p005a5.F1.a(str3);
                java.lang.String string2 = str6 != null ? O7.q.r1(str6).toString() : null;
                com.kiptv.core.model.PlaylistUpdate playlistUpdate = new com.kiptv.core.model.PlaylistUpdate(string, strA, str4, str5, (string2 == null || string2.length() == 0) ? null : string2, str7);
                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13651a).from("playlists");
                io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder.m307selectfYsiLaM$default(postgrestRequestBuilder, null, 1, null);
                new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder.getPropertyConversionMethod(), postgrestRequestBuilder.getParams(), false, 4, null).eq("id", str8);
                io.github.jan.supabase.postgrest.query.Returning returning = postgrestRequestBuilder.getReturning();
                io.github.jan.supabase.postgrest.query.Count count = postgrestRequestBuilder.getCount();
                java.util.Map mapMapToFirstValue = io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams());
                io.github.jan.supabase.SupabaseSerializer serializer = postgrestQueryBuilderFrom.getPostgrest().getSerializer();
                p162s8.c cVar2 = p162s8.d.f27387d;
                java.lang.String strEncode = serializer.encode(kotlin.jvm.internal.B.a(com.kiptv.core.model.PlaylistUpdate.class), playlistUpdate);
                cVar2.getClass();
                io.github.jan.supabase.postgrest.request.UpdateRequest updateRequest = new io.github.jan.supabase.postgrest.request.UpdateRequest(returning, count, mapMapToFirstValue, (kotlinx.serialization.json.b) cVar2.b(strEncode, kotlinx.serialization.json.b.Companion.serializer()), postgrestQueryBuilderFrom.getSchema(), postgrestRequestBuilder.getHeaders().build());
                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                java.lang.String table = postgrestQueryBuilderFrom.getTable();
                l2.f13610h = this;
                l2.f13611i = str8;
                l2.j = playlist;
                l2.f13614m = 1;
                objExecute = restRequestExecutor.execute(postgrest, table, updateRequest, l2);
                if (objExecute == aVar) {
                    return aVar;
                }
                m8 = this;
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.kiptv.core.model.Playlist playlist3 = l2.j;
                java.lang.String str9 = l2.f13611i;
                p005a5.M1 m9 = l2.f13610h;
                com.google.common.util.concurrent.P.u0(obj);
                playlist = playlist3;
                str8 = str9;
                m8 = m9;
                objExecute = obj;
            }
            io.github.jan.supabase.postgrest.result.PostgrestResult postgrestResult = (io.github.jan.supabase.postgrest.result.PostgrestResult) objExecute;
            io.github.jan.supabase.SupabaseSerializer serializer2 = postgrestResult.getPostgrest().getSerializer();
            java.lang.String data = postgrestResult.getData();
            E6.y yVar = E6.y.f3222c;
            com.kiptv.core.model.Playlist playlist4 = (com.kiptv.core.model.Playlist) p078i6.o.h1((java.util.List) serializer2.decode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.Playlist.class))), data));
            V7.n0 n0Var2 = m8.f13657h;
            java.lang.Iterable<com.kiptv.core.model.Playlist> iterable2 = (java.lang.Iterable) n0Var2.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(iterable2, 10));
            for (com.kiptv.core.model.Playlist playlist5 : iterable2) {
                if (kotlin.jvm.internal.m.a(playlist5.f20033a, str8)) {
                    playlist5 = playlist4;
                }
                arrayList.add(playlist5);
            }
            n0Var2.getClass();
            n0Var2.i(null, arrayList);
            V7.n0 n0Var3 = m8.j;
            com.kiptv.core.model.Playlist playlist6 = (com.kiptv.core.model.Playlist) n0Var3.getValue();
            if (kotlin.jvm.internal.m.a(playlist6 != null ? playlist6.f20033a : null, str8)) {
                n0Var3.h(playlist4);
            }
            if (playlist != null) {
                boolean z6 = playlist4.f20040i;
                java.lang.String str10 = playlist4.f20036d;
                if (z6) {
                    boolean zA = kotlin.jvm.internal.m.a(playlist.f20036d, str10);
                    java.lang.String str11 = playlist4.f20038f;
                    java.lang.String str12 = playlist4.f20037e;
                    if (zA && kotlin.jvm.internal.m.a(playlist.f20037e, str12) && kotlin.jvm.internal.m.a(playlist.f20038f, str11)) {
                        return playlist4;
                    }
                    m8.f13654d.d(str10, str12, str11);
                }
            }
            return playlist4;
        } catch (com.kiptv.core.model.C1942f0 e6) {
            throw e6;
        } catch (java.lang.Exception e9) {
            Y6.f.u(e9, "updateXtreamPlaylist failed: ", "PlaylistRepository");
            throw e9;
        }
    }
}
