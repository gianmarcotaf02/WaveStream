package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a5.M1 f13293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.x9 f13294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U4.g f13295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.C1366p f13296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1291h4 f13297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y4.C1105q f13298f;
    public final p005a5.C1434v8 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p005a5.i9 f13299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p005a5.D0 f13300i;
    public final p005a5.B2 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Y4.C1075g f13301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p005a5.O f13302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p005a5.n9 f13303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p005a5.B3 f13304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.kiptv.core.repository.a f13305o;

    public D1(p005a5.M1 playlistRepository, p005a5.x9 xtreamRepository, U4.g contentDiskCache, p005a5.C1366p contentCacheRepository, p005a5.C1291h4 settingsRepository, Y4.C1105q m3uParser, p005a5.C1434v8 trendingRepository, p005a5.i9 watchProgressRepository, p005a5.D0 myListRepository, p005a5.B2 recentlyWatchedLiveRepository, Y4.C1075g channelLogoClient, p005a5.O epgRepository, p005a5.n9 xmltvRepository, p005a5.B3 searchRepository, com.kiptv.core.repository.a newContentRepository) {
        kotlin.jvm.internal.m.e(playlistRepository, "playlistRepository");
        kotlin.jvm.internal.m.e(xtreamRepository, "xtreamRepository");
        kotlin.jvm.internal.m.e(contentDiskCache, "contentDiskCache");
        kotlin.jvm.internal.m.e(contentCacheRepository, "contentCacheRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(m3uParser, "m3uParser");
        kotlin.jvm.internal.m.e(trendingRepository, "trendingRepository");
        kotlin.jvm.internal.m.e(watchProgressRepository, "watchProgressRepository");
        kotlin.jvm.internal.m.e(myListRepository, "myListRepository");
        kotlin.jvm.internal.m.e(recentlyWatchedLiveRepository, "recentlyWatchedLiveRepository");
        kotlin.jvm.internal.m.e(channelLogoClient, "channelLogoClient");
        kotlin.jvm.internal.m.e(epgRepository, "epgRepository");
        kotlin.jvm.internal.m.e(xmltvRepository, "xmltvRepository");
        kotlin.jvm.internal.m.e(searchRepository, "searchRepository");
        kotlin.jvm.internal.m.e(newContentRepository, "newContentRepository");
        this.f13293a = playlistRepository;
        this.f13294b = xtreamRepository;
        this.f13295c = contentDiskCache;
        this.f13296d = contentCacheRepository;
        this.f13297e = settingsRepository;
        this.f13298f = m3uParser;
        this.g = trendingRepository;
        this.f13299h = watchProgressRepository;
        this.f13300i = myListRepository;
        this.j = recentlyWatchedLiveRepository;
        this.f13301k = channelLogoClient;
        this.f13302l = epgRepository;
        this.f13303m = xmltvRepository;
        this.f13304n = searchRepository;
        this.f13305o = newContentRepository;
    }

    public static final void a(p005a5.D1 d4, java.lang.String str, int i3) {
        d4.getClass();
        java.util.Set set = p015b5.AbstractC1664a.f17935a;
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        long j = 1048576;
        p015b5.AbstractC1664a.a("fetched " + str + "=" + i3 + " heap=" + new P4.a((int) (jFreeMemory / j), (int) ((jMaxMemory - jFreeMemory) / j), (int) (jMaxMemory / j)), "playlist");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public static final java.lang.Object b(p005a5.D1 d4, com.kiptv.core.model.Playlist playlist, p117n6.c cVar) throws java.lang.Exception {
        p005a5.C1288h1 c1288h1;
        java.lang.String strA;
        java.lang.Object objK;
        java.lang.String str;
        java.lang.Exception e6;
        java.lang.String message;
        p005a5.D1 d6 = d4;
        com.kiptv.core.model.Playlist playlist2 = playlist;
        d6.getClass();
        if (cVar instanceof p005a5.C1288h1) {
            c1288h1 = (p005a5.C1288h1) cVar;
            int i3 = c1288h1.f14534m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1288h1.f14534m = i3 - Integer.MIN_VALUE;
            } else {
                c1288h1 = new p005a5.C1288h1(d6, cVar);
            }
        } else {
            c1288h1 = new p005a5.C1288h1(d6, cVar);
        }
        java.lang.Object obj = c1288h1.f14532k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1288h1.f14534m;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (playlist2.c()) {
                V7.n0 n0Var = R4.c.f9052a;
                strA = R4.c.a("Download M3U", "arrow.down.doc");
                try {
                    Y4.C1105q c1105q = d6.f13298f;
                    java.lang.String str2 = playlist2.f20036d;
                    c1288h1.f14530h = d6;
                    c1288h1.f14531i = playlist2;
                    c1288h1.j = strA;
                    c1288h1.f14534m = 1;
                    c1105q.getClass();
                    objK = S7.C.K(S7.M.f9549a, new Y4.C1099o(c1105q, str2, null), c1288h1);
                    if (objK == aVar) {
                    }
                } catch (java.lang.Exception e9) {
                    e6 = e9;
                    str = strA;
                    V7.n0 n0Var2 = R4.c.f9052a;
                    message = e6.getMessage();
                    if (message == null) {
                        message = "m3u failed";
                    }
                    R4.c.c(str, message);
                    throw e6;
                }
            } else {
                p005a5.C1358o1 c1358o1 = new p005a5.C1358o1(d6, playlist2, null);
                c1288h1.f14534m = 3;
                if (S7.C.m(c1358o1, c1288h1) != aVar) {
                    return a2;
                }
            }
            return aVar;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                com.google.common.util.concurrent.P.u0(obj);
                return a2;
            }
            if (i9 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            return a2;
        }
        str = c1288h1.j;
        com.kiptv.core.model.Playlist playlist3 = c1288h1.f14531i;
        p005a5.D1 d9 = c1288h1.f14530h;
        try {
            com.google.common.util.concurrent.P.u0(obj);
            playlist2 = playlist3;
            d6 = d9;
            objK = obj;
            strA = str;
        } catch (java.lang.Exception e10) {
            e6 = e10;
            V7.n0 n0Var3 = R4.c.f9052a;
            message = e6.getMessage();
            if (message == null) {
                message = "m3u failed";
            }
            R4.c.c(str, message);
            throw e6;
        }
        com.kiptv.core.model.L l2 = (com.kiptv.core.model.L) objK;
        V7.n0 n0Var4 = R4.c.f9052a;
        java.lang.String classification = "VOD: " + l2.f19815b.size() + ", Series: " + l2.f19817d.size() + ", Live: " + l2.f19819f.size();
        kotlin.jvm.internal.m.e(classification, "classification");
        V7.n0 n0Var5 = R4.c.f9052a;
        while (true) {
            java.lang.Object value = n0Var5.getValue();
            java.lang.String str3 = classification;
            if (n0Var5.g(value, R4.d.a((R4.d) value, null, null, null, str3, 0, 0, 0, 0, 0, 0, 2031))) {
                break;
            }
            classification = str3;
        }
        R4.c.b(strA, null);
        com.kiptv.core.model.L l9 = (com.kiptv.core.model.L) objK;
        p005a5.x9 x9Var = d6.f13294b;
        java.util.List list = l9.f19814a;
        java.util.LinkedHashMap linkedHashMap = l9.g;
        java.util.LinkedHashMap linkedHashMap2 = l9.f19821i;
        java.util.ArrayList arrayList = l9.f19815b;
        java.util.List list2 = l9.f19816c;
        java.util.ArrayList arrayList2 = l9.f19817d;
        java.util.List list3 = l9.f19818e;
        java.util.ArrayList arrayList3 = l9.f19819f;
        x9Var.m(list, arrayList, list2, arrayList2, list3, arrayList3, linkedHashMap, linkedHashMap2);
        java.lang.String str4 = playlist2.f20033a;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(p078i6.D.I0(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap3.put(java.lang.String.valueOf(((java.lang.Number) entry.getKey()).intValue()), entry.getValue());
        }
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap(p078i6.D.I0(linkedHashMap2.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap4.put(java.lang.String.valueOf(((java.lang.Number) entry2.getKey()).intValue()), entry2.getValue());
        }
        U4.a aVar2 = new U4.a(l9.f19814a, arrayList, list2, arrayList2, list3, arrayList3, jCurrentTimeMillis, linkedHashMap3, linkedHashMap4);
        c1288h1.f14530h = null;
        c1288h1.f14531i = null;
        c1288h1.j = null;
        c1288h1.f14534m = 2;
        if (d6.f13295c.d(str4, aVar2, c1288h1) == aVar) {
            return aVar;
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0381 A[Catch: Exception -> 0x0397, TRY_LEAVE, TryCatch #2 {Exception -> 0x0397, blocks: (B:90:0x034e, B:92:0x0356, B:95:0x035e, B:98:0x037b, B:100:0x0381), top: B:172:0x034e }] */
    /* JADX WARN: Code duplicated, block: B:104:0x038a  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:114:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:119:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:123:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:124:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:130:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:133:0x043a  */
    /* JADX WARN: Code duplicated, block: B:135:0x043c A[PHI: r1 r5 r6 r7 r11 r15 r48
  0x043c: PHI (r1v55 a5.D1) = (r1v51 a5.D1), (r1v57 a5.D1) binds: [B:129:0x03ed, B:134:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x043c: PHI (r5v20 java.lang.String) = (r5v17 java.lang.String), (r5v21 java.lang.String) binds: [B:129:0x03ed, B:134:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x043c: PHI (r6v27 java.lang.String) = (r6v25 java.lang.String), (r6v28 java.lang.String) binds: [B:129:0x03ed, B:134:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x043c: PHI (r7v19 java.lang.String) = (r7v17 java.lang.String), (r7v20 java.lang.String) binds: [B:129:0x03ed, B:134:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x043c: PHI (r11v21 m6.a) = (r11v18 m6.a), (r11v22 m6.a) binds: [B:129:0x03ed, B:134:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x043c: PHI (r15v11 com.kiptv.core.model.Playlist) = (r15v9 com.kiptv.core.model.Playlist), (r15v14 com.kiptv.core.model.Playlist) binds: [B:129:0x03ed, B:134:0x043b] A[DONT_GENERATE, DONT_INLINE]
  0x043c: PHI (r48v24 h6.A) = (r48v21 h6.A), (r48v25 h6.A) binds: [B:129:0x03ed, B:134:0x043b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x0456  */
    /* JADX WARN: Code duplicated, block: B:140:0x0467  */
    /* JADX WARN: Code duplicated, block: B:143:0x0478  */
    /* JADX WARN: Code duplicated, block: B:146:0x0489  */
    /* JADX WARN: Code duplicated, block: B:149:0x049a  */
    /* JADX WARN: Code duplicated, block: B:153:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:157:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:160:0x0503  */
    /* JADX WARN: Code duplicated, block: B:170:0x02f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x023a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0257  */
    /* JADX WARN: Code duplicated, block: B:54:0x0270  */
    /* JADX WARN: Code duplicated, block: B:57:0x0287  */
    /* JADX WARN: Code duplicated, block: B:60:0x0293  */
    /* JADX WARN: Code duplicated, block: B:64:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x02db  */
    /* JADX WARN: Code duplicated, block: B:79:0x0313  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:81:0x032c  */
    /* JADX WARN: Code duplicated, block: B:82:0x032e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0334  */
    /* JADX WARN: Code duplicated, block: B:86:0x0337  */
    /* JADX WARN: Code duplicated, block: B:89:0x0344  */
    /* JADX WARN: Code duplicated, block: B:92:0x0356 A[Catch: Exception -> 0x0397, TryCatch #2 {Exception -> 0x0397, blocks: (B:90:0x034e, B:92:0x0356, B:95:0x035e, B:98:0x037b, B:100:0x0381), top: B:172:0x034e }] */
    /* JADX WARN: Code duplicated, block: B:94:0x035d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x03ef, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object c(p005a5.D1 d4, com.kiptv.core.model.Playlist playlist, boolean z6, p117n6.c cVar) throws java.lang.Exception {
        p005a5.C1378q1 c1378q1;
        java.lang.String str;
        p070h6.A a2;
        java.lang.String str2;
        java.lang.String str3;
        int i3;
        p109m6.a aVar;
        java.lang.String str4;
        boolean z9;
        com.kiptv.core.model.Playlist playlist2;
        int i9;
        java.lang.String strA;
        java.lang.String str5;
        p005a5.x9 x9Var;
        p005a5.D1 d6;
        boolean z10;
        java.lang.String str6;
        java.lang.String message;
        java.lang.String strH;
        java.lang.String strA2;
        p005a5.C1291h4 c1291h4;
        java.lang.String str7;
        p005a5.D1 d9;
        boolean z11;
        java.lang.String str8;
        com.kiptv.core.model.PlaylistSettings playlistSettings;
        int i10;
        int i11;
        java.lang.String str9;
        com.kiptv.core.model.Playlist playlist3;
        java.lang.String strA3;
        com.kiptv.core.model.Playlist playlist4;
        java.lang.String str10;
        int i12;
        java.lang.String str11;
        boolean zBooleanValue;
        Y4.v2 v2Var;
        java.lang.Object objP;
        U4.g gVar;
        java.io.File file;
        com.kiptv.core.local.cache.CacheMetadata cacheMetadata;
        long j;
        boolean zBooleanValue2;
        P4.b bVar;
        boolean z12;
        p005a5.C1397s1 c1397s1;
        boolean z13;
        boolean z14;
        p005a5.D1 d10;
        com.kiptv.core.model.Playlist playlist5;
        java.lang.String strA4;
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        java.util.List list4;
        java.util.List list5;
        java.util.List list6;
        java.util.List list7;
        java.util.List list8;
        java.util.List list9;
        java.util.List list10;
        java.util.List list11;
        java.util.List list12;
        java.lang.Object objK;
        java.lang.String str12;
        p005a5.D1 d11;
        java.util.List list13;
        int size;
        int size2;
        int size3;
        int size4;
        V7.n0 n0Var;
        java.lang.Object value;
        p005a5.D1 d12 = d4;
        d12.getClass();
        if (cVar instanceof p005a5.C1378q1) {
            c1378q1 = (p005a5.C1378q1) cVar;
            int i13 = c1378q1.f14976t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1378q1.f14976t = i13 - Integer.MIN_VALUE;
            } else {
                c1378q1 = new p005a5.C1378q1(d12, cVar);
            }
        } else {
            c1378q1 = new p005a5.C1378q1(d12, cVar);
        }
        java.lang.Object obj = c1378q1.f14974r;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i14 = c1378q1.f14976t;
        p070h6.A a9 = p070h6.A.f22523a;
        java.util.List list14 = p078i6.w.f23205h;
        java.lang.String str13 = null;
        java.lang.String str14 = "operation";
        java.lang.String str15 = " heap=";
        int i15 = 1048576;
        boolean z15 = true;
        char c9 = 2;
        java.lang.String str16 = "playlist";
        switch (i14) {
            case 0:
                com.google.common.util.concurrent.P.u0(obj);
                V7.n0 n0Var2 = R4.c.f9052a;
                while (true) {
                    java.lang.Object value2 = n0Var2.getValue();
                    int i16 = i15;
                    java.lang.String str17 = str16;
                    p109m6.a aVar3 = aVar2;
                    str = str15;
                    a2 = a9;
                    str2 = str14;
                    if (n0Var2.g(value2, R4.d.a((R4.d) value2, list14, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", "", 0, 0, 0, 0, 0, 0, 2))) {
                        java.util.Set set = p015b5.AbstractC1664a.f17935a;
                        java.lang.String str18 = playlist.d() ? "xtream" : "m3u";
                        java.lang.String strB = P4.e.b();
                        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                        long jMaxMemory = runtime.maxMemory();
                        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
                        long j9 = i16;
                        str3 = str17;
                        p015b5.AbstractC1664a.a("load_started type=" + str18 + " force=" + z6 + " memory=" + strB + str + new P4.a((int) (jFreeMemory / j9), (int) ((jMaxMemory - jFreeMemory) / j9), (int) (jMaxMemory / j9)), str3);
                        p015b5.AbstractC1664a.d(str2, "playlist_load");
                        V7.n0 n0Var3 = R4.c.f9052a;
                        java.lang.String strA5 = R4.c.a("Attivazione playlist", "play");
                        p005a5.M1 m8 = d12.f13293a;
                        c1378q1.f14965h = d12;
                        c1378q1.f14966i = playlist;
                        c1378q1.j = strA5;
                        c1378q1.f14972p = z6;
                        i3 = 1;
                        c1378q1.f14976t = 1;
                        aVar = aVar3;
                        if (m8.i(playlist, c1378q1) != aVar) {
                            str4 = strA5;
                            z9 = z6;
                            playlist2 = playlist;
                            V7.n0 n0Var4 = R4.c.f9052a;
                            R4.c.b(str4, null);
                            p005a5.x9 x9Var2 = d12.f13294b;
                            x9Var2.getClass();
                            kotlin.jvm.internal.m.e(playlist2, str3);
                            x9Var2.f15311a.d(playlist2.f20036d, playlist2.f20037e, playlist2.f20038f);
                            V7.n0 n0Var5 = x9Var2.f15312b;
                            java.lang.Boolean bool = java.lang.Boolean.FALSE;
                            n0Var5.getClass();
                            n0Var5.i(null, bool);
                            x9Var2.f15309A.clear();
                            x9Var2.b();
                            V7.n0 n0Var6 = x9Var2.f15327s;
                            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(playlist2.c());
                            n0Var6.getClass();
                            n0Var6.i(null, boolValueOf);
                            if (playlist2.d()) {
                                strA = R4.c.a("Autenticazione Xtream", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY);
                                try {
                                    x9Var = d12.f13294b;
                                    c1378q1.f14965h = d12;
                                    c1378q1.f14966i = playlist2;
                                    c1378q1.j = strA;
                                    c1378q1.f14972p = z9;
                                    i9 = 2;
                                    c1378q1.f14976t = 2;
                                    if (x9Var.a(c1378q1) != aVar) {
                                        d6 = d12;
                                        z10 = z9;
                                        str5 = strA;
                                        str6 = null;
                                        try {
                                            R4.c.b(str5, str6);
                                            z9 = z10;
                                            d12 = d6;
                                            V7.n0 n0Var7 = R4.c.f9052a;
                                            strA2 = R4.c.a("Caricamento impostazioni", "gear");
                                            c1291h4 = d12.f13297e;
                                            str7 = playlist2.f20033a;
                                            c1378q1.f14965h = d12;
                                            c1378q1.f14966i = playlist2;
                                            c1378q1.j = strA2;
                                            c1378q1.f14972p = z9;
                                            c1378q1.f14976t = 3;
                                            if (c1291h4.j(str7, c1378q1) != aVar) {
                                                d9 = d12;
                                                z11 = z9;
                                                str8 = strA2;
                                                playlistSettings = (com.kiptv.core.model.PlaylistSettings) ((java.util.Map) ((V7.n0) d9.f13297e.f14556i.f10419h).getValue()).get(playlist2.f20033a);
                                                if (playlistSettings != null) {
                                                    i10 = playlistSettings.f20064l;
                                                } else {
                                                    i10 = i3;
                                                }
                                                R4.c.b(str8, null);
                                                if (z11) {
                                                    i11 = 0;
                                                } else {
                                                    gVar = d9.f13295c;
                                                    java.lang.String playlistId = playlist2.f20033a;
                                                    gVar.getClass();
                                                    kotlin.jvm.internal.m.e(playlistId, "playlistId");
                                                    file = new java.io.File(gVar.c(playlistId), "cache_metadata.json");
                                                    if (file.exists()) {
                                                        try {
                                                            p162s8.d dVar = gVar.f10139b;
                                                            java.lang.String strR = p160s6.k.R(file);
                                                            dVar.getClass();
                                                            cacheMetadata = (com.kiptv.core.local.cache.CacheMetadata) dVar.b(strR, com.kiptv.core.local.cache.CacheMetadata.INSTANCE.serializer());
                                                            if (cacheMetadata.f19596b != i9) {
                                                                i11 = 0;
                                                            } else {
                                                                j = 60;
                                                                if (java.lang.System.currentTimeMillis() - cacheMetadata.f19595a < ((long) i10) * ((long) 24) * j * j * ((long) 1000)) {
                                                                    i11 = i3;
                                                                } else {
                                                                    i11 = 0;
                                                                }
                                                            }
                                                        } catch (java.lang.Exception unused) {
                                                        }
                                                    } else {
                                                        i11 = 0;
                                                    }
                                                }
                                                java.util.Set set2 = p015b5.AbstractC1664a.f17935a;
                                                if (i11 != 0) {
                                                    str9 = "fresh";
                                                } else {
                                                    str9 = "miss";
                                                }
                                                p015b5.AbstractC1664a.a("cache=".concat(str9), str3);
                                                if (i11 != 0) {
                                                    V7.n0 n0Var8 = R4.c.f9052a;
                                                    strA3 = R4.c.a("Controllo server", "wifi");
                                                    try {
                                                        p005a5.x9 x9Var3 = d9.f13294b;
                                                        if (playlist2.c()) {
                                                            str11 = playlist2.f20036d;
                                                        } else {
                                                            str11 = null;
                                                        }
                                                        c1378q1.f14965h = d9;
                                                        c1378q1.f14966i = playlist2;
                                                        c1378q1.j = strA3;
                                                        c1378q1.f14973q = i11;
                                                        c1378q1.f14976t = 4;
                                                        zBooleanValue = ((java.lang.Boolean) x9Var3.f15327s.getValue()).booleanValue();
                                                        v2Var = x9Var3.f15311a;
                                                        if (zBooleanValue || str11 == null) {
                                                            objP = v2Var.p(c1378q1);
                                                        } else {
                                                            objP = v2Var.q(str11, c1378q1);
                                                        }
                                                        obj = objP;
                                                        if (obj != aVar) {
                                                            playlist4 = playlist2;
                                                            str10 = strA3;
                                                            i12 = i11;
                                                            try {
                                                                zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                                                            } catch (java.lang.Exception e6) {
                                                                e = e6;
                                                                Y6.f.u(e, "healthCheck threw: ", "PlaylistContentLoader");
                                                                zBooleanValue2 = false;
                                                            }
                                                            i11 = i12;
                                                            if (!zBooleanValue2) {
                                                                V7.n0 n0Var9 = R4.c.f9052a;
                                                                R4.c.c(str10, "unreachable");
                                                                throw new java.lang.IllegalStateException("Server unreachable");
                                                            }
                                                            V7.n0 n0Var10 = R4.c.f9052a;
                                                            R4.c.b(str10, "ok");
                                                            playlist3 = playlist4;
                                                            bVar = P4.c.f8139b;
                                                            if (bVar != null) {
                                                                z12 = bVar.f8137e;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (i11 != 0) {
                                                                z13 = i3;
                                                            } else {
                                                                z13 = 0;
                                                            }
                                                            c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                                                            z14 = z12;
                                                            c1378q1.f14965h = d9;
                                                            c1378q1.f14966i = playlist3;
                                                            c1378q1.j = null;
                                                            c1378q1.f14972p = z14;
                                                            c1378q1.f14976t = 5;
                                                            if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                                                d10 = d9;
                                                                if (z14) {
                                                                    java.util.Set set3 = p015b5.AbstractC1664a.f17935a;
                                                                    java.lang.Runtime runtime2 = java.lang.Runtime.getRuntime();
                                                                    long jMaxMemory2 = runtime2.maxMemory();
                                                                    long jFreeMemory2 = runtime2.totalMemory() - runtime2.freeMemory();
                                                                    long j10 = 1048576;
                                                                    p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory2 / j10), (int) ((jMaxMemory2 - jFreeMemory2) / j10), (int) (jMaxMemory2 / j10)), str3);
                                                                    c1378q1.f14965h = d10;
                                                                    c1378q1.f14966i = playlist3;
                                                                    c1378q1.f14976t = 6;
                                                                    if (d10.e(playlist3, c1378q1) != aVar) {
                                                                        playlist5 = playlist3;
                                                                        playlist3 = playlist5;
                                                                        V7.n0 n0Var11 = R4.c.f9052a;
                                                                        strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                                        list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                                        if (list == null) {
                                                                            list = list14;
                                                                        }
                                                                        list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                                        if (list2 == null) {
                                                                            list2 = list14;
                                                                        }
                                                                        list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                                        if (list3 == null) {
                                                                            list3 = list14;
                                                                        }
                                                                        list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                                        if (list4 == null) {
                                                                            list4 = list14;
                                                                        }
                                                                        list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                                        if (list5 == null) {
                                                                            list5 = list14;
                                                                        }
                                                                        list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                                        if (list6 != null) {
                                                                            list14 = list6;
                                                                        }
                                                                        p005a5.C1366p c1366p = d10.f13296d;
                                                                        java.lang.String id = playlist3.f20033a;
                                                                        c1366p.getClass();
                                                                        kotlin.jvm.internal.m.e(id, "id");
                                                                        V7.n0 n0Var12 = c1366p.f14907a;
                                                                        n0Var12.getClass();
                                                                        n0Var12.i(null, id);
                                                                        p005a5.C1366p c1366p2 = d10.f13296d;
                                                                        c1378q1.f14965h = d10;
                                                                        c1378q1.f14966i = strA4;
                                                                        c1378q1.j = list;
                                                                        c1378q1.f14967k = list2;
                                                                        c1378q1.f14968l = list3;
                                                                        c1378q1.f14969m = list4;
                                                                        c1378q1.f14970n = list5;
                                                                        c1378q1.f14971o = list14;
                                                                        c1378q1.f14976t = 7;
                                                                        c1366p2.getClass();
                                                                        list7 = list;
                                                                        list8 = list2;
                                                                        list9 = list3;
                                                                        list10 = list4;
                                                                        list11 = list14;
                                                                        list12 = list5;
                                                                        objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p2, null), c1378q1);
                                                                        if (objK != p109m6.a.f25430h) {
                                                                            objK = a2;
                                                                        }
                                                                        if (objK != aVar) {
                                                                            str12 = strA4;
                                                                            str13 = null;
                                                                            d11 = d10;
                                                                            list13 = list12;
                                                                            R4.c.b(str12, str13);
                                                                            size = list8.size();
                                                                            size2 = list10.size();
                                                                            size3 = list11.size();
                                                                            size4 = list13.size() + list9.size() + list7.size();
                                                                            n0Var = R4.c.f9052a;
                                                                            do {
                                                                                value = n0Var.getValue();
                                                                            } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                                            java.util.Set set4 = p015b5.AbstractC1664a.f17935a;
                                                                            int size5 = list8.size();
                                                                            int size6 = list10.size();
                                                                            int size7 = list11.size();
                                                                            int size8 = list13.size() + list9.size() + list7.size();
                                                                            int iD = d11.f13303m.d();
                                                                            java.lang.Runtime runtime3 = java.lang.Runtime.getRuntime();
                                                                            long jMaxMemory3 = runtime3.maxMemory();
                                                                            long jFreeMemory3 = runtime3.totalMemory() - runtime3.freeMemory();
                                                                            long j11 = 1048576;
                                                                            P4.a aVar4 = new P4.a((int) (jFreeMemory3 / j11), (int) ((jMaxMemory3 - jFreeMemory3) / j11), (int) (jMaxMemory3 / j11));
                                                                            java.lang.StringBuilder sbS = p121o0.p.s(size5, size6, "load_completed movies=", " series=", " live=");
                                                                            Y6.f.w(sbS, size7, " categories=", size8, " epgPrograms=");
                                                                            sbS.append(iD);
                                                                            sbS.append(str);
                                                                            sbS.append(aVar4);
                                                                            p015b5.AbstractC1664a.a(sbS.toString(), str3);
                                                                            p015b5.AbstractC1664a.d(str2, null);
                                                                            return a2;
                                                                        }
                                                                    }
                                                                } else {
                                                                    V7.n0 n0Var13 = R4.c.f9052a;
                                                                    strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                                    list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                                    if (list == null) {
                                                                        list = list14;
                                                                    }
                                                                    list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                                    if (list2 == null) {
                                                                        list2 = list14;
                                                                    }
                                                                    list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                                    if (list3 == null) {
                                                                        list3 = list14;
                                                                    }
                                                                    list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                                    if (list4 == null) {
                                                                        list4 = list14;
                                                                    }
                                                                    list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                                    if (list5 == null) {
                                                                        list5 = list14;
                                                                    }
                                                                    list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                                    if (list6 != null) {
                                                                        list14 = list6;
                                                                    }
                                                                    p005a5.C1366p c1366p3 = d10.f13296d;
                                                                    java.lang.String id2 = playlist3.f20033a;
                                                                    c1366p3.getClass();
                                                                    kotlin.jvm.internal.m.e(id2, "id");
                                                                    V7.n0 n0Var14 = c1366p3.f14907a;
                                                                    n0Var14.getClass();
                                                                    n0Var14.i(null, id2);
                                                                    p005a5.C1366p c1366p4 = d10.f13296d;
                                                                    c1378q1.f14965h = d10;
                                                                    c1378q1.f14966i = strA4;
                                                                    c1378q1.j = list;
                                                                    c1378q1.f14967k = list2;
                                                                    c1378q1.f14968l = list3;
                                                                    c1378q1.f14969m = list4;
                                                                    c1378q1.f14970n = list5;
                                                                    c1378q1.f14971o = list14;
                                                                    c1378q1.f14976t = 7;
                                                                    c1366p4.getClass();
                                                                    list7 = list;
                                                                    list8 = list2;
                                                                    list9 = list3;
                                                                    list10 = list4;
                                                                    list11 = list14;
                                                                    list12 = list5;
                                                                    objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p4, null), c1378q1);
                                                                    if (objK != p109m6.a.f25430h) {
                                                                        objK = a2;
                                                                    }
                                                                    if (objK != aVar) {
                                                                        str12 = strA4;
                                                                        str13 = null;
                                                                        d11 = d10;
                                                                        list13 = list12;
                                                                        R4.c.b(str12, str13);
                                                                        size = list8.size();
                                                                        size2 = list10.size();
                                                                        size3 = list11.size();
                                                                        size4 = list13.size() + list9.size() + list7.size();
                                                                        n0Var = R4.c.f9052a;
                                                                        do {
                                                                            value = n0Var.getValue();
                                                                        } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                                        java.util.Set set5 = p015b5.AbstractC1664a.f17935a;
                                                                        int size9 = list8.size();
                                                                        int size10 = list10.size();
                                                                        int size11 = list11.size();
                                                                        int size12 = list13.size() + list9.size() + list7.size();
                                                                        int iD2 = d11.f13303m.d();
                                                                        java.lang.Runtime runtime4 = java.lang.Runtime.getRuntime();
                                                                        long jMaxMemory4 = runtime4.maxMemory();
                                                                        long jFreeMemory4 = runtime4.totalMemory() - runtime4.freeMemory();
                                                                        long j12 = 1048576;
                                                                        P4.a aVar5 = new P4.a((int) (jFreeMemory4 / j12), (int) ((jMaxMemory4 - jFreeMemory4) / j12), (int) (jMaxMemory4 / j12));
                                                                        java.lang.StringBuilder sbS2 = p121o0.p.s(size9, size10, "load_completed movies=", " series=", " live=");
                                                                        Y6.f.w(sbS2, size11, " categories=", size12, " epgPrograms=");
                                                                        sbS2.append(iD2);
                                                                        sbS2.append(str);
                                                                        sbS2.append(aVar5);
                                                                        p015b5.AbstractC1664a.a(sbS2.toString(), str3);
                                                                        p015b5.AbstractC1664a.d(str2, null);
                                                                        return a2;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (java.lang.Exception e9) {
                                                        e = e9;
                                                        playlist4 = playlist2;
                                                        str10 = strA3;
                                                        i12 = i11;
                                                        Y6.f.u(e, "healthCheck threw: ", "PlaylistContentLoader");
                                                        zBooleanValue2 = false;
                                                        i11 = i12;
                                                        if (!zBooleanValue2) {
                                                            V7.n0 n0Var15 = R4.c.f9052a;
                                                            R4.c.c(str10, "unreachable");
                                                            throw new java.lang.IllegalStateException("Server unreachable");
                                                        }
                                                        V7.n0 n0Var16 = R4.c.f9052a;
                                                        R4.c.b(str10, "ok");
                                                        playlist3 = playlist4;
                                                        bVar = P4.c.f8139b;
                                                        if (bVar != null) {
                                                            z12 = bVar.f8137e;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        if (i11 != 0) {
                                                            z13 = i3;
                                                        } else {
                                                            z13 = 0;
                                                        }
                                                        c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                                                        z14 = z12;
                                                        c1378q1.f14965h = d9;
                                                        c1378q1.f14966i = playlist3;
                                                        c1378q1.j = null;
                                                        c1378q1.f14972p = z14;
                                                        c1378q1.f14976t = 5;
                                                        if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                                            d10 = d9;
                                                            if (z14) {
                                                                java.util.Set set6 = p015b5.AbstractC1664a.f17935a;
                                                                java.lang.Runtime runtime5 = java.lang.Runtime.getRuntime();
                                                                long jMaxMemory5 = runtime5.maxMemory();
                                                                long jFreeMemory5 = runtime5.totalMemory() - runtime5.freeMemory();
                                                                long j13 = 1048576;
                                                                p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory5 / j13), (int) ((jMaxMemory5 - jFreeMemory5) / j13), (int) (jMaxMemory5 / j13)), str3);
                                                                c1378q1.f14965h = d10;
                                                                c1378q1.f14966i = playlist3;
                                                                c1378q1.f14976t = 6;
                                                                if (d10.e(playlist3, c1378q1) != aVar) {
                                                                    playlist5 = playlist3;
                                                                    playlist3 = playlist5;
                                                                    V7.n0 n0Var17 = R4.c.f9052a;
                                                                    strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                                    list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                                    if (list == null) {
                                                                        list = list14;
                                                                    }
                                                                    list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                                    if (list2 == null) {
                                                                        list2 = list14;
                                                                    }
                                                                    list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                                    if (list3 == null) {
                                                                        list3 = list14;
                                                                    }
                                                                    list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                                    if (list4 == null) {
                                                                        list4 = list14;
                                                                    }
                                                                    list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                                    if (list5 == null) {
                                                                        list5 = list14;
                                                                    }
                                                                    list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                                    if (list6 != null) {
                                                                        list14 = list6;
                                                                    }
                                                                    p005a5.C1366p c1366p5 = d10.f13296d;
                                                                    java.lang.String id3 = playlist3.f20033a;
                                                                    c1366p5.getClass();
                                                                    kotlin.jvm.internal.m.e(id3, "id");
                                                                    V7.n0 n0Var18 = c1366p5.f14907a;
                                                                    n0Var18.getClass();
                                                                    n0Var18.i(null, id3);
                                                                    p005a5.C1366p c1366p6 = d10.f13296d;
                                                                    c1378q1.f14965h = d10;
                                                                    c1378q1.f14966i = strA4;
                                                                    c1378q1.j = list;
                                                                    c1378q1.f14967k = list2;
                                                                    c1378q1.f14968l = list3;
                                                                    c1378q1.f14969m = list4;
                                                                    c1378q1.f14970n = list5;
                                                                    c1378q1.f14971o = list14;
                                                                    c1378q1.f14976t = 7;
                                                                    c1366p6.getClass();
                                                                    list7 = list;
                                                                    list8 = list2;
                                                                    list9 = list3;
                                                                    list10 = list4;
                                                                    list11 = list14;
                                                                    list12 = list5;
                                                                    objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p6, null), c1378q1);
                                                                    if (objK != p109m6.a.f25430h) {
                                                                        objK = a2;
                                                                    }
                                                                    if (objK != aVar) {
                                                                        str12 = strA4;
                                                                        str13 = null;
                                                                        d11 = d10;
                                                                        list13 = list12;
                                                                        R4.c.b(str12, str13);
                                                                        size = list8.size();
                                                                        size2 = list10.size();
                                                                        size3 = list11.size();
                                                                        size4 = list13.size() + list9.size() + list7.size();
                                                                        n0Var = R4.c.f9052a;
                                                                        do {
                                                                            value = n0Var.getValue();
                                                                        } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                                        java.util.Set set7 = p015b5.AbstractC1664a.f17935a;
                                                                        int size13 = list8.size();
                                                                        int size14 = list10.size();
                                                                        int size15 = list11.size();
                                                                        int size16 = list13.size() + list9.size() + list7.size();
                                                                        int iD3 = d11.f13303m.d();
                                                                        java.lang.Runtime runtime6 = java.lang.Runtime.getRuntime();
                                                                        long jMaxMemory6 = runtime6.maxMemory();
                                                                        long jFreeMemory6 = runtime6.totalMemory() - runtime6.freeMemory();
                                                                        long j14 = 1048576;
                                                                        P4.a aVar6 = new P4.a((int) (jFreeMemory6 / j14), (int) ((jMaxMemory6 - jFreeMemory6) / j14), (int) (jMaxMemory6 / j14));
                                                                        java.lang.StringBuilder sbS3 = p121o0.p.s(size13, size14, "load_completed movies=", " series=", " live=");
                                                                        Y6.f.w(sbS3, size15, " categories=", size16, " epgPrograms=");
                                                                        sbS3.append(iD3);
                                                                        sbS3.append(str);
                                                                        sbS3.append(aVar6);
                                                                        p015b5.AbstractC1664a.a(sbS3.toString(), str3);
                                                                        p015b5.AbstractC1664a.d(str2, null);
                                                                        return a2;
                                                                    }
                                                                }
                                                            } else {
                                                                V7.n0 n0Var19 = R4.c.f9052a;
                                                                strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                                list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                                if (list == null) {
                                                                    list = list14;
                                                                }
                                                                list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                                if (list2 == null) {
                                                                    list2 = list14;
                                                                }
                                                                list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                                if (list3 == null) {
                                                                    list3 = list14;
                                                                }
                                                                list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                                if (list4 == null) {
                                                                    list4 = list14;
                                                                }
                                                                list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                                if (list5 == null) {
                                                                    list5 = list14;
                                                                }
                                                                list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                                if (list6 != null) {
                                                                    list14 = list6;
                                                                }
                                                                p005a5.C1366p c1366p7 = d10.f13296d;
                                                                java.lang.String id4 = playlist3.f20033a;
                                                                c1366p7.getClass();
                                                                kotlin.jvm.internal.m.e(id4, "id");
                                                                V7.n0 n0Var110 = c1366p7.f14907a;
                                                                n0Var110.getClass();
                                                                n0Var110.i(null, id4);
                                                                p005a5.C1366p c1366p8 = d10.f13296d;
                                                                c1378q1.f14965h = d10;
                                                                c1378q1.f14966i = strA4;
                                                                c1378q1.j = list;
                                                                c1378q1.f14967k = list2;
                                                                c1378q1.f14968l = list3;
                                                                c1378q1.f14969m = list4;
                                                                c1378q1.f14970n = list5;
                                                                c1378q1.f14971o = list14;
                                                                c1378q1.f14976t = 7;
                                                                c1366p8.getClass();
                                                                list7 = list;
                                                                list8 = list2;
                                                                list9 = list3;
                                                                list10 = list4;
                                                                list11 = list14;
                                                                list12 = list5;
                                                                objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p8, null), c1378q1);
                                                                if (objK != p109m6.a.f25430h) {
                                                                    objK = a2;
                                                                }
                                                                if (objK != aVar) {
                                                                    str12 = strA4;
                                                                    str13 = null;
                                                                    d11 = d10;
                                                                    list13 = list12;
                                                                    R4.c.b(str12, str13);
                                                                    size = list8.size();
                                                                    size2 = list10.size();
                                                                    size3 = list11.size();
                                                                    size4 = list13.size() + list9.size() + list7.size();
                                                                    n0Var = R4.c.f9052a;
                                                                    do {
                                                                        value = n0Var.getValue();
                                                                    } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                                    java.util.Set set8 = p015b5.AbstractC1664a.f17935a;
                                                                    int size17 = list8.size();
                                                                    int size18 = list10.size();
                                                                    int size19 = list11.size();
                                                                    int size110 = list13.size() + list9.size() + list7.size();
                                                                    int iD4 = d11.f13303m.d();
                                                                    java.lang.Runtime runtime7 = java.lang.Runtime.getRuntime();
                                                                    long jMaxMemory7 = runtime7.maxMemory();
                                                                    long jFreeMemory7 = runtime7.totalMemory() - runtime7.freeMemory();
                                                                    long j15 = 1048576;
                                                                    P4.a aVar7 = new P4.a((int) (jFreeMemory7 / j15), (int) ((jMaxMemory7 - jFreeMemory7) / j15), (int) (jMaxMemory7 / j15));
                                                                    java.lang.StringBuilder sbS4 = p121o0.p.s(size17, size18, "load_completed movies=", " series=", " live=");
                                                                    Y6.f.w(sbS4, size19, " categories=", size110, " epgPrograms=");
                                                                    sbS4.append(iD4);
                                                                    sbS4.append(str);
                                                                    sbS4.append(aVar7);
                                                                    p015b5.AbstractC1664a.a(sbS4.toString(), str3);
                                                                    p015b5.AbstractC1664a.d(str2, null);
                                                                    return a2;
                                                                }
                                                            }
                                                        }
                                                        return aVar;
                                                    }
                                                    break;
                                                } else {
                                                    playlist3 = playlist2;
                                                    bVar = P4.c.f8139b;
                                                    if (bVar != null) {
                                                        z12 = bVar.f8137e;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    if (i11 != 0) {
                                                        z13 = i3;
                                                    } else {
                                                        z13 = 0;
                                                    }
                                                    c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                                                    z14 = z12;
                                                    c1378q1.f14965h = d9;
                                                    c1378q1.f14966i = playlist3;
                                                    c1378q1.j = null;
                                                    c1378q1.f14972p = z14;
                                                    c1378q1.f14976t = 5;
                                                    if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                                        d10 = d9;
                                                        if (z14) {
                                                            java.util.Set set9 = p015b5.AbstractC1664a.f17935a;
                                                            java.lang.Runtime runtime8 = java.lang.Runtime.getRuntime();
                                                            long jMaxMemory8 = runtime8.maxMemory();
                                                            long jFreeMemory8 = runtime8.totalMemory() - runtime8.freeMemory();
                                                            long j16 = 1048576;
                                                            p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory8 / j16), (int) ((jMaxMemory8 - jFreeMemory8) / j16), (int) (jMaxMemory8 / j16)), str3);
                                                            c1378q1.f14965h = d10;
                                                            c1378q1.f14966i = playlist3;
                                                            c1378q1.f14976t = 6;
                                                            if (d10.e(playlist3, c1378q1) != aVar) {
                                                                playlist5 = playlist3;
                                                                playlist3 = playlist5;
                                                                V7.n0 n0Var111 = R4.c.f9052a;
                                                                strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                                list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                                if (list == null) {
                                                                    list = list14;
                                                                }
                                                                list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                                if (list2 == null) {
                                                                    list2 = list14;
                                                                }
                                                                list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                                if (list3 == null) {
                                                                    list3 = list14;
                                                                }
                                                                list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                                if (list4 == null) {
                                                                    list4 = list14;
                                                                }
                                                                list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                                if (list5 == null) {
                                                                    list5 = list14;
                                                                }
                                                                list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                                if (list6 != null) {
                                                                    list14 = list6;
                                                                }
                                                                p005a5.C1366p c1366p9 = d10.f13296d;
                                                                java.lang.String id5 = playlist3.f20033a;
                                                                c1366p9.getClass();
                                                                kotlin.jvm.internal.m.e(id5, "id");
                                                                V7.n0 n0Var112 = c1366p9.f14907a;
                                                                n0Var112.getClass();
                                                                n0Var112.i(null, id5);
                                                                p005a5.C1366p c1366p10 = d10.f13296d;
                                                                c1378q1.f14965h = d10;
                                                                c1378q1.f14966i = strA4;
                                                                c1378q1.j = list;
                                                                c1378q1.f14967k = list2;
                                                                c1378q1.f14968l = list3;
                                                                c1378q1.f14969m = list4;
                                                                c1378q1.f14970n = list5;
                                                                c1378q1.f14971o = list14;
                                                                c1378q1.f14976t = 7;
                                                                c1366p10.getClass();
                                                                list7 = list;
                                                                list8 = list2;
                                                                list9 = list3;
                                                                list10 = list4;
                                                                list11 = list14;
                                                                list12 = list5;
                                                                objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p10, null), c1378q1);
                                                                if (objK != p109m6.a.f25430h) {
                                                                    objK = a2;
                                                                }
                                                                if (objK != aVar) {
                                                                    str12 = strA4;
                                                                    str13 = null;
                                                                    d11 = d10;
                                                                    list13 = list12;
                                                                    R4.c.b(str12, str13);
                                                                    size = list8.size();
                                                                    size2 = list10.size();
                                                                    size3 = list11.size();
                                                                    size4 = list13.size() + list9.size() + list7.size();
                                                                    n0Var = R4.c.f9052a;
                                                                    do {
                                                                        value = n0Var.getValue();
                                                                    } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                                    java.util.Set set10 = p015b5.AbstractC1664a.f17935a;
                                                                    int size111 = list8.size();
                                                                    int size112 = list10.size();
                                                                    int size113 = list11.size();
                                                                    int size114 = list13.size() + list9.size() + list7.size();
                                                                    int iD5 = d11.f13303m.d();
                                                                    java.lang.Runtime runtime9 = java.lang.Runtime.getRuntime();
                                                                    long jMaxMemory9 = runtime9.maxMemory();
                                                                    long jFreeMemory9 = runtime9.totalMemory() - runtime9.freeMemory();
                                                                    long j17 = 1048576;
                                                                    P4.a aVar8 = new P4.a((int) (jFreeMemory9 / j17), (int) ((jMaxMemory9 - jFreeMemory9) / j17), (int) (jMaxMemory9 / j17));
                                                                    java.lang.StringBuilder sbS5 = p121o0.p.s(size111, size112, "load_completed movies=", " series=", " live=");
                                                                    Y6.f.w(sbS5, size113, " categories=", size114, " epgPrograms=");
                                                                    sbS5.append(iD5);
                                                                    sbS5.append(str);
                                                                    sbS5.append(aVar8);
                                                                    p015b5.AbstractC1664a.a(sbS5.toString(), str3);
                                                                    p015b5.AbstractC1664a.d(str2, null);
                                                                    return a2;
                                                                }
                                                            }
                                                        } else {
                                                            V7.n0 n0Var113 = R4.c.f9052a;
                                                            strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                            list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                            if (list == null) {
                                                                list = list14;
                                                            }
                                                            list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                            if (list2 == null) {
                                                                list2 = list14;
                                                            }
                                                            list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                            if (list3 == null) {
                                                                list3 = list14;
                                                            }
                                                            list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                            if (list4 == null) {
                                                                list4 = list14;
                                                            }
                                                            list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                            if (list5 == null) {
                                                                list5 = list14;
                                                            }
                                                            list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                            if (list6 != null) {
                                                                list14 = list6;
                                                            }
                                                            p005a5.C1366p c1366p11 = d10.f13296d;
                                                            java.lang.String id6 = playlist3.f20033a;
                                                            c1366p11.getClass();
                                                            kotlin.jvm.internal.m.e(id6, "id");
                                                            V7.n0 n0Var114 = c1366p11.f14907a;
                                                            n0Var114.getClass();
                                                            n0Var114.i(null, id6);
                                                            p005a5.C1366p c1366p12 = d10.f13296d;
                                                            c1378q1.f14965h = d10;
                                                            c1378q1.f14966i = strA4;
                                                            c1378q1.j = list;
                                                            c1378q1.f14967k = list2;
                                                            c1378q1.f14968l = list3;
                                                            c1378q1.f14969m = list4;
                                                            c1378q1.f14970n = list5;
                                                            c1378q1.f14971o = list14;
                                                            c1378q1.f14976t = 7;
                                                            c1366p12.getClass();
                                                            list7 = list;
                                                            list8 = list2;
                                                            list9 = list3;
                                                            list10 = list4;
                                                            list11 = list14;
                                                            list12 = list5;
                                                            objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p12, null), c1378q1);
                                                            if (objK != p109m6.a.f25430h) {
                                                                objK = a2;
                                                            }
                                                            if (objK != aVar) {
                                                                str12 = strA4;
                                                                str13 = null;
                                                                d11 = d10;
                                                                list13 = list12;
                                                                R4.c.b(str12, str13);
                                                                size = list8.size();
                                                                size2 = list10.size();
                                                                size3 = list11.size();
                                                                size4 = list13.size() + list9.size() + list7.size();
                                                                n0Var = R4.c.f9052a;
                                                                do {
                                                                    value = n0Var.getValue();
                                                                } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                                java.util.Set set11 = p015b5.AbstractC1664a.f17935a;
                                                                int size115 = list8.size();
                                                                int size116 = list10.size();
                                                                int size117 = list11.size();
                                                                int size118 = list13.size() + list9.size() + list7.size();
                                                                int iD6 = d11.f13303m.d();
                                                                java.lang.Runtime runtime10 = java.lang.Runtime.getRuntime();
                                                                long jMaxMemory10 = runtime10.maxMemory();
                                                                long jFreeMemory10 = runtime10.totalMemory() - runtime10.freeMemory();
                                                                long j18 = 1048576;
                                                                P4.a aVar9 = new P4.a((int) (jFreeMemory10 / j18), (int) ((jMaxMemory10 - jFreeMemory10) / j18), (int) (jMaxMemory10 / j18));
                                                                java.lang.StringBuilder sbS6 = p121o0.p.s(size115, size116, "load_completed movies=", " series=", " live=");
                                                                Y6.f.w(sbS6, size117, " categories=", size118, " epgPrograms=");
                                                                sbS6.append(iD6);
                                                                sbS6.append(str);
                                                                sbS6.append(aVar9);
                                                                p015b5.AbstractC1664a.a(sbS6.toString(), str3);
                                                                p015b5.AbstractC1664a.d(str2, null);
                                                                return a2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (java.lang.Exception e10) {
                                            e = e10;
                                            V7.n0 n0Var20 = R4.c.f9052a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "auth failed";
                                            }
                                            R4.c.c(str5, message);
                                            java.util.Set set12 = p015b5.AbstractC1664a.f17935a;
                                            strH = kotlin.jvm.internal.B.f24540a.b(e.getClass()).h();
                                            if (strH == null) {
                                                strH = "unknown";
                                            }
                                            p015b5.AbstractC1664a.a("authentication_failed error=".concat(strH), str3);
                                            throw e;
                                        }
                                    }
                                } catch (java.lang.Exception e11) {
                                    e = e11;
                                    str5 = strA;
                                    V7.n0 n0Var21 = R4.c.f9052a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "auth failed";
                                    }
                                    R4.c.c(str5, message);
                                    java.util.Set set13 = p015b5.AbstractC1664a.f17935a;
                                    strH = kotlin.jvm.internal.B.f24540a.b(e.getClass()).h();
                                    if (strH == null) {
                                        strH = "unknown";
                                    }
                                    p015b5.AbstractC1664a.a("authentication_failed error=".concat(strH), str3);
                                    throw e;
                                }
                            } else {
                                i9 = 2;
                                V7.n0 n0Var22 = R4.c.f9052a;
                                strA2 = R4.c.a("Caricamento impostazioni", "gear");
                                c1291h4 = d12.f13297e;
                                str7 = playlist2.f20033a;
                                c1378q1.f14965h = d12;
                                c1378q1.f14966i = playlist2;
                                c1378q1.j = strA2;
                                c1378q1.f14972p = z9;
                                c1378q1.f14976t = 3;
                                if (c1291h4.j(str7, c1378q1) != aVar) {
                                    d9 = d12;
                                    z11 = z9;
                                    str8 = strA2;
                                    playlistSettings = (com.kiptv.core.model.PlaylistSettings) ((java.util.Map) ((V7.n0) d9.f13297e.f14556i.f10419h).getValue()).get(playlist2.f20033a);
                                    if (playlistSettings != null) {
                                        i10 = playlistSettings.f20064l;
                                    } else {
                                        i10 = i3;
                                    }
                                    R4.c.b(str8, null);
                                    if (z11) {
                                        gVar = d9.f13295c;
                                        java.lang.String playlistId2 = playlist2.f20033a;
                                        gVar.getClass();
                                        kotlin.jvm.internal.m.e(playlistId2, "playlistId");
                                        file = new java.io.File(gVar.c(playlistId2), "cache_metadata.json");
                                        if (file.exists()) {
                                            i11 = 0;
                                        } else {
                                            p162s8.d dVar2 = gVar.f10139b;
                                            java.lang.String strR2 = p160s6.k.R(file);
                                            dVar2.getClass();
                                            cacheMetadata = (com.kiptv.core.local.cache.CacheMetadata) dVar2.b(strR2, com.kiptv.core.local.cache.CacheMetadata.INSTANCE.serializer());
                                            if (cacheMetadata.f19596b != i9) {
                                                i11 = 0;
                                            } else {
                                                j = 60;
                                                if (java.lang.System.currentTimeMillis() - cacheMetadata.f19595a < ((long) i10) * ((long) 24) * j * j * ((long) 1000)) {
                                                    i11 = i3;
                                                } else {
                                                    i11 = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                    java.util.Set set14 = p015b5.AbstractC1664a.f17935a;
                                    if (i11 != 0) {
                                        str9 = "fresh";
                                    } else {
                                        str9 = "miss";
                                    }
                                    p015b5.AbstractC1664a.a("cache=".concat(str9), str3);
                                    if (i11 != 0) {
                                        V7.n0 n0Var23 = R4.c.f9052a;
                                        strA3 = R4.c.a("Controllo server", "wifi");
                                        p005a5.x9 x9Var4 = d9.f13294b;
                                        if (playlist2.c()) {
                                            str11 = playlist2.f20036d;
                                        } else {
                                            str11 = null;
                                        }
                                        c1378q1.f14965h = d9;
                                        c1378q1.f14966i = playlist2;
                                        c1378q1.j = strA3;
                                        c1378q1.f14973q = i11;
                                        c1378q1.f14976t = 4;
                                        zBooleanValue = ((java.lang.Boolean) x9Var4.f15327s.getValue()).booleanValue();
                                        v2Var = x9Var4.f15311a;
                                        if (zBooleanValue) {
                                            objP = v2Var.p(c1378q1);
                                        } else {
                                            objP = v2Var.p(c1378q1);
                                        }
                                        obj = objP;
                                        if (obj != aVar) {
                                            playlist4 = playlist2;
                                            str10 = strA3;
                                            i12 = i11;
                                            zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                                            i11 = i12;
                                            if (!zBooleanValue2) {
                                                V7.n0 n0Var115 = R4.c.f9052a;
                                                R4.c.c(str10, "unreachable");
                                                throw new java.lang.IllegalStateException("Server unreachable");
                                            }
                                            V7.n0 n0Var116 = R4.c.f9052a;
                                            R4.c.b(str10, "ok");
                                            playlist3 = playlist4;
                                            bVar = P4.c.f8139b;
                                            if (bVar != null) {
                                                z12 = bVar.f8137e;
                                            } else {
                                                z12 = false;
                                            }
                                            if (i11 != 0) {
                                                z13 = i3;
                                            } else {
                                                z13 = 0;
                                            }
                                            c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                                            z14 = z12;
                                            c1378q1.f14965h = d9;
                                            c1378q1.f14966i = playlist3;
                                            c1378q1.j = null;
                                            c1378q1.f14972p = z14;
                                            c1378q1.f14976t = 5;
                                            if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                                d10 = d9;
                                                if (z14) {
                                                    java.util.Set set15 = p015b5.AbstractC1664a.f17935a;
                                                    java.lang.Runtime runtime11 = java.lang.Runtime.getRuntime();
                                                    long jMaxMemory11 = runtime11.maxMemory();
                                                    long jFreeMemory11 = runtime11.totalMemory() - runtime11.freeMemory();
                                                    long j19 = 1048576;
                                                    p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory11 / j19), (int) ((jMaxMemory11 - jFreeMemory11) / j19), (int) (jMaxMemory11 / j19)), str3);
                                                    c1378q1.f14965h = d10;
                                                    c1378q1.f14966i = playlist3;
                                                    c1378q1.f14976t = 6;
                                                    if (d10.e(playlist3, c1378q1) != aVar) {
                                                        playlist5 = playlist3;
                                                        playlist3 = playlist5;
                                                        V7.n0 n0Var117 = R4.c.f9052a;
                                                        strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                        list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                        if (list == null) {
                                                            list = list14;
                                                        }
                                                        list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                        if (list2 == null) {
                                                            list2 = list14;
                                                        }
                                                        list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                        if (list3 == null) {
                                                            list3 = list14;
                                                        }
                                                        list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                        if (list4 == null) {
                                                            list4 = list14;
                                                        }
                                                        list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                        if (list5 == null) {
                                                            list5 = list14;
                                                        }
                                                        list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                        if (list6 != null) {
                                                            list14 = list6;
                                                        }
                                                        p005a5.C1366p c1366p13 = d10.f13296d;
                                                        java.lang.String id7 = playlist3.f20033a;
                                                        c1366p13.getClass();
                                                        kotlin.jvm.internal.m.e(id7, "id");
                                                        V7.n0 n0Var118 = c1366p13.f14907a;
                                                        n0Var118.getClass();
                                                        n0Var118.i(null, id7);
                                                        p005a5.C1366p c1366p14 = d10.f13296d;
                                                        c1378q1.f14965h = d10;
                                                        c1378q1.f14966i = strA4;
                                                        c1378q1.j = list;
                                                        c1378q1.f14967k = list2;
                                                        c1378q1.f14968l = list3;
                                                        c1378q1.f14969m = list4;
                                                        c1378q1.f14970n = list5;
                                                        c1378q1.f14971o = list14;
                                                        c1378q1.f14976t = 7;
                                                        c1366p14.getClass();
                                                        list7 = list;
                                                        list8 = list2;
                                                        list9 = list3;
                                                        list10 = list4;
                                                        list11 = list14;
                                                        list12 = list5;
                                                        objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p14, null), c1378q1);
                                                        if (objK != p109m6.a.f25430h) {
                                                            objK = a2;
                                                        }
                                                        if (objK != aVar) {
                                                            str12 = strA4;
                                                            str13 = null;
                                                            d11 = d10;
                                                            list13 = list12;
                                                            R4.c.b(str12, str13);
                                                            size = list8.size();
                                                            size2 = list10.size();
                                                            size3 = list11.size();
                                                            size4 = list13.size() + list9.size() + list7.size();
                                                            n0Var = R4.c.f9052a;
                                                            do {
                                                                value = n0Var.getValue();
                                                            } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                            java.util.Set set16 = p015b5.AbstractC1664a.f17935a;
                                                            int size119 = list8.size();
                                                            int size1110 = list10.size();
                                                            int size1111 = list11.size();
                                                            int size1112 = list13.size() + list9.size() + list7.size();
                                                            int iD7 = d11.f13303m.d();
                                                            java.lang.Runtime runtime12 = java.lang.Runtime.getRuntime();
                                                            long jMaxMemory12 = runtime12.maxMemory();
                                                            long jFreeMemory12 = runtime12.totalMemory() - runtime12.freeMemory();
                                                            long j110 = 1048576;
                                                            P4.a aVar10 = new P4.a((int) (jFreeMemory12 / j110), (int) ((jMaxMemory12 - jFreeMemory12) / j110), (int) (jMaxMemory12 / j110));
                                                            java.lang.StringBuilder sbS7 = p121o0.p.s(size119, size1110, "load_completed movies=", " series=", " live=");
                                                            Y6.f.w(sbS7, size1111, " categories=", size1112, " epgPrograms=");
                                                            sbS7.append(iD7);
                                                            sbS7.append(str);
                                                            sbS7.append(aVar10);
                                                            p015b5.AbstractC1664a.a(sbS7.toString(), str3);
                                                            p015b5.AbstractC1664a.d(str2, null);
                                                            return a2;
                                                        }
                                                    }
                                                } else {
                                                    V7.n0 n0Var119 = R4.c.f9052a;
                                                    strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                    list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                    if (list == null) {
                                                        list = list14;
                                                    }
                                                    list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                    if (list2 == null) {
                                                        list2 = list14;
                                                    }
                                                    list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                    if (list3 == null) {
                                                        list3 = list14;
                                                    }
                                                    list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                    if (list4 == null) {
                                                        list4 = list14;
                                                    }
                                                    list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                    if (list5 == null) {
                                                        list5 = list14;
                                                    }
                                                    list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                    if (list6 != null) {
                                                        list14 = list6;
                                                    }
                                                    p005a5.C1366p c1366p15 = d10.f13296d;
                                                    java.lang.String id8 = playlist3.f20033a;
                                                    c1366p15.getClass();
                                                    kotlin.jvm.internal.m.e(id8, "id");
                                                    V7.n0 n0Var1110 = c1366p15.f14907a;
                                                    n0Var1110.getClass();
                                                    n0Var1110.i(null, id8);
                                                    p005a5.C1366p c1366p16 = d10.f13296d;
                                                    c1378q1.f14965h = d10;
                                                    c1378q1.f14966i = strA4;
                                                    c1378q1.j = list;
                                                    c1378q1.f14967k = list2;
                                                    c1378q1.f14968l = list3;
                                                    c1378q1.f14969m = list4;
                                                    c1378q1.f14970n = list5;
                                                    c1378q1.f14971o = list14;
                                                    c1378q1.f14976t = 7;
                                                    c1366p16.getClass();
                                                    list7 = list;
                                                    list8 = list2;
                                                    list9 = list3;
                                                    list10 = list4;
                                                    list11 = list14;
                                                    list12 = list5;
                                                    objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p16, null), c1378q1);
                                                    if (objK != p109m6.a.f25430h) {
                                                        objK = a2;
                                                    }
                                                    if (objK != aVar) {
                                                        str12 = strA4;
                                                        str13 = null;
                                                        d11 = d10;
                                                        list13 = list12;
                                                        R4.c.b(str12, str13);
                                                        size = list8.size();
                                                        size2 = list10.size();
                                                        size3 = list11.size();
                                                        size4 = list13.size() + list9.size() + list7.size();
                                                        n0Var = R4.c.f9052a;
                                                        do {
                                                            value = n0Var.getValue();
                                                        } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                        java.util.Set set17 = p015b5.AbstractC1664a.f17935a;
                                                        int size1113 = list8.size();
                                                        int size1114 = list10.size();
                                                        int size1115 = list11.size();
                                                        int size1116 = list13.size() + list9.size() + list7.size();
                                                        int iD8 = d11.f13303m.d();
                                                        java.lang.Runtime runtime13 = java.lang.Runtime.getRuntime();
                                                        long jMaxMemory13 = runtime13.maxMemory();
                                                        long jFreeMemory13 = runtime13.totalMemory() - runtime13.freeMemory();
                                                        long j111 = 1048576;
                                                        P4.a aVar11 = new P4.a((int) (jFreeMemory13 / j111), (int) ((jMaxMemory13 - jFreeMemory13) / j111), (int) (jMaxMemory13 / j111));
                                                        java.lang.StringBuilder sbS8 = p121o0.p.s(size1113, size1114, "load_completed movies=", " series=", " live=");
                                                        Y6.f.w(sbS8, size1115, " categories=", size1116, " epgPrograms=");
                                                        sbS8.append(iD8);
                                                        sbS8.append(str);
                                                        sbS8.append(aVar11);
                                                        p015b5.AbstractC1664a.a(sbS8.toString(), str3);
                                                        p015b5.AbstractC1664a.d(str2, null);
                                                        return a2;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        playlist3 = playlist2;
                                        bVar = P4.c.f8139b;
                                        if (bVar != null) {
                                            z12 = bVar.f8137e;
                                        } else {
                                            z12 = false;
                                        }
                                        if (i11 != 0) {
                                            z13 = i3;
                                        } else {
                                            z13 = 0;
                                        }
                                        c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                                        z14 = z12;
                                        c1378q1.f14965h = d9;
                                        c1378q1.f14966i = playlist3;
                                        c1378q1.j = null;
                                        c1378q1.f14972p = z14;
                                        c1378q1.f14976t = 5;
                                        if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                            d10 = d9;
                                            if (z14) {
                                                java.util.Set set18 = p015b5.AbstractC1664a.f17935a;
                                                java.lang.Runtime runtime14 = java.lang.Runtime.getRuntime();
                                                long jMaxMemory14 = runtime14.maxMemory();
                                                long jFreeMemory14 = runtime14.totalMemory() - runtime14.freeMemory();
                                                long j112 = 1048576;
                                                p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory14 / j112), (int) ((jMaxMemory14 - jFreeMemory14) / j112), (int) (jMaxMemory14 / j112)), str3);
                                                c1378q1.f14965h = d10;
                                                c1378q1.f14966i = playlist3;
                                                c1378q1.f14976t = 6;
                                                if (d10.e(playlist3, c1378q1) != aVar) {
                                                    playlist5 = playlist3;
                                                    playlist3 = playlist5;
                                                    V7.n0 n0Var1111 = R4.c.f9052a;
                                                    strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                    list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                    if (list == null) {
                                                        list = list14;
                                                    }
                                                    list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                    if (list2 == null) {
                                                        list2 = list14;
                                                    }
                                                    list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                    if (list3 == null) {
                                                        list3 = list14;
                                                    }
                                                    list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                    if (list4 == null) {
                                                        list4 = list14;
                                                    }
                                                    list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                    if (list5 == null) {
                                                        list5 = list14;
                                                    }
                                                    list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                    if (list6 != null) {
                                                        list14 = list6;
                                                    }
                                                    p005a5.C1366p c1366p17 = d10.f13296d;
                                                    java.lang.String id9 = playlist3.f20033a;
                                                    c1366p17.getClass();
                                                    kotlin.jvm.internal.m.e(id9, "id");
                                                    V7.n0 n0Var1112 = c1366p17.f14907a;
                                                    n0Var1112.getClass();
                                                    n0Var1112.i(null, id9);
                                                    p005a5.C1366p c1366p18 = d10.f13296d;
                                                    c1378q1.f14965h = d10;
                                                    c1378q1.f14966i = strA4;
                                                    c1378q1.j = list;
                                                    c1378q1.f14967k = list2;
                                                    c1378q1.f14968l = list3;
                                                    c1378q1.f14969m = list4;
                                                    c1378q1.f14970n = list5;
                                                    c1378q1.f14971o = list14;
                                                    c1378q1.f14976t = 7;
                                                    c1366p18.getClass();
                                                    list7 = list;
                                                    list8 = list2;
                                                    list9 = list3;
                                                    list10 = list4;
                                                    list11 = list14;
                                                    list12 = list5;
                                                    objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p18, null), c1378q1);
                                                    if (objK != p109m6.a.f25430h) {
                                                        objK = a2;
                                                    }
                                                    if (objK != aVar) {
                                                        str12 = strA4;
                                                        str13 = null;
                                                        d11 = d10;
                                                        list13 = list12;
                                                        R4.c.b(str12, str13);
                                                        size = list8.size();
                                                        size2 = list10.size();
                                                        size3 = list11.size();
                                                        size4 = list13.size() + list9.size() + list7.size();
                                                        n0Var = R4.c.f9052a;
                                                        do {
                                                            value = n0Var.getValue();
                                                        } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                        java.util.Set set19 = p015b5.AbstractC1664a.f17935a;
                                                        int size1117 = list8.size();
                                                        int size1118 = list10.size();
                                                        int size1119 = list11.size();
                                                        int size11110 = list13.size() + list9.size() + list7.size();
                                                        int iD9 = d11.f13303m.d();
                                                        java.lang.Runtime runtime15 = java.lang.Runtime.getRuntime();
                                                        long jMaxMemory15 = runtime15.maxMemory();
                                                        long jFreeMemory15 = runtime15.totalMemory() - runtime15.freeMemory();
                                                        long j113 = 1048576;
                                                        P4.a aVar12 = new P4.a((int) (jFreeMemory15 / j113), (int) ((jMaxMemory15 - jFreeMemory15) / j113), (int) (jMaxMemory15 / j113));
                                                        java.lang.StringBuilder sbS9 = p121o0.p.s(size1117, size1118, "load_completed movies=", " series=", " live=");
                                                        Y6.f.w(sbS9, size1119, " categories=", size11110, " epgPrograms=");
                                                        sbS9.append(iD9);
                                                        sbS9.append(str);
                                                        sbS9.append(aVar12);
                                                        p015b5.AbstractC1664a.a(sbS9.toString(), str3);
                                                        p015b5.AbstractC1664a.d(str2, null);
                                                        return a2;
                                                    }
                                                }
                                            } else {
                                                V7.n0 n0Var1113 = R4.c.f9052a;
                                                strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                if (list == null) {
                                                    list = list14;
                                                }
                                                list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                if (list2 == null) {
                                                    list2 = list14;
                                                }
                                                list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                if (list3 == null) {
                                                    list3 = list14;
                                                }
                                                list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                if (list4 == null) {
                                                    list4 = list14;
                                                }
                                                list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                if (list5 == null) {
                                                    list5 = list14;
                                                }
                                                list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                if (list6 != null) {
                                                    list14 = list6;
                                                }
                                                p005a5.C1366p c1366p19 = d10.f13296d;
                                                java.lang.String id10 = playlist3.f20033a;
                                                c1366p19.getClass();
                                                kotlin.jvm.internal.m.e(id10, "id");
                                                V7.n0 n0Var1114 = c1366p19.f14907a;
                                                n0Var1114.getClass();
                                                n0Var1114.i(null, id10);
                                                p005a5.C1366p c1366p110 = d10.f13296d;
                                                c1378q1.f14965h = d10;
                                                c1378q1.f14966i = strA4;
                                                c1378q1.j = list;
                                                c1378q1.f14967k = list2;
                                                c1378q1.f14968l = list3;
                                                c1378q1.f14969m = list4;
                                                c1378q1.f14970n = list5;
                                                c1378q1.f14971o = list14;
                                                c1378q1.f14976t = 7;
                                                c1366p110.getClass();
                                                list7 = list;
                                                list8 = list2;
                                                list9 = list3;
                                                list10 = list4;
                                                list11 = list14;
                                                list12 = list5;
                                                objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p110, null), c1378q1);
                                                if (objK != p109m6.a.f25430h) {
                                                    objK = a2;
                                                }
                                                if (objK != aVar) {
                                                    str12 = strA4;
                                                    str13 = null;
                                                    d11 = d10;
                                                    list13 = list12;
                                                    R4.c.b(str12, str13);
                                                    size = list8.size();
                                                    size2 = list10.size();
                                                    size3 = list11.size();
                                                    size4 = list13.size() + list9.size() + list7.size();
                                                    n0Var = R4.c.f9052a;
                                                    do {
                                                        value = n0Var.getValue();
                                                    } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                    java.util.Set set110 = p015b5.AbstractC1664a.f17935a;
                                                    int size11111 = list8.size();
                                                    int size11112 = list10.size();
                                                    int size11113 = list11.size();
                                                    int size11114 = list13.size() + list9.size() + list7.size();
                                                    int iD10 = d11.f13303m.d();
                                                    java.lang.Runtime runtime16 = java.lang.Runtime.getRuntime();
                                                    long jMaxMemory16 = runtime16.maxMemory();
                                                    long jFreeMemory16 = runtime16.totalMemory() - runtime16.freeMemory();
                                                    long j114 = 1048576;
                                                    P4.a aVar13 = new P4.a((int) (jFreeMemory16 / j114), (int) ((jMaxMemory16 - jFreeMemory16) / j114), (int) (jMaxMemory16 / j114));
                                                    java.lang.StringBuilder sbS10 = p121o0.p.s(size11111, size11112, "load_completed movies=", " series=", " live=");
                                                    Y6.f.w(sbS10, size11113, " categories=", size11114, " epgPrograms=");
                                                    sbS10.append(iD10);
                                                    sbS10.append(str);
                                                    sbS10.append(aVar13);
                                                    p015b5.AbstractC1664a.a(sbS10.toString(), str3);
                                                    p015b5.AbstractC1664a.d(str2, null);
                                                    return a2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    }
                    i15 = i16;
                    str15 = str;
                    str14 = str2;
                    aVar2 = aVar3;
                    str13 = null;
                    str16 = str17;
                    z15 = true;
                    c9 = 2;
                    a9 = a2;
                }
                break;
            case 1:
                boolean z16 = c1378q1.f14972p;
                java.lang.String str19 = (java.lang.String) c1378q1.j;
                playlist2 = (com.kiptv.core.model.Playlist) c1378q1.f14966i;
                p005a5.D1 d13 = c1378q1.f14965h;
                com.google.common.util.concurrent.P.u0(obj);
                aVar = aVar2;
                str = " heap=";
                str4 = str19;
                a2 = a9;
                str2 = "operation";
                i3 = 1;
                z9 = z16;
                d12 = d13;
                str3 = "playlist";
                V7.n0 n0Var24 = R4.c.f9052a;
                R4.c.b(str4, null);
                p005a5.x9 x9Var5 = d12.f13294b;
                x9Var5.getClass();
                kotlin.jvm.internal.m.e(playlist2, str3);
                x9Var5.f15311a.d(playlist2.f20036d, playlist2.f20037e, playlist2.f20038f);
                V7.n0 n0Var25 = x9Var5.f15312b;
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                n0Var25.getClass();
                n0Var25.i(null, bool2);
                x9Var5.f15309A.clear();
                x9Var5.b();
                V7.n0 n0Var26 = x9Var5.f15327s;
                java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(playlist2.c());
                n0Var26.getClass();
                n0Var26.i(null, boolValueOf2);
                if (playlist2.d()) {
                    strA = R4.c.a("Autenticazione Xtream", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY);
                    x9Var = d12.f13294b;
                    c1378q1.f14965h = d12;
                    c1378q1.f14966i = playlist2;
                    c1378q1.j = strA;
                    c1378q1.f14972p = z9;
                    i9 = 2;
                    c1378q1.f14976t = 2;
                    if (x9Var.a(c1378q1) != aVar) {
                        d6 = d12;
                        z10 = z9;
                        str5 = strA;
                        str6 = null;
                        R4.c.b(str5, str6);
                        z9 = z10;
                        d12 = d6;
                        V7.n0 n0Var27 = R4.c.f9052a;
                        strA2 = R4.c.a("Caricamento impostazioni", "gear");
                        c1291h4 = d12.f13297e;
                        str7 = playlist2.f20033a;
                        c1378q1.f14965h = d12;
                        c1378q1.f14966i = playlist2;
                        c1378q1.j = strA2;
                        c1378q1.f14972p = z9;
                        c1378q1.f14976t = 3;
                        if (c1291h4.j(str7, c1378q1) != aVar) {
                            d9 = d12;
                            z11 = z9;
                            str8 = strA2;
                            playlistSettings = (com.kiptv.core.model.PlaylistSettings) ((java.util.Map) ((V7.n0) d9.f13297e.f14556i.f10419h).getValue()).get(playlist2.f20033a);
                            if (playlistSettings != null) {
                                i10 = playlistSettings.f20064l;
                            } else {
                                i10 = i3;
                            }
                            R4.c.b(str8, null);
                            if (z11) {
                                gVar = d9.f13295c;
                                java.lang.String playlistId3 = playlist2.f20033a;
                                gVar.getClass();
                                kotlin.jvm.internal.m.e(playlistId3, "playlistId");
                                file = new java.io.File(gVar.c(playlistId3), "cache_metadata.json");
                                if (file.exists()) {
                                    i11 = 0;
                                } else {
                                    p162s8.d dVar3 = gVar.f10139b;
                                    java.lang.String strR3 = p160s6.k.R(file);
                                    dVar3.getClass();
                                    cacheMetadata = (com.kiptv.core.local.cache.CacheMetadata) dVar3.b(strR3, com.kiptv.core.local.cache.CacheMetadata.INSTANCE.serializer());
                                    if (cacheMetadata.f19596b != i9) {
                                        i11 = 0;
                                    } else {
                                        j = 60;
                                        if (java.lang.System.currentTimeMillis() - cacheMetadata.f19595a < ((long) i10) * ((long) 24) * j * j * ((long) 1000)) {
                                            i11 = i3;
                                        } else {
                                            i11 = 0;
                                        }
                                    }
                                }
                            } else {
                                i11 = 0;
                            }
                            java.util.Set set111 = p015b5.AbstractC1664a.f17935a;
                            if (i11 != 0) {
                                str9 = "fresh";
                            } else {
                                str9 = "miss";
                            }
                            p015b5.AbstractC1664a.a("cache=".concat(str9), str3);
                            if (i11 != 0) {
                                V7.n0 n0Var28 = R4.c.f9052a;
                                strA3 = R4.c.a("Controllo server", "wifi");
                                p005a5.x9 x9Var6 = d9.f13294b;
                                if (playlist2.c()) {
                                    str11 = playlist2.f20036d;
                                } else {
                                    str11 = null;
                                }
                                c1378q1.f14965h = d9;
                                c1378q1.f14966i = playlist2;
                                c1378q1.j = strA3;
                                c1378q1.f14973q = i11;
                                c1378q1.f14976t = 4;
                                zBooleanValue = ((java.lang.Boolean) x9Var6.f15327s.getValue()).booleanValue();
                                v2Var = x9Var6.f15311a;
                                if (zBooleanValue) {
                                    objP = v2Var.p(c1378q1);
                                } else {
                                    objP = v2Var.p(c1378q1);
                                }
                                obj = objP;
                                if (obj != aVar) {
                                    playlist4 = playlist2;
                                    str10 = strA3;
                                    i12 = i11;
                                    zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                                    i11 = i12;
                                    if (!zBooleanValue2) {
                                        V7.n0 n0Var1115 = R4.c.f9052a;
                                        R4.c.c(str10, "unreachable");
                                        throw new java.lang.IllegalStateException("Server unreachable");
                                    }
                                    V7.n0 n0Var1116 = R4.c.f9052a;
                                    R4.c.b(str10, "ok");
                                    playlist3 = playlist4;
                                    bVar = P4.c.f8139b;
                                    if (bVar != null) {
                                        z12 = bVar.f8137e;
                                    } else {
                                        z12 = false;
                                    }
                                    if (i11 != 0) {
                                        z13 = i3;
                                    } else {
                                        z13 = 0;
                                    }
                                    c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                                    z14 = z12;
                                    c1378q1.f14965h = d9;
                                    c1378q1.f14966i = playlist3;
                                    c1378q1.j = null;
                                    c1378q1.f14972p = z14;
                                    c1378q1.f14976t = 5;
                                    if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                        d10 = d9;
                                        if (z14) {
                                            java.util.Set set112 = p015b5.AbstractC1664a.f17935a;
                                            java.lang.Runtime runtime17 = java.lang.Runtime.getRuntime();
                                            long jMaxMemory17 = runtime17.maxMemory();
                                            long jFreeMemory17 = runtime17.totalMemory() - runtime17.freeMemory();
                                            long j115 = 1048576;
                                            p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory17 / j115), (int) ((jMaxMemory17 - jFreeMemory17) / j115), (int) (jMaxMemory17 / j115)), str3);
                                            c1378q1.f14965h = d10;
                                            c1378q1.f14966i = playlist3;
                                            c1378q1.f14976t = 6;
                                            if (d10.e(playlist3, c1378q1) != aVar) {
                                                playlist5 = playlist3;
                                                playlist3 = playlist5;
                                                V7.n0 n0Var1117 = R4.c.f9052a;
                                                strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                                list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                                if (list == null) {
                                                    list = list14;
                                                }
                                                list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                                if (list2 == null) {
                                                    list2 = list14;
                                                }
                                                list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                                if (list3 == null) {
                                                    list3 = list14;
                                                }
                                                list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                                if (list4 == null) {
                                                    list4 = list14;
                                                }
                                                list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                                if (list5 == null) {
                                                    list5 = list14;
                                                }
                                                list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                                if (list6 != null) {
                                                    list14 = list6;
                                                }
                                                p005a5.C1366p c1366p111 = d10.f13296d;
                                                java.lang.String id11 = playlist3.f20033a;
                                                c1366p111.getClass();
                                                kotlin.jvm.internal.m.e(id11, "id");
                                                V7.n0 n0Var1118 = c1366p111.f14907a;
                                                n0Var1118.getClass();
                                                n0Var1118.i(null, id11);
                                                p005a5.C1366p c1366p112 = d10.f13296d;
                                                c1378q1.f14965h = d10;
                                                c1378q1.f14966i = strA4;
                                                c1378q1.j = list;
                                                c1378q1.f14967k = list2;
                                                c1378q1.f14968l = list3;
                                                c1378q1.f14969m = list4;
                                                c1378q1.f14970n = list5;
                                                c1378q1.f14971o = list14;
                                                c1378q1.f14976t = 7;
                                                c1366p112.getClass();
                                                list7 = list;
                                                list8 = list2;
                                                list9 = list3;
                                                list10 = list4;
                                                list11 = list14;
                                                list12 = list5;
                                                objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p112, null), c1378q1);
                                                if (objK != p109m6.a.f25430h) {
                                                    objK = a2;
                                                }
                                                if (objK != aVar) {
                                                    str12 = strA4;
                                                    str13 = null;
                                                    d11 = d10;
                                                    list13 = list12;
                                                    R4.c.b(str12, str13);
                                                    size = list8.size();
                                                    size2 = list10.size();
                                                    size3 = list11.size();
                                                    size4 = list13.size() + list9.size() + list7.size();
                                                    n0Var = R4.c.f9052a;
                                                    do {
                                                        value = n0Var.getValue();
                                                    } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                    java.util.Set set113 = p015b5.AbstractC1664a.f17935a;
                                                    int size11115 = list8.size();
                                                    int size11116 = list10.size();
                                                    int size11117 = list11.size();
                                                    int size11118 = list13.size() + list9.size() + list7.size();
                                                    int iD11 = d11.f13303m.d();
                                                    java.lang.Runtime runtime18 = java.lang.Runtime.getRuntime();
                                                    long jMaxMemory18 = runtime18.maxMemory();
                                                    long jFreeMemory18 = runtime18.totalMemory() - runtime18.freeMemory();
                                                    long j116 = 1048576;
                                                    P4.a aVar14 = new P4.a((int) (jFreeMemory18 / j116), (int) ((jMaxMemory18 - jFreeMemory18) / j116), (int) (jMaxMemory18 / j116));
                                                    java.lang.StringBuilder sbS11 = p121o0.p.s(size11115, size11116, "load_completed movies=", " series=", " live=");
                                                    Y6.f.w(sbS11, size11117, " categories=", size11118, " epgPrograms=");
                                                    sbS11.append(iD11);
                                                    sbS11.append(str);
                                                    sbS11.append(aVar14);
                                                    p015b5.AbstractC1664a.a(sbS11.toString(), str3);
                                                    p015b5.AbstractC1664a.d(str2, null);
                                                    return a2;
                                                }
                                            }
                                        } else {
                                            V7.n0 n0Var1119 = R4.c.f9052a;
                                            strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                            list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                            if (list == null) {
                                                list = list14;
                                            }
                                            list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                            if (list2 == null) {
                                                list2 = list14;
                                            }
                                            list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                            if (list3 == null) {
                                                list3 = list14;
                                            }
                                            list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                            if (list4 == null) {
                                                list4 = list14;
                                            }
                                            list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                            if (list5 == null) {
                                                list5 = list14;
                                            }
                                            list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                            if (list6 != null) {
                                                list14 = list6;
                                            }
                                            p005a5.C1366p c1366p113 = d10.f13296d;
                                            java.lang.String id12 = playlist3.f20033a;
                                            c1366p113.getClass();
                                            kotlin.jvm.internal.m.e(id12, "id");
                                            V7.n0 n0Var11110 = c1366p113.f14907a;
                                            n0Var11110.getClass();
                                            n0Var11110.i(null, id12);
                                            p005a5.C1366p c1366p114 = d10.f13296d;
                                            c1378q1.f14965h = d10;
                                            c1378q1.f14966i = strA4;
                                            c1378q1.j = list;
                                            c1378q1.f14967k = list2;
                                            c1378q1.f14968l = list3;
                                            c1378q1.f14969m = list4;
                                            c1378q1.f14970n = list5;
                                            c1378q1.f14971o = list14;
                                            c1378q1.f14976t = 7;
                                            c1366p114.getClass();
                                            list7 = list;
                                            list8 = list2;
                                            list9 = list3;
                                            list10 = list4;
                                            list11 = list14;
                                            list12 = list5;
                                            objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p114, null), c1378q1);
                                            if (objK != p109m6.a.f25430h) {
                                                objK = a2;
                                            }
                                            if (objK != aVar) {
                                                str12 = strA4;
                                                str13 = null;
                                                d11 = d10;
                                                list13 = list12;
                                                R4.c.b(str12, str13);
                                                size = list8.size();
                                                size2 = list10.size();
                                                size3 = list11.size();
                                                size4 = list13.size() + list9.size() + list7.size();
                                                n0Var = R4.c.f9052a;
                                                do {
                                                    value = n0Var.getValue();
                                                } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                java.util.Set set114 = p015b5.AbstractC1664a.f17935a;
                                                int size11119 = list8.size();
                                                int size111110 = list10.size();
                                                int size111111 = list11.size();
                                                int size111112 = list13.size() + list9.size() + list7.size();
                                                int iD12 = d11.f13303m.d();
                                                java.lang.Runtime runtime19 = java.lang.Runtime.getRuntime();
                                                long jMaxMemory19 = runtime19.maxMemory();
                                                long jFreeMemory19 = runtime19.totalMemory() - runtime19.freeMemory();
                                                long j117 = 1048576;
                                                P4.a aVar15 = new P4.a((int) (jFreeMemory19 / j117), (int) ((jMaxMemory19 - jFreeMemory19) / j117), (int) (jMaxMemory19 / j117));
                                                java.lang.StringBuilder sbS12 = p121o0.p.s(size11119, size111110, "load_completed movies=", " series=", " live=");
                                                Y6.f.w(sbS12, size111111, " categories=", size111112, " epgPrograms=");
                                                sbS12.append(iD12);
                                                sbS12.append(str);
                                                sbS12.append(aVar15);
                                                p015b5.AbstractC1664a.a(sbS12.toString(), str3);
                                                p015b5.AbstractC1664a.d(str2, null);
                                                return a2;
                                            }
                                        }
                                    }
                                }
                            } else {
                                playlist3 = playlist2;
                                bVar = P4.c.f8139b;
                                if (bVar != null) {
                                    z12 = bVar.f8137e;
                                } else {
                                    z12 = false;
                                }
                                if (i11 != 0) {
                                    z13 = i3;
                                } else {
                                    z13 = 0;
                                }
                                c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                                z14 = z12;
                                c1378q1.f14965h = d9;
                                c1378q1.f14966i = playlist3;
                                c1378q1.j = null;
                                c1378q1.f14972p = z14;
                                c1378q1.f14976t = 5;
                                if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                    d10 = d9;
                                    if (z14) {
                                        java.util.Set set115 = p015b5.AbstractC1664a.f17935a;
                                        java.lang.Runtime runtime110 = java.lang.Runtime.getRuntime();
                                        long jMaxMemory110 = runtime110.maxMemory();
                                        long jFreeMemory110 = runtime110.totalMemory() - runtime110.freeMemory();
                                        long j118 = 1048576;
                                        p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory110 / j118), (int) ((jMaxMemory110 - jFreeMemory110) / j118), (int) (jMaxMemory110 / j118)), str3);
                                        c1378q1.f14965h = d10;
                                        c1378q1.f14966i = playlist3;
                                        c1378q1.f14976t = 6;
                                        if (d10.e(playlist3, c1378q1) != aVar) {
                                            playlist5 = playlist3;
                                            playlist3 = playlist5;
                                            V7.n0 n0Var11111 = R4.c.f9052a;
                                            strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                            list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                            if (list == null) {
                                                list = list14;
                                            }
                                            list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                            if (list2 == null) {
                                                list2 = list14;
                                            }
                                            list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                            if (list3 == null) {
                                                list3 = list14;
                                            }
                                            list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                            if (list4 == null) {
                                                list4 = list14;
                                            }
                                            list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                            if (list5 == null) {
                                                list5 = list14;
                                            }
                                            list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                            if (list6 != null) {
                                                list14 = list6;
                                            }
                                            p005a5.C1366p c1366p115 = d10.f13296d;
                                            java.lang.String id13 = playlist3.f20033a;
                                            c1366p115.getClass();
                                            kotlin.jvm.internal.m.e(id13, "id");
                                            V7.n0 n0Var11112 = c1366p115.f14907a;
                                            n0Var11112.getClass();
                                            n0Var11112.i(null, id13);
                                            p005a5.C1366p c1366p116 = d10.f13296d;
                                            c1378q1.f14965h = d10;
                                            c1378q1.f14966i = strA4;
                                            c1378q1.j = list;
                                            c1378q1.f14967k = list2;
                                            c1378q1.f14968l = list3;
                                            c1378q1.f14969m = list4;
                                            c1378q1.f14970n = list5;
                                            c1378q1.f14971o = list14;
                                            c1378q1.f14976t = 7;
                                            c1366p116.getClass();
                                            list7 = list;
                                            list8 = list2;
                                            list9 = list3;
                                            list10 = list4;
                                            list11 = list14;
                                            list12 = list5;
                                            objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p116, null), c1378q1);
                                            if (objK != p109m6.a.f25430h) {
                                                objK = a2;
                                            }
                                            if (objK != aVar) {
                                                str12 = strA4;
                                                str13 = null;
                                                d11 = d10;
                                                list13 = list12;
                                                R4.c.b(str12, str13);
                                                size = list8.size();
                                                size2 = list10.size();
                                                size3 = list11.size();
                                                size4 = list13.size() + list9.size() + list7.size();
                                                n0Var = R4.c.f9052a;
                                                do {
                                                    value = n0Var.getValue();
                                                } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                java.util.Set set116 = p015b5.AbstractC1664a.f17935a;
                                                int size111113 = list8.size();
                                                int size111114 = list10.size();
                                                int size111115 = list11.size();
                                                int size111116 = list13.size() + list9.size() + list7.size();
                                                int iD13 = d11.f13303m.d();
                                                java.lang.Runtime runtime111 = java.lang.Runtime.getRuntime();
                                                long jMaxMemory111 = runtime111.maxMemory();
                                                long jFreeMemory111 = runtime111.totalMemory() - runtime111.freeMemory();
                                                long j119 = 1048576;
                                                P4.a aVar16 = new P4.a((int) (jFreeMemory111 / j119), (int) ((jMaxMemory111 - jFreeMemory111) / j119), (int) (jMaxMemory111 / j119));
                                                java.lang.StringBuilder sbS13 = p121o0.p.s(size111113, size111114, "load_completed movies=", " series=", " live=");
                                                Y6.f.w(sbS13, size111115, " categories=", size111116, " epgPrograms=");
                                                sbS13.append(iD13);
                                                sbS13.append(str);
                                                sbS13.append(aVar16);
                                                p015b5.AbstractC1664a.a(sbS13.toString(), str3);
                                                p015b5.AbstractC1664a.d(str2, null);
                                                return a2;
                                            }
                                        }
                                    } else {
                                        V7.n0 n0Var11113 = R4.c.f9052a;
                                        strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                        list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                        if (list == null) {
                                            list = list14;
                                        }
                                        list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                        if (list2 == null) {
                                            list2 = list14;
                                        }
                                        list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                        if (list3 == null) {
                                            list3 = list14;
                                        }
                                        list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                        if (list4 == null) {
                                            list4 = list14;
                                        }
                                        list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                        if (list5 == null) {
                                            list5 = list14;
                                        }
                                        list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                        if (list6 != null) {
                                            list14 = list6;
                                        }
                                        p005a5.C1366p c1366p117 = d10.f13296d;
                                        java.lang.String id14 = playlist3.f20033a;
                                        c1366p117.getClass();
                                        kotlin.jvm.internal.m.e(id14, "id");
                                        V7.n0 n0Var11114 = c1366p117.f14907a;
                                        n0Var11114.getClass();
                                        n0Var11114.i(null, id14);
                                        p005a5.C1366p c1366p118 = d10.f13296d;
                                        c1378q1.f14965h = d10;
                                        c1378q1.f14966i = strA4;
                                        c1378q1.j = list;
                                        c1378q1.f14967k = list2;
                                        c1378q1.f14968l = list3;
                                        c1378q1.f14969m = list4;
                                        c1378q1.f14970n = list5;
                                        c1378q1.f14971o = list14;
                                        c1378q1.f14976t = 7;
                                        c1366p118.getClass();
                                        list7 = list;
                                        list8 = list2;
                                        list9 = list3;
                                        list10 = list4;
                                        list11 = list14;
                                        list12 = list5;
                                        objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p118, null), c1378q1);
                                        if (objK != p109m6.a.f25430h) {
                                            objK = a2;
                                        }
                                        if (objK != aVar) {
                                            str12 = strA4;
                                            str13 = null;
                                            d11 = d10;
                                            list13 = list12;
                                            R4.c.b(str12, str13);
                                            size = list8.size();
                                            size2 = list10.size();
                                            size3 = list11.size();
                                            size4 = list13.size() + list9.size() + list7.size();
                                            n0Var = R4.c.f9052a;
                                            do {
                                                value = n0Var.getValue();
                                            } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                            java.util.Set set117 = p015b5.AbstractC1664a.f17935a;
                                            int size111117 = list8.size();
                                            int size111118 = list10.size();
                                            int size111119 = list11.size();
                                            int size1111110 = list13.size() + list9.size() + list7.size();
                                            int iD14 = d11.f13303m.d();
                                            java.lang.Runtime runtime112 = java.lang.Runtime.getRuntime();
                                            long jMaxMemory112 = runtime112.maxMemory();
                                            long jFreeMemory112 = runtime112.totalMemory() - runtime112.freeMemory();
                                            long j1110 = 1048576;
                                            P4.a aVar17 = new P4.a((int) (jFreeMemory112 / j1110), (int) ((jMaxMemory112 - jFreeMemory112) / j1110), (int) (jMaxMemory112 / j1110));
                                            java.lang.StringBuilder sbS14 = p121o0.p.s(size111117, size111118, "load_completed movies=", " series=", " live=");
                                            Y6.f.w(sbS14, size111119, " categories=", size1111110, " epgPrograms=");
                                            sbS14.append(iD14);
                                            sbS14.append(str);
                                            sbS14.append(aVar17);
                                            p015b5.AbstractC1664a.a(sbS14.toString(), str3);
                                            p015b5.AbstractC1664a.d(str2, null);
                                            return a2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i9 = 2;
                    V7.n0 n0Var29 = R4.c.f9052a;
                    strA2 = R4.c.a("Caricamento impostazioni", "gear");
                    c1291h4 = d12.f13297e;
                    str7 = playlist2.f20033a;
                    c1378q1.f14965h = d12;
                    c1378q1.f14966i = playlist2;
                    c1378q1.j = strA2;
                    c1378q1.f14972p = z9;
                    c1378q1.f14976t = 3;
                    if (c1291h4.j(str7, c1378q1) != aVar) {
                        d9 = d12;
                        z11 = z9;
                        str8 = strA2;
                        playlistSettings = (com.kiptv.core.model.PlaylistSettings) ((java.util.Map) ((V7.n0) d9.f13297e.f14556i.f10419h).getValue()).get(playlist2.f20033a);
                        if (playlistSettings != null) {
                            i10 = playlistSettings.f20064l;
                        } else {
                            i10 = i3;
                        }
                        R4.c.b(str8, null);
                        if (z11) {
                            gVar = d9.f13295c;
                            java.lang.String playlistId4 = playlist2.f20033a;
                            gVar.getClass();
                            kotlin.jvm.internal.m.e(playlistId4, "playlistId");
                            file = new java.io.File(gVar.c(playlistId4), "cache_metadata.json");
                            if (file.exists()) {
                                i11 = 0;
                            } else {
                                p162s8.d dVar4 = gVar.f10139b;
                                java.lang.String strR4 = p160s6.k.R(file);
                                dVar4.getClass();
                                cacheMetadata = (com.kiptv.core.local.cache.CacheMetadata) dVar4.b(strR4, com.kiptv.core.local.cache.CacheMetadata.INSTANCE.serializer());
                                if (cacheMetadata.f19596b != i9) {
                                    i11 = 0;
                                } else {
                                    j = 60;
                                    if (java.lang.System.currentTimeMillis() - cacheMetadata.f19595a < ((long) i10) * ((long) 24) * j * j * ((long) 1000)) {
                                        i11 = i3;
                                    } else {
                                        i11 = 0;
                                    }
                                }
                            }
                        } else {
                            i11 = 0;
                        }
                        java.util.Set set118 = p015b5.AbstractC1664a.f17935a;
                        if (i11 != 0) {
                            str9 = "fresh";
                        } else {
                            str9 = "miss";
                        }
                        p015b5.AbstractC1664a.a("cache=".concat(str9), str3);
                        if (i11 != 0) {
                            V7.n0 n0Var210 = R4.c.f9052a;
                            strA3 = R4.c.a("Controllo server", "wifi");
                            p005a5.x9 x9Var7 = d9.f13294b;
                            if (playlist2.c()) {
                                str11 = playlist2.f20036d;
                            } else {
                                str11 = null;
                            }
                            c1378q1.f14965h = d9;
                            c1378q1.f14966i = playlist2;
                            c1378q1.j = strA3;
                            c1378q1.f14973q = i11;
                            c1378q1.f14976t = 4;
                            zBooleanValue = ((java.lang.Boolean) x9Var7.f15327s.getValue()).booleanValue();
                            v2Var = x9Var7.f15311a;
                            if (zBooleanValue) {
                                objP = v2Var.p(c1378q1);
                            } else {
                                objP = v2Var.p(c1378q1);
                            }
                            obj = objP;
                            if (obj != aVar) {
                                playlist4 = playlist2;
                                str10 = strA3;
                                i12 = i11;
                                zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                                i11 = i12;
                                if (!zBooleanValue2) {
                                    V7.n0 n0Var11115 = R4.c.f9052a;
                                    R4.c.c(str10, "unreachable");
                                    throw new java.lang.IllegalStateException("Server unreachable");
                                }
                                V7.n0 n0Var11116 = R4.c.f9052a;
                                R4.c.b(str10, "ok");
                                playlist3 = playlist4;
                                bVar = P4.c.f8139b;
                                if (bVar != null) {
                                    z12 = bVar.f8137e;
                                } else {
                                    z12 = false;
                                }
                                if (i11 != 0) {
                                    z13 = i3;
                                } else {
                                    z13 = 0;
                                }
                                c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                                z14 = z12;
                                c1378q1.f14965h = d9;
                                c1378q1.f14966i = playlist3;
                                c1378q1.j = null;
                                c1378q1.f14972p = z14;
                                c1378q1.f14976t = 5;
                                if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                    d10 = d9;
                                    if (z14) {
                                        java.util.Set set119 = p015b5.AbstractC1664a.f17935a;
                                        java.lang.Runtime runtime113 = java.lang.Runtime.getRuntime();
                                        long jMaxMemory113 = runtime113.maxMemory();
                                        long jFreeMemory113 = runtime113.totalMemory() - runtime113.freeMemory();
                                        long j1111 = 1048576;
                                        p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory113 / j1111), (int) ((jMaxMemory113 - jFreeMemory113) / j1111), (int) (jMaxMemory113 / j1111)), str3);
                                        c1378q1.f14965h = d10;
                                        c1378q1.f14966i = playlist3;
                                        c1378q1.f14976t = 6;
                                        if (d10.e(playlist3, c1378q1) != aVar) {
                                            playlist5 = playlist3;
                                            playlist3 = playlist5;
                                            V7.n0 n0Var11117 = R4.c.f9052a;
                                            strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                            list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                            if (list == null) {
                                                list = list14;
                                            }
                                            list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                            if (list2 == null) {
                                                list2 = list14;
                                            }
                                            list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                            if (list3 == null) {
                                                list3 = list14;
                                            }
                                            list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                            if (list4 == null) {
                                                list4 = list14;
                                            }
                                            list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                            if (list5 == null) {
                                                list5 = list14;
                                            }
                                            list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                            if (list6 != null) {
                                                list14 = list6;
                                            }
                                            p005a5.C1366p c1366p119 = d10.f13296d;
                                            java.lang.String id15 = playlist3.f20033a;
                                            c1366p119.getClass();
                                            kotlin.jvm.internal.m.e(id15, "id");
                                            V7.n0 n0Var11118 = c1366p119.f14907a;
                                            n0Var11118.getClass();
                                            n0Var11118.i(null, id15);
                                            p005a5.C1366p c1366p1110 = d10.f13296d;
                                            c1378q1.f14965h = d10;
                                            c1378q1.f14966i = strA4;
                                            c1378q1.j = list;
                                            c1378q1.f14967k = list2;
                                            c1378q1.f14968l = list3;
                                            c1378q1.f14969m = list4;
                                            c1378q1.f14970n = list5;
                                            c1378q1.f14971o = list14;
                                            c1378q1.f14976t = 7;
                                            c1366p1110.getClass();
                                            list7 = list;
                                            list8 = list2;
                                            list9 = list3;
                                            list10 = list4;
                                            list11 = list14;
                                            list12 = list5;
                                            objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p1110, null), c1378q1);
                                            if (objK != p109m6.a.f25430h) {
                                                objK = a2;
                                            }
                                            if (objK != aVar) {
                                                str12 = strA4;
                                                str13 = null;
                                                d11 = d10;
                                                list13 = list12;
                                                R4.c.b(str12, str13);
                                                size = list8.size();
                                                size2 = list10.size();
                                                size3 = list11.size();
                                                size4 = list13.size() + list9.size() + list7.size();
                                                n0Var = R4.c.f9052a;
                                                do {
                                                    value = n0Var.getValue();
                                                } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                java.util.Set set1110 = p015b5.AbstractC1664a.f17935a;
                                                int size1111111 = list8.size();
                                                int size1111112 = list10.size();
                                                int size1111113 = list11.size();
                                                int size1111114 = list13.size() + list9.size() + list7.size();
                                                int iD15 = d11.f13303m.d();
                                                java.lang.Runtime runtime114 = java.lang.Runtime.getRuntime();
                                                long jMaxMemory114 = runtime114.maxMemory();
                                                long jFreeMemory114 = runtime114.totalMemory() - runtime114.freeMemory();
                                                long j1112 = 1048576;
                                                P4.a aVar18 = new P4.a((int) (jFreeMemory114 / j1112), (int) ((jMaxMemory114 - jFreeMemory114) / j1112), (int) (jMaxMemory114 / j1112));
                                                java.lang.StringBuilder sbS15 = p121o0.p.s(size1111111, size1111112, "load_completed movies=", " series=", " live=");
                                                Y6.f.w(sbS15, size1111113, " categories=", size1111114, " epgPrograms=");
                                                sbS15.append(iD15);
                                                sbS15.append(str);
                                                sbS15.append(aVar18);
                                                p015b5.AbstractC1664a.a(sbS15.toString(), str3);
                                                p015b5.AbstractC1664a.d(str2, null);
                                                return a2;
                                            }
                                        }
                                    } else {
                                        V7.n0 n0Var11119 = R4.c.f9052a;
                                        strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                        list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                        if (list == null) {
                                            list = list14;
                                        }
                                        list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                        if (list2 == null) {
                                            list2 = list14;
                                        }
                                        list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                        if (list3 == null) {
                                            list3 = list14;
                                        }
                                        list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                        if (list4 == null) {
                                            list4 = list14;
                                        }
                                        list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                        if (list5 == null) {
                                            list5 = list14;
                                        }
                                        list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                        if (list6 != null) {
                                            list14 = list6;
                                        }
                                        p005a5.C1366p c1366p1111 = d10.f13296d;
                                        java.lang.String id16 = playlist3.f20033a;
                                        c1366p1111.getClass();
                                        kotlin.jvm.internal.m.e(id16, "id");
                                        V7.n0 n0Var111110 = c1366p1111.f14907a;
                                        n0Var111110.getClass();
                                        n0Var111110.i(null, id16);
                                        p005a5.C1366p c1366p1112 = d10.f13296d;
                                        c1378q1.f14965h = d10;
                                        c1378q1.f14966i = strA4;
                                        c1378q1.j = list;
                                        c1378q1.f14967k = list2;
                                        c1378q1.f14968l = list3;
                                        c1378q1.f14969m = list4;
                                        c1378q1.f14970n = list5;
                                        c1378q1.f14971o = list14;
                                        c1378q1.f14976t = 7;
                                        c1366p1112.getClass();
                                        list7 = list;
                                        list8 = list2;
                                        list9 = list3;
                                        list10 = list4;
                                        list11 = list14;
                                        list12 = list5;
                                        objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p1112, null), c1378q1);
                                        if (objK != p109m6.a.f25430h) {
                                            objK = a2;
                                        }
                                        if (objK != aVar) {
                                            str12 = strA4;
                                            str13 = null;
                                            d11 = d10;
                                            list13 = list12;
                                            R4.c.b(str12, str13);
                                            size = list8.size();
                                            size2 = list10.size();
                                            size3 = list11.size();
                                            size4 = list13.size() + list9.size() + list7.size();
                                            n0Var = R4.c.f9052a;
                                            do {
                                                value = n0Var.getValue();
                                            } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                            java.util.Set set1111 = p015b5.AbstractC1664a.f17935a;
                                            int size1111115 = list8.size();
                                            int size1111116 = list10.size();
                                            int size1111117 = list11.size();
                                            int size1111118 = list13.size() + list9.size() + list7.size();
                                            int iD16 = d11.f13303m.d();
                                            java.lang.Runtime runtime115 = java.lang.Runtime.getRuntime();
                                            long jMaxMemory115 = runtime115.maxMemory();
                                            long jFreeMemory115 = runtime115.totalMemory() - runtime115.freeMemory();
                                            long j1113 = 1048576;
                                            P4.a aVar19 = new P4.a((int) (jFreeMemory115 / j1113), (int) ((jMaxMemory115 - jFreeMemory115) / j1113), (int) (jMaxMemory115 / j1113));
                                            java.lang.StringBuilder sbS16 = p121o0.p.s(size1111115, size1111116, "load_completed movies=", " series=", " live=");
                                            Y6.f.w(sbS16, size1111117, " categories=", size1111118, " epgPrograms=");
                                            sbS16.append(iD16);
                                            sbS16.append(str);
                                            sbS16.append(aVar19);
                                            p015b5.AbstractC1664a.a(sbS16.toString(), str3);
                                            p015b5.AbstractC1664a.d(str2, null);
                                            return a2;
                                        }
                                    }
                                }
                            }
                        } else {
                            playlist3 = playlist2;
                            bVar = P4.c.f8139b;
                            if (bVar != null) {
                                z12 = bVar.f8137e;
                            } else {
                                z12 = false;
                            }
                            if (i11 != 0) {
                                z13 = i3;
                            } else {
                                z13 = 0;
                            }
                            c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                            z14 = z12;
                            c1378q1.f14965h = d9;
                            c1378q1.f14966i = playlist3;
                            c1378q1.j = null;
                            c1378q1.f14972p = z14;
                            c1378q1.f14976t = 5;
                            if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                d10 = d9;
                                if (z14) {
                                    java.util.Set set1112 = p015b5.AbstractC1664a.f17935a;
                                    java.lang.Runtime runtime116 = java.lang.Runtime.getRuntime();
                                    long jMaxMemory116 = runtime116.maxMemory();
                                    long jFreeMemory116 = runtime116.totalMemory() - runtime116.freeMemory();
                                    long j1114 = 1048576;
                                    p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory116 / j1114), (int) ((jMaxMemory116 - jFreeMemory116) / j1114), (int) (jMaxMemory116 / j1114)), str3);
                                    c1378q1.f14965h = d10;
                                    c1378q1.f14966i = playlist3;
                                    c1378q1.f14976t = 6;
                                    if (d10.e(playlist3, c1378q1) != aVar) {
                                        playlist5 = playlist3;
                                        playlist3 = playlist5;
                                        V7.n0 n0Var111111 = R4.c.f9052a;
                                        strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                        list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                        if (list == null) {
                                            list = list14;
                                        }
                                        list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                        if (list2 == null) {
                                            list2 = list14;
                                        }
                                        list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                        if (list3 == null) {
                                            list3 = list14;
                                        }
                                        list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                        if (list4 == null) {
                                            list4 = list14;
                                        }
                                        list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                        if (list5 == null) {
                                            list5 = list14;
                                        }
                                        list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                        if (list6 != null) {
                                            list14 = list6;
                                        }
                                        p005a5.C1366p c1366p1113 = d10.f13296d;
                                        java.lang.String id17 = playlist3.f20033a;
                                        c1366p1113.getClass();
                                        kotlin.jvm.internal.m.e(id17, "id");
                                        V7.n0 n0Var111112 = c1366p1113.f14907a;
                                        n0Var111112.getClass();
                                        n0Var111112.i(null, id17);
                                        p005a5.C1366p c1366p1114 = d10.f13296d;
                                        c1378q1.f14965h = d10;
                                        c1378q1.f14966i = strA4;
                                        c1378q1.j = list;
                                        c1378q1.f14967k = list2;
                                        c1378q1.f14968l = list3;
                                        c1378q1.f14969m = list4;
                                        c1378q1.f14970n = list5;
                                        c1378q1.f14971o = list14;
                                        c1378q1.f14976t = 7;
                                        c1366p1114.getClass();
                                        list7 = list;
                                        list8 = list2;
                                        list9 = list3;
                                        list10 = list4;
                                        list11 = list14;
                                        list12 = list5;
                                        objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p1114, null), c1378q1);
                                        if (objK != p109m6.a.f25430h) {
                                            objK = a2;
                                        }
                                        if (objK != aVar) {
                                            str12 = strA4;
                                            str13 = null;
                                            d11 = d10;
                                            list13 = list12;
                                            R4.c.b(str12, str13);
                                            size = list8.size();
                                            size2 = list10.size();
                                            size3 = list11.size();
                                            size4 = list13.size() + list9.size() + list7.size();
                                            n0Var = R4.c.f9052a;
                                            do {
                                                value = n0Var.getValue();
                                            } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                            java.util.Set set1113 = p015b5.AbstractC1664a.f17935a;
                                            int size1111119 = list8.size();
                                            int size11111110 = list10.size();
                                            int size11111111 = list11.size();
                                            int size11111112 = list13.size() + list9.size() + list7.size();
                                            int iD17 = d11.f13303m.d();
                                            java.lang.Runtime runtime117 = java.lang.Runtime.getRuntime();
                                            long jMaxMemory117 = runtime117.maxMemory();
                                            long jFreeMemory117 = runtime117.totalMemory() - runtime117.freeMemory();
                                            long j1115 = 1048576;
                                            P4.a aVar110 = new P4.a((int) (jFreeMemory117 / j1115), (int) ((jMaxMemory117 - jFreeMemory117) / j1115), (int) (jMaxMemory117 / j1115));
                                            java.lang.StringBuilder sbS17 = p121o0.p.s(size1111119, size11111110, "load_completed movies=", " series=", " live=");
                                            Y6.f.w(sbS17, size11111111, " categories=", size11111112, " epgPrograms=");
                                            sbS17.append(iD17);
                                            sbS17.append(str);
                                            sbS17.append(aVar110);
                                            p015b5.AbstractC1664a.a(sbS17.toString(), str3);
                                            p015b5.AbstractC1664a.d(str2, null);
                                            return a2;
                                        }
                                    }
                                } else {
                                    V7.n0 n0Var111113 = R4.c.f9052a;
                                    strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                    list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                    if (list == null) {
                                        list = list14;
                                    }
                                    list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                    if (list2 == null) {
                                        list2 = list14;
                                    }
                                    list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                    if (list3 == null) {
                                        list3 = list14;
                                    }
                                    list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                    if (list4 == null) {
                                        list4 = list14;
                                    }
                                    list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                    if (list5 == null) {
                                        list5 = list14;
                                    }
                                    list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                    if (list6 != null) {
                                        list14 = list6;
                                    }
                                    p005a5.C1366p c1366p1115 = d10.f13296d;
                                    java.lang.String id18 = playlist3.f20033a;
                                    c1366p1115.getClass();
                                    kotlin.jvm.internal.m.e(id18, "id");
                                    V7.n0 n0Var111114 = c1366p1115.f14907a;
                                    n0Var111114.getClass();
                                    n0Var111114.i(null, id18);
                                    p005a5.C1366p c1366p1116 = d10.f13296d;
                                    c1378q1.f14965h = d10;
                                    c1378q1.f14966i = strA4;
                                    c1378q1.j = list;
                                    c1378q1.f14967k = list2;
                                    c1378q1.f14968l = list3;
                                    c1378q1.f14969m = list4;
                                    c1378q1.f14970n = list5;
                                    c1378q1.f14971o = list14;
                                    c1378q1.f14976t = 7;
                                    c1366p1116.getClass();
                                    list7 = list;
                                    list8 = list2;
                                    list9 = list3;
                                    list10 = list4;
                                    list11 = list14;
                                    list12 = list5;
                                    objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p1116, null), c1378q1);
                                    if (objK != p109m6.a.f25430h) {
                                        objK = a2;
                                    }
                                    if (objK != aVar) {
                                        str12 = strA4;
                                        str13 = null;
                                        d11 = d10;
                                        list13 = list12;
                                        R4.c.b(str12, str13);
                                        size = list8.size();
                                        size2 = list10.size();
                                        size3 = list11.size();
                                        size4 = list13.size() + list9.size() + list7.size();
                                        n0Var = R4.c.f9052a;
                                        do {
                                            value = n0Var.getValue();
                                        } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                        java.util.Set set1114 = p015b5.AbstractC1664a.f17935a;
                                        int size11111113 = list8.size();
                                        int size11111114 = list10.size();
                                        int size11111115 = list11.size();
                                        int size11111116 = list13.size() + list9.size() + list7.size();
                                        int iD18 = d11.f13303m.d();
                                        java.lang.Runtime runtime118 = java.lang.Runtime.getRuntime();
                                        long jMaxMemory118 = runtime118.maxMemory();
                                        long jFreeMemory118 = runtime118.totalMemory() - runtime118.freeMemory();
                                        long j1116 = 1048576;
                                        P4.a aVar111 = new P4.a((int) (jFreeMemory118 / j1116), (int) ((jMaxMemory118 - jFreeMemory118) / j1116), (int) (jMaxMemory118 / j1116));
                                        java.lang.StringBuilder sbS18 = p121o0.p.s(size11111113, size11111114, "load_completed movies=", " series=", " live=");
                                        Y6.f.w(sbS18, size11111115, " categories=", size11111116, " epgPrograms=");
                                        sbS18.append(iD18);
                                        sbS18.append(str);
                                        sbS18.append(aVar111);
                                        p015b5.AbstractC1664a.a(sbS18.toString(), str3);
                                        p015b5.AbstractC1664a.d(str2, null);
                                        return a2;
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                z10 = c1378q1.f14972p;
                str5 = (java.lang.String) c1378q1.j;
                playlist2 = (com.kiptv.core.model.Playlist) c1378q1.f14966i;
                p005a5.D1 d14 = c1378q1.f14965h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                    aVar = aVar2;
                    str = " heap=";
                    d6 = d14;
                    a2 = a9;
                    str2 = "operation";
                    i3 = 1;
                    i9 = 2;
                    str3 = "playlist";
                    str6 = null;
                    R4.c.b(str5, str6);
                    z9 = z10;
                    d12 = d6;
                    V7.n0 n0Var211 = R4.c.f9052a;
                    strA2 = R4.c.a("Caricamento impostazioni", "gear");
                    c1291h4 = d12.f13297e;
                    str7 = playlist2.f20033a;
                    c1378q1.f14965h = d12;
                    c1378q1.f14966i = playlist2;
                    c1378q1.j = strA2;
                    c1378q1.f14972p = z9;
                    c1378q1.f14976t = 3;
                    if (c1291h4.j(str7, c1378q1) != aVar) {
                        d9 = d12;
                        z11 = z9;
                        str8 = strA2;
                        playlistSettings = (com.kiptv.core.model.PlaylistSettings) ((java.util.Map) ((V7.n0) d9.f13297e.f14556i.f10419h).getValue()).get(playlist2.f20033a);
                        if (playlistSettings != null) {
                            i10 = playlistSettings.f20064l;
                        } else {
                            i10 = i3;
                        }
                        R4.c.b(str8, null);
                        if (z11) {
                            gVar = d9.f13295c;
                            java.lang.String playlistId5 = playlist2.f20033a;
                            gVar.getClass();
                            kotlin.jvm.internal.m.e(playlistId5, "playlistId");
                            file = new java.io.File(gVar.c(playlistId5), "cache_metadata.json");
                            if (file.exists()) {
                                i11 = 0;
                            } else {
                                p162s8.d dVar5 = gVar.f10139b;
                                java.lang.String strR5 = p160s6.k.R(file);
                                dVar5.getClass();
                                cacheMetadata = (com.kiptv.core.local.cache.CacheMetadata) dVar5.b(strR5, com.kiptv.core.local.cache.CacheMetadata.INSTANCE.serializer());
                                if (cacheMetadata.f19596b != i9) {
                                    i11 = 0;
                                } else {
                                    j = 60;
                                    if (java.lang.System.currentTimeMillis() - cacheMetadata.f19595a < ((long) i10) * ((long) 24) * j * j * ((long) 1000)) {
                                        i11 = i3;
                                    } else {
                                        i11 = 0;
                                    }
                                }
                            }
                        } else {
                            i11 = 0;
                        }
                        java.util.Set set1115 = p015b5.AbstractC1664a.f17935a;
                        if (i11 != 0) {
                            str9 = "fresh";
                        } else {
                            str9 = "miss";
                        }
                        p015b5.AbstractC1664a.a("cache=".concat(str9), str3);
                        if (i11 != 0) {
                            V7.n0 n0Var212 = R4.c.f9052a;
                            strA3 = R4.c.a("Controllo server", "wifi");
                            p005a5.x9 x9Var8 = d9.f13294b;
                            if (playlist2.c()) {
                                str11 = playlist2.f20036d;
                            } else {
                                str11 = null;
                            }
                            c1378q1.f14965h = d9;
                            c1378q1.f14966i = playlist2;
                            c1378q1.j = strA3;
                            c1378q1.f14973q = i11;
                            c1378q1.f14976t = 4;
                            zBooleanValue = ((java.lang.Boolean) x9Var8.f15327s.getValue()).booleanValue();
                            v2Var = x9Var8.f15311a;
                            if (zBooleanValue) {
                                objP = v2Var.p(c1378q1);
                            } else {
                                objP = v2Var.p(c1378q1);
                            }
                            obj = objP;
                            if (obj != aVar) {
                                playlist4 = playlist2;
                                str10 = strA3;
                                i12 = i11;
                                zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                                i11 = i12;
                                if (!zBooleanValue2) {
                                    V7.n0 n0Var111115 = R4.c.f9052a;
                                    R4.c.c(str10, "unreachable");
                                    throw new java.lang.IllegalStateException("Server unreachable");
                                }
                                V7.n0 n0Var111116 = R4.c.f9052a;
                                R4.c.b(str10, "ok");
                                playlist3 = playlist4;
                                bVar = P4.c.f8139b;
                                if (bVar != null) {
                                    z12 = bVar.f8137e;
                                } else {
                                    z12 = false;
                                }
                                if (i11 != 0) {
                                    z13 = i3;
                                } else {
                                    z13 = 0;
                                }
                                c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                                z14 = z12;
                                c1378q1.f14965h = d9;
                                c1378q1.f14966i = playlist3;
                                c1378q1.j = null;
                                c1378q1.f14972p = z14;
                                c1378q1.f14976t = 5;
                                if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                    d10 = d9;
                                    if (z14) {
                                        java.util.Set set1116 = p015b5.AbstractC1664a.f17935a;
                                        java.lang.Runtime runtime119 = java.lang.Runtime.getRuntime();
                                        long jMaxMemory119 = runtime119.maxMemory();
                                        long jFreeMemory119 = runtime119.totalMemory() - runtime119.freeMemory();
                                        long j1117 = 1048576;
                                        p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory119 / j1117), (int) ((jMaxMemory119 - jFreeMemory119) / j1117), (int) (jMaxMemory119 / j1117)), str3);
                                        c1378q1.f14965h = d10;
                                        c1378q1.f14966i = playlist3;
                                        c1378q1.f14976t = 6;
                                        if (d10.e(playlist3, c1378q1) != aVar) {
                                            playlist5 = playlist3;
                                            playlist3 = playlist5;
                                            V7.n0 n0Var111117 = R4.c.f9052a;
                                            strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                            list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                            if (list == null) {
                                                list = list14;
                                            }
                                            list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                            if (list2 == null) {
                                                list2 = list14;
                                            }
                                            list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                            if (list3 == null) {
                                                list3 = list14;
                                            }
                                            list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                            if (list4 == null) {
                                                list4 = list14;
                                            }
                                            list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                            if (list5 == null) {
                                                list5 = list14;
                                            }
                                            list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                            if (list6 != null) {
                                                list14 = list6;
                                            }
                                            p005a5.C1366p c1366p1117 = d10.f13296d;
                                            java.lang.String id19 = playlist3.f20033a;
                                            c1366p1117.getClass();
                                            kotlin.jvm.internal.m.e(id19, "id");
                                            V7.n0 n0Var111118 = c1366p1117.f14907a;
                                            n0Var111118.getClass();
                                            n0Var111118.i(null, id19);
                                            p005a5.C1366p c1366p1118 = d10.f13296d;
                                            c1378q1.f14965h = d10;
                                            c1378q1.f14966i = strA4;
                                            c1378q1.j = list;
                                            c1378q1.f14967k = list2;
                                            c1378q1.f14968l = list3;
                                            c1378q1.f14969m = list4;
                                            c1378q1.f14970n = list5;
                                            c1378q1.f14971o = list14;
                                            c1378q1.f14976t = 7;
                                            c1366p1118.getClass();
                                            list7 = list;
                                            list8 = list2;
                                            list9 = list3;
                                            list10 = list4;
                                            list11 = list14;
                                            list12 = list5;
                                            objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p1118, null), c1378q1);
                                            if (objK != p109m6.a.f25430h) {
                                                objK = a2;
                                            }
                                            if (objK != aVar) {
                                                str12 = strA4;
                                                str13 = null;
                                                d11 = d10;
                                                list13 = list12;
                                                R4.c.b(str12, str13);
                                                size = list8.size();
                                                size2 = list10.size();
                                                size3 = list11.size();
                                                size4 = list13.size() + list9.size() + list7.size();
                                                n0Var = R4.c.f9052a;
                                                do {
                                                    value = n0Var.getValue();
                                                } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                                java.util.Set set1117 = p015b5.AbstractC1664a.f17935a;
                                                int size11111117 = list8.size();
                                                int size11111118 = list10.size();
                                                int size11111119 = list11.size();
                                                int size111111110 = list13.size() + list9.size() + list7.size();
                                                int iD19 = d11.f13303m.d();
                                                java.lang.Runtime runtime1110 = java.lang.Runtime.getRuntime();
                                                long jMaxMemory1110 = runtime1110.maxMemory();
                                                long jFreeMemory1110 = runtime1110.totalMemory() - runtime1110.freeMemory();
                                                long j1118 = 1048576;
                                                P4.a aVar112 = new P4.a((int) (jFreeMemory1110 / j1118), (int) ((jMaxMemory1110 - jFreeMemory1110) / j1118), (int) (jMaxMemory1110 / j1118));
                                                java.lang.StringBuilder sbS19 = p121o0.p.s(size11111117, size11111118, "load_completed movies=", " series=", " live=");
                                                Y6.f.w(sbS19, size11111119, " categories=", size111111110, " epgPrograms=");
                                                sbS19.append(iD19);
                                                sbS19.append(str);
                                                sbS19.append(aVar112);
                                                p015b5.AbstractC1664a.a(sbS19.toString(), str3);
                                                p015b5.AbstractC1664a.d(str2, null);
                                                return a2;
                                            }
                                        }
                                    } else {
                                        V7.n0 n0Var111119 = R4.c.f9052a;
                                        strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                        list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                        if (list == null) {
                                            list = list14;
                                        }
                                        list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                        if (list2 == null) {
                                            list2 = list14;
                                        }
                                        list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                        if (list3 == null) {
                                            list3 = list14;
                                        }
                                        list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                        if (list4 == null) {
                                            list4 = list14;
                                        }
                                        list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                        if (list5 == null) {
                                            list5 = list14;
                                        }
                                        list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                        if (list6 != null) {
                                            list14 = list6;
                                        }
                                        p005a5.C1366p c1366p1119 = d10.f13296d;
                                        java.lang.String id110 = playlist3.f20033a;
                                        c1366p1119.getClass();
                                        kotlin.jvm.internal.m.e(id110, "id");
                                        V7.n0 n0Var1111110 = c1366p1119.f14907a;
                                        n0Var1111110.getClass();
                                        n0Var1111110.i(null, id110);
                                        p005a5.C1366p c1366p11110 = d10.f13296d;
                                        c1378q1.f14965h = d10;
                                        c1378q1.f14966i = strA4;
                                        c1378q1.j = list;
                                        c1378q1.f14967k = list2;
                                        c1378q1.f14968l = list3;
                                        c1378q1.f14969m = list4;
                                        c1378q1.f14970n = list5;
                                        c1378q1.f14971o = list14;
                                        c1378q1.f14976t = 7;
                                        c1366p11110.getClass();
                                        list7 = list;
                                        list8 = list2;
                                        list9 = list3;
                                        list10 = list4;
                                        list11 = list14;
                                        list12 = list5;
                                        objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p11110, null), c1378q1);
                                        if (objK != p109m6.a.f25430h) {
                                            objK = a2;
                                        }
                                        if (objK != aVar) {
                                            str12 = strA4;
                                            str13 = null;
                                            d11 = d10;
                                            list13 = list12;
                                            R4.c.b(str12, str13);
                                            size = list8.size();
                                            size2 = list10.size();
                                            size3 = list11.size();
                                            size4 = list13.size() + list9.size() + list7.size();
                                            n0Var = R4.c.f9052a;
                                            do {
                                                value = n0Var.getValue();
                                            } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                            java.util.Set set1118 = p015b5.AbstractC1664a.f17935a;
                                            int size111111111 = list8.size();
                                            int size111111112 = list10.size();
                                            int size111111113 = list11.size();
                                            int size111111114 = list13.size() + list9.size() + list7.size();
                                            int iD110 = d11.f13303m.d();
                                            java.lang.Runtime runtime1111 = java.lang.Runtime.getRuntime();
                                            long jMaxMemory1111 = runtime1111.maxMemory();
                                            long jFreeMemory1111 = runtime1111.totalMemory() - runtime1111.freeMemory();
                                            long j1119 = 1048576;
                                            P4.a aVar113 = new P4.a((int) (jFreeMemory1111 / j1119), (int) ((jMaxMemory1111 - jFreeMemory1111) / j1119), (int) (jMaxMemory1111 / j1119));
                                            java.lang.StringBuilder sbS110 = p121o0.p.s(size111111111, size111111112, "load_completed movies=", " series=", " live=");
                                            Y6.f.w(sbS110, size111111113, " categories=", size111111114, " epgPrograms=");
                                            sbS110.append(iD110);
                                            sbS110.append(str);
                                            sbS110.append(aVar113);
                                            p015b5.AbstractC1664a.a(sbS110.toString(), str3);
                                            p015b5.AbstractC1664a.d(str2, null);
                                            return a2;
                                        }
                                    }
                                }
                            }
                        } else {
                            playlist3 = playlist2;
                            bVar = P4.c.f8139b;
                            if (bVar != null) {
                                z12 = bVar.f8137e;
                            } else {
                                z12 = false;
                            }
                            if (i11 != 0) {
                                z13 = i3;
                            } else {
                                z13 = 0;
                            }
                            c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                            z14 = z12;
                            c1378q1.f14965h = d9;
                            c1378q1.f14966i = playlist3;
                            c1378q1.j = null;
                            c1378q1.f14972p = z14;
                            c1378q1.f14976t = 5;
                            if (S7.C.m(c1397s1, c1378q1) != aVar) {
                                d10 = d9;
                                if (z14) {
                                    java.util.Set set1119 = p015b5.AbstractC1664a.f17935a;
                                    java.lang.Runtime runtime1112 = java.lang.Runtime.getRuntime();
                                    long jMaxMemory1112 = runtime1112.maxMemory();
                                    long jFreeMemory1112 = runtime1112.totalMemory() - runtime1112.freeMemory();
                                    long j11110 = 1048576;
                                    p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory1112 / j11110), (int) ((jMaxMemory1112 - jFreeMemory1112) / j11110), (int) (jMaxMemory1112 / j11110)), str3);
                                    c1378q1.f14965h = d10;
                                    c1378q1.f14966i = playlist3;
                                    c1378q1.f14976t = 6;
                                    if (d10.e(playlist3, c1378q1) != aVar) {
                                        playlist5 = playlist3;
                                        playlist3 = playlist5;
                                        V7.n0 n0Var1111111 = R4.c.f9052a;
                                        strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                        list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                        if (list == null) {
                                            list = list14;
                                        }
                                        list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                        if (list2 == null) {
                                            list2 = list14;
                                        }
                                        list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                        if (list3 == null) {
                                            list3 = list14;
                                        }
                                        list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                        if (list4 == null) {
                                            list4 = list14;
                                        }
                                        list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                        if (list5 == null) {
                                            list5 = list14;
                                        }
                                        list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                        if (list6 != null) {
                                            list14 = list6;
                                        }
                                        p005a5.C1366p c1366p11111 = d10.f13296d;
                                        java.lang.String id111 = playlist3.f20033a;
                                        c1366p11111.getClass();
                                        kotlin.jvm.internal.m.e(id111, "id");
                                        V7.n0 n0Var1111112 = c1366p11111.f14907a;
                                        n0Var1111112.getClass();
                                        n0Var1111112.i(null, id111);
                                        p005a5.C1366p c1366p11112 = d10.f13296d;
                                        c1378q1.f14965h = d10;
                                        c1378q1.f14966i = strA4;
                                        c1378q1.j = list;
                                        c1378q1.f14967k = list2;
                                        c1378q1.f14968l = list3;
                                        c1378q1.f14969m = list4;
                                        c1378q1.f14970n = list5;
                                        c1378q1.f14971o = list14;
                                        c1378q1.f14976t = 7;
                                        c1366p11112.getClass();
                                        list7 = list;
                                        list8 = list2;
                                        list9 = list3;
                                        list10 = list4;
                                        list11 = list14;
                                        list12 = list5;
                                        objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p11112, null), c1378q1);
                                        if (objK != p109m6.a.f25430h) {
                                            objK = a2;
                                        }
                                        if (objK != aVar) {
                                            str12 = strA4;
                                            str13 = null;
                                            d11 = d10;
                                            list13 = list12;
                                            R4.c.b(str12, str13);
                                            size = list8.size();
                                            size2 = list10.size();
                                            size3 = list11.size();
                                            size4 = list13.size() + list9.size() + list7.size();
                                            n0Var = R4.c.f9052a;
                                            do {
                                                value = n0Var.getValue();
                                            } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                            java.util.Set set11110 = p015b5.AbstractC1664a.f17935a;
                                            int size111111115 = list8.size();
                                            int size111111116 = list10.size();
                                            int size111111117 = list11.size();
                                            int size111111118 = list13.size() + list9.size() + list7.size();
                                            int iD111 = d11.f13303m.d();
                                            java.lang.Runtime runtime1113 = java.lang.Runtime.getRuntime();
                                            long jMaxMemory1113 = runtime1113.maxMemory();
                                            long jFreeMemory1113 = runtime1113.totalMemory() - runtime1113.freeMemory();
                                            long j11111 = 1048576;
                                            P4.a aVar114 = new P4.a((int) (jFreeMemory1113 / j11111), (int) ((jMaxMemory1113 - jFreeMemory1113) / j11111), (int) (jMaxMemory1113 / j11111));
                                            java.lang.StringBuilder sbS111 = p121o0.p.s(size111111115, size111111116, "load_completed movies=", " series=", " live=");
                                            Y6.f.w(sbS111, size111111117, " categories=", size111111118, " epgPrograms=");
                                            sbS111.append(iD111);
                                            sbS111.append(str);
                                            sbS111.append(aVar114);
                                            p015b5.AbstractC1664a.a(sbS111.toString(), str3);
                                            p015b5.AbstractC1664a.d(str2, null);
                                            return a2;
                                        }
                                    }
                                } else {
                                    V7.n0 n0Var1111113 = R4.c.f9052a;
                                    strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                    list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                    if (list == null) {
                                        list = list14;
                                    }
                                    list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                    if (list2 == null) {
                                        list2 = list14;
                                    }
                                    list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                    if (list3 == null) {
                                        list3 = list14;
                                    }
                                    list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                    if (list4 == null) {
                                        list4 = list14;
                                    }
                                    list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                    if (list5 == null) {
                                        list5 = list14;
                                    }
                                    list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                    if (list6 != null) {
                                        list14 = list6;
                                    }
                                    p005a5.C1366p c1366p11113 = d10.f13296d;
                                    java.lang.String id112 = playlist3.f20033a;
                                    c1366p11113.getClass();
                                    kotlin.jvm.internal.m.e(id112, "id");
                                    V7.n0 n0Var1111114 = c1366p11113.f14907a;
                                    n0Var1111114.getClass();
                                    n0Var1111114.i(null, id112);
                                    p005a5.C1366p c1366p11114 = d10.f13296d;
                                    c1378q1.f14965h = d10;
                                    c1378q1.f14966i = strA4;
                                    c1378q1.j = list;
                                    c1378q1.f14967k = list2;
                                    c1378q1.f14968l = list3;
                                    c1378q1.f14969m = list4;
                                    c1378q1.f14970n = list5;
                                    c1378q1.f14971o = list14;
                                    c1378q1.f14976t = 7;
                                    c1366p11114.getClass();
                                    list7 = list;
                                    list8 = list2;
                                    list9 = list3;
                                    list10 = list4;
                                    list11 = list14;
                                    list12 = list5;
                                    objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p11114, null), c1378q1);
                                    if (objK != p109m6.a.f25430h) {
                                        objK = a2;
                                    }
                                    if (objK != aVar) {
                                        str12 = strA4;
                                        str13 = null;
                                        d11 = d10;
                                        list13 = list12;
                                        R4.c.b(str12, str13);
                                        size = list8.size();
                                        size2 = list10.size();
                                        size3 = list11.size();
                                        size4 = list13.size() + list9.size() + list7.size();
                                        n0Var = R4.c.f9052a;
                                        do {
                                            value = n0Var.getValue();
                                        } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                        java.util.Set set11111 = p015b5.AbstractC1664a.f17935a;
                                        int size111111119 = list8.size();
                                        int size1111111110 = list10.size();
                                        int size1111111111 = list11.size();
                                        int size1111111112 = list13.size() + list9.size() + list7.size();
                                        int iD112 = d11.f13303m.d();
                                        java.lang.Runtime runtime1114 = java.lang.Runtime.getRuntime();
                                        long jMaxMemory1114 = runtime1114.maxMemory();
                                        long jFreeMemory1114 = runtime1114.totalMemory() - runtime1114.freeMemory();
                                        long j11112 = 1048576;
                                        P4.a aVar115 = new P4.a((int) (jFreeMemory1114 / j11112), (int) ((jMaxMemory1114 - jFreeMemory1114) / j11112), (int) (jMaxMemory1114 / j11112));
                                        java.lang.StringBuilder sbS112 = p121o0.p.s(size111111119, size1111111110, "load_completed movies=", " series=", " live=");
                                        Y6.f.w(sbS112, size1111111111, " categories=", size1111111112, " epgPrograms=");
                                        sbS112.append(iD112);
                                        sbS112.append(str);
                                        sbS112.append(aVar115);
                                        p015b5.AbstractC1664a.a(sbS112.toString(), str3);
                                        p015b5.AbstractC1664a.d(str2, null);
                                        return a2;
                                    }
                                }
                            }
                        }
                    }
                    return aVar;
                } catch (java.lang.Exception e12) {
                    e = e12;
                    str3 = "playlist";
                    V7.n0 n0Var213 = R4.c.f9052a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "auth failed";
                    }
                    R4.c.c(str5, message);
                    java.util.Set set120 = p015b5.AbstractC1664a.f17935a;
                    strH = kotlin.jvm.internal.B.f24540a.b(e.getClass()).h();
                    if (strH == null) {
                        strH = "unknown";
                    }
                    p015b5.AbstractC1664a.a("authentication_failed error=".concat(strH), str3);
                    throw e;
                }
            case 3:
                z11 = c1378q1.f14972p;
                str8 = (java.lang.String) c1378q1.j;
                playlist2 = (com.kiptv.core.model.Playlist) c1378q1.f14966i;
                p005a5.D1 d15 = c1378q1.f14965h;
                com.google.common.util.concurrent.P.u0(obj);
                aVar = aVar2;
                str = " heap=";
                a2 = a9;
                str2 = "operation";
                i3 = 1;
                i9 = 2;
                d9 = d15;
                str3 = "playlist";
                playlistSettings = (com.kiptv.core.model.PlaylistSettings) ((java.util.Map) ((V7.n0) d9.f13297e.f14556i.f10419h).getValue()).get(playlist2.f20033a);
                if (playlistSettings != null) {
                    i10 = playlistSettings.f20064l;
                } else {
                    i10 = i3;
                }
                R4.c.b(str8, null);
                if (z11) {
                    gVar = d9.f13295c;
                    java.lang.String playlistId6 = playlist2.f20033a;
                    gVar.getClass();
                    kotlin.jvm.internal.m.e(playlistId6, "playlistId");
                    file = new java.io.File(gVar.c(playlistId6), "cache_metadata.json");
                    if (file.exists()) {
                        i11 = 0;
                    } else {
                        p162s8.d dVar6 = gVar.f10139b;
                        java.lang.String strR6 = p160s6.k.R(file);
                        dVar6.getClass();
                        cacheMetadata = (com.kiptv.core.local.cache.CacheMetadata) dVar6.b(strR6, com.kiptv.core.local.cache.CacheMetadata.INSTANCE.serializer());
                        if (cacheMetadata.f19596b != i9) {
                            i11 = 0;
                        } else {
                            j = 60;
                            if (java.lang.System.currentTimeMillis() - cacheMetadata.f19595a < ((long) i10) * ((long) 24) * j * j * ((long) 1000)) {
                                i11 = i3;
                            } else {
                                i11 = 0;
                            }
                        }
                    }
                } else {
                    i11 = 0;
                }
                java.util.Set set11112 = p015b5.AbstractC1664a.f17935a;
                if (i11 != 0) {
                    str9 = "fresh";
                } else {
                    str9 = "miss";
                }
                p015b5.AbstractC1664a.a("cache=".concat(str9), str3);
                if (i11 != 0) {
                    V7.n0 n0Var214 = R4.c.f9052a;
                    strA3 = R4.c.a("Controllo server", "wifi");
                    p005a5.x9 x9Var9 = d9.f13294b;
                    if (playlist2.c()) {
                        str11 = playlist2.f20036d;
                    } else {
                        str11 = null;
                    }
                    c1378q1.f14965h = d9;
                    c1378q1.f14966i = playlist2;
                    c1378q1.j = strA3;
                    c1378q1.f14973q = i11;
                    c1378q1.f14976t = 4;
                    zBooleanValue = ((java.lang.Boolean) x9Var9.f15327s.getValue()).booleanValue();
                    v2Var = x9Var9.f15311a;
                    if (zBooleanValue) {
                        objP = v2Var.p(c1378q1);
                    } else {
                        objP = v2Var.p(c1378q1);
                    }
                    obj = objP;
                    if (obj != aVar) {
                        playlist4 = playlist2;
                        str10 = strA3;
                        i12 = i11;
                        zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                        i11 = i12;
                        if (!zBooleanValue2) {
                            V7.n0 n0Var1111115 = R4.c.f9052a;
                            R4.c.c(str10, "unreachable");
                            throw new java.lang.IllegalStateException("Server unreachable");
                        }
                        V7.n0 n0Var1111116 = R4.c.f9052a;
                        R4.c.b(str10, "ok");
                        playlist3 = playlist4;
                        bVar = P4.c.f8139b;
                        if (bVar != null) {
                            z12 = bVar.f8137e;
                        } else {
                            z12 = false;
                        }
                        if (i11 != 0) {
                            z13 = i3;
                        } else {
                            z13 = 0;
                        }
                        c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                        z14 = z12;
                        c1378q1.f14965h = d9;
                        c1378q1.f14966i = playlist3;
                        c1378q1.j = null;
                        c1378q1.f14972p = z14;
                        c1378q1.f14976t = 5;
                        if (S7.C.m(c1397s1, c1378q1) != aVar) {
                            d10 = d9;
                            if (z14) {
                                java.util.Set set11113 = p015b5.AbstractC1664a.f17935a;
                                java.lang.Runtime runtime1115 = java.lang.Runtime.getRuntime();
                                long jMaxMemory1115 = runtime1115.maxMemory();
                                long jFreeMemory1115 = runtime1115.totalMemory() - runtime1115.freeMemory();
                                long j11113 = 1048576;
                                p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory1115 / j11113), (int) ((jMaxMemory1115 - jFreeMemory1115) / j11113), (int) (jMaxMemory1115 / j11113)), str3);
                                c1378q1.f14965h = d10;
                                c1378q1.f14966i = playlist3;
                                c1378q1.f14976t = 6;
                                if (d10.e(playlist3, c1378q1) != aVar) {
                                    playlist5 = playlist3;
                                    playlist3 = playlist5;
                                    V7.n0 n0Var1111117 = R4.c.f9052a;
                                    strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                    list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                    if (list == null) {
                                        list = list14;
                                    }
                                    list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                    if (list2 == null) {
                                        list2 = list14;
                                    }
                                    list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                    if (list3 == null) {
                                        list3 = list14;
                                    }
                                    list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                    if (list4 == null) {
                                        list4 = list14;
                                    }
                                    list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                    if (list5 == null) {
                                        list5 = list14;
                                    }
                                    list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                    if (list6 != null) {
                                        list14 = list6;
                                    }
                                    p005a5.C1366p c1366p11115 = d10.f13296d;
                                    java.lang.String id113 = playlist3.f20033a;
                                    c1366p11115.getClass();
                                    kotlin.jvm.internal.m.e(id113, "id");
                                    V7.n0 n0Var1111118 = c1366p11115.f14907a;
                                    n0Var1111118.getClass();
                                    n0Var1111118.i(null, id113);
                                    p005a5.C1366p c1366p11116 = d10.f13296d;
                                    c1378q1.f14965h = d10;
                                    c1378q1.f14966i = strA4;
                                    c1378q1.j = list;
                                    c1378q1.f14967k = list2;
                                    c1378q1.f14968l = list3;
                                    c1378q1.f14969m = list4;
                                    c1378q1.f14970n = list5;
                                    c1378q1.f14971o = list14;
                                    c1378q1.f14976t = 7;
                                    c1366p11116.getClass();
                                    list7 = list;
                                    list8 = list2;
                                    list9 = list3;
                                    list10 = list4;
                                    list11 = list14;
                                    list12 = list5;
                                    objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p11116, null), c1378q1);
                                    if (objK != p109m6.a.f25430h) {
                                        objK = a2;
                                    }
                                    if (objK != aVar) {
                                        str12 = strA4;
                                        str13 = null;
                                        d11 = d10;
                                        list13 = list12;
                                        R4.c.b(str12, str13);
                                        size = list8.size();
                                        size2 = list10.size();
                                        size3 = list11.size();
                                        size4 = list13.size() + list9.size() + list7.size();
                                        n0Var = R4.c.f9052a;
                                        do {
                                            value = n0Var.getValue();
                                        } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                        java.util.Set set11114 = p015b5.AbstractC1664a.f17935a;
                                        int size1111111113 = list8.size();
                                        int size1111111114 = list10.size();
                                        int size1111111115 = list11.size();
                                        int size1111111116 = list13.size() + list9.size() + list7.size();
                                        int iD113 = d11.f13303m.d();
                                        java.lang.Runtime runtime1116 = java.lang.Runtime.getRuntime();
                                        long jMaxMemory1116 = runtime1116.maxMemory();
                                        long jFreeMemory1116 = runtime1116.totalMemory() - runtime1116.freeMemory();
                                        long j11114 = 1048576;
                                        P4.a aVar116 = new P4.a((int) (jFreeMemory1116 / j11114), (int) ((jMaxMemory1116 - jFreeMemory1116) / j11114), (int) (jMaxMemory1116 / j11114));
                                        java.lang.StringBuilder sbS113 = p121o0.p.s(size1111111113, size1111111114, "load_completed movies=", " series=", " live=");
                                        Y6.f.w(sbS113, size1111111115, " categories=", size1111111116, " epgPrograms=");
                                        sbS113.append(iD113);
                                        sbS113.append(str);
                                        sbS113.append(aVar116);
                                        p015b5.AbstractC1664a.a(sbS113.toString(), str3);
                                        p015b5.AbstractC1664a.d(str2, null);
                                        return a2;
                                    }
                                }
                            } else {
                                V7.n0 n0Var1111119 = R4.c.f9052a;
                                strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                if (list == null) {
                                    list = list14;
                                }
                                list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                if (list2 == null) {
                                    list2 = list14;
                                }
                                list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                if (list3 == null) {
                                    list3 = list14;
                                }
                                list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                if (list4 == null) {
                                    list4 = list14;
                                }
                                list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                if (list5 == null) {
                                    list5 = list14;
                                }
                                list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                if (list6 != null) {
                                    list14 = list6;
                                }
                                p005a5.C1366p c1366p11117 = d10.f13296d;
                                java.lang.String id114 = playlist3.f20033a;
                                c1366p11117.getClass();
                                kotlin.jvm.internal.m.e(id114, "id");
                                V7.n0 n0Var11111110 = c1366p11117.f14907a;
                                n0Var11111110.getClass();
                                n0Var11111110.i(null, id114);
                                p005a5.C1366p c1366p11118 = d10.f13296d;
                                c1378q1.f14965h = d10;
                                c1378q1.f14966i = strA4;
                                c1378q1.j = list;
                                c1378q1.f14967k = list2;
                                c1378q1.f14968l = list3;
                                c1378q1.f14969m = list4;
                                c1378q1.f14970n = list5;
                                c1378q1.f14971o = list14;
                                c1378q1.f14976t = 7;
                                c1366p11118.getClass();
                                list7 = list;
                                list8 = list2;
                                list9 = list3;
                                list10 = list4;
                                list11 = list14;
                                list12 = list5;
                                objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p11118, null), c1378q1);
                                if (objK != p109m6.a.f25430h) {
                                    objK = a2;
                                }
                                if (objK != aVar) {
                                    str12 = strA4;
                                    str13 = null;
                                    d11 = d10;
                                    list13 = list12;
                                    R4.c.b(str12, str13);
                                    size = list8.size();
                                    size2 = list10.size();
                                    size3 = list11.size();
                                    size4 = list13.size() + list9.size() + list7.size();
                                    n0Var = R4.c.f9052a;
                                    do {
                                        value = n0Var.getValue();
                                    } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                    java.util.Set set11115 = p015b5.AbstractC1664a.f17935a;
                                    int size1111111117 = list8.size();
                                    int size1111111118 = list10.size();
                                    int size1111111119 = list11.size();
                                    int size11111111110 = list13.size() + list9.size() + list7.size();
                                    int iD114 = d11.f13303m.d();
                                    java.lang.Runtime runtime1117 = java.lang.Runtime.getRuntime();
                                    long jMaxMemory1117 = runtime1117.maxMemory();
                                    long jFreeMemory1117 = runtime1117.totalMemory() - runtime1117.freeMemory();
                                    long j11115 = 1048576;
                                    P4.a aVar117 = new P4.a((int) (jFreeMemory1117 / j11115), (int) ((jMaxMemory1117 - jFreeMemory1117) / j11115), (int) (jMaxMemory1117 / j11115));
                                    java.lang.StringBuilder sbS114 = p121o0.p.s(size1111111117, size1111111118, "load_completed movies=", " series=", " live=");
                                    Y6.f.w(sbS114, size1111111119, " categories=", size11111111110, " epgPrograms=");
                                    sbS114.append(iD114);
                                    sbS114.append(str);
                                    sbS114.append(aVar117);
                                    p015b5.AbstractC1664a.a(sbS114.toString(), str3);
                                    p015b5.AbstractC1664a.d(str2, null);
                                    return a2;
                                }
                            }
                        }
                    }
                } else {
                    playlist3 = playlist2;
                    bVar = P4.c.f8139b;
                    if (bVar != null) {
                        z12 = bVar.f8137e;
                    } else {
                        z12 = false;
                    }
                    if (i11 != 0) {
                        z13 = i3;
                    } else {
                        z13 = 0;
                    }
                    c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                    z14 = z12;
                    c1378q1.f14965h = d9;
                    c1378q1.f14966i = playlist3;
                    c1378q1.j = null;
                    c1378q1.f14972p = z14;
                    c1378q1.f14976t = 5;
                    if (S7.C.m(c1397s1, c1378q1) != aVar) {
                        d10 = d9;
                        if (z14) {
                            java.util.Set set11116 = p015b5.AbstractC1664a.f17935a;
                            java.lang.Runtime runtime1118 = java.lang.Runtime.getRuntime();
                            long jMaxMemory1118 = runtime1118.maxMemory();
                            long jFreeMemory1118 = runtime1118.totalMemory() - runtime1118.freeMemory();
                            long j11116 = 1048576;
                            p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory1118 / j11116), (int) ((jMaxMemory1118 - jFreeMemory1118) / j11116), (int) (jMaxMemory1118 / j11116)), str3);
                            c1378q1.f14965h = d10;
                            c1378q1.f14966i = playlist3;
                            c1378q1.f14976t = 6;
                            if (d10.e(playlist3, c1378q1) != aVar) {
                                playlist5 = playlist3;
                                playlist3 = playlist5;
                                V7.n0 n0Var11111111 = R4.c.f9052a;
                                strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                if (list == null) {
                                    list = list14;
                                }
                                list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                if (list2 == null) {
                                    list2 = list14;
                                }
                                list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                if (list3 == null) {
                                    list3 = list14;
                                }
                                list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                if (list4 == null) {
                                    list4 = list14;
                                }
                                list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                if (list5 == null) {
                                    list5 = list14;
                                }
                                list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                if (list6 != null) {
                                    list14 = list6;
                                }
                                p005a5.C1366p c1366p11119 = d10.f13296d;
                                java.lang.String id115 = playlist3.f20033a;
                                c1366p11119.getClass();
                                kotlin.jvm.internal.m.e(id115, "id");
                                V7.n0 n0Var11111112 = c1366p11119.f14907a;
                                n0Var11111112.getClass();
                                n0Var11111112.i(null, id115);
                                p005a5.C1366p c1366p111110 = d10.f13296d;
                                c1378q1.f14965h = d10;
                                c1378q1.f14966i = strA4;
                                c1378q1.j = list;
                                c1378q1.f14967k = list2;
                                c1378q1.f14968l = list3;
                                c1378q1.f14969m = list4;
                                c1378q1.f14970n = list5;
                                c1378q1.f14971o = list14;
                                c1378q1.f14976t = 7;
                                c1366p111110.getClass();
                                list7 = list;
                                list8 = list2;
                                list9 = list3;
                                list10 = list4;
                                list11 = list14;
                                list12 = list5;
                                objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p111110, null), c1378q1);
                                if (objK != p109m6.a.f25430h) {
                                    objK = a2;
                                }
                                if (objK != aVar) {
                                    str12 = strA4;
                                    str13 = null;
                                    d11 = d10;
                                    list13 = list12;
                                    R4.c.b(str12, str13);
                                    size = list8.size();
                                    size2 = list10.size();
                                    size3 = list11.size();
                                    size4 = list13.size() + list9.size() + list7.size();
                                    n0Var = R4.c.f9052a;
                                    do {
                                        value = n0Var.getValue();
                                    } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                    java.util.Set set11117 = p015b5.AbstractC1664a.f17935a;
                                    int size11111111111 = list8.size();
                                    int size11111111112 = list10.size();
                                    int size11111111113 = list11.size();
                                    int size11111111114 = list13.size() + list9.size() + list7.size();
                                    int iD115 = d11.f13303m.d();
                                    java.lang.Runtime runtime1119 = java.lang.Runtime.getRuntime();
                                    long jMaxMemory1119 = runtime1119.maxMemory();
                                    long jFreeMemory1119 = runtime1119.totalMemory() - runtime1119.freeMemory();
                                    long j11117 = 1048576;
                                    P4.a aVar118 = new P4.a((int) (jFreeMemory1119 / j11117), (int) ((jMaxMemory1119 - jFreeMemory1119) / j11117), (int) (jMaxMemory1119 / j11117));
                                    java.lang.StringBuilder sbS115 = p121o0.p.s(size11111111111, size11111111112, "load_completed movies=", " series=", " live=");
                                    Y6.f.w(sbS115, size11111111113, " categories=", size11111111114, " epgPrograms=");
                                    sbS115.append(iD115);
                                    sbS115.append(str);
                                    sbS115.append(aVar118);
                                    p015b5.AbstractC1664a.a(sbS115.toString(), str3);
                                    p015b5.AbstractC1664a.d(str2, null);
                                    return a2;
                                }
                            }
                        } else {
                            V7.n0 n0Var11111113 = R4.c.f9052a;
                            strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                            list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                            if (list == null) {
                                list = list14;
                            }
                            list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                            if (list2 == null) {
                                list2 = list14;
                            }
                            list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                            if (list3 == null) {
                                list3 = list14;
                            }
                            list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                            if (list4 == null) {
                                list4 = list14;
                            }
                            list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                            if (list5 == null) {
                                list5 = list14;
                            }
                            list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                            if (list6 != null) {
                                list14 = list6;
                            }
                            p005a5.C1366p c1366p111111 = d10.f13296d;
                            java.lang.String id116 = playlist3.f20033a;
                            c1366p111111.getClass();
                            kotlin.jvm.internal.m.e(id116, "id");
                            V7.n0 n0Var11111114 = c1366p111111.f14907a;
                            n0Var11111114.getClass();
                            n0Var11111114.i(null, id116);
                            p005a5.C1366p c1366p111112 = d10.f13296d;
                            c1378q1.f14965h = d10;
                            c1378q1.f14966i = strA4;
                            c1378q1.j = list;
                            c1378q1.f14967k = list2;
                            c1378q1.f14968l = list3;
                            c1378q1.f14969m = list4;
                            c1378q1.f14970n = list5;
                            c1378q1.f14971o = list14;
                            c1378q1.f14976t = 7;
                            c1366p111112.getClass();
                            list7 = list;
                            list8 = list2;
                            list9 = list3;
                            list10 = list4;
                            list11 = list14;
                            list12 = list5;
                            objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p111112, null), c1378q1);
                            if (objK != p109m6.a.f25430h) {
                                objK = a2;
                            }
                            if (objK != aVar) {
                                str12 = strA4;
                                str13 = null;
                                d11 = d10;
                                list13 = list12;
                                R4.c.b(str12, str13);
                                size = list8.size();
                                size2 = list10.size();
                                size3 = list11.size();
                                size4 = list13.size() + list9.size() + list7.size();
                                n0Var = R4.c.f9052a;
                                do {
                                    value = n0Var.getValue();
                                } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                java.util.Set set11118 = p015b5.AbstractC1664a.f17935a;
                                int size11111111115 = list8.size();
                                int size11111111116 = list10.size();
                                int size11111111117 = list11.size();
                                int size11111111118 = list13.size() + list9.size() + list7.size();
                                int iD116 = d11.f13303m.d();
                                java.lang.Runtime runtime11110 = java.lang.Runtime.getRuntime();
                                long jMaxMemory11110 = runtime11110.maxMemory();
                                long jFreeMemory11110 = runtime11110.totalMemory() - runtime11110.freeMemory();
                                long j11118 = 1048576;
                                P4.a aVar119 = new P4.a((int) (jFreeMemory11110 / j11118), (int) ((jMaxMemory11110 - jFreeMemory11110) / j11118), (int) (jMaxMemory11110 / j11118));
                                java.lang.StringBuilder sbS116 = p121o0.p.s(size11111111115, size11111111116, "load_completed movies=", " series=", " live=");
                                Y6.f.w(sbS116, size11111111117, " categories=", size11111111118, " epgPrograms=");
                                sbS116.append(iD116);
                                sbS116.append(str);
                                sbS116.append(aVar119);
                                p015b5.AbstractC1664a.a(sbS116.toString(), str3);
                                p015b5.AbstractC1664a.d(str2, null);
                                return a2;
                            }
                        }
                    }
                }
                return aVar;
            case 4:
                i12 = c1378q1.f14973q;
                str10 = (java.lang.String) c1378q1.j;
                com.kiptv.core.model.Playlist playlist6 = (com.kiptv.core.model.Playlist) c1378q1.f14966i;
                d9 = c1378q1.f14965h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                    aVar = aVar2;
                    str = " heap=";
                    playlist4 = playlist6;
                    a2 = a9;
                    str2 = "operation";
                    i3 = 1;
                    str3 = "playlist";
                    zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                    break;
                } catch (java.lang.Exception e13) {
                    e = e13;
                    aVar = aVar2;
                    str = " heap=";
                    playlist4 = playlist6;
                    a2 = a9;
                    str2 = "operation";
                    i3 = 1;
                    str3 = "playlist";
                    Y6.f.u(e, "healthCheck threw: ", "PlaylistContentLoader");
                    zBooleanValue2 = false;
                    i11 = i12;
                    if (!zBooleanValue2) {
                        V7.n0 n0Var11111115 = R4.c.f9052a;
                        R4.c.c(str10, "unreachable");
                        throw new java.lang.IllegalStateException("Server unreachable");
                    }
                    V7.n0 n0Var11111116 = R4.c.f9052a;
                    R4.c.b(str10, "ok");
                    playlist3 = playlist4;
                    bVar = P4.c.f8139b;
                    if (bVar != null) {
                        z12 = bVar.f8137e;
                    } else {
                        z12 = false;
                    }
                    if (i11 != 0) {
                        z13 = i3;
                    } else {
                        z13 = 0;
                    }
                    c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                    z14 = z12;
                    c1378q1.f14965h = d9;
                    c1378q1.f14966i = playlist3;
                    c1378q1.j = null;
                    c1378q1.f14972p = z14;
                    c1378q1.f14976t = 5;
                    if (S7.C.m(c1397s1, c1378q1) != aVar) {
                        d10 = d9;
                        if (z14) {
                            java.util.Set set11119 = p015b5.AbstractC1664a.f17935a;
                            java.lang.Runtime runtime11111 = java.lang.Runtime.getRuntime();
                            long jMaxMemory11111 = runtime11111.maxMemory();
                            long jFreeMemory11111 = runtime11111.totalMemory() - runtime11111.freeMemory();
                            long j11119 = 1048576;
                            p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory11111 / j11119), (int) ((jMaxMemory11111 - jFreeMemory11111) / j11119), (int) (jMaxMemory11111 / j11119)), str3);
                            c1378q1.f14965h = d10;
                            c1378q1.f14966i = playlist3;
                            c1378q1.f14976t = 6;
                            if (d10.e(playlist3, c1378q1) != aVar) {
                                playlist5 = playlist3;
                                playlist3 = playlist5;
                                V7.n0 n0Var11111117 = R4.c.f9052a;
                                strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                                list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                                if (list == null) {
                                    list = list14;
                                }
                                list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                                if (list2 == null) {
                                    list2 = list14;
                                }
                                list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                                if (list3 == null) {
                                    list3 = list14;
                                }
                                list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                                if (list4 == null) {
                                    list4 = list14;
                                }
                                list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                                if (list5 == null) {
                                    list5 = list14;
                                }
                                list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                                if (list6 != null) {
                                    list14 = list6;
                                }
                                p005a5.C1366p c1366p111113 = d10.f13296d;
                                java.lang.String id117 = playlist3.f20033a;
                                c1366p111113.getClass();
                                kotlin.jvm.internal.m.e(id117, "id");
                                V7.n0 n0Var11111118 = c1366p111113.f14907a;
                                n0Var11111118.getClass();
                                n0Var11111118.i(null, id117);
                                p005a5.C1366p c1366p111114 = d10.f13296d;
                                c1378q1.f14965h = d10;
                                c1378q1.f14966i = strA4;
                                c1378q1.j = list;
                                c1378q1.f14967k = list2;
                                c1378q1.f14968l = list3;
                                c1378q1.f14969m = list4;
                                c1378q1.f14970n = list5;
                                c1378q1.f14971o = list14;
                                c1378q1.f14976t = 7;
                                c1366p111114.getClass();
                                list7 = list;
                                list8 = list2;
                                list9 = list3;
                                list10 = list4;
                                list11 = list14;
                                list12 = list5;
                                objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p111114, null), c1378q1);
                                if (objK != p109m6.a.f25430h) {
                                    objK = a2;
                                }
                                if (objK != aVar) {
                                    str12 = strA4;
                                    str13 = null;
                                    d11 = d10;
                                    list13 = list12;
                                    R4.c.b(str12, str13);
                                    size = list8.size();
                                    size2 = list10.size();
                                    size3 = list11.size();
                                    size4 = list13.size() + list9.size() + list7.size();
                                    n0Var = R4.c.f9052a;
                                    do {
                                        value = n0Var.getValue();
                                    } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                    java.util.Set set111110 = p015b5.AbstractC1664a.f17935a;
                                    int size11111111119 = list8.size();
                                    int size111111111110 = list10.size();
                                    int size111111111111 = list11.size();
                                    int size111111111112 = list13.size() + list9.size() + list7.size();
                                    int iD117 = d11.f13303m.d();
                                    java.lang.Runtime runtime11112 = java.lang.Runtime.getRuntime();
                                    long jMaxMemory11112 = runtime11112.maxMemory();
                                    long jFreeMemory11112 = runtime11112.totalMemory() - runtime11112.freeMemory();
                                    long j111110 = 1048576;
                                    P4.a aVar1110 = new P4.a((int) (jFreeMemory11112 / j111110), (int) ((jMaxMemory11112 - jFreeMemory11112) / j111110), (int) (jMaxMemory11112 / j111110));
                                    java.lang.StringBuilder sbS117 = p121o0.p.s(size11111111119, size111111111110, "load_completed movies=", " series=", " live=");
                                    Y6.f.w(sbS117, size111111111111, " categories=", size111111111112, " epgPrograms=");
                                    sbS117.append(iD117);
                                    sbS117.append(str);
                                    sbS117.append(aVar1110);
                                    p015b5.AbstractC1664a.a(sbS117.toString(), str3);
                                    p015b5.AbstractC1664a.d(str2, null);
                                    return a2;
                                }
                            }
                        } else {
                            V7.n0 n0Var11111119 = R4.c.f9052a;
                            strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                            list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                            if (list == null) {
                                list = list14;
                            }
                            list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                            if (list2 == null) {
                                list2 = list14;
                            }
                            list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                            if (list3 == null) {
                                list3 = list14;
                            }
                            list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                            if (list4 == null) {
                                list4 = list14;
                            }
                            list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                            if (list5 == null) {
                                list5 = list14;
                            }
                            list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                            if (list6 != null) {
                                list14 = list6;
                            }
                            p005a5.C1366p c1366p111115 = d10.f13296d;
                            java.lang.String id118 = playlist3.f20033a;
                            c1366p111115.getClass();
                            kotlin.jvm.internal.m.e(id118, "id");
                            V7.n0 n0Var111111110 = c1366p111115.f14907a;
                            n0Var111111110.getClass();
                            n0Var111111110.i(null, id118);
                            p005a5.C1366p c1366p111116 = d10.f13296d;
                            c1378q1.f14965h = d10;
                            c1378q1.f14966i = strA4;
                            c1378q1.j = list;
                            c1378q1.f14967k = list2;
                            c1378q1.f14968l = list3;
                            c1378q1.f14969m = list4;
                            c1378q1.f14970n = list5;
                            c1378q1.f14971o = list14;
                            c1378q1.f14976t = 7;
                            c1366p111116.getClass();
                            list7 = list;
                            list8 = list2;
                            list9 = list3;
                            list10 = list4;
                            list11 = list14;
                            list12 = list5;
                            objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p111116, null), c1378q1);
                            if (objK != p109m6.a.f25430h) {
                                objK = a2;
                            }
                            if (objK != aVar) {
                                str12 = strA4;
                                str13 = null;
                                d11 = d10;
                                list13 = list12;
                                R4.c.b(str12, str13);
                                size = list8.size();
                                size2 = list10.size();
                                size3 = list11.size();
                                size4 = list13.size() + list9.size() + list7.size();
                                n0Var = R4.c.f9052a;
                                do {
                                    value = n0Var.getValue();
                                } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                java.util.Set set111111 = p015b5.AbstractC1664a.f17935a;
                                int size111111111113 = list8.size();
                                int size111111111114 = list10.size();
                                int size111111111115 = list11.size();
                                int size111111111116 = list13.size() + list9.size() + list7.size();
                                int iD118 = d11.f13303m.d();
                                java.lang.Runtime runtime11113 = java.lang.Runtime.getRuntime();
                                long jMaxMemory11113 = runtime11113.maxMemory();
                                long jFreeMemory11113 = runtime11113.totalMemory() - runtime11113.freeMemory();
                                long j111111 = 1048576;
                                P4.a aVar1111 = new P4.a((int) (jFreeMemory11113 / j111111), (int) ((jMaxMemory11113 - jFreeMemory11113) / j111111), (int) (jMaxMemory11113 / j111111));
                                java.lang.StringBuilder sbS118 = p121o0.p.s(size111111111113, size111111111114, "load_completed movies=", " series=", " live=");
                                Y6.f.w(sbS118, size111111111115, " categories=", size111111111116, " epgPrograms=");
                                sbS118.append(iD118);
                                sbS118.append(str);
                                sbS118.append(aVar1111);
                                p015b5.AbstractC1664a.a(sbS118.toString(), str3);
                                p015b5.AbstractC1664a.d(str2, null);
                                return a2;
                            }
                        }
                    }
                    return aVar;
                }
                i11 = i12;
                if (!zBooleanValue2) {
                    V7.n0 n0Var111111111 = R4.c.f9052a;
                    R4.c.c(str10, "unreachable");
                    throw new java.lang.IllegalStateException("Server unreachable");
                }
                V7.n0 n0Var111111112 = R4.c.f9052a;
                R4.c.b(str10, "ok");
                playlist3 = playlist4;
                bVar = P4.c.f8139b;
                if (bVar != null) {
                    z12 = bVar.f8137e;
                } else {
                    z12 = false;
                }
                if (i11 != 0) {
                    z13 = i3;
                } else {
                    z13 = 0;
                }
                c1397s1 = new p005a5.C1397s1(z13, d9, playlist3, z12, null);
                z14 = z12;
                c1378q1.f14965h = d9;
                c1378q1.f14966i = playlist3;
                c1378q1.j = null;
                c1378q1.f14972p = z14;
                c1378q1.f14976t = 5;
                if (S7.C.m(c1397s1, c1378q1) != aVar) {
                    d10 = d9;
                    if (z14) {
                        java.util.Set set111112 = p015b5.AbstractC1664a.f17935a;
                        java.lang.Runtime runtime11114 = java.lang.Runtime.getRuntime();
                        long jMaxMemory11114 = runtime11114.maxMemory();
                        long jFreeMemory11114 = runtime11114.totalMemory() - runtime11114.freeMemory();
                        long j111112 = 1048576;
                        p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory11114 / j111112), (int) ((jMaxMemory11114 - jFreeMemory11114) / j111112), (int) (jMaxMemory11114 / j111112)), str3);
                        c1378q1.f14965h = d10;
                        c1378q1.f14966i = playlist3;
                        c1378q1.f14976t = 6;
                        if (d10.e(playlist3, c1378q1) != aVar) {
                            playlist5 = playlist3;
                            playlist3 = playlist5;
                            V7.n0 n0Var111111113 = R4.c.f9052a;
                            strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                            list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                            if (list == null) {
                                list = list14;
                            }
                            list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                            if (list2 == null) {
                                list2 = list14;
                            }
                            list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                            if (list3 == null) {
                                list3 = list14;
                            }
                            list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                            if (list4 == null) {
                                list4 = list14;
                            }
                            list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                            if (list5 == null) {
                                list5 = list14;
                            }
                            list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                            if (list6 != null) {
                                list14 = list6;
                            }
                            p005a5.C1366p c1366p111117 = d10.f13296d;
                            java.lang.String id119 = playlist3.f20033a;
                            c1366p111117.getClass();
                            kotlin.jvm.internal.m.e(id119, "id");
                            V7.n0 n0Var111111114 = c1366p111117.f14907a;
                            n0Var111111114.getClass();
                            n0Var111111114.i(null, id119);
                            p005a5.C1366p c1366p111118 = d10.f13296d;
                            c1378q1.f14965h = d10;
                            c1378q1.f14966i = strA4;
                            c1378q1.j = list;
                            c1378q1.f14967k = list2;
                            c1378q1.f14968l = list3;
                            c1378q1.f14969m = list4;
                            c1378q1.f14970n = list5;
                            c1378q1.f14971o = list14;
                            c1378q1.f14976t = 7;
                            c1366p111118.getClass();
                            list7 = list;
                            list8 = list2;
                            list9 = list3;
                            list10 = list4;
                            list11 = list14;
                            list12 = list5;
                            objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p111118, null), c1378q1);
                            if (objK != p109m6.a.f25430h) {
                                objK = a2;
                            }
                            if (objK != aVar) {
                                str12 = strA4;
                                str13 = null;
                                d11 = d10;
                                list13 = list12;
                                R4.c.b(str12, str13);
                                size = list8.size();
                                size2 = list10.size();
                                size3 = list11.size();
                                size4 = list13.size() + list9.size() + list7.size();
                                n0Var = R4.c.f9052a;
                                do {
                                    value = n0Var.getValue();
                                } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                                java.util.Set set111113 = p015b5.AbstractC1664a.f17935a;
                                int size111111111117 = list8.size();
                                int size111111111118 = list10.size();
                                int size111111111119 = list11.size();
                                int size1111111111110 = list13.size() + list9.size() + list7.size();
                                int iD119 = d11.f13303m.d();
                                java.lang.Runtime runtime11115 = java.lang.Runtime.getRuntime();
                                long jMaxMemory11115 = runtime11115.maxMemory();
                                long jFreeMemory11115 = runtime11115.totalMemory() - runtime11115.freeMemory();
                                long j111113 = 1048576;
                                P4.a aVar1112 = new P4.a((int) (jFreeMemory11115 / j111113), (int) ((jMaxMemory11115 - jFreeMemory11115) / j111113), (int) (jMaxMemory11115 / j111113));
                                java.lang.StringBuilder sbS119 = p121o0.p.s(size111111111117, size111111111118, "load_completed movies=", " series=", " live=");
                                Y6.f.w(sbS119, size111111111119, " categories=", size1111111111110, " epgPrograms=");
                                sbS119.append(iD119);
                                sbS119.append(str);
                                sbS119.append(aVar1112);
                                p015b5.AbstractC1664a.a(sbS119.toString(), str3);
                                p015b5.AbstractC1664a.d(str2, null);
                                return a2;
                            }
                        }
                    } else {
                        V7.n0 n0Var111111115 = R4.c.f9052a;
                        strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                        list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                        if (list == null) {
                            list = list14;
                        }
                        list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                        if (list2 == null) {
                            list2 = list14;
                        }
                        list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                        if (list3 == null) {
                            list3 = list14;
                        }
                        list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                        if (list4 == null) {
                            list4 = list14;
                        }
                        list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                        if (list5 == null) {
                            list5 = list14;
                        }
                        list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                        if (list6 != null) {
                            list14 = list6;
                        }
                        p005a5.C1366p c1366p111119 = d10.f13296d;
                        java.lang.String id1110 = playlist3.f20033a;
                        c1366p111119.getClass();
                        kotlin.jvm.internal.m.e(id1110, "id");
                        V7.n0 n0Var111111116 = c1366p111119.f14907a;
                        n0Var111111116.getClass();
                        n0Var111111116.i(null, id1110);
                        p005a5.C1366p c1366p1111110 = d10.f13296d;
                        c1378q1.f14965h = d10;
                        c1378q1.f14966i = strA4;
                        c1378q1.j = list;
                        c1378q1.f14967k = list2;
                        c1378q1.f14968l = list3;
                        c1378q1.f14969m = list4;
                        c1378q1.f14970n = list5;
                        c1378q1.f14971o = list14;
                        c1378q1.f14976t = 7;
                        c1366p1111110.getClass();
                        list7 = list;
                        list8 = list2;
                        list9 = list3;
                        list10 = list4;
                        list11 = list14;
                        list12 = list5;
                        objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p1111110, null), c1378q1);
                        if (objK != p109m6.a.f25430h) {
                            objK = a2;
                        }
                        if (objK != aVar) {
                            str12 = strA4;
                            str13 = null;
                            d11 = d10;
                            list13 = list12;
                            R4.c.b(str12, str13);
                            size = list8.size();
                            size2 = list10.size();
                            size3 = list11.size();
                            size4 = list13.size() + list9.size() + list7.size();
                            n0Var = R4.c.f9052a;
                            do {
                                value = n0Var.getValue();
                            } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                            java.util.Set set111114 = p015b5.AbstractC1664a.f17935a;
                            int size1111111111111 = list8.size();
                            int size1111111111112 = list10.size();
                            int size1111111111113 = list11.size();
                            int size1111111111114 = list13.size() + list9.size() + list7.size();
                            int iD1110 = d11.f13303m.d();
                            java.lang.Runtime runtime11116 = java.lang.Runtime.getRuntime();
                            long jMaxMemory11116 = runtime11116.maxMemory();
                            long jFreeMemory11116 = runtime11116.totalMemory() - runtime11116.freeMemory();
                            long j111114 = 1048576;
                            P4.a aVar1113 = new P4.a((int) (jFreeMemory11116 / j111114), (int) ((jMaxMemory11116 - jFreeMemory11116) / j111114), (int) (jMaxMemory11116 / j111114));
                            java.lang.StringBuilder sbS1110 = p121o0.p.s(size1111111111111, size1111111111112, "load_completed movies=", " series=", " live=");
                            Y6.f.w(sbS1110, size1111111111113, " categories=", size1111111111114, " epgPrograms=");
                            sbS1110.append(iD1110);
                            sbS1110.append(str);
                            sbS1110.append(aVar1113);
                            p015b5.AbstractC1664a.a(sbS1110.toString(), str3);
                            p015b5.AbstractC1664a.d(str2, null);
                            return a2;
                        }
                    }
                }
                return aVar;
            case 5:
                z14 = c1378q1.f14972p;
                com.kiptv.core.model.Playlist playlist7 = (com.kiptv.core.model.Playlist) c1378q1.f14966i;
                p005a5.D1 d16 = c1378q1.f14965h;
                com.google.common.util.concurrent.P.u0(obj);
                aVar = aVar2;
                str = " heap=";
                a2 = a9;
                str2 = "operation";
                str3 = "playlist";
                playlist3 = playlist7;
                d10 = d16;
                if (z14) {
                    java.util.Set set111115 = p015b5.AbstractC1664a.f17935a;
                    java.lang.Runtime runtime11117 = java.lang.Runtime.getRuntime();
                    long jMaxMemory11117 = runtime11117.maxMemory();
                    long jFreeMemory11117 = runtime11117.totalMemory() - runtime11117.freeMemory();
                    long j111115 = 1048576;
                    p015b5.AbstractC1664a.a("xmltv_deferred_start heap=" + new P4.a((int) (jFreeMemory11117 / j111115), (int) ((jMaxMemory11117 - jFreeMemory11117) / j111115), (int) (jMaxMemory11117 / j111115)), str3);
                    c1378q1.f14965h = d10;
                    c1378q1.f14966i = playlist3;
                    c1378q1.f14976t = 6;
                    if (d10.e(playlist3, c1378q1) != aVar) {
                        playlist5 = playlist3;
                        playlist3 = playlist5;
                        V7.n0 n0Var111111117 = R4.c.f9052a;
                        strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                        list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                        if (list == null) {
                            list = list14;
                        }
                        list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                        if (list2 == null) {
                            list2 = list14;
                        }
                        list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                        if (list3 == null) {
                            list3 = list14;
                        }
                        list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                        if (list4 == null) {
                            list4 = list14;
                        }
                        list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                        if (list5 == null) {
                            list5 = list14;
                        }
                        list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                        if (list6 != null) {
                            list14 = list6;
                        }
                        p005a5.C1366p c1366p1111111 = d10.f13296d;
                        java.lang.String id1111 = playlist3.f20033a;
                        c1366p1111111.getClass();
                        kotlin.jvm.internal.m.e(id1111, "id");
                        V7.n0 n0Var111111118 = c1366p1111111.f14907a;
                        n0Var111111118.getClass();
                        n0Var111111118.i(null, id1111);
                        p005a5.C1366p c1366p1111112 = d10.f13296d;
                        c1378q1.f14965h = d10;
                        c1378q1.f14966i = strA4;
                        c1378q1.j = list;
                        c1378q1.f14967k = list2;
                        c1378q1.f14968l = list3;
                        c1378q1.f14969m = list4;
                        c1378q1.f14970n = list5;
                        c1378q1.f14971o = list14;
                        c1378q1.f14976t = 7;
                        c1366p1111112.getClass();
                        list7 = list;
                        list8 = list2;
                        list9 = list3;
                        list10 = list4;
                        list11 = list14;
                        list12 = list5;
                        objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p1111112, null), c1378q1);
                        if (objK != p109m6.a.f25430h) {
                            objK = a2;
                        }
                        if (objK != aVar) {
                            str12 = strA4;
                            str13 = null;
                            d11 = d10;
                            list13 = list12;
                            R4.c.b(str12, str13);
                            size = list8.size();
                            size2 = list10.size();
                            size3 = list11.size();
                            size4 = list13.size() + list9.size() + list7.size();
                            n0Var = R4.c.f9052a;
                            do {
                                value = n0Var.getValue();
                            } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                            java.util.Set set111116 = p015b5.AbstractC1664a.f17935a;
                            int size1111111111115 = list8.size();
                            int size1111111111116 = list10.size();
                            int size1111111111117 = list11.size();
                            int size1111111111118 = list13.size() + list9.size() + list7.size();
                            int iD1111 = d11.f13303m.d();
                            java.lang.Runtime runtime11118 = java.lang.Runtime.getRuntime();
                            long jMaxMemory11118 = runtime11118.maxMemory();
                            long jFreeMemory11118 = runtime11118.totalMemory() - runtime11118.freeMemory();
                            long j111116 = 1048576;
                            P4.a aVar1114 = new P4.a((int) (jFreeMemory11118 / j111116), (int) ((jMaxMemory11118 - jFreeMemory11118) / j111116), (int) (jMaxMemory11118 / j111116));
                            java.lang.StringBuilder sbS1111 = p121o0.p.s(size1111111111115, size1111111111116, "load_completed movies=", " series=", " live=");
                            Y6.f.w(sbS1111, size1111111111117, " categories=", size1111111111118, " epgPrograms=");
                            sbS1111.append(iD1111);
                            sbS1111.append(str);
                            sbS1111.append(aVar1114);
                            p015b5.AbstractC1664a.a(sbS1111.toString(), str3);
                            p015b5.AbstractC1664a.d(str2, null);
                            return a2;
                        }
                    }
                } else {
                    V7.n0 n0Var111111119 = R4.c.f9052a;
                    strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                    list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                    if (list == null) {
                        list = list14;
                    }
                    list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                    if (list2 == null) {
                        list2 = list14;
                    }
                    list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                    if (list3 == null) {
                        list3 = list14;
                    }
                    list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                    if (list4 == null) {
                        list4 = list14;
                    }
                    list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                    if (list5 == null) {
                        list5 = list14;
                    }
                    list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                    if (list6 != null) {
                        list14 = list6;
                    }
                    p005a5.C1366p c1366p1111113 = d10.f13296d;
                    java.lang.String id1112 = playlist3.f20033a;
                    c1366p1111113.getClass();
                    kotlin.jvm.internal.m.e(id1112, "id");
                    V7.n0 n0Var1111111110 = c1366p1111113.f14907a;
                    n0Var1111111110.getClass();
                    n0Var1111111110.i(null, id1112);
                    p005a5.C1366p c1366p1111114 = d10.f13296d;
                    c1378q1.f14965h = d10;
                    c1378q1.f14966i = strA4;
                    c1378q1.j = list;
                    c1378q1.f14967k = list2;
                    c1378q1.f14968l = list3;
                    c1378q1.f14969m = list4;
                    c1378q1.f14970n = list5;
                    c1378q1.f14971o = list14;
                    c1378q1.f14976t = 7;
                    c1366p1111114.getClass();
                    list7 = list;
                    list8 = list2;
                    list9 = list3;
                    list10 = list4;
                    list11 = list14;
                    list12 = list5;
                    objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p1111114, null), c1378q1);
                    if (objK != p109m6.a.f25430h) {
                        objK = a2;
                    }
                    if (objK != aVar) {
                        str12 = strA4;
                        str13 = null;
                        d11 = d10;
                        list13 = list12;
                        R4.c.b(str12, str13);
                        size = list8.size();
                        size2 = list10.size();
                        size3 = list11.size();
                        size4 = list13.size() + list9.size() + list7.size();
                        n0Var = R4.c.f9052a;
                        do {
                            value = n0Var.getValue();
                        } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                        java.util.Set set111117 = p015b5.AbstractC1664a.f17935a;
                        int size1111111111119 = list8.size();
                        int size11111111111110 = list10.size();
                        int size11111111111111 = list11.size();
                        int size11111111111112 = list13.size() + list9.size() + list7.size();
                        int iD1112 = d11.f13303m.d();
                        java.lang.Runtime runtime11119 = java.lang.Runtime.getRuntime();
                        long jMaxMemory11119 = runtime11119.maxMemory();
                        long jFreeMemory11119 = runtime11119.totalMemory() - runtime11119.freeMemory();
                        long j111117 = 1048576;
                        P4.a aVar1115 = new P4.a((int) (jFreeMemory11119 / j111117), (int) ((jMaxMemory11119 - jFreeMemory11119) / j111117), (int) (jMaxMemory11119 / j111117));
                        java.lang.StringBuilder sbS1112 = p121o0.p.s(size1111111111119, size11111111111110, "load_completed movies=", " series=", " live=");
                        Y6.f.w(sbS1112, size11111111111111, " categories=", size11111111111112, " epgPrograms=");
                        sbS1112.append(iD1112);
                        sbS1112.append(str);
                        sbS1112.append(aVar1115);
                        p015b5.AbstractC1664a.a(sbS1112.toString(), str3);
                        p015b5.AbstractC1664a.d(str2, null);
                        return a2;
                    }
                }
                return aVar;
            case 6:
                playlist5 = (com.kiptv.core.model.Playlist) c1378q1.f14966i;
                d10 = c1378q1.f14965h;
                com.google.common.util.concurrent.P.u0(obj);
                aVar = aVar2;
                str = " heap=";
                a2 = a9;
                str2 = "operation";
                str3 = "playlist";
                playlist3 = playlist5;
                V7.n0 n0Var1111111111 = R4.c.f9052a;
                strA4 = R4.c.a("Raggruppamento contenuti", "square.grid.2x2");
                list = (java.util.List) ((V7.n0) d10.f13294b.f15317h.f10419h).getValue();
                if (list == null) {
                    list = list14;
                }
                list2 = (java.util.List) ((V7.n0) d10.f13294b.f15322n.f10419h).getValue();
                if (list2 == null) {
                    list2 = list14;
                }
                list3 = (java.util.List) ((V7.n0) d10.f13294b.j.f10419h).getValue();
                if (list3 == null) {
                    list3 = list14;
                }
                list4 = (java.util.List) ((V7.n0) d10.f13294b.f15324p.f10419h).getValue();
                if (list4 == null) {
                    list4 = list14;
                }
                list5 = (java.util.List) ((V7.n0) d10.f13294b.f15320l.f10419h).getValue();
                if (list5 == null) {
                    list5 = list14;
                }
                list6 = (java.util.List) ((V7.n0) d10.f13294b.f15326r.f10419h).getValue();
                if (list6 != null) {
                    list14 = list6;
                }
                p005a5.C1366p c1366p1111115 = d10.f13296d;
                java.lang.String id1113 = playlist3.f20033a;
                c1366p1111115.getClass();
                kotlin.jvm.internal.m.e(id1113, "id");
                V7.n0 n0Var1111111112 = c1366p1111115.f14907a;
                n0Var1111111112.getClass();
                n0Var1111111112.i(null, id1113);
                p005a5.C1366p c1366p1111116 = d10.f13296d;
                c1378q1.f14965h = d10;
                c1378q1.f14966i = strA4;
                c1378q1.j = list;
                c1378q1.f14967k = list2;
                c1378q1.f14968l = list3;
                c1378q1.f14969m = list4;
                c1378q1.f14970n = list5;
                c1378q1.f14971o = list14;
                c1378q1.f14976t = 7;
                c1366p1111116.getClass();
                list7 = list;
                list8 = list2;
                list9 = list3;
                list10 = list4;
                list11 = list14;
                list12 = list5;
                objK = S7.C.K(S7.M.f9549a, new p005a5.C1356o(list8, list7, list10, list9, list11, list12, c1366p1111116, null), c1378q1);
                if (objK != p109m6.a.f25430h) {
                    objK = a2;
                }
                if (objK != aVar) {
                    str12 = strA4;
                    str13 = null;
                    d11 = d10;
                    list13 = list12;
                    R4.c.b(str12, str13);
                    size = list8.size();
                    size2 = list10.size();
                    size3 = list11.size();
                    size4 = list13.size() + list9.size() + list7.size();
                    n0Var = R4.c.f9052a;
                    do {
                        value = n0Var.getValue();
                    } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                    java.util.Set set111118 = p015b5.AbstractC1664a.f17935a;
                    int size11111111111113 = list8.size();
                    int size11111111111114 = list10.size();
                    int size11111111111115 = list11.size();
                    int size11111111111116 = list13.size() + list9.size() + list7.size();
                    int iD1113 = d11.f13303m.d();
                    java.lang.Runtime runtime111110 = java.lang.Runtime.getRuntime();
                    long jMaxMemory111110 = runtime111110.maxMemory();
                    long jFreeMemory111110 = runtime111110.totalMemory() - runtime111110.freeMemory();
                    long j111118 = 1048576;
                    P4.a aVar1116 = new P4.a((int) (jFreeMemory111110 / j111118), (int) ((jMaxMemory111110 - jFreeMemory111110) / j111118), (int) (jMaxMemory111110 / j111118));
                    java.lang.StringBuilder sbS1113 = p121o0.p.s(size11111111111113, size11111111111114, "load_completed movies=", " series=", " live=");
                    Y6.f.w(sbS1113, size11111111111115, " categories=", size11111111111116, " epgPrograms=");
                    sbS1113.append(iD1113);
                    sbS1113.append(str);
                    sbS1113.append(aVar1116);
                    p015b5.AbstractC1664a.a(sbS1113.toString(), str3);
                    p015b5.AbstractC1664a.d(str2, null);
                    return a2;
                }
                return aVar;
            case 7:
                java.util.List list15 = c1378q1.f14971o;
                list13 = c1378q1.f14970n;
                java.util.List list16 = c1378q1.f14969m;
                java.util.List list17 = c1378q1.f14968l;
                java.util.List list18 = c1378q1.f14967k;
                java.util.List list19 = (java.util.List) c1378q1.j;
                java.lang.String str20 = (java.lang.String) c1378q1.f14966i;
                p005a5.D1 d17 = c1378q1.f14965h;
                com.google.common.util.concurrent.P.u0(obj);
                list11 = list15;
                list10 = list16;
                list9 = list17;
                list8 = list18;
                a2 = a9;
                list7 = list19;
                str2 = "operation";
                str = " heap=";
                str12 = str20;
                str3 = "playlist";
                d11 = d17;
                R4.c.b(str12, str13);
                size = list8.size();
                size2 = list10.size();
                size3 = list11.size();
                size4 = list13.size() + list9.size() + list7.size();
                n0Var = R4.c.f9052a;
                do {
                    value = n0Var.getValue();
                } while (!n0Var.g(value, R4.d.a((R4.d) value, null, null, null, null, size, size2, size3, size4, 0, 0, 31)));
                java.util.Set set111119 = p015b5.AbstractC1664a.f17935a;
                int size11111111111117 = list8.size();
                int size11111111111118 = list10.size();
                int size11111111111119 = list11.size();
                int size111111111111110 = list13.size() + list9.size() + list7.size();
                int iD1114 = d11.f13303m.d();
                java.lang.Runtime runtime111111 = java.lang.Runtime.getRuntime();
                long jMaxMemory111111 = runtime111111.maxMemory();
                long jFreeMemory111111 = runtime111111.totalMemory() - runtime111111.freeMemory();
                long j111119 = 1048576;
                P4.a aVar1117 = new P4.a((int) (jFreeMemory111111 / j111119), (int) ((jMaxMemory111111 - jFreeMemory111111) / j111119), (int) (jMaxMemory111111 / j111119));
                java.lang.StringBuilder sbS1114 = p121o0.p.s(size11111111111117, size11111111111118, "load_completed movies=", " series=", " live=");
                Y6.f.w(sbS1114, size11111111111119, " categories=", size111111111111110, " epgPrograms=");
                sbS1114.append(iD1114);
                sbS1114.append(str);
                sbS1114.append(aVar1117);
                p015b5.AbstractC1664a.a(sbS1114.toString(), str3);
                p015b5.AbstractC1664a.d(str2, null);
                return a2;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(p117n6.c cVar) {
        p005a5.C1278g1 c1278g1;
        java.lang.String str;
        if (cVar instanceof p005a5.C1278g1) {
            c1278g1 = (p005a5.C1278g1) cVar;
            int i3 = c1278g1.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1278g1.j = i3 - Integer.MIN_VALUE;
            } else {
                c1278g1 = new p005a5.C1278g1(this, cVar);
            }
        } else {
            c1278g1 = new p005a5.C1278g1(this, cVar);
        }
        java.lang.Object obj = c1278g1.f14480h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1278g1.j;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                this.f13294b.b();
                p005a5.C1366p c1366p = this.f13296d;
                V7.n0 n0Var = c1366p.f14909c;
                p078i6.w wVar = p078i6.w.f23205h;
                n0Var.getClass();
                n0Var.i(null, wVar);
                V7.n0 n0Var2 = c1366p.f14911e;
                p078i6.x xVar = p078i6.x.f23206h;
                n0Var2.getClass();
                n0Var2.i(null, xVar);
                V7.n0 n0Var3 = c1366p.g;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                n0Var3.getClass();
                n0Var3.i(null, bool);
                V7.n0 n0Var4 = c1366p.f14914i;
                n0Var4.getClass();
                n0Var4.i(null, wVar);
                V7.n0 n0Var5 = c1366p.f14915k;
                n0Var5.getClass();
                n0Var5.i(null, xVar);
                V7.n0 n0Var6 = c1366p.f14917m;
                n0Var6.getClass();
                n0Var6.i(null, bool);
                V7.n0 n0Var7 = c1366p.f14919o;
                n0Var7.getClass();
                n0Var7.i(null, wVar);
                V7.n0 n0Var8 = c1366p.f14921q;
                n0Var8.getClass();
                n0Var8.i(null, xVar);
                V7.n0 n0Var9 = c1366p.f14923s;
                n0Var9.getClass();
                n0Var9.i(null, wVar);
                V7.n0 n0Var10 = c1366p.f14927w;
                n0Var10.getClass();
                n0Var10.i(null, xVar);
                V7.n0 n0Var11 = c1366p.y;
                n0Var11.getClass();
                n0Var11.i(null, xVar);
                V7.n0 n0Var12 = c1366p.f14925u;
                n0Var12.getClass();
                n0Var12.i(null, bool);
                V7.n0 n0Var13 = c1366p.f14904A;
                n0Var13.getClass();
                n0Var13.i(null, bool);
                V7.n0 n0Var14 = c1366p.f14905B;
                n0Var14.getClass();
                n0Var14.i(null, bool);
                V7.n0 n0Var15 = c1366p.f14906C;
                n0Var15.getClass();
                n0Var15.i(null, wVar);
                c1366p.f14907a.h(null);
                p005a5.C1434v8 c1434v8 = this.g;
                c1434v8.f15202h.h(null);
                c1434v8.j.h(null);
                c1434v8.f15205l.h(null);
                c1434v8.f15207n.h(null);
                V7.n0 n0Var16 = c1434v8.f15209p;
                n0Var16.getClass();
                n0Var16.i(null, xVar);
                V7.n0 n0Var17 = c1434v8.f15211r;
                n0Var17.getClass();
                n0Var17.i(null, xVar);
                V7.n0 n0Var18 = c1434v8.f15213t;
                p078i6.y yVar = p078i6.y.f23207h;
                n0Var18.getClass();
                n0Var18.i(null, yVar);
                V7.n0 n0Var19 = c1434v8.f15217x;
                n0Var19.getClass();
                n0Var19.i(null, yVar);
                c1434v8.f15215v = null;
                c1434v8.f15216w = null;
                c1434v8.f15218z.clear();
                c1434v8.f15191A.clear();
                c1434v8.f15192B.clear();
                c1434v8.f15193C.clear();
                V7.n0 n0Var20 = c1434v8.f15198c.f14904A;
                n0Var20.getClass();
                n0Var20.i(null, bool);
                com.kiptv.core.model.Playlist playlist = (com.kiptv.core.model.Playlist) ((V7.n0) c1434v8.f15199d.f13659k.f10419h).getValue();
                if (playlist != null && (str = playlist.f20033a) != null) {
                    Z7.e eVar = S7.M.f9549a;
                    S7.C.A(S7.C.c(Z7.d.f13044i), null, new p005a5.C1295h8(c1434v8, str, null), 3);
                }
                p005a5.i9 i9Var = this.f13299h;
                V7.n0 n0Var21 = i9Var.f14627k;
                n0Var21.getClass();
                n0Var21.i(null, wVar);
                V7.n0 n0Var22 = i9Var.f14629m;
                n0Var22.getClass();
                n0Var22.i(null, yVar);
                V7.n0 n0Var23 = i9Var.f14635s;
                n0Var23.getClass();
                n0Var23.i(null, yVar);
                V7.n0 n0Var24 = i9Var.f14633q;
                n0Var24.getClass();
                n0Var24.i(null, yVar);
                V7.n0 n0Var25 = i9Var.f14637u;
                n0Var25.getClass();
                n0Var25.i(null, yVar);
                V7.n0 n0Var26 = i9Var.f14631o;
                n0Var26.getClass();
                n0Var26.i(null, yVar);
                V7.n0 n0Var27 = i9Var.f14639w;
                n0Var27.getClass();
                n0Var27.i(null, yVar);
                V7.n0 n0Var28 = i9Var.y;
                n0Var28.getClass();
                n0Var28.i(null, bool);
                i9Var.j.clear();
                p005a5.D0 d4 = this.f13300i;
                V7.n0 n0Var29 = d4.f13286k;
                n0Var29.getClass();
                n0Var29.i(null, wVar);
                V7.n0 n0Var30 = d4.f13288m;
                n0Var30.getClass();
                n0Var30.i(null, wVar);
                V7.n0 n0Var31 = d4.f13290o;
                n0Var31.getClass();
                n0Var31.i(null, bool);
                p005a5.B2 b9 = this.j;
                V7.n0 n0Var32 = b9.g;
                n0Var32.getClass();
                n0Var32.i(null, wVar);
                V7.n0 n0Var33 = b9.f13171i;
                n0Var33.getClass();
                n0Var33.i(null, bool);
                b9.j = wVar;
                b9.f13172k = null;
                this.f13302l.c();
                this.f13303m.f14840c = null;
                Y4.C1075g c1075g = this.f13301k;
                c1075g.f11895d = xVar;
                c1075g.f11896e = xVar;
                c1075g.f11897f = false;
                c1075g.g = xVar;
                c1075g.f11898h = xVar;
                c1075g.f11899i = false;
                this.f13298f.getClass();
                com.kiptv.core.repository.a aVar2 = this.f13305o;
                V7.n0 n0Var34 = aVar2.f20959c;
                n0Var34.getClass();
                n0Var34.i(null, yVar);
                V7.n0 n0Var35 = aVar2.f20961e;
                n0Var35.getClass();
                n0Var35.i(null, yVar);
                V7.n0 n0Var36 = aVar2.g;
                n0Var36.getClass();
                n0Var36.i(null, xVar);
                this.f13304n.f();
                U4.g gVar = this.f13295c;
                c1278g1.j = 1;
                java.lang.Object objA = ((T4.g) gVar.f10140c.getValue()).a(c1278g1);
                if (objA != aVar) {
                    objA = a2;
                }
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
        } catch (java.lang.Exception unused) {
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object e(com.kiptv.core.model.Playlist playlist, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.B1 b9;
        java.lang.String strA;
        java.lang.Object objH;
        p005a5.D1 d4;
        int i3;
        com.kiptv.core.model.Playlist playlist2 = playlist;
        if (cVar instanceof p005a5.B1) {
            b9 = (p005a5.B1) cVar;
            int i9 = b9.f13162m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                b9.f13162m = i9 - Integer.MIN_VALUE;
            } else {
                b9 = new p005a5.B1(this, cVar);
            }
        } else {
            b9 = new p005a5.B1(this, cVar);
        }
        java.lang.Object obj = b9.f13160k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = b9.f13162m;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            V7.n0 n0Var = R4.c.f9052a;
            strA = R4.c.a("Guida EPG", "calendar");
            b9.f13158h = this;
            b9.f13159i = playlist2;
            b9.j = strA;
            b9.f13162m = 1;
            objH = this.f13303m.h(playlist2, b9);
            if (objH == aVar) {
                return aVar;
            }
            d4 = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str = b9.j;
            com.kiptv.core.model.Playlist playlist3 = b9.f13159i;
            p005a5.D1 d6 = b9.f13158h;
            com.google.common.util.concurrent.P.u0(obj);
            java.lang.Object obj2 = ((p070h6.n) obj).f22542h;
            strA = str;
            playlist2 = playlist3;
            d4 = d6;
            objH = obj2;
        }
        boolean z6 = objH instanceof p070h6.m;
        p070h6.A a2 = p070h6.A.f22523a;
        if (!z6) {
            int iIntValue = ((java.lang.Number) objH).intValue();
            V7.n0 n0Var2 = R4.c.f9052a;
            while (true) {
                java.lang.Object value = n0Var2.getValue();
                i3 = iIntValue;
                if (n0Var2.g(value, R4.d.a((R4.d) value, null, null, null, null, 0, 0, 0, 0, iIntValue, 0, 1535))) {
                    break;
                }
                iIntValue = i3;
            }
            java.lang.String str2 = playlist2.g;
            boolean z9 = !(str2 == null || O7.q.N0(str2)) || playlist2.d();
            if (i3 == 0 && z9) {
                android.util.Log.w("PlaylistContentLoader", "xmltv preload returned an empty guide (source configured)");
                V7.n0 n0Var3 = R4.c.f9052a;
                R4.c.c(strA, "guida vuota");
                return a2;
            }
            V7.n0 n0Var4 = R4.c.f9052a;
            R4.c.b(strA, i3 + " canali");
            java.util.Set set = p015b5.AbstractC1664a.f17935a;
            int iD = d4.f13303m.d();
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
            long j = 1048576;
            P4.a aVar2 = new P4.a((int) (jFreeMemory / j), (int) ((jMaxMemory - jFreeMemory) / j), (int) (jMaxMemory / j));
            java.lang.StringBuilder sbS = p121o0.p.s(i3, iD, "xmltv_loaded channels=", " programs=", " heap=");
            sbS.append(aVar2);
            p015b5.AbstractC1664a.a(sbS.toString(), "playlist");
        }
        java.lang.Throwable thA = p070h6.n.a(objH);
        if (thA != null) {
            android.util.Log.d("PlaylistContentLoader", "xmltv preload failed: " + thA);
            V7.n0 n0Var5 = R4.c.f9052a;
            java.lang.String message = thA.getMessage();
            if (message == null) {
                message = "failed";
            }
            R4.c.c(strA, message);
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(com.kiptv.core.model.Playlist playlist, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.C1 c9;
        java.lang.Object objH;
        p005a5.D1 d4;
        if (cVar instanceof p005a5.C1) {
            c9 = (p005a5.C1) cVar;
            int i3 = c9.f13235k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c9.f13235k = i3 - Integer.MIN_VALUE;
            } else {
                c9 = new p005a5.C1(this, cVar);
            }
        } else {
            c9 = new p005a5.C1(this, cVar);
        }
        java.lang.Object obj = c9.f13234i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c9.f13235k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            this.f13303m.f14840c = null;
            this.f13302l.i();
            p005a5.n9 n9Var = this.f13303m;
            c9.f13233h = this;
            c9.f13235k = 1;
            objH = n9Var.h(playlist, c9);
            if (objH == aVar) {
                return aVar;
            }
            d4 = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d4 = c9.f13233h;
            com.google.common.util.concurrent.P.u0(obj);
            objH = ((p070h6.n) obj).f22542h;
        }
        com.google.common.util.concurrent.P.u0(objH);
        d4.f13302l.i();
        return p070h6.A.f22523a;
    }
}
