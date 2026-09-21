package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/ByteReadChannelSource;", "Lk8/f;", "Lio/ktor/utils/io/ByteReadChannel;", "origin", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "Lk8/a;", "sink", "", "byteCount", "readAtMostTo", "(Lk8/a;J)J", "Lh6/A;", "close", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteReadChannelSource implements p094k8.f {
    private final io.ktor.utils.io.ByteReadChannel origin;

    /* JADX INFO: renamed from: io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "", "<anonymous>", "(LS7/A;)Z"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1", f = "ByteReadChannelSource.kt", l = {29}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
        int label;

        public AnonymousClass1(p100l6.c cVar) {
            super(2, cVar);
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return io.ktor.utils.io.ByteReadChannelSource.this.new AnonymousClass1(cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.utils.io.ByteReadChannelSource.AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            }
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.utils.io.ByteReadChannel byteReadChannel = io.ktor.utils.io.ByteReadChannelSource.this.origin;
            this.label = 1;
            java.lang.Object objAwaitContent$default = io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, this, 1, null);
            return objAwaitContent$default == aVar ? aVar : objAwaitContent$default;
        }
    }

    public ByteReadChannelSource(io.ktor.utils.io.ByteReadChannel origin) {
        kotlin.jvm.internal.m.e(origin, "origin");
        this.origin = origin;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        io.ktor.utils.io.ByteReadChannelKt.cancel(this.origin);
    }

    @Override // p094k8.f
    public long readAtMostTo(p094k8.a sink, long byteCount) throws java.lang.Throwable {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (this.origin.getReadBuffer().o()) {
            S7.C.E(p100l6.i.f24820h, new io.ktor.utils.io.ByteReadChannelSource.AnonymousClass1(null));
        }
        if (this.origin.getReadBuffer().o()) {
            return -1L;
        }
        return this.origin.getReadBuffer().readAtMostTo(sink, byteCount);
    }
}
