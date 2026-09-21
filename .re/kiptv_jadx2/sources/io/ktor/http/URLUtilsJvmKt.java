package io.ktor.http;

import O7.q;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/http/URLBuilder;", "Ljava/net/URI;", "uri", "takeFrom", "(Lio/ktor/http/URLBuilder;Ljava/net/URI;)Lio/ktor/http/URLBuilder;", "Ljava/net/URL;", Request.JsonKeys.URL, "(Lio/ktor/http/URLBuilder;Ljava/net/URL;)Lio/ktor/http/URLBuilder;", "Lio/ktor/http/Url;", "toURI", "(Lio/ktor/http/Url;)Ljava/net/URI;", "Url", "(Ljava/net/URI;)Lio/ktor/http/Url;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class URLUtilsJvmKt {
    public static final Url Url(URI uri) {
        m.e(uri, "uri");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), uri).build();
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, URI uri) {
        m.e(uRLBuilder, "<this>");
        m.e(uri, "uri");
        String scheme = uri.getScheme();
        if (scheme != null) {
            uRLBuilder.setProtocol(URLProtocol.INSTANCE.createOrDefault(scheme));
            uRLBuilder.setPort(uRLBuilder.getProtocol().getDefaultPort());
        }
        if (uri.getPort() > 0) {
            uRLBuilder.setPort(uri.getPort());
        } else {
            String scheme2 = uri.getScheme();
            if (m.a(scheme2, "http")) {
                uRLBuilder.setPort(80);
            } else if (m.a(scheme2, "https")) {
                uRLBuilder.setPort(443);
            }
        }
        if (uri.getRawUserInfo() != null) {
            String rawUserInfo = uri.getRawUserInfo();
            m.d(rawUserInfo, "getRawUserInfo(...)");
            if (rawUserInfo.length() > 0) {
                String rawUserInfo2 = uri.getRawUserInfo();
                m.d(rawUserInfo2, "getRawUserInfo(...)");
                List listB1 = q.b1(rawUserInfo2, new String[]{":"}, 0, 6);
                uRLBuilder.setEncodedUser((String) o.h1(listB1));
                uRLBuilder.setEncodedPassword((String) o.k1(1, listB1));
            }
        }
        String host = uri.getHost();
        if (host != null) {
            uRLBuilder.setHost(host);
        }
        URLBuilderKt.setEncodedPath(uRLBuilder, uri.getRawPath());
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null) {
            ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
            parametersBuilderParametersBuilder$default.appendAll(QueryKt.parseQueryString$default(rawQuery, 0, 0, false, 6, null));
            uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        }
        String query = uri.getQuery();
        if (query != null && query.length() == 0) {
            uRLBuilder.setTrailingQuery(true);
        }
        String rawFragment = uri.getRawFragment();
        if (rawFragment != null) {
            uRLBuilder.setEncodedFragment(rawFragment);
        }
        return uRLBuilder;
    }

    public static final URI toURI(Url url) {
        m.e(url, "<this>");
        return new URI(url.getUrlString());
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, URL url) throws URISyntaxException {
        m.e(uRLBuilder, "<this>");
        m.e(url, "url");
        String host = url.getHost();
        m.d(host, "getHost(...)");
        if (q.C0(host, '_')) {
            String string = url.toString();
            m.d(string, "toString(...)");
            return URLParserKt.takeFrom(uRLBuilder, string);
        }
        URI uri = url.toURI();
        m.d(uri, "toURI(...)");
        return takeFrom(uRLBuilder, uri);
    }
}
