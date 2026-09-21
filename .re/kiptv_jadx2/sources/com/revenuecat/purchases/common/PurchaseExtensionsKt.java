package com.revenuecat.purchases.common;

import android.text.TextUtils;
import androidx.media3.container.NalUnitUtil;
import com.android.billingclient.api.Purchase;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.o;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"firstProductId", "", "Lcom/android/billingclient/api/Purchase;", "getFirstProductId", "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;", "toHumanReadableDescription", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        m.e(purchase, "<this>");
        Object obj = purchase.a().get(0);
        m.d(obj, "products[0]");
        return (String) obj;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        m.e(purchase, "<this>");
        StringBuilder sb = new StringBuilder("productIds: ");
        sb.append(o.o1(purchase.a(), null, "[", "]", null, 57));
        sb.append(", orderId: ");
        String strOptString = purchase.f18570c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        sb.append(strOptString);
        sb.append(", purchaseToken: ");
        sb.append(purchase.b());
        return sb.toString();
    }
}
