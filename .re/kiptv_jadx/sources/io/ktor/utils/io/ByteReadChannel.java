package io.ktor.utils.io;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "", "min", "", "awaitContent", "(ILl6/c;)Ljava/lang/Object;", "", "cause", "Lh6/A;", "cancel", "(Ljava/lang/Throwable;)V", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "Lk8/n;", "getReadBuffer", "()Lk8/n;", "getReadBuffer$annotations", "()V", "readBuffer", "Companion", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ByteReadChannel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.utils.io.ByteReadChannel.Companion INSTANCE = io.ktor.utils.io.ByteReadChannel.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "Empty", "Lio/ktor/utils/io/ByteReadChannel;", "getEmpty", "()Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ io.ktor.utils.io.ByteReadChannel.Companion $$INSTANCE = new io.ktor.utils.io.ByteReadChannel.Companion();
        private static final io.ktor.utils.io.ByteReadChannel Empty = new io.ktor.utils.io.ByteReadChannel() { // from class: io.ktor.utils.io.ByteReadChannel$Companion$Empty$1
            private final java.lang.Throwable closedCause;
            private final p094k8.n readBuffer = new p094k8.a();

            @io.ktor.utils.io.InternalAPI
            public static /* synthetic */ void getReadBuffer$annotations() {
            }

            @Override // io.ktor.utils.io.ByteReadChannel
            public java.lang.Object awaitContent(int i3, p100l6.c cVar) {
                return java.lang.Boolean.FALSE;
            }

            @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
            public void cancel(java.lang.Throwable cause) {
            }

            @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
            public java.lang.Throwable getClosedCause() {
                return this.closedCause;
            }

            @Override // io.ktor.utils.io.ByteReadChannel
            public p094k8.n getReadBuffer() {
                return this.readBuffer;
            }

            @Override // io.ktor.utils.io.ByteReadChannel
            public boolean isClosedForRead() {
                return true;
            }
        };

        private Companion() {
        }

        public final io.ktor.utils.io.ByteReadChannel getEmpty() {
            return Empty;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object awaitContent$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i3, p100l6.c cVar, int i9, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitContent");
            }
            if ((i9 & 1) != 0) {
                i3 = 1;
            }
            return byteReadChannel.awaitContent(i3, cVar);
        }

        @io.ktor.utils.io.InternalAPI
        public static /* synthetic */ void getReadBuffer$annotations() {
        }
    }

    java.lang.Object awaitContent(int i3, p100l6.c cVar);

    void cancel(java.lang.Throwable cause);

    java.lang.Throwable getClosedCause();

    p094k8.n getReadBuffer();

    boolean isClosedForRead();
}
