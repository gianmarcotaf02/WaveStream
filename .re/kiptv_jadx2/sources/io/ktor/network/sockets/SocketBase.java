package io.ktor.network.sockets;

import S7.A;
import S7.C0889g0;
import S7.InterfaceC0891h0;
import S7.j0;
import S7.r;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.AbstractC1903s;
import io.ktor.network.selector.SelectableBase;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteChannelUtilsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ChannelJob;
import io.ktor.utils.io.ReaderJob;
import io.ktor.utils.io.WriterJob;
import io.sentry.SentryEvent;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.h;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u001b\u0010\u0019J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u000bH ¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R#\u0010,\u001a\u00020)*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010(0'8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R%\u0010/\u001a\u0004\u0018\u00010\u000b*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010(0'8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lio/ktor/network/sockets/SocketBase;", "Lio/ktor/network/sockets/ReadWriteSocket;", "Lio/ktor/network/selector/SelectableBase;", "LS7/A;", "Ll6/h;", "parent", "<init>", "(Ll6/h;)V", "Lh6/A;", "checkChannels", "()V", "", "e1", "e2", "combine", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "dispose", "close", "Lio/ktor/utils/io/ByteChannel;", "channel", "Lio/ktor/utils/io/WriterJob;", "attachForReading", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/WriterJob;", "Lio/ktor/utils/io/ReaderJob;", "attachForWriting", "(Lio/ktor/utils/io/ByteChannel;)Lio/ktor/utils/io/ReaderJob;", "attachForReadingImpl", "attachForWritingImpl", "actualClose$ktor_network", "()Ljava/lang/Throwable;", "actualClose", "LS7/r;", "socketContext", "LS7/r;", "getSocketContext", "()LS7/r;", "getCoroutineContext", "()Ll6/h;", "coroutineContext", "LR7/d;", "Lio/ktor/utils/io/ChannelJob;", "", "getCompletedOrNotStarted", "(LR7/d;)Z", "completedOrNotStarted", "getException", "(LR7/d;)Ljava/lang/Throwable;", SentryEvent.JsonKeys.EXCEPTION, "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SocketBase extends SelectableBase implements ReadWriteSocket, A {
    private volatile int actualCloseFlag;
    private volatile int closeFlag;
    private volatile Object readerJob;
    private final r socketContext;
    private volatile Object writerJob;
    private static final AtomicIntegerFieldUpdater closeFlag$FU = AtomicIntegerFieldUpdater.newUpdater(SocketBase.class, "closeFlag");
    private static final AtomicIntegerFieldUpdater actualCloseFlag$FU = AtomicIntegerFieldUpdater.newUpdater(SocketBase.class, "actualCloseFlag");
    private static final AtomicReferenceFieldUpdater readerJob$FU = AtomicReferenceFieldUpdater.newUpdater(SocketBase.class, Object.class, "readerJob");
    private static final AtomicReferenceFieldUpdater writerJob$FU = AtomicReferenceFieldUpdater.newUpdater(SocketBase.class, Object.class, "writerJob");

    public SocketBase(h parent) {
        m.e(parent, "parent");
        this.closeFlag = 0;
        this.actualCloseFlag = 0;
        this.readerJob = null;
        this.writerJob = null;
        this.socketContext = new j0((InterfaceC0891h0) parent.get(C0889g0.f9584h));
    }

    public final void checkChannels() {
        Throwable cause;
        CancellationException cancellationException;
        CancellationException cancellationException2;
        if (this.closeFlag != 0) {
            ChannelJob channelJob = (ChannelJob) this.readerJob;
            if (channelJob == null || ByteWriteChannelOperationsKt.isCompleted(channelJob)) {
                ChannelJob channelJob2 = (ChannelJob) this.writerJob;
                if ((channelJob2 == null || ByteWriteChannelOperationsKt.isCompleted(channelJob2)) && actualCloseFlag$FU.compareAndSet(this, 0, 1)) {
                    ChannelJob channelJob3 = (ChannelJob) this.readerJob;
                    Throwable cause2 = null;
                    if (channelJob3 == null) {
                        cause = null;
                    } else {
                        if (!ByteWriteChannelOperationsKt.isCancelled(channelJob3)) {
                            channelJob3 = null;
                        }
                        if (channelJob3 == null || (cancellationException2 = ByteWriteChannelOperationsKt.getCancellationException(channelJob3)) == null) {
                            cause = null;
                        } else {
                            cause = cancellationException2.getCause();
                        }
                    }
                    ChannelJob channelJob4 = (ChannelJob) this.writerJob;
                    if (channelJob4 != null) {
                        if (!ByteWriteChannelOperationsKt.isCancelled(channelJob4)) {
                            channelJob4 = null;
                        }
                        if (channelJob4 != null && (cancellationException = ByteWriteChannelOperationsKt.getCancellationException(channelJob4)) != null) {
                            cause2 = cancellationException.getCause();
                        }
                    }
                    Throwable thCombine = combine(combine(cause, cause2), actualClose$ktor_network());
                    if (thCombine == null) {
                        ((j0) getSocketContext()).Z();
                    } else {
                        ((j0) getSocketContext()).a0(thCombine);
                    }
                }
            }
        }
    }

    private final Throwable combine(Throwable e6, Throwable e9) {
        if (e6 == null) {
            return e9;
        }
        if (e9 == null || e6 == e9) {
            return e6;
        }
        AbstractC1903s.j(e6, e9);
        return e6;
    }

    public abstract Throwable actualClose$ktor_network();

    @Override
    public final WriterJob attachForReading(ByteChannel channel) throws Throwable {
        m.e(channel, "channel");
        if (this.closeFlag != 0) {
            IOException iOException = new IOException("Socket closed");
            ByteWriteChannelOperationsKt.close(channel, iOException);
            throw iOException;
        }
        WriterJob writerJobAttachForReadingImpl = attachForReadingImpl(channel);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = writerJob$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, writerJobAttachForReadingImpl)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                IllegalStateException illegalStateException = new IllegalStateException("reading channel has already been set");
                ByteWriteChannelOperationsKt.cancel(writerJobAttachForReadingImpl);
                throw illegalStateException;
            }
        }
        if (this.closeFlag == 0) {
            ByteChannelUtilsKt.attachJob(channel, writerJobAttachForReadingImpl);
            ByteWriteChannelOperationsKt.invokeOnCompletion(writerJobAttachForReadingImpl, new SocketBase$attachFor$1(this));
            return writerJobAttachForReadingImpl;
        }
        IOException iOException2 = new IOException("Socket closed");
        ByteWriteChannelOperationsKt.cancel(writerJobAttachForReadingImpl);
        ByteWriteChannelOperationsKt.close(channel, iOException2);
        throw iOException2;
    }

    public abstract WriterJob attachForReadingImpl(ByteChannel channel);

    @Override
    public final ReaderJob attachForWriting(ByteChannel channel) throws Throwable {
        m.e(channel, "channel");
        if (this.closeFlag != 0) {
            IOException iOException = new IOException("Socket closed");
            ByteWriteChannelOperationsKt.close(channel, iOException);
            throw iOException;
        }
        ReaderJob readerJobAttachForWritingImpl = attachForWritingImpl(channel);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = readerJob$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, readerJobAttachForWritingImpl)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                IllegalStateException illegalStateException = new IllegalStateException("writing channel has already been set");
                ByteWriteChannelOperationsKt.cancel(readerJobAttachForWritingImpl);
                throw illegalStateException;
            }
        }
        if (this.closeFlag == 0) {
            ByteChannelUtilsKt.attachJob(channel, readerJobAttachForWritingImpl);
            ByteWriteChannelOperationsKt.invokeOnCompletion(readerJobAttachForWritingImpl, new SocketBase$attachFor$1(this));
            return readerJobAttachForWritingImpl;
        }
        IOException iOException2 = new IOException("Socket closed");
        ByteWriteChannelOperationsKt.cancel(readerJobAttachForWritingImpl);
        ByteWriteChannelOperationsKt.close(channel, iOException2);
        throw iOException2;
    }

    public abstract ReaderJob attachForWritingImpl(ByteChannel channel);

    @Override
    public void close() {
        ByteWriteChannel channel;
        if (closeFlag$FU.compareAndSet(this, 0, 1)) {
            ReaderJob readerJob = (ReaderJob) this.readerJob;
            if (readerJob != null && (channel = readerJob.getChannel()) != null) {
                ByteWriteChannelKt.close(channel);
            }
            WriterJob writerJob = (WriterJob) this.writerJob;
            if (writerJob != null) {
                ByteWriteChannelOperationsKt.cancel(writerJob);
            }
            checkChannels();
        }
    }

    @Override
    public void dispose() {
        close();
    }

    @Override
    public h getCoroutineContext() {
        return getSocketContext();
    }

    @Override
    public r getSocketContext() {
        return this.socketContext;
    }
}
