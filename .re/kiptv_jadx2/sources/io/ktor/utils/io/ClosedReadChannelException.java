package io.ktor.utils.io;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/utils/io/ClosedReadChannelException;", "Lio/ktor/utils/io/ClosedByteChannelException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ClosedReadChannelException extends ClosedByteChannelException {
    public ClosedReadChannelException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ClosedReadChannelException(Throwable th) {
        super(th);
    }

    public ClosedReadChannelException(Throwable th, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : th);
    }
}
