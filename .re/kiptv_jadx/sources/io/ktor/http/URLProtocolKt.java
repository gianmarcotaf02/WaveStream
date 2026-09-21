package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/ktor/http/URLProtocol;", "", "isWebsocket", "(Lio/ktor/http/URLProtocol;)Z", "isSecure", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class URLProtocolKt {
    public static final boolean isSecure(io.ktor.http.URLProtocol uRLProtocol) {
        kotlin.jvm.internal.m.e(uRLProtocol, "<this>");
        return kotlin.jvm.internal.m.a(uRLProtocol.getName(), "https") || kotlin.jvm.internal.m.a(uRLProtocol.getName(), "wss");
    }

    public static final boolean isWebsocket(io.ktor.http.URLProtocol uRLProtocol) {
        kotlin.jvm.internal.m.e(uRLProtocol, "<this>");
        return kotlin.jvm.internal.m.a(uRLProtocol.getName(), "ws") || kotlin.jvm.internal.m.a(uRLProtocol.getName(), "wss");
    }
}
