package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0006¨\u0006\u0018"}, d2 = {"Lio/ktor/network/sockets/TypeOfService;", "", "", "value", "constructor-impl", "(I)B", "Lh6/r;", "(B)B", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "B", "getValue-w2LRezQ", "()B", "getIntValue-impl", "(B)I", "intValue", "Companion", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class TypeOfService {
    private final byte value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.network.sockets.TypeOfService.Companion INSTANCE = new io.ktor.network.sockets.TypeOfService.Companion(null);
    private static final byte UNDEFINED = m450constructorimpl((byte) 0);
    private static final byte IPTOS_LOWCOST = m450constructorimpl((byte) 2);
    private static final byte IPTOS_RELIABILITY = m450constructorimpl((byte) 4);
    private static final byte IPTOS_THROUGHPUT = m450constructorimpl((byte) 8);
    private static final byte IPTOS_LOWDELAY = m450constructorimpl((byte) 16);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lio/ktor/network/sockets/TypeOfService$Companion;", "", "<init>", "()V", "Lio/ktor/network/sockets/TypeOfService;", "UNDEFINED", "B", "getUNDEFINED-zieKYfw", "()B", "IPTOS_LOWCOST", "getIPTOS_LOWCOST-zieKYfw", "IPTOS_RELIABILITY", "getIPTOS_RELIABILITY-zieKYfw", "IPTOS_THROUGHPUT", "getIPTOS_THROUGHPUT-zieKYfw", "IPTOS_LOWDELAY", "getIPTOS_LOWDELAY-zieKYfw", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX INFO: renamed from: getIPTOS_LOWCOST-zieKYfw, reason: not valid java name */
        public final byte m459getIPTOS_LOWCOSTzieKYfw() {
            return io.ktor.network.sockets.TypeOfService.IPTOS_LOWCOST;
        }

        /* JADX INFO: renamed from: getIPTOS_LOWDELAY-zieKYfw, reason: not valid java name */
        public final byte m460getIPTOS_LOWDELAYzieKYfw() {
            return io.ktor.network.sockets.TypeOfService.IPTOS_LOWDELAY;
        }

        /* JADX INFO: renamed from: getIPTOS_RELIABILITY-zieKYfw, reason: not valid java name */
        public final byte m461getIPTOS_RELIABILITYzieKYfw() {
            return io.ktor.network.sockets.TypeOfService.IPTOS_RELIABILITY;
        }

        /* JADX INFO: renamed from: getIPTOS_THROUGHPUT-zieKYfw, reason: not valid java name */
        public final byte m462getIPTOS_THROUGHPUTzieKYfw() {
            return io.ktor.network.sockets.TypeOfService.IPTOS_THROUGHPUT;
        }

        /* JADX INFO: renamed from: getUNDEFINED-zieKYfw, reason: not valid java name */
        public final byte m463getUNDEFINEDzieKYfw() {
            return io.ktor.network.sockets.TypeOfService.UNDEFINED;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TypeOfService(byte b9) {
        this.value = b9;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ io.ktor.network.sockets.TypeOfService m449boximpl(byte b9) {
        return new io.ktor.network.sockets.TypeOfService(b9);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m450constructorimpl(byte b9) {
        return b9;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m452equalsimpl(byte b9, java.lang.Object obj) {
        return (obj instanceof io.ktor.network.sockets.TypeOfService) && b9 == ((io.ktor.network.sockets.TypeOfService) obj).m458unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m453equalsimpl0(byte b9, byte b10) {
        return b9 == b10;
    }

    /* JADX INFO: renamed from: getIntValue-impl, reason: not valid java name */
    public static final int m454getIntValueimpl(byte b9) {
        return b9 & 255;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m455hashCodeimpl(byte b9) {
        return java.lang.Byte.hashCode(b9);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m456toStringimpl(byte b9) {
        return "TypeOfService(value=" + ((java.lang.Object) java.lang.String.valueOf(b9 & 255)) + ')';
    }

    public boolean equals(java.lang.Object other) {
        return m452equalsimpl(this.value, other);
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name and from getter */
    public final byte getValue() {
        return this.value;
    }

    public int hashCode() {
        return m455hashCodeimpl(this.value);
    }

    public java.lang.String toString() {
        return m456toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m458unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m451constructorimpl(int i3) {
        return m450constructorimpl((byte) i3);
    }
}
