package com.revenuecat.purchases.common.offerings;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "cacheStatus", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1 extends kotlin.jvm.internal.o implements p194x6.m {
    final /* synthetic */ p194x6.j $onError;
    final /* synthetic */ java.util.Date $startTime;
    final /* synthetic */ com.revenuecat.purchases.common.offerings.OfferingsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1(com.revenuecat.purchases.common.offerings.OfferingsManager offeringsManager, java.util.Date date, p194x6.j jVar) {
        super(2);
        this.this$0 = offeringsManager;
        this.$startTime = date;
        this.$onError = jVar;
    }

    @Override // p194x6.m
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        invoke((com.revenuecat.purchases.PurchasesError) obj, (com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus) obj2);
        return p070h6.A.f22523a;
    }

    public final void invoke(com.revenuecat.purchases.PurchasesError error, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus cacheStatus) {
        kotlin.jvm.internal.m.e(error, "error");
        kotlin.jvm.internal.m.e(cacheStatus, "cacheStatus");
        this.this$0.trackGetOfferingsResultIfNeeded(this.$startTime, cacheStatus, error, null, null);
        p194x6.j jVar = this.$onError;
        if (jVar != null) {
            jVar.invoke(error);
        }
    }
}
