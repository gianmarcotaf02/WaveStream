package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001GB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJH\u0010\u0011\u001a\u00020\u0007\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\n2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r\u0012\u0004\u0012\u00028\u00000\f2\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0082H¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0014\u001a\u00020\u0007\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\nH\u0082\b¢\u0006\u0004\b\u0014\u0010\tJ\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u001a\u001a\u00020\u0007\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\n2\u0006\u0010\u0019\u001a\u00028\u00002\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007H\u0096@¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\tJ\u0010\u0010$\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b$\u0010!J\u0019\u0010%\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00103\u001a\u000601j\u0002`28\u0002X\u0082\u0004¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\tR\u0014\u00106\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u00107\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010.R\u001a\u0010<\u001a\u0002088VX\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\t\u001a\u0004\b9\u0010:R\u001a\u0010A\u001a\u00020=8VX\u0097\u0004¢\u0006\f\u0012\u0004\b@\u0010\t\u001a\u0004\b>\u0010?R\u0016\u0010D\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010+R\u0014\u0010F\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010+¨\u0006H"}, d2 = {"Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/BufferedByteWriteChannel;", "", "autoFlush", "<init>", "(Z)V", "Lh6/A;", "moveFlushToReadBuffer", "()V", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "TaskType", "Lkotlin/Function1;", "Ll6/c;", "createTask", "Lkotlin/Function0;", "shouldSleep", "sleepWhile", "(Lx6/j;Lkotlin/jvm/functions/Function0;Ll6/c;)Ljava/lang/Object;", "Expected", "resumeSlot", "", "cause", "closeSlot", "(Ljava/lang/Throwable;)V", "slot", "trySuspend", "(Lio/ktor/utils/io/ByteChannel$Slot$Task;Lkotlin/jvm/functions/Function0;)V", "", "min", "awaitContent", "(ILl6/c;)Ljava/lang/Object;", "flush", "(Ll6/c;)Ljava/lang/Object;", "flushWriteBuffer", "close", "flushAndClose", "cancel", "", "toString", "()Ljava/lang/String;", "Z", "getAutoFlush", "()Z", "Lk8/a;", "flushBuffer", "Lk8/a;", "flushBufferSize", "I", "", "Lio/ktor/utils/io/locks/SynchronizedObject;", "flushBufferMutex", "Ljava/lang/Object;", "getFlushBufferMutex$annotations", "_readBuffer", "_writeBuffer", "Lk8/n;", "getReadBuffer", "()Lk8/n;", "getReadBuffer$annotations", "readBuffer", "Lk8/l;", "getWriteBuffer", "()Lk8/l;", "getWriteBuffer$annotations", "writeBuffer", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForWrite", "isClosedForRead", "Slot", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteChannel implements io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.BufferedByteWriteChannel {
    volatile /* synthetic */ java.lang.Object _closedCause;
    private final p094k8.a _readBuffer;
    private final p094k8.a _writeBuffer;
    private final boolean autoFlush;
    private final p094k8.a flushBuffer;
    private final java.lang.Object flushBufferMutex;
    private volatile int flushBufferSize;
    volatile /* synthetic */ java.lang.Object suspensionSlot;
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater suspensionSlot$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.utils.io.ByteChannel.class, java.lang.Object.class, "suspensionSlot");
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _closedCause$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.utils.io.ByteChannel.class, java.lang.Object.class, "_closedCause");

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u0000 \u00022\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot;", "", "Companion", "Empty", "Closed", "Task", "Read", "Write", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "Lio/ktor/utils/io/ByteChannel$Slot$Empty;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public interface Slot {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final io.ktor.utils.io.ByteChannel.Slot.Companion INSTANCE = io.ktor.utils.io.ByteChannel.Slot.Companion.$$INSTANCE;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "Lio/ktor/utils/io/ByteChannel$Slot;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final /* data */ class Closed implements io.ktor.utils.io.ByteChannel.Slot {
            private final java.lang.Throwable cause;

            public Closed(java.lang.Throwable th) {
                this.cause = th;
            }

            public static /* synthetic */ io.ktor.utils.io.ByteChannel.Slot.Closed copy$default(io.ktor.utils.io.ByteChannel.Slot.Closed closed, java.lang.Throwable th, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    th = closed.cause;
                }
                return closed.copy(th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final java.lang.Throwable getCause() {
                return this.cause;
            }

            public final io.ktor.utils.io.ByteChannel.Slot.Closed copy(java.lang.Throwable cause) {
                return new io.ktor.utils.io.ByteChannel.Slot.Closed(cause);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof io.ktor.utils.io.ByteChannel.Slot.Closed) && kotlin.jvm.internal.m.a(this.cause, ((io.ktor.utils.io.ByteChannel.Slot.Closed) other).cause);
            }

            public final java.lang.Throwable getCause() {
                return this.cause;
            }

            public int hashCode() {
                java.lang.Throwable th = this.cause;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public java.lang.String toString() {
                return "Closed(cause=" + this.cause + ')';
            }
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "CLOSED", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "getCLOSED", "()Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "getCLOSED$annotations", "Lh6/n;", "Lh6/A;", "RESUME", "Ljava/lang/Object;", "getRESUME-d1pmJ48", "()Ljava/lang/Object;", "getRESUME-d1pmJ48$annotations", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            static final /* synthetic */ io.ktor.utils.io.ByteChannel.Slot.Companion $$INSTANCE = new io.ktor.utils.io.ByteChannel.Slot.Companion();
            private static final io.ktor.utils.io.ByteChannel.Slot.Closed CLOSED = new io.ktor.utils.io.ByteChannel.Slot.Closed(null);
            private static final java.lang.Object RESUME = p070h6.A.f22523a;

            private Companion() {
            }

            public static /* synthetic */ void getCLOSED$annotations() {
            }

            /* JADX INFO: renamed from: getRESUME-d1pmJ48$annotations, reason: not valid java name */
            public static /* synthetic */ void m478getRESUMEd1pmJ48$annotations() {
            }

            public final io.ktor.utils.io.ByteChannel.Slot.Closed getCLOSED() {
                return CLOSED;
            }

            /* JADX INFO: renamed from: getRESUME-d1pmJ48, reason: not valid java name */
            public final java.lang.Object m479getRESUMEd1pmJ48() {
                return RESUME;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Empty;", "Lio/ktor/utils/io/ByteChannel$Slot;", "<init>", "()V", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final /* data */ class Empty implements io.ktor.utils.io.ByteChannel.Slot {
            public static final io.ktor.utils.io.ByteChannel.Slot.Empty INSTANCE = new io.ktor.utils.io.ByteChannel.Slot.Empty();

            private Empty() {
            }

            public boolean equals(java.lang.Object other) {
                return this == other || (other instanceof io.ktor.utils.io.ByteChannel.Slot.Empty);
            }

            public int hashCode() {
                return -231472095;
            }

            public java.lang.String toString() {
                return "Empty";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Read;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Ll6/c;", "Lh6/A;", "continuation", "<init>", "(Ll6/c;)V", "", "taskName", "()Ljava/lang/String;", "Ll6/c;", "getContinuation", "()Ll6/c;", "", "created", "Ljava/lang/Throwable;", "getCreated", "()Ljava/lang/Throwable;", "setCreated", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Read implements io.ktor.utils.io.ByteChannel.Slot.Task {
            private final p100l6.c continuation;
            private java.lang.Throwable created;

            public Read(p100l6.c continuation) {
                kotlin.jvm.internal.m.e(continuation, "continuation");
                this.continuation = continuation;
                if (io.ktor.utils.io.ByteChannel_jvmKt.getDEVELOPMENT_MODE()) {
                    int iHashCode = getContinuation().hashCode();
                    R8.i.i(16);
                    java.lang.String string = java.lang.Integer.toString(iHashCode, 16);
                    kotlin.jvm.internal.m.d(string, "toString(...)");
                    java.lang.Throwable th = new java.lang.Throwable("ReadTask 0x".concat(string));
                    com.google.common.util.concurrent.AbstractC1903s.I(th);
                    setCreated(th);
                }
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public p100l6.c getContinuation() {
                return this.continuation;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public java.lang.Throwable getCreated() {
                return this.created;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume() {
                io.ktor.utils.io.ByteChannel.Slot.Task.DefaultImpls.resume(this);
            }

            public void setCreated(java.lang.Throwable th) {
                this.created = th;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public java.lang.String taskName() {
                return "read";
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume(java.lang.Throwable th) {
                io.ktor.utils.io.ByteChannel.Slot.Task.DefaultImpls.resume(this, th);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0006\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Lio/ktor/utils/io/ByteChannel$Slot;", "", "taskName", "()Ljava/lang/String;", "Lh6/A;", "resume", "()V", "", "throwable", "(Ljava/lang/Throwable;)V", "getCreated", "()Ljava/lang/Throwable;", "created", "Ll6/c;", "getContinuation", "()Ll6/c;", "continuation", "Lio/ktor/utils/io/ByteChannel$Slot$Read;", "Lio/ktor/utils/io/ByteChannel$Slot$Write;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public interface Task extends io.ktor.utils.io.ByteChannel.Slot {

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class DefaultImpls {
                public static void resume(io.ktor.utils.io.ByteChannel.Slot.Task task) {
                    task.getContinuation().resumeWith(io.ktor.utils.io.ByteChannel.Slot.INSTANCE.m479getRESUMEd1pmJ48());
                }

                public static /* synthetic */ void resume$default(io.ktor.utils.io.ByteChannel.Slot.Task task, java.lang.Throwable th, int i3, java.lang.Object obj) {
                    if (obj != null) {
                        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
                    }
                    if ((i3 & 1) != 0) {
                        th = null;
                    }
                    task.resume(th);
                }

                public static void resume(io.ktor.utils.io.ByteChannel.Slot.Task task, java.lang.Throwable th) {
                    task.getContinuation().resumeWith(th != null ? com.google.common.util.concurrent.P.T(th) : io.ktor.utils.io.ByteChannel.Slot.INSTANCE.m479getRESUMEd1pmJ48());
                }
            }

            p100l6.c getContinuation();

            java.lang.Throwable getCreated();

            void resume();

            void resume(java.lang.Throwable throwable);

            java.lang.String taskName();
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Write;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Ll6/c;", "Lh6/A;", "continuation", "<init>", "(Ll6/c;)V", "", "taskName", "()Ljava/lang/String;", "Ll6/c;", "getContinuation", "()Ll6/c;", "", "created", "Ljava/lang/Throwable;", "getCreated", "()Ljava/lang/Throwable;", "setCreated", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Write implements io.ktor.utils.io.ByteChannel.Slot.Task {
            private final p100l6.c continuation;
            private java.lang.Throwable created;

            public Write(p100l6.c continuation) {
                kotlin.jvm.internal.m.e(continuation, "continuation");
                this.continuation = continuation;
                if (io.ktor.utils.io.ByteChannel_jvmKt.getDEVELOPMENT_MODE()) {
                    int iHashCode = getContinuation().hashCode();
                    R8.i.i(16);
                    java.lang.String string = java.lang.Integer.toString(iHashCode, 16);
                    kotlin.jvm.internal.m.d(string, "toString(...)");
                    java.lang.Throwable th = new java.lang.Throwable("WriteTask 0x".concat(string));
                    com.google.common.util.concurrent.AbstractC1903s.I(th);
                    setCreated(th);
                }
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public p100l6.c getContinuation() {
                return this.continuation;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public java.lang.Throwable getCreated() {
                return this.created;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume() {
                io.ktor.utils.io.ByteChannel.Slot.Task.DefaultImpls.resume(this);
            }

            public void setCreated(java.lang.Throwable th) {
                this.created = th;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public java.lang.String taskName() {
                return "write";
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume(java.lang.Throwable th) {
                io.ktor.utils.io.ByteChannel.Slot.Task.DefaultImpls.resume(this, th);
            }
        }

        static io.ktor.utils.io.ByteChannel.Slot.Closed getCLOSED() {
            return INSTANCE.getCLOSED();
        }

        /* JADX INFO: renamed from: getRESUME-d1pmJ48, reason: not valid java name */
        static java.lang.Object m477getRESUMEd1pmJ48() {
            return INSTANCE.m479getRESUMEd1pmJ48();
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteChannel$awaitContent$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {284}, m = "awaitContent")
    public static final class AnonymousClass1 extends p117n6.c {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteChannel.this.awaitContent(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteChannel$flush$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {284}, m = "flush")
    public static final class C24411 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24411(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteChannel.this.flush(this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteChannel$flushAndClose$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {128}, m = "flushAndClose")
    public static final class C24421 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C24421(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.utils.io.ByteChannel.this.flushAndClose(this);
        }
    }

    public ByteChannel() {
        this(false, 1, null);
    }

    private final void closeSlot(java.lang.Throwable cause) {
        io.ktor.utils.io.ByteChannel.Slot slot = (io.ktor.utils.io.ByteChannel.Slot) suspensionSlot$FU.getAndSet(this, cause != null ? new io.ktor.utils.io.ByteChannel.Slot.Closed(cause) : io.ktor.utils.io.ByteChannel.Slot.INSTANCE.getCLOSED());
        if (slot instanceof io.ktor.utils.io.ByteChannel.Slot.Task) {
            ((io.ktor.utils.io.ByteChannel.Slot.Task) slot).resume(cause);
        }
    }

    private static /* synthetic */ void getFlushBufferMutex$annotations() {
    }

    @io.ktor.utils.io.InternalAPI
    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    @io.ktor.utils.io.InternalAPI
    public static /* synthetic */ void getWriteBuffer$annotations() {
    }

    private final void moveFlushToReadBuffer() {
        synchronized (this.flushBufferMutex) {
            this.flushBuffer.H(this._readBuffer);
            this.flushBufferSize = 0;
        }
        io.ktor.utils.io.ByteChannel.Slot slot = (io.ktor.utils.io.ByteChannel.Slot) this.suspensionSlot;
        if (slot instanceof io.ktor.utils.io.ByteChannel.Slot.Write) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
            io.ktor.utils.io.ByteChannel.Slot.Empty empty = io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, slot, empty)) {
                if (atomicReferenceFieldUpdater.get(this) != slot) {
                    return;
                }
            }
            ((io.ktor.utils.io.ByteChannel.Slot.Task) slot).resume();
        }
    }

    private final <Expected extends io.ktor.utils.io.ByteChannel.Slot.Task> void resumeSlot() {
        kotlin.jvm.internal.m.j();
        throw null;
    }

    private final <TaskType extends io.ktor.utils.io.ByteChannel.Slot.Task> java.lang.Object sleepWhile(p194x6.j jVar, kotlin.jvm.functions.Function0 function0, p100l6.c cVar) {
        while (((java.lang.Boolean) function0.invoke()).booleanValue()) {
            S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(cVar));
            c0895k.r();
            io.ktor.utils.io.ByteChannel.Slot.Task task = (io.ktor.utils.io.ByteChannel.Slot.Task) jVar.invoke(c0895k);
            io.ktor.utils.io.ByteChannel.Slot slot = (io.ktor.utils.io.ByteChannel.Slot) this.suspensionSlot;
            if (!(slot instanceof io.ktor.utils.io.ByteChannel.Slot.Closed)) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
                do {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, slot, task)) {
                    }
                } while (atomicReferenceFieldUpdater.get(this) == slot);
                task.resume();
                c0895k.q();
                p109m6.a aVar = p109m6.a.f25430h;
            }
            kotlin.jvm.internal.m.j();
            throw null;
        }
        return p070h6.A.f22523a;
    }

    private final <TaskType extends io.ktor.utils.io.ByteChannel.Slot.Task> void trySuspend(TaskType slot, kotlin.jvm.functions.Function0 shouldSleep) {
        io.ktor.utils.io.ByteChannel.Slot slot2 = (io.ktor.utils.io.ByteChannel.Slot) this.suspensionSlot;
        if (!(slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Closed)) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, slot2, slot)) {
                if (atomicReferenceFieldUpdater.get(this) != slot2) {
                    slot.resume();
                    return;
                }
            }
        }
        kotlin.jvm.internal.m.j();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteReadChannel
    public java.lang.Object awaitContent(int i3, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.utils.io.ByteChannel.AnonymousClass1 anonymousClass1;
        io.ktor.utils.io.ByteChannel byteChannel;
        io.ktor.utils.io.ByteChannel byteChannel2;
        io.ktor.utils.io.ByteChannel.Slot slot;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.ByteChannel.Slot.Empty empty;
        java.lang.Object objQ;
        if (cVar instanceof io.ktor.utils.io.ByteChannel.AnonymousClass1) {
            anonymousClass1 = (io.ktor.utils.io.ByteChannel.AnonymousClass1) cVar;
            int i9 = anonymousClass1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i9 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.utils.io.ByteChannel.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.utils.io.ByteChannel.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = anonymousClass1.label;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.utils.io.ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this);
            if (this._readBuffer.j >= i3) {
                return java.lang.Boolean.TRUE;
            }
            byteChannel = this;
            byteChannel2 = byteChannel;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = anonymousClass1.I$0;
            byteChannel = (io.ktor.utils.io.ByteChannel) anonymousClass1.L$1;
            byteChannel2 = (io.ktor.utils.io.ByteChannel) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        do {
            long j = i3;
            if (((long) byteChannel2.flushBufferSize) + byteChannel2._readBuffer.j >= j || byteChannel2._closedCause != null) {
                if (byteChannel2._readBuffer.j < androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                    byteChannel2.moveFlushToReadBuffer();
                }
                return java.lang.Boolean.valueOf(byteChannel2._readBuffer.j >= j);
            }
            anonymousClass1.L$0 = byteChannel2;
            anonymousClass1.L$1 = byteChannel;
            anonymousClass1.I$0 = i3;
            anonymousClass1.label = 1;
            S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(anonymousClass1));
            c0895k.r();
            io.ktor.utils.io.ByteChannel.Slot.Read read = new io.ktor.utils.io.ByteChannel.Slot.Read(c0895k);
            io.ktor.utils.io.ByteChannel.Slot slot2 = (io.ktor.utils.io.ByteChannel.Slot) byteChannel.suspensionSlot;
            boolean z6 = slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Closed;
            if (z6) {
                if (slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Read) {
                    io.ktor.utils.io.ByteChannel.Slot.Task task = (io.ktor.utils.io.ByteChannel.Slot.Task) slot2;
                    task.resume(new io.ktor.utils.io.ConcurrentIOException(read.taskName(), task.getCreated()));
                } else if (slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Task) {
                    ((io.ktor.utils.io.ByteChannel.Slot.Task) slot2).resume();
                } else if (z6) {
                    read.resume(((io.ktor.utils.io.ByteChannel.Slot.Closed) slot2).getCause());
                } else if (!kotlin.jvm.internal.m.a(slot2, io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE)) {
                    throw new I3.b();
                }
                if (((long) byteChannel2.flushBufferSize) + byteChannel2._readBuffer.j < j) {
                    slot = (io.ktor.utils.io.ByteChannel.Slot) byteChannel.suspensionSlot;
                    if (slot instanceof io.ktor.utils.io.ByteChannel.Slot.Read) {
                        atomicReferenceFieldUpdater = suspensionSlot$FU;
                        empty = io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                ((io.ktor.utils.io.ByteChannel.Slot.Task) slot).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(byteChannel) == slot);
                    }
                } else {
                    slot = (io.ktor.utils.io.ByteChannel.Slot) byteChannel.suspensionSlot;
                    if (slot instanceof io.ktor.utils.io.ByteChannel.Slot.Read) {
                        atomicReferenceFieldUpdater = suspensionSlot$FU;
                        empty = io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                ((io.ktor.utils.io.ByteChannel.Slot.Task) slot).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(byteChannel) == slot);
                    }
                }
            } else {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = suspensionSlot$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(byteChannel, slot2, read)) {
                        if (slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Read) {
                            io.ktor.utils.io.ByteChannel.Slot.Task task2 = (io.ktor.utils.io.ByteChannel.Slot.Task) slot2;
                            task2.resume(new io.ktor.utils.io.ConcurrentIOException(read.taskName(), task2.getCreated()));
                        } else if (slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Task) {
                            ((io.ktor.utils.io.ByteChannel.Slot.Task) slot2).resume();
                        } else if (z6) {
                            read.resume(((io.ktor.utils.io.ByteChannel.Slot.Closed) slot2).getCause());
                        } else if (!kotlin.jvm.internal.m.a(slot2, io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE)) {
                            throw new I3.b();
                        }
                        if (((long) byteChannel2.flushBufferSize) + byteChannel2._readBuffer.j < j || byteChannel2._closedCause != null) {
                            slot = (io.ktor.utils.io.ByteChannel.Slot) byteChannel.suspensionSlot;
                            if (slot instanceof io.ktor.utils.io.ByteChannel.Slot.Read) {
                                atomicReferenceFieldUpdater = suspensionSlot$FU;
                                empty = io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE;
                                do {
                                    if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                        ((io.ktor.utils.io.ByteChannel.Slot.Task) slot).resume();
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(byteChannel) == slot);
                            }
                        }
                    } else if (atomicReferenceFieldUpdater2.get(byteChannel) != slot2) {
                        read.resume();
                    }
                }
            }
            objQ = c0895k.q();
            p109m6.a aVar2 = p109m6.a.f25430h;
        } while (objQ != aVar);
        return aVar;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(java.lang.Throwable cause) {
        if (this._closedCause != null) {
            return;
        }
        io.ktor.utils.io.CloseToken closeToken = new io.ktor.utils.io.CloseToken(cause);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closedCause$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, closeToken) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        closeSlot(io.ktor.utils.io.CloseToken.wrapCause$default(closeToken, null, 1, null));
    }

    @Override // io.ktor.utils.io.BufferedByteWriteChannel
    public void close() {
        flushWriteBuffer();
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closedCause$FU;
        io.ktor.utils.io.CloseToken closed = io.ktor.utils.io.CloseTokenKt.getCLOSED();
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, closed)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return;
            }
        }
        closeSlot(null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    public java.lang.Object flush(p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.utils.io.ByteChannel.C24411 c24411;
        io.ktor.utils.io.ByteChannel byteChannel;
        io.ktor.utils.io.ByteChannel byteChannel2;
        io.ktor.utils.io.ByteChannel.Slot slot;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.ByteChannel.Slot.Empty empty;
        if (cVar instanceof io.ktor.utils.io.ByteChannel.C24411) {
            c24411 = (io.ktor.utils.io.ByteChannel.C24411) cVar;
            int i3 = c24411.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24411.label = i3 - Integer.MIN_VALUE;
            } else {
                c24411 = new io.ktor.utils.io.ByteChannel.C24411(cVar);
            }
        } else {
            c24411 = new io.ktor.utils.io.ByteChannel.C24411(cVar);
        }
        java.lang.Object obj = c24411.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24411.label;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.utils.io.ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this);
            flushWriteBuffer();
            if (this.flushBufferSize < 1048576) {
                return a2;
            }
            byteChannel = this;
            byteChannel2 = byteChannel;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannel = (io.ktor.utils.io.ByteChannel) c24411.L$1;
            byteChannel2 = (io.ktor.utils.io.ByteChannel) c24411.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        while (byteChannel2.flushBufferSize >= 1048576 && byteChannel2._closedCause == null) {
            c24411.L$0 = byteChannel2;
            c24411.L$1 = byteChannel;
            c24411.label = 1;
            S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(c24411));
            c0895k.r();
            io.ktor.utils.io.ByteChannel.Slot.Write write = new io.ktor.utils.io.ByteChannel.Slot.Write(c0895k);
            io.ktor.utils.io.ByteChannel.Slot slot2 = (io.ktor.utils.io.ByteChannel.Slot) byteChannel.suspensionSlot;
            boolean z6 = slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Closed;
            if (z6) {
                if (slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Write) {
                    io.ktor.utils.io.ByteChannel.Slot.Task task = (io.ktor.utils.io.ByteChannel.Slot.Task) slot2;
                    task.resume(new io.ktor.utils.io.ConcurrentIOException(write.taskName(), task.getCreated()));
                } else if (slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Task) {
                    ((io.ktor.utils.io.ByteChannel.Slot.Task) slot2).resume();
                } else if (z6) {
                    write.resume(((io.ktor.utils.io.ByteChannel.Slot.Closed) slot2).getCause());
                } else if (!kotlin.jvm.internal.m.a(slot2, io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE)) {
                    throw new I3.b();
                }
                if (byteChannel2.flushBufferSize >= 1048576) {
                    slot = (io.ktor.utils.io.ByteChannel.Slot) byteChannel.suspensionSlot;
                    if (slot instanceof io.ktor.utils.io.ByteChannel.Slot.Write) {
                        atomicReferenceFieldUpdater = suspensionSlot$FU;
                        empty = io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                ((io.ktor.utils.io.ByteChannel.Slot.Task) slot).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(byteChannel) == slot);
                    }
                } else {
                    slot = (io.ktor.utils.io.ByteChannel.Slot) byteChannel.suspensionSlot;
                    if (slot instanceof io.ktor.utils.io.ByteChannel.Slot.Write) {
                        atomicReferenceFieldUpdater = suspensionSlot$FU;
                        empty = io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                ((io.ktor.utils.io.ByteChannel.Slot.Task) slot).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(byteChannel) == slot);
                    }
                }
            } else {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = suspensionSlot$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(byteChannel, slot2, write)) {
                        if (slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Write) {
                            io.ktor.utils.io.ByteChannel.Slot.Task task2 = (io.ktor.utils.io.ByteChannel.Slot.Task) slot2;
                            task2.resume(new io.ktor.utils.io.ConcurrentIOException(write.taskName(), task2.getCreated()));
                        } else if (slot2 instanceof io.ktor.utils.io.ByteChannel.Slot.Task) {
                            ((io.ktor.utils.io.ByteChannel.Slot.Task) slot2).resume();
                        } else if (z6) {
                            write.resume(((io.ktor.utils.io.ByteChannel.Slot.Closed) slot2).getCause());
                        } else if (!kotlin.jvm.internal.m.a(slot2, io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE)) {
                            throw new I3.b();
                        }
                        if (byteChannel2.flushBufferSize >= 1048576 || byteChannel2._closedCause != null) {
                            slot = (io.ktor.utils.io.ByteChannel.Slot) byteChannel.suspensionSlot;
                            if (slot instanceof io.ktor.utils.io.ByteChannel.Slot.Write) {
                                atomicReferenceFieldUpdater = suspensionSlot$FU;
                                empty = io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE;
                                do {
                                    if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                        ((io.ktor.utils.io.ByteChannel.Slot.Task) slot).resume();
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(byteChannel) == slot);
                            }
                        }
                    } else if (atomicReferenceFieldUpdater2.get(byteChannel) != slot2) {
                        write.resume();
                    }
                }
            }
            java.lang.Object objQ = c0895k.q();
            p109m6.a aVar2 = p109m6.a.f25430h;
            if (objQ == aVar) {
                return aVar;
            }
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    public java.lang.Object flushAndClose(p100l6.c cVar) {
        io.ktor.utils.io.ByteChannel.C24421 c24421;
        io.ktor.utils.io.ByteChannel byteChannel;
        p070h6.A a2;
        if (cVar instanceof io.ktor.utils.io.ByteChannel.C24421) {
            c24421 = (io.ktor.utils.io.ByteChannel.C24421) cVar;
            int i3 = c24421.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24421.label = i3 - Integer.MIN_VALUE;
            } else {
                c24421 = new io.ktor.utils.io.ByteChannel.C24421(cVar);
            }
        } else {
            c24421 = new io.ktor.utils.io.ByteChannel.C24421(cVar);
        }
        java.lang.Object obj = c24421.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24421.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            try {
                c24421.L$0 = this;
                c24421.label = 1;
                if (flush(c24421) == aVar) {
                    return aVar;
                }
                byteChannel = this;
            } catch (java.lang.Throwable th) {
                th = th;
                byteChannel = this;
                com.google.common.util.concurrent.P.T(th);
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannel = (io.ktor.utils.io.ByteChannel) c24421.L$0;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                com.google.common.util.concurrent.P.T(th);
            }
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closedCause$FU;
        io.ktor.utils.io.CloseToken closed = io.ktor.utils.io.CloseTokenKt.getCLOSED();
        do {
            boolean zCompareAndSet = atomicReferenceFieldUpdater.compareAndSet(byteChannel, null, closed);
            a2 = p070h6.A.f22523a;
            if (zCompareAndSet) {
                byteChannel.closeSlot(null);
                return a2;
            }
        } while (atomicReferenceFieldUpdater.get(byteChannel) == null);
        return a2;
    }

    @Override // io.ktor.utils.io.BufferedByteWriteChannel
    @io.ktor.utils.io.InternalAPI
    public void flushWriteBuffer() {
        if (this._writeBuffer.o()) {
            return;
        }
        synchronized (this.flushBufferMutex) {
            p094k8.a aVar = this._writeBuffer;
            int i3 = (int) aVar.j;
            this.flushBuffer.D(aVar);
            this.flushBufferSize += i3;
        }
        io.ktor.utils.io.ByteChannel.Slot slot = (io.ktor.utils.io.ByteChannel.Slot) this.suspensionSlot;
        if (slot instanceof io.ktor.utils.io.ByteChannel.Slot.Read) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
            io.ktor.utils.io.ByteChannel.Slot.Empty empty = io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, slot, empty)) {
                if (atomicReferenceFieldUpdater.get(this) != slot) {
                    return;
                }
            }
            ((io.ktor.utils.io.ByteChannel.Slot.Task) slot).resume();
        }
    }

    public final boolean getAutoFlush() {
        return this.autoFlush;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public java.lang.Throwable getClosedCause() {
        io.ktor.utils.io.CloseToken closeToken = (io.ktor.utils.io.CloseToken) this._closedCause;
        if (closeToken != null) {
            return io.ktor.utils.io.CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public p094k8.n getReadBuffer() throws java.lang.Throwable {
        io.ktor.utils.io.CloseToken closeToken = (io.ktor.utils.io.CloseToken) this._closedCause;
        if (closeToken != null) {
            closeToken.throwOrNull(io.ktor.utils.io.ByteChannel$readBuffer$1.INSTANCE);
        }
        if (this._readBuffer.o()) {
            moveFlushToReadBuffer();
        }
        return this._readBuffer;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public p094k8.l getWriteBuffer() throws io.ktor.utils.io.ClosedWriteChannelException {
        io.ktor.utils.io.CloseToken closeToken;
        if (isClosedForWrite() && ((closeToken = (io.ktor.utils.io.CloseToken) this._closedCause) == null || closeToken.throwOrNull(io.ktor.utils.io.ByteChannel$writeBuffer$1.INSTANCE) == null)) {
            throw new io.ktor.utils.io.ClosedWriteChannelException(null, 1, null);
        }
        return this._writeBuffer;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        if (getClosedCause() == null) {
            return isClosedForWrite() && this.flushBufferSize == 0 && this._readBuffer.o();
        }
        return true;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return this._closedCause != null;
    }

    public java.lang.String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    public ByteChannel(boolean z6) {
        this.autoFlush = z6;
        this.flushBuffer = new p094k8.a();
        this.flushBufferMutex = new java.lang.Object();
        this.suspensionSlot = io.ktor.utils.io.ByteChannel.Slot.Empty.INSTANCE;
        this._readBuffer = new p094k8.a();
        this._writeBuffer = new p094k8.a();
        this._closedCause = null;
    }

    public /* synthetic */ ByteChannel(boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? false : z6);
    }
}
