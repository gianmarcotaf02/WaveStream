package io.ktor.client.plugins.api;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p026c6.a;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"", "PluginConfigT", "", "name", "Lkotlin/Function0;", "createConfiguration", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "Lh6/A;", TtmlNode.TAG_BODY, "Lio/ktor/client/plugins/api/ClientPlugin;", "createClientPlugin", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lx6/j;)Lio/ktor/client/plugins/api/ClientPlugin;", "(Ljava/lang/String;Lx6/j;)Lio/ktor/client/plugins/api/ClientPlugin;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CreatePluginUtilsKt {
    public static final <PluginConfigT> ClientPlugin<PluginConfigT> createClientPlugin(String name, Function0 createConfiguration, j body) {
        m.e(name, "name");
        m.e(createConfiguration, "createConfiguration");
        m.e(body, "body");
        return new ClientPluginImpl(name, createConfiguration, body);
    }

    public static final ClientPlugin<A> createClientPlugin(String name, j body) {
        m.e(name, "name");
        m.e(body, "body");
        return createClientPlugin(name, new a(14), body);
    }
}
