package com.revenuecat.purchases.ads.rewardverification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationToken;", "", "customData", "", "clientTransactionId", "appUserID", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppUserID", "()Ljava/lang/String;", "getClientTransactionId", "getCustomData", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RewardVerificationToken {
    private final java.lang.String appUserID;
    private final java.lang.String clientTransactionId;
    private final java.lang.String customData;

    public RewardVerificationToken(java.lang.String customData, java.lang.String clientTransactionId, java.lang.String appUserID) {
        kotlin.jvm.internal.m.e(customData, "customData");
        kotlin.jvm.internal.m.e(clientTransactionId, "clientTransactionId");
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        this.customData = customData;
        this.clientTransactionId = clientTransactionId;
        this.appUserID = appUserID;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.ads.rewardverification.RewardVerificationToken)) {
            return false;
        }
        com.revenuecat.purchases.ads.rewardverification.RewardVerificationToken rewardVerificationToken = (com.revenuecat.purchases.ads.rewardverification.RewardVerificationToken) obj;
        return kotlin.jvm.internal.m.a(this.customData, rewardVerificationToken.customData) && kotlin.jvm.internal.m.a(this.clientTransactionId, rewardVerificationToken.clientTransactionId) && kotlin.jvm.internal.m.a(this.appUserID, rewardVerificationToken.appUserID);
    }

    public final java.lang.String getAppUserID() {
        return this.appUserID;
    }

    public final java.lang.String getClientTransactionId() {
        return this.clientTransactionId;
    }

    public final java.lang.String getCustomData() {
        return this.customData;
    }

    public int hashCode() {
        return this.appUserID.hashCode() + B2.a.a(this.customData.hashCode() * 31, 31, this.clientTransactionId);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardVerificationToken(customData=");
        sb.append(this.customData);
        sb.append(", clientTransactionId=");
        sb.append(this.clientTransactionId);
        sb.append(", appUserID=");
        return Y6.f.l(sb, this.appUserID, ')');
    }
}
