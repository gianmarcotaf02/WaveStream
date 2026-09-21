package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\f"}, d2 = {"pricePerDay", "Lcom/revenuecat/purchases/models/Price;", "billingPeriod", "Lcom/revenuecat/purchases/models/Period;", io.sentry.protocol.Device.JsonKeys.LOCALE, "Ljava/util/Locale;", "pricePerMonth", "pricePerPeriod", "units", "", "pricePerWeek", "pricePerYear", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PriceExtensionsKt {
    public static final /* synthetic */ com.revenuecat.purchases.models.Price pricePerDay(com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period billingPeriod, java.util.Locale locale) {
        kotlin.jvm.internal.m.e(price, "<this>");
        kotlin.jvm.internal.m.e(billingPeriod, "billingPeriod");
        kotlin.jvm.internal.m.e(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInDays(), locale);
    }

    public static final com.revenuecat.purchases.models.Price pricePerMonth(com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period billingPeriod, java.util.Locale locale) {
        kotlin.jvm.internal.m.e(price, "<this>");
        kotlin.jvm.internal.m.e(billingPeriod, "billingPeriod");
        kotlin.jvm.internal.m.e(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInMonths(), locale);
    }

    private static final com.revenuecat.purchases.models.Price pricePerPeriod(com.revenuecat.purchases.models.Price price, double d4, java.util.Locale locale) {
        return com.revenuecat.purchases.utils.PriceFactory.INSTANCE.createPrice$purchases_defaultsRelease((long) (price.getAmountMicros() / d4), price.getCurrencyCode(), locale);
    }

    public static final com.revenuecat.purchases.models.Price pricePerWeek(com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period billingPeriod, java.util.Locale locale) {
        kotlin.jvm.internal.m.e(price, "<this>");
        kotlin.jvm.internal.m.e(billingPeriod, "billingPeriod");
        kotlin.jvm.internal.m.e(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInWeeks(), locale);
    }

    public static final com.revenuecat.purchases.models.Price pricePerYear(com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period billingPeriod, java.util.Locale locale) {
        kotlin.jvm.internal.m.e(price, "<this>");
        kotlin.jvm.internal.m.e(billingPeriod, "billingPeriod");
        kotlin.jvm.internal.m.e(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInYears(), locale);
    }
}
