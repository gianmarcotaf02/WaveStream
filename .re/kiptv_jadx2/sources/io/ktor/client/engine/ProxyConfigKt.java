package io.ktor.client.engine;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.URLUtilsKt;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/engine/ProxyBuilder;", "", "urlString", "Ljava/net/Proxy;", "Lio/ktor/client/engine/ProxyConfig;", "http", "(Lio/ktor/client/engine/ProxyBuilder;Ljava/lang/String;)Ljava/net/Proxy;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProxyConfigKt {
    public static final Proxy http(ProxyBuilder proxyBuilder, String urlString) {
        m.e(proxyBuilder, "<this>");
        m.e(urlString, "urlString");
        return proxyBuilder.http(URLUtilsKt.Url(urlString));
    }
}
