package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0087\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0002\u0010\u0016B¯\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0002\u0010\u001cB)\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0002\u0010$J\b\u0010A\u001a\u00020\u0003H\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0011\u0010,\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010-R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0011\u0010?\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-¨\u0006B"}, d2 = {"Lcom/revenuecat/purchases/SubscriptionInfo;", "", "productIdentifier", "", "purchaseDate", "Ljava/util/Date;", "originalPurchaseDate", "expiresDate", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "unsubscribeDetectedAt", "isSandbox", "", "billingIssuesDetectedAt", "gracePeriodExpiresDate", "ownershipType", "Lcom/revenuecat/purchases/OwnershipType;", "periodType", "Lcom/revenuecat/purchases/PeriodType;", "refundedAt", "storeTransactionId", "requestDate", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;)V", "autoResumeDate", "displayName", "price", "Lcom/revenuecat/purchases/models/Price;", "productPlanIdentifier", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/util/Date;)V", io.sentry.protocol.Response.TYPE, "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", io.sentry.protocol.Device.JsonKeys.LOCALE, "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Date;Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;Ljava/util/Locale;)V", "managementURL", "Landroid/net/Uri;", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;)V", "getAutoResumeDate", "()Ljava/util/Date;", "getBillingIssuesDetectedAt", "getDisplayName", "()Ljava/lang/String;", "getExpiresDate", "getGracePeriodExpiresDate", "isActive", "()Z", "getManagementURL", "()Landroid/net/Uri;", "getOriginalPurchaseDate", "getOwnershipType", "()Lcom/revenuecat/purchases/OwnershipType;", "getPeriodType", "()Lcom/revenuecat/purchases/PeriodType;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "getProductIdentifier", "getProductPlanIdentifier", "getPurchaseDate", "getRefundedAt", "getStore", "()Lcom/revenuecat/purchases/Store;", "getStoreTransactionId", "getUnsubscribeDetectedAt", "willRenew", "getWillRenew", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriptionInfo {
    private final java.util.Date autoResumeDate;
    private final java.util.Date billingIssuesDetectedAt;
    private final java.lang.String displayName;
    private final java.util.Date expiresDate;
    private final java.util.Date gracePeriodExpiresDate;
    private final boolean isActive;
    private final boolean isSandbox;
    private final android.net.Uri managementURL;
    private final java.util.Date originalPurchaseDate;
    private final com.revenuecat.purchases.OwnershipType ownershipType;
    private final com.revenuecat.purchases.PeriodType periodType;
    private final com.revenuecat.purchases.models.Price price;
    private final java.lang.String productIdentifier;
    private final java.lang.String productPlanIdentifier;
    private final java.util.Date purchaseDate;
    private final java.util.Date refundedAt;
    private final java.util.Date requestDate;
    private final com.revenuecat.purchases.Store store;
    private final java.lang.String storeTransactionId;
    private final java.util.Date unsubscribeDetectedAt;
    private final boolean willRenew;

    public SubscriptionInfo(java.lang.String productIdentifier, java.util.Date purchaseDate, java.util.Date date, java.util.Date date2, com.revenuecat.purchases.Store store, java.util.Date date3, boolean z6, java.util.Date date4, java.util.Date date5, com.revenuecat.purchases.OwnershipType ownershipType, com.revenuecat.purchases.PeriodType periodType, java.util.Date date6, java.lang.String str, java.util.Date date7, java.lang.String str2, com.revenuecat.purchases.models.Price price, java.lang.String str3, android.net.Uri uri, java.util.Date requestDate) {
        kotlin.jvm.internal.m.e(productIdentifier, "productIdentifier");
        kotlin.jvm.internal.m.e(purchaseDate, "purchaseDate");
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(ownershipType, "ownershipType");
        kotlin.jvm.internal.m.e(periodType, "periodType");
        kotlin.jvm.internal.m.e(requestDate, "requestDate");
        this.productIdentifier = productIdentifier;
        this.purchaseDate = purchaseDate;
        this.originalPurchaseDate = date;
        this.expiresDate = date2;
        this.store = store;
        this.unsubscribeDetectedAt = date3;
        this.isSandbox = z6;
        this.billingIssuesDetectedAt = date4;
        this.gracePeriodExpiresDate = date5;
        this.ownershipType = ownershipType;
        this.periodType = periodType;
        this.refundedAt = date6;
        this.storeTransactionId = str;
        this.autoResumeDate = date7;
        this.displayName = str2;
        this.price = price;
        this.productPlanIdentifier = str3;
        this.managementURL = uri;
        this.requestDate = requestDate;
        this.isActive = com.revenuecat.purchases.utils.DateHelper.Companion.m283isDateActiveSxA4cEA$default(com.revenuecat.purchases.utils.DateHelper.INSTANCE, date2, requestDate, 0L, 4, null).isActive();
        this.willRenew = com.revenuecat.purchases.utils.EntitlementInfoHelper.INSTANCE.getWillRenew(store, date2, date3, date4, periodType);
    }

    public final java.util.Date getAutoResumeDate() {
        return this.autoResumeDate;
    }

    public final java.util.Date getBillingIssuesDetectedAt() {
        return this.billingIssuesDetectedAt;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.util.Date getExpiresDate() {
        return this.expiresDate;
    }

    public final java.util.Date getGracePeriodExpiresDate() {
        return this.gracePeriodExpiresDate;
    }

    public final android.net.Uri getManagementURL() {
        return this.managementURL;
    }

    public final java.util.Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final com.revenuecat.purchases.OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final com.revenuecat.purchases.PeriodType getPeriodType() {
        return this.periodType;
    }

    public final com.revenuecat.purchases.models.Price getPrice() {
        return this.price;
    }

    public final java.lang.String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final java.lang.String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    public final java.util.Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final java.util.Date getRefundedAt() {
        return this.refundedAt;
    }

    public final com.revenuecat.purchases.Store getStore() {
        return this.store;
    }

    public final java.lang.String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final java.util.Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    /* JADX INFO: renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: isSandbox, reason: from getter */
    public final boolean getIsSandbox() {
        return this.isSandbox;
    }

    public java.lang.String toString() {
        return O7.r.T("\n            SubscriptionInfo {\n                purchaseDate: " + this.purchaseDate + ",\n                originalPurchaseDate: " + this.originalPurchaseDate + ",\n                expiresDate: " + this.expiresDate + ",\n                store: " + this.store + ",\n                isSandbox: " + this.isSandbox + ",\n                unsubscribeDetectedAt: " + this.unsubscribeDetectedAt + ",\n                billingIssuesDetectedAt: " + this.billingIssuesDetectedAt + ",\n                gracePeriodExpiresDate: " + this.gracePeriodExpiresDate + ",\n                ownershipType: " + this.ownershipType + ",\n                periodType: " + this.periodType + ",\n                refundedAt: " + this.refundedAt + ",\n                storeTransactionId: " + this.storeTransactionId + ",\n                isActive: " + this.isActive + ",\n                willRenew: " + this.willRenew + ",\n                price: " + this.price + ",\n                productPlanIdentifier: " + this.productPlanIdentifier + ",\n                displayName: " + this.displayName + ",\n                autoResumeDate: " + this.autoResumeDate + ",\n                managementURL: " + this.managementURL + ",\n                requestDate: " + this.requestDate + ",\n                productIdentifier: " + this.productIdentifier + "\n            }\n        ");
    }

    public /* synthetic */ SubscriptionInfo(java.lang.String str, java.util.Date date, java.util.Date date2, java.util.Date date3, com.revenuecat.purchases.Store store, java.util.Date date4, boolean z6, java.util.Date date5, java.util.Date date6, com.revenuecat.purchases.OwnershipType ownershipType, com.revenuecat.purchases.PeriodType periodType, java.util.Date date7, java.lang.String str2, java.util.Date date8, java.lang.String str3, com.revenuecat.purchases.models.Price price, java.lang.String str4, android.net.Uri uri, java.util.Date date9, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, date, date2, date3, store, date4, z6, date5, date6, (i3 & 512) != 0 ? com.revenuecat.purchases.OwnershipType.UNKNOWN : ownershipType, periodType, date7, str2, date8, str3, price, str4, uri, date9);
    }

    public /* synthetic */ SubscriptionInfo(java.lang.String str, java.util.Date date, java.util.Date date2, java.util.Date date3, com.revenuecat.purchases.Store store, java.util.Date date4, boolean z6, java.util.Date date5, java.util.Date date6, com.revenuecat.purchases.OwnershipType ownershipType, com.revenuecat.purchases.PeriodType periodType, java.util.Date date7, java.lang.String str2, java.util.Date date8, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, date, date2, date3, store, date4, z6, date5, date6, (i3 & 512) != 0 ? com.revenuecat.purchases.OwnershipType.UNKNOWN : ownershipType, periodType, date7, str2, date8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public SubscriptionInfo(java.lang.String productIdentifier, java.util.Date purchaseDate, java.util.Date date, java.util.Date date2, com.revenuecat.purchases.Store store, java.util.Date date3, boolean z6, java.util.Date date4, java.util.Date date5, com.revenuecat.purchases.OwnershipType ownershipType, com.revenuecat.purchases.PeriodType periodType, java.util.Date date6, java.lang.String str, java.util.Date requestDate) {
        this(productIdentifier, purchaseDate, date, date2, store, date3, z6, date4, date5, ownershipType, periodType, date6, str, null, null, null, null, null, requestDate);
        kotlin.jvm.internal.m.e(productIdentifier, "productIdentifier");
        kotlin.jvm.internal.m.e(purchaseDate, "purchaseDate");
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(ownershipType, "ownershipType");
        kotlin.jvm.internal.m.e(periodType, "periodType");
        kotlin.jvm.internal.m.e(requestDate, "requestDate");
    }

    public /* synthetic */ SubscriptionInfo(java.lang.String str, java.util.Date date, java.util.Date date2, java.util.Date date3, com.revenuecat.purchases.Store store, java.util.Date date4, boolean z6, java.util.Date date5, java.util.Date date6, com.revenuecat.purchases.OwnershipType ownershipType, com.revenuecat.purchases.PeriodType periodType, java.util.Date date7, java.lang.String str2, java.util.Date date8, java.lang.String str3, com.revenuecat.purchases.models.Price price, java.lang.String str4, java.util.Date date9, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, date, date2, date3, store, date4, z6, date5, date6, (i3 & 512) != 0 ? com.revenuecat.purchases.OwnershipType.UNKNOWN : ownershipType, periodType, date7, str2, date8, str3, price, str4, date9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public SubscriptionInfo(java.lang.String productIdentifier, java.util.Date purchaseDate, java.util.Date date, java.util.Date date2, com.revenuecat.purchases.Store store, java.util.Date date3, boolean z6, java.util.Date date4, java.util.Date date5, com.revenuecat.purchases.OwnershipType ownershipType, com.revenuecat.purchases.PeriodType periodType, java.util.Date date6, java.lang.String str, java.util.Date date7, java.lang.String str2, com.revenuecat.purchases.models.Price price, java.lang.String str3, java.util.Date requestDate) {
        this(productIdentifier, purchaseDate, date, date2, store, date3, z6, date4, date5, ownershipType, periodType, date6, str, date7, str2, price, str3, null, requestDate);
        kotlin.jvm.internal.m.e(productIdentifier, "productIdentifier");
        kotlin.jvm.internal.m.e(purchaseDate, "purchaseDate");
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(ownershipType, "ownershipType");
        kotlin.jvm.internal.m.e(periodType, "periodType");
        kotlin.jvm.internal.m.e(requestDate, "requestDate");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubscriptionInfo(java.lang.String str, java.util.Date date, com.revenuecat.purchases.common.responses.SubscriptionInfoResponse subscriptionInfoResponse, java.util.Locale locale, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        if ((i3 & 8) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.m.d(locale, "getDefault()");
        }
        this(str, date, subscriptionInfoResponse, locale);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SubscriptionInfo(java.lang.String productIdentifier, java.util.Date requestDate, com.revenuecat.purchases.common.responses.SubscriptionInfoResponse response, java.util.Locale locale) {
        kotlin.jvm.internal.m.e(productIdentifier, "productIdentifier");
        kotlin.jvm.internal.m.e(requestDate, "requestDate");
        kotlin.jvm.internal.m.e(response, "response");
        kotlin.jvm.internal.m.e(locale, "locale");
        java.util.Date purchaseDate = response.getPurchaseDate();
        java.util.Date originalPurchaseDate = response.getOriginalPurchaseDate();
        java.util.Date expiresDate = response.getExpiresDate();
        com.revenuecat.purchases.Store store = response.getStore();
        boolean zIsSandbox = response.isSandbox();
        java.util.Date unsubscribeDetectedAt = response.getUnsubscribeDetectedAt();
        java.util.Date billingIssuesDetectedAt = response.getBillingIssuesDetectedAt();
        java.util.Date gracePeriodExpiresDate = response.getGracePeriodExpiresDate();
        com.revenuecat.purchases.OwnershipType ownershipType = response.getOwnershipType();
        com.revenuecat.purchases.PeriodType periodType = response.getPeriodType();
        java.util.Date refundedAt = response.getRefundedAt();
        java.lang.String storeTransactionId = response.getStoreTransactionId();
        java.util.Date autoResumeDate = response.getAutoResumeDate();
        java.lang.String displayName = response.getDisplayName();
        com.revenuecat.purchases.common.responses.SubscriptionInfoResponse.PriceResponse price = response.getPrice();
        com.revenuecat.purchases.models.Price price2 = price != null ? price.toPrice(locale) : null;
        java.lang.String productPlanIdentifier = response.getProductPlanIdentifier();
        java.lang.String managementURL = response.getManagementURL();
        this(productIdentifier, purchaseDate, originalPurchaseDate, expiresDate, store, unsubscribeDetectedAt, zIsSandbox, billingIssuesDetectedAt, gracePeriodExpiresDate, ownershipType, periodType, refundedAt, storeTransactionId, autoResumeDate, displayName, price2, productPlanIdentifier, managementURL != null ? android.net.Uri.parse(managementURL) : null, requestDate);
    }
}
