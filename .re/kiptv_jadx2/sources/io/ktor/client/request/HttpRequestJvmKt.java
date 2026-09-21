package io.ktor.client.request;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLUtilsJvmKt;
import io.sentry.protocol.Request;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Ljava/net/URL;", Request.JsonKeys.URL, "Lio/ktor/http/URLBuilder;", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/net/URL;)Lio/ktor/http/URLBuilder;", "Lio/ktor/client/request/HttpRequestBuilder$Companion;", "invoke", "(Lio/ktor/client/request/HttpRequestBuilder$Companion;Ljava/net/URL;)Lio/ktor/client/request/HttpRequestBuilder;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpRequestJvmKt {
    public static final HttpRequestBuilder invoke(HttpRequestBuilder.Companion companion, URL url) {
        m.e(companion, "<this>");
        m.e(url, "url");
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        url(httpRequestBuilder, url);
        return httpRequestBuilder;
    }

    public static final URLBuilder url(HttpRequestBuilder httpRequestBuilder, URL url) {
        m.e(httpRequestBuilder, "<this>");
        m.e(url, "url");
        return URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
    }
}
