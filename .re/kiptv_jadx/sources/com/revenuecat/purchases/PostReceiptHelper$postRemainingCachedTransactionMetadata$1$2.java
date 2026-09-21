package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "<anonymous parameter 1>", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2 extends kotlin.jvm.internal.o implements p194x6.n {
    final /* synthetic */ p194x6.j $onError;
    final /* synthetic */ p194x6.j $onSuccess;
    final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue<com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError>> $results;
    final /* synthetic */ java.util.List<com.revenuecat.purchases.common.caching.LocalTransactionMetadata> $transactionMetadataToSync;
    final /* synthetic */ com.revenuecat.purchases.PostReceiptHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2(java.util.concurrent.ConcurrentLinkedQueue<com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError>> concurrentLinkedQueue, com.revenuecat.purchases.PostReceiptHelper postReceiptHelper, java.util.List<com.revenuecat.purchases.common.caching.LocalTransactionMetadata> list, p194x6.j jVar, p194x6.j jVar2) {
        super(3);
        this.$results = concurrentLinkedQueue;
        this.this$0 = postReceiptHelper;
        this.$transactionMetadataToSync = list;
        this.$onError = jVar;
        this.$onSuccess = jVar2;
    }

    @Override // p194x6.n
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        invoke((com.revenuecat.purchases.PurchasesError) obj, (com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior) obj2, (org.json.JSONObject) obj3);
        return p070h6.A.f22523a;
    }

    public final void invoke(com.revenuecat.purchases.PurchasesError backendError, com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.m.e(backendError, "backendError");
        kotlin.jvm.internal.m.e(postReceiptErrorHandlingBehavior, "<anonymous parameter 1>");
        this.$results.add(new com.revenuecat.purchases.utils.Result.Error(backendError));
        this.this$0.callTransactionMetadataCompletionFromResults(this.$transactionMetadataToSync, this.$results, this.$onError, this.$onSuccess);
    }
}
