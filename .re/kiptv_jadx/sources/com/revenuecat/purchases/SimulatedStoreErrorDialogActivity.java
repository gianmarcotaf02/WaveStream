package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/SimulatedStoreErrorDialogActivity;", "Landroid/app/Activity;", "<init>", "()V", "Lh6/A;", "crashApp", "", "wasLaunchedThroughSDK", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onPause", "", "getRedactedApiKey", "()Ljava/lang/String;", com.revenuecat.purchases.SimulatedStoreErrorDialogActivity.redactedApiKeyExtra, "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SimulatedStoreErrorDialogActivity extends android.app.Activity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.SimulatedStoreErrorDialogActivity.Companion INSTANCE = new com.revenuecat.purchases.SimulatedStoreErrorDialogActivity.Companion(null);
    private static final java.lang.String redactedApiKeyExtra = "redactedApiKey";

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/SimulatedStoreErrorDialogActivity$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", com.revenuecat.purchases.SimulatedStoreErrorDialogActivity.redactedApiKeyExtra, "Lh6/A;", "show", "(Landroid/content/Context;Ljava/lang/String;)V", "redactedApiKeyExtra", "Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final void show(android.content.Context context, java.lang.String redactedApiKey) {
            kotlin.jvm.internal.m.e(context, "context");
            kotlin.jvm.internal.m.e(redactedApiKey, "redactedApiKey");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.revenuecat.purchases.SimulatedStoreErrorDialogActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(com.revenuecat.purchases.SimulatedStoreErrorDialogActivity.redactedApiKeyExtra, redactedApiKey);
            context.startActivity(intent);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void crashApp() throws com.revenuecat.purchases.PurchasesException {
        if (!wasLaunchedThroughSDK()) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "SimulatedStoreErrorDialogActivity was launched incorrectly. This activity is only meant to be launched internally by the SDK.", null);
            finish();
        } else {
            throw new com.revenuecat.purchases.PurchasesException(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.ConfigurationError, null, 2, null), "Test Store API key used in release build: " + getRedactedApiKey() + ". Please configure the Play Store/Amazon app on the RevenueCat dashboard and use its corresponding API key before releasing. Visit https://rev.cat/sdk-test-store to learn more.");
        }
    }

    private final boolean wasLaunchedThroughSDK() {
        return getIntent().hasExtra(redactedApiKeyExtra);
    }

    public final java.lang.String getRedactedApiKey() {
        java.lang.String stringExtra = getIntent().getStringExtra(redactedApiKeyExtra);
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // android.app.Activity
    public void onBackPressed() throws com.revenuecat.purchases.PurchasesException {
        crashApp();
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFinishOnTouchOutside(false);
        new android.app.AlertDialog.Builder(this).setTitle("Wrong API Key").setMessage("This app is using a test API key: " + getRedactedApiKey() + ".\n\nTo prepare for release, update your RevenueCat settings to use a production key.\n\nFor more info, visit the RevenueCat dashboard.\n\nThe app will close now to protect the security of test purchases.").setCancelable(false).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() { // from class: com.revenuecat.purchases.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i3) throws com.revenuecat.purchases.PurchasesException {
                this.f21049h.crashApp();
            }
        }).show();
    }

    @Override // android.app.Activity
    public void onPause() throws com.revenuecat.purchases.PurchasesException {
        super.onPause();
        crashApp();
    }
}
