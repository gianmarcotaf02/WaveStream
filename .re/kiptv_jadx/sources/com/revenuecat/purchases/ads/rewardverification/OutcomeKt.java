package com.revenuecat.purchases.ads.rewardverification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toResult", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OutcomeKt {
    public static final com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult toResult(com.revenuecat.purchases.ads.rewardverification.Outcome outcome) {
        kotlin.jvm.internal.m.e(outcome, "<this>");
        if (outcome instanceof com.revenuecat.purchases.ads.rewardverification.Outcome.Verified) {
            com.revenuecat.purchases.ads.rewardverification.Outcome.Verified verified = (com.revenuecat.purchases.ads.rewardverification.Outcome.Verified) outcome;
            return com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.INSTANCE.verified(verified.getReward(), verified.getMoreRewards());
        }
        if (outcome instanceof com.revenuecat.purchases.ads.rewardverification.Outcome.Failed) {
            return com.revenuecat.purchases.ads.rewardverification.RewardVerificationResult.failed;
        }
        throw new I3.b();
    }
}
