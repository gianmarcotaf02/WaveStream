package io.github.jan.supabase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000f\u001a\u00020\f2\u001b\u0010\u000e\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u0018\u001a\u00020\f\"\u0004\b\u0000\u0010\u0011\"\u000e\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0014\b\u0002\u0010\u0015*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0016\u001a\u00028\u00022\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109RB\u0010<\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020:\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nj\u0004\u0018\u0001`;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0010R*\u0010B\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\f0\n0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR0\u0010E\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\n0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010M\u001a\u00020G2\u0006\u0010H\u001a\u00020G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lio/github/jan/supabase/SupabaseClientBuilder;", "", "", "supabaseUrl", "supabaseKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/github/jan/supabase/SupabaseClient;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "()Lio/github/jan/supabase/SupabaseClient;", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "Lh6/A;", "Lio/github/jan/supabase/annotations/SupabaseDsl;", "block", "httpConfig", "(Lx6/j;)V", "Config", "Lio/github/jan/supabase/plugins/SupabasePlugin;", "PluginInstance", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Provider", "plugin", io.sentry.Session.JsonKeys.INIT, "install", "(Lio/github/jan/supabase/plugins/SupabasePluginProvider;Lx6/j;)V", "Ljava/lang/String;", "", "useHTTPS", "Z", "getUseHTTPS", "()Z", "setUseHTTPS", "(Z)V", "Lio/ktor/client/engine/HttpClientEngine;", "httpEngine", "Lio/ktor/client/engine/HttpClientEngine;", "getHttpEngine", "()Lio/ktor/client/engine/HttpClientEngine;", "setHttpEngine", "(Lio/ktor/client/engine/HttpClientEngine;)V", "ignoreModulesInUrl", "getIgnoreModulesInUrl", "setIgnoreModulesInUrl", "LP7/b;", "requestTimeout", "J", "getRequestTimeout-UwyO8pc", "()J", "setRequestTimeout-LRDsOJo", "(J)V", "Lio/github/jan/supabase/SupabaseSerializer;", "defaultSerializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getDefaultSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setDefaultSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "Ll6/c;", "Lio/github/jan/supabase/AccessTokenProvider;", "accessToken", "Lx6/j;", "getAccessToken", "()Lx6/j;", "setAccessToken", "", "httpConfigOverrides", "Ljava/util/List;", "", "plugins", "Ljava/util/Map;", "Lio/github/jan/supabase/logging/LogLevel;", "value", "getDefaultLogLevel", "()Lio/github/jan/supabase/logging/LogLevel;", "setDefaultLogLevel", "(Lio/github/jan/supabase/logging/LogLevel;)V", "defaultLogLevel", "supabase-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@io.github.jan.supabase.annotations.SupabaseDsl
public final class SupabaseClientBuilder {
    private p194x6.j accessToken;
    private io.github.jan.supabase.SupabaseSerializer defaultSerializer;
    private final java.util.List<p194x6.j> httpConfigOverrides;
    private io.ktor.client.engine.HttpClientEngine httpEngine;
    private boolean ignoreModulesInUrl;
    private final java.util.Map<java.lang.String, p194x6.j> plugins;
    private long requestTimeout;
    private final java.lang.String supabaseKey;
    private final java.lang.String supabaseUrl;
    private boolean useHTTPS;

