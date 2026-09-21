package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfo$allPurchasedProductIds$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$allPurchasedProductIds$2(com.revenuecat.purchases.CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.util.Set<java.lang.String> invoke() {
        java.util.List<com.revenuecat.purchases.models.Transaction> nonSubscriptionTransactions = this.this$0.getNonSubscriptionTransactions();
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(nonSubscriptionTransactions, 10));
        java.util.Iterator<T> it = nonSubscriptionTransactions.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.revenuecat.purchases.models.Transaction) it.next()).getProductIdentifier());
        }
        return p078i6.I.o0(p078i6.o.R1(arrayList), this.this$0.getAllExpirationDatesByProduct().keySet());
    }
}
