package io.ktor.client.plugins.api;

import E6.InterfaceC0331d;
import E6.v;
import E6.w;
import E6.y;
import E6.z;
import R8.i;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.m;
import p194x6.j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R&\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginImpl;", "", "PluginConfigT", "Lio/ktor/client/plugins/api/ClientPlugin;", "", "name", "Lkotlin/Function0;", "createConfiguration", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "Lh6/A;", TtmlNode.TAG_BODY, "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lx6/j;)V", "block", "Lio/ktor/client/plugins/api/ClientPluginInstance;", "prepare", "(Lx6/j;)Lio/ktor/client/plugins/api/ClientPluginInstance;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/api/ClientPluginInstance;Lio/ktor/client/HttpClient;)V", "Lkotlin/jvm/functions/Function0;", "Lx6/j;", "Lio/ktor/util/AttributeKey;", SubscriberAttributeKt.JSON_NAME_KEY, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class ClientPluginImpl<PluginConfigT> implements ClientPlugin<PluginConfigT> {
    private final j body;
    private final Function0 createConfiguration;
    private final AttributeKey<ClientPluginInstance<PluginConfigT>> key;

    public ClientPluginImpl(String name, Function0 createConfiguration, j body) {
        v vVarB;
        m.e(name, "name");
        m.e(createConfiguration, "createConfiguration");
        m.e(body, "body");
        this.createConfiguration = createConfiguration;
        this.body = body;
        C c9 = B.f24540a;
        InterfaceC0331d interfaceC0331dB = c9.b(ClientPluginInstance.class);
        try {
            y yVar = y.f3222c;
            InterfaceC0331d interfaceC0331dB2 = c9.b(ClientPluginImpl.class);
            z zVar = z.f3225h;
            w wVarM = c9.m(interfaceC0331dB2);
            c9.k(wVarM, Collections.singletonList(B.a(Object.class)));
            vVarB = B.b(ClientPluginInstance.class, i.v(c9.l(wVarM, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
            vVarB = null;
        }
        this.key = new AttributeKey<>(name, new TypeInfo(interfaceC0331dB, vVarB));
    }

    @Override
    public AttributeKey<ClientPluginInstance<PluginConfigT>> getKey() {
        return this.key;
    }

    @Override
    public void install(ClientPluginInstance<PluginConfigT> plugin, HttpClient scope) {
        m.e(plugin, "plugin");
        m.e(scope, "scope");
        plugin.install(scope);
    }

    @Override
    public ClientPluginInstance<PluginConfigT> prepare(j block) {
        m.e(block, "block");
        Object objInvoke = this.createConfiguration.invoke();
        block.invoke(objInvoke);
        return new ClientPluginInstance<>(getKey(), objInvoke, this.body);
    }
}
