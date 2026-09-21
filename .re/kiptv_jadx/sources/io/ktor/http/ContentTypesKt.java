package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0007¢\u0006\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/http/ContentType;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "withCharset", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;)Lio/ktor/http/ContentType;", "withCharsetIfNeeded", "Lio/ktor/http/HeaderValueWithParameters;", "(Lio/ktor/http/HeaderValueWithParameters;)Ljava/nio/charset/Charset;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ContentTypesKt {
    public static final java.nio.charset.Charset charset(io.ktor.http.HeaderValueWithParameters headerValueWithParameters) {
        kotlin.jvm.internal.m.e(headerValueWithParameters, "<this>");
        java.lang.String strParameter = headerValueWithParameters.parameter(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset);
        if (strParameter == null) {
            return null;
        }
        try {
            return io.ktor.utils.io.charsets.CharsetJVMKt.forName(O7.a.f8023a, strParameter);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public static final io.ktor.http.ContentType withCharset(io.ktor.http.ContentType contentType, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(contentType, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        return contentType.withParameter(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, io.ktor.utils.io.charsets.CharsetJVMKt.getName(charset));
    }

    public static final io.ktor.http.ContentType withCharsetIfNeeded(io.ktor.http.ContentType contentType, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(contentType, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        java.lang.String lowerCase = contentType.getContentType().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        return !lowerCase.equals("text") ? contentType : contentType.withParameter(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, io.ktor.utils.io.charsets.CharsetJVMKt.getName(charset));
    }
}
