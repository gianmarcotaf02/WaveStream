package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/VerifiedReward;", "", "Entitlement", "NoReward", "UnsupportedReward", "VirtualCurrency", "Lcom/revenuecat/purchases/VerifiedReward$Entitlement;", "Lcom/revenuecat/purchases/VerifiedReward$NoReward;", "Lcom/revenuecat/purchases/VerifiedReward$UnsupportedReward;", "Lcom/revenuecat/purchases/VerifiedReward$VirtualCurrency;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface VerifiedReward {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/VerifiedReward$Entitlement;", "Lcom/revenuecat/purchases/VerifiedReward;", io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "expiresAt", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getExpiresAt", "()Ljava/util/Date;", "getIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Entitlement implements com.revenuecat.purchases.VerifiedReward {
        private final java.util.Date expiresAt;
        private final java.lang.String identifier;

        public Entitlement(java.lang.String identifier, java.util.Date expiresAt) {
            kotlin.jvm.internal.m.e(identifier, "identifier");
            kotlin.jvm.internal.m.e(expiresAt, "expiresAt");
            this.identifier = identifier;
            this.expiresAt = expiresAt;
        }

        public static /* synthetic */ com.revenuecat.purchases.VerifiedReward.Entitlement copy$default(com.revenuecat.purchases.VerifiedReward.Entitlement entitlement, java.lang.String str, java.util.Date date, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = entitlement.identifier;
            }
            if ((i3 & 2) != 0) {
                date = entitlement.expiresAt;
            }
            return entitlement.copy(str, date);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getIdentifier() {
            return this.identifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.util.Date getExpiresAt() {
            return this.expiresAt;
        }

        public final com.revenuecat.purchases.VerifiedReward.Entitlement copy(java.lang.String identifier, java.util.Date expiresAt) {
            kotlin.jvm.internal.m.e(identifier, "identifier");
            kotlin.jvm.internal.m.e(expiresAt, "expiresAt");
            return new com.revenuecat.purchases.VerifiedReward.Entitlement(identifier, expiresAt);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.VerifiedReward.Entitlement)) {
                return false;
            }
            com.revenuecat.purchases.VerifiedReward.Entitlement entitlement = (com.revenuecat.purchases.VerifiedReward.Entitlement) other;
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

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/VerifiedReward$NoReward;", "Lcom/revenuecat/purchases/VerifiedReward;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class NoReward implements com.revenuecat.purchases.VerifiedReward {
        public static final com.revenuecat.purchases.VerifiedReward.NoReward INSTANCE = new com.revenuecat.purchases.VerifiedReward.NoReward();

        private NoReward() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/VerifiedReward$UnsupportedReward;", "Lcom/revenuecat/purchases/VerifiedReward;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class UnsupportedReward implements com.revenuecat.purchases.VerifiedReward {
        public static final com.revenuecat.purchases.VerifiedReward.UnsupportedReward INSTANCE = new com.revenuecat.purchases.VerifiedReward.UnsupportedReward();

        private UnsupportedReward() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/VerifiedReward$VirtualCurrency;", "Lcom/revenuecat/purchases/VerifiedReward;", "code", "", "amount", "", "(Ljava/lang/String;I)V", "getAmount", "()I", "getCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class VirtualCurrency implements com.revenuecat.purchases.VerifiedReward {
        private final int amount;
        private final java.lang.String code;

        public VirtualCurrency(java.lang.String code, int i3) {
            kotlin.jvm.internal.m.e(code, "code");
            this.code = code;
            this.amount = i3;
        }

        public static /* synthetic */ com.revenuecat.purchases.VerifiedReward.VirtualCurrency copy$default(com.revenuecat.purchases.VerifiedReward.VirtualCurrency virtualCurrency, java.lang.String str, int i3, int i9, java.lang.Object obj) {
            if ((i9 & 1) != 0) {
                str = virtualCurrency.code;
            }
            if ((i9 & 2) != 0) {
                i3 = virtualCurrency.amount;
            }
            return virtualCurrency.copy(str, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getAmount() {
            return this.amount;
        }

        public final com.revenuecat.purchases.VerifiedReward.VirtualCurrency copy(java.lang.String code, int amount) {
            kotlin.jvm.internal.m.e(code, "code");
            return new com.revenuecat.purchases.VerifiedReward.VirtualCurrency(code, amount);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.VerifiedReward.VirtualCurrency)) {
                return false;
            }
            com.revenuecat.purchases.VerifiedReward.VirtualCurrency virtualCurrency = (com.revenuecat.purchases.VerifiedReward.VirtualCurrency) other;
            return kotlin.jvm.internal.m.a(this.code, virtualCurrency.code) && this.amount == virtualCurrency.amount;
        }

        public final int getAmount() {
            return this.amount;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public int hashCode() {
            return java.lang.Integer.hashCode(this.amount) + (this.code.hashCode() * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualCurrency(code=");
            sb.append(this.code);
            sb.append(", amount=");
            return Y6.f.j(sb, this.amount, ')');
        }
    }
}
