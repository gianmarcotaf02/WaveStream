package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018Bu\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0019Bm\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u001aB/\b\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b*\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b1\u0010)R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b2\u0010)R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b3\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010'\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010)R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010)R\u0014\u0010K\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001a\u0010N\u001a\u00020\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\bM\u0010B\u001a\u0004\bL\u0010)¨\u0006O"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "", "productId", "basePlanId", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/models/Price;", "price", "name", io.ktor.http.LinkHeader.Parameters.Title, "description", "Lcom/revenuecat/purchases/models/Period;", "period", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "defaultOption", "LY2/q;", "productDetails", "presentedOfferingIdentifier", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;LY2/q;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;LY2/q;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;LY2/q;Ljava/lang/String;)V", "otherProduct", "subscriptionOptionsWithOfferingId", "(Lcom/revenuecat/purchases/models/GoogleStoreProduct;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "offeringId", "copyWithOfferingId", "(Ljava/lang/String;)Lcom/revenuecat/purchases/models/StoreProduct;", "copyWithPresentedOfferingContext", "(Lcom/revenuecat/purchases/PresentedOfferingContext;)Lcom/revenuecat/purchases/models/StoreProduct;", "Ljava/util/Locale;", io.sentry.protocol.Device.JsonKeys.LOCALE, "formattedPricePerMonth", "(Ljava/util/Locale;)Ljava/lang/String;", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "getBasePlanId", "Lcom/revenuecat/purchases/ProductType;", "getType", "()Lcom/revenuecat/purchases/ProductType;", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "getName", "getTitle", "getDescription", "Lcom/revenuecat/purchases/models/Period;", "getPeriod", "()Lcom/revenuecat/purchases/models/Period;", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "LY2/q;", "getProductDetails", "()LY2/q;", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getId", "id", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "getSku", "getSku$annotations", com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU, "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GoogleStoreProduct implements com.revenuecat.purchases.models.StoreProduct {
    private final java.lang.String basePlanId;
    private final com.revenuecat.purchases.models.SubscriptionOption defaultOption;
    private final java.lang.String description;
    private final java.lang.String name;
    private final com.revenuecat.purchases.models.Period period;
    private final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
    private final java.lang.String presentedOfferingIdentifier;
    private final com.revenuecat.purchases.models.Price price;
    private final Y2.C1047q productDetails;
    private final java.lang.String productId;
    private final com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions;
    private final java.lang.String title;
    private final com.revenuecat.purchases.ProductType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public GoogleStoreProduct(java.lang.String productId, java.lang.String str, com.revenuecat.purchases.ProductType type, com.revenuecat.purchases.models.Price price, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, Y2.C1047q productDetails) {
        this(productId, str, type, price, name, title, description, period, subscriptionOptions, subscriptionOption, productDetails, null, null, 6144, null);
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(productDetails, "productDetails");
    }

    @p070h6.c
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @p070h6.c
    public static /* synthetic */ void getSku$annotations() {
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    @p070h6.c
    public com.revenuecat.purchases.models.StoreProduct copyWithOfferingId(java.lang.String offeringId) {
        java.lang.String str;
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
        kotlin.jvm.internal.m.e(offeringId, "offeringId");
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext2 = getPresentedOfferingContext();
        if (presentedOfferingContext2 != null) {
            str = offeringId;
            presentedOfferingContext = com.revenuecat.purchases.PresentedOfferingContext.copy$default(presentedOfferingContext2, str, null, null, 6, null);
            if (presentedOfferingContext == null) {
            }
            return copyWithPresentedOfferingContext(presentedOfferingContext);
        }
        str = offeringId;
        presentedOfferingContext = new com.revenuecat.purchases.PresentedOfferingContext(str);
        return copyWithPresentedOfferingContext(presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.StoreProduct copyWithPresentedOfferingContext(com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        java.util.ArrayList arrayList;
        com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            arrayList = new java.util.ArrayList();
            for (com.revenuecat.purchases.models.SubscriptionOption subscriptionOption : subscriptionOptions) {
                com.revenuecat.purchases.models.GoogleSubscriptionOption googleSubscriptionOption = subscriptionOption instanceof com.revenuecat.purchases.models.GoogleSubscriptionOption ? (com.revenuecat.purchases.models.GoogleSubscriptionOption) subscriptionOption : null;
                com.revenuecat.purchases.models.GoogleSubscriptionOption googleSubscriptionOption2 = googleSubscriptionOption != null ? new com.revenuecat.purchases.models.GoogleSubscriptionOption(googleSubscriptionOption, presentedOfferingContext) : null;
                if (googleSubscriptionOption2 != null) {
                    arrayList.add(googleSubscriptionOption2);
                }
            }
        } else {
            arrayList = null;
        }
        com.revenuecat.purchases.models.SubscriptionOption defaultOption = getDefaultOption();
        com.revenuecat.purchases.models.GoogleSubscriptionOption googleSubscriptionOption3 = defaultOption instanceof com.revenuecat.purchases.models.GoogleSubscriptionOption ? (com.revenuecat.purchases.models.GoogleSubscriptionOption) defaultOption : null;
        return new com.revenuecat.purchases.models.GoogleStoreProduct(this, googleSubscriptionOption3 != null ? new com.revenuecat.purchases.models.GoogleSubscriptionOption(googleSubscriptionOption3, presentedOfferingContext) : null, arrayList != null ? new com.revenuecat.purchases.models.SubscriptionOptions(arrayList) : null, presentedOfferingContext);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.models.GoogleStoreProduct)) {
            return false;
        }
        com.revenuecat.purchases.models.GoogleStoreProduct googleStoreProduct = (com.revenuecat.purchases.models.GoogleStoreProduct) obj;
        return kotlin.jvm.internal.m.a(this.productId, googleStoreProduct.productId) && kotlin.jvm.internal.m.a(this.basePlanId, googleStoreProduct.basePlanId) && this.type == googleStoreProduct.type && kotlin.jvm.internal.m.a(this.price, googleStoreProduct.price) && kotlin.jvm.internal.m.a(this.name, googleStoreProduct.name) && kotlin.jvm.internal.m.a(this.title, googleStoreProduct.title) && kotlin.jvm.internal.m.a(this.description, googleStoreProduct.description) && kotlin.jvm.internal.m.a(this.period, googleStoreProduct.period) && kotlin.jvm.internal.m.a(this.subscriptionOptions, googleStoreProduct.subscriptionOptions) && kotlin.jvm.internal.m.a(this.defaultOption, googleStoreProduct.defaultOption) && kotlin.jvm.internal.m.a(this.productDetails, googleStoreProduct.productDetails) && kotlin.jvm.internal.m.a(this.presentedOfferingIdentifier, googleStoreProduct.presentedOfferingIdentifier) && kotlin.jvm.internal.m.a(this.presentedOfferingContext, googleStoreProduct.presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String formattedPricePerMonth(java.util.Locale locale) {
        com.revenuecat.purchases.models.SubscriptionOption basePlan;
        java.util.List<com.revenuecat.purchases.models.PricingPhase> pricingPhases;
        com.revenuecat.purchases.models.PricingPhase pricingPhase;
        kotlin.jvm.internal.m.e(locale, "locale");
        com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions == null || (basePlan = subscriptionOptions.getBasePlan()) == null || (pricingPhases = basePlan.getPricingPhases()) == null || (pricingPhase = (com.revenuecat.purchases.models.PricingPhase) p078i6.o.q1(pricingPhases)) == null) {
            return null;
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public final java.lang.String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getId() {
        if (this.basePlanId != null) {
            java.lang.String str = this.productId + ':' + this.basePlanId;
            if (str != null) {
                return str;
            }
        }
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getName() {
        return this.name;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.Period getPeriod() {
        return this.period;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.Price getPrice() {
        return this.price;
    }

    public final Y2.C1047q getProductDetails() {
        return this.productDetails;
    }

    public final java.lang.String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.PurchasingData getPurchasingData() {
        return (getType() != com.revenuecat.purchases.ProductType.SUBS || getDefaultOption() == null) ? new com.revenuecat.purchases.models.GooglePurchasingData.InAppProduct(getId(), this.productDetails) : getDefaultOption().getPurchasingData();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getSku() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.productId.hashCode() * 31;
        java.lang.String str = this.basePlanId;
        int iA = B2.a.a(B2.a.a(B2.a.a((this.price.hashCode() + ((this.type.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.name), 31, this.title), 31, this.description);
        com.revenuecat.purchases.models.Period period = this.period;
        int iHashCode2 = (iA + (period == null ? 0 : period.hashCode())) * 31;
        com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions = this.subscriptionOptions;
        int iHashCode3 = (iHashCode2 + (subscriptionOptions == null ? 0 : subscriptionOptions.hashCode())) * 31;
        com.revenuecat.purchases.models.SubscriptionOption subscriptionOption = this.defaultOption;
        int iA2 = B2.a.a((iHashCode3 + (subscriptionOption == null ? 0 : subscriptionOption.hashCode())) * 31, 31, this.productDetails.f11502a);
        java.lang.String str2 = this.presentedOfferingIdentifier;
        int iHashCode4 = (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        return iHashCode4 + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GoogleStoreProduct(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", type=" + this.type + ", price=" + this.price + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", productDetails=" + this.productDetails + ", presentedOfferingIdentifier=" + this.presentedOfferingIdentifier + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public GoogleStoreProduct(java.lang.String productId, java.lang.String str, com.revenuecat.purchases.ProductType type, com.revenuecat.purchases.models.Price price, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, Y2.C1047q productDetails, java.lang.String str2) {
        this(productId, str, type, price, name, title, description, period, subscriptionOptions, subscriptionOption, productDetails, str2, null, 4096, null);
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(productDetails, "productDetails");
    }

    @p070h6.c
    public GoogleStoreProduct(java.lang.String productId, java.lang.String str, com.revenuecat.purchases.ProductType type, com.revenuecat.purchases.models.Price price, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, Y2.C1047q productDetails, java.lang.String str2, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(productDetails, "productDetails");
        this.productId = productId;
        this.basePlanId = str;
        this.type = type;
        this.price = price;
        this.name = name;
        this.title = title;
        this.description = description;
        this.period = period;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.productDetails = productDetails;
        this.presentedOfferingIdentifier = str2;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public /* synthetic */ GoogleStoreProduct(java.lang.String str, java.lang.String str2, com.revenuecat.purchases.ProductType productType, com.revenuecat.purchases.models.Price price, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, Y2.C1047q c1047q, java.lang.String str6, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, c1047q, (i3 & 2048) != 0 ? null : str6, (i3 & 4096) != 0 ? null : presentedOfferingContext);
    }

    public /* synthetic */ GoogleStoreProduct(java.lang.String str, java.lang.String str2, com.revenuecat.purchases.ProductType productType, com.revenuecat.purchases.models.Price price, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, Y2.C1047q c1047q, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, c1047q, (i3 & 2048) != 0 ? null : presentedOfferingContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(java.lang.String productId, java.lang.String str, com.revenuecat.purchases.ProductType type, com.revenuecat.purchases.models.Price price, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, Y2.C1047q productDetails, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        this(productId, str, type, price, name, title, description, period, subscriptionOptions, subscriptionOption, productDetails, presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null, presentedOfferingContext);
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(productDetails, "productDetails");
    }

    public /* synthetic */ GoogleStoreProduct(java.lang.String str, java.lang.String str2, com.revenuecat.purchases.ProductType productType, com.revenuecat.purchases.models.Price price, java.lang.String str3, java.lang.String str4, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, Y2.C1047q c1047q, java.lang.String str5, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, productType, price, str3, str4, period, subscriptionOptions, subscriptionOption, c1047q, (i3 & 1024) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public GoogleStoreProduct(java.lang.String productId, java.lang.String str, com.revenuecat.purchases.ProductType type, com.revenuecat.purchases.models.Price price, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, Y2.C1047q productDetails, java.lang.String str2) {
        this(productId, str, type, price, title, title, description, period, subscriptionOptions, subscriptionOption, productDetails, str2 != null ? new com.revenuecat.purchases.PresentedOfferingContext(str2) : null);
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(productDetails, "productDetails");
    }

    private GoogleStoreProduct(com.revenuecat.purchases.models.GoogleStoreProduct googleStoreProduct, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        this(googleStoreProduct.productId, googleStoreProduct.basePlanId, googleStoreProduct.getType(), googleStoreProduct.getPrice(), googleStoreProduct.getName(), googleStoreProduct.getTitle(), googleStoreProduct.getDescription(), googleStoreProduct.getPeriod(), subscriptionOptions, subscriptionOption, googleStoreProduct.productDetails, presentedOfferingContext);
    }
}
