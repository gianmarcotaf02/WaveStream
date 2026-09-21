package io.ktor.client.plugins.internal;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\n"}, d2 = {"Lio/ktor/client/plugins/internal/ByteChannelReplay;", "", "Lio/ktor/utils/io/ByteReadChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "replay", "()Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "CopyFromSourceTask", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteChannelReplay {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater content$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.client.plugins.internal.ByteChannelReplay.class, java.lang.Object.class, "content");
    private volatile /* synthetic */ java.lang.Object content;
    private final io.ktor.utils.io.ByteReadChannel origin;

    /* JADX INFO: renamed from: io.ktor.client.plugins.internal.ByteChannelReplay$replay$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "Lh6/A;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.client.plugins.internal.ByteChannelReplay$replay$1", f = "ByteChannelReplay.kt", l = {35, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
        final /* synthetic */ kotlin.jvm.internal.A $copyTask;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.jvm.internal.A a2, p100l6.c cVar) {
            super(2, cVar);
            this.$copyTask = a2;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            io.ktor.client.plugins.internal.ByteChannelReplay.AnonymousClass1 anonymousClass1 = new io.ktor.client.plugins.internal.ByteChannelReplay.AnonymousClass1(this.$copyTask, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, p100l6.c cVar) {
            return ((io.ktor.client.plugins.internal.ByteChannelReplay.AnonymousClass1) create(writerScope, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r3, (byte[]) r11, 0, 0, r10, 6, null) == r0) goto L15;
         */
        @Override // p117n6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            io.ktor.utils.io.WriterScope writerScope;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    writerScope = (io.ktor.utils.io.WriterScope) this.L$0;
                    com.google.common.util.concurrent.P.u0(obj);
                } else {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                }
                return p070h6.A.f22523a;
            }
            com.google.common.util.concurrent.P.u0(obj);
            writerScope = (io.ktor.utils.io.WriterScope) this.L$0;
            io.ktor.client.plugins.internal.ByteChannelReplay.CopyFromSourceTask copyFromSourceTask = (io.ktor.client.plugins.internal.ByteChannelReplay.CopyFromSourceTask) this.$copyTask.f24539h;
            this.L$0 = writerScope;
            this.label = 1;
            obj = copyFromSourceTask.awaitImpatiently(this);
            if (obj != aVar) {
            }
            return aVar;
            io.ktor.utils.io.ByteWriteChannel channel = writerScope.getChannel();
            this.L$0 = null;
            this.label = 2;
        }
    }

    public ByteChannelReplay(io.ktor.utils.io.ByteReadChannel origin) {
        kotlin.jvm.internal.m.e(origin, "origin");
        this.origin = origin;
        this.content = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final io.ktor.utils.io.ByteReadChannel replay() throws java.lang.Throwable {
        if (this.origin.getClosedCause() != null) {
            java.lang.Throwable closedCause = this.origin.getClosedCause();
            kotlin.jvm.internal.m.b(closedCause);
            throw closedCause;
        }
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        java.lang.Object obj = this.content;
        a2.f24539h = obj;
        S7.InterfaceC0900p interfaceC0900p = null;
        java.lang.Object[] objArr = 0;
        if (obj == null) {
            io.ktor.client.plugins.internal.ByteChannelReplay.CopyFromSourceTask copyFromSourceTask = new io.ktor.client.plugins.internal.ByteChannelReplay.CopyFromSourceTask(this, interfaceC0900p, 1, objArr == true ? 1 : 0);
            a2.f24539h = copyFromSourceTask;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = content$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, copyFromSourceTask)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    java.lang.Object obj2 = this.content;
                    kotlin.jvm.internal.m.b(obj2);
                    a2.f24539h = obj2;
                }
            }
            return ((io.ktor.client.plugins.internal.ByteChannelReplay.CopyFromSourceTask) a2.f24539h).start();
        }
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((S7.A) S7.C0877a0.f9566h, (p100l6.h) null, false, (p194x6.m) new io.ktor.client.plugins.internal.ByteChannelReplay.AnonymousClass1(a2, null), 3, (java.lang.Object) null).getChannel();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lio/ktor/client/plugins/internal/ByteChannelReplay$CopyFromSourceTask;", "", "LS7/p;", "", "savedResponse", "<init>", "(Lio/ktor/client/plugins/internal/ByteChannelReplay;LS7/p;)V", "Lio/ktor/utils/io/ByteReadChannel;", androidx.media3.extractor.text.ttml.TtmlNode.START, "()Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/WriterJob;", "receiveBody", "()Lio/ktor/utils/io/WriterJob;", "awaitImpatiently", "(Ll6/c;)Ljava/lang/Object;", "LS7/p;", "getSavedResponse", "()LS7/p;", "writerJob$delegate", "Lh6/h;", "getWriterJob", "writerJob", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public final class CopyFromSourceTask {
        private final S7.InterfaceC0900p savedResponse;
        final /* synthetic */ io.ktor.client.plugins.internal.ByteChannelReplay this$0;

        /* JADX INFO: renamed from: writerJob$delegate, reason: from kotlin metadata */
        private final p070h6.h writerJob;

        public CopyFromSourceTask(io.ktor.client.plugins.internal.ByteChannelReplay byteChannelReplay, S7.InterfaceC0900p savedResponse) {
            kotlin.jvm.internal.m.e(savedResponse, "savedResponse");
            this.this$0 = byteChannelReplay;
            this.savedResponse = savedResponse;
            this.writerJob = com.google.common.util.concurrent.D.B(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.internal.a
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return this.f23357h.receiveBody();
                }
            });
        }

        private final io.ktor.utils.io.WriterJob getWriterJob() {
            return (io.ktor.utils.io.WriterJob) this.writerJob.getValue();
        }

        public final java.lang.Object awaitImpatiently(p100l6.c cVar) throws java.lang.Throwable {
            if (!io.ktor.utils.io.ByteWriteChannelOperationsKt.isCompleted(getWriterJob())) {
                getWriterJob().getChannel().cancel(new io.ktor.client.plugins.internal.SaveBodyAbandonedReadException());
            }
            java.lang.Object objK = ((S7.C0901q) this.savedResponse).k(cVar);
            p109m6.a aVar = p109m6.a.f25430h;
            return objK;
        }

        public final S7.InterfaceC0900p getSavedResponse() {
            return this.savedResponse;
        }

        public final io.ktor.utils.io.WriterJob receiveBody() {
            return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((S7.A) S7.C0877a0.f9566h, (p100l6.h) S7.M.f9550b, false, (p194x6.m) new io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask$receiveBody$1(this.this$0, this, null), 2, (java.lang.Object) null);
        }

        public final io.ktor.utils.io.ByteReadChannel start() {
            return getWriterJob().getChannel();
        }

        public /* synthetic */ CopyFromSourceTask(io.ktor.client.plugins.internal.ByteChannelReplay byteChannelReplay, S7.InterfaceC0900p interfaceC0900p, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(byteChannelReplay, (i3 & 1) != 0 ? S7.C.b() : interfaceC0900p);
        }
    }
}
