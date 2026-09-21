package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    private static final p015b5.m Companion = new p015b5.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a5.C1451x5 f17980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p028c8.d f17981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f17982c;

    public o(p005a5.C1451x5 tmdbRepository) {
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        this.f17980a = tmdbRepository;
        this.f17981b = new p028c8.d();
        this.f17982c = new java.util.LinkedHashMap(64, 0.75f, true);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0192  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:79:0x01af A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:76:0x0196, B:79:0x01af, B:80:0x01b7, B:82:0x01bd, B:84:0x01c3), top: B:94:0x0196 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r2v1 */
    public final java.lang.Object a(com.kiptv.core.model.EPGProgram ePGProgram, p117n6.c cVar) {
        p015b5.n nVar;
        com.kiptv.core.model.EPGTMDBMatchResult ePGTMDBMatchResult;
        java.lang.String str;
        p015b5.o oVar;
        p028c8.d dVar;
        com.kiptv.core.model.EPGTMDBMatchResult ePGTMDBMatchResult2;
        p015b5.o oVar2;
        java.lang.Object obj;
        p028c8.a aVar;
        java.util.LinkedHashMap linkedHashMap;
        java.util.Iterator it;
        java.lang.String strC;
        java.lang.String str2;
        p028c8.d dVar2;
        java.lang.String str3;
        p015b5.o oVar3;
        if (cVar instanceof p015b5.n) {
            nVar = (p015b5.n) cVar;
            int i3 = nVar.f17979o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.f17979o = i3 - Integer.MIN_VALUE;
            } else {
                nVar = new p015b5.n(this, cVar);
            }
        } else {
            nVar = new p015b5.n(this, cVar);
        }
        java.lang.Object objH = nVar.f17977m;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = nVar.f17979o;
        try {
            try {
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(objH);
                    java.lang.String string = O7.q.r1(ePGProgram.f19739b).toString();
                    if (string.length() != 0) {
                        java.util.List list = S4.AbstractC0874m.f9411a;
                        if (string.length() == 0) {
                            strC = "";
                        } else {
                            java.lang.String string2 = O7.q.r1(string).toString();
                            java.util.Iterator it2 = S4.AbstractC0874m.f9411a.iterator();
                            while (it2.hasNext()) {
                                string2 = ((O7.o) it2.next()).e(string2, "");
                            }
                            java.util.Iterator it3 = S4.AbstractC0874m.f9412b.iterator();
                            while (it3.hasNext()) {
                                string2 = ((O7.o) it3.next()).e(string2, "");
                            }
                            java.util.Iterator it4 = S4.AbstractC0874m.f9413c.iterator();
                            while (it4.hasNext()) {
                                string2 = ((O7.o) it4.next()).e(string2, "");
                            }
                            strC = S4.K.c(S4.K.f9329a, O7.q.r1(string2).toString(), false, 6);
                        }
                        if (strC.length() != 0) {
                            java.util.List list2 = S4.AbstractC0874m.f9411a;
                            java.lang.String lowerCase = strC.toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                            java.lang.String string3 = O7.q.r1(lowerCase).toString();
                            if (!S4.AbstractC0874m.f9414d.contains(string3)) {
                                java.util.Iterator it5 = S4.AbstractC0874m.f9415e.iterator();
                                while (it5.hasNext()) {
                                    if (O7.q.B0(string3, (java.lang.String) it5.next(), false)) {
                                    }
                                }
                                if (string3.length() > 2 && !S4.AbstractC0874m.f9416f.f8060h.matcher(string3).find()) {
                                    java.lang.String lowerCase2 = strC.toLowerCase(java.util.Locale.ROOT);
                                    kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                                    nVar.f17973h = this;
                                    nVar.f17974i = string;
                                    nVar.j = strC;
                                    nVar.f17975k = lowerCase2;
                                    p028c8.d dVar3 = this.f17981b;
                                    nVar.f17976l = dVar3;
                                    nVar.f17979o = 1;
                                    if (dVar3.e(nVar) != aVar2) {
                                        str2 = strC;
                                        dVar2 = dVar3;
                                        str3 = lowerCase2;
                                        oVar3 = this;
                                    }
                                    return aVar2;
                                }
                            }
                        }
                    }
                    return null;
                }
                if (i9 == 1) {
                    p028c8.d dVar4 = nVar.f17976l;
                    java.lang.String str4 = (java.lang.String) nVar.f17975k;
                    str2 = (java.lang.String) nVar.j;
                    p015b5.o oVar4 = nVar.f17973h;
                    com.google.common.util.concurrent.P.u0(objH);
                    dVar2 = dVar4;
                    str3 = str4;
                    oVar3 = oVar4;
                } else {
                    if (i9 == 2) {
                        java.lang.String str5 = nVar.f17974i;
                        p015b5.o oVar5 = nVar.f17973h;
                        com.google.common.util.concurrent.P.u0(objH);
                        i9 = oVar5;
                        ePGProgram = str5;
                        i9 = oVar3;
                        ePGProgram = str3;
                        ePGTMDBMatchResult = (com.kiptv.core.model.EPGTMDBMatchResult) objH;
                        oVar = i9;
                        str = ePGProgram;
                        dVar = oVar.f17981b;
                        nVar.f17973h = oVar;
                        nVar.f17974i = str;
                        nVar.j = ePGTMDBMatchResult;
                        nVar.f17975k = dVar;
                        nVar.f17976l = null;
                        nVar.f17979o = 3;
                        if (dVar.e(nVar) != aVar2) {
                            ePGTMDBMatchResult2 = ePGTMDBMatchResult;
                            oVar2 = oVar;
                            obj = str;
                            aVar = dVar;
                        }
                        return aVar2;
                    }
                    if (i9 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (p028c8.a) nVar.f17975k;
                    ePGTMDBMatchResult2 = (com.kiptv.core.model.EPGTMDBMatchResult) nVar.j;
                    java.lang.Object obj2 = nVar.f17974i;
                    p015b5.o oVar6 = nVar.f17973h;
                    com.google.common.util.concurrent.P.u0(objH);
                    oVar2 = oVar6;
                    obj = obj2;
                }
                try {
                    oVar2.f17982c.put(obj, new p015b5.l(ePGTMDBMatchResult2, java.lang.System.currentTimeMillis()));
                    linkedHashMap = oVar2.f17982c;
                    if (linkedHashMap.size() <= 500) {
                        it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext() && linkedHashMap.size() > 500) {
                            it.next();
                            it.remove();
                        }
                    }
                    ((p028c8.d) aVar).g(null);
                    return ePGTMDBMatchResult2;
                } catch (java.lang.Throwable th) {
                    ((p028c8.d) aVar).g(null);
                    throw th;
                }
                p015b5.l lVar = (p015b5.l) oVar3.f17982c.get(str3);
                dVar2.g(null);
                if (lVar != null) {
                    return lVar.f17971a;
                }
                p005a5.C1451x5 c1451x5 = oVar3.f17980a;
                nVar.f17973h = oVar3;
                nVar.f17974i = str3;
                nVar.j = null;
                nVar.f17975k = null;
                nVar.f17976l = null;
                nVar.f17979o = 2;
                objH = c1451x5.H(str2, nVar);
                if (objH == aVar2) {
                    i9 = oVar3;
                    ePGProgram = str3;
                } else {
                    i9 = oVar3;
                    ePGProgram = str3;
                    ePGTMDBMatchResult = (com.kiptv.core.model.EPGTMDBMatchResult) objH;
                    oVar = i9;
                    str = ePGProgram;
                    dVar = oVar.f17981b;
                    nVar.f17973h = oVar;
                    nVar.f17974i = str;
                    nVar.j = ePGTMDBMatchResult;
                    nVar.f17975k = dVar;
                    nVar.f17976l = null;
                    nVar.f17979o = 3;
                    if (dVar.e(nVar) != aVar2) {
                        ePGTMDBMatchResult2 = ePGTMDBMatchResult;
                        oVar2 = oVar;
                        obj = str;
                        aVar = dVar;
                        oVar2.f17982c.put(obj, new p015b5.l(ePGTMDBMatchResult2, java.lang.System.currentTimeMillis()));
                        linkedHashMap = oVar2.f17982c;
                        if (linkedHashMap.size() <= 500) {
                            it = linkedHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                it.next();
                                it.remove();
                            }
                        }
                        ((p028c8.d) aVar).g(null);
                        return ePGTMDBMatchResult2;
                    }
                }
                return aVar2;
            } catch (java.lang.Throwable th2) {
                dVar2.g(null);
                throw th2;
            }
        } catch (java.lang.Exception unused) {
            ePGTMDBMatchResult = null;
            oVar = i9;
            str = ePGProgram;
        }
    }
}
