package com.revenuecat.purchases.amazon.purchasing;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR(\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lh6/A;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "onReceiveCalled", "Z", "getOnReceiveCalled", "()Z", "setOnReceiveCalled", "(Z)V", "getOnReceiveCalled$annotations", "()V", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProxyAmazonBillingActivityBroadcastReceiver extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver.Companion INSTANCE = new com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver.Companion(null);
    public static final java.lang.String PURCHASE_FINISHED_ACTION = "com.revenuecat.purchases.purchase_finished";
    private final java.lang.ref.WeakReference<android.app.Activity> activity;
    private boolean onReceiveCalled;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver$Companion;", "", "()V", "PURCHASE_FINISHED_ACTION", "", "newPurchaseFinishedIntent", "Landroid/content/Intent;", "packageName", "newPurchaseFinishedIntentFilter", "Landroid/content/IntentFilter;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final android.content.Intent newPurchaseFinishedIntent(java.lang.String packageName) {
            kotlin.jvm.internal.m.e(packageName, "packageName");
            android.content.Intent intent = new android.content.Intent(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver.PURCHASE_FINISHED_ACTION);
            intent.setPackage(packageName);
            return intent;
        }

        public final android.content.IntentFilter newPurchaseFinishedIntentFilter() {
            return new android.content.IntentFilter(com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivityBroadcastReceiver.PURCHASE_FINISHED_ACTION);
        }

        private Companion() {
        }
    }

    public ProxyAmazonBillingActivityBroadcastReceiver(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        this.activity = new java.lang.ref.WeakReference<>(activity);
    }

    public static /* synthetic */ void getOnReceiveCalled$annotations() {
    }

    public final boolean getOnReceiveCalled() {
        return this.onReceiveCalled;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(intent, "intent");
        this.onReceiveCalled = true;
        android.app.Activity activity = this.activity.get();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void setOnReceiveCalled(boolean z6) {
        this.onReceiveCalled = z6;
    }
}
