package io.ktor.client.plugins;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "LS7/u;", "", io.sentry.protocol.Request.JsonKeys.URL, "", "timeoutMillis", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V", "Lio/ktor/client/request/HttpRequestBuilder;", io.sentry.SentryBaseEvent.JsonKeys.REQUEST, "(Lio/ktor/client/request/HttpRequestBuilder;)V", "Lio/ktor/client/request/HttpRequestData;", "(Lio/ktor/client/request/HttpRequestData;)V", "createCopy", "()Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/lang/String;", "Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpRequestTimeoutException extends java.io.IOException implements S7.InterfaceC0904u {
    private final java.lang.Long timeoutMillis;
    private final java.lang.String url;

    public /* synthetic */ HttpRequestTimeoutException(java.lang.String str, java.lang.Long l2, java.lang.Throwable th, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, l2, (i3 & 4) != 0 ? null : th);
    }

    public HttpRequestTimeoutException(java.lang.String url, java.lang.Long l2, java.lang.Throwable th) {
        kotlin.jvm.internal.m.e(url, "url");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request timeout has expired [url=");
        sb.append(url);
        sb.append(", request_timeout=");
        sb.append(l2 == null ? "unknown" : l2);
        sb.append(" ms]");
        super(sb.toString(), th);
        this.url = url;
        this.timeoutMillis = l2;
    }

    @Override // S7.InterfaceC0904u
    public io.ktor.client.plugins.HttpRequestTimeoutException createCopy() {
        return new io.ktor.client.plugins.HttpRequestTimeoutException(this.url, this.timeoutMillis, getCause());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(io.ktor.client.request.HttpRequestBuilder request) {
        kotlin.jvm.internal.m.e(request, "request");
        java.lang.String strBuildString = request.getUrl().buildString();
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) request.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
        this(strBuildString, httpTimeoutConfig != null ? httpTimeoutConfig.get_requestTimeoutMillis() : null, null, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(io.ktor.client.request.HttpRequestData request) {
        kotlin.jvm.internal.m.e(request, "request");
        java.lang.String urlString = request.getUrl().getUrlString();
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) request.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
        this(urlString, httpTimeoutConfig != null ? httpTimeoutConfig.get_requestTimeoutMillis() : null, null, 4, null);
    }
}
