package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import io.ktor.network.selector.SelectorManager;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.IOException;
import java.nio.channels.DatagramChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketAddress;", "remoteAddress", "localAddress", "Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/ktor/network/sockets/ConnectedDatagramSocket;", "udpConnect", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/network/sockets/BoundDatagramSocket;", "udpBind", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;Ll6/c;)Ljava/lang/Object;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UDPSocketBuilderJvmKt {
    public static final Object udpBind(SelectorManager selectorManager, SocketAddress socketAddress, SocketOptions.UDPSocketOptions uDPSocketOptions, c cVar) throws IOException {
        DatagramChannel datagramChannelOpenDatagramChannel = selectorManager.getProvider().openDatagramChannel();
        try {
            m.b(datagramChannelOpenDatagramChannel);
            JavaSocketOptionsKt.assignOptions(datagramChannelOpenDatagramChannel, uDPSocketOptions);
            JavaSocketOptionsKt.nonBlocking(datagramChannelOpenDatagramChannel);
            if (JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                datagramChannelOpenDatagramChannel.bind(socketAddress != null ? JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null);
            } else {
                datagramChannelOpenDatagramChannel.socket().bind(socketAddress != null ? JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null);
            }
            return new DatagramSocketImpl(datagramChannelOpenDatagramChannel, selectorManager);
        } catch (Throwable th) {
            datagramChannelOpenDatagramChannel.close();
            throw th;
        }
    }

    public static final Object udpConnect(SelectorManager selectorManager, SocketAddress socketAddress, SocketAddress socketAddress2, SocketOptions.UDPSocketOptions uDPSocketOptions, c cVar) throws IOException {
        DatagramChannel datagramChannelOpenDatagramChannel = selectorManager.getProvider().openDatagramChannel();
        try {
            m.b(datagramChannelOpenDatagramChannel);
            JavaSocketOptionsKt.assignOptions(datagramChannelOpenDatagramChannel, uDPSocketOptions);
            JavaSocketOptionsKt.nonBlocking(datagramChannelOpenDatagramChannel);
            if (JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                datagramChannelOpenDatagramChannel.bind(socketAddress2 != null ? JavaSocketAddressUtilsKt.toJavaAddress(socketAddress2) : null);
            } else {
                datagramChannelOpenDatagramChannel.socket().bind(socketAddress2 != null ? JavaSocketAddressUtilsKt.toJavaAddress(socketAddress2) : null);
            }
            datagramChannelOpenDatagramChannel.connect(JavaSocketAddressUtilsKt.toJavaAddress(socketAddress));
            return new DatagramSocketImpl(datagramChannelOpenDatagramChannel, selectorManager);
        } catch (Throwable th) {
            datagramChannelOpenDatagramChannel.close();
            throw th;
        }
    }
}
