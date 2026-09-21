package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\",\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/ktor/util/AttributeKey;", "Lio/ktor/http/content/CachingOptions;", "CachingProperty", "Lio/ktor/util/AttributeKey;", "getCachingProperty", "()Lio/ktor/util/AttributeKey;", "Lio/ktor/http/content/OutgoingContent;", "value", "getCaching", "(Lio/ktor/http/content/OutgoingContent;)Lio/ktor/http/content/CachingOptions;", "setCaching", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/http/content/CachingOptions;)V", "caching", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CachingOptionsKt {
    private static final io.ktor.util.AttributeKey<io.ktor.http.content.CachingOptions> CachingProperty;

    static {
        E6.v vVarA;
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(io.ktor.http.content.CachingOptions.class);
        try {
            vVarA = kotlin.jvm.internal.B.a(io.ktor.http.content.CachingOptions.class);
        } catch (java.lang.Throwable unused) {
            vVarA = null;
        }
        CachingProperty = new io.ktor.util.AttributeKey<>("Caching", new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA));
    }

    public static final io.ktor.http.content.CachingOptions getCaching(io.ktor.http.content.OutgoingContent outgoingContent) {
        kotlin.jvm.internal.m.e(outgoingContent, "<this>");
        return (io.ktor.http.content.CachingOptions) outgoingContent.getProperty(CachingProperty);
    }

    public static final io.ktor.util.AttributeKey<io.ktor.http.content.CachingOptions> getCachingProperty() {
        return CachingProperty;
    }

    public static final void setCaching(io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.http.content.CachingOptions cachingOptions) {
        kotlin.jvm.internal.m.e(outgoingContent, "<this>");
        outgoingContent.setProperty(CachingProperty, cachingOptions);
    }
}
