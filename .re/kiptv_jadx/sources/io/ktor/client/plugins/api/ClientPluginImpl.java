package io.ktor.client.plugins.api;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R&\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginImpl;", "", "PluginConfigT", "Lio/ktor/client/plugins/api/ClientPlugin;", "", "name", "Lkotlin/Function0;", "createConfiguration", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "Lh6/A;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lx6/j;)V", "block", "Lio/ktor/client/plugins/api/ClientPluginInstance;", "prepare", "(Lx6/j;)Lio/ktor/client/plugins/api/ClientPluginInstance;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/api/ClientPluginInstance;Lio/ktor/client/HttpClient;)V", "Lkotlin/jvm/functions/Function0;", "Lx6/j;", "Lio/ktor/util/AttributeKey;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class ClientPluginImpl<PluginConfigT> implements io.ktor.client.plugins.api.ClientPlugin<PluginConfigT> {
    private final p194x6.j body;
    private final kotlin.jvm.functions.Function0 createConfiguration;
    private final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfigT>> key;

    public ClientPluginImpl(java.lang.String name, kotlin.jvm.functions.Function0 createConfiguration, p194x6.j body) {
        E6.v vVarB;
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(createConfiguration, "createConfiguration");
        kotlin.jvm.internal.m.e(body, "body");
        this.createConfiguration = createConfiguration;
        this.body = body;
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        E6.InterfaceC0331d interfaceC0331dB = c9.b(io.ktor.client.plugins.api.ClientPluginInstance.class);
        try {
            E6.y yVar = E6.y.f3222c;
            E6.InterfaceC0331d interfaceC0331dB2 = c9.b(io.ktor.client.plugins.api.ClientPluginImpl.class);
            E6.z zVar = E6.z.f3225h;
            E6.w wVarM = c9.m(interfaceC0331dB2);
            c9.k(wVarM, java.util.Collections.singletonList(kotlin.jvm.internal.B.a(java.lang.Object.class)));
            vVarB = kotlin.jvm.internal.B.b(io.ktor.client.plugins.api.ClientPluginInstance.class, R8.i.v(c9.l(wVarM, java.util.Collections.EMPTY_LIST, false)));
        } catch (java.lang.Throwable unused) {
            vVarB = null;
        }
        this.key = new io.ktor.util.AttributeKey<>(name, new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarB));
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfigT>> getKey() {
        return this.key;
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public void install(io.ktor.client.plugins.api.ClientPluginInstance<PluginConfigT> plugin, io.ktor.client.HttpClient scope) {
        kotlin.jvm.internal.m.e(plugin, "plugin");
        kotlin.jvm.internal.m.e(scope, "scope");
        plugin.install(scope);
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public io.ktor.client.plugins.api.ClientPluginInstance<PluginConfigT> prepare(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        java.lang.Object objInvoke = this.createConfiguration.invoke();
        block.invoke(objInvoke);
        return new io.ktor.client.plugins.api.ClientPluginInstance<>(getKey(), objInvoke, this.body);
    }
}
