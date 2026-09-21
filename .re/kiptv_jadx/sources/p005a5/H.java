package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class H {
    private static final p005a5.C1465z Companion = new p005a5.C1465z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f13453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.github.jan.supabase.SupabaseClient f13454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1296i f13455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.C5 f13456d;

    public H(android.content.Context context, io.github.jan.supabase.SupabaseClient supabaseClient, p005a5.C1296i authRepository, p005a5.C5 pairingRepository) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
        kotlin.jvm.internal.m.e(authRepository, "authRepository");
        kotlin.jvm.internal.m.e(pairingRepository, "pairingRepository");
        this.f13453a = context;
        this.f13454b = supabaseClient;
        this.f13455c = authRepository;
        this.f13456d = pairingRepository;
    }

    public final java.lang.String a() {
        java.lang.Object objT;
        java.lang.String accessToken;
        java.lang.String str;
        try {
            io.github.jan.supabase.auth.user.UserSession userSessionCurrentSessionOrNull = io.github.jan.supabase.auth.AuthKt.getAuth(this.f13454b).currentSessionOrNull();
            if (userSessionCurrentSessionOrNull != null && (accessToken = userSessionCurrentSessionOrNull.getAccessToken()) != null && (str = (java.lang.String) p078i6.o.k1(1, O7.q.c1(accessToken, new char[]{'.'}))) != null) {
                byte[] bArrDecode = android.util.Base64.decode(str, 11);
                kotlin.jvm.internal.m.d(bArrDecode, "decode(...)");
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) p162s8.l.i(p162s8.d.f27387d.e(new java.lang.String(bArrDecode, O7.a.f8024b))).get("session_id");
                objT = bVar != null ? p162s8.l.j(bVar).d() : null;
                return (java.lang.String) (objT instanceof p070h6.m ? null : objT);
            }
            return null;
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(p117n6.c cVar) {
        p005a5.A a2;
        java.lang.Object objT;
        java.lang.String id;
        if (cVar instanceof p005a5.A) {
            a2 = (p005a5.A) cVar;
            int i3 = a2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a2.j = i3 - Integer.MIN_VALUE;
            } else {
                a2 = new p005a5.A(this, cVar);
            }
        } else {
            a2 = new p005a5.A(this, cVar);
        }
        java.lang.Object objExecute = a2.f13090h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = a2.j;
        p078i6.w wVar = p078i6.w.f23205h;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f13455c.e();
                if (userInfoE == null || (id = userInfoE.getId()) == null) {
                    return wVar;
                }
                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13454b).from("user_devices");
                java.lang.String strM299getALLU9NzzuM = io.github.jan.supabase.postgrest.query.Columns.INSTANCE.m299getALLU9NzzuM();
                io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder selectRequestBuilder = new io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(selectRequestBuilder.getPropertyConversionMethod(), selectRequestBuilder.getParams(), false, 4, null).eq(io.sentry.TraceContext.JsonKeys.USER_ID, id);
                selectRequestBuilder.getParams().put("select", com.google.common.util.concurrent.P.i0(strM299getALLU9NzzuM));
                io.github.jan.supabase.postgrest.request.SelectRequest selectRequest = new io.github.jan.supabase.postgrest.request.SelectRequest(selectRequestBuilder.getHead(), selectRequestBuilder.getCount(), io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(selectRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), selectRequestBuilder.getHeaders().build());
                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                java.lang.String table = postgrestQueryBuilderFrom.getTable();
                a2.j = 1;
                objExecute = restRequestExecutor.execute(postgrest, table, selectRequest, a2);
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
            java.util.List list = (java.util.List) serializer.decode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.model.UserDevice.class))), data);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((com.kiptv.core.model.UserDevice) obj).f20576h == null) {
                    arrayList.add(obj);
                }
            }
            objT = p078i6.o.I1(arrayList, new p005a5.B(0));
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        java.lang.Throwable thA = p070h6.n.a(objT);
        if (thA == null) {
            return objT;
        }
        android.util.Log.d("DeviceRegistry", "fetchDevices failed: " + thA);
        return wVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.io.Serializable c(p117n6.c cVar) {
        p005a5.C c9;
        java.io.Serializable serializableT;
        java.lang.String id;
        if (cVar instanceof p005a5.C) {
            c9 = (p005a5.C) cVar;
            int i3 = c9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c9.j = i3 - Integer.MIN_VALUE;
            } else {
                c9 = new p005a5.C(this, cVar);
            }
        } else {
            c9 = new p005a5.C(this, cVar);
        }
        java.lang.Object objExecute = c9.f13219h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c9.j;
        boolean z6 = true;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f13455c.e();
                if (userInfoE == null || (id = userInfoE.getId()) == null) {
                    return java.lang.Boolean.FALSE;
                }
                io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13454b).from("user_devices");
                java.lang.String strM299getALLU9NzzuM = io.github.jan.supabase.postgrest.query.Columns.INSTANCE.m299getALLU9NzzuM();
                io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder selectRequestBuilder = new io.github.jan.supabase.postgrest.query.request.SelectRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(selectRequestBuilder.getPropertyConversionMethod(), selectRequestBuilder.getParams(), false, 4, null);
                postgrestFilterBuilder.eq(io.sentry.TraceContext.JsonKeys.USER_ID, id);
                postgrestFilterBuilder.eq("device_id", this.f13456d.c());
                io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder.limit$default(selectRequestBuilder, 1L, null, 2, null);
                selectRequestBuilder.getParams().put("select", com.google.common.util.concurrent.P.i0(strM299getALLU9NzzuM));
                io.github.jan.supabase.postgrest.request.SelectRequest selectRequest = new io.github.jan.supabase.postgrest.request.SelectRequest(selectRequestBuilder.getHead(), selectRequestBuilder.getCount(), io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(selectRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), selectRequestBuilder.getHeaders().build());
                io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                java.lang.String table = postgrestQueryBuilderFrom.getTable();
                c9.j = 1;
                objExecute = restRequestExecutor.execute(postgrest, table, selectRequest, c9);
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
            com.kiptv.core.repository.DeviceRegistryRepository$RevocationRow deviceRegistryRepository$RevocationRow = (com.kiptv.core.repository.DeviceRegistryRepository$RevocationRow) p078i6.o.j1((java.util.List) serializer.decode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(com.kiptv.core.repository.DeviceRegistryRepository$RevocationRow.class))), data));
            if ((deviceRegistryRepository$RevocationRow != null ? deviceRegistryRepository$RevocationRow.f20888a : null) == null) {
                z6 = false;
            }
            serializableT = java.lang.Boolean.valueOf(z6);
        } catch (java.lang.Throwable th) {
            serializableT = com.google.common.util.concurrent.P.T(th);
        }
        java.lang.Throwable thA = p070h6.n.a(serializableT);
        if (thA == null) {
            return serializableT;
        }
        android.util.Log.d("DeviceRegistry", "isCurrentDeviceRevoked failed: " + thA);
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object d(p117n6.c cVar) {
        p005a5.D d4;
        java.lang.Object objT;
        java.lang.String id;
        if (cVar instanceof p005a5.D) {
            d4 = (p005a5.D) cVar;
            int i3 = d4.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d4.j = i3 - Integer.MIN_VALUE;
            } else {
                d4 = new p005a5.D(this, cVar);
            }
        } else {
            d4 = new p005a5.D(this, cVar);
        }
        java.lang.Object objExecute = d4.f13276h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = d4.j;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f13455c.e();
                if (userInfoE != null && (id = userInfoE.getId()) != null) {
                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13454b).from("user_devices");
                    io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder postgrestRequestBuilder = new io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                    io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestRequestBuilder.getPropertyConversionMethod(), postgrestRequestBuilder.getParams(), false, 4, null);
                    postgrestFilterBuilder.eq(io.sentry.TraceContext.JsonKeys.USER_ID, id);
                    postgrestFilterBuilder.eq("device_id", this.f13456d.c());
                    io.github.jan.supabase.postgrest.request.DeleteRequest deleteRequest = new io.github.jan.supabase.postgrest.request.DeleteRequest(postgrestRequestBuilder.getReturning(), postgrestRequestBuilder.getCount(), io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(postgrestRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), postgrestRequestBuilder.getHeaders().build());
                    io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                    io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                    java.lang.String table = postgrestQueryBuilderFrom.getTable();
                    d4.j = 1;
                    objExecute = restRequestExecutor.execute(postgrest, table, deleteRequest, d4);
                    if (objExecute == aVar) {
                        return aVar;
                    }
                }
                return a2;
            }
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objExecute);
            objT = (io.github.jan.supabase.postgrest.result.PostgrestResult) objExecute;
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        java.lang.Throwable thA = p070h6.n.a(objT);
        if (thA != null) {
            android.util.Log.d("DeviceRegistry", "removeCurrentDevice failed: " + thA);
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r14 == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.io.Serializable e(java.lang.String str, p117n6.c cVar) {
        p005a5.E e6;
        java.io.Serializable serializableT;
        E6.v vVarA;
        if (cVar instanceof p005a5.E) {
            e6 = (p005a5.E) cVar;
            int i3 = e6.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6.j = i3 - Integer.MIN_VALUE;
            } else {
                e6 = new p005a5.E(this, cVar);
            }
        } else {
            e6 = new p005a5.E(this, cVar);
        }
        java.lang.Object objRequest = e6.f13329h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = e6.j;
        try {
            try {
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(objRequest);
                    io.github.jan.supabase.functions.Functions functions = io.github.jan.supabase.functions.FunctionsKt.getFunctions(this.f13454b);
                    com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceRequest deviceRegistryRepository$RevokeDeviceRequest = new com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceRequest(str);
                    io.github.jan.supabase.functions.FunctionRegion defaultRegion = functions.getConfig().getDefaultRegion();
                    io.ktor.http.Headers empty = io.ktor.http.Headers.INSTANCE.getEmpty();
                    io.github.jan.supabase.functions.FunctionRegion defaultRegion2 = functions.getConfig().getDefaultRegion();
                    io.github.jan.supabase.auth.AuthenticatedSupabaseApi api = functions.getApi();
                    p005a5.F f9 = new p005a5.F(defaultRegion2, empty, defaultRegion, functions, deviceRegistryRepository$RevokeDeviceRequest);
                    e6.j = 1;
                    objRequest = api.request("revoke-device-session", f9, e6);
                    if (objRequest == aVar) {
                    }
                    return aVar;
                }
                if (i9 == 1) {
                    com.google.common.util.concurrent.P.u0(objRequest);
                } else {
                    if (i9 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(objRequest);
                }
                if (objRequest == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.kiptv.core.repository.DeviceRegistryRepository.RevokeDeviceResponse");
                }
                serializableT = java.lang.Boolean.valueOf(((com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceResponse) objRequest).f20890a);
                java.lang.Throwable thA = p070h6.n.a(serializableT);
                if (thA == null) {
                    return serializableT;
                }
                android.util.Log.d("DeviceRegistry", "revokeDevice failed: " + thA);
                return java.lang.Boolean.FALSE;
                vVarA = kotlin.jvm.internal.B.a(com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceResponse.class);
            } catch (java.lang.Throwable unused) {
                vVarA = null;
            }
            io.ktor.client.call.HttpClientCall call = ((io.ktor.client.statement.HttpResponse) objRequest).getCall();
            E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(com.kiptv.core.repository.DeviceRegistryRepository$RevokeDeviceResponse.class);
            io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA);
            e6.j = 2;
            objRequest = call.bodyNullable(typeInfo, e6);
        } catch (java.lang.Throwable th) {
            serializableT = com.google.common.util.concurrent.P.T(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object f(p117n6.c cVar) {
        p005a5.G g;
        java.lang.Object objT;
        java.lang.String id;
        java.lang.Object objT2;
        p005a5.C5 c9 = this.f13456d;
        if (cVar instanceof p005a5.G) {
            g = (p005a5.G) cVar;
            int i3 = g.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g.j = i3 - Integer.MIN_VALUE;
            } else {
                g = new p005a5.G(this, cVar);
            }
        } else {
            g = new p005a5.G(this, cVar);
        }
        java.lang.Object objExecute = g.f13407h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = g.j;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f13455c.e();
                if (userInfoE != null && (id = userInfoE.getId()) != null) {
                    io.github.jan.supabase.postgrest.query.PostgrestQueryBuilder postgrestQueryBuilderFrom = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f13454b).from("user_devices");
                    p162s8.v vVar = new p162s8.v();
                    com.google.common.util.concurrent.P.m0(io.sentry.TraceContext.JsonKeys.USER_ID, id, vVar);
                    com.google.common.util.concurrent.P.m0("device_id", c9.c(), vVar);
                    java.lang.String str = android.os.Build.MODEL;
                    java.lang.String str2 = "Android TV";
                    java.lang.String string = O7.q.r1(str == null ? "Android TV" : str).toString();
                    if (string.length() != 0) {
                        str2 = string;
                    }
                    com.google.common.util.concurrent.P.m0("device_name", str2, vVar);
                    com.google.common.util.concurrent.P.m0(io.sentry.protocol.Device.JsonKeys.MODEL, str, vVar);
                    com.google.common.util.concurrent.P.m0("platform", com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM, vVar);
                    android.content.Context context = this.f13453a;
                    try {
                        objT2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    } catch (java.lang.Throwable th) {
                        objT2 = com.google.common.util.concurrent.P.T(th);
                    }
                    if (objT2 instanceof p070h6.m) {
                        objT2 = null;
                    }
                    java.lang.String str3 = (java.lang.String) objT2;
                    if (str3 == null) {
                        str3 = "—";
                    }
                    com.google.common.util.concurrent.P.m0(io.sentry.protocol.App.JsonKeys.APP_VERSION, str3, vVar);
                    com.google.common.util.concurrent.P.m0("os_version", "Android " + android.os.Build.VERSION.RELEASE, vVar);
                    java.lang.String strA = a();
                    if (strA == null || com.google.common.util.concurrent.P.m0("session_id", strA, vVar) == null) {
                        vVar.b("session_id", kotlinx.serialization.json.JsonNull.INSTANCE);
                    }
                    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", java.util.Locale.US);
                    simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
                    java.lang.String str4 = simpleDateFormat.format(new java.util.Date());
                    kotlin.jvm.internal.m.d(str4, "format(...)");
                    com.google.common.util.concurrent.P.m0("last_seen_at", str4, vVar);
                    vVar.b("revoked_at", kotlinx.serialization.json.JsonNull.INSTANCE);
                    java.util.List listI0 = com.google.common.util.concurrent.P.i0(vVar.a());
                    io.github.jan.supabase.postgrest.query.request.UpsertRequestBuilder upsertRequestBuilder = new io.github.jan.supabase.postgrest.query.request.UpsertRequestBuilder(((io.github.jan.supabase.postgrest.Postgrest.Config) postgrestQueryBuilderFrom.getPostgrest().getConfig()).getPropertyConversionMethod());
                    upsertRequestBuilder.setOnConflict("user_id,device_id");
                    io.github.jan.supabase.SupabaseSerializer serializer = postgrestQueryBuilderFrom.getPostgrest().getSerializer();
                    p162s8.c cVar2 = p162s8.d.f27387d;
                    E6.y yVar = E6.y.f3222c;
                    java.lang.String strEncode = serializer.encode(kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class))), listI0);
                    cVar2.getClass();
                    kotlinx.serialization.json.a aVarH = p162s8.l.h((kotlinx.serialization.json.b) cVar2.b(strEncode, kotlinx.serialization.json.b.Companion.serializer()));
                    java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(aVarH, 10));
                    java.util.Iterator it = aVarH.f24557h.iterator();
                    while (it.hasNext()) {
                        arrayList.add(p162s8.l.i((kotlinx.serialization.json.b) it.next()).f24558h.keySet());
                    }
                    java.util.List listC1 = p078i6.o.c1(p078i6.q.J0(arrayList));
                    if (!listC1.isEmpty()) {
                        upsertRequestBuilder.getParams().put("columns", com.google.common.util.concurrent.P.i0(p078i6.o.o1(listC1, ",", null, null, null, 62)));
                    }
                    java.lang.String onConflict = upsertRequestBuilder.getOnConflict();
                    if (onConflict != null) {
                        upsertRequestBuilder.getParams().put("on_conflict", com.google.common.util.concurrent.P.i0(onConflict));
                    }
                    io.github.jan.supabase.postgrest.request.InsertRequest insertRequest = new io.github.jan.supabase.postgrest.request.InsertRequest(true, upsertRequestBuilder.getReturning(), upsertRequestBuilder.getCount(), upsertRequestBuilder.getIgnoreDuplicates(), upsertRequestBuilder.getDefaultToNull(), aVarH, io.github.jan.supabase.postgrest.UtilsKt.mapToFirstValue(upsertRequestBuilder.getParams()), postgrestQueryBuilderFrom.getSchema(), upsertRequestBuilder.getHeaders().build());
                    io.github.jan.supabase.postgrest.executor.RestRequestExecutor restRequestExecutor = io.github.jan.supabase.postgrest.executor.RestRequestExecutor.INSTANCE;
                    io.github.jan.supabase.postgrest.Postgrest postgrest = postgrestQueryBuilderFrom.getPostgrest();
                    java.lang.String table = postgrestQueryBuilderFrom.getTable();
                    g.j = 1;
                    objExecute = restRequestExecutor.execute(postgrest, table, insertRequest, g);
                    if (objExecute == aVar) {
                        return aVar;
                    }
                }
                return a2;
            }
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objExecute);
            objT = (io.github.jan.supabase.postgrest.result.PostgrestResult) objExecute;
        } catch (java.lang.Throwable th2) {
            objT = com.google.common.util.concurrent.P.T(th2);
        }
        java.lang.Throwable thA = p070h6.n.a(objT);
        if (thA != null) {
            android.util.Log.w("DeviceRegistry", "upsertCurrentDevice failed", thA);
        }
        return a2;
    }
}
