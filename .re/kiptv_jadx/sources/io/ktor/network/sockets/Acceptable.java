package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/network/sockets/Acceptable;", "Lio/ktor/network/sockets/ASocket;", "S", "accept", "(Ll6/c;)Ljava/lang/Object;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Acceptable<S extends io.ktor.network.sockets.ASocket> extends io.ktor.network.sockets.ASocket {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static <S extends io.ktor.network.sockets.ASocket> void dispose(io.ktor.network.sockets.Acceptable<? extends S> acceptable) {
            io.ktor.network.sockets.ASocket.DefaultImpls.dispose(acceptable);
        }
    }

    java.lang.Object accept(p100l6.c cVar);
}
