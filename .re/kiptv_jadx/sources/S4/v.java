package S4;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static S4.x a(java.util.List list, java.util.List list2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 0;
        if (list != null) {
            int i9 = 0;
            for (java.lang.Object obj : list) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    p078i6.p.H0();
                    throw null;
                }
                com.kiptv.core.model.XtreamVODStream xtreamVODStream = (com.kiptv.core.model.XtreamVODStream) obj;
                S4.v vVar = S4.x.Companion;
                java.lang.String str = xtreamVODStream.f20723b;
                java.lang.Integer numC = xtreamVODStream.c();
                vVar.getClass();
                S4.w wVarD = d(str, i9, numC);
                e(wVarD, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6);
                arrayList.add(wVarD);
                i9 = i10;
            }
        }
        int size = list != null ? list.size() : 0;
        if (list2 != null) {
            for (java.lang.Object obj2 : list2) {
                int i11 = i3 + 1;
                if (i3 < 0) {
                    p078i6.p.H0();
                    throw null;
                }
                com.kiptv.core.model.XtreamSeries xtreamSeries = (com.kiptv.core.model.XtreamSeries) obj2;
                S4.v vVar2 = S4.x.Companion;
                java.lang.Integer numE = xtreamSeries.e();
                vVar2.getClass();
                S4.w wVarD2 = d(xtreamSeries.f20683b, i3 + size, numE);
                e(wVarD2, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6);
                arrayList.add(wVarD2);
                i3 = i11;
            }
        }
        return new S4.x(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, arrayList, list, list2, arrayList.size());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object c(kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, p194x6.j jVar, int i3, int i9, p194x6.j jVar2, p117n6.c cVar) {
        S4.u uVar;
        int i10;
        int i11;
        int i12;
        if (cVar instanceof S4.u) {
            uVar = (S4.u) cVar;
            int i13 = uVar.f9470p;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                uVar.f9470p = i13 - Integer.MIN_VALUE;
            } else {
                uVar = new S4.u(cVar);
            }
        } else {
            uVar = new S4.u(cVar);
        }
        java.lang.Object obj = uVar.f9469o;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = uVar.f9470p;
        if (i14 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            i10 = 0;
        } else {
            if (i14 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = uVar.f9468n;
            int i16 = uVar.f9467m;
            int i17 = uVar.f9466l;
            p194x6.j jVar3 = uVar.f9465k;
            p194x6.j jVar4 = uVar.j;
            kotlin.jvm.internal.y yVar3 = uVar.f9464i;
            kotlin.jvm.internal.y yVar4 = uVar.f9463h;
            com.google.common.util.concurrent.P.u0(obj);
            i9 = i16;
            yVar2 = yVar3;
            jVar2 = jVar3;
            i3 = i17;
            jVar = jVar4;
            i10 = i15;
            yVar = yVar4;
        }
        while (i10 < i9) {
            int iMin = java.lang.Math.min(yVar.f24555h + i10, i9);
            long jNanoTime = java.lang.System.nanoTime();
            for (int i18 = i10; i18 < iMin; i18++) {
                jVar2.invoke(new java.lang.Integer(i18));
            }
            double dNanoTime = (java.lang.System.nanoTime() - jNanoTime) / 1000000.0d;
            if (dNanoTime > 18.0d) {
                int i19 = yVar.f24555h;
                i11 = 200;
                if (i19 > 200) {
                    int i20 = i19 / 2;
                    if (i20 >= 200) {
                        i11 = i20;
                    }
                } else if (dNanoTime < 9.0d || (i12 = yVar.f24555h) >= 800) {
                    i11 = yVar.f24555h;
                } else {
                    int i21 = i12 * 2;
                    i11 = i21 > 800 ? 800 : i21;
                }
            } else if (dNanoTime < 9.0d) {
                i11 = yVar.f24555h;
            } else {
                i11 = yVar.f24555h;
            }
            yVar.f24555h = i11;
            int i22 = (iMin - i10) + yVar2.f24555h;
            yVar2.f24555h = i22;
            jVar.invoke(new java.lang.Float(i22 / i3));
            uVar.f9463h = yVar;
            uVar.f9464i = yVar2;
            uVar.j = jVar;
            uVar.f9465k = jVar2;
            uVar.f9466l = i3;
            uVar.f9467m = i9;
            uVar.f9468n = iMin;
            uVar.f9470p = 1;
            if (S7.C.M(uVar) == aVar) {
                return aVar;
            }
            i10 = iMin;
        }
        return p070h6.A.f22523a;
    }

    public static S4.w d(java.lang.String str, int i3, java.lang.Integer num) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = S4.x.f9477k;
        S4.w wVar = (S4.w) concurrentHashMap.get(str);
        if (wVar == null) {
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            java.lang.String lowerCase2 = S4.K.c(S4.K.f9329a, str, false, 6).toLowerCase(locale);
            kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
            java.lang.String strH = S4.K.h(lowerCase2);
            java.lang.String strJ = S4.K.j(lowerCase2);
            S4.w wVar2 = new S4.w(i3, S4.K.f(lowerCase), num, lowerCase2, strH, strJ, S4.K.d(strJ));
            concurrentHashMap.putIfAbsent(str, wVar2);
            return wVar2;
        }
        if (wVar.f9471a == i3 && kotlin.jvm.internal.m.a(wVar.g, num)) {
            return wVar;
        }
        java.lang.String normalizedTitle = wVar.f9472b;
        kotlin.jvm.internal.m.e(normalizedTitle, "normalizedTitle");
        java.lang.String matchingNormalized = wVar.f9473c;
        kotlin.jvm.internal.m.e(matchingNormalized, "matchingNormalized");
        java.lang.String aggressiveNormalized = wVar.f9474d;
        kotlin.jvm.internal.m.e(aggressiveNormalized, "aggressiveNormalized");
        java.util.List coreWords = wVar.f9475e;
        kotlin.jvm.internal.m.e(coreWords, "coreWords");
        return new S4.w(i3, wVar.f9476f, num, normalizedTitle, matchingNormalized, aggressiveNormalized, coreWords);
    }

    public static void e(S4.w wVar, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, java.util.Map map5, java.util.Map map6) {
        java.lang.String strR0;
        java.lang.Integer num = wVar.g;
        if (num != null && !map3.containsKey(num)) {
            map3.put(num, wVar);
        }
        java.lang.String str = wVar.f9472b;
        map.putIfAbsent(str, wVar);
        java.lang.String str2 = wVar.f9473c;
        if (!kotlin.jvm.internal.m.a(str2, str)) {
            map.putIfAbsent(str2, wVar);
        }
        java.lang.String str3 = wVar.f9474d;
        if (!kotlin.jvm.internal.m.a(str3, str) && !kotlin.jvm.internal.m.a(str3, str2)) {
            map.putIfAbsent(str3, wVar);
        }
        java.lang.Integer num2 = wVar.f9476f;
        if (num2 != null) {
            map2.putIfAbsent(str + "_" + num2, wVar);
            if (!kotlin.jvm.internal.m.a(str2, str)) {
                map2.putIfAbsent(str2 + "_" + num2, wVar);
            }
        }
        if (str.length() >= 3) {
            strR0 = str.substring(0, 3);
            kotlin.jvm.internal.m.d(strR0, "substring(...)");
        } else {
            strR0 = O7.q.R0(str);
        }
        java.lang.Object arrayList = map4.get(strR0);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            map4.put(strR0, arrayList);
        }
        java.util.List list = (java.util.List) arrayList;
        if (list.size() < 2000) {
            list.add(wVar);
        }
        java.util.List<java.lang.String> list2 = wVar.f9475e;
        for (java.lang.String str4 : list2) {
            if (str4.length() >= 3) {
                java.lang.Object arrayList2 = map5.get(str4);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    map5.put(str4, arrayList2);
                }
                ((java.util.List) arrayList2).add(wVar);
            }
        }
        java.lang.String strO1 = p078i6.o.o1(p078i6.o.J1(list2, 2), io.ktor.sse.ServerSentEventKt.SPACE, null, null, null, 62);
        if (strO1.length() >= 4) {
            java.lang.Object arrayList3 = map6.get(strO1);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                map6.put(strO1, arrayList3);
            }
            ((java.util.List) arrayList3).add(wVar);
        }
    }

    public static void f(S4.x index) {
        com.kiptv.core.model.XtreamSeries xtreamSeries;
        com.kiptv.core.model.XtreamVODStream xtreamVODStream;
        kotlin.jvm.internal.m.e(index, "index");
        java.util.List list = index.f9484h;
        int size = list != null ? list.size() : 0;
        java.util.List<S4.w> list2 = index.g;
        java.util.HashMap map = new java.util.HashMap(((list2.size() * 4) / 3) + 1);
        for (S4.w wVar : list2) {
            int i3 = wVar.f9471a;
            java.lang.String str = null;
            if (i3 >= size) {
                java.util.List list3 = index.f9485i;
                if (list3 != null && (xtreamSeries = (com.kiptv.core.model.XtreamSeries) p078i6.o.k1(i3 - size, list3)) != null) {
                    str = xtreamSeries.f20683b;
                }
            } else if (list != null && (xtreamVODStream = (com.kiptv.core.model.XtreamVODStream) p078i6.o.k1(i3, list)) != null) {
                str = xtreamVODStream.f20723b;
            }
            if (str != null) {
                map.putIfAbsent(str, wVar);
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = S4.x.f9477k;
        concurrentHashMap.clear();
        concurrentHashMap.putAll(map);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x020c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0230  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final java.lang.Object b(java.util.List list, java.util.List list2, int i3, C5.C0132n0 c0132n0, p117n6.c cVar) {
        S4.t tVar;
        java.util.List list3;
        java.util.Map map;
        S4.t tVar2;
        java.util.Map map2;
        java.util.Map map3;
        p194x6.j jVar;
        int i9;
        final java.util.Map map4;
        final java.util.Map map5;
        final java.util.Map map6;
        final int i10;
        kotlin.jvm.internal.y yVar;
        p109m6.a aVar;
        kotlin.jvm.internal.y yVar2;
        java.util.List list4;
        java.util.ArrayList arrayList;
        p109m6.a aVar2;
        java.util.Map map7;
        java.util.Map map8;
        java.util.Map map9;
        kotlin.jvm.internal.y yVar3;
        kotlin.jvm.internal.y yVar4;
        int i11;
        int i12;
        p194x6.j jVar2;
        java.util.List list5;
        final java.util.List list6;
        final java.util.Map map10;
        final java.util.List list7;
        final java.util.Map map11;
        final java.util.Map map12;
        java.util.List list8;
        java.util.Map map13;
        java.util.Map map14;
        java.util.Map map15;
        java.util.Map map16;
        java.util.Map map17;
        java.util.Map map18;
        java.util.List list9;
        java.util.List list10;
        int size;
        p194x6.j jVar3;
        java.util.List list11;
        p194x6.j jVar4;
        java.util.List list12;
        java.util.List list13;
        java.util.Map map19;
        java.util.Map map20;
        java.util.Map map21;
        java.util.Map map22;
        java.util.Map map23;
        java.util.Map map24;
        java.util.List list14;
        if (cVar instanceof S4.t) {
            tVar = (S4.t) cVar;
            int i13 = tVar.f9462x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                tVar.f9462x = i13 - Integer.MIN_VALUE;
            } else {
                tVar = new S4.t(this, cVar);
            }
        } else {
            tVar = new S4.t(this, cVar);
        }
        S4.t tVar3 = tVar;
        java.lang.Object obj = tVar3.f9460v;
        p109m6.a aVar3 = p109m6.a.f25430h;
        int i14 = tVar3.f9462x;
        if (i14 != 0) {
            if (i14 == 1) {
                i11 = tVar3.f9459u;
                int i15 = tVar3.f9458t;
                kotlin.jvm.internal.y yVar5 = tVar3.f9457s;
                kotlin.jvm.internal.y yVar6 = tVar3.f9456r;
                java.util.List list15 = tVar3.f9455q;
                java.util.Map map25 = tVar3.f9454p;
                java.util.Map map26 = tVar3.f9453o;
                java.util.Map map27 = tVar3.f9452n;
                map8 = tVar3.f9451m;
                java.util.Map map28 = tVar3.f9450l;
                java.util.Map map29 = tVar3.f9449k;
                jVar2 = tVar3.j;
                java.util.List list16 = tVar3.f9448i;
                list4 = tVar3.f9447h;
                com.google.common.util.concurrent.P.u0(obj);
                i12 = i15;
                aVar2 = aVar3;
                map9 = map28;
                map2 = map26;
                list14 = list15;
                yVar3 = yVar6;
                yVar4 = yVar5;
                map = map25;
                tVar2 = tVar3;
                map7 = map29;
                map3 = map27;
                list3 = list16;
            } else {
                if (i14 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.util.List list17 = tVar3.f9455q;
                map24 = tVar3.f9454p;
                map23 = tVar3.f9453o;
                map22 = tVar3.f9452n;
                map21 = tVar3.f9451m;
                map20 = tVar3.f9450l;
                map19 = tVar3.f9449k;
                jVar4 = tVar3.j;
                list13 = tVar3.f9448i;
                list11 = tVar3.f9447h;
                com.google.common.util.concurrent.P.u0(obj);
                list12 = list17;
            }
            list10 = list12;
            map18 = map24;
            map17 = map23;
            map16 = map22;
            map15 = map21;
            map14 = map20;
            map13 = map19;
            jVar = jVar4;
            list8 = list13;
            list9 = list11;
            jVar.invoke(new java.lang.Float(1.0f));
            return new S4.x(map13, map14, map15, map16, map17, map18, list10, list9, list8, list10.size());
        }
        com.google.common.util.concurrent.P.u0(obj);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size2 = list != null ? list.size() : 0;
        int size3 = size2 + (list2 != null ? list2.size() : 0);
        if (size3 == 0) {
            c0132n0.invoke(new java.lang.Float(1.0f));
            return new S4.x(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, arrayList2, list, list2, 0);
        }
        kotlin.jvm.internal.y yVar7 = new kotlin.jvm.internal.y();
        yVar7.f24555h = O7.r.s(i3, 200, org.videolan.libvlc.media.MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING);
        kotlin.jvm.internal.y yVar8 = new kotlin.jvm.internal.y();
        c0132n0.invoke(new java.lang.Float(0.0f));
        if (list != null) {
            int size4 = list.size();
            list3 = list2;
            H5.C0382c c0382c = new H5.C0382c(list, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, arrayList2);
            map = linkedHashMap6;
            tVar3.f9447h = list;
            tVar3.f9448i = list3;
            tVar3.j = c0132n0;
            tVar3.f9449k = linkedHashMap;
            tVar3.f9450l = linkedHashMap2;
            tVar3.f9451m = linkedHashMap3;
            tVar3.f9452n = linkedHashMap4;
            tVar3.f9453o = linkedHashMap5;
            tVar3.f9454p = map;
            tVar3.f9455q = arrayList;
            tVar3.f9456r = yVar7;
            tVar3.f9457s = yVar8;
            tVar3.f9458t = size2;
            tVar3.f9459u = size3;
            tVar3.f9462x = 1;
            tVar2 = tVar3;
            map3 = linkedHashMap4;
            map2 = linkedHashMap5;
            aVar2 = aVar3;
            if (c(yVar7, yVar8, c0132n0, size3, size4, c0382c, tVar2) == aVar2) {
                arrayList = arrayList2;
                return aVar2;
            }
            arrayList = arrayList2;
            map7 = linkedHashMap;
            map8 = linkedHashMap3;
            map9 = linkedHashMap2;
            yVar3 = yVar7;
            yVar4 = yVar8;
            i11 = size3;
            i12 = size2;
            list4 = list;
            jVar2 = c0132n0;
            list14 = arrayList;
        } else {
            list3 = list2;
            map = linkedHashMap6;
            tVar2 = tVar3;
            map2 = linkedHashMap5;
            map3 = linkedHashMap4;
            jVar = c0132n0;
            i9 = size3;
            map4 = linkedHashMap;
            map5 = linkedHashMap2;
            map6 = linkedHashMap3;
            i10 = size2;
            yVar = yVar8;
            aVar = aVar3;
            yVar2 = yVar7;
            list4 = list;
            list5 = arrayList2;
        }
        list6 = list5;
        map10 = map;
        list7 = list3;
        map11 = map3;
        map12 = map2;
        if (list7 != null) {
            size = list7.size();
            jVar3 = new p194x6.j() { // from class: S4.s
                @Override // p194x6.j
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    com.kiptv.core.model.XtreamSeries xtreamSeries = (com.kiptv.core.model.XtreamSeries) list7.get(iIntValue);
                    S4.v vVar = S4.x.Companion;
                    java.lang.String str = xtreamSeries.f20683b;
                    int i16 = i10 + iIntValue;
                    java.lang.Integer numE = xtreamSeries.e();
                    vVar.getClass();
                    S4.w wVarD = S4.v.d(str, i16, numE);
                    S4.v.e(wVarD, map4, map5, map6, map11, map12, map10);
                    list6.add(wVarD);
                    return p070h6.A.f22523a;
                }
            };
            tVar2.f9447h = list4;
            tVar2.f9448i = list7;
            tVar2.j = jVar;
            tVar2.f9449k = map4;
            tVar2.f9450l = map5;
            tVar2.f9451m = map6;
            tVar2.f9452n = map11;
            tVar2.f9453o = map12;
            tVar2.f9454p = map10;
            tVar2.f9455q = list6;
            tVar2.f9456r = null;
            tVar2.f9457s = null;
            tVar2.f9462x = 2;
            if (c(yVar2, yVar, jVar, i9, size, jVar3, tVar2) == aVar) {
                return aVar;
            }
            list11 = list4;
            jVar4 = jVar;
            list12 = list6;
            list13 = list7;
            map19 = map4;
            map20 = map5;
            map21 = map6;
            map22 = map11;
            map23 = map12;
            map24 = map10;
            list10 = list12;
            map18 = map24;
            map17 = map23;
            map16 = map22;
            map15 = map21;
            map14 = map20;
            map13 = map19;
            jVar = jVar4;
            list8 = list13;
            list9 = list11;
        } else {
            list8 = list7;
            map13 = map4;
            map14 = map5;
            map15 = map6;
            map16 = map11;
            map17 = map12;
            map18 = map10;
            list9 = list4;
            list10 = list6;
        }
        jVar.invoke(new java.lang.Float(1.0f));
        return new S4.x(map13, map14, map15, map16, map17, map18, list10, list9, list8, list10.size());
        kotlin.jvm.internal.y yVar9 = yVar3;
        i9 = i11;
        aVar = aVar2;
        yVar2 = yVar9;
        i10 = i12;
        yVar = yVar4;
        map6 = map8;
        map4 = map7;
        map5 = map9;
        jVar = jVar2;
        list5 = list14;
        list6 = list5;
        map10 = map;
        list7 = list3;
        map11 = map3;
        map12 = map2;
        if (list7 != null) {
            size = list7.size();
            jVar3 = new p194x6.j() { // from class: S4.s
                @Override // p194x6.j
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    com.kiptv.core.model.XtreamSeries xtreamSeries = (com.kiptv.core.model.XtreamSeries) list7.get(iIntValue);
                    S4.v vVar = S4.x.Companion;
                    java.lang.String str = xtreamSeries.f20683b;
                    int i16 = i10 + iIntValue;
                    java.lang.Integer numE = xtreamSeries.e();
                    vVar.getClass();
                    S4.w wVarD = S4.v.d(str, i16, numE);
                    S4.v.e(wVarD, map4, map5, map6, map11, map12, map10);
                    list6.add(wVarD);
                    return p070h6.A.f22523a;
                }
            };
            tVar2.f9447h = list4;
            tVar2.f9448i = list7;
            tVar2.j = jVar;
            tVar2.f9449k = map4;
            tVar2.f9450l = map5;
            tVar2.f9451m = map6;
            tVar2.f9452n = map11;
            tVar2.f9453o = map12;
            tVar2.f9454p = map10;
            tVar2.f9455q = list6;
            tVar2.f9456r = null;
            tVar2.f9457s = null;
            tVar2.f9462x = 2;
            if (c(yVar2, yVar, jVar, i9, size, jVar3, tVar2) == aVar) {
                return aVar;
            }
            list11 = list4;
            jVar4 = jVar;
            list12 = list6;
            list13 = list7;
            map19 = map4;
            map20 = map5;
            map21 = map6;
            map22 = map11;
            map23 = map12;
            map24 = map10;
            list10 = list12;
            map18 = map24;
            map17 = map23;
            map16 = map22;
            map15 = map21;
            map14 = map20;
            map13 = map19;
            jVar = jVar4;
            list8 = list13;
            list9 = list11;
        } else {
            list8 = list7;
            map13 = map4;
            map14 = map5;
            map15 = map6;
            map16 = map11;
            map17 = map12;
            map18 = map10;
            list9 = list4;
            list10 = list6;
        }
        jVar.invoke(new java.lang.Float(1.0f));
        return new S4.x(map13, map14, map15, map16, map17, map18, list10, list9, list8, list10.size());
    }
}
