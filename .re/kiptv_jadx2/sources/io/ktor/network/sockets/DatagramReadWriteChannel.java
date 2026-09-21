package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p070h6.A;
import p100l6.c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/network/sockets/DatagramReadWriteChannel;", "Lio/ktor/network/sockets/DatagramReadChannel;", "Lio/ktor/network/sockets/DatagramWriteChannel;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface DatagramReadWriteChannel extends DatagramReadChannel, DatagramWriteChannel {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static Object receive(DatagramReadWriteChannel datagramReadWriteChannel, c cVar) {
            return DatagramReadChannel.DefaultImpls.receive(datagramReadWriteChannel, cVar);
        }

        public static Object send(DatagramReadWriteChannel datagramReadWriteChannel, Datagram datagram, c cVar) {
            Object objSend = DatagramWriteChannel.DefaultImpls.send(datagramReadWriteChannel, datagram, cVar);
            return objSend == p109m6.a.f25430h ? objSend : A.f22523a;
        }
    }
}
