package io.ktor.network.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"", "DEFAULT_BYTE_BUFFER_POOL_SIZE", "I", "DEFAULT_BYTE_BUFFER_BUFFER_SIZE", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "DefaultByteBufferPool", "Lio/ktor/utils/io/pool/ObjectPool;", "getDefaultByteBufferPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "DefaultDatagramByteBufferPool", "getDefaultDatagramByteBufferPool", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PoolsKt {
    public static final int DEFAULT_BYTE_BUFFER_BUFFER_SIZE = 4096;
    public static final int DEFAULT_BYTE_BUFFER_POOL_SIZE = 4096;
    private static final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> DefaultByteBufferPool = new io.ktor.utils.io.pool.DirectByteBufferPool(4096, 4096);
    private static final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> DefaultDatagramByteBufferPool = new io.ktor.utils.io.pool.DirectByteBufferPool(2048, io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE);

    public static final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> getDefaultByteBufferPool() {
        return DefaultByteBufferPool;
    }

    public static final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> getDefaultDatagramByteBufferPool() {
        return DefaultDatagramByteBufferPool;
    }
}
