package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class C5 {
    public static final p005a5.C1461y5 Companion = new p005a5.C1461y5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f13257c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.github.jan.supabase.SupabaseClient f13258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f13259b;

    static {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
        simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
        f13257c = simpleDateFormat;
    }

    public C5(android.content.Context context, io.github.jan.supabase.SupabaseClient supabaseClient) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
        this.f13258a = supabaseClient;
        this.f13259b = context.getSharedPreferences("kip_tv_pairing", 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object a(java.lang.String str, p117n6.c cVar) {
        p005a5.C1471z5 c1471z5;
        if (cVar instanceof p005a5.C1471z5) {
            c1471z5 = (p005a5.C1471z5) cVar;
            int i3 = c1471z5.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1471z5.j = i3 - Integer.MIN_VALUE;
            } else {
                c1471z5 = new p005a5.C1471z5(this, cVar);
            }
        } else {
            c1471z5 = new p005a5.C1471z5(this, cVar);
        }
        java.lang.Object obj = c1471z5.f15401h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1471z5.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13258a).from("device_pairing_codes");
                io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder.getPropertyConversionMethod(), postgrestRequestBuilder.getParams(), false, 4, null);
                postgrestFilterBuilder.eq("code", str);
                postgrestFilterBuilder.eq("device_id", c());
                io.github.jan.supabase.postgrest.request.DeleteRequest deleteRequest = new io.github.jan.supabase.postgrest.request.DeleteRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), postgrestRequestBuilder.getHeaders().build());
                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                java.lang.String table = postgrestQueryBuilderFrom.getTable();
                c1471z5.j = 1;
                if (restRequestExecutor.execute(postgrest, table, deleteRequest, c1471z5) == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
        } catch (java.lang.Exception e6) {
            Y6.f.u(e6, "cancel failed: ", "TVPairingRepository");
        }
        return p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(p117n6.c cVar) {
        p005a5.A5 a9;
        p005a5.C5 c9;
        java.lang.String str;
        if (cVar instanceof p005a5.A5) {
            a9 = (p005a5.A5) cVar;
            int i3 = a9.f13131l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a9.f13131l = i3 - Integer.MIN_VALUE;
            } else {
                a9 = new p005a5.A5(this, cVar);
            }
        } else {
            a9 = new p005a5.A5(this, cVar);
        }
        java.lang.Object obj = a9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = a9.f13131l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            java.lang.String strO1 = p078i6.o.o1(O7.r.W(0, 6), "", null, null, new U4.h(29), 30);
            java.util.Date date = new java.util.Date(java.util.concurrent.TimeUnit.MINUTES.toMillis(5L) + java.lang.System.currentTimeMillis());
            java.lang.String strC = c();
            java.lang.String str2 = android.os.Build.MODEL;
            if (str2 == null) {
                str2 = "Android TV";
            }
            java.lang.String string = O7.q.r1(str2).toString();
            java.lang.String str3 = string.length() != 0 ? string : "Android TV";
            java.lang.String str4 = f13257c.format(date);
            kotlin.jvm.internal.m.d(str4, "format(...)");
            com.kiptv.core.repository.TVPairingRepository$PairingInsert tVPairingRepository$PairingInsert = new com.kiptv.core.repository.TVPairingRepository$PairingInsert(strO1, strC, str3, str4);
            io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13258a).from("device_pairing_codes");
            java.util.List listI0 = com.google.common.util.concurrent.P.i0(tVPairingRepository$PairingInsert);
            io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder insertRequestBuilder = new io.github.jan.supabase.postgrest.query.request.InsertRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
            io.github.jan.supabase.SupabaseSerializer serializer = postgrestQueryBuilderFrom.getPostgrest().getSerializer();
            p162s8.c cVar2 = p162s8.d.f27387d;
            E6.y yVar = E6.y.f3222c;
            java.lang.String strEncode = serializer.encode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.repository.TVPairingRepository$PairingInsert.class))), listI0);
            cVar2.getClass();
            kotlinx.serialization.json.a aVarH = p162s8.l.h((kotlinx.serialization.json.b) cVar2.b(strEncode, kotlinx.serialization.json.b.Companion.serializer()));
            java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(aVarH, 10));
            java.util.Iterator it = aVarH.f24557h.iterator();
            while (it.hasNext()) {
                arrayList.add(p162s8.l.i((kotlinx.serialization.json.b) it.next()).f24558h.keySet());
            }
            java.util.List listC1 = p078i6.o.c1(p078i6.q.J0(arrayList));
            if (!listC1.isEmpty()) {
                insertRequestBuilder.getParams().put("columns", com.google.common.util.concurrent.P.i0(p078i6.o.o1(listC1, ",", null, null, null, 62)));
            }
            io.github.jan.supabase.postgrest.request.InsertRequest insertRequest = new io.github.jan.supabase.postgrest.request.InsertRequest(false, insertRequestBuilder.getReturning(), insertRequestBuilder.getCount(), false, insertRequestBuilder.getDefaultToNull(), aVarH, io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(insertRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), insertRequestBuilder.getHeaders().build(), 9, null);
            io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
            io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
            java.lang.String table = postgrestQueryBuilderFrom.getTable();
            a9.f13128h = this;
            a9.f13129i = strO1;
            a9.f13131l = 1;
            if (restRequestExecutor.execute(postgrest, table, insertRequest, a9) == aVar) {
                return aVar;
            }
            c9 = this;
            str = strO1;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = a9.f13129i;
            c9 = a9.f13128h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        android.util.Log.d("TVPairingRepository", "Inserted pairing code=" + str + " deviceId=" + O7.q.p1(8, c9.c()));
        return str;
    }

    public final java.lang.String c() {
        android.content.SharedPreferences sharedPreferences = this.f13259b;
        java.lang.String string = sharedPreferences.getString("device_id", null);
        if (string != null) {
            return string;
        }
        java.lang.String string2 = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.m.d(string2, "toString(...)");
        sharedPreferences.edit().putString("device_id", string2).apply();
        return string2;
    }
}
