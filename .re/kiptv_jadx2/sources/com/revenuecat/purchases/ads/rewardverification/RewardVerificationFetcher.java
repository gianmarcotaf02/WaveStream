package com.revenuecat.purchases.ads.rewardverification;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.CoroutinesExtensionsKt;
import com.revenuecat.purchases.Purchases;
import kotlin.Metadata;
import p100l6.c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationFetcher;", "", "", "clientTransactionId", "Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "fetch", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RewardVerificationFetcher {

    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u00020\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationFetcher$Companion;", "", "()V", "default", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationFetcher;", "getDefault$annotations", "getDefault", "()Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationFetcher;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();
        private static final RewardVerificationFetcher default = new RewardVerificationFetcher() {
            @Override
            public final Object fetch(String str, c cVar) {
                return CoroutinesExtensionsKt.awaitGetRewardVerificationResult(Purchases.Companion.getSharedInstance(), str, cVar);
            }
        };

        private Companion() {
        }

        public static void getDefault$annotations() {
        }

        public final RewardVerificationFetcher getDefault() {
            return default;
        }
    }

    Object fetch(String str, c cVar);
}
