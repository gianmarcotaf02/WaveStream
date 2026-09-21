package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import io.ktor.network.sockets.Configurable;
import io.ktor.network.sockets.SocketOptions;
import io.sentry.rrweb.RRWebOptionsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p194x6.j;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0016\b\u0000\u0010\u0001 \u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004J#\u0010\b\u001a\u00028\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u00028\u00018&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/network/sockets/Configurable;", "T", "Lio/ktor/network/sockets/SocketOptions;", "Options", "", "Lkotlin/Function1;", "Lh6/A;", "block", "configure", "(Lx6/j;)Lio/ktor/network/sockets/Configurable;", "getOptions", "()Lio/ktor/network/sockets/SocketOptions;", "setOptions", "(Lio/ktor/network/sockets/SocketOptions;)V", RRWebOptionsEvent.EVENT_TAG, "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Configurable<T extends Configurable<? extends T, Options>, Options extends SocketOptions> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static <T extends Configurable<? extends T, Options>, Options extends SocketOptions> T configure(Configurable<? extends T, Options> configurable, j block) {
            m.e(block, "block");
            SocketOptions socketOptionsCopy$ktor_network = configurable.getOptions().copy$ktor_network();
            m.c(socketOptionsCopy$ktor_network, "null cannot be cast to non-null type Options of io.ktor.network.sockets.Configurable");
            block.invoke(socketOptionsCopy$ktor_network);
            configurable.setOptions(socketOptionsCopy$ktor_network);
            return configurable;
        }
    }

    T configure(j block);

    Options getOptions();

    void setOptions(Options options);
}
