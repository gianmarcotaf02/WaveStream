package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final p005a5.E0 Companion = new p005a5.E0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f20957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U4.g f20958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V7.n0 f20959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V7.W f20960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.n0 f20961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V7.W f20962f;
    public final V7.n0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.W f20963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p162s8.q f20964i;
    public final p028c8.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f20966l;

    public a(android.content.Context context, U4.g contentDiskCache) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(contentDiskCache, "contentDiskCache");
        this.f20957a = context;
        this.f20958b = contentDiskCache;
        p078i6.y yVar = p078i6.y.f23207h;
        V7.n0 n0VarB = V7.r.b(yVar);
        this.f20959c = n0VarB;
        this.f20960d = new V7.W(n0VarB);
        V7.n0 n0VarB2 = V7.r.b(yVar);
        this.f20961e = n0VarB2;
        this.f20962f = new V7.W(n0VarB2);
        V7.n0 n0VarB3 = V7.r.b(p078i6.x.f23206h);
        this.g = n0VarB3;
        this.f20963h = new V7.W(n0VarB3);
        this.f20964i = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.e(new U4.h(9));
        this.j = new p028c8.d();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:115:0x020d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0217  */
    /* JADX WARN: Code duplicated, block: B:130:0x0238  */
    /* JADX WARN: Code duplicated, block: B:135:0x0245  */
    /* JADX WARN: Code duplicated, block: B:137:0x024c  */
    /* JADX WARN: Code duplicated, block: B:139:0x024f  */
    /* JADX WARN: Code duplicated, block: B:178:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0182  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197 A[LOOP:5: B:84:0x0191->B:86:0x0197, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static com.kiptv.core.model.T a(com.kiptv.core.model.I0 info, java.util.List watchProgress) {
        int i3;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.util.Set setR1;
        java.util.Iterator it2;
        java.lang.Comparable comparable;
        int iIntValue;
        java.util.Iterator it3;
        int i9;
        java.util.Iterator it4;
        java.lang.Comparable comparable2;
        int i10;
        java.lang.Integer num;
        double dDoubleValue;
        kotlin.jvm.internal.m.e(info, "info");
        kotlin.jvm.internal.m.e(watchProgress, "watchProgress");
        java.util.Map map = info.f19803c;
        if (map != null) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - 604800000;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it5 = map.entrySet().iterator();
            while (true) {
                i3 = 0;
                if (!it5.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it5.next();
                java.lang.String str = (java.lang.String) entry.getKey();
                java.util.List<com.kiptv.core.model.E0> list = (java.util.List) entry.getValue();
                java.lang.Integer numZ0 = O7.x.z0(str);
                for (com.kiptv.core.model.E0 e6 : list) {
                    java.lang.Integer num2 = e6.g;
                    int iIntValue2 = num2 != null ? num2.intValue() : numZ0 != null ? numZ0.intValue() : 0;
                    if (iIntValue2 > 0) {
                        int iA = e6.a();
                        java.util.Date dateD = com.google.common.util.concurrent.AbstractC1903s.D(e6.f19736f);
                        arrayList2.add(new p005a5.F0(iIntValue2, iA, dateD != null ? java.lang.Long.valueOf(dateD.getTime()) : null));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                java.util.ArrayList<p005a5.F0> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList2) {
                    java.lang.Long l2 = ((p005a5.F0) obj).f13385c;
                    if (l2 != null && l2.longValue() > jCurrentTimeMillis) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList = new java.util.ArrayList(p078i6.q.I0(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Integer.valueOf(((p005a5.F0) it.next()).f13383a));
                    }
                    setR1 = p078i6.o.R1(arrayList);
                    if (!arrayList3.isEmpty()) {
                        it2 = setR1.iterator();
                        if (it2.hasNext()) {
                            throw new java.util.NoSuchElementException();
                        }
                        comparable = (java.lang.Comparable) it2.next();
                        while (it2.hasNext()) {
                            comparable2 = (java.lang.Comparable) it2.next();
                            if (comparable.compareTo(comparable2) < 0) {
                                comparable = comparable2;
                            }
                        }
                        iIntValue = ((java.lang.Number) comparable).intValue();
                        if (iIntValue > 1) {
                            if (arrayList2.isEmpty()) {
                                i9 = 0;
                            } else {
                                it3 = arrayList2.iterator();
                                i9 = 0;
                                while (it3.hasNext()) {
                                    if (((p005a5.F0) it3.next()).f13383a != iIntValue) {
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    if (((p005a5.F0) it4.next()).f13383a != iIntValue) {
                                    }
                                }
                            }
                            if (i9 > 0) {
                                return com.kiptv.core.model.T.NEW_SEASON;
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (arrayList3.size() >= 2) {
                        }
                    }
                } else {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.Iterator it6 = watchProgress.iterator();
                    while (it6.hasNext()) {
                        com.kiptv.core.model.WatchProgress watchProgress2 = (com.kiptv.core.model.WatchProgress) it6.next();
                        if (watchProgress2.f20614e == com.kiptv.core.model.z0.j && (num = watchProgress2.f20616h) != null) {
                            if (num.intValue() <= 0) {
                                num = null;
                            }
                            if (num != null) {
                                int iIntValue3 = num.intValue();
                                java.lang.Integer num3 = watchProgress2.f20617i;
                                if (num3 != null) {
                                    if (num3.intValue() <= 0) {
                                        num3 = null;
                                    }
                                    if (num3 != null) {
                                        int iIntValue4 = num3.intValue();
                                        int i11 = watchProgress2.f20618k;
                                        if (i11 > 0) {
                                            dDoubleValue = ((double) watchProgress2.j) / ((double) i11);
                                        } else {
                                            java.lang.Double d4 = watchProgress2.f20619l;
                                            dDoubleValue = d4 != null ? d4.doubleValue() : 0.0d;
                                        }
                                        if (watchProgress2.f20620m || dDoubleValue >= 0.9d) {
                                            hashSet.add(iIntValue3 + ":" + iIntValue4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        for (p005a5.F0 f9 : arrayList3) {
                            if (hashSet.contains(f9.f13383a + ":" + f9.f13384b) && (i10 = i10 + 1) < 0) {
                                p078i6.p.G0();
                                throw null;
                            }
                        }
                    }
                    if (((double) i10) / ((double) arrayList3.size()) < 0.95d) {
                        arrayList = new java.util.ArrayList(p078i6.q.I0(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(java.lang.Integer.valueOf(((p005a5.F0) it.next()).f13383a));
                        }
                        setR1 = p078i6.o.R1(arrayList);
                        if (!arrayList3.isEmpty()) {
                            it2 = setR1.iterator();
                            if (it2.hasNext()) {
                                throw new java.util.NoSuchElementException();
                            }
                            comparable = (java.lang.Comparable) it2.next();
                            while (it2.hasNext()) {
                                comparable2 = (java.lang.Comparable) it2.next();
                                if (comparable.compareTo(comparable2) < 0) {
                                    comparable = comparable2;
                                }
                            }
                            iIntValue = ((java.lang.Number) comparable).intValue();
                            if (iIntValue > 1) {
                                if (arrayList2.isEmpty()) {
                                    i9 = 0;
                                } else {
                                    it3 = arrayList2.iterator();
                                    i9 = 0;
                                    while (it3.hasNext()) {
                                        if (((p005a5.F0) it3.next()).f13383a != iIntValue && (i9 = i9 + 1) < 0) {
                                            p078i6.p.G0();
                                            throw null;
                                        }
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        if (((p005a5.F0) it4.next()).f13383a != iIntValue && (i3 = i3 + 1) < 0) {
                                            p078i6.p.G0();
                                            throw null;
                                        }
                                    }
                                }
                                if (i9 > 0 && ((double) i3) / ((double) i9) >= 0.5d) {
                                    return com.kiptv.core.model.T.NEW_SEASON;
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            return arrayList3.size() >= 2 ? com.kiptv.core.model.T.NEW_EPISODES : com.kiptv.core.model.T.NEW_EPISODE;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(p117n6.c cVar) {
        p005a5.J0 j9;
        com.kiptv.core.repository.a aVar;
        p028c8.d dVar;
        if (cVar instanceof p005a5.J0) {
            j9 = (p005a5.J0) cVar;
            int i3 = j9.f13532l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j9.f13532l = i3 - Integer.MIN_VALUE;
            } else {
                j9 = new p005a5.J0(this, cVar);
            }
        } else {
            j9 = new p005a5.J0(this, cVar);
        }
        java.lang.Object obj = j9.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = j9.f13532l;
        boolean z6 = true;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            j9.f13529h = this;
            p028c8.d dVar2 = this.j;
            j9.f13530i = dVar2;
            j9.f13532l = 1;
            if (dVar2.e(j9) == aVar2) {
                return aVar2;
            }
            aVar = this;
            dVar = dVar2;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = j9.f13530i;
            aVar = j9.f13529h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        try {
            if (aVar.f20966l == 0) {
                z6 = false;
            } else if (java.lang.System.currentTimeMillis() >= aVar.f20966l) {
                aVar.f20966l = 0L;
                aVar.f20965k = 0;
                z6 = false;
            }
            return java.lang.Boolean.valueOf(z6);
        } finally {
            dVar.g(null);
        }
    }

    public final p086j6.e c(java.lang.String str) {
        java.lang.Object objT;
        java.lang.Long lA = this.f20958b.a(str);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        java.io.File file = new java.io.File(this.f20957a.getCacheDir(), "new_content_badges");
        file.mkdirs();
        java.io.File file2 = new java.io.File(file, str.concat(".json"));
        if (!file2.exists()) {
            return null;
        }
        try {
            com.kiptv.core.repository.NewContentRepository$CachedBadges newContentRepository$CachedBadges = (com.kiptv.core.repository.NewContentRepository$CachedBadges) this.f20964i.b(p160s6.k.R(file2), com.kiptv.core.repository.NewContentRepository$CachedBadges.INSTANCE.serializer());
            if (newContentRepository$CachedBadges.f20907a == 2 && kotlin.jvm.internal.m.a(newContentRepository$CachedBadges.f20908b, str) && newContentRepository$CachedBadges.f20909c == jLongValue) {
                p086j6.e eVar = new p086j6.e();
                for (java.util.Map.Entry entry : newContentRepository$CachedBadges.f20910d.entrySet()) {
                    java.lang.String str2 = (java.lang.String) entry.getKey();
                    java.lang.String str3 = (java.lang.String) entry.getValue();
                    java.lang.Integer numZ0 = O7.x.z0(str2);
                    if (numZ0 != null) {
                        try {
                            objT = com.kiptv.core.model.T.valueOf(str3);
                        } catch (java.lang.Throwable th) {
                            objT = com.google.common.util.concurrent.P.T(th);
                        }
                        if (objT instanceof p070h6.m) {
                            objT = null;
                        }
                        eVar.put(numZ0, objT);
                    }
                }
                return eVar.b();
            }
            return null;
        } catch (java.lang.Exception e6) {
            Y6.f.u(e6, "loadCache failed: ", "NewContentRepo");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(p117n6.c cVar) {
        p005a5.K0 k1;
        com.kiptv.core.repository.a aVar;
        p028c8.d dVar;
        if (cVar instanceof p005a5.K0) {
            k1 = (p005a5.K0) cVar;
            int i3 = k1.f13570l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k1.f13570l = i3 - Integer.MIN_VALUE;
            } else {
                k1 = new p005a5.K0(this, cVar);
            }
        } else {
            k1 = new p005a5.K0(this, cVar);
        }
        java.lang.Object obj = k1.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = k1.f13570l;
        boolean z6 = true;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            k1.f13567h = this;
            p028c8.d dVar2 = this.j;
            k1.f13568i = dVar2;
            k1.f13570l = 1;
            if (dVar2.e(k1) == aVar2) {
                return aVar2;
            }
            aVar = this;
            dVar = dVar2;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = k1.f13568i;
            aVar = k1.f13567h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        try {
            int i10 = aVar.f20965k + 1;
            aVar.f20965k = i10;
            if (i10 >= 3) {
                aVar.f20966l = java.lang.System.currentTimeMillis() + 1800000;
            } else {
                z6 = false;
            }
            return java.lang.Boolean.valueOf(z6);
        } finally {
            dVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(p117n6.c cVar) {
        p005a5.L0 l2;
        com.kiptv.core.repository.a aVar;
        p028c8.d dVar;
        if (cVar instanceof p005a5.L0) {
            l2 = (p005a5.L0) cVar;
            int i3 = l2.f13609l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l2.f13609l = i3 - Integer.MIN_VALUE;
            } else {
                l2 = new p005a5.L0(this, cVar);
            }
        } else {
            l2 = new p005a5.L0(this, cVar);
        }
        java.lang.Object obj = l2.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = l2.f13609l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            l2.f13606h = this;
            p028c8.d dVar2 = this.j;
            l2.f13607i = dVar2;
            l2.f13609l = 1;
            if (dVar2.e(l2) == aVar2) {
                return aVar2;
            }
            aVar = this;
            dVar = dVar2;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = l2.f13607i;
            aVar = l2.f13606h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        try {
            aVar.f20965k = 0;
            return p070h6.A.f22523a;
        } finally {
            dVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e8 A[LOOP:0: B:51:0x016a->B:104:0x02e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x019e  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cf A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:62:0x01cf, B:65:0x01ed, B:24:0x00bf), top: B:147:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ed A[Catch: all -> 0x00c4, PHI: r2 r3 r5 r6 r9 r10 r11 r12 r13 r14
  0x01ed: PHI (r2v30 java.lang.Object) = (r2v1 java.lang.Object), (r2v37 java.lang.Object) binds: [B:24:0x00bf, B:63:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01ed: PHI (r3v14 a5.M0) = (r3v2 a5.M0), (r3v16 a5.M0) binds: [B:24:0x00bf, B:63:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01ed: PHI (r5v21 int) = (r5v5 int), (r5v43 int) binds: [B:24:0x00bf, B:63:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01ed: PHI (r6v12 i6.x) = (r6v0 i6.x), (r6v29 i6.x) binds: [B:24:0x00bf, B:63:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01ed: PHI (r9v26 java.util.Iterator) = (r9v6 java.util.Iterator), (r9v33 java.util.Iterator) binds: [B:24:0x00bf, B:63:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01ed: PHI (r10v24 java.util.HashMap) = (r10v7 java.util.HashMap), (r10v26 java.util.HashMap) binds: [B:24:0x00bf, B:63:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01ed: PHI (r11v25 x6.m) = (r11v7 x6.m), (r11v27 x6.m) binds: [B:24:0x00bf, B:63:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01ed: PHI (r12v24 x6.m) = (r12v7 x6.m), (r12v25 x6.m) binds: [B:24:0x00bf, B:63:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01ed: PHI (r13v22 java.lang.String) = (r13v4 java.lang.String), (r13v24 java.lang.String) binds: [B:24:0x00bf, B:63:0x01e9] A[DONT_GENERATE, DONT_INLINE]
  0x01ed: PHI (r14v19 com.kiptv.core.repository.a) = (r14v1 com.kiptv.core.repository.a), (r14v20 com.kiptv.core.repository.a) binds: [B:24:0x00bf, B:63:0x01e9] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:62:0x01cf, B:65:0x01ed, B:24:0x00bf), top: B:147:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0201  */
    /* JADX WARN: Code duplicated, block: B:73:0x0206  */
    /* JADX WARN: Code duplicated, block: B:76:0x0221  */
    /* JADX WARN: Code duplicated, block: B:79:0x0249  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x024b A[Catch: all -> 0x0091, PHI: r2 r3 r5 r6 r9 r10 r11 r12 r13 r14 r15
  0x024b: PHI (r2v22 java.lang.Object) = (r2v1 java.lang.Object), (r2v25 java.lang.Object) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r3v11 a5.M0) = (r3v2 a5.M0), (r3v12 a5.M0) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r5v18 int) = (r5v7 int), (r5v19 int) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r6v8 i6.x) = (r6v0 i6.x), (r6v9 i6.x) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r9v19 com.kiptv.core.repository.a) = (r9v9 com.kiptv.core.repository.a), (r9v20 com.kiptv.core.repository.a) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r10v20 com.kiptv.core.model.I0) = (r10v10 com.kiptv.core.model.I0), (r10v21 com.kiptv.core.model.I0) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r11v21 java.util.Iterator) = (r11v10 java.util.Iterator), (r11v22 java.util.Iterator) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r12v20 java.util.HashMap) = (r12v10 java.util.HashMap), (r12v21 java.util.HashMap) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r13v18 x6.m) = (r13v7 x6.m), (r13v19 x6.m) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r14v15 x6.m) = (r14v4 x6.m), (r14v16 x6.m) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r15v6 java.lang.String) = (r15v1 java.lang.String), (r15v7 java.lang.String) binds: [B:17:0x008c, B:78:0x0247] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0091, blocks: (B:77:0x022b, B:80:0x024b, B:17:0x008c), top: B:145:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x025d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0284  */
    /* JADX WARN: Code duplicated, block: B:92:0x028d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x02dc -> B:13:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(java.util.List r19, java.lang.String r20, p194x6.m r21, p194x6.m r22, p117n6.c r23) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kiptv.core.repository.a.f(java.util.List, java.lang.String, x6.m, x6.m, n6.c):java.lang.Object");
    }

    public final void g(int i3, com.kiptv.core.model.T t9) {
        V7.n0 n0Var = this.g;
        java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0((java.util.Map) n0Var.getValue());
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        n0Var.getClass();
        n0Var.i(null, linkedHashMapZ0);
    }
}
