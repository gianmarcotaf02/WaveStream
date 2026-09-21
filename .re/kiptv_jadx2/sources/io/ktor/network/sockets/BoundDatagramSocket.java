package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p070h6.A;
import p100l6.c;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/sockets/BoundDatagramSocket;", "Lio/ktor/network/sockets/ASocket;", "Lio/ktor/network/sockets/ABoundSocket;", "Lio/ktor/network/sockets/DatagramReadWriteChannel;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface BoundDatagramSocket extends ASocket, ABoundSocket, DatagramReadWriteChannel {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static void dispose(BoundDatagramSocket boundDatagramSocket) {
            ASocket.DefaultImpls.dispose(boundDatagramSocket);
        }

        public static Object receive(BoundDatagramSocket boundDatagramSocket, c cVar) {
            return DatagramReadWriteChannel.DefaultImpls.receive(boundDatagramSocket, cVar);
        }

        public static Object send(BoundDatagramSocket boundDatagramSocket, Datagram datagram, c cVar) {
            Object objSend = DatagramReadWriteChannel.DefaultImpls.send(boundDatagramSocket, datagram, cVar);
            return objSend == p109m6.a.f25430h ? objSend : A.f22523a;
        }
    }
}
