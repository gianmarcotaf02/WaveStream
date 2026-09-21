package io.ktor.util;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.HTTPClient;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.h;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\t\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\t\u0010\fJ \u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\r\u0010\nR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/util/GZipEncoder;", "Lio/ktor/util/ContentEncoder;", "Lio/ktor/util/Encoder;", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "source", "Ll6/h;", "coroutineContext", "encode", "(Lio/ktor/utils/io/ByteReadChannel;Ll6/h;)Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;Ll6/h;)Lio/ktor/utils/io/ByteWriteChannel;", "decode", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GZipEncoder implements ContentEncoder, Encoder {
    public static final GZipEncoder INSTANCE = new GZipEncoder();
    private static final String name = HTTPClient.RC_FORMAT_ACCEPT_ENCODING;
    private final Encoder $$delegate_0 = EncodersJvmKt.getGZip();

    private GZipEncoder() {
    }

    @Override
    public ByteReadChannel decode(ByteReadChannel source, h coroutineContext) {
        m.e(source, "source");
        m.e(coroutineContext, "coroutineContext");
        return this.$$delegate_0.decode(source, coroutineContext);
    }

    @Override
    public ByteReadChannel encode(ByteReadChannel source, h coroutineContext) {
        m.e(source, "source");
        m.e(coroutineContext, "coroutineContext");
        return this.$$delegate_0.encode(source, coroutineContext);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long predictCompressedLength(long j) {
        return ContentEncoder.DefaultImpls.predictCompressedLength(this, j);
    }

    @Override
    public ByteWriteChannel encode(ByteWriteChannel source, h coroutineContext) {
        m.e(source, "source");
        m.e(coroutineContext, "coroutineContext");
        return this.$$delegate_0.encode(source, coroutineContext);
    }
}
