package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/models/BillingFeature;", "", "playBillingClientName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPlayBillingClientName", "()Ljava/lang/String;", "SUBSCRIPTIONS", "SUBSCRIPTIONS_UPDATE", "PRICE_CHANGE_CONFIRMATION", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum BillingFeature {
    SUBSCRIPTIONS(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.SUBSCRIPTIONS),
    SUBSCRIPTIONS_UPDATE("subscriptionsUpdate"),
    PRICE_CHANGE_CONFIRMATION("priceChangeConfirmation");

    private final java.lang.String playBillingClientName;

    BillingFeature(java.lang.String str) {
        this.playBillingClientName = str;
    }

    public final java.lang.String getPlayBillingClientName() {
        return this.playBillingClientName;
    }
}
