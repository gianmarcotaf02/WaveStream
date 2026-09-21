package com.revenuecat.purchases.customercenter;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomActionData;", "", "actionIdentifier", "", "purchaseIdentifier", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionIdentifier", "()Ljava/lang/String;", "getPurchaseIdentifier", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomActionData {
    private final java.lang.String actionIdentifier;
    private final java.lang.String purchaseIdentifier;

    public CustomActionData(java.lang.String actionIdentifier, java.lang.String str) {
        kotlin.jvm.internal.m.e(actionIdentifier, "actionIdentifier");
        this.actionIdentifier = actionIdentifier;
        this.purchaseIdentifier = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.customercenter.CustomActionData)) {
            return false;
        }
        com.revenuecat.purchases.customercenter.CustomActionData customActionData = (com.revenuecat.purchases.customercenter.CustomActionData) obj;
        return kotlin.jvm.internal.m.a(this.actionIdentifier, customActionData.actionIdentifier) && kotlin.jvm.internal.m.a(this.purchaseIdentifier, customActionData.purchaseIdentifier);
    }

    public final java.lang.String getActionIdentifier() {
        return this.actionIdentifier;
    }

    public final java.lang.String getPurchaseIdentifier() {
        return this.purchaseIdentifier;
    }

    public int hashCode() {
        int iHashCode = this.actionIdentifier.hashCode() * 31;
        java.lang.String str = this.purchaseIdentifier;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomActionData(actionIdentifier=");
        sb.append(this.actionIdentifier);
        sb.append(", purchaseIdentifier=");
        return Y6.f.l(sb, this.purchaseIdentifier, ')');
    }
}
