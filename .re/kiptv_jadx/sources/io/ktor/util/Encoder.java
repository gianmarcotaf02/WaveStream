package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\tJ!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lio/ktor/util/Encoder;", "", "Lio/ktor/utils/io/ByteReadChannel;", "source", "Ll6/h;", "coroutineContext", "encode", "(Lio/ktor/utils/io/ByteReadChannel;Ll6/h;)Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;Ll6/h;)Lio/ktor/utils/io/ByteWriteChannel;", "decode", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Encoder {
    io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, p100l6.h coroutineContext);

    io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, p100l6.h coroutineContext);

    io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, p100l6.h coroutineContext);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static /* synthetic */ io.ktor.utils.io.ByteReadChannel decode$default(io.ktor.util.Encoder encoder, io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.h hVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
            }
            if ((i3 & 2) != 0) {
                hVar = p100l6.i.f24820h;
            }
            return encoder.decode(byteReadChannel, hVar);
        }

        public static /* synthetic */ io.ktor.utils.io.ByteReadChannel encode$default(io.ktor.util.Encoder encoder, io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.h hVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
            }
            if ((i3 & 2) != 0) {
                hVar = p100l6.i.f24820h;
            }
            return encoder.encode(byteReadChannel, hVar);
        }

        public static /* synthetic */ io.ktor.utils.io.ByteWriteChannel encode$default(io.ktor.util.Encoder encoder, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p100l6.h hVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
            }
            if ((i3 & 2) != 0) {
                hVar = p100l6.i.f24820h;
            }
            return encoder.encode(byteWriteChannel, hVar);
        }
    }
}
