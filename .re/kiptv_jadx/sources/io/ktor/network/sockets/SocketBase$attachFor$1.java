package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SocketBase$attachFor$1 implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ io.ktor.network.sockets.SocketBase this$0;

    public SocketBase$attachFor$1(io.ktor.network.sockets.SocketBase socketBase) {
        this.this$0 = socketBase;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m446invoke();
        return p070h6.A.f22523a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m446invoke() {
        this.this$0.checkChannels();
    }
}
