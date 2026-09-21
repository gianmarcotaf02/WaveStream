package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"buildPostReceiptResponse", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "result", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostReceiptResponseKt {
    public static final com.revenuecat.purchases.common.networking.PostReceiptResponse buildPostReceiptResponse(com.revenuecat.purchases.common.networking.HTTPResult result) {
        kotlin.jvm.internal.m.e(result, "result");
        com.revenuecat.purchases.CustomerInfo customerInfoBuildCustomerInfo = com.revenuecat.purchases.common.CustomerInfoFactory.INSTANCE.buildCustomerInfo(result);
        org.json.JSONObject jSONObjectOptJSONObject = result.getBody().optJSONObject("purchased_products");
        java.util.LinkedHashMap linkedHashMap = null;
        if (jSONObjectOptJSONObject != null) {
            java.util.Map map$default = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.toMap$default(jSONObjectOptJSONObject, false, 1, null);
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(p078i6.D.I0(map$default.size()));
            for (java.util.Map.Entry entry : map$default.entrySet()) {
                java.lang.Object key = entry.getKey();
                org.json.JSONObject jSONObject = (org.json.JSONObject) entry.getValue();
                if (!jSONObject.has("should_consume")) {
                    jSONObject = null;
                }
                linkedHashMap2.put(key, new com.revenuecat.purchases.common.networking.PostReceiptProductInfo(jSONObject != null ? java.lang.Boolean.valueOf(jSONObject.optBoolean("should_consume")) : null));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new com.revenuecat.purchases.common.networking.PostReceiptResponse(customerInfoBuildCustomerInfo, linkedHashMap, result.getBody());
    }
}
