package p005a5;

/* JADX INFO: renamed from: a5.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1379q2 {
    public static final p005a5.C1239c2 Companion = new p005a5.C1239c2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.github.jan.supabase.SupabaseClient f14977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1296i f14978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1455y f14979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V4.P f14980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p132p5.a f14981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X7.c f14982f;
    public final V7.n0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.W f14983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.n0 f14984i;
    public final V7.n0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.W f14985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.n0 f14986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V7.n0 f14987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V7.W f14988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V7.n0 f14989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V7.n0 f14990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V7.W f14991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V7.n0 f14992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final V7.W f14993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final V7.n0 f14994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final V7.W f14995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f14996v;

    public C1379q2(io.github.jan.supabase.SupabaseClient supabaseClient, p005a5.C1296i authRepository, p005a5.C1455y dailyUsageRepository, V4.P watchProgressDataStore, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
        kotlin.jvm.internal.m.e(authRepository, "authRepository");
        kotlin.jvm.internal.m.e(dailyUsageRepository, "dailyUsageRepository");
        kotlin.jvm.internal.m.e(watchProgressDataStore, "watchProgressDataStore");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f14977a = supabaseClient;
        this.f14978b = authRepository;
        this.f14979c = dailyUsageRepository;
        this.f14980d = watchProgressDataStore;
        this.f14981e = appConfig;
        Z7.e eVar = S7.M.f9549a;
        X7.c cVarC = S7.C.c(Z7.d.f13044i.plus(S7.C.e()));
        this.f14982f = cVarC;
        V7.n0 n0VarB = V7.r.b(com.kiptv.core.model.l0.f20795i);
        this.g = n0VarB;
        this.f14983h = new V7.W(n0VarB);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f14984i = V7.r.b(bool);
        com.kiptv.core.model.SubscriptionStatus.INSTANCE.getClass();
        V7.n0 n0VarB2 = V7.r.b(com.kiptv.core.model.SubscriptionStatus.f20108i);
        this.j = n0VarB2;
        this.f14985k = new V7.W(n0VarB2);
        this.f14986l = V7.r.b(p078i6.w.f23205h);
        V7.n0 n0VarB3 = V7.r.b(0);
        this.f14987m = n0VarB3;
        this.f14988n = new V7.W(n0VarB3);
        this.f14989o = V7.r.b(1800);
        V7.n0 n0VarB4 = V7.r.b(1800);
        this.f14990p = n0VarB4;
        this.f14991q = new V7.W(n0VarB4);
        V7.n0 n0VarB5 = V7.r.b(bool);
        this.f14992r = n0VarB5;
        this.f14993s = new V7.W(n0VarB5);
        V7.n0 n0VarB6 = V7.r.b(java.lang.Boolean.TRUE);
        this.f14994t = n0VarB6;
        this.f14995u = new V7.W(n0VarB6);
        S7.C.A(cVarC, null, new p005a5.C1229b2(this, null), 3);
    }

    public static final void a(p005a5.C1379q2 c1379q2, S7.C0895k c0895k, java.io.Serializable serializable) {
        c1379q2.getClass();
        java.lang.Throwable illegalStateException = serializable instanceof java.lang.Throwable ? (java.lang.Throwable) serializable : new java.lang.IllegalStateException(serializable.toString());
        if (c0895k.isActive()) {
            c0895k.resumeWith(com.google.common.util.concurrent.P.T(illegalStateException));
        }
    }

    public final void b(com.kiptv.core.model.SubscriptionStatus subscriptionStatus) {
        this.j.h(subscriptionStatus);
        this.g.h(subscriptionStatus.f20109a);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(subscriptionStatus.f20110b);
        V7.n0 n0Var = this.f14984i;
        n0Var.getClass();
        n0Var.i(null, boolValueOf);
    }

    public final java.lang.Object c(android.app.Activity activity, com.revenuecat.purchases.Package r9, p005a5.C1329l2 c1329l2) {
        S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(c1329l2));
        c0895k.r();
        com.revenuecat.purchases.ListenerConversionsCommonKt.purchaseWith(com.revenuecat.purchases.Purchases.INSTANCE.getSharedInstance(), new com.revenuecat.purchases.PurchaseParams.Builder(activity, r9).build(), new B5.n(this, c0895k, 9), new p005a5.C1259e2(c0895k, 1));
        java.lang.Object objQ = c0895k.q();
        p109m6.a aVar = p109m6.a.f25430h;
        return objQ;
    }

    public final boolean d() {
        return ((java.lang.Boolean) this.f14994t.getValue()).booleanValue() || k() || !((java.lang.Boolean) this.f14992r.getValue()).booleanValue();
    }

    public final boolean e() {
        kotlinx.serialization.json.c appMetadata;
        kotlinx.serialization.json.b bVar;
        if (this.g.getValue() != com.kiptv.core.model.l0.f20796k) {
            return false;
        }
        io.github.jan.supabase.auth.user.UserInfo userInfoE = this.f14978b.e();
        java.lang.String strD = null;
        if (userInfoE != null && (appMetadata = userInfoE.getAppMetadata()) != null && (bVar = (kotlinx.serialization.json.b) appMetadata.get("is_admin")) != null) {
            kotlinx.serialization.json.d dVar = bVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar : null;
            if (dVar != null) {
                strD = dVar.d();
            }
        }
        return kotlin.jvm.internal.m.a(strD, "true");
    }

    public final int f() {
        return e() ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : ((com.kiptv.core.model.l0) this.g.getValue()).a();
    }

    public final double g() {
        int iIntValue = ((java.lang.Number) this.f14990p.getValue()).intValue();
        if (iIntValue > 0) {
            return ((double) ((java.lang.Number) this.f14987m.getValue()).intValue()) / ((double) iIntValue);
        }
        return 0.0d;
    }

    public final void h(com.revenuecat.purchases.CustomerInfo customerInfo) {
        com.kiptv.core.model.l0 l0Var;
        java.util.Date expirationDate;
        boolean willRenew;
        j$.time.Instant instant;
        com.revenuecat.purchases.EntitlementInfos entitlements = customerInfo.getEntitlements();
        this.f14981e.getClass();
        com.revenuecat.purchases.EntitlementInfo entitlementInfo = entitlements.get("premium_one");
        com.revenuecat.purchases.EntitlementInfo entitlementInfo2 = customerInfo.getEntitlements().get("premium_plus");
        if (entitlementInfo2 == null || !entitlementInfo2.getIsActive()) {
            l0Var = (entitlementInfo == null || !entitlementInfo.getIsActive()) ? com.kiptv.core.model.l0.f20795i : com.kiptv.core.model.l0.j;
        } else {
            l0Var = com.kiptv.core.model.l0.f20796k;
        }
        com.kiptv.core.model.l0 l0Var2 = l0Var;
        boolean zB = l0Var2.b();
        if (entitlementInfo2 == null || (expirationDate = entitlementInfo2.getExpirationDate()) == null) {
            expirationDate = entitlementInfo != null ? entitlementInfo.getExpirationDate() : null;
        }
        java.lang.String string = (expirationDate == null || (instant = j$.util.DateRetargetClass.toInstant(expirationDate)) == null) ? null : instant.toString();
        if (entitlementInfo2 != null) {
            willRenew = entitlementInfo2.getWillRenew();
        } else {
            willRenew = entitlementInfo != null ? entitlementInfo.getWillRenew() : false;
        }
        com.kiptv.core.model.SubscriptionStatus subscriptionStatus = new com.kiptv.core.model.SubscriptionStatus(l0Var2, zB, string, willRenew, java.lang.System.currentTimeMillis(), 48);
        b(subscriptionStatus);
        S7.C.A(this.f14982f, null, new p005a5.C1269f2(this, subscriptionStatus, zB, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        if (r11 == r4) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object i(java.lang.String str, p117n6.c cVar) {
        p005a5.C1279g2 c1279g2;
        p005a5.C1379q2 c1379q2;
        p005a5.C1379q2 c1379q3;
        com.kiptv.core.model.SubscriptionStatus subscriptionStatus;
        int i3 = 0;
        int i9 = 2;
        if (cVar instanceof p005a5.C1279g2) {
            c1279g2 = (p005a5.C1279g2) cVar;
            int i10 = c1279g2.f14484k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1279g2.f14484k = i10 - Integer.MIN_VALUE;
            } else {
                c1279g2 = new p005a5.C1279g2(this, cVar);
            }
        } else {
            c1279g2 = new p005a5.C1279g2(this, cVar);
        }
        java.lang.Object objQ = c1279g2.f14483i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c1279g2.f14484k;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(objQ);
            if (this.f14996v) {
                try {
                    java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                    c1279g2.f14482h = this;
                    c1279g2.f14484k = 2;
                    try {
                        S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(c1279g2));
                        c0895k.r();
                        com.revenuecat.purchases.ListenerConversionsKt.logInWith(com.revenuecat.purchases.Purchases.INSTANCE.getSharedInstance(), upperCase, new p005a5.C1249d2(this, c0895k, i3), new p005a5.C1259e2(c0895k, i3));
                        objQ = c0895k.q();
                        p109m6.a aVar2 = p109m6.a.f25430h;
                        if (objQ != aVar) {
                            c1379q2 = this;
                            c1379q2.h((com.revenuecat.purchases.CustomerInfo) objQ);
                            return a2;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        c1379q2 = this;
                        B2.a.v("RevenueCat logIn failed: ", th.getMessage(), "PurchaseRepo");
                        V4.P p2 = c1379q2.f14980d;
                        V4.C0963f c0963f = new V4.C0963f(V4.Q.a(p2.f10290a).getData(), p2, i9);
                        c1279g2.f14482h = c1379q2;
                        c1279g2.f14484k = 3;
                        objQ = V7.r.o(c0963f, c1279g2);
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } else {
                V4.P p9 = this.f14980d;
                V4.C0963f c0963f2 = new V4.C0963f(V4.Q.a(p9.f10290a).getData(), p9, i9);
                c1279g2.f14482h = this;
                c1279g2.f14484k = 1;
                objQ = V7.r.o(c0963f2, c1279g2);
                if (objQ != aVar) {
                    c1379q3 = this;
                    subscriptionStatus = (com.kiptv.core.model.SubscriptionStatus) objQ;
                    if (subscriptionStatus == null) {
                    }
                    com.kiptv.core.model.SubscriptionStatus.INSTANCE.getClass();
                    c1379q3.b(com.kiptv.core.model.SubscriptionStatus.f20108i);
                    return a2;
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            c1379q3 = c1279g2.f14482h;
            com.google.common.util.concurrent.P.u0(objQ);
            subscriptionStatus = (com.kiptv.core.model.SubscriptionStatus) objQ;
            if (subscriptionStatus == null && java.lang.System.currentTimeMillis() - subscriptionStatus.g < 300000) {
                c1379q3.b(subscriptionStatus);
                return a2;
            }
            com.kiptv.core.model.SubscriptionStatus.INSTANCE.getClass();
            c1379q3.b(com.kiptv.core.model.SubscriptionStatus.f20108i);
            return a2;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1379q2 = c1279g2.f14482h;
            com.google.common.util.concurrent.P.u0(objQ);
            com.kiptv.core.model.SubscriptionStatus subscriptionStatus2 = (com.kiptv.core.model.SubscriptionStatus) objQ;
            if (subscriptionStatus2 == null) {
                com.kiptv.core.model.SubscriptionStatus.INSTANCE.getClass();
                subscriptionStatus2 = com.kiptv.core.model.SubscriptionStatus.f20108i;
            }
            c1379q2.b(subscriptionStatus2);
            return a2;
        }
        c1379q2 = c1279g2.f14482h;
        try {
            com.google.common.util.concurrent.P.u0(objQ);
            c1379q2.h((com.revenuecat.purchases.CustomerInfo) objQ);
            return a2;
        } catch (java.lang.Throwable th3) {
            th = th3;
            B2.a.v("RevenueCat logIn failed: ", th.getMessage(), "PurchaseRepo");
            V4.P p10 = c1379q2.f14980d;
            V4.C0963f c0963f3 = new V4.C0963f(V4.Q.a(p10.f10290a).getData(), p10, i9);
            c1279g2.f14482h = c1379q2;
            c1279g2.f14484k = 3;
            objQ = V7.r.o(c0963f3, c1279g2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(int i3, p117n6.c cVar) {
        p005a5.C1289h2 c1289h2;
        p005a5.C1379q2 c1379q2;
        if (cVar instanceof p005a5.C1289h2) {
            c1289h2 = (p005a5.C1289h2) cVar;
            int i9 = c1289h2.f14538l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1289h2.f14538l = i9 - Integer.MIN_VALUE;
            } else {
                c1289h2 = new p005a5.C1289h2(this, cVar);
            }
        } else {
            c1289h2 = new p005a5.C1289h2(this, cVar);
        }
        java.lang.Object objB = c1289h2.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1289h2.f14538l;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(objB);
            if (k()) {
                return null;
            }
            c1289h2.f14535h = this;
            c1289h2.f14536i = i3;
            c1289h2.f14538l = 1;
            objB = this.f14979c.b(i3, c1289h2);
            if (objB == aVar) {
                return aVar;
            }
            c1379q2 = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1289h2.f14536i;
            c1379q2 = c1289h2.f14535h;
            com.google.common.util.concurrent.P.u0(objB);
        }
        com.kiptv.core.model.DailyUsageResponse dailyUsageResponse = (com.kiptv.core.model.DailyUsageResponse) objB;
        if (dailyUsageResponse != null) {
            c1379q2.u(dailyUsageResponse);
            return dailyUsageResponse;
        }
        int iIntValue = ((java.lang.Number) c1379q2.f14987m.getValue()).intValue() + i3;
        int iIntValue2 = ((java.lang.Number) c1379q2.f14990p.getValue()).intValue();
        java.lang.Integer num = new java.lang.Integer(iIntValue);
        V7.n0 n0Var = c1379q2.f14987m;
        n0Var.getClass();
        n0Var.i(null, num);
        java.lang.Integer num2 = new java.lang.Integer(java.lang.Math.max(iIntValue2 - iIntValue, 0));
        V7.n0 n0Var2 = c1379q2.f14989o;
        n0Var2.getClass();
        n0Var2.i(null, num2);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(iIntValue2 > 0 && iIntValue >= iIntValue2);
        V7.n0 n0Var3 = c1379q2.f14992r;
        n0Var3.getClass();
        n0Var3.i(null, boolValueOf);
        return dailyUsageResponse;
    }

    public final boolean k() {
        return ((com.kiptv.core.model.l0) this.g.getValue()).b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(p117n6.c cVar) {
        p005a5.C1299i2 c1299i2;
        p005a5.C1379q2 c1379q2;
        if (cVar instanceof p005a5.C1299i2) {
            c1299i2 = (p005a5.C1299i2) cVar;
            int i3 = c1299i2.f14602k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1299i2.f14602k = i3 - Integer.MIN_VALUE;
            } else {
                c1299i2 = new p005a5.C1299i2(this, cVar);
            }
        } else {
            c1299i2 = new p005a5.C1299i2(this, cVar);
        }
        java.lang.Object obj = c1299i2.f14601i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1299i2.f14602k;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                com.kiptv.core.model.SubscriptionStatus.INSTANCE.getClass();
                b(com.kiptv.core.model.SubscriptionStatus.f20108i);
                V4.P p2 = this.f14980d;
                c1299i2.f14600h = this;
                c1299i2.f14602k = 1;
                java.lang.Object objM = E8.d.M(V4.Q.a(p2.f10290a), new V4.A(2, null), c1299i2);
                if (objM != aVar) {
                    objM = a2;
                }
                if (objM != aVar) {
                    c1379q2 = this;
                }
                return aVar;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return a2;
            }
            c1379q2 = c1299i2.f14600h;
            com.google.common.util.concurrent.P.u0(obj);
            if (c1379q2.f14996v) {
                c1299i2.f14600h = null;
                c1299i2.f14602k = 2;
                S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(c1299i2));
                c0895k.r();
                com.revenuecat.purchases.ListenerConversionsKt.logOutWith(com.revenuecat.purchases.Purchases.INSTANCE.getSharedInstance(), new p005a5.C1249d2(c1379q2, c0895k, 1), new U7.y(c0895k, 1));
                if (c0895k.q() == aVar) {
                    return aVar;
                }
            }
        } catch (java.lang.Throwable th) {
            p117n6.f.a(android.util.Log.w("PurchaseRepo", "RevenueCat logOut failed: " + th.getMessage()));
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:14:0x002c, B:41:0x00bb, B:33:0x006e, B:35:0x0074, B:40:0x0086), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:14:0x002c, B:41:0x00bb, B:33:0x006e, B:35:0x0074, B:40:0x0086), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c7, code lost:
    
        if (r2.d(r10, r0) == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a5.y] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [a5.q2] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m(java.lang.String str, p117n6.c cVar) throws java.lang.Throwable {
        p005a5.C1309j2 c1309j2;
        ?? r10;
        p005a5.C1379q2 c1379q2;
        p005a5.C1379q2 c1379q3;
        ?? r11;
        ?? r9;
        if (cVar instanceof p005a5.C1309j2) {
            c1309j2 = (p005a5.C1309j2) cVar;
            int i3 = c1309j2.f14655l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1309j2.f14655l = i3 - Integer.MIN_VALUE;
            } else {
                c1309j2 = new p005a5.C1309j2(this, cVar);
            }
        } else {
            c1309j2 = new p005a5.C1309j2(this, cVar);
        }
        java.lang.Object obj = c1309j2.j;
        p109m6.a aVar = p109m6.a.f25430h;
        ?? r12 = c1309j2.f14655l;
        try {
            if (r12 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                V7.n0 n0Var = this.f14994t;
                n0Var.getClass();
                n0Var.i(null, bool);
                try {
                    c1309j2.f14652h = this;
                    c1309j2.f14653i = str;
                    c1309j2.f14655l = 1;
                    if (i(str, c1309j2) != aVar) {
                        r10 = str;
                        c1379q2 = this;
                        if (c1379q2.k()) {
                            V7.n0 n0Var2 = c1379q2.f14987m;
                            java.lang.Integer num = new java.lang.Integer(0);
                            n0Var2.getClass();
                            n0Var2.i(null, num);
                            V7.n0 n0Var3 = c1379q2.f14989o;
                            java.lang.Integer num2 = new java.lang.Integer(999999);
                            n0Var3.getClass();
                            n0Var3.i(null, num2);
                            V7.n0 n0Var4 = c1379q2.f14990p;
                            java.lang.Integer num3 = new java.lang.Integer(0);
                            n0Var4.getClass();
                            n0Var4.i(null, num3);
                            V7.n0 n0Var5 = c1379q2.f14992r;
                            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                            n0Var5.getClass();
                            n0Var5.i(null, bool2);
                            r11 = r10;
                            ?? r13 = c1379q2.f14979c;
                            c1309j2.f14652h = c1379q2;
                            c1309j2.f14653i = null;
                            c1309j2.f14655l = 3;
                        } else {
                            c1309j2.f14652h = c1379q2;
                            c1309j2.f14653i = r10;
                            c1309j2.f14655l = 2;
                            if (c1379q2.p(c1309j2) == aVar) {
                                c1379q3 = c1379q2;
                                r9 = r10;
                                r11 = r9;
                                c1379q2 = c1379q3;
                                ?? r14 = c1379q2.f14979c;
                                c1309j2.f14652h = c1379q2;
                                c1309j2.f14653i = null;
                                c1309j2.f14655l = 3;
                            }
                        }
                    }
                    return aVar;
                } catch (java.lang.Throwable th) {
                    th = th;
                    str = this;
                    V7.n0 n0Var6 = str.f14994t;
                    java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                    n0Var6.getClass();
                    n0Var6.i(null, bool3);
                    throw th;
                }
            }
            try {
                if (r12 == 1) {
                    java.lang.String str2 = c1309j2.f14653i;
                    p005a5.C1379q2 c1379q4 = c1309j2.f14652h;
                    com.google.common.util.concurrent.P.u0(obj);
                    r10 = str2;
                    c1379q2 = c1379q4;
                    if (c1379q2.k()) {
                        c1309j2.f14652h = c1379q2;
                        c1309j2.f14653i = r10;
                        c1309j2.f14655l = 2;
                        if (c1379q2.p(c1309j2) == aVar) {
                            c1379q3 = c1379q2;
                            r9 = r10;
                            r11 = r9;
                            c1379q2 = c1379q3;
                            ?? r15 = c1379q2.f14979c;
                            c1309j2.f14652h = c1379q2;
                            c1309j2.f14653i = null;
                            c1309j2.f14655l = 3;
                        }
                    } else {
                        V7.n0 n0Var7 = c1379q2.f14987m;
                        java.lang.Integer num4 = new java.lang.Integer(0);
                        n0Var7.getClass();
                        n0Var7.i(null, num4);
                        V7.n0 n0Var8 = c1379q2.f14989o;
                        java.lang.Integer num5 = new java.lang.Integer(999999);
                        n0Var8.getClass();
                        n0Var8.i(null, num5);
                        V7.n0 n0Var9 = c1379q2.f14990p;
                        java.lang.Integer num6 = new java.lang.Integer(0);
                        n0Var9.getClass();
                        n0Var9.i(null, num6);
                        V7.n0 n0Var10 = c1379q2.f14992r;
                        java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
                        n0Var10.getClass();
                        n0Var10.i(null, bool4);
                        r11 = r10;
                        ?? r16 = c1379q2.f14979c;
                        c1309j2.f14652h = c1379q2;
                        c1309j2.f14653i = null;
                        c1309j2.f14655l = 3;
                    }
                    return aVar;
                }
                if (r12 == 2) {
                    java.lang.String str3 = c1309j2.f14653i;
                    c1379q3 = c1309j2.f14652h;
                    com.google.common.util.concurrent.P.u0(obj);
                    r9 = str3;
                    r11 = r9;
                    c1379q2 = c1379q3;
                    ?? r17 = c1379q2.f14979c;
                    c1309j2.f14652h = c1379q2;
                    c1309j2.f14653i = null;
                    c1309j2.f14655l = 3;
                } else {
                    if (r12 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1379q2 = c1309j2.f14652h;
                    com.google.common.util.concurrent.P.u0(obj);
                }
                V7.n0 n0Var11 = c1379q2.f14994t;
                java.lang.Boolean bool5 = java.lang.Boolean.FALSE;
                n0Var11.getClass();
                n0Var11.i(null, bool5);
                return p070h6.A.f22523a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                str = r12;
                V7.n0 n0Var12 = str.f14994t;
                java.lang.Boolean bool6 = java.lang.Boolean.FALSE;
                n0Var12.getClass();
                n0Var12.i(null, bool6);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(p117n6.c cVar) throws java.lang.Throwable {
        p005a5.C1319k2 c1319k2;
        p005a5.C1379q2 c1379q2;
        if (cVar instanceof p005a5.C1319k2) {
            c1319k2 = (p005a5.C1319k2) cVar;
            int i3 = c1319k2.f14685k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1319k2.f14685k = i3 - Integer.MIN_VALUE;
            } else {
                c1319k2 = new p005a5.C1319k2(this, cVar);
            }
        } else {
            c1319k2 = new p005a5.C1319k2(this, cVar);
        }
        java.lang.Object obj = c1319k2.f14684i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1319k2.f14685k;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1379q2 = c1319k2.f14683h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                p005a5.C1455y c1455y = c1379q2.f14979c;
                c1455y.f15338d.h(null);
                S7.C.A(c1455y.f15337c, null, new p005a5.r(c1455y, null), 3);
                c1379q2.r();
                return p070h6.A.f22523a;
            } catch (java.lang.Throwable th) {
                th = th;
                p005a5.C1455y c1455y2 = c1379q2.f14979c;
                c1455y2.f15338d.h(null);
                S7.C.A(c1455y2.f15337c, null, new p005a5.r(c1455y2, null), 3);
                c1379q2.r();
                throw th;
            }
        }
        com.google.common.util.concurrent.P.u0(obj);
        try {
            c1319k2.f14683h = this;
            c1319k2.f14685k = 1;
            if (l(c1319k2) == aVar) {
                return aVar;
            }
            c1379q2 = this;
            p005a5.C1455y c1455y3 = c1379q2.f14979c;
            c1455y3.f15338d.h(null);
            S7.C.A(c1455y3.f15337c, null, new p005a5.r(c1455y3, null), 3);
            c1379q2.r();
            return p070h6.A.f22523a;
        } catch (java.lang.Throwable th2) {
            th = th2;
            c1379q2 = this;
            p005a5.C1455y c1455y4 = c1379q2.f14979c;
            c1455y4.f15338d.h(null);
            S7.C.A(c1455y4.f15337c, null, new p005a5.r(c1455y4, null), 3);
            c1379q2.r();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(android.app.Activity activity, com.revenuecat.purchases.Package r9, p117n6.c cVar) {
        p005a5.C1329l2 c1329l2;
        p005a5.C1379q2 c1379q2;
        if (cVar instanceof p005a5.C1329l2) {
            c1329l2 = (p005a5.C1329l2) cVar;
            int i3 = c1329l2.f14722k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1329l2.f14722k = i3 - Integer.MIN_VALUE;
            } else {
                c1329l2 = new p005a5.C1329l2(this, cVar);
            }
        } else {
            c1329l2 = new p005a5.C1329l2(this, cVar);
        }
        java.lang.Object objC = c1329l2.f14721i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1329l2.f14722k;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objC);
                this.f14981e.getClass();
                if (!this.f14996v) {
                    return com.google.common.util.concurrent.P.T(new java.lang.IllegalStateException("RevenueCat not configured"));
                }
                c1329l2.f14720h = this;
                c1329l2.f14722k = 1;
                objC = c(activity, r9, c1329l2);
                if (objC == aVar) {
                    return aVar;
                }
                c1379q2 = this;
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1379q2 = c1329l2.f14720h;
                com.google.common.util.concurrent.P.u0(objC);
            }
            com.revenuecat.purchases.CustomerInfo customerInfo = (com.revenuecat.purchases.CustomerInfo) objC;
            c1379q2.h(customerInfo);
            return customerInfo;
        } catch (java.lang.Throwable th) {
            android.util.Log.w("PurchaseRepo", "purchase failed: " + th.getMessage());
            return com.google.common.util.concurrent.P.T(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(p100l6.c cVar) {
        p005a5.C1339m2 c1339m2;
        p005a5.C1379q2 c1379q2;
        if (cVar instanceof p005a5.C1339m2) {
            c1339m2 = (p005a5.C1339m2) cVar;
            int i3 = c1339m2.f14763k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1339m2.f14763k = i3 - Integer.MIN_VALUE;
            } else {
                c1339m2 = new p005a5.C1339m2(this, cVar);
            }
        } else {
            c1339m2 = new p005a5.C1339m2(this, cVar);
        }
        java.lang.Object objA = c1339m2.f14762i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1339m2.f14763k;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objA);
            if (!k()) {
                c1339m2.f14761h = this;
                c1339m2.f14763k = 1;
                objA = this.f14979c.a(c1339m2);
                if (objA == aVar) {
                    return aVar;
                }
                c1379q2 = this;
            }
            return a2;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c1379q2 = c1339m2.f14761h;
        com.google.common.util.concurrent.P.u0(objA);
        com.kiptv.core.model.DailyUsageResponse dailyUsageResponse = (com.kiptv.core.model.DailyUsageResponse) objA;
        if (dailyUsageResponse != null) {
            c1379q2.u(dailyUsageResponse);
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(p117n6.c cVar) {
        p005a5.C1349n2 c1349n2;
        p005a5.C1379q2 c1379q2;
        if (cVar instanceof p005a5.C1349n2) {
            c1349n2 = (p005a5.C1349n2) cVar;
            int i3 = c1349n2.f14810k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1349n2.f14810k = i3 - Integer.MIN_VALUE;
            } else {
                c1349n2 = new p005a5.C1349n2(this, cVar);
            }
        } else {
            c1349n2 = new p005a5.C1349n2(this, cVar);
        }
        java.lang.Object objQ = c1349n2.f14809i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1349n2.f14810k;
        p078i6.w wVar = p078i6.w.f23205h;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objQ);
                this.f14981e.getClass();
                if (!this.f14996v) {
                    V7.n0 n0Var = this.f14986l;
                    n0Var.getClass();
                    n0Var.i(null, wVar);
                    return wVar;
                }
                c1349n2.f14808h = this;
                c1349n2.f14810k = 1;
                S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(c1349n2));
                c0895k.r();
                com.revenuecat.purchases.ListenerConversionsCommonKt.getOfferingsWith(com.revenuecat.purchases.Purchases.INSTANCE.getSharedInstance(), new p005a5.C1249d2(this, c0895k, 2), new U7.y(c0895k, 2));
                objQ = c0895k.q();
                if (objQ == aVar) {
                    return aVar;
                }
                c1379q2 = this;
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1379q2 = c1349n2.f14808h;
                com.google.common.util.concurrent.P.u0(objQ);
            }
            java.util.List list = (java.util.List) objQ;
            c1379q2.f14986l.h(list);
            return list;
        } catch (java.lang.Throwable th) {
            B2.a.v("refreshOfferings failed: ", th.getMessage(), "PurchaseRepo");
            return wVar;
        }
    }

    public final void r() {
        com.kiptv.core.model.l0 l0Var = com.kiptv.core.model.l0.f20795i;
        V7.n0 n0Var = this.g;
        n0Var.getClass();
        n0Var.i(null, l0Var);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        V7.n0 n0Var2 = this.f14984i;
        n0Var2.getClass();
        n0Var2.i(null, bool);
        com.kiptv.core.model.SubscriptionStatus.INSTANCE.getClass();
        this.j.h(com.kiptv.core.model.SubscriptionStatus.f20108i);
        V7.n0 n0Var3 = this.f14987m;
        n0Var3.getClass();
        n0Var3.i(null, 0);
        this.f14981e.getClass();
        V7.n0 n0Var4 = this.f14989o;
        n0Var4.getClass();
        n0Var4.i(null, 1800);
        V7.n0 n0Var5 = this.f14990p;
        n0Var5.getClass();
        n0Var5.i(null, 1800);
        V7.n0 n0Var6 = this.f14992r;
        n0Var6.getClass();
        n0Var6.i(null, bool);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        V7.n0 n0Var7 = this.f14994t;
        n0Var7.getClass();
        n0Var7.i(null, bool2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(p117n6.c cVar) {
        p005a5.C1359o2 c1359o2;
        p005a5.C1379q2 c1379q2;
        if (cVar instanceof p005a5.C1359o2) {
            c1359o2 = (p005a5.C1359o2) cVar;
            int i3 = c1359o2.f14881k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1359o2.f14881k = i3 - Integer.MIN_VALUE;
            } else {
                c1359o2 = new p005a5.C1359o2(this, cVar);
            }
        } else {
            c1359o2 = new p005a5.C1359o2(this, cVar);
        }
        java.lang.Object objQ = c1359o2.f14880i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1359o2.f14881k;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objQ);
                this.f14981e.getClass();
                if (!this.f14996v) {
                    return com.google.common.util.concurrent.P.T(new java.lang.IllegalStateException("RevenueCat not configured"));
                }
                c1359o2.f14879h = this;
                c1359o2.f14881k = 1;
                S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(c1359o2));
                c0895k.r();
                com.revenuecat.purchases.ListenerConversionsCommonKt.restorePurchasesWith(com.revenuecat.purchases.Purchases.INSTANCE.getSharedInstance(), new p005a5.C1249d2(this, c0895k, 3), new U7.y(c0895k, 3));
                objQ = c0895k.q();
                if (objQ == aVar) {
                    return aVar;
                }
                c1379q2 = this;
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1379q2 = c1359o2.f14879h;
                com.google.common.util.concurrent.P.u0(objQ);
            }
            com.revenuecat.purchases.CustomerInfo customerInfo = (com.revenuecat.purchases.CustomerInfo) objQ;
            c1379q2.h(customerInfo);
            return customerInfo;
        } catch (java.lang.Throwable th) {
            android.util.Log.w("PurchaseRepo", "restore failed: " + th.getMessage());
            return com.google.common.util.concurrent.P.T(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object t(com.kiptv.core.model.SubscriptionStatus subscriptionStatus, p117n6.c cVar) {
        p005a5.C1369p2 c1369p2;
        if (cVar instanceof p005a5.C1369p2) {
            c1369p2 = (p005a5.C1369p2) cVar;
            int i3 = c1369p2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1369p2.j = i3 - Integer.MIN_VALUE;
            } else {
                c1369p2 = new p005a5.C1369p2(this, cVar);
            }
        } else {
            c1369p2 = new p005a5.C1369p2(this, cVar);
        }
        p005a5.C1369p2 c1369p3 = c1369p2;
        java.lang.Object obj = c1369p3.f14933h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1369p3.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                io.github.jan.supabase.auth.Auth auth = io.github.jan.supabase.auth.AuthKt.getAuth(this.f14977a);
                C5.C0132n0 c0132n0 = new C5.C0132n0(23, subscriptionStatus);
                c1369p3.j = 1;
                if (io.github.jan.supabase.auth.Auth.DefaultImpls.updateUser$default(auth, false, null, c0132n0, c1369p3, 3, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
        } catch (java.lang.Exception e6) {
            Y6.f.u(e6, "syncToSupabase failed: ", "PurchaseRepo");
        }
        return p070h6.A.f22523a;
    }

    public final void u(com.kiptv.core.model.DailyUsageResponse dailyUsageResponse) {
        boolean z6 = dailyUsageResponse.g;
        V7.n0 n0Var = this.f14992r;
        V7.n0 n0Var2 = this.f14990p;
        V7.n0 n0Var3 = this.f14989o;
        V7.n0 n0Var4 = this.f14987m;
        boolean z9 = dailyUsageResponse.f19729f;
        int i3 = dailyUsageResponse.f19725b;
        int i9 = dailyUsageResponse.f19726c;
        int i10 = dailyUsageResponse.f19724a;
        if (z6 && !k()) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i10);
            n0Var4.getClass();
            n0Var4.i(null, numValueOf);
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i9);
            n0Var3.getClass();
            n0Var3.i(null, numValueOf2);
            java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i3);
            n0Var2.getClass();
            n0Var2.i(null, numValueOf3);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z9);
            n0Var.getClass();
            n0Var.i(null, boolValueOf);
            return;
        }
        if (k()) {
            n0Var4.getClass();
            n0Var4.i(null, 0);
            n0Var3.getClass();
            n0Var3.i(null, 999999);
            n0Var2.getClass();
            n0Var2.i(null, 0);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            n0Var.getClass();
            n0Var.i(null, bool);
            return;
        }
        java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(i10);
        n0Var4.getClass();
        n0Var4.i(null, numValueOf4);
        java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(i9);
        n0Var3.getClass();
        n0Var3.i(null, numValueOf5);
        java.lang.Integer numValueOf6 = java.lang.Integer.valueOf(i3);
        n0Var2.getClass();
        n0Var2.i(null, numValueOf6);
        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z9);
        n0Var.getClass();
        n0Var.i(null, boolValueOf2);
    }
}
