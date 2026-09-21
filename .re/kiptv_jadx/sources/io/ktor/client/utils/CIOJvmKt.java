package io.ktor.client.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/utils/io/pool/ByteBufferPool;", "HttpClientDefaultPool", "Lio/ktor/utils/io/pool/ByteBufferPool;", "getHttpClientDefaultPool", "()Lio/ktor/utils/io/pool/ByteBufferPool;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CIOJvmKt {
    private static final io.ktor.utils.io.pool.ByteBufferPool HttpClientDefaultPool = new io.ktor.utils.io.pool.ByteBufferPool(0, 0, 3, null);

    public static final io.ktor.utils.io.pool.ByteBufferPool getHttpClientDefaultPool() {
        return HttpClientDefaultPool;
    }
}
