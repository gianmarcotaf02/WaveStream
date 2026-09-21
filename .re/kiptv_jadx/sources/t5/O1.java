package t5;

/* JADX INFO: loaded from: classes4.dex */
public abstract class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Map f28024a = p078i6.D.J0(new p070h6.k("Referer", "https://kiptv.app/"));

    public static final void a(java.lang.String str, p020c0.C1700q c1700q, int i3) {
        c1700q.e0(-70234206);
        int i9 = i3 | (c1700q.f(str) ? 4 : 2);
        if ((i9 & 3) == 2 && c1700q.F()) {
            c1700q.W();
        } else {
            Z.K0.b(str, null, p188x0.C3098s.c(p188x0.C3098s.f31124c, 0.65f), 0L, p048f1.s.f21669m, null, 0L, null, 0L, 0, false, 0, 0, ((Z.R0) c1700q.j(Z.S0.f12323a)).f12319n, c1700q, (i9 & 14) | 196992, 0, 65498);
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new B5.g(str, i3, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    public static final void b(final long j, final long j9, final float f9, final boolean z6, p020c0.C1700q c1700q, final int i3) {
        ?? r9;
        Q0.C0790y c0790y;
        c1700q.e0(2083202136);
        if (((i3 | (c1700q.e(j) ? 4 : 2) | (c1700q.e(j9) ? 32 : 16) | (c1700q.c(f9) ? 256 : 128) | (c1700q.g(z6) ? 2048 : 1024)) & 1171) == 1170 && c1700q.F()) {
            c1700q.W();
        } else {
            c1700q.c0(1841482493);
            java.lang.Object objQ = c1700q.Q();
            java.lang.Object obj = p020c0.C1690l.f18284a;
            if (objQ == obj) {
                objQ = com.google.android.gms.internal.play_billing.M0.f(0, c1700q);
            }
            p020c0.C1675d0 c1675d0 = (p020c0.C1675d0) objQ;
            java.lang.Object objI = com.google.android.gms.internal.play_billing.M0.i(1841484413, c1700q, false);
            if (objI == obj) {
                objI = com.google.android.gms.internal.play_billing.M0.f(0, c1700q);
            }
            p020c0.C1675d0 c1675d1 = (p020c0.C1675d0) objI;
            java.lang.Object objI2 = com.google.android.gms.internal.play_billing.M0.i(1841486365, c1700q, false);
            if (objI2 == obj) {
                objI2 = com.google.android.gms.internal.play_billing.M0.f(0, c1700q);
            }
            p020c0.C1675d0 c1675d2 = (p020c0.C1675d0) objI2;
            c1700q.p(false);
            p137q0.m mVar = p137q0.m.f26474b;
            p137q0.p pVarG = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.b.e(mVar, 1.0f), 16);
            c1700q.c0(1841491285);
            java.lang.Object objQ2 = c1700q.Q();
            if (objQ2 == obj) {
                objQ2 = new D5.C0242a0(c1675d0, 4);
                c1700q.n0(objQ2);
            }
            c1700q.p(false);
            p137q0.p pVarN = O0.AbstractC0735y.n(pVarG, (p194x6.j) objQ2);
            p137q0.h hVar = p137q0.c.f26449h;
            O0.S sD = B.AbstractC0079q.d(hVar, false);
            int iHashCode = java.lang.Long.hashCode(c1700q.f18323T);
            p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
            p137q0.p pVarC = p137q0.a.c(c1700q, pVarN);
            Q0.InterfaceC0773g.f8436c.getClass();
            Q0.C0790y c0790y2 = Q0.C0772f.f8424b;
            c1700q.g0();
            if (c1700q.f18322S) {
                c1700q.k(c0790y2);
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
            int iG = ((int) (c1675d0.g() * f9)) - (c1675d1.g() / 2);
            int iG2 = ((c1675d0.g() - c1675d1.g()) - c1675d2.g()) - 16;
            if (iG2 < 0) {
                iG2 = 0;
            }
            p137q0.g gVar = p137q0.c.f26458r;
            B.C0069g c0069gG = B.AbstractC0071i.g(4);
            c1700q.c0(-1251420570);
            boolean zD = c1700q.d(iG) | c1700q.d(iG2);
            java.lang.Object objQ3 = c1700q.Q();
            if (zD || objQ3 == obj) {
                objQ3 = new com.kiptv.core.model.D0(iG, iG2, 1);
                c1700q.n0(objQ3);
            }
            c1700q.p(false);
            p137q0.p pVarJ = B.AbstractC0065c.j(mVar, (p194x6.j) objQ3);
            c1700q.c0(-1251418184);
            java.lang.Object objQ4 = c1700q.Q();
            if (objQ4 == obj) {
                objQ4 = new D5.C0242a0(c1675d1, 5);
                c1700q.n0(objQ4);
            }
            c1700q.p(false);
            p137q0.p pVarN2 = O0.AbstractC0735y.n(pVarJ, (p194x6.j) objQ4);
            B.Z zA = B.X.a(c0069gG, gVar, c1700q, 54);
            int iHashCode2 = java.lang.Long.hashCode(c1700q.f18323T);
            p020c0.InterfaceC1691l0 interfaceC1691l0L2 = c1700q.l();
            p137q0.p pVarC2 = p137q0.a.c(c1700q, pVarN2);
            c1700q.g0();
            if (c1700q.f18322S) {
                c1700q.k(c0790y2);
            } else {
                c1700q.q0();
            }
            p020c0.AbstractC1703s.H(c1700q, zA, c0770e);
            p020c0.AbstractC1703s.H(c1700q, interfaceC1691l0L2, c0770e2);
            v5.L.b(iHashCode2, c1700q, c0770e3, c1700q, c0768d);
            p020c0.AbstractC1703s.H(c1700q, pVarC2, c0770e4);
            a(p000a.a.q(j), c1700q, 0);
            c1700q.c0(-340287494);
            if (z6) {
                c0790y = c0790y2;
                r9 = 0;
                Z.G.b(p000a.a.t(), null, androidx.compose.foundation.layout.b.l(mVar, 12), p188x0.C3098s.c(p188x0.C3098s.f31124c, 0.65f), c1700q, 3504, 0);
            } else {
                r9 = 0;
                c0790y = c0790y2;
            }
            c1700q.p(r9);
            c1700q.p(true);
            c1700q.c0(-1251404542);
            if (j9 > 0) {
                p137q0.p pVarA = c0082u.a(mVar, p137q0.c.f26453m);
                c1700q.c0(-1251399783);
                java.lang.Object objQ5 = c1700q.Q();
                if (objQ5 == obj) {
                    objQ5 = new D5.C0242a0(c1675d2, 6);
                    c1700q.n0(objQ5);
                }
                c1700q.p(r9);
                p137q0.p pVarN3 = O0.AbstractC0735y.n(pVarA, (p194x6.j) objQ5);
                O0.S sD2 = B.AbstractC0079q.d(hVar, r9);
                int iHashCode3 = java.lang.Long.hashCode(c1700q.f18323T);
                p020c0.InterfaceC1691l0 interfaceC1691l0L3 = c1700q.l();
                p137q0.p pVarC3 = p137q0.a.c(c1700q, pVarN3);
                c1700q.g0();
                if (c1700q.f18322S) {
                    c1700q.k(c0790y);
                } else {
                    c1700q.q0();
                }
                p020c0.AbstractC1703s.H(c1700q, sD2, c0770e);
                p020c0.AbstractC1703s.H(c1700q, interfaceC1691l0L3, c0770e2);
                v5.L.b(iHashCode3, c1700q, c0770e3, c1700q, c0768d);
                p020c0.AbstractC1703s.H(c1700q, pVarC3, c0770e4);
                long j10 = j9 - j;
                a("-".concat(p000a.a.q(j10 >= 0 ? j10 : 0L)), c1700q, r9);
                c1700q.p(true);
            }
            c1700q.p(r9);
            c1700q.p(true);
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p194x6.m(j, j9, f9, z6, i3) { // from class: t5.u1

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ long f28413h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f28414i;
                public final /* synthetic */ float j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ boolean f28415k;

                @Override // p194x6.m
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).getClass();
                    int iK = p020c0.AbstractC1703s.K(1);
                    float f10 = this.j;
                    boolean z9 = this.f28415k;
                    t5.O1.b(this.f28413h, this.f28414i, f10, z9, (p020c0.C1700q) obj2, iK);
                    return p070h6.A.f22523a;
                }
            };
        }
    }

    public static final void c(final boolean z6, final java.lang.String str, final java.lang.String str2, final long j, final long j9, final boolean z9, final p175v0.y yVar, final p194x6.j jVar, final kotlin.jvm.functions.Function0 function0, p020c0.C1700q c1700q, final int i3) {
        c1700q.e0(2002131353);
        int i9 = i3 | (c1700q.g(z6) ? 4 : 2) | (c1700q.f(str) ? 32 : 16) | (c1700q.f(str2) ? 256 : 128) | (c1700q.e(j) ? 2048 : 1024) | (c1700q.e(j9) ? 16384 : 8192) | (c1700q.g(z9) ? 131072 : 65536) | (c1700q.h(jVar) ? 8388608 : 4194304) | (c1700q.h(function0) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432);
        if ((38347923 & i9) == 38347922 && c1700q.F()) {
            c1700q.W();
        } else {
            com.google.android.gms.internal.play_billing.AbstractC1833d1.c(z6, androidx.compose.foundation.layout.b.f15791c, p154s.K.c(null, 3), p154s.K.d(null, 3), null, p089k0.f.d(-1807098255, new t5.w1(str2, str, j9 > 0 ? O7.r.r(j / j9, 0.0f, 1.0f) : 0.0f, j9, jVar, function0, yVar, j, z9), c1700q), c1700q, (i9 & 14) | 200112, 16);
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p194x6.m(z6, str, str2, j, j9, z9, yVar, jVar, function0, i3) { // from class: t5.v1

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f28419h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f28420i;
                public final /* synthetic */ java.lang.String j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ long f28421k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ long f28422l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ boolean f28423m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ p175v0.y f28424n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ p194x6.j f28425o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.functions.Function0 f28426p;

                @Override // p194x6.m
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int iK = p020c0.AbstractC1703s.K(1572865);
                    java.lang.String str3 = this.f28420i;
                    p194x6.j jVar2 = this.f28425o;
                    kotlin.jvm.functions.Function0 function1 = this.f28426p;
                    t5.O1.c(this.f28419h, str3, this.j, this.f28421k, this.f28422l, this.f28423m, this.f28424n, jVar2, function1, (p020c0.C1700q) obj, iK);
                    return p070h6.A.f22523a;
                }
            };
        }
    }

    public static final void d(java.lang.String str, kotlin.jvm.functions.Function0 onDismiss, kotlin.jvm.functions.Function0 onOpenExternal, java.lang.String str2, java.lang.String str3, p020c0.C1700q c1700q, int i3) {
        java.lang.Object g9;
        p020c0.X x9;
        java.lang.Object h9;
        p020c0.X x10;
        p020c0.X x11;
        p020c0.X x12;
        p020c0.X x13;
        boolean z6;
        java.lang.String str4;
        android.webkit.WebView webView;
        java.lang.Object i9;
        p020c0.X x14;
        boolean z9;
        p020c0.X x15;
        p020c0.X x16;
        java.lang.Object k1;
        p175v0.y yVar;
        p020c0.X x17;
        p020c0.X x18;
        p020c0.X x19;
        p175v0.y yVar2;
        p020c0.X x20;
        p175v0.y yVar3;
        p020c0.X x21;
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.e(onOpenExternal, "onOpenExternal");
        c1700q.e0(-1487114108);
        int i10 = i3 | (c1700q.f(str) ? 4 : 2) | (c1700q.h(onOpenExternal) ? 256 : 128) | (c1700q.f(str2) ? 2048 : 1024) | (c1700q.f(str3) ? 16384 : 8192);
        if ((i10 & 9363) == 9362 && c1700q.F()) {
            c1700q.W();
        } else {
            c1700q.c0(691573020);
            java.lang.Object objQ = c1700q.Q();
            java.lang.Object obj = p020c0.C1690l.f18284a;
            if (objQ == obj) {
                objQ = p020c0.AbstractC1703s.y(null);
                c1700q.n0(objQ);
            }
            p020c0.X x22 = (p020c0.X) objQ;
            c1700q.p(false);
            c1700q.c0(691575005);
            int i11 = i10 & 14;
            boolean z10 = i11 == 4;
            java.lang.Object objQ2 = c1700q.Q();
            if (z10 || objQ2 == obj) {
                objQ2 = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
                c1700q.n0(objQ2);
            }
            p020c0.X x23 = (p020c0.X) objQ2;
            c1700q.p(false);
            c1700q.c0(691579293);
            boolean z11 = i11 == 4;
            java.lang.Object objQ3 = c1700q.Q();
            if (z11 || objQ3 == obj) {
                objQ3 = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
                c1700q.n0(objQ3);
            }
            p020c0.X x24 = (p020c0.X) objQ3;
            c1700q.p(false);
            c1700q.c0(691581286);
            boolean z12 = i11 == 4;
            java.lang.Object objQ4 = c1700q.Q();
            if (z12 || objQ4 == obj) {
                objQ4 = p020c0.AbstractC1703s.y(new t5.R1(false, 0L, 0L, false, false, false, false));
                c1700q.n0(objQ4);
            }
            p020c0.X x25 = (p020c0.X) objQ4;
            java.lang.Object objI = com.google.android.gms.internal.play_billing.M0.i(691583762, c1700q, false);
            if (objI == obj) {
                objI = p020c0.AbstractC1703s.y(java.lang.Boolean.TRUE);
                c1700q.n0(objI);
            }
            p020c0.X x26 = (p020c0.X) objI;
            java.lang.Object objI2 = com.google.android.gms.internal.play_billing.M0.i(691585714, c1700q, false);
            if (objI2 == obj) {
                objI2 = com.google.android.gms.internal.play_billing.M0.f(0, c1700q);
            }
            p020c0.C1675d0 c1675d0 = (p020c0.C1675d0) objI2;
            c1700q.p(false);
            c1700q.c0(691592547);
            boolean z13 = i11 == 4;
            java.lang.Object objQ5 = c1700q.Q();
            if (z13 || objQ5 == obj) {
                objQ5 = p020c0.AbstractC1703s.y(null);
                c1700q.n0(objQ5);
            }
            p020c0.X x27 = (p020c0.X) objQ5;
            java.lang.Object objI3 = com.google.android.gms.internal.play_billing.M0.i(691594958, c1700q, false);
            if (objI3 == obj) {
                objI3 = B2.a.r(c1700q);
            }
            p175v0.y yVar4 = (p175v0.y) objI3;
            java.lang.Object objI4 = com.google.android.gms.internal.play_billing.M0.i(691596622, c1700q, false);
            if (objI4 == obj) {
                objI4 = B2.a.r(c1700q);
            }
            p175v0.y yVar5 = (p175v0.y) objI4;
            java.lang.Object objI5 = com.google.android.gms.internal.play_billing.M0.i(691598350, c1700q, false);
            if (objI5 == obj) {
                objI5 = B2.a.r(c1700q);
            }
            p175v0.y yVar6 = (p175v0.y) objI5;
            java.lang.Object objI6 = com.google.android.gms.internal.play_billing.M0.i(691599850, c1700q, false);
            if (objI6 == obj) {
                objI6 = new t5.C2806i();
                c1700q.n0(objI6);
            }
            t5.C2806i c2806i = (t5.C2806i) objI6;
            java.lang.Object objI7 = com.google.android.gms.internal.play_billing.M0.i(691616868, c1700q, false);
            if (objI7 == obj) {
                objI7 = new C5.C0123k0(onDismiss, x22, 6);
                c1700q.n0(objI7);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) objI7;
            java.lang.Object objI8 = com.google.android.gms.internal.play_billing.M0.i(691619550, c1700q, false);
            if (objI8 == obj) {
                objI8 = new J5.M(25, x22);
                c1700q.n0(objI8);
            }
            c1700q.p(false);
            p020c0.AbstractC1703s.d(str, (p194x6.j) objI8, c1700q);
            android.webkit.WebView webView2 = (android.webkit.WebView) x22.getValue();
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(g(x24));
            c1700q.c0(691627346);
            boolean zF = c1700q.f(x24) | c1700q.f(x25) | c1700q.f(x27);
            java.lang.Object objQ6 = c1700q.Q();
            if (zF || objQ6 == obj) {
                g9 = new t5.G1(x22, x24, x25, x27, null);
                x9 = x24;
                c1700q.n0(g9);
            } else {
                g9 = objQ6;
                x9 = x24;
            }
            c1700q.p(false);
            p020c0.AbstractC1703s.g(webView2, boolValueOf, (p194x6.m) g9, c1700q);
            java.lang.Boolean bool = (java.lang.Boolean) x9.getValue();
            bool.getClass();
            c1700q.c0(691709050);
            boolean zF2 = c1700q.f(x9) | c1700q.f(x25) | c1700q.f(x23) | (i11 == 4);
            java.lang.Object objQ7 = c1700q.Q();
            if (zF2 || objQ7 == obj) {
                x10 = x23;
                x11 = x9;
                x12 = x25;
                x13 = x22;
                z6 = false;
                str4 = str;
                h9 = new t5.H1(str4, x11, x12, x10, x13, null);
                c1700q.n0(h9);
            } else {
                h9 = objQ7;
                x12 = x25;
                x13 = x22;
                x11 = x9;
                z6 = false;
                x10 = x23;
                str4 = str;
            }
            c1700q.p(z6);
            p020c0.AbstractC1703s.g(str4, bool, (p194x6.m) h9, c1700q);
            java.lang.Boolean bool2 = (java.lang.Boolean) x11.getValue();
            bool2.getClass();
            java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(f(x10));
            android.webkit.WebView webView3 = (android.webkit.WebView) x13.getValue();
            c1700q.c0(691727492);
            boolean zF3 = c1700q.f(x10) | c1700q.f(x11);
            java.lang.Object objQ8 = c1700q.Q();
            if (zF3 || objQ8 == obj) {
                webView = webView3;
                p020c0.X x28 = x11;
                p020c0.X x29 = x10;
                x14 = x13;
                z9 = false;
                i9 = new t5.I1(x14, x29, yVar6, x28, null);
                x15 = x29;
                x16 = x28;
                c1700q.n0(i9);
            } else {
                i9 = objQ8;
                webView = webView3;
                x14 = x13;
                x16 = x11;
                x15 = x10;
                z9 = false;
            }
            c1700q.p(z9);
            p020c0.AbstractC1703s.f(bool2, boolValueOf2, webView, (p194x6.m) i9, c1700q);
            java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(((t5.R1) x12.getValue()).f28045e);
            c1700q.c0(691752844);
            boolean zF4 = c1700q.f(x12) | c1700q.f(function0);
            java.lang.Object objQ9 = c1700q.Q();
            if (zF4 || objQ9 == obj) {
                objQ9 = new t5.J1(function0, x12, null);
                c1700q.n0(objQ9);
            }
            c1700q.p(z9);
            p020c0.AbstractC1703s.e(c1700q, boolValueOf3, (p194x6.m) objQ9);
            java.lang.Boolean boolValueOf4 = java.lang.Boolean.valueOf(((t5.R1) x12.getValue()).f28046f);
            java.lang.Boolean bool3 = (java.lang.Boolean) x16.getValue();
            bool3.getClass();
            c1700q.c0(691770078);
            boolean zF5 = c1700q.f(x16) | c1700q.f(x12);
            java.lang.Object objQ10 = c1700q.Q();
            if (zF5 || objQ10 == obj) {
                p020c0.X x30 = x12;
                p020c0.X x31 = x16;
                yVar = yVar5;
                k1 = new t5.K1(x14, x31, x30, x26, yVar, null);
                x17 = x31;
                x18 = x30;
                x19 = x26;
                c1700q.n0(k1);
            } else {
                p020c0.X x32 = x16;
                x18 = x12;
                x17 = x32;
                k1 = objQ10;
                x19 = x26;
                yVar = yVar5;
            }
            p020c0.X x33 = x15;
            c1700q.p(false);
            p020c0.AbstractC1703s.g(boolValueOf4, bool3, (p194x6.m) k1, c1700q);
            java.lang.Boolean boolValueOf5 = java.lang.Boolean.valueOf(((java.lang.Boolean) x19.getValue()).booleanValue());
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(c1675d0.g());
            java.lang.Boolean boolValueOf6 = java.lang.Boolean.valueOf(((t5.R1) x18.getValue()).f28044d);
            c1700q.c0(691793999);
            boolean zF6 = c1700q.f(x18);
            java.lang.Object objQ11 = c1700q.Q();
            if (zF6 || objQ11 == obj) {
                objQ11 = new t5.L1(x19, x18, null);
                c1700q.n0(objQ11);
            }
            c1700q.p(false);
            p020c0.AbstractC1703s.f(boolValueOf5, numValueOf, boolValueOf6, (p194x6.m) objQ11, c1700q);
            java.lang.Boolean bool4 = (java.lang.Boolean) x19.getValue();
            bool4.getClass();
            java.lang.Boolean bool5 = (java.lang.Boolean) x17.getValue();
            bool5.getClass();
            c1700q.c0(691804856);
            boolean zF7 = c1700q.f(x17);
            java.lang.Object objQ12 = c1700q.Q();
            if (zF7 || objQ12 == obj) {
                yVar2 = yVar;
                p020c0.X x34 = x17;
                x20 = x19;
                yVar3 = yVar4;
                objQ12 = new t5.M1(x34, x20, null, yVar3, yVar2);
                x21 = x34;
                c1700q.n0(objQ12);
            } else {
                x21 = x17;
                x20 = x19;
                yVar2 = yVar;
                yVar3 = yVar4;
            }
            c1700q.p(false);
            p020c0.AbstractC1703s.g(bool4, bool5, (p194x6.m) objQ12, c1700q);
            java.lang.Long l2 = (java.lang.Long) x27.getValue();
            long jLongValue = l2 != null ? l2.longValue() : ((t5.R1) x18.getValue()).f28042b;
            java.lang.Long l9 = (java.lang.Long) x27.getValue();
            c1700q.c0(691853345);
            boolean zF8 = c1700q.f(x27);
            java.lang.Object objQ13 = c1700q.Q();
            if (zF8 || objQ13 == obj) {
                objQ13 = new t5.N1(x27, null);
                c1700q.n0(objQ13);
            }
            c1700q.p(false);
            p020c0.AbstractC1703s.e(c1700q, l9, (p194x6.m) objQ13);
            com.google.android.gms.internal.play_billing.AbstractC1853k0.c(function0, new p146r1.x(true, false, false), p089k0.f.d(-1495051315, new t5.D1(function0, yVar2, x21, x33, x18, c2806i, x27, x20, c1675d0, x14, str, str2, str3, jLongValue, yVar3, onOpenExternal, yVar6), c1700q), c1700q, 432, 0);
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new B5.e((java.lang.Object) str, onDismiss, (java.lang.Object) onOpenExternal, (java.lang.Object) str2, (java.lang.Object) str3, i3, 17);
        }
    }

    public static final void e(p020c0.X x9) {
        android.webkit.WebView webView = (android.webkit.WebView) x9.getValue();
        if (webView != null) {
            webView.stopLoading();
            webView.loadUrl("about:blank");
            android.view.ViewParent parent = webView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.destroy();
        }
        x9.setValue(null);
    }

    public static final boolean f(p020c0.X x9) {
        return ((java.lang.Boolean) x9.getValue()).booleanValue();
    }

    public static final boolean g(p020c0.X x9) {
        return ((java.lang.Boolean) x9.getValue()).booleanValue();
    }

    public static final void h(t5.C2806i c2806i, p020c0.X x9, p020c0.X x10, p020c0.X x11, int i3) {
        long j;
        android.webkit.WebView webView = (android.webkit.WebView) x9.getValue();
        if (webView == null) {
            return;
        }
        long j9 = ((t5.R1) x10.getValue()).f28043c;
        if (j9 <= 0) {
            return;
        }
        c2806i.getClass();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        int i9 = 1;
        if (i3 == c2806i.f28206c && jCurrentTimeMillis - c2806i.f28205b <= 1200) {
            i9 = 1 + c2806i.f28204a;
        }
        c2806i.f28204a = i9;
        c2806i.f28205b = jCurrentTimeMillis;
        c2806i.f28206c = i3;
        if (i9 <= 3) {
            j = androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        } else if (i9 <= 5) {
            j = 20000;
        } else {
            j = i9 <= 7 ? 30000L : 60000L;
        }
        java.lang.Long l2 = (java.lang.Long) x11.getValue();
        long jT = O7.r.t((((long) i3) * j) + (l2 != null ? l2.longValue() : ((t5.R1) x10.getValue()).f28042b), 0L, j9);
        x11.setValue(java.lang.Long.valueOf(jT));
        webView.evaluateJavascript("\n(function(){var s=" + (jT / 1000.0d) + ";var p=document.getElementById('movie_player');\nif(p&&p.seekTo){p.seekTo(s,true);return;}\nvar v=document.querySelector('video');if(v)v.currentTime=s;})();\n", null);
    }

    public static final void i(p020c0.X x9, p020c0.X x10) {
        android.webkit.WebView webView = (android.webkit.WebView) x9.getValue();
        if (webView == null) {
            return;
        }
        boolean z6 = ((t5.R1) x10.getValue()).f28044d;
        webView.evaluateJavascript(z6 ? "\n(function(){var p=document.getElementById('movie_player');\nif(p&&p.pauseVideo){p.pauseVideo();return;}\nvar v=document.querySelector('video');if(v)v.pause();})();\n" : "\n(function(){var p=document.getElementById('movie_player');\nif(p&&p.playVideo){p.playVideo();return;}\nvar v=document.querySelector('video');if(v)v.play();})();\n", null);
        t5.R1 r9 = (t5.R1) x10.getValue();
        x10.setValue(new t5.R1(r9.f28041a, r9.f28042b, r9.f28043c, !z6, r9.f28045e, r9.f28046f, r9.g));
    }

    public static final java.lang.String j(java.lang.String str, boolean z6) {
        return B2.a.m("https://www.youtube.com/embed/", str, "?autoplay=1&playsinline=1&rel=0&modestbranding=1&iv_load_policy=3&fs=0", z6 ? "&controls=1&disablekb=0" : "&controls=0&disablekb=1");
    }
}
