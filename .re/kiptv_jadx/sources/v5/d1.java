package v5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lv5/d1;", "Landroidx/lifecycle/e0;", "Companion", "F/i0", "v5/k0", "v5/j0", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class d1 extends androidx.lifecycle.e0 {
    public static final v5.C2934j0 Companion = new v5.C2934j0();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public java.util.Map f29428A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f29429B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public java.util.Set f29430C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public java.util.Set f29431D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile F.i0 f29432E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public S7.w0 f29433F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1366p f29434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.O f29435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p015b5.k f29436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1291h4 f29437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5.V f29438f;
    public final p015b5.o g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y4.Q0 f29439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p005a5.n9 f29440i;
    public final Y4.C1075g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p005a5.D0 f29441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p005a5.C1379q2 f29442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p005a5.B2 f29443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p005a5.x9 f29444n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p193x5.C3127l f29445o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V7.n0 f29446p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V7.W f29447q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V7.a0 f29448r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final V7.a0 f29449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.LinkedHashSet f29450t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.util.LinkedHashSet f29451u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public S7.w0 f29452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public java.lang.Object f29453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public java.lang.Object f29454x;
    public java.util.Map y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public S4.EnumC0868g f29455z;

    public d1(C5.V liveZapContext, Y4.C1075g channelLogoClient, Y4.Q0 tmdbApiClient, p005a5.C1366p contentCacheRepository, p005a5.O epgRepository, p005a5.D0 myListRepository, p005a5.C1379q2 purchaseRepository, p005a5.B2 recentlyWatchedLive, p005a5.C1291h4 settingsRepository, p005a5.n9 xmltvRepository, p005a5.x9 xtreamRepository, p015b5.k reminderScheduler, p015b5.o epgTmdbService, p193x5.C3127l browseSelection) {
        kotlin.jvm.internal.m.e(contentCacheRepository, "contentCacheRepository");
        kotlin.jvm.internal.m.e(epgRepository, "epgRepository");
        kotlin.jvm.internal.m.e(reminderScheduler, "reminderScheduler");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(liveZapContext, "liveZapContext");
        kotlin.jvm.internal.m.e(epgTmdbService, "epgTmdbService");
        kotlin.jvm.internal.m.e(tmdbApiClient, "tmdbApiClient");
        kotlin.jvm.internal.m.e(xmltvRepository, "xmltvRepository");
        kotlin.jvm.internal.m.e(channelLogoClient, "channelLogoClient");
        kotlin.jvm.internal.m.e(myListRepository, "myListRepository");
        kotlin.jvm.internal.m.e(purchaseRepository, "purchaseRepository");
        kotlin.jvm.internal.m.e(recentlyWatchedLive, "recentlyWatchedLive");
        kotlin.jvm.internal.m.e(xtreamRepository, "xtreamRepository");
        kotlin.jvm.internal.m.e(browseSelection, "browseSelection");
        this.f29434b = contentCacheRepository;
        this.f29435c = epgRepository;
        this.f29436d = reminderScheduler;
        this.f29437e = settingsRepository;
        this.f29438f = liveZapContext;
        this.g = epgTmdbService;
        this.f29439h = tmdbApiClient;
        this.f29440i = xmltvRepository;
        this.j = channelLogoClient;
        this.f29441k = myListRepository;
        this.f29442l = purchaseRepository;
        this.f29443m = recentlyWatchedLive;
        this.f29444n = xtreamRepository;
        this.f29445o = browseSelection;
        p078i6.w wVar = p078i6.w.f23205h;
        p078i6.x xVar = p078i6.x.f23206h;
        S4.EnumC0862a enumC0862a = S4.EnumC0862a.f9358h;
        S4.EnumC0868g enumC0868g = S4.EnumC0868g.f9389h;
        p078i6.y yVar = p078i6.y.f23207h;
        V7.n0 n0VarB = V7.r.b(new v5.C2932i0(true, wVar, false, wVar, xVar, xVar, null, wVar, wVar, wVar, enumC0862a, enumC0868g, false, xVar, yVar, java.lang.System.currentTimeMillis(), null, null, "off", wVar, null, false, yVar, yVar, yVar));
        this.f29446p = n0VarB;
        this.f29447q = new V7.W(n0VarB);
        this.f29448r = V7.r.a(1, 4, null);
        this.f29449s = V7.r.a(8, 5, null);
        this.f29450t = new java.util.LinkedHashSet();
        this.f29451u = new java.util.LinkedHashSet();
        this.f29453w = wVar;
        this.f29454x = xVar;
        this.y = xVar;
        this.f29455z = enumC0868g;
        this.f29428A = xVar;
        this.f29430C = yVar;
        this.f29431D = yVar;
        S7.C.A(androidx.lifecycle.X.h(this), null, new v5.A0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new v5.N0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new v5.H0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new v5.F0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new v5.C0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new v5.D0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new v5.J0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new v5.L0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new v5.C2957v0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new v5.C2942n0(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01b5 A[LOOP:0: B:46:0x01af->B:48:0x01b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x01d4 A[LOOP:1: B:52:0x01ce->B:54:0x01d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object e(v5.d1 d1Var, java.util.List list, p117n6.c cVar) throws java.lang.Throwable {
        v5.C2944o0 c2944o0;
        java.util.List listS0;
        p070h6.A a2;
        java.lang.Object value;
        v5.C2932i0 c2932i0;
        java.util.Set set;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        v5.d1 d1Var2 = d1Var;
        d1Var2.getClass();
        if (cVar instanceof v5.C2944o0) {
            c2944o0 = (v5.C2944o0) cVar;
            int i3 = c2944o0.f29565l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2944o0.f29565l = i3 - Integer.MIN_VALUE;
            } else {
                c2944o0 = new v5.C2944o0(d1Var2, cVar);
            }
        } else {
            c2944o0 = new v5.C2944o0(d1Var2, cVar);
        }
        java.lang.Object obj = c2944o0.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c2944o0.f29565l;
        p070h6.A a9 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            V7.n0 n0Var = d1Var2.f29446p;
            java.util.List list2 = ((v5.C2932i0) n0Var.getValue()).f29504b;
            int iI0 = p078i6.D.I0(p078i6.q.I0(list2, 10));
            if (iI0 < 16) {
                iI0 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iI0);
            for (java.lang.Object obj2 : list2) {
                linkedHashMap.put(new java.lang.Integer(((S4.p) obj2).e().f20657d), obj2);
            }
            listS0 = N7.o.s0(N7.o.r0(N7.o.q0(N7.o.k0(p078i6.o.Y0(list), new v5.C2962y(d1Var2, 1)), new I5.s2(linkedHashMap, 3)), 12));
            int size = list.size();
            int size2 = list2.size();
            int size3 = listS0.size();
            int size4 = d1Var2.f29451u.size();
            java.util.LinkedHashSet linkedHashSet = d1Var2.f29450t;
            int size5 = linkedHashSet.size();
            p005a5.n9 n9Var = d1Var2.f29440i;
            boolean zF = n9Var.f();
            p005a5.l9 l9Var = n9Var.f14840c;
            int size6 = l9Var != null ? l9Var.f14747a.size() : 0;
            a2 = a9;
            java.lang.StringBuilder sbS = p121o0.p.s(size, size2, "epgFetch: requested=", " rows=", " toFetch=");
            Y6.f.w(sbS, size3, " fetched=", size4, " inFlight=");
            sbS.append(size5);
            sbS.append(" xmltvAvailable=");
            sbS.append(zF);
            sbS.append(" xmltvChannels=");
            sbS.append(size6);
            android.util.Log.i("TvEPGDiag", sbS.toString());
            if (!listS0.isEmpty()) {
                java.util.Iterator it2 = listS0.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(new java.lang.Integer(((com.kiptv.core.model.XtreamLiveStream) it2.next()).f20657d));
                }
                do {
                    value = n0Var.getValue();
                    c2932i0 = (v5.C2932i0) value;
                    set = c2932i0.f29515o;
                    arrayList = new java.util.ArrayList(p078i6.q.I0(listS0, 10));
                    java.util.Iterator it3 = listS0.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new java.lang.Integer(((com.kiptv.core.model.XtreamLiveStream) it3.next()).f20657d));
                    }
                } while (!n0Var.g(value, v5.C2932i0.a(c2932i0, false, null, false, null, null, null, null, null, null, null, null, null, false, null, p078i6.I.o0(set, arrayList), 0L, null, null, null, null, null, false, null, null, null, 33538047)));
                v5.C2948q0 c2948q0 = new v5.C2948q0(listS0, d1Var2, null);
                c2944o0.f29562h = d1Var2;
                c2944o0.f29563i = listS0;
                c2944o0.f29565l = 1;
                if (S7.C.m(c2948q0, c2944o0) == aVar) {
                    return aVar;
                }
                it = listS0.iterator();
                while (it.hasNext()) {
                    d1Var2.f29450t.remove(new java.lang.Integer(((com.kiptv.core.model.XtreamLiveStream) it.next()).f20657d));
                }
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.List list3 = c2944o0.f29563i;
            v5.d1 d1Var3 = c2944o0.f29562h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                listS0 = list3;
                d1Var2 = d1Var3;
                a2 = a9;
                it = listS0.iterator();
                while (it.hasNext()) {
                    d1Var2.f29450t.remove(new java.lang.Integer(((com.kiptv.core.model.XtreamLiveStream) it.next()).f20657d));
                }
            } catch (java.lang.Throwable th) {
                th = th;
                listS0 = list3;
                d1Var2 = d1Var3;
                java.util.Iterator it4 = listS0.iterator();
                while (it4.hasNext()) {
                    d1Var2.f29450t.remove(new java.lang.Integer(((com.kiptv.core.model.XtreamLiveStream) it4.next()).f20657d));
                }
                throw th;
            }
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x019b  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    public static java.util.List t(v5.d1 d1Var, p193x5.InterfaceC3137q interfaceC3137q, java.util.ArrayList arrayList, java.util.List list, java.util.List list2, int i3) {
        java.util.ArrayList<S4.p> arrayList2;
        java.util.ArrayList arrayList3;
        java.lang.Object next;
        java.util.List listD;
        java.util.List list3 = arrayList;
        if ((i3 & 2) != 0) {
            list3 = ((v5.C2932i0) d1Var.f29446p.getValue()).f29509h;
        }
        ?? arrayList4 = list;
        if ((i3 & 4) != 0) {
            arrayList4 = ((v5.C2932i0) d1Var.f29446p.getValue()).f29510i;
        }
        if ((i3 & 8) != 0) {
            list2 = ((v5.C2932i0) d1Var.f29446p.getValue()).j;
        }
        d1Var.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.kiptv.core.model.PlaylistSettings playlistSettingsA = d1Var.f29437e.a();
        boolean z6 = playlistSettingsA != null ? playlistSettingsA.j : true;
        java.util.List list4 = p078i6.w.f23205h;
        java.lang.String strConcat = null;
        if (interfaceC3137q == null) {
            arrayList4 = list4;
        } else if (interfaceC3137q instanceof p193x5.C3129m) {
            java.lang.Object obj = S4.AbstractC0865d.f9364a;
            java.util.List list5 = (java.util.List) d1Var.f29454x.get(((p193x5.C3129m) interfaceC3137q).f31538a);
            if (list5 == null) {
                list5 = list4;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list5) {
                if (!d1Var.f29430C.contains(java.lang.String.valueOf(((com.kiptv.core.model.XtreamLiveStream) obj2).f20657d))) {
                    arrayList5.add(obj2);
                }
            }
            arrayList4 = S4.AbstractC0865d.f(d1Var.y, arrayList5, z6);
        } else if (!interfaceC3137q.equals(p193x5.C3131n.f31560a)) {
            if (interfaceC3137q instanceof p193x5.C3135p) {
                if (kotlin.jvm.internal.m.a(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    F.i0 i0Var = d1Var.f29432E;
                    if (i0Var == null) {
                        arrayList3 = null;
                    } else {
                        arrayList3 = (java.util.ArrayList) i0Var.f3467d;
                        if (i0Var.f3465b != d1Var.f29453w || ((java.util.Map) i0Var.f3466c) != d1Var.y || i0Var.f3464a != z6) {
                            arrayList3 = null;
                        }
                    }
                } else {
                    F.i0 i0Var2 = d1Var.f29432E;
                    if (i0Var2 == null) {
                        arrayList3 = null;
                    } else {
                        arrayList3 = (java.util.ArrayList) i0Var2.f3467d;
                        if (i0Var2.f3465b != d1Var.f29453w || ((java.util.Map) i0Var2.f3466c) != d1Var.y || i0Var2.f3464a != z6) {
                            arrayList3 = null;
                        }
                    }
                    if (arrayList3 == null) {
                        ?? r12 = d1Var.f29453w;
                        java.util.Map map = d1Var.y;
                        java.util.ArrayList arrayListF = S4.AbstractC0865d.f(map, r12, z6);
                        d1Var.f29432E = new F.i0((java.util.List) r12, map, z6, arrayListF);
                        arrayList3 = arrayListF;
                    }
                }
                if (arrayList3 == null) {
                    d1Var.q();
                    return list4;
                }
                java.util.Iterator it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.m.a(((p193x5.t1) next).f31644a, ((p193x5.C3135p) interfaceC3137q).f31570a));
                p193x5.t1 t1Var = (p193x5.t1) next;
                java.util.Set set = t1Var != null ? t1Var.f31646c : null;
                if (set == null) {
                    set = p078i6.y.f23207h;
                }
                arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj3 : arrayList3) {
                    java.util.List list6 = ((S4.p) obj3).f9431c;
                    if (!list6.isEmpty()) {
                        java.util.Iterator it2 = list6.iterator();
                        while (it2.hasNext()) {
                            if (set.contains(java.lang.String.valueOf(((S4.C0867f) it2.next()).f9387a.f20657d))) {
                                arrayList4.add(obj3);
                                break;
                            }
                        }
                    }
                }
            } else {
                if (!interfaceC3137q.equals(p193x5.C3133o.f31565a)) {
                    throw new I3.b();
                }
                if (kotlin.jvm.internal.m.a(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    F.i0 i0Var3 = d1Var.f29432E;
                    if (i0Var3 == null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = (java.util.ArrayList) i0Var3.f3467d;
                        if (i0Var3.f3465b != d1Var.f29453w || ((java.util.Map) i0Var3.f3466c) != d1Var.y || i0Var3.f3464a != z6) {
                            arrayList2 = null;
                        }
                    }
                } else {
                    F.i0 i0Var4 = d1Var.f29432E;
                    if (i0Var4 == null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = (java.util.ArrayList) i0Var4.f3467d;
                        if (i0Var4.f3465b != d1Var.f29453w || ((java.util.Map) i0Var4.f3466c) != d1Var.y || i0Var4.f3464a != z6) {
                            arrayList2 = null;
                        }
                    }
                    if (arrayList2 == null) {
                        ?? r11 = d1Var.f29453w;
                        java.util.Map map2 = d1Var.y;
                        java.util.ArrayList arrayListF2 = S4.AbstractC0865d.f(map2, r11, z6);
                        d1Var.f29432E = new F.i0((java.util.List) r11, map2, z6, arrayListF2);
                        arrayList2 = arrayListF2;
                    }
                }
                if (arrayList2 == null) {
                    d1Var.q();
                    return list4;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList(p078i6.q.I0(list2, 10));
                int i9 = 0;
                for (java.lang.Object obj4 : list2) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        p078i6.p.H0();
                        throw null;
                    }
                    arrayList6.add(new p070h6.k(java.lang.Integer.valueOf(((com.kiptv.core.model.XtreamLiveStream) obj4).f20657d), java.lang.Integer.valueOf(i9)));
                    i9 = i10;
                }
                java.util.Map mapX0 = p078i6.C.X0(arrayList6);
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                for (S4.p pVar : arrayList2) {
                    java.util.List list7 = pVar.f9431c;
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.util.Iterator it3 = list7.iterator();
                    while (it3.hasNext()) {
                        java.lang.Integer num = (java.lang.Integer) mapX0.get(java.lang.Integer.valueOf(((S4.C0867f) it3.next()).f9387a.f20657d));
                        if (num != null) {
                            arrayList8.add(num);
                        }
                    }
                    java.lang.Integer num2 = (java.lang.Integer) p078i6.o.u1(arrayList8);
                    p070h6.k kVar = num2 != null ? new p070h6.k(java.lang.Integer.valueOf(num2.intValue()), pVar) : null;
                    if (kVar != null) {
                        arrayList7.add(kVar);
                    }
                }
                java.util.List listI1 = p078i6.o.I1(arrayList7, new com.kiptv.core.model.C1951k(15));
                arrayList4 = new java.util.ArrayList(p078i6.q.I0(listI1, 10));
                java.util.Iterator it4 = listI1.iterator();
                while (it4.hasNext()) {
                    arrayList4.add((S4.p) ((p070h6.k) it4.next()).f22540i);
                }
            }
        }
        if (interfaceC3137q instanceof p193x5.C3129m) {
            strConcat = ((p193x5.C3129m) interfaceC3137q).f31538a;
        } else if (interfaceC3137q instanceof p193x5.C3135p) {
            java.lang.String tagKey = ((p193x5.C3135p) interfaceC3137q).f31570a;
            kotlin.jvm.internal.m.e(tagKey, "tagKey");
            strConcat = "tag:".concat(tagKey);
        }
        if (!d1Var.f29429B || strConcat == null) {
            listD = R8.i.D(arrayList4, d1Var.f29455z);
        } else {
            java.util.List list8 = (java.util.List) d1Var.f29428A.get(strConcat);
            if (list8 != null) {
                list4 = list8;
            }
            listD = R8.i.B(arrayList4, list4);
        }
        java.util.List listJ1 = p078i6.o.J1(listD, 200);
        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (jElapsedRealtime2 >= 16) {
            android.util.Log.i("TvEPGDiag", "visibleRows: sel=" + interfaceC3137q + " groups=" + arrayList4.size() + " rows=" + listJ1.size() + " in " + jElapsedRealtime2 + "ms on " + java.lang.Thread.currentThread().getName());
        }
        return listJ1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object f(com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, java.lang.String str, p117n6.c cVar) {
        v5.C2938l0 c2938l0;
        v5.d1 d1Var;
        if (cVar instanceof v5.C2938l0) {
            c2938l0 = (v5.C2938l0) cVar;
            int i3 = c2938l0.f29542l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2938l0.f29542l = i3 - Integer.MIN_VALUE;
            } else {
                c2938l0 = new v5.C2938l0(this, cVar);
            }
        } else {
            c2938l0 = new v5.C2938l0(this, cVar);
        }
        v5.C2938l0 c2938l1 = c2938l0;
        java.lang.Object objC = c2938l1.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c2938l1.f29542l;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objC);
                com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20886k;
                c2938l1.f29539h = this;
                c2938l1.f29540i = xtreamLiveStream;
                c2938l1.f29542l = 1;
                objC = this.f29441k.c(str, z0Var, c2938l1);
                if (objC != aVar) {
                    d1Var = this;
                }
                return aVar;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objC);
                return a2;
            }
            xtreamLiveStream = c2938l1.f29540i;
            d1Var = c2938l1.f29539h;
            com.google.common.util.concurrent.P.u0(objC);
            java.lang.String str2 = (java.lang.String) objC;
            if (str2 != null) {
                p005a5.D0 d4 = d1Var.f29441k;
                java.lang.String strValueOf = java.lang.String.valueOf(xtreamLiveStream.f20657d);
                com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.f20886k;
                java.lang.String strA0 = P3.e.a0(xtreamLiveStream);
                java.lang.String strX = P3.e.X(xtreamLiveStream);
                c2938l1.f29539h = null;
                c2938l1.f29540i = null;
                c2938l1.f29542l = 2;
                if (p005a5.D0.n(d4, strValueOf, z0Var2, str2, strA0, strX, c2938l1, 32) == aVar) {
                    return aVar;
                }
            }
        } catch (java.lang.Throwable th) {
            com.google.common.util.concurrent.P.T(th);
        }
        return a2;
    }

    public final int g(S4.p pVar) {
        java.lang.Object obj = S4.q.f9432a;
        java.lang.Integer numB = S4.q.b(P3.e.Z(pVar.e()));
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }

    public final java.lang.String h(S4.p pVar) {
        java.lang.Object obj = S4.q.f9432a;
        return S4.q.a(P3.e.Z(pVar.e()));
    }

    public final java.lang.String i(S4.p pVar) {
        java.lang.String strC;
        java.lang.Object obj = S4.q.f9432a;
        java.lang.String strC2 = S4.q.c(P3.e.Z(pVar.e()));
        if (strC2 != null) {
            return strC2;
        }
        java.util.Iterator it = p078i6.o.X0(pVar.f9431c).iterator();
        do {
            java.util.ListIterator listIterator = (java.util.ListIterator) ((p078i6.E) it).f23177i;
            if (!listIterator.hasPrevious()) {
                return null;
            }
            S4.C0867f c0867f = (S4.C0867f) listIterator.previous();
            java.lang.Object obj2 = S4.q.f9432a;
            java.lang.Object obj3 = S4.AbstractC0865d.f9364a;
            strC = S4.q.c(S4.AbstractC0865d.g(c0867f.f9387a.f20655b));
        } while (strC == null);
        return strC;
    }

    public final java.util.Set j(com.kiptv.core.model.XtreamLiveStream xtreamLiveStream) {
        return p078i6.o.R1(this.f29441k.o(java.lang.String.valueOf(xtreamLiveStream.f20657d), com.kiptv.core.model.z0.f20886k));
    }

    public final V7.l0 k() {
        return this.f29447q;
    }

    public final boolean l() {
        return this.f29440i.f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(java.lang.String str, boolean z6, p117n6.c cVar) {
        v5.C2953t0 c2953t0;
        v5.d1 d1Var;
        if (cVar instanceof v5.C2953t0) {
            c2953t0 = (v5.C2953t0) cVar;
            int i3 = c2953t0.f29606m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2953t0.f29606m = i3 - Integer.MIN_VALUE;
            } else {
                c2953t0 = new v5.C2953t0(this, cVar);
            }
        } else {
            c2953t0 = new v5.C2953t0(this, cVar);
        }
        java.lang.Object objH = c2953t0.f29604k;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = c2953t0.f29606m;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20886k;
            c2953t0.f29602h = this;
            c2953t0.f29603i = str;
            c2953t0.j = z6;
            c2953t0.f29606m = 1;
            objH = this.f29441k.h(z0Var, c2953t0);
            if (objH != obj) {
                d1Var = this;
            }
            return obj;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(objH);
            return a2;
        }
        z6 = c2953t0.j;
        str = c2953t0.f29603i;
        d1Var = c2953t0.f29602h;
        com.google.common.util.concurrent.P.u0(objH);
        java.lang.Iterable iterable = (java.lang.Iterable) objH;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((p070h6.k) it.next()).f22539h);
        }
        java.util.ArrayList arrayListO1 = p078i6.o.O1(arrayList);
        int iIndexOf = arrayListO1.indexOf(str);
        int i10 = z6 ? iIndexOf - 1 : iIndexOf + 1;
        if (iIndexOf >= 0 && i10 >= 0 && i10 < arrayListO1.size()) {
            java.lang.Object obj2 = arrayListO1.get(i10);
            arrayListO1.set(i10, str);
            arrayListO1.set(iIndexOf, obj2);
            p005a5.D0 d4 = d1Var.f29441k;
            com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.f20886k;
            c2953t0.f29602h = null;
            c2953t0.f29603i = null;
            c2953t0.f29606m = 2;
            if (d4.l(arrayListO1, z0Var2, c2953t0) == obj) {
                return obj;
            }
        }
        return a2;
    }

    public final void n(S4.p group) {
        java.lang.Integer num;
        kotlin.jvm.internal.m.e(group, "group");
        v5.C2932i0 c2932i0 = (v5.C2932i0) this.f29446p.getValue();
        java.lang.String str = c2932i0.f29519s;
        if (str.equals("onFocus")) {
            this.f29449s.o(group);
        } else {
            if (!str.equals("onTap") || (num = c2932i0.f29521u) == null) {
                return;
            }
            if (num.intValue() != group.e().f20657d) {
                r();
            }
        }
    }

    public final void o() {
        java.util.List list = ((v5.C2932i0) this.f29446p.getValue()).f29504b;
        if (list.isEmpty()) {
            return;
        }
        C5.V v6 = this.f29438f;
        v6.getClass();
        if (list.isEmpty()) {
            list = null;
        }
        v6.f1150a = list;
    }

    public final boolean p(S4.p pVar) {
        boolean z6;
        java.lang.Object value;
        V7.n0 n0Var = this.f29446p;
        v5.C2932i0 c2932i0 = (v5.C2932i0) n0Var.getValue();
        if (this.f29442l.d()) {
            java.lang.String str = pVar.e().f20660h;
            boolean z9 = str != null && c2932i0.f29524x.contains(str);
            java.util.List list = pVar.f9431c;
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = false;
                        break;
                    }
                    if (c2932i0.f29523w.contains(java.lang.String.valueOf(((S4.C0867f) it.next()).f9387a.f20657d))) {
                        z6 = true;
                        break;
                    }
                }
            } else {
                z6 = false;
                break;
            }
            if (!z9 && !z6) {
                java.lang.String str2 = kotlin.jvm.internal.m.a(((com.kiptv.core.model.LocalDeviceSettings) ((V7.n0) this.f29437e.f14557k.f10419h).getValue()).f19831k, "ts") ? "ts" : "m3u8";
                p086j6.b bVarU = com.google.common.util.concurrent.P.U();
                bVarU.add(pVar.e());
                java.util.Iterator it2 = p078i6.o.X0(list).iterator();
                while (true) {
                    java.util.ListIterator listIterator = (java.util.ListIterator) ((p078i6.E) it2).f23177i;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    S4.C0867f c0867f = (S4.C0867f) listIterator.previous();
                    if (c0867f.f9387a.f20657d != pVar.e().f20657d) {
                        bVarU.add(c0867f.f9387a);
                    }
                }
                p086j6.b bVarM = com.google.common.util.concurrent.P.M(bVarU);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ListIterator listIterator2 = bVarM.listIterator(0);
                while (true) {
                    Q0.C0781o c0781o = (Q0.C0781o) listIterator2;
                    if (!c0781o.hasNext()) {
                        break;
                    }
                    java.lang.String strJ = this.f29444n.j(((com.kiptv.core.model.XtreamLiveStream) c0781o.next()).f20657d, str2);
                    if (strJ != null) {
                        arrayList.add(strJ);
                    }
                }
                java.util.List listC1 = p078i6.o.c1(arrayList);
                if (!listC1.isEmpty()) {
                    do {
                        value = n0Var.getValue();
                    } while (!n0Var.g(value, v5.C2932i0.a((v5.C2932i0) value, false, null, false, null, null, null, null, null, null, null, null, null, false, null, null, 0L, null, null, null, listC1, java.lang.Integer.valueOf(pVar.e().f20657d), false, null, null, null, 31981567)));
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        V7.n0 n0Var;
        java.lang.Object value;
        S7.w0 w0Var = this.f29433F;
        if (w0Var == null || !w0Var.isActive()) {
            do {
                n0Var = this.f29446p;
                value = n0Var.getValue();
            } while (!n0Var.g(value, v5.C2932i0.a((v5.C2932i0) value, false, null, true, null, null, null, null, null, null, null, null, null, false, null, null, 0L, null, null, null, null, null, false, null, null, null, 33554427)));
            this.f29433F = S7.C.A(androidx.lifecycle.X.h(this), null, new v5.T0(this, null), 3);
        }
    }

    public final void r() {
        V7.n0 n0Var;
        java.lang.Object value;
        do {
            n0Var = this.f29446p;
            value = n0Var.getValue();
        } while (!n0Var.g(value, v5.C2932i0.a((v5.C2932i0) value, false, null, false, null, null, null, null, null, null, null, null, null, false, null, null, 0L, null, null, null, p078i6.w.f23205h, null, false, null, null, null, 31981567)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object s(com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, java.lang.String str, p117n6.c cVar) {
        v5.a1 a1Var;
        if (cVar instanceof v5.a1) {
            a1Var = (v5.a1) cVar;
            int i3 = a1Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a1Var.j = i3 - Integer.MIN_VALUE;
            } else {
                a1Var = new v5.a1(this, cVar);
            }
        } else {
            a1Var = new v5.a1(this, cVar);
        }
        v5.a1 a1Var2 = a1Var;
        java.lang.Object obj = a1Var2.f29400h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = a1Var2.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                p005a5.D0 d4 = this.f29441k;
                java.lang.String strValueOf = java.lang.String.valueOf(xtreamLiveStream.f20657d);
                com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20886k;
                java.lang.String strA0 = P3.e.a0(xtreamLiveStream);
                java.lang.String strX = P3.e.X(xtreamLiveStream);
                a1Var2.j = 1;
                if (p005a5.D0.n(d4, strValueOf, z0Var, str, strA0, strX, a1Var2, 32) == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
        } catch (java.lang.Throwable th) {
            com.google.common.util.concurrent.P.T(th);
        }
        return p070h6.A.f22523a;
    }
}
