package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationException;", "Lcom/revenuecat/purchases/PurchasesException;", "error", "Lcom/revenuecat/purchases/PurchasesError;", "isServerError", "", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "()Z", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RewardVerificationException extends com.revenuecat.purchases.PurchasesException {
    private final boolean isServerError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardVerificationException(com.revenuecat.purchases.PurchasesError error, boolean z6) {
        super(error);
        kotlin.jvm.internal.m.e(error, "error");
        this.isServerError = z6;
    }

    /* JADX INFO: renamed from: isServerError, reason: from getter */
    public final boolean getIsServerError() {
        return this.isServerError;
    }
}
