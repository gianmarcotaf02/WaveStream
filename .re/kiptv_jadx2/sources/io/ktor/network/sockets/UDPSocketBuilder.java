package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.b;
import io.ktor.network.selector.SelectorManager;
import io.sentry.rrweb.RRWebOptionsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p100l6.c;
import p194x6.j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u0014J:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/ktor/network/sockets/UDPSocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "Lio/ktor/network/selector/SelectorManager;", "selector", RRWebOptionsEvent.EVENT_TAG, "<init>", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;)V", "Lio/ktor/network/sockets/SocketAddress;", "localAddress", "Lkotlin/Function1;", "Lh6/A;", "configure", "Lio/ktor/network/sockets/BoundDatagramSocket;", "bind", "(Lio/ktor/network/sockets/SocketAddress;Lx6/j;Ll6/c;)Ljava/lang/Object;", "", "hostname", "", "port", "(Ljava/lang/String;ILx6/j;Ll6/c;)Ljava/lang/Object;", "remoteAddress", "Lio/ktor/network/sockets/ConnectedDatagramSocket;", "connect", "(Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketAddress;Lx6/j;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/network/selector/SelectorManager;", "Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "getOptions", "()Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "setOptions", "(Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;)V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UDPSocketBuilder implements Configurable<UDPSocketBuilder, SocketOptions.UDPSocketOptions> {
    private SocketOptions.UDPSocketOptions options;
    private final SelectorManager selector;

    public UDPSocketBuilder(SelectorManager selector, SocketOptions.UDPSocketOptions options) {
        m.e(selector, "selector");
        m.e(options, "options");
        this.selector = selector;
        this.options = options;
    }

    public static Object bind$default(UDPSocketBuilder uDPSocketBuilder, SocketAddress socketAddress, j jVar, c cVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            socketAddress = null;
        }
        if ((i3 & 2) != 0) {
            jVar = new b(16);
        }
        return uDPSocketBuilder.bind(socketAddress, jVar, cVar);
    }

    public static final A bind$lambda$0(SocketOptions.UDPSocketOptions uDPSocketOptions) {
        m.e(uDPSocketOptions, "<this>");
        return A.f22523a;
    }

    public static final A bind$lambda$1(SocketOptions.UDPSocketOptions uDPSocketOptions) {
        m.e(uDPSocketOptions, "<this>");
        return A.f22523a;
    }

    public static Object connect$default(UDPSocketBuilder uDPSocketBuilder, SocketAddress socketAddress, SocketAddress socketAddress2, j jVar, c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            socketAddress2 = null;
        }
        if ((i3 & 4) != 0) {
            jVar = new b(17);
        }
        return uDPSocketBuilder.connect(socketAddress, socketAddress2, jVar, cVar);
    }

    public static final A connect$lambda$2(SocketOptions.UDPSocketOptions uDPSocketOptions) {
        m.e(uDPSocketOptions, "<this>");
        return A.f22523a;
    }

    public final Object bind(SocketAddress socketAddress, j jVar, c cVar) {
        SelectorManager selectorManager = this.selector;
        SocketOptions.UDPSocketOptions uDPSocketOptionsUdp$ktor_network = getOptions().udp$ktor_network();
        jVar.invoke(uDPSocketOptionsUdp$ktor_network);
        return UDPSocketBuilderJvmKt.udpBind(selectorManager, socketAddress, uDPSocketOptionsUdp$ktor_network, cVar);
    }

    public final Object connect(SocketAddress socketAddress, SocketAddress socketAddress2, j jVar, c cVar) {
        SelectorManager selectorManager = this.selector;
        SocketOptions.UDPSocketOptions uDPSocketOptionsUdp$ktor_network = getOptions().udp$ktor_network();
        jVar.invoke(uDPSocketOptionsUdp$ktor_network);
        return UDPSocketBuilderJvmKt.udpConnect(selectorManager, socketAddress, socketAddress2, uDPSocketOptionsUdp$ktor_network, cVar);
    }

    public final Object bind(String str, int i3, j jVar, c cVar) {
        return bind(new InetSocketAddress(str, i3), jVar, cVar);
    }

    @Override
    public UDPSocketBuilder configure(j jVar) {
        return (UDPSocketBuilder) Configurable.DefaultImpls.configure(this, jVar);
    }

    @Override
    public SocketOptions.UDPSocketOptions getOptions() {
        return this.options;
    }

    @Override
    public void setOptions(SocketOptions.UDPSocketOptions uDPSocketOptions) {
        m.e(uDPSocketOptions, "<set-?>");
        this.options = uDPSocketOptions;
    }

    public static Object bind$default(UDPSocketBuilder uDPSocketBuilder, String str, int i3, j jVar, c cVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = "0.0.0.0";
        }
        if ((i9 & 2) != 0) {
            i3 = 0;
        }
        if ((i9 & 4) != 0) {
            jVar = new b(15);
        }
        return uDPSocketBuilder.bind(str, i3, jVar, cVar);
    }
}
