package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketAddress;", "remoteAddress", "localAddress", "Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lio/ktor/network/sockets/ConnectedDatagramSocket;", "udpConnect", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/network/sockets/BoundDatagramSocket;", "udpBind", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;Ll6/c;)Ljava/lang/Object;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UDPSocketBuilderJvmKt {
    public static final java.lang.Object udpBind(io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketAddress socketAddress, io.ktor.network.sockets.SocketOptions.UDPSocketOptions uDPSocketOptions, p100l6.c cVar) throws java.io.IOException {
        java.nio.channels.DatagramChannel datagramChannelOpenDatagramChannel = selectorManager.getProvider().openDatagramChannel();
        try {
            kotlin.jvm.internal.m.b(datagramChannelOpenDatagramChannel);
            io.ktor.network.sockets.JavaSocketOptionsKt.assignOptions(datagramChannelOpenDatagramChannel, uDPSocketOptions);
            io.ktor.network.sockets.JavaSocketOptionsKt.nonBlocking(datagramChannelOpenDatagramChannel);
            if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                datagramChannelOpenDatagramChannel.bind(socketAddress != null ? io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null);
            } else {
                datagramChannelOpenDatagramChannel.socket().bind(socketAddress != null ? io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null);
            }
            return new io.ktor.network.sockets.DatagramSocketImpl(datagramChannelOpenDatagramChannel, selectorManager);
        } catch (java.lang.Throwable th) {
            datagramChannelOpenDatagramChannel.close();
            throw th;
        }
    }

    public static final java.lang.Object udpConnect(io.ktor.network.selector.SelectorManager selectorManager, io.ktor.network.sockets.SocketAddress socketAddress, io.ktor.network.sockets.SocketAddress socketAddress2, io.ktor.network.sockets.SocketOptions.UDPSocketOptions uDPSocketOptions, p100l6.c cVar) throws java.io.IOException {
        java.nio.channels.DatagramChannel datagramChannelOpenDatagramChannel = selectorManager.getProvider().openDatagramChannel();
        try {
            kotlin.jvm.internal.m.b(datagramChannelOpenDatagramChannel);
            io.ktor.network.sockets.JavaSocketOptionsKt.assignOptions(datagramChannelOpenDatagramChannel, uDPSocketOptions);
            io.ktor.network.sockets.JavaSocketOptionsKt.nonBlocking(datagramChannelOpenDatagramChannel);
            if (io.ktor.network.sockets.JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                datagramChannelOpenDatagramChannel.bind(socketAddress2 != null ? io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress2) : null);
            } else {
                datagramChannelOpenDatagramChannel.socket().bind(socketAddress2 != null ? io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress2) : null);
            }
            datagramChannelOpenDatagramChannel.connect(io.ktor.network.sockets.JavaSocketAddressUtilsKt.toJavaAddress(socketAddress));
            return new io.ktor.network.sockets.DatagramSocketImpl(datagramChannelOpenDatagramChannel, selectorManager);
        } catch (java.lang.Throwable th) {
            datagramChannelOpenDatagramChannel.close();
            throw th;
        }
    }
}
