package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/android/billingclient/api/Purchase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BillingWrapper$onPurchasesUpdated$2$2$1 extends kotlin.jvm.internal.o implements p194x6.j {
    public static final com.revenuecat.purchases.google.BillingWrapper$onPurchasesUpdated$2$2$1 INSTANCE = new com.revenuecat.purchases.google.BillingWrapper$onPurchasesUpdated$2$2$1();

    public BillingWrapper$onPurchasesUpdated$2$2$1() {
        super(1);
    }

    @Override // p194x6.j
    public final java.lang.CharSequence invoke(com.android.billingclient.api.Purchase it) {
        kotlin.jvm.internal.m.e(it, "it");
        return com.revenuecat.purchases.common.PurchaseExtensionsKt.toHumanReadableDescription(it);
    }
}
