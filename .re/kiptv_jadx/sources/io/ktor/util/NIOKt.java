package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljava/nio/ByteBuffer;", "destination", "", "limit", "moveTo", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I", "", "moveToByteArray", "(Ljava/nio/ByteBuffer;)[B", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "", "decodeString", "(Ljava/nio/ByteBuffer;Ljava/nio/charset/Charset;)Ljava/lang/String;", "size", "copy", "(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;", "Lio/ktor/utils/io/pool/ObjectPool;", "pool", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/pool/ObjectPool;I)Ljava/nio/ByteBuffer;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class NIOKt {
    public static final java.nio.ByteBuffer copy(java.nio.ByteBuffer byteBuffer, int i3) {
        kotlin.jvm.internal.m.e(byteBuffer, "<this>");
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(i3);
        java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
        kotlin.jvm.internal.m.d(byteBufferSlice, "slice(...)");
        kotlin.jvm.internal.m.b(byteBufferAllocate);
        moveTo$default(byteBufferSlice, byteBufferAllocate, 0, 2, null);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static /* synthetic */ java.nio.ByteBuffer copy$default(java.nio.ByteBuffer byteBuffer, int i3, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            i3 = byteBuffer.remaining();
        }
        return copy(byteBuffer, i3);
    }

    public static final java.lang.String decodeString(java.nio.ByteBuffer byteBuffer, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(byteBuffer, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        java.lang.String string = charset.decode(byteBuffer).toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String decodeString$default(java.nio.ByteBuffer byteBuffer, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            charset = O7.a.f8024b;
        }
        return decodeString(byteBuffer, charset);
    }

    public static final int moveTo(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer destination, int i3) {
        kotlin.jvm.internal.m.e(byteBuffer, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        int iMin = java.lang.Math.min(i3, java.lang.Math.min(byteBuffer.remaining(), destination.remaining()));
        if (iMin == byteBuffer.remaining()) {
            destination.put(byteBuffer);
            return iMin;
        }
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        destination.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    public static /* synthetic */ int moveTo$default(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i3, int i9, java.lang.Object obj) {
        if ((i9 & 2) != 0) {
            i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        return moveTo(byteBuffer, byteBuffer2, i3);
    }

    public static final byte[] moveToByteArray(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.m.e(byteBuffer, "<this>");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static /* synthetic */ java.nio.ByteBuffer copy$default(java.nio.ByteBuffer byteBuffer, io.ktor.utils.io.pool.ObjectPool objectPool, int i3, int i9, java.lang.Object obj) {
        if ((i9 & 2) != 0) {
            i3 = byteBuffer.remaining();
        }
        return copy(byteBuffer, objectPool, i3);
    }

    public static final java.nio.ByteBuffer copy(java.nio.ByteBuffer byteBuffer, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool, int i3) {
        kotlin.jvm.internal.m.e(byteBuffer, "<this>");
        kotlin.jvm.internal.m.e(pool, "pool");
        java.nio.ByteBuffer byteBufferBorrow = pool.borrow();
        byteBufferBorrow.limit(i3);
        java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
        kotlin.jvm.internal.m.d(byteBufferSlice, "slice(...)");
        moveTo$default(byteBufferSlice, byteBufferBorrow, 0, 2, null);
        byteBufferBorrow.flip();
        return byteBufferBorrow;
    }
}
