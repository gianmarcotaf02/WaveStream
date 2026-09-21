package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/PurchaseResult;", "", "storeTransaction", "Lcom/revenuecat/purchases/models/StoreTransaction;", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "getStoreTransaction", "()Lcom/revenuecat/purchases/models/StoreTransaction;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchaseResult {
    private final com.revenuecat.purchases.CustomerInfo customerInfo;
    private final com.revenuecat.purchases.models.StoreTransaction storeTransaction;

    public PurchaseResult(com.revenuecat.purchases.models.StoreTransaction storeTransaction, com.revenuecat.purchases.CustomerInfo customerInfo) {
        kotlin.jvm.internal.m.e(storeTransaction, "storeTransaction");
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
        this.storeTransaction = storeTransaction;
        this.customerInfo = customerInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.PurchaseResult)) {
            return false;
        }
        com.revenuecat.purchases.PurchaseResult purchaseResult = (com.revenuecat.purchases.PurchaseResult) obj;
        return kotlin.jvm.internal.m.a(this.storeTransaction, purchaseResult.storeTransaction) && kotlin.jvm.internal.m.a(this.customerInfo, purchaseResult.customerInfo);
    }

    public final com.revenuecat.purchases.CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final com.revenuecat.purchases.models.StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    public int hashCode() {
        return this.customerInfo.hashCode() + (this.storeTransaction.hashCode() * 31);
    }

    public java.lang.String toString() {
        return "PurchaseResult(storeTransaction=" + this.storeTransaction + ", customerInfo=" + this.customerInfo + ')';
    }
}
