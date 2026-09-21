package io.ktor.utils.io;

import S7.A;
import S7.C;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import kotlin.Metadata;
import p094k8.e;
import p100l6.c;
import p117n6.i;
import p194x6.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannelSink;", "Lk8/e;", "Lio/ktor/utils/io/ByteWriteChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "Lk8/a;", "source", "", "byteCount", "Lh6/A;", "write", "(Lk8/a;J)V", "flush", "()V", "close", "Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteWriteChannelSink implements e {
    private final ByteWriteChannel origin;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.utils.io.ByteWriteChannelSink$close$1", f = "ByteWriteChannelSink.kt", l = {47}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements m {
        int label;

        public AnonymousClass1(c cVar) {
            super(2, cVar);
        }

        @Override
        public final c create(Object obj, c cVar) {
            return ByteWriteChannelSink.this.new AnonymousClass1(cVar);
        }

        @Override
        public final Object invoke(A a2, c cVar) {
            return ((AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) throws Throwable {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                P.u0(obj);
                ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(ByteWriteChannelSink.this.origin);
                ByteWriteChannel byteWriteChannel = ByteWriteChannelSink.this.origin;
                this.label = 1;
                if (byteWriteChannel.flushAndClose(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
            }
            return p070h6.A.f22523a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.utils.io.ByteWriteChannelSink$flush$1", f = "ByteWriteChannelSink.kt", l = {40}, m = "invokeSuspend")
    public static final class C24731 extends i implements m {
        int label;

        public C24731(c cVar) {
            super(2, cVar);
        }

        @Override
        public final c create(Object obj, c cVar) {
            return ByteWriteChannelSink.this.new C24731(cVar);
        }

        @Override
        public final Object invoke(A a2, c cVar) {
            return ((C24731) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) throws Throwable {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 == 0) {
                P.u0(obj);
                ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(ByteWriteChannelSink.this.origin);
                ByteWriteChannel byteWriteChannel = ByteWriteChannelSink.this.origin;
                this.label = 1;
                if (byteWriteChannel.flush(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
            }
            return p070h6.A.f22523a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.utils.io.ByteWriteChannelSink$write$1", f = "ByteWriteChannelSink.kt", l = {}, m = "invokeSuspend")
    public static final class C24741 extends i implements m {
        int label;

        public C24741(c cVar) {
            super(2, cVar);
        }

        @Override
        public final c create(Object obj, c cVar) {
            return ByteWriteChannelSink.this.new C24741(cVar);
        }

        @Override
        public final Object invoke(A a2, c cVar) {
            return ((C24741) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        public final Object invokeSuspend(Object obj) throws Throwable {
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
            ByteWriteChannelSink.this.flush();
            return p070h6.A.f22523a;
        }
    }

    public ByteWriteChannelSink(ByteWriteChannel origin) {
        kotlin.jvm.internal.m.e(origin, "origin");
        this.origin = origin;
    }

    @Override
    public void close() throws Throwable {
        C.E(p100l6.i.f24820h, new AnonymousClass1(null));
    }

    @Override
    public void flush() throws Throwable {
        C.E(p100l6.i.f24820h, new C24731(null));
    }

    @Override
    public void write(p094k8.a source, long byteCount) throws Throwable {
        kotlin.jvm.internal.m.e(source, "source");
        ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this.origin);
        this.origin.getWriteBuffer().write(source, byteCount);
        ByteWriteChannel byteWriteChannel = this.origin;
        ByteChannel byteChannel = byteWriteChannel instanceof ByteChannel ? (ByteChannel) byteWriteChannel : null;
        if ((byteChannel == null || !byteChannel.getAutoFlush()) && BytePacketBuilderKt.getSize(this.origin.getWriteBuffer()) < 1048576) {
            return;
        }
        C.E(p100l6.i.f24820h, new C24741(null));
    }
}
