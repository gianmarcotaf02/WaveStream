package io.ktor.utils.io.jvm.javaio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\u00020\"8VX\u0097\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0016\u0010*\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/RawSourceChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lk8/f;", "source", "Ll6/h;", "parent", "<init>", "(Lk8/f;Ll6/h;)V", "", "min", "", "awaitContent", "(ILl6/c;)Ljava/lang/Object;", "", "cause", "Lh6/A;", "cancel", "(Ljava/lang/Throwable;)V", "Lk8/f;", "Ll6/h;", "Lio/ktor/utils/io/CloseToken;", "closedToken", "Lio/ktor/utils/io/CloseToken;", "Lk8/a;", "buffer", "Lk8/a;", "LS7/r;", "job", "LS7/r;", "getJob", "()LS7/r;", "coroutineContext", "getCoroutineContext", "()Ll6/h;", "Lk8/n;", "getReadBuffer", "()Lk8/n;", "getReadBuffer$annotations", "()V", "readBuffer", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RawSourceChannel implements io.ktor.utils.io.ByteReadChannel {
    private final p094k8.a buffer;
    private io.ktor.utils.io.CloseToken closedToken;
    private final p100l6.h coroutineContext;
    private final S7.r job;
    private final p100l6.h parent;
    private final p094k8.f source;

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", f = "Reading.kt", l = {69}, m = "awaitContent")
    public static final class AnonymousClass1 extends p117n6.c {
        int I$0;
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
            return io.ktor.utils.io.jvm.javaio.RawSourceChannel.this.awaitContent(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p117n6.i implements p194x6.m {
        final /* synthetic */ int $min;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i3, p100l6.c cVar) {
            super(2, cVar);
            this.$min = i3;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return io.ktor.utils.io.jvm.javaio.RawSourceChannel.this.new AnonymousClass2(this.$min, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass2) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Exception {
            p109m6.a aVar = p109m6.a.f25430h;
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            long atMostTo = 0;
            while (io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(io.ktor.utils.io.jvm.javaio.RawSourceChannel.this.buffer) < this.$min && atMostTo >= 0) {
                try {
                    atMostTo = io.ktor.utils.io.jvm.javaio.RawSourceChannel.this.source.readAtMostTo(io.ktor.utils.io.jvm.javaio.RawSourceChannel.this.buffer, Long.MAX_VALUE);
                } catch (java.io.EOFException unused) {
                    atMostTo = -1;
                }
            }
            if (atMostTo == -1) {
                io.ktor.utils.io.jvm.javaio.RawSourceChannel.this.source.close();
                ((S7.j0) io.ktor.utils.io.jvm.javaio.RawSourceChannel.this.getJob()).Z();
                io.ktor.utils.io.jvm.javaio.RawSourceChannel.this.closedToken = new io.ktor.utils.io.CloseToken(null);
            }
            return p070h6.A.f22523a;
        }
    }

    public RawSourceChannel(p094k8.f source, p100l6.h parent) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(parent, "parent");
        this.source = source;
        this.parent = parent;
        this.buffer = new p094k8.a();
        S7.j0 j0Var = new S7.j0((S7.InterfaceC0891h0) parent.get(S7.C0889g0.f9584h));
        this.job = j0Var;
        this.coroutineContext = parent.plus(j0Var).plus(new S7.C0909z("RawSourceChannel"));
    }

    @io.ktor.utils.io.InternalAPI
    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteReadChannel
    public java.lang.Object awaitContent(int i3, p100l6.c cVar) {
        io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass1 anonymousClass1;
        io.ktor.utils.io.jvm.javaio.RawSourceChannel rawSourceChannel;
        if (cVar instanceof io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass1) {
            anonymousClass1 = (io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass1) cVar;
            int i9 = anonymousClass1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i9 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = anonymousClass1.label;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (this.closedToken != null) {
                return java.lang.Boolean.TRUE;
            }
            p100l6.h hVar = this.coroutineContext;
            io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass2 anonymousClass2 = new io.ktor.utils.io.jvm.javaio.RawSourceChannel.AnonymousClass2(i3, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.I$0 = i3;
            anonymousClass1.label = 1;
            if (S7.C.K(hVar, anonymousClass2, anonymousClass1) == aVar) {
                return aVar;
            }
            rawSourceChannel = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = anonymousClass1.I$0;
            rawSourceChannel = (io.ktor.utils.io.jvm.javaio.RawSourceChannel) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return java.lang.Boolean.valueOf(io.ktor.utils.io.core.ByteReadPacketKt.getRemaining(rawSourceChannel.buffer) >= ((long) i3));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(java.lang.Throwable cause) throws java.lang.Exception {
        java.lang.String message;
        java.lang.String message2;
        if (this.closedToken != null) {
            return;
        }
        S7.r rVar = this.job;
        java.lang.String str = "Channel was cancelled";
        if (cause == null || (message = cause.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        S7.C.j(rVar, message, cause);
        this.source.close();
        if (cause != null && (message2 = cause.getMessage()) != null) {
            str = message2;
        }
        this.closedToken = new io.ktor.utils.io.CloseToken(new java.io.IOException(str, cause));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public java.lang.Throwable getClosedCause() {
        io.ktor.utils.io.CloseToken closeToken = this.closedToken;
        if (closeToken != null) {
            return io.ktor.utils.io.CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    public final p100l6.h getCoroutineContext() {
        return this.coroutineContext;
    }

    public final S7.r getJob() {
        return this.job;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public p094k8.n getReadBuffer() {
        return this.buffer;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.closedToken != null && this.buffer.o();
    }
}
