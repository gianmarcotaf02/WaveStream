package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class O {
    public static final p005a5.J Companion = new p005a5.J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.v2 f13716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1291h4 f13717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.n9 f13718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f13719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p034d5.c f13720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p028c8.d f13721f;
    public final java.util.LinkedHashMap g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.n0 f13722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.W f13723i;

    public O(Y4.v2 xtreamApiClient, p005a5.C1291h4 settingsRepository, p005a5.n9 xmlTvRepository) {
        kotlin.jvm.internal.m.e(xtreamApiClient, "xtreamApiClient");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(xmlTvRepository, "xmlTvRepository");
        this.f13716a = xtreamApiClient;
        this.f13717b = settingsRepository;
        this.f13718c = xmlTvRepository;
        this.f13719d = new java.util.concurrent.ConcurrentHashMap();
        this.f13720e = new p034d5.c(5, 1000L);
        this.f13721f = new p028c8.d();
        this.g = new java.util.LinkedHashMap();
        V7.n0 n0VarB = V7.r.b(0L);
        this.f13722h = n0VarB;
        this.f13723i = new V7.W(n0VarB);
    }

    public static /* synthetic */ java.lang.Object g(p005a5.O o8, int i3, java.lang.String str, int i9, int i10, p117n6.c cVar, int i11) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return o8.f(i3, i9, i10, str, null, cVar);
    }

    public static com.kiptv.core.model.C1949j j(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            com.kiptv.core.model.EPGProgram ePGProgram = (com.kiptv.core.model.EPGProgram) obj;
            long j = ePGProgram.f19742e;
            long j9 = ePGProgram.f19741d;
            if (j > j9 && j - j9 <= 43200000) {
                arrayList.add(obj);
            }
        }
        java.util.List<com.kiptv.core.model.EPGProgram> listI1 = p078i6.o.I1(arrayList, new com.kiptv.core.model.C1951k(0));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(listI1.size());
        for (com.kiptv.core.model.EPGProgram ePGProgram2 : listI1) {
            com.kiptv.core.model.EPGProgram ePGProgram3 = (com.kiptv.core.model.EPGProgram) p078i6.o.s1(arrayList2);
            if (ePGProgram3 == null || ePGProgram2.f19741d >= ePGProgram3.f19742e) {
                arrayList2.add(ePGProgram2);
            }
        }
        return new com.kiptv.core.model.C1949j(arrayList2, (java.lang.String) null, 6);
    }

    public final p070h6.k a(int i3, java.lang.String str, java.lang.String str2) {
        java.lang.Object next;
        java.lang.Object next2;
        java.util.List listI = this.f13718c.i(str, str2);
        if (listI != null) {
            if (listI.isEmpty()) {
                listI = null;
            }
            if (listI != null) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - (((long) i3) * 60000);
                java.util.Iterator it = listI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    com.kiptv.core.model.EPGProgram ePGProgram = (com.kiptv.core.model.EPGProgram) next;
                    if (ePGProgram.f19741d <= jCurrentTimeMillis && jCurrentTimeMillis < ePGProgram.f19742e) {
                        break;
                    }
                }
                com.kiptv.core.model.EPGProgram ePGProgram2 = (com.kiptv.core.model.EPGProgram) next;
                N7.h hVar = new N7.h(N7.o.k0(p078i6.o.Y0(listI), new J.C0537c(jCurrentTimeMillis, 3)));
                if (hVar.hasNext()) {
                    next2 = hVar.next();
                    if (hVar.hasNext()) {
                        long j = ((com.kiptv.core.model.EPGProgram) next2).f19741d;
                        do {
                            java.lang.Object next3 = hVar.next();
                            long j9 = ((com.kiptv.core.model.EPGProgram) next3).f19741d;
                            if (j > j9) {
                                next2 = next3;
                                j = j9;
                            }
                        } while (hVar.hasNext());
                    }
                } else {
                    next2 = null;
                }
                com.kiptv.core.model.EPGProgram ePGProgram3 = (com.kiptv.core.model.EPGProgram) next2;
                if (ePGProgram2 != null || ePGProgram3 != null) {
                    return new p070h6.k(ePGProgram2 != null ? ePGProgram2.h(i3) : null, ePGProgram3 != null ? ePGProgram3.h(i3) : null);
                }
            }
        }
        return null;
    }

    public final void b() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f13719d;
        if (concurrentHashMap.size() <= 200) {
            return;
        }
        com.kiptv.core.model.PlaylistSettings playlistSettingsA = this.f13717b.a();
        int i3 = playlistSettingsA != null ? playlistSettingsA.f20063k : 60;
        if (i3 < 1) {
            i3 = 1;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / (((long) i3) * 60000);
        java.util.Set setF0 = p078i6.m.F0(new java.lang.Long[]{java.lang.Long.valueOf(jCurrentTimeMillis), java.lang.Long.valueOf(jCurrentTimeMillis + 1)});
        java.util.Set setKeySet = concurrentHashMap.keySet();
        kotlin.jvm.internal.m.d(setKeySet, "<get-keys>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setKeySet) {
            java.lang.String str = (java.lang.String) obj;
            kotlin.jvm.internal.m.b(str);
            java.lang.Long lA0 = O7.x.A0(O7.q.k1('-', str, str));
            if (lA0 == null || !setF0.contains(lA0)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            concurrentHashMap.remove((java.lang.String) it.next());
        }
        android.util.Log.d("EPGRepository", "EPG cache cleanup removed " + arrayList.size() + ", now=" + concurrentHashMap.size());
    }

    public final void c() {
        this.f13719d.clear();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:73|24|(1:26)(1:27)|28|(1:31)|63) */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9 A[Catch: Exception -> 0x0065, CancellationException -> 0x006d, TryCatch #1 {CancellationException -> 0x006d, blocks: (B:24:0x007f, B:28:0x0087, B:32:0x00a8, B:33:0x00b3, B:35:0x00b9, B:37:0x00ca, B:39:0x00cf, B:41:0x00df, B:43:0x0100, B:16:0x0061), top: B:75:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca A[Catch: Exception -> 0x0065, CancellationException -> 0x006d, TryCatch #1 {CancellationException -> 0x006d, blocks: (B:24:0x007f, B:28:0x0087, B:32:0x00a8, B:33:0x00b3, B:35:0x00b9, B:37:0x00ca, B:39:0x00cf, B:41:0x00df, B:43:0x0100, B:16:0x0061), top: B:75:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00df A[Catch: Exception -> 0x0065, CancellationException -> 0x006d, TryCatch #1 {CancellationException -> 0x006d, blocks: (B:24:0x007f, B:28:0x0087, B:32:0x00a8, B:33:0x00b3, B:35:0x00b9, B:37:0x00ca, B:39:0x00cf, B:41:0x00df, B:43:0x0100, B:16:0x0061), top: B:75:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0100 A[Catch: Exception -> 0x0065, CancellationException -> 0x006d, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x006d, blocks: (B:24:0x007f, B:28:0x0087, B:32:0x00a8, B:33:0x00b3, B:35:0x00b9, B:37:0x00ca, B:39:0x00cf, B:41:0x00df, B:43:0x0100, B:16:0x0061), top: B:75:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:53:0x0142  */
    /* JADX WARN: Code duplicated, block: B:56:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        r21 = r6;
        r6 = r4;
        r4 = r13;
        r13 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00df, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x0100, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x014c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01b0 -> B:65:0x01b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01bb -> B:23:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(int i3, int i9, java.lang.String str, p117n6.c cVar) {
        p005a5.K k9;
        p005a5.O o8;
        int i10;
        java.lang.String str2;
        p005a5.K k10;
        p005a5.O o9;
        java.lang.Exception e6;
        int i11;
        int i12;
        java.lang.String str3;
        int i13;
        java.lang.String str4;
        int i14;
        int i15;
        java.lang.String message;
        if (cVar instanceof p005a5.K) {
            k9 = (p005a5.K) cVar;
            int i16 = k9.f13566p;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                k9.f13566p = i16 - Integer.MIN_VALUE;
                o8 = this;
            } else {
                o8 = this;
                k9 = new p005a5.K(o8, cVar);
            }
        } else {
            o8 = this;
            k9 = new p005a5.K(o8, cVar);
        }
        java.lang.Object objH = k9.f13564n;
        p109m6.a aVar = p109m6.a.f25430h;
        int i17 = k9.f13566p;
        int i18 = 1;
        int i19 = 3;
        java.lang.String str5 = "TvEPGDiag";
        java.lang.Exception exc = null;
        java.lang.String str6 = 0;
        try {
            if (i17 == 0) {
                com.google.common.util.concurrent.P.u0(objH);
                i10 = i9;
                str2 = str;
                k10 = k9;
                o9 = o8;
                e6 = null;
                i11 = 0;
                i12 = i3;
                if (i11 < i19) {
                    if (e6 != null) {
                        message = e6.getMessage();
                    } else {
                        message = null;
                    }
                    android.util.Log.d("EPGRepository", "EPG fetch exhausted retries for " + i12 + ": " + message);
                    return com.kiptv.core.model.C1947i.a(com.kiptv.core.model.C1949j.Companion, "livetv.epgRateLimited", 2);
                }
                Y4.v2 v2Var = o9.f13716a;
                i15 = 200;
                if (i10 < 200) {
                    i15 = i10;
                }
                k10.f13559h = o9;
                k10.f13560i = str2;
                k10.j = exc;
                k10.f13561k = i12;
                k10.f13562l = i10;
                k10.f13563m = i11;
                k10.f13566p = i18;
                objH = v2Var.h(i12, i15, str2, k10);
                if (objH != aVar) {
                    i14 = i12;
                    str3 = str2;
                    str6 = exc;
                }
                return aVar;
            }
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i20 = k9.f13563m;
                int i21 = k9.f13562l;
                int i22 = k9.f13561k;
                java.lang.Exception exc2 = k9.j;
                java.lang.String str7 = k9.f13560i;
                p005a5.O o10 = k9.f13559h;
                com.google.common.util.concurrent.P.u0(objH);
                k10 = k9;
                i12 = i22;
                o9 = o10;
                str2 = str7;
                i11 = i20;
                i10 = i21;
                str4 = "TvEPGDiag";
                e6 = exc2;
                str5 = str4;
                i18 = 1;
                i19 = 3;
                exc = null;
                if (i11 < i19) {
                    if (e6 != null) {
                        message = e6.getMessage();
                    } else {
                        message = null;
                    }
                    android.util.Log.d("EPGRepository", "EPG fetch exhausted retries for " + i12 + ": " + message);
                    return com.kiptv.core.model.C1947i.a(com.kiptv.core.model.C1949j.Companion, "livetv.epgRateLimited", 2);
                }
                Y4.v2 v2Var2 = o9.f13716a;
                i15 = 200;
                if (i10 < 200) {
                    i15 = i10;
                }
                k10.f13559h = o9;
                k10.f13560i = str2;
                k10.j = exc;
                k10.f13561k = i12;
                k10.f13562l = i10;
                k10.f13563m = i11;
                k10.f13566p = i18;
                objH = v2Var2.h(i12, i15, str2, k10);
                if (objH != aVar) {
                    i14 = i12;
                    str3 = str2;
                    str6 = exc;
                }
                return aVar;
            }
            int i23 = k9.f13563m;
            int i24 = k9.f13562l;
            i14 = k9.f13561k;
            str3 = k9.f13560i;
            o9 = k9.f13559h;
            try {
                com.google.common.util.concurrent.P.u0(objH);
            } catch (java.lang.Exception e9) {
                e6 = e9;
                k10 = k9;
                i12 = i14;
                java.lang.String message2 = e6.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                if (O7.q.B0(message2, "429", false)) {
                    i13 = 1;
                } else {
                    i13 = 1;
                    if (!O7.q.B0(message2, "rate", true)) {
                        android.util.Log.w(str5, "api FAIL stream=" + i12 + " epgId=" + str3 + ": " + message2);
                        return com.kiptv.core.model.C1947i.a(com.kiptv.core.model.C1949j.Companion, "livetv.epgLoadError", 2);
                    }
                }
                int i25 = i23 + 1;
                if (i25 < i19) {
                    str4 = str5;
                    long j = (1 << i23) * 5000;
                    java.lang.StringBuilder sbS = p121o0.p.s(i12, i25, "api rate limited stream=", ", retry ", " in ");
                    sbS.append(j);
                    sbS.append("ms");
                    android.util.Log.w(str4, sbS.toString());
                    k10.f13559h = o9;
                    k10.f13560i = str3;
                    k10.j = e6;
                    k10.f13561k = i12;
                    k10.f13562l = i24;
                    k10.f13563m = i25;
                    k10.f13566p = 2;
                    if (S7.C.n(j, k10) != aVar) {
                        i10 = i24;
                        str2 = str3;
                        i11 = i25;
                        str5 = str4;
                        i18 = 1;
                        i19 = 3;
                        exc = null;
                        if (i11 < i19) {
                            if (e6 != null) {
                                message = e6.getMessage();
                            } else {
                                message = null;
                            }
                            android.util.Log.d("EPGRepository", "EPG fetch exhausted retries for " + i12 + ": " + message);
                            return com.kiptv.core.model.C1947i.a(com.kiptv.core.model.C1949j.Companion, "livetv.epgRateLimited", 2);
                        }
                        Y4.v2 v2Var3 = o9.f13716a;
                        i15 = 200;
                        if (i10 < 200) {
                            i15 = i10;
                        }
                        k10.f13559h = o9;
                        k10.f13560i = str2;
                        k10.j = exc;
                        k10.f13561k = i12;
                        k10.f13562l = i10;
                        k10.f13563m = i11;
                        k10.f13566p = i18;
                        objH = v2Var3.h(i12, i15, str2, k10);
                        if (objH != aVar) {
                            i14 = i12;
                            str3 = str2;
                            str6 = exc;
                        }
                    }
                } else {
                    i10 = i24;
                    str2 = str3;
                    exc = null;
                    i11 = i25;
                    i18 = i13;
                    if (i11 < i19) {
                        if (e6 != null) {
                            message = e6.getMessage();
                        } else {
                            message = null;
                        }
                        android.util.Log.d("EPGRepository", "EPG fetch exhausted retries for " + i12 + ": " + message);
                        return com.kiptv.core.model.C1947i.a(com.kiptv.core.model.C1949j.Companion, "livetv.epgRateLimited", 2);
                    }
                    Y4.v2 v2Var4 = o9.f13716a;
                    i15 = 200;
                    if (i10 < 200) {
                        i15 = i10;
                    }
                    k10.f13559h = o9;
                    k10.f13560i = str2;
                    k10.j = exc;
                    k10.f13561k = i12;
                    k10.f13562l = i10;
                    k10.f13563m = i11;
                    k10.f13566p = i18;
                    objH = v2Var4.h(i12, i15, str2, k10);
                    if (objH != aVar) {
                        i14 = i12;
                        str3 = str2;
                        str6 = exc;
                    }
                }
                return aVar;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.kiptv.core.model.B0 b9 : (java.lang.Iterable) objH) {
                com.kiptv.core.model.EPGProgram.INSTANCE.getClass();
                com.kiptv.core.model.EPGProgram ePGProgramA = com.kiptv.core.model.EPGProgram.Companion.a(b9);
                if (ePGProgramA != null) {
                    arrayList.add(ePGProgramA);
                }
            }
            java.util.List listI1 = p078i6.o.I1(arrayList, new p005a5.B(1));
            if (listI1.isEmpty()) {
                android.util.Log.d(str5, "api empty stream=" + i14 + " epgId=" + str3);
                return com.kiptv.core.model.C1947i.a(com.kiptv.core.model.C1949j.Companion, str6, i19);
            }
            android.util.Log.d(str5, "api ok stream=" + i14 + " programs=" + listI1.size());
            o9.getClass();
            return j(listI1);
        } catch (java.util.concurrent.CancellationException e10) {
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final java.lang.Object e(int i3, int i9, int i10, java.lang.String str, java.lang.String str2, p117n6.c cVar) {
        p005a5.L l2;
        p005a5.O o8;
        java.lang.String channelName;
        int i11;
        com.kiptv.core.model.C1949j c1949j;
        int i12;
        java.util.List list;
        if (cVar instanceof p005a5.L) {
            l2 = (p005a5.L) cVar;
            int i13 = l2.f13605l;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                l2.f13605l = i13 - Integer.MIN_VALUE;
                o8 = this;
            } else {
                o8 = this;
                l2 = new p005a5.L(o8, cVar);
            }
        } else {
            o8 = this;
            l2 = new p005a5.L(o8, cVar);
        }
        p005a5.L l9 = l2;
        java.lang.Object objG = l9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i14 = l9.f13605l;
        java.util.ArrayList arrayList = null;
        if (i14 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            channelName = str2;
            try {
                l9.f13603i = channelName;
                i11 = i9;
                try {
                    l9.f13602h = i11;
                    l9.f13605l = 1;
                    objG = g(o8, i3, str, 200, i10, l9, 16);
                    if (objG == aVar) {
                        return aVar;
                    }
                    c1949j = (com.kiptv.core.model.C1949j) objG;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    android.util.Log.d("EPGRepository", "getCatchupEPG live fetch failed: " + e.getMessage());
                    c1949j = null;
                }
            } catch (java.lang.Exception e9) {
                e = e9;
                i11 = i9;
                android.util.Log.d("EPGRepository", "getCatchupEPG live fetch failed: " + e.getMessage());
                c1949j = null;
            }
        } else {
            if (i14 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = l9.f13602h;
            java.lang.String str3 = l9.f13603i;
            try {
                com.google.common.util.concurrent.P.u0(objG);
                i11 = i15;
                channelName = str3;
                c1949j = (com.kiptv.core.model.C1949j) objG;
            } catch (java.lang.Exception e10) {
                e = e10;
                i11 = i15;
                channelName = str3;
                android.util.Log.d("EPGRepository", "getCatchupEPG live fetch failed: " + e.getMessage());
                c1949j = null;
            }
        }
        if (c1949j != null && (list = c1949j.f20780a) != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                com.kiptv.core.model.EPGProgram ePGProgram = (com.kiptv.core.model.EPGProgram) obj;
                if (ePGProgram.g() || ePGProgram.f()) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            return p078i6.o.I1(arrayList, new p005a5.B(2));
        }
        com.kiptv.core.model.EPGProgram.INSTANCE.getClass();
        kotlin.jvm.internal.m.e(channelName, "channelName");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int iMax = java.lang.Math.max(i11, 1);
        int i16 = 0;
        int i17 = 0;
        while (i17 < iMax) {
            calendar.setTimeInMillis(jCurrentTimeMillis);
            calendar.add(6, -i17);
            calendar.set(11, i16);
            calendar.set(12, i16);
            calendar.set(13, i16);
            calendar.set(14, i16);
            long timeInMillis = calendar.getTimeInMillis();
            long j = timeInMillis / ((long) 1000);
            int iX = com.google.crypto.tink.shaded.protobuf.AbstractC1911f.x(i16, 20, 4);
            if (iX >= 0) {
                int i18 = i16;
                while (true) {
                    calendar.setTimeInMillis(timeInMillis);
                    calendar.set(11, i18);
                    long timeInMillis2 = calendar.getTimeInMillis();
                    if (timeInMillis2 < jCurrentTimeMillis) {
                        calendar.add(11, 4);
                        i12 = i17;
                        long jMin = java.lang.Math.min(calendar.getTimeInMillis(), jCurrentTimeMillis);
                        if (jMin - timeInMillis2 > 60000) {
                            arrayList2.add(new com.kiptv.core.model.EPGProgram("synthetic-block-" + j + "-" + i18, java.lang.String.format("%02d:00 – %02d:00", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf((i18 + 4) % 24)}, 2)), (java.lang.String) null, timeInMillis2, jMin, 36));
                        }
                    } else {
                        i12 = i17;
                    }
                    if (i18 != iX) {
                        i18 += 4;
                        i17 = i12;
                    }
                }
            } else {
                i12 = i17;
            }
            i17 = i12 + 1;
            i16 = 0;
        }
        return p078i6.o.I1(arrayList2, new com.kiptv.core.model.C1951k(1));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object f(int i3, int i9, int i10, java.lang.String str, java.lang.String str2, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.M m8;
        if (cVar instanceof p005a5.M) {
            m8 = (p005a5.M) cVar;
            int i11 = m8.f13640k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m8.f13640k = i11 - Integer.MIN_VALUE;
            } else {
                m8 = new p005a5.M(this, cVar);
            }
        } else {
            m8 = new p005a5.M(this, cVar);
        }
        p005a5.M m9 = m8;
        java.lang.Object objH = m9.f13639i;
        java.lang.Object obj = p109m6.a.f25430h;
        int i12 = m9.f13640k;
        if (i12 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            m9.f13638h = i10;
            m9.f13640k = 1;
            objH = h(i3, str, i9, str2, m9);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = m9.f13638h;
            com.google.common.util.concurrent.P.u0(objH);
        }
        com.kiptv.core.model.C1949j c1949j = (com.kiptv.core.model.C1949j) objH;
        c1949j.getClass();
        if (i10 == 0) {
            return c1949j;
        }
        java.util.List list = c1949j.f20780a;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.kiptv.core.model.EPGProgram) it.next()).h(i10));
        }
        return new com.kiptv.core.model.C1949j(c1949j.f20781b, c1949j.f20782c, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017e A[Catch: all -> 0x02ad, TryCatch #7 {all -> 0x02ad, blocks: (B:56:0x0174, B:58:0x017e, B:59:0x0186), top: B:136:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0186 A[Catch: all -> 0x02ad, TRY_LEAVE, TryCatch #7 {all -> 0x02ad, blocks: (B:56:0x0174, B:58:0x017e, B:59:0x0186), top: B:136:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ff A[Catch: all -> 0x0274, TRY_ENTER, TryCatch #0 {all -> 0x0274, blocks: (B:87:0x021c, B:66:0x01bf, B:83:0x01ff), top: B:122:0x01bf }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0216  */
    /* JADX WARN: Code duplicated, block: B:86:0x0218  */
    /* JADX WARN: Code duplicated, block: B:90:0x022f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0262  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object h(int i3, java.lang.String str, int i9, java.lang.String str2, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.N n3;
        int i10;
        p005a5.O o8;
        java.lang.String str3;
        p028c8.a aVar;
        java.lang.String str4;
        S7.InterfaceC0900p interfaceC0900p;
        p070h6.k kVar;
        S7.InterfaceC0900p interfaceC0900p2;
        p005a5.I i11;
        p034d5.c cVar2;
        int i12;
        int i13;
        java.lang.String str5;
        com.kiptv.core.model.C1949j c1949j;
        p028c8.d dVar;
        java.lang.String str6;
        p005a5.O o9;
        java.lang.Object objK;
        p028c8.a aVar2;
        S7.InterfaceC0900p interfaceC0900p3;
        java.lang.Object objD;
        java.lang.String str7;
        p005a5.O o10;
        java.lang.Throwable th;
        java.lang.String str8;
        p005a5.O o11;
        p028c8.d dVar2;
        java.lang.String str9;
        p005a5.O o12;
        p028c8.a aVar3;
        p028c8.a aVar4;
        p028c8.a aVar5;
        if (cVar instanceof p005a5.N) {
            n3 = (p005a5.N) cVar;
            int i14 = n3.f13686p;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n3.f13686p = i14 - Integer.MIN_VALUE;
            } else {
                n3 = new p005a5.N(this, cVar);
            }
        } else {
            n3 = new p005a5.N(this, cVar);
        }
        java.lang.Object obj = n3.f13684n;
        p109m6.a aVar6 = p109m6.a.f25430h;
        switch (n3.f13686p) {
            case 0:
                com.google.common.util.concurrent.P.u0(obj);
                com.kiptv.core.model.PlaylistSettings playlistSettingsA = this.f13717b.a();
                int i15 = playlistSettingsA != null ? playlistSettingsA.f20063k : 60;
                if (i15 < 1) {
                    i15 = 1;
                }
                java.lang.String str10 = "epg-" + i3 + "-" + (java.lang.System.currentTimeMillis() / (((long) i15) * 60000));
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f13719d;
                p005a5.I i16 = (p005a5.I) concurrentHashMap.get(str10);
                if (i16 != null) {
                    return i16.f13495a;
                }
                p005a5.n9 n9Var = this.f13718c;
                java.util.List listI = n9Var.i(str, str2);
                if (listI != null) {
                    if (listI.isEmpty()) {
                        listI = null;
                    }
                    if (listI != null) {
                        com.kiptv.core.model.C1949j c1949jJ = j(p078i6.o.I1(listI, new p005a5.B(3)));
                        concurrentHashMap.put(str10, new p005a5.I(c1949jJ, java.lang.System.currentTimeMillis()));
                        b();
                        return c1949jJ;
                    }
                }
                boolean zF = n9Var.f();
                p005a5.l9 l9Var = n9Var.f14840c;
                android.util.Log.d("TvEPGDiag", "source=api (xmltv miss) stream=" + i3 + " epgId=" + str + " xmltvAvailable=" + zF + " xmltvChannels=" + (l9Var != null ? l9Var.f14747a.size() : 0));
                p028c8.d dVar3 = this.f13721f;
                n3.f13679h = this;
                n3.f13680i = str;
                n3.j = str10;
                n3.f13681k = dVar3;
                n3.f13682l = i3;
                i10 = i9;
                n3.f13683m = i10;
                n3.f13686p = 1;
                if (dVar3.e(n3) != aVar6) {
                    o8 = this;
                    str3 = str;
                    aVar = dVar3;
                    str4 = str10;
                    try {
                        interfaceC0900p = (S7.InterfaceC0900p) o8.g.get(str4);
                        if (interfaceC0900p != null) {
                            kVar = new p070h6.k(interfaceC0900p, java.lang.Boolean.FALSE);
                        } else {
                            S7.C0901q c0901qB = S7.C.b();
                            o8.g.put(str4, c0901qB);
                            kVar = new p070h6.k(c0901qB, java.lang.Boolean.TRUE);
                        }
                        ((p028c8.d) aVar).g(null);
                        interfaceC0900p2 = (S7.InterfaceC0900p) kVar.f22539h;
                        if (((java.lang.Boolean) kVar.f22540i).booleanValue()) {
                            try {
                                i11 = (p005a5.I) o8.f13719d.get(str4);
                                if (i11 != null) {
                                    c1949j = i11.f13495a;
                                    try {
                                        try {
                                            ((S7.C0901q) interfaceC0900p2).J(c1949j);
                                            dVar = o8.f13721f;
                                            n3.f13679h = o8;
                                            n3.f13680i = str4;
                                            n3.j = c1949j;
                                            n3.f13681k = dVar;
                                            n3.f13686p = 3;
                                            if (dVar.e(n3) != aVar6) {
                                                str6 = str4;
                                                o9 = o8;
                                                aVar2 = dVar;
                                                aVar3 = aVar2;
                                                return c1949j;
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            interfaceC0900p3 = interfaceC0900p2;
                                            try {
                                                ((S7.C0901q) interfaceC0900p3).Z(th);
                                                try {
                                                    throw th;
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                    p028c8.d dVar4 = o8.f13721f;
                                                    n3.f13679h = o8;
                                                    n3.f13680i = str4;
                                                    n3.j = th;
                                                    n3.f13681k = dVar4;
                                                    n3.f13686p = 7;
                                                    if (dVar4.e(n3) != aVar6) {
                                                        str8 = str4;
                                                        o11 = o8;
                                                        aVar5 = dVar4;
                                                        try {
                                                            throw th;
                                                        } finally {
                                                            ((p028c8.d) aVar5).g(null);
                                                        }
                                                    }
                                                    return aVar6;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                    }
                                } else {
                                    cVar2 = o8.f13720e;
                                    n3.f13679h = o8;
                                    n3.f13680i = str3;
                                    n3.j = str4;
                                    n3.f13681k = interfaceC0900p2;
                                    n3.f13682l = i3;
                                    n3.f13683m = i10;
                                    n3.f13686p = 4;
                                    if (cVar2.a(n3) == aVar6) {
                                        java.lang.String str11 = str3;
                                        i12 = i3;
                                        i13 = i10;
                                        str5 = str11;
                                        n3.f13679h = o8;
                                        n3.f13680i = str4;
                                        n3.j = interfaceC0900p2;
                                        n3.f13681k = null;
                                        n3.f13686p = 5;
                                        objD = o8.d(i12, i13, str5, n3);
                                        if (objD != aVar6) {
                                            S7.InterfaceC0900p interfaceC0900p4 = interfaceC0900p2;
                                            obj = objD;
                                            interfaceC0900p3 = interfaceC0900p4;
                                            str7 = str4;
                                            o10 = o8;
                                            c1949j = (com.kiptv.core.model.C1949j) obj;
                                            o10.f13719d.put(str7, new p005a5.I(c1949j, java.lang.System.currentTimeMillis()));
                                            o10.b();
                                            ((S7.C0901q) interfaceC0900p3).J(c1949j);
                                            dVar2 = o10.f13721f;
                                            n3.f13679h = o10;
                                            n3.f13680i = str7;
                                            n3.j = c1949j;
                                            n3.f13681k = dVar2;
                                            n3.f13686p = 6;
                                            if (dVar2.e(n3) != aVar6) {
                                                str9 = str7;
                                                o12 = o10;
                                                aVar4 = dVar2;
                                                try {
                                                    aVar3 = aVar4;
                                                    return c1949j;
                                                } finally {
                                                    ((p028c8.d) aVar4).g(null);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                            }
                        } else {
                            n3.f13679h = null;
                            n3.f13680i = null;
                            n3.j = null;
                            n3.f13681k = null;
                            n3.f13686p = 2;
                            objK = ((S7.C0901q) interfaceC0900p2).k(n3);
                            if (objK == aVar6) {
                                return objK;
                            }
                        }
                    } catch (java.lang.Throwable th7) {
                        ((p028c8.d) aVar).g(null);
                        throw th7;
                    }
                }
                return aVar6;
            case 1:
                int i17 = n3.f13683m;
                int i18 = n3.f13682l;
                aVar = (p028c8.a) n3.f13681k;
                str4 = (java.lang.String) n3.j;
                java.lang.String str12 = n3.f13680i;
                o8 = n3.f13679h;
                com.google.common.util.concurrent.P.u0(obj);
                i10 = i17;
                i3 = i18;
                str3 = str12;
                interfaceC0900p = (S7.InterfaceC0900p) o8.g.get(str4);
                if (interfaceC0900p != null) {
                    kVar = new p070h6.k(interfaceC0900p, java.lang.Boolean.FALSE);
                } else {
                    S7.C0901q c0901qB2 = S7.C.b();
                    o8.g.put(str4, c0901qB2);
                    kVar = new p070h6.k(c0901qB2, java.lang.Boolean.TRUE);
                }
                ((p028c8.d) aVar).g(null);
                interfaceC0900p2 = (S7.InterfaceC0900p) kVar.f22539h;
                if (((java.lang.Boolean) kVar.f22540i).booleanValue()) {
                    n3.f13679h = null;
                    n3.f13680i = null;
                    n3.j = null;
                    n3.f13681k = null;
                    n3.f13686p = 2;
                    objK = ((S7.C0901q) interfaceC0900p2).k(n3);
                    if (objK == aVar6) {
                        return objK;
                    }
                } else {
                    i11 = (p005a5.I) o8.f13719d.get(str4);
                    if (i11 != null) {
                        c1949j = i11.f13495a;
                        ((S7.C0901q) interfaceC0900p2).J(c1949j);
                        dVar = o8.f13721f;
                        n3.f13679h = o8;
                        n3.f13680i = str4;
                        n3.j = c1949j;
                        n3.f13681k = dVar;
                        n3.f13686p = 3;
                        if (dVar.e(n3) != aVar6) {
                            str6 = str4;
                            o9 = o8;
                            aVar2 = dVar;
                            aVar3 = aVar2;
                            return c1949j;
                        }
                    } else {
                        cVar2 = o8.f13720e;
                        n3.f13679h = o8;
                        n3.f13680i = str3;
                        n3.j = str4;
                        n3.f13681k = interfaceC0900p2;
                        n3.f13682l = i3;
                        n3.f13683m = i10;
                        n3.f13686p = 4;
                        if (cVar2.a(n3) == aVar6) {
                            java.lang.String str13 = str3;
                            i12 = i3;
                            i13 = i10;
                            str5 = str13;
                            n3.f13679h = o8;
                            n3.f13680i = str4;
                            n3.j = interfaceC0900p2;
                            n3.f13681k = null;
                            n3.f13686p = 5;
                            objD = o8.d(i12, i13, str5, n3);
                            if (objD != aVar6) {
                                S7.InterfaceC0900p interfaceC0900p5 = interfaceC0900p2;
                                obj = objD;
                                interfaceC0900p3 = interfaceC0900p5;
                                str7 = str4;
                                o10 = o8;
                                c1949j = (com.kiptv.core.model.C1949j) obj;
                                o10.f13719d.put(str7, new p005a5.I(c1949j, java.lang.System.currentTimeMillis()));
                                o10.b();
                                ((S7.C0901q) interfaceC0900p3).J(c1949j);
                                dVar2 = o10.f13721f;
                                n3.f13679h = o10;
                                n3.f13680i = str7;
                                n3.j = c1949j;
                                n3.f13681k = dVar2;
                                n3.f13686p = 6;
                                if (dVar2.e(n3) != aVar6) {
                                    str9 = str7;
                                    o12 = o10;
                                    aVar4 = dVar2;
                                    aVar3 = aVar4;
                                    return c1949j;
                                }
                            }
                        }
                    }
                }
                return aVar6;
            case 2:
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            case 3:
                p028c8.a aVar7 = (p028c8.a) n3.f13681k;
                c1949j = (com.kiptv.core.model.C1949j) n3.j;
                str6 = n3.f13680i;
                o9 = n3.f13679h;
                com.google.common.util.concurrent.P.u0(obj);
                aVar2 = aVar7;
                aVar3 = aVar2;
                return c1949j;
            case 4:
                i13 = n3.f13683m;
                i12 = n3.f13682l;
                S7.InterfaceC0900p interfaceC0900p6 = (S7.InterfaceC0900p) n3.f13681k;
                str4 = (java.lang.String) n3.j;
                str5 = n3.f13680i;
                o8 = n3.f13679h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                    interfaceC0900p2 = interfaceC0900p6;
                    n3.f13679h = o8;
                    n3.f13680i = str4;
                    n3.j = interfaceC0900p2;
                    n3.f13681k = null;
                    n3.f13686p = 5;
                    objD = o8.d(i12, i13, str5, n3);
                    if (objD != aVar6) {
                        S7.InterfaceC0900p interfaceC0900p7 = interfaceC0900p2;
                        obj = objD;
                        interfaceC0900p3 = interfaceC0900p7;
                        str7 = str4;
                        o10 = o8;
                        c1949j = (com.kiptv.core.model.C1949j) obj;
                        o10.f13719d.put(str7, new p005a5.I(c1949j, java.lang.System.currentTimeMillis()));
                        o10.b();
                        ((S7.C0901q) interfaceC0900p3).J(c1949j);
                        dVar2 = o10.f13721f;
                        n3.f13679h = o10;
                        n3.f13680i = str7;
                        n3.j = c1949j;
                        n3.f13681k = dVar2;
                        n3.f13686p = 6;
                        if (dVar2.e(n3) != aVar6) {
                            str9 = str7;
                            o12 = o10;
                            aVar4 = dVar2;
                            aVar3 = aVar4;
                            return c1949j;
                        }
                    }
                    return aVar6;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    interfaceC0900p3 = interfaceC0900p6;
                    ((S7.C0901q) interfaceC0900p3).Z(th);
                    throw th;
                }
            case 5:
                interfaceC0900p3 = (S7.InterfaceC0900p) n3.j;
                str7 = n3.f13680i;
                o10 = n3.f13679h;
                try {
                    com.google.common.util.concurrent.P.u0(obj);
                    c1949j = (com.kiptv.core.model.C1949j) obj;
                    o10.f13719d.put(str7, new p005a5.I(c1949j, java.lang.System.currentTimeMillis()));
                    o10.b();
                    ((S7.C0901q) interfaceC0900p3).J(c1949j);
                    dVar2 = o10.f13721f;
                    n3.f13679h = o10;
                    n3.f13680i = str7;
                    n3.j = c1949j;
                    n3.f13681k = dVar2;
                    n3.f13686p = 6;
                    if (dVar2.e(n3) != aVar6) {
                        str9 = str7;
                        o12 = o10;
                        aVar4 = dVar2;
                        aVar3 = aVar4;
                        return c1949j;
                    }
                    return aVar6;
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    o8 = o10;
                    str4 = str7;
                    ((S7.C0901q) interfaceC0900p3).Z(th);
                    throw th;
                }
            case 6:
                p028c8.a aVar8 = (p028c8.a) n3.f13681k;
                c1949j = (com.kiptv.core.model.C1949j) n3.j;
                str9 = n3.f13680i;
                o12 = n3.f13679h;
                com.google.common.util.concurrent.P.u0(obj);
                aVar4 = aVar8;
                aVar3 = aVar4;
                return c1949j;
            case 7:
                p028c8.a aVar9 = (p028c8.a) n3.f13681k;
                th = (java.lang.Throwable) n3.j;
                str8 = n3.f13680i;
                o11 = n3.f13679h;
                com.google.common.util.concurrent.P.u0(obj);
                aVar5 = aVar9;
                throw th;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void i() {
        V7.n0 n0Var;
        java.lang.Object value;
        this.f13719d.clear();
        do {
            n0Var = this.f13722h;
            value = n0Var.getValue();
        } while (!n0Var.g(value, java.lang.Long.valueOf(((java.lang.Number) value).longValue() + 1)));
    }
}
