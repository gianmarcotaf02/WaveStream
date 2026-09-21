package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "", "()V", "AutoSyncDisabled", "Error", "NoPendingPurchasesToSync", "Success", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult$AutoSyncDisabled;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult$Error;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult$NoPendingPurchasesToSync;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult$Success;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SyncPendingPurchaseResult {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult$AutoSyncDisabled;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AutoSyncDisabled extends SyncPendingPurchaseResult {
        public static final AutoSyncDisabled INSTANCE = new AutoSyncDisabled();

        private AutoSyncDisabled() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult$Error;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "error", "Lcom/revenuecat/purchases/PurchasesError;", "(Lcom/revenuecat/purchases/PurchasesError;)V", "getError", "()Lcom/revenuecat/purchases/PurchasesError;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Error extends SyncPendingPurchaseResult {
        private final PurchasesError error;

        public Error(PurchasesError error) {
            super(null);
            m.e(error, "error");
            this.error = error;
        }

        public static Error copy$default(Error error, PurchasesError purchasesError, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                purchasesError = error.error;
            }
            return error.copy(purchasesError);
        }

        public final PurchasesError getError() {
            return this.error;
        }

        public final Error copy(PurchasesError error) {
            m.e(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && m.a(this.error, ((Error) other).error);
        }

        public final PurchasesError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult$NoPendingPurchasesToSync;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class NoPendingPurchasesToSync extends SyncPendingPurchaseResult {
        public static final NoPendingPurchasesToSync INSTANCE = new NoPendingPurchasesToSync();

        private NoPendingPurchasesToSync() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult$Success;", "Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "getCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Success extends SyncPendingPurchaseResult {
        private final CustomerInfo customerInfo;

        public Success(CustomerInfo customerInfo) {
            super(null);
            m.e(customerInfo, "customerInfo");
            this.customerInfo = customerInfo;
        }

        public static Success copy$default(Success success, CustomerInfo customerInfo, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                customerInfo = success.customerInfo;
            }
            return success.copy(customerInfo);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public final Success copy(CustomerInfo customerInfo) {
            m.e(customerInfo, "customerInfo");
            return new Success(customerInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && m.a(this.customerInfo, ((Success) other).customerInfo);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public int hashCode() {
            return this.customerInfo.hashCode();
        }

        public String toString() {
            return "Success(customerInfo=" + this.customerInfo + ')';
        }
    }

    public SyncPendingPurchaseResult(AbstractC2541f abstractC2541f) {
        this();
    }

    private SyncPendingPurchaseResult() {
    }
}
