package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001c\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\f\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0004\u0012\u00020\b0\u0005\u0012*\u0010\u0013\u001a&\u0012\u0004\u0012\u00020\u0011\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010$\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R-\u0010\n\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R'\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b3\u00102R/\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b4\u00102R\u0014\u00107\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "LY2/x;", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lh6/A;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "LY2/b;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;Lx6/j;Lx6/j;Lx6/j;Lx6/m;)V", "billingClient", "", "productType", "", "productIds", "LY2/r;", "listener", "queryProductDetailsAsyncEnsuringOneResponse", "(LY2/b;Ljava/lang/String;Ljava/util/Set;LY2/r;)V", "requestedProductIds", "LY2/j;", "billingResult", "Ljava/util/Date;", "requestStartTime", "trackGoogleQueryProductDetailsRequestIfNeeded", "(Ljava/util/Set;Ljava/lang/String;LY2/j;Ljava/util/Date;)V", "", "statusCode", "convertUnfetchedProductStatusCodeToString", "(I)Ljava/lang/String;", "executeAsync", "()V", "received", "onOk", "(LY2/x;)V", "Lcom/revenuecat/purchases/google/usecase/QueryProductDetailsUseCaseParams;", "Lx6/j;", "getOnReceive", "()Lx6/j;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class QueryProductDetailsUseCase extends com.revenuecat.purchases.google.usecase.BillingClientUseCase<Y2.x> {
    private final p194x6.j onError;
    private final p194x6.j onReceive;
    private final com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams useCaseParams;
    private final p194x6.j withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$executeAsync$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LY2/b;", "Lh6/A;", "invoke", "(LY2/b;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ java.util.Set<java.lang.String> $nonEmptyProductIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(java.util.Set<java.lang.String> set) {
            super(1);
            this.$nonEmptyProductIds = set;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) throws java.lang.Throwable {
            invoke((Y2.AbstractC1032b) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(Y2.AbstractC1032b invoke) throws java.lang.Throwable {
            kotlin.jvm.internal.m.e(invoke, "$this$invoke");
            java.lang.String googleProductType = com.revenuecat.purchases.google.ProductTypeConversionsKt.toGoogleProductType(com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase.this.useCaseParams.getProductType());
            if (googleProductType == null) {
                googleProductType = "inapp";
            }
            try {
                com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase queryProductDetailsUseCase = com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase.this;
                queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(invoke, googleProductType, this.$nonEmptyProductIds, new com.revenuecat.purchases.google.usecase.a(queryProductDetailsUseCase));
            } catch (com.revenuecat.purchases.google.QueryProductDetailsParamsBuilderException e6) {
                p194x6.j onError = com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase.this.getOnError();
                com.revenuecat.purchases.PurchasesErrorCode purchasesErrorCode = com.revenuecat.purchases.PurchasesErrorCode.StoreProblemError;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(e6.getMessage());
                sb.append(": ");
                java.lang.Throwable cause = e6.getCause();
                sb.append(cause != null ? cause.getMessage() : null);
                onError.invoke(new com.revenuecat.purchases.PurchasesError(purchasesErrorCode, sb.toString()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase(com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams useCaseParams, p194x6.j onReceive, p194x6.j onError, p194x6.j withConnectedClient, p194x6.m executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        kotlin.jvm.internal.m.e(useCaseParams, "useCaseParams");
        kotlin.jvm.internal.m.e(onReceive, "onReceive");
        kotlin.jvm.internal.m.e(onError, "onError");
        kotlin.jvm.internal.m.e(withConnectedClient, "withConnectedClient");
        kotlin.jvm.internal.m.e(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String convertUnfetchedProductStatusCodeToString(int statusCode) {
        if (statusCode == 0) {
            return "UNKNOWN";
        }
        if (statusCode == 2) {
            return "INVALID_PRODUCT_ID_FORMAT";
        }
        if (statusCode != 3) {
            return statusCode != 4 ? com.google.android.gms.internal.play_billing.M0.l(statusCode, "UNKNOWN_STATUS_CODE: ") : "NO_ELIGIBLE_OFFER";
        }
        return "PRODUCT_NOT_FOUND";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void queryProductDetailsAsyncEnsuringOneResponse(Y2.AbstractC1032b billingClient, java.lang.String productType, java.util.Set<java.lang.String> productIds, Y2.r listener) throws java.lang.Throwable {
        try {
            try {
                billingClient.f(com.revenuecat.purchases.google.BillingClientParamBuildersKt.buildQueryProductDetailsParams(productType, productIds), new com.revenuecat.purchases.google.usecase.c(new java.util.concurrent.atomic.AtomicBoolean(false), this, productIds, productType, this.useCaseParams.getDateProvider().getNow(), listener));
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$14(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase queryProductDetailsUseCase, java.util.Set set, java.lang.String str, java.util.Date date, Y2.r rVar, Y2.C1040j billingResult, Y2.x productDetailsList) {
        kotlin.jvm.internal.m.e(billingResult, "billingResult");
        kotlin.jvm.internal.m.e(productDetailsList, "productDetailsList");
        if (!atomicBoolean.getAndSet(true)) {
            queryProductDetailsUseCase.trackGoogleQueryProductDetailsRequestIfNeeded(set, str, billingResult, date);
            rVar.a(billingResult, productDetailsList);
            return;
        }
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR;
        com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1 queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1 = new com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1(logIntent, billingResult);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    currentLogHandler4.d(com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler5.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    currentLogHandler6.d(com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    currentLogHandler7.d(com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1.invoke(), null);
                break;
        }
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(java.util.Set<java.lang.String> requestedProductIds, java.lang.String productType, Y2.C1040j billingResult, java.util.Date requestStartTime) {
        com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int i3 = billingResult.f11477a;
            java.lang.String str = billingResult.f11479c;
            kotlin.jvm.internal.m.d(str, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m142trackGoogleQueryProductDetailsRequest9VgGkz4(requestedProductIds, productType, i3, str, com.revenuecat.purchases.common.DurationExtensionsKt.between(P7.b.f8168i, requestStartTime, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        java.util.Set<java.lang.String> productIds = this.useCaseParams.getProductIds();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : productIds) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.Set setR1 = p078i6.o.R1(arrayList);
        if (!setR1.isEmpty()) {
            this.withConnectedClient.invoke(new com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase.AnonymousClass2(setR1));
            return;
        }
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
        com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$executeAsync$$inlined$log$1 queryProductDetailsUseCase$executeAsync$$inlined$log$1 = new com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$executeAsync$$inlined$log$1(logIntent);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$executeAsync$$inlined$log$1.invoke(), null);
                break;
        }
        this.onReceive.invoke(p078i6.w.f23205h);
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public java.lang.String getErrorMessage() {
        return "Error when fetching products";
    }

    public final p194x6.j getOnError() {
        return this.onError;
    }

    public final p194x6.j getOnReceive() {
        return this.onReceive;
    }

    public final p194x6.j getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(Y2.x received) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.Object objInvoke;
        com.revenuecat.purchases.LogHandler currentLogHandler2;
        java.lang.String strM2;
        java.lang.Object objInvoke2;
        com.revenuecat.purchases.LogHandler currentLogHandler3;
        java.lang.String strM3;
        java.lang.String str;
        com.revenuecat.purchases.LogHandler currentLogHandler4;
        java.lang.String strM4;
        java.lang.String str2;
        kotlin.jvm.internal.m.e(received, "received");
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
        com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$$inlined$log$1 queryProductDetailsUseCase$onOk$$inlined$log$1 = new com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$$inlined$log$1(logIntent, this);
        int[] iArr = com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM4 = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str2 = (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(strM4, str2);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler6.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM4 = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str2 = (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(strM4, str2);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler7.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM4 = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str2 = (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(strM4, str2);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM4 = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str2 = (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke();
                    currentLogHandler4.d(strM4, str2);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler8.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler9.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$1.invoke(), null);
                break;
        }
        com.revenuecat.purchases.common.LogIntent logIntent2 = com.revenuecat.purchases.common.LogIntent.PURCHASE;
        com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$$inlined$log$2 queryProductDetailsUseCase$onOk$$inlined$log$2 = new com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$$inlined$log$2(logIntent2, received);
        switch (iArr[logIntent2.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel11 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler11 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    currentLogHandler11.d(com.google.android.gms.internal.play_billing.M0.m(logLevel11, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel12 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler12 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w(com.google.android.gms.internal.play_billing.M0.m(logLevel12, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel13 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler13 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i(com.google.android.gms.internal.play_billing.M0.m(logLevel13, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel14 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler14 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    currentLogHandler14.d(com.google.android.gms.internal.play_billing.M0.m(logLevel14, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel15 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler15 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler15.i(com.google.android.gms.internal.play_billing.M0.m(logLevel15, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel16 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler16 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    currentLogHandler16.d(com.google.android.gms.internal.play_billing.M0.m(logLevel16, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel17 = com.revenuecat.purchases.LogLevel.DEBUG;
                com.revenuecat.purchases.LogHandler currentLogHandler17 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    currentLogHandler17.d(com.google.android.gms.internal.play_billing.M0.m(logLevel17, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel18 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler18 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler18.w(com.google.android.gms.internal.play_billing.M0.m(logLevel18, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel19 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler19 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler19.w(com.google.android.gms.internal.play_billing.M0.m(logLevel19, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel20 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler20 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler20.w(com.google.android.gms.internal.play_billing.M0.m(logLevel20, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$$inlined$log$2.invoke(), null);
                break;
        }
        java.util.List it = received.b();
        kotlin.jvm.internal.m.d(it, "it");
        if (it.isEmpty()) {
            it = null;
        }
        if (it != null) {
            com.revenuecat.purchases.common.LogIntent logIntent3 = com.revenuecat.purchases.common.LogIntent.INFO;
            com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1 queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1 = new com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1(logIntent3, received);
            switch (iArr[logIntent3.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel21 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                        strM3 = com.google.android.gms.internal.play_billing.M0.m(logLevel21, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(strM3, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel22 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler21 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                        currentLogHandler21.w(com.google.android.gms.internal.play_billing.M0.m(logLevel22, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel23 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler22 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                        currentLogHandler22.i(com.google.android.gms.internal.play_billing.M0.m(logLevel23, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel24 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                        strM3 = com.google.android.gms.internal.play_billing.M0.m(logLevel24, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(strM3, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel25 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler23 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                        currentLogHandler23.i(com.google.android.gms.internal.play_billing.M0.m(logLevel25, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel26 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                        strM3 = com.google.android.gms.internal.play_billing.M0.m(logLevel26, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(strM3, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel27 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                        strM3 = com.google.android.gms.internal.play_billing.M0.m(logLevel27, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke();
                        currentLogHandler3.d(strM3, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel28 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler24 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel28) <= 0) {
                        currentLogHandler24.w(com.google.android.gms.internal.play_billing.M0.m(logLevel28, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel29 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler25 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel29) <= 0) {
                        currentLogHandler25.w(com.google.android.gms.internal.play_billing.M0.m(logLevel29, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel30 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler26 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel30) <= 0) {
                        currentLogHandler26.w(com.google.android.gms.internal.play_billing.M0.m(logLevel30, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$6$$inlined$log$1.invoke(), null);
                    break;
            }
        }
        java.util.List<Y2.C1047q> listA = received.a();
        if (listA.isEmpty()) {
            listA = null;
        }
        if (listA != null) {
            for (Y2.C1047q c1047q : listA) {
                com.revenuecat.purchases.common.LogIntent logIntent4 = com.revenuecat.purchases.common.LogIntent.PURCHASE;
                com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1 queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1 = new com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1(logIntent4, c1047q);
                switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent4.ordinal()]) {
                    case 1:
                        com.revenuecat.purchases.LogLevel logLevel31 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel31) <= 0) {
                            strM2 = com.google.android.gms.internal.play_billing.M0.m(logLevel31, new java.lang.StringBuilder("[Purchases] - "));
                            objInvoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 2:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    case 3:
                        com.revenuecat.purchases.LogLevel logLevel32 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler27 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel32) <= 0) {
                            currentLogHandler27.w(com.google.android.gms.internal.play_billing.M0.m(logLevel32, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 4:
                        com.revenuecat.purchases.LogLevel logLevel33 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler28 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel33) <= 0) {
                            currentLogHandler28.i(com.google.android.gms.internal.play_billing.M0.m(logLevel33, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        com.revenuecat.purchases.LogLevel logLevel34 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel34) <= 0) {
                            strM2 = com.google.android.gms.internal.play_billing.M0.m(logLevel34, new java.lang.StringBuilder("[Purchases] - "));
                            objInvoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 6:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    case 7:
                        com.revenuecat.purchases.LogLevel logLevel35 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler29 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel35) <= 0) {
                            currentLogHandler29.i(com.google.android.gms.internal.play_billing.M0.m(logLevel35, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 8:
                        com.revenuecat.purchases.LogLevel logLevel36 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel36) <= 0) {
                            strM2 = com.google.android.gms.internal.play_billing.M0.m(logLevel36, new java.lang.StringBuilder("[Purchases] - "));
                            objInvoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 9:
                        com.revenuecat.purchases.LogLevel logLevel37 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel37) <= 0) {
                            strM2 = com.google.android.gms.internal.play_billing.M0.m(logLevel37, new java.lang.StringBuilder("[Purchases] - "));
                            objInvoke2 = queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 10:
                        com.revenuecat.purchases.LogLevel logLevel38 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler30 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel38) <= 0) {
                            currentLogHandler30.w(com.google.android.gms.internal.play_billing.M0.m(logLevel38, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        com.revenuecat.purchases.LogLevel logLevel39 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler31 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel39) <= 0) {
                            currentLogHandler31.w(com.google.android.gms.internal.play_billing.M0.m(logLevel39, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    case 13:
                        com.revenuecat.purchases.LogLevel logLevel40 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler32 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel40) <= 0) {
                            currentLogHandler32.w(com.google.android.gms.internal.play_billing.M0.m(logLevel40, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1.invoke(), null);
                        continue;
                    default:
                        continue;
                }
                currentLogHandler2.d(strM2, (java.lang.String) objInvoke2);
            }
        }
        java.util.List<Y2.A> listB = received.b();
        if (listB.isEmpty()) {
            listB = null;
        }
        if (listB != null) {
            for (Y2.A a2 : listB) {
                com.revenuecat.purchases.common.LogIntent logIntent5 = com.revenuecat.purchases.common.LogIntent.INFO;
                com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1 queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1 = new com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1(logIntent5, a2, this);
                switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent5.ordinal()]) {
                    case 1:
                        com.revenuecat.purchases.LogLevel logLevel41 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel41) <= 0) {
                            strM = com.google.android.gms.internal.play_billing.M0.m(logLevel41, new java.lang.StringBuilder("[Purchases] - "));
                            objInvoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 2:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    case 3:
                        com.revenuecat.purchases.LogLevel logLevel42 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler33 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel42) <= 0) {
                            currentLogHandler33.w(com.google.android.gms.internal.play_billing.M0.m(logLevel42, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 4:
                        com.revenuecat.purchases.LogLevel logLevel43 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler34 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel43) <= 0) {
                            currentLogHandler34.i(com.google.android.gms.internal.play_billing.M0.m(logLevel43, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        com.revenuecat.purchases.LogLevel logLevel44 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel44) <= 0) {
                            strM = com.google.android.gms.internal.play_billing.M0.m(logLevel44, new java.lang.StringBuilder("[Purchases] - "));
                            objInvoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 6:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    case 7:
                        com.revenuecat.purchases.LogLevel logLevel45 = com.revenuecat.purchases.LogLevel.INFO;
                        com.revenuecat.purchases.LogHandler currentLogHandler35 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel45) <= 0) {
                            currentLogHandler35.i(com.google.android.gms.internal.play_billing.M0.m(logLevel45, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 8:
                        com.revenuecat.purchases.LogLevel logLevel46 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel46) <= 0) {
                            strM = com.google.android.gms.internal.play_billing.M0.m(logLevel46, new java.lang.StringBuilder("[Purchases] - "));
                            objInvoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 9:
                        com.revenuecat.purchases.LogLevel logLevel47 = com.revenuecat.purchases.LogLevel.DEBUG;
                        currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel47) <= 0) {
                            strM = com.google.android.gms.internal.play_billing.M0.m(logLevel47, new java.lang.StringBuilder("[Purchases] - "));
                            objInvoke = queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke();
                            break;
                        }
                        break;
                    case 10:
                        com.revenuecat.purchases.LogLevel logLevel48 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler36 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel48) <= 0) {
                            currentLogHandler36.w(com.google.android.gms.internal.play_billing.M0.m(logLevel48, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        com.revenuecat.purchases.LogLevel logLevel49 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler37 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel49) <= 0) {
                            currentLogHandler37.w(com.google.android.gms.internal.play_billing.M0.m(logLevel49, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    case 13:
                        com.revenuecat.purchases.LogLevel logLevel50 = com.revenuecat.purchases.LogLevel.WARN;
                        com.revenuecat.purchases.LogHandler currentLogHandler38 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel50) <= 0) {
                            currentLogHandler38.w(com.google.android.gms.internal.play_billing.M0.m(logLevel50, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke());
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) queryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1.invoke(), null);
                        continue;
                    default:
                        continue;
                }
                currentLogHandler.d(strM, (java.lang.String) objInvoke);
            }
        }
        java.util.List listA2 = received.a();
        kotlin.jvm.internal.m.d(listA2, "received.productDetailsList");
        this.onReceive.invoke(com.revenuecat.purchases.google.StoreProductConversionsKt.toStoreProducts(listA2));
    }
}
