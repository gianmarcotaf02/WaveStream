package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoDataResult;", "customerInfoDataResult", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfoDataResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ com.revenuecat.purchases.CacheFetchPolicy $fetchPolicy;
    final /* synthetic */ java.util.Date $startTime;
    final /* synthetic */ boolean $trackDiagnostics;
    final /* synthetic */ com.revenuecat.purchases.CustomerInfoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1(com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper, boolean z6, java.util.Date date, com.revenuecat.purchases.CacheFetchPolicy cacheFetchPolicy, com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(1);
        this.this$0 = customerInfoHelper;
        this.$trackDiagnostics = z6;
        this.$startTime = date;
        this.$fetchPolicy = cacheFetchPolicy;
        this.$callback = receiveCustomerInfoCallback;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.revenuecat.purchases.CustomerInfoDataResult) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(com.revenuecat.purchases.CustomerInfoDataResult customerInfoDataResult) {
        kotlin.jvm.internal.m.e(customerInfoDataResult, "customerInfoDataResult");
        this.this$0.trackGetCustomerInfoResultIfNeeded(this.$trackDiagnostics, this.$startTime, customerInfoDataResult, this.$fetchPolicy);
        com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
        if (receiveCustomerInfoCallback != null) {
            com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError> result = customerInfoDataResult.getResult();
            if (result instanceof com.revenuecat.purchases.utils.Result.Success) {
                receiveCustomerInfoCallback.onReceived((com.revenuecat.purchases.CustomerInfo) ((com.revenuecat.purchases.utils.Result.Success) customerInfoDataResult.getResult()).getValue());
            } else if (result instanceof com.revenuecat.purchases.utils.Result.Error) {
                receiveCustomerInfoCallback.onError((com.revenuecat.purchases.PurchasesError) ((com.revenuecat.purchases.utils.Result.Error) customerInfoDataResult.getResult()).getValue());
            }
        }
    }
}
