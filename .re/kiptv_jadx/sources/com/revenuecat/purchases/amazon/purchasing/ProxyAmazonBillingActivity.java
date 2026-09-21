package com.revenuecat.purchases.amazon.purchasing;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lh6/A;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "proxyAmazonBillingDelegate", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "getProxyAmazonBillingDelegate$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "setProxyAmazonBillingDelegate$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;)V", "getProxyAmazonBillingDelegate$purchases_defaultsRelease$annotations", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProxyAmazonBillingActivity extends android.app.Activity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.Companion INSTANCE = new com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.Companion(null);
    public static final java.lang.String EXTRAS_PURCHASING_SERVICE_PROVIDER = "purchasing_service_provider";
    public static final java.lang.String EXTRAS_REQUEST_ID = "request_id";
    public static final java.lang.String EXTRAS_RESULT_RECEIVER = "result_receiver";
    public static final java.lang.String EXTRAS_SKU = "sku";
    private com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingDelegate proxyAmazonBillingDelegate;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivity$Companion;", "", "()V", "EXTRAS_PURCHASING_SERVICE_PROVIDER", "", "EXTRAS_REQUEST_ID", "EXTRAS_RESULT_RECEIVER", "EXTRAS_SKU", "newStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "resultReceiver", "Landroid/os/ResultReceiver;", com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU, "purchasingServiceProvider", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final android.content.Intent newStartIntent(android.content.Context context, android.os.ResultReceiver resultReceiver, java.lang.String sku, com.revenuecat.purchases.amazon.PurchasingServiceProvider purchasingServiceProvider) {
            kotlin.jvm.internal.m.e(context, "context");
            kotlin.jvm.internal.m.e(resultReceiver, "resultReceiver");
            kotlin.jvm.internal.m.e(sku, "sku");
            kotlin.jvm.internal.m.e(purchasingServiceProvider, "purchasingServiceProvider");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.class);
            intent.putExtra(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, resultReceiver);
            intent.putExtra(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU, sku);
            intent.putExtra(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_PURCHASING_SERVICE_PROVIDER, purchasingServiceProvider);
            return intent;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getProxyAmazonBillingDelegate$purchases_defaultsRelease$annotations() {
    }

    /* JADX INFO: renamed from: getProxyAmazonBillingDelegate$purchases_defaultsRelease, reason: from getter */
    public final com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingDelegate getProxyAmazonBillingDelegate() {
        return this.proxyAmazonBillingDelegate;
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle savedInstanceState) {
        setTheme(com.revenuecat.purchases.api.R.style.ProxyAmazonBillingActivityTheme);
        super.onCreate(savedInstanceState);
        com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingDelegate proxyAmazonBillingDelegate = new com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingDelegate();
        this.proxyAmazonBillingDelegate = proxyAmazonBillingDelegate;
        proxyAmazonBillingDelegate.onCreate(this, savedInstanceState);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingDelegate proxyAmazonBillingDelegate = this.proxyAmazonBillingDelegate;
        if (proxyAmazonBillingDelegate != null) {
            proxyAmazonBillingDelegate.onDestroy(this);
        }
        this.proxyAmazonBillingDelegate = null;
    }

    public final void setProxyAmazonBillingDelegate$purchases_defaultsRelease(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingDelegate proxyAmazonBillingDelegate) {
        this.proxyAmazonBillingDelegate = proxyAmazonBillingDelegate;
    }
}
