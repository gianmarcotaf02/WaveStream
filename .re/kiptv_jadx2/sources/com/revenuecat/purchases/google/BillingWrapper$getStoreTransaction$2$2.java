package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ProductType;", "type", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/ProductType;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BillingWrapper$getStoreTransaction$2$2 extends o implements j {
    final j $completion;
    final Purchase $purchase;

    public BillingWrapper$getStoreTransaction$2$2(j jVar, Purchase purchase) {
        super(1);
        this.$completion = jVar;
        this.$purchase = purchase;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((ProductType) obj);
        return A.f22523a;
    }

    public final void invoke(ProductType type) {
        m.e(type, "type");
        this.$completion.invoke(StoreTransactionConversionsKt.toStoreTransaction$default(this.$purchase, type, null, null, null, null, 30, null));
    }
}
