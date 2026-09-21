package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "", "oldPurchase", "Lcom/revenuecat/purchases/models/StoreTransaction;", "replacementMode", "Lcom/revenuecat/purchases/ReplacementMode;", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/ReplacementMode;)V", "getOldPurchase", "()Lcom/revenuecat/purchases/models/StoreTransaction;", "getReplacementMode", "()Lcom/revenuecat/purchases/ReplacementMode;", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class ReplaceProductInfo {
    private final com.revenuecat.purchases.models.StoreTransaction oldPurchase;
    private final com.revenuecat.purchases.ReplacementMode replacementMode;

    public ReplaceProductInfo(com.revenuecat.purchases.models.StoreTransaction oldPurchase, com.revenuecat.purchases.ReplacementMode replacementMode) {
        kotlin.jvm.internal.m.e(oldPurchase, "oldPurchase");
        this.oldPurchase = oldPurchase;
        this.replacementMode = replacementMode;
    }

    public static /* synthetic */ com.revenuecat.purchases.common.ReplaceProductInfo copy$default(com.revenuecat.purchases.common.ReplaceProductInfo replaceProductInfo, com.revenuecat.purchases.models.StoreTransaction storeTransaction, com.revenuecat.purchases.ReplacementMode replacementMode, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            storeTransaction = replaceProductInfo.oldPurchase;
        }
        if ((i3 & 2) != 0) {
            replacementMode = replaceProductInfo.replacementMode;
        }
        return replaceProductInfo.copy(storeTransaction, replacementMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.revenuecat.purchases.models.StoreTransaction getOldPurchase() {
        return this.oldPurchase;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final com.revenuecat.purchases.common.ReplaceProductInfo copy(com.revenuecat.purchases.models.StoreTransaction oldPurchase, com.revenuecat.purchases.ReplacementMode replacementMode) {
        kotlin.jvm.internal.m.e(oldPurchase, "oldPurchase");
        return new com.revenuecat.purchases.common.ReplaceProductInfo(oldPurchase, replacementMode);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.ReplaceProductInfo)) {
            return false;
        }
        com.revenuecat.purchases.common.ReplaceProductInfo replaceProductInfo = (com.revenuecat.purchases.common.ReplaceProductInfo) other;
        return kotlin.jvm.internal.m.a(this.oldPurchase, replaceProductInfo.oldPurchase) && kotlin.jvm.internal.m.a(this.replacementMode, replaceProductInfo.replacementMode);
    }

    public final com.revenuecat.purchases.models.StoreTransaction getOldPurchase() {
        return this.oldPurchase;
    }

    public final com.revenuecat.purchases.ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public int hashCode() {
        int iHashCode = this.oldPurchase.hashCode() * 31;
        com.revenuecat.purchases.ReplacementMode replacementMode = this.replacementMode;
        return iHashCode + (replacementMode == null ? 0 : replacementMode.hashCode());
    }

    public java.lang.String toString() {
        return "ReplaceProductInfo(oldPurchase=" + this.oldPurchase + ", replacementMode=" + this.replacementMode + ')';
    }

    public /* synthetic */ ReplaceProductInfo(com.revenuecat.purchases.models.StoreTransaction storeTransaction, com.revenuecat.purchases.ReplacementMode replacementMode, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(storeTransaction, (i3 & 2) != 0 ? null : replacementMode);
    }
}
