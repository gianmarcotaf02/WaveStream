package io.ktor.utils.io.pool;

import androidx.media3.container.NalUnitUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/utils/io/pool/DirectByteBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Ljava/nio/ByteBuffer;", "", "capacity", "bufferSize", "<init>", "(II)V", "produceInstance", "()Ljava/nio/ByteBuffer;", "instance", "clearInstance", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "Lh6/A;", "validateInstance", "(Ljava/nio/ByteBuffer;)V", "I", "getBufferSize", "()I", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DirectByteBufferPool extends DefaultPool<ByteBuffer> {
    private final int bufferSize;

    public DirectByteBufferPool() {
        int i3 = 0;
        this(i3, i3, 3, null);
    }

    public final int getBufferSize() {
        return this.bufferSize;
    }

    public DirectByteBufferPool(int i3, int i9, int i10, AbstractC2541f abstractC2541f) {
        this((i10 & 1) != 0 ? 2000 : i3, (i10 & 2) != 0 ? 4096 : i9);
    }

    @Override
    public ByteBuffer clearInstance(ByteBuffer instance) {
        m.e(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    @Override
    public ByteBuffer produceInstance() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.bufferSize);
        m.b(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    @Override
    public void validateInstance(ByteBuffer instance) {
        m.e(instance, "instance");
        if (instance.capacity() != this.bufferSize) {
            throw new IllegalStateException("Check failed.");
        }
        if (!instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public DirectByteBufferPool(int i3, int i9) {
        super(i3);
        this.bufferSize = i9;
    }
}
