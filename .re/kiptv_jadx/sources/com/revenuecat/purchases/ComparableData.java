package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B[\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\rHÖ\u0001J\t\u0010*\u001a\u00020\tHÖ\u0001R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/ComparableData;", "", "customerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "(Lcom/revenuecat/purchases/CustomerInfo;)V", com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.ENTITLEMENTS, "Lcom/revenuecat/purchases/EntitlementInfos;", "allExpirationDatesByProduct", "", "", "Ljava/util/Date;", "allPurchaseDatesByProduct", "schemaVersion", "", "firstSeen", "originalAppUserId", "originalPurchaseDate", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;)V", "getAllExpirationDatesByProduct", "()Ljava/util/Map;", "getAllPurchaseDatesByProduct", "getEntitlements", "()Lcom/revenuecat/purchases/EntitlementInfos;", "getFirstSeen", "()Ljava/util/Date;", "getOriginalAppUserId", "()Ljava/lang/String;", "getOriginalPurchaseDate", "getSchemaVersion", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class ComparableData {
    private final java.util.Map<java.lang.String, java.util.Date> allExpirationDatesByProduct;
    private final java.util.Map<java.lang.String, java.util.Date> allPurchaseDatesByProduct;
    private final com.revenuecat.purchases.EntitlementInfos entitlements;
    private final java.util.Date firstSeen;
    private final java.lang.String originalAppUserId;
    private final java.util.Date originalPurchaseDate;
    private final int schemaVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparableData(com.revenuecat.purchases.EntitlementInfos entitlements, java.util.Map<java.lang.String, ? extends java.util.Date> allExpirationDatesByProduct, java.util.Map<java.lang.String, ? extends java.util.Date> allPurchaseDatesByProduct, int i3, java.util.Date firstSeen, java.lang.String originalAppUserId, java.util.Date date) {
        kotlin.jvm.internal.m.e(entitlements, "entitlements");
        kotlin.jvm.internal.m.e(allExpirationDatesByProduct, "allExpirationDatesByProduct");
        kotlin.jvm.internal.m.e(allPurchaseDatesByProduct, "allPurchaseDatesByProduct");
        kotlin.jvm.internal.m.e(firstSeen, "firstSeen");
        kotlin.jvm.internal.m.e(originalAppUserId, "originalAppUserId");
        this.entitlements = entitlements;
        this.allExpirationDatesByProduct = allExpirationDatesByProduct;
        this.allPurchaseDatesByProduct = allPurchaseDatesByProduct;
        this.schemaVersion = i3;
        this.firstSeen = firstSeen;
        this.originalAppUserId = originalAppUserId;
        this.originalPurchaseDate = date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.ComparableData copy$default(com.revenuecat.purchases.ComparableData comparableData, com.revenuecat.purchases.EntitlementInfos entitlementInfos, java.util.Map map, java.util.Map map2, int i3, java.util.Date date, java.lang.String str, java.util.Date date2, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            entitlementInfos = comparableData.entitlements;
        }
        if ((i9 & 2) != 0) {
            map = comparableData.allExpirationDatesByProduct;
        }
        if ((i9 & 4) != 0) {
            map2 = comparableData.allPurchaseDatesByProduct;
        }
        if ((i9 & 8) != 0) {
            i3 = comparableData.schemaVersion;
        }
        if ((i9 & 16) != 0) {
            date = comparableData.firstSeen;
        }
        if ((i9 & 32) != 0) {
            str = comparableData.originalAppUserId;
        }
        if ((i9 & 64) != 0) {
            date2 = comparableData.originalPurchaseDate;
        }
        java.lang.String str2 = str;
        java.util.Date date3 = date2;
        java.util.Date date4 = date;
        java.util.Map map3 = map2;
        return comparableData.copy(entitlementInfos, map, map3, i3, date4, str2, date3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final java.util.Map<java.lang.String, java.util.Date> component2() {
        return this.allExpirationDatesByProduct;
    }

    public final java.util.Map<java.lang.String, java.util.Date> component3() {
        return this.allPurchaseDatesByProduct;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.util.Date getFirstSeen() {
        return this.firstSeen;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.util.Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final com.revenuecat.purchases.ComparableData copy(com.revenuecat.purchases.EntitlementInfos entitlements, java.util.Map<java.lang.String, ? extends java.util.Date> allExpirationDatesByProduct, java.util.Map<java.lang.String, ? extends java.util.Date> allPurchaseDatesByProduct, int schemaVersion, java.util.Date firstSeen, java.lang.String originalAppUserId, java.util.Date originalPurchaseDate) {
        kotlin.jvm.internal.m.e(entitlements, "entitlements");
        kotlin.jvm.internal.m.e(allExpirationDatesByProduct, "allExpirationDatesByProduct");
        kotlin.jvm.internal.m.e(allPurchaseDatesByProduct, "allPurchaseDatesByProduct");
        kotlin.jvm.internal.m.e(firstSeen, "firstSeen");
        kotlin.jvm.internal.m.e(originalAppUserId, "originalAppUserId");
        return new com.revenuecat.purchases.ComparableData(entitlements, allExpirationDatesByProduct, allPurchaseDatesByProduct, schemaVersion, firstSeen, originalAppUserId, originalPurchaseDate);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.ComparableData)) {
            return false;
        }
        com.revenuecat.purchases.ComparableData comparableData = (com.revenuecat.purchases.ComparableData) other;
        return kotlin.jvm.internal.m.a(this.entitlements, comparableData.entitlements) && kotlin.jvm.internal.m.a(this.allExpirationDatesByProduct, comparableData.allExpirationDatesByProduct) && kotlin.jvm.internal.m.a(this.allPurchaseDatesByProduct, comparableData.allPurchaseDatesByProduct) && this.schemaVersion == comparableData.schemaVersion && kotlin.jvm.internal.m.a(this.firstSeen, comparableData.firstSeen) && kotlin.jvm.internal.m.a(this.originalAppUserId, comparableData.originalAppUserId) && kotlin.jvm.internal.m.a(this.originalPurchaseDate, comparableData.originalPurchaseDate);
    }

    public final java.util.Map<java.lang.String, java.util.Date> getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final java.util.Map<java.lang.String, java.util.Date> getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final com.revenuecat.purchases.EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final java.util.Date getFirstSeen() {
        return this.firstSeen;
    }

    public final java.lang.String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final java.util.Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public int hashCode() {
        int iA = B2.a.a((this.firstSeen.hashCode() + p121o0.p.d(this.schemaVersion, B2.a.c(B2.a.c(this.entitlements.hashCode() * 31, 31, this.allExpirationDatesByProduct), 31, this.allPurchaseDatesByProduct), 31)) * 31, 31, this.originalAppUserId);
        java.util.Date date = this.originalPurchaseDate;
        return iA + (date == null ? 0 : date.hashCode());
    }

    public java.lang.String toString() {
        return "ComparableData(entitlements=" + this.entitlements + ", allExpirationDatesByProduct=" + this.allExpirationDatesByProduct + ", allPurchaseDatesByProduct=" + this.allPurchaseDatesByProduct + ", schemaVersion=" + this.schemaVersion + ", firstSeen=" + this.firstSeen + ", originalAppUserId=" + this.originalAppUserId + ", originalPurchaseDate=" + this.originalPurchaseDate + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparableData(com.revenuecat.purchases.CustomerInfo customerInfo) {
        this(customerInfo.getEntitlements(), customerInfo.getAllExpirationDatesByProduct(), customerInfo.getAllPurchaseDatesByProduct(), customerInfo.getSchemaVersion(), customerInfo.getFirstSeen(), customerInfo.getOriginalAppUserId(), customerInfo.getOriginalPurchaseDate());
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
    }
}
