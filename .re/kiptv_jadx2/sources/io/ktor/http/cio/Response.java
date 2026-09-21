package io.ktor.http.cio;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.cio.internals.CharArrayBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lio/ktor/http/cio/Response;", "Lio/ktor/http/cio/HttpMessage;", "", "version", "", "status", "statusText", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "<init>", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lio/ktor/http/cio/HttpHeadersMap;Lio/ktor/http/cio/internals/CharArrayBuilder;)V", "Ljava/lang/CharSequence;", "getVersion", "()Ljava/lang/CharSequence;", "I", "getStatus", "()I", "getStatusText", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Response extends HttpMessage {
    private final int status;
    private final CharSequence statusText;
    private final CharSequence version;

    public Response(CharSequence version, int i3, CharSequence statusText, HttpHeadersMap headers, CharArrayBuilder builder) {
        super(headers, builder);
        m.e(version, "version");
        m.e(statusText, "statusText");
        m.e(headers, "headers");
        m.e(builder, "builder");
        this.version = version;
        this.status = i3;
        this.statusText = statusText;
    }

    public final int getStatus() {
        return this.status;
    }

    public final CharSequence getStatusText() {
        return this.statusText;
    }

    public final CharSequence getVersion() {
        return this.version;
    }
}
