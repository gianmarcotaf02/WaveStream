package com.revenuecat.purchases.paywalls.components.common.serializers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/serializers/UpgradeReplacementModeDeserializer;", "Lcom/revenuecat/purchases/paywalls/components/common/serializers/StoreReplacementModeDeserializer;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UpgradeReplacementModeDeserializer extends com.revenuecat.purchases.paywalls.components.common.serializers.StoreReplacementModeDeserializer {
    public static final com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer INSTANCE = new com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer.AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // p194x6.j
        public final java.lang.String invoke(com.revenuecat.purchases.models.StoreReplacementMode value) {
            kotlin.jvm.internal.m.e(value, "value");
            java.lang.String lowerCase = value.getName().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    private UpgradeReplacementModeDeserializer() {
        super(com.revenuecat.purchases.models.StoreReplacementMode.CHARGE_PRORATED_PRICE, com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer.AnonymousClass1.INSTANCE);
    }
}
