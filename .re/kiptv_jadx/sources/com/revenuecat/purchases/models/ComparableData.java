package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0081\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001aJ\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0017HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u000fHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0014HÆ\u0003J¤\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u0010\u0010\u001bR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006D"}, d2 = {"Lcom/revenuecat/purchases/models/ComparableData;", "", "storeTransaction", "Lcom/revenuecat/purchases/models/StoreTransaction;", "(Lcom/revenuecat/purchases/models/StoreTransaction;)V", "orderId", "", "productIds", "", "type", "Lcom/revenuecat/purchases/ProductType;", "purchaseTime", "", "purchaseToken", "purchaseState", "Lcom/revenuecat/purchases/models/PurchaseState;", "isAutoRenewing", "", "signature", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "storeUserID", "purchaseType", "Lcom/revenuecat/purchases/models/PurchaseType;", "marketplace", "subscriptionOptionId", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarketplace", "()Ljava/lang/String;", "getOrderId", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getProductIds", "()Ljava/util/List;", "getPurchaseState", "()Lcom/revenuecat/purchases/models/PurchaseState;", "getPurchaseTime", "()J", "getPurchaseToken", "getPurchaseType", "()Lcom/revenuecat/purchases/models/PurchaseType;", "getSignature", "getStoreUserID", "getSubscriptionOptionId", "getType", "()Lcom/revenuecat/purchases/ProductType;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/models/ComparableData;", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class ComparableData {
    private final java.lang.Boolean isAutoRenewing;
    private final java.lang.String marketplace;
    private final java.lang.String orderId;
    private final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
    private final java.util.List<java.lang.String> productIds;
    private final com.revenuecat.purchases.models.PurchaseState purchaseState;
    private final long purchaseTime;
    private final java.lang.String purchaseToken;
    private final com.revenuecat.purchases.models.PurchaseType purchaseType;
    private final java.lang.String signature;
    private final java.lang.String storeUserID;
    private final java.lang.String subscriptionOptionId;
    private final com.revenuecat.purchases.ProductType type;

    public ComparableData(java.lang.String str, java.util.List<java.lang.String> productIds, com.revenuecat.purchases.ProductType type, long j, java.lang.String purchaseToken, com.revenuecat.purchases.models.PurchaseState purchaseState, java.lang.Boolean bool, java.lang.String str2, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, java.lang.String str3, com.revenuecat.purchases.models.PurchaseType purchaseType, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(purchaseToken, "purchaseToken");
        kotlin.jvm.internal.m.e(purchaseState, "purchaseState");
        kotlin.jvm.internal.m.e(purchaseType, "purchaseType");
        this.orderId = str;
        this.productIds = productIds;
        this.type = type;
        this.purchaseTime = j;
        this.purchaseToken = purchaseToken;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = bool;
        this.signature = str2;
        this.presentedOfferingContext = presentedOfferingContext;
        this.storeUserID = str3;
        this.purchaseType = purchaseType;
        this.marketplace = str4;
        this.subscriptionOptionId = str5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final java.lang.String getStoreUserID() {
        return this.storeUserID;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final com.revenuecat.purchases.models.PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final java.lang.String getMarketplace() {
        return this.marketplace;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final java.lang.String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.productIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.revenuecat.purchases.ProductType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final com.revenuecat.purchases.models.PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.Boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final com.revenuecat.purchases.models.ComparableData copy(java.lang.String orderId, java.util.List<java.lang.String> productIds, com.revenuecat.purchases.ProductType type, long purchaseTime, java.lang.String purchaseToken, com.revenuecat.purchases.models.PurchaseState purchaseState, java.lang.Boolean isAutoRenewing, java.lang.String signature, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, java.lang.String storeUserID, com.revenuecat.purchases.models.PurchaseType purchaseType, java.lang.String marketplace, java.lang.String subscriptionOptionId) {
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(purchaseToken, "purchaseToken");
        kotlin.jvm.internal.m.e(purchaseState, "purchaseState");
        kotlin.jvm.internal.m.e(purchaseType, "purchaseType");
        return new com.revenuecat.purchases.models.ComparableData(orderId, productIds, type, purchaseTime, purchaseToken, purchaseState, isAutoRenewing, signature, presentedOfferingContext, storeUserID, purchaseType, marketplace, subscriptionOptionId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.models.ComparableData)) {
            return false;
        }
        com.revenuecat.purchases.models.ComparableData comparableData = (com.revenuecat.purchases.models.ComparableData) other;
        return kotlin.jvm.internal.m.a(this.orderId, comparableData.orderId) && kotlin.jvm.internal.m.a(this.productIds, comparableData.productIds) && this.type == comparableData.type && this.purchaseTime == comparableData.purchaseTime && kotlin.jvm.internal.m.a(this.purchaseToken, comparableData.purchaseToken) && this.purchaseState == comparableData.purchaseState && kotlin.jvm.internal.m.a(this.isAutoRenewing, comparableData.isAutoRenewing) && kotlin.jvm.internal.m.a(this.signature, comparableData.signature) && kotlin.jvm.internal.m.a(this.presentedOfferingContext, comparableData.presentedOfferingContext) && kotlin.jvm.internal.m.a(this.storeUserID, comparableData.storeUserID) && this.purchaseType == comparableData.purchaseType && kotlin.jvm.internal.m.a(this.marketplace, comparableData.marketplace) && kotlin.jvm.internal.m.a(this.subscriptionOptionId, comparableData.subscriptionOptionId);
    }

    public final java.lang.String getMarketplace() {
        return this.marketplace;
    }

    public final java.lang.String getOrderId() {
        return this.orderId;
    }

    public final com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final java.util.List<java.lang.String> getProductIds() {
        return this.productIds;
    }

    public final com.revenuecat.purchases.models.PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final java.lang.String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final com.revenuecat.purchases.models.PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final java.lang.String getSignature() {
        return this.signature;
    }

    public final java.lang.String getStoreUserID() {
        return this.storeUserID;
    }

    public final java.lang.String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final com.revenuecat.purchases.ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        java.lang.String str = this.orderId;
        int iHashCode = (this.purchaseState.hashCode() + B2.a.a(p121o0.p.e((this.type.hashCode() + B2.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.productIds)) * 31, 31, this.purchaseTime), 31, this.purchaseToken)) * 31;
        java.lang.Boolean bool = this.isAutoRenewing;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str2 = this.signature;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode4 = (iHashCode3 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        java.lang.String str3 = this.storeUserID;
        int iHashCode5 = (this.purchaseType.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        java.lang.String str4 = this.marketplace;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.subscriptionOptionId;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final java.lang.Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ComparableData(orderId=");
        sb.append(this.orderId);
        sb.append(", productIds=");
        sb.append(this.productIds);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", purchaseTime=");
        sb.append(this.purchaseTime);
        sb.append(", purchaseToken=");
        sb.append(this.purchaseToken);
        sb.append(", purchaseState=");
        sb.append(this.purchaseState);
        sb.append(", isAutoRenewing=");
        sb.append(this.isAutoRenewing);
        sb.append(", signature=");
        sb.append(this.signature);
        sb.append(", presentedOfferingContext=");
        sb.append(this.presentedOfferingContext);
        sb.append(", storeUserID=");
        sb.append(this.storeUserID);
        sb.append(", purchaseType=");
        sb.append(this.purchaseType);
        sb.append(", marketplace=");
        sb.append(this.marketplace);
        sb.append(", subscriptionOptionId=");
        return Y6.f.l(sb, this.subscriptionOptionId, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparableData(com.revenuecat.purchases.models.StoreTransaction storeTransaction) {
        this(storeTransaction.getOrderId(), storeTransaction.getProductIds(), storeTransaction.getType(), storeTransaction.getPurchaseTime(), storeTransaction.getPurchaseToken(), storeTransaction.getPurchaseState(), storeTransaction.getIsAutoRenewing(), storeTransaction.getSignature(), storeTransaction.getPresentedOfferingContext(), storeTransaction.getStoreUserID(), storeTransaction.getPurchaseType(), storeTransaction.getMarketplace(), storeTransaction.getSubscriptionOptionId());
        kotlin.jvm.internal.m.e(storeTransaction, "storeTransaction");
    }
}
