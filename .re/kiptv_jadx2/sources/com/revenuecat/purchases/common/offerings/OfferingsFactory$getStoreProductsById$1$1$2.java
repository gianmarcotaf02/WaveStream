package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.PurchasesError;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class OfferingsFactory$getStoreProductsById$1$1$2 extends o implements j {
    final j $onError;

    public OfferingsFactory$getStoreProductsById$1$1$2(j jVar) {
        super(1);
        this.$onError = jVar;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return A.f22523a;
    }

    public final void invoke(PurchasesError it) {
        m.e(it, "it");
        this.$onError.invoke(it);
    }
}
