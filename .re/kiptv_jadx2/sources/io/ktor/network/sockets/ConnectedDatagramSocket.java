package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p070h6.A;
import p100l6.c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/network/sockets/ConnectedDatagramSocket;", "Lio/ktor/network/sockets/ASocket;", "Lio/ktor/network/sockets/ABoundSocket;", "Lio/ktor/network/sockets/AConnectedSocket;", "Lio/ktor/network/sockets/DatagramReadWriteChannel;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ConnectedDatagramSocket extends ASocket, ABoundSocket, AConnectedSocket, DatagramReadWriteChannel {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static void dispose(ConnectedDatagramSocket connectedDatagramSocket) {
            ASocket.DefaultImpls.dispose(connectedDatagramSocket);
        }

        public static Object receive(ConnectedDatagramSocket connectedDatagramSocket, c cVar) {
            return DatagramReadWriteChannel.DefaultImpls.receive(connectedDatagramSocket, cVar);
        }

        public static Object send(ConnectedDatagramSocket connectedDatagramSocket, Datagram datagram, c cVar) {
            Object objSend = DatagramReadWriteChannel.DefaultImpls.send(connectedDatagramSocket, datagram, cVar);
            return objSend == p109m6.a.f25430h ? objSend : A.f22523a;
        }
    }
}
