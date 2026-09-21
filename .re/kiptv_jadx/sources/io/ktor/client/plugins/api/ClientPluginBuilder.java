package io.ktor.client.plugins.api;

/* JADX INFO: loaded from: classes4.dex */
@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B-\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0011\u001a\u00020\u000f2.\u0010\u0010\u001a*\b\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0016\u001a\u00020\u000f2(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\u001c\u001a\u00020\u000f28\u0010\u0010\u001a4\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dJE\u0010 \u001a\u00020\u000f26\u0010\u0010\u001a2\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0004\b \u0010\u001dJ\u001b\u0010\"\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0!¢\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020\u000f\"\u0004\b\u0001\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010%2\u0006\u0010'\u001a\u00028\u0001¢\u0006\u0004\b(\u0010)R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R$\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000304038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010#¨\u0006="}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginBuilder;", "", "PluginConfig", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/api/ClientPluginInstance;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Lio/ktor/client/HttpClient;", "client", "pluginConfig", "<init>", "(Lio/ktor/util/AttributeKey;Lio/ktor/client/HttpClient;Ljava/lang/Object;)V", "Lkotlin/Function4;", "Lio/ktor/client/plugins/api/OnRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "Ll6/c;", "Lh6/A;", "block", "onRequest", "(Lx6/o;)V", "Lkotlin/Function3;", "Lio/ktor/client/plugins/api/OnResponseContext;", "Lio/ktor/client/statement/HttpResponse;", "onResponse", "(Lx6/n;)V", "Lkotlin/Function5;", "Lio/ktor/client/plugins/api/TransformRequestBodyContext;", "Lio/ktor/util/reflect/TypeInfo;", "Lio/ktor/http/content/OutgoingContent;", "transformRequestBody", "(Lx6/p;)V", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "Lio/ktor/utils/io/ByteReadChannel;", "transformResponseBody", "Lkotlin/Function0;", "onClose", "(Lkotlin/jvm/functions/Function0;)V", "HookHandler", "Lio/ktor/client/plugins/api/ClientHook;", "hook", "handler", "on", "(Lio/ktor/client/plugins/api/ClientHook;Ljava/lang/Object;)V", "Lio/ktor/util/AttributeKey;", "getKey$ktor_client_core", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "Ljava/lang/Object;", "getPluginConfig", "()Ljava/lang/Object;", "", "Lio/ktor/client/plugins/api/HookHandler;", "hooks", "Ljava/util/List;", "getHooks$ktor_client_core", "()Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "getOnClose$ktor_client_core", "()Lkotlin/jvm/functions/Function0;", "setOnClose$ktor_client_core", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ClientPluginBuilder<PluginConfig> {
    private final io.ktor.client.HttpClient client;
    private final java.util.List<io.ktor.client.plugins.api.HookHandler<?>> hooks;
    private final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> key;
    private kotlin.jvm.functions.Function0 onClose;
    private final PluginConfig pluginConfig;

    public ClientPluginBuilder(io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> key, io.ktor.client.HttpClient client, PluginConfig pluginConfig) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(client, "client");
        kotlin.jvm.internal.m.e(pluginConfig, "pluginConfig");
        this.key = key;
        this.client = client;
        this.pluginConfig = pluginConfig;
        this.hooks = new java.util.ArrayList();
        this.onClose = new p026c6.a(12);
    }

    public final io.ktor.client.HttpClient getClient() {
        return this.client;
    }

    public final java.util.List<io.ktor.client.plugins.api.HookHandler<?>> getHooks$ktor_client_core() {
        return this.hooks;
    }

    public final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> getKey$ktor_client_core() {
        return this.key;
    }

    /* JADX INFO: renamed from: getOnClose$ktor_client_core, reason: from getter */
    public final kotlin.jvm.functions.Function0 getOnClose() {
        return this.onClose;
    }

    public final PluginConfig getPluginConfig() {
        return this.pluginConfig;
    }

    public final <HookHandler> void on(io.ktor.client.plugins.api.ClientHook<HookHandler> hook, HookHandler handler) {
        kotlin.jvm.internal.m.e(hook, "hook");
        this.hooks.add(new io.ktor.client.plugins.api.HookHandler<>(hook, handler));
    }

    public final void onClose(kotlin.jvm.functions.Function0 block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.onClose = block;
    }

    public final void onRequest(p194x6.o block) {
        kotlin.jvm.internal.m.e(block, "block");
        on(io.ktor.client.plugins.api.RequestHook.INSTANCE, block);
    }

    public final void onResponse(p194x6.n block) {
        kotlin.jvm.internal.m.e(block, "block");
        on(io.ktor.client.plugins.api.ResponseHook.INSTANCE, block);
    }

    public final void setOnClose$ktor_client_core(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.m.e(function0, "<set-?>");
        this.onClose = function0;
    }

    public final void transformRequestBody(p194x6.p block) {
        kotlin.jvm.internal.m.e(block, "block");
        on(io.ktor.client.plugins.api.TransformRequestBodyHook.INSTANCE, block);
    }

    public final void transformResponseBody(p194x6.p block) {
        kotlin.jvm.internal.m.e(block, "block");
        on(io.ktor.client.plugins.api.TransformResponseBodyHook.INSTANCE, block);
    }
}
