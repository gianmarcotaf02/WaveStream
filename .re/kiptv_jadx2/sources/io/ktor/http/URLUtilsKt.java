package io.ktor.http;

import O7.q;
import O7.x;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.P;
import io.ktor.util.StringValuesKt;
import io.sentry.protocol.Request;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.k;
import p078i6.o;
import p078i6.u;
import p194x6.j;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0004\u001a\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011\u001a\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0015\u001a/\u0010\u001c\u001a\u00020\t*\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001c\u001a\u00020\t*\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010 \u001a+\u0010%\u001a\u00020\t*\u00060!j\u0002`\"2\b\u0010#\u001a\u0004\u0018\u00010\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b%\u0010&\"\u0015\u0010)\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0015\u0010+\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010(\"\u0015\u0010-\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010(\"\u0015\u0010.\u001a\u00020\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00100\u001a\u00020\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010/\"\u0015\u0010.\u001a\u00020\u001a*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b.\u00101\"\u0015\u00100\u001a\u00020\u001a*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"", "urlString", "Lio/ktor/http/Url;", "Url", "(Ljava/lang/String;)Lio/ktor/http/Url;", "Lio/ktor/http/URLBuilder;", "builder", "(Lio/ktor/http/URLBuilder;)Lio/ktor/http/Url;", "Lkotlin/Function1;", "Lh6/A;", "block", "buildUrl", "(Lx6/j;)Lio/ktor/http/Url;", "parseUrl", "URLBuilder", "(Ljava/lang/String;)Lio/ktor/http/URLBuilder;", Request.JsonKeys.URL, "(Lio/ktor/http/Url;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "takeFrom", "(Lio/ktor/http/URLBuilder;Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;Lio/ktor/http/Url;)Lio/ktor/http/URLBuilder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "encodedPath", "encodedQuery", "", "trailingQuery", "appendUrlFullPath", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Z)V", "Lio/ktor/http/ParametersBuilder;", "encodedQueryParameters", "(Ljava/lang/Appendable;Ljava/lang/String;Lio/ktor/http/ParametersBuilder;Z)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "encodedUser", "encodedPassword", "appendUserAndPassword", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V", "getFullPath", "(Lio/ktor/http/Url;)Ljava/lang/String;", "fullPath", "getHostWithPort", "hostWithPort", "getHostWithPortIfSpecified", "hostWithPortIfSpecified", "isAbsolutePath", "(Lio/ktor/http/Url;)Z", "isRelativePath", "(Lio/ktor/http/URLBuilder;)Z", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class URLUtilsKt {
    public static final URLBuilder URLBuilder(String urlString) {
        m.e(urlString, "urlString");
        return URLParserKt.takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), urlString);
    }

    public static final Url Url(String urlString) {
        m.e(urlString, "urlString");
        return URLBuilder(urlString).build();
    }

    public static final void appendUrlFullPath(Appendable appendable, String encodedPath, String encodedQuery, boolean z6) throws IOException {
        m.e(appendable, "<this>");
        m.e(encodedPath, "encodedPath");
        m.e(encodedQuery, "encodedQuery");
        if (!q.N0(encodedPath) && !x.x0(encodedPath, "/", false)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (encodedQuery.length() > 0 || z6) {
            appendable.append("?");
        }
        appendable.append(encodedQuery);
    }

    public static final CharSequence appendUrlFullPath$lambda$6(k it) {
        m.e(it, "it");
        String str = (String) it.f22539h;
        Object obj = it.f22540i;
        if (obj == null) {
            return str;
        }
        return str + '=' + String.valueOf(obj);
    }

    public static final void appendUserAndPassword(StringBuilder sb, String str, String str2) {
        m.e(sb, "<this>");
        if (str == null) {
            return;
        }
        sb.append(str);
        if (str2 != null) {
            sb.append(':');
            sb.append(str2);
        }
        sb.append("@");
    }

    public static final Url buildUrl(j block) {
        m.e(block, "block");
        URLBuilder uRLBuilder = new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
        block.invoke(uRLBuilder);
        return uRLBuilder.build();
    }

    public static final String getFullPath(Url url) throws IOException {
        m.e(url, "<this>");
        StringBuilder sb = new StringBuilder();
        appendUrlFullPath(sb, url.getEncodedPath(), url.getEncodedQuery(), url.getTrailingQuery());
        return sb.toString();
    }

    public static final String getHostWithPort(Url url) {
        m.e(url, "<this>");
        return url.getHost() + ':' + url.getPort();
    }

    public static final String getHostWithPortIfSpecified(Url url) {
        m.e(url, "<this>");
        int specifiedPort = url.getSpecifiedPort();
        return (specifiedPort == 0 || specifiedPort == url.getProtocol().getDefaultPort()) ? url.getHost() : getHostWithPort(url);
    }

    public static final boolean isAbsolutePath(Url url) {
        m.e(url, "<this>");
        return m.a(o.j1(url.getRawSegments()), "");
    }

    public static final boolean isRelativePath(Url url) {
        m.e(url, "<this>");
        return !isAbsolutePath(url);
    }

    public static final Url parseUrl(String urlString) {
        m.e(urlString, "urlString");
        try {
            URLBuilder URLBuilder = URLBuilder(urlString);
            if (URLBuilder.getHost().length() <= 0) {
                URLBuilder = null;
            }
            if (URLBuilder != null) {
                return URLBuilder.build();
            }
        } catch (URLParserException unused) {
        }
        return null;
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, URLBuilder url) {
        m.e(uRLBuilder, "<this>");
        m.e(url, "url");
        uRLBuilder.setProtocolOrNull(url.getProtocolOrNull());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        uRLBuilder.setEncodedPathSegments(url.getEncodedPathSegments());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        StringValuesKt.appendAll(parametersBuilderParametersBuilder$default, url.getEncodedParameters());
        uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }

    public static final URLBuilder URLBuilder(Url url) {
        m.e(url, "url");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    public static final Url Url(URLBuilder builder) {
        m.e(builder, "builder");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), builder).build();
    }

    public static final boolean isAbsolutePath(URLBuilder uRLBuilder) {
        m.e(uRLBuilder, "<this>");
        return m.a(o.j1(uRLBuilder.getPathSegments()), "");
    }

    public static final boolean isRelativePath(URLBuilder uRLBuilder) {
        m.e(uRLBuilder, "<this>");
        return !isAbsolutePath(uRLBuilder);
    }

    public static final URLBuilder URLBuilder(URLBuilder builder) {
        m.e(builder, "builder");
        return takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), builder);
    }

    public static final void appendUrlFullPath(Appendable appendable, String encodedPath, ParametersBuilder encodedQueryParameters, boolean z6) throws IOException {
        List listI0;
        m.e(appendable, "<this>");
        m.e(encodedPath, "encodedPath");
        m.e(encodedQueryParameters, "encodedQueryParameters");
        if (!q.N0(encodedPath) && !x.x0(encodedPath, "/", false)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z6) {
            appendable.append("?");
        }
        Set<Map.Entry<String, List<String>>> setEntries = encodedQueryParameters.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listI0 = P.i0(new k(str, null));
            } else {
                ArrayList arrayList2 = new ArrayList(p078i6.q.I0(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    M0.w(str, (String) it2.next(), arrayList2);
                }
                listI0 = arrayList2;
            }
            u.M0(arrayList, listI0);
        }
        o.n1(arrayList, appendable, "&", null, null, new b(3), 60);
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, Url url) {
        m.e(uRLBuilder, "<this>");
        m.e(url, "url");
        uRLBuilder.setProtocolOrNull(url.getProtocolOrNull());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        URLBuilderKt.setEncodedPath(uRLBuilder, url.getEncodedPath());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        parametersBuilderParametersBuilder$default.appendAll(QueryKt.parseQueryString$default(url.getEncodedQuery(), 0, 0, false, 6, null));
        uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }
}
