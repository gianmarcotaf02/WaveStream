package com.revenuecat.purchases.models;

import B2.a;
import I3.b;
import Y2.C1047q;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.ProductType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData;", "Lcom/revenuecat/purchases/models/PurchasingData;", "()V", "productType", "Lcom/revenuecat/purchases/ProductType;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "InAppProduct", "Subscription", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class GooglePurchasingData implements PurchasingData {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "LY2/q;", "productDetails", "<init>", "(Ljava/lang/String;LY2/q;)V", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "LY2/q;", "getProductDetails", "()LY2/q;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class InAppProduct extends GooglePurchasingData {
        private final C1047q productDetails;
        private final String productId;

        public InAppProduct(String productId, C1047q productDetails) {
            super(null);
            m.e(productId, "productId");
            m.e(productDetails, "productDetails");
            this.productId = productId;
            this.productDetails = productDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) obj;
            return m.a(this.productId, inAppProduct.productId) && m.a(this.productDetails, inAppProduct.productDetails);
        }

        public final C1047q getProductDetails() {
            return this.productDetails;
        }

        @Override
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productDetails.f11502a.hashCode() + (this.productId.hashCode() * 31);
        }

        public String toString() {
            return "InAppProduct(productId=" + this.productId + ", productDetails=" + this.productDetails + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "optionId", "LY2/q;", "productDetails", "token", "Lcom/revenuecat/purchases/models/Period;", "billingPeriod", "", "addOnProducts", "<init>", "(Ljava/lang/String;Ljava/lang/String;LY2/q;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;LY2/q;Ljava/lang/String;)V", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "getOptionId", "LY2/q;", "getProductDetails", "()LY2/q;", "getToken", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "()Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod$annotations", "()V", "Ljava/util/List;", "getAddOnProducts", "()Ljava/util/List;", "getAddOnProducts$annotations", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Subscription extends GooglePurchasingData {
        private final List<GooglePurchasingData> addOnProducts;
        private final Period billingPeriod;
        private final String optionId;
        private final C1047q productDetails;
        private final String productId;
        private final String token;

        public Subscription(String str, String str2, C1047q c1047q, String str3, Period period, List list, int i3, AbstractC2541f abstractC2541f) {
            this(str, str2, c1047q, str3, (i3 & 16) != 0 ? null : period, (i3 & 32) != 0 ? null : list);
        }

        public static void getAddOnProducts$annotations() {
        }

        public static void getBillingPeriod$annotations() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return m.a(this.productId, subscription.productId) && m.a(this.optionId, subscription.optionId) && m.a(this.productDetails, subscription.productDetails) && m.a(this.token, subscription.token) && m.a(this.billingPeriod, subscription.billingPeriod) && m.a(this.addOnProducts, subscription.addOnProducts);
        }

        public final List getAddOnProducts() {
            return this.addOnProducts;
        }

        public final Period getBillingPeriod() {
            return this.billingPeriod;
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final C1047q getProductDetails() {
            return this.productDetails;
        }

        @Override
        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            int iA = a.a(a.a(a.a(this.productId.hashCode() * 31, 31, this.optionId), 31, this.productDetails.f11502a), 31, this.token);
            Period period = this.billingPeriod;
            int iHashCode = (iA + (period == null ? 0 : period.hashCode())) * 31;
            List<GooglePurchasingData> list = this.addOnProducts;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Subscription(productId=");
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
            return M0.n(sb, this.addOnProducts, ')');
        }

        public Subscription(String productId, String optionId, C1047q productDetails, String token, Period period, List<? extends GooglePurchasingData> list) {
            super(null);
            m.e(productId, "productId");
            m.e(optionId, "optionId");
            m.e(productDetails, "productDetails");
            m.e(token, "token");
            this.productId = productId;
            this.optionId = optionId;
            this.productDetails = productDetails;
            this.token = token;
            this.billingPeriod = period;
            this.addOnProducts = list;
        }

        public Subscription(String productId, String optionId, C1047q productDetails, String token) {
            this(productId, optionId, productDetails, token, null, null);
            m.e(productId, "productId");
            m.e(optionId, "optionId");
            m.e(productDetails, "productDetails");
            m.e(token, "token");
        }
    }

    public GooglePurchasingData(AbstractC2541f abstractC2541f) {
        this();
    }

    @Override
    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new b();
    }

    private GooglePurchasingData() {
    }
}
