package com.revenuecat.purchases.simulatedstore;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/simulatedstore/SimulatedStorePurchasingData;", "Lcom/revenuecat/purchases/models/PurchasingData;", "productId", "", "productType", "Lcom/revenuecat/purchases/ProductType;", "storeProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/StoreProduct;)V", "getProductId", "()Ljava/lang/String;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "getStoreProduct", "()Lcom/revenuecat/purchases/models/StoreProduct;", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class SimulatedStorePurchasingData implements com.revenuecat.purchases.models.PurchasingData {
    private final java.lang.String productId;
    private final com.revenuecat.purchases.ProductType productType;
    private final com.revenuecat.purchases.models.StoreProduct storeProduct;

    public SimulatedStorePurchasingData(java.lang.String productId, com.revenuecat.purchases.ProductType productType, com.revenuecat.purchases.models.StoreProduct storeProduct) {
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(productType, "productType");
        kotlin.jvm.internal.m.e(storeProduct, "storeProduct");
        this.productId = productId;
        this.productType = productType;
        this.storeProduct = storeProduct;
    }

    public static /* synthetic */ com.revenuecat.purchases.simulatedstore.SimulatedStorePurchasingData copy$default(com.revenuecat.purchases.simulatedstore.SimulatedStorePurchasingData simulatedStorePurchasingData, java.lang.String str, com.revenuecat.purchases.ProductType productType, com.revenuecat.purchases.models.StoreProduct storeProduct, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = simulatedStorePurchasingData.productId;
        }
        if ((i3 & 2) != 0) {
            productType = simulatedStorePurchasingData.productType;
        }
        if ((i3 & 4) != 0) {
            storeProduct = simulatedStorePurchasingData.storeProduct;
        }
        return simulatedStorePurchasingData.copy(str, productType, storeProduct);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.ProductType getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.revenuecat.purchases.models.StoreProduct getStoreProduct() {
        return this.storeProduct;
    }

    public final com.revenuecat.purchases.simulatedstore.SimulatedStorePurchasingData copy(java.lang.String productId, com.revenuecat.purchases.ProductType productType, com.revenuecat.purchases.models.StoreProduct storeProduct) {
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(productType, "productType");
        kotlin.jvm.internal.m.e(storeProduct, "storeProduct");
        return new com.revenuecat.purchases.simulatedstore.SimulatedStorePurchasingData(productId, productType, storeProduct);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.simulatedstore.SimulatedStorePurchasingData)) {
            return false;
        }
        com.revenuecat.purchases.simulatedstore.SimulatedStorePurchasingData simulatedStorePurchasingData = (com.revenuecat.purchases.simulatedstore.SimulatedStorePurchasingData) other;
        return kotlin.jvm.internal.m.a(this.productId, simulatedStorePurchasingData.productId) && this.productType == simulatedStorePurchasingData.productType && kotlin.jvm.internal.m.a(this.storeProduct, simulatedStorePurchasingData.storeProduct);
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public java.lang.String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public com.revenuecat.purchases.ProductType getProductType() {
        return this.productType;
    }

    public final com.revenuecat.purchases.models.StoreProduct getStoreProduct() {
        return this.storeProduct;
    }

    public int hashCode() {
        return this.storeProduct.hashCode() + ((this.productType.hashCode() + (this.productId.hashCode() * 31)) * 31);
    }

    public java.lang.String toString() {
        return "SimulatedStorePurchasingData(productId=" + this.productId + ", productType=" + this.productType + ", storeProduct=" + this.storeProduct + ')';
    }
}
