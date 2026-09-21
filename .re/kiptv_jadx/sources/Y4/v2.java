package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class v2 {
    public static final Y4.W1 Companion = new Y4.W1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.client.HttpClient f12119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f12120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p006a6.b f12121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p034d5.c f12122d = new p034d5.c(5, 1000);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Y4.X1 f12123e;

    public v2(io.ktor.client.HttpClient httpClient, p162s8.d dVar, p006a6.b bVar) {
        this.f12119a = httpClient;
        this.f12120b = dVar;
        this.f12121c = bVar;
    }

    public static java.lang.Long r(io.ktor.client.statement.HttpResponse httpResponse) {
        java.lang.Long lA0;
        java.lang.String str = httpResponse.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getRetryAfter());
        if (str == null || (lA0 = O7.x.A0(O7.q.r1(str).toString())) == null) {
            return null;
        }
        return java.lang.Long.valueOf(O7.r.t(lA0.longValue(), 1L, 10L) * 1000);
    }

    public final void a(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        java.lang.String str;
        com.kiptv.core.model.PlaylistSettings playlistSettingsA = ((p005a5.C1291h4) this.f12121c.get()).a();
        java.lang.String str2 = null;
        if (playlistSettingsA != null && (str = playlistSettingsA.f20065m) != null && !O7.q.N0(str)) {
            str2 = str;
        }
        if (str2 != null) {
            io.ktor.client.request.UtilsKt.header(httpRequestBuilder, io.ktor.http.HttpHeaders.INSTANCE.getUserAgent(), str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(p117n6.c cVar) {
        Y4.Y1 y9;
        Y4.v2 v2Var;
        java.lang.Double dL0;
        if (cVar instanceof Y4.Y1) {
            y9 = (Y4.Y1) cVar;
            int i3 = y9.f11787k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y9.f11787k = i3 - Integer.MIN_VALUE;
            } else {
                y9 = new Y4.Y1(this, cVar);
            }
        } else {
            y9 = new Y4.Y1(this, cVar);
        }
        java.lang.Object objG = y9.f11786i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = y9.f11787k;
        java.lang.String lowerCase = null;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            java.lang.String strC = c(null);
            y9.f11785h = this;
            y9.f11787k = 1;
            objG = g(strC, y9);
            if (objG == aVar) {
                return aVar;
            }
            v2Var = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v2Var = y9.f11785h;
            com.google.common.util.concurrent.P.u0(objG);
        }
        com.kiptv.core.model.XtreamAuthResponse xtreamAuthResponse = (com.kiptv.core.model.XtreamAuthResponse) v2Var.f12120b.b((java.lang.String) objG, com.kiptv.core.model.XtreamAuthResponse.INSTANCE.serializer());
        java.lang.String str = xtreamAuthResponse.f20647a.f20715d;
        if (str != null) {
            lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        }
        if (kotlin.jvm.internal.m.a(lowerCase, "expired") || kotlin.jvm.internal.m.a(lowerCase, "disabled")) {
            throw Y4.x2.f12150h;
        }
        com.kiptv.core.model.XtreamUserInfo xtreamUserInfo = xtreamAuthResponse.f20647a;
        java.lang.String str2 = xtreamUserInfo.f20716e;
        if (str2 != null && (dL0 = O7.w.l0(str2)) != null && dL0.doubleValue() > 0.0d && new java.util.Date((long) (dL0.doubleValue() * ((double) 1000))).before(new java.util.Date())) {
            throw Y4.x2.f12150h;
        }
        java.lang.Integer num = xtreamUserInfo.f20714c;
        if (num == null || num.intValue() != 1) {
            throw Y4.z2.f12175h;
        }
        return xtreamAuthResponse;
    }

    public final java.lang.String c(java.lang.String str) throws Y4.B2 {
        Y4.X1 x9 = this.f12123e;
        if (x9 == null) {
            throw Y4.B2.f11545h;
        }
        java.lang.String str2 = x9.f11774a + "/player_api.php?username=" + x9.f11775b + "&password=" + x9.f11776c;
        return str != null ? p121o0.p.p(str2, "&action=", str) : str2;
    }

    public final void d(java.lang.String baseUrl, java.lang.String username, java.lang.String password) {
        kotlin.jvm.internal.m.e(baseUrl, "baseUrl");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(password, "password");
        this.f12123e = new Y4.X1(O7.q.t1(baseUrl, '/'), username, password);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[Catch: Exception -> 0x0039, E2 -> 0x003c, TryCatch #3 {E2 -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:62:0x0126, B:64:0x0129, B:65:0x0130, B:23:0x0047, B:49:0x00f0, B:50:0x00f2, B:54:0x0102, B:58:0x0112, B:75:0x0143, B:76:0x0148, B:77:0x0149, B:78:0x014e, B:79:0x014f, B:80:0x0151, B:81:0x0152, B:82:0x0154, B:83:0x0155, B:84:0x0157, B:26:0x0050, B:46:0x00c8, B:29:0x0059, B:39:0x00a2, B:41:0x00ae, B:43:0x00b7, B:36:0x0079), top: B:93:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7 A[Catch: Exception -> 0x0039, E2 -> 0x003c, TryCatch #3 {E2 -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:62:0x0126, B:64:0x0129, B:65:0x0130, B:23:0x0047, B:49:0x00f0, B:50:0x00f2, B:54:0x0102, B:58:0x0112, B:75:0x0143, B:76:0x0148, B:77:0x0149, B:78:0x014e, B:79:0x014f, B:80:0x0151, B:81:0x0152, B:82:0x0154, B:83:0x0155, B:84:0x0157, B:26:0x0050, B:46:0x00c8, B:29:0x0059, B:39:0x00a2, B:41:0x00ae, B:43:0x00b7, B:36:0x0079), top: B:93:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[Catch: Exception -> 0x0039, E2 -> 0x003c, PHI: r3 r13
  0x00c8: PHI (r3v4 Y4.v2) = (r3v3 Y4.v2), (r3v10 Y4.v2) binds: [B:44:0x00c5, B:26:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x00c8: PHI (r13v8 java.lang.String) = (r13v7 java.lang.String), (r13v21 java.lang.String) binds: [B:44:0x00c5, B:26:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {E2 -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:62:0x0126, B:64:0x0129, B:65:0x0130, B:23:0x0047, B:49:0x00f0, B:50:0x00f2, B:54:0x0102, B:58:0x0112, B:75:0x0143, B:76:0x0148, B:77:0x0149, B:78:0x014e, B:79:0x014f, B:80:0x0151, B:81:0x0152, B:82:0x0154, B:83:0x0155, B:84:0x0157, B:26:0x0050, B:46:0x00c8, B:29:0x0059, B:39:0x00a2, B:41:0x00ae, B:43:0x00b7, B:36:0x0079), top: B:93:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0 A[Catch: Exception -> 0x0039, E2 -> 0x003c, PHI: r14
  0x00f0: PHI (r14v22 java.lang.Object) = (r14v11 java.lang.Object), (r14v1 java.lang.Object) binds: [B:47:0x00ed, B:23:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {E2 -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:62:0x0126, B:64:0x0129, B:65:0x0130, B:23:0x0047, B:49:0x00f0, B:50:0x00f2, B:54:0x0102, B:58:0x0112, B:75:0x0143, B:76:0x0148, B:77:0x0149, B:78:0x014e, B:79:0x014f, B:80:0x0151, B:81:0x0152, B:82:0x0154, B:83:0x0155, B:84:0x0157, B:26:0x0050, B:46:0x00c8, B:29:0x0059, B:39:0x00a2, B:41:0x00ae, B:43:0x00b7, B:36:0x0079), top: B:93:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2 A[Catch: Exception -> 0x0039, E2 -> 0x003c, PHI: r14
  0x00f2: PHI (r14v12 io.ktor.client.statement.HttpResponse) = 
  (r14v8 io.ktor.client.statement.HttpResponse)
  (r14v8 io.ktor.client.statement.HttpResponse)
  (r14v23 io.ktor.client.statement.HttpResponse)
 binds: [B:40:0x00ac, B:42:0x00b5, B:49:0x00f0] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {E2 -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:62:0x0126, B:64:0x0129, B:65:0x0130, B:23:0x0047, B:49:0x00f0, B:50:0x00f2, B:54:0x0102, B:58:0x0112, B:75:0x0143, B:76:0x0148, B:77:0x0149, B:78:0x014e, B:79:0x014f, B:80:0x0151, B:81:0x0152, B:82:0x0154, B:83:0x0155, B:84:0x0157, B:26:0x0050, B:46:0x00c8, B:29:0x0059, B:39:0x00a2, B:41:0x00ae, B:43:0x00b7, B:36:0x0079), top: B:93:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x013b  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x014f A[Catch: Exception -> 0x0039, E2 -> 0x003c, TryCatch #3 {E2 -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:62:0x0126, B:64:0x0129, B:65:0x0130, B:23:0x0047, B:49:0x00f0, B:50:0x00f2, B:54:0x0102, B:58:0x0112, B:75:0x0143, B:76:0x0148, B:77:0x0149, B:78:0x014e, B:79:0x014f, B:80:0x0151, B:81:0x0152, B:82:0x0154, B:83:0x0155, B:84:0x0157, B:26:0x0050, B:46:0x00c8, B:29:0x0059, B:39:0x00a2, B:41:0x00ae, B:43:0x00b7, B:36:0x0079), top: B:93:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:81:0x0152 A[Catch: Exception -> 0x0039, E2 -> 0x003c, TryCatch #3 {E2 -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:62:0x0126, B:64:0x0129, B:65:0x0130, B:23:0x0047, B:49:0x00f0, B:50:0x00f2, B:54:0x0102, B:58:0x0112, B:75:0x0143, B:76:0x0148, B:77:0x0149, B:78:0x014e, B:79:0x014f, B:80:0x0151, B:81:0x0152, B:82:0x0154, B:83:0x0155, B:84:0x0157, B:26:0x0050, B:46:0x00c8, B:29:0x0059, B:39:0x00a2, B:41:0x00ae, B:43:0x00b7, B:36:0x0079), top: B:93:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0155 A[Catch: Exception -> 0x0039, E2 -> 0x003c, TryCatch #3 {E2 -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:62:0x0126, B:64:0x0129, B:65:0x0130, B:23:0x0047, B:49:0x00f0, B:50:0x00f2, B:54:0x0102, B:58:0x0112, B:75:0x0143, B:76:0x0148, B:77:0x0149, B:78:0x014e, B:79:0x014f, B:80:0x0151, B:81:0x0152, B:82:0x0154, B:83:0x0155, B:84:0x0157, B:26:0x0050, B:46:0x00c8, B:29:0x0059, B:39:0x00a2, B:41:0x00ae, B:43:0x00b7, B:36:0x0079), top: B:93:0x0028 }] */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
    
        if (r14 == r2) goto L60;
     */
    /* JADX WARN: Type inference failed for: r14v26, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.io.Serializable e(java.lang.String str, p117n6.c cVar) throws Y4.E2 {
        Y4.Z1 z6;
        Y4.v2 v2Var;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Long lR;
        long jLongValue;
        int value;
        E6.v vVarA;
        if (cVar instanceof Y4.Z1) {
            z6 = (Y4.Z1) cVar;
            int i3 = z6.f11802l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z6.f11802l = i3 - Integer.MIN_VALUE;
            } else {
                z6 = new Y4.Z1(this, cVar);
            }
        } else {
            z6 = new Y4.Z1(this, cVar);
        }
        java.lang.Object objExecute = z6.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = z6.f11802l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                z6.f11799h = this;
                z6.f11800i = str;
                z6.f11802l = 1;
                if (this.f12122d.a(z6) != aVar) {
                    v2Var = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                str = z6.f11800i;
                v2Var = z6.f11799h;
                com.google.common.util.concurrent.P.u0(objExecute);
            } else {
                if (i9 == 2) {
                    str = z6.f11800i;
                    v2Var = z6.f11799h;
                    com.google.common.util.concurrent.P.u0(objExecute);
                    httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                    if (httpResponse.getStatus().getValue() == 429) {
                        value = httpResponse.getStatus().getValue();
                        if (200 <= value) {
                        }
                        if (value != 401) {
                            throw Y4.z2.f12175h;
                        }
                        if (value != 403) {
                            throw Y4.w2.f12137h;
                        }
                        if (value != 429) {
                            throw Y4.C2.f11557h;
                        }
                        if (500 <= value) {
                        }
                        throw new Y4.y2(value);
                    }
                    v2Var.getClass();
                    lR = r(httpResponse);
                    if (lR != null) {
                        value = httpResponse.getStatus().getValue();
                        if (200 <= value) {
                        }
                        if (value != 401) {
                            throw Y4.z2.f12175h;
                        }
                        if (value != 403) {
                            throw Y4.w2.f12137h;
                        }
                        if (value != 429) {
                            throw Y4.C2.f11557h;
                        }
                        if (500 <= value) {
                        }
                        throw new Y4.y2(value);
                    }
                    jLongValue = lR.longValue();
                    z6.f11799h = v2Var;
                    z6.f11800i = str;
                    z6.f11802l = 3;
                    if (S7.C.n(jLongValue, z6) == aVar) {
                        io.ktor.client.HttpClient httpClient = v2Var.f12119a;
                        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
                        v2Var.a(httpRequestBuilder);
                        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                        z6.f11799h = null;
                        z6.f11800i = null;
                        z6.f11802l = 4;
                        objExecute = httpStatement.execute(z6);
                        if (objExecute != aVar) {
                            httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                            value = httpResponse.getStatus().getValue();
                            if (200 <= value) {
                            }
                            if (value != 401) {
                                throw Y4.z2.f12175h;
                            }
                            if (value != 403) {
                                throw Y4.w2.f12137h;
                            }
                            if (value != 429) {
                                throw Y4.C2.f11557h;
                            }
                            if (500 <= value) {
                            }
                            throw new Y4.y2(value);
                        }
                    }
                    return aVar;
                }
                if (i9 == 3) {
                    str = z6.f11800i;
                    v2Var = z6.f11799h;
                    com.google.common.util.concurrent.P.u0(objExecute);
                    io.ktor.client.HttpClient httpClient2 = v2Var.f12119a;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder2, str);
                    v2Var.a(httpRequestBuilder2);
                    httpRequestBuilder2.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                    io.ktor.client.statement.HttpStatement httpStatement2 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder2, httpClient2);
                    z6.f11799h = null;
                    z6.f11800i = null;
                    z6.f11802l = 4;
                    objExecute = httpStatement2.execute(z6);
                    if (objExecute != aVar) {
                        httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                        value = httpResponse.getStatus().getValue();
                        if (200 <= value) {
                        }
                        if (value != 401) {
                            throw Y4.z2.f12175h;
                        }
                        if (value != 403) {
                            throw Y4.w2.f12137h;
                        }
                        if (value != 429) {
                            throw Y4.C2.f11557h;
                        }
                        if (500 <= value) {
                        }
                        throw new Y4.y2(value);
                    }
                    return aVar;
                }
                if (i9 == 4) {
                    com.google.common.util.concurrent.P.u0(objExecute);
                    httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                    value = httpResponse.getStatus().getValue();
                    if (200 <= value || value >= 300) {
                        if (value != 401) {
                            throw Y4.z2.f12175h;
                        }
                        if (value != 403) {
                            throw Y4.w2.f12137h;
                        }
                        if (value != 429) {
                            throw Y4.C2.f11557h;
                        }
                        if (500 <= value || value >= 600) {
                            throw new Y4.y2(value);
                        }
                        throw new Y4.D2(value);
                    }
                    io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                    E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(byte[].class);
                    try {
                        vVarA = kotlin.jvm.internal.B.a(byte[].class);
                    } catch (java.lang.Throwable unused) {
                        vVarA = null;
                    }
                    io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA);
                    z6.f11799h = null;
                    z6.f11800i = null;
                    z6.f11802l = 5;
                    objExecute = call.bodyNullable(typeInfo, z6);
                } else {
                    if (i9 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(objExecute);
                }
            }
            if (objExecute != null) {
                return (byte[]) objExecute;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
            io.ktor.client.HttpClient httpClient3 = v2Var.f12119a;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder3 = new io.ktor.client.request.HttpRequestBuilder();
            io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder3, str);
            v2Var.a(httpRequestBuilder3);
            httpRequestBuilder3.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            io.ktor.client.statement.HttpStatement httpStatement3 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder3, httpClient3);
            z6.f11799h = v2Var;
            z6.f11800i = str;
            z6.f11802l = 2;
            objExecute = httpStatement3.execute(z6);
            if (objExecute != aVar) {
                httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                if (httpResponse.getStatus().getValue() == 429) {
                    value = httpResponse.getStatus().getValue();
                    if (200 <= value) {
                    }
                    if (value != 401) {
                        throw Y4.z2.f12175h;
                    }
                    if (value != 403) {
                        throw Y4.w2.f12137h;
                    }
                    if (value != 429) {
                        throw Y4.C2.f11557h;
                    }
                    if (500 <= value) {
                    }
                    throw new Y4.y2(value);
                }
                v2Var.getClass();
                lR = r(httpResponse);
                if (lR != null) {
                    value = httpResponse.getStatus().getValue();
                    if (200 <= value) {
                    }
                    if (value != 401) {
                        throw Y4.z2.f12175h;
                    }
                    if (value != 403) {
                        throw Y4.w2.f12137h;
                    }
                    if (value != 429) {
                        throw Y4.C2.f11557h;
                    }
                    if (500 <= value) {
                    }
                    throw new Y4.y2(value);
                }
                jLongValue = lR.longValue();
                z6.f11799h = v2Var;
                z6.f11800i = str;
                z6.f11802l = 3;
                if (S7.C.n(jLongValue, z6) == aVar) {
                    io.ktor.client.HttpClient httpClient4 = v2Var.f12119a;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder4 = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder4, str);
                    v2Var.a(httpRequestBuilder4);
                    httpRequestBuilder4.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                    io.ktor.client.statement.HttpStatement httpStatement4 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder4, httpClient4);
                    z6.f11799h = null;
                    z6.f11800i = null;
                    z6.f11802l = 4;
                    objExecute = httpStatement4.execute(z6);
                    if (objExecute != aVar) {
                        httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                        value = httpResponse.getStatus().getValue();
                        if (200 <= value) {
                        }
                        if (value != 401) {
                            throw Y4.z2.f12175h;
                        }
                        if (value != 403) {
                            throw Y4.w2.f12137h;
                        }
                        if (value != 429) {
                            throw Y4.C2.f11557h;
                        }
                        if (500 <= value) {
                        }
                        throw new Y4.y2(value);
                    }
                }
            }
            return aVar;
        } catch (Y4.E2 e6) {
            throw e6;
        } catch (java.lang.Exception e9) {
            java.lang.String message = e9.getMessage();
            if (message == null) {
                message = "Unknown network error";
            }
            throw new Y4.A2(message);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(java.lang.String str, java.lang.String str2, p117n6.c cVar) throws java.lang.Throwable {
        Y4.C1054a2 c1054a2;
        Y4.v2 v2Var;
        if (cVar instanceof Y4.C1054a2) {
            c1054a2 = (Y4.C1054a2) cVar;
            int i3 = c1054a2.f11810k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1054a2.f11810k = i3 - Integer.MIN_VALUE;
            } else {
                c1054a2 = new Y4.C1054a2(this, cVar);
            }
        } else {
            c1054a2 = new Y4.C1054a2(this, cVar);
        }
        java.lang.Object objG = c1054a2.f11809i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1054a2.f11810k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            java.lang.String strP = p121o0.p.p(c(str), "&", str2);
            c1054a2.f11808h = this;
            c1054a2.f11810k = 1;
            objG = g(strP, c1054a2);
            if (objG != aVar) {
                v2Var = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objG);
            return objG;
        }
        v2Var = c1054a2.f11808h;
        com.google.common.util.concurrent.P.u0(objG);
        Z7.e eVar = S7.M.f9549a;
        Y4.C1058b2 c1058b2 = new Y4.C1058b2(v2Var, (java.lang.String) objG, null);
        c1054a2.f11808h = null;
        c1054a2.f11810k = 2;
        java.lang.Object objK = S7.C.K(eVar, c1058b2, c1054a2);
        return objK == aVar ? aVar : objK;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ab A[Catch: Exception -> 0x0037, E2 -> 0x003a, TryCatch #2 {E2 -> 0x003a, Exception -> 0x0037, blocks: (B:15:0x0032, B:57:0x010c, B:23:0x0045, B:49:0x00ed, B:50:0x00ef, B:54:0x00ff, B:68:0x0121, B:69:0x0126, B:70:0x0127, B:71:0x012c, B:72:0x012d, B:73:0x012f, B:74:0x0130, B:75:0x0132, B:76:0x0133, B:77:0x0135, B:26:0x004e, B:46:0x00c5, B:29:0x0057, B:39:0x009f, B:41:0x00ab, B:43:0x00b4, B:36:0x0077), top: B:84:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4 A[Catch: Exception -> 0x0037, E2 -> 0x003a, TryCatch #2 {E2 -> 0x003a, Exception -> 0x0037, blocks: (B:15:0x0032, B:57:0x010c, B:23:0x0045, B:49:0x00ed, B:50:0x00ef, B:54:0x00ff, B:68:0x0121, B:69:0x0126, B:70:0x0127, B:71:0x012c, B:72:0x012d, B:73:0x012f, B:74:0x0130, B:75:0x0132, B:76:0x0133, B:77:0x0135, B:26:0x004e, B:46:0x00c5, B:29:0x0057, B:39:0x009f, B:41:0x00ab, B:43:0x00b4, B:36:0x0077), top: B:84:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: Exception -> 0x0037, E2 -> 0x003a, PHI: r2 r13
  0x00c5: PHI (r2v4 Y4.v2) = (r2v3 Y4.v2), (r2v9 Y4.v2) binds: [B:44:0x00c2, B:26:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r13v8 java.lang.String) = (r13v7 java.lang.String), (r13v19 java.lang.String) binds: [B:44:0x00c2, B:26:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {E2 -> 0x003a, Exception -> 0x0037, blocks: (B:15:0x0032, B:57:0x010c, B:23:0x0045, B:49:0x00ed, B:50:0x00ef, B:54:0x00ff, B:68:0x0121, B:69:0x0126, B:70:0x0127, B:71:0x012c, B:72:0x012d, B:73:0x012f, B:74:0x0130, B:75:0x0132, B:76:0x0133, B:77:0x0135, B:26:0x004e, B:46:0x00c5, B:29:0x0057, B:39:0x009f, B:41:0x00ab, B:43:0x00b4, B:36:0x0077), top: B:84:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[Catch: Exception -> 0x0037, E2 -> 0x003a, PHI: r14
  0x00ed: PHI (r14v20 java.lang.Object) = (r14v11 java.lang.Object), (r14v1 java.lang.Object) binds: [B:47:0x00ea, B:23:0x0045] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {E2 -> 0x003a, Exception -> 0x0037, blocks: (B:15:0x0032, B:57:0x010c, B:23:0x0045, B:49:0x00ed, B:50:0x00ef, B:54:0x00ff, B:68:0x0121, B:69:0x0126, B:70:0x0127, B:71:0x012c, B:72:0x012d, B:73:0x012f, B:74:0x0130, B:75:0x0132, B:76:0x0133, B:77:0x0135, B:26:0x004e, B:46:0x00c5, B:29:0x0057, B:39:0x009f, B:41:0x00ab, B:43:0x00b4, B:36:0x0077), top: B:84:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef A[Catch: Exception -> 0x0037, E2 -> 0x003a, PHI: r14
  0x00ef: PHI (r14v12 io.ktor.client.statement.HttpResponse) = 
  (r14v8 io.ktor.client.statement.HttpResponse)
  (r14v8 io.ktor.client.statement.HttpResponse)
  (r14v21 io.ktor.client.statement.HttpResponse)
 binds: [B:40:0x00a9, B:42:0x00b2, B:49:0x00ed] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {E2 -> 0x003a, Exception -> 0x0037, blocks: (B:15:0x0032, B:57:0x010c, B:23:0x0045, B:49:0x00ed, B:50:0x00ef, B:54:0x00ff, B:68:0x0121, B:69:0x0126, B:70:0x0127, B:71:0x012c, B:72:0x012d, B:73:0x012f, B:74:0x0130, B:75:0x0132, B:76:0x0133, B:77:0x0135, B:26:0x004e, B:46:0x00c5, B:29:0x0057, B:39:0x009f, B:41:0x00ab, B:43:0x00b4, B:36:0x0077), top: B:84:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d A[Catch: Exception -> 0x0037, E2 -> 0x003a, TryCatch #2 {E2 -> 0x003a, Exception -> 0x0037, blocks: (B:15:0x0032, B:57:0x010c, B:23:0x0045, B:49:0x00ed, B:50:0x00ef, B:54:0x00ff, B:68:0x0121, B:69:0x0126, B:70:0x0127, B:71:0x012c, B:72:0x012d, B:73:0x012f, B:74:0x0130, B:75:0x0132, B:76:0x0133, B:77:0x0135, B:26:0x004e, B:46:0x00c5, B:29:0x0057, B:39:0x009f, B:41:0x00ab, B:43:0x00b4, B:36:0x0077), top: B:84:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0130 A[Catch: Exception -> 0x0037, E2 -> 0x003a, TryCatch #2 {E2 -> 0x003a, Exception -> 0x0037, blocks: (B:15:0x0032, B:57:0x010c, B:23:0x0045, B:49:0x00ed, B:50:0x00ef, B:54:0x00ff, B:68:0x0121, B:69:0x0126, B:70:0x0127, B:71:0x012c, B:72:0x012d, B:73:0x012f, B:74:0x0130, B:75:0x0132, B:76:0x0133, B:77:0x0135, B:26:0x004e, B:46:0x00c5, B:29:0x0057, B:39:0x009f, B:41:0x00ab, B:43:0x00b4, B:36:0x0077), top: B:84:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0133 A[Catch: Exception -> 0x0037, E2 -> 0x003a, TryCatch #2 {E2 -> 0x003a, Exception -> 0x0037, blocks: (B:15:0x0032, B:57:0x010c, B:23:0x0045, B:49:0x00ed, B:50:0x00ef, B:54:0x00ff, B:68:0x0121, B:69:0x0126, B:70:0x0127, B:71:0x012c, B:72:0x012d, B:73:0x012f, B:74:0x0130, B:75:0x0132, B:76:0x0133, B:77:0x0135, B:26:0x004e, B:46:0x00c5, B:29:0x0057, B:39:0x009f, B:41:0x00ab, B:43:0x00b4, B:36:0x0077), top: B:84:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0109, code lost:
    
        if (r14 == r1) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(java.lang.String str, p117n6.c cVar) throws Y4.E2 {
        Y4.C1062c2 c1062c2;
        Y4.v2 v2Var;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Long lR;
        long jLongValue;
        int value;
        if (cVar instanceof Y4.C1062c2) {
            c1062c2 = (Y4.C1062c2) cVar;
            int i3 = c1062c2.f11841l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1062c2.f11841l = i3 - Integer.MIN_VALUE;
            } else {
                c1062c2 = new Y4.C1062c2(this, cVar);
            }
        } else {
            c1062c2 = new Y4.C1062c2(this, cVar);
        }
        java.lang.Object objExecute = c1062c2.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1062c2.f11841l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                c1062c2.f11838h = this;
                c1062c2.f11839i = str;
                c1062c2.f11841l = 1;
                if (this.f12122d.a(c1062c2) != aVar) {
                    v2Var = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                str = c1062c2.f11839i;
                v2Var = c1062c2.f11838h;
                com.google.common.util.concurrent.P.u0(objExecute);
            } else {
                if (i9 == 2) {
                    str = c1062c2.f11839i;
                    v2Var = c1062c2.f11838h;
                    com.google.common.util.concurrent.P.u0(objExecute);
                    httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                    if (httpResponse.getStatus().getValue() == 429) {
                        value = httpResponse.getStatus().getValue();
                        if (200 <= value) {
                        }
                        if (value != 401) {
                            throw Y4.z2.f12175h;
                        }
                        if (value != 403) {
                            throw Y4.w2.f12137h;
                        }
                        if (value != 429) {
                            throw Y4.C2.f11557h;
                        }
                        if (500 <= value) {
                        }
                        throw new Y4.y2(value);
                    }
                    v2Var.getClass();
                    lR = r(httpResponse);
                    if (lR != null) {
                        value = httpResponse.getStatus().getValue();
                        if (200 <= value) {
                        }
                        if (value != 401) {
                            throw Y4.z2.f12175h;
                        }
                        if (value != 403) {
                            throw Y4.w2.f12137h;
                        }
                        if (value != 429) {
                            throw Y4.C2.f11557h;
                        }
                        if (500 <= value) {
                        }
                        throw new Y4.y2(value);
                    }
                    jLongValue = lR.longValue();
                    c1062c2.f11838h = v2Var;
                    c1062c2.f11839i = str;
                    c1062c2.f11841l = 3;
                    if (S7.C.n(jLongValue, c1062c2) == aVar) {
                        io.ktor.client.HttpClient httpClient = v2Var.f12119a;
                        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
                        v2Var.a(httpRequestBuilder);
                        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                        io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                        c1062c2.f11838h = null;
                        c1062c2.f11839i = null;
                        c1062c2.f11841l = 4;
                        objExecute = httpStatement.execute(c1062c2);
                        if (objExecute != aVar) {
                            httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                            value = httpResponse.getStatus().getValue();
                            if (200 <= value) {
                            }
                            if (value != 401) {
                                throw Y4.z2.f12175h;
                            }
                            if (value != 403) {
                                throw Y4.w2.f12137h;
                            }
                            if (value != 429) {
                                throw Y4.C2.f11557h;
                            }
                            if (500 <= value) {
                            }
                            throw new Y4.y2(value);
                        }
                    }
                    return aVar;
                }
                if (i9 == 3) {
                    str = c1062c2.f11839i;
                    v2Var = c1062c2.f11838h;
                    com.google.common.util.concurrent.P.u0(objExecute);
                    io.ktor.client.HttpClient httpClient2 = v2Var.f12119a;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder2, str);
                    v2Var.a(httpRequestBuilder2);
                    httpRequestBuilder2.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                    io.ktor.client.statement.HttpStatement httpStatement2 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder2, httpClient2);
                    c1062c2.f11838h = null;
                    c1062c2.f11839i = null;
                    c1062c2.f11841l = 4;
                    objExecute = httpStatement2.execute(c1062c2);
                    if (objExecute != aVar) {
                        httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                        value = httpResponse.getStatus().getValue();
                        if (200 <= value) {
                        }
                        if (value != 401) {
                            throw Y4.z2.f12175h;
                        }
                        if (value != 403) {
                            throw Y4.w2.f12137h;
                        }
                        if (value != 429) {
                            throw Y4.C2.f11557h;
                        }
                        if (500 <= value) {
                        }
                        throw new Y4.y2(value);
                    }
                    return aVar;
                }
                if (i9 == 4) {
                    com.google.common.util.concurrent.P.u0(objExecute);
                    httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                    value = httpResponse.getStatus().getValue();
                    if (200 <= value || value >= 300) {
                        if (value != 401) {
                            throw Y4.z2.f12175h;
                        }
                        if (value != 403) {
                            throw Y4.w2.f12137h;
                        }
                        if (value != 429) {
                            throw Y4.C2.f11557h;
                        }
                        if (500 <= value || value >= 600) {
                            throw new Y4.y2(value);
                        }
                        throw new Y4.D2(value);
                    }
                    c1062c2.f11838h = null;
                    c1062c2.f11839i = null;
                    c1062c2.f11841l = 5;
                    objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, c1062c2, 1, null);
                } else {
                    if (i9 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(objExecute);
                }
            }
            return (java.lang.String) objExecute;
            io.ktor.client.HttpClient httpClient3 = v2Var.f12119a;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder3 = new io.ktor.client.request.HttpRequestBuilder();
            io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder3, str);
            v2Var.a(httpRequestBuilder3);
            httpRequestBuilder3.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
            io.ktor.client.statement.HttpStatement httpStatement3 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder3, httpClient3);
            c1062c2.f11838h = v2Var;
            c1062c2.f11839i = str;
            c1062c2.f11841l = 2;
            objExecute = httpStatement3.execute(c1062c2);
            if (objExecute != aVar) {
                httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                if (httpResponse.getStatus().getValue() == 429) {
                    value = httpResponse.getStatus().getValue();
                    if (200 <= value) {
                    }
                    if (value != 401) {
                        throw Y4.z2.f12175h;
                    }
                    if (value != 403) {
                        throw Y4.w2.f12137h;
                    }
                    if (value != 429) {
                        throw Y4.C2.f11557h;
                    }
                    if (500 <= value) {
                    }
                    throw new Y4.y2(value);
                }
                v2Var.getClass();
                lR = r(httpResponse);
                if (lR != null) {
                    value = httpResponse.getStatus().getValue();
                    if (200 <= value) {
                    }
                    if (value != 401) {
                        throw Y4.z2.f12175h;
                    }
                    if (value != 403) {
                        throw Y4.w2.f12137h;
                    }
                    if (value != 429) {
                        throw Y4.C2.f11557h;
                    }
                    if (500 <= value) {
                    }
                    throw new Y4.y2(value);
                }
                jLongValue = lR.longValue();
                c1062c2.f11838h = v2Var;
                c1062c2.f11839i = str;
                c1062c2.f11841l = 3;
                if (S7.C.n(jLongValue, c1062c2) == aVar) {
                    io.ktor.client.HttpClient httpClient4 = v2Var.f12119a;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder4 = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder4, str);
                    v2Var.a(httpRequestBuilder4);
                    httpRequestBuilder4.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                    io.ktor.client.statement.HttpStatement httpStatement4 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder4, httpClient4);
                    c1062c2.f11838h = null;
                    c1062c2.f11839i = null;
                    c1062c2.f11841l = 4;
                    objExecute = httpStatement4.execute(c1062c2);
                    if (objExecute != aVar) {
                        httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
                        value = httpResponse.getStatus().getValue();
                        if (200 <= value) {
                        }
                        if (value != 401) {
                            throw Y4.z2.f12175h;
                        }
                        if (value != 403) {
                            throw Y4.w2.f12137h;
                        }
                        if (value != 429) {
                            throw Y4.C2.f11557h;
                        }
                        if (500 <= value) {
                        }
                        throw new Y4.y2(value);
                    }
                }
            }
            return aVar;
        } catch (Y4.E2 e6) {
            throw e6;
        } catch (java.lang.Exception e9) {
            java.lang.String message = e9.getMessage();
            if (message == null) {
                message = "Unknown network error";
            }
            throw new Y4.A2(message);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c6 -> B:31:0x00c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(int r10, int r11, java.lang.String r12, p117n6.c r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.v2.h(int, int, java.lang.String, n6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(p117n6.c cVar) {
        Y4.C1070e2 c1070e2;
        Y4.v2 v2Var;
        if (cVar instanceof Y4.C1070e2) {
            c1070e2 = (Y4.C1070e2) cVar;
            int i3 = c1070e2.f11870k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1070e2.f11870k = i3 - Integer.MIN_VALUE;
            } else {
                c1070e2 = new Y4.C1070e2(this, cVar);
            }
        } else {
            c1070e2 = new Y4.C1070e2(this, cVar);
        }
        java.lang.Object objG = c1070e2.f11869i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1070e2.f11870k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            java.lang.String strC = c("get_live_categories");
            c1070e2.f11868h = this;
            c1070e2.f11870k = 1;
            objG = g(strC, c1070e2);
            if (objG != aVar) {
                v2Var = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objG);
            return objG;
        }
        v2Var = c1070e2.f11868h;
        com.google.common.util.concurrent.P.u0(objG);
        Z7.e eVar = S7.M.f9549a;
        Y4.C1074f2 c1074f2 = new Y4.C1074f2(v2Var, (java.lang.String) objG, null);
        c1070e2.f11868h = null;
        c1070e2.f11870k = 2;
        java.lang.Object objK = S7.C.K(eVar, c1074f2, c1070e2);
        return objK == aVar ? aVar : objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(p117n6.c cVar) {
        Y4.h2 h2Var;
        Y4.v2 v2Var;
        if (cVar instanceof Y4.h2) {
            h2Var = (Y4.h2) cVar;
            int i3 = h2Var.f11929k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h2Var.f11929k = i3 - Integer.MIN_VALUE;
            } else {
                h2Var = new Y4.h2(this, cVar);
            }
        } else {
            h2Var = new Y4.h2(this, cVar);
        }
        java.lang.Object objE = h2Var.f11928i;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = h2Var.f11929k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objE);
            java.lang.String strC = c("get_live_streams");
            h2Var.f11927h = this;
            h2Var.f11929k = 1;
            objE = e(strC, h2Var);
            if (objE != obj) {
                v2Var = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objE);
            return objE;
        }
        v2Var = h2Var.f11927h;
        com.google.common.util.concurrent.P.u0(objE);
        Z7.e eVar = S7.M.f9549a;
        Y4.g2 g2Var = new Y4.g2(v2Var, (byte[]) objE, null);
        h2Var.f11927h = null;
        h2Var.f11929k = 2;
        java.lang.Object objK = S7.C.K(eVar, g2Var, h2Var);
        return objK == obj ? obj : objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(p117n6.c cVar) {
        Y4.j2 j2Var;
        Y4.v2 v2Var;
        if (cVar instanceof Y4.j2) {
            j2Var = (Y4.j2) cVar;
            int i3 = j2Var.f11953k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j2Var.f11953k = i3 - Integer.MIN_VALUE;
            } else {
                j2Var = new Y4.j2(this, cVar);
            }
        } else {
            j2Var = new Y4.j2(this, cVar);
        }
        java.lang.Object objE = j2Var.f11952i;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = j2Var.f11953k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objE);
            java.lang.String strC = c("get_series");
            j2Var.f11951h = this;
            j2Var.f11953k = 1;
            objE = e(strC, j2Var);
            if (objE != obj) {
                v2Var = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objE);
            return objE;
        }
        v2Var = j2Var.f11951h;
        com.google.common.util.concurrent.P.u0(objE);
        Z7.e eVar = S7.M.f9549a;
        Y4.i2 i2Var = new Y4.i2(v2Var, (byte[]) objE, null);
        j2Var.f11951h = null;
        j2Var.f11953k = 2;
        java.lang.Object objK = S7.C.K(eVar, i2Var, j2Var);
        return objK == obj ? obj : objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(p117n6.c cVar) {
        Y4.k2 k2Var;
        Y4.v2 v2Var;
        if (cVar instanceof Y4.k2) {
            k2Var = (Y4.k2) cVar;
            int i3 = k2Var.f11967k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k2Var.f11967k = i3 - Integer.MIN_VALUE;
            } else {
                k2Var = new Y4.k2(this, cVar);
            }
        } else {
            k2Var = new Y4.k2(this, cVar);
        }
        java.lang.Object objG = k2Var.f11966i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = k2Var.f11967k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            java.lang.String strC = c("get_series_categories");
            k2Var.f11965h = this;
            k2Var.f11967k = 1;
            objG = g(strC, k2Var);
            if (objG != aVar) {
                v2Var = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objG);
            return objG;
        }
        v2Var = k2Var.f11965h;
        com.google.common.util.concurrent.P.u0(objG);
        Z7.e eVar = S7.M.f9549a;
        Y4.l2 l2Var = new Y4.l2(v2Var, (java.lang.String) objG, null);
        k2Var.f11965h = null;
        k2Var.f11967k = 2;
        java.lang.Object objK = S7.C.K(eVar, l2Var, k2Var);
        return objK == aVar ? aVar : objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(int i3, p117n6.c cVar) throws java.lang.Throwable {
        Y4.n2 n2Var;
        Y4.v2 v2Var;
        if (cVar instanceof Y4.n2) {
            n2Var = (Y4.n2) cVar;
            int i9 = n2Var.f12008k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                n2Var.f12008k = i9 - Integer.MIN_VALUE;
            } else {
                n2Var = new Y4.n2(this, cVar);
            }
        } else {
            n2Var = new Y4.n2(this, cVar);
        }
        java.lang.Object objE = n2Var.f12007i;
        java.lang.Object obj = p109m6.a.f25430h;
        int i10 = n2Var.f12008k;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objE);
            java.lang.String str = c("get_series_info") + "&series_id=" + i3;
            n2Var.f12006h = this;
            n2Var.f12008k = 1;
            objE = e(str, n2Var);
            if (objE != obj) {
                v2Var = this;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objE);
            return objE;
        }
        v2Var = n2Var.f12006h;
        com.google.common.util.concurrent.P.u0(objE);
        Z7.e eVar = S7.M.f9549a;
        Y4.m2 m2Var = new Y4.m2(v2Var, (byte[]) objE, null);
        n2Var.f12006h = null;
        n2Var.f12008k = 2;
        java.lang.Object objK = S7.C.K(eVar, m2Var, n2Var);
        return objK == obj ? obj : objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(p117n6.c cVar) {
        Y4.o2 o2Var;
        Y4.v2 v2Var;
        if (cVar instanceof Y4.o2) {
            o2Var = (Y4.o2) cVar;
            int i3 = o2Var.f12024k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o2Var.f12024k = i3 - Integer.MIN_VALUE;
            } else {
                o2Var = new Y4.o2(this, cVar);
            }
        } else {
            o2Var = new Y4.o2(this, cVar);
        }
        java.lang.Object objG = o2Var.f12023i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = o2Var.f12024k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            java.lang.String strC = c("get_vod_categories");
            o2Var.f12022h = this;
            o2Var.f12024k = 1;
            objG = g(strC, o2Var);
            if (objG != aVar) {
                v2Var = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objG);
            return objG;
        }
        v2Var = o2Var.f12022h;
        com.google.common.util.concurrent.P.u0(objG);
        Z7.e eVar = S7.M.f9549a;
        Y4.p2 p2Var = new Y4.p2(v2Var, (java.lang.String) objG, null);
        o2Var.f12022h = null;
        o2Var.f12024k = 2;
        java.lang.Object objK = S7.C.K(eVar, p2Var, o2Var);
        return objK == aVar ? aVar : objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(p117n6.c cVar) {
        Y4.r2 r2Var;
        Y4.v2 v2Var;
        if (cVar instanceof Y4.r2) {
            r2Var = (Y4.r2) cVar;
            int i3 = r2Var.f12068k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r2Var.f12068k = i3 - Integer.MIN_VALUE;
            } else {
                r2Var = new Y4.r2(this, cVar);
            }
        } else {
            r2Var = new Y4.r2(this, cVar);
        }
        java.lang.Object objE = r2Var.f12067i;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = r2Var.f12068k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objE);
            java.lang.String strC = c("get_vod_streams");
            r2Var.f12066h = this;
            r2Var.f12068k = 1;
            objE = e(strC, r2Var);
            if (objE != obj) {
                v2Var = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objE);
            return objE;
        }
        v2Var = r2Var.f12066h;
        com.google.common.util.concurrent.P.u0(objE);
        Z7.e eVar = S7.M.f9549a;
        Y4.q2 q2Var = new Y4.q2(v2Var, (byte[]) objE, null);
        r2Var.f12066h = null;
        r2Var.f12068k = 2;
        java.lang.Object objK = S7.C.K(eVar, q2Var, r2Var);
        return objK == obj ? obj : objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(p117n6.c cVar) {
        Y4.s2 s2Var;
        if (cVar instanceof Y4.s2) {
            s2Var = (Y4.s2) cVar;
            int i3 = s2Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s2Var.j = i3 - Integer.MIN_VALUE;
            } else {
                s2Var = new Y4.s2(this, cVar);
            }
        } else {
            s2Var = new Y4.s2(this, cVar);
        }
        java.lang.Object objExecute = s2Var.f12078h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = s2Var.j;
        boolean z6 = false;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                java.lang.String strC = c(null);
                io.ktor.client.HttpClient httpClient = this.f12119a;
                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, strC);
                a(httpRequestBuilder);
                httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                s2Var.j = 1;
                objExecute = httpStatement.execute(s2Var);
                if (objExecute == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objExecute);
            }
            int value = ((io.ktor.client.statement.HttpResponse) objExecute).getStatus().getValue();
            if (200 <= value && value < 300) {
                z6 = true;
            }
        } catch (java.lang.Exception unused) {
        }
        return java.lang.Boolean.valueOf(z6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r7.execute(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(java.lang.String str, p117n6.c cVar) throws java.lang.Throwable {
        Y4.t2 t2Var;
        boolean zBooleanValue;
        Y4.v2 v2Var;
        if (cVar instanceof Y4.t2) {
            t2Var = (Y4.t2) cVar;
            int i3 = t2Var.f12095l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t2Var.f12095l = i3 - Integer.MIN_VALUE;
            } else {
                t2Var = new Y4.t2(this, cVar);
            }
        } else {
            t2Var = new Y4.t2(this, cVar);
        }
        java.lang.Object objExecute = t2Var.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = t2Var.f12095l;
        boolean z6 = true;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                try {
                    io.ktor.client.HttpClient httpClient = this.f12119a;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, str);
                    a(httpRequestBuilder);
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    t2Var.f12092h = this;
                    t2Var.f12093i = str;
                    t2Var.f12095l = 1;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    v2Var = this;
                    android.util.Log.d("XtreamApiClient", "healthCheckM3U HEAD failed: " + e.getClass().getSimpleName() + ": " + e.getMessage());
                    io.ktor.client.HttpClient httpClient2 = v2Var.f12119a;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder2, str);
                    v2Var.a(httpRequestBuilder2);
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder2, io.ktor.http.HttpHeaders.INSTANCE.getRange(), "bytes=0-0");
                    httpRequestBuilder2.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                    io.ktor.client.statement.HttpStatement httpStatement2 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder2, httpClient2);
                    Y4.u2 u2Var = new Y4.u2(2, null);
                    t2Var.f12092h = null;
                    t2Var.f12093i = null;
                    t2Var.f12095l = 2;
                    objExecute = httpStatement2.execute(u2Var, t2Var);
                }
            } else if (i9 == 1) {
                str = t2Var.f12093i;
                v2Var = t2Var.f12092h;
                try {
                    com.google.common.util.concurrent.P.u0(objExecute);
                } catch (java.lang.Exception e9) {
                    e = e9;
                    android.util.Log.d("XtreamApiClient", "healthCheckM3U HEAD failed: " + e.getClass().getSimpleName() + ": " + e.getMessage());
                    io.ktor.client.HttpClient httpClient3 = v2Var.f12119a;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder3 = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder3, str);
                    v2Var.a(httpRequestBuilder3);
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder3, io.ktor.http.HttpHeaders.INSTANCE.getRange(), "bytes=0-0");
                    httpRequestBuilder3.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                    io.ktor.client.statement.HttpStatement httpStatement3 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder3, httpClient3);
                    Y4.u2 u2Var2 = new Y4.u2(2, null);
                    t2Var.f12092h = null;
                    t2Var.f12093i = null;
                    t2Var.f12095l = 2;
                    objExecute = httpStatement3.execute(u2Var2, t2Var);
                }
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objExecute);
                zBooleanValue = ((java.lang.Boolean) objExecute).booleanValue();
                z6 = zBooleanValue;
            }
        } catch (java.lang.Exception e10) {
            android.util.Log.d("XtreamApiClient", "healthCheckM3U ranged GET failed: " + e10.getClass().getSimpleName() + ": " + e10.getMessage());
            zBooleanValue = false;
        }
        return java.lang.Boolean.valueOf(z6);
    }
}
