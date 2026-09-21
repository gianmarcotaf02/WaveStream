package io.ktor.util;

import androidx.media3.common.util.Log;
import androidx.media3.container.NalUnitUtil;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljava/nio/ByteBuffer;", "destination", "", "limit", "moveTo", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I", "", "moveToByteArray", "(Ljava/nio/ByteBuffer;)[B", "Ljava/nio/charset/Charset;", HttpAuthHeader.Parameters.Charset, "", "decodeString", "(Ljava/nio/ByteBuffer;Ljava/nio/charset/Charset;)Ljava/lang/String;", "size", "copy", "(Ljava/nio/ByteBuffer;I)Ljava/nio/ByteBuffer;", "Lio/ktor/utils/io/pool/ObjectPool;", "pool", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/pool/ObjectPool;I)Ljava/nio/ByteBuffer;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class NIOKt {
    public static final ByteBuffer copy(ByteBuffer byteBuffer, int i3) {
        m.e(byteBuffer, "<this>");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i3);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        m.d(byteBufferSlice, "slice(...)");
        m.b(byteBufferAllocate);
        moveTo$default(byteBufferSlice, byteBufferAllocate, 0, 2, null);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static ByteBuffer copy$default(ByteBuffer byteBuffer, int i3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = byteBuffer.remaining();
        }
        return copy(byteBuffer, i3);
    }

    public static final String decodeString(ByteBuffer byteBuffer, Charset charset) {
        m.e(byteBuffer, "<this>");
        m.e(charset, "charset");
        String string = charset.decode(byteBuffer).toString();
        m.d(string, "toString(...)");
        return string;
    }

    public static String decodeString$default(ByteBuffer byteBuffer, Charset charset, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charset = O7.a.f8024b;
        }
        return decodeString(byteBuffer, charset);
    }

    public static final int moveTo(ByteBuffer byteBuffer, ByteBuffer destination, int i3) {
        m.e(byteBuffer, "<this>");
        m.e(destination, "destination");
        int iMin = Math.min(i3, Math.min(byteBuffer.remaining(), destination.remaining()));
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

    public static int moveTo$default(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i3, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i3 = Log.LOG_LEVEL_OFF;
        }
        return moveTo(byteBuffer, byteBuffer2, i3);
    }

    public static final byte[] moveToByteArray(ByteBuffer byteBuffer) {
        m.e(byteBuffer, "<this>");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static ByteBuffer copy$default(ByteBuffer byteBuffer, ObjectPool objectPool, int i3, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i3 = byteBuffer.remaining();
        }
        return copy(byteBuffer, objectPool, i3);
    }

    public static final ByteBuffer copy(ByteBuffer byteBuffer, ObjectPool<ByteBuffer> pool, int i3) {
        m.e(byteBuffer, "<this>");
        m.e(pool, "pool");
        ByteBuffer byteBufferBorrow = pool.borrow();
        byteBufferBorrow.limit(i3);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        m.d(byteBufferSlice, "slice(...)");
        moveTo$default(byteBufferSlice, byteBufferBorrow, 0, 2, null);
        byteBufferBorrow.flip();
        return byteBufferBorrow;
    }
}
