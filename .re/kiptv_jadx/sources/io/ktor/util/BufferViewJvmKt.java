package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "Lk8/a;", "buffer", "", "read", "(Ljava/nio/channels/ReadableByteChannel;Lk8/a;)I", "Ljava/nio/channels/WritableByteChannel;", "write", "(Ljava/nio/channels/WritableByteChannel;Lk8/a;)I", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BufferViewJvmKt {
    public static final int read(java.nio.channels.ReadableByteChannel readableByteChannel, p094k8.a buffer) {
        kotlin.jvm.internal.m.e(readableByteChannel, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        if (io.ktor.utils.io.core.internal.ChunkBufferKt.getWriteRemaining(buffer) == 0) {
            return 0;
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        io.ktor.utils.io.core.internal.ChunkBufferJvmKt.writeDirect(buffer, 1, new io.ktor.util.a(yVar, readableByteChannel, 2));
        return yVar.f24555h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A read$lambda$0(kotlin.jvm.internal.y yVar, java.nio.channels.ReadableByteChannel readableByteChannel, java.nio.ByteBuffer bb) {
        kotlin.jvm.internal.m.e(bb, "bb");
        yVar.f24555h = readableByteChannel.read(bb);
        return p070h6.A.f22523a;
    }

    @io.ktor.utils.io.InternalAPI
    public static final int write(java.nio.channels.WritableByteChannel writableByteChannel, p094k8.a buffer) {
        kotlin.jvm.internal.m.e(writableByteChannel, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        io.ktor.utils.io.core.internal.ChunkBufferJvmKt.readDirect(buffer, new io.ktor.util.a(yVar, writableByteChannel, 1));
        return yVar.f24555h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A write$lambda$1(kotlin.jvm.internal.y yVar, java.nio.channels.WritableByteChannel writableByteChannel, java.nio.ByteBuffer bb) {
        kotlin.jvm.internal.m.e(bb, "bb");
        yVar.f24555h = writableByteChannel.write(bb);
        return p070h6.A.f22523a;
    }
}
