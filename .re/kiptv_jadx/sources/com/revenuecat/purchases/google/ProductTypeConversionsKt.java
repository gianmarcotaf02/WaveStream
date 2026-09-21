package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0004"}, d2 = {"toGoogleProductType", "", "Lcom/revenuecat/purchases/ProductType;", "toRevenueCatProductType", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProductTypeConversionsKt {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.ProductType.values().length];
            try {
                iArr[com.revenuecat.purchases.ProductType.INAPP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.ProductType.SUBS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final java.lang.String toGoogleProductType(com.revenuecat.purchases.ProductType productType) {
        kotlin.jvm.internal.m.e(productType, "<this>");
        int i3 = com.revenuecat.purchases.google.ProductTypeConversionsKt.WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i3 == 1) {
            return "inapp";
        }
        if (i3 != 2) {
            return null;
        }
        return "subs";
    }

    public static final com.revenuecat.purchases.ProductType toRevenueCatProductType(java.lang.String str) {
        if (kotlin.jvm.internal.m.a(str, "inapp")) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        return kotlin.jvm.internal.m.a(str, "subs") ? com.revenuecat.purchases.ProductType.SUBS : com.revenuecat.purchases.ProductType.UNKNOWN;
    }
}
