package com.revenuecat.purchases.common.networking;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revenuecat.purchases.CustomerInfo;
import io.sentry.protocol.Request;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "productInfoByProductId", "", "", "Lcom/revenuecat/purchases/common/networking/PostReceiptProductInfo;", TtmlNode.TAG_BODY, "Lorg/json/JSONObject;", "(Lcom/revenuecat/purchases/CustomerInfo;Ljava/util/Map;Lorg/json/JSONObject;)V", "getBody", "()Lorg/json/JSONObject;", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "getProductInfoByProductId", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostReceiptResponse {
    private final JSONObject body;
    private final CustomerInfo customerInfo;
    private final Map<String, PostReceiptProductInfo> productInfoByProductId;

    public PostReceiptResponse(CustomerInfo customerInfo, Map<String, PostReceiptProductInfo> map, JSONObject body) {
        m.e(customerInfo, "customerInfo");
        m.e(body, "body");
        this.customerInfo = customerInfo;
        this.productInfoByProductId = map;
        this.body = body;
    }

    public static PostReceiptResponse copy$default(PostReceiptResponse postReceiptResponse, CustomerInfo customerInfo, Map map, JSONObject jSONObject, int i3, Object obj) {
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

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final Map<String, PostReceiptProductInfo> component2() {
        return this.productInfoByProductId;
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final PostReceiptResponse copy(CustomerInfo customerInfo, Map<String, PostReceiptProductInfo> productInfoByProductId, JSONObject body) {
        m.e(customerInfo, "customerInfo");
        m.e(body, "body");
        return new PostReceiptResponse(customerInfo, productInfoByProductId, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostReceiptResponse)) {
            return false;
        }
        PostReceiptResponse postReceiptResponse = (PostReceiptResponse) other;
        return m.a(this.customerInfo, postReceiptResponse.customerInfo) && m.a(this.productInfoByProductId, postReceiptResponse.productInfoByProductId) && m.a(this.body, postReceiptResponse.body);
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final Map<String, PostReceiptProductInfo> getProductInfoByProductId() {
        return this.productInfoByProductId;
    }

    public int hashCode() {
        int iHashCode = this.customerInfo.hashCode() * 31;
        Map<String, PostReceiptProductInfo> map = this.productInfoByProductId;
        return this.body.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public String toString() {
        return "PostReceiptResponse(customerInfo=" + this.customerInfo + ", productInfoByProductId=" + this.productInfoByProductId + ", body=" + this.body + ')';
    }
}
