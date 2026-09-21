package io.ktor.utils.io;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/Function1;", "Ll6/c;", "Lh6/A;", "", "onClose", "(Lio/ktor/utils/io/ByteWriteChannel;Lx6/j;)Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CloseHookByteWriteChannelKt {
    public static final ByteWriteChannel onClose(ByteWriteChannel byteWriteChannel, j onClose) {
        m.e(byteWriteChannel, "<this>");
        m.e(onClose, "onClose");
        return new CloseHookByteWriteChannel(byteWriteChannel, onClose);
    }
}
