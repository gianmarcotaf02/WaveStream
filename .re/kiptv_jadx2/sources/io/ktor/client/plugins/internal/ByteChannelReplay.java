package io.ktor.client.plugins.internal;

import S7.C;
import S7.C0877a0;
import S7.C0901q;
import S7.InterfaceC0900p;
import S7.M;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.util.concurrent.D;
import com.google.common.util.concurrent.P;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.WriterJob;
import io.ktor.utils.io.WriterScope;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.AbstractC2541f;
import p100l6.c;
import p100l6.h;
import p117n6.e;
import p117n6.i;
import p194x6.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/client/plugins/internal/ByteChannelReplay;", "", "Lio/ktor/utils/io/ByteReadChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "replay", "()Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "CopyFromSourceTask", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteChannelReplay {
    private static final AtomicReferenceFieldUpdater content$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannelReplay.class, Object.class, "content");
    private volatile Object content;
    private final ByteReadChannel origin;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lh6/A;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.internal.ByteChannelReplay$replay$1", f = "ByteChannelReplay.kt", l = {35, TsExtractor.TS_STREAM_TYPE_H265}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements m {
        final A $copyTask;
        private Object L$0;
        int label;

        public AnonymousClass1(A a2, c cVar) {
            super(2, cVar);
            this.$copyTask = a2;
        }

        @Override
        public final c create(Object obj, c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$copyTask, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override
        public final Object invoke(WriterScope writerScope, c cVar) {
            return ((AnonymousClass1) create(writerScope, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            WriterScope writerScope;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    writerScope = (WriterScope) this.L$0;
                    P.u0(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    P.u0(obj);
                }
                return p070h6.A.f22523a;
            }
            P.u0(obj);
            writerScope = (WriterScope) this.L$0;
            CopyFromSourceTask copyFromSourceTask = (CopyFromSourceTask) this.$copyTask.f24539h;
            this.L$0 = writerScope;
            this.label = 1;
            obj = copyFromSourceTask.awaitImpatiently(this);
            if (obj != aVar) {
            }
            return aVar;
            ByteWriteChannel channel = writerScope.getChannel();
            this.L$0 = null;
            this.label = 2;
        }
    }

    public ByteChannelReplay(ByteReadChannel origin) {
        kotlin.jvm.internal.m.e(origin, "origin");
        this.origin = origin;
        this.content = null;
    }

    public final ByteReadChannel replay() throws Throwable {
        if (this.origin.getClosedCause() != null) {
            Throwable closedCause = this.origin.getClosedCause();
            kotlin.jvm.internal.m.b(closedCause);
            throw closedCause;
        }
        A a2 = new A();
        Object obj = this.content;
        a2.f24539h = obj;
        InterfaceC0900p interfaceC0900p = null;
        Object[] objArr = 0;
        if (obj == null) {
            CopyFromSourceTask copyFromSourceTask = new CopyFromSourceTask(this, interfaceC0900p, 1, objArr == true ? 1 : 0);
            a2.f24539h = copyFromSourceTask;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = content$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, copyFromSourceTask)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    Object obj2 = this.content;
                    kotlin.jvm.internal.m.b(obj2);
                    a2.f24539h = obj2;
                }
            }
            return ((CopyFromSourceTask) a2.f24539h).start();
        }
        return ByteWriteChannelOperationsKt.writer$default((S7.A) C0877a0.f9566h, (h) null, false, (m) new AnonymousClass1(a2, null), 3, (Object) null).getChannel();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask;", "", "LS7/p;", "", "savedResponse", "<init>", "(Lio/ktor/client/plugins/internal/ByteChannelReplay;LS7/p;)V", "Lio/ktor/utils/io/ByteReadChannel;", TtmlNode.START, "()Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/WriterJob;", "receiveBody", "()Lio/ktor/utils/io/WriterJob;", "awaitImpatiently", "(Ll6/c;)Ljava/lang/Object;", "LS7/p;", "getSavedResponse", "()LS7/p;", "writerJob$delegate", "Lh6/h;", "getWriterJob", "writerJob", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public final class CopyFromSourceTask {
        private final InterfaceC0900p savedResponse;
        final ByteChannelReplay this$0;

        private final p070h6.h writerJob;

        public CopyFromSourceTask(ByteChannelReplay byteChannelReplay, InterfaceC0900p savedResponse) {
            kotlin.jvm.internal.m.e(savedResponse, "savedResponse");
            this.this$0 = byteChannelReplay;
            this.savedResponse = savedResponse;
            this.writerJob = D.B(new Function0() {
                @Override
                public final Object invoke() {
                    return this.f23357h.receiveBody();
                }
            });
        }

        private final WriterJob getWriterJob() {
            return (WriterJob) this.writerJob.getValue();
        }

        public final Object awaitImpatiently(c cVar) throws Throwable {
            if (!ByteWriteChannelOperationsKt.isCompleted(getWriterJob())) {
                getWriterJob().getChannel().cancel(new SaveBodyAbandonedReadException());
            }
            Object objK = ((C0901q) this.savedResponse).k(cVar);
            p109m6.a aVar = p109m6.a.f25430h;
            return objK;
        }

        public final InterfaceC0900p getSavedResponse() {
            return this.savedResponse;
        }

        public final WriterJob receiveBody() {
            return ByteWriteChannelOperationsKt.writer$default((S7.A) C0877a0.f9566h, (h) M.f9550b, false, (m) new ByteChannelReplay$CopyFromSourceTask$receiveBody$1(this.this$0, this, null), 2, (Object) null);
        }

        public final ByteReadChannel start() {
            return getWriterJob().getChannel();
        }

        public CopyFromSourceTask(ByteChannelReplay byteChannelReplay, InterfaceC0900p interfaceC0900p, int i3, AbstractC2541f abstractC2541f) {
            this(byteChannelReplay, (i3 & 1) != 0 ? C.b() : interfaceC0900p);
        }
    }
}
