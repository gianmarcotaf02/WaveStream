package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/PurchasesState;", "", "allowSharingPlayStoreAccount", "", "purchaseCallbacksByProductId", "", "", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "deprecatedProductChangeCallback", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "appInBackground", "firstTimeInForeground", "(Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;ZZ)V", "getAllowSharingPlayStoreAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAppInBackground", "()Z", "getDeprecatedProductChangeCallback", "()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "getFirstTimeInForeground", "getPurchaseCallbacksByProductId", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;ZZ)Lcom/revenuecat/purchases/PurchasesState;", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class PurchasesState {
    private final java.lang.Boolean allowSharingPlayStoreAccount;
    private final boolean appInBackground;
    private final com.revenuecat.purchases.interfaces.ProductChangeCallback deprecatedProductChangeCallback;
    private final boolean firstTimeInForeground;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.interfaces.PurchaseCallback> purchaseCallbacksByProductId;

    public PurchasesState() {
        this(null, null, null, false, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.PurchasesState copy$default(com.revenuecat.purchases.PurchasesState purchasesState, java.lang.Boolean bool, java.util.Map map, com.revenuecat.purchases.interfaces.ProductChangeCallback productChangeCallback, boolean z6, boolean z9, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            bool = purchasesState.allowSharingPlayStoreAccount;
        }
        if ((i3 & 2) != 0) {
            map = purchasesState.purchaseCallbacksByProductId;
        }
        if ((i3 & 4) != 0) {
            productChangeCallback = purchasesState.deprecatedProductChangeCallback;
        }
        if ((i3 & 8) != 0) {
            z6 = purchasesState.appInBackground;
        }
        if ((i3 & 16) != 0) {
            z9 = purchasesState.firstTimeInForeground;
        }
        boolean z10 = z9;
        com.revenuecat.purchases.interfaces.ProductChangeCallback productChangeCallback2 = productChangeCallback;
        return purchasesState.copy(bool, map, productChangeCallback2, z6, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.interfaces.PurchaseCallback> component2() {
        return this.purchaseCallbacksByProductId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.revenuecat.purchases.interfaces.ProductChangeCallback getDeprecatedProductChangeCallback() {
        return this.deprecatedProductChangeCallback;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final com.revenuecat.purchases.PurchasesState copy(java.lang.Boolean allowSharingPlayStoreAccount, java.util.Map<java.lang.String, ? extends com.revenuecat.purchases.interfaces.PurchaseCallback> purchaseCallbacksByProductId, com.revenuecat.purchases.interfaces.ProductChangeCallback deprecatedProductChangeCallback, boolean appInBackground, boolean firstTimeInForeground) {
        kotlin.jvm.internal.m.e(purchaseCallbacksByProductId, "purchaseCallbacksByProductId");
        return new com.revenuecat.purchases.PurchasesState(allowSharingPlayStoreAccount, purchaseCallbacksByProductId, deprecatedProductChangeCallback, appInBackground, firstTimeInForeground);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.PurchasesState)) {
            return false;
        }
        com.revenuecat.purchases.PurchasesState purchasesState = (com.revenuecat.purchases.PurchasesState) other;
        return kotlin.jvm.internal.m.a(this.allowSharingPlayStoreAccount, purchasesState.allowSharingPlayStoreAccount) && kotlin.jvm.internal.m.a(this.purchaseCallbacksByProductId, purchasesState.purchaseCallbacksByProductId) && kotlin.jvm.internal.m.a(this.deprecatedProductChangeCallback, purchasesState.deprecatedProductChangeCallback) && this.appInBackground == purchasesState.appInBackground && this.firstTimeInForeground == purchasesState.firstTimeInForeground;
    }

    public final java.lang.Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final com.revenuecat.purchases.interfaces.ProductChangeCallback getDeprecatedProductChangeCallback() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.interfaces.PurchaseCallback> getPurchaseCallbacksByProductId() {
        return this.purchaseCallbacksByProductId;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.allowSharingPlayStoreAccount;
        int iC = B2.a.c((bool == null ? 0 : bool.hashCode()) * 31, 31, this.purchaseCallbacksByProductId);
        com.revenuecat.purchases.interfaces.ProductChangeCallback productChangeCallback = this.deprecatedProductChangeCallback;
        return java.lang.Boolean.hashCode(this.firstTimeInForeground) + p121o0.p.f((iC + (productChangeCallback != null ? productChangeCallback.hashCode() : 0)) * 31, 31, this.appInBackground);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PurchasesState(allowSharingPlayStoreAccount=");
        sb.append(this.allowSharingPlayStoreAccount);
        sb.append(", purchaseCallbacksByProductId=");
        sb.append(this.purchaseCallbacksByProductId);
        sb.append(", deprecatedProductChangeCallback=");
        sb.append(this.deprecatedProductChangeCallback);
        sb.append(", appInBackground=");
        sb.append(this.appInBackground);
        sb.append(", firstTimeInForeground=");
        return v5.L.a(sb, this.firstTimeInForeground, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesState(java.lang.Boolean bool, java.util.Map<java.lang.String, ? extends com.revenuecat.purchases.interfaces.PurchaseCallback> purchaseCallbacksByProductId, com.revenuecat.purchases.interfaces.ProductChangeCallback productChangeCallback, boolean z6, boolean z9) {
        kotlin.jvm.internal.m.e(purchaseCallbacksByProductId, "purchaseCallbacksByProductId");
        this.allowSharingPlayStoreAccount = bool;
        this.purchaseCallbacksByProductId = purchaseCallbacksByProductId;
        this.deprecatedProductChangeCallback = productChangeCallback;
        this.appInBackground = z6;
        this.firstTimeInForeground = z9;
    }

    public /* synthetic */ PurchasesState(java.lang.Boolean bool, java.util.Map map, com.revenuecat.purchases.interfaces.ProductChangeCallback productChangeCallback, boolean z6, boolean z9, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : bool, (i3 & 2) != 0 ? p078i6.x.f23206h : map, (i3 & 4) != 0 ? null : productChangeCallback, (i3 & 8) != 0 ? true : z6, (i3 & 16) != 0 ? true : z9);
    }
}