    public SupabaseClientBuilder(java.lang.String supabaseUrl, java.lang.String supabaseKey) {
        kotlin.jvm.internal.m.e(supabaseUrl, "supabaseUrl");
        kotlin.jvm.internal.m.e(supabaseKey, "supabaseKey");
        this.supabaseUrl = supabaseUrl;
        this.supabaseKey = supabaseKey;
        this.useHTTPS = true;
        P7.a aVar = P7.b.f8168i;
        this.requestTimeout = E8.l.N(10, P7.d.SECONDS);
        this.defaultSerializer = new io.github.jan.supabase.serializer.KotlinXSerializer(com.google.crypto.tink.shaded.protobuf.AbstractC1909d.e(new com.kiptv.core.model.C1933b(12)));
        this.httpConfigOverrides = new java.util.ArrayList();
        this.plugins = new java.util.LinkedHashMap();
        java.lang.String str = "realtime/v1";
        if (!O7.q.B0(supabaseUrl, "realtime/v1", false)) {
            str = "auth/v1";
            if (!O7.q.B0(supabaseUrl, "auth/v1", false)) {
                str = "storage/v1";
                if (!O7.q.B0(supabaseUrl, "storage/v1", false)) {
                    str = "rest/v1";
                    if (!O7.q.B0(supabaseUrl, "rest/v1", false)) {
                        str = null;
                    }
                }
            }
        }
        if (this.ignoreModulesInUrl || str == null) {
            if (O7.x.x0(supabaseUrl, "http://", false)) {
                this.useHTTPS = false;
            }
        } else {
            throw new java.lang.IllegalStateException(("The supabase url should not contain (" + str + "), supabase-kt handles the url endpoints. If you want to use a custom url for a module, specify it within their builder but that's not necessary for normal supabase projects").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A defaultSerializer$lambda$0(p162s8.h Json) {
        kotlin.jvm.internal.m.e(Json, "$this$Json");
        Json.f27399c = true;
        return p070h6.A.f22523a;
    }

    public static /* synthetic */ void install$default(io.github.jan.supabase.SupabaseClientBuilder supabaseClientBuilder, io.github.jan.supabase.plugins.SupabasePluginProvider supabasePluginProvider, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            jVar = new com.kiptv.core.model.C1933b(13);
        }
        supabaseClientBuilder.install(supabasePluginProvider, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A install$lambda$1(java.lang.Object obj) {
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.github.jan.supabase.plugins.SupabasePlugin install$lambda$2(io.github.jan.supabase.plugins.SupabasePluginProvider supabasePluginProvider, java.lang.Object obj, io.github.jan.supabase.SupabaseClient it) {
        kotlin.jvm.internal.m.e(it, "it");
        return supabasePluginProvider.create(it, obj);
    }

    public final io.github.jan.supabase.SupabaseClient build() {
        return new io.github.jan.supabase.SupabaseClientImpl((java.lang.String) p078i6.o.q1(O7.q.b1(this.supabaseUrl, new java.lang.String[]{"//"}, 0, 6)), this.supabaseKey, this.plugins, this.httpConfigOverrides, this.useHTTPS, P7.b.d(this.requestTimeout), this.httpEngine, this.defaultSerializer, this.accessToken);
    }

    public final p194x6.j getAccessToken() {
        return this.accessToken;
    }

    public final io.github.jan.supabase.logging.LogLevel getDefaultLogLevel() {
        return io.github.jan.supabase.SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
    }

    public final io.github.jan.supabase.SupabaseSerializer getDefaultSerializer() {
        return this.defaultSerializer;
    }

    public final io.ktor.client.engine.HttpClientEngine getHttpEngine() {
        return this.httpEngine;
    }

    public final boolean getIgnoreModulesInUrl() {
        return this.ignoreModulesInUrl;
    }

    /* JADX INFO: renamed from: getRequestTimeout-UwyO8pc, reason: not valid java name and from getter */
    public final long getRequestTimeout() {
        return this.requestTimeout;
    }

    public final boolean getUseHTTPS() {
        return this.useHTTPS;
    }

    @io.github.jan.supabase.annotations.SupabaseDsl
    @io.github.jan.supabase.annotations.SupabaseInternal
    public final void httpConfig(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.httpConfigOverrides.add(block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @io.github.jan.supabase.annotations.SupabaseDsl
    public final <Config, PluginInstance extends io.github.jan.supabase.plugins.SupabasePlugin<Config>, Provider extends io.github.jan.supabase.plugins.SupabasePluginProvider<Config, PluginInstance>> void install(Provider plugin, p194x6.j init) {
        kotlin.jvm.internal.m.e(plugin, "plugin");
        kotlin.jvm.internal.m.e(init, "init");
        java.lang.Object objCreateConfig = plugin.createConfig(init);
        plugin.setup(this, objCreateConfig);
        this.plugins.put(plugin.getKey(), new p028c8.b(plugin, objCreateConfig, 8));
    }

    public final void setAccessToken(p194x6.j jVar) {
        this.accessToken = jVar;
    }

    public final void setDefaultLogLevel(io.github.jan.supabase.logging.LogLevel value) {
        kotlin.jvm.internal.m.e(value, "value");
        io.github.jan.supabase.SupabaseClient.INSTANCE.setDEFAULT_LOG_LEVEL$supabase_kt_release(value);
    }

    public final void setDefaultSerializer(io.github.jan.supabase.SupabaseSerializer supabaseSerializer) {
        kotlin.jvm.internal.m.e(supabaseSerializer, "<set-?>");
        this.defaultSerializer = supabaseSerializer;
    }

    public final void setHttpEngine(io.ktor.client.engine.HttpClientEngine httpClientEngine) {
        this.httpEngine = httpClientEngine;
    }

    public final void setIgnoreModulesInUrl(boolean z6) {
        this.ignoreModulesInUrl = z6;
    }

    /* JADX INFO: renamed from: setRequestTimeout-LRDsOJo, reason: not valid java name */
    public final void m289setRequestTimeoutLRDsOJo(long j) {
        this.requestTimeout = j;
    }

    public final void setUseHTTPS(boolean z6) {
        this.useHTTPS = z6;
    }
}
