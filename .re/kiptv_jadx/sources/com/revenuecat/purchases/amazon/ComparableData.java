package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bg\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\u0081\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006<"}, d2 = {"Lcom/revenuecat/purchases/amazon/ComparableData;", "", "amazonStoreProduct", "Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "(Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;)V", "id", "", "type", "Lcom/revenuecat/purchases/ProductType;", io.ktor.http.LinkHeader.Parameters.Title, "description", "period", "Lcom/revenuecat/purchases/models/Period;", "price", "Lcom/revenuecat/purchases/models/Price;", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "defaultOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "iconUrl", "freeTrialPeriod", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDescription", "()Ljava/lang/String;", "getFreeTrialPeriod", "()Lcom/revenuecat/purchases/models/Period;", "getIconUrl", "getId", "getPeriod", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getTitle", "getType", "()Lcom/revenuecat/purchases/ProductType;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class ComparableData {
    private final com.revenuecat.purchases.models.SubscriptionOption defaultOption;
    private final java.lang.String description;
    private final com.revenuecat.purchases.models.Period freeTrialPeriod;
    private final java.lang.String iconUrl;
    private final java.lang.String id;
    private final com.revenuecat.purchases.models.Period period;
    private final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
    private final com.revenuecat.purchases.models.Price price;
    private final com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions;
    private final java.lang.String title;
    private final com.revenuecat.purchases.ProductType type;

    public ComparableData(java.lang.String id, com.revenuecat.purchases.ProductType type, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, java.lang.String iconUrl, com.revenuecat.purchases.models.Period period2, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(iconUrl, "iconUrl");
        this.id = id;
        this.type = type;
        this.title = title;
        this.description = description;
        this.period = period;
        this.price = price;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.iconUrl = iconUrl;
        this.freeTrialPeriod = period2;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public static /* synthetic */ com.revenuecat.purchases.amazon.ComparableData copy$default(com.revenuecat.purchases.amazon.ComparableData comparableData, java.lang.String str, com.revenuecat.purchases.ProductType productType, java.lang.String str2, java.lang.String str3, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, java.lang.String str4, com.revenuecat.purchases.models.Period period2, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = comparableData.id;
        }
        if ((i3 & 2) != 0) {
            productType = comparableData.type;
        }
        if ((i3 & 4) != 0) {
            str2 = comparableData.title;
        }
        if ((i3 & 8) != 0) {
            str3 = comparableData.description;
        }
        if ((i3 & 16) != 0) {
            period = comparableData.period;
        }
        if ((i3 & 32) != 0) {
            price = comparableData.price;
        }
        if ((i3 & 64) != 0) {
            subscriptionOptions = comparableData.subscriptionOptions;
        }
        if ((i3 & 128) != 0) {
            subscriptionOption = comparableData.defaultOption;
        }
        if ((i3 & 256) != 0) {
            str4 = comparableData.iconUrl;
        }
        if ((i3 & 512) != 0) {
            period2 = comparableData.freeTrialPeriod;
        }
        if ((i3 & 1024) != 0) {
            presentedOfferingContext = comparableData.presentedOfferingContext;
        }
        com.revenuecat.purchases.models.Period period3 = period2;
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext2 = presentedOfferingContext;
        com.revenuecat.purchases.models.SubscriptionOption subscriptionOption2 = subscriptionOption;
        java.lang.String str5 = str4;
        com.revenuecat.purchases.models.Price price2 = price;
        com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions2 = subscriptionOptions;
        com.revenuecat.purchases.models.Period period4 = period;
        java.lang.String str6 = str2;
        return comparableData.copy(str, productType, str6, str3, period4, price2, subscriptionOptions2, subscriptionOption2, str5, period3, presentedOfferingContext2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final com.revenuecat.purchases.models.Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.ProductType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final com.revenuecat.purchases.models.Period getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final com.revenuecat.purchases.models.Price getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final com.revenuecat.purchases.models.SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final com.revenuecat.purchases.models.SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final java.lang.String getIconUrl() {
        return this.iconUrl;
    }

    public final com.revenuecat.purchases.amazon.ComparableData copy(java.lang.String id, com.revenuecat.purchases.ProductType type, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption defaultOption, java.lang.String iconUrl, com.revenuecat.purchases.models.Period freeTrialPeriod, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(iconUrl, "iconUrl");
        return new com.revenuecat.purchases.amazon.ComparableData(id, type, title, description, period, price, subscriptionOptions, defaultOption, iconUrl, freeTrialPeriod, presentedOfferingContext);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.amazon.ComparableData)) {
            return false;
        }
        com.revenuecat.purchases.amazon.ComparableData comparableData = (com.revenuecat.purchases.amazon.ComparableData) other;
        return kotlin.jvm.internal.m.a(this.id, comparableData.id) && this.type == comparableData.type && kotlin.jvm.internal.m.a(this.title, comparableData.title) && kotlin.jvm.internal.m.a(this.description, comparableData.description) && kotlin.jvm.internal.m.a(this.period, comparableData.period) && kotlin.jvm.internal.m.a(this.price, comparableData.price) && kotlin.jvm.internal.m.a(this.subscriptionOptions, comparableData.subscriptionOptions) && kotlin.jvm.internal.m.a(this.defaultOption, comparableData.defaultOption) && kotlin.jvm.internal.m.a(this.iconUrl, comparableData.iconUrl) && kotlin.jvm.internal.m.a(this.freeTrialPeriod, comparableData.freeTrialPeriod) && kotlin.jvm.internal.m.a(this.presentedOfferingContext, comparableData.presentedOfferingContext);
    }

    public final com.revenuecat.purchases.models.SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.revenuecat.purchases.models.Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final java.lang.String getIconUrl() {
        return this.iconUrl;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.revenuecat.purchases.models.Period getPeriod() {
        return this.period;
    }

    public final com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final com.revenuecat.purchases.models.Price getPrice() {
        return this.price;
    }

    public final com.revenuecat.purchases.models.SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final com.revenuecat.purchases.ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = B2.a.a(B2.a.a((this.type.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.title), 31, this.description);
        com.revenuecat.purchases.models.Period period = this.period;
        int iHashCode = (this.price.hashCode() + ((iA + (period == null ? 0 : period.hashCode())) * 31)) * 31;
        com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions = this.subscriptionOptions;
        int iHashCode2 = (iHashCode + (subscriptionOptions == null ? 0 : subscriptionOptions.hashCode())) * 31;
        com.revenuecat.purchases.models.SubscriptionOption subscriptionOption = this.defaultOption;
        int iA2 = B2.a.a((iHashCode2 + (subscriptionOption == null ? 0 : subscriptionOption.hashCode())) * 31, 31, this.iconUrl);
        com.revenuecat.purchases.models.Period period2 = this.freeTrialPeriod;
        int iHashCode3 = (iA2 + (period2 == null ? 0 : period2.hashCode())) * 31;
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        return iHashCode3 + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ComparableData(id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", price=" + this.price + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", iconUrl=" + this.iconUrl + ", freeTrialPeriod=" + this.freeTrialPeriod + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparableData(com.revenuecat.purchases.amazon.AmazonStoreProduct amazonStoreProduct) {
        this(amazonStoreProduct.getId(), amazonStoreProduct.getType(), amazonStoreProduct.getTitle(), amazonStoreProduct.getDescription(), amazonStoreProduct.getPeriod(), amazonStoreProduct.getPrice(), amazonStoreProduct.getSubscriptionOptions(), amazonStoreProduct.getDefaultOption(), amazonStoreProduct.getIconUrl(), amazonStoreProduct.getFreeTrialPeriod(), amazonStoreProduct.getPresentedOfferingContext());
        kotlin.jvm.internal.m.e(amazonStoreProduct, "amazonStoreProduct");
    }
}
