package io.ktor.client;

/* JADX INFO: loaded from: classes4.dex */
@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJK\u0010\u0010\u001a\u00020\u0007\"\b\b\u0001\u0010\u000b*\u00020\u0003\"\b\b\u0002\u0010\f*\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u0015J\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0010\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\u00072\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cR0\u0010\u001f\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010!\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R,\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R.\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\nR\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\"\u00102\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R(\u00105\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u0010*\u0012\u0004\b8\u0010\u0005\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.¨\u00069"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "block", "engine", "(Lx6/j;)V", "TBuilder", "TPlugin", "Lio/ktor/client/plugins/HttpClientPlugin;", "plugin", "configure", "install", "(Lio/ktor/client/plugins/HttpClientPlugin;Lx6/j;)V", "", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Lio/ktor/client/HttpClient;", "(Ljava/lang/String;Lx6/j;)V", "client", "(Lio/ktor/client/HttpClient;)V", "clone", "()Lio/ktor/client/HttpClientConfig;", io.sentry.protocol.Request.JsonKeys.OTHER, "plusAssign", "(Lio/ktor/client/HttpClientConfig;)V", "", "Lio/ktor/util/AttributeKey;", "plugins", "Ljava/util/Map;", "pluginConfigurations", "customInterceptors", "engineConfig", "Lx6/j;", "getEngineConfig$ktor_client_core", "()Lx6/j;", "setEngineConfig$ktor_client_core", "", "followRedirects", "Z", "getFollowRedirects", "()Z", "setFollowRedirects", "(Z)V", "useDefaultTransformers", "getUseDefaultTransformers", "setUseDefaultTransformers", "expectSuccess", "getExpectSuccess", "setExpectSuccess", "developmentMode", "getDevelopmentMode", "setDevelopmentMode", "getDevelopmentMode$annotations", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpClientConfig<T extends io.ktor.client.engine.HttpClientEngineConfig> {
    private boolean expectSuccess;
    private final java.util.Map<io.ktor.util.AttributeKey<?>, p194x6.j> plugins = new java.util.LinkedHashMap();
    private final java.util.Map<io.ktor.util.AttributeKey<?>, p194x6.j> pluginConfigurations = new java.util.LinkedHashMap();
    private final java.util.Map<java.lang.String, p194x6.j> customInterceptors = new java.util.LinkedHashMap();
    private p194x6.j engineConfig = new io.github.jan.supabase.storage.f(28);
    private boolean followRedirects = true;
    private boolean useDefaultTransformers = true;
    private boolean developmentMode = io.ktor.util.PlatformUtils.INSTANCE.getIS_DEVELOPMENT_MODE();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A engine$lambda$1(p194x6.j jVar, p194x6.j jVar2, io.ktor.client.engine.HttpClientEngineConfig httpClientEngineConfig) {
        kotlin.jvm.internal.m.e(httpClientEngineConfig, "<this>");
        jVar.invoke(httpClientEngineConfig);
        jVar2.invoke(httpClientEngineConfig);
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A engineConfig$lambda$0(io.ktor.client.engine.HttpClientEngineConfig httpClientEngineConfig) {
        kotlin.jvm.internal.m.e(httpClientEngineConfig, "<this>");
        return p070h6.A.f22523a;
    }

    @p070h6.c
    public static /* synthetic */ void getDevelopmentMode$annotations() {
    }

    public static /* synthetic */ void install$default(io.ktor.client.HttpClientConfig httpClientConfig, io.ktor.client.plugins.HttpClientPlugin httpClientPlugin, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            jVar = new io.github.jan.supabase.storage.f(27);
        }
        httpClientConfig.install(httpClientPlugin, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A install$lambda$2(java.lang.Object obj) {
        kotlin.jvm.internal.m.e(obj, "<this>");
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A install$lambda$3(p194x6.j jVar, p194x6.j jVar2, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(obj, "<this>");
        if (jVar != null) {
            jVar.invoke(obj);
        }
        jVar2.invoke(obj);
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A install$lambda$5(io.ktor.client.plugins.HttpClientPlugin httpClientPlugin, io.ktor.client.HttpClient scope) {
        kotlin.jvm.internal.m.e(scope, "scope");
        io.ktor.util.Attributes attributes = (io.ktor.util.Attributes) scope.getAttributes().computeIfAbsent(io.ktor.client.plugins.HttpClientPluginKt.getPLUGIN_INSTALLED_LIST(), new p026c6.a(10));
        p194x6.j jVar = ((io.ktor.client.HttpClientConfig) scope.getConfig$ktor_client_core()).pluginConfigurations.get(httpClientPlugin.getKey());
        kotlin.jvm.internal.m.b(jVar);
        java.lang.Object objPrepare = httpClientPlugin.prepare(jVar);
        httpClientPlugin.install(objPrepare, scope);
        attributes.put(httpClientPlugin.getKey(), objPrepare);
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.util.Attributes install$lambda$5$lambda$4() {
        return io.ktor.util.AttributesJvmKt.Attributes(true);
    }

    public final io.ktor.client.HttpClientConfig<T> clone() {
        io.ktor.client.HttpClientConfig<T> httpClientConfig = new io.ktor.client.HttpClientConfig<>();
        httpClientConfig.plusAssign(this);
        return httpClientConfig;
    }

    public final void engine(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.engineConfig = new H5.Z(this.engineConfig, block, 2);
    }

    public final boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    /* JADX INFO: renamed from: getEngineConfig$ktor_client_core, reason: from getter */
    public final p194x6.j getEngineConfig() {
        return this.engineConfig;
    }

    public final boolean getExpectSuccess() {
        return this.expectSuccess;
    }

    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public final boolean getUseDefaultTransformers() {
        return this.useDefaultTransformers;
    }

    public final <TBuilder, TPlugin> void install(io.ktor.client.plugins.HttpClientPlugin<? extends TBuilder, TPlugin> plugin, p194x6.j configure) {
        kotlin.jvm.internal.m.e(plugin, "plugin");
        kotlin.jvm.internal.m.e(configure, "configure");
        this.pluginConfigurations.put(plugin.getKey(), new H5.Z(this.pluginConfigurations.get(plugin.getKey()), configure, 1));
        if (this.plugins.containsKey(plugin.getKey())) {
            return;
        }
        this.plugins.put(plugin.getKey(), new p078i6.C2255f(4, plugin));
    }

    public final void plusAssign(io.ktor.client.HttpClientConfig<? extends T> other) {
        kotlin.jvm.internal.m.e(other, "other");
        this.followRedirects = other.followRedirects;
        this.useDefaultTransformers = other.useDefaultTransformers;
        this.expectSuccess = other.expectSuccess;
        this.plugins.putAll(other.plugins);
        this.pluginConfigurations.putAll(other.pluginConfigurations);
        this.customInterceptors.putAll(other.customInterceptors);
    }

    public final void setDevelopmentMode(boolean z6) {
        this.developmentMode = z6;
    }

    public final void setEngineConfig$ktor_client_core(p194x6.j jVar) {
        kotlin.jvm.internal.m.e(jVar, "<set-?>");
        this.engineConfig = jVar;
    }

    public final void setExpectSuccess(boolean z6) {
        this.expectSuccess = z6;
    }

    public final void setFollowRedirects(boolean z6) {
        this.followRedirects = z6;
    }

    public final void setUseDefaultTransformers(boolean z6) {
        this.useDefaultTransformers = z6;
    }

    public final void install(java.lang.String key, p194x6.j block) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(block, "block");
        this.customInterceptors.put(key, block);
    }

    public final void install(io.ktor.client.HttpClient client) {
        kotlin.jvm.internal.m.e(client, "client");
        java.util.Iterator<T> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            ((p194x6.j) it.next()).invoke(client);
        }
        java.util.Iterator<T> it2 = this.customInterceptors.values().iterator();
        while (it2.hasNext()) {
            ((p194x6.j) it2.next()).invoke(client);
        }
    }
}
