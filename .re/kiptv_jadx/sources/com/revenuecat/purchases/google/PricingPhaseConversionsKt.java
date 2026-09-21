package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LY2/o;", "Lcom/revenuecat/purchases/models/PricingPhase;", "toRevenueCatPricingPhase", "(LY2/o;)Lcom/revenuecat/purchases/models/PricingPhase;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PricingPhaseConversionsKt {
    public static final com.revenuecat.purchases.models.PricingPhase toRevenueCatPricingPhase(Y2.C1045o c1045o) {
        kotlin.jvm.internal.m.e(c1045o, "<this>");
        com.revenuecat.purchases.models.Period.Companion companion = com.revenuecat.purchases.models.Period.INSTANCE;
        java.lang.String billingPeriod = c1045o.f11493d;
        kotlin.jvm.internal.m.d(billingPeriod, "billingPeriod");
        com.revenuecat.purchases.models.Period periodCreate = companion.create(billingPeriod);
        com.revenuecat.purchases.models.RecurrenceMode recurrenceMode = com.revenuecat.purchases.models.RecurrenceModeKt.toRecurrenceMode(java.lang.Integer.valueOf(c1045o.f11495f));
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(c1045o.f11494e);
        java.lang.String formattedPrice = c1045o.f11490a;
        kotlin.jvm.internal.m.d(formattedPrice, "formattedPrice");
        java.lang.String priceCurrencyCode = c1045o.f11492c;
        kotlin.jvm.internal.m.d(priceCurrencyCode, "priceCurrencyCode");
        return new com.revenuecat.purchases.models.PricingPhase(periodCreate, recurrenceMode, numValueOf, new com.revenuecat.purchases.models.Price(formattedPrice, c1045o.f11491b, priceCurrencyCode));
    }
}
