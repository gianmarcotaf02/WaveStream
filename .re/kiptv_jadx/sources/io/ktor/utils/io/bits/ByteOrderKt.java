package io.ktor.utils.io.bits;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0003\u001a\u00020\u0007*\u00020\u0007¢\u0006\u0004\b\b\u0010\t\"\u0016\u0010\u000e\u001a\u00020\u000b*\u00020\n8Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\n8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0016\u0010\u0014\u001a\u00020\n*\u00020\u00118Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0016\u0010\u0016\u001a\u00020\n*\u00020\u00118Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\"\u0016\u0010\u001a\u001a\u00020\u0011*\u00020\u00178Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0016\u0010\u001c\u001a\u00020\u0011*\u00020\u00178Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lh6/y;", "reverseByteOrder-xj2QHRw", "(S)S", "reverseByteOrder", "Lh6/t;", "reverseByteOrder-WZ4Q5Ns", "(I)I", "Lh6/v;", "reverseByteOrder-VKZWuLQ", "(J)J", "", "", "getHighByte", "(S)B", "highByte", "getLowByte", "lowByte", "", "getHighShort", "(I)S", "highShort", "getLowShort", "lowShort", "", "getHighInt", "(J)I", "highInt", "getLowInt", "lowInt", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteOrderKt {
    public static final byte getHighByte(short s9) {
        return (byte) (s9 >>> 8);
    }

    public static final int getHighInt(long j) {
        return (int) (j >>> 32);
    }

    public static final short getHighShort(int i3) {
        return (short) (i3 >>> 16);
    }

    public static final byte getLowByte(short s9) {
        return (byte) (s9 & 255);
    }

    public static final int getLowInt(long j) {
        return (int) (j & 4294967295L);
    }

    public static final short getLowShort(int i3) {
        return (short) (i3 & io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE);
    }

    /* JADX INFO: renamed from: reverseByteOrder-VKZWuLQ, reason: not valid java name */
    public static final long m495reverseByteOrderVKZWuLQ(long j) {
        return java.lang.Long.reverseBytes(j);
    }

    /* JADX INFO: renamed from: reverseByteOrder-WZ4Q5Ns, reason: not valid java name */
    public static final int m496reverseByteOrderWZ4Q5Ns(int i3) {
        return java.lang.Integer.reverseBytes(i3);
    }

    /* JADX INFO: renamed from: reverseByteOrder-xj2QHRw, reason: not valid java name */
    public static final short m497reverseByteOrderxj2QHRw(short s9) {
        return java.lang.Short.reverseBytes(s9);
    }
}
