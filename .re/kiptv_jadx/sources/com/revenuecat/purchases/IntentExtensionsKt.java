package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"asWebPurchaseRedemption", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "Landroid/content/Intent;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class IntentExtensionsKt {
    public static final /* synthetic */ com.revenuecat.purchases.WebPurchaseRedemption asWebPurchaseRedemption(android.content.Intent intent) {
        kotlin.jvm.internal.m.e(intent, "<this>");
        return com.revenuecat.purchases.Purchases.INSTANCE.parseAsWebPurchaseRedemption(intent);
    }
}
