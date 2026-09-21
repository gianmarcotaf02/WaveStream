package io.ktor.client.plugins.api;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00060\u0003j\u0002`\u0004B?\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0007\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R&\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginInstance;", "", "PluginConfig", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/util/AttributeKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "config", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "Lh6/A;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "<init>", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;Lx6/j;)V", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/HttpClient;)V", "close", "()V", "Lio/ktor/util/AttributeKey;", "Ljava/lang/Object;", "Lx6/j;", "Lkotlin/Function0;", "onClose", "Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ClientPluginInstance<PluginConfig> implements java.io.Closeable, java.lang.AutoCloseable {
    private final p194x6.j body;
    private final PluginConfig config;
    private final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> key;
    private kotlin.jvm.functions.Function0 onClose;

    public ClientPluginInstance(io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> key, PluginConfig config, p194x6.j body) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(config, "config");
        kotlin.jvm.internal.m.e(body, "body");
        this.key = key;
        this.config = config;
        this.body = body;
        this.onClose = new p026c6.a(13);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.onClose.invoke();
    }

    @io.ktor.utils.io.InternalAPI
    public final void install(io.ktor.client.HttpClient scope) {
        kotlin.jvm.internal.m.e(scope, "scope");
        io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder = new io.ktor.client.plugins.api.ClientPluginBuilder(this.key, scope, this.config);
        this.body.invoke(clientPluginBuilder);
        this.onClose = clientPluginBuilder.getOnClose();
        java.util.Iterator<T> it = clientPluginBuilder.getHooks$ktor_client_core().iterator();
        while (it.hasNext()) {
            ((io.ktor.client.plugins.api.HookHandler) it.next()).install(scope);
        }
    }
}
