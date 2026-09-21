package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 )2\u00020\u0001:\u0006*+,-.)B\u001f\b\u0004\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0000H ¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%\u0082\u0001\u0003\u0011/\r¨\u00060"}, d2 = {"Lio/ktor/network/sockets/SocketOptions;", "", "", "customOptions", "<init>", "(Ljava/util/Map;)V", "copy$ktor_network", "()Lio/ktor/network/sockets/SocketOptions;", "copy", "from", "Lh6/A;", "copyCommon", "(Lio/ktor/network/sockets/SocketOptions;)V", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "peer$ktor_network", "()Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "peer", "Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "tcpAccept$ktor_network", "()Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "tcpAccept", "Ljava/util/Map;", "getCustomOptions", "()Ljava/util/Map;", "Lio/ktor/network/sockets/TypeOfService;", "typeOfService", "B", "getTypeOfService-zieKYfw", "()B", "setTypeOfService-SNCuOGA", "(B)V", "", "reuseAddress", "Z", "getReuseAddress", "()Z", "setReuseAddress", "(Z)V", "reusePort", "getReusePort", "setReusePort", "Companion", "GeneralSocketOptions", "AcceptorOptions", "PeerSocketOptions", "UDPSocketOptions", "TCPClientSocketOptions", "Lio/ktor/network/sockets/SocketOptions$GeneralSocketOptions;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SocketOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.network.sockets.SocketOptions.Companion INSTANCE = new io.ktor.network.sockets.SocketOptions.Companion(null);
    private final java.util.Map<java.lang.Object, java.lang.Object> customOptions;
    private boolean reuseAddress;
    private boolean reusePort;
    private byte typeOfService;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "Lio/ktor/network/sockets/SocketOptions;", "", "", "customOptions", "<init>", "(Ljava/util/Map;)V", "copy$ktor_network", "()Lio/ktor/network/sockets/SocketOptions$AcceptorOptions;", "copy", "", "backlogSize", "I", "getBacklogSize", "()I", "setBacklogSize", "(I)V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AcceptorOptions extends io.ktor.network.sockets.SocketOptions {
        private int backlogSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AcceptorOptions(java.util.Map<java.lang.Object, java.lang.Object> customOptions) {
            super(customOptions, null);
            kotlin.jvm.internal.m.e(customOptions, "customOptions");
            this.backlogSize = 511;
        }

        public final int getBacklogSize() {
            return this.backlogSize;
        }

        public final void setBacklogSize(int i3) {
            this.backlogSize = i3;
        }

        @Override // io.ktor.network.sockets.SocketOptions
        public io.ktor.network.sockets.SocketOptions.AcceptorOptions copy$ktor_network() {
            io.ktor.network.sockets.SocketOptions.AcceptorOptions acceptorOptions = new io.ktor.network.sockets.SocketOptions.AcceptorOptions(new java.util.HashMap(getCustomOptions()));
            acceptorOptions.copyCommon(this);
            return acceptorOptions;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lio/ktor/network/sockets/SocketOptions$Companion;", "", "<init>", "()V", "Lio/ktor/network/sockets/SocketOptions;", "create$ktor_network", "()Lio/ktor/network/sockets/SocketOptions;", "create", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.ktor.network.sockets.SocketOptions create$ktor_network() {
            return new io.ktor.network.sockets.SocketOptions.GeneralSocketOptions(new java.util.HashMap());
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/network/sockets/SocketOptions$GeneralSocketOptions;", "Lio/ktor/network/sockets/SocketOptions;", "", "", "customOptions", "<init>", "(Ljava/util/Map;)V", "copy$ktor_network", "()Lio/ktor/network/sockets/SocketOptions$GeneralSocketOptions;", "copy", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class GeneralSocketOptions extends io.ktor.network.sockets.SocketOptions {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeneralSocketOptions(java.util.Map<java.lang.Object, java.lang.Object> customOptions) {
            super(customOptions, null);
            kotlin.jvm.internal.m.e(customOptions, "customOptions");
        }

        @Override // io.ktor.network.sockets.SocketOptions
        public io.ktor.network.sockets.SocketOptions.GeneralSocketOptions copy$ktor_network() {
            io.ktor.network.sockets.SocketOptions.GeneralSocketOptions generalSocketOptions = new io.ktor.network.sockets.SocketOptions.GeneralSocketOptions(new java.util.HashMap(getCustomOptions()));
            generalSocketOptions.copyCommon(this);
            return generalSocketOptions;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006 "}, d2 = {"Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "Lio/ktor/network/sockets/SocketOptions;", "", "", "customOptions", "<init>", "(Ljava/util/Map;)V", "from", "Lh6/A;", "copyCommon", "(Lio/ktor/network/sockets/SocketOptions;)V", "copy$ktor_network", "()Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "copy", "Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "tcpConnect$ktor_network", "()Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "tcpConnect", "Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "udp$ktor_network", "()Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "udp", "", "sendBufferSize", "I", "getSendBufferSize", "()I", "setSendBufferSize", "(I)V", "receiveBufferSize", "getReceiveBufferSize", "setReceiveBufferSize", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static class PeerSocketOptions extends io.ktor.network.sockets.SocketOptions {
        private int receiveBufferSize;
        private int sendBufferSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PeerSocketOptions(java.util.Map<java.lang.Object, java.lang.Object> customOptions) {
            super(customOptions, null);
            kotlin.jvm.internal.m.e(customOptions, "customOptions");
            this.sendBufferSize = -1;
            this.receiveBufferSize = -1;
        }

        @Override // io.ktor.network.sockets.SocketOptions
        public void copyCommon(io.ktor.network.sockets.SocketOptions from) {
            kotlin.jvm.internal.m.e(from, "from");
            super.copyCommon(from);
            if (from instanceof io.ktor.network.sockets.SocketOptions.PeerSocketOptions) {
                io.ktor.network.sockets.SocketOptions.PeerSocketOptions peerSocketOptions = (io.ktor.network.sockets.SocketOptions.PeerSocketOptions) from;
                this.sendBufferSize = peerSocketOptions.sendBufferSize;
                this.receiveBufferSize = peerSocketOptions.receiveBufferSize;
            }
        }

        public final int getReceiveBufferSize() {
            return this.receiveBufferSize;
        }

        public final int getSendBufferSize() {
            return this.sendBufferSize;
        }

        public final void setReceiveBufferSize(int i3) {
            this.receiveBufferSize = i3;
        }

        public final void setSendBufferSize(int i3) {
            this.sendBufferSize = i3;
        }

        public final io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tcpConnect$ktor_network() {
            io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = new io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions(new java.util.HashMap(getCustomOptions()));
            copyCommon(this);
            return tCPClientSocketOptions;
        }

        public final io.ktor.network.sockets.SocketOptions.UDPSocketOptions udp$ktor_network() {
            io.ktor.network.sockets.SocketOptions.UDPSocketOptions uDPSocketOptions = new io.ktor.network.sockets.SocketOptions.UDPSocketOptions(new java.util.HashMap(getCustomOptions()));
            copyCommon(this);
            return uDPSocketOptions;
        }

        @Override // io.ktor.network.sockets.SocketOptions
        public io.ktor.network.sockets.SocketOptions.PeerSocketOptions copy$ktor_network() {
            io.ktor.network.sockets.SocketOptions.PeerSocketOptions peerSocketOptions = new io.ktor.network.sockets.SocketOptions.PeerSocketOptions(new java.util.HashMap(getCustomOptions()));
            peerSocketOptions.copyCommon(this);
            return peerSocketOptions;
        }
    }

    public /* synthetic */ SocketOptions(java.util.Map map, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(map);
    }

    public abstract io.ktor.network.sockets.SocketOptions copy$ktor_network();

    public void copyCommon(io.ktor.network.sockets.SocketOptions from) {
        kotlin.jvm.internal.m.e(from, "from");
        this.typeOfService = from.typeOfService;
        this.reuseAddress = from.reuseAddress;
        this.reusePort = from.reusePort;
    }

    public final java.util.Map<java.lang.Object, java.lang.Object> getCustomOptions() {
        return this.customOptions;
    }

    public final boolean getReuseAddress() {
        return this.reuseAddress;
    }

    public final boolean getReusePort() {
        return this.reusePort;
    }

    /* JADX INFO: renamed from: getTypeOfService-zieKYfw, reason: not valid java name and from getter */
    public final byte getTypeOfService() {
        return this.typeOfService;
    }

    public final io.ktor.network.sockets.SocketOptions.PeerSocketOptions peer$ktor_network() {
        io.ktor.network.sockets.SocketOptions.PeerSocketOptions peerSocketOptions = new io.ktor.network.sockets.SocketOptions.PeerSocketOptions(new java.util.HashMap(this.customOptions));
        copyCommon(this);
        return peerSocketOptions;
    }

    public final void setReuseAddress(boolean z6) {
        this.reuseAddress = z6;
    }

    public final void setReusePort(boolean z6) {
        this.reusePort = z6;
    }

    /* JADX INFO: renamed from: setTypeOfService-SNCuOGA, reason: not valid java name */
    public final void m448setTypeOfServiceSNCuOGA(byte b9) {
        this.typeOfService = b9;
    }

    public final io.ktor.network.sockets.SocketOptions.AcceptorOptions tcpAccept$ktor_network() {
        io.ktor.network.sockets.SocketOptions.AcceptorOptions acceptorOptions = new io.ktor.network.sockets.SocketOptions.AcceptorOptions(new java.util.HashMap(this.customOptions));
        acceptorOptions.copyCommon(this);
        return acceptorOptions;
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "", "", "customOptions", "<init>", "(Ljava/util/Map;)V", "Lio/ktor/network/sockets/SocketOptions;", "from", "Lh6/A;", "copyCommon", "(Lio/ktor/network/sockets/SocketOptions;)V", "copy$ktor_network", "()Lio/ktor/network/sockets/SocketOptions$TCPClientSocketOptions;", "copy", "", "noDelay", "Z", "getNoDelay", "()Z", "setNoDelay", "(Z)V", "", "lingerSeconds", "I", "getLingerSeconds", "()I", "setLingerSeconds", "(I)V", "keepAlive", "Ljava/lang/Boolean;", "getKeepAlive", "()Ljava/lang/Boolean;", "setKeepAlive", "(Ljava/lang/Boolean;)V", "", "socketTimeout", "J", "getSocketTimeout", "()J", "setSocketTimeout", "(J)V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class TCPClientSocketOptions extends io.ktor.network.sockets.SocketOptions.PeerSocketOptions {
        private java.lang.Boolean keepAlive;
        private int lingerSeconds;
        private boolean noDelay;
        private long socketTimeout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TCPClientSocketOptions(java.util.Map<java.lang.Object, java.lang.Object> customOptions) {
            super(customOptions);
            kotlin.jvm.internal.m.e(customOptions, "customOptions");
            this.noDelay = true;
            this.lingerSeconds = -1;
            this.socketTimeout = Long.MAX_VALUE;
        }

        @Override // io.ktor.network.sockets.SocketOptions.PeerSocketOptions, io.ktor.network.sockets.SocketOptions
        public void copyCommon(io.ktor.network.sockets.SocketOptions from) {
            kotlin.jvm.internal.m.e(from, "from");
            super.copyCommon(from);
            if (from instanceof io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) {
                io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = (io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions) from;
                this.noDelay = tCPClientSocketOptions.noDelay;
                this.lingerSeconds = tCPClientSocketOptions.lingerSeconds;
                this.keepAlive = tCPClientSocketOptions.keepAlive;
            }
        }

        public final java.lang.Boolean getKeepAlive() {
            return this.keepAlive;
        }

        public final int getLingerSeconds() {
            return this.lingerSeconds;
        }

        public final boolean getNoDelay() {
            return this.noDelay;
        }

        public final long getSocketTimeout() {
            return this.socketTimeout;
        }

        public final void setKeepAlive(java.lang.Boolean bool) {
            this.keepAlive = bool;
        }

        public final void setLingerSeconds(int i3) {
            this.lingerSeconds = i3;
        }

        public final void setNoDelay(boolean z6) {
            this.noDelay = z6;
        }

        public final void setSocketTimeout(long j) {
            this.socketTimeout = j;
        }

        @Override // io.ktor.network.sockets.SocketOptions.PeerSocketOptions, io.ktor.network.sockets.SocketOptions
        public io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions copy$ktor_network() {
            io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions = new io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions(new java.util.HashMap(getCustomOptions()));
            tCPClientSocketOptions.copyCommon(this);
            return tCPClientSocketOptions;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "Lio/ktor/network/sockets/SocketOptions$PeerSocketOptions;", "", "", "customOptions", "<init>", "(Ljava/util/Map;)V", "Lio/ktor/network/sockets/SocketOptions;", "from", "Lh6/A;", "copyCommon", "(Lio/ktor/network/sockets/SocketOptions;)V", "copy$ktor_network", "()Lio/ktor/network/sockets/SocketOptions$UDPSocketOptions;", "copy", "", "broadcast", "Z", "getBroadcast", "()Z", "setBroadcast", "(Z)V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class UDPSocketOptions extends io.ktor.network.sockets.SocketOptions.PeerSocketOptions {
        private boolean broadcast;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UDPSocketOptions(java.util.Map<java.lang.Object, java.lang.Object> customOptions) {
            super(customOptions);
            kotlin.jvm.internal.m.e(customOptions, "customOptions");
        }

        @Override // io.ktor.network.sockets.SocketOptions.PeerSocketOptions, io.ktor.network.sockets.SocketOptions
        public void copyCommon(io.ktor.network.sockets.SocketOptions from) {
            kotlin.jvm.internal.m.e(from, "from");
            super.copyCommon(from);
            if (from instanceof io.ktor.network.sockets.SocketOptions.UDPSocketOptions) {
                this.broadcast = ((io.ktor.network.sockets.SocketOptions.UDPSocketOptions) from).broadcast;
            }
        }

        public final boolean getBroadcast() {
            return this.broadcast;
        }

        public final void setBroadcast(boolean z6) {
            this.broadcast = z6;
        }

        @Override // io.ktor.network.sockets.SocketOptions.PeerSocketOptions, io.ktor.network.sockets.SocketOptions
        public io.ktor.network.sockets.SocketOptions.UDPSocketOptions copy$ktor_network() {
            io.ktor.network.sockets.SocketOptions.UDPSocketOptions uDPSocketOptions = new io.ktor.network.sockets.SocketOptions.UDPSocketOptions(new java.util.HashMap(getCustomOptions()));
            uDPSocketOptions.copyCommon(this);
            return uDPSocketOptions;
        }
    }

    private SocketOptions(java.util.Map<java.lang.Object, java.lang.Object> map) {
        this.customOptions = map;
        this.typeOfService = io.ktor.network.sockets.TypeOfService.INSTANCE.m463getUNDEFINEDzieKYfw();
    }
}
