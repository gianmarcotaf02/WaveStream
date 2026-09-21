package io.ktor.websocket.internals;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Ljava/util/zip/Deflater;", "", "data", "deflateFully", "(Ljava/util/zip/Deflater;[B)[B", "Ljava/util/zip/Inflater;", "inflateFully", "(Ljava/util/zip/Inflater;[B)[B", "Lk8/l;", "deflater", "Ljava/nio/ByteBuffer;", "buffer", "", "flush", "", "deflateTo", "(Lk8/l;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;Z)I", "PADDED_EMPTY_CHUNK", "[B", "EMPTY_CHUNK", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DeflaterUtilsKt {
    private static final byte[] PADDED_EMPTY_CHUNK = {0, 0, 0, -1, -1};
    private static final byte[] EMPTY_CHUNK = {0, 0, -1, -1};

    public static final byte[] deflateFully(java.util.zip.Deflater deflater, byte[] data) {
        kotlin.jvm.internal.m.e(deflater, "<this>");
        kotlin.jvm.internal.m.e(data, "data");
        deflater.setInput(data);
        p094k8.a aVar = new p094k8.a();
        io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> ktorDefaultPool = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool();
        java.nio.ByteBuffer byteBufferBorrow = ktorDefaultPool.borrow();
        try {
            java.nio.ByteBuffer byteBuffer = byteBufferBorrow;
            while (!deflater.needsInput()) {
                deflateTo(aVar, deflater, byteBuffer, false);
            }
            do {
            } while (deflateTo(aVar, deflater, byteBuffer, true) != 0);
            ktorDefaultPool.recycle(byteBufferBorrow);
            if (io.ktor.websocket.internals.BytePacketUtilsKt.endsWith(aVar, PADDED_EMPTY_CHUNK)) {
                return p094k8.p.h(aVar, ((int) io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(aVar)) - EMPTY_CHUNK.length);
            }
            p094k8.a aVar2 = new p094k8.a();
            io.ktor.utils.io.core.BytePacketBuilderKt.writePacket(aVar2, aVar);
            aVar2.r((byte) 0);
            return p094k8.p.i(aVar2, -1);
        } catch (java.lang.Throwable th) {
            ktorDefaultPool.recycle(byteBufferBorrow);
            throw th;
        }
    }

    private static final int deflateTo(p094k8.l lVar, java.util.zip.Deflater deflater, java.nio.ByteBuffer byteBuffer, boolean z6) {
        byteBuffer.clear();
        int iDeflate = z6 ? deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit(), 2) : deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        if (iDeflate == 0) {
            return 0;
        }
        byteBuffer.position(byteBuffer.position() + iDeflate);
        byteBuffer.flip();
        io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(lVar, byteBuffer);
        return iDeflate;
    }

    public static final byte[] inflateFully(java.util.zip.Inflater inflater, byte[] data) {
        kotlin.jvm.internal.m.e(inflater, "<this>");
        kotlin.jvm.internal.m.e(data, "data");
        byte[] bArrX0 = p078i6.m.x0(data, EMPTY_CHUNK);
        inflater.setInput(bArrX0);
        p094k8.a aVar = new p094k8.a();
        io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> ktorDefaultPool = io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool();
        java.nio.ByteBuffer byteBufferBorrow = ktorDefaultPool.borrow();
        try {
            java.nio.ByteBuffer byteBuffer = byteBufferBorrow;
            long length = ((long) bArrX0.length) + inflater.getBytesRead();
            while (inflater.getBytesRead() < length) {
                byteBuffer.clear();
                byteBuffer.position(byteBuffer.position() + inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit()));
                byteBuffer.flip();
                io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt.writeFully(aVar, byteBuffer);
            }
            ktorDefaultPool.recycle(byteBufferBorrow);
            return p094k8.p.i(aVar, -1);
        } catch (java.lang.Throwable th) {
            ktorDefaultPool.recycle(byteBufferBorrow);
            throw th;
        }
    }
}
