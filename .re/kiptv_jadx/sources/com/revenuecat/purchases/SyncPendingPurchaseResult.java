package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "", "()V", "AutoSyncDisabled", "Error", "NoPendingPurchasesToSync", "Success", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult$AutoSyncDisabled;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult$Error;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult$NoPendingPurchasesToSync;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult$Success;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SyncPendingPurchaseResult {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult$AutoSyncDisabled;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AutoSyncDisabled extends com.revenuecat.purchases.SyncPendingPurchaseResult {
        public static final com.revenuecat.purchases.SyncPendingPurchaseResult.AutoSyncDisabled INSTANCE = new com.revenuecat.purchases.SyncPendingPurchaseResult.AutoSyncDisabled();

        private AutoSyncDisabled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult$Error;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "error", "Lcom/revenuecat/purchases/PurchasesError;", "(Lcom/revenuecat/purchases/PurchasesError;)V", "getError", "()Lcom/revenuecat/purchases/PurchasesError;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Error extends com.revenuecat.purchases.SyncPendingPurchaseResult {
        private final com.revenuecat.purchases.PurchasesError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.revenuecat.purchases.PurchasesError error) {
            super(null);
            kotlin.jvm.internal.m.e(error, "error");
            this.error = error;
        }

        public static /* synthetic */ com.revenuecat.purchases.SyncPendingPurchaseResult.Error copy$default(com.revenuecat.purchases.SyncPendingPurchaseResult.Error error, com.revenuecat.purchases.PurchasesError purchasesError, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                purchasesError = error.error;
            }
            return error.copy(purchasesError);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.revenuecat.purchases.PurchasesError getError() {
            return this.error;
        }

        public final com.revenuecat.purchases.SyncPendingPurchaseResult.Error copy(com.revenuecat.purchases.PurchasesError error) {
            kotlin.jvm.internal.m.e(error, "error");
            return new com.revenuecat.purchases.SyncPendingPurchaseResult.Error(error);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.SyncPendingPurchaseResult.Error) && kotlin.jvm.internal.m.a(this.error, ((com.revenuecat.purchases.SyncPendingPurchaseResult.Error) other).error);
        }

        public final com.revenuecat.purchases.PurchasesError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public java.lang.String toString() {
            return "Error(error=" + this.error + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult$NoPendingPurchasesToSync;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class NoPendingPurchasesToSync extends com.revenuecat.purchases.SyncPendingPurchaseResult {
        public static final com.revenuecat.purchases.SyncPendingPurchaseResult.NoPendingPurchasesToSync INSTANCE = new com.revenuecat.purchases.SyncPendingPurchaseResult.NoPendingPurchasesToSync();

        private NoPendingPurchasesToSync() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult$Success;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Success extends com.revenuecat.purchases.SyncPendingPurchaseResult {
        private final com.revenuecat.purchases.CustomerInfo customerInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.revenuecat.purchases.CustomerInfo customerInfo) {
            super(null);
            kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
            this.customerInfo = customerInfo;
        }

        public static /* synthetic */ com.revenuecat.purchases.SyncPendingPurchaseResult.Success copy$default(com.revenuecat.purchases.SyncPendingPurchaseResult.Success success, com.revenuecat.purchases.CustomerInfo customerInfo, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                customerInfo = success.customerInfo;
            }
            return success.copy(customerInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.revenuecat.purchases.CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public final com.revenuecat.purchases.SyncPendingPurchaseResult.Success copy(com.revenuecat.purchases.CustomerInfo customerInfo) {
            kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
            return new com.revenuecat.purchases.SyncPendingPurchaseResult.Success(customerInfo);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.SyncPendingPurchaseResult.Success) && kotlin.jvm.internal.m.a(this.customerInfo, ((com.revenuecat.purchases.SyncPendingPurchaseResult.Success) other).customerInfo);
        }

        public final com.revenuecat.purchases.CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public int hashCode() {
            return this.customerInfo.hashCode();
        }

        public java.lang.String toString() {
            return "Success(customerInfo=" + this.customerInfo + ')';
        }
    }

    public /* synthetic */ SyncPendingPurchaseResult(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    private SyncPendingPurchaseResult() {
    }
}
