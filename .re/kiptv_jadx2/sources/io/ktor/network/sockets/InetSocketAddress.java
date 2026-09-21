package io.ktor.network.sockets;

import androidx.media3.container.NalUnitUtil;
import io.sentry.SentryLockReason;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lio/ktor/network/sockets/InetSocketAddress;", "Lio/ktor/network/sockets/SocketAddress;", "Ljava/net/InetSocketAddress;", SentryLockReason.JsonKeys.ADDRESS, "<init>", "(Ljava/net/InetSocketAddress;)V", "", "hostname", "", "port", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lio/ktor/network/sockets/InetSocketAddress;", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/net/InetSocketAddress;", "getAddress$ktor_network", "()Ljava/net/InetSocketAddress;", "getHostname", "getPort", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class InetSocketAddress extends SocketAddress {
    private final java.net.InetSocketAddress address;

    public InetSocketAddress(java.net.InetSocketAddress address) {
        super(null);
        m.e(address, "address");
        this.address = address;
    }

    public static InetSocketAddress copy$default(InetSocketAddress inetSocketAddress, String str, int i3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = inetSocketAddress.getHostname();
        }
        if ((i9 & 2) != 0) {
            i3 = inetSocketAddress.getPort();
        }
        return inetSocketAddress.copy(str, i3);
    }

    public final String component1() {
        return getHostname();
    }

    public final int component2() {
        return getPort();
    }

    public final InetSocketAddress copy(String hostname, int port) {
        m.e(hostname, "hostname");
        return new InetSocketAddress(hostname, port);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!InetSocketAddress.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        m.c(other, "null cannot be cast to non-null type io.ktor.network.sockets.InetSocketAddress");
        return m.a(getAddress(), ((InetSocketAddress) other).getAddress());
    }

    public final String getHostname() {
        String hostName = getAddress().getHostName();
        m.d(hostName, "getHostName(...)");
        return hostName;
    }

    public final int getPort() {
        return getAddress().getPort();
    }

    public int hashCode() {
        return getAddress().hashCode();
    }

    public String toString() {
        String string = getAddress().toString();
        m.d(string, "toString(...)");
        return string;
    }

    @Override
    public java.net.InetSocketAddress getAddress() {
        return this.address;
    }

    public InetSocketAddress(String hostname, int i3) {
        this(new java.net.InetSocketAddress(hostname, i3));
        m.e(hostname, "hostname");
    }
}
