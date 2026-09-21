package com.revenuecat.purchases.amazon;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toRevenueCatProductType", "Lcom/revenuecat/purchases/ProductType;", "Lcom/amazon/device/iap/model/ProductType;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProductTypeConversionsKt {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.amazon.device.iap.model.ProductType.values().length];
            try {
                iArr[com.amazon.device.iap.model.ProductType.CONSUMABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.device.iap.model.ProductType.ENTITLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.device.iap.model.ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.revenuecat.purchases.ProductType toRevenueCatProductType(com.amazon.device.iap.model.ProductType productType) {
        kotlin.jvm.internal.m.e(productType, "<this>");
        int i3 = com.revenuecat.purchases.amazon.ProductTypeConversionsKt.WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i3 == 1) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        if (i3 == 2) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        if (i3 == 3) {
            return com.revenuecat.purchases.ProductType.SUBS;
        }
        throw new I3.b();
    }
}
