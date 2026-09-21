package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0007H'J\u0012\u00101\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0014\u00102\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00103\u001a\u000204H\u0016J\u0014\u00105\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u00103\u001a\u000204H\u0016J\u0014\u00106\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u00103\u001a\u000204H\u0016J\u0014\u00107\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u00103\u001a\u000204H\u0016J\u0014\u00108\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u00103\u001a\u000204H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\tR\u0014\u0010%\u001a\u0004\u0018\u00010&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0012\u0010)\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\tR\u0012\u0010+\u001a\u00020,X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00069À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/models/StoreProduct;", "", "defaultOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "description", "", "getDescription", "()Ljava/lang/String;", "id", "getId", "name", "getName", "period", "Lcom/revenuecat/purchases/models/Period;", "getPeriod", "()Lcom/revenuecat/purchases/models/Period;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "getPresentedOfferingIdentifier", "price", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU, "getSku$annotations", "getSku", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", io.ktor.http.LinkHeader.Parameters.Title, "getTitle", "type", "Lcom/revenuecat/purchases/ProductType;", "getType", "()Lcom/revenuecat/purchases/ProductType;", "copyWithOfferingId", "offeringId", "copyWithPresentedOfferingContext", "formattedPricePerMonth", io.sentry.protocol.Device.JsonKeys.LOCALE, "Ljava/util/Locale;", "pricePerDay", "pricePerMonth", "pricePerWeek", "pricePerYear", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface StoreProduct {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.String formattedPricePerMonth(com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Locale locale) {
            kotlin.jvm.internal.m.e(locale, "locale");
            return com.revenuecat.purchases.models.StoreProduct.super.formattedPricePerMonth(locale);
        }

        @p070h6.c
        public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
        }

        @p070h6.c
        public static /* synthetic */ void getSku$annotations() {
        }

        @java.lang.Deprecated
        public static com.revenuecat.purchases.models.Price pricePerDay(com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Locale locale) {
            kotlin.jvm.internal.m.e(locale, "locale");
            return com.revenuecat.purchases.models.StoreProduct.super.pricePerDay(locale);
        }

        @java.lang.Deprecated
        public static com.revenuecat.purchases.models.Price pricePerMonth(com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Locale locale) {
            kotlin.jvm.internal.m.e(locale, "locale");
            return com.revenuecat.purchases.models.StoreProduct.super.pricePerMonth(locale);
        }

        @java.lang.Deprecated
        public static com.revenuecat.purchases.models.Price pricePerWeek(com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Locale locale) {
            kotlin.jvm.internal.m.e(locale, "locale");
            return com.revenuecat.purchases.models.StoreProduct.super.pricePerWeek(locale);
        }

        @java.lang.Deprecated
        public static com.revenuecat.purchases.models.Price pricePerYear(com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Locale locale) {
            kotlin.jvm.internal.m.e(locale, "locale");
            return com.revenuecat.purchases.models.StoreProduct.super.pricePerYear(locale);
        }
    }

    static /* synthetic */ java.lang.String formattedPricePerMonth$default(com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Locale locale, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formattedPricePerMonth");
        }
        if ((i3 & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        return storeProduct.formattedPricePerMonth(locale);
    }

    static /* synthetic */ com.revenuecat.purchases.models.Price pricePerDay$default(com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Locale locale, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerDay");
        }
        if ((i3 & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        return storeProduct.pricePerDay(locale);
    }

    static /* synthetic */ com.revenuecat.purchases.models.Price pricePerMonth$default(com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Locale locale, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerMonth");
        }
        if ((i3 & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        return storeProduct.pricePerMonth(locale);
    }

    static /* synthetic */ com.revenuecat.purchases.models.Price pricePerWeek$default(com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Locale locale, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerWeek");
        }
        if ((i3 & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        return storeProduct.pricePerWeek(locale);
    }

    static /* synthetic */ com.revenuecat.purchases.models.Price pricePerYear$default(com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Locale locale, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerYear");
        }
        if ((i3 & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        return storeProduct.pricePerYear(locale);
    }

    @p070h6.c
    com.revenuecat.purchases.models.StoreProduct copyWithOfferingId(java.lang.String offeringId);

    com.revenuecat.purchases.models.StoreProduct copyWithPresentedOfferingContext(com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext);

    default java.lang.String formattedPricePerMonth(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        com.revenuecat.purchases.models.Price pricePricePerMonth = pricePerMonth(locale);
        if (pricePricePerMonth != null) {
            return pricePricePerMonth.getFormatted();
        }
        return null;
    }

    com.revenuecat.purchases.models.SubscriptionOption getDefaultOption();

    java.lang.String getDescription();

    java.lang.String getId();

    java.lang.String getName();

    com.revenuecat.purchases.models.Period getPeriod();

    com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext();

    java.lang.String getPresentedOfferingIdentifier();

    com.revenuecat.purchases.models.Price getPrice();

    com.revenuecat.purchases.models.PurchasingData getPurchasingData();

    java.lang.String getSku();

    com.revenuecat.purchases.models.SubscriptionOptions getSubscriptionOptions();

    java.lang.String getTitle();

    com.revenuecat.purchases.ProductType getType();

    default com.revenuecat.purchases.models.Price pricePerDay(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        com.revenuecat.purchases.models.Period period = getPeriod();
        if (period != null) {
            return com.revenuecat.purchases.utils.PriceExtensionsKt.pricePerDay(getPrice(), period, locale);
        }
        return null;
    }

    default com.revenuecat.purchases.models.Price pricePerMonth(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        com.revenuecat.purchases.models.Period period = getPeriod();
        if (period != null) {
            return com.revenuecat.purchases.utils.PriceExtensionsKt.pricePerMonth(getPrice(), period, locale);
        }
        return null;
    }

    default com.revenuecat.purchases.models.Price pricePerWeek(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        com.revenuecat.purchases.models.Period period = getPeriod();
        if (period != null) {
            return com.revenuecat.purchases.utils.PriceExtensionsKt.pricePerWeek(getPrice(), period, locale);
        }
        return null;
    }

    default com.revenuecat.purchases.models.Price pricePerYear(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        com.revenuecat.purchases.models.Period period = getPeriod();
        if (period != null) {
            return com.revenuecat.purchases.utils.PriceExtensionsKt.pricePerYear(getPrice(), period, locale);
        }
        return null;
    }
}
