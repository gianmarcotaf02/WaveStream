package io.ktor.http.cio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lio/ktor/http/cio/Response;", "Lio/ktor/http/cio/HttpMessage;", "", "version", "", "status", "statusText", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "<init>", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lio/ktor/http/cio/HttpHeadersMap;Lio/ktor/http/cio/internals/CharArrayBuilder;)V", "Ljava/lang/CharSequence;", "getVersion", "()Ljava/lang/CharSequence;", "I", "getStatus", "()I", "getStatusText", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Response extends io.ktor.http.cio.HttpMessage {
    private final int status;
    private final java.lang.CharSequence statusText;
    private final java.lang.CharSequence version;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Response(java.lang.CharSequence version, int i3, java.lang.CharSequence statusText, io.ktor.http.cio.HttpHeadersMap headers, io.ktor.http.cio.internals.CharArrayBuilder builder) {
        super(headers, builder);
        kotlin.jvm.internal.m.e(version, "version");
        kotlin.jvm.internal.m.e(statusText, "statusText");
        kotlin.jvm.internal.m.e(headers, "headers");
        kotlin.jvm.internal.m.e(builder, "builder");
        this.version = version;
        this.status = i3;
        this.statusText = statusText;
    }

    public final int getStatus() {
        return this.status;
    }

    public final java.lang.CharSequence getStatusText() {
        return this.statusText;
    }

    public final java.lang.CharSequence getVersion() {
        return this.version;
    }
}
