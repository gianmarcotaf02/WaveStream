package C5;

/* JADX INFO: renamed from: C5.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0132n0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1397i;

    public /* synthetic */ C0132n0(int i3, java.lang.Object obj) {
        this.f1396h = i3;
        this.f1397i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        D.t tVar;
        E.p pVar;
        boolean z6;
        J.X x9;
        java.lang.String str;
        switch (this.f1396h) {
            case 0:
                p020c0.I DisposableEffect = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                android.view.View view = (android.view.View) this.f1397i;
                boolean keepScreenOn = view.getKeepScreenOn();
                view.setKeepScreenOn(true);
                return new C5.E0(view, keepScreenOn);
            case 1:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                D.q qVar = (D.q) this.f1397i;
                return qVar.E0(iIntValue, qVar.f1724k);
            case 2:
                float f9 = -((java.lang.Float) obj).floatValue();
                D.D d4 = (D.D) this.f1397i;
                if ((f9 >= 0.0f || d4.d()) && (f9 <= 0.0f || d4.b())) {
                    if (java.lang.Math.abs(d4.f1648h) > 0.5f) {
                        A.b.c("entered drag with non-zero pending scroll");
                    }
                    d4.f1645d = true;
                    float f10 = d4.f1648h + f9;
                    d4.f1648h = f10;
                    if (java.lang.Math.abs(f10) > 0.5f) {
                        float f11 = d4.f1648h;
                        int iRound = java.lang.Math.round(f11);
                        D.t tVarF = ((D.t) d4.f1647f.getValue()).f(iRound, !d4.f1643b);
                        if (tVarF != null && (tVar = d4.f1644c) != null) {
                            D.t tVarF2 = tVar.f(iRound, true);
                            if (tVarF2 != null) {
                                d4.f1644c = tVarF2;
                            } else {
                                tVarF = null;
                            }
                        }
                        if (tVarF != null) {
                            d4.g(tVarF, d4.f1643b, true);
                            d4.f1661v.setValue(p070h6.A.f22523a);
                            d4.i(f11 - d4.f1648h, tVarF);
                        } else {
                            Q0.F f12 = d4.f1650k;
                            if (f12 != null) {
                                f12.k();
                            }
                            d4.i(f11 - d4.f1648h, d4.h());
                        }
                    }
                    if (java.lang.Math.abs(d4.f1648h) > 0.5f) {
                        f9 -= d4.f1648h;
                        d4.f1648h = 0.0f;
                    }
                } else {
                    f9 = 0.0f;
                }
                return java.lang.Float.valueOf(-f9);
            case 3:
                java.lang.String str2 = ((java.text.DateFormat) this.f1397i).format(new java.util.Date(((java.lang.Long) obj).longValue()));
                kotlin.jvm.internal.m.d(str2, "format(...)");
                return str2;
            case 4:
                return java.lang.Integer.valueOf(((B8.f) this.f1397i).d(((java.lang.Integer) obj).intValue()));
            case 5:
                float f13 = -((java.lang.Float) obj).floatValue();
                E.w wVar = (E.w) this.f1397i;
                if ((f13 >= 0.0f || wVar.d()) && (f13 <= 0.0f || wVar.b())) {
                    if (java.lang.Math.abs(wVar.g) > 0.5f) {
                        A.b.c("entered drag with non-zero pending scroll");
                    }
                    float f14 = wVar.g + f13;
                    wVar.g = f14;
                    if (java.lang.Math.abs(f14) > 0.5f) {
                        float f15 = wVar.g;
                        int iQ = O7.r.Q(f15);
                        E.p pVarF = ((E.p) wVar.f2718e.getValue()).f(iQ, !wVar.f2715b);
                        if (pVarF != null && (pVar = wVar.f2716c) != null) {
                            E.p pVarF2 = pVar.f(iQ, true);
                            if (pVarF2 != null) {
                                wVar.f2716c = pVarF2;
                            } else {
                                pVarF = null;
                            }
                        }
                        if (pVarF != null) {
                            wVar.f(pVarF, wVar.f2715b, true);
                            wVar.f2729r.setValue(p070h6.A.f22523a);
                            wVar.h(f15 - wVar.g, pVarF);
                        } else {
                            Q0.F f16 = wVar.j;
                            if (f16 != null) {
                                f16.k();
                            }
                            wVar.h(f15 - wVar.g, wVar.g());
                        }
                    }
                    if (java.lang.Math.abs(wVar.g) > 0.5f) {
                        f13 -= wVar.g;
                        wVar.g = 0.0f;
                    }
                } else {
                    f13 = 0.0f;
                }
                return java.lang.Float.valueOf(-f13);
            case 6:
                com.kiptv.core.model.Playlist playlist = (com.kiptv.core.model.Playlist) obj;
                kotlin.jvm.internal.m.e(playlist, "playlist");
                return java.lang.Boolean.valueOf(E5.X0.h((E5.X0) this.f1397i, playlist));
            case 7:
                return new C5.F0(1, (F.C0358x) this.f1397i);
            case 8:
                return new C5.F0(3, (F.I) this.f1397i);
            case 9:
                p112n0.g gVar = (p112n0.g) this.f1397i;
                return java.lang.Boolean.valueOf(gVar != null ? gVar.b(obj) : true);
            case 10:
                ((I2.e) this.f1397i).f4594s = true;
                return p070h6.A.f22523a;
            case 11:
                ((Y0.x) obj).d(U.K.f9921c, new U.J(J.L.f5651h, ((U.InterfaceC0938k) this.f1397i).a(), U.I.f9913i, true));
                return p070h6.A.f22523a;
            case 12:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                J.w0 w0Var = (J.w0) this.f1397i;
                p020c0.C1673c0 c1673c0 = w0Var.f5945a;
                float fG = c1673c0.g() + fFloatValue;
                p020c0.C1673c0 c1673c1 = w0Var.f5946b;
                if (fG > c1673c1.g()) {
                    fFloatValue = c1673c1.g() - c1673c0.g();
                } else if (fG < 0.0f) {
                    fFloatValue = -c1673c0.g();
                }
                c1673c0.h(c1673c0.g() + fFloatValue);
                return java.lang.Float.valueOf(fFloatValue);
            case 13:
                p020c0.I DisposableEffect2 = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect2, "$this$DisposableEffect");
                return new C5.F0(6, (J5.N2) this.f1397i);
            case 14:
                p203z0.d dVar = (p203z0.d) obj;
                p188x0.InterfaceC3097q interfaceC3097qJ = dVar.d0().j();
                int iIntBitsToFloat = (int) java.lang.Float.intBitsToFloat((int) (dVar.d() >> 32));
                int iIntBitsToFloat2 = (int) java.lang.Float.intBitsToFloat((int) (dVar.d() & 4294967295L));
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) this.f1397i;
                drawable.setBounds(0, 0, iIntBitsToFloat, iIntBitsToFloat2);
                drawable.draw(p188x0.AbstractC3083c.a(interfaceC3097qJ));
                return p070h6.A.f22523a;
            case 15:
                return ((O7.l) this.f1397i).e(((java.lang.Integer) obj).intValue());
            case 16:
                P.c cVar = (P.c) this.f1397i;
                cVar.f8074x.invoke((L.a) obj, Q0.AbstractC0777k.h(cVar, androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f15955b));
                return p070h6.A.f22523a;
            case 17:
                ((p194x6.j) obj).invoke((L.a) this.f1397i);
                return p070h6.A.f22523a;
            case 18:
                Q0.C0 c9 = (Q0.C0) obj;
                if (!(c9 instanceof P.a)) {
                    throw new java.lang.IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                ((C5.C0132n0) this.f1397i).invoke(((P.a) c9).f8072v);
                return java.lang.Boolean.TRUE;
            case 19:
                return new C5.F0(8, (Q.d) this.f1397i);
            case 20:
                io.github.jan.supabase.auth.AuthConfig install = (io.github.jan.supabase.auth.AuthConfig) obj;
                kotlin.jvm.internal.m.e(install, "$this$install");
                ((p132p5.a) this.f1397i).getClass();
                install.setScheme("kiptv");
                install.setHost("auth-callback");
                install.setDefaultExternalAuthAction(new io.github.jan.supabase.auth.ExternalAuthAction.CustomTabs(null, 1, null == true ? 1 : 0));
                return p070h6.A.f22523a;
            case 21:
                ((S.y) this.f1397i).a((g1.g) obj);
                return p070h6.A.f22523a;
            case 22:
                K0.x xVar = (K0.x) obj;
                long j = xVar.f6740c;
                K0.C0661i c0661i = (K0.C0661i) this.f1397i;
                U.i0 i0Var = (U.i0) c0661i.f6708d;
                if (!i0Var.k() || i0Var.n().f21847a.f17809i.length() == 0 || (x9 = i0Var.f10012d) == null || x9.d() == null) {
                    z6 = false;
                } else {
                    c0661i.f(i0Var.n(), j, false, U.C0952z.f10100d);
                    z6 = true;
                }
                if (z6) {
                    xVar.a();
                }
                return p070h6.A.f22523a;
            case 23:
                io.github.jan.supabase.auth.user.UserUpdateBuilder updateUser = (io.github.jan.supabase.auth.user.UserUpdateBuilder) obj;
                kotlin.jvm.internal.m.e(updateUser, "$this$updateUser");
                p162s8.v vVar = new p162s8.v();
                com.kiptv.core.model.SubscriptionStatus subscriptionStatus = (com.kiptv.core.model.SubscriptionStatus) this.f1397i;
                com.google.common.util.concurrent.P.m0("subscription_type", subscriptionStatus.f20109a.b() ? "premium" : "free", vVar);
                com.kiptv.core.model.l0 l0Var = subscriptionStatus.f20109a;
                int iOrdinal = l0Var.ordinal();
                java.lang.Integer num = null;
                if (iOrdinal == 0) {
                    str = null;
                } else if (iOrdinal == 1) {
                    str = "one";
                } else {
                    if (iOrdinal != 2) {
                        throw new I3.b();
                    }
                    str = "plus";
                }
                com.google.common.util.concurrent.P.m0("subscription_plan", str, vVar);
                java.lang.String lowerCase = l0Var.name().toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                com.google.common.util.concurrent.P.m0("subscription_tier", lowerCase, vVar);
                com.google.common.util.concurrent.P.o0(vVar, "max_playlists", java.lang.Integer.valueOf(l0Var.a()));
                int iOrdinal2 = l0Var.ordinal();
                if (iOrdinal2 == 0) {
                    num = 1800;
                } else if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new I3.b();
                }
                com.google.common.util.concurrent.P.o0(vVar, "daily_watch_limit", java.lang.Integer.valueOf(num != null ? num.intValue() : -1));
                com.google.common.util.concurrent.P.m0("subscription_expires_at", subscriptionStatus.f20111c, vVar);
                com.google.common.util.concurrent.P.n0(vVar, "subscription_will_renew", java.lang.Boolean.valueOf(subscriptionStatus.f20112d));
                com.google.common.util.concurrent.P.m0("subscription_updated_at", j$.time.Instant.now().toString(), vVar);
                updateUser.setData(vVar.a());
                return p070h6.A.f22523a;
            case 24:
                java.lang.Float f17 = (java.lang.Float) obj;
                f17.getClass();
                V7.n0 n0Var = ((p005a5.B3) this.f1397i).f13182k;
                n0Var.getClass();
                n0Var.i(null, f17);
                return p070h6.A.f22523a;
            case 25:
                ((p020c0.C1715y) this.f1397i).z(obj);
                return p070h6.A.f22523a;
            case 26:
                p020c0.C1718z0 c1718z0 = (p020c0.C1718z0) this.f1397i;
                java.lang.Throwable th = (java.lang.Throwable) obj;
                java.util.concurrent.CancellationException cancellationExceptionA = S7.C.a("Recomposer effect job completed", th);
                synchronized (c1718z0.f18431c) {
                    try {
                        S7.InterfaceC0891h0 interfaceC0891h0 = c1718z0.f18432d;
                        if (interfaceC0891h0 != null) {
                            V7.n0 n0Var2 = c1718z0.f18447u;
                            p020c0.EnumC1706t0 enumC1706t0 = p020c0.EnumC1706t0.f18369i;
                            n0Var2.getClass();
                            n0Var2.i(null, enumC1706t0);
                            interfaceC0891h0.e(cancellationExceptionA);
                            c1718z0.f18444r = null;
                            interfaceC0891h0.j(new B.K(c1718z0, th, 29));
                        } else {
                            c1718z0.f18433e = cancellationExceptionA;
                            V7.n0 n0Var3 = c1718z0.f18447u;
                            p020c0.EnumC1706t0 enumC1706t1 = p020c0.EnumC1706t0.f18368h;
                            n0Var3.getClass();
                            n0Var3.i(null, enumC1706t1);
                        }
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                }
                return p070h6.A.f22523a;
            case 27:
                if (obj instanceof p121o0.u) {
                    ((p121o0.u) obj).f(4);
                }
                ((p136q.I) this.f1397i).a(obj);
                return p070h6.A.f22523a;
            case 28:
                p048f1.B b9 = (p048f1.B) obj;
                return ((p048f1.j) this.f1397i).a(new p048f1.B(null, b9.f21626b, b9.f21627c, b9.f21628d, b9.f21629e)).getValue();
            default:
                return obj == ((p078i6.AbstractC2250a) this.f1397i) ? "(this Collection)" : java.lang.String.valueOf(obj);
        }
    }

    public /* synthetic */ C0132n0(C5.C0132n0 c0132n0, A7.o oVar) {
        this.f1396h = 18;
        this.f1397i = c0132n0;
    }
}
