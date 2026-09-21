package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lio/ktor/network/sockets/SocketImpl;", "Ljava/nio/channels/SocketChannel;", "S", "Lio/ktor/network/sockets/NIOSocketImpl;", "Lio/ktor/network/sockets/Socket;", "channel", "Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "<init>", "(Ljava/nio/channels/SocketChannel;Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)V", "", io.sentry.protocol.SentryThread.JsonKeys.STATE, "Lh6/A;", "wantConnect", "(Z)V", "inetSelfConnect", "()Z", "Ljava/net/SocketAddress;", "target", "connect$ktor_network", "(Ljava/net/SocketAddress;Ll6/c;)Ljava/lang/Object;", "connect", "Ljava/nio/channels/SocketChannel;", "getChannel", "()Ljava/nio/channels/SocketChannel;", "Lio/ktor/network/sockets/SocketAddress;", "getLocalAddress", "()Lio/ktor/network/sockets/SocketAddress;", "localAddress", "getRemoteAddress", "remoteAddress", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SocketImpl<S extends java.nio.channels.SocketChannel> extends io.ktor.network.sockets.NIOSocketImpl<S> implements io.ktor.network.sockets.Socket {
    private final S channel;

    public /* synthetic */ SocketImpl(java.nio.channels.SocketChannel socketChannel, io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(socketChannel, selectorManager, (i3 & 4) != 0 ? null : tCPClientSocketOptions);
    }

    private final boolean inetSelfConnect() {
        java.lang.String hostAddress;
        java.net.InetAddress address;
        java.net.InetAddress address2;
        java.lang.String hostAddress2;
        java.net.InetAddress address3;
        java.net.SocketAddress localAddress = io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getLocalAddress() : getChannel().socket().getLocalSocketAddress();
        java.net.SocketAddress remoteAddress = io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getRemoteAddress() : getChannel().socket().getRemoteSocketAddress();
        if (localAddress == null || remoteAddress == null) {
            throw new java.lang.IllegalStateException("localAddress and remoteAddress should not be null.");
        }
        java.net.InetSocketAddress inetSocketAddress = localAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) localAddress : null;
        java.net.InetSocketAddress inetSocketAddress2 = remoteAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) remoteAddress : null;
        if (inetSocketAddress == null && inetSocketAddress2 == null) {
            return false;
        }
        java.lang.String str = "";
        if (inetSocketAddress == null || (address3 = inetSocketAddress.getAddress()) == null || (hostAddress = address3.getHostAddress()) == null) {
            hostAddress = "";
        }
        if (inetSocketAddress2 != null && (address2 = inetSocketAddress2.getAddress()) != null && (hostAddress2 = address2.getHostAddress()) != null) {
            str = hostAddress2;
        }
        return kotlin.jvm.internal.m.a(inetSocketAddress != null ? java.lang.Integer.valueOf(inetSocketAddress.getPort()) : null, inetSocketAddress2 != null ? java.lang.Integer.valueOf(inetSocketAddress2.getPort()) : null) && (((inetSocketAddress2 == null || (address = inetSocketAddress2.getAddress()) == null) ? false : address.isAnyLocalAddress()) || hostAddress.equals(str));
    }

    private final void wantConnect(boolean state) {
        interestOp(io.ktor.network.selector.SelectInterest.CONNECT, state);
    }

    public static /* synthetic */ void wantConnect$default(io.ktor.network.sockets.SocketImpl socketImpl, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        socketImpl.wantConnect(z6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object connect$ktor_network(java.net.SocketAddress socketAddress, p100l6.c cVar) throws java.io.IOException {
        io.ktor.network.sockets.SocketImpl$connect$1 socketImpl$connect$1;
        io.ktor.network.sockets.SocketImpl<S> socketImpl;
        if (cVar instanceof io.ktor.network.sockets.SocketImpl$connect$1) {
            socketImpl$connect$1 = (io.ktor.network.sockets.SocketImpl$connect$1) cVar;
            int i3 = socketImpl$connect$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                socketImpl$connect$1.label = i3 - Integer.MIN_VALUE;
            } else {
                socketImpl$connect$1 = new io.ktor.network.sockets.SocketImpl$connect$1(this, cVar);
            }
        } else {
            socketImpl$connect$1 = new io.ktor.network.sockets.SocketImpl$connect$1(this, cVar);
        }
        java.lang.Object obj = socketImpl$connect$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = socketImpl$connect$1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (getChannel().connect(socketAddress)) {
                return this;
            }
            wantConnect(true);
            io.ktor.network.selector.SelectorManager selector = getSelector();
            io.ktor.network.selector.SelectInterest selectInterest = io.ktor.network.selector.SelectInterest.CONNECT;
            socketImpl$connect$1.L$0 = this;
            socketImpl$connect$1.label = 1;
            if (selector.select(this, selectInterest, socketImpl$connect$1) != aVar) {
                socketImpl = this;
            }
            return aVar;
        }
        if (i9 != 1 && i9 != 2) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        socketImpl = (io.ktor.network.sockets.SocketImpl) socketImpl$connect$1.L$0;
        com.google.common.util.concurrent.P.u0(obj);
        while (true) {
            if (!socketImpl.getChannel().finishConnect()) {
                socketImpl.wantConnect(true);
                io.ktor.network.selector.SelectorManager selector2 = socketImpl.getSelector();
                io.ktor.network.selector.SelectInterest selectInterest2 = io.ktor.network.selector.SelectInterest.CONNECT;
                socketImpl$connect$1.L$0 = socketImpl;
                socketImpl$connect$1.label = 2;
                if (selector2.select(socketImpl, selectInterest2, socketImpl$connect$1) == aVar) {
                    break;
                }
            } else {
                if (!socketImpl.inetSelfConnect()) {
                    socketImpl.wantConnect(false);
                    return socketImpl;
                }
                if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                    socketImpl.getChannel().close();
                } else {
                    socketImpl.getChannel().socket().close();
                }
            }
        }
        return aVar;
    }

    @Override // io.ktor.network.sockets.ABoundSocket
    public io.ktor.network.sockets.SocketAddress getLocalAddress() {
        io.ktor.network.sockets.SocketAddress socketAddress;
        java.net.SocketAddress localAddress = io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getLocalAddress() : getChannel().socket().getLocalSocketAddress();
        if (localAddress == null || (socketAddress = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toSocketAddress(localAddress)) == null) {
            throw new java.lang.IllegalStateException("Channel is not yet bound");
        }
        return socketAddress;
    }

    @Override // io.ktor.network.sockets.AConnectedSocket
    public io.ktor.network.sockets.SocketAddress getRemoteAddress() {
        io.ktor.network.sockets.SocketAddress socketAddress;
        java.net.SocketAddress remoteAddress = io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getRemoteAddress() : getChannel().socket().getRemoteSocketAddress();
        if (remoteAddress == null || (socketAddress = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toSocketAddress(remoteAddress)) == null) {
            throw new java.lang.IllegalStateException("Channel is not yet connected");
        }
        return socketAddress;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketImpl(S channel, io.ktor.network.selector.SelectorManager selector, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        super(channel, selector, null, tCPClientSocketOptions);
        kotlin.jvm.internal.m.e(channel, "channel");
        kotlin.jvm.internal.m.e(selector, "selector");
        this.channel = channel;
        if (getChannel().isBlocking()) {
            throw new java.lang.IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
    }

    @Override // io.ktor.network.sockets.NIOSocketImpl, io.ktor.network.selector.Selectable
    public S getChannel() {
        return this.channel;
    }
}
