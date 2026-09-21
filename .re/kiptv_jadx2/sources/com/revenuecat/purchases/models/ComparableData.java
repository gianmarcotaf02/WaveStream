package com.revenuecat.purchases.models;

import B2.a;
import Y6.f;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p121o0.p;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0081\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001aJ\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0017HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u000fHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0014HÆ\u0003J¤\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u0010\u0010\u001bR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006D"}, d2 = {"Lcom/revenuecat/purchases/models/ComparableData;", "", "storeTransaction", "Lcom/revenuecat/purchases/models/StoreTransaction;", "(Lcom/revenuecat/purchases/models/StoreTransaction;)V", "orderId", "", "productIds", "", "type", "Lcom/revenuecat/purchases/ProductType;", "purchaseTime", "", "purchaseToken", "purchaseState", "Lcom/revenuecat/purchases/models/PurchaseState;", "isAutoRenewing", "", "signature", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "storeUserID", "purchaseType", "Lcom/revenuecat/purchases/models/PurchaseType;", "marketplace", "subscriptionOptionId", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarketplace", "()Ljava/lang/String;", "getOrderId", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "getProductIds", "()Ljava/util/List;", "getPurchaseState", "()Lcom/revenuecat/purchases/models/PurchaseState;", "getPurchaseTime", "()J", "getPurchaseToken", "getPurchaseType", "()Lcom/revenuecat/purchases/models/PurchaseType;", "getSignature", "getStoreUserID", "getSubscriptionOptionId", "getType", "()Lcom/revenuecat/purchases/ProductType;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/models/ComparableData;", "equals", Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class ComparableData {
    private final Boolean isAutoRenewing;
    private final String marketplace;
    private final String orderId;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<String> productIds;
    private final PurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final PurchaseType purchaseType;
    private final String signature;
    private final String storeUserID;
    private final String subscriptionOptionId;
    private final ProductType type;

    public ComparableData(String str, List<String> productIds, ProductType type, long j, String purchaseToken, PurchaseState purchaseState, Boolean bool, String str2, PresentedOfferingContext presentedOfferingContext, String str3, PurchaseType purchaseType, String str4, String str5) {
        m.e(productIds, "productIds");
        m.e(type, "type");
        m.e(purchaseToken, "purchaseToken");
        m.e(purchaseState, "purchaseState");
        m.e(purchaseType, "purchaseType");
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

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final List<String> component2() {
        return this.productIds;
    }

    public final ProductType getType() {
        return this.type;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final Boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final ComparableData copy(String orderId, List<String> productIds, ProductType type, long purchaseTime, String purchaseToken, PurchaseState purchaseState, Boolean isAutoRenewing, String signature, PresentedOfferingContext presentedOfferingContext, String storeUserID, PurchaseType purchaseType, String marketplace, String subscriptionOptionId) {
        m.e(productIds, "productIds");
        m.e(type, "type");
        m.e(purchaseToken, "purchaseToken");
        m.e(purchaseState, "purchaseState");
        m.e(purchaseType, "purchaseType");
        return new ComparableData(orderId, productIds, type, purchaseTime, purchaseToken, purchaseState, isAutoRenewing, signature, presentedOfferingContext, storeUserID, purchaseType, marketplace, subscriptionOptionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComparableData)) {
            return false;
        }
        ComparableData comparableData = (ComparableData) other;
        return m.a(this.orderId, comparableData.orderId) && m.a(this.productIds, comparableData.productIds) && this.type == comparableData.type && this.purchaseTime == comparableData.purchaseTime && m.a(this.purchaseToken, comparableData.purchaseToken) && this.purchaseState == comparableData.purchaseState && m.a(this.isAutoRenewing, comparableData.isAutoRenewing) && m.a(this.signature, comparableData.signature) && m.a(this.presentedOfferingContext, comparableData.presentedOfferingContext) && m.a(this.storeUserID, comparableData.storeUserID) && this.purchaseType == comparableData.purchaseType && m.a(this.marketplace, comparableData.marketplace) && m.a(this.subscriptionOptionId, comparableData.subscriptionOptionId);
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (this.purchaseState.hashCode() + a.a(p.e((this.type.hashCode() + a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.productIds)) * 31, 31, this.purchaseTime), 31, this.purchaseToken)) * 31;
        Boolean bool = this.isAutoRenewing;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.signature;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode4 = (iHashCode3 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        String str3 = this.storeUserID;
        int iHashCode5 = (this.purchaseType.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.marketplace;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subscriptionOptionId;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ComparableData(orderId=");
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
        return f.l(sb, this.subscriptionOptionId, ')');
    }

    public ComparableData(StoreTransaction storeTransaction) {
        this(storeTransaction.getOrderId(), storeTransaction.getProductIds(), storeTransaction.getType(), storeTransaction.getPurchaseTime(), storeTransaction.getPurchaseToken(), storeTransaction.getPurchaseState(), storeTransaction.getIsAutoRenewing(), storeTransaction.getSignature(), storeTransaction.getPresentedOfferingContext(), storeTransaction.getStoreUserID(), storeTransaction.getPurchaseType(), storeTransaction.getMarketplace(), storeTransaction.getSubscriptionOptionId());
        m.e(storeTransaction, "storeTransaction");
    }
}
