package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData;", "Lcom/revenuecat/purchases/models/PurchasingData;", "()V", "productType", "Lcom/revenuecat/purchases/ProductType;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "InAppProduct", "Subscription", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class GooglePurchasingData implements com.revenuecat.purchases.models.PurchasingData {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "LY2/q;", "productDetails", "<init>", "(Ljava/lang/String;LY2/q;)V", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "LY2/q;", "getProductDetails", "()LY2/q;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class InAppProduct extends com.revenuecat.purchases.models.GooglePurchasingData {
        private final Y2.C1047q productDetails;
        private final java.lang.String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppProduct(java.lang.String productId, Y2.C1047q productDetails) {
            super(null);
            kotlin.jvm.internal.m.e(productId, "productId");
            kotlin.jvm.internal.m.e(productDetails, "productDetails");
            this.productId = productId;
            this.productDetails = productDetails;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.models.GooglePurchasingData.InAppProduct)) {
                return false;
            }
            com.revenuecat.purchases.models.GooglePurchasingData.InAppProduct inAppProduct = (com.revenuecat.purchases.models.GooglePurchasingData.InAppProduct) obj;
            return kotlin.jvm.internal.m.a(this.productId, inAppProduct.productId) && kotlin.jvm.internal.m.a(this.productDetails, inAppProduct.productDetails);
        }

        public final Y2.C1047q getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public java.lang.String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productDetails.f11502a.hashCode() + (this.productId.hashCode() * 31);
        }

        public java.lang.String toString() {
            return "InAppProduct(productId=" + this.productId + ", productDetails=" + this.productDetails + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "optionId", "LY2/q;", "productDetails", "token", "Lcom/revenuecat/purchases/models/Period;", "billingPeriod", "", "addOnProducts", "<init>", "(Ljava/lang/String;Ljava/lang/String;LY2/q;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;LY2/q;Ljava/lang/String;)V", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "getOptionId", "LY2/q;", "getProductDetails", "()LY2/q;", "getToken", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "()Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod$annotations", "()V", "Ljava/util/List;", "getAddOnProducts", "()Ljava/util/List;", "getAddOnProducts$annotations", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Subscription extends com.revenuecat.purchases.models.GooglePurchasingData {
        private final java.util.List<com.revenuecat.purchases.models.GooglePurchasingData> addOnProducts;
        private final com.revenuecat.purchases.models.Period billingPeriod;
        private final java.lang.String optionId;
        private final Y2.C1047q productDetails;
        private final java.lang.String productId;
        private final java.lang.String token;

        public /* synthetic */ Subscription(java.lang.String str, java.lang.String str2, Y2.C1047q c1047q, java.lang.String str3, com.revenuecat.purchases.models.Period period, java.util.List list, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(str, str2, c1047q, str3, (i3 & 16) != 0 ? null : period, (i3 & 32) != 0 ? null : list);
        }

        public static /* synthetic */ void getAddOnProducts$annotations() {
        }

        public static /* synthetic */ void getBillingPeriod$annotations() {
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.models.GooglePurchasingData.Subscription)) {
                return false;
            }
            com.revenuecat.purchases.models.GooglePurchasingData.Subscription subscription = (com.revenuecat.purchases.models.GooglePurchasingData.Subscription) obj;
            return kotlin.jvm.internal.m.a(this.productId, subscription.productId) && kotlin.jvm.internal.m.a(this.optionId, subscription.optionId) && kotlin.jvm.internal.m.a(this.productDetails, subscription.productDetails) && kotlin.jvm.internal.m.a(this.token, subscription.token) && kotlin.jvm.internal.m.a(this.billingPeriod, subscription.billingPeriod) && kotlin.jvm.internal.m.a(this.addOnProducts, subscription.addOnProducts);
        }

        public final /* synthetic */ java.util.List getAddOnProducts() {
            return this.addOnProducts;
        }

        public final /* synthetic */ com.revenuecat.purchases.models.Period getBillingPeriod() {
            return this.billingPeriod;
        }

        public final java.lang.String getOptionId() {
            return this.optionId;
        }

        public final Y2.C1047q getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public java.lang.String getProductId() {
            return this.productId;
        }

        public final java.lang.String getToken() {
            return this.token;
        }

        public int hashCode() {
            int iA = B2.a.a(B2.a.a(B2.a.a(this.productId.hashCode() * 31, 31, this.optionId), 31, this.productDetails.f11502a), 31, this.token);
            com.revenuecat.purchases.models.Period period = this.billingPeriod;
            int iHashCode = (iA + (period == null ? 0 : period.hashCode())) * 31;
            java.util.List<com.revenuecat.purchases.models.GooglePurchasingData> list = this.addOnProducts;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Subscription(productId=");
            sb.append(this.productId);
            sb.append(", optionId=");
            sb.append(this.optionId);
            sb.append(", productDetails=");
            sb.append(this.productDetails);
            sb.append(", token=");
            sb.append(this.token);
            sb.append(", billingPeriod=");
            sb.append(this.billingPeriod);
            sb.append(", addOnProducts=");
            return com.google.android.gms.internal.play_billing.M0.n(sb, this.addOnProducts, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Subscription(java.lang.String productId, java.lang.String optionId, Y2.C1047q productDetails, java.lang.String token, com.revenuecat.purchases.models.Period period, java.util.List<? extends com.revenuecat.purchases.models.GooglePurchasingData> list) {
            super(null);
            kotlin.jvm.internal.m.e(productId, "productId");
            kotlin.jvm.internal.m.e(optionId, "optionId");
            kotlin.jvm.internal.m.e(productDetails, "productDetails");
            kotlin.jvm.internal.m.e(token, "token");
            this.productId = productId;
            this.optionId = optionId;
            this.productDetails = productDetails;
            this.token = token;
            this.billingPeriod = period;
            this.addOnProducts = list;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Subscription(java.lang.String productId, java.lang.String optionId, Y2.C1047q productDetails, java.lang.String token) {
            this(productId, optionId, productDetails, token, null, null);
            kotlin.jvm.internal.m.e(productId, "productId");
            kotlin.jvm.internal.m.e(optionId, "optionId");
            kotlin.jvm.internal.m.e(productDetails, "productDetails");
            kotlin.jvm.internal.m.e(token, "token");
        }
    }

    public /* synthetic */ GooglePurchasingData(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public com.revenuecat.purchases.ProductType getProductType() {
        if (this instanceof com.revenuecat.purchases.models.GooglePurchasingData.InAppProduct) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        if (this instanceof com.revenuecat.purchases.models.GooglePurchasingData.Subscription) {
            return com.revenuecat.purchases.ProductType.SUBS;
        }
        throw new I3.b();
    }

    private GooglePurchasingData() {
    }
}
