package io.ktor.client;

import H5.Z;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.github.jan.supabase.storage.f;
import io.ktor.client.engine.HttpClientEngineConfig;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.PlatformUtils;
import io.ktor.utils.io.KtorDsl;
import io.sentry.protocol.Request;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p070h6.c;
import p078i6.C2255f;
import p194x6.j;

@KtorDsl
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJK\u0010\u0010\u001a\u00020\u0007\"\b\b\u0001\u0010\u000b*\u00020\u0003\"\b\b\u0002\u0010\f*\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u0015J\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0010\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\u00072\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cR0\u0010\u001f\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010!\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R,\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R.\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\nR\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\"\u00102\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R(\u00105\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u0010*\u0012\u0004\b8\u0010\u0005\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.¨\u00069"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", "block", "engine", "(Lx6/j;)V", "TBuilder", "TPlugin", "Lio/ktor/client/plugins/HttpClientPlugin;", "plugin", "configure", "install", "(Lio/ktor/client/plugins/HttpClientPlugin;Lx6/j;)V", "", SubscriberAttributeKt.JSON_NAME_KEY, "Lio/ktor/client/HttpClient;", "(Ljava/lang/String;Lx6/j;)V", "client", "(Lio/ktor/client/HttpClient;)V", "clone", "()Lio/ktor/client/HttpClientConfig;", Request.JsonKeys.OTHER, "plusAssign", "(Lio/ktor/client/HttpClientConfig;)V", "", "Lio/ktor/util/AttributeKey;", "plugins", "Ljava/util/Map;", "pluginConfigurations", "customInterceptors", "engineConfig", "Lx6/j;", "getEngineConfig$ktor_client_core", "()Lx6/j;", "setEngineConfig$ktor_client_core", "", "followRedirects", "Z", "getFollowRedirects", "()Z", "setFollowRedirects", "(Z)V", "useDefaultTransformers", "getUseDefaultTransformers", "setUseDefaultTransformers", "expectSuccess", "getExpectSuccess", "setExpectSuccess", "developmentMode", "getDevelopmentMode", "setDevelopmentMode", "getDevelopmentMode$annotations", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpClientConfig<T extends HttpClientEngineConfig> {
    private boolean expectSuccess;
    private final Map<AttributeKey<?>, j> plugins = new LinkedHashMap();
    private final Map<AttributeKey<?>, j> pluginConfigurations = new LinkedHashMap();
    private final Map<String, j> customInterceptors = new LinkedHashMap();
    private j engineConfig = new f(28);
    private boolean followRedirects = true;
    private boolean useDefaultTransformers = true;
    private boolean developmentMode = PlatformUtils.INSTANCE.getIS_DEVELOPMENT_MODE();

    public static final A engine$lambda$1(j jVar, j jVar2, HttpClientEngineConfig httpClientEngineConfig) {
        m.e(httpClientEngineConfig, "<this>");
        jVar.invoke(httpClientEngineConfig);
        jVar2.invoke(httpClientEngineConfig);
        return A.f22523a;
    }

    public static final A engineConfig$lambda$0(HttpClientEngineConfig httpClientEngineConfig) {
        m.e(httpClientEngineConfig, "<this>");
        return A.f22523a;
    }

    @c
    public static void getDevelopmentMode$annotations() {
    }

    public static void install$default(HttpClientConfig httpClientConfig, HttpClientPlugin httpClientPlugin, j jVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            jVar = new f(27);
        }
        httpClientConfig.install(httpClientPlugin, jVar);
    }

    public static final A install$lambda$2(Object obj) {
        m.e(obj, "<this>");
        return A.f22523a;
    }

    public static final A install$lambda$3(j jVar, j jVar2, Object obj) {
        m.e(obj, "<this>");
        if (jVar != null) {
            jVar.invoke(obj);
        }
        jVar2.invoke(obj);
        return A.f22523a;
    }

    public static final A install$lambda$5(HttpClientPlugin httpClientPlugin, HttpClient scope) {
        m.e(scope, "scope");
        Attributes attributes = (Attributes) scope.getAttributes().computeIfAbsent(HttpClientPluginKt.getPLUGIN_INSTALLED_LIST(), new p026c6.a(10));
        j jVar = ((HttpClientConfig) scope.getConfig$ktor_client_core()).pluginConfigurations.get(httpClientPlugin.getKey());
        m.b(jVar);
        Object objPrepare = httpClientPlugin.prepare(jVar);
        httpClientPlugin.install(objPrepare, scope);
        attributes.put(httpClientPlugin.getKey(), objPrepare);
        return A.f22523a;
    }

    public static final Attributes install$lambda$5$lambda$4() {
        return AttributesJvmKt.Attributes(true);
    }

    public final HttpClientConfig<T> clone() {
        HttpClientConfig<T> httpClientConfig = new HttpClientConfig<>();
        httpClientConfig.plusAssign(this);
        return httpClientConfig;
    }

    public final void engine(j block) {
        m.e(block, "block");
        this.engineConfig = new Z(this.engineConfig, block, 2);
    }

    public final boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public final j getEngineConfig() {
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

    public final <TBuilder, TPlugin> void install(HttpClientPlugin<? extends TBuilder, TPlugin> plugin, j configure) {
        m.e(plugin, "plugin");
        m.e(configure, "configure");
        this.pluginConfigurations.put(plugin.getKey(), new Z(this.pluginConfigurations.get(plugin.getKey()), configure, 1));
        if (this.plugins.containsKey(plugin.getKey())) {
            return;
        }
        this.plugins.put(plugin.getKey(), new C2255f(4, plugin));
    }

    public final void plusAssign(HttpClientConfig<? extends T> other) {
        m.e(other, "other");
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

    public final void setEngineConfig$ktor_client_core(j jVar) {
        m.e(jVar, "<set-?>");
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

    public final void install(String key, j block) {
        m.e(key, "key");
        m.e(block, "block");
        this.customInterceptors.put(key, block);
    }

    public final void install(HttpClient client) {
        m.e(client, "client");
        Iterator<T> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).invoke(client);
        }
        Iterator<T> it2 = this.customInterceptors.values().iterator();
        while (it2.hasNext()) {
            ((j) it2.next()).invoke(client);
        }
    }
}
