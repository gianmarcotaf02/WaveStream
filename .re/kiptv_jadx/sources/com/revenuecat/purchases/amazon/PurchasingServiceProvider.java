package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/os/Parcelable;", "Landroid/content/Context;", "context", "Lcom/amazon/device/iap/PurchasingListener;", "listener", "Lh6/A;", "registerListener", "(Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V", "", "", "skus", "Lcom/amazon/device/iap/model/RequestId;", "getProductData", "(Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;", "getUserData", "()Lcom/amazon/device/iap/model/RequestId;", com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU, "purchase", "(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;", "", "reset", "getPurchaseUpdates", "(Z)Lcom/amazon/device/iap/model/RequestId;", "receiptId", "Lcom/amazon/device/iap/model/FulfillmentResult;", "fulfillmentResult", "notifyFulfillment", "(Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface PurchasingServiceProvider extends android.os.Parcelable {
    com.amazon.device.iap.model.RequestId getProductData(java.util.Set<java.lang.String> skus);

    com.amazon.device.iap.model.RequestId getPurchaseUpdates(boolean reset);

    com.amazon.device.iap.model.RequestId getUserData();

    void notifyFulfillment(java.lang.String receiptId, com.amazon.device.iap.model.FulfillmentResult fulfillmentResult);

    com.amazon.device.iap.model.RequestId purchase(java.lang.String sku);

    void registerListener(android.content.Context context, com.amazon.device.iap.PurchasingListener listener);
}
