package io.ktor.utils.io.jvm.nio;

import S7.M;
import Z7.d;
import Z7.e;
import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.RawSourceChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.f;
import p100l6.h;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "Ll6/h;", "context", "Lio/ktor/utils/io/ByteReadChannel;", "toByteReadChannel", "(Ljava/nio/channels/ReadableByteChannel;Ll6/h;)Lio/ktor/utils/io/ByteReadChannel;", "Lk8/f;", "asSource", "(Ljava/nio/channels/ReadableByteChannel;)Lk8/f;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReadingKt {
    public static final f asSource(ReadableByteChannel readableByteChannel) {
        m.e(readableByteChannel, "<this>");
        return new ReadableByteChannelSource(readableByteChannel);
    }

    public static final ByteReadChannel toByteReadChannel(ReadableByteChannel readableByteChannel, h context) {
        m.e(readableByteChannel, "<this>");
        m.e(context, "context");
        return new RawSourceChannel(asSource(readableByteChannel), context);
    }

    public static ByteReadChannel toByteReadChannel$default(ReadableByteChannel readableByteChannel, h hVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            e eVar = M.f9549a;
            hVar = d.f13044i;
        }
        return toByteReadChannel(readableByteChannel, hVar);
    }
}
