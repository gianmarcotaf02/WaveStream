package com.revenuecat.purchases.deeplinks;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/deeplinks/DeepLinkParser;", "", "()V", "REDEEM_WEB_PURCHASE_HOST", "", "parseWebPurchaseRedemption", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "data", "Landroid/net/Uri;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DeepLinkParser {
    public static final com.revenuecat.purchases.deeplinks.DeepLinkParser INSTANCE = new com.revenuecat.purchases.deeplinks.DeepLinkParser();
    private static final java.lang.String REDEEM_WEB_PURCHASE_HOST = "redeem_web_purchase";

    private DeepLinkParser() {
    }

    public final com.revenuecat.purchases.WebPurchaseRedemption parseWebPurchaseRedemption(android.net.Uri data) {
        kotlin.jvm.internal.m.e(data, "data");
        if (kotlin.jvm.internal.m.a(data.getHost(), REDEEM_WEB_PURCHASE_HOST)) {
            java.lang.String queryParameter = data.getQueryParameter("redemption_token");
            if (queryParameter != null && !O7.q.N0(queryParameter)) {
                return new com.revenuecat.purchases.WebPurchaseRedemption(queryParameter);
            }
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                com.google.android.gms.internal.play_billing.M0.t(logLevel, new java.lang.StringBuilder("[Purchases] - "), currentLogHandler, "Redemption token is missing web redemption deep link. Ignoring.");
            }
            return null;
        }
        com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.DEBUG;
        com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
            currentLogHandler2.d(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), "Unrecognized deep link host: " + data.getHost() + ". Ignoring");
        }
        return null;
    }
}
