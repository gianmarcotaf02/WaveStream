package com.revenuecat.purchases.ads.rewardverification;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0080@¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh6/A;", "rewardVerificationRetryDelay", "(Ll6/c;)Ljava/lang/Object;", "", "ENTITLEMENT_REFRESH_RETRY_DELAY_MS", "J", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RewardVerificationRetryKt {
    public static final long ENTITLEMENT_REFRESH_RETRY_DELAY_MS = 300;

    public static final java.lang.Object rewardVerificationRetryDelay(p100l6.c cVar) {
        java.lang.Object objN = S7.C.n(300L, cVar);
        return objN == p109m6.a.f25430h ? objN : p070h6.A.f22523a;
    }
}
