package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012BW\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0014B\u001b\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R\u001a\u00102\u001a\u00020.8VX\u0096\u0004¢\u0006\f\u0012\u0004\b1\u0010,\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0019¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "productId", "basePlanId", "offerId", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "pricingPhases", "tags", "LY2/q;", "productDetails", "offerToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "installmentsInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LY2/q;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;)V", "presentedOfferingId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LY2/q;Ljava/lang/String;Ljava/lang/String;)V", "subscriptionOption", "(Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "getBasePlanId", "getOfferId", "Ljava/util/List;", "getPricingPhases", "()Ljava/util/List;", "getTags", "LY2/q;", "getProductDetails", "()LY2/q;", "getOfferToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getInstallmentsInfo", "()Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "presentedOfferingIdentifier", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData$annotations", "purchasingData", "getPrimaryPricingPhase", "()Lcom/revenuecat/purchases/models/PricingPhase;", "primaryPricingPhase", "getId", "id", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GoogleSubscriptionOption implements com.revenuecat.purchases.models.SubscriptionOption {
    private final java.lang.String basePlanId;
    private final com.revenuecat.purchases.models.GoogleInstallmentsInfo installmentsInfo;
    private final java.lang.String offerId;
    private final java.lang.String offerToken;
    private final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
    private final java.util.List<com.revenuecat.purchases.models.PricingPhase> pricingPhases;
    private final Y2.C1047q productDetails;
    private final java.lang.String productId;
    private final java.util.List<java.lang.String> tags;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(java.lang.String productId, java.lang.String basePlanId, java.lang.String str, java.util.List<com.revenuecat.purchases.models.PricingPhase> pricingPhases, java.util.List<java.lang.String> tags, Y2.C1047q productDetails, java.lang.String offerToken) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, null, null, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, null);
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(basePlanId, "basePlanId");
        kotlin.jvm.internal.m.e(pricingPhases, "pricingPhases");
        kotlin.jvm.internal.m.e(tags, "tags");
        kotlin.jvm.internal.m.e(productDetails, "productDetails");
        kotlin.jvm.internal.m.e(offerToken, "offerToken");
    }

    @p070h6.c
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    private final com.revenuecat.purchases.models.PricingPhase getPrimaryPricingPhase() {
        java.lang.Object next;
        java.util.Iterator<T> it = getPricingPhases().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.revenuecat.purchases.models.PricingPhase) next).getRecurrenceMode() != com.revenuecat.purchases.models.RecurrenceMode.INFINITE_RECURRING);
        com.revenuecat.purchases.models.PricingPhase pricingPhase = (com.revenuecat.purchases.models.PricingPhase) next;
        return pricingPhase == null ? (com.revenuecat.purchases.models.PricingPhase) p078i6.o.s1(getPricingPhases()) : pricingPhase;
    }

    public static /* synthetic */ void getPurchasingData$annotations() {
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.models.GoogleSubscriptionOption)) {
            return false;
        }
        com.revenuecat.purchases.models.GoogleSubscriptionOption googleSubscriptionOption = (com.revenuecat.purchases.models.GoogleSubscriptionOption) obj;
        return kotlin.jvm.internal.m.a(this.productId, googleSubscriptionOption.productId) && kotlin.jvm.internal.m.a(this.basePlanId, googleSubscriptionOption.basePlanId) && kotlin.jvm.internal.m.a(this.offerId, googleSubscriptionOption.offerId) && kotlin.jvm.internal.m.a(this.pricingPhases, googleSubscriptionOption.pricingPhases) && kotlin.jvm.internal.m.a(this.tags, googleSubscriptionOption.tags) && kotlin.jvm.internal.m.a(this.productDetails, googleSubscriptionOption.productDetails) && kotlin.jvm.internal.m.a(this.offerToken, googleSubscriptionOption.offerToken) && kotlin.jvm.internal.m.a(this.presentedOfferingContext, googleSubscriptionOption.presentedOfferingContext) && kotlin.jvm.internal.m.a(this.installmentsInfo, googleSubscriptionOption.installmentsInfo);
    }

    public final java.lang.String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public java.lang.String getId() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.basePlanId);
        java.lang.String str2 = this.offerId;
        if (str2 == null || O7.q.N0(str2)) {
            str = "";
        } else {
            str = ":" + this.offerId;
        }
        sb.append(str);
        return sb.toString();
    }

    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    public final java.lang.String getOfferToken() {
        return this.offerToken;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public java.lang.String getPresentedOfferingIdentifier() {
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public java.util.List<com.revenuecat.purchases.models.PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final Y2.C1047q getProductDetails() {
        return this.productDetails;
    }

    public final java.lang.String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public com.revenuecat.purchases.models.PurchasingData getPurchasingData() {
        java.lang.String str = this.productId;
        java.lang.String id = getId();
        Y2.C1047q c1047q = this.productDetails;
        java.lang.String str2 = this.offerToken;
        com.revenuecat.purchases.models.PricingPhase primaryPricingPhase = getPrimaryPricingPhase();
        return new com.revenuecat.purchases.models.GooglePurchasingData.Subscription(str, id, c1047q, str2, primaryPricingPhase != null ? primaryPricingPhase.getBillingPeriod() : null, p078i6.w.f23205h);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public java.util.List<java.lang.String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iA = B2.a.a(this.productId.hashCode() * 31, 31, this.basePlanId);
        java.lang.String str = this.offerId;
        int iA2 = B2.a.a(B2.a.a(B2.a.b(B2.a.b((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.pricingPhases), 31, this.tags), 31, this.productDetails.f11502a), 31, this.offerToken);
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode = (iA2 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        com.revenuecat.purchases.models.GoogleInstallmentsInfo googleInstallmentsInfo = this.installmentsInfo;
        return iHashCode + (googleInstallmentsInfo != null ? googleInstallmentsInfo.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + this.pricingPhases + ", tags=" + this.tags + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingContext=" + this.presentedOfferingContext + ", installmentsInfo=" + this.installmentsInfo + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(java.lang.String productId, java.lang.String basePlanId, java.lang.String str, java.util.List<com.revenuecat.purchases.models.PricingPhase> pricingPhases, java.util.List<java.lang.String> tags, Y2.C1047q productDetails, java.lang.String offerToken, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, presentedOfferingContext, null, 256, null);
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(basePlanId, "basePlanId");
        kotlin.jvm.internal.m.e(pricingPhases, "pricingPhases");
        kotlin.jvm.internal.m.e(tags, "tags");
        kotlin.jvm.internal.m.e(productDetails, "productDetails");
        kotlin.jvm.internal.m.e(offerToken, "offerToken");
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public com.revenuecat.purchases.models.GoogleInstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    public GoogleSubscriptionOption(java.lang.String productId, java.lang.String basePlanId, java.lang.String str, java.util.List<com.revenuecat.purchases.models.PricingPhase> pricingPhases, java.util.List<java.lang.String> tags, Y2.C1047q productDetails, java.lang.String offerToken, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, com.revenuecat.purchases.models.GoogleInstallmentsInfo googleInstallmentsInfo) {
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(basePlanId, "basePlanId");
        kotlin.jvm.internal.m.e(pricingPhases, "pricingPhases");
        kotlin.jvm.internal.m.e(tags, "tags");
        kotlin.jvm.internal.m.e(productDetails, "productDetails");
        kotlin.jvm.internal.m.e(offerToken, "offerToken");
        this.productId = productId;
        this.basePlanId = basePlanId;
        this.offerId = str;
        this.pricingPhases = pricingPhases;
        this.tags = tags;
        this.productDetails = productDetails;
        this.offerToken = offerToken;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = googleInstallmentsInfo;
    }

    public /* synthetic */ GoogleSubscriptionOption(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2, Y2.C1047q c1047q, java.lang.String str4, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, com.revenuecat.purchases.models.GoogleInstallmentsInfo googleInstallmentsInfo, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, list, list2, c1047q, str4, (i3 & 128) != 0 ? null : presentedOfferingContext, (i3 & 256) != 0 ? null : googleInstallmentsInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public GoogleSubscriptionOption(java.lang.String productId, java.lang.String basePlanId, java.lang.String str, java.util.List<com.revenuecat.purchases.models.PricingPhase> pricingPhases, java.util.List<java.lang.String> tags, Y2.C1047q productDetails, java.lang.String offerToken, java.lang.String presentedOfferingId) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, new com.revenuecat.purchases.PresentedOfferingContext(presentedOfferingId), null, 256, null);
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(basePlanId, "basePlanId");
        kotlin.jvm.internal.m.e(pricingPhases, "pricingPhases");
        kotlin.jvm.internal.m.e(tags, "tags");
        kotlin.jvm.internal.m.e(productDetails, "productDetails");
        kotlin.jvm.internal.m.e(offerToken, "offerToken");
        kotlin.jvm.internal.m.e(presentedOfferingId, "presentedOfferingId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(com.revenuecat.purchases.models.GoogleSubscriptionOption subscriptionOption, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        this(subscriptionOption.productId, subscriptionOption.basePlanId, subscriptionOption.offerId, subscriptionOption.getPricingPhases(), subscriptionOption.getTags(), subscriptionOption.productDetails, subscriptionOption.offerToken, presentedOfferingContext, subscriptionOption.getInstallmentsInfo());
        kotlin.jvm.internal.m.e(subscriptionOption, "subscriptionOption");
    }
}
