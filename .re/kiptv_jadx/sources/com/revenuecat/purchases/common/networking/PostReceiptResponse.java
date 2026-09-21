package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "productInfoByProductId", "", "", "Lcom/revenuecat/purchases/common/networking/PostReceiptProductInfo;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lorg/json/JSONObject;", "(Lcom/revenuecat/purchases/CustomerInfo;Ljava/util/Map;Lorg/json/JSONObject;)V", "getBody", "()Lorg/json/JSONObject;", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "getProductInfoByProductId", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class PostReceiptResponse {
    private final org.json.JSONObject body;
    private final com.revenuecat.purchases.CustomerInfo customerInfo;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.common.networking.PostReceiptProductInfo> productInfoByProductId;

    public PostReceiptResponse(com.revenuecat.purchases.CustomerInfo customerInfo, java.util.Map<java.lang.String, com.revenuecat.purchases.common.networking.PostReceiptProductInfo> map, org.json.JSONObject body) {
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
        kotlin.jvm.internal.m.e(body, "body");
        this.customerInfo = customerInfo;
        this.productInfoByProductId = map;
        this.body = body;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.common.networking.PostReceiptResponse copy$default(com.revenuecat.purchases.common.networking.PostReceiptResponse postReceiptResponse, com.revenuecat.purchases.CustomerInfo customerInfo, java.util.Map map, org.json.JSONObject jSONObject, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            customerInfo = postReceiptResponse.customerInfo;
        }
        if ((i3 & 2) != 0) {
            map = postReceiptResponse.productInfoByProductId;
        }
        if ((i3 & 4) != 0) {
            jSONObject = postReceiptResponse.body;
        }
        return postReceiptResponse.copy(customerInfo, map, jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.networking.PostReceiptProductInfo> component2() {
        return this.productInfoByProductId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final org.json.JSONObject getBody() {
        return this.body;
    }

    public final com.revenuecat.purchases.common.networking.PostReceiptResponse copy(com.revenuecat.purchases.CustomerInfo customerInfo, java.util.Map<java.lang.String, com.revenuecat.purchases.common.networking.PostReceiptProductInfo> productInfoByProductId, org.json.JSONObject body) {
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
        kotlin.jvm.internal.m.e(body, "body");
        return new com.revenuecat.purchases.common.networking.PostReceiptResponse(customerInfo, productInfoByProductId, body);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.networking.PostReceiptResponse)) {
            return false;
        }
        com.revenuecat.purchases.common.networking.PostReceiptResponse postReceiptResponse = (com.revenuecat.purchases.common.networking.PostReceiptResponse) other;
        return kotlin.jvm.internal.m.a(this.customerInfo, postReceiptResponse.customerInfo) && kotlin.jvm.internal.m.a(this.productInfoByProductId, postReceiptResponse.productInfoByProductId) && kotlin.jvm.internal.m.a(this.body, postReceiptResponse.body);
    }

    public final org.json.JSONObject getBody() {
        return this.body;
    }

    public final com.revenuecat.purchases.CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.networking.PostReceiptProductInfo> getProductInfoByProductId() {
        return this.productInfoByProductId;
    }

    public int hashCode() {
        int iHashCode = this.customerInfo.hashCode() * 31;
        java.util.Map<java.lang.String, com.revenuecat.purchases.common.networking.PostReceiptProductInfo> map = this.productInfoByProductId;
        return this.body.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public java.lang.String toString() {
        return "PostReceiptResponse(customerInfo=" + this.customerInfo + ", productInfoByProductId=" + this.productInfoByProductId + ", body=" + this.body + ')';
    }
}
