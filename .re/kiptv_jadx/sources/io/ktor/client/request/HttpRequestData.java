package io.ktor.client.request;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R$\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lio/ktor/client/request/HttpRequestData;", "", "Lio/ktor/http/Url;", io.sentry.protocol.Request.JsonKeys.URL, "Lio/ktor/http/HttpMethod;", io.sentry.protocol.Request.JsonKeys.METHOD, "Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/content/OutgoingContent;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "LS7/h0;", "executionContext", "Lio/ktor/util/Attributes;", "attributes", "<init>", "(Lio/ktor/http/Url;Lio/ktor/http/HttpMethod;Lio/ktor/http/Headers;Lio/ktor/http/content/OutgoingContent;LS7/h0;Lio/ktor/util/Attributes;)V", "T", "Lio/ktor/client/engine/HttpClientEngineCapability;", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "getCapabilityOrNull", "(Lio/ktor/client/engine/HttpClientEngineCapability;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lio/ktor/http/Url;", "getUrl", "()Lio/ktor/http/Url;", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "Lio/ktor/http/content/OutgoingContent;", "getBody", "()Lio/ktor/http/content/OutgoingContent;", "LS7/h0;", "getExecutionContext", "()LS7/h0;", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "", "requiredCapabilities", "Ljava/util/Set;", "getRequiredCapabilities$ktor_client_core", "()Ljava/util/Set;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpRequestData {
    private final io.ktor.util.Attributes attributes;
    private final io.ktor.http.content.OutgoingContent body;
    private final S7.InterfaceC0891h0 executionContext;
    private final io.ktor.http.Headers headers;
    private final io.ktor.http.HttpMethod method;
    private final java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> requiredCapabilities;
    private final io.ktor.http.Url url;

    @io.ktor.utils.io.InternalAPI
    public HttpRequestData(io.ktor.http.Url url, io.ktor.http.HttpMethod method, io.ktor.http.Headers headers, io.ktor.http.content.OutgoingContent body, S7.InterfaceC0891h0 executionContext, io.ktor.util.Attributes attributes) {
        java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> setKeySet;
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(method, "method");
        kotlin.jvm.internal.m.e(headers, "headers");
        kotlin.jvm.internal.m.e(body, "body");
        kotlin.jvm.internal.m.e(executionContext, "executionContext");
        kotlin.jvm.internal.m.e(attributes, "attributes");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = body;
        this.executionContext = executionContext;
        this.attributes = attributes;
        java.util.Map map = (java.util.Map) attributes.getOrNull(io.ktor.client.engine.HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        this.requiredCapabilities = (map == null || (setKeySet = map.keySet()) == null) ? p078i6.y.f23207h : setKeySet;
    }

    public final io.ktor.util.Attributes getAttributes() {
        return this.attributes;
    }

    public final io.ktor.http.content.OutgoingContent getBody() {
        return this.body;
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

    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    public final io.ktor.http.HttpMethod getMethod() {
        return this.method;
    }

    public final java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getRequiredCapabilities$ktor_client_core() {
        return this.requiredCapabilities;
    }

    public final io.ktor.http.Url getUrl() {
        return this.url;
    }

    public java.lang.String toString() {
        return "HttpRequestData(url=" + this.url + ", method=" + this.method + ')';
    }
}
