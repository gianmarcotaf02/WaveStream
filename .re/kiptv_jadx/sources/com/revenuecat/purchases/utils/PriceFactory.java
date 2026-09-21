package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/utils/PriceFactory;", "", "()V", "createPrice", "Lcom/revenuecat/purchases/models/Price;", "amountMicros", "", "currencyCode", "", io.sentry.protocol.Device.JsonKeys.LOCALE, "Ljava/util/Locale;", "createPrice$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PriceFactory {
    public static final com.revenuecat.purchases.utils.PriceFactory INSTANCE = new com.revenuecat.purchases.utils.PriceFactory();

    private PriceFactory() {
    }

    public final com.revenuecat.purchases.models.Price createPrice$purchases_defaultsRelease(long amountMicros, java.lang.String currencyCode, java.util.Locale locale) {
        kotlin.jvm.internal.m.e(currencyCode, "currencyCode");
        kotlin.jvm.internal.m.e(locale, "locale");
        java.util.Currency currency = java.util.Currency.getInstance(currencyCode);
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        if (defaultFractionDigits < 0) {
            defaultFractionDigits = 0;
        }
        double dRoundToDecimalPlaces = com.revenuecat.purchases.utils.DoubleExtensionsKt.roundToDecimalPlaces(amountMicros / 1000000.0d, defaultFractionDigits);
        java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
        currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
        java.lang.String formatted = currencyInstance.format(dRoundToDecimalPlaces);
        kotlin.jvm.internal.m.d(formatted, "formatted");
        return new com.revenuecat.purchases.models.Price(formatted, amountMicros, currencyCode);
    }
}
