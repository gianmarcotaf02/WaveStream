package io.ktor.client.request;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0004\u001a\u00020\u0003*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\t\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "Lio/ktor/client/request/HttpRequestBuilder;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lh6/A;", "setBody", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;)V", "", "Lio/ktor/util/reflect/TypeInfo;", "bodyType", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;Lio/ktor/util/reflect/TypeInfo;)V", "Lio/ktor/util/AttributeKey;", "BodyTypeAttributeKey", "Lio/ktor/util/AttributeKey;", "getBodyTypeAttributeKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RequestBodyKt {
    private static final io.ktor.util.AttributeKey<io.ktor.util.reflect.TypeInfo> BodyTypeAttributeKey;

    static {
        E6.v vVarA;
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(io.ktor.util.reflect.TypeInfo.class);
        try {
            vVarA = kotlin.jvm.internal.B.a(io.ktor.util.reflect.TypeInfo.class);
        } catch (java.lang.Throwable unused) {
            vVarA = null;
        }
        BodyTypeAttributeKey = new io.ktor.util.AttributeKey<>("BodyTypeAttributeKey", new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA));
    }

    public static final io.ktor.util.AttributeKey<io.ktor.util.reflect.TypeInfo> getBodyTypeAttributeKey() {
        return BodyTypeAttributeKey;
    }

    public static final <T> void setBody(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, T t9) {
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
        if (t9 == null) {
            httpRequestBuilder.setBody(io.ktor.http.content.NullBody.INSTANCE);
            kotlin.jvm.internal.m.j();
            throw null;
        }
        if (t9 instanceof io.ktor.http.content.OutgoingContent) {
            httpRequestBuilder.setBody(t9);
            httpRequestBuilder.setBodyType(null);
        } else {
            httpRequestBuilder.setBody(t9);
            kotlin.jvm.internal.m.j();
            throw null;
        }
    }

    public static final void setBody(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Object obj, io.ktor.util.reflect.TypeInfo bodyType) {
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.m.e(bodyType, "bodyType");
        if (obj == null) {
            obj = io.ktor.http.content.NullBody.INSTANCE;
        }
        httpRequestBuilder.setBody(obj);
        httpRequestBuilder.setBodyType(bodyType);
    }
}
