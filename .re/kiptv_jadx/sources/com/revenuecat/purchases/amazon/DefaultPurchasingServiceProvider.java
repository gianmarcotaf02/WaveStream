package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J \u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/amazon/DefaultPurchasingServiceProvider;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/amazon/device/iap/PurchasingListener;", "listener", "Lh6/A;", "registerListener", "(Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V", "Lcom/amazon/device/iap/model/RequestId;", "getUserData", "()Lcom/amazon/device/iap/model/RequestId;", "", com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU, "purchase", "(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;", "", "skus", "getProductData", "(Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;", "", "reset", "getPurchaseUpdates", "(Z)Lcom/amazon/device/iap/model/RequestId;", "receiptId", "Lcom/amazon/device/iap/model/FulfillmentResult;", "fulfillmentResult", "notifyFulfillment", "(Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultPurchasingServiceProvider implements com.revenuecat.purchases.amazon.PurchasingServiceProvider {
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.amazon.DefaultPurchasingServiceProvider> CREATOR = new com.revenuecat.purchases.amazon.DefaultPurchasingServiceProvider.Creator();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.amazon.DefaultPurchasingServiceProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.amazon.DefaultPurchasingServiceProvider createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            parcel.readInt();
            return new com.revenuecat.purchases.amazon.DefaultPurchasingServiceProvider();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.amazon.DefaultPurchasingServiceProvider[] newArray(int i3) {
            return new com.revenuecat.purchases.amazon.DefaultPurchasingServiceProvider[i3];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public com.amazon.device.iap.model.RequestId getProductData(java.util.Set<java.lang.String> skus) {
        kotlin.jvm.internal.m.e(skus, "skus");
        com.amazon.device.iap.model.RequestId productData = com.amazon.device.iap.PurchasingService.getProductData(skus);
        kotlin.jvm.internal.m.d(productData, "getProductData(skus)");
        return productData;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public com.amazon.device.iap.model.RequestId getPurchaseUpdates(boolean reset) {
        com.amazon.device.iap.model.RequestId purchaseUpdates = com.amazon.device.iap.PurchasingService.getPurchaseUpdates(reset);
        kotlin.jvm.internal.m.d(purchaseUpdates, "getPurchaseUpdates(reset)");
        return purchaseUpdates;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public com.amazon.device.iap.model.RequestId getUserData() {
        com.amazon.device.iap.model.RequestId userData = com.amazon.device.iap.PurchasingService.getUserData(com.amazon.device.iap.model.UserDataRequest.newBuilder().setFetchLWAConsentStatus(true).build());
        kotlin.jvm.internal.m.d(userData, "getUserData(UserDataRequ…sentStatus(true).build())");
        return userData;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public void notifyFulfillment(java.lang.String receiptId, com.amazon.device.iap.model.FulfillmentResult fulfillmentResult) {
        kotlin.jvm.internal.m.e(receiptId, "receiptId");
        kotlin.jvm.internal.m.e(fulfillmentResult, "fulfillmentResult");
        com.amazon.device.iap.PurchasingService.notifyFulfillment(receiptId, fulfillmentResult);
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public com.amazon.device.iap.model.RequestId purchase(java.lang.String sku) {
        kotlin.jvm.internal.m.e(sku, "sku");
        com.amazon.device.iap.model.RequestId requestIdPurchase = com.amazon.device.iap.PurchasingService.purchase(sku);
        kotlin.jvm.internal.m.d(requestIdPurchase, "purchase(sku)");
        return requestIdPurchase;
    }

    @Override // com.revenuecat.purchases.amazon.PurchasingServiceProvider
    public void registerListener(android.content.Context context, com.amazon.device.iap.PurchasingListener listener) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(listener, "listener");
        com.amazon.device.iap.PurchasingService.registerListener(context, listener);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        parcel.writeInt(1);
    }
}
