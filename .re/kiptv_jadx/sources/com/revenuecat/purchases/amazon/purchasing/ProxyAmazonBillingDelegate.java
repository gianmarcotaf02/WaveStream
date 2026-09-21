package com.revenuecat.purchases.amazon.purchasing;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R*\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lh6/A;", "onCreate", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onDestroy", "(Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "Lcom/amazon/device/iap/model/RequestId;", "startAmazonPurchase$purchases_defaultsRelease", "(Landroid/content/Intent;)Lcom/amazon/device/iap/model/RequestId;", "startAmazonPurchase", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "broadcastReceiver", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "getBroadcastReceiver$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "setBroadcastReceiver$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;)V", "getBroadcastReceiver$purchases_defaultsRelease$annotations", "Landroid/content/IntentFilter;", "filter", "Landroid/content/IntentFilter;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProxyAmazonBillingDelegate {
    private /* synthetic */ com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver broadcastReceiver;
    private final android.content.IntentFilter filter = com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver.INSTANCE.newPurchaseFinishedIntentFilter();

    public static /* synthetic */ void getBroadcastReceiver$purchases_defaultsRelease$annotations() {
    }

    /* JADX INFO: renamed from: getBroadcastReceiver$purchases_defaultsRelease, reason: from getter */
    public final com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver getBroadcastReceiver() {
        return this.broadcastReceiver;
    }

    public final void onCreate(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.m.e(activity, "activity");
        com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver proxyAmazonBillingActivityBroadcastReceiver = new com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver(activity);
        this.broadcastReceiver = proxyAmazonBillingActivityBroadcastReceiver;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            activity.registerReceiver(proxyAmazonBillingActivityBroadcastReceiver, this.filter, 2);
        } else {
            activity.registerReceiver(proxyAmazonBillingActivityBroadcastReceiver, this.filter);
        }
        if (savedInstanceState == null) {
            android.content.Intent intent = activity.getIntent();
            kotlin.jvm.internal.m.d(intent, "activity.intent");
            if (startAmazonPurchase$purchases_defaultsRelease(intent) == null) {
                activity.finish();
            }
        }
    }

    public final void onDestroy(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        activity.unregisterReceiver(this.broadcastReceiver);
        this.broadcastReceiver = null;
    }

    public final void setBroadcastReceiver$purchases_defaultsRelease(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver proxyAmazonBillingActivityBroadcastReceiver) {
        this.broadcastReceiver = proxyAmazonBillingActivityBroadcastReceiver;
    }

    public final com.amazon.device.iap.model.RequestId startAmazonPurchase$purchases_defaultsRelease(android.content.Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU);
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) intent.getParcelableExtra(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
        com.revenuecat.purchases.amazon.PurchasingServiceProvider purchasingServiceProvider = (com.revenuecat.purchases.amazon.PurchasingServiceProvider) intent.getParcelableExtra(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_PURCHASING_SERVICE_PROVIDER);
        if (stringExtra == null || resultReceiver == null || purchasingServiceProvider == null) {
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.PurchaseInvalidError, java.lang.String.format(com.revenuecat.purchases.amazon.AmazonStrings.ERROR_PURCHASE_INVALID_PROXY_ACTIVITY_ARGUMENTS, java.util.Arrays.copyOf(new java.lang.Object[]{intent.toUri(0)}, 1))));
            return null;
        }
        com.amazon.device.iap.model.RequestId requestIdPurchase = purchasingServiceProvider.purchase(stringExtra);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, (android.os.Parcelable) requestIdPurchase);
        resultReceiver.send(0, bundle);
        return requestIdPurchase;
    }
}
