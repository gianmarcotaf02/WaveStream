package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\t\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\t\u0010\fJ \u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\r\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/util/GZipEncoder;", "Lio/ktor/util/ContentEncoder;", "Lio/ktor/util/Encoder;", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "source", "Ll6/h;", "coroutineContext", "encode", "(Lio/ktor/utils/io/ByteReadChannel;Ll6/h;)Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;Ll6/h;)Lio/ktor/utils/io/ByteWriteChannel;", "decode", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GZipEncoder implements io.ktor.util.ContentEncoder, io.ktor.util.Encoder {
    public static final io.ktor.util.GZipEncoder INSTANCE = new io.ktor.util.GZipEncoder();
    private static final java.lang.String name = com.revenuecat.purchases.common.HTTPClient.RC_FORMAT_ACCEPT_ENCODING;
    private final /* synthetic */ io.ktor.util.Encoder $$delegate_0 = io.ktor.util.EncodersJvmKt.getGZip();

    private GZipEncoder() {
    }

    @Override // io.ktor.util.Encoder
    public io.ktor.utils.io.ByteReadChannel decode(io.ktor.utils.io.ByteReadChannel source, p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        return this.$$delegate_0.decode(source, coroutineContext);
    }

    @Override // io.ktor.util.Encoder
    public io.ktor.utils.io.ByteReadChannel encode(io.ktor.utils.io.ByteReadChannel source, p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        return this.$$delegate_0.encode(source, coroutineContext);
    }

    @Override // io.ktor.util.ContentEncoder
    public java.lang.String getName() {
        return name;
    }

    @Override // io.ktor.util.ContentEncoder
    public java.lang.Long predictCompressedLength(long j) {
        return io.ktor.util.ContentEncoder.DefaultImpls.predictCompressedLength(this, j);
    }

    @Override // io.ktor.util.Encoder
    public io.ktor.utils.io.ByteWriteChannel encode(io.ktor.utils.io.ByteWriteChannel source, p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        return this.$$delegate_0.encode(source, coroutineContext);
    }
}
