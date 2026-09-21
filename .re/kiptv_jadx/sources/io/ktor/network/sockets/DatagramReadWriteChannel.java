package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/network/sockets/DatagramReadWriteChannel;", "Lio/ktor/network/sockets/DatagramReadChannel;", "Lio/ktor/network/sockets/DatagramWriteChannel;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface DatagramReadWriteChannel extends io.ktor.network.sockets.DatagramReadChannel, io.ktor.network.sockets.DatagramWriteChannel {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static java.lang.Object receive(io.ktor.network.sockets.DatagramReadWriteChannel datagramReadWriteChannel, p100l6.c cVar) {
            return io.ktor.network.sockets.DatagramReadChannel.DefaultImpls.receive(datagramReadWriteChannel, cVar);
        }

        public static java.lang.Object send(io.ktor.network.sockets.DatagramReadWriteChannel datagramReadWriteChannel, io.ktor.network.sockets.Datagram datagram, p100l6.c cVar) {
            java.lang.Object objSend = io.ktor.network.sockets.DatagramWriteChannel.DefaultImpls.send(datagramReadWriteChannel, datagram, cVar);
            return objSend == p109m6.a.f25430h ? objSend : p070h6.A.f22523a;
        }
    }
}
