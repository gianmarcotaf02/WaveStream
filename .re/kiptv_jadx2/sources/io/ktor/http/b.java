package io.ktor.http;

import io.ktor.http.cio.CIOHeaders;
import io.ktor.http.cio.ConnectionOptions;
import io.ktor.http.cio.HttpHeadersMap;
import io.ktor.http.cio.internals.AsciiCharTree;
import io.ktor.http.cio.internals.CharsKt;
import io.ktor.network.sockets.DatagramSendChannelKt;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.network.sockets.TcpSocketBuilder;
import io.ktor.network.sockets.UDPSocketBuilder;
import io.ktor.serialization.Configuration;
import io.ktor.serialization.ContentConverter;
import io.ktor.serialization.kotlinx.json.JsonSupportKt;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.util.CaseInsensitiveMap;
import io.ktor.util.CaseInsensitiveString;
import io.ktor.utils.io.LookAheadSuspendSession;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketDeflateExtension;
import io.ktor.websocket.WebSocketExtensionHeader;
import io.ktor.websocket.WebSocketExtensionsConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import p070h6.k;
import p094k8.n;
import p162s8.h;
import p194x6.j;

public final class b implements j {

    public final int f23380h;

    public b(int i3) {
        this.f23380h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23380h) {
            case 0:
                return HttpUrlEncodedKt.formUrlEncodeTo$lambda$5((k) obj);
            case 1:
                return Boolean.valueOf(RangesSpecifier.isValid$lambda$1((String) obj));
            case 2:
                return URLBuilderKt.set$lambda$5((URLBuilder) obj);
            case 3:
                return URLUtilsKt.appendUrlFullPath$lambda$6((k) obj);
            case 4:
                return CIOHeaders.getAll$lambda$2((CharSequence) obj);
            case 5:
                return Integer.valueOf(ConnectionOptions.knownTypes$lambda$1((k) obj));
            case 6:
                return Integer.valueOf(HttpHeadersMap.getAll$lambda$1(((Integer) obj).intValue()));
            case 7:
                return Integer.valueOf(AsciiCharTree.Companion.build$lambda$0((CharSequence) obj));
            case 8:
                return Integer.valueOf(CharsKt.DefaultHttpMethods$lambda$0((HttpMethod) obj));
            case 9:
                return DatagramSendChannelKt.CLOSED$lambda$0((Throwable) obj);
            case 10:
                return DatagramSendChannelKt.CLOSED_INVOKED$lambda$1((Throwable) obj);
            case 11:
                return TcpSocketBuilder.connect$lambda$0((SocketOptions.TCPClientSocketOptions) obj);
            case 12:
                return TcpSocketBuilder.bind$lambda$3((SocketOptions.AcceptorOptions) obj);
            case 13:
                return TcpSocketBuilder.connect$lambda$2((SocketOptions.TCPClientSocketOptions) obj);
            case 14:
                return TcpSocketBuilder.bind$lambda$1((SocketOptions.AcceptorOptions) obj);
            case 15:
                return UDPSocketBuilder.bind$lambda$1((SocketOptions.UDPSocketOptions) obj);
            case 16:
                return UDPSocketBuilder.bind$lambda$0((SocketOptions.UDPSocketOptions) obj);
            case 17:
                return UDPSocketBuilder.connect$lambda$2((SocketOptions.UDPSocketOptions) obj);
            case 18:
                return Configuration.DefaultImpls.register$lambda$0((ContentConverter) obj);
            case 19:
                return JsonSupportKt.DefaultJson$lambda$0((h) obj);
            case 20:
                return CaseInsensitiveMap._get_entries_$lambda$3((Map.Entry) obj);
            case 21:
                return CaseInsensitiveMap._get_entries_$lambda$4((Map.Entry) obj);
            case 22:
                return CaseInsensitiveMap._get_keys_$lambda$1((CaseInsensitiveString) obj);
            case 23:
                return CaseInsensitiveMap._get_keys_$lambda$2((String) obj);
            case 24:
                return LookAheadSuspendSession.request$lambda$0((n) obj);
            case 25:
                return WebSocketDeflateExtension.Config.manualConfig$lambda$0((List) obj);
            case 26:
                return Boolean.valueOf(WebSocketDeflateExtension.Config.compressCondition$lambda$1((Frame) obj));
            case 27:
                return WebSocketExtensionHeader.parseParameters$lambda$0((String) obj);
            case 28:
                return WebSocketExtensionsConfig.install$lambda$0(obj);
            default:
                Map.Entry it = (Map.Entry) obj;
                m.e(it, "it");
                return ServerSentEventKt.SPACE + it.getKey() + "=" + it.getValue();
        }
    }
}
