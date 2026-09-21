package io.ktor.utils.io;

import S7.A;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.h;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LS7/A;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "Ll6/h;", "coroutineContext", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Ll6/h;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteWriteChannel;", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WriterScope implements A {
    private final ByteWriteChannel channel;
    private final h coroutineContext;

    public WriterScope(ByteWriteChannel channel, h coroutineContext) {
        m.e(channel, "channel");
        m.e(coroutineContext, "coroutineContext");
        this.channel = channel;
        this.coroutineContext = coroutineContext;
    }

    public final ByteWriteChannel getChannel() {
        return this.channel;
    }

    @Override
    public h getCoroutineContext() {
        return this.coroutineContext;
    }
}
