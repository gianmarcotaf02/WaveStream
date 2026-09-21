package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u0014J:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/ktor/network/sockets/UDPSocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "Lio/ktor/network/selector/SelectorManager;", "selector", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "<init>", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;)V", "Lio/ktor/network/sockets/SocketAddress;", "localAddress", "Lkotlin/Function1;", "Lh6/A;", "configure", "Lio/ktor/network/sockets/BoundDatagramSocket;", "bind", "(Lio/ktor/network/sockets/SocketAddress;Lx6/j;Ll6/c;)Ljava/lang/Object;", "", "hostname", "", "port", "(Ljava/lang/String;ILx6/j;Ll6/c;)Ljava/lang/Object;", "remoteAddress", "Lio/ktor/network/sockets/ConnectedDatagramSocket;", "connect", "(Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketAddress;Lx6/j;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/network/selector/SelectorManager;", "Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "getOptions", "()Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "setOptions", "(Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;)V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UDPSocketBuilder implements io.ktor.network.sockets.Configurable<io.ktor.network.sockets.UDPSocketBuilder, io.ktor.network.sockets.SocketOptions.UDPSocketOptions> {
    private io.ktor.network.sockets.SocketOptions.UDPSocketOptions options;
    private final io.ktor.network.selector.SelectorManager selector;

    public UDPSocketBuilder(io.ktor.network.selector.SelectorManager selector, io.ktor.network.sockets.SocketOptions.UDPSocketOptions options) {
        kotlin.jvm.internal.m.e(selector, "selector");
        kotlin.jvm.internal.m.e(options, "options");
        this.selector = selector;
        this.options = options;
    }

    public static /* synthetic */ java.lang.Object bind$default(io.ktor.network.sockets.UDPSocketBuilder uDPSocketBuilder, io.ktor.network.sockets.SocketAddress socketAddress, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            socketAddress = null;
        }
        if ((i3 & 2) != 0) {
            jVar = new io.ktor.http.b(16);
        }
        return uDPSocketBuilder.bind(socketAddress, jVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A bind$lambda$0(io.ktor.network.sockets.SocketOptions.UDPSocketOptions uDPSocketOptions) {
        kotlin.jvm.internal.m.e(uDPSocketOptions, "<this>");
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A bind$lambda$1(io.ktor.network.sockets.SocketOptions.UDPSocketOptions uDPSocketOptions) {
        kotlin.jvm.internal.m.e(uDPSocketOptions, "<this>");
        return p070h6.A.f22523a;
    }

    public static /* synthetic */ java.lang.Object connect$default(io.ktor.network.sockets.UDPSocketBuilder uDPSocketBuilder, io.ktor.network.sockets.SocketAddress socketAddress, io.ktor.network.sockets.SocketAddress socketAddress2, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            socketAddress2 = null;
        }
        if ((i3 & 4) != 0) {
            jVar = new io.ktor.http.b(17);
        }
        return uDPSocketBuilder.connect(socketAddress, socketAddress2, jVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A connect$lambda$2(io.ktor.network.sockets.SocketOptions.UDPSocketOptions uDPSocketOptions) {
        kotlin.jvm.internal.m.e(uDPSocketOptions, "<this>");
        return p070h6.A.f22523a;
    }

    public final java.lang.Object bind(io.ktor.network.sockets.SocketAddress socketAddress, p194x6.j jVar, p100l6.c cVar) {
        io.ktor.network.selector.SelectorManager selectorManager = this.selector;
        io.ktor.network.sockets.SocketOptions.UDPSocketOptions uDPSocketOptionsUdp$ktor_network = getOptions().udp$ktor_network();
        jVar.invoke(uDPSocketOptionsUdp$ktor_network);
        return io.ktor.network.sockets.UDPSocketBuilderJvmKt.udpBind(selectorManager, socketAddress, uDPSocketOptionsUdp$ktor_network, cVar);
    }

    public final java.lang.Object connect(io.ktor.network.sockets.SocketAddress socketAddress, io.ktor.network.sockets.SocketAddress socketAddress2, p194x6.j jVar, p100l6.c cVar) {
        io.ktor.network.selector.SelectorManager selectorManager = this.selector;
        io.ktor.network.sockets.SocketOptions.UDPSocketOptions uDPSocketOptionsUdp$ktor_network = getOptions().udp$ktor_network();
        jVar.invoke(uDPSocketOptionsUdp$ktor_network);
        return io.ktor.network.sockets.UDPSocketBuilderJvmKt.udpConnect(selectorManager, socketAddress, socketAddress2, uDPSocketOptionsUdp$ktor_network, cVar);
    }

    public final java.lang.Object bind(java.lang.String str, int i3, p194x6.j jVar, p100l6.c cVar) {
        return bind(new io.ktor.network.sockets.InetSocketAddress(str, i3), jVar, cVar);
    }

    @Override // io.ktor.network.sockets.Configurable
    public io.ktor.network.sockets.UDPSocketBuilder configure(p194x6.j jVar) {
        return (io.ktor.network.sockets.UDPSocketBuilder) io.ktor.network.sockets.Configurable.DefaultImpls.configure(this, jVar);
    }

    @Override // io.ktor.network.sockets.Configurable
    public io.ktor.network.sockets.SocketOptions.UDPSocketOptions getOptions() {
        return this.options;
    }

    @Override // io.ktor.network.sockets.Configurable
    public void setOptions(io.ktor.network.sockets.SocketOptions.UDPSocketOptions uDPSocketOptions) {
        kotlin.jvm.internal.m.e(uDPSocketOptions, "<set-?>");
        this.options = uDPSocketOptions;
    }

    public static /* synthetic */ java.lang.Object bind$default(io.ktor.network.sockets.UDPSocketBuilder uDPSocketBuilder, java.lang.String str, int i3, p194x6.j jVar, p100l6.c cVar, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            str = "0.0.0.0";
        }
        if ((i9 & 2) != 0) {
            i3 = 0;
        }
        if ((i9 & 4) != 0) {
            jVar = new io.ktor.http.b(15);
        }
        return uDPSocketBuilder.bind(str, i3, jVar, cVar);
    }
}
