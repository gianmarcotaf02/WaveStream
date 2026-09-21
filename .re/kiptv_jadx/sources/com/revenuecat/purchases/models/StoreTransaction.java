package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0007\u0018\u00002\u00020\u0001B\u00ad\u0001\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB\u0097\u0001\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001fB\u0097\u0001\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010!J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020&HÖ\u0001¢\u0006\u0004\b)\u0010(J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020&HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b<\u00102R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\b\u000e\u0010AR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\bB\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\bI\u00102R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\bM\u00102R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\bN\u00102R.\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010O\u0012\u0004\bR\u0010S\u001a\u0004\bP\u0010QR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010S\u001a\u0004\bW\u00102R \u0010[\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010S\u001a\u0004\bY\u00105¨\u0006\\"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "Landroid/os/Parcelable;", "", "orderId", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "", "purchaseTime", "purchaseToken", "Lcom/revenuecat/purchases/models/PurchaseState;", "purchaseState", "", "isAutoRenewing", "signature", "Lorg/json/JSONObject;", "originalJson", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "storeUserID", "Lcom/revenuecat/purchases/models/PurchaseType;", "purchaseType", "marketplace", "subscriptionOptionId", "", "subscriptionOptionIdForProductIDs", "Lcom/revenuecat/purchases/ReplacementMode;", "replacementMode", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/revenuecat/purchases/ReplacementMode;)V", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "presentedOfferingIdentifier", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "Ljava/util/List;", "getProductIds", "()Ljava/util/List;", "Lcom/revenuecat/purchases/ProductType;", "getType", "()Lcom/revenuecat/purchases/ProductType;", "J", "getPurchaseTime", "()J", "getPurchaseToken", "Lcom/revenuecat/purchases/models/PurchaseState;", "getPurchaseState", "()Lcom/revenuecat/purchases/models/PurchaseState;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getSignature", "Lorg/json/JSONObject;", "getOriginalJson", "()Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getStoreUserID", "Lcom/revenuecat/purchases/models/PurchaseType;", "getPurchaseType", "()Lcom/revenuecat/purchases/models/PurchaseType;", "getMarketplace", "getSubscriptionOptionId", "Ljava/util/Map;", "getSubscriptionOptionIdForProductIDs", "()Ljava/util/Map;", "getSubscriptionOptionIdForProductIDs$annotations", "()V", "Lcom/revenuecat/purchases/ReplacementMode;", "getReplacementMode", "()Lcom/revenuecat/purchases/ReplacementMode;", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "getSkus", "getSkus$annotations", "skus", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StoreTransaction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.models.StoreTransaction> CREATOR = new com.revenuecat.purchases.models.StoreTransaction.Creator();
    private final java.lang.Boolean isAutoRenewing;
    private final java.lang.String marketplace;
    private final java.lang.String orderId;
    private final org.json.JSONObject originalJson;
    private final com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
    private final java.util.List<java.lang.String> productIds;
    private final com.revenuecat.purchases.models.PurchaseState purchaseState;
    private final long purchaseTime;
    private final java.lang.String purchaseToken;
    private final com.revenuecat.purchases.models.PurchaseType purchaseType;
    private final com.revenuecat.purchases.ReplacementMode replacementMode;
    private final java.lang.String signature;
    private final java.lang.String storeUserID;
    private final java.lang.String subscriptionOptionId;
    private final java.util.Map<java.lang.String, java.lang.String> subscriptionOptionIdForProductIDs;
    private final com.revenuecat.purchases.ProductType type;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.models.StoreTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.models.StoreTransaction createFromParcel(android.os.Parcel parcel) {
            java.lang.Boolean boolValueOf;
            java.util.LinkedHashMap linkedHashMap;
            kotlin.jvm.internal.m.e(parcel, "parcel");
            java.lang.String string = parcel.readString();
            java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            com.revenuecat.purchases.ProductType productTypeValueOf = com.revenuecat.purchases.ProductType.valueOf(parcel.readString());
            long j = parcel.readLong();
            java.lang.String string2 = parcel.readString();
            com.revenuecat.purchases.models.PurchaseState purchaseStateValueOf = com.revenuecat.purchases.models.PurchaseState.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = java.lang.Boolean.valueOf(parcel.readInt() != 0);
            }
            java.lang.String string3 = parcel.readString();
            org.json.JSONObject jSONObjectCreate = com.revenuecat.purchases.utils.JSONObjectParceler.INSTANCE.create(parcel);
            com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContextCreateFromParcel = parcel.readInt() == 0 ? null : com.revenuecat.purchases.PresentedOfferingContext.CREATOR.createFromParcel(parcel);
            java.lang.String string4 = parcel.readString();
            com.revenuecat.purchases.models.PurchaseType purchaseTypeValueOf = com.revenuecat.purchases.models.PurchaseType.valueOf(parcel.readString());
            java.lang.String string5 = parcel.readString();
            java.lang.String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(i3);
                int i9 = 0;
                while (i9 != i3) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                    i9++;
                    string = string;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new com.revenuecat.purchases.models.StoreTransaction(string, arrayListCreateStringArrayList, productTypeValueOf, j, string2, purchaseStateValueOf, boolValueOf, string3, jSONObjectCreate, presentedOfferingContextCreateFromParcel, string4, purchaseTypeValueOf, string5, string6, linkedHashMap, (com.revenuecat.purchases.ReplacementMode) parcel.readParcelable(com.revenuecat.purchases.models.StoreTransaction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.models.StoreTransaction[] newArray(int i3) {
            return new com.revenuecat.purchases.models.StoreTransaction[i3];
        }
    }

    public StoreTransaction(java.lang.String str, java.util.List<java.lang.String> productIds, com.revenuecat.purchases.ProductType type, long j, java.lang.String purchaseToken, com.revenuecat.purchases.models.PurchaseState purchaseState, java.lang.Boolean bool, java.lang.String str2, org.json.JSONObject originalJson, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, java.lang.String str3, com.revenuecat.purchases.models.PurchaseType purchaseType, java.lang.String str4, java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map, com.revenuecat.purchases.ReplacementMode replacementMode) {
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(purchaseToken, "purchaseToken");
        kotlin.jvm.internal.m.e(purchaseState, "purchaseState");
        kotlin.jvm.internal.m.e(originalJson, "originalJson");
        kotlin.jvm.internal.m.e(purchaseType, "purchaseType");
        this.orderId = str;
        this.productIds = productIds;
        this.type = type;
        this.purchaseTime = j;
        this.purchaseToken = purchaseToken;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = bool;
        this.signature = str2;
        this.originalJson = originalJson;
        this.presentedOfferingContext = presentedOfferingContext;
        this.storeUserID = str3;
        this.purchaseType = purchaseType;
        this.marketplace = str4;
        this.subscriptionOptionId = str5;
        this.subscriptionOptionIdForProductIDs = map;
        this.replacementMode = replacementMode;
    }

    @p070h6.c
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @p070h6.c
    public static /* synthetic */ void getSkus$annotations() {
    }

    public static /* synthetic */ void getSubscriptionOptionIdForProductIDs$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof com.revenuecat.purchases.models.StoreTransaction) && new com.revenuecat.purchases.models.ComparableData(this).equals(new com.revenuecat.purchases.models.ComparableData((com.revenuecat.purchases.models.StoreTransaction) other));
    }

    public final java.lang.String getMarketplace() {
        return this.marketplace;
    }

    public final java.lang.String getOrderId() {
        return this.orderId;
    }

    public final org.json.JSONObject getOriginalJson() {
        return this.originalJson;
    }

    public final com.revenuecat.purchases.PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final java.lang.String getPresentedOfferingIdentifier() {
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
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

    public final com.revenuecat.purchases.ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final java.lang.String getSignature() {
        return this.signature;
    }

    public final java.util.List<java.lang.String> getSkus() {
        return this.productIds;
    }

    public final java.lang.String getStoreUserID() {
        return this.storeUserID;
    }

    public final java.lang.String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final /* synthetic */ java.util.Map getSubscriptionOptionIdForProductIDs() {
        return this.subscriptionOptionIdForProductIDs;
    }

    public final com.revenuecat.purchases.ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        return new com.revenuecat.purchases.models.ComparableData(this).hashCode();
    }

    /* JADX INFO: renamed from: isAutoRenewing, reason: from getter */
    public final java.lang.Boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    public java.lang.String toString() {
        return "StoreTransaction(orderId=" + this.orderId + ", productIds=" + this.productIds + ", type=" + this.type + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", purchaseState=" + this.purchaseState + ", isAutoRenewing=" + this.isAutoRenewing + ", signature=" + this.signature + ", originalJson=" + this.originalJson + ", presentedOfferingContext=" + this.presentedOfferingContext + ", storeUserID=" + this.storeUserID + ", purchaseType=" + this.purchaseType + ", marketplace=" + this.marketplace + ", subscriptionOptionId=" + this.subscriptionOptionId + ", subscriptionOptionIdForProductIDs=" + this.subscriptionOptionIdForProductIDs + ", replacementMode=" + this.replacementMode + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        parcel.writeString(this.orderId);
        parcel.writeStringList(this.productIds);
        parcel.writeString(this.type.name());
        parcel.writeLong(this.purchaseTime);
        parcel.writeString(this.purchaseToken);
        parcel.writeString(this.purchaseState.name());
        java.lang.Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.signature);
        com.revenuecat.purchases.utils.JSONObjectParceler.INSTANCE.write(this.originalJson, parcel, flags);
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        if (presentedOfferingContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            presentedOfferingContext.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.storeUserID);
        parcel.writeString(this.purchaseType.name());
        parcel.writeString(this.marketplace);
        parcel.writeString(this.subscriptionOptionId);
        java.util.Map<java.lang.String, java.lang.String> map = this.subscriptionOptionIdForProductIDs;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeParcelable(this.replacementMode, flags);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoreTransaction(java.lang.String str, java.util.List<java.lang.String> productIds, com.revenuecat.purchases.ProductType type, long j, java.lang.String purchaseToken, com.revenuecat.purchases.models.PurchaseState purchaseState, java.lang.Boolean bool, java.lang.String str2, org.json.JSONObject originalJson, com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext, java.lang.String str3, com.revenuecat.purchases.models.PurchaseType purchaseType, java.lang.String str4, java.lang.String str5, com.revenuecat.purchases.ReplacementMode replacementMode) {
        this(str, productIds, type, j, purchaseToken, purchaseState, bool, str2, originalJson, presentedOfferingContext, str3, purchaseType, str4, str5, p078i6.x.f23206h, replacementMode);
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(purchaseToken, "purchaseToken");
        kotlin.jvm.internal.m.e(purchaseState, "purchaseState");
        kotlin.jvm.internal.m.e(originalJson, "originalJson");
        kotlin.jvm.internal.m.e(purchaseType, "purchaseType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public StoreTransaction(java.lang.String str, java.util.List<java.lang.String> productIds, com.revenuecat.purchases.ProductType type, long j, java.lang.String purchaseToken, com.revenuecat.purchases.models.PurchaseState purchaseState, java.lang.Boolean bool, java.lang.String str2, org.json.JSONObject originalJson, java.lang.String str3, java.lang.String str4, com.revenuecat.purchases.models.PurchaseType purchaseType, java.lang.String str5, java.lang.String str6, com.revenuecat.purchases.ReplacementMode replacementMode) {
        this(str, productIds, type, j, purchaseToken, purchaseState, bool, str2, originalJson, str3 != null ? new com.revenuecat.purchases.PresentedOfferingContext(str3) : null, str4, purchaseType, str5, str6, p078i6.x.f23206h, replacementMode);
        kotlin.jvm.internal.m.e(productIds, "productIds");
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(purchaseToken, "purchaseToken");
        kotlin.jvm.internal.m.e(purchaseState, "purchaseState");
        kotlin.jvm.internal.m.e(originalJson, "originalJson");
        kotlin.jvm.internal.m.e(purchaseType, "purchaseType");
    }
}
