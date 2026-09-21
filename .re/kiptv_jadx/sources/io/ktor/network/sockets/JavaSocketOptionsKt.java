package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljava/nio/channels/SelectableChannel;", "Lh6/A;", "nonBlocking", "(Ljava/nio/channels/SelectableChannel;)V", "Lio/ktor/network/sockets/SocketOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "assignOptions", "(Ljava/nio/channels/SelectableChannel;Lio/ktor/network/sockets/SocketOptions;)V", "", "java7NetworkApisAvailable", "Z", "getJava7NetworkApisAvailable", "()Z", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class JavaSocketOptionsKt {
    private static final boolean java7NetworkApisAvailable;

    static {
        boolean z6;
        try {
            java.lang.Class.forName("java.net.StandardSocketOptions");
            z6 = true;
        } catch (java.lang.ClassNotFoundException unused) {
            z6 = false;
        }
        java7NetworkApisAvailable = z6;
    }

    public static final void assignOptions(java.nio.channels.SelectableChannel selectableChannel, io.ktor.network.sockets.SocketOptions options) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        kotlin.jvm.internal.m.e(selectableChannel, "<this>");
        kotlin.jvm.internal.m.e(options, "options");
        if (selectableChannel instanceof java.nio.channels.SocketChannel) {
            if (!io.ktor.network.sockets.TypeOfService.m453equalsimpl0(options.getTypeOfService(), io.ktor.network.sockets.TypeOfService.INSTANCE.m463getUNDEFINEDzieKYfw())) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Integer>) java.net.StandardSocketOptions.IP_TOS, java.lang.Integer.valueOf(options.getTypeOfService() & 255));
                } else {
                    ((java.nio.channels.SocketChannel) selectableChannel).socket().setTrafficClass(options.getTypeOfService() & 255);
                }
            }
            if (options.getReuseAddress()) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Boolean>) java.net.StandardSocketOptions.SO_REUSEADDR, java.lang.Boolean.TRUE);
                } else {
                    ((java.nio.channels.SocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.getReusePort()) {
                io.ktor.network.sockets.SocketOptionsPlatformCapabilities.INSTANCE.setReusePort((java.nio.channels.SocketChannel) selectableChannel);
            }
            if (options instanceof io.ktor.network.sockets.SocketOptions.PeerSocketOptions) {
                io.ktor.network.sockets.SocketOptions.PeerSocketOptions peerSocketOptions = (io.ktor.network.sockets.SocketOptions.PeerSocketOptions) options;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(peerSocketOptions.getReceiveBufferSize());
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Integer>) java.net.StandardSocketOptions.SO_RCVBUF, java.lang.Integer.valueOf(iIntValue));
                    } else {
                        ((java.nio.channels.SocketChannel) selectableChannel).socket().setReceiveBufferSize(iIntValue);
                    }
                }
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(peerSocketOptions.getSendBufferSize());
                if (numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    int iIntValue2 = numValueOf2.intValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Integer>) java.net.StandardSocketOptions.SO_SNDBUF, java.lang.Integer.valueOf(iIntValue2));
                    } else {
                        ((java.nio.channels.SocketChannel) selectableChannel).socket().setSendBufferSize(iIntValue2);
                    }
                }
            }
            if (options instanceof io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) {
                io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = (io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) options;
                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(tCPClientSocketOptions.getLingerSeconds());
                if (numValueOf3.intValue() < 0) {
                    numValueOf3 = null;
                }
                if (numValueOf3 != null) {
                    int iIntValue3 = numValueOf3.intValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Integer>) java.net.StandardSocketOptions.SO_LINGER, java.lang.Integer.valueOf(iIntValue3));
                    } else {
                        ((java.nio.channels.SocketChannel) selectableChannel).socket().setSoLinger(true, iIntValue3);
                    }
                }
                java.lang.Boolean keepAlive = tCPClientSocketOptions.getKeepAlive();
                if (keepAlive != null) {
                    boolean zBooleanValue = keepAlive.booleanValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Boolean>) java.net.StandardSocketOptions.SO_KEEPALIVE, keepAlive);
                    } else {
                        ((java.nio.channels.SocketChannel) selectableChannel).socket().setKeepAlive(zBooleanValue);
                    }
                }
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.SocketChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Boolean>) java.net.StandardSocketOptions.TCP_NODELAY, java.lang.Boolean.valueOf(tCPClientSocketOptions.getNoDelay()));
                } else {
                    ((java.nio.channels.SocketChannel) selectableChannel).socket().setTcpNoDelay(tCPClientSocketOptions.getNoDelay());
                }
            }
        }
        if (selectableChannel instanceof java.nio.channels.ServerSocketChannel) {
            if (options.getReuseAddress()) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.ServerSocketChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Boolean>) java.net.StandardSocketOptions.SO_REUSEADDR, java.lang.Boolean.TRUE);
                } else {
                    ((java.nio.channels.ServerSocketChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.getReusePort()) {
                io.ktor.network.sockets.SocketOptionsPlatformCapabilities.INSTANCE.setReusePort((java.nio.channels.ServerSocketChannel) selectableChannel);
            }
        }
        if (selectableChannel instanceof java.nio.channels.DatagramChannel) {
            if (!io.ktor.network.sockets.TypeOfService.m453equalsimpl0(options.getTypeOfService(), io.ktor.network.sockets.TypeOfService.INSTANCE.m463getUNDEFINEDzieKYfw())) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.DatagramChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Integer>) java.net.StandardSocketOptions.IP_TOS, java.lang.Integer.valueOf(options.getTypeOfService() & 255));
                } else {
                    ((java.nio.channels.DatagramChannel) selectableChannel).socket().setTrafficClass(options.getTypeOfService() & 255);
                }
            }
            if (options.getReuseAddress()) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.DatagramChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Boolean>) java.net.StandardSocketOptions.SO_REUSEADDR, java.lang.Boolean.TRUE);
                } else {
                    ((java.nio.channels.DatagramChannel) selectableChannel).socket().setReuseAddress(true);
                }
            }
            if (options.getReusePort()) {
                io.ktor.network.sockets.SocketOptionsPlatformCapabilities.INSTANCE.setReusePort((java.nio.channels.DatagramChannel) selectableChannel);
            }
            if (options instanceof io.ktor.network.sockets.SocketOptions.UDPSocketOptions) {
                if (java7NetworkApisAvailable) {
                    ((java.nio.channels.DatagramChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Boolean>) java.net.StandardSocketOptions.SO_BROADCAST, java.lang.Boolean.valueOf(((io.ktor.network.sockets.SocketOptions.UDPSocketOptions) options).getBroadcast()));
                } else {
                    ((java.nio.channels.DatagramChannel) selectableChannel).socket().setBroadcast(((io.ktor.network.sockets.SocketOptions.UDPSocketOptions) options).getBroadcast());
                }
            }
            if (options instanceof io.ktor.network.sockets.SocketOptions.PeerSocketOptions) {
                io.ktor.network.sockets.SocketOptions.PeerSocketOptions peerSocketOptions2 = (io.ktor.network.sockets.SocketOptions.PeerSocketOptions) options;
                java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(peerSocketOptions2.getReceiveBufferSize());
                if (numValueOf4.intValue() <= 0) {
                    numValueOf4 = null;
                }
                if (numValueOf4 != null) {
                    int iIntValue4 = numValueOf4.intValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.DatagramChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Integer>) java.net.StandardSocketOptions.SO_RCVBUF, java.lang.Integer.valueOf(iIntValue4));
                    } else {
                        ((java.nio.channels.DatagramChannel) selectableChannel).socket().setReceiveBufferSize(iIntValue4);
                    }
                }
                java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(peerSocketOptions2.getSendBufferSize());
                java.lang.Integer num = numValueOf5.intValue() > 0 ? numValueOf5 : null;
                if (num != null) {
                    int iIntValue5 = num.intValue();
                    if (java7NetworkApisAvailable) {
                        ((java.nio.channels.DatagramChannel) selectableChannel).setOption((java.net.SocketOption<java.lang.Integer>) java.net.StandardSocketOptions.SO_SNDBUF, java.lang.Integer.valueOf(iIntValue5));
                    } else {
                        ((java.nio.channels.DatagramChannel) selectableChannel).socket().setSendBufferSize(iIntValue5);
                    }
                }
            }
        }
    }

    public static final boolean getJava7NetworkApisAvailable() {
        return java7NetworkApisAvailable;
    }

    public static final void nonBlocking(java.nio.channels.SelectableChannel selectableChannel) throws java.io.IOException {
        kotlin.jvm.internal.m.e(selectableChannel, "<this>");
        selectableChannel.configureBlocking(false);
    }
}
