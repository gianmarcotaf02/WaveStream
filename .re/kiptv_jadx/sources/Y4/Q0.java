package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 {
    public static final Y4.A Companion = new Y4.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.ktor.client.HttpClient f11713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p162s8.d f11714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p034d5.c f11715c = new p034d5.c(35, androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p034d5.c f11716d = new p034d5.c();

    public Q0(io.ktor.client.HttpClient httpClient, p162s8.d dVar, p132p5.a aVar) {
        this.f11713a = httpClient;
        this.f11714b = dVar;
    }

    public static java.lang.String b() {
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String language = locale.getLanguage();
        java.lang.String country = locale.getCountry();
        kotlin.jvm.internal.m.b(country);
        if (country.length() > 0) {
            return p121o0.p.p(language, "-", country);
        }
        kotlin.jvm.internal.m.b(language);
        return language;
    }

    public static boolean u(java.lang.Exception exc) {
        if (exc instanceof p034d5.d) {
            return false;
        }
        if (exc instanceof Y4.U0) {
            return true;
        }
        if (!(exc instanceof Y4.S0)) {
            return !(exc instanceof Y4.V0);
        }
        int i3 = ((Y4.S0) exc).f11726h;
        return 500 <= i3 && i3 < 600;
    }

    public final java.lang.String a(java.lang.String str) {
        Companion.getClass();
        return Y4.A.a(str, "w780", "https://image.tmdb.org/t/p");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|72|43|44|74|45|(0)|52) */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0146, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014a, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0157, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r9, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016c, code lost:
    
        if (r4 != r8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016e, code lost:
    
        r0 = r9;
        r4 = r12;
        r9 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0175, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(java.lang.String str, java.util.Map map, int i3, java.lang.String str2, java.lang.String str3, p117n6.c cVar) throws java.lang.Exception {
        Y4.D d4;
        Y4.Q0 q9;
        Y4.Q0 q10;
        java.util.Map map2;
        int i9;
        java.lang.String str4;
        java.lang.String str5;
        char c9;
        java.lang.Exception e6;
        java.util.Map map3;
        java.lang.String str6;
        p034d5.c cVar2;
        if (cVar instanceof Y4.D) {
            d4 = (Y4.D) cVar;
            int i10 = d4.f11565p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d4.f11565p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                d4 = new Y4.D(q9, cVar);
            }
        } else {
            q9 = this;
            d4 = new Y4.D(q9, cVar);
        }
        java.lang.Object obj = d4.f11563n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = d4.f11565p;
        int i12 = 1;
        try {
            try {
                try {
                    if (i11 == 0) {
                        com.google.common.util.concurrent.P.u0(obj);
                        java.lang.String str7 = kotlin.jvm.internal.m.a(str, "tv") ? "tv" : "movie";
                        java.lang.String str8 = str3;
                        java.lang.String strQ1 = str2 == null ? O7.q.q1(2, str8) : str2;
                        p086j6.e eVar = new p086j6.e();
                        eVar.put("watch_region", strQ1);
                        eVar.put("with_watch_monetization_types", "flatrate|free|ads|rent|buy");
                        eVar.putAll(map);
                        eVar.put("page", java.lang.String.valueOf(i3));
                        p086j6.e eVarB = eVar.b();
                        java.lang.String strConcat = "/discover/".concat(str7);
                        int i13 = 0;
                        q10 = q9;
                        map2 = eVarB;
                        i9 = 2;
                        if (i13 > 0) {
                            java.util.Map map4 = map2;
                            long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i13 - 1)) * 1000);
                            d4.f11558h = str8;
                            d4.f11559i = map4;
                            d4.j = q10;
                            d4.f11560k = strConcat;
                            d4.f11561l = i9;
                            d4.f11562m = i13;
                            d4.f11565p = i12;
                            if (S7.C.n(jI, d4) != aVar) {
                                map2 = map4;
                                str4 = str8;
                                i11 = i13;
                                str5 = strConcat;
                            }
                            return aVar;
                        }
                        str4 = str8;
                        i11 = i13;
                        str5 = strConcat;
                        cVar2 = q10.f11715c;
                        d4.f11558h = str4;
                        d4.f11559i = map2;
                        d4.j = q10;
                        d4.f11560k = str5;
                        d4.f11561l = i9;
                        d4.f11562m = i11;
                        c9 = 2;
                        d4.f11565p = 2;
                        if (cVar2.a(d4) != aVar) {
                        }
                        return aVar;
                    }
                    if (i11 == 1) {
                        i11 = d4.f11562m;
                        i9 = d4.f11561l;
                        str5 = d4.f11560k;
                        q10 = d4.j;
                        map2 = d4.f11559i;
                        str4 = d4.f11558h;
                        com.google.common.util.concurrent.P.u0(obj);
                        cVar2 = q10.f11715c;
                        d4.f11558h = str4;
                        d4.f11559i = map2;
                        d4.j = q10;
                        d4.f11560k = str5;
                        d4.f11561l = i9;
                        d4.f11562m = i11;
                        c9 = 2;
                        d4.f11565p = 2;
                        if (cVar2.a(d4) != aVar) {
                        }
                        return aVar;
                    }
                    try {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i14 = d4.f11562m;
                            int i15 = d4.f11561l;
                            java.lang.String str9 = d4.f11560k;
                            Y4.Q0 q11 = d4.j;
                            java.util.Map map5 = d4.f11559i;
                            java.lang.String str10 = d4.f11558h;
                            com.google.common.util.concurrent.P.u0(obj);
                            return obj;
                        }
                        i11 = d4.f11562m;
                        i9 = d4.f11561l;
                        str5 = d4.f11560k;
                        q10 = d4.j;
                        map2 = d4.f11559i;
                        str4 = d4.f11558h;
                        com.google.common.util.concurrent.P.u0(obj);
                        c9 = 2;
                    } catch (java.lang.Exception e9) {
                        e6 = e9;
                        c9 = 2;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    str5 = str6;
                    map2 = map3;
                    q10.getClass();
                    if (u(e6)) {
                    }
                    throw e6;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
            }
            map3 = map2;
            str6 = str5;
            p034d5.c cVar3 = q10.f11716d;
            Y4.C c10 = new Y4.C(q10, str6, str4, map3, null);
            d4.f11558h = str4;
            d4.f11559i = map3;
            d4.j = q10;
            d4.f11560k = str6;
            d4.f11561l = i9;
            d4.f11562m = i11;
            d4.f11565p = 3;
            java.lang.Object objB = cVar3.b(c10, d4);
            if (objB == aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:27|41|42|100|44|45|88|46|(14:26|92|49|50|96|51|52|98|53|86|54|55|90|56)|58) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:23|24|25|26|92|49|50|96|51|52|98|53|86|54|55|90|56) */
    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[PHI: r5 r9 r10 r11 r12 r13 r15
  0x0068: PHI (r5v12 int) = (r5v14 int), (r5v16 int) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r9v7 int) = (r9v9 int), (r9v11 int) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r10v11 java.lang.String) = (r10v17 java.lang.String), (r10v19 java.lang.String) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r11v13 Y4.Q0) = (r11v18 Y4.Q0), (r11v20 Y4.Q0) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r12v9 java.util.Map) = (r12v11 java.util.Map), (r12v15 java.util.Map) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r13v3 java.lang.String) = (r13v8 java.lang.String), (r13v10 java.lang.String) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r15v2 char) = (r15v4 char), (r15v6 char) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0160, code lost:
    
        if (r1 == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0168, code lost:
    
        r1 = r13;
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0171, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0173, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0174, code lost:
    
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0176, code lost:
    
        r10 = r18;
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0181, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0182, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0191, code lost:
    
        r13 = r5 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r10, ", retry "), "/", r9, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a6, code lost:
    
        if (r5 != r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a8, code lost:
    
        r5 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r0 = r13;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x010d -> B:41:0x0110). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0117 -> B:42:0x0112). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, p117n6.c cVar) {
        Y4.G g;
        Y4.Q0 q9;
        java.lang.String str4;
        Y4.Q0 q10;
        int i10;
        java.lang.String str5;
        int i11;
        char c9;
        java.util.Map map;
        java.lang.String str6;
        java.util.Map map2;
        java.lang.String str7;
        Y4.Q0 q11;
        java.lang.String str8;
        int i12;
        p034d5.c cVar2;
        if (cVar instanceof Y4.G) {
            g = (Y4.G) cVar;
            int i13 = g.f11602p;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                g.f11602p = i13 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                g = new Y4.G(q9, cVar);
            }
        } else {
            q9 = this;
            g = new Y4.G(q9, cVar);
        }
        java.lang.Object objB = g.f11600n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = g.f11602p;
        int i15 = 1;
        try {
            if (i14 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                str4 = str3;
                java.lang.String strQ1 = str2 == null ? O7.q.q1(2, str4) : str2;
                p086j6.e eVar = new p086j6.e();
                eVar.put("with_genres", java.lang.String.valueOf(i3));
                eVar.put("sort_by", "popularity.desc");
                eVar.put("page", java.lang.String.valueOf(i9));
                eVar.put("vote_count.gte", "50");
                eVar.put("watch_region", strQ1);
                eVar.put("with_watch_monetization_types", "flatrate|free|ads|rent|buy");
                if (str != null) {
                    eVar.put("with_origin_country", str);
                }
                java.util.Map mapB = eVar.b();
                q10 = q9;
                i10 = 0;
                str5 = "/discover/movie";
                i11 = 2;
                if (i10 > 0) {
                    java.util.Map map3 = mapB;
                    long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i10 - 1)) * 1000);
                    g.f11595h = str4;
                    g.f11596i = map3;
                    g.j = q10;
                    g.f11597k = str5;
                    g.f11598l = i11;
                    g.f11599m = i10;
                    g.f11602p = i15;
                    if (S7.C.n(jI, g) != aVar) {
                        map2 = map3;
                        str7 = str4;
                        str6 = str7;
                        map = map2;
                        q11 = q10;
                        str8 = str5;
                        i12 = i11;
                        i14 = i10;
                        cVar2 = q11.f11715c;
                        g.f11595h = str6;
                        g.f11596i = map;
                        g.j = q11;
                        g.f11597k = str8;
                        g.f11598l = i12;
                        g.f11599m = i14;
                        c9 = 2;
                        g.f11602p = 2;
                        if (cVar2.a(g) != aVar) {
                            java.lang.String str9 = str8;
                            java.util.Map map4 = map;
                            java.lang.String str10 = str6;
                            p034d5.c cVar3 = q11.f11716d;
                            Y4.Q0 q12 = q11;
                            Y4.F f9 = new Y4.F(q12, str9, str10, map4, null);
                            str8 = str9;
                            java.lang.String str11 = str10;
                            g.f11595h = str11;
                            g.f11596i = map4;
                            g.j = q11;
                            g.f11597k = str8;
                            g.f11598l = i12;
                            g.f11599m = i14;
                            g.f11602p = 3;
                            objB = cVar3.b(f9, g);
                        }
                    }
                } else {
                    map = mapB;
                    str6 = str4;
                    q11 = q10;
                    str8 = str5;
                    i12 = i11;
                    i14 = i10;
                    cVar2 = q11.f11715c;
                    g.f11595h = str6;
                    g.f11596i = map;
                    g.j = q11;
                    g.f11597k = str8;
                    g.f11598l = i12;
                    g.f11599m = i14;
                    c9 = 2;
                    g.f11602p = 2;
                    if (cVar2.a(g) != aVar) {
                        java.lang.String str12 = str8;
                        java.util.Map map5 = map;
                        java.lang.String str13 = str6;
                        p034d5.c cVar4 = q11.f11716d;
                        Y4.Q0 q13 = q11;
                        Y4.F f10 = new Y4.F(q13, str12, str13, map5, null);
                        str8 = str12;
                        java.lang.String str14 = str13;
                        g.f11595h = str14;
                        g.f11596i = map5;
                        g.j = q11;
                        g.f11597k = str8;
                        g.f11598l = i12;
                        g.f11599m = i14;
                        g.f11602p = 3;
                        objB = cVar4.b(f10, g);
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                i10 = g.f11599m;
                i11 = g.f11598l;
                str5 = g.f11597k;
                q10 = g.j;
                map2 = g.f11596i;
                str7 = g.f11595h;
                com.google.common.util.concurrent.P.u0(objB);
                str6 = str7;
                map = map2;
                q11 = q10;
                str8 = str5;
                i12 = i11;
                i14 = i10;
                cVar2 = q11.f11715c;
                g.f11595h = str6;
                g.f11596i = map;
                g.j = q11;
                g.f11597k = str8;
                g.f11598l = i12;
                g.f11599m = i14;
                c9 = 2;
                g.f11602p = 2;
                if (cVar2.a(g) != aVar) {
                    java.lang.String str15 = str8;
                    java.util.Map map6 = map;
                    java.lang.String str16 = str6;
                    p034d5.c cVar5 = q11.f11716d;
                    Y4.Q0 q14 = q11;
                    Y4.F f11 = new Y4.F(q14, str15, str16, map6, null);
                    str8 = str15;
                    java.lang.String str17 = str16;
                    g.f11595h = str17;
                    g.f11596i = map6;
                    g.j = q11;
                    g.f11597k = str8;
                    g.f11598l = i12;
                    g.f11599m = i14;
                    g.f11602p = 3;
                    objB = cVar5.b(f11, g);
                }
                return aVar;
            }
            try {
                if (i14 == 2) {
                    i14 = g.f11599m;
                    i12 = g.f11598l;
                    str8 = g.f11597k;
                    q11 = g.j;
                    map = g.f11596i;
                    str6 = g.f11595h;
                    com.google.common.util.concurrent.P.u0(objB);
                    c9 = 2;
                    java.lang.String str18 = str8;
                    java.util.Map map7 = map;
                    java.lang.String str19 = str6;
                    p034d5.c cVar6 = q11.f11716d;
                    Y4.Q0 q15 = q11;
                    Y4.F f12 = new Y4.F(q15, str18, str19, map7, null);
                    str8 = str18;
                    java.lang.String str110 = str19;
                    g.f11595h = str110;
                    g.f11596i = map7;
                    g.j = q11;
                    g.f11597k = str8;
                    g.f11598l = i12;
                    g.f11599m = i14;
                    g.f11602p = 3;
                    objB = cVar6.b(f12, g);
                } else {
                    if (i14 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i16 = g.f11599m;
                    int i17 = g.f11598l;
                    java.lang.String str20 = g.f11597k;
                    Y4.Q0 q16 = g.j;
                    java.util.Map map8 = g.f11596i;
                    java.lang.String str21 = g.f11595h;
                    com.google.common.util.concurrent.P.u0(objB);
                }
            } catch (java.lang.Exception e6) {
                java.lang.Exception e9 = e6;
                c9 = 2;
                str4 = str6;
                q11.getClass();
                if (u(e9)) {
                }
                throw e9;
            }
            return ((com.kiptv.core.model.TMDBDiscoverResponse) objB).f20156b;
        } catch (java.util.concurrent.CancellationException e10) {
            throw e10;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:27|41|42|100|44|45|88|46|(14:26|92|49|50|96|51|52|98|53|86|54|55|90|56)|58) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:23|24|25|26|92|49|50|96|51|52|98|53|86|54|55|90|56) */
    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[PHI: r5 r9 r10 r11 r12 r13 r15
  0x0068: PHI (r5v12 int) = (r5v14 int), (r5v16 int) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r9v7 int) = (r9v9 int), (r9v11 int) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r10v11 java.lang.String) = (r10v17 java.lang.String), (r10v19 java.lang.String) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r11v13 Y4.Q0) = (r11v18 Y4.Q0), (r11v20 Y4.Q0) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r12v9 java.util.Map) = (r12v11 java.util.Map), (r12v15 java.util.Map) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r13v3 java.lang.String) = (r13v8 java.lang.String), (r13v10 java.lang.String) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r15v2 char) = (r15v4 char), (r15v6 char) binds: [B:47:0x0135, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0160, code lost:
    
        if (r1 == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0168, code lost:
    
        r1 = r13;
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0171, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0173, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0174, code lost:
    
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0176, code lost:
    
        r10 = r18;
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0181, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0182, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0191, code lost:
    
        r13 = r5 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r10, ", retry "), "/", r9, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a6, code lost:
    
        if (r5 != r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a8, code lost:
    
        r5 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r0 = r13;
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x010d -> B:41:0x0110). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0117 -> B:42:0x0112). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object e(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, p117n6.c cVar) {
        Y4.J j;
        Y4.Q0 q9;
        java.lang.String str4;
        Y4.Q0 q10;
        int i10;
        java.lang.String str5;
        int i11;
        char c9;
        java.util.Map map;
        java.lang.String str6;
        java.util.Map map2;
        java.lang.String str7;
        Y4.Q0 q11;
        java.lang.String str8;
        int i12;
        p034d5.c cVar2;
        if (cVar instanceof Y4.J) {
            j = (Y4.J) cVar;
            int i13 = j.f11635p;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                j.f11635p = i13 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                j = new Y4.J(q9, cVar);
            }
        } else {
            q9 = this;
            j = new Y4.J(q9, cVar);
        }
        java.lang.Object objB = j.f11633n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = j.f11635p;
        int i15 = 1;
        try {
            if (i14 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                str4 = str3;
                java.lang.String strQ1 = str2 == null ? O7.q.q1(2, str4) : str2;
                p086j6.e eVar = new p086j6.e();
                eVar.put("with_genres", java.lang.String.valueOf(i3));
                eVar.put("sort_by", "popularity.desc");
                eVar.put("page", java.lang.String.valueOf(i9));
                eVar.put("vote_count.gte", "30");
                eVar.put("watch_region", strQ1);
                eVar.put("with_watch_monetization_types", "flatrate|free|ads|rent|buy");
                if (str != null) {
                    eVar.put("with_origin_country", str);
                }
                java.util.Map mapB = eVar.b();
                q10 = q9;
                i10 = 0;
                str5 = "/discover/tv";
                i11 = 2;
                if (i10 > 0) {
                    java.util.Map map3 = mapB;
                    long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i10 - 1)) * 1000);
                    j.f11628h = str4;
                    j.f11629i = map3;
                    j.j = q10;
                    j.f11630k = str5;
                    j.f11631l = i11;
                    j.f11632m = i10;
                    j.f11635p = i15;
                    if (S7.C.n(jI, j) != aVar) {
                        map2 = map3;
                        str7 = str4;
                        str6 = str7;
                        map = map2;
                        q11 = q10;
                        str8 = str5;
                        i12 = i11;
                        i14 = i10;
                        cVar2 = q11.f11715c;
                        j.f11628h = str6;
                        j.f11629i = map;
                        j.j = q11;
                        j.f11630k = str8;
                        j.f11631l = i12;
                        j.f11632m = i14;
                        c9 = 2;
                        j.f11635p = 2;
                        if (cVar2.a(j) != aVar) {
                            java.lang.String str9 = str8;
                            java.util.Map map4 = map;
                            java.lang.String str10 = str6;
                            p034d5.c cVar3 = q11.f11716d;
                            Y4.Q0 q12 = q11;
                            Y4.I i16 = new Y4.I(q12, str9, str10, map4, null);
                            str8 = str9;
                            java.lang.String str11 = str10;
                            j.f11628h = str11;
                            j.f11629i = map4;
                            j.j = q11;
                            j.f11630k = str8;
                            j.f11631l = i12;
                            j.f11632m = i14;
                            j.f11635p = 3;
                            objB = cVar3.b(i16, j);
                        }
                    }
                } else {
                    map = mapB;
                    str6 = str4;
                    q11 = q10;
                    str8 = str5;
                    i12 = i11;
                    i14 = i10;
                    cVar2 = q11.f11715c;
                    j.f11628h = str6;
                    j.f11629i = map;
                    j.j = q11;
                    j.f11630k = str8;
                    j.f11631l = i12;
                    j.f11632m = i14;
                    c9 = 2;
                    j.f11635p = 2;
                    if (cVar2.a(j) != aVar) {
                        java.lang.String str12 = str8;
                        java.util.Map map5 = map;
                        java.lang.String str13 = str6;
                        p034d5.c cVar4 = q11.f11716d;
                        Y4.Q0 q13 = q11;
                        Y4.I i17 = new Y4.I(q13, str12, str13, map5, null);
                        str8 = str12;
                        java.lang.String str14 = str13;
                        j.f11628h = str14;
                        j.f11629i = map5;
                        j.j = q11;
                        j.f11630k = str8;
                        j.f11631l = i12;
                        j.f11632m = i14;
                        j.f11635p = 3;
                        objB = cVar4.b(i17, j);
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                i10 = j.f11632m;
                i11 = j.f11631l;
                str5 = j.f11630k;
                q10 = j.j;
                map2 = j.f11629i;
                str7 = j.f11628h;
                com.google.common.util.concurrent.P.u0(objB);
                str6 = str7;
                map = map2;
                q11 = q10;
                str8 = str5;
                i12 = i11;
                i14 = i10;
                cVar2 = q11.f11715c;
                j.f11628h = str6;
                j.f11629i = map;
                j.j = q11;
                j.f11630k = str8;
                j.f11631l = i12;
                j.f11632m = i14;
                c9 = 2;
                j.f11635p = 2;
                if (cVar2.a(j) != aVar) {
                    java.lang.String str15 = str8;
                    java.util.Map map6 = map;
                    java.lang.String str16 = str6;
                    p034d5.c cVar5 = q11.f11716d;
                    Y4.Q0 q14 = q11;
                    Y4.I i18 = new Y4.I(q14, str15, str16, map6, null);
                    str8 = str15;
                    java.lang.String str17 = str16;
                    j.f11628h = str17;
                    j.f11629i = map6;
                    j.j = q11;
                    j.f11630k = str8;
                    j.f11631l = i12;
                    j.f11632m = i14;
                    j.f11635p = 3;
                    objB = cVar5.b(i18, j);
                }
                return aVar;
            }
            try {
                if (i14 == 2) {
                    i14 = j.f11632m;
                    i12 = j.f11631l;
                    str8 = j.f11630k;
                    q11 = j.j;
                    map = j.f11629i;
                    str6 = j.f11628h;
                    com.google.common.util.concurrent.P.u0(objB);
                    c9 = 2;
                    java.lang.String str18 = str8;
                    java.util.Map map7 = map;
                    java.lang.String str19 = str6;
                    p034d5.c cVar6 = q11.f11716d;
                    Y4.Q0 q15 = q11;
                    Y4.I i19 = new Y4.I(q15, str18, str19, map7, null);
                    str8 = str18;
                    java.lang.String str110 = str19;
                    j.f11628h = str110;
                    j.f11629i = map7;
                    j.j = q11;
                    j.f11630k = str8;
                    j.f11631l = i12;
                    j.f11632m = i14;
                    j.f11635p = 3;
                    objB = cVar6.b(i19, j);
                } else {
                    if (i14 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i20 = j.f11632m;
                    int i21 = j.f11631l;
                    java.lang.String str20 = j.f11630k;
                    Y4.Q0 q16 = j.j;
                    java.util.Map map8 = j.f11629i;
                    java.lang.String str21 = j.f11628h;
                    com.google.common.util.concurrent.P.u0(objB);
                }
            } catch (java.lang.Exception e6) {
                java.lang.Exception e9 = e6;
                c9 = 2;
                str4 = str6;
                q11.getClass();
                if (u(e9)) {
                }
                throw e9;
            }
            return ((com.kiptv.core.model.TMDBDiscoverResponse) objB).f20156b;
        } catch (java.util.concurrent.CancellationException e10) {
            throw e10;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|64|33|34|66|35|(0)|42) */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0114, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0117, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cd, code lost:
    
        r12 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object f(int i3, java.lang.String str, p117n6.c cVar) throws java.lang.Exception {
        Y4.M m8;
        Y4.Q0 q9;
        java.lang.String str2;
        Y4.Q0 q10;
        java.util.Map map;
        java.lang.String str3;
        int i9;
        java.lang.String str4;
        long jI;
        char c9;
        java.lang.Exception e6;
        Y4.Q0 q11;
        java.lang.String str5;
        java.util.Map map2;
        java.lang.Object objB;
        p034d5.c cVar2;
        if (cVar instanceof Y4.M) {
            m8 = (Y4.M) cVar;
            int i10 = m8.f11667p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                m8.f11667p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                m8 = new Y4.M(q9, cVar);
            }
        } else {
            q9 = this;
            m8 = new Y4.M(q9, cVar);
        }
        java.lang.Object obj = m8.f11665n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = m8.f11667p;
        int i12 = 1;
        try {
            try {
                try {
                    if (i11 == 0) {
                        com.google.common.util.concurrent.P.u0(obj);
                        str2 = "/collection/" + i3;
                        q10 = q9;
                        map = p078i6.x.f23206h;
                        i11 = 0;
                        str3 = str;
                        i9 = 2;
                        if (i11 > 0) {
                            jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                            m8.f11660h = str3;
                            m8.f11661i = q10;
                            m8.j = str2;
                            m8.f11662k = map;
                            m8.f11663l = i9;
                            m8.f11664m = i11;
                            m8.f11667p = i12;
                            if (S7.C.n(jI, m8) != aVar) {
                                str4 = str3;
                            }
                            return aVar;
                        }
                        str4 = str3;
                        cVar2 = q10.f11715c;
                        m8.f11660h = str4;
                        m8.f11661i = q10;
                        m8.j = str2;
                        m8.f11662k = map;
                        m8.f11663l = i9;
                        m8.f11664m = i11;
                        c9 = 2;
                        m8.f11667p = 2;
                        if (cVar2.a(m8) != aVar) {
                        }
                        return aVar;
                    }
                    if (i11 == 1) {
                        i11 = m8.f11664m;
                        i9 = m8.f11663l;
                        map = m8.f11662k;
                        str2 = m8.j;
                        q10 = m8.f11661i;
                        str4 = m8.f11660h;
                        com.google.common.util.concurrent.P.u0(obj);
                        cVar2 = q10.f11715c;
                        m8.f11660h = str4;
                        m8.f11661i = q10;
                        m8.j = str2;
                        m8.f11662k = map;
                        m8.f11663l = i9;
                        m8.f11664m = i11;
                        c9 = 2;
                        m8.f11667p = 2;
                        if (cVar2.a(m8) != aVar) {
                        }
                        return aVar;
                    }
                    try {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i13 = m8.f11664m;
                            int i14 = m8.f11663l;
                            java.util.Map map3 = m8.f11662k;
                            java.lang.String str6 = m8.j;
                            Y4.Q0 q12 = m8.f11661i;
                            java.lang.String str7 = m8.f11660h;
                            com.google.common.util.concurrent.P.u0(obj);
                            return obj;
                        }
                        i11 = m8.f11664m;
                        i9 = m8.f11663l;
                        map = m8.f11662k;
                        str2 = m8.j;
                        q10 = m8.f11661i;
                        str4 = m8.f11660h;
                        com.google.common.util.concurrent.P.u0(obj);
                        c9 = 2;
                    } catch (java.lang.Exception e9) {
                        e6 = e9;
                        c9 = 2;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
                q10 = q11;
                str2 = str5;
                map = map2;
                q10.getClass();
                if (u(e6) || i11 >= i9) {
                    throw e6;
                }
                int i15 = i11 + 1;
                B2.a.w(B2.a.q(i15, e6.getMessage(), " on ", str2, ", retry "), "/", i9, "TMDBApiClient");
                if (i11 == i9) {
                    throw e6;
                }
                str3 = str4;
                i11 = i15;
                i12 = 1;
                if (i11 > 0) {
                    jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                    m8.f11660h = str3;
                    m8.f11661i = q10;
                    m8.j = str2;
                    m8.f11662k = map;
                    m8.f11663l = i9;
                    m8.f11664m = i11;
                    m8.f11667p = i12;
                    if (S7.C.n(jI, m8) != aVar) {
                        str4 = str3;
                    }
                    return aVar;
                }
                str4 = str3;
                cVar2 = q10.f11715c;
                m8.f11660h = str4;
                m8.f11661i = q10;
                m8.j = str2;
                m8.f11662k = map;
                m8.f11663l = i9;
                m8.f11664m = i11;
                c9 = 2;
                m8.f11667p = 2;
                if (cVar2.a(m8) != aVar) {
                    q11 = q10;
                    str5 = str2;
                    map2 = map;
                    p034d5.c cVar3 = q11.f11716d;
                    Y4.L l2 = new Y4.L(q11, str5, str4, map2, null);
                    m8.f11660h = str4;
                    m8.f11661i = q11;
                    m8.j = str5;
                    m8.f11662k = map2;
                    m8.f11663l = i9;
                    m8.f11664m = i11;
                    m8.f11667p = 3;
                    objB = cVar3.b(l2, m8);
                    if (objB != aVar) {
                        return objB;
                    }
                }
                return aVar;
            }
            q11 = q10;
            str5 = str2;
            map2 = map;
            p034d5.c cVar4 = q11.f11716d;
            Y4.L l9 = new Y4.L(q11, str5, str4, map2, null);
            m8.f11660h = str4;
            m8.f11661i = q11;
            m8.j = str5;
            m8.f11662k = map2;
            m8.f11663l = i9;
            m8.f11664m = i11;
            m8.f11667p = 3;
            objB = cVar4.b(l9, m8);
            if (objB != aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|69|33|34|62|35|(0)|42) */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0132, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013f, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r10, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        if (r4 != r8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0156, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e7, code lost:
    
        r12 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(int i3, int i9, int i10, java.lang.String str, p117n6.c cVar) {
        Y4.P p2;
        Y4.Q0 q9;
        java.lang.String str2;
        Y4.Q0 q10;
        java.util.Map map;
        int i11;
        java.lang.String str3;
        char c9;
        java.lang.Exception e6;
        Y4.Q0 q11;
        java.lang.String str4;
        java.util.Map map2;
        p034d5.c cVar2;
        if (cVar instanceof Y4.P) {
            p2 = (Y4.P) cVar;
            int i12 = p2.f11700p;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                p2.f11700p = i12 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                p2 = new Y4.P(q9, cVar);
            }
        } else {
            q9 = this;
            p2 = new Y4.P(q9, cVar);
        }
        java.lang.Object obj = p2.f11698n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i13 = p2.f11700p;
        int i14 = 1;
        try {
            try {
                try {
                    if (i13 == 0) {
                        com.google.common.util.concurrent.P.u0(obj);
                        str2 = "/tv/" + i3 + "/season/" + i9 + "/episode/" + i10 + "/credits";
                        q10 = q9;
                        map = p078i6.x.f23206h;
                        i13 = 0;
                        java.lang.String str5 = str;
                        i11 = 2;
                        if (i13 > 0) {
                            long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i13 - 1)) * 1000);
                            p2.f11693h = str5;
                            p2.f11694i = q10;
                            p2.j = str2;
                            p2.f11695k = map;
                            p2.f11696l = i11;
                            p2.f11697m = i13;
                            p2.f11700p = i14;
                            if (S7.C.n(jI, p2) != aVar) {
                                str3 = str5;
                            }
                            return aVar;
                        }
                        str3 = str5;
                        cVar2 = q10.f11715c;
                        p2.f11693h = str3;
                        p2.f11694i = q10;
                        p2.j = str2;
                        p2.f11695k = map;
                        p2.f11696l = i11;
                        p2.f11697m = i13;
                        c9 = 2;
                        p2.f11700p = 2;
                        if (cVar2.a(p2) != aVar) {
                        }
                        return aVar;
                    }
                    if (i13 == 1) {
                        i13 = p2.f11697m;
                        i11 = p2.f11696l;
                        map = p2.f11695k;
                        str2 = p2.j;
                        q10 = p2.f11694i;
                        str3 = p2.f11693h;
                        com.google.common.util.concurrent.P.u0(obj);
                        cVar2 = q10.f11715c;
                        p2.f11693h = str3;
                        p2.f11694i = q10;
                        p2.j = str2;
                        p2.f11695k = map;
                        p2.f11696l = i11;
                        p2.f11697m = i13;
                        c9 = 2;
                        p2.f11700p = 2;
                        if (cVar2.a(p2) != aVar) {
                        }
                        return aVar;
                    }
                    try {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i15 = p2.f11697m;
                            int i16 = p2.f11696l;
                            java.util.Map map3 = p2.f11695k;
                            java.lang.String str6 = p2.j;
                            Y4.Q0 q12 = p2.f11694i;
                            java.lang.String str7 = p2.f11693h;
                            com.google.common.util.concurrent.P.u0(obj);
                            return obj;
                        }
                        i13 = p2.f11697m;
                        i11 = p2.f11696l;
                        map = p2.f11695k;
                        str2 = p2.j;
                        q10 = p2.f11694i;
                        str3 = p2.f11693h;
                        com.google.common.util.concurrent.P.u0(obj);
                        c9 = 2;
                    } catch (java.lang.Exception e9) {
                        e6 = e9;
                        c9 = 2;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    q10 = q11;
                    str2 = str4;
                    map = map2;
                    q10.getClass();
                    if (u(e6)) {
                    }
                    throw e6;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
            }
            q11 = q10;
            str4 = str2;
            map2 = map;
            p034d5.c cVar3 = q11.f11716d;
            Y4.O o8 = new Y4.O(q11, str4, str3, map2, null);
            p2.f11693h = str3;
            p2.f11694i = q11;
            p2.j = str4;
            p2.f11695k = map2;
            p2.f11696l = i11;
            p2.f11697m = i13;
            p2.f11700p = 3;
            java.lang.Object objB = cVar3.b(o8, p2);
            if (objB == aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:71|(1:(3:13|14|15)(2:20|21))(3:22|23|24))(1:26)|25|64|38|39|66|40|(1:42)(1:43)) */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[PHI: r4 r7 r8 r9 r10 r11 r12 r15
  0x0065: PHI (r4v8 int) = (r4v9 int), (r4v11 int) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r7v4 boolean) = (r7v5 boolean), (r7v8 boolean) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r8v3 int) = (r8v4 int), (r8v6 int) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r9v3 java.lang.String) = (r9v6 java.lang.String), (r9v8 java.lang.String) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r10v2 java.util.Map) = (r10v5 java.util.Map), (r10v8 java.util.Map) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r11v2 java.lang.String) = (r11v3 java.lang.String), (r11v5 java.lang.String) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r12v2 Y4.Q0) = (r12v5 Y4.Q0), (r12v7 Y4.Q0) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r15v1 char) = (r15v3 char), (r15v5 char) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0115, code lost:
    
        r9 = r12;
        r12 = r10;
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d4 -> B:69:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object h(int i3, p117n6.c cVar) {
        Y4.T t9;
        Y4.Q0 q9;
        java.lang.String str;
        Y4.Q0 q10;
        java.util.Map map;
        java.lang.String strB;
        int i9;
        char c9;
        boolean z6;
        java.lang.Exception e6;
        long jI;
        java.lang.Object objB;
        p034d5.c cVar2;
        if (cVar instanceof Y4.T) {
            t9 = (Y4.T) cVar;
            int i10 = t9.f11734p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t9.f11734p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                t9 = new Y4.T(q9, cVar);
            }
        } else {
            q9 = this;
            t9 = new Y4.T(q9, cVar);
        }
        java.lang.Object obj = t9.f11732n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = t9.f11734p;
        boolean z9 = true;
        try {
            try {
                try {
                    if (i11 != 0) {
                        if (i11 != 1) {
                            try {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i12 = t9.f11731m;
                                    int i13 = t9.f11730l;
                                    java.lang.String str2 = t9.f11729k;
                                    java.util.Map map2 = t9.j;
                                    java.lang.String str3 = t9.f11728i;
                                    Y4.Q0 q11 = t9.f11727h;
                                    com.google.common.util.concurrent.P.u0(obj);
                                    return obj;
                                }
                                i11 = t9.f11731m;
                                i9 = t9.f11730l;
                                strB = t9.f11729k;
                                map = t9.j;
                                str = t9.f11728i;
                                q10 = t9.f11727h;
                                com.google.common.util.concurrent.P.u0(obj);
                                c9 = 2;
                                z6 = true;
                            } catch (java.lang.Exception e9) {
                                e6 = e9;
                                c9 = 2;
                                z6 = true;
                                q10.getClass();
                                if (u(e6)) {
                                }
                                throw e6;
                            }
                        } else {
                            i11 = t9.f11731m;
                            i9 = t9.f11730l;
                            strB = t9.f11729k;
                            map = t9.j;
                            str = t9.f11728i;
                            q10 = t9.f11727h;
                            com.google.common.util.concurrent.P.u0(obj);
                        }
                        java.util.Map map3 = map;
                        Y4.Q0 q12 = q10;
                        java.lang.String str4 = strB;
                        p034d5.c cVar3 = q12.f11716d;
                        Y4.S s9 = new Y4.S(q12, str, str4, map3, null);
                        t9.f11727h = q12;
                        t9.f11728i = str;
                        t9.j = map3;
                        t9.f11729k = str4;
                        t9.f11730l = i9;
                        t9.f11731m = i11;
                        t9.f11734p = 3;
                        objB = cVar3.b(s9, t9);
                        if (objB != aVar) {
                            return aVar;
                        }
                        return objB;
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                    str = "/tv/" + i3 + "/external_ids";
                    q10 = q9;
                    map = p078i6.x.f23206h;
                    i11 = 0;
                    strB = b();
                    i9 = 2;
                    if (0 > 0) {
                        jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                        t9.f11727h = q10;
                        t9.f11728i = str;
                        t9.j = map;
                        t9.f11729k = strB;
                        t9.f11730l = i9;
                        t9.f11731m = i11;
                        z6 = true;
                        t9.f11734p = 1;
                        if (S7.C.n(jI, t9) != aVar) {
                        }
                        return aVar;
                    }
                    cVar2 = q10.f11715c;
                    t9.f11727h = q10;
                    t9.f11728i = str;
                    t9.j = map;
                    t9.f11729k = strB;
                    t9.f11730l = i9;
                    t9.f11731m = i11;
                    c9 = 2;
                    t9.f11734p = 2;
                    if (cVar2.a(t9) != aVar) {
                        java.util.Map map4 = map;
                        Y4.Q0 q13 = q10;
                        java.lang.String str5 = strB;
                        p034d5.c cVar4 = q13.f11716d;
                        Y4.S s10 = new Y4.S(q13, str, str5, map4, null);
                        t9.f11727h = q13;
                        t9.f11728i = str;
                        t9.j = map4;
                        t9.f11729k = str5;
                        t9.f11730l = i9;
                        t9.f11731m = i11;
                        t9.f11734p = 3;
                        objB = cVar4.b(s10, t9);
                        if (objB != aVar) {
                            return objB;
                        }
                    }
                    return aVar;
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    c9 = 2;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
                q10.getClass();
                if (u(e6) || i11 >= i9) {
                    throw e6;
                }
                int i14 = i11 + 1;
                B2.a.w(B2.a.q(i14, e6.getMessage(), " on ", str, ", retry "), "/", i9, "TMDBApiClient");
                if (i11 == i9) {
                    throw e6;
                }
                z9 = z6;
                i11 = i14;
                if (i11 > 0) {
                    jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                    t9.f11727h = q10;
                    t9.f11728i = str;
                    t9.j = map;
                    t9.f11729k = strB;
                    t9.f11730l = i9;
                    t9.f11731m = i11;
                    z6 = true;
                    t9.f11734p = 1;
                    if (S7.C.n(jI, t9) != aVar) {
                    }
                    return aVar;
                }
                z6 = z9;
                cVar2 = q10.f11715c;
                t9.f11727h = q10;
                t9.f11728i = str;
                t9.j = map;
                t9.f11729k = strB;
                t9.f11730l = i9;
                t9.f11731m = i11;
                c9 = 2;
                t9.f11734p = 2;
                if (cVar2.a(t9) != aVar) {
                    java.util.Map map5 = map;
                    Y4.Q0 q14 = q10;
                    java.lang.String str6 = strB;
                    p034d5.c cVar5 = q14.f11716d;
                    Y4.S s11 = new Y4.S(q14, str, str6, map5, null);
                    t9.f11727h = q14;
                    t9.f11728i = str;
                    t9.j = map5;
                    t9.f11729k = str6;
                    t9.f11730l = i9;
                    t9.f11731m = i11;
                    t9.f11734p = 3;
                    objB = cVar5.b(s11, t9);
                    if (objB != aVar) {
                        return objB;
                    }
                }
                return aVar;
            }
            z6 = z9;
            cVar2 = q10.f11715c;
            t9.f11727h = q10;
            t9.f11728i = str;
            t9.j = map;
            t9.f11729k = strB;
            t9.f11730l = i9;
            t9.f11731m = i11;
            c9 = 2;
            t9.f11734p = 2;
            if (cVar2.a(t9) != aVar) {
                java.util.Map map6 = map;
                Y4.Q0 q15 = q10;
                java.lang.String str7 = strB;
                p034d5.c cVar6 = q15.f11716d;
                Y4.S s12 = new Y4.S(q15, str, str7, map6, null);
                t9.f11727h = q15;
                t9.f11728i = str;
                t9.j = map6;
                t9.f11729k = str7;
                t9.f11730l = i9;
                t9.f11731m = i11;
                t9.f11734p = 3;
                objB = cVar6.b(s12, t9);
                if (objB != aVar) {
                    return objB;
                }
            }
            return aVar;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:27|38|85|40|41|90|42|(0)|54) */
    /* JADX WARN: Code duplicated, block: B:26:0x0069 A[PHI: r5 r9 r10 r11 r12 r13 r15
  0x0069: PHI (r5v13 int) = (r5v14 int), (r5v17 int) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r9v7 int) = (r9v8 int), (r9v11 int) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r10v9 java.lang.String) = (r10v15 java.lang.String), (r10v18 java.lang.String) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r11v11 Y4.Q0) = (r11v17 Y4.Q0), (r11v20 Y4.Q0) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r12v9 java.util.Map) = (r12v10 java.util.Map), (r12v14 java.util.Map) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r13v3 java.lang.String) = (r13v8 java.lang.String), (r13v10 java.lang.String) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r15v2 char) = (r15v4 char), (r15v6 char) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f7 -> B:38:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0103 -> B:85:0x010d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object i(int i3, java.lang.String str, java.lang.String str2, p117n6.c cVar) throws java.lang.Exception {
        Y4.W w6;
        Y4.Q0 q9;
        int i9;
        java.lang.String str3;
        java.util.Map mapB;
        Y4.Q0 q10;
        java.lang.String strL;
        int i10;
        char c9;
        java.lang.Exception e6;
        int i11;
        java.util.Map map;
        java.lang.String str4;
        Y4.Q0 q11;
        java.lang.String str5;
        java.util.Map map2;
        long jI;
        java.util.Map map3;
        java.lang.String str6;
        int i12;
        java.lang.String str7;
        java.lang.String str8;
        java.util.Map map4;
        java.lang.String str9;
        java.lang.String str10;
        Y4.Q0 q12;
        java.lang.Object objB;
        p034d5.c cVar2;
        if (cVar instanceof Y4.W) {
            w6 = (Y4.W) cVar;
            int i13 = w6.f11767p;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                w6.f11767p = i13 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                w6 = new Y4.W(q9, cVar);
            }
        } else {
            q9 = this;
            w6 = new Y4.W(q9, cVar);
        }
        java.lang.Object obj = w6.f11765n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = w6.f11767p;
        int i15 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                if (i14 == 0) {
                                    com.google.common.util.concurrent.P.u0(obj);
                                    p086j6.e eVar = new p086j6.e();
                                    eVar.put("append_to_response", str2);
                                    i9 = 0;
                                    if (O7.q.B0(str2, io.sentry.protocol.DebugMeta.JsonKeys.IMAGES, false)) {
                                        str3 = str;
                                        eVar.put("include_image_language", O7.q.p1(2, str3).concat(",en,null"));
                                    } else {
                                        str3 = str;
                                    }
                                    mapB = eVar.b();
                                    q10 = q9;
                                    strL = com.google.android.gms.internal.play_billing.M0.l(i3, "/movie/");
                                    i10 = 2;
                                    if (i9 > 0) {
                                        map2 = mapB;
                                        jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i9 - 1)) * 1000);
                                        w6.f11760h = str3;
                                        w6.f11761i = map2;
                                        w6.j = q10;
                                        w6.f11762k = strL;
                                        w6.f11763l = i10;
                                        w6.f11764m = i9;
                                        w6.f11767p = i15;
                                        if (S7.C.n(jI, w6) != aVar) {
                                            map3 = map2;
                                            str6 = str3;
                                            i12 = i9;
                                            str7 = strL;
                                            str4 = str6;
                                            map = map3;
                                            q11 = q10;
                                            str5 = str7;
                                            i11 = i10;
                                            i14 = i12;
                                            cVar2 = q11.f11715c;
                                            w6.f11760h = str4;
                                            w6.f11761i = map;
                                            w6.j = q11;
                                            w6.f11762k = str5;
                                            w6.f11763l = i11;
                                            w6.f11764m = i14;
                                            c9 = 2;
                                            w6.f11767p = 2;
                                            if (cVar2.a(w6) != aVar) {
                                            }
                                        }
                                    } else {
                                        java.util.Map map5 = mapB;
                                        int i16 = i9;
                                        i11 = i10;
                                        i14 = i16;
                                        map = map5;
                                        str4 = str3;
                                        q11 = q10;
                                        str5 = strL;
                                        cVar2 = q11.f11715c;
                                        w6.f11760h = str4;
                                        w6.f11761i = map;
                                        w6.j = q11;
                                        w6.f11762k = str5;
                                        w6.f11763l = i11;
                                        w6.f11764m = i14;
                                        c9 = 2;
                                        w6.f11767p = 2;
                                        if (cVar2.a(w6) != aVar) {
                                        }
                                    }
                                    return aVar;
                                }
                                if (i14 == 1) {
                                    i12 = w6.f11764m;
                                    i10 = w6.f11763l;
                                    str7 = w6.f11762k;
                                    q10 = w6.j;
                                    map3 = w6.f11761i;
                                    str6 = w6.f11760h;
                                    com.google.common.util.concurrent.P.u0(obj);
                                    str4 = str6;
                                    map = map3;
                                    q11 = q10;
                                    str5 = str7;
                                    i11 = i10;
                                    i14 = i12;
                                    cVar2 = q11.f11715c;
                                    w6.f11760h = str4;
                                    w6.f11761i = map;
                                    w6.j = q11;
                                    w6.f11762k = str5;
                                    w6.f11763l = i11;
                                    w6.f11764m = i14;
                                    c9 = 2;
                                    w6.f11767p = 2;
                                    if (cVar2.a(w6) != aVar) {
                                    }
                                    return aVar;
                                }
                                try {
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        int i17 = w6.f11764m;
                                        int i18 = w6.f11763l;
                                        java.lang.String str11 = w6.f11762k;
                                        Y4.Q0 q13 = w6.j;
                                        java.util.Map map6 = w6.f11761i;
                                        java.lang.String str12 = w6.f11760h;
                                        com.google.common.util.concurrent.P.u0(obj);
                                        return obj;
                                    }
                                    i14 = w6.f11764m;
                                    i11 = w6.f11763l;
                                    str5 = w6.f11762k;
                                    q11 = w6.j;
                                    map = w6.f11761i;
                                    str4 = w6.f11760h;
                                    com.google.common.util.concurrent.P.u0(obj);
                                    c9 = 2;
                                } catch (java.lang.Exception e9) {
                                    e6 = e9;
                                    c9 = 2;
                                    strL = str5;
                                    q10 = q11;
                                    mapB = map;
                                    q10.getClass();
                                    if (u(e6)) {
                                    }
                                    throw e6;
                                }
                            } catch (java.lang.Exception e10) {
                                e6 = e10;
                            }
                        } catch (java.lang.Exception e11) {
                            e6 = e11;
                            strL = str10;
                            q10 = q11;
                            mapB = map4;
                            q10.getClass();
                            if (u(e6)) {
                            }
                            throw e6;
                        }
                    } catch (java.lang.Exception e12) {
                        e6 = e12;
                        strL = str10;
                        q10 = q11;
                        mapB = map4;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e13) {
                    e6 = e13;
                }
            } catch (java.lang.Exception e14) {
                e6 = e14;
                q11 = q12;
                str10 = str8;
                str4 = str9;
                strL = str10;
                q10 = q11;
                mapB = map4;
                q10.getClass();
                if (u(e6) || i14 >= i11) {
                    throw e6;
                }
                int i19 = i14 + 1;
                B2.a.w(B2.a.q(i19, e6.getMessage(), " on ", strL, ", retry "), "/", i11, "TMDBApiClient");
                if (i14 == i11) {
                    throw e6;
                }
                i10 = i11;
                i9 = i19;
                str3 = str4;
                i15 = 1;
                if (i9 > 0) {
                    map2 = mapB;
                    jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i9 - 1)) * 1000);
                    w6.f11760h = str3;
                    w6.f11761i = map2;
                    w6.j = q10;
                    w6.f11762k = strL;
                    w6.f11763l = i10;
                    w6.f11764m = i9;
                    w6.f11767p = i15;
                    if (S7.C.n(jI, w6) != aVar) {
                        map3 = map2;
                        str6 = str3;
                        i12 = i9;
                        str7 = strL;
                        str4 = str6;
                        map = map3;
                        q11 = q10;
                        str5 = str7;
                        i11 = i10;
                        i14 = i12;
                        cVar2 = q11.f11715c;
                        w6.f11760h = str4;
                        w6.f11761i = map;
                        w6.j = q11;
                        w6.f11762k = str5;
                        w6.f11763l = i11;
                        w6.f11764m = i14;
                        c9 = 2;
                        w6.f11767p = 2;
                        if (cVar2.a(w6) != aVar) {
                            str8 = str5;
                            map4 = map;
                            str9 = str4;
                            p034d5.c cVar3 = q11.f11716d;
                            q12 = q11;
                            Y4.V v6 = new Y4.V(q12, str8, str9, map4, null);
                            str10 = str8;
                            str4 = str9;
                            w6.f11760h = str4;
                            w6.f11761i = map4;
                            w6.j = q11;
                            w6.f11762k = str10;
                            w6.f11763l = i11;
                            w6.f11764m = i14;
                            w6.f11767p = 3;
                            objB = cVar3.b(v6, w6);
                            if (objB == aVar) {
                                return objB;
                            }
                        }
                    }
                } else {
                    java.util.Map map7 = mapB;
                    int i110 = i9;
                    i11 = i10;
                    i14 = i110;
                    map = map7;
                    str4 = str3;
                    q11 = q10;
                    str5 = strL;
                    cVar2 = q11.f11715c;
                    w6.f11760h = str4;
                    w6.f11761i = map;
                    w6.j = q11;
                    w6.f11762k = str5;
                    w6.f11763l = i11;
                    w6.f11764m = i14;
                    c9 = 2;
                    w6.f11767p = 2;
                    if (cVar2.a(w6) != aVar) {
                        str8 = str5;
                        map4 = map;
                        str9 = str4;
                        p034d5.c cVar4 = q11.f11716d;
                        q12 = q11;
                        Y4.V v9 = new Y4.V(q12, str8, str9, map4, null);
                        str10 = str8;
                        str4 = str9;
                        w6.f11760h = str4;
                        w6.f11761i = map4;
                        w6.j = q11;
                        w6.f11762k = str10;
                        w6.f11763l = i11;
                        w6.f11764m = i14;
                        w6.f11767p = 3;
                        objB = cVar4.b(v9, w6);
                        if (objB == aVar) {
                            return objB;
                        }
                    }
                }
                return aVar;
            }
            str8 = str5;
            map4 = map;
            str9 = str4;
            p034d5.c cVar5 = q11.f11716d;
            q12 = q11;
            Y4.V v10 = new Y4.V(q12, str8, str9, map4, null);
            str10 = str8;
            str4 = str9;
            w6.f11760h = str4;
            w6.f11761i = map4;
            w6.j = q11;
            w6.f11762k = str10;
            w6.f11763l = i11;
            w6.f11764m = i14;
            w6.f11767p = 3;
            objB = cVar5.b(v10, w6);
            if (objB == aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e15) {
            throw e15;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|70|33|34|63|35|(6:25|65|38|39|67|40)|42) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:22|23|24|25|65|38|39|67|40) */
    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[PHI: r4 r8 r9 r10 r11 r12 r15
  0x0063: PHI (r4v9 int) = (r4v10 int), (r4v11 int) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r8v4 int) = (r8v5 int), (r8v6 int) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r9v3 java.util.Map) = (r9v7 java.util.Map), (r9v9 java.util.Map) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r10v3 java.lang.String) = (r10v6 java.lang.String), (r10v7 java.lang.String) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r11v3 Y4.Q0) = (r11v6 Y4.Q0), (r11v7 Y4.Q0) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r12v11 java.lang.String) = (r12v12 java.lang.String), (r12v13 java.lang.String) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r15v1 char) = (r15v3 char), (r15v5 char) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
    
        if (r0 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        r11 = r13;
        r10 = r11;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r10, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0144, code lost:
    
        if (r4 != r8) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0146, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d3, code lost:
    
        r12 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object j(int i3, java.lang.String str, p117n6.c cVar) throws java.lang.Exception {
        Y4.Z z6;
        Y4.Q0 q9;
        java.lang.String str2;
        Y4.Q0 q10;
        java.util.Map map;
        int i9;
        java.lang.String str3;
        char c9;
        p034d5.c cVar2;
        if (cVar instanceof Y4.Z) {
            z6 = (Y4.Z) cVar;
            int i10 = z6.f11795p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                z6.f11795p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                z6 = new Y4.Z(q9, cVar);
            }
        } else {
            q9 = this;
            z6 = new Y4.Z(q9, cVar);
        }
        java.lang.Object objB = z6.f11793n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = z6.f11795p;
        int i12 = 1;
        try {
            if (i11 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                str2 = "/movie/" + i3 + "/recommendations";
                q10 = q9;
                map = p078i6.x.f23206h;
                i11 = 0;
                java.lang.String str4 = str;
                i9 = 2;
                if (i11 > 0) {
                    long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                    z6.f11788h = str4;
                    z6.f11789i = q10;
                    z6.j = str2;
                    z6.f11790k = map;
                    z6.f11791l = i9;
                    z6.f11792m = i11;
                    z6.f11795p = i12;
                    if (S7.C.n(jI, z6) != aVar) {
                        str3 = str4;
                    }
                    return aVar;
                }
                str3 = str4;
                cVar2 = q10.f11715c;
                z6.f11788h = str3;
                z6.f11789i = q10;
                z6.j = str2;
                z6.f11790k = map;
                z6.f11791l = i9;
                z6.f11792m = i11;
                c9 = 2;
                z6.f11795p = 2;
                if (cVar2.a(z6) != aVar) {
                    Y4.Q0 q11 = q10;
                    java.lang.String str5 = str2;
                    java.util.Map map2 = map;
                    p034d5.c cVar3 = q11.f11716d;
                    Y4.Y y = new Y4.Y(q11, str5, str3, map2, null);
                    z6.f11788h = str3;
                    z6.f11789i = q11;
                    z6.j = str5;
                    z6.f11790k = map2;
                    z6.f11791l = i9;
                    z6.f11792m = i11;
                    z6.f11795p = 3;
                    objB = cVar3.b(y, z6);
                }
                return aVar;
            }
            if (i11 == 1) {
                i11 = z6.f11792m;
                i9 = z6.f11791l;
                map = z6.f11790k;
                str2 = z6.j;
                q10 = z6.f11789i;
                str3 = z6.f11788h;
                com.google.common.util.concurrent.P.u0(objB);
                cVar2 = q10.f11715c;
                z6.f11788h = str3;
                z6.f11789i = q10;
                z6.j = str2;
                z6.f11790k = map;
                z6.f11791l = i9;
                z6.f11792m = i11;
                c9 = 2;
                z6.f11795p = 2;
                if (cVar2.a(z6) != aVar) {
                    Y4.Q0 q12 = q10;
                    java.lang.String str6 = str2;
                    java.util.Map map3 = map;
                    p034d5.c cVar4 = q12.f11716d;
                    Y4.Y y9 = new Y4.Y(q12, str6, str3, map3, null);
                    z6.f11788h = str3;
                    z6.f11789i = q12;
                    z6.j = str6;
                    z6.f11790k = map3;
                    z6.f11791l = i9;
                    z6.f11792m = i11;
                    z6.f11795p = 3;
                    objB = cVar4.b(y9, z6);
                }
                return aVar;
            }
            try {
                if (i11 == 2) {
                    i11 = z6.f11792m;
                    i9 = z6.f11791l;
                    map = z6.f11790k;
                    str2 = z6.j;
                    q10 = z6.f11789i;
                    str3 = z6.f11788h;
                    com.google.common.util.concurrent.P.u0(objB);
                    c9 = 2;
                    Y4.Q0 q13 = q10;
                    java.lang.String str7 = str2;
                    java.util.Map map4 = map;
                    p034d5.c cVar5 = q13.f11716d;
                    Y4.Y y10 = new Y4.Y(q13, str7, str3, map4, null);
                    z6.f11788h = str3;
                    z6.f11789i = q13;
                    z6.j = str7;
                    z6.f11790k = map4;
                    z6.f11791l = i9;
                    z6.f11792m = i11;
                    z6.f11795p = 3;
                    objB = cVar5.b(y10, z6);
                } else {
                    if (i11 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = z6.f11792m;
                    int i14 = z6.f11791l;
                    java.util.Map map5 = z6.f11790k;
                    java.lang.String str8 = z6.j;
                    Y4.Q0 q14 = z6.f11789i;
                    java.lang.String str9 = z6.f11788h;
                    com.google.common.util.concurrent.P.u0(objB);
                }
            } catch (java.lang.Exception e6) {
                java.lang.Exception e9 = e6;
                c9 = 2;
                q10.getClass();
                if (u(e9)) {
                }
                throw e9;
            }
            return ((com.kiptv.core.model.TMDBRecommendationsResponse) objB).f20274b;
        } catch (java.util.concurrent.CancellationException e10) {
            throw e10;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|70|33|34|63|35|(6:25|65|38|39|67|40)|42) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:22|23|24|25|65|38|39|67|40) */
    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[PHI: r4 r8 r9 r10 r11 r12 r15
  0x0063: PHI (r4v9 int) = (r4v10 int), (r4v11 int) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r8v4 int) = (r8v5 int), (r8v6 int) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r9v3 java.util.Map) = (r9v7 java.util.Map), (r9v9 java.util.Map) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r10v3 java.lang.String) = (r10v6 java.lang.String), (r10v7 java.lang.String) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r11v3 Y4.Q0) = (r11v6 Y4.Q0), (r11v7 Y4.Q0) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r12v11 java.lang.String) = (r12v12 java.lang.String), (r12v13 java.lang.String) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r15v1 char) = (r15v3 char), (r15v5 char) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
    
        if (r0 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        r11 = r13;
        r10 = r11;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r10, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0144, code lost:
    
        if (r4 != r8) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0146, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d3, code lost:
    
        r12 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object k(int i3, java.lang.String str, p117n6.c cVar) throws java.lang.Exception {
        Y4.C1060c0 c1060c0;
        Y4.Q0 q9;
        java.lang.String str2;
        Y4.Q0 q10;
        java.util.Map map;
        int i9;
        java.lang.String str3;
        char c9;
        p034d5.c cVar2;
        if (cVar instanceof Y4.C1060c0) {
            c1060c0 = (Y4.C1060c0) cVar;
            int i10 = c1060c0.f11834p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1060c0.f11834p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                c1060c0 = new Y4.C1060c0(q9, cVar);
            }
        } else {
            q9 = this;
            c1060c0 = new Y4.C1060c0(q9, cVar);
        }
        java.lang.Object objB = c1060c0.f11832n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1060c0.f11834p;
        int i12 = 1;
        try {
            if (i11 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                str2 = "/movie/" + i3 + "/videos";
                q10 = q9;
                map = p078i6.x.f23206h;
                i11 = 0;
                java.lang.String str4 = str;
                i9 = 2;
                if (i11 > 0) {
                    long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                    c1060c0.f11827h = str4;
                    c1060c0.f11828i = q10;
                    c1060c0.j = str2;
                    c1060c0.f11829k = map;
                    c1060c0.f11830l = i9;
                    c1060c0.f11831m = i11;
                    c1060c0.f11834p = i12;
                    if (S7.C.n(jI, c1060c0) != aVar) {
                        str3 = str4;
                    }
                    return aVar;
                }
                str3 = str4;
                cVar2 = q10.f11715c;
                c1060c0.f11827h = str3;
                c1060c0.f11828i = q10;
                c1060c0.j = str2;
                c1060c0.f11829k = map;
                c1060c0.f11830l = i9;
                c1060c0.f11831m = i11;
                c9 = 2;
                c1060c0.f11834p = 2;
                if (cVar2.a(c1060c0) != aVar) {
                    Y4.Q0 q11 = q10;
                    java.lang.String str5 = str2;
                    java.util.Map map2 = map;
                    p034d5.c cVar3 = q11.f11716d;
                    Y4.C1056b0 c1056b0 = new Y4.C1056b0(q11, str5, str3, map2, null);
                    c1060c0.f11827h = str3;
                    c1060c0.f11828i = q11;
                    c1060c0.j = str5;
                    c1060c0.f11829k = map2;
                    c1060c0.f11830l = i9;
                    c1060c0.f11831m = i11;
                    c1060c0.f11834p = 3;
                    objB = cVar3.b(c1056b0, c1060c0);
                }
                return aVar;
            }
            if (i11 == 1) {
                i11 = c1060c0.f11831m;
                i9 = c1060c0.f11830l;
                map = c1060c0.f11829k;
                str2 = c1060c0.j;
                q10 = c1060c0.f11828i;
                str3 = c1060c0.f11827h;
                com.google.common.util.concurrent.P.u0(objB);
                cVar2 = q10.f11715c;
                c1060c0.f11827h = str3;
                c1060c0.f11828i = q10;
                c1060c0.j = str2;
                c1060c0.f11829k = map;
                c1060c0.f11830l = i9;
                c1060c0.f11831m = i11;
                c9 = 2;
                c1060c0.f11834p = 2;
                if (cVar2.a(c1060c0) != aVar) {
                    Y4.Q0 q12 = q10;
                    java.lang.String str6 = str2;
                    java.util.Map map3 = map;
                    p034d5.c cVar4 = q12.f11716d;
                    Y4.C1056b0 c1056b1 = new Y4.C1056b0(q12, str6, str3, map3, null);
                    c1060c0.f11827h = str3;
                    c1060c0.f11828i = q12;
                    c1060c0.j = str6;
                    c1060c0.f11829k = map3;
                    c1060c0.f11830l = i9;
                    c1060c0.f11831m = i11;
                    c1060c0.f11834p = 3;
                    objB = cVar4.b(c1056b1, c1060c0);
                }
                return aVar;
            }
            try {
                if (i11 == 2) {
                    i11 = c1060c0.f11831m;
                    i9 = c1060c0.f11830l;
                    map = c1060c0.f11829k;
                    str2 = c1060c0.j;
                    q10 = c1060c0.f11828i;
                    str3 = c1060c0.f11827h;
                    com.google.common.util.concurrent.P.u0(objB);
                    c9 = 2;
                    Y4.Q0 q13 = q10;
                    java.lang.String str7 = str2;
                    java.util.Map map4 = map;
                    p034d5.c cVar5 = q13.f11716d;
                    Y4.C1056b0 c1056b2 = new Y4.C1056b0(q13, str7, str3, map4, null);
                    c1060c0.f11827h = str3;
                    c1060c0.f11828i = q13;
                    c1060c0.j = str7;
                    c1060c0.f11829k = map4;
                    c1060c0.f11830l = i9;
                    c1060c0.f11831m = i11;
                    c1060c0.f11834p = 3;
                    objB = cVar5.b(c1056b2, c1060c0);
                } else {
                    if (i11 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = c1060c0.f11831m;
                    int i14 = c1060c0.f11830l;
                    java.util.Map map5 = c1060c0.f11829k;
                    java.lang.String str8 = c1060c0.j;
                    Y4.Q0 q14 = c1060c0.f11828i;
                    java.lang.String str9 = c1060c0.f11827h;
                    com.google.common.util.concurrent.P.u0(objB);
                }
            } catch (java.lang.Exception e6) {
                java.lang.Exception e9 = e6;
                c9 = 2;
                q10.getClass();
                if (u(e9)) {
                }
                throw e9;
            }
            return ((com.kiptv.core.model.TMDBVideosResponse) objB).f20350b;
        } catch (java.util.concurrent.CancellationException e10) {
            throw e10;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:71|(1:(3:13|14|15)(2:20|21))(3:22|23|24))(1:26)|25|64|38|39|66|40|(1:42)(1:43)) */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[PHI: r4 r7 r8 r9 r10 r11 r12 r15
  0x0065: PHI (r4v8 int) = (r4v9 int), (r4v11 int) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r7v4 boolean) = (r7v5 boolean), (r7v8 boolean) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r8v3 int) = (r8v4 int), (r8v6 int) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r9v3 java.lang.String) = (r9v6 java.lang.String), (r9v8 java.lang.String) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r10v2 java.util.Map) = (r10v5 java.util.Map), (r10v8 java.util.Map) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r11v2 java.lang.String) = (r11v3 java.lang.String), (r11v5 java.lang.String) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r12v2 Y4.Q0) = (r12v5 Y4.Q0), (r12v7 Y4.Q0) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r15v1 char) = (r15v3 char), (r15v5 char) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0115, code lost:
    
        r9 = r12;
        r12 = r10;
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d4 -> B:69:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(int i3, p117n6.c cVar) {
        Y4.C1072f0 c1072f0;
        Y4.Q0 q9;
        java.lang.String str;
        Y4.Q0 q10;
        java.util.Map map;
        java.lang.String strB;
        int i9;
        char c9;
        boolean z6;
        java.lang.Exception e6;
        long jI;
        java.lang.Object objB;
        p034d5.c cVar2;
        if (cVar instanceof Y4.C1072f0) {
            c1072f0 = (Y4.C1072f0) cVar;
            int i10 = c1072f0.f11880p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1072f0.f11880p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                c1072f0 = new Y4.C1072f0(q9, cVar);
            }
        } else {
            q9 = this;
            c1072f0 = new Y4.C1072f0(q9, cVar);
        }
        java.lang.Object obj = c1072f0.f11878n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1072f0.f11880p;
        boolean z9 = true;
        try {
            try {
                try {
                    if (i11 != 0) {
                        if (i11 != 1) {
                            try {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i12 = c1072f0.f11877m;
                                    int i13 = c1072f0.f11876l;
                                    java.lang.String str2 = c1072f0.f11875k;
                                    java.util.Map map2 = c1072f0.j;
                                    java.lang.String str3 = c1072f0.f11874i;
                                    Y4.Q0 q11 = c1072f0.f11873h;
                                    com.google.common.util.concurrent.P.u0(obj);
                                    return obj;
                                }
                                i11 = c1072f0.f11877m;
                                i9 = c1072f0.f11876l;
                                strB = c1072f0.f11875k;
                                map = c1072f0.j;
                                str = c1072f0.f11874i;
                                q10 = c1072f0.f11873h;
                                com.google.common.util.concurrent.P.u0(obj);
                                c9 = 2;
                                z6 = true;
                            } catch (java.lang.Exception e9) {
                                e6 = e9;
                                c9 = 2;
                                z6 = true;
                                q10.getClass();
                                if (u(e6)) {
                                }
                                throw e6;
                            }
                        } else {
                            i11 = c1072f0.f11877m;
                            i9 = c1072f0.f11876l;
                            strB = c1072f0.f11875k;
                            map = c1072f0.j;
                            str = c1072f0.f11874i;
                            q10 = c1072f0.f11873h;
                            com.google.common.util.concurrent.P.u0(obj);
                        }
                        java.util.Map map3 = map;
                        Y4.Q0 q12 = q10;
                        java.lang.String str4 = strB;
                        p034d5.c cVar3 = q12.f11716d;
                        Y4.C1068e0 c1068e0 = new Y4.C1068e0(q12, str, str4, map3, null);
                        c1072f0.f11873h = q12;
                        c1072f0.f11874i = str;
                        c1072f0.j = map3;
                        c1072f0.f11875k = str4;
                        c1072f0.f11876l = i9;
                        c1072f0.f11877m = i11;
                        c1072f0.f11880p = 3;
                        objB = cVar3.b(c1068e0, c1072f0);
                        if (objB != aVar) {
                            return aVar;
                        }
                        return objB;
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                    str = "/movie/" + i3 + "/watch/providers";
                    q10 = q9;
                    map = p078i6.x.f23206h;
                    i11 = 0;
                    strB = b();
                    i9 = 2;
                    if (0 > 0) {
                        jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                        c1072f0.f11873h = q10;
                        c1072f0.f11874i = str;
                        c1072f0.j = map;
                        c1072f0.f11875k = strB;
                        c1072f0.f11876l = i9;
                        c1072f0.f11877m = i11;
                        z6 = true;
                        c1072f0.f11880p = 1;
                        if (S7.C.n(jI, c1072f0) != aVar) {
                        }
                        return aVar;
                    }
                    cVar2 = q10.f11715c;
                    c1072f0.f11873h = q10;
                    c1072f0.f11874i = str;
                    c1072f0.j = map;
                    c1072f0.f11875k = strB;
                    c1072f0.f11876l = i9;
                    c1072f0.f11877m = i11;
                    c9 = 2;
                    c1072f0.f11880p = 2;
                    if (cVar2.a(c1072f0) != aVar) {
                        java.util.Map map4 = map;
                        Y4.Q0 q13 = q10;
                        java.lang.String str5 = strB;
                        p034d5.c cVar4 = q13.f11716d;
                        Y4.C1068e0 c1068e1 = new Y4.C1068e0(q13, str, str5, map4, null);
                        c1072f0.f11873h = q13;
                        c1072f0.f11874i = str;
                        c1072f0.j = map4;
                        c1072f0.f11875k = str5;
                        c1072f0.f11876l = i9;
                        c1072f0.f11877m = i11;
                        c1072f0.f11880p = 3;
                        objB = cVar4.b(c1068e1, c1072f0);
                        if (objB != aVar) {
                            return objB;
                        }
                    }
                    return aVar;
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    c9 = 2;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
                q10.getClass();
                if (u(e6) || i11 >= i9) {
                    throw e6;
                }
                int i14 = i11 + 1;
                B2.a.w(B2.a.q(i14, e6.getMessage(), " on ", str, ", retry "), "/", i9, "TMDBApiClient");
                if (i11 == i9) {
                    throw e6;
                }
                z9 = z6;
                i11 = i14;
                if (i11 > 0) {
                    jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                    c1072f0.f11873h = q10;
                    c1072f0.f11874i = str;
                    c1072f0.j = map;
                    c1072f0.f11875k = strB;
                    c1072f0.f11876l = i9;
                    c1072f0.f11877m = i11;
                    z6 = true;
                    c1072f0.f11880p = 1;
                    if (S7.C.n(jI, c1072f0) != aVar) {
                    }
                    return aVar;
                }
                z6 = z9;
                cVar2 = q10.f11715c;
                c1072f0.f11873h = q10;
                c1072f0.f11874i = str;
                c1072f0.j = map;
                c1072f0.f11875k = strB;
                c1072f0.f11876l = i9;
                c1072f0.f11877m = i11;
                c9 = 2;
                c1072f0.f11880p = 2;
                if (cVar2.a(c1072f0) != aVar) {
                    java.util.Map map5 = map;
                    Y4.Q0 q14 = q10;
                    java.lang.String str6 = strB;
                    p034d5.c cVar5 = q14.f11716d;
                    Y4.C1068e0 c1068e2 = new Y4.C1068e0(q14, str, str6, map5, null);
                    c1072f0.f11873h = q14;
                    c1072f0.f11874i = str;
                    c1072f0.j = map5;
                    c1072f0.f11875k = str6;
                    c1072f0.f11876l = i9;
                    c1072f0.f11877m = i11;
                    c1072f0.f11880p = 3;
                    objB = cVar5.b(c1068e2, c1072f0);
                    if (objB != aVar) {
                        return objB;
                    }
                }
                return aVar;
            }
            z6 = z9;
            cVar2 = q10.f11715c;
            c1072f0.f11873h = q10;
            c1072f0.f11874i = str;
            c1072f0.j = map;
            c1072f0.f11875k = strB;
            c1072f0.f11876l = i9;
            c1072f0.f11877m = i11;
            c9 = 2;
            c1072f0.f11880p = 2;
            if (cVar2.a(c1072f0) != aVar) {
                java.util.Map map6 = map;
                Y4.Q0 q15 = q10;
                java.lang.String str7 = strB;
                p034d5.c cVar6 = q15.f11716d;
                Y4.C1068e0 c1068e3 = new Y4.C1068e0(q15, str, str7, map6, null);
                c1072f0.f11873h = q15;
                c1072f0.f11874i = str;
                c1072f0.j = map6;
                c1072f0.f11875k = str7;
                c1072f0.f11876l = i9;
                c1072f0.f11877m = i11;
                c1072f0.f11880p = 3;
                objB = cVar6.b(c1068e3, c1072f0);
                if (objB != aVar) {
                    return objB;
                }
            }
            return aVar;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|64|35|36|66|37|(0)|44) */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:45:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r9, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0141, code lost:
    
        if (r4 != r8) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m(int i3, java.lang.String str, java.lang.String str2, p117n6.c cVar) throws java.lang.Exception {
        Y4.C1082i0 c1082i0;
        Y4.Q0 q9;
        java.util.Map mapJ0;
        Y4.Q0 q10;
        java.lang.String strL;
        int i9;
        java.lang.String str3;
        char c9;
        java.lang.Exception e6;
        java.util.Map map;
        java.lang.String str4;
        p034d5.c cVar2;
        if (cVar instanceof Y4.C1082i0) {
            c1082i0 = (Y4.C1082i0) cVar;
            int i10 = c1082i0.f11940p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1082i0.f11940p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                c1082i0 = new Y4.C1082i0(q9, cVar);
            }
        } else {
            q9 = this;
            c1082i0 = new Y4.C1082i0(q9, cVar);
        }
        java.lang.Object obj = c1082i0.f11938n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1082i0.f11940p;
        int i12 = 1;
        try {
            try {
                try {
                    if (i11 == 0) {
                        com.google.common.util.concurrent.P.u0(obj);
                        mapJ0 = p078i6.D.J0(new p070h6.k("append_to_response", str2));
                        q10 = q9;
                        strL = com.google.android.gms.internal.play_billing.M0.l(i3, "/person/");
                        i11 = 0;
                        java.lang.String str5 = str;
                        i9 = 2;
                        if (i11 > 0) {
                            java.util.Map map2 = mapJ0;
                            long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                            c1082i0.f11933h = str5;
                            c1082i0.f11934i = map2;
                            c1082i0.j = q10;
                            c1082i0.f11935k = strL;
                            c1082i0.f11936l = i9;
                            c1082i0.f11937m = i11;
                            c1082i0.f11940p = i12;
                            if (S7.C.n(jI, c1082i0) != aVar) {
                                mapJ0 = map2;
                                str3 = str5;
                            }
                            return aVar;
                        }
                        str3 = str5;
                        cVar2 = q10.f11715c;
                        c1082i0.f11933h = str3;
                        c1082i0.f11934i = mapJ0;
                        c1082i0.j = q10;
                        c1082i0.f11935k = strL;
                        c1082i0.f11936l = i9;
                        c1082i0.f11937m = i11;
                        c9 = 2;
                        c1082i0.f11940p = 2;
                        if (cVar2.a(c1082i0) != aVar) {
                        }
                        return aVar;
                    }
                    if (i11 == 1) {
                        i11 = c1082i0.f11937m;
                        i9 = c1082i0.f11936l;
                        strL = c1082i0.f11935k;
                        q10 = c1082i0.j;
                        mapJ0 = c1082i0.f11934i;
                        str3 = c1082i0.f11933h;
                        com.google.common.util.concurrent.P.u0(obj);
                        cVar2 = q10.f11715c;
                        c1082i0.f11933h = str3;
                        c1082i0.f11934i = mapJ0;
                        c1082i0.j = q10;
                        c1082i0.f11935k = strL;
                        c1082i0.f11936l = i9;
                        c1082i0.f11937m = i11;
                        c9 = 2;
                        c1082i0.f11940p = 2;
                        if (cVar2.a(c1082i0) != aVar) {
                        }
                        return aVar;
                    }
                    try {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i13 = c1082i0.f11937m;
                            int i14 = c1082i0.f11936l;
                            java.lang.String str6 = c1082i0.f11935k;
                            Y4.Q0 q11 = c1082i0.j;
                            java.util.Map map3 = c1082i0.f11934i;
                            java.lang.String str7 = c1082i0.f11933h;
                            com.google.common.util.concurrent.P.u0(obj);
                            return obj;
                        }
                        i11 = c1082i0.f11937m;
                        i9 = c1082i0.f11936l;
                        strL = c1082i0.f11935k;
                        q10 = c1082i0.j;
                        mapJ0 = c1082i0.f11934i;
                        str3 = c1082i0.f11933h;
                        com.google.common.util.concurrent.P.u0(obj);
                        c9 = 2;
                    } catch (java.lang.Exception e9) {
                        e6 = e9;
                        c9 = 2;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    strL = str4;
                    mapJ0 = map;
                    q10.getClass();
                    if (u(e6)) {
                    }
                    throw e6;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
            }
            map = mapJ0;
            str4 = strL;
            p034d5.c cVar3 = q10.f11716d;
            Y4.C1079h0 c1079h0 = new Y4.C1079h0(q10, str4, str3, map, null);
            c1082i0.f11933h = str3;
            c1082i0.f11934i = map;
            c1082i0.j = q10;
            c1082i0.f11935k = str4;
            c1082i0.f11936l = i9;
            c1082i0.f11937m = i11;
            c1082i0.f11940p = 3;
            java.lang.Object objB = cVar3.b(c1079h0, c1082i0);
            if (objB == aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|69|33|34|62|35|(0)|42) */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0121, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0122, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012f, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r10, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
    
        if (r4 != r8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d7, code lost:
    
        r12 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object n(int i3, int i9, java.lang.String str, p117n6.c cVar) throws java.lang.Exception {
        Y4.C1091l0 c1091l0;
        Y4.Q0 q9;
        java.lang.String str2;
        Y4.Q0 q10;
        java.util.Map map;
        int i10;
        java.lang.String str3;
        char c9;
        java.lang.Exception e6;
        Y4.Q0 q11;
        java.lang.String str4;
        java.util.Map map2;
        p034d5.c cVar2;
        if (cVar instanceof Y4.C1091l0) {
            c1091l0 = (Y4.C1091l0) cVar;
            int i11 = c1091l0.f11980p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1091l0.f11980p = i11 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                c1091l0 = new Y4.C1091l0(q9, cVar);
            }
        } else {
            q9 = this;
            c1091l0 = new Y4.C1091l0(q9, cVar);
        }
        java.lang.Object obj = c1091l0.f11978n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i12 = c1091l0.f11980p;
        int i13 = 1;
        try {
            try {
                try {
                    if (i12 == 0) {
                        com.google.common.util.concurrent.P.u0(obj);
                        str2 = "/tv/" + i3 + "/season/" + i9;
                        q10 = q9;
                        map = p078i6.x.f23206h;
                        i12 = 0;
                        java.lang.String str5 = str;
                        i10 = 2;
                        if (i12 > 0) {
                            long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i12 - 1)) * 1000);
                            c1091l0.f11973h = str5;
                            c1091l0.f11974i = q10;
                            c1091l0.j = str2;
                            c1091l0.f11975k = map;
                            c1091l0.f11976l = i10;
                            c1091l0.f11977m = i12;
                            c1091l0.f11980p = i13;
                            if (S7.C.n(jI, c1091l0) != aVar) {
                                str3 = str5;
                            }
                            return aVar;
                        }
                        str3 = str5;
                        cVar2 = q10.f11715c;
                        c1091l0.f11973h = str3;
                        c1091l0.f11974i = q10;
                        c1091l0.j = str2;
                        c1091l0.f11975k = map;
                        c1091l0.f11976l = i10;
                        c1091l0.f11977m = i12;
                        c9 = 2;
                        c1091l0.f11980p = 2;
                        if (cVar2.a(c1091l0) != aVar) {
                        }
                        return aVar;
                    }
                    if (i12 == 1) {
                        i12 = c1091l0.f11977m;
                        i10 = c1091l0.f11976l;
                        map = c1091l0.f11975k;
                        str2 = c1091l0.j;
                        q10 = c1091l0.f11974i;
                        str3 = c1091l0.f11973h;
                        com.google.common.util.concurrent.P.u0(obj);
                        cVar2 = q10.f11715c;
                        c1091l0.f11973h = str3;
                        c1091l0.f11974i = q10;
                        c1091l0.j = str2;
                        c1091l0.f11975k = map;
                        c1091l0.f11976l = i10;
                        c1091l0.f11977m = i12;
                        c9 = 2;
                        c1091l0.f11980p = 2;
                        if (cVar2.a(c1091l0) != aVar) {
                        }
                        return aVar;
                    }
                    try {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i14 = c1091l0.f11977m;
                            int i15 = c1091l0.f11976l;
                            java.util.Map map3 = c1091l0.f11975k;
                            java.lang.String str6 = c1091l0.j;
                            Y4.Q0 q12 = c1091l0.f11974i;
                            java.lang.String str7 = c1091l0.f11973h;
                            com.google.common.util.concurrent.P.u0(obj);
                            return obj;
                        }
                        i12 = c1091l0.f11977m;
                        i10 = c1091l0.f11976l;
                        map = c1091l0.f11975k;
                        str2 = c1091l0.j;
                        q10 = c1091l0.f11974i;
                        str3 = c1091l0.f11973h;
                        com.google.common.util.concurrent.P.u0(obj);
                        c9 = 2;
                    } catch (java.lang.Exception e9) {
                        e6 = e9;
                        c9 = 2;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    q10 = q11;
                    str2 = str4;
                    map = map2;
                    q10.getClass();
                    if (u(e6)) {
                    }
                    throw e6;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
            }
            q11 = q10;
            str4 = str2;
            map2 = map;
            p034d5.c cVar3 = q11.f11716d;
            Y4.C1088k0 c1088k0 = new Y4.C1088k0(q11, str4, str3, map2, null);
            c1091l0.f11973h = str3;
            c1091l0.f11974i = q11;
            c1091l0.j = str4;
            c1091l0.f11975k = map2;
            c1091l0.f11976l = i10;
            c1091l0.f11977m = i12;
            c1091l0.f11980p = 3;
            java.lang.Object objB = cVar3.b(c1088k0, c1091l0);
            if (objB == aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:27|38|85|40|41|90|42|(0)|54) */
    /* JADX WARN: Code duplicated, block: B:26:0x0069 A[PHI: r5 r9 r10 r11 r12 r13 r15
  0x0069: PHI (r5v13 int) = (r5v14 int), (r5v17 int) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r9v7 int) = (r9v8 int), (r9v11 int) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r10v9 java.lang.String) = (r10v15 java.lang.String), (r10v18 java.lang.String) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r11v11 Y4.Q0) = (r11v17 Y4.Q0), (r11v20 Y4.Q0) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r12v9 java.util.Map) = (r12v10 java.util.Map), (r12v14 java.util.Map) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r13v3 java.lang.String) = (r13v8 java.lang.String), (r13v10 java.lang.String) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0069: PHI (r15v2 char) = (r15v4 char), (r15v6 char) binds: [B:43:0x0125, B:25:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f7 -> B:38:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0103 -> B:85:0x010d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object o(int i3, java.lang.String str, java.lang.String str2, p117n6.c cVar) throws java.lang.Exception {
        Y4.C1100o0 c1100o0;
        Y4.Q0 q9;
        int i9;
        java.lang.String str3;
        java.util.Map mapB;
        Y4.Q0 q10;
        java.lang.String strL;
        int i10;
        char c9;
        java.lang.Exception e6;
        int i11;
        java.util.Map map;
        java.lang.String str4;
        Y4.Q0 q11;
        java.lang.String str5;
        java.util.Map map2;
        long jI;
        java.util.Map map3;
        java.lang.String str6;
        int i12;
        java.lang.String str7;
        java.lang.String str8;
        java.util.Map map4;
        java.lang.String str9;
        java.lang.String str10;
        Y4.Q0 q12;
        java.lang.Object objB;
        p034d5.c cVar2;
        if (cVar instanceof Y4.C1100o0) {
            c1100o0 = (Y4.C1100o0) cVar;
            int i13 = c1100o0.f12018p;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1100o0.f12018p = i13 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                c1100o0 = new Y4.C1100o0(q9, cVar);
            }
        } else {
            q9 = this;
            c1100o0 = new Y4.C1100o0(q9, cVar);
        }
        java.lang.Object obj = c1100o0.f12016n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = c1100o0.f12018p;
        int i15 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                if (i14 == 0) {
                                    com.google.common.util.concurrent.P.u0(obj);
                                    p086j6.e eVar = new p086j6.e();
                                    eVar.put("append_to_response", str2);
                                    i9 = 0;
                                    if (O7.q.B0(str2, io.sentry.protocol.DebugMeta.JsonKeys.IMAGES, false)) {
                                        str3 = str;
                                        eVar.put("include_image_language", O7.q.p1(2, str3).concat(",en,null"));
                                    } else {
                                        str3 = str;
                                    }
                                    mapB = eVar.b();
                                    q10 = q9;
                                    strL = com.google.android.gms.internal.play_billing.M0.l(i3, "/tv/");
                                    i10 = 2;
                                    if (i9 > 0) {
                                        map2 = mapB;
                                        jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i9 - 1)) * 1000);
                                        c1100o0.f12011h = str3;
                                        c1100o0.f12012i = map2;
                                        c1100o0.j = q10;
                                        c1100o0.f12013k = strL;
                                        c1100o0.f12014l = i10;
                                        c1100o0.f12015m = i9;
                                        c1100o0.f12018p = i15;
                                        if (S7.C.n(jI, c1100o0) != aVar) {
                                            map3 = map2;
                                            str6 = str3;
                                            i12 = i9;
                                            str7 = strL;
                                            str4 = str6;
                                            map = map3;
                                            q11 = q10;
                                            str5 = str7;
                                            i11 = i10;
                                            i14 = i12;
                                            cVar2 = q11.f11715c;
                                            c1100o0.f12011h = str4;
                                            c1100o0.f12012i = map;
                                            c1100o0.j = q11;
                                            c1100o0.f12013k = str5;
                                            c1100o0.f12014l = i11;
                                            c1100o0.f12015m = i14;
                                            c9 = 2;
                                            c1100o0.f12018p = 2;
                                            if (cVar2.a(c1100o0) != aVar) {
                                            }
                                        }
                                    } else {
                                        java.util.Map map5 = mapB;
                                        int i16 = i9;
                                        i11 = i10;
                                        i14 = i16;
                                        map = map5;
                                        str4 = str3;
                                        q11 = q10;
                                        str5 = strL;
                                        cVar2 = q11.f11715c;
                                        c1100o0.f12011h = str4;
                                        c1100o0.f12012i = map;
                                        c1100o0.j = q11;
                                        c1100o0.f12013k = str5;
                                        c1100o0.f12014l = i11;
                                        c1100o0.f12015m = i14;
                                        c9 = 2;
                                        c1100o0.f12018p = 2;
                                        if (cVar2.a(c1100o0) != aVar) {
                                        }
                                    }
                                    return aVar;
                                }
                                if (i14 == 1) {
                                    i12 = c1100o0.f12015m;
                                    i10 = c1100o0.f12014l;
                                    str7 = c1100o0.f12013k;
                                    q10 = c1100o0.j;
                                    map3 = c1100o0.f12012i;
                                    str6 = c1100o0.f12011h;
                                    com.google.common.util.concurrent.P.u0(obj);
                                    str4 = str6;
                                    map = map3;
                                    q11 = q10;
                                    str5 = str7;
                                    i11 = i10;
                                    i14 = i12;
                                    cVar2 = q11.f11715c;
                                    c1100o0.f12011h = str4;
                                    c1100o0.f12012i = map;
                                    c1100o0.j = q11;
                                    c1100o0.f12013k = str5;
                                    c1100o0.f12014l = i11;
                                    c1100o0.f12015m = i14;
                                    c9 = 2;
                                    c1100o0.f12018p = 2;
                                    if (cVar2.a(c1100o0) != aVar) {
                                    }
                                    return aVar;
                                }
                                try {
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        int i17 = c1100o0.f12015m;
                                        int i18 = c1100o0.f12014l;
                                        java.lang.String str11 = c1100o0.f12013k;
                                        Y4.Q0 q13 = c1100o0.j;
                                        java.util.Map map6 = c1100o0.f12012i;
                                        java.lang.String str12 = c1100o0.f12011h;
                                        com.google.common.util.concurrent.P.u0(obj);
                                        return obj;
                                    }
                                    i14 = c1100o0.f12015m;
                                    i11 = c1100o0.f12014l;
                                    str5 = c1100o0.f12013k;
                                    q11 = c1100o0.j;
                                    map = c1100o0.f12012i;
                                    str4 = c1100o0.f12011h;
                                    com.google.common.util.concurrent.P.u0(obj);
                                    c9 = 2;
                                } catch (java.lang.Exception e9) {
                                    e6 = e9;
                                    c9 = 2;
                                    strL = str5;
                                    q10 = q11;
                                    mapB = map;
                                    q10.getClass();
                                    if (u(e6)) {
                                    }
                                    throw e6;
                                }
                            } catch (java.lang.Exception e10) {
                                e6 = e10;
                            }
                        } catch (java.lang.Exception e11) {
                            e6 = e11;
                            strL = str10;
                            q10 = q11;
                            mapB = map4;
                            q10.getClass();
                            if (u(e6)) {
                            }
                            throw e6;
                        }
                    } catch (java.lang.Exception e12) {
                        e6 = e12;
                        strL = str10;
                        q10 = q11;
                        mapB = map4;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e13) {
                    e6 = e13;
                }
            } catch (java.lang.Exception e14) {
                e6 = e14;
                q11 = q12;
                str10 = str8;
                str4 = str9;
                strL = str10;
                q10 = q11;
                mapB = map4;
                q10.getClass();
                if (u(e6) || i14 >= i11) {
                    throw e6;
                }
                int i19 = i14 + 1;
                B2.a.w(B2.a.q(i19, e6.getMessage(), " on ", strL, ", retry "), "/", i11, "TMDBApiClient");
                if (i14 == i11) {
                    throw e6;
                }
                i10 = i11;
                i9 = i19;
                str3 = str4;
                i15 = 1;
                if (i9 > 0) {
                    map2 = mapB;
                    jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i9 - 1)) * 1000);
                    c1100o0.f12011h = str3;
                    c1100o0.f12012i = map2;
                    c1100o0.j = q10;
                    c1100o0.f12013k = strL;
                    c1100o0.f12014l = i10;
                    c1100o0.f12015m = i9;
                    c1100o0.f12018p = i15;
                    if (S7.C.n(jI, c1100o0) != aVar) {
                        map3 = map2;
                        str6 = str3;
                        i12 = i9;
                        str7 = strL;
                        str4 = str6;
                        map = map3;
                        q11 = q10;
                        str5 = str7;
                        i11 = i10;
                        i14 = i12;
                        cVar2 = q11.f11715c;
                        c1100o0.f12011h = str4;
                        c1100o0.f12012i = map;
                        c1100o0.j = q11;
                        c1100o0.f12013k = str5;
                        c1100o0.f12014l = i11;
                        c1100o0.f12015m = i14;
                        c9 = 2;
                        c1100o0.f12018p = 2;
                        if (cVar2.a(c1100o0) != aVar) {
                            str8 = str5;
                            map4 = map;
                            str9 = str4;
                            p034d5.c cVar3 = q11.f11716d;
                            q12 = q11;
                            Y4.C1097n0 c1097n0 = new Y4.C1097n0(q12, str8, str9, map4, null);
                            str10 = str8;
                            str4 = str9;
                            c1100o0.f12011h = str4;
                            c1100o0.f12012i = map4;
                            c1100o0.j = q11;
                            c1100o0.f12013k = str10;
                            c1100o0.f12014l = i11;
                            c1100o0.f12015m = i14;
                            c1100o0.f12018p = 3;
                            objB = cVar3.b(c1097n0, c1100o0);
                            if (objB == aVar) {
                                return objB;
                            }
                        }
                    }
                } else {
                    java.util.Map map7 = mapB;
                    int i110 = i9;
                    i11 = i10;
                    i14 = i110;
                    map = map7;
                    str4 = str3;
                    q11 = q10;
                    str5 = strL;
                    cVar2 = q11.f11715c;
                    c1100o0.f12011h = str4;
                    c1100o0.f12012i = map;
                    c1100o0.j = q11;
                    c1100o0.f12013k = str5;
                    c1100o0.f12014l = i11;
                    c1100o0.f12015m = i14;
                    c9 = 2;
                    c1100o0.f12018p = 2;
                    if (cVar2.a(c1100o0) != aVar) {
                        str8 = str5;
                        map4 = map;
                        str9 = str4;
                        p034d5.c cVar4 = q11.f11716d;
                        q12 = q11;
                        Y4.C1097n0 c1097n1 = new Y4.C1097n0(q12, str8, str9, map4, null);
                        str10 = str8;
                        str4 = str9;
                        c1100o0.f12011h = str4;
                        c1100o0.f12012i = map4;
                        c1100o0.j = q11;
                        c1100o0.f12013k = str10;
                        c1100o0.f12014l = i11;
                        c1100o0.f12015m = i14;
                        c1100o0.f12018p = 3;
                        objB = cVar4.b(c1097n1, c1100o0);
                        if (objB == aVar) {
                            return objB;
                        }
                    }
                }
                return aVar;
            }
            str8 = str5;
            map4 = map;
            str9 = str4;
            p034d5.c cVar5 = q11.f11716d;
            q12 = q11;
            Y4.C1097n0 c1097n2 = new Y4.C1097n0(q12, str8, str9, map4, null);
            str10 = str8;
            str4 = str9;
            c1100o0.f12011h = str4;
            c1100o0.f12012i = map4;
            c1100o0.j = q11;
            c1100o0.f12013k = str10;
            c1100o0.f12014l = i11;
            c1100o0.f12015m = i14;
            c1100o0.f12018p = 3;
            objB = cVar5.b(c1097n2, c1100o0);
            if (objB == aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e15) {
            throw e15;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|70|33|34|63|35|(6:25|65|38|39|67|40)|42) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:22|23|24|25|65|38|39|67|40) */
    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[PHI: r4 r8 r9 r10 r11 r12 r15
  0x0063: PHI (r4v9 int) = (r4v10 int), (r4v11 int) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r8v4 int) = (r8v5 int), (r8v6 int) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r9v3 java.util.Map) = (r9v7 java.util.Map), (r9v9 java.util.Map) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r10v3 java.lang.String) = (r10v6 java.lang.String), (r10v7 java.lang.String) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r11v3 Y4.Q0) = (r11v6 Y4.Q0), (r11v7 Y4.Q0) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r12v11 java.lang.String) = (r12v12 java.lang.String), (r12v13 java.lang.String) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r15v1 char) = (r15v3 char), (r15v5 char) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
    
        if (r0 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        r11 = r13;
        r10 = r11;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r10, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0144, code lost:
    
        if (r4 != r8) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0146, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d3, code lost:
    
        r12 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object p(int i3, java.lang.String str, p117n6.c cVar) throws java.lang.Exception {
        Y4.C1108r0 c1108r0;
        Y4.Q0 q9;
        java.lang.String str2;
        Y4.Q0 q10;
        java.util.Map map;
        int i9;
        java.lang.String str3;
        char c9;
        p034d5.c cVar2;
        if (cVar instanceof Y4.C1108r0) {
            c1108r0 = (Y4.C1108r0) cVar;
            int i10 = c1108r0.f12062p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1108r0.f12062p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                c1108r0 = new Y4.C1108r0(q9, cVar);
            }
        } else {
            q9 = this;
            c1108r0 = new Y4.C1108r0(q9, cVar);
        }
        java.lang.Object objB = c1108r0.f12060n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1108r0.f12062p;
        int i12 = 1;
        try {
            if (i11 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                str2 = "/tv/" + i3 + "/recommendations";
                q10 = q9;
                map = p078i6.x.f23206h;
                i11 = 0;
                java.lang.String str4 = str;
                i9 = 2;
                if (i11 > 0) {
                    long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                    c1108r0.f12055h = str4;
                    c1108r0.f12056i = q10;
                    c1108r0.j = str2;
                    c1108r0.f12057k = map;
                    c1108r0.f12058l = i9;
                    c1108r0.f12059m = i11;
                    c1108r0.f12062p = i12;
                    if (S7.C.n(jI, c1108r0) != aVar) {
                        str3 = str4;
                    }
                    return aVar;
                }
                str3 = str4;
                cVar2 = q10.f11715c;
                c1108r0.f12055h = str3;
                c1108r0.f12056i = q10;
                c1108r0.j = str2;
                c1108r0.f12057k = map;
                c1108r0.f12058l = i9;
                c1108r0.f12059m = i11;
                c9 = 2;
                c1108r0.f12062p = 2;
                if (cVar2.a(c1108r0) != aVar) {
                    Y4.Q0 q11 = q10;
                    java.lang.String str5 = str2;
                    java.util.Map map2 = map;
                    p034d5.c cVar3 = q11.f11716d;
                    Y4.C1106q0 c1106q0 = new Y4.C1106q0(q11, str5, str3, map2, null);
                    c1108r0.f12055h = str3;
                    c1108r0.f12056i = q11;
                    c1108r0.j = str5;
                    c1108r0.f12057k = map2;
                    c1108r0.f12058l = i9;
                    c1108r0.f12059m = i11;
                    c1108r0.f12062p = 3;
                    objB = cVar3.b(c1106q0, c1108r0);
                }
                return aVar;
            }
            if (i11 == 1) {
                i11 = c1108r0.f12059m;
                i9 = c1108r0.f12058l;
                map = c1108r0.f12057k;
                str2 = c1108r0.j;
                q10 = c1108r0.f12056i;
                str3 = c1108r0.f12055h;
                com.google.common.util.concurrent.P.u0(objB);
                cVar2 = q10.f11715c;
                c1108r0.f12055h = str3;
                c1108r0.f12056i = q10;
                c1108r0.j = str2;
                c1108r0.f12057k = map;
                c1108r0.f12058l = i9;
                c1108r0.f12059m = i11;
                c9 = 2;
                c1108r0.f12062p = 2;
                if (cVar2.a(c1108r0) != aVar) {
                    Y4.Q0 q12 = q10;
                    java.lang.String str6 = str2;
                    java.util.Map map3 = map;
                    p034d5.c cVar4 = q12.f11716d;
                    Y4.C1106q0 c1106q1 = new Y4.C1106q0(q12, str6, str3, map3, null);
                    c1108r0.f12055h = str3;
                    c1108r0.f12056i = q12;
                    c1108r0.j = str6;
                    c1108r0.f12057k = map3;
                    c1108r0.f12058l = i9;
                    c1108r0.f12059m = i11;
                    c1108r0.f12062p = 3;
                    objB = cVar4.b(c1106q1, c1108r0);
                }
                return aVar;
            }
            try {
                if (i11 == 2) {
                    i11 = c1108r0.f12059m;
                    i9 = c1108r0.f12058l;
                    map = c1108r0.f12057k;
                    str2 = c1108r0.j;
                    q10 = c1108r0.f12056i;
                    str3 = c1108r0.f12055h;
                    com.google.common.util.concurrent.P.u0(objB);
                    c9 = 2;
                    Y4.Q0 q13 = q10;
                    java.lang.String str7 = str2;
                    java.util.Map map4 = map;
                    p034d5.c cVar5 = q13.f11716d;
                    Y4.C1106q0 c1106q2 = new Y4.C1106q0(q13, str7, str3, map4, null);
                    c1108r0.f12055h = str3;
                    c1108r0.f12056i = q13;
                    c1108r0.j = str7;
                    c1108r0.f12057k = map4;
                    c1108r0.f12058l = i9;
                    c1108r0.f12059m = i11;
                    c1108r0.f12062p = 3;
                    objB = cVar5.b(c1106q2, c1108r0);
                } else {
                    if (i11 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = c1108r0.f12059m;
                    int i14 = c1108r0.f12058l;
                    java.util.Map map5 = c1108r0.f12057k;
                    java.lang.String str8 = c1108r0.j;
                    Y4.Q0 q14 = c1108r0.f12056i;
                    java.lang.String str9 = c1108r0.f12055h;
                    com.google.common.util.concurrent.P.u0(objB);
                }
            } catch (java.lang.Exception e6) {
                java.lang.Exception e9 = e6;
                c9 = 2;
                q10.getClass();
                if (u(e9)) {
                }
                throw e9;
            }
            return ((com.kiptv.core.model.TMDBRecommendationsResponse) objB).f20274b;
        } catch (java.util.concurrent.CancellationException e10) {
            throw e10;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|70|33|34|63|35|(6:25|65|38|39|67|40)|42) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:22|23|24|25|65|38|39|67|40) */
    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[PHI: r4 r8 r9 r10 r11 r12 r15
  0x0063: PHI (r4v9 int) = (r4v10 int), (r4v11 int) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r8v4 int) = (r8v5 int), (r8v6 int) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r9v3 java.util.Map) = (r9v7 java.util.Map), (r9v9 java.util.Map) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r10v3 java.lang.String) = (r10v6 java.lang.String), (r10v7 java.lang.String) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r11v3 Y4.Q0) = (r11v6 Y4.Q0), (r11v7 Y4.Q0) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r12v11 java.lang.String) = (r12v12 java.lang.String), (r12v13 java.lang.String) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r15v1 char) = (r15v3 char), (r15v5 char) binds: [B:36:0x00eb, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
    
        if (r0 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        r11 = r13;
        r10 = r11;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012f, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r10, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0144, code lost:
    
        if (r4 != r8) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0146, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d3, code lost:
    
        r12 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(int i3, java.lang.String str, p117n6.c cVar) throws java.lang.Exception {
        Y4.C1117u0 c1117u0;
        Y4.Q0 q9;
        java.lang.String str2;
        Y4.Q0 q10;
        java.util.Map map;
        int i9;
        java.lang.String str3;
        char c9;
        p034d5.c cVar2;
        if (cVar instanceof Y4.C1117u0) {
            c1117u0 = (Y4.C1117u0) cVar;
            int i10 = c1117u0.f12105p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1117u0.f12105p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                c1117u0 = new Y4.C1117u0(q9, cVar);
            }
        } else {
            q9 = this;
            c1117u0 = new Y4.C1117u0(q9, cVar);
        }
        java.lang.Object objB = c1117u0.f12103n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1117u0.f12105p;
        int i12 = 1;
        try {
            if (i11 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                str2 = "/tv/" + i3 + "/videos";
                q10 = q9;
                map = p078i6.x.f23206h;
                i11 = 0;
                java.lang.String str4 = str;
                i9 = 2;
                if (i11 > 0) {
                    long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                    c1117u0.f12098h = str4;
                    c1117u0.f12099i = q10;
                    c1117u0.j = str2;
                    c1117u0.f12100k = map;
                    c1117u0.f12101l = i9;
                    c1117u0.f12102m = i11;
                    c1117u0.f12105p = i12;
                    if (S7.C.n(jI, c1117u0) != aVar) {
                        str3 = str4;
                    }
                    return aVar;
                }
                str3 = str4;
                cVar2 = q10.f11715c;
                c1117u0.f12098h = str3;
                c1117u0.f12099i = q10;
                c1117u0.j = str2;
                c1117u0.f12100k = map;
                c1117u0.f12101l = i9;
                c1117u0.f12102m = i11;
                c9 = 2;
                c1117u0.f12105p = 2;
                if (cVar2.a(c1117u0) != aVar) {
                    Y4.Q0 q11 = q10;
                    java.lang.String str5 = str2;
                    java.util.Map map2 = map;
                    p034d5.c cVar3 = q11.f11716d;
                    Y4.C1114t0 c1114t0 = new Y4.C1114t0(q11, str5, str3, map2, null);
                    c1117u0.f12098h = str3;
                    c1117u0.f12099i = q11;
                    c1117u0.j = str5;
                    c1117u0.f12100k = map2;
                    c1117u0.f12101l = i9;
                    c1117u0.f12102m = i11;
                    c1117u0.f12105p = 3;
                    objB = cVar3.b(c1114t0, c1117u0);
                }
                return aVar;
            }
            if (i11 == 1) {
                i11 = c1117u0.f12102m;
                i9 = c1117u0.f12101l;
                map = c1117u0.f12100k;
                str2 = c1117u0.j;
                q10 = c1117u0.f12099i;
                str3 = c1117u0.f12098h;
                com.google.common.util.concurrent.P.u0(objB);
                cVar2 = q10.f11715c;
                c1117u0.f12098h = str3;
                c1117u0.f12099i = q10;
                c1117u0.j = str2;
                c1117u0.f12100k = map;
                c1117u0.f12101l = i9;
                c1117u0.f12102m = i11;
                c9 = 2;
                c1117u0.f12105p = 2;
                if (cVar2.a(c1117u0) != aVar) {
                    Y4.Q0 q12 = q10;
                    java.lang.String str6 = str2;
                    java.util.Map map3 = map;
                    p034d5.c cVar4 = q12.f11716d;
                    Y4.C1114t0 c1114t1 = new Y4.C1114t0(q12, str6, str3, map3, null);
                    c1117u0.f12098h = str3;
                    c1117u0.f12099i = q12;
                    c1117u0.j = str6;
                    c1117u0.f12100k = map3;
                    c1117u0.f12101l = i9;
                    c1117u0.f12102m = i11;
                    c1117u0.f12105p = 3;
                    objB = cVar4.b(c1114t1, c1117u0);
                }
                return aVar;
            }
            try {
                if (i11 == 2) {
                    i11 = c1117u0.f12102m;
                    i9 = c1117u0.f12101l;
                    map = c1117u0.f12100k;
                    str2 = c1117u0.j;
                    q10 = c1117u0.f12099i;
                    str3 = c1117u0.f12098h;
                    com.google.common.util.concurrent.P.u0(objB);
                    c9 = 2;
                    Y4.Q0 q13 = q10;
                    java.lang.String str7 = str2;
                    java.util.Map map4 = map;
                    p034d5.c cVar5 = q13.f11716d;
                    Y4.C1114t0 c1114t2 = new Y4.C1114t0(q13, str7, str3, map4, null);
                    c1117u0.f12098h = str3;
                    c1117u0.f12099i = q13;
                    c1117u0.j = str7;
                    c1117u0.f12100k = map4;
                    c1117u0.f12101l = i9;
                    c1117u0.f12102m = i11;
                    c1117u0.f12105p = 3;
                    objB = cVar5.b(c1114t2, c1117u0);
                } else {
                    if (i11 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = c1117u0.f12102m;
                    int i14 = c1117u0.f12101l;
                    java.util.Map map5 = c1117u0.f12100k;
                    java.lang.String str8 = c1117u0.j;
                    Y4.Q0 q14 = c1117u0.f12099i;
                    java.lang.String str9 = c1117u0.f12098h;
                    com.google.common.util.concurrent.P.u0(objB);
                }
            } catch (java.lang.Exception e6) {
                java.lang.Exception e9 = e6;
                c9 = 2;
                q10.getClass();
                if (u(e9)) {
                }
                throw e9;
            }
            return ((com.kiptv.core.model.TMDBVideosResponse) objB).f20350b;
        } catch (java.util.concurrent.CancellationException e10) {
            throw e10;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:71|(1:(3:13|14|15)(2:20|21))(3:22|23|24))(1:26)|25|64|38|39|66|40|(1:42)(1:43)) */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[PHI: r4 r7 r8 r9 r10 r11 r12 r15
  0x0065: PHI (r4v8 int) = (r4v9 int), (r4v11 int) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r7v4 boolean) = (r7v5 boolean), (r7v8 boolean) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r8v3 int) = (r8v4 int), (r8v6 int) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r9v3 java.lang.String) = (r9v6 java.lang.String), (r9v8 java.lang.String) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r10v2 java.util.Map) = (r10v5 java.util.Map), (r10v8 java.util.Map) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r11v2 java.lang.String) = (r11v3 java.lang.String), (r11v5 java.lang.String) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r12v2 Y4.Q0) = (r12v5 Y4.Q0), (r12v7 Y4.Q0) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r15v1 char) = (r15v3 char), (r15v5 char) binds: [B:36:0x00f0, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0115, code lost:
    
        r9 = r12;
        r12 = r10;
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d4 -> B:69:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object r(int i3, p117n6.c cVar) {
        Y4.C1126x0 c1126x0;
        Y4.Q0 q9;
        java.lang.String str;
        Y4.Q0 q10;
        java.util.Map map;
        java.lang.String strB;
        int i9;
        char c9;
        boolean z6;
        java.lang.Exception e6;
        long jI;
        java.lang.Object objB;
        p034d5.c cVar2;
        if (cVar instanceof Y4.C1126x0) {
            c1126x0 = (Y4.C1126x0) cVar;
            int i10 = c1126x0.f12148p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1126x0.f12148p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                c1126x0 = new Y4.C1126x0(q9, cVar);
            }
        } else {
            q9 = this;
            c1126x0 = new Y4.C1126x0(q9, cVar);
        }
        java.lang.Object obj = c1126x0.f12146n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1126x0.f12148p;
        boolean z9 = true;
        try {
            try {
                try {
                    if (i11 != 0) {
                        if (i11 != 1) {
                            try {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i12 = c1126x0.f12145m;
                                    int i13 = c1126x0.f12144l;
                                    java.lang.String str2 = c1126x0.f12143k;
                                    java.util.Map map2 = c1126x0.j;
                                    java.lang.String str3 = c1126x0.f12142i;
                                    Y4.Q0 q11 = c1126x0.f12141h;
                                    com.google.common.util.concurrent.P.u0(obj);
                                    return obj;
                                }
                                i11 = c1126x0.f12145m;
                                i9 = c1126x0.f12144l;
                                strB = c1126x0.f12143k;
                                map = c1126x0.j;
                                str = c1126x0.f12142i;
                                q10 = c1126x0.f12141h;
                                com.google.common.util.concurrent.P.u0(obj);
                                c9 = 2;
                                z6 = true;
                            } catch (java.lang.Exception e9) {
                                e6 = e9;
                                c9 = 2;
                                z6 = true;
                                q10.getClass();
                                if (u(e6)) {
                                }
                                throw e6;
                            }
                        } else {
                            i11 = c1126x0.f12145m;
                            i9 = c1126x0.f12144l;
                            strB = c1126x0.f12143k;
                            map = c1126x0.j;
                            str = c1126x0.f12142i;
                            q10 = c1126x0.f12141h;
                            com.google.common.util.concurrent.P.u0(obj);
                        }
                        java.util.Map map3 = map;
                        Y4.Q0 q12 = q10;
                        java.lang.String str4 = strB;
                        p034d5.c cVar3 = q12.f11716d;
                        Y4.C1123w0 c1123w0 = new Y4.C1123w0(q12, str, str4, map3, null);
                        c1126x0.f12141h = q12;
                        c1126x0.f12142i = str;
                        c1126x0.j = map3;
                        c1126x0.f12143k = str4;
                        c1126x0.f12144l = i9;
                        c1126x0.f12145m = i11;
                        c1126x0.f12148p = 3;
                        objB = cVar3.b(c1123w0, c1126x0);
                        if (objB != aVar) {
                            return aVar;
                        }
                        return objB;
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                    str = "/tv/" + i3 + "/watch/providers";
                    q10 = q9;
                    map = p078i6.x.f23206h;
                    i11 = 0;
                    strB = b();
                    i9 = 2;
                    if (0 > 0) {
                        jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                        c1126x0.f12141h = q10;
                        c1126x0.f12142i = str;
                        c1126x0.j = map;
                        c1126x0.f12143k = strB;
                        c1126x0.f12144l = i9;
                        c1126x0.f12145m = i11;
                        z6 = true;
                        c1126x0.f12148p = 1;
                        if (S7.C.n(jI, c1126x0) != aVar) {
                        }
                        return aVar;
                    }
                    cVar2 = q10.f11715c;
                    c1126x0.f12141h = q10;
                    c1126x0.f12142i = str;
                    c1126x0.j = map;
                    c1126x0.f12143k = strB;
                    c1126x0.f12144l = i9;
                    c1126x0.f12145m = i11;
                    c9 = 2;
                    c1126x0.f12148p = 2;
                    if (cVar2.a(c1126x0) != aVar) {
                        java.util.Map map4 = map;
                        Y4.Q0 q13 = q10;
                        java.lang.String str5 = strB;
                        p034d5.c cVar4 = q13.f11716d;
                        Y4.C1123w0 c1123w1 = new Y4.C1123w0(q13, str, str5, map4, null);
                        c1126x0.f12141h = q13;
                        c1126x0.f12142i = str;
                        c1126x0.j = map4;
                        c1126x0.f12143k = str5;
                        c1126x0.f12144l = i9;
                        c1126x0.f12145m = i11;
                        c1126x0.f12148p = 3;
                        objB = cVar4.b(c1123w1, c1126x0);
                        if (objB != aVar) {
                            return objB;
                        }
                    }
                    return aVar;
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    c9 = 2;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
                q10.getClass();
                if (u(e6) || i11 >= i9) {
                    throw e6;
                }
                int i14 = i11 + 1;
                B2.a.w(B2.a.q(i14, e6.getMessage(), " on ", str, ", retry "), "/", i9, "TMDBApiClient");
                if (i11 == i9) {
                    throw e6;
                }
                z9 = z6;
                i11 = i14;
                if (i11 > 0) {
                    jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                    c1126x0.f12141h = q10;
                    c1126x0.f12142i = str;
                    c1126x0.j = map;
                    c1126x0.f12143k = strB;
                    c1126x0.f12144l = i9;
                    c1126x0.f12145m = i11;
                    z6 = true;
                    c1126x0.f12148p = 1;
                    if (S7.C.n(jI, c1126x0) != aVar) {
                    }
                    return aVar;
                }
                z6 = z9;
                cVar2 = q10.f11715c;
                c1126x0.f12141h = q10;
                c1126x0.f12142i = str;
                c1126x0.j = map;
                c1126x0.f12143k = strB;
                c1126x0.f12144l = i9;
                c1126x0.f12145m = i11;
                c9 = 2;
                c1126x0.f12148p = 2;
                if (cVar2.a(c1126x0) != aVar) {
                    java.util.Map map5 = map;
                    Y4.Q0 q14 = q10;
                    java.lang.String str6 = strB;
                    p034d5.c cVar5 = q14.f11716d;
                    Y4.C1123w0 c1123w2 = new Y4.C1123w0(q14, str, str6, map5, null);
                    c1126x0.f12141h = q14;
                    c1126x0.f12142i = str;
                    c1126x0.j = map5;
                    c1126x0.f12143k = str6;
                    c1126x0.f12144l = i9;
                    c1126x0.f12145m = i11;
                    c1126x0.f12148p = 3;
                    objB = cVar5.b(c1123w2, c1126x0);
                    if (objB != aVar) {
                        return objB;
                    }
                }
                return aVar;
            }
            z6 = z9;
            cVar2 = q10.f11715c;
            c1126x0.f12141h = q10;
            c1126x0.f12142i = str;
            c1126x0.j = map;
            c1126x0.f12143k = strB;
            c1126x0.f12144l = i9;
            c1126x0.f12145m = i11;
            c9 = 2;
            c1126x0.f12148p = 2;
            if (cVar2.a(c1126x0) != aVar) {
                java.util.Map map6 = map;
                Y4.Q0 q15 = q10;
                java.lang.String str7 = strB;
                p034d5.c cVar6 = q15.f11716d;
                Y4.C1123w0 c1123w3 = new Y4.C1123w0(q15, str, str7, map6, null);
                c1126x0.f12141h = q15;
                c1126x0.f12142i = str;
                c1126x0.j = map6;
                c1126x0.f12143k = str7;
                c1126x0.f12144l = i9;
                c1126x0.f12145m = i11;
                c1126x0.f12148p = 3;
                objB = cVar6.b(c1123w3, c1126x0);
                if (objB != aVar) {
                    return objB;
                }
            }
            return aVar;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:22|23|24|25|89|39|40|76|41|42|79|43|83|44|45|87|46) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:26|81|34|35|85|36|(14:25|89|39|40|76|41|42|79|43|83|44|45|87|46)|48) */
    /* JADX WARN: Code duplicated, block: B:25:0x006c A[PHI: r4 r9 r10 r11 r12 r13 r14 r15 r16
  0x006c: PHI (r4v9 int) = (r4v10 int), (r4v11 int) binds: [B:37:0x00ff, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r9v4 int) = (r9v5 int), (r9v6 int) binds: [B:37:0x00ff, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r10v3 java.util.Map) = (r10v5 java.util.Map), (r10v7 java.util.Map) binds: [B:37:0x00ff, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r11v3 java.lang.String) = (r11v8 java.lang.String), (r11v9 java.lang.String) binds: [B:37:0x00ff, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r12v3 Y4.Q0) = (r12v8 Y4.Q0), (r12v9 Y4.Q0) binds: [B:37:0x00ff, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r13v7 java.lang.String) = (r13v12 java.lang.String), (r13v13 java.lang.String) binds: [B:37:0x00ff, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r14v4 boolean) = (r14v5 boolean), (r14v7 boolean) binds: [B:37:0x00ff, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r15v1 char) = (r15v3 char), (r15v5 char) binds: [B:37:0x00ff, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r16v3 java.lang.String) = (r16v4 java.lang.String), (r16v6 java.lang.String) binds: [B:37:0x00ff, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
    
        if (r0 == r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
    
        r10 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0137, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013d, code lost:
    
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013f, code lost:
    
        r11 = r19;
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0146, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0149, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        r7 = r4 + 1;
        r8 = r16;
        B2.a.w(B2.a.q(r7, r0.getMessage(), " on ", r11, ", retry "), r8, r9, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016c, code lost:
    
        if (r4 != r9) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
    
        r4 = r7;
        r6 = r8;
        r0 = r13;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0176, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s(java.lang.String str, java.lang.String str2, java.lang.String str3, p117n6.c cVar) {
        Y4.A0 a2;
        Y4.Q0 q9;
        java.lang.String str4;
        Y4.Q0 q10;
        java.util.Map map;
        int i3;
        boolean z6;
        java.lang.String str5;
        java.lang.String str6;
        char c9;
        p034d5.c cVar2;
        if (cVar instanceof Y4.A0) {
            a2 = (Y4.A0) cVar;
            int i9 = a2.f11537p;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                a2.f11537p = i9 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                a2 = new Y4.A0(q9, cVar);
            }
        } else {
            q9 = this;
            a2 = new Y4.A0(q9, cVar);
        }
        java.lang.Object objB = a2.f11535n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = a2.f11537p;
        boolean z9 = true;
        java.lang.String str7 = "/";
        try {
            if (i10 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                str4 = "/trending/" + str + "/" + str2;
                q10 = q9;
                map = p078i6.x.f23206h;
                i10 = 0;
                java.lang.String str8 = str3;
                i3 = 2;
                if (i10 > 0) {
                    str5 = str7;
                    long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i10 - 1)) * 1000);
                    a2.f11530h = str8;
                    a2.f11531i = q10;
                    a2.j = str4;
                    a2.f11532k = map;
                    a2.f11533l = i3;
                    a2.f11534m = i10;
                    z6 = true;
                    a2.f11537p = 1;
                    if (S7.C.n(jI, a2) != aVar) {
                        str6 = str8;
                    }
                    return aVar;
                }
                z6 = z9;
                str5 = str7;
                str6 = str8;
                cVar2 = q10.f11715c;
                a2.f11530h = str6;
                a2.f11531i = q10;
                a2.j = str4;
                a2.f11532k = map;
                a2.f11533l = i3;
                a2.f11534m = i10;
                c9 = 2;
                a2.f11537p = 2;
                if (cVar2.a(a2) != aVar) {
                    java.util.Map map2 = map;
                    java.lang.String str9 = str4;
                    java.lang.String str10 = str6;
                    p034d5.c cVar3 = q10.f11716d;
                    Y4.Q0 q11 = q10;
                    Y4.C1132z0 c1132z0 = new Y4.C1132z0(q11, str9, str10, map2, null);
                    str4 = str9;
                    str6 = str10;
                    a2.f11530h = str6;
                    a2.f11531i = q10;
                    a2.j = str4;
                    a2.f11532k = map2;
                    a2.f11533l = i3;
                    a2.f11534m = i10;
                    a2.f11537p = 3;
                    objB = cVar3.b(c1132z0, a2);
                }
                return aVar;
            }
            if (i10 == 1) {
                i10 = a2.f11534m;
                i3 = a2.f11533l;
                map = a2.f11532k;
                str4 = a2.j;
                q10 = a2.f11531i;
                str6 = a2.f11530h;
                com.google.common.util.concurrent.P.u0(objB);
                z6 = true;
                str5 = "/";
                cVar2 = q10.f11715c;
                a2.f11530h = str6;
                a2.f11531i = q10;
                a2.j = str4;
                a2.f11532k = map;
                a2.f11533l = i3;
                a2.f11534m = i10;
                c9 = 2;
                a2.f11537p = 2;
                if (cVar2.a(a2) != aVar) {
                    java.util.Map map3 = map;
                    java.lang.String str11 = str4;
                    java.lang.String str12 = str6;
                    p034d5.c cVar4 = q10.f11716d;
                    Y4.Q0 q12 = q10;
                    Y4.C1132z0 c1132z1 = new Y4.C1132z0(q12, str11, str12, map3, null);
                    str4 = str11;
                    str6 = str12;
                    a2.f11530h = str6;
                    a2.f11531i = q10;
                    a2.j = str4;
                    a2.f11532k = map3;
                    a2.f11533l = i3;
                    a2.f11534m = i10;
                    a2.f11537p = 3;
                    objB = cVar4.b(c1132z1, a2);
                }
                return aVar;
            }
            try {
                if (i10 == 2) {
                    i10 = a2.f11534m;
                    i3 = a2.f11533l;
                    map = a2.f11532k;
                    str4 = a2.j;
                    q10 = a2.f11531i;
                    str6 = a2.f11530h;
                    com.google.common.util.concurrent.P.u0(objB);
                    z6 = true;
                    str5 = "/";
                    c9 = 2;
                    java.util.Map map4 = map;
                    java.lang.String str13 = str4;
                    java.lang.String str14 = str6;
                    p034d5.c cVar5 = q10.f11716d;
                    Y4.Q0 q13 = q10;
                    Y4.C1132z0 c1132z2 = new Y4.C1132z0(q13, str13, str14, map4, null);
                    str4 = str13;
                    str6 = str14;
                    a2.f11530h = str6;
                    a2.f11531i = q10;
                    a2.j = str4;
                    a2.f11532k = map4;
                    a2.f11533l = i3;
                    a2.f11534m = i10;
                    a2.f11537p = 3;
                    objB = cVar5.b(c1132z2, a2);
                } else {
                    if (i10 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i11 = a2.f11534m;
                    int i12 = a2.f11533l;
                    java.util.Map map5 = a2.f11532k;
                    java.lang.String str15 = a2.j;
                    Y4.Q0 q14 = a2.f11531i;
                    java.lang.String str16 = a2.f11530h;
                    com.google.common.util.concurrent.P.u0(objB);
                }
            } catch (java.lang.Exception e6) {
                java.lang.Exception e9 = e6;
                z6 = true;
                str5 = "/";
                c9 = 2;
                q10.getClass();
                if (u(e9)) {
                }
                throw e9;
            }
            return ((com.kiptv.core.model.TMDBTrendingResponse) objB).f20338b;
        } catch (java.util.concurrent.CancellationException e10) {
            throw e10;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:27|80|42|43|72|44|(6:26|74|47|48|76|49)|51) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:23|24|25|26|74|47|48|76|49) */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[PHI: r4 r8 r9 r10 r11 r12 r15
  0x0064: PHI (r4v10 int) = (r4v11 int), (r4v12 int) binds: [B:45:0x00fe, B:25:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r8v8 int) = (r8v9 int), (r8v10 int) binds: [B:45:0x00fe, B:25:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r9v8 java.util.Map) = (r9v10 java.util.Map), (r9v12 java.util.Map) binds: [B:45:0x00fe, B:25:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r10v5 java.lang.String) = (r10v8 java.lang.String), (r10v9 java.lang.String) binds: [B:45:0x00fe, B:25:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r11v4 Y4.Q0) = (r11v7 Y4.Q0), (r11v8 Y4.Q0) binds: [B:45:0x00fe, B:25:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r12v12 java.lang.String) = (r12v13 java.lang.String), (r12v14 java.lang.String) binds: [B:45:0x00fe, B:25:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r15v2 char) = (r15v4 char), (r15v6 char) binds: [B:45:0x00fe, B:25:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
    
        if (r0 == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0132, code lost:
    
        r11 = r13;
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0141, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0151, code lost:
    
        r9 = r4 + 1;
        B2.a.w(B2.a.q(r9, r0.getMessage(), " on ", r10, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        if (r4 != r8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        r4 = r12;
        r0 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e6, code lost:
    
        r12 = r4;
        r4 = r9;
        r9 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object t(java.lang.String str, java.lang.String str2, java.lang.String str3, p117n6.c cVar) throws java.lang.Exception {
        Y4.D0 d4;
        Y4.Q0 q9;
        java.lang.String strConcat;
        Y4.Q0 q10;
        int i3;
        char c9;
        java.util.Map map;
        java.lang.String str4;
        java.util.Map map2;
        p034d5.c cVar2;
        if (cVar instanceof Y4.D0) {
            d4 = (Y4.D0) cVar;
            int i9 = d4.f11573p;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                d4.f11573p = i9 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                d4 = new Y4.D0(q9, cVar);
            }
        } else {
            q9 = this;
            d4 = new Y4.D0(q9, cVar);
        }
        java.lang.Object objB = d4.f11571n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = d4.f11573p;
        int i11 = 1;
        try {
            if (i10 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                java.lang.String str5 = kotlin.jvm.internal.m.a(str, "tv") ? "tv" : "movie";
                java.lang.String str6 = str3;
                java.lang.String strQ1 = str2 == null ? O7.q.q1(2, str6) : str2;
                int i12 = 0;
                strConcat = "/watch/providers/".concat(str5);
                q10 = q9;
                java.util.Map mapJ0 = p078i6.D.J0(new p070h6.k("watch_region", strQ1));
                i3 = 2;
                if (i12 > 0) {
                    long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i12 - 1)) * 1000);
                    d4.f11566h = str6;
                    d4.f11567i = q10;
                    d4.j = strConcat;
                    d4.f11568k = mapJ0;
                    d4.f11569l = i3;
                    d4.f11570m = i12;
                    d4.f11573p = i11;
                    if (S7.C.n(jI, d4) != aVar) {
                        str4 = str6;
                        i10 = i12;
                        map2 = mapJ0;
                    }
                    return aVar;
                }
                str4 = str6;
                i10 = i12;
                map2 = mapJ0;
                cVar2 = q10.f11715c;
                d4.f11566h = str4;
                d4.f11567i = q10;
                d4.j = strConcat;
                d4.f11568k = map2;
                d4.f11569l = i3;
                d4.f11570m = i10;
                c9 = 2;
                d4.f11573p = 2;
                if (cVar2.a(d4) != aVar) {
                    Y4.Q0 q11 = q10;
                    java.lang.String str7 = strConcat;
                    map = map2;
                    p034d5.c cVar3 = q11.f11716d;
                    Y4.C0 c10 = new Y4.C0(q11, str7, str4, map, null);
                    d4.f11566h = str4;
                    d4.f11567i = q11;
                    d4.j = str7;
                    d4.f11568k = map;
                    d4.f11569l = i3;
                    d4.f11570m = i10;
                    d4.f11573p = 3;
                    objB = cVar3.b(c10, d4);
                }
                return aVar;
            }
            if (i10 == 1) {
                i10 = d4.f11570m;
                i3 = d4.f11569l;
                map2 = d4.f11568k;
                strConcat = d4.j;
                q10 = d4.f11567i;
                str4 = d4.f11566h;
                com.google.common.util.concurrent.P.u0(objB);
                cVar2 = q10.f11715c;
                d4.f11566h = str4;
                d4.f11567i = q10;
                d4.j = strConcat;
                d4.f11568k = map2;
                d4.f11569l = i3;
                d4.f11570m = i10;
                c9 = 2;
                d4.f11573p = 2;
                if (cVar2.a(d4) != aVar) {
                    Y4.Q0 q12 = q10;
                    java.lang.String str8 = strConcat;
                    map = map2;
                    p034d5.c cVar4 = q12.f11716d;
                    Y4.C0 c11 = new Y4.C0(q12, str8, str4, map, null);
                    d4.f11566h = str4;
                    d4.f11567i = q12;
                    d4.j = str8;
                    d4.f11568k = map;
                    d4.f11569l = i3;
                    d4.f11570m = i10;
                    d4.f11573p = 3;
                    objB = cVar4.b(c11, d4);
                }
                return aVar;
            }
            try {
                if (i10 == 2) {
                    i10 = d4.f11570m;
                    i3 = d4.f11569l;
                    map2 = d4.f11568k;
                    strConcat = d4.j;
                    q10 = d4.f11567i;
                    str4 = d4.f11566h;
                    com.google.common.util.concurrent.P.u0(objB);
                    c9 = 2;
                    Y4.Q0 q13 = q10;
                    java.lang.String str9 = strConcat;
                    map = map2;
                    p034d5.c cVar5 = q13.f11716d;
                    Y4.C0 c12 = new Y4.C0(q13, str9, str4, map, null);
                    d4.f11566h = str4;
                    d4.f11567i = q13;
                    d4.j = str9;
                    d4.f11568k = map;
                    d4.f11569l = i3;
                    d4.f11570m = i10;
                    d4.f11573p = 3;
                    objB = cVar5.b(c12, d4);
                } else {
                    if (i10 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = d4.f11570m;
                    int i14 = d4.f11569l;
                    java.util.Map map3 = d4.f11568k;
                    java.lang.String str10 = d4.j;
                    Y4.Q0 q14 = d4.f11567i;
                    java.lang.String str11 = d4.f11566h;
                    com.google.common.util.concurrent.P.u0(objB);
                }
            } catch (java.lang.Exception e6) {
                java.lang.Exception e9 = e6;
                c9 = 2;
                map = map2;
                q10.getClass();
                if (u(e9)) {
                }
                throw e9;
            }
            return p078i6.o.I1(((com.kiptv.core.model.TMDBWatchProviderListResponse) objB).f20356a, new C5.O1(26));
        } catch (java.util.concurrent.CancellationException e10) {
            throw e10;
        }
    }

    public final java.lang.String v(java.lang.String str) {
        Companion.getClass();
        return Y4.A.b(str, "w500", "https://image.tmdb.org/t/p");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|67|38|39|69|40|(0)|47) */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013a, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r9, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015c, code lost:
    
        if (r4 != r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015e, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object w(java.lang.String str, java.lang.Integer num, boolean z6, int i3, java.lang.String str2, p117n6.c cVar) {
        Y4.G0 g9;
        Y4.Q0 q9;
        java.util.Map mapB;
        Y4.Q0 q10;
        java.lang.String str3;
        int i9;
        java.lang.String str4;
        char c9;
        java.lang.Exception e6;
        java.util.Map map;
        java.lang.String str5;
        p034d5.c cVar2;
        if (cVar instanceof Y4.G0) {
            g9 = (Y4.G0) cVar;
            int i10 = g9.f11610p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g9.f11610p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                g9 = new Y4.G0(q9, cVar);
            }
        } else {
            q9 = this;
            g9 = new Y4.G0(q9, cVar);
        }
        java.lang.Object obj = g9.f11608n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = g9.f11610p;
        int i12 = 1;
        try {
            try {
                try {
                    if (i11 == 0) {
                        com.google.common.util.concurrent.P.u0(obj);
                        p086j6.e eVar = new p086j6.e();
                        eVar.put("query", str);
                        eVar.put("include_adult", java.lang.String.valueOf(z6));
                        eVar.put("page", java.lang.String.valueOf(i3));
                        if (num != null) {
                            eVar.put("year", num.toString());
                        }
                        mapB = eVar.b();
                        q10 = q9;
                        str3 = "/search/movie";
                        i11 = 0;
                        java.lang.String str6 = str2;
                        i9 = 2;
                        if (i11 > 0) {
                            java.util.Map map2 = mapB;
                            long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                            g9.f11603h = str6;
                            g9.f11604i = map2;
                            g9.j = q10;
                            g9.f11605k = str3;
                            g9.f11606l = i9;
                            g9.f11607m = i11;
                            g9.f11610p = i12;
                            if (S7.C.n(jI, g9) != aVar) {
                                mapB = map2;
                                str4 = str6;
                            }
                            return aVar;
                        }
                        str4 = str6;
                        cVar2 = q10.f11715c;
                        g9.f11603h = str4;
                        g9.f11604i = mapB;
                        g9.j = q10;
                        g9.f11605k = str3;
                        g9.f11606l = i9;
                        g9.f11607m = i11;
                        c9 = 2;
                        g9.f11610p = 2;
                        if (cVar2.a(g9) != aVar) {
                        }
                        return aVar;
                    }
                    if (i11 == 1) {
                        i11 = g9.f11607m;
                        i9 = g9.f11606l;
                        str3 = g9.f11605k;
                        q10 = g9.j;
                        mapB = g9.f11604i;
                        str4 = g9.f11603h;
                        com.google.common.util.concurrent.P.u0(obj);
                        cVar2 = q10.f11715c;
                        g9.f11603h = str4;
                        g9.f11604i = mapB;
                        g9.j = q10;
                        g9.f11605k = str3;
                        g9.f11606l = i9;
                        g9.f11607m = i11;
                        c9 = 2;
                        g9.f11610p = 2;
                        if (cVar2.a(g9) != aVar) {
                        }
                        return aVar;
                    }
                    try {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i13 = g9.f11607m;
                            int i14 = g9.f11606l;
                            java.lang.String str7 = g9.f11605k;
                            Y4.Q0 q11 = g9.j;
                            java.util.Map map3 = g9.f11604i;
                            java.lang.String str8 = g9.f11603h;
                            com.google.common.util.concurrent.P.u0(obj);
                            return obj;
                        }
                        i11 = g9.f11607m;
                        i9 = g9.f11606l;
                        str3 = g9.f11605k;
                        q10 = g9.j;
                        mapB = g9.f11604i;
                        str4 = g9.f11603h;
                        com.google.common.util.concurrent.P.u0(obj);
                        c9 = 2;
                    } catch (java.lang.Exception e9) {
                        e6 = e9;
                        c9 = 2;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    str3 = str5;
                    mapB = map;
                    q10.getClass();
                    if (u(e6)) {
                    }
                    throw e6;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
            }
            map = mapB;
            str5 = str3;
            p034d5.c cVar3 = q10.f11716d;
            Y4.F0 f9 = new Y4.F0(q10, str5, str4, map, null);
            g9.f11603h = str4;
            g9.f11604i = map;
            g9.j = q10;
            g9.f11605k = str5;
            g9.f11606l = i9;
            g9.f11607m = i11;
            g9.f11610p = 3;
            java.lang.Object objB = cVar3.b(f9, g9);
            if (objB == aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|70|35|36|64|37|(0)|44) */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:45:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0132, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0133, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r9, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0155, code lost:
    
        if (r4 != r8) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015d, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object x(int i3, java.lang.String str, java.lang.String str2, p117n6.c cVar) {
        Y4.J0 j9;
        Y4.Q0 q9;
        java.util.Map mapN0;
        Y4.Q0 q10;
        java.lang.String str3;
        int i9;
        java.lang.String str4;
        char c9;
        java.lang.Exception e6;
        java.util.Map map;
        java.lang.String str5;
        p034d5.c cVar2;
        if (cVar instanceof Y4.J0) {
            j9 = (Y4.J0) cVar;
            int i10 = j9.f11643p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j9.f11643p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                j9 = new Y4.J0(q9, cVar);
            }
        } else {
            q9 = this;
            j9 = new Y4.J0(q9, cVar);
        }
        java.lang.Object obj = j9.f11641n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = j9.f11643p;
        int i12 = 1;
        try {
            try {
                try {
                    if (i11 == 0) {
                        com.google.common.util.concurrent.P.u0(obj);
                        i11 = 0;
                        mapN0 = p078i6.C.N0(new p070h6.k("query", str), new p070h6.k("include_adult", java.lang.String.valueOf(false)), new p070h6.k("page", java.lang.String.valueOf(i3)));
                        q10 = q9;
                        str3 = "/search/multi";
                        java.lang.String str6 = str2;
                        i9 = 2;
                        if (i11 > 0) {
                            java.util.Map map2 = mapN0;
                            long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                            j9.f11636h = str6;
                            j9.f11637i = map2;
                            j9.j = q10;
                            j9.f11638k = str3;
                            j9.f11639l = i9;
                            j9.f11640m = i11;
                            j9.f11643p = i12;
                            if (S7.C.n(jI, j9) != aVar) {
                                mapN0 = map2;
                                str4 = str6;
                            }
                            return aVar;
                        }
                        str4 = str6;
                        cVar2 = q10.f11715c;
                        j9.f11636h = str4;
                        j9.f11637i = mapN0;
                        j9.j = q10;
                        j9.f11638k = str3;
                        j9.f11639l = i9;
                        j9.f11640m = i11;
                        c9 = 2;
                        j9.f11643p = 2;
                        if (cVar2.a(j9) != aVar) {
                        }
                        return aVar;
                    }
                    if (i11 == 1) {
                        i11 = j9.f11640m;
                        i9 = j9.f11639l;
                        str3 = j9.f11638k;
                        q10 = j9.j;
                        mapN0 = j9.f11637i;
                        str4 = j9.f11636h;
                        com.google.common.util.concurrent.P.u0(obj);
                        cVar2 = q10.f11715c;
                        j9.f11636h = str4;
                        j9.f11637i = mapN0;
                        j9.j = q10;
                        j9.f11638k = str3;
                        j9.f11639l = i9;
                        j9.f11640m = i11;
                        c9 = 2;
                        j9.f11643p = 2;
                        if (cVar2.a(j9) != aVar) {
                        }
                        return aVar;
                    }
                    try {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i13 = j9.f11640m;
                            int i14 = j9.f11639l;
                            java.lang.String str7 = j9.f11638k;
                            Y4.Q0 q11 = j9.j;
                            java.util.Map map3 = j9.f11637i;
                            java.lang.String str8 = j9.f11636h;
                            com.google.common.util.concurrent.P.u0(obj);
                            return obj;
                        }
                        i11 = j9.f11640m;
                        i9 = j9.f11639l;
                        str3 = j9.f11638k;
                        q10 = j9.j;
                        mapN0 = j9.f11637i;
                        str4 = j9.f11636h;
                        com.google.common.util.concurrent.P.u0(obj);
                        c9 = 2;
                    } catch (java.lang.Exception e9) {
                        e6 = e9;
                        c9 = 2;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    str3 = str5;
                    mapN0 = map;
                    q10.getClass();
                    if (u(e6)) {
                    }
                    throw e6;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
            }
            map = mapN0;
            str5 = str3;
            p034d5.c cVar3 = q10.f11716d;
            Y4.I0 i15 = new Y4.I0(q10, str5, str4, map, null);
            j9.f11636h = str4;
            j9.f11637i = map;
            j9.j = q10;
            j9.f11638k = str5;
            j9.f11639l = i9;
            j9.f11640m = i11;
            j9.f11643p = 3;
            java.lang.Object objB = cVar3.b(i15, j9);
            if (objB == aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|70|35|36|64|37|(0)|44) */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0134, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0141, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r9, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0156, code lost:
    
        if (r4 != r8) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015e, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object y(java.lang.String str, boolean z6, int i3, java.lang.String str2, p117n6.c cVar) throws java.lang.Exception {
        Y4.M0 m8;
        Y4.Q0 q9;
        java.util.Map mapN0;
        Y4.Q0 q10;
        java.lang.String str3;
        int i9;
        java.lang.String str4;
        char c9;
        java.lang.Exception e6;
        java.util.Map map;
        java.lang.String str5;
        p034d5.c cVar2;
        if (cVar instanceof Y4.M0) {
            m8 = (Y4.M0) cVar;
            int i10 = m8.f11675p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                m8.f11675p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                m8 = new Y4.M0(q9, cVar);
            }
        } else {
            q9 = this;
            m8 = new Y4.M0(q9, cVar);
        }
        java.lang.Object obj = m8.f11673n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = m8.f11675p;
        int i12 = 1;
        try {
            try {
                try {
                    if (i11 == 0) {
                        com.google.common.util.concurrent.P.u0(obj);
                        mapN0 = p078i6.C.N0(new p070h6.k("query", str), new p070h6.k("include_adult", java.lang.String.valueOf(z6)), new p070h6.k("page", java.lang.String.valueOf(i3)));
                        q10 = q9;
                        str3 = "/search/person";
                        i11 = 0;
                        java.lang.String str6 = str2;
                        i9 = 2;
                        if (i11 > 0) {
                            java.util.Map map2 = mapN0;
                            long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                            m8.f11668h = str6;
                            m8.f11669i = map2;
                            m8.j = q10;
                            m8.f11670k = str3;
                            m8.f11671l = i9;
                            m8.f11672m = i11;
                            m8.f11675p = i12;
                            if (S7.C.n(jI, m8) != aVar) {
                                mapN0 = map2;
                                str4 = str6;
                            }
                            return aVar;
                        }
                        str4 = str6;
                        cVar2 = q10.f11715c;
                        m8.f11668h = str4;
                        m8.f11669i = mapN0;
                        m8.j = q10;
                        m8.f11670k = str3;
                        m8.f11671l = i9;
                        m8.f11672m = i11;
                        c9 = 2;
                        m8.f11675p = 2;
                        if (cVar2.a(m8) != aVar) {
                        }
                        return aVar;
                    }
                    if (i11 == 1) {
                        i11 = m8.f11672m;
                        i9 = m8.f11671l;
                        str3 = m8.f11670k;
                        q10 = m8.j;
                        mapN0 = m8.f11669i;
                        str4 = m8.f11668h;
                        com.google.common.util.concurrent.P.u0(obj);
                        cVar2 = q10.f11715c;
                        m8.f11668h = str4;
                        m8.f11669i = mapN0;
                        m8.j = q10;
                        m8.f11670k = str3;
                        m8.f11671l = i9;
                        m8.f11672m = i11;
                        c9 = 2;
                        m8.f11675p = 2;
                        if (cVar2.a(m8) != aVar) {
                        }
                        return aVar;
                    }
                    try {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i13 = m8.f11672m;
                            int i14 = m8.f11671l;
                            java.lang.String str7 = m8.f11670k;
                            Y4.Q0 q11 = m8.j;
                            java.util.Map map3 = m8.f11669i;
                            java.lang.String str8 = m8.f11668h;
                            com.google.common.util.concurrent.P.u0(obj);
                            return obj;
                        }
                        i11 = m8.f11672m;
                        i9 = m8.f11671l;
                        str3 = m8.f11670k;
                        q10 = m8.j;
                        mapN0 = m8.f11669i;
                        str4 = m8.f11668h;
                        com.google.common.util.concurrent.P.u0(obj);
                        c9 = 2;
                    } catch (java.lang.Exception e9) {
                        e6 = e9;
                        c9 = 2;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    str3 = str5;
                    mapN0 = map;
                    q10.getClass();
                    if (u(e6)) {
                    }
                    throw e6;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
            }
            map = mapN0;
            str5 = str3;
            p034d5.c cVar3 = q10.f11716d;
            Y4.L0 l2 = new Y4.L0(q10, str5, str4, map, null);
            m8.f11668h = str4;
            m8.f11669i = map;
            m8.j = q10;
            m8.f11670k = str5;
            m8.f11671l = i9;
            m8.f11672m = i11;
            m8.f11675p = 3;
            java.lang.Object objB = cVar3.b(l2, m8);
            if (objB == aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|67|38|39|69|40|(0)|47) */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013a, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        r13 = r4 + 1;
        B2.a.w(B2.a.q(r13, r0.getMessage(), " on ", r9, ", retry "), "/", r8, "TMDBApiClient");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015c, code lost:
    
        if (r4 != r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015e, code lost:
    
        r0 = r12;
        r4 = r13;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object z(java.lang.String str, java.lang.Integer num, boolean z6, int i3, java.lang.String str2, p117n6.c cVar) {
        Y4.P0 p2;
        Y4.Q0 q9;
        java.util.Map mapB;
        Y4.Q0 q10;
        java.lang.String str3;
        int i9;
        java.lang.String str4;
        char c9;
        java.lang.Exception e6;
        java.util.Map map;
        java.lang.String str5;
        p034d5.c cVar2;
        if (cVar instanceof Y4.P0) {
            p2 = (Y4.P0) cVar;
            int i10 = p2.f11708p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p2.f11708p = i10 - Integer.MIN_VALUE;
                q9 = this;
            } else {
                q9 = this;
                p2 = new Y4.P0(q9, cVar);
            }
        } else {
            q9 = this;
            p2 = new Y4.P0(q9, cVar);
        }
        java.lang.Object obj = p2.f11706n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = p2.f11708p;
        int i12 = 1;
        try {
            try {
                try {
                    if (i11 == 0) {
                        com.google.common.util.concurrent.P.u0(obj);
                        p086j6.e eVar = new p086j6.e();
                        eVar.put("query", str);
                        eVar.put("include_adult", java.lang.String.valueOf(z6));
                        eVar.put("page", java.lang.String.valueOf(i3));
                        if (num != null) {
                            eVar.put("first_air_date_year", num.toString());
                        }
                        mapB = eVar.b();
                        q10 = q9;
                        str3 = "/search/tv";
                        i11 = 0;
                        java.lang.String str6 = str2;
                        i9 = 2;
                        if (i11 > 0) {
                            java.util.Map map2 = mapB;
                            long jI = B6.d.f818i.i(0L, 500L) + (((long) java.lang.Math.pow(2.0d, i11 - 1)) * 1000);
                            p2.f11701h = str6;
                            p2.f11702i = map2;
                            p2.j = q10;
                            p2.f11703k = str3;
                            p2.f11704l = i9;
                            p2.f11705m = i11;
                            p2.f11708p = i12;
                            if (S7.C.n(jI, p2) != aVar) {
                                mapB = map2;
                                str4 = str6;
                            }
                            return aVar;
                        }
                        str4 = str6;
                        cVar2 = q10.f11715c;
                        p2.f11701h = str4;
                        p2.f11702i = mapB;
                        p2.j = q10;
                        p2.f11703k = str3;
                        p2.f11704l = i9;
                        p2.f11705m = i11;
                        c9 = 2;
                        p2.f11708p = 2;
                        if (cVar2.a(p2) != aVar) {
                        }
                        return aVar;
                    }
                    if (i11 == 1) {
                        i11 = p2.f11705m;
                        i9 = p2.f11704l;
                        str3 = p2.f11703k;
                        q10 = p2.j;
                        mapB = p2.f11702i;
                        str4 = p2.f11701h;
                        com.google.common.util.concurrent.P.u0(obj);
                        cVar2 = q10.f11715c;
                        p2.f11701h = str4;
                        p2.f11702i = mapB;
                        p2.j = q10;
                        p2.f11703k = str3;
                        p2.f11704l = i9;
                        p2.f11705m = i11;
                        c9 = 2;
                        p2.f11708p = 2;
                        if (cVar2.a(p2) != aVar) {
                        }
                        return aVar;
                    }
                    try {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i13 = p2.f11705m;
                            int i14 = p2.f11704l;
                            java.lang.String str7 = p2.f11703k;
                            Y4.Q0 q11 = p2.j;
                            java.util.Map map3 = p2.f11702i;
                            java.lang.String str8 = p2.f11701h;
                            com.google.common.util.concurrent.P.u0(obj);
                            return obj;
                        }
                        i11 = p2.f11705m;
                        i9 = p2.f11704l;
                        str3 = p2.f11703k;
                        q10 = p2.j;
                        mapB = p2.f11702i;
                        str4 = p2.f11701h;
                        com.google.common.util.concurrent.P.u0(obj);
                        c9 = 2;
                    } catch (java.lang.Exception e9) {
                        e6 = e9;
                        c9 = 2;
                        q10.getClass();
                        if (u(e6)) {
                        }
                        throw e6;
                    }
                } catch (java.lang.Exception e10) {
                    e6 = e10;
                    str3 = str5;
                    mapB = map;
                    q10.getClass();
                    if (u(e6)) {
                    }
                    throw e6;
                }
            } catch (java.lang.Exception e11) {
                e6 = e11;
            }
            map = mapB;
            str5 = str3;
            p034d5.c cVar3 = q10.f11716d;
            Y4.O0 o8 = new Y4.O0(q10, str5, str4, map, null);
            p2.f11701h = str4;
            p2.f11702i = map;
            p2.j = q10;
            p2.f11703k = str5;
            p2.f11704l = i9;
            p2.f11705m = i11;
            p2.f11708p = 3;
            java.lang.Object objB = cVar3.b(o8, p2);
            if (objB == aVar) {
                return aVar;
            }
            return objB;
        } catch (java.util.concurrent.CancellationException e12) {
            throw e12;
        }
    }
}
