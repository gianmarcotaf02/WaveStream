package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\r\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0010\u001a\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u001d¢\u0006\u0004\b\u0004\u0010\u001e\u001a\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012*\u00020\u001d¢\u0006\u0004\b\u0013\u0010\u001f\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u001d¢\u0006\u0004\b\u0015\u0010 \u001a\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u001d¢\u0006\u0004\b\u0018\u0010!\u001a\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u001d¢\u0006\u0004\b\u001b\u0010\"\u001a\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0017*\u00020\u001d¢\u0006\u0004\b$\u0010!\u001a\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u0017*\u00020\u0000¢\u0006\u0004\b%\u0010\u0019\u001a\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0017*\u00020\u001d¢\u0006\u0004\b'\u0010!\u001a\u0019\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u0017*\u00020\nH\u0000¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lio/ktor/http/HttpMessageBuilder;", "Lio/ktor/http/ContentType;", "type", "Lh6/A;", "contentType", "(Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V", "", "seconds", "maxAge", "(Lio/ktor/http/HttpMessageBuilder;I)V", "", "value", "ifNoneMatch", "(Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;)V", "content", "userAgent", "(Lio/ktor/http/HttpMessageBuilder;)Lio/ktor/http/ContentType;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "(Lio/ktor/http/HttpMessageBuilder;)Ljava/nio/charset/Charset;", "etag", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/lang/String;", "", "vary", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/util/List;", "", "contentLength", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/lang/Long;", "Lio/ktor/http/HttpMessage;", "(Lio/ktor/http/HttpMessage;)Lio/ktor/http/ContentType;", "(Lio/ktor/http/HttpMessage;)Ljava/nio/charset/Charset;", "(Lio/ktor/http/HttpMessage;)Ljava/lang/String;", "(Lio/ktor/http/HttpMessage;)Ljava/util/List;", "(Lio/ktor/http/HttpMessage;)Ljava/lang/Long;", "Lio/ktor/http/Cookie;", "setCookie", "cookies", "Lio/ktor/http/HeaderValue;", "cacheControl", "splitSetCookieHeader", "(Ljava/lang/String;)Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpMessagePropertiesKt {
    public static final java.util.List<io.ktor.http.HeaderValue> cacheControl(io.ktor.http.HttpMessage httpMessage) {
        java.util.List<io.ktor.http.HeaderValue> headerValue;
        kotlin.jvm.internal.m.e(httpMessage, "<this>");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl());
        return (str == null || (headerValue = io.ktor.http.HttpHeaderValueParserKt.parseHeaderValue(str)) == null) ? p078i6.w.f23205h : headerValue;
    }

    public static final java.nio.charset.Charset charset(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        io.ktor.http.ContentType contentType = contentType(httpMessageBuilder);
        if (contentType != null) {
            return io.ktor.http.ContentTypesKt.charset(contentType);
        }
        return null;
    }

    public static final java.lang.Long contentLength(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        java.lang.String str = httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        }
        return null;
    }

    public static final void contentType(io.ktor.http.HttpMessageBuilder httpMessageBuilder, io.ktor.http.ContentType type) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.m.e(type, "type");
        httpMessageBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getContentType(), type.toString());
    }

    public static final java.util.List<io.ktor.http.Cookie> cookies(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        java.util.List<java.lang.String> all = httpMessageBuilder.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getSetCookie());
        if (all == null) {
            return p078i6.w.f23205h;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(all, 10));
        java.util.Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            arrayList.add(io.ktor.http.CookieKt.parseServerSetCookieHeader((java.lang.String) it.next()));
        }
        return arrayList;
    }

    public static final java.lang.String etag(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        return httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getETag());
    }

    public static final void ifNoneMatch(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String value) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.m.e(value, "value");
        httpMessageBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getIfNoneMatch(), value);
    }

    public static final void maxAge(io.ktor.http.HttpMessageBuilder httpMessageBuilder, int i3) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        httpMessageBuilder.getHeaders().append(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl(), "max-age=" + i3);
    }

    public static final java.util.List<io.ktor.http.Cookie> setCookie(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.m.e(httpMessage, "<this>");
        java.util.List<java.lang.String> all = httpMessage.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getSetCookie());
        if (all == null) {
            return p078i6.w.f23205h;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            p078i6.u.M0(arrayList, splitSetCookieHeader((java.lang.String) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(io.ktor.http.CookieKt.parseServerSetCookieHeader((java.lang.String) it2.next()));
        }
        return arrayList2;
    }

    public static final java.util.List<java.lang.String> splitSetCookieHeader(java.lang.String str) {
        int i3;
        kotlin.jvm.internal.m.e(str, "<this>");
        int i9 = 0;
        int iK0 = O7.q.K0(str, ',', 0, 6);
        if (iK0 == -1) {
            return com.google.common.util.concurrent.P.i0(str);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iK1 = O7.q.K0(str, '=', iK0, 4);
        int iK2 = O7.q.K0(str, ';', iK0, 4);
        while (i9 < str.length() && iK0 > 0) {
            if (iK1 < iK0) {
                iK1 = O7.q.K0(str, '=', iK0, 4);
            }
            int iK3 = O7.q.K0(str, ',', iK0 + 1, 4);
            while (true) {
                int i10 = iK3;
                i3 = iK0;
                iK0 = i10;
                if (iK0 < 0 || iK0 >= iK1) {
                    break;
                }
                iK3 = O7.q.K0(str, ',', iK0 + 1, 4);
            }
            if (iK2 < i3) {
                iK2 = O7.q.K0(str, ';', i3, 4);
            }
            if (iK1 < 0) {
                java.lang.String strSubstring = str.substring(i9);
                kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                return arrayList;
            }
            if (iK2 == -1 || iK2 > iK1) {
                java.lang.String strSubstring2 = str.substring(i9, i3);
                kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                i9 = i3 + 1;
            }
        }
        if (i9 < str.length()) {
            java.lang.String strSubstring3 = str.substring(i9);
            kotlin.jvm.internal.m.d(strSubstring3, "substring(...)");
            arrayList.add(strSubstring3);
        }
        return arrayList;
    }

    public static final void userAgent(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.lang.String content) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.m.e(content, "content");
        httpMessageBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getUserAgent(), content);
    }

    public static final java.util.List<java.lang.String> vary(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        java.util.List<java.lang.String> all = httpMessageBuilder.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getVary());
        if (all == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            java.util.List listB1 = O7.q.b1((java.lang.String) it.next(), new java.lang.String[]{","}, 0, 6);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(listB1, 10));
            java.util.Iterator it2 = listB1.iterator();
            while (it2.hasNext()) {
                arrayList2.add(O7.q.r1((java.lang.String) it2.next()).toString());
            }
            p078i6.u.M0(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static final java.nio.charset.Charset charset(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.m.e(httpMessage, "<this>");
        io.ktor.http.ContentType contentType = contentType(httpMessage);
        if (contentType != null) {
            return io.ktor.http.ContentTypesKt.charset(contentType);
        }
        return null;
    }

    public static final java.lang.Long contentLength(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.m.e(httpMessage, "<this>");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
        if (str != null) {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        }
        return null;
    }

    public static final io.ktor.http.ContentType contentType(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        java.lang.String str = httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return io.ktor.http.ContentType.INSTANCE.parse(str);
        }
        return null;
    }

    public static final java.lang.String etag(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.m.e(httpMessage, "<this>");
        return httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getETag());
    }

    public static final io.ktor.http.ContentType contentType(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.m.e(httpMessage, "<this>");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return io.ktor.http.ContentType.INSTANCE.parse(str);
        }
        return null;
    }

    public static final java.util.List<java.lang.String> vary(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.m.e(httpMessage, "<this>");
        java.util.List<java.lang.String> all = httpMessage.getHeaders().getAll(io.ktor.http.HttpHeaders.INSTANCE.getVary());
        if (all == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = all.iterator();
        while (it.hasNext()) {
            java.util.List listB1 = O7.q.b1((java.lang.String) it.next(), new java.lang.String[]{","}, 0, 6);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(listB1, 10));
            java.util.Iterator it2 = listB1.iterator();
            while (it2.hasNext()) {
                arrayList2.add(O7.q.r1((java.lang.String) it2.next()).toString());
            }
            p078i6.u.M0(arrayList, arrayList2);
        }
        return arrayList;
    }
}
