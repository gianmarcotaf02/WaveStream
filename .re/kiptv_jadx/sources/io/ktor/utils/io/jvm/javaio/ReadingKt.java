package io.ktor.utils.io.jvm.javaio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Ljava/io/InputStream;", "Ll6/h;", "context", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/utils/io/ByteReadChannel;", "toByteReadChannel", "(Ljava/io/InputStream;Ll6/h;Lio/ktor/utils/io/pool/ObjectPool;)Lio/ktor/utils/io/ByteReadChannel;", "", "toByteReadChannelWithArrayPool", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReadingKt {
    public static final io.ktor.utils.io.ByteReadChannel toByteReadChannel(java.io.InputStream inputStream, p100l6.h context, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool) {
        kotlin.jvm.internal.m.e(inputStream, "<this>");
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(pool, "pool");
        return new io.ktor.utils.io.jvm.javaio.RawSourceChannel(new p094k8.b(inputStream), context);
    }

    public static io.ktor.utils.io.ByteReadChannel toByteReadChannel$default(java.io.InputStream inputStream, p100l6.h hVar, io.ktor.utils.io.pool.ObjectPool objectPool, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            Z7.e eVar = S7.M.f9549a;
            hVar = Z7.d.f13044i;
        }
        return toByteReadChannel(inputStream, hVar, objectPool);
    }

    public static final io.ktor.utils.io.ByteReadChannel toByteReadChannelWithArrayPool(java.io.InputStream inputStream, p100l6.h context, io.ktor.utils.io.pool.ObjectPool<byte[]> pool) {
        kotlin.jvm.internal.m.e(inputStream, "<this>");
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(pool, "pool");
        return new io.ktor.utils.io.jvm.javaio.RawSourceChannel(new p094k8.b(inputStream), context);
    }

    public static io.ktor.utils.io.ByteReadChannel toByteReadChannelWithArrayPool$default(java.io.InputStream inputStream, p100l6.h hVar, io.ktor.utils.io.pool.ObjectPool objectPool, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            Z7.e eVar = S7.M.f9549a;
            hVar = Z7.d.f13044i;
        }
        if ((i3 & 2) != 0) {
            objectPool = io.ktor.utils.io.pool.ByteArrayPoolKt.getByteArrayPool();
        }
        return toByteReadChannelWithArrayPool(inputStream, hVar, objectPool);
    }
}
