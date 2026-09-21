package io.ktor.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\r\u001a\u00020\u0006\"\b\b\u0000\u0010\t*\u00020\u00012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u0014j\u0002`\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/ktor/websocket/WebSocketExtensionsConfig;", "", "<init>", "()V", "Lio/ktor/websocket/WebSocketExtensionFactory;", "extensionFactory", "Lh6/A;", "checkConflicts", "(Lio/ktor/websocket/WebSocketExtensionFactory;)V", "ConfigType", "extension", "Lkotlin/Function1;", "config", "install", "(Lio/ktor/websocket/WebSocketExtensionFactory;Lx6/j;)V", "", "Lio/ktor/websocket/WebSocketExtension;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "()Ljava/util/List;", "", "Lkotlin/Function0;", "Lio/ktor/websocket/ExtensionInstaller;", "installers", "Ljava/util/List;", "", "", "rcv", "[Ljava/lang/Boolean;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WebSocketExtensionsConfig {
    private final java.util.List<kotlin.jvm.functions.Function0> installers = new java.util.ArrayList();
    private final java.lang.Boolean[] rcv;

    public WebSocketExtensionsConfig() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.rcv = new java.lang.Boolean[]{bool, bool, bool};
    }

    private final void checkConflicts(io.ktor.websocket.WebSocketExtensionFactory<?, ?> extensionFactory) {
        boolean z6 = true;
        if ((!extensionFactory.getRsv1() || !this.rcv[1].booleanValue()) && ((!extensionFactory.getRsv2() || !this.rcv[2].booleanValue()) && (!extensionFactory.getRsv3() || !this.rcv[3].booleanValue()))) {
            z6 = false;
        }
        if (z6) {
            throw new java.lang.IllegalStateException("Failed to install extension. Please check configured extensions for conflicts.");
        }
    }

    public static /* synthetic */ void install$default(io.ktor.websocket.WebSocketExtensionsConfig webSocketExtensionsConfig, io.ktor.websocket.WebSocketExtensionFactory webSocketExtensionFactory, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            jVar = new io.ktor.http.b(28);
        }
        webSocketExtensionsConfig.install(webSocketExtensionFactory, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A install$lambda$0(java.lang.Object obj) {
        kotlin.jvm.internal.m.e(obj, "<this>");
        return p070h6.A.f22523a;
    }

    public final java.util.List<io.ktor.websocket.WebSocketExtension<?>> build() {
        java.util.List<kotlin.jvm.functions.Function0> list = this.installers;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((io.ktor.websocket.WebSocketExtension) ((kotlin.jvm.functions.Function0) it.next()).invoke());
        }
        return arrayList;
    }

    public final <ConfigType> void install(io.ktor.websocket.WebSocketExtensionFactory<ConfigType, ?> extension, p194x6.j config) {
        kotlin.jvm.internal.m.e(extension, "extension");
        kotlin.jvm.internal.m.e(config, "config");
        checkConflicts(extension);
        this.installers.add(new io.ktor.http.d(extension, config, 1));
    }
}
