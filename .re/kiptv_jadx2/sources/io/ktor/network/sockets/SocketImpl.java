package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.ktor.network.selector.SelectInterest;
import io.ktor.network.selector.SelectorManager;
import io.sentry.protocol.SentryThread;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.channels.SocketChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p100l6.c;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lio/ktor/network/sockets/SocketImpl;", "Ljava/nio/channels/SocketChannel;", "S", "Lio/ktor/network/sockets/NIOSocketImpl;", "Lio/ktor/network/sockets/Socket;", "channel", "Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "<init>", "(Ljava/nio/channels/SocketChannel;Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;)V", "", SentryThread.JsonKeys.STATE, "Lh6/A;", "wantConnect", "(Z)V", "inetSelfConnect", "()Z", "Ljava/net/SocketAddress;", "target", "connect$ktor_network", "(Ljava/net/SocketAddress;Ll6/c;)Ljava/lang/Object;", "connect", "Ljava/nio/channels/SocketChannel;", "getChannel", "()Ljava/nio/channels/SocketChannel;", "Lio/ktor/network/sockets/SocketAddress;", "getLocalAddress", "()Lio/ktor/network/sockets/SocketAddress;", "localAddress", "getRemoteAddress", "remoteAddress", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SocketImpl<S extends SocketChannel> extends NIOSocketImpl<S> implements Socket {
    private final S channel;

    public SocketImpl(SocketChannel socketChannel, SelectorManager selectorManager, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, int i3, AbstractC2541f abstractC2541f) {
        this(socketChannel, selectorManager, (i3 & 4) != 0 ? null : tCPClientSocketOptions);
    }

    private final boolean inetSelfConnect() {
        String hostAddress;
        InetAddress address;
        InetAddress address2;
        String hostAddress2;
        InetAddress address3;
        java.net.SocketAddress localAddress = JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getLocalAddress() : getChannel().socket().getLocalSocketAddress();
        java.net.SocketAddress remoteAddress = JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getRemoteAddress() : getChannel().socket().getRemoteSocketAddress();
        if (localAddress == null || remoteAddress == null) {
            throw new IllegalStateException("localAddress and remoteAddress should not be null.");
        }
        java.net.InetSocketAddress inetSocketAddress = localAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) localAddress : null;
        java.net.InetSocketAddress inetSocketAddress2 = remoteAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) remoteAddress : null;
        if (inetSocketAddress == null && inetSocketAddress2 == null) {
            return false;
        }
        String str = "";
        if (inetSocketAddress == null || (address3 = inetSocketAddress.getAddress()) == null || (hostAddress = address3.getHostAddress()) == null) {
            hostAddress = "";
        }
        if (inetSocketAddress2 != null && (address2 = inetSocketAddress2.getAddress()) != null && (hostAddress2 = address2.getHostAddress()) != null) {
            str = hostAddress2;
        }
        return m.a(inetSocketAddress != null ? Integer.valueOf(inetSocketAddress.getPort()) : null, inetSocketAddress2 != null ? Integer.valueOf(inetSocketAddress2.getPort()) : null) && (((inetSocketAddress2 == null || (address = inetSocketAddress2.getAddress()) == null) ? false : address.isAnyLocalAddress()) || hostAddress.equals(str));
    }

    private final void wantConnect(boolean state) {
        interestOp(SelectInterest.CONNECT, state);
    }

    public static void wantConnect$default(SocketImpl socketImpl, boolean z6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        socketImpl.wantConnect(z6);
    }

    public final Object connect$ktor_network(java.net.SocketAddress socketAddress, c cVar) throws IOException {
        SocketImpl$connect$1 socketImpl$connect$1;
        SocketImpl<S> socketImpl;
        if (cVar instanceof SocketImpl$connect$1) {
            socketImpl$connect$1 = (SocketImpl$connect$1) cVar;
            int i3 = socketImpl$connect$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                socketImpl$connect$1.label = i3 - Integer.MIN_VALUE;
            } else {
                socketImpl$connect$1 = new SocketImpl$connect$1(this, cVar);
            }
        } else {
            socketImpl$connect$1 = new SocketImpl$connect$1(this, cVar);
        }
        Object obj = socketImpl$connect$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = socketImpl$connect$1.label;
        if (i9 == 0) {
            P.u0(obj);
            if (getChannel().connect(socketAddress)) {
                return this;
            }
            wantConnect(true);
            SelectorManager selector = getSelector();
            SelectInterest selectInterest = SelectInterest.CONNECT;
            socketImpl$connect$1.L$0 = this;
            socketImpl$connect$1.label = 1;
            if (selector.select(this, selectInterest, socketImpl$connect$1) != aVar) {
                socketImpl = this;
            }
            return aVar;
        }
        if (i9 != 1 && i9 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        socketImpl = (SocketImpl) socketImpl$connect$1.L$0;
        P.u0(obj);
        while (true) {
            if (!socketImpl.getChannel().finishConnect()) {
                socketImpl.wantConnect(true);
                SelectorManager selector2 = socketImpl.getSelector();
                SelectInterest selectInterest2 = SelectInterest.CONNECT;
                socketImpl$connect$1.L$0 = socketImpl;
                socketImpl$connect$1.label = 2;
                if (selector2.select(socketImpl, selectInterest2, socketImpl$connect$1) == aVar) {
                    break;
                }
            } else {
                if (!socketImpl.inetSelfConnect()) {
                    socketImpl.wantConnect(false);
                    return socketImpl;
                }
                if (JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                    socketImpl.getChannel().close();
                } else {
                    socketImpl.getChannel().socket().close();
                }
            }
        }
        return aVar;
    }

    @Override
    public SocketAddress getLocalAddress() {
        SocketAddress socketAddress;
        java.net.SocketAddress localAddress = JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getLocalAddress() : getChannel().socket().getLocalSocketAddress();
        if (localAddress == null || (socketAddress = JavaSocketAddressUtilsKt.toSocketAddress(localAddress)) == null) {
            throw new IllegalStateException("Channel is not yet bound");
        }
        return socketAddress;
    }

    @Override
    public SocketAddress getRemoteAddress() {
        SocketAddress socketAddress;
        java.net.SocketAddress remoteAddress = JavaSocketOptionsKt.getJava7NetworkApisAvailable() ? getChannel().getRemoteAddress() : getChannel().socket().getRemoteSocketAddress();
        if (remoteAddress == null || (socketAddress = JavaSocketAddressUtilsKt.toSocketAddress(remoteAddress)) == null) {
            throw new IllegalStateException("Channel is not yet connected");
        }
        return socketAddress;
    }

    public SocketImpl(S channel, SelectorManager selector, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions) {
        super(channel, selector, null, tCPClientSocketOptions);
        m.e(channel, "channel");
        m.e(selector, "selector");
        this.channel = channel;
        if (getChannel().isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
    }

    @Override
    public S getChannel() {
        return this.channel;
    }
}
