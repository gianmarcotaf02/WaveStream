package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/network/sockets/Datagram;", "", "Lk8/n;", "packet", "Lio/ktor/network/sockets/SocketAddress;", io.sentry.SentryLockReason.JsonKeys.ADDRESS, "<init>", "(Lk8/n;Lio/ktor/network/sockets/SocketAddress;)V", "Lk8/n;", "getPacket", "()Lk8/n;", "Lio/ktor/network/sockets/SocketAddress;", "getAddress", "()Lio/ktor/network/sockets/SocketAddress;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Datagram {
    private final io.ktor.network.sockets.SocketAddress address;
    private final p094k8.n packet;

    public Datagram(p094k8.n packet, io.ktor.network.sockets.SocketAddress address) {
        kotlin.jvm.internal.m.e(packet, "packet");
        kotlin.jvm.internal.m.e(address, "address");
        this.packet = packet;
        this.address = address;
        if (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(packet) <= 65535) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Datagram size limit exceeded: " + io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(packet) + " of possible 65535").toString());
    }

    public final io.ktor.network.sockets.SocketAddress getAddress() {
        return this.address;
    }

    public final p094k8.n getPacket() {
        return this.packet;
    }
}
