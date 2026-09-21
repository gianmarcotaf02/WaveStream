package io.ktor.utils.io.jvm.javaio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "LS7/h0;", "parent", "Ljava/io/InputStream;", "toInputStream", "(Lio/ktor/utils/io/ByteReadChannel;LS7/h0;)Ljava/io/InputStream;", "Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/io/OutputStream;", "toOutputStream", "(Lio/ktor/utils/io/ByteWriteChannel;)Ljava/io/OutputStream;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BlockingKt {
    public static final java.io.InputStream toInputStream(final io.ktor.utils.io.ByteReadChannel byteReadChannel, S7.InterfaceC0891h0 interfaceC0891h0) {
        kotlin.jvm.internal.m.e(byteReadChannel, "<this>");
        return new java.io.InputStream() { // from class: io.ktor.utils.io.jvm.javaio.BlockingKt.toInputStream.1
            private final void blockingWait() throws java.lang.Throwable {
                S7.C.E(p100l6.i.f24820h, new io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1$blockingWait$1(byteReadChannel, null));
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                io.ktor.utils.io.ByteReadChannelKt.cancel(byteReadChannel);
            }

            @Override // java.io.InputStream
            public int read() throws java.lang.Throwable {
                if (byteReadChannel.isClosedForRead()) {
                    return -1;
                }
                if (byteReadChannel.getReadBuffer().o()) {
                    blockingWait();
                }
                if (byteReadChannel.isClosedForRead()) {
                    return -1;
                }
                return byteReadChannel.getReadBuffer().readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] b9, int off, int len) throws java.lang.Throwable {
                kotlin.jvm.internal.m.e(b9, "b");
                if (byteReadChannel.isClosedForRead()) {
                    return -1;
                }
                if (byteReadChannel.getReadBuffer().o()) {
                    blockingWait();
                }
                int iQ = byteReadChannel.getReadBuffer().q(b9, off, java.lang.Math.min(io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel), len) + off);
                if (iQ >= 0) {
                    return iQ;
                }
                return byteReadChannel.isClosedForRead() ? -1 : 0;
            }
        };
    }

    public static /* synthetic */ java.io.InputStream toInputStream$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, S7.InterfaceC0891h0 interfaceC0891h0, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            interfaceC0891h0 = null;
        }
        return toInputStream(byteReadChannel, interfaceC0891h0);
    }

    public static final java.io.OutputStream toOutputStream(final io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.m.e(byteWriteChannel, "<this>");
        return new java.io.OutputStream() { // from class: io.ktor.utils.io.jvm.javaio.BlockingKt.toOutputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.lang.Throwable {
                S7.C.E(p100l6.i.f24820h, new io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$close$1(byteWriteChannel, null));
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws java.lang.Throwable {
                S7.C.E(p100l6.i.f24820h, new io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$flush$1(byteWriteChannel, null));
            }

            @Override // java.io.OutputStream
            public void write(int b9) throws java.lang.Throwable {
                S7.C.E(p100l6.i.f24820h, new io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$1(byteWriteChannel, b9, null));
            }

            @Override // java.io.OutputStream
            public void write(byte[] b9, int off, int len) throws java.lang.Throwable {
                kotlin.jvm.internal.m.e(b9, "b");
                S7.C.E(p100l6.i.f24820h, new io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$2(byteWriteChannel, b9, off, len, null));
            }
        };
    }
}
