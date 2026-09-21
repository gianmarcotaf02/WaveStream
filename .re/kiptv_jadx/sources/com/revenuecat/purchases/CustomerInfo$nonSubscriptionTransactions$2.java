package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/revenuecat/purchases/models/Transaction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfo$nonSubscriptionTransactions$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$nonSubscriptionTransactions$2(com.revenuecat.purchases.CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.util.List<com.revenuecat.purchases.models.Transaction> invoke() throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONObject jSONObject = this.this$0.subscriberJSONObject.getJSONObject(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS);
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.m.d(itKeys, "nonSubscriptions.keys()");
        while (itKeys.hasNext()) {
            java.lang.String productId = itKeys.next();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(productId);
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                org.json.JSONObject transactionJSONObject = jSONArray.getJSONObject(i3);
                kotlin.jvm.internal.m.d(productId, "productId");
                kotlin.jvm.internal.m.d(transactionJSONObject, "transactionJSONObject");
                arrayList.add(new com.revenuecat.purchases.models.Transaction(productId, transactionJSONObject, null, 4, null));
            }
        }
        return p078i6.o.I1(arrayList, new java.util.Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$nonSubscriptionTransactions$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t10) {
                return com.google.crypto.tink.shaded.protobuf.q0.o(((com.revenuecat.purchases.models.Transaction) t9).getPurchaseDate(), ((com.revenuecat.purchases.models.Transaction) t10).getPurchaseDate());
            }
        });
    }
}
