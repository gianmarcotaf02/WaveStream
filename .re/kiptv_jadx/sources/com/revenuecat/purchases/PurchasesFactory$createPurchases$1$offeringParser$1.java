package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesFactory$createPurchases$1$offeringParser$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager $remoteConfigManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesFactory$createPurchases$1$offeringParser$1(com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager) {
        super(0);
        this.$remoteConfigManager = remoteConfigManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Boolean invoke() {
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = this.$remoteConfigManager;
        return java.lang.Boolean.valueOf(remoteConfigManager != null ? remoteConfigManager.getDisabled() : true);
    }
}
