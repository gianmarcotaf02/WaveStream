package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PostTransactionWithProductDetailsHelper$postTransactions$1$2 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ java.lang.String $appUserID;
    final /* synthetic */ com.revenuecat.purchases.PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ boolean $sdkOriginated;
    final /* synthetic */ com.revenuecat.purchases.models.StoreTransaction $transaction;
    final /* synthetic */ p194x6.m $transactionPostError;
    final /* synthetic */ p194x6.m $transactionPostSuccess;
    final /* synthetic */ com.revenuecat.purchases.PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTransactionWithProductDetailsHelper$postTransactions$1$2(com.revenuecat.purchases.PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, com.revenuecat.purchases.models.StoreTransaction storeTransaction, boolean z6, java.lang.String str, com.revenuecat.purchases.PostReceiptInitiationSource postReceiptInitiationSource, boolean z9, p194x6.m mVar, p194x6.m mVar2) {
        super(1);
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$transaction = storeTransaction;
        this.$allowSharingPlayStoreAccount = z6;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$sdkOriginated = z9;
        this.$transactionPostSuccess = mVar;
        this.$transactionPostError = mVar2;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.revenuecat.purchases.PurchasesError) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(com.revenuecat.purchases.PurchasesError it) {
        kotlin.jvm.internal.m.e(it, "it");
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, null, null, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$sdkOriginated, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
