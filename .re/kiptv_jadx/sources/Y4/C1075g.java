package Y4;

/* JADX INFO: renamed from: Y4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1075g {
    public static final Y4.C1051a Companion = new Y4.C1051a();
    public static final O7.o j = new O7.o("^\\s*[A-Za-z]{2,3}\\s*[:|\\\\-]\\s*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final O7.o f11886k = new O7.o("\\[.*?]");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final O7.o f11887l = new O7.o("\\(.*?\\)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final O7.o f11888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final O7.o f11889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final O7.o f11890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final O7.o f11891p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.client.HttpClient f11892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f11893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p132p5.a f11894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f11895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f11896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11897f;
    public java.util.Map g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.Map f11898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11899i;

    static {
        O7.p[] pVarArr = O7.p.f8061h;
        f11888m = new O7.o("\\b(4k|uhd|2160p|1080p|fhd|720p|hd|sd|hevc|h265|h\\.265)\\b", 0);
        f11889n = new O7.o("\\s*\\+\\d+h?\\s*$");
        f11890o = new O7.o("\\b(backup|bak)\\b", 0);
        f11891p = new O7.o("\\s+");
    }

    public C1075g(io.ktor.client.HttpClient httpClient, p162s8.d dVar, p132p5.a aVar) {
        this.f11892a = httpClient;
        this.f11893b = dVar;
        this.f11894c = aVar;
        p078i6.x xVar = p078i6.x.f23206h;
        this.f11895d = xVar;
        this.f11896e = xVar;
        this.g = xVar;
        this.f11898h = xVar;
    }

    public static final void e(java.util.ArrayList arrayList, java.util.LinkedHashSet linkedHashSet, java.util.List list) {
        if (list == null) {
            list = p078i6.w.f23205h;
        }
        for (java.lang.String str : list) {
            if (arrayList.size() >= 20) {
                return;
            }
            if (linkedHashSet.add(str)) {
                arrayList.add(str);
            }
        }
    }

    public final java.lang.String a(java.lang.String str) {
        this.f11894c.getClass();
        return "https://image.tmdb.org/t/p/w154" + str;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [i6.w] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Map] */
    public final java.util.ArrayList b(java.lang.String channelName, java.lang.String str, java.lang.String str2) {
        double d4;
        java.lang.String strA;
        ?? arrayList;
        kotlin.jvm.internal.m.e(channelName, "channelName");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (str != null) {
            java.lang.String str3 = !O7.q.N0(str) ? str : null;
            if (str3 != null && linkedHashSet.add(str3)) {
                arrayList2.add(str3);
            }
        }
        if (str2 != null) {
            java.lang.String str4 = !O7.q.N0(str2) ? str2 : null;
            if (str4 != null) {
                Companion.getClass();
                java.lang.String strB = Y4.C1051a.b(str4);
                if (linkedHashSet.add(strB)) {
                    arrayList2.add(strB);
                }
            }
        }
        Companion.getClass();
        java.lang.String strA2 = Y4.C1051a.a(channelName);
        if (strA2.length() > 0) {
            boolean z6 = false;
            if (this.f11897f) {
                java.lang.String strA3 = Y4.C1051a.a(channelName);
                if (strA3.length() != 0) {
                    java.lang.String str5 = (java.lang.String) this.f11895d.get(strA3);
                    if (str5 != null) {
                        strA = a(str5);
                    } else {
                        java.lang.String str6 = (java.lang.String) this.f11896e.get(O7.x.w0(strA3, io.ktor.sse.ServerSentEventKt.SPACE, ""));
                        if (str6 != null) {
                            strA = a(str6);
                        } else {
                            java.util.Iterator it = this.f11895d.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                                    java.lang.String str7 = (java.lang.String) entry.getKey();
                                    java.lang.String str8 = (java.lang.String) entry.getValue();
                                    if (str7.length() >= 2 && strA3.length() >= 2) {
                                        d4 = 0.5d;
                                        if (((double) java.lang.Math.min(str7.length(), strA3.length())) / ((double) java.lang.Math.max(str7.length(), strA3.length())) >= 0.5d && (O7.q.B0(str7, strA3, false) || O7.q.B0(strA3, str7, false))) {
                                            strA = a(str8);
                                        }
                                    }
                                } else {
                                    d4 = 0.5d;
                                    strA = null;
                                }
                            }
                        }
                    }
                    d4 = 0.5d;
                } else {
                    d4 = 0.5d;
                    strA = null;
                }
            } else {
                d4 = 0.5d;
                strA = null;
            }
            if (strA != null && linkedHashSet.add(strA) && arrayList2.size() < 20) {
                arrayList2.add(strA);
            }
            if (this.f11899i) {
                java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                e(arrayList3, linkedHashSet2, (java.util.List) this.g.get(strA2));
                if (arrayList3.size() < 20) {
                    e(arrayList3, linkedHashSet2, (java.util.List) this.f11898h.get(O7.x.w0(strA2, io.ktor.sse.ServerSentEventKt.SPACE, "")));
                }
                if (arrayList3.size() < 20) {
                    int i3 = 3;
                    if (strA2.length() >= 3) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        for (java.util.Map.Entry entry2 : this.g.entrySet()) {
                            java.lang.String str9 = (java.lang.String) entry2.getKey();
                            java.util.List list = (java.util.List) entry2.getValue();
                            if (str9.length() >= i3 && (O7.q.B0(str9, strA2, z6) || O7.q.B0(strA2, str9, z6))) {
                                if (((double) java.lang.Math.min(str9.length(), strA2.length())) / ((double) java.lang.Math.max(str9.length(), strA2.length())) >= d4) {
                                    int iAbs = java.lang.Math.abs(str9.length() - strA2.length());
                                    java.util.Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        arrayList4.add(new p070h6.q(java.lang.Integer.valueOf(iAbs), str9, (java.lang.String) it2.next()));
                                    }
                                }
                                i3 = 3;
                                z6 = false;
                            }
                        }
                        if (arrayList4.size() > 1) {
                            p078i6.t.L0(new C5.O1(22), arrayList4);
                        }
                        java.util.Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            java.lang.String str10 = (java.lang.String) ((p070h6.q) it3.next()).j;
                            if (arrayList3.size() >= 20) {
                                break;
                            }
                            if (linkedHashSet2.add(str10)) {
                                arrayList3.add(str10);
                            }
                        }
                    }
                }
                arrayList = new java.util.ArrayList(p078i6.q.I0(arrayList3, 10));
                java.util.Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList.add("https://cdn.jsdelivr.net/gh/tv-logo/tv-logos@main/" + ((java.lang.String) it4.next()));
                }
            } else {
                arrayList = p078i6.w.f23205h;
            }
            for (java.lang.String str11 : arrayList) {
                if (arrayList2.size() >= 20) {
                    break;
                }
                if (linkedHashSet.add(str11)) {
                    arrayList2.add(str11);
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3 A[Catch: Exception -> 0x003c, PHI: r3 r12
  0x00a3: PHI (r3v8 Y4.g) = (r3v7 Y4.g), (r3v11 Y4.g) binds: [B:39:0x00a0, B:22:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r12v14 java.lang.Object) = (r12v13 java.lang.Object), (r12v1 java.lang.Object) binds: [B:39:0x00a0, B:22:0x0049] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x003c, blocks: (B:15:0x0037, B:45:0x00be, B:22:0x0049, B:41:0x00a3, B:25:0x004f, B:38:0x008f, B:28:0x0055, B:35:0x0082, B:31:0x005c), top: B:50:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object c(p117n6.c cVar) throws java.lang.Throwable {
        Y4.C1055b c1055b;
        Y4.C1075g c1075g;
        java.util.Map map;
        Z7.e eVar;
        Y4.C1059c c1059c;
        java.util.Map map2;
        Y4.C1075g c1075g2;
        if (cVar instanceof Y4.C1055b) {
            c1055b = (Y4.C1055b) cVar;
            int i3 = c1055b.f11814l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1055b.f11814l = i3 - Integer.MIN_VALUE;
            } else {
                c1055b = new Y4.C1055b(this, cVar);
            }
        } else {
            c1055b = new Y4.C1055b(this, cVar);
        }
        java.lang.Object objExecute = c1055b.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1055b.f11814l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                io.ktor.client.HttpClient httpClient = this.f11892a;
                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, "https://jaruba.github.io/channel-logos/logo_paths.json");
                httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                c1055b.f11811h = this;
                c1055b.f11814l = 1;
                objExecute = httpStatement.execute(c1055b);
                if (objExecute != aVar) {
                    c1075g = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                c1075g = c1055b.f11811h;
                com.google.common.util.concurrent.P.u0(objExecute);
            } else {
                if (i9 == 2) {
                    c1075g = c1055b.f11811h;
                    com.google.common.util.concurrent.P.u0(objExecute);
                    Z7.e eVar2 = S7.M.f9549a;
                    Y4.C1063d c1063d = new Y4.C1063d(c1075g, (java.lang.String) objExecute, null);
                    c1055b.f11811h = c1075g;
                    c1055b.f11814l = 3;
                    objExecute = S7.C.K(eVar2, c1063d, c1055b);
                    if (objExecute == aVar) {
                        map = (java.util.Map) objExecute;
                        eVar = S7.M.f9549a;
                        c1059c = new Y4.C1059c(c1075g, map, null);
                        c1055b.f11811h = c1075g;
                        c1055b.f11812i = map;
                        c1055b.f11814l = 4;
                        if (S7.C.K(eVar, c1059c, c1055b) != aVar) {
                            map2 = map;
                            c1075g2 = c1075g;
                        }
                    }
                    return aVar;
                }
                if (i9 == 3) {
                    c1075g = c1055b.f11811h;
                    com.google.common.util.concurrent.P.u0(objExecute);
                    map = (java.util.Map) objExecute;
                    eVar = S7.M.f9549a;
                    c1059c = new Y4.C1059c(c1075g, map, null);
                    c1055b.f11811h = c1075g;
                    c1055b.f11812i = map;
                    c1055b.f11814l = 4;
                    if (S7.C.K(eVar, c1059c, c1055b) != aVar) {
                        map2 = map;
                        c1075g2 = c1075g;
                    }
                    return aVar;
                }
                if (i9 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map2 = c1055b.f11812i;
                c1075g2 = c1055b.f11811h;
                com.google.common.util.concurrent.P.u0(objExecute);
            }
            c1075g2.getClass();
            c1075g2.f11897f = true;
            android.util.Log.d("ChannelLogoClient", "Loaded " + map2.size() + " channel logo mappings");
            return p070h6.A.f22523a;
            c1055b.f11811h = c1075g;
            c1055b.f11814l = 2;
            objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default((io.ktor.client.statement.HttpResponse) objExecute, null, c1055b, 1, null);
            if (objExecute != aVar) {
                Z7.e eVar3 = S7.M.f9549a;
                Y4.C1063d c1063d2 = new Y4.C1063d(c1075g, (java.lang.String) objExecute, null);
                c1055b.f11811h = c1075g;
                c1055b.f11814l = 3;
                objExecute = S7.C.K(eVar3, c1063d2, c1055b);
                if (objExecute == aVar) {
                    map = (java.util.Map) objExecute;
                    eVar = S7.M.f9549a;
                    c1059c = new Y4.C1059c(c1075g, map, null);
                    c1055b.f11811h = c1075g;
                    c1055b.f11812i = map;
                    c1055b.f11814l = 4;
                    if (S7.C.K(eVar, c1059c, c1055b) != aVar) {
                        map2 = map;
                        c1075g2 = c1075g;
                        c1075g2.getClass();
                        c1075g2.f11897f = true;
                        android.util.Log.d("ChannelLogoClient", "Loaded " + map2.size() + " channel logo mappings");
                        return p070h6.A.f22523a;
                    }
                }
            }
            return aVar;
        } catch (java.lang.Exception e6) {
            android.util.Log.e("ChannelLogoClient", "Failed to load channel logo mapping: " + e6.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object d(p117n6.c cVar) throws java.lang.Throwable {
        Y4.C1067e c1067e;
        Y4.C1075g c1075g;
        Y4.C1075g c1075g2;
        if (cVar instanceof Y4.C1067e) {
            c1067e = (Y4.C1067e) cVar;
            int i3 = c1067e.f11859k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1067e.f11859k = i3 - Integer.MIN_VALUE;
            } else {
                c1067e = new Y4.C1067e(this, cVar);
            }
        } else {
            c1067e = new Y4.C1067e(this, cVar);
        }
        java.lang.Object objExecute = c1067e.f11858i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1067e.f11859k;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                io.ktor.client.HttpClient httpClient = this.f11892a;
                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, "https://kiptv.app/tvlogos_manifest.json");
                httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                io.ktor.client.statement.HttpStatement httpStatement = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                c1067e.f11857h = this;
                c1067e.f11859k = 1;
                objExecute = httpStatement.execute(c1067e);
                if (objExecute != aVar) {
                    c1075g = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                c1075g = c1067e.f11857h;
                com.google.common.util.concurrent.P.u0(objExecute);
            } else {
                if (i9 == 2) {
                    c1075g = c1067e.f11857h;
                    com.google.common.util.concurrent.P.u0(objExecute);
                    Z7.e eVar = S7.M.f9549a;
                    Y4.C1071f c1071f = new Y4.C1071f(c1075g, (java.lang.String) objExecute, null);
                    c1067e.f11857h = c1075g;
                    c1067e.f11859k = 3;
                    objExecute = S7.C.K(eVar, c1071f, c1067e);
                    if (objExecute != aVar) {
                        c1075g2 = c1075g;
                    }
                    return aVar;
                }
                if (i9 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1075g2 = c1067e.f11857h;
                com.google.common.util.concurrent.P.u0(objExecute);
            }
            p070h6.q qVar = (p070h6.q) objExecute;
            java.util.Map map = (java.util.Map) qVar.f22547h;
            java.util.Map map2 = (java.util.Map) qVar.f22548i;
            java.util.Map map3 = (java.util.Map) qVar.j;
            c1075g2.g = map2;
            c1075g2.f11898h = map3;
            c1075g2.f11899i = true;
            android.util.Log.d("ChannelLogoClient", "Loaded " + map.size() + " tv-logos mappings");
            return p070h6.A.f22523a;
            c1067e.f11857h = c1075g;
            c1067e.f11859k = 2;
            objExecute = io.ktor.client.statement.HttpResponseKt.bodyAsText$default((io.ktor.client.statement.HttpResponse) objExecute, null, c1067e, 1, null);
            if (objExecute != aVar) {
                Z7.e eVar2 = S7.M.f9549a;
                Y4.C1071f c1071f2 = new Y4.C1071f(c1075g, (java.lang.String) objExecute, null);
                c1067e.f11857h = c1075g;
                c1067e.f11859k = 3;
                objExecute = S7.C.K(eVar2, c1071f2, c1067e);
                if (objExecute != aVar) {
                    c1075g2 = c1075g;
                    p070h6.q qVar2 = (p070h6.q) objExecute;
                    java.util.Map map4 = (java.util.Map) qVar2.f22547h;
                    java.util.Map map5 = (java.util.Map) qVar2.f22548i;
                    java.util.Map map6 = (java.util.Map) qVar2.j;
                    c1075g2.g = map5;
                    c1075g2.f11898h = map6;
                    c1075g2.f11899i = true;
                    android.util.Log.d("ChannelLogoClient", "Loaded " + map4.size() + " tv-logos mappings");
                    return p070h6.A.f22523a;
                }
            }
            return aVar;
        } catch (java.lang.Exception e6) {
            android.util.Log.e("ChannelLogoClient", "Failed to load tv-logos manifest: " + e6.getMessage());
        }
    }
}
