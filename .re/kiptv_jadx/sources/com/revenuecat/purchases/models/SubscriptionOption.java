package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0#X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%¨\u0006,À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "billingPeriod", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "()Lcom/revenuecat/purchases/models/Period;", "freePhase", "Lcom/revenuecat/purchases/models/PricingPhase;", "getFreePhase", "()Lcom/revenuecat/purchases/models/PricingPhase;", "fullPricePhase", "getFullPricePhase", "id", "", "getId", "()Ljava/lang/String;", "installmentsInfo", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "getInstallmentsInfo", "()Lcom/revenuecat/purchases/models/InstallmentsInfo;", "introPhase", "getIntroPhase", "isBasePlan", "", "()Z", "isPrepaid", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "getPresentedOfferingIdentifier", "pricingPhases", "", "getPricingPhases", "()Ljava/util/List;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "tags", "getTags", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SubscriptionOption {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.revenuecat.purchases.models.Period getBillingPeriod(com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
            return com.revenuecat.purchases.models.SubscriptionOption.super.getBillingPeriod();
        }

        @java.lang.Deprecated
        public static com.revenuecat.purchases.models.PricingPhase getFreePhase(com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
            return com.revenuecat.purchases.models.SubscriptionOption.super.getFreePhase();
        }

        @java.lang.Deprecated
        public static com.revenuecat.purchases.models.PricingPhase getFullPricePhase(com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
            return com.revenuecat.purchases.models.SubscriptionOption.super.getFullPricePhase();
        }

        @java.lang.Deprecated
        public static com.revenuecat.purchases.models.PricingPhase getIntroPhase(com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
            return com.revenuecat.purchases.models.SubscriptionOption.super.getIntroPhase();
        }

        @p070h6.c
        public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
        }

        @java.lang.Deprecated
        public static boolean isBasePlan(com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
            return com.revenuecat.purchases.models.SubscriptionOption.super.isBasePlan();
        }

        @java.lang.Deprecated
        public static boolean isPrepaid(com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
            return com.revenuecat.purchases.models.SubscriptionOption.super.isPrepaid();
        }
    }

    default com.revenuecat.purchases.models.Period getBillingPeriod() {
        com.revenuecat.purchases.models.PricingPhase fullPricePhase = getFullPricePhase();
        if (fullPricePhase != null) {
            return fullPricePhase.getBillingPeriod();
        }
        return null;
    }

    default com.revenuecat.purchases.models.PricingPhase getFreePhase() {
        java.lang.Object next;
        java.util.Iterator it = p078i6.o.e1(getPricingPhases()).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((com.revenuecat.purchases.models.PricingPhase) next).getPrice().getAmountMicros() == 0) {
                return (com.revenuecat.purchases.models.PricingPhase) next;
            }
        }
        next = null;
        return (com.revenuecat.purchases.models.PricingPhase) next;
    }

    default com.revenuecat.purchases.models.PricingPhase getFullPricePhase() {
        return (com.revenuecat.purchases.models.PricingPhase) p078i6.o.s1(getPricingPhases());
    }

    java.lang.String getId();

    com.revenuecat.purchases.models.InstallmentsInfo getInstallmentsInfo();

    default com.revenuecat.purchases.models.PricingPhase getIntroPhase() {
        java.lang.Object next;
        java.util.Iterator it = p078i6.o.e1(getPricingPhases()).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((com.revenuecat.purchases.models.PricingPhase) next).getPrice().getAmountMicros() > 0) {
                return (com.revenuecat.purchases.models.PricingPhase) next;
            }
        }
        next = null;
        return (com.revenuecat.purchases.models.PricingPhase) next;
    }

    com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext();

    java.lang.String getPresentedOfferingIdentifier();

    java.util.List<com.revenuecat.purchases.models.PricingPhase> getPricingPhases();

    com.revenuecat.purchases.models.PurchasingData getPurchasingData();

    java.util.List<java.lang.String> getTags();

    default boolean isBasePlan() {
        return getPricingPhases().size() == 1;
    }

    default boolean isPrepaid() {
        com.revenuecat.purchases.models.PricingPhase fullPricePhase = getFullPricePhase();
        return (fullPricePhase != null ? fullPricePhase.getRecurrenceMode() : null) == com.revenuecat.purchases.models.RecurrenceMode.NON_RECURRING;
    }
}
