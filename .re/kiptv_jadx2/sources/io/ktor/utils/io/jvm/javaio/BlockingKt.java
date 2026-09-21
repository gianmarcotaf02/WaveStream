package io.ktor.utils.io.jvm.javaio;

import S7.C;
import S7.InterfaceC0891h0;
import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "LS7/h0;", "parent", "Ljava/io/InputStream;", "toInputStream", "(Lio/ktor/utils/io/ByteReadChannel;LS7/h0;)Ljava/io/InputStream;", "Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/io/OutputStream;", "toOutputStream", "(Lio/ktor/utils/io/ByteWriteChannel;)Ljava/io/OutputStream;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BlockingKt {
    public static final InputStream toInputStream(final ByteReadChannel byteReadChannel, InterfaceC0891h0 interfaceC0891h0) {
        m.e(byteReadChannel, "<this>");
        return new InputStream() {
            private final void blockingWait() throws Throwable {
                C.E(i.f24820h, new BlockingKt$toInputStream$1$blockingWait$1(byteReadChannel, null));
            }

            @Override
            public void close() {
                ByteReadChannelKt.cancel(byteReadChannel);
            }

            @Override
            public int read() throws Throwable {
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

            @Override
            public int read(byte[] b9, int off, int len) throws Throwable {
                m.e(b9, "b");
                if (byteReadChannel.isClosedForRead()) {
                    return -1;
                }
                if (byteReadChannel.getReadBuffer().o()) {
                    blockingWait();
                }
                int iQ = byteReadChannel.getReadBuffer().q(b9, off, Math.min(ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel), len) + off);
                if (iQ >= 0) {
                    return iQ;
                }
                return byteReadChannel.isClosedForRead() ? -1 : 0;
            }
        };
    }

    public static InputStream toInputStream$default(ByteReadChannel byteReadChannel, InterfaceC0891h0 interfaceC0891h0, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            interfaceC0891h0 = null;
        }
        return toInputStream(byteReadChannel, interfaceC0891h0);
    }

    public static final OutputStream toOutputStream(final ByteWriteChannel byteWriteChannel) {
        m.e(byteWriteChannel, "<this>");
        return new OutputStream() {
            @Override
            public void close() throws Throwable {
                C.E(i.f24820h, new BlockingKt$toOutputStream$1$close$1(byteWriteChannel, null));
            }

            @Override
            public void flush() throws Throwable {
                C.E(i.f24820h, new BlockingKt$toOutputStream$1$flush$1(byteWriteChannel, null));
            }

            @Override
            public void write(int b9) throws Throwable {
                C.E(i.f24820h, new BlockingKt$toOutputStream$1$write$1(byteWriteChannel, b9, null));
            }

            @Override
            public void write(byte[] b9, int off, int len) throws Throwable {
                m.e(b9, "b");
                C.E(i.f24820h, new BlockingKt$toOutputStream$1$write$2(byteWriteChannel, b9, off, len, null));
            }
        };
    }
}
