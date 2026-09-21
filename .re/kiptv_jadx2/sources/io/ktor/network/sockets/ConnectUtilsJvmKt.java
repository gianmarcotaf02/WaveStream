package io.ktor.network.sockets;

import I3.b;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.ktor.network.selector.SelectorManager;
import io.sentry.SentryLockReason;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p117n6.c;
import p117n6.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00140\u0014*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/network/selector/SelectorManager;", "selector", "Lio/ktor/network/sockets/SocketAddress;", "remoteAddress", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "socketOptions", "Lio/ktor/network/sockets/Socket;", "tcpConnect", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;Ll6/c;)Ljava/lang/Object;", "localAddress", "Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "Lio/ktor/network/sockets/ServerSocket;", "tcpBind", "(Lio/ktor/network/selector/SelectorManager;Lio/ktor/network/sockets/SocketAddress;Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;Ll6/c;)Ljava/lang/Object;", "Ljava/nio/channels/spi/SelectorProvider;", SentryLockReason.JsonKeys.ADDRESS, "Ljava/nio/channels/SocketChannel;", "kotlin.jvm.PlatformType", "openSocketChannelFor", "(Ljava/nio/channels/spi/SelectorProvider;Lio/ktor/network/sockets/SocketAddress;)Ljava/nio/channels/SocketChannel;", "Ljava/nio/channels/ServerSocketChannel;", "openServerSocketChannelFor", "(Ljava/nio/channels/spi/SelectorProvider;Lio/ktor/network/sockets/SocketAddress;)Ljava/nio/channels/ServerSocketChannel;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConnectUtilsJvmKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.network.sockets.ConnectUtilsJvmKt", f = "ConnectUtilsJvm.kt", l = {21}, m = "tcpConnect")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectUtilsJvmKt.tcpConnect(null, null, null, this);
        }
    }

    public static final ServerSocketChannel openServerSocketChannelFor(SelectorProvider selectorProvider, SocketAddress socketAddress) throws IllegalAccessException, InvocationTargetException {
        m.e(selectorProvider, "<this>");
        if (socketAddress == null) {
            return selectorProvider.openServerSocketChannel();
        }
        if (socketAddress instanceof InetSocketAddress) {
            return selectorProvider.openServerSocketChannel();
        }
        if (!(socketAddress instanceof UnixSocketAddress)) {
            throw new b();
        }
        Object objInvoke = SelectorProvider.class.getMethod("openServerSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        m.c(objInvoke, "null cannot be cast to non-null type java.nio.channels.ServerSocketChannel");
        return (ServerSocketChannel) objInvoke;
    }

    public static final SocketChannel openSocketChannelFor(SelectorProvider selectorProvider, SocketAddress address) throws IllegalAccessException, InvocationTargetException {
        m.e(selectorProvider, "<this>");
        m.e(address, "address");
        if (address instanceof InetSocketAddress) {
            return selectorProvider.openSocketChannel();
        }
        if (!(address instanceof UnixSocketAddress)) {
            throw new b();
        }
        Object objInvoke = SelectorProvider.class.getMethod("openSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        m.c(objInvoke, "null cannot be cast to non-null type java.nio.channels.SocketChannel");
        return (SocketChannel) objInvoke;
    }

    public static final Object tcpBind(SelectorManager selectorManager, SocketAddress socketAddress, SocketOptions.AcceptorOptions acceptorOptions, p100l6.c cVar) throws IllegalAccessException, IOException, InvocationTargetException {
        ServerSocketChannel serverSocketChannelOpenServerSocketChannelFor = openServerSocketChannelFor(selectorManager.getProvider(), socketAddress);
        try {
            if (socketAddress instanceof InetSocketAddress) {
                m.b(serverSocketChannelOpenServerSocketChannelFor);
                JavaSocketOptionsKt.assignOptions(serverSocketChannelOpenServerSocketChannelFor, acceptorOptions);
            }
            m.b(serverSocketChannelOpenServerSocketChannelFor);
            JavaSocketOptionsKt.nonBlocking(serverSocketChannelOpenServerSocketChannelFor);
            ServerSocketImpl serverSocketImpl = new ServerSocketImpl(serverSocketChannelOpenServerSocketChannelFor, selectorManager);
            if (JavaSocketOptionsKt.getJava7NetworkApisAvailable()) {
                serverSocketImpl.getChannel().bind(socketAddress != null ? JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null, acceptorOptions.getBacklogSize());
                return serverSocketImpl;
            }
            serverSocketImpl.getChannel().socket().bind(socketAddress != null ? JavaSocketAddressUtilsKt.toJavaAddress(socketAddress) : null, acceptorOptions.getBacklogSize());
            return serverSocketImpl;
        } catch (Throwable th) {
            serverSocketChannelOpenServerSocketChannelFor.close();
            throw th;
        }
    }

    public static final Object tcpConnect(SelectorManager selectorManager, SocketAddress socketAddress, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, p100l6.c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Closeable closeable;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            P.u0(obj);
            SocketChannel socketChannelOpenSocketChannelFor = openSocketChannelFor(selectorManager.getProvider(), socketAddress);
            try {
                if (socketAddress instanceof InetSocketAddress) {
                    m.b(socketChannelOpenSocketChannelFor);
                    JavaSocketOptionsKt.assignOptions(socketChannelOpenSocketChannelFor, tCPClientSocketOptions);
                }
                m.b(socketChannelOpenSocketChannelFor);
                JavaSocketOptionsKt.nonBlocking(socketChannelOpenSocketChannelFor);
                SocketImpl socketImpl = new SocketImpl(socketChannelOpenSocketChannelFor, selectorManager, tCPClientSocketOptions);
                java.net.SocketAddress javaAddress = JavaSocketAddressUtilsKt.toJavaAddress(socketAddress);
                anonymousClass1.L$0 = socketChannelOpenSocketChannelFor;
                anonymousClass1.L$1 = socketImpl;
                anonymousClass1.label = 1;
                return socketImpl.connect$ktor_network(javaAddress, anonymousClass1) == aVar ? aVar : socketImpl;
            } catch (Throwable th) {
                th = th;
                closeable = socketChannelOpenSocketChannelFor;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SocketImpl socketImpl2 = (SocketImpl) anonymousClass1.L$1;
            closeable = (Closeable) anonymousClass1.L$0;
            try {
                P.u0(obj);
                return socketImpl2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        closeable.close();
        throw th;
    }
}
