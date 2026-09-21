package io.ktor.websocket;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.b;
import io.ktor.http.d;
import io.sentry.protocol.OperatingSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p070h6.A;
import p078i6.q;
import p194x6.j;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\r\u001a\u00020\u0006\"\b\b\u0000\u0010\t*\u00020\u00012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u0014j\u0002`\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/ktor/websocket/WebSocketExtensionsConfig;", "", "<init>", "()V", "Lio/ktor/websocket/WebSocketExtensionFactory;", "extensionFactory", "Lh6/A;", "checkConflicts", "(Lio/ktor/websocket/WebSocketExtensionFactory;)V", "ConfigType", "extension", "Lkotlin/Function1;", "config", "install", "(Lio/ktor/websocket/WebSocketExtensionFactory;Lx6/j;)V", "", "Lio/ktor/websocket/WebSocketExtension;", OperatingSystem.JsonKeys.BUILD, "()Ljava/util/List;", "", "Lkotlin/Function0;", "Lio/ktor/websocket/ExtensionInstaller;", "installers", "Ljava/util/List;", "", "", "rcv", "[Ljava/lang/Boolean;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WebSocketExtensionsConfig {
    private final List<Function0> installers = new ArrayList();
    private final Boolean[] rcv;

    public WebSocketExtensionsConfig() {
        Boolean bool = Boolean.FALSE;
        this.rcv = new Boolean[]{bool, bool, bool};
    }

    private final void checkConflicts(WebSocketExtensionFactory<?, ?> extensionFactory) {
        boolean z6 = true;
        if ((!extensionFactory.getRsv1() || !this.rcv[1].booleanValue()) && ((!extensionFactory.getRsv2() || !this.rcv[2].booleanValue()) && (!extensionFactory.getRsv3() || !this.rcv[3].booleanValue()))) {
            z6 = false;
        }
        if (z6) {
            throw new IllegalStateException("Failed to install extension. Please check configured extensions for conflicts.");
        }
    }

    public static void install$default(WebSocketExtensionsConfig webSocketExtensionsConfig, WebSocketExtensionFactory webSocketExtensionFactory, j jVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            jVar = new b(28);
        }
        webSocketExtensionsConfig.install(webSocketExtensionFactory, jVar);
    }

    public static final A install$lambda$0(Object obj) {
        m.e(obj, "<this>");
        return A.f22523a;
    }

    public final List<WebSocketExtension<?>> build() {
        List<Function0> list = this.installers;
        ArrayList arrayList = new ArrayList(q.I0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((WebSocketExtension) ((Function0) it.next()).invoke());
        }
        return arrayList;
    }

    public final <ConfigType> void install(WebSocketExtensionFactory<ConfigType, ?> extension, j config) {
        m.e(extension, "extension");
        m.e(config, "config");
        checkConflicts(extension);
        this.installers.add(new d(extension, config, 1));
    }
}
