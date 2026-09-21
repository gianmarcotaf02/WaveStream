package E5;

/* JADX INFO: renamed from: E5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0322x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3177a = 85;

    public static final void a(java.lang.String str, boolean z6, kotlin.jvm.functions.Function0 function0, p175v0.y yVar, kotlin.jvm.functions.Function0 function1, p020c0.C1700q c1700q, int i3) {
        boolean z9;
        p020c0.C1700q c1700q2 = c1700q;
        c1700q2.e0(-1008581283);
        int i9 = i3 | (c1700q2.f(str) ? 4 : 2) | (c1700q2.g(z6) ? 32 : 16) | (c1700q2.h(function0) ? 256 : 128) | (c1700q2.f(yVar) ? 2048 : 1024) | (c1700q2.h(function1) ? 16384 : 8192);
        if ((i9 & 9363) == 9362 && c1700q2.F()) {
            c1700q2.W();
        } else {
            p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
            c1700q2.c0(168324976);
            java.lang.Object objQ = c1700q2.Q();
            if (objQ == c1676e) {
                objQ = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
                c1700q2.n0(objQ);
            }
            p020c0.X x9 = (p020c0.X) objQ;
            c1700q2.p(false);
            p137q0.m mVar = p137q0.m.f26474b;
            float f9 = f3177a;
            p137q0.p pVarL = androidx.compose.foundation.layout.b.l(mVar, f9);
            I.e eVar = I.f.f4530a;
            c1700q2.c0(168333130);
            boolean z10 = (i9 & 57344) == 16384;
            java.lang.Object objQ2 = c1700q2.Q();
            if (z10 || objQ2 == c1676e) {
                objQ2 = new C5.C0128m(function1, x9, 2);
                c1700q2.n0(objQ2);
            }
            c1700q2.p(false);
            p137q0.p pVarB = p171u0.f.b(t5.AbstractC2816l0.e(pVarL, eVar, 0.0f, yVar, 0L, false, null, 0L, false, (p194x6.j) objQ2, null, null, null, function0, c1700q, (i9 & 7168) | 6, (i9 << 6) & 57344, 7674), eVar);
            O0.S sD = B.AbstractC0079q.d(p137q0.c.f26449h, false);
            int iHashCode = java.lang.Long.hashCode(c1700q.f18323T);
            p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
            p137q0.p pVarC = p137q0.a.c(c1700q, pVarB);
            Q0.InterfaceC0773g.f8436c.getClass();
            Q0.C0790y c0790y = Q0.C0772f.f8424b;
            c1700q.g0();
            if (c1700q.f18322S) {
                c1700q.k(c0790y);
            } else {
                c1700q.q0();
            }
            Q0.C0770e c0770e = Q0.C0772f.f8427e;
            p020c0.AbstractC1703s.H(c1700q, sD, c0770e);
            Q0.C0770e c0770e2 = Q0.C0772f.f8426d;
            p020c0.AbstractC1703s.H(c1700q, interfaceC1691l0L, c0770e2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iHashCode);
            Q0.C0770e c0770e3 = Q0.C0772f.f8428f;
            p020c0.AbstractC1703s.w(c1700q, numValueOf, c0770e3);
            Q0.C0768d c0768d = Q0.C0772f.g;
            p020c0.AbstractC1703s.D(c1700q, c0768d);
            Q0.C0770e c0770e4 = Q0.C0772f.f8425c;
            p020c0.AbstractC1703s.H(c1700q, pVarC, c0770e4);
            B.C0082u c0082u = B.C0082u.f572a;
            t5.V0.a(str, str, f9, null, 0L, c1700q, ((i9 << 3) & 112) | (i9 & 14) | androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 24);
            c1700q2 = c1700q;
            c1700q2.c0(191895473);
            if (z6) {
                p137q0.p pVarF = v.AbstractC2901v.f(p171u0.f.b(androidx.compose.foundation.layout.b.l(B.AbstractC0065c.n(c0082u.a(mVar, p137q0.c.f26456p), 4), 20), eVar), p188x0.C3098s.c(p188x0.C3098s.f31123b, 0.75f), p188x0.z.f31141b);
                O0.S sD2 = B.AbstractC0079q.d(p137q0.c.f26452l, false);
                int iHashCode2 = java.lang.Long.hashCode(c1700q2.f18323T);
                p020c0.InterfaceC1691l0 interfaceC1691l0L2 = c1700q2.l();
                p137q0.p pVarC2 = p137q0.a.c(c1700q2, pVarF);
                c1700q2.g0();
                if (c1700q2.f18322S) {
                    c1700q2.k(c0790y);
                } else {
                    c1700q2.q0();
                }
                p020c0.AbstractC1703s.H(c1700q2, sD2, c0770e);
                p020c0.AbstractC1703s.H(c1700q2, interfaceC1691l0L2, c0770e2);
                v5.L.b(iHashCode2, c1700q2, c0770e3, c1700q2, c0768d);
                p020c0.AbstractC1703s.H(c1700q2, pVarC2, c0770e4);
                Z.G.b(E8.l.u(), null, androidx.compose.foundation.layout.b.l(mVar, 11), p060g5.a.f21871a, c1700q2, 432, 0);
                z9 = true;
                c1700q2.p(true);
            } else {
                z9 = true;
            }
            c1700q2.p(false);
            c1700q2.p(z9);
        }
        p020c0.C1701q0 c1701q0U = c1700q2.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new E5.C0303n(str, z6, function0, yVar, function1, i3);
        }
    }

    public static final void b(java.lang.String str, boolean z6, p194x6.j onSelect, kotlin.jvm.functions.Function0 onRequestPremium, kotlin.jvm.functions.Function0 onDismiss, p020c0.C1700q c1700q, int i3) {
        p020c0.C1700q c1700q2 = c1700q;
        kotlin.jvm.internal.m.e(onSelect, "onSelect");
        kotlin.jvm.internal.m.e(onRequestPremium, "onRequestPremium");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        c1700q2.e0(-1022139649);
        int i9 = (c1700q2.f(str) ? 4 : 2) | i3 | (c1700q2.g(z6) ? 32 : 16);
        if ((i3 & androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= c1700q2.h(onSelect) ? 256 : 128;
        }
        int i10 = i9 | (c1700q2.h(onRequestPremium) ? 2048 : 1024);
        if ((i10 & 9363) == 9362 && c1700q2.F()) {
            c1700q2.W();
        } else {
            c1700q2.c0(-1328729823);
            boolean z9 = (i10 & 14) == 4;
            java.lang.Object objQ = c1700q2.Q();
            p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
            if (z9 || objQ == c1676e) {
                java.util.List list = t5.AbstractC2782a.f28120a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i11 = 0;
                for (java.lang.Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        p078i6.p.H0();
                        throw null;
                    }
                    int iIndexOf = ((t5.C2785b) obj).f28132e.indexOf(str);
                    p070h6.k kVar = iIndexOf >= 0 ? new p070h6.k(java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(iIndexOf)) : null;
                    if (kVar != null) {
                        arrayList.add(kVar);
                    }
                    i11 = i12;
                }
                p070h6.k kVar2 = (p070h6.k) p078i6.o.j1(arrayList);
                objQ = kVar2 == null ? new p070h6.k(0, 0) : kVar2;
                c1700q2.n0(objQ);
            }
            p070h6.k kVar3 = (p070h6.k) objQ;
            c1700q2.p(false);
            D.D dA = D.F.a(c1700q2);
            c1700q2.c0(-1328718816);
            boolean zF = c1700q2.f(kVar3);
            java.lang.Object objQ2 = c1700q2.Q();
            if (zF || objQ2 == c1676e) {
                objQ2 = p020c0.AbstractC1703s.y(kVar3.f22539h);
                c1700q2.n0(objQ2);
            }
            p020c0.X x9 = (p020c0.X) objQ2;
            c1700q2.p(false);
            java.lang.Object obj2 = kVar3.f22539h;
            c1700q2.c0(-1328714801);
            boolean zF2 = c1700q2.f(dA) | c1700q2.f(kVar3);
            java.lang.Object objQ3 = c1700q2.Q();
            if (zF2 || objQ3 == c1676e) {
                objQ3 = new E5.C0305o(dA, kVar3, null);
                c1700q2.n0(objQ3);
            }
            c1700q2.p(false);
            p020c0.AbstractC1703s.e(c1700q2, obj2, (p194x6.m) objQ3);
            p137q0.m mVar = p137q0.m.f26474b;
            androidx.compose.foundation.layout.FillElement fillElement = androidx.compose.foundation.layout.b.f15791c;
            p137q0.p pVarF = v.AbstractC2901v.f(fillElement, p188x0.C3098s.c(p188x0.C3098s.f31123b, 0.96f), p188x0.z.f31141b);
            c1700q2.c0(-1328707399);
            boolean zF3 = c1700q2.f(x9);
            java.lang.Object objQ4 = c1700q2.Q();
            if (zF3 || objQ4 == c1676e) {
                objQ4 = new E5.C0307p(onDismiss, x9, 0);
                c1700q2.n0(objQ4);
            }
            c1700q2.p(false);
            p137q0.p pVarE = I0.c.e(pVarF, (p194x6.j) objQ4);
            O0.S sD = B.AbstractC0079q.d(p137q0.c.f26449h, false);
            int iHashCode = java.lang.Long.hashCode(c1700q2.f18323T);
            p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q2.l();
            p137q0.p pVarC = p137q0.a.c(c1700q2, pVarE);
            Q0.InterfaceC0773g.f8436c.getClass();
            Q0.C0790y c0790y = Q0.C0772f.f8424b;
            c1700q2.g0();
            if (c1700q2.f18322S) {
                c1700q2.k(c0790y);
            } else {
                c1700q2.q0();
            }
            Q0.C0770e c0770e = Q0.C0772f.f8427e;
            p020c0.AbstractC1703s.H(c1700q2, sD, c0770e);
            Q0.C0770e c0770e2 = Q0.C0772f.f8426d;
            p020c0.AbstractC1703s.H(c1700q2, interfaceC1691l0L, c0770e2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iHashCode);
            Q0.C0770e c0770e3 = Q0.C0772f.f8428f;
            p020c0.AbstractC1703s.w(c1700q2, numValueOf, c0770e3);
            Q0.C0768d c0768d = Q0.C0772f.g;
            p020c0.AbstractC1703s.D(c1700q2, c0768d);
            Q0.C0770e c0770e4 = Q0.C0772f.f8425c;
            p020c0.AbstractC1703s.H(c1700q2, pVarC, c0770e4);
            B.C0085x c0085xA = B.AbstractC0083v.a(B.AbstractC0071i.f538c, p137q0.c.f26460t, c1700q2, 0);
            int iHashCode2 = java.lang.Long.hashCode(c1700q2.f18323T);
            p020c0.InterfaceC1691l0 interfaceC1691l0L2 = c1700q2.l();
            p137q0.p pVarC2 = p137q0.a.c(c1700q2, fillElement);
            c1700q2.g0();
            if (c1700q2.f18322S) {
                c1700q2.k(c0790y);
            } else {
                c1700q2.q0();
            }
            p020c0.AbstractC1703s.H(c1700q2, c0085xA, c0770e);
            p020c0.AbstractC1703s.H(c1700q2, interfaceC1691l0L2, c0770e2);
            v5.L.b(iHashCode2, c1700q2, c0770e3, c1700q2, c0768d);
            p020c0.AbstractC1703s.H(c1700q2, pVarC2, c0770e4);
            Z.K0.b(p015b5.u.a("playlist.chooseAvatar"), B.AbstractC0065c.r(mVar, 40, 24, 0.0f, 4, 4), p188x0.C3098s.f31124c, 0L, p048f1.s.f21669m, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q2.j(Z.S0.f12323a)).f12312e, c1700q, 197040, 0, 65496);
            c1700q2 = c1700q;
            B.C0069g c0069gG = B.AbstractC0071i.g(18);
            B.S sA = B.AbstractC0065c.a(0.0f, 16, 1);
            c1700q2.c0(881123225);
            boolean zF4 = c1700q2.f(kVar3) | ((i10 & 112) == 32) | ((i10 & 7168) == 2048) | ((i10 & 896) == 256) | c1700q2.f(x9);
            java.lang.Object objQ5 = c1700q2.Q();
            if (zF4 || objQ5 == c1676e) {
                E5.C0299l c0299l = new E5.C0299l(kVar3, z6, onRequestPremium, onSelect, x9);
                c1700q2.n0(c0299l);
                objQ5 = c0299l;
            }
            c1700q2.p(false);
            p199y3.e.a(fillElement, dA, sA, c0069gG, null, null, false, null, (p194x6.j) objQ5, c1700q2, 24966, 488);
            c1700q2.p(true);
            c1700q2.p(true);
        }
        p020c0.C1701q0 c1701q0U = c1700q2.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new E5.C0301m(str, z6, onSelect, onRequestPremium, onDismiss, i3);
        }
    }
}
