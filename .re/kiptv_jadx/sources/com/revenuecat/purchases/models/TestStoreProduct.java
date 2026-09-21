package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BS\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rBI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eB_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\n\u00106\u001a\u0004\u0018\u00010.H\u0002J\u0010\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u0003H\u0017J\u0012\u00109\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0016\u0010-\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001aR\u0014\u00102\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/models/TestStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "id", "", "name", io.ktor.http.LinkHeader.Parameters.Title, "description", "price", "Lcom/revenuecat/purchases/models/Price;", "period", "Lcom/revenuecat/purchases/models/Period;", "freeTrialPeriod", "introPrice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;)V", "freeTrialPricingPhase", "Lcom/revenuecat/purchases/models/PricingPhase;", "introPricePricingPhase", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/PricingPhase;Lcom/revenuecat/purchases/models/PricingPhase;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "defaultOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDescription", "()Ljava/lang/String;", "getId", "getName", "getPeriod", "()Lcom/revenuecat/purchases/models/Period;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "getPresentedOfferingIdentifier", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU, "getSku", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getTitle", "type", "Lcom/revenuecat/purchases/ProductType;", "getType", "()Lcom/revenuecat/purchases/ProductType;", "buildSubscriptionOptions", "copyWithOfferingId", "offeringId", "copyWithPresentedOfferingContext", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class TestStoreProduct implements com.revenuecat.purchases.models.StoreProduct {
    private final java.lang.String description;
    private final com.revenuecat.purchases.models.PricingPhase freeTrialPricingPhase;
    private final java.lang.String id;
    private final com.revenuecat.purchases.models.PricingPhase introPricePricingPhase;
    private final java.lang.String name;
    private final com.revenuecat.purchases.models.Period period;
    private final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
    private final com.revenuecat.purchases.models.Price price;
    private final com.revenuecat.purchases.models.PurchasingData purchasingData;
    private final java.lang.String title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(java.lang.String id, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Price price) {
        this(id, name, title, description, price, null, null, null, null, 480, null);
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
    }

    private final com.revenuecat.purchases.models.SubscriptionOptions buildSubscriptionOptions() {
        if (getPeriod() == null) {
            return null;
        }
        com.revenuecat.purchases.models.PricingPhase pricingPhase = new com.revenuecat.purchases.models.PricingPhase(getPeriod(), com.revenuecat.purchases.models.RecurrenceMode.INFINITE_RECURRING, null, getPrice());
        return new com.revenuecat.purchases.models.SubscriptionOptions(p078i6.m.l0(new com.revenuecat.purchases.models.TestSubscriptionOption[]{(this.freeTrialPricingPhase == null && this.introPricePricingPhase == null) ? null : new com.revenuecat.purchases.models.TestSubscriptionOption(p078i6.m.l0(new com.revenuecat.purchases.models.PricingPhase[]{this.freeTrialPricingPhase, this.introPricePricingPhase, pricingPhase}), null, null, null, null, getPurchasingData(), 30, null), new com.revenuecat.purchases.models.TestSubscriptionOption(com.google.common.util.concurrent.P.i0(pricingPhase), null, null, null, null, getPurchasingData(), 30, null)}));
    }

    @p070h6.c
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    @p070h6.c
    public com.revenuecat.purchases.models.StoreProduct copyWithOfferingId(java.lang.String offeringId) {
        kotlin.jvm.internal.m.e(offeringId, "offeringId");
        return copyWithPresentedOfferingContext(new com.revenuecat.purchases.PresentedOfferingContext(offeringId));
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.StoreProduct copyWithPresentedOfferingContext(com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        return new com.revenuecat.purchases.models.TestStoreProduct(getId(), getName(), getTitle(), getDescription(), getPrice(), getPeriod(), this.freeTrialPricingPhase, this.introPricePricingPhase, presentedOfferingContext);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.models.TestStoreProduct)) {
            return false;
        }
        com.revenuecat.purchases.models.TestStoreProduct testStoreProduct = (com.revenuecat.purchases.models.TestStoreProduct) obj;
        return kotlin.jvm.internal.m.a(this.id, testStoreProduct.id) && kotlin.jvm.internal.m.a(this.name, testStoreProduct.name) && kotlin.jvm.internal.m.a(this.title, testStoreProduct.title) && kotlin.jvm.internal.m.a(this.description, testStoreProduct.description) && kotlin.jvm.internal.m.a(this.price, testStoreProduct.price) && kotlin.jvm.internal.m.a(this.period, testStoreProduct.period) && kotlin.jvm.internal.m.a(this.freeTrialPricingPhase, testStoreProduct.freeTrialPricingPhase) && kotlin.jvm.internal.m.a(this.introPricePricingPhase, testStoreProduct.introPricePricingPhase) && kotlin.jvm.internal.m.a(this.presentedOfferingContext, testStoreProduct.presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.SubscriptionOption getDefaultOption() {
        com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            return subscriptionOptions.getDefaultOffer();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getId() {
        return this.id;
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
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.Price getPrice() {
        return this.price;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.PurchasingData getPurchasingData() {
        return this.purchasingData;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getSku() {
        return getId();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.SubscriptionOptions getSubscriptionOptions() {
        return buildSubscriptionOptions();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.ProductType getType() {
        return getPeriod() == null ? com.revenuecat.purchases.ProductType.INAPP : com.revenuecat.purchases.ProductType.SUBS;
    }

    public int hashCode() {
        int iHashCode = (this.price.hashCode() + B2.a.a(B2.a.a(B2.a.a(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.description)) * 31;
        com.revenuecat.purchases.models.Period period = this.period;
        int iHashCode2 = (iHashCode + (period == null ? 0 : period.hashCode())) * 31;
        com.revenuecat.purchases.models.PricingPhase pricingPhase = this.freeTrialPricingPhase;
        int iHashCode3 = (iHashCode2 + (pricingPhase == null ? 0 : pricingPhase.hashCode())) * 31;
        com.revenuecat.purchases.models.PricingPhase pricingPhase2 = this.introPricePricingPhase;
        int iHashCode4 = (iHashCode3 + (pricingPhase2 == null ? 0 : pricingPhase2.hashCode())) * 31;
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        return iHashCode4 + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TestStoreProduct(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", price=" + this.price + ", period=" + this.period + ", freeTrialPricingPhase=" + this.freeTrialPricingPhase + ", introPricePricingPhase=" + this.introPricePricingPhase + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(java.lang.String id, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period period) {
        this(id, name, title, description, price, period, null, null, null, 448, null);
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(java.lang.String id, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.PricingPhase pricingPhase) {
        this(id, name, title, description, price, period, pricingPhase, null, null, androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, null);
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(java.lang.String id, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.PricingPhase pricingPhase, com.revenuecat.purchases.models.PricingPhase pricingPhase2) {
        this(id, name, title, description, price, period, pricingPhase, pricingPhase2, null, 256, null);
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
    }

    public TestStoreProduct(java.lang.String id, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.PricingPhase pricingPhase, com.revenuecat.purchases.models.PricingPhase pricingPhase2, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
        this.id = id;
        this.name = name;
        this.title = title;
        this.description = description;
        this.price = price;
        this.period = period;
        this.freeTrialPricingPhase = pricingPhase;
        this.introPricePricingPhase = pricingPhase2;
        this.presentedOfferingContext = presentedOfferingContext;
        this.purchasingData = new com.revenuecat.purchases.simulatedstore.SimulatedStorePurchasingData(getId(), getType(), this);
    }

    public /* synthetic */ TestStoreProduct(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.PricingPhase pricingPhase, com.revenuecat.purchases.models.PricingPhase pricingPhase2, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, str4, price, (i3 & 32) != 0 ? null : period, (i3 & 64) != 0 ? null : pricingPhase, (i3 & 128) != 0 ? null : pricingPhase2, (i3 & 256) != 0 ? null : presentedOfferingContext);
    }

    public /* synthetic */ TestStoreProduct(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Period period2, com.revenuecat.purchases.models.Price price2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, str4, price, (i3 & 32) != 0 ? null : period, (i3 & 64) != 0 ? null : period2, (i3 & 128) != 0 ? null : price2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public TestStoreProduct(java.lang.String id, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Period period2, com.revenuecat.purchases.models.Price price2) {
        this(id, name, title, description, price, period, period2 != null ? new com.revenuecat.purchases.models.PricingPhase(period2, com.revenuecat.purchases.models.RecurrenceMode.FINITE_RECURRING, 1, new com.revenuecat.purchases.models.Price("Free", 0L, price.getCurrencyCode())) : null, price2 != null ? new com.revenuecat.purchases.models.PricingPhase(new com.revenuecat.purchases.models.Period(1, com.revenuecat.purchases.models.Period.Unit.MONTH, "P1M"), com.revenuecat.purchases.models.RecurrenceMode.FINITE_RECURRING, 1, price2) : null, null, 256, null);
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
    }

    public /* synthetic */ TestStoreProduct(java.lang.String str, java.lang.String str2, java.lang.String str3, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Period period2, com.revenuecat.purchases.models.Price price2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, price, period, (i3 & 32) != 0 ? null : period2, (i3 & 64) != 0 ? null : price2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public TestStoreProduct(java.lang.String id, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Period period2, com.revenuecat.purchases.models.Price price2) {
        this(id, title, title, description, price, period, period2, price2);
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
    }
}
