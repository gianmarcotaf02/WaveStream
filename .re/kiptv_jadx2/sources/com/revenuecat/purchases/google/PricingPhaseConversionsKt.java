package com.revenuecat.purchases.google;

import Y2.C1045o;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LY2/o;", "Lcom/revenuecat/purchases/models/PricingPhase;", "toRevenueCatPricingPhase", "(LY2/o;)Lcom/revenuecat/purchases/models/PricingPhase;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(C1045o c1045o) {
        m.e(c1045o, "<this>");
        Period.Companion companion = Period.INSTANCE;
        String billingPeriod = c1045o.f11493d;
        m.d(billingPeriod, "billingPeriod");
        Period periodCreate = companion.create(billingPeriod);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(c1045o.f11495f));
        Integer numValueOf = Integer.valueOf(c1045o.f11494e);
        String formattedPrice = c1045o.f11490a;
        m.d(formattedPrice, "formattedPrice");
        String priceCurrencyCode = c1045o.f11492c;
        m.d(priceCurrencyCode, "priceCurrencyCode");
        return new PricingPhase(periodCreate, recurrenceMode, numValueOf, new Price(formattedPrice, c1045o.f11491b, priceCurrencyCode));
    }
}
