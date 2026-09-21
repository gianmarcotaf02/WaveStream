package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/CookieJvmSerializer;", "Lio/ktor/utils/io/JvmSerializer;", "Lio/ktor/http/Cookie;", "<init>", "()V", "value", "", "jvmSerialize", "(Lio/ktor/http/Cookie;)[B", "jvmDeserialize", "([B)Lio/ktor/http/Cookie;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CookieJvmSerializer implements io.ktor.utils.io.JvmSerializer<io.ktor.http.Cookie> {
    public static final io.ktor.http.CookieJvmSerializer INSTANCE = new io.ktor.http.CookieJvmSerializer();

    private CookieJvmSerializer() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.utils.io.JvmSerializer
    public io.ktor.http.Cookie jvmDeserialize(byte[] value) {
        kotlin.jvm.internal.m.e(value, "value");
        return io.ktor.http.CookieKt.parseServerSetCookieHeader(O7.x.n0(value));
    }

    @Override // io.ktor.utils.io.JvmSerializer
    public byte[] jvmSerialize(io.ktor.http.Cookie value) {
        kotlin.jvm.internal.m.e(value, "value");
        return O7.x.p0(io.ktor.http.CookieKt.renderSetCookieHeader(value));
    }
}
