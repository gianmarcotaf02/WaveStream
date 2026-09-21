package p005a5;

/* JADX INFO: renamed from: a5.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1434v8 {
    public static final p005a5.C1265e8 Companion = new p005a5.C1265e8();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f15191A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final java.util.Set f15192B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.util.Set f15193C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p028c8.d f15194D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public S7.F f15195E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a5.C1451x5 f15196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U4.x f15197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1366p f15198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.M1 f15199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1291h4 f15200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p015b5.t f15201f;
    public final p132p5.a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.n0 f15202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.W f15203i;
    public final V7.n0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.W f15204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.n0 f15205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V7.W f15206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V7.n0 f15207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V7.W f15208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V7.n0 f15209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V7.W f15210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V7.n0 f15211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final V7.W f15212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final V7.n0 f15213t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final V7.W f15214u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile java.lang.String f15215v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile java.lang.String f15216w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final V7.n0 f15217x;
    public final V7.W y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f15218z;

    public C1434v8(p005a5.C1451x5 tmdbRepository, U4.x diskCache, p005a5.C1366p contentCacheRepository, p005a5.M1 playlistRepository, p005a5.C1291h4 settingsRepository, p015b5.t localizationService, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(diskCache, "diskCache");
        kotlin.jvm.internal.m.e(contentCacheRepository, "contentCacheRepository");
        kotlin.jvm.internal.m.e(playlistRepository, "playlistRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(localizationService, "localizationService");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f15196a = tmdbRepository;
        this.f15197b = diskCache;
        this.f15198c = contentCacheRepository;
        this.f15199d = playlistRepository;
        this.f15200e = settingsRepository;
        this.f15201f = localizationService;
        this.g = appConfig;
        V7.n0 n0VarB = V7.r.b(null);
        this.f15202h = n0VarB;
        this.f15203i = new V7.W(n0VarB);
        V7.n0 n0VarB2 = V7.r.b(null);
        this.j = n0VarB2;
        this.f15204k = new V7.W(n0VarB2);
        V7.n0 n0VarB3 = V7.r.b(null);
        this.f15205l = n0VarB3;
        this.f15206m = new V7.W(n0VarB3);
        V7.n0 n0VarB4 = V7.r.b(null);
        this.f15207n = n0VarB4;
        this.f15208o = new V7.W(n0VarB4);
        p078i6.x xVar = p078i6.x.f23206h;
        V7.n0 n0VarB5 = V7.r.b(xVar);
        this.f15209p = n0VarB5;
        this.f15210q = new V7.W(n0VarB5);
        V7.n0 n0VarB6 = V7.r.b(xVar);
        this.f15211r = n0VarB6;
        this.f15212s = new V7.W(n0VarB6);
        p078i6.y yVar = p078i6.y.f23207h;
        V7.n0 n0VarB7 = V7.r.b(yVar);
        this.f15213t = n0VarB7;
        this.f15214u = new V7.W(n0VarB7);
        V7.n0 n0VarB8 = V7.r.b(yVar);
        this.f15217x = n0VarB8;
        this.y = new V7.W(n0VarB8);
        this.f15218z = new java.util.concurrent.ConcurrentHashMap();
        this.f15191A = new java.util.concurrent.ConcurrentHashMap();
        java.util.Set setSynchronizedSet = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        kotlin.jvm.internal.m.d(setSynchronizedSet, "synchronizedSet(...)");
        this.f15192B = setSynchronizedSet;
        java.util.Set setSynchronizedSet2 = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        kotlin.jvm.internal.m.d(setSynchronizedSet2, "synchronizedSet(...)");
        this.f15193C = setSynchronizedSet2;
        this.f15194D = new p028c8.d();
    }

    public static final java.util.Set a(p005a5.C1434v8 c1434v8, java.util.List list) {
        c1434v8.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            p005a5.C1381q4 c1381q4 = p005a5.C1451x5.Companion;
            java.lang.String str = ((com.kiptv.core.model.XtreamCategory) obj).f20650b;
            c1381q4.getClass();
            if (p005a5.C1381q4.b(str)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.kiptv.core.model.XtreamCategory) it.next()).f20649a);
        }
        return p078i6.o.R1(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final java.lang.Object b(p005a5.C1434v8 c1434v8, com.kiptv.core.model.TMDBSearchResult tMDBSearchResult, p117n6.c cVar) {
        p005a5.C1275f8 c1275f8;
        java.lang.String str;
        java.lang.Object objP;
        java.lang.String str2;
        com.kiptv.core.model.TMDBGenre tMDBGenre;
        java.lang.String str3;
        p005a5.C1434v8 c1434v9 = c1434v8;
        com.kiptv.core.model.TMDBSearchResult tMDBSearchResult2 = tMDBSearchResult;
        if (cVar instanceof p005a5.C1275f8) {
            c1275f8 = (p005a5.C1275f8) cVar;
            int i3 = c1275f8.f14470m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1275f8.f14470m = i3 - Integer.MIN_VALUE;
            } else {
                c1275f8 = new p005a5.C1275f8(c1434v9, cVar);
            }
        } else {
            c1275f8 = new p005a5.C1275f8(c1434v9, cVar);
        }
        java.lang.Object obj = c1275f8.f14468k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1275f8.f14470m;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                str = (java.lang.String) ((V7.n0) c1434v9.f15201f.f17998d.f10419h).getValue();
                java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                O7.q.p1(2, upperCase);
                p005a5.C1451x5 c1451x5 = c1434v9.f15196a;
                int i10 = tMDBSearchResult2.f20292a;
                c1275f8.f14466h = c1434v9;
                c1275f8.f14467i = tMDBSearchResult2;
                c1275f8.j = str;
                c1275f8.f14470m = 1;
                objP = c1451x5.p(i10, c1275f8);
                if (objP == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str4 = c1275f8.j;
                tMDBSearchResult2 = c1275f8.f14467i;
                p005a5.C1434v8 c1434v10 = c1275f8.f14466h;
                com.google.common.util.concurrent.P.u0(obj);
                str = str4;
                c1434v9 = c1434v10;
                objP = obj;
            }
            com.kiptv.core.model.TMDBMovieDetail tMDBMovieDetail = (com.kiptv.core.model.TMDBMovieDetail) objP;
            p005a5.C1265e8 c1265e8 = Companion;
            com.kiptv.core.model.TMDBImages tMDBImages = tMDBMovieDetail.f20212t;
            java.util.List list = tMDBImages != null ? tMDBImages.f20187a : null;
            c1265e8.getClass();
            java.lang.String strA = p005a5.C1265e8.a(str, list);
            com.kiptv.core.model.TMDBImages tMDBImages2 = tMDBMovieDetail.f20212t;
            java.lang.String strB = p005a5.C1265e8.b(tMDBImages2 != null ? tMDBImages2.f20188b : null);
            if (strB != null) {
                c1434v9.f15218z.put(new java.lang.Integer(tMDBSearchResult2.f20292a), strB);
            }
            java.lang.Integer num = tMDBMovieDetail.f20202i;
            if (num == null) {
                str2 = null;
            } else {
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    int i11 = iIntValue / 60;
                    int i12 = iIntValue % 60;
                    if (i11 > 0) {
                        str3 = i11 + "h " + i12 + androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_MANIFEST;
                    } else {
                        str3 = i12 + androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_MANIFEST;
                    }
                    str2 = str3;
                } else {
                    str2 = null;
                }
            }
            java.lang.Integer numC = tMDBMovieDetail.c();
            java.lang.String string = numC != null ? numC.toString() : null;
            com.kiptv.core.model.ContentRatingInfo contentRatingInfoA = tMDBMovieDetail.a(com.google.android.gms.internal.play_billing.V0.u());
            int i13 = tMDBSearchResult2.f20292a;
            java.lang.String str5 = tMDBMovieDetail.f20196b;
            java.lang.String str6 = tMDBMovieDetail.g;
            if (str6 == null) {
                str6 = tMDBSearchResult2.f20298h;
            }
            java.lang.String str7 = str6;
            java.lang.String str8 = tMDBMovieDetail.f20200f;
            if (str8 == null) {
                str8 = tMDBSearchResult2.g;
            }
            java.lang.String str9 = str8;
            java.lang.Double d4 = tMDBMovieDetail.j;
            java.util.List list2 = tMDBMovieDetail.f20204l;
            return new p005a5.C1255d8(i13, str5, str7, str9, strB, strA, d4, (list2 == null || (tMDBGenre = (com.kiptv.core.model.TMDBGenre) p078i6.o.j1(list2)) == null) ? null : tMDBGenre.f20179b, string, str2, contentRatingInfoA != null ? contentRatingInfoA.e() : null, contentRatingInfoA, tMDBMovieDetail.f20199e);
        } catch (java.lang.Exception e6) {
            android.util.Log.d("TrendingRepository", "Error loading details for " + tMDBSearchResult2.f20292a + ": " + e6.getMessage());
            java.lang.String strA2 = tMDBSearchResult2.a();
            java.lang.Integer numB = tMDBSearchResult2.b();
            return new p005a5.C1255d8(tMDBSearchResult2.f20292a, strA2, tMDBSearchResult2.f20298h, tMDBSearchResult2.g, null, null, tMDBSearchResult2.f20300k, null, numB != null ? numB.toString() : null, null, null, null, tMDBSearchResult2.f20297f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0100 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0030, B:22:0x0078, B:24:0x0080, B:26:0x0084, B:28:0x008f, B:30:0x0093, B:32:0x0099, B:33:0x00a5, B:35:0x00a9, B:37:0x00af, B:41:0x00ba, B:52:0x00fa, B:54:0x0100, B:56:0x0109, B:58:0x011b, B:59:0x011d, B:61:0x0122, B:62:0x0124, B:64:0x012b, B:66:0x0133, B:69:0x013c, B:71:0x0145, B:43:0x00d2, B:45:0x00d6, B:48:0x00e0, B:50:0x00e6, B:19:0x0065), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0030, B:22:0x0078, B:24:0x0080, B:26:0x0084, B:28:0x008f, B:30:0x0093, B:32:0x0099, B:33:0x00a5, B:35:0x00a9, B:37:0x00af, B:41:0x00ba, B:52:0x00fa, B:54:0x0100, B:56:0x0109, B:58:0x011b, B:59:0x011d, B:61:0x0122, B:62:0x0124, B:64:0x012b, B:66:0x0133, B:69:0x013c, B:71:0x0145, B:43:0x00d2, B:45:0x00d6, B:48:0x00e0, B:50:0x00e6, B:19:0x0065), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0122 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0030, B:22:0x0078, B:24:0x0080, B:26:0x0084, B:28:0x008f, B:30:0x0093, B:32:0x0099, B:33:0x00a5, B:35:0x00a9, B:37:0x00af, B:41:0x00ba, B:52:0x00fa, B:54:0x0100, B:56:0x0109, B:58:0x011b, B:59:0x011d, B:61:0x0122, B:62:0x0124, B:64:0x012b, B:66:0x0133, B:69:0x013c, B:71:0x0145, B:43:0x00d2, B:45:0x00d6, B:48:0x00e0, B:50:0x00e6, B:19:0x0065), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0030, B:22:0x0078, B:24:0x0080, B:26:0x0084, B:28:0x008f, B:30:0x0093, B:32:0x0099, B:33:0x00a5, B:35:0x00a9, B:37:0x00af, B:41:0x00ba, B:52:0x00fa, B:54:0x0100, B:56:0x0109, B:58:0x011b, B:59:0x011d, B:61:0x0122, B:62:0x0124, B:64:0x012b, B:66:0x0133, B:69:0x013c, B:71:0x0145, B:43:0x00d2, B:45:0x00d6, B:48:0x00e0, B:50:0x00e6, B:19:0x0065), top: B:78:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final java.lang.Object c(p005a5.C1434v8 c1434v8, com.kiptv.core.model.TMDBSearchResult tMDBSearchResult, p117n6.c cVar) {
        p005a5.C1285g8 c1285g8;
        java.lang.String str;
        java.lang.Object objW;
        java.lang.String str2;
        java.lang.String strE;
        java.lang.Integer numB;
        java.lang.String string;
        com.kiptv.core.model.ContentRatingInfo contentRatingInfoA;
        java.lang.String str3;
        java.lang.String str4;
        java.util.List list;
        java.lang.String str5;
        java.lang.String strE2;
        com.kiptv.core.model.TMDBGenre tMDBGenre;
        p005a5.C1434v8 c1434v9 = c1434v8;
        com.kiptv.core.model.TMDBSearchResult tMDBSearchResult2 = tMDBSearchResult;
        if (cVar instanceof p005a5.C1285g8) {
            c1285g8 = (p005a5.C1285g8) cVar;
            int i3 = c1285g8.f14502m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1285g8.f14502m = i3 - Integer.MIN_VALUE;
            } else {
                c1285g8 = new p005a5.C1285g8(c1434v9, cVar);
            }
        } else {
            c1285g8 = new p005a5.C1285g8(c1434v9, cVar);
        }
        java.lang.Object obj = c1285g8.f14500k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1285g8.f14502m;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                str = (java.lang.String) ((V7.n0) c1434v9.f15201f.f17998d.f10419h).getValue();
                java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                O7.q.p1(2, upperCase);
                p005a5.C1451x5 c1451x5 = c1434v9.f15196a;
                int i10 = tMDBSearchResult2.f20292a;
                c1285g8.f14498h = c1434v9;
                c1285g8.f14499i = tMDBSearchResult2;
                c1285g8.j = str;
                c1285g8.f14502m = 1;
                objW = c1451x5.w(i10, c1285g8);
                if (objW == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str6 = c1285g8.j;
                tMDBSearchResult2 = c1285g8.f14499i;
                p005a5.C1434v8 c1434v10 = c1285g8.f14498h;
                com.google.common.util.concurrent.P.u0(obj);
                str = str6;
                c1434v9 = c1434v10;
                objW = obj;
            }
            com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail = (com.kiptv.core.model.TMDBSeriesDetail) objW;
            p005a5.C1265e8 c1265e8 = Companion;
            com.kiptv.core.model.TMDBImages tMDBImages = tMDBSeriesDetail.f20327p;
            java.util.List list2 = tMDBImages != null ? tMDBImages.f20187a : null;
            c1265e8.getClass();
            java.lang.String strA = p005a5.C1265e8.a(str, list2);
            com.kiptv.core.model.TMDBImages tMDBImages2 = tMDBSeriesDetail.f20327p;
            java.lang.String strB = p005a5.C1265e8.b(tMDBImages2 != null ? tMDBImages2.f20188b : null);
            if (strB != null) {
                c1434v9.f15191A.put(new java.lang.Integer(tMDBSearchResult2.f20292a), strB);
            }
            java.lang.Integer num = tMDBSeriesDetail.f20321i;
            if (num == null || num.intValue() <= 0) {
                java.util.List list3 = tMDBSeriesDetail.f20322k;
                java.lang.Integer num2 = list3 != null ? (java.lang.Integer) p078i6.o.j1(list3) : null;
                if (num2 == null || num2.intValue() <= 0) {
                    str2 = null;
                } else {
                    strE = num2 + "m/ep";
                }
                numB = tMDBSeriesDetail.b();
                if (numB != null) {
                    string = numB.toString();
                } else {
                    string = null;
                }
                contentRatingInfoA = tMDBSeriesDetail.a(com.google.android.gms.internal.play_billing.V0.u());
                int i11 = tMDBSearchResult2.f20292a;
                java.lang.String str7 = tMDBSeriesDetail.f20315b;
                str3 = tMDBSeriesDetail.f20319f;
                if (str3 == null) {
                    str3 = tMDBSearchResult2.f20298h;
                }
                java.lang.String str8 = str3;
                str4 = tMDBSeriesDetail.f20318e;
                if (str4 == null) {
                    str4 = tMDBSearchResult2.g;
                }
                java.lang.String str9 = str4;
                java.lang.Double d4 = tMDBSeriesDetail.f20323l;
                list = tMDBSeriesDetail.f20325n;
                if (list != null || (tMDBGenre = (com.kiptv.core.model.TMDBGenre) p078i6.o.j1(list)) == null) {
                    str5 = null;
                } else {
                    str5 = tMDBGenre.f20179b;
                }
                if (contentRatingInfoA != null) {
                    strE2 = contentRatingInfoA.e();
                } else {
                    strE2 = null;
                }
                return new p005a5.C1255d8(i11, str7, str8, str9, strB, strA, d4, str5, string, str2, strE2, contentRatingInfoA, tMDBSeriesDetail.f20317d);
            }
            strE = c1434v9.f15201f.e(num.intValue() == 1 ? "series.seasonCount" : "series.seasonsCount", p078i6.D.J0(new p070h6.k("count", java.lang.String.valueOf(num))));
            str2 = strE;
            numB = tMDBSeriesDetail.b();
            if (numB != null) {
                string = numB.toString();
            } else {
                string = null;
            }
            contentRatingInfoA = tMDBSeriesDetail.a(com.google.android.gms.internal.play_billing.V0.u());
            int i12 = tMDBSearchResult2.f20292a;
            java.lang.String str10 = tMDBSeriesDetail.f20315b;
            str3 = tMDBSeriesDetail.f20319f;
            if (str3 == null) {
                str3 = tMDBSearchResult2.f20298h;
            }
            java.lang.String str11 = str3;
            str4 = tMDBSeriesDetail.f20318e;
            if (str4 == null) {
                str4 = tMDBSearchResult2.g;
            }
            java.lang.String str12 = str4;
            java.lang.Double d6 = tMDBSeriesDetail.f20323l;
            list = tMDBSeriesDetail.f20325n;
            if (list != null) {
                str5 = null;
            } else {
                str5 = null;
            }
            if (contentRatingInfoA != null) {
                strE2 = contentRatingInfoA.e();
            } else {
                strE2 = null;
            }
            return new p005a5.C1255d8(i12, str10, str11, str12, strB, strA, d6, str5, string, str2, strE2, contentRatingInfoA, tMDBSeriesDetail.f20317d);
        } catch (java.lang.Exception e6) {
            android.util.Log.d("TrendingRepository", "Error loading series details for " + tMDBSearchResult2.f20292a + ": " + e6.getMessage());
            java.lang.String strA2 = tMDBSearchResult2.a();
            java.lang.Integer numB2 = tMDBSearchResult2.b();
            return new p005a5.C1255d8(tMDBSearchResult2.f20292a, strA2, tMDBSearchResult2.f20298h, tMDBSearchResult2.g, null, null, tMDBSearchResult2.f20300k, null, numB2 != null ? numB2.toString() : null, null, null, null, tMDBSearchResult2.f20297f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef A[Catch: Exception -> 0x00fd, TryCatch #2 {Exception -> 0x00fd, blocks: (B:45:0x00de, B:46:0x00e9, B:48:0x00ef, B:50:0x00f9, B:52:0x00ff, B:54:0x0109), top: B:95:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0109 A[Catch: Exception -> 0x00fd, TRY_LEAVE, TryCatch #2 {Exception -> 0x00fd, blocks: (B:45:0x00de, B:46:0x00e9, B:48:0x00ef, B:50:0x00f9, B:52:0x00ff, B:54:0x0109), top: B:95:0x00de }] */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x0142 A[Catch: Exception -> 0x015a, TryCatch #3 {Exception -> 0x015a, blocks: (B:64:0x0133, B:65:0x013c, B:67:0x0142, B:69:0x0153, B:23:0x0058), top: B:97:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final java.io.Serializable d(p005a5.C1434v8 c1434v8, p117n6.c cVar) {
        p005a5.C1305i8 c1305i8;
        java.lang.String str;
        java.lang.Object objD;
        p005a5.C1434v8 c1434v9;
        java.lang.String str2;
        p005a5.C1434v8 c1434v10;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.util.List<java.lang.String> listC1;
        java.lang.Object objE;
        java.lang.String str3;
        java.util.List list;
        java.lang.String str4;
        java.util.ArrayList arrayList2;
        java.lang.String strB;
        java.util.List<java.lang.String> list2;
        if (cVar instanceof p005a5.C1305i8) {
            c1305i8 = (p005a5.C1305i8) cVar;
            int i3 = c1305i8.f14616m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1305i8.f14616m = i3 - Integer.MIN_VALUE;
            } else {
                c1305i8 = new p005a5.C1305i8(c1434v8, cVar);
            }
        } else {
            c1305i8 = new p005a5.C1305i8(c1434v8, cVar);
        }
        p005a5.C1305i8 c1305i9 = c1305i8;
        java.lang.Object objD2 = c1305i9.f14614k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1305i9.f14616m;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objD2);
            c1434v8.g.getClass();
            kotlinx.serialization.KSerializer kSerializerS = com.google.android.gms.internal.play_billing.V0.s(new p153r8.C2691d(p153r8.p0.f26988a, 0));
            c1305i9.f14612h = c1434v8;
            str = "https://image.tmdb.org/t/p";
            c1305i9.f14613i = "https://image.tmdb.org/t/p";
            c1305i9.f14616m = 1;
            objD = c1434v8.f15197b.d("carousel_poster_paths", kSerializerS, 86400000L, c1305i9);
            if (objD == aVar) {
                return aVar;
            }
        } else if (i9 == 1) {
            java.lang.String str5 = c1305i9.f14613i;
            p005a5.C1434v8 c1434v11 = (p005a5.C1434v8) c1305i9.f14612h;
            com.google.common.util.concurrent.P.u0(objD2);
            str = str5;
            c1434v8 = c1434v11;
            objD = objD2;
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) c1305i9.f14612h;
                    com.google.common.util.concurrent.P.u0(objD2);
                    list2 = (java.util.List) objD2;
                    if (list2 != null || list2.isEmpty()) {
                        return p078i6.w.f23205h;
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.String str6 : list2) {
                        Y4.Q0.Companion.getClass();
                        java.lang.String strB2 = Y4.A.b(str6, "w342", str2);
                        if (strB2 != null) {
                            arrayList3.add(strB2);
                        }
                    }
                    return arrayList3;
                }
                list = c1305i9.j;
                str3 = c1305i9.f14613i;
                c1434v9 = (p005a5.C1434v8) c1305i9.f14612h;
                try {
                    com.google.common.util.concurrent.P.u0(objD2);
                    listC1 = list;
                    str2 = str3;
                    arrayList2 = new java.util.ArrayList();
                    for (java.lang.String str7 : listC1) {
                        Y4.Q0.Companion.getClass();
                        strB = Y4.A.b(str7, "w342", str2);
                        if (strB != null) {
                            arrayList2.add(strB);
                        }
                    }
                    return arrayList2;
                } catch (java.lang.Exception unused) {
                    str2 = str3;
                    U4.x xVar = c1434v9.f15197b;
                    kotlinx.serialization.KSerializer kSerializerS2 = com.google.android.gms.internal.play_billing.V0.s(new p153r8.C2691d(p153r8.p0.f26988a, 0));
                    c1305i9.f14612h = str2;
                    c1305i9.f14613i = null;
                    c1305i9.j = null;
                    c1305i9.f14616m = 4;
                    objD2 = xVar.d("carousel_poster_paths", kSerializerS2, 604800000L, c1305i9);
                    if (objD2 == aVar) {
                        return aVar;
                    }
                    list2 = (java.util.List) objD2;
                    if (list2 != null) {
                    }
                    return p078i6.w.f23205h;
                }
            }
            str2 = c1305i9.f14613i;
            c1434v9 = (p005a5.C1434v8) c1305i9.f14612h;
            try {
                com.google.common.util.concurrent.P.u0(objD2);
                c1434v10 = c1434v9;
                try {
                    arrayList = new java.util.ArrayList();
                    it = ((java.util.List) objD2).iterator();
                    while (it.hasNext()) {
                        str4 = ((com.kiptv.core.model.TMDBSearchResult) it.next()).g;
                        if (str4 != null) {
                            arrayList.add(str4);
                        }
                    }
                    listC1 = p078i6.o.c1(arrayList);
                    if (listC1.isEmpty()) {
                        c1434v9 = c1434v10;
                    } else {
                        U4.x xVar2 = c1434v10.f15197b;
                        p153r8.C2691d c2691d = new p153r8.C2691d(p153r8.p0.f26988a, 0);
                        c1305i9.f14612h = c1434v10;
                        c1305i9.f14613i = str2;
                        c1305i9.j = listC1;
                        c1305i9.f14616m = 3;
                        try {
                            objE = xVar2.e("carousel_poster_paths", listC1, c2691d, 604800000L, c1305i9);
                            c1305i9 = c1305i9;
                            if (objE == aVar) {
                                return aVar;
                            }
                            str3 = str2;
                            list = listC1;
                            c1434v9 = c1434v10;
                            listC1 = list;
                            str2 = str3;
                        } catch (java.lang.Exception unused2) {
                            c1305i9 = c1305i9;
                            c1434v9 = c1434v10;
                            U4.x xVar3 = c1434v9.f15197b;
                            kotlinx.serialization.KSerializer kSerializerS3 = com.google.android.gms.internal.play_billing.V0.s(new p153r8.C2691d(p153r8.p0.f26988a, 0));
                            c1305i9.f14612h = str2;
                            c1305i9.f14613i = null;
                            c1305i9.j = null;
                            c1305i9.f14616m = 4;
                            objD2 = xVar3.d("carousel_poster_paths", kSerializerS3, 604800000L, c1305i9);
                            if (objD2 == aVar) {
                                return aVar;
                            }
                            list2 = (java.util.List) objD2;
                            if (list2 != null) {
                            }
                            return p078i6.w.f23205h;
                        }
                    }
                    arrayList2 = new java.util.ArrayList();
                    while (r1.hasNext()) {
                        Y4.Q0.Companion.getClass();
                        strB = Y4.A.b(str7, "w342", str2);
                        if (strB != null) {
                            arrayList2.add(strB);
                        }
                    }
                    return arrayList2;
                } catch (java.lang.Exception unused3) {
                }
            } catch (java.lang.Exception unused4) {
                U4.x xVar4 = c1434v9.f15197b;
                kotlinx.serialization.KSerializer kSerializerS4 = com.google.android.gms.internal.play_billing.V0.s(new p153r8.C2691d(p153r8.p0.f26988a, 0));
                c1305i9.f14612h = str2;
                c1305i9.f14613i = null;
                c1305i9.j = null;
                c1305i9.f14616m = 4;
                objD2 = xVar4.d("carousel_poster_paths", kSerializerS4, 604800000L, c1305i9);
                if (objD2 == aVar) {
                    return aVar;
                }
                list2 = (java.util.List) objD2;
                if (list2 != null) {
                }
                return p078i6.w.f23205h;
            }
        }
        java.util.List<java.lang.String> list3 = (java.util.List) objD;
        if (list3 != null && !list3.isEmpty()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.String str8 : list3) {
                Y4.Q0.Companion.getClass();
                java.lang.String strB3 = Y4.A.b(str8, "w342", str);
                if (strB3 != null) {
                    arrayList4.add(strB3);
                }
            }
            return arrayList4;
        }
        try {
            p005a5.C1451x5 c1451x5 = c1434v8.f15196a;
            c1305i9.f14612h = c1434v8;
            c1305i9.f14613i = str;
            c1305i9.f14616m = 2;
            java.lang.Object objB = c1451x5.B(androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL, "week", c1305i9);
            if (objB == aVar) {
                return aVar;
            }
            c1434v10 = c1434v8;
            str2 = str;
            objD2 = objB;
            arrayList = new java.util.ArrayList();
            it = ((java.util.List) objD2).iterator();
            while (it.hasNext()) {
                str4 = ((com.kiptv.core.model.TMDBSearchResult) it.next()).g;
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            listC1 = p078i6.o.c1(arrayList);
            if (listC1.isEmpty()) {
                U4.x xVar5 = c1434v10.f15197b;
                p153r8.C2691d c2691d2 = new p153r8.C2691d(p153r8.p0.f26988a, 0);
                c1305i9.f14612h = c1434v10;
                c1305i9.f14613i = str2;
                c1305i9.j = listC1;
                c1305i9.f14616m = 3;
                objE = xVar5.e("carousel_poster_paths", listC1, c2691d2, 604800000L, c1305i9);
                c1305i9 = c1305i9;
                if (objE == aVar) {
                    return aVar;
                }
                str3 = str2;
                list = listC1;
                c1434v9 = c1434v10;
                listC1 = list;
                str2 = str3;
            } else {
                c1434v9 = c1434v10;
            }
            arrayList2 = new java.util.ArrayList();
            while (r1.hasNext()) {
                Y4.Q0.Companion.getClass();
                strB = Y4.A.b(str7, "w342", str2);
                if (strB != null) {
                    arrayList2.add(strB);
                }
            }
            return arrayList2;
        } catch (java.lang.Exception unused5) {
            c1434v9 = c1434v8;
            str2 = str;
            U4.x xVar6 = c1434v9.f15197b;
            kotlinx.serialization.KSerializer kSerializerS5 = com.google.android.gms.internal.play_billing.V0.s(new p153r8.C2691d(p153r8.p0.f26988a, 0));
            c1305i9.f14612h = str2;
            c1305i9.f14613i = null;
            c1305i9.j = null;
            c1305i9.f14616m = 4;
            objD2 = xVar6.d("carousel_poster_paths", kSerializerS5, 604800000L, c1305i9);
            if (objD2 == aVar) {
                return aVar;
            }
            list2 = (java.util.List) objD2;
            if (list2 != null) {
            }
            return p078i6.w.f23205h;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final java.lang.Object e(p005a5.C1434v8 c1434v8, java.lang.String str, int i3, java.lang.String str2, p117n6.c cVar) {
        p005a5.C1315j8 c1315j8;
        c1434v8.getClass();
        if (cVar instanceof p005a5.C1315j8) {
            c1315j8 = (p005a5.C1315j8) cVar;
            int i9 = c1315j8.f14674l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1315j8.f14674l = i9 - Integer.MIN_VALUE;
            } else {
                c1315j8 = new p005a5.C1315j8(c1434v8, cVar);
            }
        } else {
            c1315j8 = new p005a5.C1315j8(c1434v8, cVar);
        }
        p005a5.C1315j8 c1315j9 = c1315j8;
        java.lang.Object objD = c1315j9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1315j9.f14674l;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objD);
            java.lang.String strG = c1434v8.g(str);
            if (strG.length() == 0) {
                return null;
            }
            kotlinx.serialization.KSerializer kSerializerSerializer = com.kiptv.core.repository.TrendingRepository$CachedMatchResults.INSTANCE.serializer();
            c1315j9.f14672i = str2;
            c1315j9.f14671h = i3;
            c1315j9.f14674l = 1;
            objD = c1434v8.f15197b.d(strG, kSerializerSerializer, 86400000L, c1315j9);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1315j9.f14671h;
            str2 = c1315j9.f14672i;
            com.google.common.util.concurrent.P.u0(objD);
        }
        com.kiptv.core.repository.TrendingRepository$CachedMatchResults trendingRepository$CachedMatchResults = (com.kiptv.core.repository.TrendingRepository$CachedMatchResults) objD;
        if (trendingRepository$CachedMatchResults != null && trendingRepository$CachedMatchResults.f20939a == i3 && kotlin.jvm.internal.m.a(trendingRepository$CachedMatchResults.f20941c, str2)) {
            return trendingRepository$CachedMatchResults.f20940b;
        }
        return null;
    }

    public static final java.lang.Object f(p005a5.C1434v8 c1434v8, java.lang.String str, int i3, java.lang.String str2, java.util.LinkedHashMap linkedHashMap, p117n6.i iVar) {
        java.lang.String strG = c1434v8.g(str);
        int length = strG.length();
        p070h6.A a2 = p070h6.A.f22523a;
        if (length != 0) {
            java.lang.Object objE = c1434v8.f15197b.e(strG, new com.kiptv.core.repository.TrendingRepository$CachedMatchResults(i3, linkedHashMap, str2), com.kiptv.core.repository.TrendingRepository$CachedMatchResults.INSTANCE.serializer(), 86400000L, iVar);
            if (objE == p109m6.a.f25430h) {
                return objE;
            }
        }
        return a2;
    }

    public final java.lang.String g(java.lang.String str) {
        java.lang.String str2;
        com.kiptv.core.model.Playlist playlist = (com.kiptv.core.model.Playlist) ((V7.n0) this.f15199d.f13659k.f10419h).getValue();
        return (playlist == null || (str2 = playlist.f20033a) == null) ? "" : B2.a.m("trending_match_", str, "_", str2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5 A[PHI: r8
  0x00b5: PHI (r8v9 int) = (r8v5 int), (r8v10 int) binds: [B:40:0x009e, B:45:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if (r9 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object h(int i3, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.C1325k8 c1325k8;
        p005a5.C1434v8 c1434v8;
        p028c8.a aVar;
        p028c8.a aVar2;
        p005a5.C1434v8 c1434v9;
        p028c8.a aVar3;
        S7.F f9;
        java.lang.Iterable iterable;
        if (cVar instanceof p005a5.C1325k8) {
            c1325k8 = (p005a5.C1325k8) cVar;
            int i9 = c1325k8.f14710n;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1325k8.f14710n = i9 - Integer.MIN_VALUE;
            } else {
                c1325k8 = new p005a5.C1325k8(this, cVar);
            }
        } else {
            c1325k8 = new p005a5.C1325k8(this, cVar);
        }
        java.lang.Object objB = c1325k8.f14708l;
        p109m6.a aVar4 = p109m6.a.f25430h;
        int i10 = c1325k8.f14710n;
        try {
            if (i10 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                c1325k8.f14705h = this;
                p028c8.d dVar = this.f15194D;
                c1325k8.f14706i = dVar;
                c1325k8.f14707k = i3;
                c1325k8.f14710n = 1;
                if (dVar.e(c1325k8) != aVar4) {
                    c1434v8 = this;
                    aVar = dVar;
                }
                return aVar4;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i3 = c1325k8.f14707k;
                    c1434v8 = c1325k8.j;
                    aVar2 = c1325k8.f14706i;
                    c1434v9 = c1325k8.f14705h;
                    try {
                        com.google.common.util.concurrent.P.u0(objB);
                        aVar2 = aVar2;
                        c1434v8.f15195E = (S7.F) objB;
                        aVar3 = aVar2;
                        c1434v8 = c1434v9;
                        ((p028c8.d) aVar3).g(null);
                        f9 = c1434v8.f15195E;
                        if (f9 != null) {
                            c1325k8.f14705h = null;
                            c1325k8.f14706i = null;
                            c1325k8.j = null;
                            c1325k8.f14707k = i3;
                            c1325k8.f14710n = 3;
                            objB = f9.B(c1325k8);
                        } else {
                            iterable = p078i6.w.f23205h;
                        }
                        return p078i6.o.J1(iterable, i3);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        ((p028c8.d) aVar2).g(null);
                        throw th;
                    }
                }
                if (i10 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c1325k8.f14707k;
                com.google.common.util.concurrent.P.u0(objB);
                iterable = (java.util.List) objB;
                if (iterable == null) {
                    iterable = p078i6.w.f23205h;
                }
                return p078i6.o.J1(iterable, i3);
            }
            i3 = c1325k8.f14707k;
            p028c8.a aVar5 = c1325k8.f14706i;
            p005a5.C1434v8 c1434v10 = c1325k8.f14705h;
            com.google.common.util.concurrent.P.u0(objB);
            aVar = aVar5;
            c1434v8 = c1434v10;
            S7.F f10 = c1434v8.f15195E;
            if (f10 != null && f10.isActive()) {
                aVar3 = aVar;
                ((p028c8.d) aVar3).g(null);
                f9 = c1434v8.f15195E;
                if (f9 != null) {
                    c1325k8.f14705h = null;
                    c1325k8.f14706i = null;
                    c1325k8.j = null;
                    c1325k8.f14707k = i3;
                    c1325k8.f14710n = 3;
                    objB = f9.B(c1325k8);
                } else {
                    iterable = p078i6.w.f23205h;
                }
                return p078i6.o.J1(iterable, i3);
            }
            p005a5.C1345m8 c1345m8 = new p005a5.C1345m8(c1434v8, null);
            c1325k8.f14705h = c1434v8;
            c1325k8.f14706i = aVar;
            c1325k8.j = c1434v8;
            c1325k8.f14707k = i3;
            c1325k8.f14710n = 2;
            java.lang.Object objM = S7.C.m(c1345m8, c1325k8);
            if (objM != aVar4) {
                aVar2 = aVar;
                objB = objM;
                c1434v9 = c1434v8;
                c1434v8.f15195E = (S7.F) objB;
                aVar3 = aVar2;
                c1434v8 = c1434v9;
                ((p028c8.d) aVar3).g(null);
                f9 = c1434v8.f15195E;
                if (f9 != null) {
                    c1325k8.f14705h = null;
                    c1325k8.f14706i = null;
                    c1325k8.j = null;
                    c1325k8.f14707k = i3;
                    c1325k8.f14710n = 3;
                    objB = f9.B(c1325k8);
                } else {
                    iterable = p078i6.w.f23205h;
                }
                return p078i6.o.J1(iterable, i3);
            }
            return aVar4;
        } catch (java.lang.Throwable th2) {
            th = th2;
            aVar2 = aVar;
            ((p028c8.d) aVar2).g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:13:0x002d, B:38:0x009d, B:39:0x00a8, B:41:0x00ae, B:42:0x00b8, B:44:0x00be, B:48:0x00cd, B:50:0x00d1, B:51:0x00d5, B:54:0x00de, B:20:0x003f, B:31:0x006a, B:34:0x0074, B:27:0x0058), top: B:58:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00be A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:13:0x002d, B:38:0x009d, B:39:0x00a8, B:41:0x00ae, B:42:0x00b8, B:44:0x00be, B:48:0x00cd, B:50:0x00d1, B:51:0x00d5, B:54:0x00de, B:20:0x003f, B:31:0x006a, B:34:0x0074, B:27:0x0058), top: B:58:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(p117n6.c cVar) {
        p005a5.C1375p8 c1375p8;
        p005a5.C1434v8 c1434v8;
        java.util.List<com.kiptv.core.model.TMDBSearchResult> list;
        p005a5.C1434v8 c1434v9;
        java.util.List list2;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.lang.Object next;
        p005a5.C1255d8 c1255d8;
        if (cVar instanceof p005a5.C1375p8) {
            c1375p8 = (p005a5.C1375p8) cVar;
            int i3 = c1375p8.f14955l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1375p8.f14955l = i3 - Integer.MIN_VALUE;
            } else {
                c1375p8 = new p005a5.C1375p8(this, cVar);
            }
        } else {
            c1375p8 = new p005a5.C1375p8(this, cVar);
        }
        java.lang.Object objB = c1375p8.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1375p8.f14955l;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                if (this.f15202h.getValue() == null || this.f15205l.getValue() == null) {
                    p005a5.C1451x5 c1451x5 = this.f15196a;
                    c1375p8.f14952h = this;
                    c1375p8.f14955l = 1;
                    objB = c1451x5.B("movie", "week", c1375p8);
                    if (objB != aVar) {
                        c1434v8 = this;
                    }
                    return aVar;
                }
                return a2;
            }
            if (i9 == 1) {
                c1434v8 = c1375p8.f14952h;
                com.google.common.util.concurrent.P.u0(objB);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = c1375p8.f14953i;
                c1434v9 = c1375p8.f14952h;
                com.google.common.util.concurrent.P.u0(objB);
            }
            list2 = (java.util.List) objB;
            arrayList = new java.util.ArrayList();
            for (com.kiptv.core.model.TMDBSearchResult tMDBSearchResult : list) {
                it = list2.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((p005a5.C1255d8) next).f14365a != tMDBSearchResult.f20292a);
                c1255d8 = (p005a5.C1255d8) next;
                if (c1255d8 != null) {
                    arrayList.add(c1255d8);
                }
            }
            V7.n0 n0Var = c1434v9.f15202h;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            n0Var.h(arrayList);
            p005a5.C1366p c1366p = c1434v9.f15198c;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            V7.n0 n0Var2 = c1366p.f14904A;
            n0Var2.getClass();
            n0Var2.i(null, bool);
            return a2;
            java.util.List list3 = (java.util.List) objB;
            if (list3.isEmpty()) {
                return a2;
            }
            V7.n0 n0Var3 = c1434v8.f15205l;
            java.util.List listJ1 = p078i6.o.J1(list3, 20);
            n0Var3.getClass();
            n0Var3.i(null, listJ1);
            java.util.List listJ2 = p078i6.o.J1(list3, 8);
            p005a5.C1394r8 c1394r8 = new p005a5.C1394r8(listJ2, c1434v8, null);
            c1375p8.f14952h = c1434v8;
            c1375p8.f14953i = listJ2;
            c1375p8.f14955l = 2;
            java.lang.Object objM = S7.C.m(c1394r8, c1375p8);
            if (objM != aVar) {
                list = listJ2;
                objB = objM;
                c1434v9 = c1434v8;
                list2 = (java.util.List) objB;
                arrayList = new java.util.ArrayList();
                while (r1.hasNext()) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((p005a5.C1255d8) next).f14365a != tMDBSearchResult.f20292a);
                    c1255d8 = (p005a5.C1255d8) next;
                    if (c1255d8 != null) {
                        arrayList.add(c1255d8);
                    }
                }
                V7.n0 n0Var4 = c1434v9.f15202h;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                n0Var4.h(arrayList);
                p005a5.C1366p c1366p2 = c1434v9.f15198c;
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                V7.n0 n0Var5 = c1366p2.f14904A;
                n0Var5.getClass();
                n0Var5.i(null, bool2);
                return a2;
            }
            return aVar;
        } catch (java.lang.Exception e6) {
            android.util.Log.d("TrendingRepository", "Error loading movie trending: " + e6.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:13:0x002d, B:38:0x009d, B:39:0x00a8, B:41:0x00ae, B:42:0x00b8, B:44:0x00be, B:48:0x00cd, B:50:0x00d1, B:51:0x00d5, B:55:0x00df, B:20:0x003f, B:31:0x006a, B:34:0x0074, B:27:0x0058), top: B:59:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00be A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:13:0x002d, B:38:0x009d, B:39:0x00a8, B:41:0x00ae, B:42:0x00b8, B:44:0x00be, B:48:0x00cd, B:50:0x00d1, B:51:0x00d5, B:55:0x00df, B:20:0x003f, B:31:0x006a, B:34:0x0074, B:27:0x0058), top: B:59:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(p117n6.c cVar) {
        p005a5.C1404s8 c1404s8;
        p005a5.C1434v8 c1434v8;
        java.util.List<com.kiptv.core.model.TMDBSearchResult> list;
        p005a5.C1434v8 c1434v9;
        java.util.List list2;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.lang.Object next;
        p005a5.C1255d8 c1255d8;
        if (cVar instanceof p005a5.C1404s8) {
            c1404s8 = (p005a5.C1404s8) cVar;
            int i3 = c1404s8.f15083l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1404s8.f15083l = i3 - Integer.MIN_VALUE;
            } else {
                c1404s8 = new p005a5.C1404s8(this, cVar);
            }
        } else {
            c1404s8 = new p005a5.C1404s8(this, cVar);
        }
        java.lang.Object objB = c1404s8.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1404s8.f15083l;
        p070h6.A a2 = p070h6.A.f22523a;
        java.util.ArrayList arrayList2 = null;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objB);
                if (this.j.getValue() == null || this.f15207n.getValue() == null) {
                    p005a5.C1451x5 c1451x5 = this.f15196a;
                    c1404s8.f15080h = this;
                    c1404s8.f15083l = 1;
                    objB = c1451x5.B("tv", "week", c1404s8);
                    if (objB != aVar) {
                        c1434v8 = this;
                    }
                    return aVar;
                }
                return a2;
            }
            if (i9 == 1) {
                c1434v8 = c1404s8.f15080h;
                com.google.common.util.concurrent.P.u0(objB);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = c1404s8.f15081i;
                c1434v9 = c1404s8.f15080h;
                com.google.common.util.concurrent.P.u0(objB);
            }
            list2 = (java.util.List) objB;
            arrayList = new java.util.ArrayList();
            for (com.kiptv.core.model.TMDBSearchResult tMDBSearchResult : list) {
                it = list2.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((p005a5.C1255d8) next).f14365a != tMDBSearchResult.f20292a);
                c1255d8 = (p005a5.C1255d8) next;
                if (c1255d8 != null) {
                    arrayList.add(c1255d8);
                }
            }
            V7.n0 n0Var = c1434v9.j;
            if (arrayList.isEmpty()) {
                arrayList2 = arrayList;
            }
            n0Var.h(arrayList2);
            return a2;
            java.util.List list3 = (java.util.List) objB;
            if (list3.isEmpty()) {
                return a2;
            }
            V7.n0 n0Var2 = c1434v8.f15207n;
            java.util.List listJ1 = p078i6.o.J1(list3, 20);
            n0Var2.getClass();
            n0Var2.i(null, listJ1);
            java.util.List listJ2 = p078i6.o.J1(list3, 8);
            p005a5.C1424u8 c1424u8 = new p005a5.C1424u8(listJ2, c1434v8, null);
            c1404s8.f15080h = c1434v8;
            c1404s8.f15081i = listJ2;
            c1404s8.f15083l = 2;
            java.lang.Object objM = S7.C.m(c1424u8, c1404s8);
            if (objM != aVar) {
                list = listJ2;
                objB = objM;
                c1434v9 = c1434v8;
                list2 = (java.util.List) objB;
                arrayList = new java.util.ArrayList();
                while (r1.hasNext()) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((p005a5.C1255d8) next).f14365a != tMDBSearchResult.f20292a);
                    c1255d8 = (p005a5.C1255d8) next;
                    if (c1255d8 != null) {
                        arrayList.add(c1255d8);
                    }
                }
                V7.n0 n0Var3 = c1434v9.j;
                if (arrayList.isEmpty()) {
                    arrayList2 = arrayList;
                }
                n0Var3.h(arrayList2);
                return a2;
            }
            return aVar;
        } catch (java.lang.Exception e6) {
            android.util.Log.d("TrendingRepository", "Error loading series trending: " + e6.getMessage());
        }
    }
}
