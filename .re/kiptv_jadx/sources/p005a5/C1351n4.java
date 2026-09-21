package p005a5;

/* JADX INFO: renamed from: a5.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1351n4 {
    private static final p005a5.C1311j4 Companion = new p005a5.C1311j4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.client.HttpClient f14813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f14814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1451x5 f14815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f14816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f14817e;

    public C1351n4(io.ktor.client.HttpClient httpClient, p162s8.d json, p005a5.C1451x5 tmdbRepository) {
        kotlin.jvm.internal.m.e(httpClient, "httpClient");
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        this.f14813a = httpClient;
        this.f14814b = json;
        this.f14815c = tmdbRepository;
        this.f14816d = new java.util.concurrent.ConcurrentHashMap();
        this.f14817e = new java.util.concurrent.ConcurrentHashMap();
    }

    public static java.util.List d(java.util.List list) {
        if (list == null) {
            return p078i6.w.f23205h;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment = (com.kiptv.core.repository.SkipIntroRepository$RawSegment) it.next();
            arrayList.add(new com.kiptv.core.model.J(skipIntroRepository$RawSegment.f20921a, skipIntroRepository$RawSegment.f20922b));
        }
        return arrayList;
    }

    public static java.util.List e(com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment) {
        if (skipIntroRepository$RawSegment != null) {
            java.lang.Integer num = skipIntroRepository$RawSegment.f20922b;
            java.lang.Integer num2 = skipIntroRepository$RawSegment.f20921a;
            if (num2 != null || num != null) {
                return com.google.common.util.concurrent.P.i0(new com.kiptv.core.model.J(num2, num));
            }
        }
        return p078i6.w.f23205h;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0182  */
    /* JADX WARN: Code duplicated, block: B:53:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x0184, please report this as an issue */
    public final java.lang.Object a(int i3, int i9, java.lang.String str, p117n6.c cVar) {
        p005a5.C1321k4 c1321k4;
        p005a5.C1351n4 c1351n4;
        java.lang.String str2;
        p005a5.C1351n4 c1351n5;
        p005a5.C1351n4 c1351n6;
        io.ktor.client.statement.HttpResponse httpResponse;
        int value;
        java.lang.Object obj;
        p162s8.d dVar;
        java.lang.Throwable thA;
        java.lang.Object objT;
        if (cVar instanceof p005a5.C1321k4) {
            c1321k4 = (p005a5.C1321k4) cVar;
            int i10 = c1321k4.f14693n;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1321k4.f14693n = i10 - Integer.MIN_VALUE;
            } else {
                c1321k4 = new p005a5.C1321k4(this, cVar);
            }
        } else {
            c1321k4 = new p005a5.C1321k4(this, cVar);
        }
        java.lang.Object objBodyAsText$default = c1321k4.f14691l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1321k4.f14693n;
        java.lang.Object obj2 = null;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(objBodyAsText$default);
            java.lang.String str3 = str + "-" + i3 + "-" + i9;
            p005a5.C1301i4 c1301i4 = (p005a5.C1301i4) this.f14817e.get(str3);
            if (c1301i4 != null) {
                return c1301i4.f14606a;
            }
            try {
                io.ktor.client.HttpClient httpClient = this.f14813a;
                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, "https://api.introdb.app/segments");
                io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "User-Agent", "KIPTV-AndroidTV (+https://kiptv.app)");
                io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "Accept", "application/json");
                io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "imdb_id", str);
                io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "season", new java.lang.Integer(i3));
                io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "episode", new java.lang.Integer(i9));
                httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                c1321k4.f14688h = this;
                c1321k4.f14689i = str3;
                c1321k4.j = this;
                c1321k4.f14693n = 1;
                java.lang.Object objExecute = httpStatement.execute(c1321k4);
                if (objExecute != aVar) {
                    c1351n5 = this;
                    c1351n6 = c1351n5;
                    str2 = str3;
                    objBodyAsText$default = objExecute;
                    httpResponse = (io.ktor.client.statement.HttpResponse) objBodyAsText$default;
                    value = httpResponse.getStatus().getValue();
                    if (200 > value) {
                    }
                    android.util.Log.d("SkipIntroRepository", "IntroDB " + str2 + " → http " + httpResponse.getStatus().getValue());
                    obj = null;
                }
                return aVar;
            } catch (java.lang.Throwable th) {
                th = th;
                c1351n4 = this;
                str2 = str3;
                objT = com.google.common.util.concurrent.P.T(th);
                c1351n6 = c1351n4;
                obj = objT;
                thA = p070h6.n.a(obj);
                if (thA == null) {
                    obj2 = obj;
                } else {
                    android.util.Log.d("SkipIntroRepository", "IntroDB fetch failed for " + str2 + ": " + thA.getMessage());
                }
                com.kiptv.core.model.I i12 = (com.kiptv.core.model.I) obj2;
                c1351n6.f14817e.put(str2, new p005a5.C1301i4(i12));
                return i12;
            }
        }
        if (i11 == 1) {
            p005a5.C1351n4 c1351n7 = c1321k4.j;
            str2 = c1321k4.f14689i;
            p005a5.C1351n4 c1351n8 = c1321k4.f14688h;
            try {
                com.google.common.util.concurrent.P.u0(objBodyAsText$default);
                c1351n6 = c1351n8;
                c1351n5 = c1351n7;
                try {
                    httpResponse = (io.ktor.client.statement.HttpResponse) objBodyAsText$default;
                    value = httpResponse.getStatus().getValue();
                    if (200 > value && value < 300) {
                        dVar = c1351n5.f14814b;
                        c1321k4.f14688h = c1351n6;
                        c1321k4.f14689i = str2;
                        c1321k4.j = c1351n5;
                        c1321k4.f14690k = dVar;
                        c1321k4.f14693n = 2;
                        objBodyAsText$default = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, c1321k4, 1, null);
                        if (objBodyAsText$default != aVar) {
                            c1351n4 = c1351n6;
                            dVar.getClass();
                            com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse skipIntroRepository$IntroDbResponse = (com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse) dVar.b((java.lang.String) objBodyAsText$default, com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse.INSTANCE.serializer());
                            com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment = skipIntroRepository$IntroDbResponse.f20918a;
                            c1351n5.getClass();
                            com.kiptv.core.model.I i13 = new com.kiptv.core.model.I(8, e(skipIntroRepository$RawSegment), e(skipIntroRepository$IntroDbResponse.f20919b), e(skipIntroRepository$IntroDbResponse.f20920c));
                            android.util.Log.d("SkipIntroRepository", "IntroDB " + str2 + " → hit (empty=" + i13.a() + ")");
                            objT = i13;
                            c1351n6 = c1351n4;
                            obj = objT;
                        }
                        return aVar;
                    }
                    android.util.Log.d("SkipIntroRepository", "IntroDB " + str2 + " → http " + httpResponse.getStatus().getValue());
                    obj = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c1351n4 = c1351n6;
                    objT = com.google.common.util.concurrent.P.T(th);
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                c1351n4 = c1351n8;
                objT = com.google.common.util.concurrent.P.T(th);
                c1351n6 = c1351n4;
                obj = objT;
                thA = p070h6.n.a(obj);
                if (thA == null) {
                    obj2 = obj;
                } else {
                    android.util.Log.d("SkipIntroRepository", "IntroDB fetch failed for " + str2 + ": " + thA.getMessage());
                }
                com.kiptv.core.model.I i14 = (com.kiptv.core.model.I) obj2;
                c1351n6.f14817e.put(str2, new p005a5.C1301i4(i14));
                return i14;
            }
        } else {
            if (i11 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = c1321k4.f14690k;
            c1351n5 = c1321k4.j;
            str2 = c1321k4.f14689i;
            c1351n4 = c1321k4.f14688h;
            try {
                com.google.common.util.concurrent.P.u0(objBodyAsText$default);
                dVar.getClass();
                com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse skipIntroRepository$IntroDbResponse2 = (com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse) dVar.b((java.lang.String) objBodyAsText$default, com.kiptv.core.repository.SkipIntroRepository$IntroDbResponse.INSTANCE.serializer());
                com.kiptv.core.repository.SkipIntroRepository$RawSegment skipIntroRepository$RawSegment2 = skipIntroRepository$IntroDbResponse2.f20918a;
                c1351n5.getClass();
                com.kiptv.core.model.I i15 = new com.kiptv.core.model.I(8, e(skipIntroRepository$RawSegment2), e(skipIntroRepository$IntroDbResponse2.f20919b), e(skipIntroRepository$IntroDbResponse2.f20920c));
                android.util.Log.d("SkipIntroRepository", "IntroDB " + str2 + " → hit (empty=" + i15.a() + ")");
                objT = i15;
            } catch (java.lang.Throwable th4) {
                th = th4;
                objT = com.google.common.util.concurrent.P.T(th);
            }
            c1351n6 = c1351n4;
            obj = objT;
        }
        thA = p070h6.n.a(obj);
        if (thA == null) {
            obj2 = obj;
        } else {
            android.util.Log.d("SkipIntroRepository", "IntroDB fetch failed for " + str2 + ": " + thA.getMessage());
        }
        com.kiptv.core.model.I i16 = (com.kiptv.core.model.I) obj2;
        c1351n6.f14817e.put(str2, new p005a5.C1301i4(i16));
        return i16;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x01c9, please report this as an issue */
    public final java.lang.Object b(int i3, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, p117n6.c cVar) {
        p005a5.C1331l4 c1331l4;
        java.lang.Throwable th;
        p005a5.C1351n4 c1351n4;
        java.lang.String str;
        p005a5.C1351n4 c1351n5;
        java.lang.String str2;
        p005a5.C1351n4 c1351n6;
        java.lang.Object obj;
        p162s8.d dVar;
        java.lang.Throwable thA;
        java.lang.Object objT;
        if (cVar instanceof p005a5.C1331l4) {
            c1331l4 = (p005a5.C1331l4) cVar;
            int i9 = c1331l4.f14730n;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1331l4.f14730n = i9 - Integer.MIN_VALUE;
            } else {
                c1331l4 = new p005a5.C1331l4(this, cVar);
            }
        } else {
            c1331l4 = new p005a5.C1331l4(this, cVar);
        }
        java.lang.Object objExecute = c1331l4.f14728l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1331l4.f14730n;
        java.lang.Object obj2 = null;
        try {
            if (i10 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                java.lang.String str3 = i3 + "-" + (num != null ? num.intValue() : -1) + "-" + (num2 != null ? num2.intValue() : -1);
                p005a5.C1301i4 c1301i4 = (p005a5.C1301i4) this.f14816d.get(str3);
                if (c1301i4 != null) {
                    return c1301i4.f14606a;
                }
                try {
                    io.ktor.client.HttpClient httpClient = this.f14813a;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                    io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, "https://api.theintrodb.org/v3/media");
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "User-Agent", "KIPTV-AndroidTV (+https://kiptv.app)");
                    io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "Accept", "application/json");
                    io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "tmdb_id", new java.lang.Integer(i3));
                    if (num != null) {
                        io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "season", new java.lang.Integer(num.intValue()));
                    }
                    if (num2 != null) {
                        io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "episode", new java.lang.Integer(num2.intValue()));
                    }
                    if (num3 != null) {
                        java.lang.Integer num4 = num3.intValue() > 0 ? num3 : null;
                        if (num4 != null) {
                            io.ktor.client.request.UtilsKt.parameter(httpRequestBuilder, "duration_ms", new java.lang.Integer(num4.intValue()));
                        }
                    }
                    httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                    io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                    c1331l4.f14725h = this;
                    c1331l4.f14726i = str3;
                    c1331l4.j = this;
                    c1331l4.f14730n = 1;
                    objExecute = httpStatement.execute(c1331l4);
                    if (objExecute != aVar) {
                        c1351n5 = this;
                        str2 = str3;
                        c1351n6 = c1351n5;
                    }
                    return aVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c1351n4 = this;
                    str = str3;
                    objT = com.google.common.util.concurrent.P.T(th);
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = c1331l4.f14727k;
                    c1351n5 = c1331l4.j;
                    str = c1331l4.f14726i;
                    c1351n4 = c1331l4.f14725h;
                    try {
                        com.google.common.util.concurrent.P.u0(objExecute);
                        dVar.getClass();
                        com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse skipIntroRepository$TheIntroDbResponse = (com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse) dVar.b((java.lang.String) objExecute, com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse.INSTANCE.serializer());
                        java.util.List list = skipIntroRepository$TheIntroDbResponse.f20924a;
                        c1351n5.getClass();
                        com.kiptv.core.model.I i11 = new com.kiptv.core.model.I(d(list), d(skipIntroRepository$TheIntroDbResponse.f20925b), d(skipIntroRepository$TheIntroDbResponse.f20926c), d(skipIntroRepository$TheIntroDbResponse.f20927d));
                        android.util.Log.d("SkipIntroRepository", "TheIntroDB " + str + " → hit (empty=" + i11.a() + ")");
                        objT = i11;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        objT = com.google.common.util.concurrent.P.T(th);
                    }
                    c1351n6 = c1351n4;
                    str2 = str;
                    obj = objT;
                    thA = p070h6.n.a(obj);
                    if (thA == null) {
                        obj2 = obj;
                    } else {
                        android.util.Log.d("SkipIntroRepository", "TheIntroDB fetch failed for " + str2 + ": " + thA.getMessage());
                    }
                    com.kiptv.core.model.I i12 = (com.kiptv.core.model.I) obj2;
                    c1351n6.f14816d.put(str2, new p005a5.C1301i4(i12));
                    return i12;
                }
                p005a5.C1351n4 c1351n7 = c1331l4.j;
                java.lang.String str4 = c1331l4.f14726i;
                c1351n6 = c1331l4.f14725h;
                try {
                    com.google.common.util.concurrent.P.u0(objExecute);
                    c1351n5 = c1351n7;
                    str2 = str4;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    str = str4;
                    c1351n4 = c1351n6;
                    objT = com.google.common.util.concurrent.P.T(th);
                    c1351n6 = c1351n4;
                    str2 = str;
                    obj = objT;
                    thA = p070h6.n.a(obj);
                    if (thA == null) {
                        obj2 = obj;
                    } else {
                        android.util.Log.d("SkipIntroRepository", "TheIntroDB fetch failed for " + str2 + ": " + thA.getMessage());
                    }
                    com.kiptv.core.model.I i13 = (com.kiptv.core.model.I) obj2;
                    c1351n6.f14816d.put(str2, new p005a5.C1301i4(i13));
                    return i13;
                }
            }
            io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) objExecute;
            int value = httpResponse.getStatus().getValue();
            if (200 <= value && value < 300) {
                p162s8.d dVar2 = c1351n5.f14814b;
                c1331l4.f14725h = c1351n6;
                c1331l4.f14726i = str2;
                c1331l4.j = c1351n5;
                c1331l4.f14727k = dVar2;
                c1331l4.f14730n = 2;
                objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default(httpResponse, null, c1331l4, 1, null);
                if (objExecute != aVar) {
                    str = str2;
                    c1351n4 = c1351n6;
                    dVar = dVar2;
                    dVar.getClass();
                    com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse skipIntroRepository$TheIntroDbResponse2 = (com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse) dVar.b((java.lang.String) objExecute, com.kiptv.core.repository.SkipIntroRepository$TheIntroDbResponse.INSTANCE.serializer());
                    java.util.List list2 = skipIntroRepository$TheIntroDbResponse2.f20924a;
                    c1351n5.getClass();
                    com.kiptv.core.model.I i14 = new com.kiptv.core.model.I(d(list2), d(skipIntroRepository$TheIntroDbResponse2.f20925b), d(skipIntroRepository$TheIntroDbResponse2.f20926c), d(skipIntroRepository$TheIntroDbResponse2.f20927d));
                    android.util.Log.d("SkipIntroRepository", "TheIntroDB " + str + " → hit (empty=" + i14.a() + ")");
                    objT = i14;
                    c1351n6 = c1351n4;
                    str2 = str;
                    obj = objT;
                }
                return aVar;
            }
            android.util.Log.d("SkipIntroRepository", "TheIntroDB " + str2 + " → http " + httpResponse.getStatus().getValue());
            obj = null;
        } catch (java.lang.Throwable th5) {
            str = str2;
            th = th5;
            c1351n4 = c1351n6;
            objT = com.google.common.util.concurrent.P.T(th);
        }
        thA = p070h6.n.a(obj);
        if (thA == null) {
            obj2 = obj;
        } else {
            android.util.Log.d("SkipIntroRepository", "TheIntroDB fetch failed for " + str2 + ": " + thA.getMessage());
        }
        com.kiptv.core.model.I i15 = (com.kiptv.core.model.I) obj2;
        c1351n6.f14816d.put(str2, new p005a5.C1301i4(i15));
        return i15;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0226  */
    /* JADX WARN: Code duplicated, block: B:105:0x0230  */
    /* JADX WARN: Code duplicated, block: B:106:0x0235  */
    /* JADX WARN: Code duplicated, block: B:109:0x023e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0243  */
    /* JADX WARN: Code duplicated, block: B:113:0x024e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0253  */
    /* JADX WARN: Code duplicated, block: B:117:0x025c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0261  */
    /* JADX WARN: Code duplicated, block: B:121:0x026c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0272  */
    /* JADX WARN: Code duplicated, block: B:125:0x027b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0281  */
    /* JADX WARN: Code duplicated, block: B:129:0x028c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0293  */
    /* JADX WARN: Code duplicated, block: B:133:0x029d  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:137:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:145:0x02be  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02db  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:168:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0305  */
    /* JADX WARN: Code duplicated, block: B:170:0x0308  */
    /* JADX WARN: Code duplicated, block: B:172:0x030c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x031c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x0140  */
    /* JADX WARN: Code duplicated, block: B:49:0x014e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0197  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x0203  */
    /* JADX WARN: Code duplicated, block: B:95:0x020d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0217  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0140 -> B:47:0x014a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.List r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.Integer r25, p117n6.c r26) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a5.C1351n4.c(java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Integer, n6.c):java.lang.Object");
    }
}
