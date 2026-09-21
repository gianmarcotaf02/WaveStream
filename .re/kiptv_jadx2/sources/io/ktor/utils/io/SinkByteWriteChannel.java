package io.ktor.utils.io;

import androidx.media3.container.NalUnitUtil;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p094k8.e;
import p094k8.g;
import p094k8.l;
import p100l6.c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u000e8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lio/ktor/utils/io/SinkByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lk8/e;", "origin", "<init>", "(Lk8/e;)V", "Lh6/A;", "flush", "(Ll6/c;)Ljava/lang/Object;", "flushAndClose", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "Lk8/l;", "buffer", "Lk8/l;", "getWriteBuffer", "()Lk8/l;", "getWriteBuffer$annotations", "()V", "writeBuffer", "", "isClosedForWrite", "()Z", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SinkByteWriteChannel implements ByteWriteChannel {
    static final AtomicReferenceFieldUpdater closed$FU = AtomicReferenceFieldUpdater.newUpdater(SinkByteWriteChannel.class, Object.class, "closed");
    private final l buffer;
    volatile Object closed;

    public SinkByteWriteChannel(e origin) {
        m.e(origin, "origin");
        this.closed = null;
        this.buffer = new g(origin);
    }

    @InternalAPI
    public static void getWriteBuffer$annotations() {
    }

    @Override
    public void cancel(Throwable cause) {
        CloseToken closed = cause == null ? CloseTokenKt.getCLOSED() : new CloseToken(cause);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closed$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, closed) && atomicReferenceFieldUpdater.get(this) == null) {
        }
    }

    @Override
    public Object flush(c cVar) {
        getWriteBuffer().flush();
        return A.f22523a;
    }

    @Override
    public Object flushAndClose(c cVar) {
        A a2;
        getWriteBuffer().flush();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closed$FU;
        CloseToken closed = CloseTokenKt.getCLOSED();
        do {
            boolean zCompareAndSet = atomicReferenceFieldUpdater.compareAndSet(this, null, closed);
            a2 = A.f22523a;
            if (zCompareAndSet) {
                return a2;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return a2;
    }

    @Override
    public Throwable getClosedCause() {
        CloseToken closeToken = (CloseToken) this.closed;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override
    public l getWriteBuffer() throws Throwable {
        if (!isClosedForWrite()) {
            return this.buffer;
        }
        Throwable closedCause = getClosedCause();
        if (closedCause == null) {
            throw new IOException("Channel is closed for write");
        }
        throw closedCause;
    }

    @Override
    public boolean isClosedForWrite() {
        return this.closed != null;
    }
}
