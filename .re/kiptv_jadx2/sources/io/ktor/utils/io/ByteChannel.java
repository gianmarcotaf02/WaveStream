package io.ktor.utils.io;

import I3.b;
import R8.i;
import S7.C0895k;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.P;
import io.sentry.protocol.Request;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p070h6.A;
import p094k8.l;
import p094k8.n;
import p100l6.c;
import p117n6.e;
import p194x6.j;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001GB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJH\u0010\u0011\u001a\u00020\u0007\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\n2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r\u0012\u0004\u0012\u00028\u00000\f2\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0082H¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0014\u001a\u00020\u0007\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\nH\u0082\b¢\u0006\u0004\b\u0014\u0010\tJ\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u001a\u001a\u00020\u0007\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\n2\u0006\u0010\u0019\u001a\u00028\u00002\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007H\u0096@¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\"\u0010\tJ\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\tJ\u0010\u0010$\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b$\u0010!J\u0019\u0010%\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00103\u001a\u000601j\u0002`28\u0002X\u0082\u0004¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\tR\u0014\u00106\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u00107\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010.R\u001a\u0010<\u001a\u0002088VX\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\t\u001a\u0004\b9\u0010:R\u001a\u0010A\u001a\u00020=8VX\u0097\u0004¢\u0006\f\u0012\u0004\b@\u0010\t\u001a\u0004\b>\u0010?R\u0016\u0010D\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010+R\u0014\u0010F\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010+¨\u0006H"}, d2 = {"Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/BufferedByteWriteChannel;", "", "autoFlush", "<init>", "(Z)V", "Lh6/A;", "moveFlushToReadBuffer", "()V", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "TaskType", "Lkotlin/Function1;", "Ll6/c;", "createTask", "Lkotlin/Function0;", "shouldSleep", "sleepWhile", "(Lx6/j;Lkotlin/jvm/functions/Function0;Ll6/c;)Ljava/lang/Object;", "Expected", "resumeSlot", "", "cause", "closeSlot", "(Ljava/lang/Throwable;)V", "slot", "trySuspend", "(Lio/ktor/utils/io/ByteChannel$Slot$Task;Lkotlin/jvm/functions/Function0;)V", "", "min", "awaitContent", "(ILl6/c;)Ljava/lang/Object;", "flush", "(Ll6/c;)Ljava/lang/Object;", "flushWriteBuffer", "close", "flushAndClose", "cancel", "", "toString", "()Ljava/lang/String;", "Z", "getAutoFlush", "()Z", "Lk8/a;", "flushBuffer", "Lk8/a;", "flushBufferSize", "I", "", "Lio/ktor/utils/io/locks/SynchronizedObject;", "flushBufferMutex", "Ljava/lang/Object;", "getFlushBufferMutex$annotations", "_readBuffer", "_writeBuffer", "Lk8/n;", "getReadBuffer", "()Lk8/n;", "getReadBuffer$annotations", "readBuffer", "Lk8/l;", "getWriteBuffer", "()Lk8/l;", "getWriteBuffer$annotations", "writeBuffer", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForWrite", "isClosedForRead", "Slot", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteChannel implements ByteReadChannel, BufferedByteWriteChannel {
    volatile Object _closedCause;
    private final p094k8.a _readBuffer;
    private final p094k8.a _writeBuffer;
    private final boolean autoFlush;
    private final p094k8.a flushBuffer;
    private final Object flushBufferMutex;
    private volatile int flushBufferSize;
    volatile Object suspensionSlot;
    static final AtomicReferenceFieldUpdater suspensionSlot$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannel.class, Object.class, "suspensionSlot");
    static final AtomicReferenceFieldUpdater _closedCause$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannel.class, Object.class, "_closedCause");

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u0000 \u00022\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot;", "", "Companion", "Empty", "Closed", "Task", "Read", "Write", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "Lio/ktor/utils/io/ByteChannel$Slot$Empty;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public interface Slot {

        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "Lio/ktor/utils/io/ByteChannel$Slot;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Closed implements Slot {
            private final Throwable cause;

            public Closed(Throwable th) {
                this.cause = th;
            }

            public static Closed copy$default(Closed closed, Throwable th, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    th = closed.cause;
                }
                return closed.copy(th);
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public final Closed copy(Throwable cause) {
                return new Closed(cause);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Closed) && m.a(this.cause, ((Closed) other).cause);
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public int hashCode() {
                Throwable th = this.cause;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public String toString() {
                return "Closed(cause=" + this.cause + ')';
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "CLOSED", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "getCLOSED", "()Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "getCLOSED$annotations", "Lh6/n;", "Lh6/A;", "RESUME", "Ljava/lang/Object;", "getRESUME-d1pmJ48", "()Ljava/lang/Object;", "getRESUME-d1pmJ48$annotations", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            static final Companion $$INSTANCE = new Companion();
            private static final Closed CLOSED = new Closed(null);
            private static final Object RESUME = A.f22523a;

            private Companion() {
            }

            public static void getCLOSED$annotations() {
            }

            public static void m478getRESUMEd1pmJ48$annotations() {
            }

            public final Closed getCLOSED() {
                return CLOSED;
            }

            public final Object m479getRESUMEd1pmJ48() {
                return RESUME;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Empty;", "Lio/ktor/utils/io/ByteChannel$Slot;", "<init>", "()V", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Empty implements Slot {
            public static final Empty INSTANCE = new Empty();

            private Empty() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Empty);
            }

            public int hashCode() {
                return -231472095;
            }

            public String toString() {
                return "Empty";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Read;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Ll6/c;", "Lh6/A;", "continuation", "<init>", "(Ll6/c;)V", "", "taskName", "()Ljava/lang/String;", "Ll6/c;", "getContinuation", "()Ll6/c;", "", "created", "Ljava/lang/Throwable;", "getCreated", "()Ljava/lang/Throwable;", "setCreated", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Read implements Task {
            private final c continuation;
            private Throwable created;

            public Read(c continuation) {
                m.e(continuation, "continuation");
                this.continuation = continuation;
                if (ByteChannel_jvmKt.getDEVELOPMENT_MODE()) {
                    int iHashCode = getContinuation().hashCode();
                    i.i(16);
                    String string = Integer.toString(iHashCode, 16);
                    m.d(string, "toString(...)");
                    Throwable th = new Throwable("ReadTask 0x".concat(string));
                    AbstractC1903s.I(th);
                    setCreated(th);
                }
            }

            @Override
            public c getContinuation() {
                return this.continuation;
            }

            @Override
            public Throwable getCreated() {
                return this.created;
            }

            @Override
            public void resume() {
                Task.DefaultImpls.resume(this);
            }

            public void setCreated(Throwable th) {
                this.created = th;
            }

            @Override
            public String taskName() {
                return "read";
            }

            @Override
            public void resume(Throwable th) {
                Task.DefaultImpls.resume(this, th);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0006\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Lio/ktor/utils/io/ByteChannel$Slot;", "", "taskName", "()Ljava/lang/String;", "Lh6/A;", "resume", "()V", "", "throwable", "(Ljava/lang/Throwable;)V", "getCreated", "()Ljava/lang/Throwable;", "created", "Ll6/c;", "getContinuation", "()Ll6/c;", "continuation", "Lio/ktor/utils/io/ByteChannel$Slot$Read;", "Lio/ktor/utils/io/ByteChannel$Slot$Write;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public interface Task extends Slot {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class DefaultImpls {
                public static void resume(Task task) {
                    task.getContinuation().resumeWith(Slot.INSTANCE.m479getRESUMEd1pmJ48());
                }

                public static void resume$default(Task task, Throwable th, int i3, Object obj) {
                    if (obj != null) {
                        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
                    }
                    if ((i3 & 1) != 0) {
                        th = null;
                    }
                    task.resume(th);
                }

                public static void resume(Task task, Throwable th) {
                    task.getContinuation().resumeWith(th != null ? P.T(th) : Slot.INSTANCE.m479getRESUMEd1pmJ48());
                }
            }

            c getContinuation();

            Throwable getCreated();

            void resume();

            void resume(Throwable throwable);

            String taskName();
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Write;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Ll6/c;", "Lh6/A;", "continuation", "<init>", "(Ll6/c;)V", "", "taskName", "()Ljava/lang/String;", "Ll6/c;", "getContinuation", "()Ll6/c;", "", "created", "Ljava/lang/Throwable;", "getCreated", "()Ljava/lang/Throwable;", "setCreated", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Write implements Task {
            private final c continuation;
            private Throwable created;

            public Write(c continuation) {
                m.e(continuation, "continuation");
                this.continuation = continuation;
                if (ByteChannel_jvmKt.getDEVELOPMENT_MODE()) {
                    int iHashCode = getContinuation().hashCode();
                    i.i(16);
                    String string = Integer.toString(iHashCode, 16);
                    m.d(string, "toString(...)");
                    Throwable th = new Throwable("WriteTask 0x".concat(string));
                    AbstractC1903s.I(th);
                    setCreated(th);
                }
            }

            @Override
            public c getContinuation() {
                return this.continuation;
            }

            @Override
            public Throwable getCreated() {
                return this.created;
            }

            @Override
            public void resume() {
                Task.DefaultImpls.resume(this);
            }

            public void setCreated(Throwable th) {
                this.created = th;
            }

            @Override
            public String taskName() {
                return "write";
            }

            @Override
            public void resume(Throwable th) {
                Task.DefaultImpls.resume(this, th);
            }
        }

        static Closed getCLOSED() {
            return INSTANCE.getCLOSED();
        }

        static Object m477getRESUMEd1pmJ48() {
            return INSTANCE.m479getRESUMEd1pmJ48();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {284}, m = "awaitContent")
    public static final class AnonymousClass1 extends p117n6.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public AnonymousClass1(c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannel.this.awaitContent(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {284}, m = "flush")
    public static final class C24411 extends p117n6.c {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public C24411(c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannel.this.flush(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @e(c = "io.ktor.utils.io.ByteChannel", f = "ByteChannel.kt", l = {128}, m = "flushAndClose")
    public static final class C24421 extends p117n6.c {
        Object L$0;
        int label;
        Object result;

        public C24421(c cVar) {
            super(cVar);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannel.this.flushAndClose(this);
        }
    }

    public ByteChannel() {
        this(false, 1, null);
    }

    private final void closeSlot(Throwable cause) {
        Slot slot = (Slot) suspensionSlot$FU.getAndSet(this, cause != null ? new Slot.Closed(cause) : Slot.INSTANCE.getCLOSED());
        if (slot instanceof Slot.Task) {
            ((Slot.Task) slot).resume(cause);
        }
    }

    private static void getFlushBufferMutex$annotations() {
    }

    @InternalAPI
    public static void getReadBuffer$annotations() {
    }

    @InternalAPI
    public static void getWriteBuffer$annotations() {
    }

    private final void moveFlushToReadBuffer() {
        synchronized (this.flushBufferMutex) {
            this.flushBuffer.H(this._readBuffer);
            this.flushBufferSize = 0;
        }
        Slot slot = (Slot) this.suspensionSlot;
        if (slot instanceof Slot.Write) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
            Slot.Empty empty = Slot.Empty.INSTANCE;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, slot, empty)) {
                if (atomicReferenceFieldUpdater.get(this) != slot) {
                    return;
                }
            }
            ((Slot.Task) slot).resume();
        }
    }

    private final <Expected extends Slot.Task> void resumeSlot() {
        m.j();
        throw null;
    }

    private final <TaskType extends Slot.Task> Object sleepWhile(j jVar, Function0 function0, c cVar) {
        while (((Boolean) function0.invoke()).booleanValue()) {
            C0895k c0895k = new C0895k(1, P.h0(cVar));
            c0895k.r();
            Slot.Task task = (Slot.Task) jVar.invoke(c0895k);
            Slot slot = (Slot) this.suspensionSlot;
            if (!(slot instanceof Slot.Closed)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
                do {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, slot, task)) {
                    }
                } while (atomicReferenceFieldUpdater.get(this) == slot);
                task.resume();
                c0895k.q();
                p109m6.a aVar = p109m6.a.f25430h;
            }
            m.j();
            throw null;
        }
        return A.f22523a;
    }

    private final <TaskType extends Slot.Task> void trySuspend(TaskType slot, Function0 shouldSleep) {
        Slot slot2 = (Slot) this.suspensionSlot;
        if (!(slot2 instanceof Slot.Closed)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, slot2, slot)) {
                if (atomicReferenceFieldUpdater.get(this) != slot2) {
                    slot.resume();
                    return;
                }
            }
        }
        m.j();
        throw null;
    }

    @Override
    public Object awaitContent(int i3, c cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ByteChannel byteChannel;
        ByteChannel byteChannel2;
        Slot slot;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Slot.Empty empty;
        Object objQ;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i9 = anonymousClass1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i9 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = anonymousClass1.label;
        if (i10 == 0) {
            P.u0(obj);
            ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this);
            if (this._readBuffer.j >= i3) {
                return Boolean.TRUE;
            }
            byteChannel = this;
            byteChannel2 = byteChannel;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = anonymousClass1.I$0;
            byteChannel = (ByteChannel) anonymousClass1.L$1;
            byteChannel2 = (ByteChannel) anonymousClass1.L$0;
            P.u0(obj);
        }
        do {
            long j = i3;
            if (((long) byteChannel2.flushBufferSize) + byteChannel2._readBuffer.j >= j || byteChannel2._closedCause != null) {
                if (byteChannel2._readBuffer.j < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                    byteChannel2.moveFlushToReadBuffer();
                }
                return Boolean.valueOf(byteChannel2._readBuffer.j >= j);
            }
            anonymousClass1.L$0 = byteChannel2;
            anonymousClass1.L$1 = byteChannel;
            anonymousClass1.I$0 = i3;
            anonymousClass1.label = 1;
            C0895k c0895k = new C0895k(1, P.h0(anonymousClass1));
            c0895k.r();
            Slot.Read read = new Slot.Read(c0895k);
            Slot slot2 = (Slot) byteChannel.suspensionSlot;
            boolean z6 = slot2 instanceof Slot.Closed;
            if (z6) {
                if (slot2 instanceof Slot.Read) {
                    Slot.Task task = (Slot.Task) slot2;
                    task.resume(new ConcurrentIOException(read.taskName(), task.getCreated()));
                } else if (slot2 instanceof Slot.Task) {
                    ((Slot.Task) slot2).resume();
                } else if (z6) {
                    read.resume(((Slot.Closed) slot2).getCause());
                } else if (!m.a(slot2, Slot.Empty.INSTANCE)) {
                    throw new b();
                }
                if (((long) byteChannel2.flushBufferSize) + byteChannel2._readBuffer.j < j) {
                    slot = (Slot) byteChannel.suspensionSlot;
                    if (slot instanceof Slot.Read) {
                        atomicReferenceFieldUpdater = suspensionSlot$FU;
                        empty = Slot.Empty.INSTANCE;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                ((Slot.Task) slot).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(byteChannel) == slot);
                    }
                } else {
                    slot = (Slot) byteChannel.suspensionSlot;
                    if (slot instanceof Slot.Read) {
                        atomicReferenceFieldUpdater = suspensionSlot$FU;
                        empty = Slot.Empty.INSTANCE;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                ((Slot.Task) slot).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(byteChannel) == slot);
                    }
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = suspensionSlot$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(byteChannel, slot2, read)) {
                        if (slot2 instanceof Slot.Read) {
                            Slot.Task task2 = (Slot.Task) slot2;
                            task2.resume(new ConcurrentIOException(read.taskName(), task2.getCreated()));
                        } else if (slot2 instanceof Slot.Task) {
                            ((Slot.Task) slot2).resume();
                        } else if (z6) {
                            read.resume(((Slot.Closed) slot2).getCause());
                        } else if (!m.a(slot2, Slot.Empty.INSTANCE)) {
                            throw new b();
                        }
                        if (((long) byteChannel2.flushBufferSize) + byteChannel2._readBuffer.j < j || byteChannel2._closedCause != null) {
                            slot = (Slot) byteChannel.suspensionSlot;
                            if (slot instanceof Slot.Read) {
                                atomicReferenceFieldUpdater = suspensionSlot$FU;
                                empty = Slot.Empty.INSTANCE;
                                do {
                                    if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                        ((Slot.Task) slot).resume();
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

    @Override
    public void cancel(Throwable cause) {
        if (this._closedCause != null) {
            return;
        }
        CloseToken closeToken = new CloseToken(cause);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closedCause$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, closeToken) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        closeSlot(CloseToken.wrapCause$default(closeToken, null, 1, null));
    }

    @Override
    public void close() {
        flushWriteBuffer();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closedCause$FU;
        CloseToken closed = CloseTokenKt.getCLOSED();
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, closed)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return;
            }
        }
        closeSlot(null);
    }

    @Override
    public Object flush(c cVar) throws Throwable {
        C24411 c24411;
        ByteChannel byteChannel;
        ByteChannel byteChannel2;
        Slot slot;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Slot.Empty empty;
        if (cVar instanceof C24411) {
            c24411 = (C24411) cVar;
            int i3 = c24411.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24411.label = i3 - Integer.MIN_VALUE;
            } else {
                c24411 = new C24411(cVar);
            }
        } else {
            c24411 = new C24411(cVar);
        }
        Object obj = c24411.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24411.label;
        A a2 = A.f22523a;
        if (i9 == 0) {
            P.u0(obj);
            ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this);
            flushWriteBuffer();
            if (this.flushBufferSize < 1048576) {
                return a2;
            }
            byteChannel = this;
            byteChannel2 = byteChannel;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannel = (ByteChannel) c24411.L$1;
            byteChannel2 = (ByteChannel) c24411.L$0;
            P.u0(obj);
        }
        while (byteChannel2.flushBufferSize >= 1048576 && byteChannel2._closedCause == null) {
            c24411.L$0 = byteChannel2;
            c24411.L$1 = byteChannel;
            c24411.label = 1;
            C0895k c0895k = new C0895k(1, P.h0(c24411));
            c0895k.r();
            Slot.Write write = new Slot.Write(c0895k);
            Slot slot2 = (Slot) byteChannel.suspensionSlot;
            boolean z6 = slot2 instanceof Slot.Closed;
            if (z6) {
                if (slot2 instanceof Slot.Write) {
                    Slot.Task task = (Slot.Task) slot2;
                    task.resume(new ConcurrentIOException(write.taskName(), task.getCreated()));
                } else if (slot2 instanceof Slot.Task) {
                    ((Slot.Task) slot2).resume();
                } else if (z6) {
                    write.resume(((Slot.Closed) slot2).getCause());
                } else if (!m.a(slot2, Slot.Empty.INSTANCE)) {
                    throw new b();
                }
                if (byteChannel2.flushBufferSize >= 1048576) {
                    slot = (Slot) byteChannel.suspensionSlot;
                    if (slot instanceof Slot.Write) {
                        atomicReferenceFieldUpdater = suspensionSlot$FU;
                        empty = Slot.Empty.INSTANCE;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                ((Slot.Task) slot).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(byteChannel) == slot);
                    }
                } else {
                    slot = (Slot) byteChannel.suspensionSlot;
                    if (slot instanceof Slot.Write) {
                        atomicReferenceFieldUpdater = suspensionSlot$FU;
                        empty = Slot.Empty.INSTANCE;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                ((Slot.Task) slot).resume();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(byteChannel) == slot);
                    }
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = suspensionSlot$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(byteChannel, slot2, write)) {
                        if (slot2 instanceof Slot.Write) {
                            Slot.Task task2 = (Slot.Task) slot2;
                            task2.resume(new ConcurrentIOException(write.taskName(), task2.getCreated()));
                        } else if (slot2 instanceof Slot.Task) {
                            ((Slot.Task) slot2).resume();
                        } else if (z6) {
                            write.resume(((Slot.Closed) slot2).getCause());
                        } else if (!m.a(slot2, Slot.Empty.INSTANCE)) {
                            throw new b();
                        }
                        if (byteChannel2.flushBufferSize >= 1048576 || byteChannel2._closedCause != null) {
                            slot = (Slot) byteChannel.suspensionSlot;
                            if (slot instanceof Slot.Write) {
                                atomicReferenceFieldUpdater = suspensionSlot$FU;
                                empty = Slot.Empty.INSTANCE;
                                do {
                                    if (atomicReferenceFieldUpdater.compareAndSet(byteChannel, slot, empty)) {
                                        ((Slot.Task) slot).resume();
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
            Object objQ = c0895k.q();
            p109m6.a aVar2 = p109m6.a.f25430h;
            if (objQ == aVar) {
                return aVar;
            }
        }
        return a2;
    }

    @Override
    public Object flushAndClose(c cVar) {
        C24421 c24421;
        ByteChannel byteChannel;
        A a2;
        if (cVar instanceof C24421) {
            c24421 = (C24421) cVar;
            int i3 = c24421.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24421.label = i3 - Integer.MIN_VALUE;
            } else {
                c24421 = new C24421(cVar);
            }
        } else {
            c24421 = new C24421(cVar);
        }
        Object obj = c24421.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c24421.label;
        if (i9 == 0) {
            P.u0(obj);
            try {
                c24421.L$0 = this;
                c24421.label = 1;
                if (flush(c24421) == aVar) {
                    return aVar;
                }
                byteChannel = this;
            } catch (Throwable th) {
                th = th;
                byteChannel = this;
                P.T(th);
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteChannel = (ByteChannel) c24421.L$0;
            try {
                P.u0(obj);
            } catch (Throwable th2) {
                th = th2;
                P.T(th);
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closedCause$FU;
        CloseToken closed = CloseTokenKt.getCLOSED();
        do {
            boolean zCompareAndSet = atomicReferenceFieldUpdater.compareAndSet(byteChannel, null, closed);
            a2 = A.f22523a;
            if (zCompareAndSet) {
                byteChannel.closeSlot(null);
                return a2;
            }
        } while (atomicReferenceFieldUpdater.get(byteChannel) == null);
        return a2;
    }

    @Override
    @InternalAPI
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
        Slot slot = (Slot) this.suspensionSlot;
        if (slot instanceof Slot.Read) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = suspensionSlot$FU;
            Slot.Empty empty = Slot.Empty.INSTANCE;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, slot, empty)) {
                if (atomicReferenceFieldUpdater.get(this) != slot) {
                    return;
                }
            }
            ((Slot.Task) slot).resume();
        }
    }

    public final boolean getAutoFlush() {
        return this.autoFlush;
    }

    @Override
    public Throwable getClosedCause() {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override
    public n getReadBuffer() throws Throwable {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            closeToken.throwOrNull(ByteChannel$readBuffer$1.INSTANCE);
        }
        if (this._readBuffer.o()) {
            moveFlushToReadBuffer();
        }
        return this._readBuffer;
    }

    @Override
    public l getWriteBuffer() throws ClosedWriteChannelException {
        CloseToken closeToken;
        if (isClosedForWrite() && ((closeToken = (CloseToken) this._closedCause) == null || closeToken.throwOrNull(ByteChannel$writeBuffer$1.INSTANCE) == null)) {
            throw new ClosedWriteChannelException(null, 1, null);
        }
        return this._writeBuffer;
    }

    @Override
    public boolean isClosedForRead() {
        if (getClosedCause() == null) {
            return isClosedForWrite() && this.flushBufferSize == 0 && this._readBuffer.o();
        }
        return true;
    }

    @Override
    public boolean isClosedForWrite() {
        return this._closedCause != null;
    }

    public String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    public ByteChannel(boolean z6) {
        this.autoFlush = z6;
        this.flushBuffer = new p094k8.a();
        this.flushBufferMutex = new Object();
        this.suspensionSlot = Slot.Empty.INSTANCE;
        this._readBuffer = new p094k8.a();
        this._writeBuffer = new p094k8.a();
        this._closedCause = null;
    }

    public ByteChannel(boolean z6, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? false : z6);
    }
}
