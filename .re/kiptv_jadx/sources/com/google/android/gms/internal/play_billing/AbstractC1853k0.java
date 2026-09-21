package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1853k0 implements p031d1.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f19349h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f19350i = 0;
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f19351k = 0;

    public static final long A(long j9, float f9) {
        return (java.lang.Float.isNaN(f9) || f9 >= 1.0f) ? j9 : p188x0.C3098s.c(j9, p188x0.C3098s.e(j9) * f9);
    }

    public static long D(long j9, long j10) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(~j10) + java.lang.Long.numberOfLeadingZeros(j10) + java.lang.Long.numberOfLeadingZeros(~j9) + java.lang.Long.numberOfLeadingZeros(j9);
        if (iNumberOfLeadingZeros > 65) {
            return j9 * j10;
        }
        long j11 = ((j9 ^ j10) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j10 == Long.MIN_VALUE) & (j9 < 0)))) {
            long j12 = j9 * j10;
            if (j9 == 0 || j12 / j9 == j10) {
                return j12;
            }
        }
        return j11;
    }

    public static final java.lang.String E(N6.InterfaceC0691e classDescriptor, java.lang.String jvmDescriptor) {
        kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
        kotlin.jvm.internal.m.e(jvmDescriptor, "jvmDescriptor");
        java.lang.String str = M6.d.f7152a;
        p101l7.b bVarF = M6.d.f(p161s7.d.g(classDescriptor).f24829a);
        java.lang.String internalName = bVarF != null ? p169t7.b.e(bVarF) : com.google.common.util.concurrent.U.m0(classDescriptor, p044e7.f.f21455d);
        kotlin.jvm.internal.m.e(internalName, "internalName");
        return internalName + '.' + jvmDescriptor;
    }

    public static java.lang.String F(long j9) {
        int i3 = (int) (j9 >> 32);
        int i9 = (int) (j9 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i3) == java.lang.Float.intBitsToFloat(i9)) {
            return "CornerRadius.circular(" + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(java.lang.Float.intBitsToFloat(i3)) + ')';
        }
        return "CornerRadius.elliptical(" + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(java.lang.Float.intBitsToFloat(i3)) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(java.lang.Float.intBitsToFloat(i9)) + ')';
    }

    public static C7.T G(C7.T t9) {
        if (!(t9 instanceof C7.C0187t)) {
            return new C7.S(t9, 1);
        }
        C7.C0187t c0187t = (C7.C0187t) t9;
        C7.P[] pArr = c0187t.f1603c;
        N6.U[] uArr = c0187t.f1602b;
        java.util.ArrayList<p070h6.k> arrayListG0 = p078i6.m.G0(pArr, uArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(arrayListG0, 10));
        for (p070h6.k kVar : arrayListG0) {
            arrayList.add(j((C7.P) kVar.f22539h, (N6.U) kVar.f22540i));
        }
        return new C7.C0187t(uArr, (C7.P[]) arrayList.toArray(new C7.P[0]), true);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0132  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:71:0x014a  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void c(kotlin.jvm.functions.Function0 function0, p146r1.x xVar, p089k0.e eVar, p020c0.C1700q c1700q, int i3, int i9) {
        int i10;
        p146r1.x xVar2;
        int i11;
        boolean z6;
        p146r1.x xVar3;
        p020c0.C1701q0 c1701q0U;
        android.view.View view;
        p113n1.c cVar;
        p113n1.n nVar;
        p020c0.C1696o c1696oE;
        p020c0.X xF;
        java.lang.Object objQ;
        java.lang.Object obj;
        java.util.UUID uuid;
        boolean zF;
        java.lang.Object objQ2;
        p146r1.w wVar;
        p146r1.y yVar;
        boolean zH;
        java.lang.Object objQ3;
        boolean z9;
        boolean zD;
        java.lang.Object objQ4;
        int i12;
        c1700q.e0(826668973);
        if ((i3 & 6) == 0) {
            i10 = (c1700q.h(function0) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        int i13 = i9 & 2;
        if (i13 == 0) {
            if ((i3 & 48) == 0) {
                xVar2 = xVar;
                i10 |= c1700q.f(xVar2) ? 32 : 16;
            }
            if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                if (c1700q.h(eVar)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
                i10 |= i12;
            }
            i11 = i10;
            if ((i11 & 147) != 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (c1700q.T(i11 & 1, z6)) {
                if (i13 != 0) {
                    xVar3 = new p146r1.x(7);
                } else {
                    xVar3 = xVar2;
                }
                view = (android.view.View) c1700q.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f15959f);
                cVar = (p113n1.c) c1700q.j(R0.AbstractC0844q0.f8966h);
                nVar = (p113n1.n) c1700q.j(R0.AbstractC0844q0.f8971n);
                c1696oE = p020c0.AbstractC1703s.E(c1700q);
                xF = p020c0.AbstractC1703s.F(eVar, c1700q);
                java.lang.Object[] objArr = new java.lang.Object[0];
                objQ = c1700q.Q();
                obj = p020c0.C1690l.f18284a;
                if (objQ == obj) {
                    objQ = p146r1.C2682e.f26735i;
                    c1700q.n0(objQ);
                }
                uuid = (java.util.UUID) p112n0.l.e(objArr, (kotlin.jvm.functions.Function0) objQ, c1700q, 48);
                zF = c1700q.f(view) | c1700q.f(cVar);
                objQ2 = c1700q.Q();
                if (zF || objQ2 == obj) {
                    p146r1.y yVar2 = new p146r1.y(function0, xVar3, view, nVar, cVar, uuid);
                    p089k0.e eVar2 = new p089k0.e(346960332, new R0.C0811a(4, xF), true);
                    wVar = yVar2.f26792n;
                    wVar.setParentCompositionContext(c1696oE);
                    wVar.f26778q.setValue(eVar2);
                    wVar.f26782u = true;
                    if (wVar.f8875k != null && !wVar.isAttachedToWindow()) {
                        throw new java.lang.IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                    }
                    wVar.d();
                    c1700q.n0(yVar2);
                    objQ2 = yVar2;
                }
                yVar = (p146r1.y) objQ2;
                zH = c1700q.h(yVar);
                objQ3 = c1700q.Q();
                if (zH || objQ3 == obj) {
                    objQ3 = new p146r1.C2679b(yVar, 0);
                    c1700q.n0(objQ3);
                }
                p020c0.AbstractC1703s.d(yVar, (p194x6.j) objQ3, c1700q);
                boolean zH2 = c1700q.h(yVar);
                if ((i11 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zD = zH2 | z9 | ((i11 & 112) == 32) | c1700q.d(nVar.ordinal());
                objQ4 = c1700q.Q();
                if (zD || objQ4 == obj) {
                    objQ4 = new p146r1.C2680c(yVar, function0, xVar3, nVar);
                    c1700q.n0(objQ4);
                }
                p020c0.AbstractC1703s.i((kotlin.jvm.functions.Function0) objQ4, c1700q);
            } else {
                c1700q.W();
                xVar3 = xVar2;
            }
            c1701q0U = c1700q.u();
            if (c1701q0U != null) {
                c1701q0U.f18351d = new p138q1.l(function0, xVar3, eVar, i3, i9);
            }
        }
        i10 |= 48;
        xVar2 = xVar;
        if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (c1700q.h(eVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        i11 = i10;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (c1700q.T(i11 & 1, z6)) {
            if (i13 != 0) {
                xVar3 = new p146r1.x(7);
            } else {
                xVar3 = xVar2;
            }
            view = (android.view.View) c1700q.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f15959f);
            cVar = (p113n1.c) c1700q.j(R0.AbstractC0844q0.f8966h);
            nVar = (p113n1.n) c1700q.j(R0.AbstractC0844q0.f8971n);
            c1696oE = p020c0.AbstractC1703s.E(c1700q);
            xF = p020c0.AbstractC1703s.F(eVar, c1700q);
            java.lang.Object[] objArr2 = new java.lang.Object[0];
            objQ = c1700q.Q();
            obj = p020c0.C1690l.f18284a;
            if (objQ == obj) {
                objQ = p146r1.C2682e.f26735i;
                c1700q.n0(objQ);
            }
            uuid = (java.util.UUID) p112n0.l.e(objArr2, (kotlin.jvm.functions.Function0) objQ, c1700q, 48);
            zF = c1700q.f(view) | c1700q.f(cVar);
            objQ2 = c1700q.Q();
            if (zF) {
                p146r1.y yVar3 = new p146r1.y(function0, xVar3, view, nVar, cVar, uuid);
                p089k0.e eVar3 = new p089k0.e(346960332, new R0.C0811a(4, xF), true);
                wVar = yVar3.f26792n;
                wVar.setParentCompositionContext(c1696oE);
                wVar.f26778q.setValue(eVar3);
                wVar.f26782u = true;
                if (wVar.f8875k != null) {
                }
                wVar.d();
                c1700q.n0(yVar3);
                objQ2 = yVar3;
            } else {
                p146r1.y yVar4 = new p146r1.y(function0, xVar3, view, nVar, cVar, uuid);
                p089k0.e eVar4 = new p089k0.e(346960332, new R0.C0811a(4, xF), true);
                wVar = yVar4.f26792n;
                wVar.setParentCompositionContext(c1696oE);
                wVar.f26778q.setValue(eVar4);
                wVar.f26782u = true;
                if (wVar.f8875k != null) {
                }
                wVar.d();
                c1700q.n0(yVar4);
                objQ2 = yVar4;
            }
            yVar = (p146r1.y) objQ2;
            zH = c1700q.h(yVar);
            objQ3 = c1700q.Q();
            if (zH) {
                objQ3 = new p146r1.C2679b(yVar, 0);
                c1700q.n0(objQ3);
            } else {
                objQ3 = new p146r1.C2679b(yVar, 0);
                c1700q.n0(objQ3);
            }
            p020c0.AbstractC1703s.d(yVar, (p194x6.j) objQ3, c1700q);
            boolean zH3 = c1700q.h(yVar);
            if ((i11 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            zD = zH3 | z9 | ((i11 & 112) == 32) | c1700q.d(nVar.ordinal());
            objQ4 = c1700q.Q();
            if (zD) {
                objQ4 = new p146r1.C2680c(yVar, function0, xVar3, nVar);
                c1700q.n0(objQ4);
            } else {
                objQ4 = new p146r1.C2680c(yVar, function0, xVar3, nVar);
                c1700q.n0(objQ4);
            }
            p020c0.AbstractC1703s.i((kotlin.jvm.functions.Function0) objQ4, c1700q);
        } else {
            c1700q.W();
            xVar3 = xVar2;
        }
        c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p138q1.l(function0, xVar3, eVar, i3, i9);
        }
    }

    public static final void d(p137q0.p pVar, p194x6.m mVar, p020c0.C1700q c1700q, int i3) {
        int i9;
        c1700q.e0(1090521195);
        if ((i3 & 6) == 0) {
            i9 = (c1700q.f(pVar) ? 4 : 2) | i3;
        } else {
            i9 = i3;
        }
        if ((i3 & 48) == 0) {
            i9 |= c1700q.h(mVar) ? 32 : 16;
        }
        if (c1700q.T(i9 & 1, (i9 & 19) != 18)) {
            java.lang.Object objQ = c1700q.Q();
            if (objQ == p020c0.C1690l.f18284a) {
                objQ = p146r1.C2683f.f26739b;
                c1700q.n0(objQ);
            }
            O0.S s9 = (O0.S) objQ;
            int i10 = ((i9 << 3) & 112) | ((i9 >> 3) & 14) | androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK;
            int iHashCode = java.lang.Long.hashCode(c1700q.f18323T);
            p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
            p137q0.p pVarC = p137q0.a.c(c1700q, pVar);
            Q0.InterfaceC0773g.f8436c.getClass();
            Q0.C0790y c0790y = Q0.C0772f.f8424b;
            int i11 = ((i10 << 6) & 896) | 6;
            c1700q.g0();
            if (c1700q.f18322S) {
                c1700q.k(c0790y);
            } else {
                c1700q.q0();
            }
            p020c0.AbstractC1703s.H(c1700q, s9, Q0.C0772f.f8427e);
            p020c0.AbstractC1703s.H(c1700q, interfaceC1691l0L, Q0.C0772f.f8426d);
            p020c0.AbstractC1703s.w(c1700q, java.lang.Integer.valueOf(iHashCode), Q0.C0772f.f8428f);
            p020c0.AbstractC1703s.D(c1700q, Q0.C0772f.g);
            p020c0.AbstractC1703s.H(c1700q, pVarC, Q0.C0772f.f8425c);
            mVar.invoke(c1700q, java.lang.Integer.valueOf((i11 >> 6) & 14));
            c1700q.p(true);
        } else {
            c1700q.W();
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new Z.C1157l0(pVar, mVar, i3);
        }
    }

    public static final boolean e(t0.f fVar, long j9) {
        if (!fVar.f26475h.f26487u) {
            return false;
        }
        androidx.compose.ui.node.a aVar = Q0.AbstractC0777k.t(fVar).f8232N.f8388c;
        if (!aVar.f15866Y.f26487u) {
            return false;
        }
        long jR = aVar.R(0L);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jR >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jR & 4294967295L));
        long j10 = fVar.f27752x;
        float f9 = ((int) (j10 >> 32)) + fIntBitsToFloat;
        float f10 = ((int) (j10 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j9 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f9) {
            return false;
        }
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f10;
    }

    public static long f(long j9, long j10) {
        long j11 = j9 + j10;
        if (((j9 ^ j10) < 0) || ((j9 ^ j11) >= 0)) {
            return j11;
        }
        throw new java.lang.ArithmeticException(Y6.f.g(j10, ")", p121o0.p.u(j9, "overflow: checkedAdd(", ", ")));
    }

    public static final p020c0.X i(p202z.k kVar, p020c0.C1700q c1700q) {
        java.lang.Object objQ = c1700q.Q();
        p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
        if (objQ == c1676e) {
            objQ = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
            c1700q.n0(objQ);
        }
        p020c0.X x9 = (p020c0.X) objQ;
        boolean zF = c1700q.f(kVar);
        java.lang.Object objQ2 = c1700q.Q();
        if (zF || objQ2 == c1676e) {
            objQ2 = new p202z.g(kVar, x9, null);
            c1700q.n0(objQ2);
        }
        p020c0.AbstractC1703s.e(c1700q, kVar, (p194x6.m) objQ2);
        return x9;
    }

    public static final C7.P j(C7.P p2, N6.U u6) {
        if (u6 == null || p2.a() == C7.b0.j) {
            return p2;
        }
        if (u6.E() != p2.a()) {
            p134p7.c cVar = new p134p7.c(p2);
            C7.I.f1547i.getClass();
            return new C7.G(new p134p7.a(p2, cVar, false, C7.I.j));
        }
        if (!p2.c()) {
            return new C7.G(p2.b());
        }
        B7.b NO_LOCKS = B7.m.f842e;
        kotlin.jvm.internal.m.d(NO_LOCKS, "NO_LOCKS");
        return new C7.G(new C7.C0193z(NO_LOCKS, new A7.k(28, p2)));
    }

    public static final p114n2.y k(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        p114n2.y yVar = new p114n2.y(context);
        q2.f fVar = yVar.f25684b;
        p114n2.L l2 = fVar.f26611s;
        l2.a(new p123o2.g(l2));
        fVar.f26611s.a(new p123o2.i());
        fVar.f26611s.a(new p123o2.n());
        return yVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long l(long j9, long j10, java.math.RoundingMode roundingMode) {
        roundingMode.getClass();
        long j11 = j9 / j10;
        long j12 = j9 - (j10 * j11);
        if (j12 == 0) {
            return j11;
        }
        int i3 = ((int) ((j9 ^ j10) >> 63)) | 1;
        switch (p091k4.e.f24485a[roundingMode.ordinal()]) {
            case 1:
                com.google.android.gms.internal.play_billing.AbstractC1864o0.X(j12 == 0);
                return j11;
            case 2:
                return j11;
            case 3:
                if (i3 >= 0) {
                    return j11;
                }
                return j11 + ((long) i3);
            case 4:
                return j11 + ((long) i3);
            case 5:
                if (i3 <= 0) {
                    return j11;
                }
                return j11 + ((long) i3);
            case 6:
            case 7:
            case 8:
                long jAbs = java.lang.Math.abs(j12);
                long jAbs2 = jAbs - (java.lang.Math.abs(j10) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != java.math.RoundingMode.HALF_UP && (roundingMode != java.math.RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (jAbs2 <= 0) {
                    return j11;
                }
                return j11 + ((long) i3);
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static boolean m(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final boolean n(long j9, long j10) {
        return j9 == j10;
    }

    public static java.lang.String o(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(abstractC1915j.size());
        for (int i3 = 0; i3 < abstractC1915j.size(); i3++) {
            byte bD = abstractC1915j.d(i3);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                        } else {
                            sb.append((char) bD);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static long p(int i3, int i9, int i10, int i11) {
        int i12 = 262142;
        int iMin = java.lang.Math.min(i10, 262142);
        int iMin2 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        int iMin3 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.min(i11, 262142);
        int i13 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i13 >= 8191) {
            if (i13 < 32767) {
                i12 = androidx.media3.extractor.WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
            } else if (i13 < 65535) {
                i12 = 32766;
            } else {
                if (i13 >= 262143) {
                    p113n1.b.k(i13);
                    throw new I3.b();
                }
                i12 = 8190;
            }
        }
        if (i9 != Integer.MAX_VALUE) {
            iMin2 = java.lang.Math.min(i12, i9);
        }
        return p113n1.b.a(java.lang.Math.min(i12, i3), iMin2, iMin, iMin3);
    }

    public static long q(int i3, int i9, int i10, int i11) {
        int i12 = 262142;
        int iMin = java.lang.Math.min(i3, 262142);
        int iMin2 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        int iMin3 = i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.min(i9, 262142);
        int i13 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i13 >= 8191) {
            if (i13 < 32767) {
                i12 = androidx.media3.extractor.WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
            } else if (i13 < 65535) {
                i12 = 32766;
            } else {
                if (i13 >= 262143) {
                    p113n1.b.k(i13);
                    throw new I3.b();
                }
                i12 = 8190;
            }
        }
        if (i11 != Integer.MAX_VALUE) {
            iMin2 = java.lang.Math.min(i12, i11);
        }
        return p113n1.b.a(iMin, iMin3, java.lang.Math.min(i12, i10), iMin2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static w8.F r(java.lang.String javaName) {
        kotlin.jvm.internal.m.e(javaName, "javaName");
        int iHashCode = javaName.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return w8.F.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return w8.F.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return w8.F.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return w8.F.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return w8.F.SSL_3_0;
        }
        throw new java.lang.IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static long s(long j9, long j10) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.S(j9, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.S(j10, "b");
        if (j9 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j9;
        }
        int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j9);
        long jNumberOfTrailingZeros = j9 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j11) {
            long j12 = jNumberOfTrailingZeros - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            j11 += j13;
            jNumberOfTrailingZeros = j14 >> java.lang.Long.numberOfTrailingZeros(j14);
        }
        return jNumberOfTrailingZeros << java.lang.Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static final int t(int i3, p048f1.s sVar) {
        boolean z6 = sVar.compareTo(p048f1.s.f21667k) >= 0;
        boolean z9 = i3 == 1;
        if (z9 && z6) {
            return 3;
        }
        if (z6) {
            return 1;
        }
        return z9 ? 2 : 0;
    }

    public static java.lang.String u(D3.j context, int i3) {
        kotlin.jvm.internal.m.e(context, "context");
        if (i3 <= 16777215) {
            return java.lang.String.valueOf(i3);
        }
        try {
            android.content.Context context2 = context.f2115a;
            kotlin.jvm.internal.m.b(context2);
            java.lang.String resourceName = context2.getResources().getResourceName(i3);
            kotlin.jvm.internal.m.b(resourceName);
            return resourceName;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return java.lang.String.valueOf(i3);
        }
    }

    public static final java.lang.Object v(p110m7.AbstractC2639l abstractC2639l, p110m7.C2641n extension) {
        kotlin.jvm.internal.m.e(abstractC2639l, "<this>");
        kotlin.jvm.internal.m.e(extension, "extension");
        if (abstractC2639l.k(extension)) {
            return abstractC2639l.j(extension);
        }
        return null;
    }

    public static final java.lang.Object w(p110m7.AbstractC2639l abstractC2639l, p110m7.C2641n extension, int i3) {
        kotlin.jvm.internal.m.e(abstractC2639l, "<this>");
        kotlin.jvm.internal.m.e(extension, "extension");
        abstractC2639l.n(extension);
        p110m7.C2636i c2636i = abstractC2639l.f25494h;
        c2636i.getClass();
        p110m7.C2640m c2640m = extension.f25500d;
        if (!c2640m.j) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        p110m7.A a2 = c2636i.f25490a;
        java.lang.Object obj = a2.get(c2640m);
        if (i3 >= (obj == null ? 0 : ((java.util.List) obj).size())) {
            return null;
        }
        abstractC2639l.n(extension);
        if (!c2640m.j) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object obj2 = a2.get(c2640m);
        if (obj2 != null) {
            return extension.a(((java.util.List) obj2).get(i3));
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public static N7.m x(p114n2.t tVar) {
        kotlin.jvm.internal.m.e(tVar, "<this>");
        return N7.o.m0(tVar, new p108m5.c(9));
    }

    public static final int y(int i3, int i9) {
        return (i3 >> i9) & 31;
    }

    public static final java.lang.String z(p159s5.AbstractC2743d item) {
        kotlin.jvm.internal.m.e(item, "item");
        if (item instanceof p159s5.C2741b) {
            return com.google.android.gms.internal.play_billing.M0.l(((p159s5.C2741b) item).f27272a.f20725d, "m-");
        }
        if (item instanceof p159s5.C2742c) {
            return com.google.android.gms.internal.play_billing.M0.l(((p159s5.C2742c) item).f27273a.f20684c, "s-");
        }
        if (item instanceof p159s5.C2740a) {
            return com.google.android.gms.internal.play_billing.M0.l(((p159s5.C2740a) item).f27271a.f20657d, "l-");
        }
        throw new I3.b();
    }

    public abstract int B(int i3);

    public abstract int C(int i3);

    @Override // p031d1.d
    public int a(int i3) {
        int iB = B(i3);
        if (iB == -1 || B(iB) == -1) {
            return -1;
        }
        return iB;
    }

    @Override // p031d1.d
    public int b(int i3) {
        int iC = C(i3);
        if (iC == -1 || C(iC) == -1) {
            return -1;
        }
        return iC;
    }

    @Override // p031d1.d
    public int g(int i3) {
        return C(i3);
    }

    @Override // p031d1.d
    public int h(int i3) {
        return B(i3);
    }
}
