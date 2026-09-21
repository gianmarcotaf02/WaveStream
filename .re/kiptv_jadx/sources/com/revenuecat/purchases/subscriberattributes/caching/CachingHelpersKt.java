package com.revenuecat.purchases.subscriberattributes.caching;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001*\"\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u00060\u0002H\u0000¨\u0006\u0007"}, d2 = {"toJSONObject", "Lorg/json/JSONObject;", "", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CachingHelpersKt {
    public static final org.json.JSONObject toJSONObject(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> map) throws org.json.JSONException {
        kotlin.jvm.internal.m.e(map, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, ? extends java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> value = entry.getValue();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> entry2 : value.entrySet()) {
                jSONObject2.put(entry2.getKey(), entry2.getValue().toJSONObject());
            }
            jSONObject.put(key, jSONObject2);
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("attributes", jSONObject);
        return jSONObject3;
    }
}
