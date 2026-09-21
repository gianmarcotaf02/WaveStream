package com.revenuecat.purchases.utils;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.models.Price;
import io.sentry.protocol.Device;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/utils/PriceFactory;", "", "()V", "createPrice", "Lcom/revenuecat/purchases/models/Price;", "amountMicros", "", "currencyCode", "", Device.JsonKeys.LOCALE, "Ljava/util/Locale;", "createPrice$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PriceFactory {
    public static final PriceFactory INSTANCE = new PriceFactory();

    private PriceFactory() {
    }

    public final Price createPrice$purchases_defaultsRelease(long amountMicros, String currencyCode, Locale locale) {
        m.e(currencyCode, "currencyCode");
        m.e(locale, "locale");
        Currency currency = Currency.getInstance(currencyCode);
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        if (defaultFractionDigits < 0) {
            defaultFractionDigits = 0;
        }
        double dRoundToDecimalPlaces = DoubleExtensionsKt.roundToDecimalPlaces(amountMicros / 1000000.0d, defaultFractionDigits);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
        currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
        String formatted = currencyInstance.format(dRoundToDecimalPlaces);
        m.d(formatted, "formatted");
        return new Price(formatted, amountMicros, currencyCode);
    }
}
