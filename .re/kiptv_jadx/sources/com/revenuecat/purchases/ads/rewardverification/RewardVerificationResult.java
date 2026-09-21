package com.revenuecat.purchases.ads.rewardverification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult;", "", "storage", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage;", "(Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage;)V", "failed", "", "getFailed", "()Z", "moreRewards", "", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "getMoreRewards", "()Ljava/util/List;", "verifiedReward", "getVerifiedReward", "()Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "Companion", "Storage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RewardVerificationResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Companion INSTANCE = new com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Companion(null);
    public static final com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult failed = new com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult(com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Failed.INSTANCE);
    private final com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage storage;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Companion;", "", "()V", "failed", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult;", "verified", "reward", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "moreRewards", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult verified$default(com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Companion companion, com.revenuecat.purchases.ads.rewardverification.VerifiedReward verifiedReward, java.util.List list, int i3, java.lang.Object obj) {
            if ((i3 & 2) != 0) {
                list = p078i6.w.f23205h;
            }
            return companion.verified(verifiedReward, list);
        }

        public final com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult verified(com.revenuecat.purchases.ads.rewardverification.VerifiedReward reward) {
            kotlin.jvm.internal.m.e(reward, "reward");
            return verified$default(this, reward, null, 2, null);
        }

        private Companion() {
        }

        public final com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult verified(com.revenuecat.purchases.ads.rewardverification.VerifiedReward reward, java.util.List<? extends com.revenuecat.purchases.ads.rewardverification.VerifiedReward> moreRewards) {
            kotlin.jvm.internal.m.e(reward, "reward");
            kotlin.jvm.internal.m.e(moreRewards, "moreRewards");
            return new com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult(new com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Verified(reward, moreRewards), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage;", "", "Failed", "Verified", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage$Failed;", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage$Verified;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public interface Storage {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage$Failed;", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Failed implements com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage {
            public static final com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Failed INSTANCE = new com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Failed();

            private Failed() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage$Verified;", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage;", "reward", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "moreRewards", "", "(Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;Ljava/util/List;)V", "getMoreRewards", "()Ljava/util/List;", "getReward", "()Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Verified implements com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage {
            private final java.util.List<com.revenuecat.purchases.ads.rewardverification.VerifiedReward> moreRewards;
            private final com.revenuecat.purchases.ads.rewardverification.VerifiedReward reward;

            /* JADX WARN: Multi-variable type inference failed */
            public Verified(com.revenuecat.purchases.ads.rewardverification.VerifiedReward reward, java.util.List<? extends com.revenuecat.purchases.ads.rewardverification.VerifiedReward> moreRewards) {
                kotlin.jvm.internal.m.e(reward, "reward");
                kotlin.jvm.internal.m.e(moreRewards, "moreRewards");
                this.reward = reward;
                this.moreRewards = moreRewards;
            }

            public final java.util.List<com.revenuecat.purchases.ads.rewardverification.VerifiedReward> getMoreRewards() {
                return this.moreRewards;
            }

            public final com.revenuecat.purchases.ads.rewardverification.VerifiedReward getReward() {
                return this.reward;
            }
        }
    }

    public /* synthetic */ RewardVerificationResult(com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage storage, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(storage);
    }

    public static final com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult verified(com.revenuecat.purchases.ads.rewardverification.VerifiedReward verifiedReward) {
        return INSTANCE.verified(verifiedReward);
    }

    public final boolean getFailed() {
        return this.storage instanceof com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Failed;
    }

    public final java.util.List<com.revenuecat.purchases.ads.rewardverification.VerifiedReward> getMoreRewards() {
        java.util.List<com.revenuecat.purchases.ads.rewardverification.VerifiedReward> moreRewards;
        com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage storage = this.storage;
        com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Verified verified = storage instanceof com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Verified ? (com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Verified) storage : null;
        return (verified == null || (moreRewards = verified.getMoreRewards()) == null) ? p078i6.w.f23205h : moreRewards;
    }

    public final com.revenuecat.purchases.ads.rewardverification.VerifiedReward getVerifiedReward() {
        com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage storage = this.storage;
        com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Verified verified = storage instanceof com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Verified ? (com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage.Verified) storage : null;
        if (verified != null) {
            return verified.getReward();
        }
        return null;
    }

    private RewardVerificationResult(com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.Storage storage) {
        this.storage = storage;
    }

    public static final com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult verified(com.revenuecat.purchases.ads.rewardverification.VerifiedReward verifiedReward, java.util.List<? extends com.revenuecat.purchases.ads.rewardverification.VerifiedReward> list) {
        return INSTANCE.verified(verifiedReward, list);
    }
}
