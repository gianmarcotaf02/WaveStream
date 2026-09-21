package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p117n6.c;
import p117n6.e;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@e(c = "io.ktor.network.sockets.SocketImpl", f = "SocketImpl.kt", l = {47, 65}, m = "connect$ktor_network")
public final class SocketImpl$connect$1 extends c {
    Object L$0;
    int label;
    Object result;
    final SocketImpl<S> this$0;

    public SocketImpl$connect$1(SocketImpl<? extends S> socketImpl, p100l6.c cVar) {
        super(cVar);
        this.this$0 = socketImpl;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connect$ktor_network(null, this);
    }
}
