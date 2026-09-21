package io.ktor.client.request;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\u0005*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010\"\u001a\u00020\u0005*\u00020\u00002\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b\"\u0010#\"(\u0010(\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"(\u0010-\u001a\u00020\t*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lio/ktor/http/HttpMessageBuilder;", "", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "", "value", "Lh6/A;", "header", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "name", "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "", "secure", "httpOnly", "", "extensions", "cookie", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/String;ILio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "parameter", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "Lio/ktor/http/ContentType;", "contentType", "accept", "(Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V", io.sentry.protocol.User.JsonKeys.USERNAME, "password", "basicAuth", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/String;)V", "token", "bearerAuth", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;)V", "getHost", "(Lio/ktor/client/request/HttpRequestBuilder;)Ljava/lang/String;", "setHost", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V", com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.HOST_KEY, "getPort", "(Lio/ktor/client/request/HttpRequestBuilder;)I", "setPort", "(Lio/ktor/client/request/HttpRequestBuilder;I)V", "port", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UtilsKt {
    public static final void accept(io.ktor.http.HttpMessageBuilder httpMessageBuilder, io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.m.e(contentType, "contentType");
        httpMessageBuilder.getHeaders().append(io.ktor.http.HttpHeaders.INSTANCE.getAccept(), contentType.toString());
    }

    public static final void basicAuth(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String username, java.lang.String password) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(password, "password");
        java.lang.String authorization = io.ktor.http.HttpHeaders.INSTANCE.getAuthorization();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Basic ");
        sb.append(io.ktor.util.Base64Kt.encodeBase64(username + ':' + password));
        header(httpMessageBuilder, authorization, sb.toString());
    }

    public static final void bearerAuth(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String token) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.m.e(token, "token");
        header(httpMessageBuilder, io.ktor.http.HttpHeaders.INSTANCE.getAuthorization(), "Bearer ".concat(token));
    }

    public static final void cookie(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String name, java.lang.String value, int i3, io.ktor.util.date.GMTDate gMTDate, java.lang.String str, java.lang.String str2, boolean z6, boolean z9, java.util.Map<java.lang.String, java.lang.String> extensions) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(extensions, "extensions");
        java.lang.String strRenderCookieHeader = io.ktor.http.CookieKt.renderCookieHeader(new io.ktor.http.Cookie(name, value, (io.ktor.http.CookieEncoding) null, java.lang.Integer.valueOf(i3), gMTDate, str, str2, z6, z9, extensions, 4, (kotlin.jvm.internal.AbstractC2541f) null));
        io.ktor.http.HeadersBuilder headers = httpMessageBuilder.getHeaders();
        io.ktor.http.HttpHeaders httpHeaders = io.ktor.http.HttpHeaders.INSTANCE;
        if (!headers.contains(httpHeaders.getCookie())) {
            httpMessageBuilder.getHeaders().append(httpHeaders.getCookie(), strRenderCookieHeader);
            return;
        }
        httpMessageBuilder.getHeaders().set(httpHeaders.getCookie(), httpMessageBuilder.getHeaders().get(httpHeaders.getCookie()) + "; " + strRenderCookieHeader);
    }

    public static /* synthetic */ void cookie$default(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String str, java.lang.String str2, int i3, io.ktor.util.date.GMTDate gMTDate, java.lang.String str3, java.lang.String str4, boolean z6, boolean z9, java.util.Map map, int i9, java.lang.Object obj) {
        if ((i9 & 4) != 0) {
            i3 = 0;
        }
        if ((i9 & 8) != 0) {
            gMTDate = null;
        }
        if ((i9 & 16) != 0) {
            str3 = null;
        }
        if ((i9 & 32) != 0) {
            str4 = null;
        }
        if ((i9 & 64) != 0) {
            z6 = false;
        }
        if ((i9 & 128) != 0) {
            z9 = false;
        }
        if ((i9 & 256) != 0) {
            map = p078i6.x.f23206h;
        }
        cookie(httpMessageBuilder, str, str2, i3, gMTDate, str3, str4, z6, z9, map);
    }

    public static final java.lang.String getHost(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
        return httpRequestBuilder.getUrl().getHost();
    }

    public static final int getPort(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
        return httpRequestBuilder.getUrl().getPort();
    }

    public static final void header(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String key, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.m.e(key, "key");
        if (obj != null) {
            httpMessageBuilder.getHeaders().append(key, obj.toString());
        }
    }

    public static final void parameter(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String key, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.m.e(key, "key");
        if (obj != null) {
            httpRequestBuilder.getUrl().getParameters().append(key, obj.toString());
        }
    }

    public static final void setHost(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String value) {
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.m.e(value, "value");
        httpRequestBuilder.getUrl().setHost(value);
    }

    public static final void setPort(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, int i3) {
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
        httpRequestBuilder.getUrl().setPort(i3);
    }
}
