package io.ktor.client.request;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Ljava/net/URL;", io.sentry.protocol.Request.JsonKeys.URL, "Lio/ktor/http/URLBuilder;", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/net/URL;)Lio/ktor/http/URLBuilder;", "Lio/ktor/client/request/HttpRequestBuilder$Companion;", "invoke", "(Lio/ktor/client/request/HttpRequestBuilder$Companion;Ljava/net/URL;)Lio/ktor/client/request/HttpRequestBuilder;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpRequestJvmKt {
    public static final io.ktor.client.request.HttpRequestBuilder invoke(io.ktor.client.request.HttpRequestBuilder.Companion companion, java.net.URL url) {
        kotlin.jvm.internal.m.e(companion, "<this>");
        kotlin.jvm.internal.m.e(url, "url");
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        url(httpRequestBuilder, url);
        return httpRequestBuilder;
    }

    public static final io.ktor.http.URLBuilder url(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.net.URL url) {
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.m.e(url, "url");
        return io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
    }
}
