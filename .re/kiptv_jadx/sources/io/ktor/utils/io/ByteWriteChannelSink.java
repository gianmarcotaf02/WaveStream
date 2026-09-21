package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannelSink;", "Lk8/e;", "Lio/ktor/utils/io/ByteWriteChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "Lk8/a;", "source", "", "byteCount", "Lh6/A;", "write", "(Lk8/a;J)V", "flush", "()V", "close", "Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteWriteChannelSink implements p094k8.e {
    private final io.ktor.utils.io.ByteWriteChannel origin;

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteWriteChannelSink$close$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.utils.io.ByteWriteChannelSink$close$1", f = "ByteWriteChannelSink.kt", l = {47}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
        int label;

        public AnonymousClass1(p100l6.c cVar) {
            super(2, cVar);
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return io.ktor.utils.io.ByteWriteChannelSink.this.new AnonymousClass1(cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.utils.io.ByteWriteChannelSink.AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                io.ktor.utils.io.ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(io.ktor.utils.io.ByteWriteChannelSink.this.origin);
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel = io.ktor.utils.io.ByteWriteChannelSink.this.origin;
                this.label = 1;
                if (byteWriteChannel.flushAndClose(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteWriteChannelSink$flush$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.utils.io.ByteWriteChannelSink$flush$1", f = "ByteWriteChannelSink.kt", l = {40}, m = "invokeSuspend")
    public static final class C24731 extends p117n6.i implements p194x6.m {
        int label;

        public C24731(p100l6.c cVar) {
            super(2, cVar);
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return io.ktor.utils.io.ByteWriteChannelSink.this.new C24731(cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.utils.io.ByteWriteChannelSink.C24731) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                io.ktor.utils.io.ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(io.ktor.utils.io.ByteWriteChannelSink.this.origin);
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel = io.ktor.utils.io.ByteWriteChannelSink.this.origin;
                this.label = 1;
                if (byteWriteChannel.flush(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteWriteChannelSink$write$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.utils.io.ByteWriteChannelSink$write$1", f = "ByteWriteChannelSink.kt", l = {}, m = "invokeSuspend")
    public static final class C24741 extends p117n6.i implements p194x6.m {
        int label;

        public C24741(p100l6.c cVar) {
            super(2, cVar);
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return io.ktor.utils.io.ByteWriteChannelSink.this.new C24741(cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.utils.io.ByteWriteChannelSink.C24741) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.utils.io.ByteWriteChannelSink.this.flush();
            return p070h6.A.f22523a;
        }
    }

    public ByteWriteChannelSink(io.ktor.utils.io.ByteWriteChannel origin) {
        kotlin.jvm.internal.m.e(origin, "origin");
        this.origin = origin;
    }

    @Override // p094k8.e, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        S7.C.E(p100l6.i.f24820h, new io.ktor.utils.io.ByteWriteChannelSink.AnonymousClass1(null));
    }

    @Override // p094k8.e, java.io.Flushable
    public void flush() throws java.lang.Throwable {
        S7.C.E(p100l6.i.f24820h, new io.ktor.utils.io.ByteWriteChannelSink.C24731(null));
    }

    @Override // p094k8.e
    public void write(p094k8.a source, long byteCount) throws java.lang.Throwable {
        kotlin.jvm.internal.m.e(source, "source");
        io.ktor.utils.io.ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this.origin);
        this.origin.getWriteBuffer().write(source, byteCount);
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.origin;
        io.ktor.utils.io.ByteChannel byteChannel = byteWriteChannel instanceof io.ktor.utils.io.ByteChannel ? (io.ktor.utils.io.ByteChannel) byteWriteChannel : null;
        if ((byteChannel == null || !byteChannel.getAutoFlush()) && io.ktor.utils.io.core.BytePacketBuilderKt.getSize(this.origin.getWriteBuffer()) < 1048576) {
            return;
        }
        S7.C.E(p100l6.i.f24820h, new io.ktor.utils.io.ByteWriteChannelSink.C24741(null));
    }
}
