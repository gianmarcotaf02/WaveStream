package io.ktor.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/nio/ByteBuffer;", io.sentry.protocol.Request.JsonKeys.OTHER, "Lh6/A;", "xor", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V", "", "getOUTGOING_CHANNEL_CAPACITY", "()I", "OUTGOING_CHANNEL_CAPACITY", "ktor-websockets"}, k = 5, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED, xs = "io/ktor/websocket/UtilsKt")
final /* synthetic */ class UtilsKt__UtilsJvmKt {
    public static final int getOUTGOING_CHANNEL_CAPACITY() {
        java.lang.String property = java.lang.System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        if (property != null) {
            return java.lang.Integer.parseInt(property);
        }
        return 8;
    }

    public static final void xor(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer other) {
        kotlin.jvm.internal.m.e(byteBuffer, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
        java.nio.ByteBuffer byteBufferSlice2 = other.slice();
        int iRemaining = byteBufferSlice2.remaining();
        int iRemaining2 = byteBufferSlice.remaining();
        for (int i3 = 0; i3 < iRemaining2; i3++) {
            byteBufferSlice.put(i3, (byte) (byteBufferSlice.get(i3) ^ byteBufferSlice2.get(i3 % iRemaining)));
        }
    }
}
