package io.ktor.utils.io.jvm.javaio;

import S7.M;
import Z7.d;
import Z7.e;
import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.pool.ByteArrayPoolKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.b;
import p100l6.h;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Ljava/io/InputStream;", "Ll6/h;", "context", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/utils/io/ByteReadChannel;", "toByteReadChannel", "(Ljava/io/InputStream;Ll6/h;Lio/ktor/utils/io/pool/ObjectPool;)Lio/ktor/utils/io/ByteReadChannel;", "", "toByteReadChannelWithArrayPool", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReadingKt {
    public static final ByteReadChannel toByteReadChannel(InputStream inputStream, h context, ObjectPool<ByteBuffer> pool) {
        m.e(inputStream, "<this>");
        m.e(context, "context");
        m.e(pool, "pool");
        return new RawSourceChannel(new b(inputStream), context);
    }

    public static ByteReadChannel toByteReadChannel$default(InputStream inputStream, h hVar, ObjectPool objectPool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            e eVar = M.f9549a;
            hVar = d.f13044i;
        }
        return toByteReadChannel(inputStream, hVar, objectPool);
    }

    public static final ByteReadChannel toByteReadChannelWithArrayPool(InputStream inputStream, h context, ObjectPool<byte[]> pool) {
        m.e(inputStream, "<this>");
        m.e(context, "context");
        m.e(pool, "pool");
        return new RawSourceChannel(new b(inputStream), context);
    }

    public static ByteReadChannel toByteReadChannelWithArrayPool$default(InputStream inputStream, h hVar, ObjectPool objectPool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            e eVar = M.f9549a;
            hVar = d.f13044i;
        }
        if ((i3 & 2) != 0) {
            objectPool = ByteArrayPoolKt.getByteArrayPool();
        }
        return toByteReadChannelWithArrayPool(inputStream, hVar, objectPool);
    }
}
