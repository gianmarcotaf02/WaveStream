package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ProductType;", "type", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/ProductType;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BillingWrapper$getStoreTransaction$2$2 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ p194x6.j $completion;
    final /* synthetic */ com.android.billingclient.api.Purchase $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$getStoreTransaction$2$2(p194x6.j jVar, com.android.billingclient.api.Purchase purchase) {
        super(1);
        this.$completion = jVar;
        this.$purchase = purchase;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.revenuecat.purchases.ProductType) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(com.revenuecat.purchases.ProductType type) {
        kotlin.jvm.internal.m.e(type, "type");
        this.$completion.invoke(com.revenuecat.purchases.google.StoreTransactionConversionsKt.toStoreTransaction$default(this.$purchase, type, null, null, null, null, 30, null));
    }
}
