package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/SubscriptionInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfo$subscriptionsByProductIdentifier$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfo$subscriptionsByProductIdentifier$2(com.revenuecat.purchases.CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.util.Map<java.lang.String, com.revenuecat.purchases.SubscriptionInfo> invoke() {
        com.revenuecat.purchases.common.CustomerInfoFactory customerInfoFactory = com.revenuecat.purchases.common.CustomerInfoFactory.INSTANCE;
        org.json.JSONObject subscriberJSONObject = this.this$0.subscriberJSONObject;
        kotlin.jvm.internal.m.d(subscriberJSONObject, "subscriberJSONObject");
        return customerInfoFactory.parseSubscriptionInfos(subscriberJSONObject, this.this$0.getRequestDate());
    }
}
