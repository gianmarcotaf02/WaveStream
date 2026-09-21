package com.revenuecat.purchases.common.offerings;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class OfferingsFactory$getStoreProductsById$1$1$2 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ p194x6.j $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$getStoreProductsById$1$1$2(p194x6.j jVar) {
        super(1);
        this.$onError = jVar;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.revenuecat.purchases.PurchasesError) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(com.revenuecat.purchases.PurchasesError it) {
        kotlin.jvm.internal.m.e(it, "it");
        this.$onError.invoke(it);
    }
}
