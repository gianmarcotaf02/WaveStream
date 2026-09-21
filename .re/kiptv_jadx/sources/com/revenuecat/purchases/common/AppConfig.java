package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 U2\u00020\u0001:\u0001UBo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0013\u0010P\u001a\u00020\u00072\b\u0010Q\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010R\u001a\u00020SH\u0016J\b\u0010T\u001a\u00020\u0016H\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010/R\u001c\u0010\u0014\u001a\u00020\u00078FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010/R$\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010/R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u0011\u00105\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u00108\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b9\u00107R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010<\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b=\u00107R\u0013\u0010>\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010F\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bG\u0010\u001eR\u0017\u0010H\u001a\u00020\u00078F¢\u0006\f\u0012\u0004\bI\u0010J\u001a\u0004\bK\u0010\u001eR\u0011\u0010L\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bM\u0010\u001eR\u0011\u0010N\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bO\u00107¨\u0006V"}, d2 = {"Lcom/revenuecat/purchases/common/AppConfig;", "", "context", "Landroid/content/Context;", "purchasesAreCompletedBy", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "showInAppMessagesAutomatically", "", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "proxyURL", "Ljava/net/URL;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "isDebugBuild", "apiKeyValidationResult", "Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "runningTests", "forceSigningErrors", "baseUrlString", "", "(Landroid/content/Context;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;ZLcom/revenuecat/purchases/common/PlatformInfo;Ljava/net/URL;Lcom/revenuecat/purchases/Store;ZLcom/revenuecat/purchases/APIKeyValidator$ValidationResult;Lcom/revenuecat/purchases/DangerousSettings;ZZLjava/lang/String;)V", "_isAppBackgrounded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getApiKeyValidationResult", "()Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "applyObfuscatedAccountIdToSubscriptionChanges", "getApplyObfuscatedAccountIdToSubscriptionChanges", "()Z", "baseURL", "getBaseURL", "()Ljava/net/URL;", "customEntitlementComputation", "getCustomEntitlementComputation", "getDangerousSettings", "()Lcom/revenuecat/purchases/DangerousSettings;", "enableOfflineEntitlements", "getEnableOfflineEntitlements", "fallbackBaseURLs", "", "getFallbackBaseURLs", "()Ljava/util/List;", "finishTransactions", "getFinishTransactions", "setFinishTransactions", "(Z)V", "getForceSigningErrors", "setForceSigningErrors", "value", "isAppBackgrounded", "setAppBackgrounded", "languageTag", "getLanguageTag", "()Ljava/lang/String;", "packageName", "getPackageName", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "playServicesVersionName", "getPlayServicesVersionName", "playStoreVersionName", "getPlayStoreVersionName", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getRunningTests", "getShowInAppMessagesAutomatically", "getStore", "()Lcom/revenuecat/purchases/Store;", "uiPreviewMode", "getUiPreviewMode", "useWorkflows", "getUseWorkflows$annotations", "()V", "getUseWorkflows", "usesRemoteConfigAPISources", "getUsesRemoteConfigAPISources", "versionName", "getVersionName", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AppConfig {
    public static final java.lang.String baseUrlString = "https://api.revenuecat.com/";
    private final java.util.concurrent.atomic.AtomicBoolean _isAppBackgrounded;
    private final com.revenuecat.purchases.APIKeyValidator.ValidationResult apiKeyValidationResult;
    private final java.net.URL baseURL;
    private final com.revenuecat.purchases.DangerousSettings dangerousSettings;
    private final boolean enableOfflineEntitlements;
    private final java.util.List<java.net.URL> fallbackBaseURLs;
    private boolean finishTransactions;
    private boolean forceSigningErrors;
    private final boolean isDebugBuild;
    private final java.lang.String languageTag;
    private final java.lang.String packageName;
    private final com.revenuecat.purchases.common.PlatformInfo platformInfo;
    private final java.lang.String playServicesVersionName;
    private final java.lang.String playStoreVersionName;
    private final com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final boolean runningTests;
    private final boolean showInAppMessagesAutomatically;
    private final com.revenuecat.purchases.Store store;
    private final java.lang.String versionName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.AppConfig.Companion INSTANCE = new com.revenuecat.purchases.common.AppConfig.Companion(null);
    private static final java.net.URL diagnosticsURL = new java.net.URL("https://api-diagnostics.revenuecat.com/");
    private static final java.net.URL paywallEventsURL = new java.net.URL("https://api-paywalls.revenuecat.com/");
    private static final java.net.URL adEventsURL = new java.net.URL("https://a.revenue.cat/");
    private static final java.net.URL fallbackURL = new java.net.URL("https://api-production.8-lives-cat.io/");

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/common/AppConfig$Companion;", "", "()V", "adEventsURL", "Ljava/net/URL;", "getAdEventsURL", "()Ljava/net/URL;", "baseUrlString", "", "diagnosticsURL", "getDiagnosticsURL", "fallbackURL", "getFallbackURL", "paywallEventsURL", "getPaywallEventsURL", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final java.net.URL getAdEventsURL() {
            return com.revenuecat.purchases.common.AppConfig.adEventsURL;
        }

        public final java.net.URL getDiagnosticsURL() {
            return com.revenuecat.purchases.common.AppConfig.diagnosticsURL;
        }

        public final java.net.URL getFallbackURL() {
            return com.revenuecat.purchases.common.AppConfig.fallbackURL;
        }

        public final java.net.URL getPaywallEventsURL() {
            return com.revenuecat.purchases.common.AppConfig.paywallEventsURL;
        }

        private Companion() {
        }
    }

    public AppConfig(android.content.Context context, com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z6, com.revenuecat.purchases.common.PlatformInfo platformInfo, java.net.URL url, com.revenuecat.purchases.Store store, boolean z9, com.revenuecat.purchases.APIKeyValidator.ValidationResult apiKeyValidationResult, com.revenuecat.purchases.DangerousSettings dangerousSettings, boolean z10, boolean z11, java.lang.String baseUrlString2) {
        java.net.URL url2;
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        kotlin.jvm.internal.m.e(platformInfo, "platformInfo");
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(apiKeyValidationResult, "apiKeyValidationResult");
        kotlin.jvm.internal.m.e(dangerousSettings, "dangerousSettings");
        kotlin.jvm.internal.m.e(baseUrlString2, "baseUrlString");
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        this.showInAppMessagesAutomatically = z6;
        this.platformInfo = platformInfo;
        this.store = store;
        this.isDebugBuild = z9;
        this.apiKeyValidationResult = apiKeyValidationResult;
        this.dangerousSettings = dangerousSettings;
        this.runningTests = z10;
        this.forceSigningErrors = z11;
        this._isAppBackgrounded = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.enableOfflineEntitlements = true;
        java.util.Locale locale = com.revenuecat.purchases.common.UtilsKt.getLocale(context);
        java.lang.String languageTag = locale != null ? locale.toLanguageTag() : null;
        this.languageTag = languageTag == null ? "" : languageTag;
        java.lang.String versionName = com.revenuecat.purchases.common.UtilsKt.getVersionName(context);
        this.versionName = versionName != null ? versionName : "";
        java.lang.String packageName = context.getPackageName();
        kotlin.jvm.internal.m.d(packageName, "context.packageName");
        this.packageName = packageName;
        this.finishTransactions = com.revenuecat.purchases.PurchasesAreCompletedByKt.getFinishTransactions(purchasesAreCompletedBy);
        if (url != null) {
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.INFO;
            com.revenuecat.purchases.common.AppConfig$baseURL$lambda$1$$inlined$log$1 appConfig$baseURL$lambda$1$$inlined$log$1 = new com.revenuecat.purchases.common.AppConfig$baseURL$lambda$1$$inlined$log$1(logIntent);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) appConfig$baseURL$lambda$1$$inlined$log$1.invoke(), null);
                    break;
            }
            url2 = url;
        } else {
            url2 = new java.net.URL(baseUrlString2);
        }
        this.baseURL = url2;
        this.fallbackBaseURLs = url != null ? p078i6.w.f23205h : com.google.common.util.concurrent.P.i0(fallbackURL);
        this.playStoreVersionName = com.revenuecat.purchases.common.UtilsKt.getPlayStoreVersionName(context);
        this.playServicesVersionName = com.revenuecat.purchases.common.UtilsKt.getPlayServicesVersionName(context);
    }

    public static /* synthetic */ void getUseWorkflows$annotations() {
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!com.revenuecat.purchases.common.AppConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.AppConfig");
        com.revenuecat.purchases.common.AppConfig appConfig = (com.revenuecat.purchases.common.AppConfig) other;
        return kotlin.jvm.internal.m.a(this.platformInfo, appConfig.platformInfo) && this.store == appConfig.store && this.isDebugBuild == appConfig.isDebugBuild && kotlin.jvm.internal.m.a(this.dangerousSettings, appConfig.dangerousSettings) && kotlin.jvm.internal.m.a(this.languageTag, appConfig.languageTag) && kotlin.jvm.internal.m.a(this.versionName, appConfig.versionName) && kotlin.jvm.internal.m.a(this.packageName, appConfig.packageName) && this.finishTransactions == appConfig.finishTransactions && getForceSigningErrors() == appConfig.getForceSigningErrors() && kotlin.jvm.internal.m.a(this.baseURL, appConfig.baseURL) && this.showInAppMessagesAutomatically == appConfig.showInAppMessagesAutomatically && isAppBackgrounded() == appConfig.isAppBackgrounded() && this.apiKeyValidationResult == appConfig.apiKeyValidationResult;
    }

    public final com.revenuecat.purchases.APIKeyValidator.ValidationResult getApiKeyValidationResult() {
        return this.apiKeyValidationResult;
    }

    public final boolean getApplyObfuscatedAccountIdToSubscriptionChanges() {
        return this.dangerousSettings.getApplyObfuscatedAccountIdToSubscriptionChanges();
    }

    public final java.net.URL getBaseURL() {
        return this.baseURL;
    }

    public final boolean getCustomEntitlementComputation() {
        return this.dangerousSettings.getCustomEntitlementComputation();
    }

    public final com.revenuecat.purchases.DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getEnableOfflineEntitlements() {
        return this.enableOfflineEntitlements;
    }

    public final java.util.List<java.net.URL> getFallbackBaseURLs() {
        return this.fallbackBaseURLs;
    }

    public final boolean getFinishTransactions() {
        return this.finishTransactions;
    }

    public final boolean getForceSigningErrors() {
        return this.runningTests && this.forceSigningErrors;
    }

    public final java.lang.String getLanguageTag() {
        return this.languageTag;
    }

    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public final com.revenuecat.purchases.common.PlatformInfo getPlatformInfo() {
        return this.platformInfo;
    }

    public final java.lang.String getPlayServicesVersionName() {
        return this.playServicesVersionName;
    }

    public final java.lang.String getPlayStoreVersionName() {
        return this.playStoreVersionName;
    }

    public final com.revenuecat.purchases.PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final boolean getRunningTests() {
        return this.runningTests;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final com.revenuecat.purchases.Store getStore() {
        return this.store;
    }

    public final boolean getUiPreviewMode() {
        return this.dangerousSettings.getUiPreviewMode();
    }

    public final boolean getUseWorkflows() {
        return this.dangerousSettings.getUseWorkflows();
    }

    public final boolean getUsesRemoteConfigAPISources() {
        return this.dangerousSettings.getUsesRemoteConfigAPISources();
    }

    public final java.lang.String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.apiKeyValidationResult.hashCode() + ((java.lang.Boolean.hashCode(isAppBackgrounded()) + p121o0.p.f((this.baseURL.hashCode() + ((java.lang.Boolean.hashCode(getForceSigningErrors()) + p121o0.p.f(B2.a.a(B2.a.a(B2.a.a((this.dangerousSettings.hashCode() + p121o0.p.f((this.store.hashCode() + (this.platformInfo.hashCode() * 31)) * 31, 31, this.isDebugBuild)) * 31, 31, this.languageTag), 31, this.versionName), 31, this.packageName), 31, this.finishTransactions)) * 31)) * 31, 31, this.showInAppMessagesAutomatically)) * 31);
    }

    public final boolean isAppBackgrounded() {
        return this._isAppBackgrounded.get();
    }

    /* JADX INFO: renamed from: isDebugBuild, reason: from getter */
    public final boolean getIsDebugBuild() {
        return this.isDebugBuild;
    }

    public final void setAppBackgrounded(boolean z6) {
        this._isAppBackgrounded.set(z6);
    }

    public final void setFinishTransactions(boolean z6) {
        this.finishTransactions = z6;
    }

    public final void setForceSigningErrors(boolean z6) {
        this.forceSigningErrors = z6;
    }

    public java.lang.String toString() {
        return "AppConfig(platformInfo=" + this.platformInfo + ", store=" + this.store + ", isDebugBuild=" + this.isDebugBuild + ", dangerousSettings=" + this.dangerousSettings + ", languageTag='" + this.languageTag + "', versionName='" + this.versionName + "', packageName='" + this.packageName + "', finishTransactions=" + this.finishTransactions + ", showInAppMessagesAutomatically=" + this.showInAppMessagesAutomatically + ", apiKeyValidationResult=" + this.apiKeyValidationResult + ", baseURL=" + this.baseURL + ')';
    }

    public /* synthetic */ AppConfig(android.content.Context context, com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z6, com.revenuecat.purchases.common.PlatformInfo platformInfo, java.net.URL url, com.revenuecat.purchases.Store store, boolean z9, com.revenuecat.purchases.APIKeyValidator.ValidationResult validationResult, com.revenuecat.purchases.DangerousSettings dangerousSettings, boolean z10, boolean z11, java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(context, purchasesAreCompletedBy, z6, platformInfo, url, store, z9, validationResult, (i3 & 256) != 0 ? new com.revenuecat.purchases.DangerousSettings(true) : dangerousSettings, (i3 & 512) != 0 ? false : z10, (i3 & 1024) != 0 ? false : z11, (i3 & 2048) != 0 ? baseUrlString : str);
    }
}
