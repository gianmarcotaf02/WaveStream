package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"errorGettingReceiptInfo", "Lcom/revenuecat/purchases/PurchasesError;", "error", "missingTermSkuError", io.sentry.protocol.Response.TYPE, "Lorg/json/JSONObject;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ErrorsKt {
    public static final com.revenuecat.purchases.PurchasesError errorGettingReceiptInfo(com.revenuecat.purchases.PurchasesError error) {
        kotlin.jvm.internal.m.e(error, "error");
        return new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.InvalidReceiptError, "Couldn't get Amazon receipt data from RevenueCat backend. Error: " + error);
    }

    public static final com.revenuecat.purchases.PurchasesError missingTermSkuError(org.json.JSONObject response) {
        kotlin.jvm.internal.m.e(response, "response");
        return new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.UnexpectedBackendResponseError, "Amazon receipt data response is missing termSku. Response:\n" + response);
    }
}
