package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"finishTransactions", "", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getFinishTransactions", "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)Z", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesAreCompletedByKt {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.PurchasesAreCompletedBy.values().length];
            try {
                iArr[com.revenuecat.purchases.PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.PurchasesAreCompletedBy.MY_APP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean getFinishTransactions(com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy) {
        kotlin.jvm.internal.m.e(purchasesAreCompletedBy, "<this>");
        int i3 = com.revenuecat.purchases.PurchasesAreCompletedByKt.WhenMappings.$EnumSwitchMapping$0[purchasesAreCompletedBy.ordinal()];
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            return false;
        }
        throw new I3.b();
    }
}
