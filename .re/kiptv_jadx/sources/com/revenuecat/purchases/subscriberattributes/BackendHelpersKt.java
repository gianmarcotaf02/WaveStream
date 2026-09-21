package com.revenuecat.purchases.subscriberattributes;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a2\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0005*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005H\u0000¨\u0006\t"}, d2 = {"getAttributeErrors", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "Lorg/json/JSONObject;", "toBackendMap", "", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BackendHelpersKt {
    public static final java.util.List<com.revenuecat.purchases.common.SubscriberAttributeError> getAttributeErrors(org.json.JSONObject jSONObject) throws org.json.JSONException {
        p078i6.w wVar = p078i6.w.f23205h;
        if (jSONObject == null) {
            return wVar;
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.revenuecat.purchases.common.BackendKt.ATTRIBUTES_ERROR_RESPONSE_KEY);
        if (jSONObjectOptJSONObject != null) {
            jSONObject = jSONObjectOptJSONObject;
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.revenuecat.purchases.common.BackendKt.ATTRIBUTE_ERRORS_KEY);
        if (jSONArrayOptJSONArray == null) {
            return wVar;
        }
        D6.g gVarW = O7.r.W(0, jSONArrayOptJSONArray.length());
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(gVarW, 10));
        java.util.Iterator it = gVarW.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArrayOptJSONArray.getJSONObject(((p078i6.A) it).a()));
        }
        java.util.ArrayList<org.json.JSONObject> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
            if (jSONObject2.has("key_name") && jSONObject2.has("message")) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p078i6.q.I0(arrayList2, 10));
        for (org.json.JSONObject jSONObject3 : arrayList2) {
            java.lang.String string = jSONObject3.getString("key_name");
            kotlin.jvm.internal.m.d(string, "it.getString(\"key_name\")");
            java.lang.String string2 = jSONObject3.getString("message");
            kotlin.jvm.internal.m.d(string2, "it.getString(\"message\")");
            arrayList3.add(new com.revenuecat.purchases.common.SubscriberAttributeError(string, string2));
        }
        return p078i6.o.N1(arrayList3);
    }

    public static final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> toBackendMap(java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> entry : map.entrySet()) {
            arrayList.add(new p070h6.k(entry.getKey(), entry.getValue().toBackendMap()));
        }
        return p078i6.C.X0(arrayList);
    }
}
