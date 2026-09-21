package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"toGooglePurchaseState", "", "Lcom/revenuecat/purchases/models/PurchaseState;", "toRevenueCatPurchaseState", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchaseStateConversionsKt {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.models.PurchaseState.values().length];
            try {
                iArr[com.revenuecat.purchases.models.PurchaseState.UNSPECIFIED_STATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.models.PurchaseState.PURCHASED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.models.PurchaseState.PENDING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toGooglePurchaseState(com.revenuecat.purchases.models.PurchaseState purchaseState) {
        kotlin.jvm.internal.m.e(purchaseState, "<this>");
        int i3 = com.revenuecat.purchases.google.PurchaseStateConversionsKt.WhenMappings.$EnumSwitchMapping$0[purchaseState.ordinal()];
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 3) {
            return 2;
        }
        throw new I3.b();
    }

    public static final com.revenuecat.purchases.models.PurchaseState toRevenueCatPurchaseState(int i3) {
        if (i3 == 0) {
            return com.revenuecat.purchases.models.PurchaseState.UNSPECIFIED_STATE;
        }
        if (i3 != 1) {
            return i3 != 2 ? com.revenuecat.purchases.models.PurchaseState.UNSPECIFIED_STATE : com.revenuecat.purchases.models.PurchaseState.PENDING;
        }
        return com.revenuecat.purchases.models.PurchaseState.PURCHASED;
    }
}
