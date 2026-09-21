package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Lio/ktor/http/Url;", "", "getAuthority", "(Lio/ktor/http/Url;)Ljava/lang/String;", "authority", "getProtocolWithAuthority", "protocolWithAuthority", "getEncodedUserAndPassword", "encodedUserAndPassword", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UrlKt {
    public static final java.lang.String getAuthority(io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(url, "<this>");
        return getEncodedUserAndPassword(url) + io.ktor.http.URLUtilsKt.getHostWithPortIfSpecified(url);
    }

    public static final java.lang.String getEncodedUserAndPassword(io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(url, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        io.ktor.http.URLUtilsKt.appendUserAndPassword(sb, url.getEncodedUser(), url.getEncodedPassword());
        return sb.toString();
    }

    public static final java.lang.String getProtocolWithAuthority(io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(url, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(url.getProtocol().getName());
        sb.append("://");
        sb.append(getEncodedUserAndPassword(url));
        if (url.getSpecifiedPort() == 0 || url.getSpecifiedPort() == url.getProtocol().getDefaultPort()) {
            sb.append(url.getHost());
        } else {
            sb.append(io.ktor.http.URLUtilsKt.getHostWithPort(url));
        }
        return sb.toString();
    }
}
