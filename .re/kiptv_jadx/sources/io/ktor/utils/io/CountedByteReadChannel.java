package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00148VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/utils/io/CountedByteReadChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "delegate", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "Lh6/A;", "updateConsumed", "()V", "", "min", "", "awaitContent", "(ILl6/c;)Ljava/lang/Object;", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getDelegate", "()Lio/ktor/utils/io/ByteReadChannel;", "Lk8/a;", "buffer", "Lk8/a;", "", "initial", "J", "consumed", "getReadBuffer", "()Lk8/a;", "getReadBuffer$annotations", "readBuffer", "getTotalBytesRead", "()J", "totalBytesRead", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CountedByteReadChannel implements io.ktor.utils.io.ByteReadChannel {
    private final p094k8.a buffer;
    private long consumed;
    private final io.ktor.utils.io.ByteReadChannel delegate;
    private long initial;

    public CountedByteReadChannel(io.ktor.utils.io.ByteReadChannel delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.delegate = delegate;
        this.buffer = new p094k8.a();
    }

    @io.ktor.utils.io.InternalAPI
    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    private final void updateConsumed() {
        long j = this.consumed;
        long j9 = this.initial;
        long j10 = this.buffer.j;
        this.consumed = (j9 - j10) + j;
        this.initial = j10;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public java.lang.Object awaitContent(int i3, p100l6.c cVar) {
        return getReadBuffer().j < ((long) i3) ? this.delegate.awaitContent(i3, cVar) : java.lang.Boolean.TRUE;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(java.lang.Throwable cause) {
        this.delegate.cancel(cause);
        this.buffer.getClass();
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public java.lang.Throwable getClosedCause() {
        return this.delegate.getClosedCause();
    }

    public final io.ktor.utils.io.ByteReadChannel getDelegate() {
        return this.delegate;
    }

    public final long getTotalBytesRead() {
        updateConsumed();
        return this.consumed;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.buffer.o() && this.delegate.isClosedForRead();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public p094k8.a getReadBuffer() {
        updateConsumed();
        this.initial += this.buffer.D(this.delegate.getReadBuffer());
        return this.buffer;
    }
}
