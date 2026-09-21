package com.revenuecat.purchases.ads.rewardverification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "", "Entitlement", "NoReward", "UnsupportedReward", "VirtualCurrency", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface VerifiedReward {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward$Entitlement;", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "expiresAt", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getExpiresAt", "()Ljava/util/Date;", "getIdentifier", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Entitlement implements com.revenuecat.purchases.ads.rewardverification.VerifiedReward {
        private final java.util.Date expiresAt;
        private final java.lang.String identifier;

        public Entitlement(java.lang.String identifier, java.util.Date expiresAt) {
            kotlin.jvm.internal.m.e(identifier, "identifier");
            kotlin.jvm.internal.m.e(expiresAt, "expiresAt");
            this.identifier = identifier;
            this.expiresAt = expiresAt;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.ads.rewardverification.VerifiedReward.Entitlement)) {
                return false;
            }
            com.revenuecat.purchases.ads.rewardverification.VerifiedReward.Entitlement entitlement = (com.revenuecat.purchases.ads.rewardverification.VerifiedReward.Entitlement) obj;
            return kotlin.jvm.internal.m.a(this.identifier, entitlement.identifier) && kotlin.jvm.internal.m.a(this.expiresAt, entitlement.expiresAt);
        }

        public final java.util.Date getExpiresAt() {
            return this.expiresAt;
        }

        public final java.lang.String getIdentifier() {
            return this.identifier;
        }

        public int hashCode() {
            return this.expiresAt.hashCode() + (this.identifier.hashCode() * 31);
        }

        public java.lang.String toString() {
            return "Entitlement(identifier=" + this.identifier + ", expiresAt=" + this.expiresAt + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward$NoReward;", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class NoReward implements com.revenuecat.purchases.ads.rewardverification.VerifiedReward {
        public static final com.revenuecat.purchases.ads.rewardverification.VerifiedReward.NoReward INSTANCE = new com.revenuecat.purchases.ads.rewardverification.VerifiedReward.NoReward();

        private NoReward() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward$UnsupportedReward;", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class UnsupportedReward implements com.revenuecat.purchases.ads.rewardverification.VerifiedReward {
        public static final com.revenuecat.purchases.ads.rewardverification.VerifiedReward.UnsupportedReward INSTANCE = new com.revenuecat.purchases.ads.rewardverification.VerifiedReward.UnsupportedReward();

        private UnsupportedReward() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward$VirtualCurrency;", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "code", "", "amount", "", "(Ljava/lang/String;I)V", "getAmount", "()I", "getCode", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class VirtualCurrency implements com.revenuecat.purchases.ads.rewardverification.VerifiedReward {
        private final int amount;
        private final java.lang.String code;

        public VirtualCurrency(java.lang.String code, int i3) {
            kotlin.jvm.internal.m.e(code, "code");
            this.code = code;
            this.amount = i3;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.ads.rewardverification.VerifiedReward.VirtualCurrency)) {
                return false;
            }
            com.revenuecat.purchases.ads.rewardverification.VerifiedReward.VirtualCurrency virtualCurrency = (com.revenuecat.purchases.ads.rewardverification.VerifiedReward.VirtualCurrency) obj;
            return kotlin.jvm.internal.m.a(this.code, virtualCurrency.code) && this.amount == virtualCurrency.amount;
        }

        public final int getAmount() {
            return this.amount;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public int hashCode() {
            return (this.code.hashCode() * 31) + this.amount;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualCurrency(code=");
            sb.append(this.code);
            sb.append(", amount=");
            return Y6.f.j(sb, this.amount, ')');
        }
    }
}
