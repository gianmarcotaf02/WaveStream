package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b/\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u008d\u0001\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019By\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b-\u0010,J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b2\u00103J+\u00106\u001a\b\u0012\u0004\u0012\u00020\u0007052\u0014\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010=R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010,R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bD\u0010AR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bJ\u0010AR\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010KR\u001a\u0010\u0015\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bP\u0010QR'\u0010X\u001a\b\u0012\u0004\u0012\u00020\u0007058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010W\u001a\u0004\bT\u0010UR'\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u0007058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bY\u0010S\u0012\u0004\b[\u0010W\u001a\u0004\bZ\u0010UR'\u0010`\u001a\b\u0012\u0004\u0012\u00020\u0007058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b]\u0010S\u0012\u0004\b_\u0010W\u001a\u0004\b^\u0010UR#\u0010d\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\ba\u0010S\u0012\u0004\bc\u0010W\u001a\u0004\bb\u0010AR'\u0010k\u001a\b\u0012\u0004\u0012\u00020f0e8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bg\u0010S\u0012\u0004\bj\u0010W\u001a\u0004\bh\u0010iR-\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020l0\u00068FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\bm\u0010S\u0012\u0004\bo\u0010W\u001a\u0004\bn\u0010=R\"\u0010r\u001a\n q*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\br\u0010K\u0012\u0004\bs\u0010WR\u001a\u0010w\u001a\u00020\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\bv\u0010W\u001a\u0004\bt\u0010u¨\u0006x"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/RawDataContainer;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/EntitlementInfos;", com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.ENTITLEMENTS, "", "", "Ljava/util/Date;", "allExpirationDatesByProduct", "allPurchaseDatesByProduct", "requestDate", "", "schemaVersion", "firstSeen", "originalAppUserId", "Landroid/net/Uri;", "managementURL", "originalPurchaseDate", "jsonObject", "Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "originalSource", "", "loadedFromCache", "<init>", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;Lorg/json/JSONObject;Lcom/revenuecat/purchases/CustomerInfoOriginalSource;Z)V", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;Lorg/json/JSONObject;)V", com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU, "getExpirationDateForSku", "(Ljava/lang/String;)Ljava/util/Date;", "productId", "getExpirationDateForProductId", "getPurchaseDateForSku", "getPurchaseDateForProductId", "entitlement", "getExpirationDateForEntitlement", "getPurchaseDateForEntitlement", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "expirations", "", "activeIdentifiers", "(Ljava/util/Map;)Ljava/util/Set;", "Lcom/revenuecat/purchases/EntitlementInfos;", "getEntitlements", "()Lcom/revenuecat/purchases/EntitlementInfos;", "Ljava/util/Map;", "getAllExpirationDatesByProduct", "()Ljava/util/Map;", "getAllPurchaseDatesByProduct", "Ljava/util/Date;", "getRequestDate", "()Ljava/util/Date;", "I", "getSchemaVersion", "getFirstSeen", "Ljava/lang/String;", "getOriginalAppUserId", "Landroid/net/Uri;", "getManagementURL", "()Landroid/net/Uri;", "getOriginalPurchaseDate", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "getOriginalSource$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "Z", "getLoadedFromCache$purchases_defaultsRelease", "()Z", "activeSubscriptions$delegate", "Lh6/h;", "getActiveSubscriptions", "()Ljava/util/Set;", "getActiveSubscriptions$annotations", "()V", "activeSubscriptions", "allPurchasedSkus$delegate", "getAllPurchasedSkus", "getAllPurchasedSkus$annotations", "allPurchasedSkus", "allPurchasedProductIds$delegate", "getAllPurchasedProductIds", "getAllPurchasedProductIds$annotations", "allPurchasedProductIds", "latestExpirationDate$delegate", "getLatestExpirationDate", "getLatestExpirationDate$annotations", "latestExpirationDate", "", "Lcom/revenuecat/purchases/models/Transaction;", "nonSubscriptionTransactions$delegate", "getNonSubscriptionTransactions", "()Ljava/util/List;", "getNonSubscriptionTransactions$annotations", "nonSubscriptionTransactions", "Lcom/revenuecat/purchases/SubscriptionInfo;", "subscriptionsByProductIdentifier$delegate", "getSubscriptionsByProductIdentifier", "getSubscriptionsByProductIdentifier$annotations", "subscriptionsByProductIdentifier", "kotlin.jvm.PlatformType", "subscriberJSONObject", "getSubscriberJSONObject$annotations", "getRawData", "()Lorg/json/JSONObject;", "getRawData$annotations", "rawData", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfo implements android.os.Parcelable, com.revenuecat.purchases.models.RawDataContainer<org.json.JSONObject> {
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.CustomerInfo> CREATOR = new com.revenuecat.purchases.CustomerInfo.Creator();

    /* JADX INFO: renamed from: activeSubscriptions$delegate, reason: from kotlin metadata */
    private final p070h6.h activeSubscriptions;
    private final java.util.Map<java.lang.String, java.util.Date> allExpirationDatesByProduct;
    private final java.util.Map<java.lang.String, java.util.Date> allPurchaseDatesByProduct;

    /* JADX INFO: renamed from: allPurchasedProductIds$delegate, reason: from kotlin metadata */
    private final p070h6.h allPurchasedProductIds;

    /* JADX INFO: renamed from: allPurchasedSkus$delegate, reason: from kotlin metadata */
    private final p070h6.h allPurchasedSkus;
    private final com.revenuecat.purchases.EntitlementInfos entitlements;
    private final java.util.Date firstSeen;
    private final org.json.JSONObject jsonObject;

    /* JADX INFO: renamed from: latestExpirationDate$delegate, reason: from kotlin metadata */
    private final p070h6.h latestExpirationDate;
    private final boolean loadedFromCache;
    private final android.net.Uri managementURL;

    /* JADX INFO: renamed from: nonSubscriptionTransactions$delegate, reason: from kotlin metadata */
    private final p070h6.h nonSubscriptionTransactions;
    private final java.lang.String originalAppUserId;
    private final java.util.Date originalPurchaseDate;
    private final com.revenuecat.purchases.CustomerInfoOriginalSource originalSource;
    private final java.util.Date requestDate;
    private final int schemaVersion;
    private final org.json.JSONObject subscriberJSONObject;

    /* JADX INFO: renamed from: subscriptionsByProductIdentifier$delegate, reason: from kotlin metadata */
    private final p070h6.h subscriptionsByProductIdentifier;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.CustomerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.CustomerInfo createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            com.revenuecat.purchases.EntitlementInfos entitlementInfosCreateFromParcel = com.revenuecat.purchases.EntitlementInfos.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(i3);
            for (int i9 = 0; i9 != i3; i9++) {
                linkedHashMap.put(parcel.readString(), parcel.readSerializable());
            }
            int i10 = parcel.readInt();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap2.put(parcel.readString(), parcel.readSerializable());
            }
            return new com.revenuecat.purchases.CustomerInfo(entitlementInfosCreateFromParcel, linkedHashMap, linkedHashMap2, (java.util.Date) parcel.readSerializable(), parcel.readInt(), (java.util.Date) parcel.readSerializable(), parcel.readString(), (android.net.Uri) parcel.readParcelable(com.revenuecat.purchases.CustomerInfo.class.getClassLoader()), (java.util.Date) parcel.readSerializable(), com.revenuecat.purchases.utils.JSONObjectParceler.INSTANCE.create(parcel), com.revenuecat.purchases.CustomerInfoOriginalSource.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.CustomerInfo[] newArray(int i3) {
            return new com.revenuecat.purchases.CustomerInfo[i3];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerInfo(com.revenuecat.purchases.EntitlementInfos entitlements, java.util.Map<java.lang.String, ? extends java.util.Date> allExpirationDatesByProduct, java.util.Map<java.lang.String, ? extends java.util.Date> allPurchaseDatesByProduct, java.util.Date requestDate, int i3, java.util.Date firstSeen, java.lang.String originalAppUserId, android.net.Uri uri, java.util.Date date, org.json.JSONObject jsonObject, com.revenuecat.purchases.CustomerInfoOriginalSource originalSource, boolean z6) {
        kotlin.jvm.internal.m.e(entitlements, "entitlements");
        kotlin.jvm.internal.m.e(allExpirationDatesByProduct, "allExpirationDatesByProduct");
        kotlin.jvm.internal.m.e(allPurchaseDatesByProduct, "allPurchaseDatesByProduct");
        kotlin.jvm.internal.m.e(requestDate, "requestDate");
        kotlin.jvm.internal.m.e(firstSeen, "firstSeen");
        kotlin.jvm.internal.m.e(originalAppUserId, "originalAppUserId");
        kotlin.jvm.internal.m.e(jsonObject, "jsonObject");
        kotlin.jvm.internal.m.e(originalSource, "originalSource");
        this.entitlements = entitlements;
        this.allExpirationDatesByProduct = allExpirationDatesByProduct;
        this.allPurchaseDatesByProduct = allPurchaseDatesByProduct;
        this.requestDate = requestDate;
        this.schemaVersion = i3;
        this.firstSeen = firstSeen;
        this.originalAppUserId = originalAppUserId;
        this.managementURL = uri;
        this.originalPurchaseDate = date;
        this.jsonObject = jsonObject;
        this.originalSource = originalSource;
        this.loadedFromCache = z6;
        this.activeSubscriptions = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.CustomerInfo$activeSubscriptions$2(this));
        this.allPurchasedSkus = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.CustomerInfo$allPurchasedSkus$2(this));
        this.allPurchasedProductIds = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.CustomerInfo$allPurchasedProductIds$2(this));
        this.latestExpirationDate = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.CustomerInfo$latestExpirationDate$2(this));
        this.nonSubscriptionTransactions = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.CustomerInfo$nonSubscriptionTransactions$2(this));
        this.subscriptionsByProductIdentifier = com.google.common.util.concurrent.D.B(new com.revenuecat.purchases.CustomerInfo$subscriptionsByProductIdentifier$2(this));
        this.subscriberJSONObject = jsonObject.getJSONObject(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.SUBSCRIBER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Set<java.lang.String> activeIdentifiers(java.util.Map<java.lang.String, ? extends java.util.Date> expirations) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ? extends java.util.Date> entry : expirations.entrySet()) {
            if (com.revenuecat.purchases.utils.DateHelper.Companion.m283isDateActiveSxA4cEA$default(com.revenuecat.purchases.utils.DateHelper.INSTANCE, entry.getValue(), this.requestDate, 0L, 4, null).isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public static /* synthetic */ void getActiveSubscriptions$annotations() {
    }

    public static /* synthetic */ void getAllPurchasedProductIds$annotations() {
    }

    @p070h6.c
    public static /* synthetic */ void getAllPurchasedSkus$annotations() {
    }

    public static /* synthetic */ void getLatestExpirationDate$annotations() {
    }

    public static /* synthetic */ void getNonSubscriptionTransactions$annotations() {
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    private static /* synthetic */ void getSubscriberJSONObject$annotations() {
    }

    public static /* synthetic */ void getSubscriptionsByProductIdentifier$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof com.revenuecat.purchases.CustomerInfo) && new com.revenuecat.purchases.ComparableData(this).equals(new com.revenuecat.purchases.ComparableData((com.revenuecat.purchases.CustomerInfo) other));
    }

    public final java.util.Set<java.lang.String> getActiveSubscriptions() {
        return (java.util.Set) this.activeSubscriptions.getValue();
    }

    public final java.util.Map<java.lang.String, java.util.Date> getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final java.util.Map<java.lang.String, java.util.Date> getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final java.util.Set<java.lang.String> getAllPurchasedProductIds() {
        return (java.util.Set) this.allPurchasedProductIds.getValue();
    }

    public final java.util.Set<java.lang.String> getAllPurchasedSkus() {
        return (java.util.Set) this.allPurchasedSkus.getValue();
    }

    public final com.revenuecat.purchases.EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final java.util.Date getExpirationDateForEntitlement(java.lang.String entitlement) {
        kotlin.jvm.internal.m.e(entitlement, "entitlement");
        com.revenuecat.purchases.EntitlementInfo entitlementInfo = this.entitlements.getAll().get(entitlement);
        if (entitlementInfo != null) {
            return entitlementInfo.getExpirationDate();
        }
        return null;
    }

    public final java.util.Date getExpirationDateForProductId(java.lang.String productId) {
        kotlin.jvm.internal.m.e(productId, "productId");
        return this.allExpirationDatesByProduct.get(productId);
    }

    @p070h6.c
    public final java.util.Date getExpirationDateForSku(java.lang.String sku) {
        kotlin.jvm.internal.m.e(sku, "sku");
        return this.allExpirationDatesByProduct.get(sku);
    }

    public final java.util.Date getFirstSeen() {
        return this.firstSeen;
    }

    public final java.util.Date getLatestExpirationDate() {
        return (java.util.Date) this.latestExpirationDate.getValue();
    }

    /* JADX INFO: renamed from: getLoadedFromCache$purchases_defaultsRelease, reason: from getter */
    public final boolean getLoadedFromCache() {
        return this.loadedFromCache;
    }

    public final android.net.Uri getManagementURL() {
        return this.managementURL;
    }

    public final java.util.List<com.revenuecat.purchases.models.Transaction> getNonSubscriptionTransactions() {
        return (java.util.List) this.nonSubscriptionTransactions.getValue();
    }

    public final java.lang.String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final java.util.Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    /* JADX INFO: renamed from: getOriginalSource$purchases_defaultsRelease, reason: from getter */
    public final com.revenuecat.purchases.CustomerInfoOriginalSource getOriginalSource() {
        return this.originalSource;
    }

    public final java.util.Date getPurchaseDateForEntitlement(java.lang.String entitlement) {
        kotlin.jvm.internal.m.e(entitlement, "entitlement");
        com.revenuecat.purchases.EntitlementInfo entitlementInfo = this.entitlements.getAll().get(entitlement);
        if (entitlementInfo != null) {
            return entitlementInfo.getLatestPurchaseDate();
        }
        return null;
    }

    public final java.util.Date getPurchaseDateForProductId(java.lang.String productId) {
        kotlin.jvm.internal.m.e(productId, "productId");
        return this.allPurchaseDatesByProduct.get(productId);
    }

    @p070h6.c
    public final java.util.Date getPurchaseDateForSku(java.lang.String sku) {
        kotlin.jvm.internal.m.e(sku, "sku");
        return this.allPurchaseDatesByProduct.get(sku);
    }

    public final java.util.Date getRequestDate() {
        return this.requestDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.SubscriptionInfo> getSubscriptionsByProductIdentifier() {
        return (java.util.Map) this.subscriptionsByProductIdentifier.getValue();
    }

    public int hashCode() {
        return new com.revenuecat.purchases.ComparableData(this).hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<CustomerInfo\n latestExpirationDate: ");
        sb.append(getLatestExpirationDate());
        sb.append("\nactiveSubscriptions:  ");
        java.util.Set<java.lang.String> activeSubscriptions = getActiveSubscriptions();
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(activeSubscriptions, 10));
        for (java.lang.String str : activeSubscriptions) {
            arrayList.add(new p070h6.k(str, p078i6.D.J0(new p070h6.k("expiresDate", getExpirationDateForProductId(str)))));
        }
        sb.append(p078i6.C.X0(arrayList));
        sb.append(",\nactiveEntitlements: ");
        java.util.Map<java.lang.String, com.revenuecat.purchases.EntitlementInfo> active = this.entitlements.getActive();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(active.size());
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.EntitlementInfo>> it = active.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().toString());
        }
        sb.append(arrayList2);
        sb.append(",\nentitlements: ");
        java.util.Map<java.lang.String, com.revenuecat.purchases.EntitlementInfo> all = this.entitlements.getAll();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(all.size());
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.EntitlementInfo>> it2 = all.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next().toString());
        }
        sb.append(arrayList3);
        sb.append(",\nnonSubscriptionTransactions: ");
        sb.append(getNonSubscriptionTransactions());
        sb.append(",\nrequestDate: ");
        sb.append(this.requestDate);
        sb.append("\n>");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        this.entitlements.writeToParcel(parcel, flags);
        java.util.Map<java.lang.String, java.util.Date> map = this.allExpirationDatesByProduct;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry<java.lang.String, java.util.Date> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeSerializable(entry.getValue());
        }
        java.util.Map<java.lang.String, java.util.Date> map2 = this.allPurchaseDatesByProduct;
        parcel.writeInt(map2.size());
        for (java.util.Map.Entry<java.lang.String, java.util.Date> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeSerializable(entry2.getValue());
        }
        parcel.writeSerializable(this.requestDate);
        parcel.writeInt(this.schemaVersion);
        parcel.writeSerializable(this.firstSeen);
        parcel.writeString(this.originalAppUserId);
        parcel.writeParcelable(this.managementURL, flags);
        parcel.writeSerializable(this.originalPurchaseDate);
        com.revenuecat.purchases.utils.JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, flags);
        parcel.writeString(this.originalSource.name());
        parcel.writeInt(this.loadedFromCache ? 1 : 0);
    }

    @Override // com.revenuecat.purchases.models.RawDataContainer
    /* JADX INFO: renamed from: getRawData, reason: avoid collision after fix types in other method and from getter */
    public org.json.JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public /* synthetic */ CustomerInfo(com.revenuecat.purchases.EntitlementInfos entitlementInfos, java.util.Map map, java.util.Map map2, java.util.Date date, int i3, java.util.Date date2, java.lang.String str, android.net.Uri uri, java.util.Date date3, org.json.JSONObject jSONObject, com.revenuecat.purchases.CustomerInfoOriginalSource customerInfoOriginalSource, boolean z6, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(entitlementInfos, map, map2, date, i3, date2, str, uri, date3, jSONObject, (i9 & 1024) != 0 ? com.revenuecat.purchases.CustomerInfoOriginalSource.INSTANCE.getDEFAULT() : customerInfoOriginalSource, (i9 & 2048) != 0 ? false : z6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerInfo(com.revenuecat.purchases.EntitlementInfos entitlements, java.util.Map<java.lang.String, ? extends java.util.Date> allExpirationDatesByProduct, java.util.Map<java.lang.String, ? extends java.util.Date> allPurchaseDatesByProduct, java.util.Date requestDate, int i3, java.util.Date firstSeen, java.lang.String originalAppUserId, android.net.Uri uri, java.util.Date date, org.json.JSONObject jsonObject) {
        this(entitlements, allExpirationDatesByProduct, allPurchaseDatesByProduct, requestDate, i3, firstSeen, originalAppUserId, uri, date, jsonObject, com.revenuecat.purchases.CustomerInfoOriginalSource.INSTANCE.getDEFAULT(), true);
        kotlin.jvm.internal.m.e(entitlements, "entitlements");
        kotlin.jvm.internal.m.e(allExpirationDatesByProduct, "allExpirationDatesByProduct");
        kotlin.jvm.internal.m.e(allPurchaseDatesByProduct, "allPurchaseDatesByProduct");
        kotlin.jvm.internal.m.e(requestDate, "requestDate");
        kotlin.jvm.internal.m.e(firstSeen, "firstSeen");
        kotlin.jvm.internal.m.e(originalAppUserId, "originalAppUserId");
        kotlin.jvm.internal.m.e(jsonObject, "jsonObject");
    }
}
