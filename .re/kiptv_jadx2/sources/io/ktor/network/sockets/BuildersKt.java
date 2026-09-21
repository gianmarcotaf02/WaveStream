package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import io.ktor.network.selector.SelectorManager;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p070h6.c;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0012\b\u0000\u0010\u0006*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0005*\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketBuilder;", "aSocket", "(Lio/ktor/network/selector/SelectorManager;)Lio/ktor/network/sockets/SocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "T", "tcpNoDelay", "(Lio/ktor/network/sockets/Configurable;)Lio/ktor/network/sockets/Configurable;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BuildersKt {
    public static final SocketBuilder aSocket(SelectorManager selector) {
        m.e(selector, "selector");
        return new SocketBuilder(selector, SocketOptions.INSTANCE.create$ktor_network());
    }

    @c
    public static final <T extends Configurable<? extends T, ?>> T tcpNoDelay(T t9) {
        m.e(t9, "<this>");
        return (T) t9.configure(new j() {
            @Override
            public Object invoke(Object obj) {
                invoke((SocketOptions) obj);
                return A.f22523a;
            }

            public final void invoke(SocketOptions configure) {
                m.e(configure, "$this$configure");
                if (configure instanceof SocketOptions.TCPClientSocketOptions) {
                    ((SocketOptions.TCPClientSocketOptions) configure).setNoDelay(true);
                }
            }
        });
    }
}
