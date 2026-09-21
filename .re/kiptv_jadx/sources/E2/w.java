package E2;

/* JADX INFO: loaded from: classes.dex */
public final class w implements E2.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2817e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.r f2818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S2.a f2819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E2.e f2820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile /* synthetic */ int f2821d;

    static {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(E2.w.class, "d");
    }

    public w(E2.r rVar) {
        int i3 = 3;
        int i9 = 4;
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        this.f2818a = rVar;
        S7.C.c(com.google.android.gms.internal.play_billing.AbstractC1833d1.H(S7.C.e(), new E2.x(S7.C0907x.f9625h, i12)));
        X2.a aVar = new X2.a(this);
        S2.a aVar2 = new S2.a(this);
        this.f2819b = aVar2;
        E2.d dVar = new E2.d(rVar.f2799e);
        S2.f fVar = rVar.f2796b;
        java.lang.Object obj = fVar.f9244n.f2787a.get(E2.p.f2791a);
        boolean zBooleanValue = ((java.lang.Boolean) (obj == null ? java.lang.Boolean.TRUE : obj)).booleanValue();
        java.util.ArrayList arrayList = (java.util.ArrayList) dVar.f2773k;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) dVar.f2774l;
        if (zBooleanValue) {
            arrayList.add(new E2.n(i11));
            arrayList2.add(new E2.n(i10));
        }
        M2.a aVar3 = new M2.a(i12);
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        dVar.f(aVar3, c9.b(android.net.Uri.class));
        dVar.f(new M2.a(i3), c9.b(java.lang.Integer.class));
        p070h6.k kVar = new p070h6.k(new L2.a(0), c9.b(E2.C.class));
        java.util.ArrayList arrayList3 = (java.util.ArrayList) dVar.j;
        arrayList3.add(kVar);
        dVar.e(new J2.a(i12), c9.b(E2.C.class));
        dVar.e(new J2.a(i9), c9.b(E2.C.class));
        dVar.e(new J2.a(9), c9.b(E2.C.class));
        dVar.e(new J2.a(6), c9.b(android.graphics.drawable.Drawable.class));
        dVar.e(new J2.a(i11), c9.b(android.graphics.Bitmap.class));
        E2.j jVar = E2.q.f2792a;
        java.lang.Object obj2 = fVar.f9244n.f2787a.get(E2.q.f2792a);
        int iIntValue = ((java.lang.Number) (obj2 == null ? 4 : obj2)).intValue();
        int i13 = p028c8.k.f18530a;
        p028c8.j jVar2 = new p028c8.j(iIntValue);
        int i14 = android.os.Build.VERSION.SDK_INT;
        java.lang.Object obj3 = H2.n.f3897b;
        if (i14 >= 29) {
            java.lang.Object obj4 = fVar.f9244n.f2787a.get(E2.q.f2794c);
            if (((java.lang.Boolean) (obj4 == null ? java.lang.Boolean.TRUE : obj4)).booleanValue()) {
                java.lang.Object obj5 = fVar.f9244n.f2787a.get(E2.q.f2793b);
                H2.n nVar = (H2.n) (obj5 == null ? obj3 : obj5);
                if (nVar.equals(obj3) || nVar.equals(H2.n.f3898c)) {
                    arrayList2.add(new E2.C0276c(new H2.u(jVar2), i12));
                }
            }
        }
        java.lang.Object obj6 = fVar.f9244n.f2787a.get(E2.q.f2793b);
        arrayList2.add(new E2.C0276c(new H2.c(jVar2, (H2.n) (obj6 != null ? obj6 : obj3)), i12));
        dVar.f(new M2.a(i11), c9.b(java.io.File.class));
        dVar.e(new J2.a(8), c9.b(E2.C.class));
        dVar.e(new J2.a(3), c9.b(java.nio.ByteBuffer.class));
        dVar.f(new M2.a(4), c9.b(java.lang.String.class));
        dVar.f(new M2.a(2), c9.b(M8.A.class));
        arrayList3.add(new p070h6.k(new L2.a(1), c9.b(E2.C.class)));
        arrayList3.add(new p070h6.k(new L2.a(2), c9.b(E2.C.class)));
        dVar.e(new J2.a(7), c9.b(E2.C.class));
        dVar.e(new J2.a(2), c9.b(byte[].class));
        dVar.e(new J2.a(5), c9.b(E2.C.class));
        K2.h hVar = new K2.h(this, aVar, aVar2);
        java.util.ArrayList arrayList4 = (java.util.ArrayList) dVar.f2771h;
        arrayList4.add(hVar);
        this.f2820c = new E2.e(P3.e.m0(arrayList4), P3.e.m0((java.util.ArrayList) dVar.f2772i), P3.e.m0(arrayList3), P3.e.m0(arrayList), P3.e.m0(arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01be A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:14:0x0038, B:101:0x01b8, B:103:0x01be, B:104:0x01cf, B:106:0x01d3, B:109:0x01df, B:110:0x01e4), top: B:139:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01cf A[Catch: all -> 0x003d, TryCatch #5 {all -> 0x003d, blocks: (B:14:0x0038, B:101:0x01b8, B:103:0x01be, B:104:0x01cf, B:106:0x01d3, B:109:0x01df, B:110:0x01e4), top: B:139:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01d3 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #5 {all -> 0x003d, blocks: (B:14:0x0038, B:101:0x01b8, B:103:0x01be, B:104:0x01cf, B:106:0x01d3, B:109:0x01df, B:110:0x01e4), top: B:139:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01df A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #5 {all -> 0x003d, blocks: (B:14:0x0038, B:101:0x01b8, B:103:0x01be, B:104:0x01cf, B:106:0x01d3, B:109:0x01df, B:110:0x01e4), top: B:139:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01fe A[Catch: all -> 0x020b, TRY_LEAVE, TryCatch #3 {all -> 0x020b, blocks: (B:119:0x01fa, B:121:0x01fe, B:126:0x020d, B:127:0x0215), top: B:136:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:126:0x020d A[Catch: all -> 0x020b, TRY_ENTER, TryCatch #3 {all -> 0x020b, blocks: (B:119:0x01fa, B:121:0x01fe, B:126:0x020d, B:127:0x0215), top: B:136:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x013b A[Catch: all -> 0x01ef, TryCatch #7 {all -> 0x01ef, blocks: (B:80:0x0134, B:82:0x013b, B:84:0x0145, B:85:0x014f, B:87:0x0155, B:89:0x0163, B:91:0x0170), top: B:141:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0145 A[Catch: all -> 0x01ef, TryCatch #7 {all -> 0x01ef, blocks: (B:80:0x0134, B:82:0x013b, B:84:0x0145, B:85:0x014f, B:87:0x0155, B:89:0x0163, B:91:0x0170), top: B:141:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0155 A[Catch: all -> 0x01ef, TryCatch #7 {all -> 0x01ef, blocks: (B:80:0x0134, B:82:0x013b, B:84:0x0145, B:85:0x014f, B:87:0x0155, B:89:0x0163, B:91:0x0170), top: B:141:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0162  */
    /* JADX WARN: Code duplicated, block: B:94:0x0188  */
    public final java.lang.Object a(S2.h hVar, int i3, p117n6.c cVar) {
        E2.u uVar;
        T2.i iVar;
        S2.h hVarA;
        E2.w wVar;
        S2.p pVar;
        E2.g gVar;
        S2.p pVar2;
        E2.g gVar2;
        E2.w wVar2;
        S2.h hVar2;
        S2.h hVar3;
        S.p pVar3;
        java.lang.Object objE;
        S2.h hVar4;
        E2.l lVar;
        S2.p pVar4;
        E2.w wVar3;
        E2.l lVar2;
        coil3.compose.AsyncImagePainter asyncImagePainter;
        final C0.a aVarI;
        E2.g gVar3;
        E2.g gVar4;
        S2.k kVar;
        if (cVar instanceof E2.u) {
            uVar = (E2.u) cVar;
            int i9 = uVar.f2811o;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                uVar.f2811o = i9 - Integer.MIN_VALUE;
            } else {
                uVar = new E2.u(this, cVar);
            }
        } else {
            uVar = new E2.u(this, cVar);
        }
        java.lang.Object objK = uVar.f2809m;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = uVar.f2811o;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    gVar2 = uVar.f2807k;
                    hVar2 = uVar.j;
                    pVar2 = uVar.f2806i;
                    wVar2 = uVar.f2805h;
                    try {
                        com.google.common.util.concurrent.P.u0(objK);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        gVar = gVar2;
                        hVar3 = hVar2;
                        pVar = pVar2;
                        wVar = wVar2;
                    }
                } else if (i10 == 2) {
                    E2.l lVar3 = uVar.f2808l;
                    gVar2 = uVar.f2807k;
                    S2.h hVar5 = uVar.j;
                    pVar4 = uVar.f2806i;
                    E2.w wVar4 = uVar.f2805h;
                    try {
                        com.google.common.util.concurrent.P.u0(objK);
                        lVar = lVar3;
                        hVar4 = hVar5;
                        wVar3 = wVar4;
                        gVar3 = gVar2;
                        try {
                            gVar3.getClass();
                            p100l6.h hVar6 = hVar4.f9258f;
                            E2.v vVar = new E2.v(hVar4, wVar3, (T2.h) objK, gVar3, lVar, null);
                            gVar4 = gVar3;
                            try {
                                uVar.f2805h = wVar3;
                                uVar.f2806i = pVar4;
                                uVar.j = hVar4;
                                uVar.f2807k = gVar4;
                                uVar.f2808l = null;
                                uVar.f2811o = 3;
                                objK = S7.C.K(hVar6, vVar, uVar);
                                if (objK != aVar) {
                                    gVar = gVar4;
                                    pVar = pVar4;
                                    hVar3 = hVar4;
                                    wVar = wVar3;
                                    kVar = (S2.k) objK;
                                    if (kVar instanceof S2.q) {
                                        S.p pVar5 = hVar3.f9255c;
                                        wVar.getClass();
                                        S2.h hVar7 = ((S2.q) kVar).f9293b;
                                        gVar.getClass();
                                        hVar7.getClass();
                                    } else {
                                        if (kVar instanceof S2.d) {
                                            throw new I3.b();
                                        }
                                        wVar.d((S2.d) kVar, hVar3.f9255c, gVar);
                                    }
                                    pVar.c();
                                    return kVar;
                                }
                                return aVar;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                gVar = gVar4;
                                pVar = pVar4;
                                hVar3 = hVar4;
                                wVar = wVar3;
                                if (th instanceof java.util.concurrent.CancellationException) {
                                    E2.r rVar = wVar.f2818a;
                                    gVar.getClass();
                                    hVar3.getClass();
                                    throw th;
                                }
                                S2.d dVarB = C2.a.b(hVar3, th);
                                wVar.d(dVarB, hVar3.f9255c, gVar);
                                pVar.c();
                                return dVarB;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            gVar4 = gVar3;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        gVar = gVar2;
                        hVar3 = hVar5;
                        pVar = pVar4;
                        wVar = wVar4;
                    }
                } else {
                    if (i10 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = uVar.f2807k;
                    hVar3 = uVar.j;
                    pVar = uVar.f2806i;
                    wVar = uVar.f2805h;
                    try {
                        com.google.common.util.concurrent.P.u0(objK);
                        kVar = (S2.k) objK;
                        if (kVar instanceof S2.q) {
                            S.p pVar6 = hVar3.f9255c;
                            wVar.getClass();
                            S2.h hVar8 = ((S2.q) kVar).f9293b;
                            gVar.getClass();
                            hVar8.getClass();
                        } else {
                            if (kVar instanceof S2.d) {
                                throw new I3.b();
                            }
                            wVar.d((S2.d) kVar, hVar3.f9255c, gVar);
                        }
                        pVar.c();
                        return kVar;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                    }
                }
                try {
                    if (th instanceof java.util.concurrent.CancellationException) {
                        S2.d dVarB2 = C2.a.b(hVar3, th);
                        wVar.d(dVarB2, hVar3.f9255c, gVar);
                        pVar.c();
                        return dVarB2;
                    }
                    E2.r rVar2 = wVar.f2818a;
                    gVar.getClass();
                    hVar3.getClass();
                    throw th;
                } catch (java.lang.Throwable th6) {
                    pVar.c();
                    throw th6;
                }
            }
            com.google.common.util.concurrent.P.u0(objK);
            S7.InterfaceC0891h0 interfaceC0891h0T = S7.C.t(uVar.getContext());
            boolean z6 = i3 == 0;
            S2.a aVar2 = this.f2819b;
            aVar2.getClass();
            S.p pVar7 = hVar.f9255c;
            androidx.lifecycle.AbstractC1534p lifecycle = (androidx.lifecycle.AbstractC1534p) E2.p.d(hVar, S2.j.f9279e);
            if (lifecycle == null) {
                if (!z6) {
                    lifecycle = null;
                    break;
                }
                java.lang.Object baseContext = hVar.f9253a;
                while (true) {
                    if (baseContext instanceof androidx.lifecycle.InterfaceC1540w) {
                        lifecycle = ((androidx.lifecycle.InterfaceC1540w) baseContext).getLifecycle();
                        break;
                    }
                    if (!(baseContext instanceof android.content.ContextWrapper)) {
                        lifecycle = null;
                        break;
                    }
                    baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
                }
            }
            S2.p lVar4 = lifecycle != null ? new S2.l(lifecycle, interfaceC0891h0T) : new S2.b(interfaceC0891h0T);
            S2.e eVarA = S2.h.a(hVar);
            eVarA.f9220b = ((E2.w) aVar2.f9211i).f2818a.f2796b;
            S2.g gVar5 = hVar.f9269s;
            T2.i iVar2 = gVar5.g;
            if (iVar2 == null) {
                iVar = T2.i.f9741a;
                eVarA.f9228l = iVar;
            } else {
                iVar = iVar2;
            }
            if (gVar5.f9251h == null) {
                eVarA.f9229m = hVar.f9266p;
            }
            if (gVar5.f9252i == null) {
                eVarA.f9230n = (iVar2 == null && kotlin.jvm.internal.m.a(iVar, T2.i.f9741a)) ? T2.d.f9734i : T2.d.f9733h;
            }
            hVarA = eVarA.a();
            E2.g gVar6 = E2.g.f2782a;
            try {
                if (hVarA.f9254b.equals(S2.m.f9283a)) {
                    throw new S2.n("The request's data is null.");
                }
                lVar4.start();
                if (i3 == 0) {
                    uVar.f2805h = this;
                    uVar.f2806i = lVar4;
                    uVar.j = hVarA;
                    uVar.f2807k = gVar6;
                    uVar.f2811o = 1;
                    if (lVar4.a(uVar) != aVar) {
                        pVar2 = lVar4;
                        gVar2 = gVar6;
                        wVar2 = this;
                        hVar2 = hVarA;
                    }
                } else {
                    pVar2 = lVar4;
                    gVar2 = gVar6;
                    wVar2 = this;
                    hVarA.getClass();
                    pVar3 = hVarA.f9255c;
                    if (pVar3 != null) {
                        lVar2 = (E2.l) hVarA.f9262l.invoke(hVarA);
                        if (lVar2 == null) {
                            lVar2 = (E2.l) hVarA.f9270t.f9239h.invoke(hVarA);
                        }
                        asyncImagePainter = (coil3.compose.AsyncImagePainter) pVar3.j;
                        if (lVar2 != null) {
                            aVarI = p199y3.e.i(lVar2, ((S2.h) pVar3.f9153i).f9253a, asyncImagePainter.f18550w);
                        } else {
                            aVarI = null;
                        }
                        coil3.compose.AsyncImagePainter.k(asyncImagePainter, new F2.f(aVarI) { // from class: coil3.compose.AsyncImagePainter$State$Loading
                            private final C0.a painter;

                            {
                                this.painter = aVarI;
                            }

                            @Override // F2.f
                            /* JADX INFO: renamed from: a, reason: from getter */
                            public final C0.a getPainter() {
                                return this.painter;
                            }

                            public final boolean equals(java.lang.Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof coil3.compose.AsyncImagePainter$State$Loading) && kotlin.jvm.internal.m.a(this.painter, ((coil3.compose.AsyncImagePainter$State$Loading) obj).painter);
                            }

                            public final int hashCode() {
                                C0.a aVar3 = this.painter;
                                if (aVar3 == null) {
                                    return 0;
                                }
                                return aVar3.hashCode();
                            }

                            public final java.lang.String toString() {
                                return "Loading(painter=" + this.painter + ')';
                            }
                        });
                    }
                    gVar2.getClass();
                    T2.i iVar3 = hVarA.f9265o;
                    uVar.f2805h = wVar2;
                    uVar.f2806i = pVar2;
                    uVar.j = hVarA;
                    uVar.f2807k = gVar2;
                    uVar.f2808l = null;
                    uVar.f2811o = 2;
                    objE = iVar3.e(uVar);
                    if (objE != aVar) {
                        hVar4 = hVarA;
                        lVar = null;
                        pVar4 = pVar2;
                        wVar3 = wVar2;
                        objK = objE;
                        gVar3 = gVar2;
                        gVar3.getClass();
                        p100l6.h hVar9 = hVar4.f9258f;
                        E2.v vVar2 = new E2.v(hVar4, wVar3, (T2.h) objK, gVar3, lVar, null);
                        gVar4 = gVar3;
                        uVar.f2805h = wVar3;
                        uVar.f2806i = pVar4;
                        uVar.j = hVar4;
                        uVar.f2807k = gVar4;
                        uVar.f2808l = null;
                        uVar.f2811o = 3;
                        objK = S7.C.K(hVar9, vVar2, uVar);
                        if (objK != aVar) {
                            gVar = gVar4;
                            pVar = pVar4;
                            hVar3 = hVar4;
                            wVar = wVar3;
                            kVar = (S2.k) objK;
                            if (kVar instanceof S2.q) {
                                S.p pVar8 = hVar3.f9255c;
                                wVar.getClass();
                                S2.h hVar10 = ((S2.q) kVar).f9293b;
                                gVar.getClass();
                                hVar10.getClass();
                            } else {
                                if (kVar instanceof S2.d) {
                                    throw new I3.b();
                                }
                                wVar.d((S2.d) kVar, hVar3.f9255c, gVar);
                            }
                            pVar.c();
                            return kVar;
                        }
                    }
                }
                return aVar;
            } catch (java.lang.Throwable th7) {
                th = th7;
                wVar = this;
                pVar = lVar4;
                gVar = gVar6;
                hVar3 = hVarA;
                if (th instanceof java.util.concurrent.CancellationException) {
                    S2.d dVarB3 = C2.a.b(hVar3, th);
                    wVar.d(dVarB3, hVar3.f9255c, gVar);
                    pVar.c();
                    return dVarB3;
                }
                E2.r rVar3 = wVar.f2818a;
                gVar.getClass();
                hVar3.getClass();
                throw th;
            }
            hVarA.getClass();
            pVar3 = hVarA.f9255c;
            if (pVar3 != null) {
                lVar2 = (E2.l) hVarA.f9262l.invoke(hVarA);
                if (lVar2 == null) {
                    lVar2 = (E2.l) hVarA.f9270t.f9239h.invoke(hVarA);
                }
                asyncImagePainter = (coil3.compose.AsyncImagePainter) pVar3.j;
                if (lVar2 != null) {
                    aVarI = p199y3.e.i(lVar2, ((S2.h) pVar3.f9153i).f9253a, asyncImagePainter.f18550w);
                } else {
                    aVarI = null;
                }
                coil3.compose.AsyncImagePainter.k(asyncImagePainter, new F2.f(aVarI) { // from class: coil3.compose.AsyncImagePainter$State$Loading
                    private final C0.a painter;

                    {
                        this.painter = aVarI;
                    }

                    @Override // F2.f
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final C0.a getPainter() {
                        return this.painter;
                    }

                    public final boolean equals(java.lang.Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof coil3.compose.AsyncImagePainter$State$Loading) && kotlin.jvm.internal.m.a(this.painter, ((coil3.compose.AsyncImagePainter$State$Loading) obj).painter);
                    }

                    public final int hashCode() {
                        C0.a aVar3 = this.painter;
                        if (aVar3 == null) {
                            return 0;
                        }
                        return aVar3.hashCode();
                    }

                    public final java.lang.String toString() {
                        return "Loading(painter=" + this.painter + ')';
                    }
                });
            }
            gVar2.getClass();
            T2.i iVar4 = hVarA.f9265o;
            uVar.f2805h = wVar2;
            uVar.f2806i = pVar2;
            uVar.j = hVarA;
            uVar.f2807k = gVar2;
            uVar.f2808l = null;
            uVar.f2811o = 2;
            objE = iVar4.e(uVar);
            if (objE != aVar) {
                hVar4 = hVarA;
                lVar = null;
                pVar4 = pVar2;
                wVar3 = wVar2;
                objK = objE;
                gVar3 = gVar2;
                gVar3.getClass();
                p100l6.h hVar11 = hVar4.f9258f;
                E2.v vVar3 = new E2.v(hVar4, wVar3, (T2.h) objK, gVar3, lVar, null);
                gVar4 = gVar3;
                uVar.f2805h = wVar3;
                uVar.f2806i = pVar4;
                uVar.j = hVar4;
                uVar.f2807k = gVar4;
                uVar.f2808l = null;
                uVar.f2811o = 3;
                objK = S7.C.K(hVar11, vVar3, uVar);
                if (objK != aVar) {
                    gVar = gVar4;
                    pVar = pVar4;
                    hVar3 = hVar4;
                    wVar = wVar3;
                    kVar = (S2.k) objK;
                    if (kVar instanceof S2.q) {
                        S.p pVar9 = hVar3.f9255c;
                        wVar.getClass();
                        S2.h hVar12 = ((S2.q) kVar).f9293b;
                        gVar.getClass();
                        hVar12.getClass();
                    } else {
                        if (kVar instanceof S2.d) {
                            throw new I3.b();
                        }
                        wVar.d((S2.d) kVar, hVar3.f9255c, gVar);
                    }
                    pVar.c();
                    return kVar;
                }
            }
            return aVar;
        } catch (java.lang.Throwable th8) {
            th = th8;
            gVar = gVar2;
            pVar = pVar2;
            wVar = wVar2;
            hVar3 = hVarA;
        }
        hVarA = hVar2;
    }

    public final java.lang.Object b(S2.h hVar, p117n6.c cVar) {
        S.p pVar = hVar.f9255c;
        return ((hVar.f9265o instanceof T2.f) || ((androidx.lifecycle.AbstractC1534p) E2.p.d(hVar, S2.j.f9279e)) != null) ? S7.C.m(new E2.t(this, hVar, null), cVar) : a(hVar, 1, cVar);
    }

    public final N2.c c() {
        return (N2.c) this.f2818a.f2797c.getValue();
    }

    public final void d(S2.d dVar, S.p pVar, E2.g gVar) {
        S2.h hVar = dVar.f9217b;
        gVar.getClass();
        hVar.getClass();
    }
}
