package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"amazonProduct", "Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "getAmazonProduct", "(Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AmazonStoreProductKt {
    public static final com.revenuecat.purchases.amazon.AmazonStoreProduct getAmazonProduct(com.revenuecat.purchases.models.StoreProduct storeProduct) {
        kotlin.jvm.internal.m.e(storeProduct, "<this>");
        if (storeProduct instanceof com.revenuecat.purchases.amazon.AmazonStoreProduct) {
            return (com.revenuecat.purchases.amazon.AmazonStoreProduct) storeProduct;
        }
        return null;
    }
}
