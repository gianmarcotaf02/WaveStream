package com.revenuecat.purchases.ads.rewardverification;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "", "Entitlement", "NoReward", "UnsupportedReward", "VirtualCurrency", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface VerifiedReward {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward$Entitlement;", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "expiresAt", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getExpiresAt", "()Ljava/util/Date;", "getIdentifier", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Entitlement implements VerifiedReward {
        private final Date expiresAt;
        private final String identifier;

        public Entitlement(String identifier, Date expiresAt) {
            m.e(identifier, "identifier");
            m.e(expiresAt, "expiresAt");
            this.identifier = identifier;
            this.expiresAt = expiresAt;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entitlement)) {
                return false;
            }
            Entitlement entitlement = (Entitlement) obj;
            return m.a(this.identifier, entitlement.identifier) && m.a(this.expiresAt, entitlement.expiresAt);
        }

        public final Date getExpiresAt() {
            return this.expiresAt;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public int hashCode() {
            return this.expiresAt.hashCode() + (this.identifier.hashCode() * 31);
        }

        public String toString() {
            return "Entitlement(identifier=" + this.identifier + ", expiresAt=" + this.expiresAt + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward$NoReward;", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class NoReward implements VerifiedReward {
        public static final NoReward INSTANCE = new NoReward();

        private NoReward() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward$UnsupportedReward;", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class UnsupportedReward implements VerifiedReward {
        public static final UnsupportedReward INSTANCE = new UnsupportedReward();

        private UnsupportedReward() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward$VirtualCurrency;", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "code", "", "amount", "", "(Ljava/lang/String;I)V", "getAmount", "()I", "getCode", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class VirtualCurrency implements VerifiedReward {
        private final int amount;
        private final String code;

        public VirtualCurrency(String code, int i3) {
            m.e(code, "code");
            this.code = code;
            this.amount = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VirtualCurrency)) {
                return false;
            }
            VirtualCurrency virtualCurrency = (VirtualCurrency) obj;
            return m.a(this.code, virtualCurrency.code) && this.amount == virtualCurrency.amount;
        }

        public final int getAmount() {
            return this.amount;
        }

        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            return (this.code.hashCode() * 31) + this.amount;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("VirtualCurrency(code=");
            sb.append(this.code);
            sb.append(", amount=");
            return f.j(sb, this.amount, ')');
        }
    }
}
