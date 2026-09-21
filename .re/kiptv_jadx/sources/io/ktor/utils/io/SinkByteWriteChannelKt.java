package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk8/e;", "Lio/ktor/utils/io/ByteWriteChannel;", "asByteWriteChannel", "(Lk8/e;)Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SinkByteWriteChannelKt {
    public static final io.ktor.utils.io.ByteWriteChannel asByteWriteChannel(p094k8.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        return new io.ktor.utils.io.SinkByteWriteChannel(eVar);
    }
}
