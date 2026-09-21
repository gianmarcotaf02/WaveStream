package com.revenuecat.purchases.identity;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001IBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u001aJ\u0019\u0010#\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010\u001aJ\u001d\u0010+\u001a\u00020\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b-\u0010\u001aJ\u0018\u0010/\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b/\u00100JC\u00106\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0018012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u001803¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b8\u0010\u001aJ#\u0010:\u001a\u00020\u00182\u0014\u00109\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020\u001803¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010FR\u0011\u0010H\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bG\u0010&¨\u0006J"}, d2 = {"Lcom/revenuecat/purchases/identity/IdentityManager;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "subscriberAttributesCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigManager;", "remoteConfigManager", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "", "uiPreviewMode", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigManager;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/common/Dispatcher;Z)V", "", "newAppUserID", "Lh6/A;", "clearRemoteConfigThenOfferingsCaches", "(Ljava/lang/String;)V", "oldAppUserId", "newAppUserId", "copySubscriberAttributesToNewUserIfOldIsAnonymous", "(Ljava/lang/String;Ljava/lang/String;)V", "appUserID", "invalidateETagCacheIfNeeded", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "shouldInvalidateETagCache", "(Lcom/revenuecat/purchases/CustomerInfo;)Z", "generateRandomID", "()Ljava/lang/String;", "newUserID", "resetAndSaveUserID", "Lkotlin/Function0;", "command", "enqueue", "(Lkotlin/jvm/functions/Function0;)V", "configure", "oldAppUserID", "aliasCurrentUserIdTo", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "logIn", "(Ljava/lang/String;Lx6/m;Lx6/j;)V", "switchUser", "completion", "logOut", "(Lx6/j;)V", "currentUserIsAnonymous", "()Z", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigManager;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Z", "getCurrentAppUserID", "currentAppUserID", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class IdentityManager {
    public static final java.lang.String UI_PREVIEW_MODE_APP_USER_ID = "$RC_PREVIEW_MODE_USER";
    private final com.revenuecat.purchases.common.Backend backend;
    private final com.revenuecat.purchases.common.caching.DeviceCache deviceCache;
    private final com.revenuecat.purchases.common.Dispatcher dispatcher;
    private final com.revenuecat.purchases.common.offerings.OfferingsCache offeringsCache;
    private final com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager offlineEntitlementsManager;
    private final com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager;
    private final com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache subscriberAttributesCache;
    private final com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager subscriberAttributesManager;
    private final boolean uiPreviewMode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.identity.IdentityManager.Companion INSTANCE = new com.revenuecat.purchases.identity.IdentityManager.Companion(null);
    private static final O7.o anonymousIdRegex = new O7.o("^\\$RCAnonymousID:([a-f0-9]{32})$");

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/identity/IdentityManager$Companion;", "", "<init>", "()V", "", "appUserID", "", "isUserIDAnonymous", "(Ljava/lang/String;)Z", "UI_PREVIEW_MODE_APP_USER_ID", "Ljava/lang/String;", "LO7/o;", "anonymousIdRegex", "LO7/o;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final boolean isUserIDAnonymous(java.lang.String appUserID) {
            kotlin.jvm.internal.m.e(appUserID, "appUserID");
            return com.revenuecat.purchases.identity.IdentityManager.anonymousIdRegex.d(appUserID);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$configure$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m176invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m176invoke() {
            com.revenuecat.purchases.identity.IdentityManager.this.deviceCache.cleanupOldAttributionData$purchases_defaultsRelease();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$4, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass4 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ java.lang.String $newAppUserID;
        final /* synthetic */ java.lang.String $oldAppUserID;
        final /* synthetic */ p194x6.j $onError;
        final /* synthetic */ p194x6.m $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$4$1, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.m {
            final /* synthetic */ java.lang.String $newAppUserID;
            final /* synthetic */ java.lang.String $oldAppUserID;
            final /* synthetic */ p194x6.m $onSuccess;
            final /* synthetic */ com.revenuecat.purchases.identity.IdentityManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(com.revenuecat.purchases.identity.IdentityManager identityManager, p194x6.m mVar, java.lang.String str, java.lang.String str2) {
                super(2);
                this.this$0 = identityManager;
                this.$onSuccess = mVar;
                this.$oldAppUserID = str;
                this.$newAppUserID = str2;
            }

            @Override // p194x6.m
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Throwable {
                invoke((com.revenuecat.purchases.CustomerInfo) obj, ((java.lang.Boolean) obj2).booleanValue());
                return p070h6.A.f22523a;
            }

            public final void invoke(com.revenuecat.purchases.CustomerInfo customerInfo, boolean z6) throws java.lang.Throwable {
                com.revenuecat.purchases.LogHandler currentLogHandler;
                java.lang.String str;
                java.lang.String str2;
                kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
                com.revenuecat.purchases.identity.IdentityManager identityManager = this.this$0;
                java.lang.String str3 = this.$oldAppUserID;
                java.lang.String str4 = this.$newAppUserID;
                synchronized (identityManager) {
                    try {
                        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.USER;
                        try {
                            com.revenuecat.purchases.identity.IdentityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1 identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1 = new com.revenuecat.purchases.identity.IdentityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1(logIntent, str4, z6);
                            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                                case 1:
                                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 2:
                                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                    break;
                                case 3:
                                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 4:
                                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 5:
                                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                        str = "[Purchases] - " + logLevel4.name();
                                        str2 = (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                        currentLogHandler.d(str, str2);
                                    }
                                    break;
                                case 6:
                                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                    break;
                                case 7:
                                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 8:
                                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                        str = "[Purchases] - " + logLevel6.name();
                                        str2 = (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                        currentLogHandler.d(str, str2);
                                    }
                                    break;
                                case 9:
                                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                        str = "[Purchases] - " + logLevel7.name();
                                        str2 = (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke();
                                        currentLogHandler.d(str, str2);
                                    }
                                    break;
                                case 10:
                                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 11:
                                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 12:
                                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                    break;
                                case 13:
                                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke());
                                    }
                                    break;
                                case 14:
                                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logIn$4$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                                    break;
                            }
                            identityManager.deviceCache.clearCachesForAppUserID$purchases_defaultsRelease(str3);
                            identityManager.clearRemoteConfigThenOfferingsCaches(str4);
                            identityManager.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(str3);
                            identityManager.deviceCache.cacheAppUserID$purchases_defaultsRelease(str4);
                            identityManager.deviceCache.cacheCustomerInfo$purchases_defaultsRelease(str4, customerInfo);
                            identityManager.copySubscriberAttributesToNewUserIfOldIsAnonymous(str3, str4);
                            identityManager.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                            this.$onSuccess.invoke(customerInfo, java.lang.Boolean.valueOf(z6));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(java.lang.String str, java.lang.String str2, p194x6.j jVar, p194x6.m mVar) {
            super(0);
            this.$oldAppUserID = str;
            this.$newAppUserID = str2;
            this.$onError = jVar;
            this.$onSuccess = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m177invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m177invoke() {
            com.revenuecat.purchases.common.Backend backend = com.revenuecat.purchases.identity.IdentityManager.this.backend;
            java.lang.String str = this.$oldAppUserID;
            java.lang.String str2 = this.$newAppUserID;
            backend.logIn(str, str2, new com.revenuecat.purchases.identity.IdentityManager.AnonymousClass4.AnonymousClass1(com.revenuecat.purchases.identity.IdentityManager.this, this.$onSuccess, str, str2), this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.identity.IdentityManager$logOut$3, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ p194x6.j $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(p194x6.j jVar) {
            super(0);
            this.$completion = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m178invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m178invoke() {
            com.revenuecat.purchases.LogHandler currentLogHandler;
            java.lang.String strM;
            java.lang.String str;
            com.revenuecat.purchases.identity.IdentityManager identityManager = com.revenuecat.purchases.identity.IdentityManager.this;
            identityManager.resetAndSaveUserID(identityManager.generateRandomID());
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.USER;
            com.revenuecat.purchases.identity.IdentityManager$logOut$3$invoke$$inlined$log$1 identityManager$logOut$3$invoke$$inlined$log$1 = new com.revenuecat.purchases.identity.IdentityManager$logOut$3$invoke$$inlined$log$1(logIntent);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logOut$3$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            this.$completion.invoke(null);
        }
    }

    public IdentityManager(com.revenuecat.purchases.common.caching.DeviceCache deviceCache, com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache subscriberAttributesCache, com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager subscriberAttributesManager, com.revenuecat.purchases.common.offerings.OfferingsCache offeringsCache, com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager, com.revenuecat.purchases.common.Backend backend, com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager offlineEntitlementsManager, com.revenuecat.purchases.common.Dispatcher dispatcher, boolean z6) {
        kotlin.jvm.internal.m.e(deviceCache, "deviceCache");
        kotlin.jvm.internal.m.e(subscriberAttributesCache, "subscriberAttributesCache");
        kotlin.jvm.internal.m.e(subscriberAttributesManager, "subscriberAttributesManager");
        kotlin.jvm.internal.m.e(offeringsCache, "offeringsCache");
        kotlin.jvm.internal.m.e(backend, "backend");
        kotlin.jvm.internal.m.e(offlineEntitlementsManager, "offlineEntitlementsManager");
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCache = subscriberAttributesCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offeringsCache = offeringsCache;
        this.remoteConfigManager = remoteConfigManager;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.dispatcher = dispatcher;
        this.uiPreviewMode = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearRemoteConfigThenOfferingsCaches(java.lang.String newAppUserID) {
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager = this.remoteConfigManager;
        if (remoteConfigManager != null) {
            remoteConfigManager.clearCache(newAppUserID);
        }
        this.offeringsCache.clearCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copySubscriberAttributesToNewUserIfOldIsAnonymous(java.lang.String oldAppUserId, java.lang.String newAppUserId) {
        if (INSTANCE.isUserIDAnonymous(oldAppUserId)) {
            this.subscriberAttributesManager.copyUnsyncedSubscriberAttributes(oldAppUserId, newAppUserId);
        }
    }

    private final synchronized void enqueue(kotlin.jvm.functions.Function0 command) {
        this.dispatcher.enqueue(new O.c(7, command), com.revenuecat.purchases.common.Delay.NONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String generateRandomID() {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        java.lang.String string = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.m.d(string, "randomUUID().toString()");
        java.util.Locale ROOT = java.util.Locale.ROOT;
        kotlin.jvm.internal.m.d(ROOT, "ROOT");
        java.lang.String lowerCase = string.toLowerCase(ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        java.lang.String strW0 = O7.x.w0(lowerCase, "-", "");
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.USER;
        com.revenuecat.purchases.identity.IdentityManager$generateRandomID$lambda$12$$inlined$log$1 identityManager$generateRandomID$lambda$12$$inlined$log$1 = new com.revenuecat.purchases.identity.IdentityManager$generateRandomID$lambda$12$$inlined$log$1(logIntent);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$generateRandomID$lambda$12$$inlined$log$1.invoke(), null);
                break;
        }
        return "$RCAnonymousID:".concat(strW0);
    }

    private final void invalidateETagCacheIfNeeded(java.lang.String appUserID) {
        if (!kotlin.jvm.internal.m.a(this.backend.getVerificationMode(), com.revenuecat.purchases.common.verification.SignatureVerificationMode.Disabled.INSTANCE) && shouldInvalidateETagCache(this.deviceCache.getCachedCustomerInfo$purchases_defaultsRelease(appUserID))) {
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.INFO;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.i("[Purchases] - " + logLevel.name(), com.revenuecat.purchases.strings.IdentityStrings.INVALIDATING_CACHED_ETAG_CACHE);
            }
            this.backend.clearCaches();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void resetAndSaveUserID(java.lang.String newUserID) {
        this.deviceCache.clearCachesForAppUserID$purchases_defaultsRelease(getCurrentAppUserID());
        clearRemoteConfigThenOfferingsCaches(newUserID);
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        this.deviceCache.cacheAppUserID$purchases_defaultsRelease(newUserID);
        this.backend.clearCaches();
    }

    private final boolean shouldInvalidateETagCache(com.revenuecat.purchases.CustomerInfo customerInfo) {
        return (customerInfo == null || customerInfo.getEntitlements().getVerification() != com.revenuecat.purchases.VerificationResult.NOT_REQUESTED || kotlin.jvm.internal.m.a(this.backend.getVerificationMode(), com.revenuecat.purchases.common.verification.SignatureVerificationMode.Disabled.INSTANCE)) ? false : true;
    }

    public final java.lang.Object aliasCurrentUserIdTo(java.lang.String str, p100l6.c cVar) {
        java.lang.String currentAppUserID = getCurrentAppUserID();
        S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(cVar));
        c0895k.r();
        this.backend.aliasUsers(str, currentAppUserID, new com.revenuecat.purchases.identity.IdentityManager$aliasCurrentUserIdTo$2$1(this, c0895k, currentAppUserID, str), new com.revenuecat.purchases.identity.IdentityManager$aliasCurrentUserIdTo$2$2(c0895k));
        java.lang.Object objQ = c0895k.q();
        return objQ == p109m6.a.f25430h ? objQ : p070h6.A.f22523a;
    }

    public final synchronized void configure(java.lang.String appUserID) {
        java.lang.String cachedAppUserID$purchases_defaultsRelease;
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        try {
            if (this.uiPreviewMode) {
                com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.USER;
                com.revenuecat.purchases.identity.IdentityManager$configure$$inlined$log$1 identityManager$configure$$inlined$log$1 = new com.revenuecat.purchases.identity.IdentityManager$configure$$inlined$log$1(logIntent);
                switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (java.lang.String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 2:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (java.lang.String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 4:
                        com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (java.lang.String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 5:
                        com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (java.lang.String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 6:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (java.lang.String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 8:
                        com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (java.lang.String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 9:
                        com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (java.lang.String) identityManager$configure$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                        }
                        break;
                    case 10:
                        com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (java.lang.String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 11:
                        com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (java.lang.String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 12:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (java.lang.String) identityManager$configure$$inlined$log$1.invoke());
                        }
                        break;
                    case 14:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$1.invoke(), null);
                        break;
                }
                cachedAppUserID$purchases_defaultsRelease = UI_PREVIEW_MODE_APP_USER_ID;
            } else if (appUserID == null || O7.q.N0(appUserID)) {
                if (appUserID != null && O7.q.N0(appUserID)) {
                    com.revenuecat.purchases.common.LogIntent logIntent2 = com.revenuecat.purchases.common.LogIntent.WARNING;
                    com.revenuecat.purchases.identity.IdentityManager$configure$$inlined$log$2 identityManager$configure$$inlined$log$2 = new com.revenuecat.purchases.identity.IdentityManager$configure$$inlined$log$2(logIntent2);
                    switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            com.revenuecat.purchases.LogLevel logLevel11 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (java.lang.String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 2:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                        case 3:
                            com.revenuecat.purchases.LogLevel logLevel12 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (java.lang.String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 4:
                            com.revenuecat.purchases.LogLevel logLevel13 = com.revenuecat.purchases.LogLevel.INFO;
                            com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (java.lang.String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 5:
                            com.revenuecat.purchases.LogLevel logLevel14 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler11 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (java.lang.String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 6:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                        case 7:
                            com.revenuecat.purchases.LogLevel logLevel15 = com.revenuecat.purchases.LogLevel.INFO;
                            com.revenuecat.purchases.LogHandler currentLogHandler12 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (java.lang.String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 8:
                            com.revenuecat.purchases.LogLevel logLevel16 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler13 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (java.lang.String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 9:
                            com.revenuecat.purchases.LogLevel logLevel17 = com.revenuecat.purchases.LogLevel.DEBUG;
                            com.revenuecat.purchases.LogHandler currentLogHandler14 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (java.lang.String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 10:
                            com.revenuecat.purchases.LogLevel logLevel18 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler15 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (java.lang.String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 11:
                            com.revenuecat.purchases.LogLevel logLevel19 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler16 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                                currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (java.lang.String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 12:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                        case 13:
                            com.revenuecat.purchases.LogLevel logLevel20 = com.revenuecat.purchases.LogLevel.WARN;
                            com.revenuecat.purchases.LogHandler currentLogHandler17 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                                currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (java.lang.String) identityManager$configure$$inlined$log$2.invoke());
                            }
                            break;
                        case 14:
                            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$2.invoke(), null);
                            break;
                    }
                }
                cachedAppUserID$purchases_defaultsRelease = this.deviceCache.getCachedAppUserID$purchases_defaultsRelease();
                if (cachedAppUserID$purchases_defaultsRelease == null && (cachedAppUserID$purchases_defaultsRelease = this.deviceCache.getLegacyCachedAppUserID$purchases_defaultsRelease()) == null) {
                    cachedAppUserID$purchases_defaultsRelease = generateRandomID();
                }
            } else {
                cachedAppUserID$purchases_defaultsRelease = appUserID;
            }
            com.revenuecat.purchases.common.LogIntent logIntent3 = com.revenuecat.purchases.common.LogIntent.USER;
            com.revenuecat.purchases.identity.IdentityManager$configure$$inlined$log$3 identityManager$configure$$inlined$log$3 = new com.revenuecat.purchases.identity.IdentityManager$configure$$inlined$log$3(logIntent3, cachedAppUserID$purchases_defaultsRelease);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel21 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler18 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        currentLogHandler18.d("[Purchases] - " + logLevel21.name(), (java.lang.String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel22 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler19 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler19.w("[Purchases] - " + logLevel22.name(), (java.lang.String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel23 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler20 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler20.i("[Purchases] - " + logLevel23.name(), (java.lang.String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel24 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler21 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        currentLogHandler21.d("[Purchases] - " + logLevel24.name(), (java.lang.String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel25 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler22 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler22.i("[Purchases] - " + logLevel25.name(), (java.lang.String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel26 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler23 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        currentLogHandler23.d("[Purchases] - " + logLevel26.name(), (java.lang.String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel27 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler24 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        currentLogHandler24.d("[Purchases] - " + logLevel27.name(), (java.lang.String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel28 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler25 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler25.w("[Purchases] - " + logLevel28.name(), (java.lang.String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel29 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler26 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler26.w("[Purchases] - " + logLevel29.name(), (java.lang.String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel30 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler27 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler27.w("[Purchases] - " + logLevel30.name(), (java.lang.String) identityManager$configure$$inlined$log$3.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$configure$$inlined$log$3.invoke(), null);
                    break;
            }
            android.content.SharedPreferences.Editor editorStartEditing$purchases_defaultsRelease = this.deviceCache.startEditing$purchases_defaultsRelease();
            this.deviceCache.cacheAppUserID$purchases_defaultsRelease(cachedAppUserID$purchases_defaultsRelease, editorStartEditing$purchases_defaultsRelease);
            this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(cachedAppUserID$purchases_defaultsRelease, editorStartEditing$purchases_defaultsRelease);
            invalidateETagCacheIfNeeded(cachedAppUserID$purchases_defaultsRelease);
            editorStartEditing$purchases_defaultsRelease.apply();
            enqueue(new com.revenuecat.purchases.identity.IdentityManager.AnonymousClass2());
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean currentUserIsAnonymous() {
        com.revenuecat.purchases.identity.IdentityManager.Companion companion;
        java.lang.String cachedAppUserID$purchases_defaultsRelease;
        try {
            companion = INSTANCE;
            cachedAppUserID$purchases_defaultsRelease = this.deviceCache.getCachedAppUserID$purchases_defaultsRelease();
            if (cachedAppUserID$purchases_defaultsRelease == null) {
                cachedAppUserID$purchases_defaultsRelease = "";
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return companion.isUserIDAnonymous(cachedAppUserID$purchases_defaultsRelease) || kotlin.jvm.internal.m.a(this.deviceCache.getCachedAppUserID$purchases_defaultsRelease(), this.deviceCache.getLegacyCachedAppUserID$purchases_defaultsRelease());
    }

    public final java.lang.String getCurrentAppUserID() {
        java.lang.String cachedAppUserID$purchases_defaultsRelease = this.deviceCache.getCachedAppUserID$purchases_defaultsRelease();
        return cachedAppUserID$purchases_defaultsRelease == null ? "" : cachedAppUserID$purchases_defaultsRelease;
    }

    public final void logIn(java.lang.String newAppUserID, p194x6.m onSuccess, p194x6.j onError) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        kotlin.jvm.internal.m.e(newAppUserID, "newAppUserID");
        kotlin.jvm.internal.m.e(onSuccess, "onSuccess");
        kotlin.jvm.internal.m.e(onError, "onError");
        if (kotlin.jvm.internal.m.a(getCurrentAppUserID(), UI_PREVIEW_MODE_APP_USER_ID) || newAppUserID.equals(UI_PREVIEW_MODE_APP_USER_ID)) {
            com.revenuecat.purchases.PurchasesError purchasesError = new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.UnsupportedError, com.revenuecat.purchases.strings.IdentityStrings.OPERATION_NOT_SUPPORTED_IN_PREVIEW_MODE);
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError);
            onError.invoke(purchasesError);
            return;
        }
        if (O7.q.N0(newAppUserID)) {
            com.revenuecat.purchases.PurchasesError purchasesError2 = new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.InvalidAppUserIdError, com.revenuecat.purchases.strings.IdentityStrings.LOG_IN_ERROR_MISSING_APP_USER_ID);
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError2);
            onError.invoke(purchasesError2);
            return;
        }
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.USER;
        com.revenuecat.purchases.identity.IdentityManager$logIn$$inlined$log$1 identityManager$logIn$$inlined$log$1 = new com.revenuecat.purchases.identity.IdentityManager$logIn$$inlined$log$1(logIntent, this, newAppUserID);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) identityManager$logIn$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) identityManager$logIn$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logIn$$inlined$log$1.invoke(), null);
                break;
        }
        this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(newAppUserID, new com.revenuecat.purchases.identity.IdentityManager.AnonymousClass4(getCurrentAppUserID(), newAppUserID, onError, onSuccess));
    }

    public final synchronized void logOut(p194x6.j completion) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.m.e(completion, "completion");
        if (kotlin.jvm.internal.m.a(getCurrentAppUserID(), UI_PREVIEW_MODE_APP_USER_ID)) {
            com.revenuecat.purchases.PurchasesError purchasesError = new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.UnsupportedError, com.revenuecat.purchases.strings.IdentityStrings.OPERATION_NOT_SUPPORTED_IN_PREVIEW_MODE);
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError);
            completion.invoke(purchasesError);
            return;
        }
        if (!currentUserIsAnonymous()) {
            this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new com.revenuecat.purchases.identity.IdentityManager.AnonymousClass3(completion));
            return;
        }
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.RC_ERROR;
        com.revenuecat.purchases.identity.IdentityManager$logOut$$inlined$log$1 identityManager$logOut$$inlined$log$1 = new com.revenuecat.purchases.identity.IdentityManager$logOut$$inlined$log$1(logIntent);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (java.lang.String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (java.lang.String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (java.lang.String) identityManager$logOut$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) identityManager$logOut$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) identityManager$logOut$$inlined$log$1.invoke(), null);
                break;
        }
        completion.invoke(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.LogOutWithAnonymousUserError, null, 2, null));
    }

    public final void switchUser(java.lang.String newAppUserID) {
        kotlin.jvm.internal.m.e(newAppUserID, "newAppUserID");
        if (kotlin.jvm.internal.m.a(getCurrentAppUserID(), UI_PREVIEW_MODE_APP_USER_ID) || newAppUserID.equals(UI_PREVIEW_MODE_APP_USER_ID)) {
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.UnsupportedError, com.revenuecat.purchases.strings.IdentityStrings.OPERATION_NOT_SUPPORTED_IN_PREVIEW_MODE));
            return;
        }
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), java.lang.String.format(com.revenuecat.purchases.strings.IdentityStrings.SWITCHING_USER, java.util.Arrays.copyOf(new java.lang.Object[]{newAppUserID}, 1)));
        }
        resetAndSaveUserID(newAppUserID);
    }

    public /* synthetic */ IdentityManager(com.revenuecat.purchases.common.caching.DeviceCache deviceCache, com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache subscriberAttributesCache, com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager subscriberAttributesManager, com.revenuecat.purchases.common.offerings.OfferingsCache offeringsCache, com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager remoteConfigManager, com.revenuecat.purchases.common.Backend backend, com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager offlineEntitlementsManager, com.revenuecat.purchases.common.Dispatcher dispatcher, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(deviceCache, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, remoteConfigManager, backend, offlineEntitlementsManager, dispatcher, (i3 & 256) != 0 ? false : z6);
    }
}
