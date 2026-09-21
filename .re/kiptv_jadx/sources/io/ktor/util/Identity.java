package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lio/ktor/util/Identity;", "Lio/ktor/util/Encoder;", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "source", "Ll6/h;", "coroutineContext", "encode", "(Lio/ktor/utils/io/ByteReadChannel;Ll6/h;)Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;Ll6/h;)Lio/ktor/utils/io/ByteWriteChannel;", "decode", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Identity implements io.ktor.util.Encoder {
    public static final io.ktor.util.Identity INSTANCE = new io.ktor.util.Identity();

    private Identity() {
    }

    @Override // io.ktor.util.Encoder
    public io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        return source;
    }

    @Override // io.ktor.util.Encoder
    public io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        return source;
    }

    @Override // io.ktor.util.Encoder
    public io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        return source;
    }
}
