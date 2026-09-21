package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0013\u0010-\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/models/PricingPhase;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/Period;", "billingPeriod", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "recurrenceMode", "", "billingCycleCount", "Lcom/revenuecat/purchases/models/Price;", "price", "<init>", "(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)V", "Ljava/util/Locale;", io.sentry.protocol.Device.JsonKeys.LOCALE, "pricePerDay", "(Ljava/util/Locale;)Lcom/revenuecat/purchases/models/Price;", "pricePerWeek", "pricePerMonth", "pricePerYear", "", "formattedPriceInMonths", "(Ljava/util/Locale;)Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "()Lcom/revenuecat/purchases/models/Period;", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "getRecurrenceMode", "()Lcom/revenuecat/purchases/models/RecurrenceMode;", "Ljava/lang/Integer;", "getBillingCycleCount", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "Lcom/revenuecat/purchases/models/OfferPaymentMode;", "getOfferPaymentMode", "()Lcom/revenuecat/purchases/models/OfferPaymentMode;", "offerPaymentMode", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PricingPhase implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.models.PricingPhase> CREATOR = new com.revenuecat.purchases.models.PricingPhase.Creator();
    private final java.lang.Integer billingCycleCount;
    private final com.revenuecat.purchases.models.Period billingPeriod;
    private final com.revenuecat.purchases.models.Price price;
    private final com.revenuecat.purchases.models.RecurrenceMode recurrenceMode;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.models.PricingPhase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.models.PricingPhase createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            return new com.revenuecat.purchases.models.PricingPhase(com.revenuecat.purchases.models.Period.CREATOR.createFromParcel(parcel), com.revenuecat.purchases.models.RecurrenceMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : java.lang.Integer.valueOf(parcel.readInt()), com.revenuecat.purchases.models.Price.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.models.PricingPhase[] newArray(int i3) {
            return new com.revenuecat.purchases.models.PricingPhase[i3];
        }
    }

    public PricingPhase(com.revenuecat.purchases.models.Period billingPeriod, com.revenuecat.purchases.models.RecurrenceMode recurrenceMode, java.lang.Integer num, com.revenuecat.purchases.models.Price price) {
        kotlin.jvm.internal.m.e(billingPeriod, "billingPeriod");
        kotlin.jvm.internal.m.e(recurrenceMode, "recurrenceMode");
        kotlin.jvm.internal.m.e(price, "price");
        this.billingPeriod = billingPeriod;
        this.recurrenceMode = recurrenceMode;
        this.billingCycleCount = num;
        this.price = price;
    }

    public static /* synthetic */ java.lang.String formattedPriceInMonths$default(com.revenuecat.purchases.models.PricingPhase pricingPhase, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public static /* synthetic */ com.revenuecat.purchases.models.Price pricePerDay$default(com.revenuecat.purchases.models.PricingPhase pricingPhase, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        return pricingPhase.pricePerDay(locale);
    }

    public static /* synthetic */ com.revenuecat.purchases.models.Price pricePerMonth$default(com.revenuecat.purchases.models.PricingPhase pricingPhase, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        return pricingPhase.pricePerMonth(locale);
    }

    public static /* synthetic */ com.revenuecat.purchases.models.Price pricePerWeek$default(com.revenuecat.purchases.models.PricingPhase pricingPhase, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        return pricingPhase.pricePerWeek(locale);
    }

    public static /* synthetic */ com.revenuecat.purchases.models.Price pricePerYear$default(com.revenuecat.purchases.models.PricingPhase pricingPhase, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        return pricingPhase.pricePerYear(locale);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.models.PricingPhase)) {
            return false;
        }
        com.revenuecat.purchases.models.PricingPhase pricingPhase = (com.revenuecat.purchases.models.PricingPhase) obj;
        return kotlin.jvm.internal.m.a(this.billingPeriod, pricingPhase.billingPeriod) && this.recurrenceMode == pricingPhase.recurrenceMode && kotlin.jvm.internal.m.a(this.billingCycleCount, pricingPhase.billingCycleCount) && kotlin.jvm.internal.m.a(this.price, pricingPhase.price);
    }

    @p070h6.c
    public final java.lang.String formattedPriceInMonths() {
        return formattedPriceInMonths$default(this, null, 1, null);
    }

    public final java.lang.Integer getBillingCycleCount() {
        return this.billingCycleCount;
    }

    public final com.revenuecat.purchases.models.Period getBillingPeriod() {
        return this.billingPeriod;
    }

    public final com.revenuecat.purchases.models.OfferPaymentMode getOfferPaymentMode() {
        if (this.recurrenceMode != com.revenuecat.purchases.models.RecurrenceMode.FINITE_RECURRING) {
            return null;
        }
        if (this.price.getAmountMicros() == 0) {
            return com.revenuecat.purchases.models.OfferPaymentMode.FREE_TRIAL;
        }
        java.lang.Integer num = this.billingCycleCount;
        if (num != null && num.intValue() == 1) {
            return com.revenuecat.purchases.models.OfferPaymentMode.SINGLE_PAYMENT;
        }
        java.lang.Integer num2 = this.billingCycleCount;
        if (num2 == null || num2.intValue() <= 1) {
            return null;
        }
        return com.revenuecat.purchases.models.OfferPaymentMode.DISCOUNTED_RECURRING_PAYMENT;
    }

    public final com.revenuecat.purchases.models.Price getPrice() {
        return this.price;
    }

    public final com.revenuecat.purchases.models.RecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public int hashCode() {
        int iHashCode = (this.recurrenceMode.hashCode() + (this.billingPeriod.hashCode() * 31)) * 31;
        java.lang.Integer num = this.billingCycleCount;
        return this.price.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final com.revenuecat.purchases.models.Price pricePerDay() {
        return pricePerDay$default(this, null, 1, null);
    }

    public final com.revenuecat.purchases.models.Price pricePerMonth() {
        return pricePerMonth$default(this, null, 1, null);
    }

    public final com.revenuecat.purchases.models.Price pricePerWeek() {
        return pricePerWeek$default(this, null, 1, null);
    }

    public final com.revenuecat.purchases.models.Price pricePerYear() {
        return pricePerYear$default(this, null, 1, null);
    }

    public java.lang.String toString() {
        return "PricingPhase(billingPeriod=" + this.billingPeriod + ", recurrenceMode=" + this.recurrenceMode + ", billingCycleCount=" + this.billingCycleCount + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        int iIntValue;
        kotlin.jvm.internal.m.e(parcel, "out");
        this.billingPeriod.writeToParcel(parcel, flags);
        parcel.writeString(this.recurrenceMode.name());
        java.lang.Integer num = this.billingCycleCount;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        this.price.writeToParcel(parcel, flags);
    }

    @p070h6.c
    public final java.lang.String formattedPriceInMonths(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        return pricePerMonth(locale).getFormatted();
    }

    public final com.revenuecat.purchases.models.Price pricePerDay(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        return com.revenuecat.purchases.utils.PriceExtensionsKt.pricePerDay(this.price, this.billingPeriod, locale);
    }

    public final com.revenuecat.purchases.models.Price pricePerMonth(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        return com.revenuecat.purchases.utils.PriceExtensionsKt.pricePerMonth(this.price, this.billingPeriod, locale);
    }

    public final com.revenuecat.purchases.models.Price pricePerWeek(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        return com.revenuecat.purchases.utils.PriceExtensionsKt.pricePerWeek(this.price, this.billingPeriod, locale);
    }

    public final com.revenuecat.purchases.models.Price pricePerYear(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        return com.revenuecat.purchases.utils.PriceExtensionsKt.pricePerYear(this.price, this.billingPeriod, locale);
    }
}
