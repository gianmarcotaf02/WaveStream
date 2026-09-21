package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p070h6.A;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SocketBase$attachFor$1 implements Function0 {
    final SocketBase this$0;

    public SocketBase$attachFor$1(SocketBase socketBase) {
        this.this$0 = socketBase;
    }

    @Override
    public Object invoke() {
        m446invoke();
        return A.f22523a;
    }

    public final void m446invoke() {
        this.this$0.checkChannels();
    }
}
