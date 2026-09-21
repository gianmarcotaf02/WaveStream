package io.ktor.http;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Lio/ktor/http/Url;", "", "getAuthority", "(Lio/ktor/http/Url;)Ljava/lang/String;", "authority", "getProtocolWithAuthority", "protocolWithAuthority", "getEncodedUserAndPassword", "encodedUserAndPassword", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UrlKt {
    public static final String getAuthority(Url url) {
        m.e(url, "<this>");
        return getEncodedUserAndPassword(url) + URLUtilsKt.getHostWithPortIfSpecified(url);
    }

    public static final String getEncodedUserAndPassword(Url url) {
        m.e(url, "<this>");
        StringBuilder sb = new StringBuilder();
        URLUtilsKt.appendUserAndPassword(sb, url.getEncodedUser(), url.getEncodedPassword());
        return sb.toString();
    }

    public static final String getProtocolWithAuthority(Url url) {
        m.e(url, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(url.getProtocol().getName());
        sb.append("://");
        sb.append(getEncodedUserAndPassword(url));
        if (url.getSpecifiedPort() == 0 || url.getSpecifiedPort() == url.getProtocol().getDefaultPort()) {
            sb.append(url.getHost());
        } else {
            sb.append(URLUtilsKt.getHostWithPort(url));
        }
        return sb.toString();
    }
}
