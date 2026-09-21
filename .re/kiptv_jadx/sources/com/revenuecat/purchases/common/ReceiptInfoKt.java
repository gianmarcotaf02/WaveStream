package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"platformProductId", "Lcom/revenuecat/purchases/common/PlatformProductId;", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReceiptInfoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.revenuecat.purchases.common.PlatformProductId platformProductId(com.revenuecat.purchases.models.StoreProduct storeProduct) {
        return new com.revenuecat.purchases.common.PlatformProductId(storeProduct.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.revenuecat.purchases.common.PlatformProductId platformProductId(com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
        if (!(subscriptionOption instanceof com.revenuecat.purchases.models.GoogleSubscriptionOption)) {
            return null;
        }
        com.revenuecat.purchases.models.GoogleSubscriptionOption googleSubscriptionOption = (com.revenuecat.purchases.models.GoogleSubscriptionOption) subscriptionOption;
        return new com.revenuecat.purchases.common.GooglePlatformProductId(googleSubscriptionOption.getProductId(), googleSubscriptionOption.getBasePlanId(), googleSubscriptionOption.getOfferId());
    }
}
