package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/http/URLBuilder;", "Ljava/net/URI;", "uri", "takeFrom", "(Lio/ktor/http/URLBuilder;Ljava/net/URI;)Lio/ktor/http/URLBuilder;", "Ljava/net/URL;", io.sentry.protocol.Request.JsonKeys.URL, "(Lio/ktor/http/URLBuilder;Ljava/net/URL;)Lio/ktor/http/URLBuilder;", "Lio/ktor/http/Url;", "toURI", "(Lio/ktor/http/Url;)Ljava/net/URI;", "Url", "(Ljava/net/URI;)Lio/ktor/http/Url;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class URLUtilsJvmKt {
    public static final io.ktor.http.Url Url(java.net.URI uri) {
        kotlin.jvm.internal.m.e(uri, "uri");
        return takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), uri).build();
    }

    public static final io.ktor.http.URLBuilder takeFrom(io.ktor.http.URLBuilder uRLBuilder, java.net.URI uri) {
        kotlin.jvm.internal.m.e(uRLBuilder, "<this>");
        kotlin.jvm.internal.m.e(uri, "uri");
        java.lang.String scheme = uri.getScheme();
        if (scheme != null) {
            uRLBuilder.setProtocol(io.ktor.http.URLProtocol.INSTANCE.createOrDefault(scheme));
            uRLBuilder.setPort(uRLBuilder.getProtocol().getDefaultPort());
        }
        if (uri.getPort() > 0) {
            uRLBuilder.setPort(uri.getPort());
        } else {
            java.lang.String scheme2 = uri.getScheme();
            if (kotlin.jvm.internal.m.a(scheme2, "http")) {
                uRLBuilder.setPort(80);
            } else if (kotlin.jvm.internal.m.a(scheme2, "https")) {
                uRLBuilder.setPort(443);
            }
        }
        if (uri.getRawUserInfo() != null) {
            java.lang.String rawUserInfo = uri.getRawUserInfo();
            kotlin.jvm.internal.m.d(rawUserInfo, "getRawUserInfo(...)");
            if (rawUserInfo.length() > 0) {
                java.lang.String rawUserInfo2 = uri.getRawUserInfo();
                kotlin.jvm.internal.m.d(rawUserInfo2, "getRawUserInfo(...)");
                java.util.List listB1 = O7.q.b1(rawUserInfo2, new java.lang.String[]{":"}, 0, 6);
                uRLBuilder.setEncodedUser((java.lang.String) p078i6.o.h1(listB1));
                uRLBuilder.setEncodedPassword((java.lang.String) p078i6.o.k1(1, listB1));
            }
        }
        java.lang.String host = uri.getHost();
        if (host != null) {
            uRLBuilder.setHost(host);
        }
        io.ktor.http.URLBuilderKt.setEncodedPath(uRLBuilder, uri.getRawPath());
        java.lang.String rawQuery = uri.getRawQuery();
        if (rawQuery != null) {
            io.ktor.http.ParametersBuilder parametersBuilderParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
            parametersBuilderParametersBuilder$default.appendAll(io.ktor.http.QueryKt.parseQueryString$default(rawQuery, 0, 0, false, 6, null));
            uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        }
        java.lang.String query = uri.getQuery();
        if (query != null && query.length() == 0) {
            uRLBuilder.setTrailingQuery(true);
        }
        java.lang.String rawFragment = uri.getRawFragment();
        if (rawFragment != null) {
            uRLBuilder.setEncodedFragment(rawFragment);
        }
        return uRLBuilder;
    }

    public static final java.net.URI toURI(io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(url, "<this>");
        return new java.net.URI(url.getUrlString());
    }

    public static final io.ktor.http.URLBuilder takeFrom(io.ktor.http.URLBuilder uRLBuilder, java.net.URL url) throws java.net.URISyntaxException {
        kotlin.jvm.internal.m.e(uRLBuilder, "<this>");
        kotlin.jvm.internal.m.e(url, "url");
        java.lang.String host = url.getHost();
        kotlin.jvm.internal.m.d(host, "getHost(...)");
        if (O7.q.C0(host, '_')) {
            java.lang.String string = url.toString();
            kotlin.jvm.internal.m.d(string, "toString(...)");
            return io.ktor.http.URLParserKt.takeFrom(uRLBuilder, string);
        }
        java.net.URI uri = url.toURI();
        kotlin.jvm.internal.m.d(uri, "toURI(...)");
        return takeFrom(uRLBuilder, uri);
    }
}
