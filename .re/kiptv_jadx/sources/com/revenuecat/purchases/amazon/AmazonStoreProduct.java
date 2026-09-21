package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001Bs\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015Bw\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017B{\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u0010\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u0003H\u0017J\u0012\u0010<\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0096\u0002J\b\u0010A\u001a\u00020BH\u0016R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0014\u0010\u0016\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001eR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b3\u0010*\u001a\u0004\b4\u0010\u001eR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006C"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "id", "", "type", "Lcom/revenuecat/purchases/ProductType;", io.ktor.http.LinkHeader.Parameters.Title, "description", "period", "Lcom/revenuecat/purchases/models/Period;", "price", "Lcom/revenuecat/purchases/models/Price;", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "defaultOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "iconUrl", "freeTrialPeriod", "originalProductJSON", "Lorg/json/JSONObject;", "presentedOfferingIdentifier", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lorg/json/JSONObject;Ljava/lang/String;)V", "name", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lorg/json/JSONObject;Ljava/lang/String;)V", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lorg/json/JSONObject;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDescription", "()Ljava/lang/String;", "getFreeTrialPeriod", "()Lcom/revenuecat/purchases/models/Period;", "getIconUrl", "getId", "getName", "getOriginalProductJSON", "()Lorg/json/JSONObject;", "getPeriod", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingIdentifier$annotations", "()V", "getPresentedOfferingIdentifier", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "purchasingData", "Lcom/revenuecat/purchases/amazon/AmazonPurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/amazon/AmazonPurchasingData;", com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU, "getSku$annotations", "getSku", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getTitle", "getType", "()Lcom/revenuecat/purchases/ProductType;", "copyWithOfferingId", "offeringId", "copyWithPresentedOfferingContext", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AmazonStoreProduct implements com.revenuecat.purchases.models.StoreProduct {
    private final com.revenuecat.purchases.models.SubscriptionOption defaultOption;
    private final java.lang.String description;
    private final com.revenuecat.purchases.models.Period freeTrialPeriod;
    private final java.lang.String iconUrl;
    private final java.lang.String id;
    private final java.lang.String name;
    private final org.json.JSONObject originalProductJSON;
    private final com.revenuecat.purchases.models.Period period;
    private final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
    private final com.revenuecat.purchases.models.Price price;
    private final com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions;
    private final java.lang.String title;
    private final com.revenuecat.purchases.ProductType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonStoreProduct(java.lang.String id, com.revenuecat.purchases.ProductType type, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, java.lang.String iconUrl, com.revenuecat.purchases.models.Period period2, org.json.JSONObject originalProductJSON) {
        this(id, type, name, title, description, period, price, subscriptionOptions, subscriptionOption, iconUrl, period2, originalProductJSON, null, 4096, null);
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(iconUrl, "iconUrl");
        kotlin.jvm.internal.m.e(originalProductJSON, "originalProductJSON");
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
        return new com.revenuecat.purchases.amazon.AmazonStoreProduct(getId(), getType(), getName(), getTitle(), getDescription(), getPeriod(), getPrice(), getSubscriptionOptions(), getDefaultOption(), this.iconUrl, this.freeTrialPeriod, this.originalProductJSON, presentedOfferingContext);
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof com.revenuecat.purchases.amazon.AmazonStoreProduct) && new com.revenuecat.purchases.amazon.ComparableData(this).equals(new com.revenuecat.purchases.amazon.ComparableData((com.revenuecat.purchases.amazon.AmazonStoreProduct) other));
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.models.SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getDescription() {
        return this.description;
    }

    public final com.revenuecat.purchases.models.Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final java.lang.String getIconUrl() {
        return this.iconUrl;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getId() {
        return this.id;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public java.lang.String getName() {
        return this.name;
    }

    public final org.json.JSONObject getOriginalProductJSON() {
        return this.originalProductJSON;
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
    public java.lang.String getSku() {
        return getId();
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
        return new com.revenuecat.purchases.amazon.ComparableData(this).hashCode();
    }

    public java.lang.String toString() {
        return "AmazonStoreProduct(id=" + this.id + ", type=" + this.type + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", price=" + this.price + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", iconUrl=" + this.iconUrl + ", freeTrialPeriod=" + this.freeTrialPeriod + ", originalProductJSON=" + this.originalProductJSON + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    public AmazonStoreProduct(java.lang.String id, com.revenuecat.purchases.ProductType type, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, java.lang.String iconUrl, com.revenuecat.purchases.models.Period period2, org.json.JSONObject originalProductJSON, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(iconUrl, "iconUrl");
        kotlin.jvm.internal.m.e(originalProductJSON, "originalProductJSON");
        this.id = id;
        this.type = type;
        this.name = name;
        this.title = title;
        this.description = description;
        this.period = period;
        this.price = price;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.iconUrl = iconUrl;
        this.freeTrialPeriod = period2;
        this.originalProductJSON = originalProductJSON;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public com.revenuecat.purchases.amazon.AmazonPurchasingData getPurchasingData() {
        return new com.revenuecat.purchases.amazon.AmazonPurchasingData.Product(this);
    }

    public /* synthetic */ AmazonStoreProduct(java.lang.String str, com.revenuecat.purchases.ProductType productType, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, java.lang.String str5, com.revenuecat.purchases.models.Period period2, org.json.JSONObject jSONObject, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, productType, str2, str3, str4, period, price, subscriptionOptions, subscriptionOption, str5, period2, jSONObject, (i3 & 4096) != 0 ? null : presentedOfferingContext);
    }

    public /* synthetic */ AmazonStoreProduct(java.lang.String str, com.revenuecat.purchases.ProductType productType, java.lang.String str2, java.lang.String str3, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, java.lang.String str4, com.revenuecat.purchases.models.Period period2, org.json.JSONObject jSONObject, java.lang.String str5, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, productType, str2, str3, period, price, subscriptionOptions, subscriptionOption, str4, period2, jSONObject, (i3 & 2048) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public AmazonStoreProduct(java.lang.String id, com.revenuecat.purchases.ProductType type, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, java.lang.String iconUrl, com.revenuecat.purchases.models.Period period2, org.json.JSONObject originalProductJSON, java.lang.String str) {
        this(id, type, title, title, description, period, price, subscriptionOptions, subscriptionOption, iconUrl, period2, originalProductJSON, str != null ? new com.revenuecat.purchases.PresentedOfferingContext(str) : null);
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(iconUrl, "iconUrl");
        kotlin.jvm.internal.m.e(originalProductJSON, "originalProductJSON");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public AmazonStoreProduct(java.lang.String id, com.revenuecat.purchases.ProductType type, java.lang.String name, java.lang.String title, java.lang.String description, com.revenuecat.purchases.models.Period period, com.revenuecat.purchases.models.Price price, com.revenuecat.purchases.models.SubscriptionOptions subscriptionOptions, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption, java.lang.String iconUrl, com.revenuecat.purchases.models.Period period2, org.json.JSONObject originalProductJSON, java.lang.String presentedOfferingIdentifier) {
        this(id, type, name, title, description, period, price, subscriptionOptions, subscriptionOption, iconUrl, period2, originalProductJSON, new com.revenuecat.purchases.PresentedOfferingContext(presentedOfferingIdentifier));
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(price, "price");
        kotlin.jvm.internal.m.e(iconUrl, "iconUrl");
        kotlin.jvm.internal.m.e(originalProductJSON, "originalProductJSON");
        kotlin.jvm.internal.m.e(presentedOfferingIdentifier, "presentedOfferingIdentifier");
    }
}
