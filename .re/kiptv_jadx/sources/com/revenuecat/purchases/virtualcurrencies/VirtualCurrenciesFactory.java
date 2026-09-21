package com.revenuecat.purchases.virtualcurrencies;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrenciesFactory;", "", "()V", "buildVirtualCurrencies", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "httpResult", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "jsonString", "", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lorg/json/JSONObject;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class VirtualCurrenciesFactory {
    public static final com.revenuecat.purchases.virtualcurrencies.VirtualCurrenciesFactory INSTANCE = new com.revenuecat.purchases.virtualcurrencies.VirtualCurrenciesFactory();

    private VirtualCurrenciesFactory() {
    }

    public final com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies buildVirtualCurrencies(com.revenuecat.purchases.common.networking.HTTPResult httpResult) {
        kotlin.jvm.internal.m.e(httpResult, "httpResult");
        return buildVirtualCurrencies(httpResult.getBody());
    }

    public final com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies buildVirtualCurrencies(org.json.JSONObject body) {
        kotlin.jvm.internal.m.e(body, "body");
        p162s8.d defaultJson = com.revenuecat.purchases.common.JsonProvider.INSTANCE.getDefaultJson();
        java.lang.String string = body.toString();
        kotlin.jvm.internal.m.d(string, "body.toString()");
        defaultJson.getClass();
        return (com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies) defaultJson.b(string, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies.INSTANCE.serializer());
    }

    public final com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies buildVirtualCurrencies(java.lang.String jsonString) {
        kotlin.jvm.internal.m.e(jsonString, "jsonString");
        p162s8.d defaultJson = com.revenuecat.purchases.common.JsonProvider.INSTANCE.getDefaultJson();
        defaultJson.getClass();
        return (com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies) defaultJson.b(jsonString, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies.INSTANCE.serializer());
    }
}
