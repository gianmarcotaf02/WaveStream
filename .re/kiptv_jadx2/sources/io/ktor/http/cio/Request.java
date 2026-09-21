package io.ktor.http.cio;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.HttpMethod;
import io.ktor.http.cio.internals.CharArrayBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/ktor/http/cio/Request;", "Lio/ktor/http/cio/HttpMessage;", "Lio/ktor/http/HttpMethod;", io.sentry.protocol.Request.JsonKeys.METHOD, "", "uri", "version", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "<init>", "(Lio/ktor/http/HttpMethod;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lio/ktor/http/cio/HttpHeadersMap;Lio/ktor/http/cio/internals/CharArrayBuilder;)V", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "Ljava/lang/CharSequence;", "getUri", "()Ljava/lang/CharSequence;", "getVersion", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Request extends HttpMessage {
    private final HttpMethod method;
    private final CharSequence uri;
    private final CharSequence version;

    public Request(HttpMethod method, CharSequence uri, CharSequence version, HttpHeadersMap headers, CharArrayBuilder builder) {
        super(headers, builder);
        m.e(method, "method");
        m.e(uri, "uri");
        m.e(version, "version");
        m.e(headers, "headers");
        m.e(builder, "builder");
        this.method = method;
        this.uri = uri;
        this.version = version;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final CharSequence getUri() {
        return this.uri;
    }

    public final CharSequence getVersion() {
        return this.version;
    }
}
