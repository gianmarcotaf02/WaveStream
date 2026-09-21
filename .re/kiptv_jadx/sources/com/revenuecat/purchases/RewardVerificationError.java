package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationError;", "", "error", "Lcom/revenuecat/purchases/PurchasesError;", "isServerError", "", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "getError", "()Lcom/revenuecat/purchases/PurchasesError;", "()Z", "component1", "component2", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class RewardVerificationError {
    private final com.revenuecat.purchases.PurchasesError error;
    private final boolean isServerError;

    public RewardVerificationError(com.revenuecat.purchases.PurchasesError error, boolean z6) {
        kotlin.jvm.internal.m.e(error, "error");
        this.error = error;
        this.isServerError = z6;
    }

    public static /* synthetic */ com.revenuecat.purchases.RewardVerificationError copy$default(com.revenuecat.purchases.RewardVerificationError rewardVerificationError, com.revenuecat.purchases.PurchasesError purchasesError, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            purchasesError = rewardVerificationError.error;
        }
        if ((i3 & 2) != 0) {
            z6 = rewardVerificationError.isServerError;
        }
        return rewardVerificationError.copy(purchasesError, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.PurchasesError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsServerError() {
        return this.isServerError;
    }

    public final com.revenuecat.purchases.RewardVerificationError copy(com.revenuecat.purchases.PurchasesError error, boolean isServerError) {
        kotlin.jvm.internal.m.e(error, "error");
        return new com.revenuecat.purchases.RewardVerificationError(error, isServerError);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.RewardVerificationError)) {
            return false;
        }
        com.revenuecat.purchases.RewardVerificationError rewardVerificationError = (com.revenuecat.purchases.RewardVerificationError) other;
        return kotlin.jvm.internal.m.a(this.error, rewardVerificationError.error) && this.isServerError == rewardVerificationError.isServerError;
    }

    public final com.revenuecat.purchases.PurchasesError getError() {
        return this.error;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.isServerError) + (this.error.hashCode() * 31);
    }

    public final boolean isServerError() {
        return this.isServerError;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardVerificationError(error=");
        sb.append(this.error);
        sb.append(", isServerError=");
        return v5.L.a(sb, this.isServerError, ')');
    }
}
