package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0012\b\u0000\u0010\u0006*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0005*\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketBuilder;", "aSocket", "(Lio/ktor/network/selector/SelectorManager;)Lio/ktor/network/sockets/SocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "T", "tcpNoDelay", "(Lio/ktor/network/sockets/Configurable;)Lio/ktor/network/sockets/Configurable;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BuildersKt {
    public static final io.ktor.network.sockets.SocketBuilder aSocket(io.ktor.network.selector.SelectorManager selector) {
        kotlin.jvm.internal.m.e(selector, "selector");
        return new io.ktor.network.sockets.SocketBuilder(selector, io.ktor.network.sockets.SocketOptions.INSTANCE.create$ktor_network());
    }

    @p070h6.c
    public static final <T extends io.ktor.network.sockets.Configurable<? extends T, ?>> T tcpNoDelay(T t9) {
        kotlin.jvm.internal.m.e(t9, "<this>");
        return (T) t9.configure(new p194x6.j() { // from class: io.ktor.network.sockets.BuildersKt.tcpNoDelay.1
            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((io.ktor.network.sockets.SocketOptions) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(io.ktor.network.sockets.SocketOptions configure) {
                kotlin.jvm.internal.m.e(configure, "$this$configure");
                if (configure instanceof io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) {
                    ((io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) configure).setNoDelay(true);
                }
            }
        });
    }
}
