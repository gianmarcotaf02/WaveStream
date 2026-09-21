package K2;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.w f6817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X2.a f6818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S2.a f6819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p166t3.i f6820d;

    public h(E2.w wVar, X2.a aVar, S2.a aVar2) {
        this.f6817a = wVar;
        this.f6818b = aVar;
        this.f6819c = aVar2;
        this.f6820d = new p166t3.i(wVar, aVar2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:20:0x0081 A[LOOP:0: B:16:0x0061->B:20:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ad -> B:26:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(K2.h r7, J2.i r8, E2.e r9, S2.h r10, java.lang.Object r11, S2.o r12, E2.g r13, p117n6.c r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.h.a(K2.h, J2.i, E2.e, S2.h, java.lang.Object, S2.o, E2.g, n6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016e, code lost:
    
        if (r1 == r7) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(K2.h hVar, S2.h hVar2, java.lang.Object obj, S2.o oVar, E2.g gVar, p117n6.c cVar) throws java.lang.Throwable {
        K2.c cVar2;
        J2.i iVar;
        H2.q qVar;
        K2.h hVar3;
        java.lang.Object obj2;
        E2.g gVar2;
        kotlin.jvm.internal.A a2;
        kotlin.jvm.internal.A a9;
        kotlin.jvm.internal.A a10;
        kotlin.jvm.internal.A a11;
        S2.h hVar4;
        S2.h hVar5;
        kotlin.jvm.internal.A a12;
        E2.g gVar3;
        K2.a aVar;
        kotlin.jvm.internal.A a13;
        K2.h hVar6;
        java.lang.Object obj3;
        J2.i iVar2;
        H2.q qVar2;
        hVar.getClass();
        if (cVar instanceof K2.c) {
            cVar2 = (K2.c) cVar;
            int i3 = cVar2.f6790r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.f6790r = i3 - Integer.MIN_VALUE;
            } else {
                cVar2 = new K2.c(hVar, cVar);
            }
        } else {
            cVar2 = new K2.c(hVar, cVar);
        }
        K2.c cVar3 = cVar2;
        java.lang.Object objC = cVar3.f6788p;
        p109m6.a aVar2 = p109m6.a.f25430h;
        kotlin.jvm.internal.A a14 = cVar3.f6790r;
        try {
            if (a14 == 0) {
                com.google.common.util.concurrent.P.u0(objC);
                kotlin.jvm.internal.A a15 = new kotlin.jvm.internal.A();
                a15.f24539h = oVar;
                kotlin.jvm.internal.A a16 = new kotlin.jvm.internal.A();
                a16.f24539h = hVar.f6817a.f2820c;
                kotlin.jvm.internal.A a17 = new kotlin.jvm.internal.A();
                try {
                    a15.f24539h = hVar.f6819c.Q((S2.o) a15.f24539h);
                    hVar2.getClass();
                    E2.e eVar = (E2.e) a16.f24539h;
                    S2.o oVar2 = (S2.o) a15.f24539h;
                    cVar3.f6781h = hVar;
                    cVar3.f6782i = hVar2;
                    cVar3.j = obj;
                    cVar3.f6783k = gVar;
                    cVar3.f6784l = a15;
                    cVar3.f6785m = a16;
                    cVar3.f6786n = a17;
                    cVar3.f6787o = a17;
                    cVar3.f6790r = 1;
                    objC = hVar.c(eVar, hVar2, obj, oVar2, gVar, cVar3);
                    if (objC != aVar2) {
                        hVar3 = hVar;
                        obj2 = obj;
                        gVar2 = gVar;
                        a2 = a15;
                        a9 = a16;
                        a10 = a17;
                        a11 = a10;
                        hVar4 = hVar2;
                    }
                    return aVar2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    a14 = a17;
                    java.lang.Object obj4 = a14.f24539h;
                    iVar = obj4 instanceof J2.i ? (J2.i) obj4 : null;
                    if (iVar != null) {
                        try {
                            com.google.android.gms.internal.play_billing.M0.v(qVar);
                        } catch (java.lang.RuntimeException e6) {
                            throw e6;
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    throw th;
                }
            }
            if (a14 == 1) {
                a10 = cVar3.f6787o;
                a11 = cVar3.f6786n;
                kotlin.jvm.internal.A a18 = cVar3.f6785m;
                kotlin.jvm.internal.A a19 = cVar3.f6784l;
                E2.g gVar4 = (E2.g) cVar3.f6783k;
                java.lang.Object obj5 = cVar3.j;
                hVar4 = cVar3.f6782i;
                K2.h hVar7 = cVar3.f6781h;
                com.google.common.util.concurrent.P.u0(objC);
                a9 = a18;
                a2 = a19;
                gVar2 = gVar4;
                obj2 = obj5;
                hVar3 = hVar7;
            } else if (a14 == 2) {
                a11 = cVar3.f6784l;
                a13 = (kotlin.jvm.internal.A) cVar3.f6783k;
                gVar3 = (E2.g) cVar3.j;
                hVar5 = cVar3.f6782i;
                hVar6 = cVar3.f6781h;
                com.google.common.util.concurrent.P.u0(objC);
                aVar = (K2.a) objC;
                a12 = a13;
                hVar3 = hVar6;
                S2.h hVar8 = hVar5;
                obj3 = a11.f24539h;
                if (obj3 instanceof J2.i) {
                    iVar2 = (J2.i) obj3;
                } else {
                    iVar2 = null;
                }
                if (iVar2 != null && (qVar2 = iVar2.f6009a) != null) {
                    try {
                        com.google.android.gms.internal.play_billing.M0.v(qVar2);
                    } catch (java.lang.RuntimeException e9) {
                        throw e9;
                    } catch (java.lang.Exception unused2) {
                    }
                }
                S2.o oVar3 = (S2.o) a12.f24539h;
                hVar3.getClass();
                cVar3.f6781h = null;
                cVar3.f6782i = null;
                cVar3.j = null;
                cVar3.f6783k = null;
                cVar3.f6784l = null;
                cVar3.f6785m = null;
                cVar3.f6786n = null;
                cVar3.f6787o = null;
                cVar3.f6790r = 3;
                objC = O2.g.f0(aVar, hVar8, oVar3, gVar3, cVar3);
            } else {
                if (a14 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objC);
            }
            K2.a aVar3 = (K2.a) objC;
            E2.l lVar = aVar3.f6767a;
            android.graphics.Bitmap.Config[] configArr = X2.l.f10836a;
            if (lVar instanceof E2.C0274a) {
                ((E2.C0274a) lVar).f2766a.prepareToDraw();
            }
            return aVar3;
            a10.f24539h = objC;
            java.lang.Object obj6 = a11.f24539h;
            J2.e eVar2 = (J2.e) obj6;
            if (eVar2 instanceof J2.i) {
                p100l6.h hVar9 = hVar4.f9259h;
                kotlin.jvm.internal.A a20 = a11;
                S2.h hVar10 = hVar4;
                try {
                    K2.d dVar = new K2.d(hVar3, a20, a9, hVar10, obj2, a2, gVar2, null);
                    hVar5 = hVar10;
                    kotlin.jvm.internal.A a21 = a2;
                    gVar3 = gVar2;
                    cVar3.f6781h = hVar3;
                    cVar3.f6782i = hVar5;
                    cVar3.j = gVar3;
                    cVar3.f6783k = a21;
                    cVar3.f6784l = a11;
                    cVar3.f6785m = null;
                    cVar3.f6786n = null;
                    cVar3.f6787o = null;
                    cVar3.f6790r = 2;
                    objC = S7.C.K(hVar9, dVar, cVar3);
                    if (objC != aVar2) {
                        a13 = a21;
                        hVar6 = hVar3;
                        aVar = (K2.a) objC;
                        a12 = a13;
                        hVar3 = hVar6;
                        S2.h hVar11 = hVar5;
                        obj3 = a11.f24539h;
                        if (obj3 instanceof J2.i) {
                            iVar2 = (J2.i) obj3;
                        } else {
                            iVar2 = null;
                        }
                        if (iVar2 != null) {
                            com.google.android.gms.internal.play_billing.M0.v(qVar2);
                        }
                        S2.o oVar4 = (S2.o) a12.f24539h;
                        hVar3.getClass();
                        cVar3.f6781h = null;
                        cVar3.f6782i = null;
                        cVar3.j = null;
                        cVar3.f6783k = null;
                        cVar3.f6784l = null;
                        cVar3.f6785m = null;
                        cVar3.f6786n = null;
                        cVar3.f6787o = null;
                        cVar3.f6790r = 3;
                        objC = O2.g.f0(aVar, hVar11, oVar4, gVar3, cVar3);
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    a14 = a20;
                    java.lang.Object obj7 = a14.f24539h;
                    if (obj7 instanceof J2.i) {
                    }
                    if (iVar != null && (qVar = iVar.f6009a) != null) {
                        com.google.android.gms.internal.play_billing.M0.v(qVar);
                    }
                    throw th;
                }
            } else {
                hVar5 = hVar4;
                a12 = a2;
                gVar3 = gVar2;
                if (!(eVar2 instanceof J2.h)) {
                    throw new I3.b();
                }
                aVar = new K2.a(((J2.h) obj6).f6006a, ((J2.h) obj6).f6007b, ((J2.h) obj6).f6008c, null);
                S2.h hVar12 = hVar5;
                obj3 = a11.f24539h;
                if (obj3 instanceof J2.i) {
                    iVar2 = (J2.i) obj3;
                } else {
                    iVar2 = null;
                }
                if (iVar2 != null) {
                    com.google.android.gms.internal.play_billing.M0.v(qVar2);
                }
                S2.o oVar5 = (S2.o) a12.f24539h;
                hVar3.getClass();
                cVar3.f6781h = null;
                cVar3.f6782i = null;
                cVar3.j = null;
                cVar3.f6783k = null;
                cVar3.f6784l = null;
                cVar3.f6785m = null;
                cVar3.f6786n = null;
                cVar3.f6787o = null;
                cVar3.f6790r = 3;
                objC = O2.g.f0(aVar, hVar12, oVar5, gVar3, cVar3);
            }
            return aVar2;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d3 -> B:29:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(E2.e r18, S2.h r19, java.lang.Object r20, S2.o r21, E2.g r22, p117n6.c r23) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.h.c(E2.e, S2.h, java.lang.Object, S2.o, E2.g, n6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final java.lang.Object d(K2.k kVar, p117n6.c cVar) throws java.lang.Throwable {
        K2.f fVar;
        K2.k kVar2 = kVar;
        p166t3.i iVar = this.f6820d;
        if (cVar instanceof K2.f) {
            fVar = (K2.f) cVar;
            int i3 = fVar.f6809k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.f6809k = i3 - Integer.MIN_VALUE;
            } else {
                fVar = new K2.f(this, cVar);
            }
        } else {
            fVar = new K2.f(this, cVar);
        }
        K2.f fVar2 = fVar;
        java.lang.Object obj = fVar2.f6808i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = fVar2.f6809k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            try {
                S2.h hVar = kVar2.f6836d;
                java.lang.Object obj2 = hVar.f9254b;
                T2.h hVar2 = kVar2.f6837e;
                E2.g gVar = kVar2.f6838f;
                S2.o oVarK = this.f6819c.K(hVar, hVar2);
                T2.g gVar2 = oVarK.f9286c;
                java.util.List list = this.f6817a.f2820c.f2776b;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    p070h6.k kVar3 = (p070h6.k) list.get(i10);
                    M2.a aVar2 = (M2.a) kVar3.f22539h;
                    if (((E6.InterfaceC0331d) kVar3.f22540i).i(obj2)) {
                        kotlin.jvm.internal.m.c(aVar2, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                        E2.C cA = aVar2.a(obj2, oVarK);
                        if (cA != null) {
                            obj2 = cA;
                        }
                    }
                }
                N2.a aVarS = iVar.s(hVar, obj2, oVarK, gVar);
                N2.b bVarO = aVarS != null ? iVar.o(hVar, aVarS, hVar2, gVar2) : null;
                if (bVarO == null) {
                    p100l6.h hVar3 = hVar.g;
                    K2.g gVar3 = new K2.g(this, hVar, obj2, oVarK, gVar, aVarS, kVar2, null);
                    fVar2.f6807h = kVar2;
                    fVar2.f6809k = 1;
                    java.lang.Object objK = S7.C.K(hVar3, gVar3, fVar2);
                    return objK == aVar ? aVar : objK;
                }
                java.util.Map map = bVarO.f7303b;
                E2.l lVar = bVarO.f7302a;
                H2.h hVar4 = H2.h.f3886h;
                java.lang.Object obj3 = map.get("coil#disk_cache_key");
                java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                java.lang.Object obj4 = map.get("coil#is_sampled");
                java.lang.Boolean bool = obj4 instanceof java.lang.Boolean ? (java.lang.Boolean) obj4 : null;
                return new S2.q(lVar, hVar, hVar4, aVarS, str, bool != null ? bool.booleanValue() : false, kVar2.g);
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            K2.k kVar4 = fVar2.f6807h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                kVar2 = kVar4;
            }
        }
        if (th instanceof java.util.concurrent.CancellationException) {
            throw th;
        }
        return C2.a.b(kVar2.f6836d, th);
    }
}
