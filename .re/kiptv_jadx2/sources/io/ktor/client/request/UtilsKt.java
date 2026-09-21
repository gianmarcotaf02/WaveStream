package io.ktor.client.request;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.ktor.http.ContentType;
import io.ktor.http.Cookie;
import io.ktor.http.CookieEncoding;
import io.ktor.http.CookieKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.util.Base64Kt;
import io.ktor.util.date.GMTDate;
import io.sentry.protocol.User;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p078i6.x;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0017\u001a\u00020\u0005*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010\"\u001a\u00020\u0005*\u00020\u00002\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b\"\u0010#\"(\u0010(\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"(\u0010-\u001a\u00020\t*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lio/ktor/http/HttpMessageBuilder;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "value", "Lh6/A;", "header", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "name", "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "", "secure", "httpOnly", "", "extensions", "cookie", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/String;ILio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "parameter", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "Lio/ktor/http/ContentType;", "contentType", "accept", "(Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V", User.JsonKeys.USERNAME, "password", "basicAuth", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/String;)V", "token", "bearerAuth", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;)V", "getHost", "(Lio/ktor/client/request/HttpRequestBuilder;)Ljava/lang/String;", "setHost", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V", DiagnosticsTracker.HOST_KEY, "getPort", "(Lio/ktor/client/request/HttpRequestBuilder;)I", "setPort", "(Lio/ktor/client/request/HttpRequestBuilder;I)V", "port", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UtilsKt {
    public static final void accept(HttpMessageBuilder httpMessageBuilder, ContentType contentType) {
        m.e(httpMessageBuilder, "<this>");
        m.e(contentType, "contentType");
        httpMessageBuilder.getHeaders().append(HttpHeaders.INSTANCE.getAccept(), contentType.toString());
    }

    public static final void basicAuth(HttpMessageBuilder httpMessageBuilder, String username, String password) {
        m.e(httpMessageBuilder, "<this>");
        m.e(username, "username");
        m.e(password, "password");
        String authorization = HttpHeaders.INSTANCE.getAuthorization();
        StringBuilder sb = new StringBuilder("Basic ");
        sb.append(Base64Kt.encodeBase64(username + ':' + password));
        header(httpMessageBuilder, authorization, sb.toString());
    }

    public static final void bearerAuth(HttpMessageBuilder httpMessageBuilder, String token) {
        m.e(httpMessageBuilder, "<this>");
        m.e(token, "token");
        header(httpMessageBuilder, HttpHeaders.INSTANCE.getAuthorization(), "Bearer ".concat(token));
    }

    public static final void cookie(HttpMessageBuilder httpMessageBuilder, String name, String value, int i3, GMTDate gMTDate, String str, String str2, boolean z6, boolean z9, Map<String, String> extensions) {
        m.e(httpMessageBuilder, "<this>");
        m.e(name, "name");
        m.e(value, "value");
        m.e(extensions, "extensions");
        String strRenderCookieHeader = CookieKt.renderCookieHeader(new Cookie(name, value, (CookieEncoding) null, Integer.valueOf(i3), gMTDate, str, str2, z6, z9, extensions, 4, (AbstractC2541f) null));
        HeadersBuilder headers = httpMessageBuilder.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (!headers.contains(httpHeaders.getCookie())) {
            httpMessageBuilder.getHeaders().append(httpHeaders.getCookie(), strRenderCookieHeader);
            return;
        }
        httpMessageBuilder.getHeaders().set(httpHeaders.getCookie(), httpMessageBuilder.getHeaders().get(httpHeaders.getCookie()) + "; " + strRenderCookieHeader);
    }

    public static void cookie$default(HttpMessageBuilder httpMessageBuilder, String str, String str2, int i3, GMTDate gMTDate, String str3, String str4, boolean z6, boolean z9, Map map, int i9, Object obj) {
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
            map = x.f23206h;
        }
        cookie(httpMessageBuilder, str, str2, i3, gMTDate, str3, str4, z6, z9, map);
    }

    public static final String getHost(HttpRequestBuilder httpRequestBuilder) {
        m.e(httpRequestBuilder, "<this>");
        return httpRequestBuilder.getUrl().getHost();
    }

    public static final int getPort(HttpRequestBuilder httpRequestBuilder) {
        m.e(httpRequestBuilder, "<this>");
        return httpRequestBuilder.getUrl().getPort();
    }

    public static final void header(HttpMessageBuilder httpMessageBuilder, String key, Object obj) {
        m.e(httpMessageBuilder, "<this>");
        m.e(key, "key");
        if (obj != null) {
            httpMessageBuilder.getHeaders().append(key, obj.toString());
        }
    }

    public static final void parameter(HttpRequestBuilder httpRequestBuilder, String key, Object obj) {
        m.e(httpRequestBuilder, "<this>");
        m.e(key, "key");
        if (obj != null) {
            httpRequestBuilder.getUrl().getParameters().append(key, obj.toString());
        }
    }

    public static final void setHost(HttpRequestBuilder httpRequestBuilder, String value) {
        m.e(httpRequestBuilder, "<this>");
        m.e(value, "value");
        httpRequestBuilder.getUrl().setHost(value);
    }

    public static final void setPort(HttpRequestBuilder httpRequestBuilder, int i3) {
        m.e(httpRequestBuilder, "<this>");
        httpRequestBuilder.getUrl().setPort(i3);
    }
}
