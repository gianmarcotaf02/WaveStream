package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LY2/j;", "", "toHumanReadableDescription", "(LY2/j;)Ljava/lang/String;", "", "getOnPurchasesUpdatedSubResponseCodeName", "(I)Ljava/lang/String;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BillingResultExtensionsBillingIndependentKt {
    private static final java.lang.String getOnPurchasesUpdatedSubResponseCodeName(int i3) {
        if (i3 == 0) {
            return "NO_APPLICABLE_SUB_RESPONSE_CODE";
        }
        if (i3 == 1) {
            return "PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS";
        }
        if (i3 == 2) {
            return "USER_INELIGIBLE";
        }
        return "UNKNOWN_SUB_RESPONSE_CODE (" + i3 + ')';
    }

    public static final java.lang.String toHumanReadableDescription(Y2.C1040j c1040j) {
        kotlin.jvm.internal.m.e(c1040j, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebugMessage: ");
        sb.append(c1040j.f11479c);
        sb.append(". ErrorCode: ");
        sb.append(com.revenuecat.purchases.google.ErrorsKt.getBillingResponseCodeName(c1040j.f11477a));
        sb.append(". SubResponseCode: ");
        return Y6.f.l(sb, getOnPurchasesUpdatedSubResponseCodeName(c1040j.f11478b), '.');
    }
}
