package p005a5;

/* JADX INFO: renamed from: a5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1296i {
    public static final p005a5.C1236c Companion = new p005a5.C1236c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.List f14589d = p078i6.p.B0(new p070h6.k("invalid login credentials", "auth.errors.invalid_credentials"), new p070h6.k("invalid email or password", "auth.errors.invalid_email_or_password"), new p070h6.k("email not confirmed", "auth.errors.email_not_confirmed"), new p070h6.k("user already registered", "auth.errors.user_already_registered"), new p070h6.k("password should be at least", "auth.errors.password_min_length"), new p070h6.k("password too weak", "auth.errors.password_too_weak"), new p070h6.k("same_password", "auth.errors.same_password"), new p070h6.k("new password should be different", "auth.errors.same_password"), new p070h6.k("email_validation_failed", "auth.errors.email_validation_failed"), new p070h6.k("invalid email", "auth.errors.email_invalid"), new p070h6.k("for security purposes", "auth.errors.security_purposes"), new p070h6.k("rate limit", "auth.errors.rate_limit_general"), new p070h6.k("over_email_send_rate_limit", "auth.errors.rate_limit_email"), new p070h6.k("jwt expired", "auth.errors.jwt_expired"), new p070h6.k("jwt", "auth.errors.jwt_invalid"), new p070h6.k("refresh_token_not_found", "auth.errors.refresh_token_not_found"), new p070h6.k("bad_request", "auth.errors.bad_request"), new p070h6.k("unauthorized", "auth.errors.unauthorized"), new p070h6.k("server error", "auth.errors.server_error"), new p070h6.k("network", "auth.errors.network_error"), new p070h6.k("fetch", "auth.errors.fetch_failed"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.github.jan.supabase.SupabaseClient f14590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V7.n0 f14591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V7.W f14592c;

    public C1296i(io.github.jan.supabase.SupabaseClient supabaseClient, I1.d credentialManager, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
        kotlin.jvm.internal.m.e(credentialManager, "credentialManager");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f14590a = supabaseClient;
        V7.n0 n0VarB = V7.r.b(p005a5.C1316k.f14679a);
        this.f14591b = n0VarB;
        this.f14592c = new V7.W(n0VarB);
        Z7.e eVar = S7.M.f9549a;
        S7.C.A(S7.C.c(Z7.d.f13044i.plus(S7.C.e())), null, new p005a5.C1226b(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final void a(p005a5.C1296i c1296i, p117n6.c cVar) {
        p005a5.C1266f c1266f;
        c1296i.getClass();
        if (cVar instanceof p005a5.C1266f) {
            c1266f = (p005a5.C1266f) cVar;
            int i3 = c1266f.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1266f.j = i3 - Integer.MIN_VALUE;
            } else {
                c1266f = new p005a5.C1266f(c1296i, cVar);
            }
        } else {
            c1266f = new p005a5.C1266f(c1296i, cVar);
        }
        java.lang.Object obj = c1266f.f14444h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1266f.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            V7.l0 sessionStatus = io.github.jan.supabase.auth.AuthKt.getAuth(c1296i.f14590a).getSessionStatus();
            p005a5.C1276g c1276g = new p005a5.C1276g(c1296i);
            c1266f.j = 1;
            if (sessionStatus.collect(c1276g, c1266f) == aVar) {
                return;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        throw new I3.b();
    }

    public static java.lang.String g(java.lang.Exception exc) {
        java.lang.String message = exc.getMessage();
        if (message == null) {
            return "auth.errors.default";
        }
        java.lang.String lowerCase = message.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        for (p070h6.k kVar : f14589d) {
            java.lang.String str = (java.lang.String) kVar.f22539h;
            java.lang.String str2 = (java.lang.String) kVar.f22540i;
            if (O7.q.B0(lowerCase, str, false)) {
                return str2;
            }
        }
        return "auth.errors.default";
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object b(p117n6.c cVar) throws java.lang.Exception {
        p005a5.C1246d c1246d;
        java.lang.Exception exc;
        p005a5.C1296i c1296i;
        if (cVar instanceof p005a5.C1246d) {
            c1246d = (p005a5.C1246d) cVar;
            int i3 = c1246d.f14340k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1246d.f14340k = i3 - Integer.MIN_VALUE;
            } else {
                c1246d = new p005a5.C1246d(this, cVar);
            }
        } else {
            c1246d = new p005a5.C1246d(this, cVar);
        }
        p005a5.C1246d c1246d2 = c1246d;
        java.lang.Object obj = c1246d2.f14339i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1246d2.f14340k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (e() == null) {
                p005a5.EnumC1216a[] enumC1216aArr = p005a5.EnumC1216a.f14188h;
                throw new F6.a("UserNotFound");
            }
            try {
                io.github.jan.supabase.postgrest.Postgrest postgrest = io.github.jan.supabase.postgrest.PostgrestKt.getPostgrest(this.f14590a);
                c1246d2.f14338h = this;
                c1246d2.f14340k = 1;
                if (io.github.jan.supabase.postgrest.Postgrest.DefaultImpls.rpc$default(postgrest, "delete_own_account", null, c1246d2, 2, null) == aVar) {
                    return aVar;
                }
                c1296i = this;
            } catch (java.lang.Exception e6) {
                exc = e6;
                c1296i = this;
                c1296i.getClass();
                p005a5.C1306j c1306j = new p005a5.C1306j(g(exc));
                V7.n0 n0Var = c1296i.f14591b;
                n0Var.getClass();
                n0Var.i(null, c1306j);
                throw exc;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1296i = c1246d2.f14338h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (java.lang.Exception e9) {
                exc = e9;
                c1296i.getClass();
                p005a5.C1306j c1306j2 = new p005a5.C1306j(g(exc));
                V7.n0 n0Var2 = c1296i.f14591b;
                n0Var2.getClass();
                n0Var2.i(null, c1306j2);
                throw exc;
            }
        }
        c1296i.h();
        return p070h6.A.f22523a;
    }

    public final java.lang.Object c(p005a5.I1 i3) {
        java.lang.Object objD;
        io.github.jan.supabase.auth.user.UserSession userSessionCurrentSessionOrNull = io.github.jan.supabase.auth.AuthKt.getAuth(this.f14590a).currentSessionOrNull();
        p070h6.A a2 = p070h6.A.f22523a;
        if (userSessionCurrentSessionOrNull != null) {
            p036d8.d.Companion.getClass();
            j$.time.Instant instant = j$.time.Clock.systemUTC().instant();
            kotlin.jvm.internal.m.d(instant, "instant(...)");
            p036d8.d dVar = new p036d8.d(instant);
            p036d8.d expiresAt = userSessionCurrentSessionOrNull.getExpiresAt();
            P7.a aVar = P7.b.f8168i;
            if (expiresAt.compareTo(dVar.b(E8.l.N(60, P7.d.SECONDS))) <= 0 && (objD = d(i3)) == p109m6.a.f25430h) {
                return objD;
            }
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(p117n6.c cVar) {
        p005a5.C1256e c1256e;
        java.lang.Object objT;
        if (cVar instanceof p005a5.C1256e) {
            c1256e = (p005a5.C1256e) cVar;
            int i3 = c1256e.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1256e.j = i3 - Integer.MIN_VALUE;
            } else {
                c1256e = new p005a5.C1256e(this, cVar);
            }
        } else {
            c1256e = new p005a5.C1256e(this, cVar);
        }
        java.lang.Object obj = c1256e.f14380h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1256e.j;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                io.github.jan.supabase.auth.Auth auth = io.github.jan.supabase.auth.AuthKt.getAuth(this.f14590a);
                c1256e.j = 1;
                if (auth.refreshCurrentSession(c1256e) == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            objT = a2;
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        java.lang.Throwable thA = p070h6.n.a(objT);
        if (thA != null) {
            android.util.Log.d("AuthRepository", "forceRefreshSession failed: " + thA);
        }
        return a2;
    }

    public final io.github.jan.supabase.auth.user.UserInfo e() {
        java.lang.Object value = this.f14591b.getValue();
        p005a5.C1326l c1326l = value instanceof p005a5.C1326l ? (p005a5.C1326l) value : null;
        if (c1326l != null) {
            return c1326l.f14711a;
        }
        return null;
    }

    public final java.lang.String f() {
        kotlinx.serialization.json.c userMetadata;
        kotlinx.serialization.json.b bVar;
        io.github.jan.supabase.auth.user.UserInfo userInfoE = e();
        if (userInfoE != null && (userMetadata = userInfoE.getUserMetadata()) != null && (bVar = (kotlinx.serialization.json.b) userMetadata.get("avatar_url")) != null) {
            kotlinx.serialization.json.d dVar = bVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar : null;
            if (dVar != null) {
                return dVar.d();
            }
        }
        return null;
    }

    public final void h() {
        V7.n0 n0Var = this.f14591b;
        p005a5.C1336m c1336m = p005a5.C1336m.f14753a;
        n0Var.getClass();
        n0Var.i(null, c1336m);
        java.util.Set set = p015b5.AbstractC1664a.f17935a;
        p015b5.AbstractC1664a.f17937c = null;
        if (p015b5.AbstractC1664a.f17936b) {
            try {
                io.sentry.Sentry.setUser(null);
                io.sentry.Sentry.removeTag("supabase_user_id");
            } catch (java.lang.Throwable th) {
                B2.a.v("Sentry clearUser failed: ", th.getMessage(), "CrashReporting");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(p117n6.c cVar) throws java.lang.Exception {
        p005a5.C1286h c1286h;
        p005a5.C1296i c1296i;
        if (cVar instanceof p005a5.C1286h) {
            c1286h = (p005a5.C1286h) cVar;
            int i3 = c1286h.f14526k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1286h.f14526k = i3 - Integer.MIN_VALUE;
            } else {
                c1286h = new p005a5.C1286h(this, cVar);
            }
        } else {
            c1286h = new p005a5.C1286h(this, cVar);
        }
        java.lang.Object obj = c1286h.f14525i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1286h.f14526k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            try {
                io.github.jan.supabase.auth.Auth auth = io.github.jan.supabase.auth.AuthKt.getAuth(this.f14590a);
                c1286h.f14524h = this;
                c1286h.f14526k = 1;
                if (io.github.jan.supabase.auth.Auth.DefaultImpls.signOut$default(auth, null, c1286h, 1, null) == aVar) {
                    return aVar;
                }
                c1296i = this;
            } catch (java.lang.Exception e6) {
                e = e6;
                c1296i = this;
                c1296i.getClass();
                p005a5.C1306j c1306j = new p005a5.C1306j(g(e));
                V7.n0 n0Var = c1296i.f14591b;
                n0Var.getClass();
                n0Var.i(null, c1306j);
                throw e;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1296i = c1286h.f14524h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (java.lang.Exception e9) {
                e = e9;
                c1296i.getClass();
                p005a5.C1306j c1306j2 = new p005a5.C1306j(g(e));
                V7.n0 n0Var2 = c1296i.f14591b;
                n0Var2.getClass();
                n0Var2.i(null, c1306j2);
                throw e;
            }
        }
        c1296i.h();
        return p070h6.A.f22523a;
    }
}
