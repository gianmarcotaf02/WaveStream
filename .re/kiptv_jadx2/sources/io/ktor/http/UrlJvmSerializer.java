package io.ktor.http;

import O7.x;
import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.JvmSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/UrlJvmSerializer;", "Lio/ktor/utils/io/JvmSerializer;", "Lio/ktor/http/Url;", "<init>", "()V", "value", "", "jvmSerialize", "(Lio/ktor/http/Url;)[B", "jvmDeserialize", "([B)Lio/ktor/http/Url;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UrlJvmSerializer implements JvmSerializer<Url> {
    public static final UrlJvmSerializer INSTANCE = new UrlJvmSerializer();

    private UrlJvmSerializer() {
    }

    @Override
    public Url jvmDeserialize(byte[] value) {
        m.e(value, "value");
        return URLUtilsKt.Url(x.n0(value));
    }

    @Override
    public byte[] jvmSerialize(Url value) {
        m.e(value, "value");
        return x.p0(value.getUrlString());
    }
}
