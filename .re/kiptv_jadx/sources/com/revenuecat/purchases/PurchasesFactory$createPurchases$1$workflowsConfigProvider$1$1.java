package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesFactory$createPurchases$1$workflowsConfigProvider$1$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.common.offerings.OfferingsCache $offeringsCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesFactory$createPurchases$1$workflowsConfigProvider$1$1(com.revenuecat.purchases.common.offerings.OfferingsCache offeringsCache) {
        super(0);
        this.$offeringsCache = offeringsCache;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        com.revenuecat.purchases.Offering current;
        com.revenuecat.purchases.Offerings cachedOfferings = this.$offeringsCache.getCachedOfferings();
        if (cachedOfferings == null || (current = cachedOfferings.getCurrent()) == null) {
            return null;
        }
        return current.getIdentifier();
    }
}
