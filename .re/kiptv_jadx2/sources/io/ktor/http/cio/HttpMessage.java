package io.ktor.http.cio;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.cio.internals.CharArrayBuilder;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/cio/HttpMessage;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "<init>", "(Lio/ktor/http/cio/HttpHeadersMap;Lio/ktor/http/cio/internals/CharArrayBuilder;)V", "Lh6/A;", "release", "()V", "close", "Lio/ktor/http/cio/HttpHeadersMap;", "getHeaders", "()Lio/ktor/http/cio/HttpHeadersMap;", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class HttpMessage implements Closeable, AutoCloseable {
    private final CharArrayBuilder builder;
    private final HttpHeadersMap headers;

    public HttpMessage(HttpHeadersMap headers, CharArrayBuilder builder) {
        m.e(headers, "headers");
        m.e(builder, "builder");
        this.headers = headers;
        this.builder = builder;
    }

    @Override
    public void close() {
        release();
    }

    public final HttpHeadersMap getHeaders() {
        return this.headers;
    }

    public final void release() {
        this.builder.release();
        this.headers.release();
    }
}
