package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nJ4\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0018j\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\n`\u0019*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\u001a\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0012*\u00020\bH\u0002J\u001a\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0012*\u00020\bH\u0002¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/common/CustomerInfoFactory;", "", "()V", "buildCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "httpResult", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lorg/json/JSONObject;", "overrideRequestDate", "Ljava/util/Date;", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "originalSource", "Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "loadedFromCache", "", "parseSubscriptionInfos", "", "", "Lcom/revenuecat/purchases/SubscriptionInfo;", "subscriberJSONObject", "requestDate", "parseDates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "jsonKey", "parseExpirations", "parsePurchaseDates", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfoFactory {
    public static final com.revenuecat.purchases.common.CustomerInfoFactory INSTANCE = new com.revenuecat.purchases.common.CustomerInfoFactory();

    private CustomerInfoFactory() {
    }

    public static /* synthetic */ com.revenuecat.purchases.CustomerInfo buildCustomerInfo$default(com.revenuecat.purchases.common.CustomerInfoFactory customerInfoFactory, org.json.JSONObject jSONObject, java.util.Date date, com.revenuecat.purchases.VerificationResult verificationResult, com.revenuecat.purchases.CustomerInfoOriginalSource customerInfoOriginalSource, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            customerInfoOriginalSource = com.revenuecat.purchases.CustomerInfoOriginalSource.MAIN;
        }
        com.revenuecat.purchases.CustomerInfoOriginalSource customerInfoOriginalSource2 = customerInfoOriginalSource;
        if ((i3 & 16) != 0) {
            z6 = false;
        }
        return customerInfoFactory.buildCustomerInfo(jSONObject, date, verificationResult, customerInfoOriginalSource2, z6);
    }

    private final java.util.HashMap<java.lang.String, java.util.Date> parseDates(org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
        java.util.HashMap<java.lang.String, java.util.Date> map = new java.util.HashMap<>();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String key = itKeys.next();
            java.lang.String it = jSONObject.getJSONObject(key).optString("product_plan_identifier");
            kotlin.jvm.internal.m.d(it, "it");
            if (it.length() <= 0) {
                it = null;
            }
            org.json.JSONObject expirationObject = jSONObject.getJSONObject(key);
            if (it != null) {
                java.lang.String str2 = key + ':' + it;
                if (str2 != null) {
                    key = str2;
                }
            }
            kotlin.jvm.internal.m.d(key, "key");
            kotlin.jvm.internal.m.d(expirationObject, "expirationObject");
            map.put(key, com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optDate(expirationObject, str));
        }
        return map;
    }

    private final java.util.Map<java.lang.String, java.util.Date> parseExpirations(org.json.JSONObject jSONObject) {
        return parseDates(jSONObject, "expires_date");
    }

    private final java.util.Map<java.lang.String, java.util.Date> parsePurchaseDates(org.json.JSONObject jSONObject) {
        return parseDates(jSONObject, "purchase_date");
    }

    public final com.revenuecat.purchases.CustomerInfo buildCustomerInfo(com.revenuecat.purchases.common.networking.HTTPResult httpResult) {
        kotlin.jvm.internal.m.e(httpResult, "httpResult");
        return buildCustomerInfo(httpResult.getBody(), httpResult.getRequestDate(), httpResult.getVerificationResult(), httpResult.isLoadShedderResponse() ? com.revenuecat.purchases.CustomerInfoOriginalSource.LOAD_SHEDDER : com.revenuecat.purchases.CustomerInfoOriginalSource.MAIN, false);
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.SubscriptionInfo> parseSubscriptionInfos(org.json.JSONObject subscriberJSONObject, java.util.Date requestDate) throws org.json.JSONException {
        kotlin.jvm.internal.m.e(subscriberJSONObject, "subscriberJSONObject");
        kotlin.jvm.internal.m.e(requestDate, "requestDate");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        org.json.JSONObject jSONObject = subscriberJSONObject.getJSONObject(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.SUBSCRIPTIONS);
        try {
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            kotlin.jvm.internal.m.d(itKeys, "subscriptions.keys()");
            while (itKeys.hasNext()) {
                java.lang.String productId = itKeys.next();
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(productId);
                p162s8.d defaultJson = com.revenuecat.purchases.common.JsonProvider.INSTANCE.getDefaultJson();
                java.lang.String string = jSONObject2.toString();
                kotlin.jvm.internal.m.d(string, "subscriptionJSONObject.toString()");
                defaultJson.getClass();
                com.revenuecat.purchases.common.responses.SubscriptionInfoResponse subscriptionInfoResponse = (com.revenuecat.purchases.common.responses.SubscriptionInfoResponse) defaultJson.b(string, com.revenuecat.purchases.common.responses.SubscriptionInfoResponse.INSTANCE.serializer());
                kotlin.jvm.internal.m.d(productId, "productId");
                java.util.Date date = requestDate;
                linkedHashMap.put(productId, new com.revenuecat.purchases.SubscriptionInfo(productId, date, subscriptionInfoResponse, null, 8, null));
                requestDate = date;
            }
        } catch (com.revenuecat.purchases.utils.SerializationException e6) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing subscription information", e6);
        } catch (java.lang.IllegalArgumentException e9) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing subscription information. The input is not a SubscriptionInfo", e9);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0093  */
    public final com.revenuecat.purchases.CustomerInfo buildCustomerInfo(org.json.JSONObject body, java.util.Date overrideRequestDate, com.revenuecat.purchases.VerificationResult verificationResult, com.revenuecat.purchases.CustomerInfoOriginalSource originalSource, boolean loadedFromCache) throws org.json.JSONException {
        com.revenuecat.purchases.EntitlementInfos entitlementInfos;
        java.util.Date date;
        kotlin.jvm.internal.m.e(body, "body");
        kotlin.jvm.internal.m.e(verificationResult, "verificationResult");
        kotlin.jvm.internal.m.e(originalSource, "originalSource");
        org.json.JSONObject jSONObject = body.getJSONObject(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.SUBSCRIBER);
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
        kotlin.jvm.internal.m.d(itKeys, "nonSubscriptions.keys()");
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            org.json.JSONArray jSONArray = jSONObject2.getJSONArray(next);
            int length = jSONArray.length();
            if (length > 0) {
                jSONObject3.put(next, jSONArray.getJSONObject(length - 1));
            }
        }
        org.json.JSONObject subscriptions = jSONObject.getJSONObject(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.SUBSCRIPTIONS);
        kotlin.jvm.internal.m.d(subscriptions, "subscriptions");
        java.util.Map<java.lang.String, java.util.Date> expirations = parseExpirations(subscriptions);
        java.util.LinkedHashMap linkedHashMapR0 = p078i6.C.R0(parsePurchaseDates(subscriptions), parsePurchaseDates(jSONObject3));
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.ENTITLEMENTS);
        java.util.Date requestDate = overrideRequestDate == null ? com.revenuecat.purchases.utils.Iso8601Utils.parse(body.getString(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.REQUEST_DATE)) : overrideRequestDate;
        java.util.Date firstSeen = com.revenuecat.purchases.utils.Iso8601Utils.parse(jSONObject.getString(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.FIRST_SEEN));
        if (jSONObjectOptJSONObject != null) {
            kotlin.jvm.internal.m.d(requestDate, "requestDate");
            entitlementInfos = com.revenuecat.purchases.common.EntitlementInfoFactoriesKt.buildEntitlementInfos(jSONObjectOptJSONObject, subscriptions, jSONObject3, requestDate, verificationResult);
            if (entitlementInfos == null) {
                java.util.Map map = java.util.Collections.EMPTY_MAP;
                kotlin.jvm.internal.m.d(map, "emptyMap()");
                entitlementInfos = new com.revenuecat.purchases.EntitlementInfos(map, verificationResult);
            }
        } else {
            java.util.Map map2 = java.util.Collections.EMPTY_MAP;
            kotlin.jvm.internal.m.d(map2, "emptyMap()");
            entitlementInfos = new com.revenuecat.purchases.EntitlementInfos(map2, verificationResult);
        }
        java.lang.String strOptNullableString = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(jSONObject, "management_url");
        java.lang.String strOptNullableString2 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(jSONObject, "original_purchase_date");
        if (strOptNullableString2 == null || (date = com.revenuecat.purchases.utils.Iso8601Utils.parse(strOptNullableString2)) == null) {
            date = null;
        }
        int iOptInt = body.optInt("schema_version", 3);
        java.lang.String strOptString = jSONObject.optString(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.ORIGINAL_APP_USER_ID);
        android.net.Uri uri = strOptNullableString != null ? android.net.Uri.parse(strOptNullableString) : null;
        kotlin.jvm.internal.m.d(requestDate, "requestDate");
        kotlin.jvm.internal.m.d(firstSeen, "firstSeen");
        kotlin.jvm.internal.m.d(strOptString, "optString(CustomerInfoRe…eys.ORIGINAL_APP_USER_ID)");
        return new com.revenuecat.purchases.CustomerInfo(entitlementInfos, expirations, linkedHashMapR0, requestDate, iOptInt, firstSeen, strOptString, uri, date, body, originalSource, loadedFromCache);
    }
}
