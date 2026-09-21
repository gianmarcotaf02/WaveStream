package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/PurchasesTransactionException;", "Lcom/revenuecat/purchases/PurchasesException;", "purchasesError", "Lcom/revenuecat/purchases/PurchasesError;", "userCancelled", "", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "getUserCancelled", "()Z", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesTransactionException extends com.revenuecat.purchases.PurchasesException {
    private final boolean userCancelled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesTransactionException(com.revenuecat.purchases.PurchasesError purchasesError, boolean z6) {
        super(purchasesError);
        kotlin.jvm.internal.m.e(purchasesError, "purchasesError");
        this.userCancelled = z6;
    }

    public final boolean getUserCancelled() {
        return this.userCancelled;
    }
}
