package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"firstProductId", "", "Lcom/android/billingclient/api/Purchase;", "getFirstProductId", "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;", "toHumanReadableDescription", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchaseExtensionsKt {
    public static final java.lang.String getFirstProductId(com.android.billingclient.api.Purchase purchase) {
        kotlin.jvm.internal.m.e(purchase, "<this>");
        java.lang.Object obj = purchase.a().get(0);
        kotlin.jvm.internal.m.d(obj, "products[0]");
        return (java.lang.String) obj;
    }

    public static final java.lang.String toHumanReadableDescription(com.android.billingclient.api.Purchase purchase) {
        kotlin.jvm.internal.m.e(purchase, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("productIds: ");
        sb.append(p078i6.o.o1(purchase.a(), null, "[", "]", null, 57));
        sb.append(", orderId: ");
        java.lang.String strOptString = purchase.f18570c.optString("orderId");
        if (android.text.TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        sb.append(strOptString);
        sb.append(", purchaseToken: ");
        sb.append(purchase.b());
        return sb.toString();
    }
}
