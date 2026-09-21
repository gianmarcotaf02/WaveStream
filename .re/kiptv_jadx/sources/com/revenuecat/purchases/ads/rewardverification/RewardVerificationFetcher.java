package com.revenuecat.purchases.ads.rewardverification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationFetcher;", "", "", "clientTransactionId", "Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "fetch", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RewardVerificationFetcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.ads.rewardverification.RewardVerificationFetcher.Companion INSTANCE = com.revenuecat.purchases.ads.rewardverification.RewardVerificationFetcher.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u00020\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationFetcher$Companion;", "", "()V", "default", "Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationFetcher;", "getDefault$annotations", "getDefault", "()Lcom/revenuecat/purchases/ads/rewardverification/RewardVerificationFetcher;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ com.revenuecat.purchases.ads.rewardverification.RewardVerificationFetcher.Companion $$INSTANCE = new com.revenuecat.purchases.ads.rewardverification.RewardVerificationFetcher.Companion();
        private static final com.revenuecat.purchases.ads.rewardverification.RewardVerificationFetcher default = new com.revenuecat.purchases.ads.rewardverification.RewardVerificationFetcher() { // from class: com.revenuecat.purchases.ads.rewardverification.RewardVerificationFetcher$Companion$default$1
            @Override // com.revenuecat.purchases.ads.rewardverification.RewardVerificationFetcher
            public final java.lang.Object fetch(java.lang.String str, p100l6.c cVar) {
                return com.revenuecat.purchases.CoroutinesExtensionsKt.awaitGetRewardVerificationResult(com.revenuecat.purchases.Purchases.Companion.getSharedInstance(), str, cVar);
            }
        };

        private Companion() {
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public final com.revenuecat.purchases.ads.rewardverification.RewardVerificationFetcher getDefault() {
            return default;
        }
    }

    java.lang.Object fetch(java.lang.String str, p100l6.c cVar);
}
