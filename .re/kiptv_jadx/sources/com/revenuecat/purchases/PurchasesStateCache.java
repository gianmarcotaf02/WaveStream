package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/PurchasesStateCache;", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "purchasesState", "Lcom/revenuecat/purchases/PurchasesState;", "(Lcom/revenuecat/purchases/PurchasesState;)V", "getPurchasesState", "()Lcom/revenuecat/purchases/PurchasesState;", "setPurchasesState", "component1", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class PurchasesStateCache implements com.revenuecat.purchases.PurchasesStateProvider {
    private com.revenuecat.purchases.PurchasesState purchasesState;

    public PurchasesStateCache(com.revenuecat.purchases.PurchasesState purchasesState) {
        kotlin.jvm.internal.m.e(purchasesState, "purchasesState");
        this.purchasesState = purchasesState;
    }

    public static /* synthetic */ com.revenuecat.purchases.PurchasesStateCache copy$default(com.revenuecat.purchases.PurchasesStateCache purchasesStateCache, com.revenuecat.purchases.PurchasesState purchasesState, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            purchasesState = purchasesStateCache.purchasesState;
        }
        return purchasesStateCache.copy(purchasesState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.PurchasesState getPurchasesState() {
        return this.purchasesState;
    }

    public final com.revenuecat.purchases.PurchasesStateCache copy(com.revenuecat.purchases.PurchasesState purchasesState) {
        kotlin.jvm.internal.m.e(purchasesState, "purchasesState");
        return new com.revenuecat.purchases.PurchasesStateCache(purchasesState);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.revenuecat.purchases.PurchasesStateCache) && kotlin.jvm.internal.m.a(this.purchasesState, ((com.revenuecat.purchases.PurchasesStateCache) other).purchasesState);
    }

    @Override // com.revenuecat.purchases.PurchasesStateProvider
    public synchronized com.revenuecat.purchases.PurchasesState getPurchasesState() {
        return this.purchasesState;
    }

    public int hashCode() {
        return this.purchasesState.hashCode();
    }

    public synchronized void setPurchasesState(com.revenuecat.purchases.PurchasesState purchasesState) {
        kotlin.jvm.internal.m.e(purchasesState, "<set-?>");
        this.purchasesState = purchasesState;
    }

    public java.lang.String toString() {
        return "PurchasesStateCache(purchasesState=" + this.purchasesState + ')';
    }
}
