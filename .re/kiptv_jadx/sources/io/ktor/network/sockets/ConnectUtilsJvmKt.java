package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00140\u0014*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketAddress;", "remoteAddress", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "Lio/ktor/network/sockets/Socket;", "tcpConnect", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;Ll6/c;)Ljava/lang/Object;", "localAddress", "Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "Lio/ktor/network/sockets/ServerSocket;", "tcpBind", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;Ll6/c;)Ljava/lang/Object;", "Ljava/nio/channels/spi/SelectorProvider;", io.sentry.SentryLockReason.JsonKeys.ADDRESS, "Ljava/nio/channels/SocketChannel;", "kotlin.jvm.PlatformType", "openSocketChannelFor", "(Ljava/nio/channels/spi/SelectorProvider;Lio/ktor/network/sockets/SocketAddress;)Ljava/nio/channels/SocketChannel;", "Ljava/nio/channels/ServerSocketChannel;", "openServerSocketChannelFor", "(Ljava/nio/channels/spi/SelectorProvider;Lio/ktor/network/sockets/SocketAddress;)Ljava/nio/channels/ServerSocketChannel;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConnectUtilsJvmKt {

    /* JADX INFO: renamed from: io.ktor.network.sockets.ConnectUtilsJvmKt$tcpConnect$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.network.sockets.ConnectUtilsJvmKt", f = "ConnectUtilsJvm.kt", l = {21}, m = "tcpConnect")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.network.sockets.ConnectUtilsJvmKt.tcpConnect(null, null, null, this);
        }
    }

    public static final java.nio.channels.ServerSocketChannel openServerSocketChannelFor(java.nio.channels.spi.SelectorProvider selectorProvider, io.ktor.network.sockets.SocketAddress socketAddress) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        kotlin.jvm.internal.m.e(selectorProvider, "<this>");
        if (socketAddress == null) {
            return selectorProvider.openServerSocketChannel();
        }
        if (socketAddress instanceof io.ktor.network.sockets.InetSocketAddress) {
            return selectorProvider.openServerSocketChannel();
        }
        if (!(socketAddress instanceof io.ktor.network.sockets.UnixSocketAddress)) {
            throw new I3.b();
        }
        java.lang.Object objInvoke = java.nio.channels.spi.SelectorProvider.class.getMethod("openServerSocketChannel", java.net.ProtocolFamily.class).invoke(selectorProvider, java.net.StandardProtocolFamily.valueOf("UNIX"));
        kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.nio.channels.ServerSocketChannel");
        return (java.nio.channels.ServerSocketChannel) objInvoke;
    }

    public static final java.nio.channels.SocketChannel openSocketChannelFor(java.nio.channels.spi.SelectorProvider selectorProvider, io.ktor.network.sockets.SocketAddress address) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        kotlin.jvm.internal.m.e(selectorProvider, "<this>");
        kotlin.jvm.internal.m.e(address, "address");
        if (address instanceof io.ktor.network.sockets.InetSocketAddress) {
            return selectorProvider.openSocketChannel();
        }
        if (!(address instanceof io.ktor.network.sockets.UnixSocketAddress)) {
            throw new I3.b();
        }
        java.lang.Object objInvoke = java.nio.channels.spi.SelectorProvider.class.getMethod("openSocketChannel", java.net.ProtocolFamily.class).invoke(selectorProvider, java.net.StandardProtocolFamily.valueOf("UNIX"));
        kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.nio.channels.SocketChannel");
        return (java.nio.channels.SocketChannel) objInvoke;
    }

    public static final java.lang.Object tcpBind(io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketAddress socketAddress, io.ktor.network.sockets.SocketOptions.AcceptorOptions acceptorOptions, p100l6.c cVar) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        java.nio.channels.ServerSocketChannel serverSocketChannelOpenServerSocketChannelFor = openServerSocketChannelFor(selectorManager.getProvider(), socketAddress);
        try {
            if (socketAddress instanceof io.ktor.network.sockets.InetSocketAddress) {
                kotlin.jvm.internal.m.b(serverSocketChannelOpenServerSocketChannelFor);
                io.ktor.network.sockets.JavaSocketOptionsKt.assignOptions(serverSocketChannelOpenServerSocketChannelFor, acceptorOptions);
            }
            kotlin.jvm.internal.m.b(serverSocketChannelOpenServerSocketChannelFor);
            io.ktor.network.sockets.JavaSocketOptionsKt.nonBlocking(serverSocketChannelOpenServerSocketChannelFor);
            io.ktor.network.sockets.ServerSocketImpl serverSocketImpl = new io.ktor.network.sockets.ServerSocketImpl(serverSocketChannelOpenServerSocketChannelFor, selectorManager);
            if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                serverSocketImpl.getChannel().bind(socketAddress != null ? io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null, acceptorOptions.getBacklogSize());
                return serverSocketImpl;
            }
            serverSocketImpl.getChannel().socket().bind(socketAddress != null ? io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null, acceptorOptions.getBacklogSize());
            return serverSocketImpl;
        } catch (java.lang.Throwable th) {
            serverSocketChannelOpenServerSocketChannelFor.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object tcpConnect(io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketAddress socketAddress, io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.network.sockets.ConnectUtilsJvmKt.AnonymousClass1 anonymousClass1;
        java.io.Closeable closeable;
        if (cVar instanceof io.ktor.network.sockets.ConnectUtilsJvmKt.AnonymousClass1) {
            anonymousClass1 = (io.ktor.network.sockets.ConnectUtilsJvmKt.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.network.sockets.ConnectUtilsJvmKt.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.network.sockets.ConnectUtilsJvmKt.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            java.nio.channels.SocketChannel socketChannelOpenSocketChannelFor = openSocketChannelFor(selectorManager.getProvider(), socketAddress);
            try {
                if (socketAddress instanceof io.ktor.network.sockets.InetSocketAddress) {
                    kotlin.jvm.internal.m.b(socketChannelOpenSocketChannelFor);
                    io.ktor.network.sockets.JavaSocketOptionsKt.assignOptions(socketChannelOpenSocketChannelFor, tCPClientSocketOptions);
                }
                kotlin.jvm.internal.m.b(socketChannelOpenSocketChannelFor);
                io.ktor.network.sockets.JavaSocketOptionsKt.nonBlocking(socketChannelOpenSocketChannelFor);
                io.ktor.network.sockets.SocketImpl socketImpl = new io.ktor.network.sockets.SocketImpl(socketChannelOpenSocketChannelFor, selectorManager, tCPClientSocketOptions);
                java.net.SocketAddress javaAddress = io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress);
                anonymousClass1.L$0 = socketChannelOpenSocketChannelFor;
                anonymousClass1.L$1 = socketImpl;
                anonymousClass1.label = 1;
                return socketImpl.connect$ktor_network(javaAddress, anonymousClass1) == aVar ? aVar : socketImpl;
            } catch (java.lang.Throwable th) {
                th = th;
                closeable = socketChannelOpenSocketChannelFor;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            io.ktor.network.sockets.SocketImpl socketImpl2 = (io.ktor.network.sockets.SocketImpl) anonymousClass1.L$1;
            closeable = (java.io.Closeable) anonymousClass1.L$0;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                return socketImpl2;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        closeable.close();
        throw th;
    }
}
