package io.ktor.network.sockets;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001b\u0010\u0019J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u000bH ¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R#\u0010,\u001a\u00020)*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010(0'8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R%\u0010/\u001a\u0004\u0018\u00010\u000b*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010(0'8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lio/ktor/network/sockets/SocketBase;", "Lio/ktor/network/sockets/ReadWriteSocket;", "Lio/ktor/network/selector/SelectableBase;", "LS7/A;", "Ll6/h;", "parent", "<init>", "(Ll6/h;)V", "Lh6/A;", "checkChannels", "()V", "", "e1", "e2", "combine", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "dispose", "close", "Lio/ktor/utils/io/ByteChannel;", "channel", "Lio/ktor/utils/io/WriterJob;", "attachForReading", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ReaderJob;", "attachForWriting", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/ReaderJob;", "attachForReadingImpl", "attachForWritingImpl", "actualClose$ktor_network", "()Ljava/lang/Throwable;", "actualClose", "LS7/r;", "socketContext", "LS7/r;", "getSocketContext", "()LS7/r;", "getCoroutineContext", "()Ll6/h;", "coroutineContext", "LR7/d;", "Lio/ktor/utils/io/ChannelJob;", "", "getCompletedOrNotStarted", "(LR7/d;)Z", "completedOrNotStarted", "getException", "(LR7/d;)Ljava/lang/Throwable;", io.sentry.SentryEvent.JsonKeys.EXCEPTION, "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SocketBase extends io.ktor.network.selector.SelectableBase implements io.ktor.network.sockets.ReadWriteSocket, S7.A {
    private volatile /* synthetic */ int actualCloseFlag;
    private volatile /* synthetic */ int closeFlag;
    private volatile /* synthetic */ java.lang.Object readerJob;
    private final S7.r socketContext;
    private volatile /* synthetic */ java.lang.Object writerJob;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater closeFlag$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.network.sockets.SocketBase.class, "closeFlag");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater actualCloseFlag$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.network.sockets.SocketBase.class, "actualCloseFlag");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater readerJob$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.network.sockets.SocketBase.class, java.lang.Object.class, "readerJob");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater writerJob$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.network.sockets.SocketBase.class, java.lang.Object.class, "writerJob");

    public SocketBase(p100l6.h parent) {
        kotlin.jvm.internal.m.e(parent, "parent");
        this.closeFlag = 0;
        this.actualCloseFlag = 0;
        this.readerJob = null;
        this.writerJob = null;
        this.socketContext = new S7.j0((S7.InterfaceC0891h0) parent.get(S7.C0889g0.f9584h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    public final void checkChannels() {
        java.lang.Throwable cause;
        java.util.concurrent.CancellationException cancellationException;
        java.util.concurrent.CancellationException cancellationException2;
        if (this.closeFlag != 0) {
            io.ktor.utils.io.ChannelJob channelJob = (io.ktor.utils.io.ChannelJob) this.readerJob;
            if (channelJob == null || io.ktor.utils.io.ByteWriteChannelOperationsKt.isCompleted(channelJob)) {
                io.ktor.utils.io.ChannelJob channelJob2 = (io.ktor.utils.io.ChannelJob) this.writerJob;
                if ((channelJob2 == null || io.ktor.utils.io.ByteWriteChannelOperationsKt.isCompleted(channelJob2)) && actualCloseFlag$FU.compareAndSet(this, 0, 1)) {
                    io.ktor.utils.io.ChannelJob channelJob3 = (io.ktor.utils.io.ChannelJob) this.readerJob;
                    java.lang.Throwable cause2 = null;
                    if (channelJob3 == null) {
                        cause = null;
                    } else {
                        if (!io.ktor.utils.io.ByteWriteChannelOperationsKt.isCancelled(channelJob3)) {
                            channelJob3 = null;
                        }
                        if (channelJob3 == null || (cancellationException2 = io.ktor.utils.io.ByteWriteChannelOperationsKt.getCancellationException(channelJob3)) == null) {
                            cause = null;
                        } else {
                            cause = cancellationException2.getCause();
                        }
                    }
                    io.ktor.utils.io.ChannelJob channelJob4 = (io.ktor.utils.io.ChannelJob) this.writerJob;
                    if (channelJob4 != null) {
                        if (!io.ktor.utils.io.ByteWriteChannelOperationsKt.isCancelled(channelJob4)) {
                            channelJob4 = null;
                        }
                        if (channelJob4 != null && (cancellationException = io.ktor.utils.io.ByteWriteChannelOperationsKt.getCancellationException(channelJob4)) != null) {
                            cause2 = cancellationException.getCause();
                        }
                    }
                    java.lang.Throwable thCombine = combine(combine(cause, cause2), actualClose$ktor_network());
                    if (thCombine == null) {
                        ((S7.j0) getSocketContext()).Z();
                    } else {
                        ((S7.j0) getSocketContext()).a0(thCombine);
                    }
                }
            }
        }
    }

    private final java.lang.Throwable combine(java.lang.Throwable e6, java.lang.Throwable e9) {
        if (e6 == null) {
            return e9;
        }
        if (e9 == null || e6 == e9) {
            return e6;
        }
        com.google.common.util.concurrent.AbstractC1903s.j(e6, e9);
        return e6;
    }

    public abstract java.lang.Throwable actualClose$ktor_network();

    @Override // io.ktor.network.sockets.AReadable
    public final io.ktor.utils.io.WriterJob attachForReading(io.ktor.utils.io.ByteChannel channel) throws java.lang.Throwable {
        kotlin.jvm.internal.m.e(channel, "channel");
        if (this.closeFlag != 0) {
            java.io.IOException iOException = new java.io.IOException("Socket closed");
            io.ktor.utils.io.ByteWriteChannelOperationsKt.close(channel, iOException);
            throw iOException;
        }
        io.ktor.utils.io.WriterJob writerJobAttachForReadingImpl = attachForReadingImpl(channel);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = writerJob$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, writerJobAttachForReadingImpl)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("reading channel has already been set");
                io.ktor.utils.io.ByteWriteChannelOperationsKt.cancel(writerJobAttachForReadingImpl);
                throw illegalStateException;
            }
        }
        if (this.closeFlag == 0) {
            io.ktor.utils.io.ByteChannelUtilsKt.attachJob(channel, writerJobAttachForReadingImpl);
            io.ktor.utils.io.ByteWriteChannelOperationsKt.invokeOnCompletion(writerJobAttachForReadingImpl, new io.ktor.network.sockets.SocketBase$attachFor$1(this));
            return writerJobAttachForReadingImpl;
        }
        java.io.IOException iOException2 = new java.io.IOException("Socket closed");
        io.ktor.utils.io.ByteWriteChannelOperationsKt.cancel(writerJobAttachForReadingImpl);
        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(channel, iOException2);
        throw iOException2;
    }

    public abstract io.ktor.utils.io.WriterJob attachForReadingImpl(io.ktor.utils.io.ByteChannel channel);

    @Override // io.ktor.network.sockets.AWritable
    public final io.ktor.utils.io.ReaderJob attachForWriting(io.ktor.utils.io.ByteChannel channel) throws java.lang.Throwable {
        kotlin.jvm.internal.m.e(channel, "channel");
        if (this.closeFlag != 0) {
            java.io.IOException iOException = new java.io.IOException("Socket closed");
            io.ktor.utils.io.ByteWriteChannelOperationsKt.close(channel, iOException);
            throw iOException;
        }
        io.ktor.utils.io.ReaderJob readerJobAttachForWritingImpl = attachForWritingImpl(channel);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = readerJob$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, readerJobAttachForWritingImpl)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("writing channel has already been set");
                io.ktor.utils.io.ByteWriteChannelOperationsKt.cancel(readerJobAttachForWritingImpl);
                throw illegalStateException;
            }
        }
        if (this.closeFlag == 0) {
            io.ktor.utils.io.ByteChannelUtilsKt.attachJob(channel, readerJobAttachForWritingImpl);
            io.ktor.utils.io.ByteWriteChannelOperationsKt.invokeOnCompletion(readerJobAttachForWritingImpl, new io.ktor.network.sockets.SocketBase$attachFor$1(this));
            return readerJobAttachForWritingImpl;
        }
        java.io.IOException iOException2 = new java.io.IOException("Socket closed");
        io.ktor.utils.io.ByteWriteChannelOperationsKt.cancel(readerJobAttachForWritingImpl);
        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(channel, iOException2);
        throw iOException2;
    }

    public abstract io.ktor.utils.io.ReaderJob attachForWritingImpl(io.ktor.utils.io.ByteChannel channel);

    @Override // io.ktor.network.selector.SelectableBase, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.ktor.utils.io.ByteWriteChannel channel;
        if (closeFlag$FU.compareAndSet(this, 0, 1)) {
            io.ktor.utils.io.ReaderJob readerJob = (io.ktor.utils.io.ReaderJob) this.readerJob;
            if (readerJob != null && (channel = readerJob.getChannel()) != null) {
                io.ktor.utils.io.ByteWriteChannelKt.close(channel);
            }
            io.ktor.utils.io.WriterJob writerJob = (io.ktor.utils.io.WriterJob) this.writerJob;
            if (writerJob != null) {
                io.ktor.utils.io.ByteWriteChannelOperationsKt.cancel(writerJob);
            }
            checkChannels();
        }
    }

    @Override // io.ktor.network.selector.SelectableBase, io.ktor.network.selector.Selectable, S7.O
    public void dispose() {
        close();
    }

    @Override // S7.A
    public p100l6.h getCoroutineContext() {
        return getSocketContext();
    }

    @Override // io.ktor.network.sockets.ASocket
    public S7.r getSocketContext() {
        return this.socketContext;
    }
}
