package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPRequest;", "", "fullURL", "Ljava/net/URL;", "headers", "", "", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lorg/json/JSONObject;", "(Ljava/net/URL;Ljava/util/Map;Lorg/json/JSONObject;)V", "getBody", "()Lorg/json/JSONObject;", "getFullURL", "()Ljava/net/URL;", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class HTTPRequest {
    public static final java.lang.String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final java.lang.String ETAG_LAST_REFRESH_NAME = "X-RC-Last-Refresh-Time";
    public static final java.lang.String POST_PARAMS_HASH = "X-Post-Params-Hash";
    private final org.json.JSONObject body;
    private final java.net.URL fullURL;
    private final java.util.Map<java.lang.String, java.lang.String> headers;

    public HTTPRequest(java.net.URL fullURL, java.util.Map<java.lang.String, java.lang.String> headers, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.m.e(fullURL, "fullURL");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.fullURL = fullURL;
        this.headers = headers;
        this.body = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.common.networking.HTTPRequest copy$default(com.revenuecat.purchases.common.networking.HTTPRequest hTTPRequest, java.net.URL url, java.util.Map map, org.json.JSONObject jSONObject, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            url = hTTPRequest.fullURL;
        }
        if ((i3 & 2) != 0) {
            map = hTTPRequest.headers;
        }
        if ((i3 & 4) != 0) {
            jSONObject = hTTPRequest.body;
        }
        return hTTPRequest.copy(url, map, jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.net.URL getFullURL() {
        return this.fullURL;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final org.json.JSONObject getBody() {
        return this.body;
    }

    public final com.revenuecat.purchases.common.networking.HTTPRequest copy(java.net.URL fullURL, java.util.Map<java.lang.String, java.lang.String> headers, org.json.JSONObject body) {
        kotlin.jvm.internal.m.e(fullURL, "fullURL");
        kotlin.jvm.internal.m.e(headers, "headers");
        return new com.revenuecat.purchases.common.networking.HTTPRequest(fullURL, headers, body);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.networking.HTTPRequest)) {
            return false;
        }
        com.revenuecat.purchases.common.networking.HTTPRequest hTTPRequest = (com.revenuecat.purchases.common.networking.HTTPRequest) other;
        return kotlin.jvm.internal.m.a(this.fullURL, hTTPRequest.fullURL) && kotlin.jvm.internal.m.a(this.headers, hTTPRequest.headers) && kotlin.jvm.internal.m.a(this.body, hTTPRequest.body);
    }

    public final org.json.JSONObject getBody() {
        return this.body;
    }

    public final java.net.URL getFullURL() {
        return this.fullURL;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        int iC = B2.a.c(this.fullURL.hashCode() * 31, 31, this.headers);
        org.json.JSONObject jSONObject = this.body;
        return iC + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public java.lang.String toString() {
        return "HTTPRequest(fullURL=" + this.fullURL + ", headers=" + this.headers + ", body=" + this.body + ')';
    }
}
