package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ p194x6.j $onError;
    final /* synthetic */ p194x6.j $onSuccess;
    final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue<com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError>> $results;
    final /* synthetic */ java.util.List<com.revenuecat.purchases.common.caching.LocalTransactionMetadata> $transactionMetadataToSync;
    final /* synthetic */ com.revenuecat.purchases.PostReceiptHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1(java.util.concurrent.ConcurrentLinkedQueue<com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError>> concurrentLinkedQueue, com.revenuecat.purchases.PostReceiptHelper postReceiptHelper, java.util.List<com.revenuecat.purchases.common.caching.LocalTransactionMetadata> list, p194x6.j jVar, p194x6.j jVar2) {
        super(1);
        this.$results = concurrentLinkedQueue;
        this.this$0 = postReceiptHelper;
        this.$transactionMetadataToSync = list;
        this.$onError = jVar;
        this.$onSuccess = jVar2;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.revenuecat.purchases.common.networking.PostReceiptResponse) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(com.revenuecat.purchases.common.networking.PostReceiptResponse it) {
        kotlin.jvm.internal.m.e(it, "it");
        this.$results.add(new com.revenuecat.purchases.utils.Result.Success(it.getCustomerInfo()));
        this.this$0.callTransactionMetadataCompletionFromResults(this.$transactionMetadataToSync, this.$results, this.$onError, this.$onSuccess);
    }
}
