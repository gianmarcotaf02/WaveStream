package com.revenuecat.purchases.ads.rewardverification;

import I3.b;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toResult", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationResult;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OutcomeKt {
    public static final RewardVerificationResult toResult(Outcome outcome) {
        m.e(outcome, "<this>");
        if (outcome instanceof Outcome.Verified) {
            Outcome.Verified verified = (Outcome.Verified) outcome;
            return RewardVerificationResult.INSTANCE.verified(verified.getReward(), verified.getMoreRewards());
        }
        if (outcome instanceof Outcome.Failed) {
            return RewardVerificationResult.failed;
        }
        throw new b();
    }
}
