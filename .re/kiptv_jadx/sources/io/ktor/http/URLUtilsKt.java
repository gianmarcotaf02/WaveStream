package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u0004\u001a\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011\u001a\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0013\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0015\u001a/\u0010\u001c\u001a\u00020\t*\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001c\u001a\u00020\t*\u00060\u0016j\u0002`\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010 \u001a+\u0010%\u001a\u00020\t*\u00060!j\u0002`\"2\b\u0010#\u001a\u0004\u0018\u00010\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b%\u0010&\"\u0015\u0010)\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0015\u0010+\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010(\"\u0015\u0010-\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010(\"\u0015\u0010.\u001a\u00020\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00100\u001a\u00020\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010/\"\u0015\u0010.\u001a\u00020\u001a*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b.\u00101\"\u0015\u00100\u001a\u00020\u001a*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"", "urlString", "Lio/ktor/http/Url;", "Url", "(Ljava/lang/String;)Lio/ktor/http/Url;", "Lio/ktor/http/URLBuilder;", "builder", "(Lio/ktor/http/URLBuilder;)Lio/ktor/http/Url;", "Lkotlin/Function1;", "Lh6/A;", "block", "buildUrl", "(Lx6/j;)Lio/ktor/http/Url;", "parseUrl", "URLBuilder", "(Ljava/lang/String;)Lio/ktor/http/URLBuilder;", io.sentry.protocol.Request.JsonKeys.URL, "(Lio/ktor/http/Url;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "takeFrom", "(Lio/ktor/http/URLBuilder;Lio/ktor/http/URLBuilder;)Lio/ktor/http/URLBuilder;", "(Lio/ktor/http/URLBuilder;Lio/ktor/http/Url;)Lio/ktor/http/URLBuilder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "encodedPath", "encodedQuery", "", "trailingQuery", "appendUrlFullPath", "(Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Z)V", "Lio/ktor/http/ParametersBuilder;", "encodedQueryParameters", "(Ljava/lang/Appendable;Ljava/lang/String;Lio/ktor/http/ParametersBuilder;Z)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "encodedUser", "encodedPassword", "appendUserAndPassword", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V", "getFullPath", "(Lio/ktor/http/Url;)Ljava/lang/String;", "fullPath", "getHostWithPort", "hostWithPort", "getHostWithPortIfSpecified", "hostWithPortIfSpecified", "isAbsolutePath", "(Lio/ktor/http/Url;)Z", "isRelativePath", "(Lio/ktor/http/URLBuilder;)Z", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class URLUtilsKt {
    public static final io.ktor.http.URLBuilder URLBuilder(java.lang.String urlString) {
        kotlin.jvm.internal.m.e(urlString, "urlString");
        return io.ktor.http.URLParserKt.takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), urlString);
    }

    public static final io.ktor.http.Url Url(java.lang.String urlString) {
        kotlin.jvm.internal.m.e(urlString, "urlString");
        return URLBuilder(urlString).build();
    }

    public static final void appendUrlFullPath(java.lang.Appendable appendable, java.lang.String encodedPath, java.lang.String encodedQuery, boolean z6) throws java.io.IOException {
        kotlin.jvm.internal.m.e(appendable, "<this>");
        kotlin.jvm.internal.m.e(encodedPath, "encodedPath");
        kotlin.jvm.internal.m.e(encodedQuery, "encodedQuery");
        if (!O7.q.N0(encodedPath) && !O7.x.x0(encodedPath, "/", false)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (encodedQuery.length() > 0 || z6) {
            appendable.append("?");
        }
        appendable.append(encodedQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence appendUrlFullPath$lambda$6(p070h6.k it) {
        kotlin.jvm.internal.m.e(it, "it");
        java.lang.String str = (java.lang.String) it.f22539h;
        java.lang.Object obj = it.f22540i;
        if (obj == null) {
            return str;
        }
        return str + '=' + java.lang.String.valueOf(obj);
    }

    public static final void appendUserAndPassword(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.m.e(sb, "<this>");
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

    public static final io.ktor.http.Url buildUrl(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        io.ktor.http.URLBuilder uRLBuilder = new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
        block.invoke(uRLBuilder);
        return uRLBuilder.build();
    }

    public static final java.lang.String getFullPath(io.ktor.http.Url url) throws java.io.IOException {
        kotlin.jvm.internal.m.e(url, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        appendUrlFullPath(sb, url.getEncodedPath(), url.getEncodedQuery(), url.getTrailingQuery());
        return sb.toString();
    }

    public static final java.lang.String getHostWithPort(io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(url, "<this>");
        return url.getHost() + ':' + url.getPort();
    }

    public static final java.lang.String getHostWithPortIfSpecified(io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(url, "<this>");
        int specifiedPort = url.getSpecifiedPort();
        return (specifiedPort == 0 || specifiedPort == url.getProtocol().getDefaultPort()) ? url.getHost() : getHostWithPort(url);
    }

    public static final boolean isAbsolutePath(io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(url, "<this>");
        return kotlin.jvm.internal.m.a(p078i6.o.j1(url.getRawSegments()), "");
    }

    public static final boolean isRelativePath(io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(url, "<this>");
        return !isAbsolutePath(url);
    }

    public static final io.ktor.http.Url parseUrl(java.lang.String urlString) {
        kotlin.jvm.internal.m.e(urlString, "urlString");
        try {
            io.ktor.http.URLBuilder URLBuilder = URLBuilder(urlString);
            if (URLBuilder.getHost().length() <= 0) {
                URLBuilder = null;
            }
            if (URLBuilder != null) {
                return URLBuilder.build();
            }
        } catch (io.ktor.http.URLParserException unused) {
        }
        return null;
    }

    public static final io.ktor.http.URLBuilder takeFrom(io.ktor.http.URLBuilder uRLBuilder, io.ktor.http.URLBuilder url) {
        kotlin.jvm.internal.m.e(uRLBuilder, "<this>");
        kotlin.jvm.internal.m.e(url, "url");
        uRLBuilder.setProtocolOrNull(url.getProtocolOrNull());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        uRLBuilder.setEncodedPathSegments(url.getEncodedPathSegments());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        io.ktor.http.ParametersBuilder parametersBuilderParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        io.ktor.util.StringValuesKt.appendAll(parametersBuilderParametersBuilder$default, url.getEncodedParameters());
        uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }

    public static final io.ktor.http.URLBuilder URLBuilder(io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(url, "url");
        return takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), url);
    }

    public static final io.ktor.http.Url Url(io.ktor.http.URLBuilder builder) {
        kotlin.jvm.internal.m.e(builder, "builder");
        return takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), builder).build();
    }

    public static final boolean isAbsolutePath(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.m.e(uRLBuilder, "<this>");
        return kotlin.jvm.internal.m.a(p078i6.o.j1(uRLBuilder.getPathSegments()), "");
    }

    public static final boolean isRelativePath(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.m.e(uRLBuilder, "<this>");
        return !isAbsolutePath(uRLBuilder);
    }

    public static final io.ktor.http.URLBuilder URLBuilder(io.ktor.http.URLBuilder builder) {
        kotlin.jvm.internal.m.e(builder, "builder");
        return takeFrom(new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null), builder);
    }

    public static final void appendUrlFullPath(java.lang.Appendable appendable, java.lang.String encodedPath, io.ktor.http.ParametersBuilder encodedQueryParameters, boolean z6) throws java.io.IOException {
        java.util.List listI0;
        kotlin.jvm.internal.m.e(appendable, "<this>");
        kotlin.jvm.internal.m.e(encodedPath, "encodedPath");
        kotlin.jvm.internal.m.e(encodedQueryParameters, "encodedQueryParameters");
        if (!O7.q.N0(encodedPath) && !O7.x.x0(encodedPath, "/", false)) {
            appendable.append('/');
        }
        appendable.append(encodedPath);
        if (!encodedQueryParameters.isEmpty() || z6) {
            appendable.append("?");
        }
        java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> setEntries = encodedQueryParameters.entries();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (list.isEmpty()) {
                listI0 = com.google.common.util.concurrent.P.i0(new p070h6.k(str, null));
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(list, 10));
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    com.google.android.gms.internal.play_billing.M0.w(str, (java.lang.String) it2.next(), arrayList2);
                }
                listI0 = arrayList2;
            }
            p078i6.u.M0(arrayList, listI0);
        }
        p078i6.o.n1(arrayList, appendable, "&", null, null, new io.ktor.http.b(3), 60);
    }

    public static final io.ktor.http.URLBuilder takeFrom(io.ktor.http.URLBuilder uRLBuilder, io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(uRLBuilder, "<this>");
        kotlin.jvm.internal.m.e(url, "url");
        uRLBuilder.setProtocolOrNull(url.getProtocolOrNull());
        uRLBuilder.setHost(url.getHost());
        uRLBuilder.setPort(url.getPort());
        io.ktor.http.URLBuilderKt.setEncodedPath(uRLBuilder, url.getEncodedPath());
        uRLBuilder.setEncodedUser(url.getEncodedUser());
        uRLBuilder.setEncodedPassword(url.getEncodedPassword());
        io.ktor.http.ParametersBuilder parametersBuilderParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        parametersBuilderParametersBuilder$default.appendAll(io.ktor.http.QueryKt.parseQueryString$default(url.getEncodedQuery(), 0, 0, false, 6, null));
        uRLBuilder.setEncodedParameters(parametersBuilderParametersBuilder$default);
        uRLBuilder.setEncodedFragment(url.getEncodedFragment());
        uRLBuilder.setTrailingQuery(url.getTrailingQuery());
        return uRLBuilder;
    }
}
