package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/google/PurchaseContext;", "", "productType", "Lcom/revenuecat/purchases/ProductType;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "selectedSubscriptionOptionId", "", "replacementMode", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "subscriptionOptionIdForProductIDs", "", "(Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreReplacementMode;Ljava/util/Map;)V", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "getReplacementMode", "()Lcom/revenuecat/purchases/models/StoreReplacementMode;", "getSelectedSubscriptionOptionId", "()Ljava/lang/String;", "getSubscriptionOptionIdForProductIDs", "()Ljava/util/Map;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchaseContext {
    private final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
    private final com.revenuecat.purchases.ProductType productType;
    private final com.revenuecat.purchases.models.StoreReplacementMode replacementMode;
    private final java.lang.String selectedSubscriptionOptionId;
    private final java.util.Map<java.lang.String, java.lang.String> subscriptionOptionIdForProductIDs;

    public PurchaseContext(com.revenuecat.purchases.ProductType productType, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, java.lang.String str, com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.m.e(productType, "productType");
        this.productType = productType;
        this.presentedOfferingContext = presentedOfferingContext;
        this.selectedSubscriptionOptionId = str;
        this.replacementMode = storeReplacementMode;
        this.subscriptionOptionIdForProductIDs = map;
    }

    public final com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final com.revenuecat.purchases.ProductType getProductType() {
        return this.productType;
    }

    public final com.revenuecat.purchases.models.StoreReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final java.lang.String getSelectedSubscriptionOptionId() {
        return this.selectedSubscriptionOptionId;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getSubscriptionOptionIdForProductIDs() {
        return this.subscriptionOptionIdForProductIDs;
    }
}
