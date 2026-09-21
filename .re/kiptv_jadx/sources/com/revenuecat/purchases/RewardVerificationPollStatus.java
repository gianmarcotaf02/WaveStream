package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "", "Failed", "PENDING", "UNKNOWN", "Verified", "Lcom/revenuecat/purchases/RewardVerificationPollStatus$Failed;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus$PENDING;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus$UNKNOWN;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus$Verified;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RewardVerificationPollStatus {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationPollStatus$Failed;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "failureReason", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getFailureReason", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Failed implements com.revenuecat.purchases.RewardVerificationPollStatus {
        private final java.lang.String failureReason;
        private final java.lang.String message;

        /* JADX WARN: Multi-variable type inference failed */
        public Failed() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ com.revenuecat.purchases.RewardVerificationPollStatus.Failed copy$default(com.revenuecat.purchases.RewardVerificationPollStatus.Failed failed, java.lang.String str, java.lang.String str2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = failed.failureReason;
            }
            if ((i3 & 2) != 0) {
                str2 = failed.message;
            }
            return failed.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getFailureReason() {
            return this.failureReason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.revenuecat.purchases.RewardVerificationPollStatus.Failed copy(java.lang.String failureReason, java.lang.String message) {
            return new com.revenuecat.purchases.RewardVerificationPollStatus.Failed(failureReason, message);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.RewardVerificationPollStatus.Failed)) {
                return false;
            }
            com.revenuecat.purchases.RewardVerificationPollStatus.Failed failed = (com.revenuecat.purchases.RewardVerificationPollStatus.Failed) other;
            return kotlin.jvm.internal.m.a(this.failureReason, failed.failureReason) && kotlin.jvm.internal.m.a(this.message, failed.message);
        }

        public final java.lang.String getFailureReason() {
            return this.failureReason;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public int hashCode() {
            java.lang.String str = this.failureReason;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.message;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(failureReason=");
            sb.append(this.failureReason);
            sb.append(", message=");
            return Y6.f.l(sb, this.message, ')');
        }

        public Failed(java.lang.String str, java.lang.String str2) {
            this.failureReason = str;
            this.message = str2;
        }

        public /* synthetic */ Failed(java.lang.String str, java.lang.String str2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationPollStatus$PENDING;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PENDING implements com.revenuecat.purchases.RewardVerificationPollStatus {
        public static final com.revenuecat.purchases.RewardVerificationPollStatus.PENDING INSTANCE = new com.revenuecat.purchases.RewardVerificationPollStatus.PENDING();

        private PENDING() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationPollStatus$UNKNOWN;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class UNKNOWN implements com.revenuecat.purchases.RewardVerificationPollStatus {
        public static final com.revenuecat.purchases.RewardVerificationPollStatus.UNKNOWN INSTANCE = new com.revenuecat.purchases.RewardVerificationPollStatus.UNKNOWN();

        private UNKNOWN() {
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationPollStatus$Verified;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "reward", "Lcom/revenuecat/purchases/VerifiedReward;", "moreRewards", "", "(Lcom/revenuecat/purchases/VerifiedReward;Ljava/util/List;)V", "getMoreRewards", "()Ljava/util/List;", "getReward", "()Lcom/revenuecat/purchases/VerifiedReward;", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Verified implements com.revenuecat.purchases.RewardVerificationPollStatus {
        private final java.util.List<com.revenuecat.purchases.VerifiedReward> moreRewards;
        private final com.revenuecat.purchases.VerifiedReward reward;

        /* JADX WARN: Multi-variable type inference failed */
        public Verified(com.revenuecat.purchases.VerifiedReward reward, java.util.List<? extends com.revenuecat.purchases.VerifiedReward> moreRewards) {
            kotlin.jvm.internal.m.e(reward, "reward");
            kotlin.jvm.internal.m.e(moreRewards, "moreRewards");
            this.reward = reward;
            this.moreRewards = moreRewards;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.revenuecat.purchases.RewardVerificationPollStatus.Verified copy$default(com.revenuecat.purchases.RewardVerificationPollStatus.Verified verified, com.revenuecat.purchases.VerifiedReward verifiedReward, java.util.List list, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                verifiedReward = verified.reward;
            }
            if ((i3 & 2) != 0) {
                list = verified.moreRewards;
            }
            return verified.copy(verifiedReward, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.revenuecat.purchases.VerifiedReward getReward() {
            return this.reward;
        }

        public final java.util.List<com.revenuecat.purchases.VerifiedReward> component2() {
            return this.moreRewards;
        }

        public final com.revenuecat.purchases.RewardVerificationPollStatus.Verified copy(com.revenuecat.purchases.VerifiedReward reward, java.util.List<? extends com.revenuecat.purchases.VerifiedReward> moreRewards) {
            kotlin.jvm.internal.m.e(reward, "reward");
            kotlin.jvm.internal.m.e(moreRewards, "moreRewards");
            return new com.revenuecat.purchases.RewardVerificationPollStatus.Verified(reward, moreRewards);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.RewardVerificationPollStatus.Verified)) {
                return false;
            }
            com.revenuecat.purchases.RewardVerificationPollStatus.Verified verified = (com.revenuecat.purchases.RewardVerificationPollStatus.Verified) other;
            return kotlin.jvm.internal.m.a(this.reward, verified.reward) && kotlin.jvm.internal.m.a(this.moreRewards, verified.moreRewards);
        }

        public final java.util.List<com.revenuecat.purchases.VerifiedReward> getMoreRewards() {
            return this.moreRewards;
        }

        public final com.revenuecat.purchases.VerifiedReward getReward() {
            return this.reward;
        }

        public int hashCode() {
            return this.moreRewards.hashCode() + (this.reward.hashCode() * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Verified(reward=");
            sb.append(this.reward);
            sb.append(", moreRewards=");
            return com.google.android.gms.internal.play_billing.M0.n(sb, this.moreRewards, ')');
        }

        public /* synthetic */ Verified(com.revenuecat.purchases.VerifiedReward verifiedReward, java.util.List list, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(verifiedReward, (i3 & 2) != 0 ? p078i6.w.f23205h : list);
        }
    }
}
