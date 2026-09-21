package io.ktor.util;

import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.InternalAPI;
import io.ktor.utils.io.core.internal.ChunkBufferJvmKt;
import io.ktor.utils.io.core.internal.ChunkBufferKt;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import p070h6.A;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "Lk8/a;", "buffer", "", "read", "(Ljava/nio/channels/ReadableByteChannel;Lk8/a;)I", "Ljava/nio/channels/WritableByteChannel;", "write", "(Ljava/nio/channels/WritableByteChannel;Lk8/a;)I", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BufferViewJvmKt {
    public static final int read(ReadableByteChannel readableByteChannel, p094k8.a buffer) {
        m.e(readableByteChannel, "<this>");
        m.e(buffer, "buffer");
        if (ChunkBufferKt.getWriteRemaining(buffer) == 0) {
            return 0;
        }
        y yVar = new y();
        ChunkBufferJvmKt.writeDirect(buffer, 1, new a(yVar, readableByteChannel, 2));
        return yVar.f24555h;
    }

    public static final A read$lambda$0(y yVar, ReadableByteChannel readableByteChannel, ByteBuffer bb) {
        m.e(bb, "bb");
        yVar.f24555h = readableByteChannel.read(bb);
        return A.f22523a;
    }

    @InternalAPI
    public static final int write(WritableByteChannel writableByteChannel, p094k8.a buffer) {
        m.e(writableByteChannel, "<this>");
        m.e(buffer, "buffer");
        y yVar = new y();
        ChunkBufferJvmKt.readDirect(buffer, new a(yVar, writableByteChannel, 1));
        return yVar.f24555h;
    }

    public static final A write$lambda$1(y yVar, WritableByteChannel writableByteChannel, ByteBuffer bb) {
        m.e(bb, "bb");
        yVar.f24555h = writableByteChannel.write(bb);
        return A.f22523a;
    }
}
