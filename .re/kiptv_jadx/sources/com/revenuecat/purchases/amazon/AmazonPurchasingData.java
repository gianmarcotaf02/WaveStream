package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonPurchasingData;", "Lcom/revenuecat/purchases/models/PurchasingData;", "()V", "Product", "Lcom/revenuecat/purchases/amazon/AmazonPurchasingData$Product;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class AmazonPurchasingData implements com.revenuecat.purchases.models.PurchasingData {

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonPurchasingData$Product;", "Lcom/revenuecat/purchases/amazon/AmazonPurchasingData;", "storeProduct", "Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "(Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;)V", "productId", "", "getProductId", "()Ljava/lang/String;", "productType", "Lcom/revenuecat/purchases/ProductType;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "getStoreProduct", "()Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Product extends com.revenuecat.purchases.amazon.AmazonPurchasingData {
        private final com.revenuecat.purchases.amazon.AmazonStoreProduct storeProduct;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Product(com.revenuecat.purchases.amazon.AmazonStoreProduct storeProduct) {
            super(null);
            kotlin.jvm.internal.m.e(storeProduct, "storeProduct");
            this.storeProduct = storeProduct;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.revenuecat.purchases.amazon.AmazonPurchasingData.Product) && kotlin.jvm.internal.m.a(this.storeProduct, ((com.revenuecat.purchases.amazon.AmazonPurchasingData.Product) obj).storeProduct);
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public java.lang.String getProductId() {
            return this.storeProduct.getId();
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public com.revenuecat.purchases.ProductType getProductType() {
            return this.storeProduct.getType();
        }

        public final com.revenuecat.purchases.amazon.AmazonStoreProduct getStoreProduct() {
            return this.storeProduct;
        }

        public int hashCode() {
            return this.storeProduct.hashCode();
        }

        public java.lang.String toString() {
            return "Product(storeProduct=" + this.storeProduct + ')';
        }
    }

    public /* synthetic */ AmazonPurchasingData(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    private AmazonPurchasingData() {
    }
}
