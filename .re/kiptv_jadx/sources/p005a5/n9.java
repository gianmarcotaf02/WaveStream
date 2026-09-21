package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class n9 {
    private static final p005a5.k9 Companion = new p005a5.k9();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O7.o f14836e = new O7.o("\\.[a-z]{2,4}$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final O7.o f14837f = new O7.o("\\b(hd|fhd|uhd|4k|2k|8k|sd|hevc|h265|h264)\\b");
    public static final O7.o g = new O7.o("[^a-z0-9]+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.V1 f14838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1291h4 f14839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p005a5.l9 f14840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p028c8.d f14841d;

    public n9(Y4.V1 xmltvParser, p005a5.C1291h4 settingsRepository) {
        kotlin.jvm.internal.m.e(xmltvParser, "xmltvParser");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        this.f14838a = xmltvParser;
        this.f14839b = settingsRepository;
        this.f14841d = new p028c8.d();
    }

    public static java.util.HashMap b(java.util.Map map, java.util.Map map2) {
        java.util.HashMap map3 = new java.util.HashMap(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String strG = g(((Y4.O1) entry.getValue()).f11691a);
            if (strG.length() != 0) {
                java.util.List list = (java.util.List) map2.get(str);
                int size = list != null ? list.size() : 0;
                if (size != 0) {
                    java.lang.String str2 = (java.lang.String) map3.get(strG);
                    if (str2 != null) {
                        java.util.List list2 = (java.util.List) map2.get(str2);
                        if (size > (list2 != null ? list2.size() : 0)) {
                        }
                    }
                    map3.put(strG, str);
                }
            }
        }
        return map3;
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = lowerCase.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = lowerCase.charAt(i3);
            if (java.lang.Character.isLetterOrDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static java.lang.String g(java.lang.String raw) {
        kotlin.jvm.internal.m.e(raw, "raw");
        java.lang.String lowerCase = raw.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        return O7.q.r1(g.e(f14837f.e(f14836e.e(lowerCase, ""), io.ktor.sse.ServerSentEventKt.SPACE), io.ktor.sse.ServerSentEventKt.SPACE)).toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public final java.util.List a() {
        p005a5.l9 l9Var = this.f14840c;
        if (l9Var == null) {
            return p078i6.w.f23205h;
        }
        ?? r9 = l9Var.f14749c;
        java.util.ArrayList arrayList = new java.util.ArrayList(r9.size());
        for (java.util.Map.Entry entry : r9.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = ((Y4.O1) entry.getValue()).f11691a;
            java.util.List list = (java.util.List) l9Var.f14747a.get(str);
            arrayList.add(new p005a5.j9(true, str, list != null ? list.size() : 0, str2));
        }
        return p078i6.o.I1(arrayList, new p005a5.B(18));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final int d() {
        java.util.Collection collectionValues;
        p005a5.l9 l9Var = this.f14840c;
        int size = 0;
        if (l9Var != null && (collectionValues = l9Var.f14747a.values()) != null) {
            java.util.Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                size += ((java.util.List) it.next()).size();
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public final java.lang.String e(java.lang.String str, java.lang.String str2) {
        java.lang.Object next;
        java.lang.String str3;
        java.lang.String lowerCase;
        java.lang.Object next2;
        Y4.O1 o8;
        java.lang.String str4;
        java.lang.String lowerCase2;
        java.lang.String str5;
        p005a5.l9 l9Var = this.f14840c;
        if (l9Var != null) {
            if (str != null && !O7.q.N0(str)) {
                Y4.O1 o9 = (Y4.O1) l9Var.f14749c.get(str);
                if (o9 != null && (str5 = o9.f11692b) != null) {
                    return str5;
                }
                java.lang.String lowerCase3 = str.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase3, "toLowerCase(...)");
                java.util.Iterator it = l9Var.f14749c.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    lowerCase2 = ((java.lang.String) ((java.util.Map.Entry) next2).getKey()).toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                } while (!lowerCase2.equals(lowerCase3));
                java.util.Map.Entry entry = (java.util.Map.Entry) next2;
                if (entry != null && (o8 = (Y4.O1) entry.getValue()) != null && (str4 = o8.f11692b) != null) {
                    return str4;
                }
            }
            if (str2 != null && !O7.q.N0(str2)) {
                java.lang.String lowerCase4 = O7.q.r1(str2).toString().toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase4, "toLowerCase(...)");
                java.util.Iterator it2 = l9Var.f14749c.values().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    lowerCase = O7.q.r1(((Y4.O1) next).f11691a).toString().toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                } while (!lowerCase.equals(lowerCase4));
                Y4.O1 o10 = (Y4.O1) next;
                if (o10 != null && (str3 = o10.f11692b) != null) {
                    return str3;
                }
            }
        }
        return null;
    }

    public final boolean f() {
        return this.f14840c != null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x010f A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:57:0x00f9, B:59:0x0103, B:61:0x010b, B:67:0x016e, B:62:0x010f, B:63:0x0128, B:65:0x012e, B:66:0x0150), top: B:86:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x012e A[Catch: all -> 0x003c, LOOP:0: B:63:0x0128->B:65:0x012e, LOOP_END, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:57:0x00f9, B:59:0x0103, B:61:0x010b, B:67:0x016e, B:62:0x010f, B:63:0x0128, B:65:0x012e, B:66:0x0150), top: B:86:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public final java.io.Serializable h(com.kiptv.core.model.Playlist playlist, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.m9 m9Var;
        com.kiptv.core.model.Playlist playlist2;
        p028c8.a aVar;
        p005a5.n9 n9Var;
        p005a5.l9 l9Var;
        p028c8.a aVar2;
        com.kiptv.core.model.Playlist playlist3;
        p005a5.n9 n9Var2;
        java.io.Serializable num;
        Y4.P1 p2;
        java.util.LinkedHashMap linkedHashMap;
        int size;
        if (cVar instanceof p005a5.m9) {
            m9Var = (p005a5.m9) cVar;
            int i3 = m9Var.f14796m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m9Var.f14796m = i3 - Integer.MIN_VALUE;
            } else {
                m9Var = new p005a5.m9(this, cVar);
            }
        } else {
            m9Var = new p005a5.m9(this, cVar);
        }
        java.lang.Object objK = m9Var.f14794k;
        p109m6.a aVar3 = p109m6.a.f25430h;
        int i9 = m9Var.f14796m;
        int i10 = 1;
        try {
            try {
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(objK);
                    p028c8.d dVar = this.f14841d;
                    m9Var.f14792h = this;
                    playlist2 = playlist;
                    m9Var.f14793i = playlist2;
                    m9Var.j = dVar;
                    m9Var.f14796m = 1;
                    if (dVar.e(m9Var) != aVar3) {
                        aVar = dVar;
                        n9Var = this;
                    }
                    return aVar3;
                }
                if (i9 != 1) {
                    if (i9 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n9Var2 = (p005a5.n9) m9Var.j;
                    aVar2 = (p028c8.a) m9Var.f14793i;
                    playlist3 = (com.kiptv.core.model.Playlist) m9Var.f14792h;
                    try {
                        com.google.common.util.concurrent.P.u0(objK);
                        p2 = (Y4.P1) objK;
                        if (p2.f11710b.isEmpty() || !p2.f11709a.isEmpty()) {
                            ?? r9 = p2.f11710b;
                            linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(r9.size()));
                            for (java.lang.Object obj : r9.entrySet()) {
                                java.lang.String lowerCase = ((java.lang.String) ((java.util.Map.Entry) obj).getKey()).toLowerCase(java.util.Locale.ROOT);
                                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                                linkedHashMap.put(lowerCase, ((java.util.Map.Entry) obj).getValue());
                            }
                            ?? r11 = p2.f11709a;
                            ?? r10 = p2.f11710b;
                            n9Var2.getClass();
                            n9Var2.f14840c = new p005a5.l9(r9, linkedHashMap, r11, b(r11, r10), java.lang.System.currentTimeMillis(), playlist3.f20033a);
                            size = p2.f11710b.size();
                        } else {
                            n9Var2.f14840c = null;
                            size = 0;
                        }
                        num = new java.lang.Integer(size);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        try {
                            num = com.google.common.util.concurrent.P.T(th);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((p028c8.d) aVar).g(null);
                            throw th;
                        }
                    }
                    aVar = aVar2;
                    ((p028c8.d) aVar).g(null);
                    return num;
                }
                p028c8.a aVar4 = (p028c8.a) m9Var.j;
                com.kiptv.core.model.Playlist playlist4 = (com.kiptv.core.model.Playlist) m9Var.f14793i;
                n9Var = (p005a5.n9) m9Var.f14792h;
                com.google.common.util.concurrent.P.u0(objK);
                aVar = aVar4;
                playlist2 = playlist4;
                if (l9Var != null && kotlin.jvm.internal.m.a(l9Var.f14752f, playlist2.f20033a)) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - l9Var.f14751e;
                    com.kiptv.core.model.PlaylistSettings playlistSettingsA = n9Var.f14839b.a();
                    int i11 = playlistSettingsA != null ? playlistSettingsA.f20063k : 60;
                    if (i11 >= 1) {
                        i10 = i11;
                    }
                    if (jCurrentTimeMillis < ((long) i10) * 60000) {
                        num = new java.lang.Integer(l9Var.f14747a.size());
                    }
                    ((p028c8.d) aVar).g(null);
                    return num;
                }
                Y4.V1 v6 = n9Var.f14838a;
                java.lang.String str = playlist2.g;
                java.lang.String str2 = playlist2.d() ? playlist2.f20036d : null;
                java.lang.String str3 = playlist2.d() ? playlist2.f20037e : null;
                java.lang.String str4 = playlist2.d() ? playlist2.f20038f : null;
                m9Var.f14792h = playlist2;
                m9Var.f14793i = aVar;
                m9Var.j = n9Var;
                m9Var.f14796m = 2;
                v6.getClass();
                Z7.e eVar = S7.M.f9549a;
                objK = S7.C.K(Z7.d.f13044i, new Y4.T1(v6, str, str2, str3, str4, null), m9Var);
                if (objK != aVar3) {
                    playlist3 = playlist2;
                    aVar2 = aVar;
                    n9Var2 = n9Var;
                    p2 = (Y4.P1) objK;
                    if (p2.f11710b.isEmpty()) {
                        ?? r12 = p2.f11710b;
                        linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(r12.size()));
                        while (r5.hasNext()) {
                            java.lang.String lowerCase2 = ((java.lang.String) ((java.util.Map.Entry) obj).getKey()).toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                            linkedHashMap.put(lowerCase2, ((java.util.Map.Entry) obj).getValue());
                        }
                        ?? r13 = p2.f11709a;
                        ?? r14 = p2.f11710b;
                        n9Var2.getClass();
                        n9Var2.f14840c = new p005a5.l9(r12, linkedHashMap, r13, b(r13, r14), java.lang.System.currentTimeMillis(), playlist3.f20033a);
                        size = p2.f11710b.size();
                    } else {
                        ?? r15 = p2.f11710b;
                        linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(r15.size()));
                        while (r5.hasNext()) {
                            java.lang.String lowerCase3 = ((java.lang.String) ((java.util.Map.Entry) obj).getKey()).toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.m.d(lowerCase3, "toLowerCase(...)");
                            linkedHashMap.put(lowerCase3, ((java.util.Map.Entry) obj).getValue());
                        }
                        ?? r16 = p2.f11709a;
                        ?? r17 = p2.f11710b;
                        n9Var2.getClass();
                        n9Var2.f14840c = new p005a5.l9(r15, linkedHashMap, r16, b(r16, r17), java.lang.System.currentTimeMillis(), playlist3.f20033a);
                        size = p2.f11710b.size();
                    }
                    num = new java.lang.Integer(size);
                    aVar = aVar2;
                    ((p028c8.d) aVar).g(null);
                    return num;
                }
                return aVar3;
            } catch (java.lang.Throwable th3) {
                th = th3;
                aVar2 = aVar;
                num = com.google.common.util.concurrent.P.T(th);
            }
            l9Var = n9Var.f14840c;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ((p028c8.d) aVar).g(null);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    public final java.util.List i(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.util.List list;
        p005a5.l9 l9Var = this.f14840c;
        if (l9Var != null) {
            if (str != null && !O7.q.N0(str)) {
                java.util.List list2 = (java.util.List) l9Var.f14747a.get(str);
                if (list2 != null) {
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        return list2;
                    }
                }
                java.util.LinkedHashMap linkedHashMap = l9Var.f14748b;
                java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                java.util.List list3 = (java.util.List) linkedHashMap.get(lowerCase);
                if (list3 != null) {
                    if (list3.isEmpty()) {
                        list3 = null;
                    }
                    if (list3 != null) {
                        return list3;
                    }
                }
            }
            if (str2 != null) {
                java.lang.String strG = g(str2);
                if (strG.length() != 0 && (str3 = (java.lang.String) l9Var.f14750d.get(strG)) != null && (list = (java.util.List) l9Var.f14747a.get(str3)) != null && !list.isEmpty()) {
                    return list;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public final java.util.List j(java.lang.String query) {
        kotlin.jvm.internal.m.e(query, "query");
        java.lang.String lowerCase = O7.q.r1(query).toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() == 0) {
            return a();
        }
        java.lang.String strC = c(lowerCase);
        java.util.List listA = a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listA) {
            p005a5.j9 j9Var = (p005a5.j9) obj;
            java.lang.String lowerCase2 = j9Var.f14676b.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
            if (O7.q.B0(lowerCase2, lowerCase, false) || (strC.length() > 0 && O7.q.B0(c(j9Var.f14675a), strC, false))) {
                arrayList.add(obj);
            }
        }
        p005a5.l9 l9Var = this.f14840c;
        return (l9Var == null || strC.length() == 0) ? arrayList : p078i6.o.A1(arrayList, N7.o.s0(new N7.l(N7.o.p0(N7.o.k0(p078i6.o.Y0(l9Var.f14747a.entrySet()), new D5.C0260n(l9Var, this, strC, 16)), new p005a5.J6(1)), new p005a5.B(19), 1)));
    }
}
