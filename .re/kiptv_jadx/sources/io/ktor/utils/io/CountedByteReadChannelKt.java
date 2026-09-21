package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001e\u0010\t\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/CountedByteReadChannel;", "counted", "(Lio/ktor/utils/io/ByteReadChannel;)Lio/ktor/utils/io/CountedByteReadChannel;", "", "getTotalBytesRead", "(Lio/ktor/utils/io/ByteReadChannel;)J", "getTotalBytesRead$annotations", "(Lio/ktor/utils/io/ByteReadChannel;)V", "totalBytesRead", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CountedByteReadChannelKt {
    public static final io.ktor.utils.io.CountedByteReadChannel counted(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.m.e(byteReadChannel, "<this>");
        return new io.ktor.utils.io.CountedByteReadChannel(byteReadChannel);
    }

    public static final long getTotalBytesRead(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.m.e(byteReadChannel, "<this>");
        throw new java.lang.IllegalStateException("Counter is no longer available on the regular ByteReadChannel. Use CounterByteReadChannel instead.");
    }

    @p070h6.c
    public static /* synthetic */ void getTotalBytesRead$annotations(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
    }
}
