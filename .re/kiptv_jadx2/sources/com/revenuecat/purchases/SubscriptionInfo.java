package com.revenuecat.purchases;

import O7.r;
import android.net.Uri;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.EntitlementInfoHelper;
import io.sentry.protocol.Device;
import io.sentry.protocol.Response;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0087\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0002\u0010\u0016B¯\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0002\u0010\u001cB)\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0002\u0010$J\b\u0010A\u001a\u00020\u0003H\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0011\u0010,\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010-R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0011\u0010?\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-¨\u0006B"}, d2 = {"Lcom/revenuecat/purchases/SubscriptionInfo;", "", "productIdentifier", "", "purchaseDate", "Ljava/util/Date;", "originalPurchaseDate", "expiresDate", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "unsubscribeDetectedAt", "isSandbox", "", "billingIssuesDetectedAt", "gracePeriodExpiresDate", "ownershipType", "Lcom/revenuecat/purchases/OwnershipType;", "periodType", "Lcom/revenuecat/purchases/PeriodType;", "refundedAt", "storeTransactionId", "requestDate", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;)V", "autoResumeDate", "displayName", "price", "Lcom/revenuecat/purchases/models/Price;", "productPlanIdentifier", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/util/Date;)V", Response.TYPE, "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", Device.JsonKeys.LOCALE, "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Date;Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;Ljava/util/Locale;)V", "managementURL", "Landroid/net/Uri;", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;)V", "getAutoResumeDate", "()Ljava/util/Date;", "getBillingIssuesDetectedAt", "getDisplayName", "()Ljava/lang/String;", "getExpiresDate", "getGracePeriodExpiresDate", "isActive", "()Z", "getManagementURL", "()Landroid/net/Uri;", "getOriginalPurchaseDate", "getOwnershipType", "()Lcom/revenuecat/purchases/OwnershipType;", "getPeriodType", "()Lcom/revenuecat/purchases/PeriodType;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "getProductIdentifier", "getProductPlanIdentifier", "getPurchaseDate", "getRefundedAt", "getStore", "()Lcom/revenuecat/purchases/Store;", "getStoreTransactionId", "getUnsubscribeDetectedAt", "willRenew", "getWillRenew", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriptionInfo {
    private final Date autoResumeDate;
    private final Date billingIssuesDetectedAt;
    private final String displayName;
    private final Date expiresDate;
    private final Date gracePeriodExpiresDate;
    private final boolean isActive;
    private final boolean isSandbox;
    private final Uri managementURL;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final Price price;
    private final String productIdentifier;
    private final String productPlanIdentifier;
    private final Date purchaseDate;
    private final Date refundedAt;
    private final Date requestDate;
    private final Store store;
    private final String storeTransactionId;
    private final Date unsubscribeDetectedAt;
    private final boolean willRenew;

    public SubscriptionInfo(String productIdentifier, Date purchaseDate, Date date, Date date2, Store store, Date date3, boolean z6, Date date4, Date date5, OwnershipType ownershipType, PeriodType periodType, Date date6, String str, Date date7, String str2, Price price, String str3, Uri uri, Date requestDate) {
        m.e(productIdentifier, "productIdentifier");
        m.e(purchaseDate, "purchaseDate");
        m.e(store, "store");
        m.e(ownershipType, "ownershipType");
        m.e(periodType, "periodType");
        m.e(requestDate, "requestDate");
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
        this.isActive = DateHelper.Companion.m283isDateActiveSxA4cEA$default(DateHelper.INSTANCE, date2, requestDate, 0L, 4, null).isActive();
        this.willRenew = EntitlementInfoHelper.INSTANCE.getWillRenew(store, date2, date3, date4, periodType);
    }

    public final Date getAutoResumeDate() {
        return this.autoResumeDate;
    }

    public final Date getBillingIssuesDetectedAt() {
        return this.billingIssuesDetectedAt;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Date getExpiresDate() {
        return this.expiresDate;
    }

    public final Date getGracePeriodExpiresDate() {
        return this.gracePeriodExpiresDate;
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final Date getRefundedAt() {
        return this.refundedAt;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    public final boolean getIsActive() {
        return this.isActive;
    }

    public final boolean getIsSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return r.T("\n            SubscriptionInfo {\n                purchaseDate: " + this.purchaseDate + ",\n                originalPurchaseDate: " + this.originalPurchaseDate + ",\n                expiresDate: " + this.expiresDate + ",\n                store: " + this.store + ",\n                isSandbox: " + this.isSandbox + ",\n                unsubscribeDetectedAt: " + this.unsubscribeDetectedAt + ",\n                billingIssuesDetectedAt: " + this.billingIssuesDetectedAt + ",\n                gracePeriodExpiresDate: " + this.gracePeriodExpiresDate + ",\n                ownershipType: " + this.ownershipType + ",\n                periodType: " + this.periodType + ",\n                refundedAt: " + this.refundedAt + ",\n                storeTransactionId: " + this.storeTransactionId + ",\n                isActive: " + this.isActive + ",\n                willRenew: " + this.willRenew + ",\n                price: " + this.price + ",\n                productPlanIdentifier: " + this.productPlanIdentifier + ",\n                displayName: " + this.displayName + ",\n                autoResumeDate: " + this.autoResumeDate + ",\n                managementURL: " + this.managementURL + ",\n                requestDate: " + this.requestDate + ",\n                productIdentifier: " + this.productIdentifier + "\n            }\n        ");
    }

    public SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store, Date date4, boolean z6, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str2, Date date8, String str3, Price price, String str4, Uri uri, Date date9, int i3, AbstractC2541f abstractC2541f) {
        this(str, date, date2, date3, store, date4, z6, date5, date6, (i3 & 512) != 0 ? OwnershipType.UNKNOWN : ownershipType, periodType, date7, str2, date8, str3, price, str4, uri, date9);
    }

    public SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store, Date date4, boolean z6, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str2, Date date8, int i3, AbstractC2541f abstractC2541f) {
        this(str, date, date2, date3, store, date4, z6, date5, date6, (i3 & 512) != 0 ? OwnershipType.UNKNOWN : ownershipType, periodType, date7, str2, date8);
    }

    @p070h6.c
    public SubscriptionInfo(String productIdentifier, Date purchaseDate, Date date, Date date2, Store store, Date date3, boolean z6, Date date4, Date date5, OwnershipType ownershipType, PeriodType periodType, Date date6, String str, Date requestDate) {
        this(productIdentifier, purchaseDate, date, date2, store, date3, z6, date4, date5, ownershipType, periodType, date6, str, null, null, null, null, null, requestDate);
        m.e(productIdentifier, "productIdentifier");
        m.e(purchaseDate, "purchaseDate");
        m.e(store, "store");
        m.e(ownershipType, "ownershipType");
        m.e(periodType, "periodType");
        m.e(requestDate, "requestDate");
    }

    public SubscriptionInfo(String str, Date date, Date date2, Date date3, Store store, Date date4, boolean z6, Date date5, Date date6, OwnershipType ownershipType, PeriodType periodType, Date date7, String str2, Date date8, String str3, Price price, String str4, Date date9, int i3, AbstractC2541f abstractC2541f) {
        this(str, date, date2, date3, store, date4, z6, date5, date6, (i3 & 512) != 0 ? OwnershipType.UNKNOWN : ownershipType, periodType, date7, str2, date8, str3, price, str4, date9);
    }

    @p070h6.c
    public SubscriptionInfo(String productIdentifier, Date purchaseDate, Date date, Date date2, Store store, Date date3, boolean z6, Date date4, Date date5, OwnershipType ownershipType, PeriodType periodType, Date date6, String str, Date date7, String str2, Price price, String str3, Date requestDate) {
        this(productIdentifier, purchaseDate, date, date2, store, date3, z6, date4, date5, ownershipType, periodType, date6, str, date7, str2, price, str3, null, requestDate);
        m.e(productIdentifier, "productIdentifier");
        m.e(purchaseDate, "purchaseDate");
        m.e(store, "store");
        m.e(ownershipType, "ownershipType");
        m.e(periodType, "periodType");
        m.e(requestDate, "requestDate");
    }

    public SubscriptionInfo(String str, Date date, SubscriptionInfoResponse subscriptionInfoResponse, Locale locale, int i3, AbstractC2541f abstractC2541f) {
        if ((i3 & 8) != 0) {
            locale = Locale.getDefault();
            m.d(locale, "getDefault()");
        }
        this(str, date, subscriptionInfoResponse, locale);
    }

    public SubscriptionInfo(String productIdentifier, Date requestDate, SubscriptionInfoResponse response, Locale locale) {
        m.e(productIdentifier, "productIdentifier");
        m.e(requestDate, "requestDate");
        m.e(response, "response");
        m.e(locale, "locale");
        Date purchaseDate = response.getPurchaseDate();
        Date originalPurchaseDate = response.getOriginalPurchaseDate();
        Date expiresDate = response.getExpiresDate();
        Store store = response.getStore();
        boolean zIsSandbox = response.isSandbox();
        Date unsubscribeDetectedAt = response.getUnsubscribeDetectedAt();
        Date billingIssuesDetectedAt = response.getBillingIssuesDetectedAt();
        Date gracePeriodExpiresDate = response.getGracePeriodExpiresDate();
        OwnershipType ownershipType = response.getOwnershipType();
        PeriodType periodType = response.getPeriodType();
        Date refundedAt = response.getRefundedAt();
        String storeTransactionId = response.getStoreTransactionId();
        Date autoResumeDate = response.getAutoResumeDate();
        String displayName = response.getDisplayName();
        SubscriptionInfoResponse.PriceResponse price = response.getPrice();
        Price price2 = price != null ? price.toPrice(locale) : null;
        String productPlanIdentifier = response.getProductPlanIdentifier();
        String managementURL = response.getManagementURL();
        this(productIdentifier, purchaseDate, originalPurchaseDate, expiresDate, store, unsubscribeDetectedAt, zIsSandbox, billingIssuesDetectedAt, gracePeriodExpiresDate, ownershipType, periodType, refundedAt, storeTransactionId, autoResumeDate, displayName, price2, productPlanIdentifier, managementURL != null ? Uri.parse(managementURL) : null, requestDate);
    }
}
