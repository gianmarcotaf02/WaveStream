package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aQ\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0015\u0010\u0011\u001a\u00020\u000e*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000e*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lio/github/jan/supabase/auth/AuthConfigDefaults;", "", "alwaysAutoRefresh", "autoLoadFromStorage", "autoSaveToStorage", "Lio/github/jan/supabase/auth/SessionManager;", "sessionManager", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "codeVerifierCache", "enableLifecycleCallbacks", "Lh6/A;", "minimalSettings", "(Lio/github/jan/supabase/auth/AuthConfigDefaults;ZZZLio/github/jan/supabase/auth/SessionManager;Lio/github/jan/supabase/auth/CodeVerifierCache;Z)V", "Lio/github/jan/supabase/auth/AuthConfig;", "", "getDeepLink", "(Lio/github/jan/supabase/auth/AuthConfig;)Ljava/lang/String;", "deepLink", "getDeepLinkOrNull", "deepLinkOrNull", "auth-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AuthConfigKt {
    public static final java.lang.String getDeepLink(io.github.jan.supabase.auth.AuthConfig authConfig) {
        kotlin.jvm.internal.m.e(authConfig, "<this>");
        java.lang.String scheme = authConfig.getScheme();
        if (scheme == null) {
            io.github.jan.supabase.auth.AuthExtensionsKt.noDeeplinkError("scheme");
            throw new I3.b();
        }
        java.lang.String host = authConfig.getHost();
        if (host != null) {
            return p121o0.p.p(scheme, "://", host);
        }
        io.github.jan.supabase.auth.AuthExtensionsKt.noDeeplinkError(com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.HOST_KEY);
        throw new I3.b();
    }

    public static final java.lang.String getDeepLinkOrNull(io.github.jan.supabase.auth.AuthConfig authConfig) {
        java.lang.String host;
        kotlin.jvm.internal.m.e(authConfig, "<this>");
        java.lang.String scheme = authConfig.getScheme();
        if (scheme == null || (host = authConfig.getHost()) == null) {
            return null;
        }
        return p121o0.p.p(scheme, "://", host);
    }

    public static final void minimalSettings(io.github.jan.supabase.auth.AuthConfigDefaults authConfigDefaults, boolean z6, boolean z9, boolean z10, io.github.jan.supabase.auth.SessionManager sessionManager, io.github.jan.supabase.auth.CodeVerifierCache codeVerifierCache, boolean z11) {
        kotlin.jvm.internal.m.e(authConfigDefaults, "<this>");
        authConfigDefaults.setAlwaysAutoRefresh(z6);
        authConfigDefaults.setAutoLoadFromStorage(z9);
        authConfigDefaults.setAutoSaveToStorage(z10);
        authConfigDefaults.setSessionManager(sessionManager);
        authConfigDefaults.setCodeVerifierCache(codeVerifierCache);
        authConfigDefaults.setEnableLifecycleCallbacks(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void minimalSettings$default(io.github.jan.supabase.auth.AuthConfigDefaults authConfigDefaults, boolean z6, boolean z9, boolean z10, io.github.jan.supabase.auth.SessionManager sessionManager, io.github.jan.supabase.auth.CodeVerifierCache codeVerifierCache, boolean z11, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        if ((i3 & 2) != 0) {
            z9 = false;
        }
        if ((i3 & 4) != 0) {
            z10 = false;
        }
        io.github.jan.supabase.auth.user.UserSession userSession = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        int i9 = 1;
        if ((i3 & 8) != 0) {
            sessionManager = new io.github.jan.supabase.auth.MemorySessionManager(userSession, i9, objArr3 == true ? 1 : 0);
        }
        if ((i3 & 16) != 0) {
            codeVerifierCache = new io.github.jan.supabase.auth.MemoryCodeVerifierCache(objArr2 == true ? 1 : 0, i9, objArr == true ? 1 : 0);
        }
        if ((i3 & 32) != 0) {
            z11 = false;
        }
        minimalSettings(authConfigDefaults, z6, z9, z10, sessionManager, codeVerifierCache, z11);
    }
}
