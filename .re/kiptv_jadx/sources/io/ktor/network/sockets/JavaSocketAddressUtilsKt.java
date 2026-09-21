package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/network/sockets/SocketAddress;", "Ljava/net/SocketAddress;", "toJavaAddress", "(Lio/ktor/network/sockets/SocketAddress;)Ljava/net/SocketAddress;", "toSocketAddress", "(Ljava/net/SocketAddress;)Lio/ktor/network/sockets/SocketAddress;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JavaSocketAddressUtilsKt {
    public static final java.net.SocketAddress toJavaAddress(io.ktor.network.sockets.SocketAddress socketAddress) {
        kotlin.jvm.internal.m.e(socketAddress, "<this>");
        return socketAddress.getAddress();
    }

    public static final io.ktor.network.sockets.SocketAddress toSocketAddress(java.net.SocketAddress socketAddress) {
        kotlin.jvm.internal.m.e(socketAddress, "<this>");
        if (socketAddress instanceof java.net.InetSocketAddress) {
            return new io.ktor.network.sockets.InetSocketAddress((java.net.InetSocketAddress) socketAddress);
        }
        if (socketAddress.getClass().getName().equals(io.ktor.network.sockets.SocketAddressJvmKt.UNIX_DOMAIN_SOCKET_ADDRESS_CLASS)) {
            return new io.ktor.network.sockets.UnixSocketAddress(socketAddress);
        }
        throw new java.lang.IllegalStateException("Unknown socket address type");
    }
}
