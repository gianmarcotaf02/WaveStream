package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/sockets/SocketAddress;", "", "port", "(Lio/ktor/network/sockets/SocketAddress;)I", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SocketAddressKt {
    public static final int port(io.ktor.network.sockets.SocketAddress socketAddress) {
        kotlin.jvm.internal.m.e(socketAddress, "<this>");
        if (socketAddress instanceof io.ktor.network.sockets.InetSocketAddress) {
            return ((io.ktor.network.sockets.InetSocketAddress) socketAddress).getPort();
        }
        throw new java.lang.UnsupportedOperationException("SocketAddress " + socketAddress + " does not have a port");
    }
}
