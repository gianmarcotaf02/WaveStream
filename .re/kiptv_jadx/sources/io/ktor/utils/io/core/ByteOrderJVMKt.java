package io.ktor.utils.io.core;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/nio/ByteOrder;", "nioOrder", "Lio/ktor/utils/io/core/ByteOrder;", "orderOf", "(Ljava/nio/ByteOrder;)Lio/ktor/utils/io/core/ByteOrder;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteOrderJVMKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.core.ByteOrder orderOf(java.nio.ByteOrder byteOrder) {
        return byteOrder == java.nio.ByteOrder.BIG_ENDIAN ? io.ktor.utils.io.core.ByteOrder.BIG_ENDIAN : io.ktor.utils.io.core.ByteOrder.LITTLE_ENDIAN;
    }
}
