package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p117n6.e(c = "io.ktor.network.sockets.SocketImpl", f = "SocketImpl.kt", l = {47, 65}, m = "connect$ktor_network")
public final class SocketImpl$connect$1 extends p117n6.c {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.network.sockets.SocketImpl<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SocketImpl$connect$1(io.ktor.network.sockets.SocketImpl<? extends S> socketImpl, p100l6.c cVar) {
        super(cVar);
        this.this$0 = socketImpl;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connect$ktor_network(null, this);
    }
}
