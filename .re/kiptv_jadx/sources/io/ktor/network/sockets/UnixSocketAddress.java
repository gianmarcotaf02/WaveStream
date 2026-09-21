package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\n¨\u0006\u001b"}, d2 = {"Lio/ktor/network/sockets/UnixSocketAddress;", "Lio/ktor/network/sockets/SocketAddress;", "Ljava/net/SocketAddress;", io.sentry.SentryLockReason.JsonKeys.ADDRESS, "<init>", "(Ljava/net/SocketAddress;)V", "", "path", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/ktor/network/sockets/UnixSocketAddress;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/net/SocketAddress;", "getAddress$ktor_network", "()Ljava/net/SocketAddress;", "getPath", "Companion", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UnixSocketAddress extends io.ktor.network.sockets.SocketAddress {
    private static final io.ktor.network.sockets.UnixSocketAddress.Companion Companion = new io.ktor.network.sockets.UnixSocketAddress.Companion(0 == true ? 1 : 0);
    private static final java.lang.Class<?> unixDomainSocketAddressClass;
    private final java.net.SocketAddress address;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/network/sockets/UnixSocketAddress$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "checkSupportForUnixDomainSockets", "()Ljava/lang/Class;", "unixDomainSocketAddressClass", "Ljava/lang/Class;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.Class<?> checkSupportForUnixDomainSockets() {
            java.lang.Class<?> cls = io.ktor.network.sockets.UnixSocketAddress.unixDomainSocketAddressClass;
            if (cls != null) {
                return cls;
            }
            throw new java.lang.IllegalStateException("Unix domain sockets are unsupported before Java 16.");
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.Class<?> cls = null;
        try {
            cls = java.lang.Class.forName(io.ktor.network.sockets.SocketAddressJvmKt.UNIX_DOMAIN_SOCKET_ADDRESS_CLASS);
        } catch (java.lang.ClassNotFoundException unused) {
        }
        unixDomainSocketAddressClass = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnixSocketAddress(java.net.SocketAddress address) {
        super(null);
        kotlin.jvm.internal.m.e(address, "address");
        this.address = address;
        if (!getAddress().getClass().getName().equals(io.ktor.network.sockets.SocketAddressJvmKt.UNIX_DOMAIN_SOCKET_ADDRESS_CLASS)) {
            throw new java.lang.IllegalStateException("address should be java.net.UnixDomainSocketAddress");
        }
    }

    public static /* synthetic */ io.ktor.network.sockets.UnixSocketAddress copy$default(io.ktor.network.sockets.UnixSocketAddress unixSocketAddress, java.lang.String str, int i3, java.lang.Object obj) throws java.lang.NoSuchMethodException {
        if ((i3 & 1) != 0) {
            str = unixSocketAddress.getPath();
        }
        return unixSocketAddress.copy(str);
    }

    public final java.lang.String component1() {
        return getPath();
    }

    public final io.ktor.network.sockets.UnixSocketAddress copy(java.lang.String path) {
        kotlin.jvm.internal.m.e(path, "path");
        return new io.ktor.network.sockets.UnixSocketAddress(path);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!io.ktor.network.sockets.UnixSocketAddress.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(other, "null cannot be cast to non-null type io.ktor.network.sockets.UnixSocketAddress");
        return kotlin.jvm.internal.m.a(getAddress(), ((io.ktor.network.sockets.UnixSocketAddress) other).getAddress());
    }

    @Override // io.ktor.network.sockets.SocketAddress
    /* JADX INFO: renamed from: getAddress$ktor_network, reason: from getter */
    public java.net.SocketAddress getAddress() {
        return this.address;
    }

    public final java.lang.String getPath() throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method method = Companion.checkSupportForUnixDomainSockets().getMethod("getPath", null);
        kotlin.jvm.internal.m.d(method, "getMethod(...)");
        return method.invoke(getAddress(), null).toString();
    }

    public int hashCode() {
        return getAddress().hashCode();
    }

    public java.lang.String toString() {
        return getAddress().toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UnixSocketAddress(java.lang.String path) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        kotlin.jvm.internal.m.e(path, "path");
        java.lang.Object objInvoke = Companion.checkSupportForUnixDomainSockets().getMethod("of", java.lang.String.class).invoke(null, path);
        kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.net.SocketAddress");
        this((java.net.SocketAddress) objInvoke);
    }
}
