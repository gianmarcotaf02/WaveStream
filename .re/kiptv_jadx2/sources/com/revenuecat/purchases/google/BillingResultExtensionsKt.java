package com.revenuecat.purchases.google;

import Y2.C1040j;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LY2/j;", "", "isSuccessful", "(LY2/j;)Z", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(C1040j c1040j) {
        m.e(c1040j, "<this>");
        return c1040j.f11477a == 0;
    }
}
