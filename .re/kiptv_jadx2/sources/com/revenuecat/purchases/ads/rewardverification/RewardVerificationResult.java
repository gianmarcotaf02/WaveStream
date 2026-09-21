package com.revenuecat.purchases.ads.rewardverification;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p078i6.w;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult;", "", "storage", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage;", "(Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage;)V", "failed", "", "getFailed", "()Z", "moreRewards", "", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "getMoreRewards", "()Ljava/util/List;", "verifiedReward", "getVerifiedReward", "()Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "Companion", "Storage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RewardVerificationResult {

    public static final Companion INSTANCE = new Companion(null);
    public static final RewardVerificationResult failed = new RewardVerificationResult(Storage.Failed.INSTANCE);
    private final Storage storage;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Companion;", "", "()V", "failed", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult;", "verified", "reward", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "moreRewards", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public static RewardVerificationResult verified$default(Companion companion, VerifiedReward verifiedReward, List list, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                list = w.f23205h;
            }
            return companion.verified(verifiedReward, list);
        }

        public final RewardVerificationResult verified(VerifiedReward reward) {
            m.e(reward, "reward");
            return verified$default(this, reward, null, 2, null);
        }

        private Companion() {
        }

        public final RewardVerificationResult verified(VerifiedReward reward, List<? extends VerifiedReward> moreRewards) {
            m.e(reward, "reward");
            m.e(moreRewards, "moreRewards");
            return new RewardVerificationResult(new Storage.Verified(reward, moreRewards), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage;", "", "Failed", "Verified", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage$Failed;", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage$Verified;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public interface Storage {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage$Failed;", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Failed implements Storage {
            public static final Failed INSTANCE = new Failed();

            private Failed() {
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage$Verified;", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult$Storage;", "reward", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "moreRewards", "", "(Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;Ljava/util/List;)V", "getMoreRewards", "()Ljava/util/List;", "getReward", "()Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Verified implements Storage {
            private final List<VerifiedReward> moreRewards;
            private final VerifiedReward reward;

            public Verified(VerifiedReward reward, List<? extends VerifiedReward> moreRewards) {
                m.e(reward, "reward");
                m.e(moreRewards, "moreRewards");
                this.reward = reward;
                this.moreRewards = moreRewards;
            }

            public final List<VerifiedReward> getMoreRewards() {
                return this.moreRewards;
            }

            public final VerifiedReward getReward() {
                return this.reward;
            }
        }
    }

    public RewardVerificationResult(Storage storage, AbstractC2541f abstractC2541f) {
        this(storage);
    }

    public static final RewardVerificationResult verified(VerifiedReward verifiedReward) {
        return INSTANCE.verified(verifiedReward);
    }

    public final boolean getFailed() {
        return this.storage instanceof Storage.Failed;
    }

    public final List<VerifiedReward> getMoreRewards() {
        List<VerifiedReward> moreRewards;
        Storage storage = this.storage;
        Storage.Verified verified = storage instanceof Storage.Verified ? (Storage.Verified) storage : null;
        return (verified == null || (moreRewards = verified.getMoreRewards()) == null) ? w.f23205h : moreRewards;
    }

    public final VerifiedReward getVerifiedReward() {
        Storage storage = this.storage;
        Storage.Verified verified = storage instanceof Storage.Verified ? (Storage.Verified) storage : null;
        if (verified != null) {
            return verified.getReward();
        }
        return null;
    }

    private RewardVerificationResult(Storage storage) {
        this.storage = storage;
    }

    public static final RewardVerificationResult verified(VerifiedReward verifiedReward, List<? extends VerifiedReward> list) {
        return INSTANCE.verified(verifiedReward, list);
    }
}
