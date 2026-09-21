package io.ktor.client.request;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0013J-\u0010\u001a\u001a\u00020\u0006\"\b\b\u0000\u0010\u0016*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R*\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00158\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00105\u001a\u0002042\u0006\u0010-\u001a\u0002048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0017\u0010;\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R(\u0010D\u001a\u0004\u0018\u00010?2\b\u0010-\u001a\u0004\u0018\u00010?8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/http/URLBuilder;", "Lh6/A;", "block", io.sentry.protocol.Request.JsonKeys.URL, "(Lx6/m;)V", "Lio/ktor/client/request/HttpRequestData;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "()Lio/ktor/client/request/HttpRequestData;", "Lkotlin/Function1;", "Lio/ktor/util/Attributes;", "setAttributes", "(Lx6/j;)V", "builder", "takeFromWithExecutionContext", "(Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/request/HttpRequestBuilder;", "takeFrom", "", "T", "Lio/ktor/client/engine/HttpClientEngineCapability;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "capability", "setCapability", "(Lio/ktor/client/engine/HttpClientEngineCapability;Ljava/lang/Object;)V", "getCapabilityOrNull", "(Lio/ktor/client/engine/HttpClientEngineCapability;)Ljava/lang/Object;", "Lio/ktor/http/URLBuilder;", "getUrl", "()Lio/ktor/http/URLBuilder;", "Lio/ktor/http/HttpMethod;", io.sentry.protocol.Request.JsonKeys.METHOD, "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "setMethod", "(Lio/ktor/http/HttpMethod;)V", "Lio/ktor/http/HeadersBuilder;", "headers", "Lio/ktor/http/HeadersBuilder;", "getHeaders", "()Lio/ktor/http/HeadersBuilder;", "value", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Ljava/lang/Object;", "getBody", "()Ljava/lang/Object;", "setBody", "(Ljava/lang/Object;)V", "LS7/h0;", "executionContext", "LS7/h0;", "getExecutionContext", "()LS7/h0;", "setExecutionContext$ktor_client_core", "(LS7/h0;)V", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "Lio/ktor/util/reflect/TypeInfo;", "getBodyType", "()Lio/ktor/util/reflect/TypeInfo;", "setBodyType", "(Lio/ktor/util/reflect/TypeInfo;)V", "bodyType", "Companion", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpRequestBuilder implements io.ktor.http.HttpMessageBuilder {
    private final io.ktor.http.URLBuilder url = new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
    private io.ktor.http.HttpMethod method = io.ktor.http.HttpMethod.INSTANCE.getGet();
    private final io.ktor.http.HeadersBuilder headers = new io.ktor.http.HeadersBuilder(0, 1, null);
    private java.lang.Object body = io.ktor.client.utils.EmptyContent.INSTANCE;
    private S7.InterfaceC0891h0 executionContext = S7.C.e();
    private final io.ktor.util.Attributes attributes = io.ktor.util.AttributesJvmKt.Attributes(true);

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map setCapability$lambda$0() {
        return new java.util.LinkedHashMap();
    }

    public final io.ktor.client.request.HttpRequestData build() {
        io.ktor.http.Url urlBuild = this.url.build();
        io.ktor.http.HttpMethod httpMethod = this.method;
        io.ktor.http.Headers headersBuild = getHeaders().build();
        java.lang.Object obj = this.body;
        io.ktor.http.content.OutgoingContent outgoingContent = obj instanceof io.ktor.http.content.OutgoingContent ? (io.ktor.http.content.OutgoingContent) obj : null;
        if (outgoingContent != null) {
            return new io.ktor.client.request.HttpRequestData(urlBuild, httpMethod, headersBuild, outgoingContent, this.executionContext, this.attributes);
        }
        throw new java.lang.IllegalStateException(("No request transformation found: " + this.body).toString());
    }

    public final io.ktor.util.Attributes getAttributes() {
        return this.attributes;
    }

    public final java.lang.Object getBody() {
        return this.body;
    }

    public final io.ktor.util.reflect.TypeInfo getBodyType() {
        return (io.ktor.util.reflect.TypeInfo) this.attributes.getOrNull(io.ktor.client.request.RequestBodyKt.getBodyTypeAttributeKey());
    }

    public final <T> T getCapabilityOrNull(io.ktor.client.engine.HttpClientEngineCapability<T> key) {
        kotlin.jvm.internal.m.e(key, "key");
        java.util.Map map = (java.util.Map) this.attributes.getOrNull(io.ktor.client.engine.HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    public final S7.InterfaceC0891h0 getExecutionContext() {
        return this.executionContext;
    }

    @Override // io.ktor.http.HttpMessageBuilder
    public io.ktor.http.HeadersBuilder getHeaders() {
        return this.headers;
    }

    public final io.ktor.http.HttpMethod getMethod() {
        return this.method;
    }

    public final io.ktor.http.URLBuilder getUrl() {
        return this.url;
    }

    public final void setAttributes(p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        block.invoke(this.attributes);
    }

    @io.ktor.utils.io.InternalAPI
    public final void setBody(java.lang.Object obj) {
        kotlin.jvm.internal.m.e(obj, "<set-?>");
        this.body = obj;
    }

    @io.ktor.utils.io.InternalAPI
    public final void setBodyType(io.ktor.util.reflect.TypeInfo typeInfo) {
        if (typeInfo != null) {
            this.attributes.put(io.ktor.client.request.RequestBodyKt.getBodyTypeAttributeKey(), typeInfo);
        } else {
            this.attributes.remove(io.ktor.client.request.RequestBodyKt.getBodyTypeAttributeKey());
        }
    }

    public final <T> void setCapability(io.ktor.client.engine.HttpClientEngineCapability<T> key, T capability) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(capability, "capability");
        ((java.util.Map) this.attributes.computeIfAbsent(io.ktor.client.engine.HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY(), new p026c6.a(1))).put(key, capability);
    }

    public final void setExecutionContext$ktor_client_core(S7.InterfaceC0891h0 interfaceC0891h0) {
        kotlin.jvm.internal.m.e(interfaceC0891h0, "<set-?>");
        this.executionContext = interfaceC0891h0;
    }

    public final void setMethod(io.ktor.http.HttpMethod httpMethod) {
        kotlin.jvm.internal.m.e(httpMethod, "<set-?>");
        this.method = httpMethod;
    }

    public final io.ktor.client.request.HttpRequestBuilder takeFrom(io.ktor.client.request.HttpRequestBuilder builder) {
        kotlin.jvm.internal.m.e(builder, "builder");
        this.method = builder.method;
        this.body = builder.body;
        setBodyType(builder.getBodyType());
        io.ktor.http.URLUtilsKt.takeFrom(this.url, builder.url);
        io.ktor.http.URLBuilder uRLBuilder = this.url;
        uRLBuilder.setEncodedPathSegments(uRLBuilder.getEncodedPathSegments());
        io.ktor.util.StringValuesKt.appendAll(getHeaders(), builder.getHeaders());
        io.ktor.util.AttributesKt.putAll(this.attributes, builder.attributes);
        return this;
    }

    @io.ktor.utils.io.InternalAPI
    public final io.ktor.client.request.HttpRequestBuilder takeFromWithExecutionContext(io.ktor.client.request.HttpRequestBuilder builder) {
        kotlin.jvm.internal.m.e(builder, "builder");
        this.executionContext = builder.executionContext;
        return takeFrom(builder);
    }

    public final void url(p194x6.m block) {
        kotlin.jvm.internal.m.e(block, "block");
        io.ktor.http.URLBuilder uRLBuilder = this.url;
        block.invoke(uRLBuilder, uRLBuilder);
    }
}
