package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0012J.\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0018J2\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/ktor/network/sockets/TcpSocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "Lio/ktor/network/selector/SelectorManager;", "selector", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "<init>", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;)V", "", "hostname", "", "port", "Lkotlin/Function1;", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "Lh6/A;", "configure", "Lio/ktor/network/sockets/Socket;", "connect", "(Ljava/lang/String;ILx6/j;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "Lio/ktor/network/sockets/ServerSocket;", "bind", "Lio/ktor/network/sockets/SocketAddress;", "remoteAddress", "(Lio/ktor/network/sockets/SocketAddress;Lx6/j;Ll6/c;)Ljava/lang/Object;", "localAddress", "Lio/ktor/network/selector/SelectorManager;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "getOptions", "()Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "setOptions", "(Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;)V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class TcpSocketBuilder implements io.ktor.network.sockets.Configurable<io.ktor.network.sockets.TcpSocketBuilder, io.ktor.network.sockets.SocketOptions.PeerSocketOptions> {
    private io.ktor.network.sockets.SocketOptions.PeerSocketOptions options;
    private final io.ktor.network.selector.SelectorManager selector;

    public TcpSocketBuilder(io.ktor.network.selector.SelectorManager selector, io.ktor.network.sockets.SocketOptions.PeerSocketOptions options) {
        kotlin.jvm.internal.m.e(selector, "selector");
        kotlin.jvm.internal.m.e(options, "options");
        this.selector = selector;
        this.options = options;
    }

    public static /* synthetic */ java.lang.Object bind$default(io.ktor.network.sockets.TcpSocketBuilder tcpSocketBuilder, java.lang.String str, int i3, p194x6.j jVar, p100l6.c cVar, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            str = "0.0.0.0";
        }
        if ((i9 & 2) != 0) {
            i3 = 0;
        }
        if ((i9 & 4) != 0) {
            jVar = new io.ktor.http.b(14);
        }
        return tcpSocketBuilder.bind(str, i3, jVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A bind$lambda$1(io.ktor.network.sockets.SocketOptions.AcceptorOptions acceptorOptions) {
        kotlin.jvm.internal.m.e(acceptorOptions, "<this>");
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A bind$lambda$3(io.ktor.network.sockets.SocketOptions.AcceptorOptions acceptorOptions) {
        kotlin.jvm.internal.m.e(acceptorOptions, "<this>");
        return p070h6.A.f22523a;
    }

    public static /* synthetic */ java.lang.Object connect$default(io.ktor.network.sockets.TcpSocketBuilder tcpSocketBuilder, java.lang.String str, int i3, p194x6.j jVar, p100l6.c cVar, int i9, java.lang.Object obj) {
        if ((i9 & 4) != 0) {
            jVar = new io.ktor.http.b(11);
        }
        return tcpSocketBuilder.connect(str, i3, jVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A connect$lambda$0(io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        kotlin.jvm.internal.m.e(tCPClientSocketOptions, "<this>");
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A connect$lambda$2(io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        kotlin.jvm.internal.m.e(tCPClientSocketOptions, "<this>");
        return p070h6.A.f22523a;
    }

    public final java.lang.Object bind(java.lang.String str, int i3, p194x6.j jVar, p100l6.c cVar) {
        return bind(new io.ktor.network.sockets.InetSocketAddress(str, i3), jVar, cVar);
    }

    public final java.lang.Object connect(java.lang.String str, int i3, p194x6.j jVar, p100l6.c cVar) {
        return connect(new io.ktor.network.sockets.InetSocketAddress(str, i3), jVar, cVar);
    }

    public final java.lang.Object bind(io.ktor.network.sockets.SocketAddress socketAddress, p194x6.j jVar, p100l6.c cVar) {
        io.ktor.network.selector.SelectorManager selectorManager = this.selector;
        io.ktor.network.sockets.SocketOptions.AcceptorOptions acceptorOptionsTcpAccept$ktor_network = getOptions().tcpAccept$ktor_network();
        jVar.invoke(acceptorOptionsTcpAccept$ktor_network);
        return io.ktor.network.sockets.ConnectUtilsJvmKt.tcpBind(selectorManager, socketAddress, acceptorOptionsTcpAccept$ktor_network, cVar);
    }

    @Override // io.ktor.network.sockets.Configurable
    public io.ktor.network.sockets.TcpSocketBuilder configure(p194x6.j jVar) {
        return (io.ktor.network.sockets.TcpSocketBuilder) io.ktor.network.sockets.Configurable.DefaultImpls.configure(this, jVar);
    }

    public final java.lang.Object connect(io.ktor.network.sockets.SocketAddress socketAddress, p194x6.j jVar, p100l6.c cVar) {
        io.ktor.network.selector.SelectorManager selectorManager = this.selector;
        io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptionsTcpConnect$ktor_network = getOptions().tcpConnect$ktor_network();
        jVar.invoke(tCPClientSocketOptionsTcpConnect$ktor_network);
        return io.ktor.network.sockets.ConnectUtilsJvmKt.tcpConnect(selectorManager, socketAddress, tCPClientSocketOptionsTcpConnect$ktor_network, cVar);
    }

    @Override // io.ktor.network.sockets.Configurable
    public io.ktor.network.sockets.SocketOptions.PeerSocketOptions getOptions() {
        return this.options;
    }

    @Override // io.ktor.network.sockets.Configurable
    public void setOptions(io.ktor.network.sockets.SocketOptions.PeerSocketOptions peerSocketOptions) {
        kotlin.jvm.internal.m.e(peerSocketOptions, "<set-?>");
        this.options = peerSocketOptions;
    }

    public static /* synthetic */ java.lang.Object connect$default(io.ktor.network.sockets.TcpSocketBuilder tcpSocketBuilder, io.ktor.network.sockets.SocketAddress socketAddress, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            jVar = new io.ktor.http.b(13);
        }
        return tcpSocketBuilder.connect(socketAddress, jVar, cVar);
    }

    public static /* synthetic */ java.lang.Object bind$default(io.ktor.network.sockets.TcpSocketBuilder tcpSocketBuilder, io.ktor.network.sockets.SocketAddress socketAddress, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            socketAddress = null;
        }
        if ((i3 & 2) != 0) {
            jVar = new io.ktor.http.b(12);
        }
        return tcpSocketBuilder.bind(socketAddress, jVar, cVar);
    }
}
