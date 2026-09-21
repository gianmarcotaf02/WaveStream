package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\rR\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0018\u001a\u00020\u00148F¢\u0006\f\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00198VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lio/ktor/utils/io/CountedByteWriteChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "delegate", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "Lh6/A;", "flush", "(Ll6/c;)Ljava/lang/Object;", "flushAndClose", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "", "initial", "I", "getInitial$annotations", "()V", "flushedCount", "", "getTotalBytesWritten", "()J", "getTotalBytesWritten$annotations", "totalBytesWritten", "Lk8/l;", "getWriteBuffer", "()Lk8/l;", "getWriteBuffer$annotations", "writeBuffer", "", "isClosedForWrite", "()Z", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CountedByteWriteChannel implements io.ktor.utils.io.ByteWriteChannel {
    private final io.ktor.utils.io.ByteWriteChannel delegate;
    private int flushedCount;
    private int initial;

    /* JADX INFO: renamed from: io.ktor.utils.io.CountedByteWriteChannel$flush$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.CountedByteWriteChannel", f = "CountedByteWriteChannel.kt", l = {32}, m = "flush")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.CountedByteWriteChannel.this.flush(this);
        }
    }

    public CountedByteWriteChannel(io.ktor.utils.io.ByteWriteChannel delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.delegate = delegate;
        this.initial = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(delegate.getWriteBuffer());
    }

    private static /* synthetic */ void getInitial$annotations() {
    }

    public static /* synthetic */ void getTotalBytesWritten$annotations() {
    }

    @io.ktor.utils.io.InternalAPI
    public static /* synthetic */ void getWriteBuffer$annotations() {
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public void cancel(java.lang.Throwable cause) {
        this.delegate.cancel(cause);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    public java.lang.Object flush(p100l6.c cVar) {
        io.ktor.utils.io.CountedByteWriteChannel.AnonymousClass1 anonymousClass1;
        io.ktor.utils.io.CountedByteWriteChannel countedByteWriteChannel;
        if (cVar instanceof io.ktor.utils.io.CountedByteWriteChannel.AnonymousClass1) {
            anonymousClass1 = (io.ktor.utils.io.CountedByteWriteChannel.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.utils.io.CountedByteWriteChannel.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.utils.io.CountedByteWriteChannel.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            this.flushedCount = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(getWriteBuffer()) + this.flushedCount;
            io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.delegate;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (byteWriteChannel.flush(anonymousClass1) == aVar) {
                return aVar;
            }
            countedByteWriteChannel = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            countedByteWriteChannel = (io.ktor.utils.io.CountedByteWriteChannel) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        countedByteWriteChannel.initial = io.ktor.utils.io.core.BytePacketBuilderKt.getSize(countedByteWriteChannel.getWriteBuffer());
        return p070h6.A.f22523a;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public java.lang.Object flushAndClose(p100l6.c cVar) {
        java.lang.Object objFlushAndClose = this.delegate.flushAndClose(cVar);
        return objFlushAndClose == p109m6.a.f25430h ? objFlushAndClose : p070h6.A.f22523a;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public java.lang.Throwable getClosedCause() {
        return this.delegate.getClosedCause();
    }

    public final long getTotalBytesWritten() {
        return (io.ktor.utils.io.core.BytePacketBuilderKt.getSize(getWriteBuffer()) + this.flushedCount) - this.initial;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public p094k8.l getWriteBuffer() {
        return this.delegate.getWriteBuffer();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return this.delegate.isClosedForWrite();
    }
}
