package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.utils.PriceExtensionsKt;
import io.sentry.protocol.Device;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0013\u0010-\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/models/PricingPhase;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/Period;", "billingPeriod", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "recurrenceMode", "", "billingCycleCount", "Lcom/revenuecat/purchases/models/Price;", "price", "<init>", "(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)V", "Ljava/util/Locale;", Device.JsonKeys.LOCALE, "pricePerDay", "(Ljava/util/Locale;)Lcom/revenuecat/purchases/models/Price;", "pricePerWeek", "pricePerMonth", "pricePerYear", "", "formattedPriceInMonths", "(Ljava/util/Locale;)Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "()Lcom/revenuecat/purchases/models/Period;", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "getRecurrenceMode", "()Lcom/revenuecat/purchases/models/RecurrenceMode;", "Ljava/lang/Integer;", "getBillingCycleCount", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "Lcom/revenuecat/purchases/models/OfferPaymentMode;", "getOfferPaymentMode", "()Lcom/revenuecat/purchases/models/OfferPaymentMode;", "offerPaymentMode", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PricingPhase implements Parcelable {
    public static final Parcelable.Creator<PricingPhase> CREATOR = new Creator();
    private final Integer billingCycleCount;
    private final Period billingPeriod;
    private final Price price;
    private final RecurrenceMode recurrenceMode;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements Parcelable.Creator<PricingPhase> {
        @Override
        public final PricingPhase createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            return new PricingPhase(Period.CREATOR.createFromParcel(parcel), RecurrenceMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), Price.CREATOR.createFromParcel(parcel));
        }

        @Override
        public final PricingPhase[] newArray(int i3) {
            return new PricingPhase[i3];
        }
    }

    public PricingPhase(Period billingPeriod, RecurrenceMode recurrenceMode, Integer num, Price price) {
        m.e(billingPeriod, "billingPeriod");
        m.e(recurrenceMode, "recurrenceMode");
        m.e(price, "price");
        this.billingPeriod = billingPeriod;
        this.recurrenceMode = recurrenceMode;
        this.billingCycleCount = num;
        this.price = price;
    }

    public static String formattedPriceInMonths$default(PricingPhase pricingPhase, Locale locale, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            locale = Locale.getDefault();
            m.d(locale, "getDefault()");
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public static Price pricePerDay$default(PricingPhase pricingPhase, Locale locale, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            locale = Locale.getDefault();
            m.d(locale, "getDefault()");
        }
        return pricingPhase.pricePerDay(locale);
    }

    public static Price pricePerMonth$default(PricingPhase pricingPhase, Locale locale, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            locale = Locale.getDefault();
            m.d(locale, "getDefault()");
        }
        return pricingPhase.pricePerMonth(locale);
    }

    public static Price pricePerWeek$default(PricingPhase pricingPhase, Locale locale, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            locale = Locale.getDefault();
            m.d(locale, "getDefault()");
        }
        return pricingPhase.pricePerWeek(locale);
    }

    public static Price pricePerYear$default(PricingPhase pricingPhase, Locale locale, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            locale = Locale.getDefault();
            m.d(locale, "getDefault()");
        }
        return pricingPhase.pricePerYear(locale);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricingPhase)) {
            return false;
        }
        PricingPhase pricingPhase = (PricingPhase) obj;
        return m.a(this.billingPeriod, pricingPhase.billingPeriod) && this.recurrenceMode == pricingPhase.recurrenceMode && m.a(this.billingCycleCount, pricingPhase.billingCycleCount) && m.a(this.price, pricingPhase.price);
    }

    @c
    public final String formattedPriceInMonths() {
        return formattedPriceInMonths$default(this, null, 1, null);
    }

    public final Integer getBillingCycleCount() {
        return this.billingCycleCount;
    }

    public final Period getBillingPeriod() {
        return this.billingPeriod;
    }

    public final OfferPaymentMode getOfferPaymentMode() {
        if (this.recurrenceMode != RecurrenceMode.FINITE_RECURRING) {
            return null;
        }
        if (this.price.getAmountMicros() == 0) {
            return OfferPaymentMode.FREE_TRIAL;
        }
        Integer num = this.billingCycleCount;
        if (num != null && num.intValue() == 1) {
            return OfferPaymentMode.SINGLE_PAYMENT;
        }
        Integer num2 = this.billingCycleCount;
        if (num2 == null || num2.intValue() <= 1) {
            return null;
        }
        return OfferPaymentMode.DISCOUNTED_RECURRING_PAYMENT;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final RecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public int hashCode() {
        int iHashCode = (this.recurrenceMode.hashCode() + (this.billingPeriod.hashCode() * 31)) * 31;
        Integer num = this.billingCycleCount;
        return this.price.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final Price pricePerDay() {
        return pricePerDay$default(this, null, 1, null);
    }

    public final Price pricePerMonth() {
        return pricePerMonth$default(this, null, 1, null);
    }

    public final Price pricePerWeek() {
        return pricePerWeek$default(this, null, 1, null);
    }

    public final Price pricePerYear() {
        return pricePerYear$default(this, null, 1, null);
    }

    public String toString() {
        return "PricingPhase(billingPeriod=" + this.billingPeriod + ", recurrenceMode=" + this.recurrenceMode + ", billingCycleCount=" + this.billingCycleCount + ", price=" + this.price + ')';
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        int iIntValue;
        m.e(parcel, "out");
        this.billingPeriod.writeToParcel(parcel, flags);
        parcel.writeString(this.recurrenceMode.name());
        Integer num = this.billingCycleCount;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        this.price.writeToParcel(parcel, flags);
    }

    @c
    public final String formattedPriceInMonths(Locale locale) {
        m.e(locale, "locale");
        return pricePerMonth(locale).getFormatted();
    }

    public final Price pricePerDay(Locale locale) {
        m.e(locale, "locale");
        return PriceExtensionsKt.pricePerDay(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerMonth(Locale locale) {
        m.e(locale, "locale");
        return PriceExtensionsKt.pricePerMonth(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerWeek(Locale locale) {
        m.e(locale, "locale");
        return PriceExtensionsKt.pricePerWeek(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerYear(Locale locale) {
        m.e(locale, "locale");
        return PriceExtensionsKt.pricePerYear(this.price, this.billingPeriod, locale);
    }
}
