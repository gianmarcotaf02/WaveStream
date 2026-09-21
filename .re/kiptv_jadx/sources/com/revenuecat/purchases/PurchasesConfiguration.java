package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001?B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u00109\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0002\b:J\u0013\u0010;\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010=\u001a\u00020>H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\f8@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0011\u0010#\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000eR\u0013\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u000eR\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006@"}, d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration;", "", "builder", "Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "(Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;)V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "appUserID", "getAppUserID", "automaticDeviceIdentifierCollectionEnabled", "", "getAutomaticDeviceIdentifierCollectionEnabled", "()Z", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "getDangerousSettings", "()Lcom/revenuecat/purchases/DangerousSettings;", "diagnosticsEnabled", "getDiagnosticsEnabled", "galaxyBillingMode", "Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "getGalaxyBillingMode", "()Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "iamEnabled", "getIamEnabled$purchases_defaultsRelease", "observerMode", "getObserverMode$annotations", "()V", "getObserverMode", "pendingTransactionsForPrepaidPlansEnabled", "getPendingTransactionsForPrepaidPlansEnabled", "preferredUILocaleOverride", "getPreferredUILocaleOverride", "purchasesAreCompletedBy", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "service", "Ljava/util/concurrent/ExecutorService;", "getService", "()Ljava/util/concurrent/ExecutorService;", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "verificationMode", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "copy", "copy$purchases_defaultsRelease", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "Builder", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class PurchasesConfiguration {
    private final java.lang.String apiKey;
    private final java.lang.String appUserID;
    private final boolean automaticDeviceIdentifierCollectionEnabled;
    private final android.content.Context context;
    private final com.revenuecat.purchases.DangerousSettings dangerousSettings;
    private final boolean diagnosticsEnabled;
    private final com.revenuecat.purchases.galaxy.GalaxyBillingMode galaxyBillingMode;
    private final boolean iamEnabled;
    private final boolean pendingTransactionsForPrepaidPlansEnabled;
    private final java.lang.String preferredUILocaleOverride;
    private final com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final java.util.concurrent.ExecutorService service;
    private final boolean showInAppMessagesAutomatically;
    private final com.revenuecat.purchases.Store store;
    private final com.revenuecat.purchases.EntitlementVerificationMode verificationMode;

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010I\u001a\u00020JH\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000eJ\u000e\u0010K\u001a\u00020\u00002\u0006\u0010D\u001a\u00020CJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u0010\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000eH\u0007J\u0010\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u000eH\u0007J\u0010\u0010N\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000eH\u0007J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u000eJ\u0010\u0010+\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010\u0005J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u000204J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u000eJ\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R&\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R&\u0010(\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R*\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\rR&\u0010/\u001a\u00020.2\u0006\u0010\t\u001a\u00020.8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00105\u001a\u0004\u0018\u0001042\b\u0010\t\u001a\u0004\u0018\u0001048@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R&\u0010:\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u0010\u0013R&\u0010>\u001a\u00020=2\u0006\u0010\t\u001a\u00020=8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR&\u0010D\u001a\u00020C2\u0006\u0010\t\u001a\u00020C8@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006P"}, d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "", "context", "Landroid/content/Context;", "apiKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getApiKey$purchases_defaultsRelease", "()Ljava/lang/String;", "<set-?>", "appUserID", "getAppUserID$purchases_defaultsRelease", "setAppUserID$purchases_defaultsRelease", "(Ljava/lang/String;)V", "", "automaticDeviceIdentifierCollectionEnabled", "getAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsRelease", "()Z", "setAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsRelease", "(Z)V", "getContext$purchases_defaultsRelease", "()Landroid/content/Context;", "Lcom/revenuecat/purchases/DangerousSettings;", "dangerousSettings", "getDangerousSettings$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/DangerousSettings;", "setDangerousSettings$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/DangerousSettings;)V", "diagnosticsEnabled", "getDiagnosticsEnabled$purchases_defaultsRelease", "setDiagnosticsEnabled$purchases_defaultsRelease", "Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "galaxyBillingMode", "getGalaxyBillingMode$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "setGalaxyBillingMode$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;)V", "iamEnabled", "getIamEnabled$purchases_defaultsRelease", "setIamEnabled$purchases_defaultsRelease", "pendingTransactionsForPrepaidPlansEnabled", "getPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease", "setPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease", "preferredUILocaleOverride", "getPreferredUILocaleOverride$purchases_defaultsRelease", "setPreferredUILocaleOverride$purchases_defaultsRelease", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "getPurchasesAreCompletedBy$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "setPurchasesAreCompletedBy$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V", "Ljava/util/concurrent/ExecutorService;", "service", "getService$purchases_defaultsRelease", "()Ljava/util/concurrent/ExecutorService;", "setService$purchases_defaultsRelease", "(Ljava/util/concurrent/ExecutorService;)V", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically$purchases_defaultsRelease", "setShowInAppMessagesAutomatically$purchases_defaultsRelease", "Lcom/revenuecat/purchases/Store;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "getStore$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/Store;", "setStore$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/Store;)V", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "verificationMode", "getVerificationMode$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "setVerificationMode$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/EntitlementVerificationMode;)V", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "Lcom/revenuecat/purchases/PurchasesConfiguration;", "entitlementVerificationMode", "informationalVerificationModeAndDiagnosticsEnabled", "enabled", "observerMode", "localeString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static class Builder {
        private final java.lang.String apiKey;
        private java.lang.String appUserID;
        private boolean automaticDeviceIdentifierCollectionEnabled;
        private final android.content.Context context;
        private com.revenuecat.purchases.DangerousSettings dangerousSettings;
        private boolean diagnosticsEnabled;
        private com.revenuecat.purchases.galaxy.GalaxyBillingMode galaxyBillingMode;
        private boolean iamEnabled;
        private boolean pendingTransactionsForPrepaidPlansEnabled;
        private java.lang.String preferredUILocaleOverride;
        private com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy;
        private java.util.concurrent.ExecutorService service;
        private boolean showInAppMessagesAutomatically;
        private com.revenuecat.purchases.Store store;
        private com.revenuecat.purchases.EntitlementVerificationMode verificationMode;

        public Builder(android.content.Context context, java.lang.String apiKey) {
            kotlin.jvm.internal.m.e(context, "context");
            kotlin.jvm.internal.m.e(apiKey, "apiKey");
            this.context = context;
            this.apiKey = apiKey;
            this.purchasesAreCompletedBy = com.revenuecat.purchases.PurchasesAreCompletedBy.REVENUECAT;
            this.showInAppMessagesAutomatically = true;
            this.store = com.revenuecat.purchases.Store.PLAY_STORE;
            this.verificationMode = com.revenuecat.purchases.EntitlementVerificationMode.INSTANCE.getDefault();
            this.dangerousSettings = new com.revenuecat.purchases.DangerousSettings(false, 1, null);
            this.automaticDeviceIdentifierCollectionEnabled = true;
            this.galaxyBillingMode = com.revenuecat.purchases.galaxy.GalaxyBillingMode.PRODUCTION;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder appUserID(java.lang.String appUserID) {
            this.appUserID = appUserID;
            return this;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder automaticDeviceIdentifierCollectionEnabled(boolean automaticDeviceIdentifierCollectionEnabled) {
            this.automaticDeviceIdentifierCollectionEnabled = automaticDeviceIdentifierCollectionEnabled;
            return this;
        }

        public com.revenuecat.purchases.PurchasesConfiguration build() {
            return new com.revenuecat.purchases.PurchasesConfiguration(this);
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder dangerousSettings(com.revenuecat.purchases.DangerousSettings dangerousSettings) {
            kotlin.jvm.internal.m.e(dangerousSettings, "dangerousSettings");
            this.dangerousSettings = dangerousSettings;
            return this;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder diagnosticsEnabled(boolean diagnosticsEnabled) {
            this.diagnosticsEnabled = diagnosticsEnabled;
            return this;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder entitlementVerificationMode(com.revenuecat.purchases.EntitlementVerificationMode verificationMode) {
            kotlin.jvm.internal.m.e(verificationMode, "verificationMode");
            this.verificationMode = verificationMode;
            return this;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder galaxyBillingMode(com.revenuecat.purchases.galaxy.GalaxyBillingMode galaxyBillingMode) {
            kotlin.jvm.internal.m.e(galaxyBillingMode, "galaxyBillingMode");
            this.galaxyBillingMode = galaxyBillingMode;
            return this;
        }

        /* JADX INFO: renamed from: getApiKey$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ java.lang.String getApiKey() {
            return this.apiKey;
        }

        /* JADX INFO: renamed from: getAppUserID$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ java.lang.String getAppUserID() {
            return this.appUserID;
        }

        /* JADX INFO: renamed from: getAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ boolean getAutomaticDeviceIdentifierCollectionEnabled() {
            return this.automaticDeviceIdentifierCollectionEnabled;
        }

        /* JADX INFO: renamed from: getContext$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ android.content.Context getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: getDangerousSettings$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ com.revenuecat.purchases.DangerousSettings getDangerousSettings() {
            return this.dangerousSettings;
        }

        /* JADX INFO: renamed from: getDiagnosticsEnabled$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ boolean getDiagnosticsEnabled() {
            return this.diagnosticsEnabled;
        }

        /* JADX INFO: renamed from: getGalaxyBillingMode$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ com.revenuecat.purchases.galaxy.GalaxyBillingMode getGalaxyBillingMode() {
            return this.galaxyBillingMode;
        }

        /* JADX INFO: renamed from: getIamEnabled$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ boolean getIamEnabled() {
            return this.iamEnabled;
        }

        /* JADX INFO: renamed from: getPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ boolean getPendingTransactionsForPrepaidPlansEnabled() {
            return this.pendingTransactionsForPrepaidPlansEnabled;
        }

        /* JADX INFO: renamed from: getPreferredUILocaleOverride$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ java.lang.String getPreferredUILocaleOverride() {
            return this.preferredUILocaleOverride;
        }

        /* JADX INFO: renamed from: getPurchasesAreCompletedBy$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ com.revenuecat.purchases.PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
            return this.purchasesAreCompletedBy;
        }

        /* JADX INFO: renamed from: getService$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ java.util.concurrent.ExecutorService getService() {
            return this.service;
        }

        /* JADX INFO: renamed from: getShowInAppMessagesAutomatically$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ boolean getShowInAppMessagesAutomatically() {
            return this.showInAppMessagesAutomatically;
        }

        /* JADX INFO: renamed from: getStore$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ com.revenuecat.purchases.Store getStore() {
            return this.store;
        }

        /* JADX INFO: renamed from: getVerificationMode$purchases_defaultsRelease, reason: from getter */
        public final /* synthetic */ com.revenuecat.purchases.EntitlementVerificationMode getVerificationMode() {
            return this.verificationMode;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder iamEnabled(boolean iamEnabled) {
            this.iamEnabled = iamEnabled;
            return this;
        }

        @p070h6.c
        public final /* synthetic */ com.revenuecat.purchases.PurchasesConfiguration.Builder informationalVerificationModeAndDiagnosticsEnabled(boolean enabled) {
            if (enabled) {
                this.verificationMode = com.revenuecat.purchases.EntitlementVerificationMode.INFORMATIONAL;
                this.diagnosticsEnabled = true;
                return this;
            }
            this.verificationMode = com.revenuecat.purchases.EntitlementVerificationMode.DISABLED;
            this.diagnosticsEnabled = false;
            return this;
        }

        @p070h6.c
        public final com.revenuecat.purchases.PurchasesConfiguration.Builder observerMode(boolean observerMode) {
            purchasesAreCompletedBy(observerMode ? com.revenuecat.purchases.PurchasesAreCompletedBy.MY_APP : com.revenuecat.purchases.PurchasesAreCompletedBy.REVENUECAT);
            return this;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder pendingTransactionsForPrepaidPlansEnabled(boolean pendingTransactionsForPrepaidPlansEnabled) {
            this.pendingTransactionsForPrepaidPlansEnabled = pendingTransactionsForPrepaidPlansEnabled;
            return this;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder preferredUILocaleOverride(java.lang.String localeString) {
            this.preferredUILocaleOverride = localeString;
            return this;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder purchasesAreCompletedBy(com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy) {
            kotlin.jvm.internal.m.e(purchasesAreCompletedBy, "purchasesAreCompletedBy");
            this.purchasesAreCompletedBy = purchasesAreCompletedBy;
            return this;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder service(java.util.concurrent.ExecutorService service) {
            kotlin.jvm.internal.m.e(service, "service");
            this.service = service;
            return this;
        }

        public final /* synthetic */ void setAppUserID$purchases_defaultsRelease(java.lang.String str) {
            this.appUserID = str;
        }

        public final /* synthetic */ void setAutomaticDeviceIdentifierCollectionEnabled$purchases_defaultsRelease(boolean z6) {
            this.automaticDeviceIdentifierCollectionEnabled = z6;
        }

        public final /* synthetic */ void setDangerousSettings$purchases_defaultsRelease(com.revenuecat.purchases.DangerousSettings dangerousSettings) {
            kotlin.jvm.internal.m.e(dangerousSettings, "<set-?>");
            this.dangerousSettings = dangerousSettings;
        }

        public final /* synthetic */ void setDiagnosticsEnabled$purchases_defaultsRelease(boolean z6) {
            this.diagnosticsEnabled = z6;
        }

        public final /* synthetic */ void setGalaxyBillingMode$purchases_defaultsRelease(com.revenuecat.purchases.galaxy.GalaxyBillingMode galaxyBillingMode) {
            kotlin.jvm.internal.m.e(galaxyBillingMode, "<set-?>");
            this.galaxyBillingMode = galaxyBillingMode;
        }

        public final /* synthetic */ void setIamEnabled$purchases_defaultsRelease(boolean z6) {
            this.iamEnabled = z6;
        }

        public final /* synthetic */ void setPendingTransactionsForPrepaidPlansEnabled$purchases_defaultsRelease(boolean z6) {
            this.pendingTransactionsForPrepaidPlansEnabled = z6;
        }

        public final /* synthetic */ void setPreferredUILocaleOverride$purchases_defaultsRelease(java.lang.String str) {
            this.preferredUILocaleOverride = str;
        }

        public final /* synthetic */ void setPurchasesAreCompletedBy$purchases_defaultsRelease(com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy) {
            kotlin.jvm.internal.m.e(purchasesAreCompletedBy, "<set-?>");
            this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        }

        public final /* synthetic */ void setService$purchases_defaultsRelease(java.util.concurrent.ExecutorService executorService) {
            this.service = executorService;
        }

        public final /* synthetic */ void setShowInAppMessagesAutomatically$purchases_defaultsRelease(boolean z6) {
            this.showInAppMessagesAutomatically = z6;
        }

        public final /* synthetic */ void setStore$purchases_defaultsRelease(com.revenuecat.purchases.Store store) {
            kotlin.jvm.internal.m.e(store, "<set-?>");
            this.store = store;
        }

        public final /* synthetic */ void setVerificationMode$purchases_defaultsRelease(com.revenuecat.purchases.EntitlementVerificationMode entitlementVerificationMode) {
            kotlin.jvm.internal.m.e(entitlementVerificationMode, "<set-?>");
            this.verificationMode = entitlementVerificationMode;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder showInAppMessagesAutomatically(boolean showInAppMessagesAutomatically) {
            this.showInAppMessagesAutomatically = showInAppMessagesAutomatically;
            return this;
        }

        public final com.revenuecat.purchases.PurchasesConfiguration.Builder store(com.revenuecat.purchases.Store store) {
            kotlin.jvm.internal.m.e(store, "store");
            this.store = store;
            return this;
        }
    }

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

    public PurchasesConfiguration(com.revenuecat.purchases.PurchasesConfiguration.Builder builder) {
        android.content.Context applicationContext;
        kotlin.jvm.internal.m.e(builder, "builder");
        if (com.revenuecat.purchases.common.UtilsKt.isDeviceProtectedStorageCompat(builder.getContext())) {
            applicationContext = builder.getContext();
        } else {
            applicationContext = builder.getContext().getApplicationContext();
            kotlin.jvm.internal.m.d(applicationContext, "{\n                builde…tionContext\n            }");
        }
        this.context = applicationContext;
        this.apiKey = O7.q.r1(builder.getApiKey()).toString();
        this.appUserID = builder.getAppUserID();
        this.purchasesAreCompletedBy = builder.getPurchasesAreCompletedBy();
        this.service = builder.getService();
        this.store = builder.getStore();
        this.diagnosticsEnabled = builder.getDiagnosticsEnabled();
        this.verificationMode = builder.getVerificationMode();
        this.dangerousSettings = builder.getDangerousSettings();
        this.showInAppMessagesAutomatically = builder.getShowInAppMessagesAutomatically();
        this.pendingTransactionsForPrepaidPlansEnabled = builder.getPendingTransactionsForPrepaidPlansEnabled();
        this.automaticDeviceIdentifierCollectionEnabled = builder.getAutomaticDeviceIdentifierCollectionEnabled();
        this.preferredUILocaleOverride = builder.getPreferredUILocaleOverride();
        this.galaxyBillingMode = builder.getGalaxyBillingMode();
        this.iamEnabled = builder.getIamEnabled();
    }

    public static /* synthetic */ com.revenuecat.purchases.PurchasesConfiguration copy$purchases_defaultsRelease$default(com.revenuecat.purchases.PurchasesConfiguration purchasesConfiguration, java.lang.String str, java.util.concurrent.ExecutorService executorService, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i3 & 1) != 0) {
            str = purchasesConfiguration.appUserID;
        }
        if ((i3 & 2) != 0) {
            executorService = purchasesConfiguration.service;
        }
        return purchasesConfiguration.copy$purchases_defaultsRelease(str, executorService);
    }

    @p070h6.c
    public static /* synthetic */ void getObserverMode$annotations() {
    }

    public final com.revenuecat.purchases.PurchasesConfiguration copy$purchases_defaultsRelease(java.lang.String appUserID, java.util.concurrent.ExecutorService service) {
        com.revenuecat.purchases.PurchasesConfiguration.Builder builderIamEnabled = new com.revenuecat.purchases.PurchasesConfiguration.Builder(this.context, this.apiKey).appUserID(appUserID).purchasesAreCompletedBy(this.purchasesAreCompletedBy).store(this.store).diagnosticsEnabled(this.diagnosticsEnabled).entitlementVerificationMode(this.verificationMode).dangerousSettings(this.dangerousSettings).showInAppMessagesAutomatically(this.showInAppMessagesAutomatically).pendingTransactionsForPrepaidPlansEnabled(this.pendingTransactionsForPrepaidPlansEnabled).automaticDeviceIdentifierCollectionEnabled(this.automaticDeviceIdentifierCollectionEnabled).preferredUILocaleOverride(this.preferredUILocaleOverride).galaxyBillingMode(this.galaxyBillingMode).iamEnabled(this.iamEnabled);
        if (service != null) {
            builderIamEnabled = builderIamEnabled.service(service);
        }
        return builderIamEnabled.build();
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(other, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesConfiguration");
        com.revenuecat.purchases.PurchasesConfiguration purchasesConfiguration = (com.revenuecat.purchases.PurchasesConfiguration) other;
        return kotlin.jvm.internal.m.a(this.apiKey, purchasesConfiguration.apiKey) && kotlin.jvm.internal.m.a(this.appUserID, purchasesConfiguration.appUserID) && this.purchasesAreCompletedBy == purchasesConfiguration.purchasesAreCompletedBy && this.showInAppMessagesAutomatically == purchasesConfiguration.showInAppMessagesAutomatically && this.store == purchasesConfiguration.store && this.diagnosticsEnabled == purchasesConfiguration.diagnosticsEnabled && kotlin.jvm.internal.m.a(this.dangerousSettings, purchasesConfiguration.dangerousSettings) && this.verificationMode == purchasesConfiguration.verificationMode && this.pendingTransactionsForPrepaidPlansEnabled == purchasesConfiguration.pendingTransactionsForPrepaidPlansEnabled && this.automaticDeviceIdentifierCollectionEnabled == purchasesConfiguration.automaticDeviceIdentifierCollectionEnabled && kotlin.jvm.internal.m.a(this.preferredUILocaleOverride, purchasesConfiguration.preferredUILocaleOverride) && kotlin.jvm.internal.m.a(this.galaxyBillingMode, purchasesConfiguration.galaxyBillingMode) && this.iamEnabled == purchasesConfiguration.iamEnabled;
    }

    public final java.lang.String getApiKey() {
        return this.apiKey;
    }

    public final java.lang.String getAppUserID() {
        return this.appUserID;
    }

    public final boolean getAutomaticDeviceIdentifierCollectionEnabled() {
        return this.automaticDeviceIdentifierCollectionEnabled;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final com.revenuecat.purchases.DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    public final com.revenuecat.purchases.galaxy.GalaxyBillingMode getGalaxyBillingMode() {
        return this.galaxyBillingMode;
    }

    /* JADX INFO: renamed from: getIamEnabled$purchases_defaultsRelease, reason: from getter */
    public final /* synthetic */ boolean getIamEnabled() {
        return this.iamEnabled;
    }

    public final boolean getObserverMode() {
        int i3 = com.revenuecat.purchases.PurchasesConfiguration.WhenMappings.$EnumSwitchMapping$0[this.purchasesAreCompletedBy.ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            return true;
        }
        throw new I3.b();
    }

    public final boolean getPendingTransactionsForPrepaidPlansEnabled() {
        return this.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final java.lang.String getPreferredUILocaleOverride() {
        return this.preferredUILocaleOverride;
    }

    public final com.revenuecat.purchases.PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final java.util.concurrent.ExecutorService getService() {
        return this.service;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final com.revenuecat.purchases.Store getStore() {
        return this.store;
    }

    public final com.revenuecat.purchases.EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    public int hashCode() {
        int iHashCode = this.apiKey.hashCode() * 31;
        java.lang.String str = this.appUserID;
        int iF = p121o0.p.f(p121o0.p.f((this.verificationMode.hashCode() + ((this.dangerousSettings.hashCode() + p121o0.p.f((this.store.hashCode() + p121o0.p.f((this.purchasesAreCompletedBy.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.showInAppMessagesAutomatically)) * 31, 31, this.diagnosticsEnabled)) * 31)) * 31, 31, this.pendingTransactionsForPrepaidPlansEnabled), 31, this.automaticDeviceIdentifierCollectionEnabled);
        java.lang.String str2 = this.preferredUILocaleOverride;
        return java.lang.Boolean.hashCode(this.iamEnabled) + ((this.galaxyBillingMode.hashCode() + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
