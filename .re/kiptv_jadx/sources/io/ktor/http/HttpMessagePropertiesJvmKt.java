package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0002*\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\u0002*\u00020\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0002*\u00020\u000e¢\u0006\u0004\b\u000b\u0010\u000f\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\u0002*\u00020\u000e¢\u0006\u0004\b\r\u0010\u000f\u001a\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u000e¢\u0006\u0004\b\u0001\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"", "date", "Ljava/util/Date;", "parseHttpDate", "(Ljava/lang/String;)Ljava/util/Date;", "formatHttpDate", "(Ljava/util/Date;)Ljava/lang/String;", "Lio/ktor/http/HttpMessageBuilder;", "Lh6/A;", "ifModifiedSince", "(Lio/ktor/http/HttpMessageBuilder;Ljava/util/Date;)V", "lastModified", "(Lio/ktor/http/HttpMessageBuilder;)Ljava/util/Date;", "expires", "Lio/ktor/http/HttpMessage;", "(Lio/ktor/http/HttpMessage;)Ljava/util/Date;", "Ljava/text/SimpleDateFormat;", "getHTTP_DATE_FORMAT", "()Ljava/text/SimpleDateFormat;", "HTTP_DATE_FORMAT", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpMessagePropertiesJvmKt {
    public static final java.util.Date date(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.m.e(httpMessage, "<this>");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getDate());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    public static final java.util.Date expires(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        java.lang.String str = httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getExpires());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    private static final java.lang.String formatHttpDate(java.util.Date date) {
        java.lang.String str = getHTTP_DATE_FORMAT().format(date);
        kotlin.jvm.internal.m.d(str, "format(...)");
        return str;
    }

    private static final java.text.SimpleDateFormat getHTTP_DATE_FORMAT() {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", java.util.Locale.US);
        simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static final void ifModifiedSince(io.ktor.http.HttpMessageBuilder httpMessageBuilder, java.util.Date date) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.m.e(date, "date");
        httpMessageBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getIfModifiedSince(), formatHttpDate(date));
    }

    public static final java.util.Date lastModified(io.ktor.http.HttpMessageBuilder httpMessageBuilder) {
        kotlin.jvm.internal.m.e(httpMessageBuilder, "<this>");
        java.lang.String str = httpMessageBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getLastModified());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    private static final java.util.Date parseHttpDate(java.lang.String str) throws java.text.ParseException {
        java.util.Date date = getHTTP_DATE_FORMAT().parse(str);
        kotlin.jvm.internal.m.d(date, "parse(...)");
        return date;
    }

    public static final java.util.Date expires(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.m.e(httpMessage, "<this>");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getExpires());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }

    public static final java.util.Date lastModified(io.ktor.http.HttpMessage httpMessage) {
        kotlin.jvm.internal.m.e(httpMessage, "<this>");
        java.lang.String str = httpMessage.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getLastModified());
        if (str != null) {
            return parseHttpDate(str);
        }
        return null;
    }
}
