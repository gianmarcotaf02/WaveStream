package p193x5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lx5/s1;", "Landroidx/lifecycle/e0;", "Companion", "x5/t0", "x5/v0", "x5/s0", "x5/u0", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class s1 extends androidx.lifecycle.e0 {
    public static final p193x5.C3141s0 Companion = new p193x5.C3141s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1366p f31617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.O f31618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.D0 f31619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.B2 f31620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a5.C1291h4 f31621f;
    public final C5.V g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p005a5.n9 f31622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Y4.C1075g f31623i;
    public final p005a5.x9 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p005a5.C1379q2 f31624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p015b5.o f31625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Y4.Q0 f31626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p193x5.C3127l f31627n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.String f31628o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.List f31629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V7.n0 f31630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V7.W f31631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final V7.a0 f31632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final V7.a0 f31633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.util.LinkedHashSet f31634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.util.LinkedHashMap f31635v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final java.util.LinkedHashSet f31636w;

    public s1(C5.V liveZapContext, Y4.C1075g channelLogoClient, Y4.Q0 tmdbApiClient, p005a5.C1366p contentCacheRepository, p005a5.O epgRepository, p005a5.D0 myListRepository, p005a5.C1379q2 purchaseRepository, p005a5.B2 recentlyWatchedLive, p005a5.C1291h4 settingsRepository, p005a5.n9 xmltvRepository, p005a5.x9 xtreamRepository, p015b5.k reminderScheduler, p015b5.o epgTmdbService, p193x5.C3127l browseSelection) {
        kotlin.jvm.internal.m.e(contentCacheRepository, "contentCacheRepository");
        kotlin.jvm.internal.m.e(epgRepository, "epgRepository");
        kotlin.jvm.internal.m.e(myListRepository, "myListRepository");
        kotlin.jvm.internal.m.e(recentlyWatchedLive, "recentlyWatchedLive");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(liveZapContext, "liveZapContext");
        kotlin.jvm.internal.m.e(xmltvRepository, "xmltvRepository");
        kotlin.jvm.internal.m.e(channelLogoClient, "channelLogoClient");
        kotlin.jvm.internal.m.e(xtreamRepository, "xtreamRepository");
        kotlin.jvm.internal.m.e(purchaseRepository, "purchaseRepository");
        kotlin.jvm.internal.m.e(reminderScheduler, "reminderScheduler");
        kotlin.jvm.internal.m.e(epgTmdbService, "epgTmdbService");
        kotlin.jvm.internal.m.e(tmdbApiClient, "tmdbApiClient");
        kotlin.jvm.internal.m.e(browseSelection, "browseSelection");
        this.f31617b = contentCacheRepository;
        this.f31618c = epgRepository;
        this.f31619d = myListRepository;
        this.f31620e = recentlyWatchedLive;
        this.f31621f = settingsRepository;
        this.g = liveZapContext;
        this.f31622h = xmltvRepository;
        this.f31623i = channelLogoClient;
        this.j = xtreamRepository;
        this.f31624k = purchaseRepository;
        this.f31625l = epgTmdbService;
        this.f31626m = tmdbApiClient;
        this.f31627n = browseSelection;
        V7.n0 n0VarB = V7.r.b(new p193x5.C3138q0(false, null, null, null, null, null, null, null, false, -1));
        this.f31630q = n0VarB;
        this.f31631r = new V7.W(n0VarB);
        this.f31632s = V7.r.a(16, 5, null);
        this.f31633t = V7.r.a(8, 5, null);
        this.f31634u = new java.util.LinkedHashSet();
        this.f31635v = new java.util.LinkedHashMap();
        this.f31636w = new java.util.LinkedHashSet();
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.J0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.P0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.X0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.N0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.b1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.R0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.T0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.V0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.F0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.L0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.C3139r0(this, null), 3);
    }

    public static final void e(p193x5.s1 s1Var, S4.p pVar) {
        V7.n0 n0Var;
        java.lang.Object value;
        p193x5.C3138q0 c3138q0;
        java.util.Map mapP0;
        java.util.Map mapP1;
        java.lang.Object obj;
        java.lang.Integer num;
        java.util.List list = pVar.f9431c;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((S4.C0867f) it.next()).f9387a.f20657d));
        }
        java.util.Set setR1 = p078i6.o.R1(arrayList);
        s1Var.f31618c.c();
        do {
            n0Var = s1Var.f31630q;
            value = n0Var.getValue();
            c3138q0 = (p193x5.C3138q0) value;
            java.util.Set set = setR1;
            mapP0 = p078i6.C.P0(c3138q0.f31591k, set);
            mapP1 = p078i6.C.P0(c3138q0.f31592l, set);
            obj = null;
            num = c3138q0.j;
        } while (!n0Var.g(value, p193x5.C3138q0.a(c3138q0, false, null, null, null, null, null, null, null, null, null, mapP0, mapP1, (num == null || !setR1.contains(java.lang.Integer.valueOf(num.intValue()))) ? c3138q0.f31593m : null, null, null, null, false, null, false, c3138q0.f31600t + 1, null, null, false, null, null, null, null, null, null, null, null, null, null, null, -531457, 3)));
        java.lang.Integer num2 = ((p193x5.C3138q0) n0Var.getValue()).j;
        if (num2 == null || !setR1.contains(num2)) {
            return;
        }
        for (java.lang.Object obj2 : list) {
            if (((S4.C0867f) obj2).f9387a.f20657d == num2.intValue()) {
                obj = obj2;
                break;
            }
        }
        S4.C0867f c0867f = (S4.C0867f) obj;
        if (c0867f != null) {
            com.kiptv.core.model.XtreamLiveStream xtreamLiveStream = c0867f.f9387a;
            s1Var.f31632s.o(new p193x5.C3143t0(xtreamLiveStream.f20657d, P3.e.c0(xtreamLiveStream), P3.e.b0(xtreamLiveStream), xtreamLiveStream.f20655b));
        }
    }

    public static java.util.List f(p193x5.C3138q0 state) {
        java.lang.Object next;
        kotlin.jvm.internal.m.e(state, "state");
        java.util.List list = p078i6.w.f23205h;
        p193x5.InterfaceC3137q interfaceC3137q = state.f31585c;
        if (interfaceC3137q != null) {
            boolean z6 = interfaceC3137q instanceof p193x5.C3129m;
            java.util.Map map = state.f31586d;
            if (!z6) {
                if (interfaceC3137q.equals(p193x5.C3131n.f31560a)) {
                    return state.f31589h;
                }
                if (interfaceC3137q instanceof p193x5.C3135p) {
                    java.util.Iterator it = state.g.iterator();
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
                    java.util.ArrayList arrayListJ0 = p078i6.q.J0(map.values());
                    java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : arrayListJ0) {
                        if (hashSet.add(java.lang.Integer.valueOf(((S4.p) obj).f9429a))) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : arrayList) {
                        java.util.List list2 = ((S4.p) obj2).f9431c;
                        if (!list2.isEmpty()) {
                            java.util.Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (set.contains(java.lang.String.valueOf(((S4.C0867f) it2.next()).f9387a.f20657d))) {
                                    arrayList2.add(obj2);
                                    break;
                                }
                            }
                        }
                    }
                    if (!state.f31599s) {
                        return arrayList2;
                    }
                    java.lang.String tagKey = ((p193x5.C3135p) interfaceC3137q).f31570a;
                    kotlin.jvm.internal.m.e(tagKey, "tagKey");
                    java.util.List list3 = (java.util.List) state.f31598r.get("tag:".concat(tagKey));
                    if (list3 != null) {
                        list = list3;
                    }
                    return R8.i.B(arrayList2, list);
                }
                if (!interfaceC3137q.equals(p193x5.C3133o.f31565a)) {
                    throw new I3.b();
                }
                java.util.List list4 = state.f31590i;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(p078i6.q.I0(list4, 10));
                int i3 = 0;
                for (java.lang.Object obj3 : list4) {
                    int i9 = i3 + 1;
                    if (i3 < 0) {
                        p078i6.p.H0();
                        throw null;
                    }
                    arrayList3.add(new p070h6.k(java.lang.Integer.valueOf(((com.kiptv.core.model.XtreamLiveStream) obj3).f20657d), java.lang.Integer.valueOf(i3)));
                    i3 = i9;
                }
                java.util.Map mapX0 = p078i6.C.X0(arrayList3);
                java.util.ArrayList arrayListJ1 = p078i6.q.J0(map.values());
                java.util.HashSet hashSet2 = new java.util.HashSet();
                java.util.ArrayList<S4.p> arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj4 : arrayListJ1) {
                    if (hashSet2.add(java.lang.Integer.valueOf(((S4.p) obj4).f9429a))) {
                        arrayList4.add(obj4);
                    }
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                for (S4.p pVar : arrayList4) {
                    java.util.List list5 = pVar.f9431c;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.util.Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        java.lang.Integer num = (java.lang.Integer) mapX0.get(java.lang.Integer.valueOf(((S4.C0867f) it3.next()).f9387a.f20657d));
                        if (num != null) {
                            arrayList6.add(num);
                        }
                    }
                    java.lang.Integer num2 = (java.lang.Integer) p078i6.o.u1(arrayList6);
                    p070h6.k kVar = num2 != null ? new p070h6.k(java.lang.Integer.valueOf(num2.intValue()), pVar) : null;
                    if (kVar != null) {
                        arrayList5.add(kVar);
                    }
                }
                java.util.List listI1 = p078i6.o.I1(arrayList5, new p193x5.C3149w0(0));
                java.util.ArrayList arrayList7 = new java.util.ArrayList(p078i6.q.I0(listI1, 10));
                java.util.Iterator it4 = listI1.iterator();
                while (it4.hasNext()) {
                    arrayList7.add((S4.p) ((p070h6.k) it4.next()).f22540i);
                }
                return arrayList7;
            }
            java.util.List list6 = (java.util.List) map.get(((p193x5.C3129m) interfaceC3137q).f31538a);
            if (list6 != null) {
                return list6;
            }
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object g(com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, java.lang.String str, p117n6.c cVar) {
        p193x5.C3151x0 c3151x0;
        p193x5.s1 s1Var;
        if (cVar instanceof p193x5.C3151x0) {
            c3151x0 = (p193x5.C3151x0) cVar;
            int i3 = c3151x0.f31686l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3151x0.f31686l = i3 - Integer.MIN_VALUE;
            } else {
                c3151x0 = new p193x5.C3151x0(this, cVar);
            }
        } else {
            c3151x0 = new p193x5.C3151x0(this, cVar);
        }
        p193x5.C3151x0 c3151x1 = c3151x0;
        java.lang.Object objC = c3151x1.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c3151x1.f31686l;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objC);
                com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20886k;
                c3151x1.f31683h = this;
                c3151x1.f31684i = xtreamLiveStream;
                c3151x1.f31686l = 1;
                objC = this.f31619d.c(str, z0Var, c3151x1);
                if (objC != aVar) {
                    s1Var = this;
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
            xtreamLiveStream = c3151x1.f31684i;
            s1Var = c3151x1.f31683h;
            com.google.common.util.concurrent.P.u0(objC);
            java.lang.String str2 = (java.lang.String) objC;
            if (str2 != null) {
                p005a5.D0 d4 = s1Var.f31619d;
                java.lang.String strValueOf = java.lang.String.valueOf(xtreamLiveStream.f20657d);
                com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.f20886k;
                java.lang.String strA0 = P3.e.a0(xtreamLiveStream);
                java.lang.String strX = P3.e.X(xtreamLiveStream);
                c3151x1.f31683h = null;
                c3151x1.f31684i = null;
                c3151x1.f31686l = 2;
                if (p005a5.D0.n(d4, strValueOf, z0Var2, str2, strA0, strX, c3151x1, 32) == aVar) {
                    return aVar;
                }
            }
        } catch (java.lang.Throwable th) {
            com.google.common.util.concurrent.P.T(th);
        }
        return a2;
    }

    public final int h(S4.p pVar) {
        java.lang.Object obj = S4.q.f9432a;
        java.lang.Integer numB = S4.q.b(P3.e.Z(pVar.e()));
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }

    public final java.lang.String i(S4.p pVar) {
        java.lang.Object obj = S4.q.f9432a;
        return S4.q.a(P3.e.Z(pVar.e()));
    }

    public final java.lang.String j(S4.p pVar) {
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

    public final java.util.Set k(com.kiptv.core.model.XtreamLiveStream xtreamLiveStream) {
        return p078i6.o.R1(this.f31619d.o(java.lang.String.valueOf(xtreamLiveStream.f20657d), com.kiptv.core.model.z0.f20886k));
    }

    public final java.lang.Object l() {
        return this.f31628o;
    }

    public final V7.l0 m() {
        return this.f31631r;
    }

    public final boolean n(java.lang.String categoryId) {
        com.kiptv.core.model.C1944g0 c1944g0;
        com.kiptv.core.model.ContentTypeSettings contentTypeSettings;
        kotlin.jvm.internal.m.e(categoryId, "categoryId");
        com.kiptv.core.model.PlaylistSettings playlistSettingsA = this.f31621f.a();
        if (playlistSettingsA == null || (c1944g0 = playlistSettingsA.f20062i) == null || (contentTypeSettings = c1944g0.f20757d) == null) {
            return false;
        }
        return E8.l.C(categoryId, (java.util.List) ((V7.n0) this.f31617b.f14920p.f10419h).getValue(), contentTypeSettings);
    }

    public final boolean o() {
        return this.f31622h.f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(java.lang.String str, boolean z6, p117n6.c cVar) {
        p193x5.D0 d4;
        p193x5.s1 s1Var;
        p193x5.s1 s1Var2;
        if (cVar instanceof p193x5.D0) {
            d4 = (p193x5.D0) cVar;
            int i3 = d4.f31242m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d4.f31242m = i3 - Integer.MIN_VALUE;
            } else {
                d4 = new p193x5.D0(this, cVar);
            }
        } else {
            d4 = new p193x5.D0(this, cVar);
        }
        java.lang.Object objH = d4.f31240k;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = d4.f31242m;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20886k;
            d4.f31238h = this;
            d4.f31239i = str;
            d4.j = z6;
            d4.f31242m = 1;
            objH = this.f31619d.h(z0Var, d4);
            if (objH != obj) {
                s1Var = this;
            }
        }
        if (i9 == 1) {
            z6 = d4.j;
            str = d4.f31239i;
            s1Var = d4.f31238h;
            com.google.common.util.concurrent.P.u0(objH);
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objH);
                return a2;
            }
            s1Var2 = d4.f31238h;
            com.google.common.util.concurrent.P.u0(objH);
        }
        d4.f31238h = null;
        d4.f31242m = 3;
        return s1Var2.w(d4) == obj ? obj : a2;
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
            p005a5.D0 d6 = s1Var.f31619d;
            com.kiptv.core.model.z0 z0Var2 = com.kiptv.core.model.z0.f20886k;
            d4.f31238h = s1Var;
            d4.f31239i = null;
            d4.f31242m = 2;
            if (d6.l(arrayListO1, z0Var2, d4) != obj) {
                s1Var2 = s1Var;
                d4.f31238h = null;
                d4.f31242m = 3;
                if (s1Var2.w(d4) == obj) {
                }
            }
        }
    }

    public final void q(S4.p group, java.util.List rowGroups, p194x6.j onPlay) {
        kotlin.jvm.internal.m.e(group, "group");
        kotlin.jvm.internal.m.e(rowGroups, "rowGroups");
        kotlin.jvm.internal.m.e(onPlay, "onPlay");
        this.f31629p = rowGroups;
        if (group.c()) {
            t(group);
        } else {
            u(group.e(), onPlay);
        }
    }

    public final void r(com.kiptv.core.model.XtreamLiveStream channel) {
        V7.n0 n0Var;
        java.lang.Object value;
        p193x5.C3138q0 c3138q0A;
        int i3;
        kotlin.jvm.internal.m.e(channel, "channel");
        do {
            n0Var = this.f31630q;
            value = n0Var.getValue();
            c3138q0A = (p193x5.C3138q0) value;
            java.lang.Integer num = c3138q0A.j;
            int i9 = channel.f20657d;
            if (num != null && num.intValue() == i9) {
                i3 = i9;
            } else {
                java.lang.String strX = (java.lang.String) c3138q0A.f31578C.get(java.lang.Integer.valueOf(i9));
                if (strX == null) {
                    strX = P3.e.X(channel);
                }
                p078i6.w wVar = p078i6.w.f23205h;
                i3 = i9;
                c3138q0A = p193x5.C3138q0.a(c3138q0A, false, null, null, null, null, null, null, null, null, java.lang.Integer.valueOf(i9), null, null, null, null, null, null, false, null, false, 0, null, null, false, null, null, null, null, null, null, null, null, wVar, null, strX, 536866303, 1);
            }
        } while (!n0Var.g(value, c3138q0A));
        int i10 = i3;
        this.f31632s.o(new p193x5.C3143t0(i10, P3.e.c0(channel), P3.e.b0(channel), channel.f20655b));
        if (kotlin.jvm.internal.m.a(((p193x5.C3138q0) n0Var.getValue()).f31605z, "onFocus")) {
            this.f31633t.o(channel);
        }
        x(channel, null);
    }

    public final void s(S4.p group, p194x6.j onPlay) {
        kotlin.jvm.internal.m.e(group, "group");
        kotlin.jvm.internal.m.e(onPlay, "onPlay");
        this.f31629p = f((p193x5.C3138q0) this.f31630q.getValue());
        if (group.c()) {
            t(group);
        } else {
            u(group.e(), onPlay);
        }
    }

    public final void t(S4.p pVar) {
        S4.p group = pVar;
        kotlin.jvm.internal.m.e(group, "group");
        while (true) {
            V7.n0 n0Var = this.f31630q;
            java.lang.Object value = n0Var.getValue();
            if (n0Var.g(value, p193x5.C3138q0.a((p193x5.C3138q0) value, false, null, null, null, null, null, null, null, null, null, null, null, null, group, null, null, false, null, false, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, -8193, 3))) {
                return;
            } else {
                group = pVar;
            }
        }
    }

    public final void u(com.kiptv.core.model.XtreamLiveStream channel, p194x6.j onPlay) {
        java.lang.Object value;
        java.lang.Object value2;
        kotlin.jvm.internal.m.e(channel, "channel");
        kotlin.jvm.internal.m.e(onPlay, "onPlay");
        java.util.List groups = this.f31629p;
        V7.n0 n0Var = this.f31630q;
        if (groups == null) {
            groups = f((p193x5.C3138q0) n0Var.getValue());
        }
        C5.V v6 = this.g;
        v6.getClass();
        kotlin.jvm.internal.m.e(groups, "groups");
        if (groups.isEmpty()) {
            groups = null;
        }
        v6.f1150a = groups;
        this.f31629p = null;
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, p193x5.C3138q0.a((p193x5.C3138q0) value, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, -201326593, 3)));
        S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.c1(onPlay, channel, this, null), 3);
        do {
            value2 = n0Var.getValue();
        } while (!n0Var.g(value2, p193x5.C3138q0.a((p193x5.C3138q0) value2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, -8193, 3)));
    }

    public final boolean v(com.kiptv.core.model.XtreamLiveStream channel) {
        java.lang.Object value;
        kotlin.jvm.internal.m.e(channel, "channel");
        V7.n0 n0Var = this.f31630q;
        p193x5.C3138q0 c3138q0 = (p193x5.C3138q0) n0Var.getValue();
        java.lang.String str = channel.f20660h;
        boolean z6 = str != null && c3138q0.y.contains(str);
        java.util.Set set = c3138q0.f31604x;
        int i3 = channel.f20657d;
        boolean zContains = set.contains(java.lang.String.valueOf(i3));
        if (!this.f31624k.d() || z6 || zContains) {
            y();
            return false;
        }
        java.lang.String strJ = this.j.j(i3, kotlin.jvm.internal.m.a(((com.kiptv.core.model.LocalDeviceSettings) ((V7.n0) this.f31621f.f14557k.f10419h).getValue()).f19831k, "ts") ? "ts" : "m3u8");
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, p193x5.C3138q0.a((p193x5.C3138q0) value, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, 0, null, null, false, null, null, null, java.lang.Integer.valueOf(i3), strJ, null, null, null, null, null, null, -201326593, 3)));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object w(p117n6.c cVar) {
        p193x5.d1 d1Var;
        p193x5.s1 s1Var;
        java.util.ArrayList arrayList;
        java.lang.Object objT;
        int i3;
        if (cVar instanceof p193x5.d1) {
            d1Var = (p193x5.d1) cVar;
            int i9 = d1Var.f31446l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                d1Var.f31446l = i9 - Integer.MIN_VALUE;
            } else {
                d1Var = new p193x5.d1(this, cVar);
            }
        } else {
            d1Var = new p193x5.d1(this, cVar);
        }
        java.lang.Object objH = d1Var.j;
        java.lang.Object obj = p109m6.a.f25430h;
        int i10 = d1Var.f31446l;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20886k;
            p005a5.D0 d4 = this.f31619d;
            java.util.ArrayList arrayListA = d4.a(z0Var);
            try {
                d1Var.f31443h = this;
                d1Var.f31444i = arrayListA;
                d1Var.f31446l = 1;
                objH = d4.h(z0Var, d1Var);
                if (objH == obj) {
                    return obj;
                }
                s1Var = this;
                arrayList = arrayListA;
            } catch (java.lang.Throwable th) {
                th = th;
                s1Var = this;
                arrayList = arrayListA;
                objT = com.google.common.util.concurrent.P.T(th);
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = d1Var.f31444i;
            s1Var = d1Var.f31443h;
            try {
                com.google.common.util.concurrent.P.u0(objH);
            } catch (java.lang.Throwable th2) {
                th = th2;
                objT = com.google.common.util.concurrent.P.T(th);
            }
        }
        objT = (java.util.List) objH;
        java.lang.Object obj2 = p078i6.w.f23205h;
        if (objT instanceof p070h6.m) {
            objT = obj2;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) objT).iterator();
        while (true) {
            i3 = 10;
            if (!it.hasNext()) {
                break;
            }
            p070h6.k kVar = (p070h6.k) it.next();
            java.lang.String str = (java.lang.String) kVar.f22539h;
            java.lang.String str2 = (java.lang.String) kVar.f22540i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayList) {
                if (((com.kiptv.core.model.MyListItem) obj3).f19878h.contains(str)) {
                    arrayList3.add(obj3);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(p078i6.q.I0(arrayList3, 10));
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((com.kiptv.core.model.MyListItem) it2.next()).f19875d);
            }
            java.util.Set setR1 = p078i6.o.R1(arrayList4);
            if (setR1.isEmpty()) {
                setR1 = null;
            }
            p193x5.t1 t1Var = setR1 != null ? new p193x5.t1(str, str2, setR1) : null;
            if (t1Var != null) {
                arrayList2.add(t1Var);
            }
        }
        V7.n0 n0Var = s1Var.f31630q;
        while (true) {
            java.lang.Object value = n0Var.getValue();
            p193x5.C3138q0 c3138q0 = (p193x5.C3138q0) value;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(p078i6.q.I0(arrayList, i3));
            java.util.Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((com.kiptv.core.model.MyListItem) it3.next()).f19875d);
            }
            java.util.Set setR2 = p078i6.o.R1(arrayList5);
            int i11 = i3;
            if (n0Var.g(value, p193x5.C3138q0.a(c3138q0, false, null, null, null, null, setR2, arrayList2, null, null, null, null, null, null, null, null, null, false, null, false, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, -97, 3))) {
                return p070h6.A.f22523a;
            }
            i3 = i11;
        }
    }

    public final void x(com.kiptv.core.model.XtreamLiveStream channel, com.kiptv.core.model.EPGProgram ePGProgram) {
        com.kiptv.core.model.EPGProgram ePGProgram2;
        java.lang.Object value;
        p193x5.C3138q0 c3138q0;
        kotlin.jvm.internal.m.e(channel, "channel");
        V7.n0 n0Var = this.f31630q;
        int i3 = channel.f20657d;
        if (ePGProgram == null) {
            ePGProgram2 = (com.kiptv.core.model.EPGProgram) ((p193x5.C3138q0) n0Var.getValue()).f31591k.get(java.lang.Integer.valueOf(i3));
            if (ePGProgram2 == null) {
                p070h6.k kVarA = this.f31618c.a(P3.e.c0(channel), P3.e.b0(channel), channel.f20655b);
                ePGProgram2 = kVarA != null ? (com.kiptv.core.model.EPGProgram) kVarA.f22539h : null;
            }
        } else {
            ePGProgram2 = ePGProgram;
        }
        if (ePGProgram2 != null && ((p193x5.C3138q0) n0Var.getValue()).f31591k.get(java.lang.Integer.valueOf(i3)) == null) {
            do {
                value = n0Var.getValue();
                c3138q0 = (p193x5.C3138q0) value;
            } while (!n0Var.g(value, p193x5.C3138q0.a(c3138q0, false, null, null, null, null, null, null, null, null, null, p078i6.C.S0(c3138q0.f31591k, new p070h6.k(java.lang.Integer.valueOf(i3), ePGProgram2)), null, null, null, null, null, false, null, false, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, -1025, 3)));
        }
        if (kotlin.jvm.internal.m.a(this.f31635v.get(java.lang.Integer.valueOf(i3)), ePGProgram2 != null ? ePGProgram2.f19738a : null)) {
            if (((p193x5.C3138q0) n0Var.getValue()).f31578C.containsKey(java.lang.Integer.valueOf(i3))) {
                return;
            }
        }
        if (this.f31634u.add(java.lang.Integer.valueOf(i3))) {
            S7.C.A(androidx.lifecycle.X.h(this), null, new p193x5.i1(ePGProgram2, this, channel, i3, null), 3);
        }
    }

    public final void y() {
        V7.n0 n0Var;
        java.lang.Object value;
        do {
            n0Var = this.f31630q;
            value = n0Var.getValue();
        } while (!n0Var.g(value, p193x5.C3138q0.a((p193x5.C3138q0) value, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, -201326593, 3)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r12.w(r7) == r9) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object z(com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, java.lang.String str, p117n6.c cVar) {
        p193x5.p1 p1Var;
        java.lang.Throwable th;
        p193x5.s1 s1Var;
        if (cVar instanceof p193x5.p1) {
            p1Var = (p193x5.p1) cVar;
            int i3 = p1Var.f31575k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p1Var.f31575k = i3 - Integer.MIN_VALUE;
            } else {
                p1Var = new p193x5.p1(this, cVar);
            }
        } else {
            p1Var = new p193x5.p1(this, cVar);
        }
        p193x5.p1 p1Var2 = p1Var;
        java.lang.Object obj = p1Var2.f31574i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = p1Var2.f31575k;
        if (i9 != 0) {
            if (i9 == 1) {
                s1Var = p1Var2.f31573h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    com.google.common.util.concurrent.P.T(th);
                }
                p1Var2.f31573h = null;
                p1Var2.f31575k = 2;
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
        }
        com.google.common.util.concurrent.P.u0(obj);
        try {
            p005a5.D0 d4 = this.f31619d;
            java.lang.String strValueOf = java.lang.String.valueOf(xtreamLiveStream.f20657d);
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20886k;
            java.lang.String strA0 = P3.e.a0(xtreamLiveStream);
            java.lang.String strX = P3.e.X(xtreamLiveStream);
            p1Var2.f31573h = this;
            p1Var2.f31575k = 1;
            if (p005a5.D0.n(d4, strValueOf, z0Var, str, strA0, strX, p1Var2, 32) != aVar) {
                s1Var = this;
                p1Var2.f31573h = null;
                p1Var2.f31575k = 2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            s1Var = this;
            com.google.common.util.concurrent.P.T(th);
        }
        return aVar;
    }
}
