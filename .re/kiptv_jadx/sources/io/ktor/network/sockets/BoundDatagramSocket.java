package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/sockets/BoundDatagramSocket;", "Lio/ktor/network/sockets/ASocket;", "Lio/ktor/network/sockets/ABoundSocket;", "Lio/ktor/network/sockets/DatagramReadWriteChannel;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface BoundDatagramSocket extends io.ktor.network.sockets.ASocket, io.ktor.network.sockets.ABoundSocket, io.ktor.network.sockets.DatagramReadWriteChannel {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static void dispose(io.ktor.network.sockets.BoundDatagramSocket boundDatagramSocket) {
            io.ktor.network.sockets.ASocket.DefaultImpls.dispose(boundDatagramSocket);
        }

        public static java.lang.Object receive(io.ktor.network.sockets.BoundDatagramSocket boundDatagramSocket, p100l6.c cVar) {
            return io.ktor.network.sockets.DatagramReadWriteChannel.DefaultImpls.receive(boundDatagramSocket, cVar);
        }

        public static java.lang.Object send(io.ktor.network.sockets.BoundDatagramSocket boundDatagramSocket, io.ktor.network.sockets.Datagram datagram, p100l6.c cVar) {
            java.lang.Object objSend = io.ktor.network.sockets.DatagramReadWriteChannel.DefaultImpls.send(boundDatagramSocket, datagram, cVar);
            return objSend == p109m6.a.f25430h ? objSend : p070h6.A.f22523a;
        }
    }
}
