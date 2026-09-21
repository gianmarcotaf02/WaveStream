package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchasesList", "Lh6/A;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BillingWrapper$findPurchaseInPurchaseHistory$2$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ p194x6.j $onCompletion;
    final /* synthetic */ p194x6.j $onError;
    final /* synthetic */ java.lang.String $productId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$findPurchaseInPurchaseHistory$2$1(p194x6.j jVar, java.lang.String str, p194x6.j jVar2) {
        super(1);
        this.$onCompletion = jVar;
        this.$productId = str;
        this.$onError = jVar2;
    }

    public final void invoke(java.util.List<com.revenuecat.purchases.models.StoreTransaction> purchasesList) {
        java.lang.Object next;
        kotlin.jvm.internal.m.e(purchasesList, "purchasesList");
        java.lang.String str = this.$productId;
        java.util.Iterator<T> it = purchasesList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.revenuecat.purchases.models.StoreTransaction) next).getProductIds().contains(str));
        com.revenuecat.purchases.models.StoreTransaction storeTransaction = (com.revenuecat.purchases.models.StoreTransaction) next;
        if (storeTransaction != null) {
            this.$onCompletion.invoke(storeTransaction);
            return;
        }
        this.$onError.invoke(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.PurchaseInvalidError, java.lang.String.format(com.revenuecat.purchases.strings.PurchaseStrings.NO_EXISTING_PURCHASE, java.util.Arrays.copyOf(new java.lang.Object[]{this.$productId}, 1))));
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((java.util.List<com.revenuecat.purchases.models.StoreTransaction>) obj);
        return p070h6.A.f22523a;
    }
}
