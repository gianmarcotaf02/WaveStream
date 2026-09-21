package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/network/sockets/SocketBuilder;", "Lio/ktor/network/sockets/Configurable;", "Lio/ktor/network/sockets/SocketOptions;", "Lio/ktor/network/selector/SelectorManager;", "selector", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "<init>", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions;)V", "Lio/ktor/network/sockets/TcpSocketBuilder;", "tcp", "()Lio/ktor/network/sockets/TcpSocketBuilder;", "Lio/ktor/network/sockets/UDPSocketBuilder;", "udp", "()Lio/ktor/network/sockets/UDPSocketBuilder;", "Lio/ktor/network/selector/SelectorManager;", "Lio/ktor/network/sockets/SocketOptions;", "getOptions", "()Lio/ktor/network/sockets/SocketOptions;", "setOptions", "(Lio/ktor/network/sockets/SocketOptions;)V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SocketBuilder implements io.ktor.network.sockets.Configurable<io.ktor.network.sockets.SocketBuilder, io.ktor.network.sockets.SocketOptions> {
    private io.ktor.network.sockets.SocketOptions options;
    private final io.ktor.network.selector.SelectorManager selector;

    public SocketBuilder(io.ktor.network.selector.SelectorManager selector, io.ktor.network.sockets.SocketOptions options) {
        kotlin.jvm.internal.m.e(selector, "selector");
        kotlin.jvm.internal.m.e(options, "options");
        this.selector = selector;
        this.options = options;
    }

    @Override // io.ktor.network.sockets.Configurable
    public io.ktor.network.sockets.SocketOptions getOptions() {
        return this.options;
    }

    @Override // io.ktor.network.sockets.Configurable
    public void setOptions(io.ktor.network.sockets.SocketOptions socketOptions) {
        kotlin.jvm.internal.m.e(socketOptions, "<set-?>");
        this.options = socketOptions;
    }

    public final io.ktor.network.sockets.TcpSocketBuilder tcp() {
        return new io.ktor.network.sockets.TcpSocketBuilder(this.selector, getOptions().peer$ktor_network());
    }

    public final io.ktor.network.sockets.UDPSocketBuilder udp() {
        return new io.ktor.network.sockets.UDPSocketBuilder(this.selector, getOptions().peer$ktor_network().udp$ktor_network());
    }

    @Override // io.ktor.network.sockets.Configurable
    public io.ktor.network.sockets.SocketBuilder configure(p194x6.j jVar) {
        return (io.ktor.network.sockets.SocketBuilder) io.ktor.network.sockets.Configurable.DefaultImpls.configure(this, jVar);
    }
}
