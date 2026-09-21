package Z;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p137q0.p f12353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12354c = androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p163t.C2776u f12357f;
    public static final p163t.C2776u g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p163t.C2776u f12358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p163t.C2776u f12359i;
    public static final p163t.C2776u j;

    static {
        float f9 = 10;
        f12352a = f9;
        f12353b = B.AbstractC0065c.p(Y0.m.a(O0.AbstractC0735y.k(p137q0.m.f26474b, Z.C1175x.j), true, Z.C1164p.j), 0.0f, f9, 1);
        float f10 = p010b0.h.f17606c;
        f12355d = f10;
        f12356e = p010b0.h.f17607d - (f10 * 2);
        f12357f = new p163t.C2776u(0.2f, 0.8f);
        g = new p163t.C2776u(0.4f, 1.0f);
        f12358h = new p163t.C2776u(0.0f, 0.65f);
        f12359i = new p163t.C2776u(0.1f, 0.45f);
        j = new p163t.C2776u(0.4f, 0.2f);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0205  */
    /* JADX WARN: Code duplicated, block: B:73:0x022b  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(p137q0.p pVar, long j9, float f9, long j10, int i3, p020c0.C1700q c1700q, int i9, int i10) {
        p137q0.p pVar2;
        int i11;
        float f10;
        int i12;
        p137q0.p pVar3;
        long j11;
        int i13;
        int i14;
        int i15;
        float f11;
        p203z0.g gVar;
        long j12;
        p163t.F fH;
        p163t.F fE;
        p163t.F fE2;
        p163t.F fE3;
        p020c0.C1700q c1700q2;
        boolean z6;
        boolean z9;
        java.lang.Object objQ;
        long j13;
        p137q0.p pVar4;
        int i16;
        long j14;
        float f12;
        p020c0.C1701q0 c1701q0U;
        c1700q.e0(-115871647);
        int i17 = i10 & 1;
        if (i17 != 0) {
            i11 = i9 | 6;
            pVar2 = pVar;
        } else if ((i9 & 6) == 0) {
            pVar2 = pVar;
            i11 = (c1700q.f(pVar2) ? 4 : 2) | i9;
        } else {
            pVar2 = pVar;
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c1700q.e(j9) ? 32 : 16;
        }
        int i18 = i10 & 4;
        if (i18 == 0) {
            if ((i9 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                f10 = f9;
                i11 |= c1700q.c(f10) ? 256 : 128;
            }
            i12 = i11 | 25600;
            if ((i12 & 9363) == 9362 || !c1700q.F()) {
                c1700q.Y();
                if ((i9 & 1) != 0 || c1700q.C()) {
                    if (i17 != 0) {
                        pVar3 = p137q0.m.f26474b;
                    } else {
                        pVar3 = pVar2;
                    }
                    if (i18 != 0) {
                        f10 = Z.N.f12276a;
                    }
                    float f13 = Z.N.f12276a;
                    j11 = p188x0.C3098s.f31127f;
                    i13 = i12 & (-7169);
                    i14 = Z.N.f12278c;
                } else {
                    c1700q.W();
                    i13 = i12 & (-7169);
                    j11 = j10;
                    i14 = i3;
                    pVar3 = pVar2;
                }
                i15 = i13;
                f11 = f10;
                c1700q.q();
                gVar = new p203z0.g(((p113n1.c) c1700q.j(R0.AbstractC0844q0.f8966h)).Y(f11), 0.0f, i14, 0, null, 26);
                p163t.I iN = p163t.AbstractC2750d.n(null, c1700q, 1);
                p137q0.p pVar5 = pVar3;
                p163t.E0 e6 = p163t.AbstractC2750d.f27569k;
                io.sentry.protocol.a aVar = p163t.AbstractC2781z.f27739c;
                j12 = j11;
                fH = p163t.AbstractC2750d.h(iN, 0, 5, e6, p163t.AbstractC2750d.m(p163t.AbstractC2750d.p(6660, 0, aVar, 2), null, 6), null, c1700q, 33208, 16);
                fE = p163t.AbstractC2750d.e(iN, 0.0f, 286.0f, p163t.AbstractC2750d.m(p163t.AbstractC2750d.p(1332, 0, aVar, 2), null, 6), null, c1700q, 4536, 8);
                Y2.L l2 = new Y2.L(10, (byte) 0);
                l2.f11389i = 1332;
                p163t.J jC = l2.c(java.lang.Float.valueOf(0.0f), 0);
                p163t.C2776u c2776u = j;
                jC.f27477b = c2776u;
                l2.c(java.lang.Float.valueOf(290.0f), 666);
                fE2 = p163t.AbstractC2750d.e(iN, 0.0f, 290.0f, p163t.AbstractC2750d.m(new p163t.K(l2), null, 6), null, c1700q, 4536, 8);
                Y2.L l9 = new Y2.L(10, (byte) 0);
                l9.f11389i = 1332;
                l9.c(java.lang.Float.valueOf(0.0f), 666).f27477b = c2776u;
                l9.c(java.lang.Float.valueOf(290.0f), l9.f11389i);
                fE3 = p163t.AbstractC2750d.e(iN, 0.0f, 290.0f, p163t.AbstractC2750d.m(new p163t.K(l9), null, 6), null, c1700q, 4536, 8);
                c1700q2 = c1700q;
                p137q0.p pVarL = androidx.compose.foundation.layout.b.l(Y0.m.a(pVar5, true, new p163t.F0(27)), f12356e);
                boolean zE = c1700q2.e(j12) | c1700q2.h(gVar) | c1700q2.f(fH) | c1700q2.f(fE2) | c1700q2.f(fE3) | c1700q2.f(fE);
                if ((i15 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z9 = z6 | zE | ((((i15 & 112) ^ 48) <= 32 && c1700q2.e(j9)) || (i15 & 48) == 32);
                objQ = c1700q2.Q();
                if (!z9 || objQ == p020c0.C1690l.f18284a) {
                    f10 = f11;
                    Z.O o8 = new Z.O(j12, gVar, fH, fE2, fE3, fE, f10, j9);
                    j13 = j12;
                    c1700q2.n0(o8);
                    objQ = o8;
                } else {
                    j13 = j12;
                    f10 = f11;
                }
                v.AbstractC2901v.a(pVarL, (p194x6.j) objQ, c1700q2, 0);
                pVar4 = pVar5;
                i16 = i14;
                j14 = j13;
            } else {
                c1700q.W();
                i16 = i3;
                pVar4 = pVar2;
                c1700q2 = c1700q;
                j14 = j10;
            }
            f12 = f10;
            c1701q0U = c1700q2.u();
            if (c1701q0U != null) {
                c1701q0U.f18351d = new Z.P(pVar4, j9, f12, j14, i16, i9, i10);
            }
        }
        i11 |= androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK;
        f10 = f9;
        i12 = i11 | 25600;
        if ((i12 & 9363) == 9362) {
            c1700q.Y();
            if ((i9 & 1) != 0) {
                if (i17 != 0) {
                    pVar3 = p137q0.m.f26474b;
                } else {
                    pVar3 = pVar2;
                }
                if (i18 != 0) {
                    f10 = Z.N.f12276a;
                }
                float f14 = Z.N.f12276a;
                j11 = p188x0.C3098s.f31127f;
                i13 = i12 & (-7169);
                i14 = Z.N.f12278c;
            } else {
                if (i17 != 0) {
                    pVar3 = p137q0.m.f26474b;
                } else {
                    pVar3 = pVar2;
                }
                if (i18 != 0) {
                    f10 = Z.N.f12276a;
                }
                float f15 = Z.N.f12276a;
                j11 = p188x0.C3098s.f31127f;
                i13 = i12 & (-7169);
                i14 = Z.N.f12278c;
            }
            i15 = i13;
            f11 = f10;
            c1700q.q();
            gVar = new p203z0.g(((p113n1.c) c1700q.j(R0.AbstractC0844q0.f8966h)).Y(f11), 0.0f, i14, 0, null, 26);
            p163t.I iN2 = p163t.AbstractC2750d.n(null, c1700q, 1);
            p137q0.p pVar6 = pVar3;
            p163t.E0 e9 = p163t.AbstractC2750d.f27569k;
            io.sentry.protocol.a aVar2 = p163t.AbstractC2781z.f27739c;
            j12 = j11;
            fH = p163t.AbstractC2750d.h(iN2, 0, 5, e9, p163t.AbstractC2750d.m(p163t.AbstractC2750d.p(6660, 0, aVar2, 2), null, 6), null, c1700q, 33208, 16);
            fE = p163t.AbstractC2750d.e(iN2, 0.0f, 286.0f, p163t.AbstractC2750d.m(p163t.AbstractC2750d.p(1332, 0, aVar2, 2), null, 6), null, c1700q, 4536, 8);
            Y2.L l10 = new Y2.L(10, (byte) 0);
            l10.f11389i = 1332;
            p163t.J jC2 = l10.c(java.lang.Float.valueOf(0.0f), 0);
            p163t.C2776u c2776u2 = j;
            jC2.f27477b = c2776u2;
            l10.c(java.lang.Float.valueOf(290.0f), 666);
            fE2 = p163t.AbstractC2750d.e(iN2, 0.0f, 290.0f, p163t.AbstractC2750d.m(new p163t.K(l10), null, 6), null, c1700q, 4536, 8);
            Y2.L l11 = new Y2.L(10, (byte) 0);
            l11.f11389i = 1332;
            l11.c(java.lang.Float.valueOf(0.0f), 666).f27477b = c2776u2;
            l11.c(java.lang.Float.valueOf(290.0f), l11.f11389i);
            fE3 = p163t.AbstractC2750d.e(iN2, 0.0f, 290.0f, p163t.AbstractC2750d.m(new p163t.K(l11), null, 6), null, c1700q, 4536, 8);
            c1700q2 = c1700q;
            p137q0.p pVarL2 = androidx.compose.foundation.layout.b.l(Y0.m.a(pVar6, true, new p163t.F0(27)), f12356e);
            boolean zE2 = c1700q2.e(j12) | c1700q2.h(gVar) | c1700q2.f(fH) | c1700q2.f(fE2) | c1700q2.f(fE3) | c1700q2.f(fE);
            if ((i15 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            z9 = z6 | zE2 | ((((i15 & 112) ^ 48) <= 32 && c1700q2.e(j9)) || (i15 & 48) == 32);
            objQ = c1700q2.Q();
            if (z9) {
                f10 = f11;
                Z.O o9 = new Z.O(j12, gVar, fH, fE2, fE3, fE, f10, j9);
                j13 = j12;
                c1700q2.n0(o9);
                objQ = o9;
            } else {
                f10 = f11;
                Z.O o10 = new Z.O(j12, gVar, fH, fE2, fE3, fE, f10, j9);
                j13 = j12;
                c1700q2.n0(o10);
                objQ = o10;
            }
            v.AbstractC2901v.a(pVarL2, (p194x6.j) objQ, c1700q2, 0);
            pVar4 = pVar6;
            i16 = i14;
            j14 = j13;
        } else {
            c1700q.Y();
            if ((i9 & 1) != 0) {
                if (i17 != 0) {
                    pVar3 = p137q0.m.f26474b;
                } else {
                    pVar3 = pVar2;
                }
                if (i18 != 0) {
                    f10 = Z.N.f12276a;
                }
                float f16 = Z.N.f12276a;
                j11 = p188x0.C3098s.f31127f;
                i13 = i12 & (-7169);
                i14 = Z.N.f12278c;
            } else {
                if (i17 != 0) {
                    pVar3 = p137q0.m.f26474b;
                } else {
                    pVar3 = pVar2;
                }
                if (i18 != 0) {
                    f10 = Z.N.f12276a;
                }
                float f17 = Z.N.f12276a;
                j11 = p188x0.C3098s.f31127f;
                i13 = i12 & (-7169);
                i14 = Z.N.f12278c;
            }
            i15 = i13;
            f11 = f10;
            c1700q.q();
            gVar = new p203z0.g(((p113n1.c) c1700q.j(R0.AbstractC0844q0.f8966h)).Y(f11), 0.0f, i14, 0, null, 26);
            p163t.I iN3 = p163t.AbstractC2750d.n(null, c1700q, 1);
            p137q0.p pVar7 = pVar3;
            p163t.E0 e10 = p163t.AbstractC2750d.f27569k;
            io.sentry.protocol.a aVar3 = p163t.AbstractC2781z.f27739c;
            j12 = j11;
            fH = p163t.AbstractC2750d.h(iN3, 0, 5, e10, p163t.AbstractC2750d.m(p163t.AbstractC2750d.p(6660, 0, aVar3, 2), null, 6), null, c1700q, 33208, 16);
            fE = p163t.AbstractC2750d.e(iN3, 0.0f, 286.0f, p163t.AbstractC2750d.m(p163t.AbstractC2750d.p(1332, 0, aVar3, 2), null, 6), null, c1700q, 4536, 8);
            Y2.L l12 = new Y2.L(10, (byte) 0);
            l12.f11389i = 1332;
            p163t.J jC3 = l12.c(java.lang.Float.valueOf(0.0f), 0);
            p163t.C2776u c2776u3 = j;
            jC3.f27477b = c2776u3;
            l12.c(java.lang.Float.valueOf(290.0f), 666);
            fE2 = p163t.AbstractC2750d.e(iN3, 0.0f, 290.0f, p163t.AbstractC2750d.m(new p163t.K(l12), null, 6), null, c1700q, 4536, 8);
            Y2.L l13 = new Y2.L(10, (byte) 0);
            l13.f11389i = 1332;
            l13.c(java.lang.Float.valueOf(0.0f), 666).f27477b = c2776u3;
            l13.c(java.lang.Float.valueOf(290.0f), l13.f11389i);
            fE3 = p163t.AbstractC2750d.e(iN3, 0.0f, 290.0f, p163t.AbstractC2750d.m(new p163t.K(l13), null, 6), null, c1700q, 4536, 8);
            c1700q2 = c1700q;
            p137q0.p pVarL3 = androidx.compose.foundation.layout.b.l(Y0.m.a(pVar7, true, new p163t.F0(27)), f12356e);
            boolean zE3 = c1700q2.e(j12) | c1700q2.h(gVar) | c1700q2.f(fH) | c1700q2.f(fE2) | c1700q2.f(fE3) | c1700q2.f(fE);
            if ((i15 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            z9 = z6 | zE3 | ((((i15 & 112) ^ 48) <= 32 && c1700q2.e(j9)) || (i15 & 48) == 32);
            objQ = c1700q2.Q();
            if (z9) {
                f10 = f11;
                Z.O o11 = new Z.O(j12, gVar, fH, fE2, fE3, fE, f10, j9);
                j13 = j12;
                c1700q2.n0(o11);
                objQ = o11;
            } else {
                f10 = f11;
                Z.O o12 = new Z.O(j12, gVar, fH, fE2, fE3, fE, f10, j9);
                j13 = j12;
                c1700q2.n0(o12);
                objQ = o12;
            }
            v.AbstractC2901v.a(pVarL3, (p194x6.j) objQ, c1700q2, 0);
            pVar4 = pVar7;
            i16 = i14;
            j14 = j13;
        }
        f12 = f10;
        c1701q0U = c1700q2.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new Z.P(pVar4, j9, f12, j14, i16, i9, i10);
        }
    }

    public static final void b(kotlin.jvm.functions.Function0 function0, p137q0.p pVar, long j9, long j10, int i3, float f9, p194x6.j jVar, p020c0.C1700q c1700q, int i9) {
        int i10;
        float f10;
        p194x6.j jVar2;
        int i11;
        int i12;
        p194x6.j jVar3;
        float f11;
        int i13;
        float f12;
        p194x6.j jVar4;
        c1700q.e0(-339970038);
        int i14 = (c1700q.h(function0) ? 4 : 2) | i9;
        if ((i9 & 48) == 0) {
            i14 |= c1700q.f(pVar) ? 32 : 16;
        }
        int i15 = i14 | (c1700q.e(j9) ? 256 : 128);
        if ((i9 & 3072) == 0) {
            i15 |= c1700q.e(j10) ? 2048 : 1024;
        }
        int i16 = i15 | 745472;
        if ((599187 & i16) == 599186 && c1700q.F()) {
            c1700q.W();
            i13 = i3;
            f12 = f9;
            jVar4 = jVar;
        } else {
            c1700q.Y();
            int i17 = i9 & 1;
            java.lang.Object obj = p020c0.C1690l.f18284a;
            if (i17 == 0 || c1700q.C()) {
                i10 = Z.N.f12277b;
                f10 = Z.N.f12280e;
                boolean z6 = (((i16 & 896) ^ androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && c1700q.e(j9)) || (i16 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 256;
                java.lang.Object objQ = c1700q.Q();
                if (z6 || objQ == obj) {
                    objQ = new Z.S(j9, i10);
                    c1700q.n0(objQ);
                }
                jVar2 = (p194x6.j) objQ;
                i11 = i16 & (-3670017);
            } else {
                c1700q.W();
                i11 = i16 & (-3670017);
                i10 = i3;
                f10 = f9;
                jVar2 = jVar;
            }
            c1700q.q();
            boolean z9 = (i11 & 14) == 4;
            java.lang.Object objQ2 = c1700q.Q();
            if (z9 || objQ2 == obj) {
                objQ2 = new Z.Y(0, function0);
                c1700q.n0(objQ2);
            }
            kotlin.jvm.functions.Function0 function1 = (kotlin.jvm.functions.Function0) objQ2;
            p137q0.p pVarD = pVar.d(f12353b);
            boolean zF = c1700q.f(function1);
            java.lang.Object objQ3 = c1700q.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new Z.T(0, function1);
                c1700q.n0(objQ3);
            }
            p137q0.p pVarM = androidx.compose.foundation.layout.b.m(Y0.m.a(pVarD, true, (p194x6.j) objQ3), f12354c, f12355d);
            boolean zF2 = ((((i11 & 7168) ^ 3072) > 2048 && c1700q.e(j10)) || (i11 & 3072) == 2048) | c1700q.f(function1) | ((((i11 & 896) ^ androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && c1700q.e(j9)) || (i11 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | c1700q.f(jVar2);
            java.lang.Object objQ4 = c1700q.Q();
            if (zF2 || objQ4 == obj) {
                i12 = i10;
                jVar3 = jVar2;
                f11 = f10;
                objQ4 = new Z.U(i12, f11, function1, j10, j9, jVar3);
                c1700q.n0(objQ4);
            } else {
                i12 = i10;
                jVar3 = jVar2;
                f11 = f10;
            }
            v.AbstractC2901v.a(pVarM, (p194x6.j) objQ4, c1700q, 0);
            i13 = i12;
            f12 = f11;
            jVar4 = jVar3;
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new Z.V(function0, pVar, j9, j10, i13, f12, jVar4, i9);
        }
    }

    public static final void c(p137q0.p pVar, long j9, long j10, int i3, float f9, p020c0.C1700q c1700q, int i9) {
        int i10;
        float f10;
        p137q0.p pVar2;
        java.lang.Object w6;
        int i11;
        float f11;
        int i12;
        int i13;
        float f12;
        p020c0.C1700q c1700q2 = c1700q;
        c1700q2.e0(567589233);
        int i14 = (c1700q2.e(j9) ? 32 : 16) | i9;
        if ((i9 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i14 |= c1700q2.e(j10) ? 256 : 128;
        }
        int i15 = i14 | 27648;
        if ((i15 & 9363) == 9362 && c1700q2.F()) {
            c1700q2.W();
            pVar2 = pVar;
            i13 = i3;
            f12 = f9;
        } else {
            c1700q2.Y();
            if ((i9 & 1) == 0 || c1700q2.C()) {
                i10 = Z.N.f12277b;
                f10 = Z.N.f12280e;
            } else {
                c1700q2.W();
                i10 = i3;
                f10 = f9;
            }
            c1700q2.q();
            p163t.I iN = p163t.AbstractC2750d.n(null, c1700q2, 1);
            Y2.L l2 = new Y2.L(10, (byte) 0);
            l2.f11389i = 1800;
            l2.c(java.lang.Float.valueOf(0.0f), 0).f27477b = f12357f;
            l2.c(java.lang.Float.valueOf(1.0f), 750);
            p163t.F fE = p163t.AbstractC2750d.e(iN, 0.0f, 1.0f, p163t.AbstractC2750d.m(new p163t.K(l2), null, 6), null, c1700q2, 4536, 8);
            Y2.L l9 = new Y2.L(10, (byte) 0);
            l9.f11389i = 1800;
            l9.c(java.lang.Float.valueOf(0.0f), 333).f27477b = g;
            l9.c(java.lang.Float.valueOf(1.0f), 1183);
            p163t.F fE2 = p163t.AbstractC2750d.e(iN, 0.0f, 1.0f, p163t.AbstractC2750d.m(new p163t.K(l9), null, 6), null, c1700q, 4536, 8);
            Y2.L l10 = new Y2.L(10, (byte) 0);
            l10.f11389i = 1800;
            l10.c(java.lang.Float.valueOf(0.0f), 1000).f27477b = f12358h;
            l10.c(java.lang.Float.valueOf(1.0f), 1567);
            p163t.F fE3 = p163t.AbstractC2750d.e(iN, 0.0f, 1.0f, p163t.AbstractC2750d.m(new p163t.K(l10), null, 6), null, c1700q, 4536, 8);
            Y2.L l11 = new Y2.L(10, (byte) 0);
            l11.f11389i = 1800;
            l11.c(java.lang.Float.valueOf(0.0f), 1267).f27477b = f12359i;
            l11.c(java.lang.Float.valueOf(1.0f), 1800);
            c1700q2 = c1700q;
            p163t.F fE4 = p163t.AbstractC2750d.e(iN, 0.0f, 1.0f, p163t.AbstractC2750d.m(new p163t.K(l11), null, 6), null, c1700q2, 4536, 8);
            pVar2 = pVar;
            p137q0.p pVarM = androidx.compose.foundation.layout.b.m(Y0.m.a(pVar2.d(f12353b), true, new p163t.F0(27)), f12354c, f12355d);
            boolean zF = ((((i15 & 112) ^ 48) > 32 && c1700q2.e(j9)) || (i15 & 48) == 32) | c1700q2.f(fE) | ((((i15 & 896) ^ androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && c1700q2.e(j10)) || (i15 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | c1700q2.f(fE2) | c1700q2.f(fE3) | c1700q2.f(fE4);
            java.lang.Object objQ = c1700q2.Q();
            if (zF || objQ == p020c0.C1690l.f18284a) {
                i11 = i10;
                f11 = f10;
                i12 = 0;
                w6 = new Z.W(i11, f11, fE, j10, fE2, j9, fE3, fE4);
                c1700q2.n0(w6);
            } else {
                w6 = objQ;
                i11 = i10;
                f11 = f10;
                i12 = 0;
            }
            v.AbstractC2901v.a(pVarM, (p194x6.j) w6, c1700q2, i12);
            i13 = i11;
            f12 = f11;
        }
        p020c0.C1701q0 c1701q0U = c1700q2.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new Z.X(pVar2, j9, j10, i13, f12, i9);
        }
    }

    public static final void d(p203z0.d dVar, float f9, float f10, long j9, float f11, int i3) {
        float fD = p181w0.d.d(dVar.d());
        float fB = p181w0.d.b(dVar.d());
        float f12 = 2;
        float f13 = fB / f12;
        boolean z6 = dVar.getLayoutDirection() == p113n1.n.f25566h;
        float f14 = (z6 ? f9 : 1.0f - f10) * fD;
        float f15 = (z6 ? f10 : 1.0f - f9) * fD;
        if (i3 == 0 || fB > fD) {
            dVar.B(j9, com.google.crypto.tink.shaded.protobuf.q0.c(f14, f13), com.google.crypto.tink.shaded.protobuf.q0.c(f15, f13), f11, (480 & 16) != 0 ? 0 : 0);
            return;
        }
        float f16 = f11 / f12;
        D6.d dVar2 = new D6.d(f16, fD - f16);
        float fFloatValue = ((java.lang.Number) O7.r.v(java.lang.Float.valueOf(f14), dVar2)).floatValue();
        float fFloatValue2 = ((java.lang.Number) O7.r.v(java.lang.Float.valueOf(f15), dVar2)).floatValue();
        if (java.lang.Math.abs(f10 - f9) > 0.0f) {
            dVar.B(j9, com.google.crypto.tink.shaded.protobuf.q0.c(fFloatValue, f13), com.google.crypto.tink.shaded.protobuf.q0.c(fFloatValue2, f13), f11, (480 & 16) != 0 ? 0 : i3);
        }
    }

    public static final void e(p203z0.d dVar, float f9, float f10, long j9, p203z0.g gVar) {
        float f11 = 2;
        float f12 = gVar.f32133b / f11;
        float fD = p181w0.d.d(dVar.d()) - (f11 * f12);
        dVar.y(j9, f9, f10, com.google.crypto.tink.shaded.protobuf.q0.c(f12, f12), com.google.common.util.concurrent.AbstractC1903s.e(fD, fD), gVar);
    }
}
