package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lio/ktor/network/sockets/DatagramReadChannel;", "", "Lio/ktor/network/sockets/Datagram;", "receive", "(Ll6/c;)Ljava/lang/Object;", "LU7/C;", "getIncoming", "()LU7/C;", "incoming", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface DatagramReadChannel {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static java.lang.Object receive(io.ktor.network.sockets.DatagramReadChannel datagramReadChannel, p100l6.c cVar) {
            return datagramReadChannel.getIncoming().receive(cVar);
        }
    }

    U7.C getIncoming();

    java.lang.Object receive(p100l6.c cVar);
}
