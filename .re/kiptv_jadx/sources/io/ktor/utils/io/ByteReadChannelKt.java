package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lh6/A;", "cancel", "(Lio/ktor/utils/io/ByteReadChannel;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteReadChannelKt {
    public static final void cancel(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.m.e(byteReadChannel, "<this>");
        byteReadChannel.cancel(new java.io.IOException("Channel was cancelled"));
    }
}
