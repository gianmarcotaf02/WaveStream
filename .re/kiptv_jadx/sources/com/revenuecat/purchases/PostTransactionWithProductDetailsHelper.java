package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0083\u0001\u0010\u001a\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\"\b\u0002\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u00152\"\b\u0002\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", io.sentry.ProfilingTraceData.JsonKeys.TRANSACTION_LIST, "", "allowSharingPlayStoreAccount", "", "appUserID", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "sdkOriginated", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lh6/A;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "transactionPostSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "transactionPostError", "postTransactions", "(Ljava/util/List;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;ZLx6/m;Lx6/m;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostTransactionWithProductDetailsHelper {
    private final com.revenuecat.purchases.common.BillingAbstract billing;
    private final com.revenuecat.purchases.PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(com.revenuecat.purchases.common.BillingAbstract billing, com.revenuecat.purchases.PostReceiptHelper postReceiptHelper) {
        kotlin.jvm.internal.m.e(billing, "billing");
        kotlin.jvm.internal.m.e(postReceiptHelper, "postReceiptHelper");
        this.billing = billing;
        this.postReceiptHelper = postReceiptHelper;
    }

    public static /* synthetic */ void postTransactions$default(com.revenuecat.purchases.PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, java.util.List list, boolean z6, java.lang.String str, com.revenuecat.purchases.PostReceiptInitiationSource postReceiptInitiationSource, boolean z9, p194x6.m mVar, p194x6.m mVar2, int i3, java.lang.Object obj) {
        if ((i3 & 32) != 0) {
            mVar = null;
        }
        if ((i3 & 64) != 0) {
            mVar2 = null;
        }
        postTransactionWithProductDetailsHelper.postTransactions(list, z6, str, postReceiptInitiationSource, z9, mVar, mVar2);
    }

    public final void postTransactions(java.util.List<com.revenuecat.purchases.models.StoreTransaction> transactions, boolean allowSharingPlayStoreAccount, java.lang.String appUserID, com.revenuecat.purchases.PostReceiptInitiationSource initiationSource, boolean sdkOriginated, p194x6.m transactionPostSuccess, p194x6.m transactionPostError) {
        kotlin.jvm.internal.m.e(transactions, "transactions");
        java.lang.String appUserID2 = appUserID;
        kotlin.jvm.internal.m.e(appUserID2, "appUserID");
        com.revenuecat.purchases.PostReceiptInitiationSource initiationSource2 = initiationSource;
        kotlin.jvm.internal.m.e(initiationSource2, "initiationSource");
        for (com.revenuecat.purchases.models.StoreTransaction storeTransaction : transactions) {
            com.revenuecat.purchases.common.BillingAbstract billingAbstract = this.billing;
            com.revenuecat.purchases.ProductType type = storeTransaction.getType();
            java.util.Set<java.lang.String> setR1 = p078i6.o.R1(storeTransaction.getProductIds());
            com.revenuecat.purchases.PostTransactionWithProductDetailsHelper$postTransactions$1$1 postTransactionWithProductDetailsHelper$postTransactions$1$1 = new com.revenuecat.purchases.PostTransactionWithProductDetailsHelper$postTransactions$1$1(storeTransaction, this, allowSharingPlayStoreAccount, appUserID2, initiationSource2, sdkOriginated, transactionPostSuccess, transactionPostError);
            appUserID2 = appUserID;
            initiationSource2 = initiationSource;
            billingAbstract.queryProductDetailsAsync(type, setR1, postTransactionWithProductDetailsHelper$postTransactions$1$1, new com.revenuecat.purchases.PostTransactionWithProductDetailsHelper$postTransactions$1$2(this, storeTransaction, allowSharingPlayStoreAccount, appUserID2, initiationSource2, sdkOriginated, transactionPostSuccess, transactionPostError));
        }
    }
}
