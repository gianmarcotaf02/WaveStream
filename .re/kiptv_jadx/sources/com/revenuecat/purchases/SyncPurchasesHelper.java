package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JE\u0010\"\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/SyncPurchasesHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "customerInfoHelper", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/CustomerInfoHelper;Lcom/revenuecat/purchases/PostReceiptHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "appUserID", "", "appInBackground", "isRestore", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lh6/A;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "retrieveCustomerInfo", "(Ljava/lang/String;ZZLx6/j;Lx6/j;)V", "error", "Ljava/util/Date;", "startTime", "trackSyncPurchasesResultIfNeeded", "(Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Date;)V", "syncPurchases", "(ZZLx6/j;Lx6/j;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SyncPurchasesHelper {
    private final com.revenuecat.purchases.common.BillingAbstract billing;
    private final com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper;
    private final com.revenuecat.purchases.common.DateProvider dateProvider;
    private final com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final com.revenuecat.purchases.identity.IdentityManager identityManager;
    private final com.revenuecat.purchases.PostReceiptHelper postReceiptHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "Lh6/A;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ java.lang.String $appUserID;
        final /* synthetic */ p194x6.j $handleError;
        final /* synthetic */ p194x6.j $handleSuccess;
        final /* synthetic */ boolean $isRestore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(java.lang.String str, boolean z6, boolean z9, p194x6.j jVar, p194x6.j jVar2) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z6;
            this.$isRestore = z9;
            this.$handleSuccess = jVar;
            this.$handleError = jVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$handleLastPurchase(java.util.List<com.revenuecat.purchases.PurchasesError> list, com.revenuecat.purchases.SyncPurchasesHelper syncPurchasesHelper, java.lang.String str, boolean z6, boolean z9, p194x6.j jVar, p194x6.j jVar2, com.revenuecat.purchases.models.StoreTransaction storeTransaction, com.revenuecat.purchases.models.StoreTransaction storeTransaction2) {
            if (kotlin.jvm.internal.m.a(storeTransaction, storeTransaction2)) {
                if (!list.isEmpty()) {
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", java.lang.String.format(com.revenuecat.purchases.strings.PurchaseStrings.SYNCING_PURCHASES_ERROR, java.util.Arrays.copyOf(new java.lang.Object[]{list}, 1)), null);
                    jVar2.invoke(p078i6.o.h1(list));
                    return;
                }
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    com.google.android.gms.internal.play_billing.M0.t(logLevel, new java.lang.StringBuilder("[Purchases] - "), currentLogHandler, com.revenuecat.purchases.strings.PurchaseStrings.SYNCED_PURCHASES_SUCCESSFULLY);
                }
                syncPurchasesHelper.retrieveCustomerInfo(str, z6, z9, jVar, jVar2);
            }
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((java.util.List<com.revenuecat.purchases.models.StoreTransaction>) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(java.util.List<com.revenuecat.purchases.models.StoreTransaction> allPurchases) {
            kotlin.jvm.internal.m.e(allPurchases, "allPurchases");
            if (allPurchases.isEmpty()) {
                com.revenuecat.purchases.SyncPurchasesHelper.this.retrieveCustomerInfo(this.$appUserID, this.$appInBackground, this.$isRestore, this.$handleSuccess, this.$handleError);
                return;
            }
            com.revenuecat.purchases.models.StoreTransaction storeTransaction = (com.revenuecat.purchases.models.StoreTransaction) p078i6.o.q1(allPurchases);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.revenuecat.purchases.SyncPurchasesHelper syncPurchasesHelper = com.revenuecat.purchases.SyncPurchasesHelper.this;
            boolean z6 = this.$isRestore;
            java.lang.String str = this.$appUserID;
            boolean z9 = this.$appInBackground;
            p194x6.j jVar = this.$handleSuccess;
            p194x6.j jVar2 = this.$handleError;
            for (com.revenuecat.purchases.models.StoreTransaction storeTransaction2 : allPurchases) {
                com.revenuecat.purchases.common.ReceiptInfo receiptInfo = new com.revenuecat.purchases.common.ReceiptInfo(storeTransaction2.getProductIds(), java.lang.Long.valueOf(storeTransaction2.getPurchaseTime()), null, null, null, null, null, null, null, null, false, storeTransaction2.getStoreUserID(), storeTransaction2.getMarketplace(), 2044, null);
                com.revenuecat.purchases.PostReceiptHelper postReceiptHelper = syncPurchasesHelper.postReceiptHelper;
                java.lang.String purchaseToken = storeTransaction2.getPurchaseToken();
                com.revenuecat.purchases.PostReceiptInitiationSource postReceiptInitiationSource = com.revenuecat.purchases.PostReceiptInitiationSource.RESTORE;
                java.util.ArrayList arrayList2 = arrayList;
                com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2$1$1 syncPurchasesHelper$syncPurchases$2$1$1 = new com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2$1$1(storeTransaction2, storeTransaction, arrayList2, syncPurchasesHelper, str, z9, z6, jVar, jVar2);
                com.revenuecat.purchases.models.StoreTransaction storeTransaction3 = storeTransaction;
                com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2$1$2 syncPurchasesHelper$syncPurchases$2$1$2 = new com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2$1$2(arrayList2, storeTransaction2, storeTransaction3, syncPurchasesHelper, str, z9, z6, jVar, jVar2);
                storeTransaction = storeTransaction3;
                p194x6.j jVar3 = jVar;
                p194x6.j jVar4 = jVar2;
                boolean z10 = z6;
                java.lang.String str2 = str;
                postReceiptHelper.postTokenWithoutConsuming(purchaseToken, receiptInfo, z10, str2, postReceiptInitiationSource, syncPurchasesHelper$syncPurchases$2$1$1, syncPurchasesHelper$syncPurchases$2$1$2, storeTransaction2.getIsAutoRenewing());
                z9 = z9;
                z6 = z10;
                str = str2;
                jVar2 = jVar4;
                jVar = jVar3;
                arrayList = arrayList2;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$3, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.j $handleError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(p194x6.j jVar) {
            super(1);
            this.$handleError = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.PurchasesError) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError it) {
            com.revenuecat.purchases.LogHandler currentLogHandler;
            java.lang.String strM;
            java.lang.String str;
            kotlin.jvm.internal.m.e(it, "it");
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.RC_ERROR;
            com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1 syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1 = new com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1(logIntent, it);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            this.$handleError.invoke(it);
        }
    }

    public SyncPurchasesHelper(com.revenuecat.purchases.common.BillingAbstract billing, com.revenuecat.purchases.identity.IdentityManager identityManager, com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper, com.revenuecat.purchases.PostReceiptHelper postReceiptHelper, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, com.revenuecat.purchases.common.DateProvider dateProvider) {
        kotlin.jvm.internal.m.e(billing, "billing");
        kotlin.jvm.internal.m.e(identityManager, "identityManager");
        kotlin.jvm.internal.m.e(customerInfoHelper, "customerInfoHelper");
        kotlin.jvm.internal.m.e(postReceiptHelper, "postReceiptHelper");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        this.billing = billing;
        this.identityManager = identityManager;
        this.customerInfoHelper = customerInfoHelper;
        this.postReceiptHelper = postReceiptHelper;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retrieveCustomerInfo(java.lang.String appUserID, boolean appInBackground, boolean isRestore, final p194x6.j onSuccess, final p194x6.j onError) {
        com.revenuecat.purchases.CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, appUserID, com.revenuecat.purchases.CacheFetchPolicy.CACHED_OR_FETCHED, appInBackground, isRestore, false, new com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.SyncPurchasesHelper.retrieveCustomerInfo.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(com.revenuecat.purchases.PurchasesError error) {
                kotlin.jvm.internal.m.e(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(com.revenuecat.purchases.CustomerInfo customerInfo) {
                kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
                onSuccess.invoke(customerInfo);
            }
        }, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackSyncPurchasesResultIfNeeded(com.revenuecat.purchases.PurchasesError error, java.util.Date startTime) {
        com.revenuecat.purchases.PurchasesErrorCode code;
        com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m148trackSyncPurchasesResultSxA4cEA((error == null || (code = error.getCode()) == null) ? null : java.lang.Integer.valueOf(code.getCode()), error != null ? error.getMessage() : null, com.revenuecat.purchases.common.DurationExtensionsKt.between(P7.b.f8168i, startTime, this.dateProvider.getNow()));
        }
    }

    public final void syncPurchases(boolean isRestore, boolean appInBackground, p194x6.j onSuccess, p194x6.j onError) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        kotlin.jvm.internal.m.e(onSuccess, "onSuccess");
        kotlin.jvm.internal.m.e(onError, "onError");
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
        com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$$inlined$log$1 syncPurchasesHelper$syncPurchases$$inlined$log$1 = new com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$$inlined$log$1(logIntent);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
        }
        java.util.Date now = this.dateProvider.getNow();
        com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackSyncPurchasesStarted();
        }
        java.lang.String currentAppUserID = this.identityManager.getCurrentAppUserID();
        com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$handleSuccess$1 syncPurchasesHelper$syncPurchases$handleSuccess$1 = new com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$handleSuccess$1(this, now, onSuccess);
        com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$handleError$1 syncPurchasesHelper$syncPurchases$handleError$1 = new com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$handleError$1(this, now, onError);
        this.billing.queryAllPurchases(currentAppUserID, new com.revenuecat.purchases.SyncPurchasesHelper.AnonymousClass2(currentAppUserID, appInBackground, isRestore, syncPurchasesHelper$syncPurchases$handleSuccess$1, syncPurchasesHelper$syncPurchases$handleError$1), new com.revenuecat.purchases.SyncPurchasesHelper.AnonymousClass3(syncPurchasesHelper$syncPurchases$handleError$1));
    }

    public /* synthetic */ SyncPurchasesHelper(com.revenuecat.purchases.common.BillingAbstract billingAbstract, com.revenuecat.purchases.identity.IdentityManager identityManager, com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper, com.revenuecat.purchases.PostReceiptHelper postReceiptHelper, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, com.revenuecat.purchases.common.DateProvider dateProvider, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(billingAbstract, identityManager, customerInfoHelper, postReceiptHelper, diagnosticsTracker, (i3 & 32) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider);
    }
}
