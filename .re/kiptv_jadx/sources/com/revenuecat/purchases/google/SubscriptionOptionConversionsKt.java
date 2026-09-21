package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LY2/p;", "", "productId", "LY2/q;", "productDetails", "Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toSubscriptionOption", "(LY2/p;Ljava/lang/String;LY2/q;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "getSubscriptionBillingPeriod", "(LY2/p;)Ljava/lang/String;", "subscriptionBillingPeriod", "", "isBasePlan", "(LY2/p;)Z", "LY2/m;", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getInstallmentsInfo", "(LY2/m;)Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "installmentsInfo", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriptionOptionConversionsKt {
    private static final com.revenuecat.purchases.models.GoogleInstallmentsInfo getInstallmentsInfo(Y2.C1043m c1043m) {
        return new com.revenuecat.purchases.models.GoogleInstallmentsInfo(c1043m.f11482a, c1043m.f11483b);
    }

    public static final java.lang.String getSubscriptionBillingPeriod(Y2.C1046p c1046p) {
        kotlin.jvm.internal.m.e(c1046p, "<this>");
        java.util.ArrayList arrayList = c1046p.f11499d.f1884a;
        kotlin.jvm.internal.m.d(arrayList, "this.pricingPhases.pricingPhaseList");
        Y2.C1045o c1045o = (Y2.C1045o) p078i6.o.s1(arrayList);
        if (c1045o != null) {
            return c1045o.f11493d;
        }
        return null;
    }

    public static final boolean isBasePlan(Y2.C1046p c1046p) {
        kotlin.jvm.internal.m.e(c1046p, "<this>");
        return c1046p.f11499d.f1884a.size() == 1;
    }

    public static final com.revenuecat.purchases.models.GoogleSubscriptionOption toSubscriptionOption(Y2.C1046p c1046p, java.lang.String productId, Y2.C1047q productDetails) {
        kotlin.jvm.internal.m.e(c1046p, "<this>");
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(productDetails, "productDetails");
        java.util.ArrayList<Y2.C1045o> arrayList = c1046p.f11499d.f1884a;
        kotlin.jvm.internal.m.d(arrayList, "pricingPhases.pricingPhaseList");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        for (Y2.C1045o it : arrayList) {
            kotlin.jvm.internal.m.d(it, "it");
            arrayList2.add(com.revenuecat.purchases.google.PricingPhaseConversionsKt.toRevenueCatPricingPhase(it));
        }
        java.lang.String basePlanId = c1046p.f11496a;
        kotlin.jvm.internal.m.d(basePlanId, "basePlanId");
        java.util.ArrayList offerTags = c1046p.f11500e;
        kotlin.jvm.internal.m.d(offerTags, "offerTags");
        java.lang.String offerToken = c1046p.f11498c;
        kotlin.jvm.internal.m.d(offerToken, "offerToken");
        Y2.C1043m c1043m = c1046p.f11501f;
        return new com.revenuecat.purchases.models.GoogleSubscriptionOption(productId, basePlanId, c1046p.f11497b, arrayList2, offerTags, productDetails, offerToken, null, c1043m != null ? getInstallmentsInfo(c1043m) : null);
    }
}
