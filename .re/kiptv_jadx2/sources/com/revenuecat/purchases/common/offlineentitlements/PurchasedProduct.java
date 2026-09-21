package com.revenuecat.purchases.common.offlineentitlements;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.StoreTransaction;
import io.sentry.protocol.Request;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "", "productIdentifier", "", "basePlanId", "storeTransaction", "Lcom/revenuecat/purchases/models/StoreTransaction;", CustomerInfoResponseJsonKeys.ENTITLEMENTS, "", "expiresDate", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreTransaction;Ljava/util/List;Ljava/util/Date;)V", "getBasePlanId", "()Ljava/lang/String;", "getEntitlements", "()Ljava/util/List;", "getExpiresDate", "()Ljava/util/Date;", "getProductIdentifier", "getStoreTransaction", "()Lcom/revenuecat/purchases/models/StoreTransaction;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasedProduct {
    private final String basePlanId;
    private final List<String> entitlements;
    private final Date expiresDate;
    private final String productIdentifier;
    private final StoreTransaction storeTransaction;

    public PurchasedProduct(String productIdentifier, String str, StoreTransaction storeTransaction, List<String> entitlements, Date date) {
        m.e(productIdentifier, "productIdentifier");
        m.e(storeTransaction, "storeTransaction");
        m.e(entitlements, "entitlements");
        this.productIdentifier = productIdentifier;
        this.basePlanId = str;
        this.storeTransaction = storeTransaction;
        this.entitlements = entitlements;
        this.expiresDate = date;
    }

    public static PurchasedProduct copy$default(PurchasedProduct purchasedProduct, String str, String str2, StoreTransaction storeTransaction, List list, Date date, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = purchasedProduct.productIdentifier;
        }
        if ((i3 & 2) != 0) {
            str2 = purchasedProduct.basePlanId;
        }
        if ((i3 & 4) != 0) {
            storeTransaction = purchasedProduct.storeTransaction;
        }
        if ((i3 & 8) != 0) {
            list = purchasedProduct.entitlements;
        }
        if ((i3 & 16) != 0) {
            date = purchasedProduct.expiresDate;
        }
        Date date2 = date;
        StoreTransaction storeTransaction2 = storeTransaction;
        return purchasedProduct.copy(str, str2, storeTransaction2, list, date2);
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    public final List<String> component4() {
        return this.entitlements;
    }

    public final Date getExpiresDate() {
        return this.expiresDate;
    }

    public final PurchasedProduct copy(String productIdentifier, String basePlanId, StoreTransaction storeTransaction, List<String> entitlements, Date expiresDate) {
        m.e(productIdentifier, "productIdentifier");
        m.e(storeTransaction, "storeTransaction");
        m.e(entitlements, "entitlements");
        return new PurchasedProduct(productIdentifier, basePlanId, storeTransaction, entitlements, expiresDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchasedProduct)) {
            return false;
        }
        PurchasedProduct purchasedProduct = (PurchasedProduct) other;
        return m.a(this.productIdentifier, purchasedProduct.productIdentifier) && m.a(this.basePlanId, purchasedProduct.basePlanId) && m.a(this.storeTransaction, purchasedProduct.storeTransaction) && m.a(this.entitlements, purchasedProduct.entitlements) && m.a(this.expiresDate, purchasedProduct.expiresDate);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final List<String> getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpiresDate() {
        return this.expiresDate;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    public int hashCode() {
        int iHashCode = this.productIdentifier.hashCode() * 31;
        String str = this.basePlanId;
        int iB = a.b((this.storeTransaction.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.entitlements);
        Date date = this.expiresDate;
        return iB + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        return "PurchasedProduct(productIdentifier=" + this.productIdentifier + ", basePlanId=" + this.basePlanId + ", storeTransaction=" + this.storeTransaction + ", entitlements=" + this.entitlements + ", expiresDate=" + this.expiresDate + ')';
    }
}
