package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23380h;

    public /* synthetic */ b(int i3) {
        this.f23380h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23380h) {
            case 0:
                return io.ktor.http.HttpUrlEncodedKt.formUrlEncodeTo$lambda$5((p070h6.k) obj);
            case 1:
                return java.lang.Boolean.valueOf(io.ktor.http.RangesSpecifier.isValid$lambda$1((java.lang.String) obj));
            case 2:
                return io.ktor.http.URLBuilderKt.set$lambda$5((io.ktor.http.URLBuilder) obj);
            case 3:
                return io.ktor.http.URLUtilsKt.appendUrlFullPath$lambda$6((p070h6.k) obj);
            case 4:
                return io.ktor.http.cio.CIOHeaders.getAll$lambda$2((java.lang.CharSequence) obj);
            case 5:
                return java.lang.Integer.valueOf(io.ktor.http.cio.ConnectionOptions.knownTypes$lambda$1((p070h6.k) obj));
            case 6:
                return java.lang.Integer.valueOf(io.ktor.http.cio.HttpHeadersMap.getAll$lambda$1(((java.lang.Integer) obj).intValue()));
            case 7:
                return java.lang.Integer.valueOf(io.ktor.http.cio.internals.AsciiCharTree.Companion.build$lambda$0((java.lang.CharSequence) obj));
            case 8:
                return java.lang.Integer.valueOf(io.ktor.http.cio.internals.CharsKt.DefaultHttpMethods$lambda$0((io.ktor.http.HttpMethod) obj));
            case 9:
                return io.ktor.network.sockets.DatagramSendChannelKt.CLOSED$lambda$0((java.lang.Throwable) obj);
            case 10:
                return io.ktor.network.sockets.DatagramSendChannelKt.CLOSED_INVOKED$lambda$1((java.lang.Throwable) obj);
            case 11:
                return io.ktor.network.sockets.TcpSocketBuilder.connect$lambda$0((io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) obj);
            case 12:
                return io.ktor.network.sockets.TcpSocketBuilder.bind$lambda$3((io.ktor.network.sockets.SocketOptions.AcceptorOptions) obj);
            case 13:
                return io.ktor.network.sockets.TcpSocketBuilder.connect$lambda$2((io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) obj);
            case 14:
                return io.ktor.network.sockets.TcpSocketBuilder.bind$lambda$1((io.ktor.network.sockets.SocketOptions.AcceptorOptions) obj);
            case 15:
                return io.ktor.network.sockets.UDPSocketBuilder.bind$lambda$1((io.ktor.network.sockets.SocketOptions.UDPSocketOptions) obj);
            case 16:
                return io.ktor.network.sockets.UDPSocketBuilder.bind$lambda$0((io.ktor.network.sockets.SocketOptions.UDPSocketOptions) obj);
            case 17:
                return io.ktor.network.sockets.UDPSocketBuilder.connect$lambda$2((io.ktor.network.sockets.SocketOptions.UDPSocketOptions) obj);
            case 18:
                return io.ktor.serialization.Configuration.DefaultImpls.register$lambda$0((io.ktor.serialization.ContentConverter) obj);
            case 19:
                return io.ktor.serialization.kotlinx.json.JsonSupportKt.DefaultJson$lambda$0((p162s8.h) obj);
            case 20:
                return io.ktor.util.CaseInsensitiveMap._get_entries_$lambda$3((java.util.Map.Entry) obj);
            case 21:
                return io.ktor.util.CaseInsensitiveMap._get_entries_$lambda$4((java.util.Map.Entry) obj);
            case 22:
                return io.ktor.util.CaseInsensitiveMap._get_keys_$lambda$1((io.ktor.util.CaseInsensitiveString) obj);
            case 23:
                return io.ktor.util.CaseInsensitiveMap._get_keys_$lambda$2((java.lang.String) obj);
            case 24:
                return io.ktor.utils.io.LookAheadSuspendSession.request$lambda$0((p094k8.n) obj);
            case 25:
                return io.ktor.websocket.WebSocketDeflateExtension.Config.manualConfig$lambda$0((java.util.List) obj);
            case 26:
                return java.lang.Boolean.valueOf(io.ktor.websocket.WebSocketDeflateExtension.Config.compressCondition$lambda$1((io.ktor.websocket.Frame) obj));
            case 27:
                return io.ktor.websocket.WebSocketExtensionHeader.parseParameters$lambda$0((java.lang.String) obj);
            case 28:
                return io.ktor.websocket.WebSocketExtensionsConfig.install$lambda$0(obj);
            default:
                java.util.Map.Entry it = (java.util.Map.Entry) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return io.ktor.sse.ServerSentEventKt.SPACE + it.getKey() + "=" + it.getValue();
        }
    }
}
