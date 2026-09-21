package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR$\u0010E\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010=\u001a\u0004\bF\u0010?\"\u0004\bG\u0010AR\"\u0010H\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\r\u001a\u0004\bI\u0010\u000f\"\u0004\bJ\u0010\u0011¨\u0006K"}, d2 = {"Lio/github/jan/supabase/auth/AuthConfigDefaults;", "Lio/github/jan/supabase/plugins/MainConfig;", "<init>", "()V", "LP7/b;", "retryDelay", "J", "getRetryDelay-UwyO8pc", "()J", "setRetryDelay-LRDsOJo", "(J)V", "", "alwaysAutoRefresh", "Z", "getAlwaysAutoRefresh", "()Z", "setAlwaysAutoRefresh", "(Z)V", "autoLoadFromStorage", "getAutoLoadFromStorage", "setAutoLoadFromStorage", "autoSaveToStorage", "getAutoSaveToStorage", "setAutoSaveToStorage", "Lio/github/jan/supabase/auth/SessionManager;", "sessionManager", "Lio/github/jan/supabase/auth/SessionManager;", "getSessionManager", "()Lio/github/jan/supabase/auth/SessionManager;", "setSessionManager", "(Lio/github/jan/supabase/auth/SessionManager;)V", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "codeVerifierCache", "Lio/github/jan/supabase/auth/CodeVerifierCache;", "getCodeVerifierCache", "()Lio/github/jan/supabase/auth/CodeVerifierCache;", "setCodeVerifierCache", "(Lio/github/jan/supabase/auth/CodeVerifierCache;)V", "LS7/w;", "coroutineDispatcher", "LS7/w;", "getCoroutineDispatcher", "()LS7/w;", "setCoroutineDispatcher", "(LS7/w;)V", "Lio/github/jan/supabase/auth/FlowType;", "flowType", "Lio/github/jan/supabase/auth/FlowType;", "getFlowType", "()Lio/github/jan/supabase/auth/FlowType;", "setFlowType", "(Lio/github/jan/supabase/auth/FlowType;)V", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "", "scheme", "Ljava/lang/String;", "getScheme", "()Ljava/lang/String;", "setScheme", "(Ljava/lang/String;)V", com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.HOST_KEY, "getHost", "setHost", "defaultRedirectUrl", "getDefaultRedirectUrl", "setDefaultRedirectUrl", "enableLifecycleCallbacks", "getEnableLifecycleCallbacks", "setEnableLifecycleCallbacks", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class AuthConfigDefaults extends io.github.jan.supabase.plugins.MainConfig {
    private boolean alwaysAutoRefresh;
    private boolean autoLoadFromStorage;
    private boolean autoSaveToStorage;
    private io.github.jan.supabase.auth.CodeVerifierCache codeVerifierCache;
    private S7.AbstractC0906w coroutineDispatcher;
    private java.lang.String defaultRedirectUrl;
    private boolean enableLifecycleCallbacks;
    private io.github.jan.supabase.auth.FlowType flowType;
    private java.lang.String host;
    private long retryDelay;
    private java.lang.String scheme;
    private io.github.jan.supabase.SupabaseSerializer serializer;
    private io.github.jan.supabase.auth.SessionManager sessionManager;

    public AuthConfigDefaults() {
        P7.a aVar = P7.b.f8168i;
        this.retryDelay = E8.l.N(10, P7.d.SECONDS);
        this.alwaysAutoRefresh = true;
        this.autoLoadFromStorage = true;
        this.autoSaveToStorage = true;
        this.coroutineDispatcher = S7.M.f9549a;
        this.flowType = io.github.jan.supabase.auth.FlowType.IMPLICIT;
        this.enableLifecycleCallbacks = true;
    }

    public final boolean getAlwaysAutoRefresh() {
        return this.alwaysAutoRefresh;
    }

    public final boolean getAutoLoadFromStorage() {
        return this.autoLoadFromStorage;
    }

    public final boolean getAutoSaveToStorage() {
        return this.autoSaveToStorage;
    }

    public final io.github.jan.supabase.auth.CodeVerifierCache getCodeVerifierCache() {
        return this.codeVerifierCache;
    }

    public final S7.AbstractC0906w getCoroutineDispatcher() {
        return this.coroutineDispatcher;
    }

    public final java.lang.String getDefaultRedirectUrl() {
        return this.defaultRedirectUrl;
    }

    public final boolean getEnableLifecycleCallbacks() {
        return this.enableLifecycleCallbacks;
    }

    public final io.github.jan.supabase.auth.FlowType getFlowType() {
        return this.flowType;
    }

    public final java.lang.String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: getRetryDelay-UwyO8pc, reason: not valid java name and from getter */
    public final long getRetryDelay() {
        return this.retryDelay;
    }

    public final java.lang.String getScheme() {
        return this.scheme;
    }

    public final io.github.jan.supabase.SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public final io.github.jan.supabase.auth.SessionManager getSessionManager() {
        return this.sessionManager;
    }

    public final void setAlwaysAutoRefresh(boolean z6) {
        this.alwaysAutoRefresh = z6;
    }

    public final void setAutoLoadFromStorage(boolean z6) {
        this.autoLoadFromStorage = z6;
    }

    public final void setAutoSaveToStorage(boolean z6) {
        this.autoSaveToStorage = z6;
    }

    public final void setCodeVerifierCache(io.github.jan.supabase.auth.CodeVerifierCache codeVerifierCache) {
        this.codeVerifierCache = codeVerifierCache;
    }

    public final void setCoroutineDispatcher(S7.AbstractC0906w abstractC0906w) {
        kotlin.jvm.internal.m.e(abstractC0906w, "<set-?>");
        this.coroutineDispatcher = abstractC0906w;
    }

    public final void setDefaultRedirectUrl(java.lang.String str) {
        this.defaultRedirectUrl = str;
    }

    public final void setEnableLifecycleCallbacks(boolean z6) {
        this.enableLifecycleCallbacks = z6;
    }

    public final void setFlowType(io.github.jan.supabase.auth.FlowType flowType) {
        kotlin.jvm.internal.m.e(flowType, "<set-?>");
        this.flowType = flowType;
    }

    public final void setHost(java.lang.String str) {
        this.host = str;
    }

    /* JADX INFO: renamed from: setRetryDelay-LRDsOJo, reason: not valid java name */
    public final void m291setRetryDelayLRDsOJo(long j) {
        this.retryDelay = j;
    }

    public final void setScheme(java.lang.String str) {
        this.scheme = str;
    }

    public final void setSerializer(io.github.jan.supabase.SupabaseSerializer supabaseSerializer) {
        this.serializer = supabaseSerializer;
    }

    public final void setSessionManager(io.github.jan.supabase.auth.SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }
}
