package io.ktor.util.network;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u0019\u0010\u0001\u001a\u00020\u0000*\u00060\u0004j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0019\u0010\u000b\u001a\u00020\u0000*\u00060\u0004j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\t\"\u0019\u0010\u0003\u001a\u00020\u0002*\u00060\u0004j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\r*\n\u0010\u0006\"\u00020\u00042\u00020\u0004*\n\u0010\u000f\"\u00020\u000e2\u00020\u000e¨\u0006\u0010"}, d2 = {"", "hostname", "", "port", "Ljava/net/SocketAddress;", "Lio/ktor/util/network/NetworkAddress;", "NetworkAddress", "(Ljava/lang/String;I)Ljava/net/SocketAddress;", "getHostname", "(Ljava/net/SocketAddress;)Ljava/lang/String;", "getAddress", io.sentry.SentryLockReason.JsonKeys.ADDRESS, "getPort", "(Ljava/net/SocketAddress;)I", "Ljava/nio/channels/UnresolvedAddressException;", "UnresolvedAddressException", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class NetworkAddressJvmKt {
    public static final java.net.SocketAddress NetworkAddress(java.lang.String hostname, int i3) {
        kotlin.jvm.internal.m.e(hostname, "hostname");
        return new java.net.InetSocketAddress(hostname, i3);
    }

    public static final java.lang.String getAddress(java.net.SocketAddress socketAddress) {
        java.lang.String hostString;
        kotlin.jvm.internal.m.e(socketAddress, "<this>");
        java.net.InetSocketAddress inetSocketAddress = socketAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) socketAddress : null;
        return (inetSocketAddress == null || (hostString = inetSocketAddress.getHostString()) == null) ? "" : hostString;
    }

    public static final java.lang.String getHostname(java.net.SocketAddress socketAddress) {
        java.net.InetAddress address;
        java.lang.String hostName;
        kotlin.jvm.internal.m.e(socketAddress, "<this>");
        boolean z6 = socketAddress instanceof java.net.InetSocketAddress;
        java.lang.String hostName2 = null;
        java.net.InetSocketAddress inetSocketAddress = z6 ? (java.net.InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null && (hostName = inetSocketAddress.getHostName()) != null) {
            return hostName;
        }
        java.net.InetSocketAddress inetSocketAddress2 = z6 ? (java.net.InetSocketAddress) socketAddress : null;
        if (inetSocketAddress2 != null && (address = inetSocketAddress2.getAddress()) != null) {
            hostName2 = address.getHostName();
        }
        return hostName2 == null ? "" : hostName2;
    }

    public static final int getPort(java.net.SocketAddress socketAddress) {
        kotlin.jvm.internal.m.e(socketAddress, "<this>");
        java.net.InetSocketAddress inetSocketAddress = socketAddress instanceof java.net.InetSocketAddress ? (java.net.InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null) {
            return inetSocketAddress.getPort();
        }
        return 0;
    }
}
