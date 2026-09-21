package s0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.lifecycle.DefaultLifecycleObserver, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.compose.ui.platform.AndroidComposeView f27204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E5.C0313s0 f27205i;
    public U0.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f27206k = new java.util.ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f27207l = 100;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s0.a f27208m = s0.a.f27196h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f27209n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final U7.j f27210o = N3.a.b(1, 6, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final android.os.Handler f27211p = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p136q.w f27212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f27213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p136q.w f27214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public R0.O0 f27215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f27216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p138q1.a f27217v;

    public f(androidx.compose.ui.platform.AndroidComposeView androidComposeView, E5.C0313s0 c0313s0) {
        this.f27204h = androidComposeView;
        this.f27205i = c0313s0;
        p136q.w wVar = p136q.AbstractC2669m.f26402a;
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f27212q = wVar;
        this.f27214s = new p136q.w();
        Y0.p pVarA = androidComposeView.getSemanticsOwner().a();
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f27215t = new R0.O0(pVarA, wVar);
        this.f27217v = new p138q1.a(2, this);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[PHI: r2
  0x0047: PHI (r2v3 U7.e) = (r2v1 U7.e), (r2v2 U7.e), (r2v5 U7.e) binds: [B:16:0x003a, B:29:0x007d, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[PHI: r2 r8
  0x0052: PHI (r2v2 U7.e) = (r2v3 U7.e), (r2v4 U7.e) binds: [B:18:0x004f, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r8v3 java.lang.Object) = (r8v11 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x004f, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p117n6.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof s0.d
            if (r0 == 0) goto L13
            r0 = r8
            s0.d r0 = (s0.d) r0
            int r1 = r0.f27202k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27202k = r1
            goto L18
        L13:
            s0.d r0 = new s0.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f27201i
            m6.a r1 = p109m6.a.f25430h
            int r2 = r0.f27202k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            U7.e r2 = r0.f27200h
            com.google.common.util.concurrent.P.u0(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            U7.e r2 = r0.f27200h
            com.google.common.util.concurrent.P.u0(r8)
            goto L52
        L3a:
            com.google.common.util.concurrent.P.u0(r8)
            U7.j r8 = r7.f27210o
            r8.getClass()
            U7.e r2 = new U7.e
            r2.<init>(r8)
        L47:
            r0.f27200h = r2
            r0.f27202k = r4
            java.lang.Object r8 = r2.b(r0)
            if (r8 != r1) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r2.c()
            boolean r8 = r7.f()
            if (r8 == 0) goto L66
            r7.g()
        L66:
            boolean r8 = r7.f27216u
            if (r8 != 0) goto L73
            r7.f27216u = r4
            android.os.Handler r8 = r7.f27211p
            q1.a r5 = r7.f27217v
            r8.post(r5)
        L73:
            r0.f27200h = r2
            r0.f27202k = r3
            long r5 = r7.f27207l
            java.lang.Object r8 = S7.C.n(r5, r0)
            if (r8 != r1) goto L47
        L7f:
            return r1
        L80:
            h6.A r8 = p070h6.A.f22523a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.f.a(n6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[LOOP:2: B:21:0x006f->B:39:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d2 A[EDGE_INSN: B:91:0x00d2->B:41:0x00d2 BREAK  A[LOOP:2: B:21:0x006f->B:39:0x00c9], SYNTHETIC] */
    public final void c(p136q.AbstractC2668l abstractC2668l) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long j;
        char c9;
        long j9;
        int i3;
        long[] jArr2;
        long[] jArr3;
        long j10;
        long j11;
        p136q.AbstractC2668l abstractC2668l2 = abstractC2668l;
        int[] iArr3 = abstractC2668l2.f26398b;
        long[] jArr4 = abstractC2668l2.f26397a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j12 = jArr4[i9];
            char c10 = 7;
            long j13 = -9187201950435737472L;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((j12 & 255) < 128) {
                        int i13 = iArr3[(i9 << 3) + i12];
                        c9 = c10;
                        R0.O0 o8 = (R0.O0) this.f27214s.b(i13);
                        Y0.q qVar = (Y0.q) abstractC2668l2.b(i13);
                        Y0.p pVar = qVar != null ? qVar.f11097a : null;
                        if (pVar == null) {
                            throw p121o0.p.h("no value for specified key");
                        }
                        j9 = j13;
                        int i14 = pVar.g;
                        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = pVar.f11094d;
                        if (o8 == null) {
                            p136q.H h9 = semanticsConfiguration.f15960h;
                            java.lang.Object[] objArr = h9.f26323b;
                            long[] jArr5 = h9.f26322a;
                            int length2 = jArr5.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i15 = i10;
                                int i16 = 0;
                                while (true) {
                                    long j14 = jArr5[i16];
                                    j = j12;
                                    if ((((~j14) << c9) & j14 & j9) != j9) {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j14 & 255) < 128) {
                                                j11 = j14;
                                                Y0.w wVar = (Y0.w) objArr[(i16 << 3) + i18];
                                                Y0.w wVar2 = Y0.t.f11119a;
                                                Y0.w wVar3 = Y0.t.f11105B;
                                                if (kotlin.jvm.internal.m.a(wVar, wVar3)) {
                                                    java.util.List list = (java.util.List) Y0.s.d(semanticsConfiguration, wVar3);
                                                    i(i14, java.lang.String.valueOf(list != null ? (p011b1.C1650g) p078i6.o.j1(list) : null));
                                                }
                                            } else {
                                                j11 = j14;
                                            }
                                            j14 = j11 >> i15;
                                        }
                                        if (i17 != i15) {
                                            break;
                                        }
                                        if (i16 != length2) {
                                            break;
                                        }
                                        i16++;
                                        j12 = j;
                                        i15 = 8;
                                    } else if (i16 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i16++;
                                        j12 = j;
                                        i15 = 8;
                                    }
                                }
                            } else {
                                j = j12;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j12;
                            p136q.H h10 = semanticsConfiguration.f15960h;
                            java.lang.Object[] objArr2 = h10.f26323b;
                            long[] jArr6 = h10.f26322a;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                java.lang.Object[] objArr3 = objArr2;
                                jArr4 = jArr4;
                                int i19 = 0;
                                while (true) {
                                    long j15 = jArr6[i19];
                                    java.lang.Object[] objArr4 = objArr3;
                                    i3 = i12;
                                    if ((((~j15) << c9) & j15 & j9) != j9) {
                                        int i20 = 8 - ((~(i19 - length3)) >>> 31);
                                        int i21 = 0;
                                        while (i21 < i20) {
                                            if ((j15 & 255) < 128) {
                                                jArr3 = jArr6;
                                                Y0.w wVar4 = (Y0.w) objArr4[(i19 << 3) + i21];
                                                Y0.w wVar5 = Y0.t.f11119a;
                                                j10 = j15;
                                                Y0.w wVar6 = Y0.t.f11105B;
                                                if (kotlin.jvm.internal.m.a(wVar4, wVar6)) {
                                                    java.util.List list2 = (java.util.List) Y0.s.d(o8.f8837a, wVar6);
                                                    p011b1.C1650g c1650g = list2 != null ? (p011b1.C1650g) p078i6.o.j1(list2) : null;
                                                    java.util.List list3 = (java.util.List) Y0.s.d(semanticsConfiguration, wVar6);
                                                    p011b1.C1650g c1650g2 = list3 != null ? (p011b1.C1650g) p078i6.o.j1(list3) : null;
                                                    if (!kotlin.jvm.internal.m.a(c1650g, c1650g2)) {
                                                        i(i14, java.lang.String.valueOf(c1650g2));
                                                    }
                                                }
                                            } else {
                                                jArr3 = jArr6;
                                                j10 = j15;
                                            }
                                            j15 = j10 >> 8;
                                            i21++;
                                            jArr6 = jArr3;
                                        }
                                        jArr2 = jArr6;
                                        if (i20 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr6;
                                    }
                                    if (i19 == length3) {
                                        break;
                                    }
                                    i19++;
                                    i12 = i3;
                                    objArr3 = objArr4;
                                    jArr6 = jArr2;
                                }
                            }
                            j12 = j >> 8;
                            i12 = i3 + 1;
                            jArr4 = jArr4;
                            c10 = c9;
                            j13 = j9;
                            iArr3 = iArr2;
                            i10 = 8;
                            abstractC2668l2 = abstractC2668l;
                        }
                    } else {
                        iArr2 = iArr3;
                        j = j12;
                        c9 = c10;
                        j9 = j13;
                    }
                    i3 = i12;
                    j12 = j >> 8;
                    i12 = i3 + 1;
                    jArr4 = jArr4;
                    c10 = c9;
                    j13 = j9;
                    iArr3 = iArr2;
                    i10 = 8;
                    abstractC2668l2 = abstractC2668l;
                }
                iArr = iArr3;
                int i22 = i10;
                jArr = jArr4;
                if (i11 != i22) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i9 == length) {
                return;
            }
            i9++;
            abstractC2668l2 = abstractC2668l;
            jArr4 = jArr;
            iArr3 = iArr;
        }
    }

    public final void d(Y0.p pVar, p194x6.m mVar) {
        pVar.getClass();
        java.util.List listJ = Y0.p.j(4, pVar);
        int size = listJ.size();
        int i3 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            java.lang.Object obj = listJ.get(i9);
            if (e().a(((Y0.p) obj).g)) {
                mVar.invoke(java.lang.Integer.valueOf(i3), obj);
                i3++;
            }
        }
    }

    public final p136q.AbstractC2668l e() {
        if (this.f27209n) {
            this.f27209n = false;
            this.f27212q = Y0.s.b(this.f27204h.getSemanticsOwner(), s0.e.f27203h);
            this.f27213r = java.lang.System.currentTimeMillis();
        }
        return this.f27212q;
    }

    public final boolean f() {
        return this.j != null;
    }

    public final void g() {
        U0.c cVar = this.j;
        if (cVar == null || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        java.util.ArrayList arrayList = this.f27206k;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            java.lang.Object obj = cVar.f10105a;
            if (i3 >= size) {
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    android.view.contentcapture.ContentCaptureSession contentCaptureSessionM = D1.o0.m(obj);
                    U0.a aVarW = C2.a.w(cVar.f10106b);
                    java.util.Objects.requireNonNull(aVarW);
                    U0.b.h(contentCaptureSessionM, U.AbstractC0944q.s(aVarW.f10104h), new long[]{Long.MIN_VALUE});
                }
                arrayList.clear();
                return;
            }
            s0.g gVar = (s0.g) arrayList.get(i3);
            int iOrdinal = gVar.f27220c.ordinal();
            if (iOrdinal == 0) {
                p166t3.i iVar = gVar.f27221d;
                if (iVar != null && android.os.Build.VERSION.SDK_INT >= 29) {
                    U0.b.e(D1.o0.m(obj), (android.view.ViewStructure) iVar.f27782i);
                }
            } else {
                if (iOrdinal != 1) {
                    throw new I3.b();
                }
                android.view.autofill.AutofillId autofillIdA = cVar.a(gVar.f27218a);
                if (autofillIdA != null && android.os.Build.VERSION.SDK_INT >= 29) {
                    U0.b.f(D1.o0.m(obj), autofillIdA);
                }
            }
            i3++;
        }
    }

    public final void h(Y0.p pVar, R0.O0 o8) {
        d(pVar, new O0.M(o8, this, 8));
        java.util.List listJ = Y0.p.j(4, pVar);
        int size = listJ.size();
        for (int i3 = 0; i3 < size; i3++) {
            Y0.p pVar2 = (Y0.p) listJ.get(i3);
            if (e().a(pVar2.g)) {
                p136q.w wVar = this.f27214s;
                int i9 = pVar2.g;
                if (wVar.a(i9)) {
                    java.lang.Object objB = wVar.b(i9);
                    if (objB == null) {
                        throw p121o0.p.h("node not present in pruned tree before this change");
                    }
                    h(pVar2, (R0.O0) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void i(int i3, java.lang.String str) {
        U0.c cVar;
        int i9 = android.os.Build.VERSION.SDK_INT;
        if (i9 >= 29 && (cVar = this.j) != null) {
            android.view.autofill.AutofillId autofillIdA = cVar.a(i3);
            if (autofillIdA == null) {
                throw p121o0.p.h("Invalid content capture ID");
            }
            if (i9 >= 29) {
                U0.b.g(D1.o0.m(cVar.f10105a), autofillIdA, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0195  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    public final void j(int i3, Y0.p pVar) {
        p194x6.j jVar;
        int i9;
        U0.a aVarW;
        android.view.autofill.AutofillId autofillIdS;
        p181w0.b bVarA;
        p166t3.i iVar;
        java.lang.String strS;
        p194x6.j jVar2;
        if (f()) {
            androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = pVar.f11094d;
            Y0.w wVar = Y0.t.f11107D;
            p136q.H h9 = semanticsConfiguration.f15960h;
            java.lang.Object objG = h9.g(wVar);
            if (objG == null) {
                objG = null;
            }
            java.lang.Boolean bool = (java.lang.Boolean) objG;
            if (this.f27208m == s0.a.f27196h && kotlin.jvm.internal.m.a(bool, java.lang.Boolean.TRUE)) {
                java.lang.Object objG2 = h9.g(Y0.l.f11074m);
                if (objG2 == null) {
                    objG2 = null;
                }
                Y0.a aVar = (Y0.a) objG2;
                if (aVar != null && (jVar2 = (p194x6.j) aVar.f11025b) != null) {
                }
            } else if (this.f27208m == s0.a.f27197i && kotlin.jvm.internal.m.a(bool, java.lang.Boolean.FALSE)) {
                java.lang.Object objG3 = h9.g(Y0.l.f11074m);
                if (objG3 == null) {
                    objG3 = null;
                }
                Y0.a aVar2 = (Y0.a) objG3;
                if (aVar2 != null && (jVar = (p194x6.j) aVar2.f11025b) != null) {
                }
            }
            U0.c cVar = this.j;
            if (cVar == null || (i9 = android.os.Build.VERSION.SDK_INT) < 29 || (aVarW = C2.a.w(this.f27204h)) == null) {
                iVar = null;
            } else {
                Y0.p pVarL = pVar.l();
                if (pVarL != null) {
                    autofillIdS = cVar.a(pVarL.g);
                    if (autofillIdS == null) {
                        iVar = null;
                    }
                } else {
                    autofillIdS = U.AbstractC0944q.s(aVarW.f10104h);
                }
                int i10 = pVar.g;
                p166t3.i iVar2 = i9 >= 29 ? new p166t3.i(22, U0.b.d(D1.o0.m(cVar.f10105a), autofillIdS, i10)) : null;
                if (iVar2 == null) {
                    iVar = null;
                } else {
                    Y0.w wVar2 = Y0.t.f11113K;
                    androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration2 = pVar.f11094d;
                    p136q.H h10 = semanticsConfiguration2.f15960h;
                    if (h10.c(wVar2)) {
                        iVar = null;
                    } else {
                        android.view.ViewStructure viewStructure = (android.view.ViewStructure) iVar2.f27782i;
                        android.os.Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.f27213r);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i3);
                        }
                        java.lang.Object objG4 = h10.g(Y0.t.f11141z);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        java.lang.String str = (java.lang.String) objG4;
                        if (str != null) {
                            viewStructure.setId(i10, null, null, str);
                        }
                        java.lang.Object objG5 = h10.g(Y0.t.f11129m);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (((java.lang.Boolean) objG5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        java.lang.Object objG6 = h10.g(Y0.t.f11105B);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        java.util.List list = (java.util.List) objG6;
                        if (list != null) {
                            viewStructure.setClassName(io.sentry.SentryReplayOptions.TEXT_VIEW_CLASS_NAME);
                            viewStructure.setText(p1.a.a(list, "\n", null, 62));
                        }
                        java.lang.Object objG7 = h10.g(Y0.t.f11109F);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        p011b1.C1650g c1650g = (p011b1.C1650g) objG7;
                        if (c1650g != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(c1650g);
                        }
                        java.lang.Object objG8 = h10.g(Y0.t.f11119a);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        java.util.List list2 = (java.util.List) objG8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(p1.a.a(list2, "\n", null, 62));
                        }
                        java.lang.Object objG9 = h10.g(Y0.t.y);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        Y0.i iVar3 = (Y0.i) objG9;
                        if (iVar3 != null && (strS = R0.L.s(iVar3.f11038a)) != null) {
                            viewStructure.setClassName(strS);
                        }
                        p011b1.J jL = R0.L.l(semanticsConfiguration2);
                        if (jL != null) {
                            p011b1.I i11 = jL.f17772a;
                            float fC = p113n1.p.c(i11.f17765b.f17786a.f17745b);
                            p113n1.c cVar2 = i11.g;
                            viewStructure.setTextStyle(cVar2.S() * cVar2.getDensity() * fC, 0, 0, 0);
                        }
                        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorD = pVar.d();
                        if (nodeCoordinatorD == null) {
                            bVarA = p181w0.b.f29745e;
                        } else {
                            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = nodeCoordinatorD.U0().f26487u ? nodeCoordinatorD : null;
                            if (nodeCoordinator != null) {
                                bVarA = pVar.a(nodeCoordinator);
                            } else {
                                bVarA = p181w0.b.f29745e;
                            }
                        }
                        float f9 = bVarA.f29746a;
                        float f10 = bVarA.f29747b;
                        viewStructure.setDimens((int) f9, (int) f10, 0, 0, (int) (bVarA.f29748c - f9), (int) (bVarA.f29749d - f10));
                        iVar = iVar2;
                    }
                }
            }
            if (iVar != null) {
                this.f27206k.add(new s0.g(pVar.g, this.f27213r, s0.h.f27222h, iVar));
            }
            d(pVar, new R0.C0811a(8, this));
        }
    }

    public final void k(Y0.p pVar) {
        if (f()) {
            this.f27206k.add(new s0.g(pVar.g, this.f27213r, s0.h.f27223i, null));
            java.util.List listJ = Y0.p.j(4, pVar);
            int size = listJ.size();
            for (int i3 = 0; i3 < size; i3++) {
                k((Y0.p) listJ.get(i3));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void l() {
        p136q.w wVar = this.f27214s;
        wVar.c();
        p136q.AbstractC2668l abstractC2668lE = e();
        int[] iArr = abstractC2668lE.f26398b;
        java.lang.Object[] objArr = abstractC2668lE.f26399c;
        long[] jArr = abstractC2668lE.f26397a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128) {
                            int i11 = (i3 << 3) + i10;
                            wVar.h(iArr[i11], new R0.O0(((Y0.q) objArr[i11]).f11097a, e()));
                        }
                        j >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f27215t = new R0.O0(this.f27204h.getSemanticsOwner().a(), e());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(androidx.lifecycle.InterfaceC1540w interfaceC1540w) {
        this.j = (U0.c) this.f27205i.invoke();
        j(-1, this.f27204h.getSemanticsOwner().a());
        g();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(androidx.lifecycle.InterfaceC1540w interfaceC1540w) {
        k(this.f27204h.getSemanticsOwner().a());
        g();
        this.j = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.f27211p.removeCallbacks(this.f27217v);
        this.j = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
