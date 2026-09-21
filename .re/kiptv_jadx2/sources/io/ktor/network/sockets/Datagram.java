package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.sentry.SentryLockReason;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.n;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/network/sockets/Datagram;", "", "Lk8/n;", "packet", "Lio/ktor/network/sockets/SocketAddress;", SentryLockReason.JsonKeys.ADDRESS, "<init>", "(Lk8/n;Lio/ktor/network/sockets/SocketAddress;)V", "Lk8/n;", "getPacket", "()Lk8/n;", "Lio/ktor/network/sockets/SocketAddress;", "getAddress", "()Lio/ktor/network/sockets/SocketAddress;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Datagram {
    private final SocketAddress address;
    private final n packet;

    public Datagram(n packet, SocketAddress address) {
        m.e(packet, "packet");
        m.e(address, "address");
        this.packet = packet;
        this.address = address;
        if (ByteReadPacketKt.getRemaining(packet) <= 65535) {
            return;
        }
        throw new IllegalArgumentException(("Datagram size limit exceeded: " + ByteReadPacketKt.getRemaining(packet) + " of possible 65535").toString());
    }

    public final SocketAddress getAddress() {
        return this.address;
    }

    public final n getPacket() {
        return this.packet;
    }
}
