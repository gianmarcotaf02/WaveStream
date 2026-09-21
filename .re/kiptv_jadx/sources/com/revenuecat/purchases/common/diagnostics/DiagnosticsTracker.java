package com.revenuecat.purchases.common.diagnostics;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000  \u00012\u00020\u0001:\u0004¡\u0001 \u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJf\u0010#\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0004\b!\u0010\"J>\u0010+\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b)\u0010*J>\u00100\u001a\u00020 2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0,ø\u0001\u0000¢\u0006\u0004\b.\u0010/J0\u00103\u001a\u00020 2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u00020 ¢\u0006\u0004\b4\u00105J%\u00108\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u0016¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020 ¢\u0006\u0004\b:\u00105J3\u0010?\u001a\u00020 2\u0006\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u000e2\b\u0010=\u001a\u0004\u0018\u00010\u00142\b\u0010>\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b?\u0010@J=\u0010C\u001a\u00020 2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010,2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010,2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\bC\u0010DJ.\u0010G\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ0\u0010J\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010,ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ>\u0010P\u001a\u00020 2\u0006\u0010;\u001a\u00020\u000e2\b\u0010K\u001a\u0004\u0018\u00010\u000e2\b\u0010L\u001a\u0004\u0018\u00010\u00162\b\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020 2\b\b\u0002\u0010Q\u001a\u00020\u0014¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020 ¢\u0006\u0004\bT\u00105J\r\u0010U\u001a\u00020 ¢\u0006\u0004\bU\u00105J\u001d\u0010V\u001a\u00020 2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\bV\u0010WJ\u0015\u0010Z\u001a\u00020 2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\r\u0010\\\u001a\u00020 ¢\u0006\u0004\b\\\u00105J\u0015\u0010_\u001a\u00020 2\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020 ¢\u0006\u0004\ba\u00105J^\u0010g\u001a\u00020 2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010$2\u000e\u0010b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010$2\b\u0010M\u001a\u0004\u0018\u00010\u000e2\b\u0010L\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\be\u0010fJ\u001b\u0010h\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$¢\u0006\u0004\bh\u0010iJH\u0010l\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\b\u0010M\u001a\u0004\u0018\u00010\u000e2\b\u0010L\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ\r\u0010m\u001a\u00020 ¢\u0006\u0004\bm\u00105J,\u0010p\u001a\u00020 2\b\u0010L\u001a\u0004\u0018\u00010\u00162\b\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\bn\u0010oJ\r\u0010q\u001a\u00020 ¢\u0006\u0004\bq\u00105J,\u0010s\u001a\u00020 2\b\u0010L\u001a\u0004\u0018\u00010\u00162\b\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\br\u0010oJ\r\u0010t\u001a\u00020 ¢\u0006\u0004\bt\u00105JH\u0010z\u001a\u00020 2\u0006\u0010v\u001a\u00020u2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010w\u001a\u0004\u0018\u00010\u00142\b\u0010M\u001a\u0004\u0018\u00010\u000e2\b\u0010L\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\u001d\u0010|\u001a\u00020 2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020{¢\u0006\u0004\b|\u0010}JG\u0010\u0080\u0001\u001a\u00020 2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020{2\b\u0010L\u001a\u0004\u0018\u00010\u00162\b\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ\u001c\u0010\u0083\u0001\u001a\u00020 2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0007¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001c\u0010\u0086\u0001\u001a\u00020 2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0084\u0001J2\u0010\u0083\u0001\u001a\u00020 2\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0014\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0089\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u008b\u0001J\"\u0010\u008e\u0001\u001a\u00020 2\u000e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u008c\u0001H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\"\u0010\u0091\u0001\u001a\u00020 2\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u008c\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u008f\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0092\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0093\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0094\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0095\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0096\u0001R$\u0010\u0097\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006¢\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "diagnosticsHelper", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "Ljava/util/UUID;", "appSessionID", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;Lcom/revenuecat/purchases/common/Dispatcher;Ljava/util/UUID;)V", "", com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.HOST_KEY, "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "LP7/b;", "responseTime", "", "wasSuccessful", "", "responseCode", "backendErrorCode", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "resultOrigin", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "isRetry", "Lcom/revenuecat/purchases/common/networking/ConnectionErrorReason;", "connectionErrorReason", "Lh6/A;", "trackHttpRequestPerformed--XzGXFE", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/networking/Endpoint;JZILjava/lang/Integer;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Lcom/revenuecat/purchases/VerificationResult;ZLcom/revenuecat/purchases/common/networking/ConnectionErrorReason;)V", "trackHttpRequestPerformed", "", "requestedProductIds", "productType", "billingResponseCode", "billingDebugMessage", "trackGoogleQueryProductDetailsRequest-9VgGkz4", "(Ljava/util/Set;Ljava/lang/String;ILjava/lang/String;J)V", "trackGoogleQueryProductDetailsRequest", "", "foundProductIds", "trackGoogleQueryPurchasesRequest-zkXUZaI", "(Ljava/lang/String;ILjava/lang/String;JLjava/util/List;)V", "trackGoogleQueryPurchasesRequest", "trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y", "(Ljava/lang/String;ILjava/lang/String;J)V", "trackGoogleQueryPurchaseHistoryRequest", "trackGoogleBillingStartConnection", "()V", "debugMessage", "pendingRequestCount", "trackGoogleBillingSetupFinished", "(ILjava/lang/String;I)V", "trackGoogleBillingServiceDisconnected", "productId", "oldProductId", "hasIntroTrial", "hasIntroPrice", "trackGooglePurchaseStarted", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "productIds", "purchaseStatuses", "trackGooglePurchaseUpdateReceived", "(Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V", "trackAmazonQueryProductDetailsRequest-KLykuaI", "(JZLjava/util/Set;)V", "trackAmazonQueryProductDetailsRequest", "trackAmazonQueryPurchasesRequest-KLykuaI", "(JZLjava/util/List;)V", "trackAmazonQueryPurchasesRequest", "requestStatus", "errorCode", "errorMessage", "trackAmazonPurchaseAttempt-9VgGkz4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)V", "trackAmazonPurchaseAttempt", "useCurrentThread", "trackMaxEventsStoredLimitReached", "(Z)V", "trackMaxDiagnosticsSyncRetriesReached", "trackClearingDiagnosticsAfterFailedSync", "trackProductDetailsNotSupported", "(ILjava/lang/String;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "trackCustomerInfoVerificationResultIfNeeded", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "trackEnteredOfflineEntitlementsMode", "Lcom/revenuecat/purchases/PurchasesError;", "error", "trackErrorEnteringOfflineEntitlementsMode", "(Lcom/revenuecat/purchases/PurchasesError;)V", "trackGetOfferingsStarted", "notFoundProductIds", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "cacheStatus", "trackGetOfferingsResult-B8UsjHI", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;J)V", "trackGetOfferingsResult", "trackGetProductsStarted", "(Ljava/util/Set;)V", "trackGetProductsResult-9VgGkz4", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Integer;J)V", "trackGetProductsResult", "trackSyncPurchasesStarted", "trackSyncPurchasesResult-SxA4cEA", "(Ljava/lang/Integer;Ljava/lang/String;J)V", "trackSyncPurchasesResult", "trackRestorePurchasesStarted", "trackRestorePurchasesResult-SxA4cEA", "trackRestorePurchasesResult", "trackGetCustomerInfoStarted", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "cacheFetchPolicy", "hadUnsyncedPurchasesBefore", "trackGetCustomerInfoResult-17CK4j0", "(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/VerificationResult;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;J)V", "trackGetCustomerInfoResult", "Lcom/revenuecat/purchases/ProductType;", "trackPurchaseStarted", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;)V", "trackPurchaseResult-myKFqkg", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/Integer;Ljava/lang/String;JLcom/revenuecat/purchases/VerificationResult;)V", "trackPurchaseResult", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "diagnosticsEntry", "trackEvent", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;)V", "trackEventInCurrentThread$purchases_defaultsRelease", "trackEventInCurrentThread", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;", "eventName", "", com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.PROPERTIES_KEY, "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;Ljava/util/Map;)V", "Lkotlin/Function0;", "completion", "checkAndClearDiagnosticsFileIfTooBig", "(Lkotlin/jvm/functions/Function0;)V", "command", "enqueue", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Ljava/util/UUID;", "commonProperties", "Ljava/util/Map;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventTrackerListener;", "listener", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventTrackerListener;", "getListener", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventTrackerListener;", "setListener", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventTrackerListener;)V", "Companion", "CacheStatus", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DiagnosticsTracker {

    @java.lang.Deprecated
    public static final java.lang.String BACKEND_ERROR_CODE_KEY = "backend_error_code";

    @java.lang.Deprecated
    public static final java.lang.String BILLING_DEBUG_MESSAGE = "billing_debug_message";

    @java.lang.Deprecated
    public static final java.lang.String BILLING_RESPONSE_CODE = "billing_response_code";

    @java.lang.Deprecated
    public static final java.lang.String CACHE_STATUS_KEY = "cache_status";

    @java.lang.Deprecated
    public static final java.lang.String CONNECTION_ERROR_REASON_KEY = "connection_error_reason";
    private static final com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.Companion Companion = new com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String ENDPOINT_NAME_KEY = "endpoint_name";

    @java.lang.Deprecated
    public static final java.lang.String ERROR_CODE_KEY = "error_code";

    @java.lang.Deprecated
    public static final java.lang.String ERROR_MESSAGE_KEY = "error_message";

    @java.lang.Deprecated
    public static final java.lang.String ETAG_HIT_KEY = "etag_hit";

    @java.lang.Deprecated
    public static final java.lang.String FETCH_POLICY_KEY = "fetch_policy";

    @java.lang.Deprecated
    public static final java.lang.String FOUND_PRODUCT_IDS_KEY = "found_product_ids";

    @java.lang.Deprecated
    public static final java.lang.String HAD_UNSYNCED_PURCHASES_BEFORE_KEY = "had_unsynced_purchases_before";

    @java.lang.Deprecated
    public static final java.lang.String HAS_INTRO_PRICE_KEY = "has_intro_price";

    @java.lang.Deprecated
    public static final java.lang.String HAS_INTRO_TRIAL_KEY = "has_intro_trial";

    @java.lang.Deprecated
    public static final java.lang.String HOST_KEY = "host";

    @java.lang.Deprecated
    public static final java.lang.String IS_RETRY = "is_retry";

    @java.lang.Deprecated
    public static final java.lang.String NOT_FOUND_PRODUCT_IDS_KEY = "not_found_product_ids";

    @java.lang.Deprecated
    public static final java.lang.String OLD_PRODUCT_ID_KEY = "old_product_id";

    @java.lang.Deprecated
    public static final java.lang.String PENDING_REQUEST_COUNT = "pending_request_count";

    @java.lang.Deprecated
    public static final java.lang.String PRODUCT_IDS_KEY = "product_ids";

    @java.lang.Deprecated
    public static final java.lang.String PRODUCT_ID_KEY = "product_id";

    @java.lang.Deprecated
    public static final java.lang.String PRODUCT_TYPE_KEY = "product_type";

    @java.lang.Deprecated
    public static final java.lang.String PRODUCT_TYPE_QUERIED_KEY = "product_type_queried";

    @java.lang.Deprecated
    public static final java.lang.String PURCHASE_STATUSES_KEY = "purchase_statuses";

    @java.lang.Deprecated
    public static final java.lang.String REQUESTED_PRODUCT_IDS_KEY = "requested_product_ids";

    @java.lang.Deprecated
    public static final java.lang.String REQUEST_STATUS_KEY = "request_status";

    @java.lang.Deprecated
    public static final java.lang.String RESPONSE_CODE_KEY = "response_code";

    @java.lang.Deprecated
    public static final java.lang.String RESPONSE_TIME_MILLIS_KEY = "response_time_millis";

    @java.lang.Deprecated
    public static final java.lang.String SUCCESSFUL_KEY = "successful";

    @java.lang.Deprecated
    public static final java.lang.String VERIFICATION_RESULT_KEY = "verification_result";
    private final com.revenuecat.purchases.common.AppConfig appConfig;
    private final java.util.UUID appSessionID;
    private final java.util.Map<java.lang.String, java.lang.String> commonProperties;
    private final com.revenuecat.purchases.common.Dispatcher diagnosticsDispatcher;
    private final com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper diagnosticsFileHelper;
    private final com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper diagnosticsHelper;
    private com.revenuecat.purchases.common.diagnostics.DiagnosticsEventTrackerListener listener;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "", "(Ljava/lang/String;I)V", "NOT_CHECKED", "NOT_FOUND", "STALE", "VALID", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum CacheStatus {
        NOT_CHECKED,
        NOT_FOUND,
        STALE,
        VALID
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$Companion;", "", "()V", "BACKEND_ERROR_CODE_KEY", "", "BILLING_DEBUG_MESSAGE", "BILLING_RESPONSE_CODE", "CACHE_STATUS_KEY", "CONNECTION_ERROR_REASON_KEY", "ENDPOINT_NAME_KEY", "ERROR_CODE_KEY", "ERROR_MESSAGE_KEY", "ETAG_HIT_KEY", "FETCH_POLICY_KEY", "FOUND_PRODUCT_IDS_KEY", "HAD_UNSYNCED_PURCHASES_BEFORE_KEY", "HAS_INTRO_PRICE_KEY", "HAS_INTRO_TRIAL_KEY", "HOST_KEY", "IS_RETRY", "NOT_FOUND_PRODUCT_IDS_KEY", "OLD_PRODUCT_ID_KEY", "PENDING_REQUEST_COUNT", "PRODUCT_IDS_KEY", "PRODUCT_ID_KEY", "PRODUCT_TYPE_KEY", "PRODUCT_TYPE_QUERIED_KEY", "PURCHASE_STATUSES_KEY", "REQUESTED_PRODUCT_IDS_KEY", "REQUEST_STATUS_KEY", "RESPONSE_CODE_KEY", "RESPONSE_TIME_MILLIS_KEY", "SUCCESSFUL_KEY", "VERIFICATION_RESULT_KEY", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker$checkAndClearDiagnosticsFileIfTooBig$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ kotlin.jvm.functions.Function0 $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.jvm.functions.Function0 function0) {
            super(0);
            this.$completion = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m149invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m149invoke() {
            if (com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.this.diagnosticsFileHelper.isDiagnosticsFileTooBig()) {
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Diagnostics file is too big. Deleting it.");
                }
                com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.this.diagnosticsHelper.resetDiagnosticsStatus();
                com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.trackMaxEventsStoredLimitReached$default(com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.this, false, 1, null);
            }
            this.$completion.invoke();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker$trackEvent$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20391 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry $diagnosticsEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20391(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry diagnosticsEntry) {
            super(0);
            this.$diagnosticsEntry = diagnosticsEntry;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m150invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m150invoke() {
            com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.this.trackEventInCurrentThread$purchases_defaultsRelease(this.$diagnosticsEntry);
        }
    }

    public DiagnosticsTracker(com.revenuecat.purchases.common.AppConfig appConfig, com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper diagnosticsFileHelper, com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper diagnosticsHelper, com.revenuecat.purchases.common.Dispatcher diagnosticsDispatcher, java.util.UUID appSessionID) {
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        kotlin.jvm.internal.m.e(diagnosticsFileHelper, "diagnosticsFileHelper");
        kotlin.jvm.internal.m.e(diagnosticsHelper, "diagnosticsHelper");
        kotlin.jvm.internal.m.e(diagnosticsDispatcher, "diagnosticsDispatcher");
        kotlin.jvm.internal.m.e(appSessionID, "appSessionID");
        this.appConfig = appConfig;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsHelper = diagnosticsHelper;
        this.diagnosticsDispatcher = diagnosticsDispatcher;
        this.appSessionID = appSessionID;
        this.commonProperties = appConfig.getStore() == com.revenuecat.purchases.Store.PLAY_STORE ? com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k("play_store_version", appConfig.getPlayStoreVersionName()), new p070h6.k("play_services_version", appConfig.getPlayServicesVersionName()))) : p078i6.x.f23206h;
    }

    private final void checkAndClearDiagnosticsFileIfTooBig(kotlin.jvm.functions.Function0 completion) {
        enqueue(new com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.AnonymousClass1(completion));
    }

    private final void enqueue(kotlin.jvm.functions.Function0 command) {
        com.revenuecat.purchases.common.Dispatcher.enqueue$default(this.diagnosticsDispatcher, new O.c(3, command), null, 2, null);
    }

    private final void trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName eventName, java.util.Map<java.lang.String, ? extends java.lang.Object> properties) {
        trackEvent(new com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry(null, eventName, p078i6.C.R0(this.commonProperties, properties), this.appSessionID, null, null, 49, null));
    }

    public static /* synthetic */ void trackMaxEventsStoredLimitReached$default(com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        diagnosticsTracker.trackMaxEventsStoredLimitReached(z6);
    }

    public final com.revenuecat.purchases.common.diagnostics.DiagnosticsEventTrackerListener getListener() {
        return this.listener;
    }

    public final void setListener(com.revenuecat.purchases.common.diagnostics.DiagnosticsEventTrackerListener diagnosticsEventTrackerListener) {
        this.listener = diagnosticsEventTrackerListener;
    }

    /* JADX INFO: renamed from: trackAmazonPurchaseAttempt-9VgGkz4, reason: not valid java name */
    public final void m136trackAmazonPurchaseAttempt9VgGkz4(java.lang.String productId, java.lang.String requestStatus, java.lang.Integer errorCode, java.lang.String errorMessage, long responseTime) {
        kotlin.jvm.internal.m.e(productId, "productId");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.AMAZON_PURCHASE_ATTEMPT, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(PRODUCT_ID_KEY, productId), new p070h6.k(REQUEST_STATUS_KEY, requestStatus), new p070h6.k(ERROR_CODE_KEY, errorCode), new p070h6.k(ERROR_MESSAGE_KEY, errorMessage), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))))));
    }

    /* JADX INFO: renamed from: trackAmazonQueryProductDetailsRequest-KLykuaI, reason: not valid java name */
    public final void m137trackAmazonQueryProductDetailsRequestKLykuaI(long responseTime, boolean wasSuccessful, java.util.Set<java.lang.String> requestedProductIds) {
        kotlin.jvm.internal.m.e(requestedProductIds, "requestedProductIds");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.AMAZON_QUERY_PRODUCT_DETAILS_REQUEST, p078i6.C.N0(new p070h6.k(SUCCESSFUL_KEY, java.lang.Boolean.valueOf(wasSuccessful)), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))), new p070h6.k(REQUESTED_PRODUCT_IDS_KEY, requestedProductIds)));
    }

    /* JADX INFO: renamed from: trackAmazonQueryPurchasesRequest-KLykuaI, reason: not valid java name */
    public final void m138trackAmazonQueryPurchasesRequestKLykuaI(long responseTime, boolean wasSuccessful, java.util.List<java.lang.String> foundProductIds) {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.AMAZON_QUERY_PURCHASES_REQUEST, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(SUCCESSFUL_KEY, java.lang.Boolean.valueOf(wasSuccessful)), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))), new p070h6.k(FOUND_PRODUCT_IDS_KEY, foundProductIds))));
    }

    public final void trackClearingDiagnosticsAfterFailedSync() {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.CLEARING_DIAGNOSTICS_AFTER_FAILED_SYNC, p078i6.x.f23206h);
    }

    public final void trackCustomerInfoVerificationResultIfNeeded(com.revenuecat.purchases.CustomerInfo customerInfo) {
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
        com.revenuecat.purchases.VerificationResult verification = customerInfo.getEntitlements().getVerification();
        if (verification == com.revenuecat.purchases.VerificationResult.NOT_REQUESTED) {
            return;
        }
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.CUSTOMER_INFO_VERIFICATION_RESULT, p078i6.D.J0(new p070h6.k(VERIFICATION_RESULT_KEY, verification.name())));
    }

    public final void trackEnteredOfflineEntitlementsMode() {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.ENTERED_OFFLINE_ENTITLEMENTS_MODE, p078i6.x.f23206h);
    }

    public final void trackErrorEnteringOfflineEntitlementsMode(com.revenuecat.purchases.PurchasesError error) {
        java.lang.String str;
        kotlin.jvm.internal.m.e(error, "error");
        if (error.getCode() == com.revenuecat.purchases.PurchasesErrorCode.UnsupportedError && kotlin.jvm.internal.m.a(error.getUnderlyingErrorMessage(), com.revenuecat.purchases.strings.OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES)) {
            str = "one_time_purchase_found";
        } else {
            str = (error.getCode() == com.revenuecat.purchases.PurchasesErrorCode.CustomerInfoError && kotlin.jvm.internal.m.a(error.getUnderlyingErrorMessage(), com.revenuecat.purchases.strings.OfflineEntitlementsStrings.PRODUCT_ENTITLEMENT_MAPPING_REQUIRED)) ? "no_entitlement_mapping_available" : "unknown";
        }
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.ERROR_ENTERING_OFFLINE_ENTITLEMENTS_MODE, p078i6.C.N0(new p070h6.k("offline_entitlement_error_reason", str), new p070h6.k(ERROR_MESSAGE_KEY, error.getMessage() + " Underlying error: " + error.getUnderlyingErrorMessage())));
    }

    public final void trackEventInCurrentThread$purchases_defaultsRelease(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry diagnosticsEntry) {
        kotlin.jvm.internal.m.e(diagnosticsEntry, "diagnosticsEntry");
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), "Tracking diagnostics entry: " + diagnosticsEntry);
        }
        try {
            this.diagnosticsFileHelper.appendEvent(diagnosticsEntry);
            com.revenuecat.purchases.common.diagnostics.DiagnosticsEventTrackerListener diagnosticsEventTrackerListener = this.listener;
            if (diagnosticsEventTrackerListener != null) {
                diagnosticsEventTrackerListener.onEventTracked();
            }
        } catch (java.io.IOException e6) {
            com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), "Error tracking diagnostics entry: " + e6);
            }
        }
    }

    /* JADX INFO: renamed from: trackGetCustomerInfoResult-17CK4j0, reason: not valid java name */
    public final void m139trackGetCustomerInfoResult17CK4j0(com.revenuecat.purchases.CacheFetchPolicy cacheFetchPolicy, com.revenuecat.purchases.VerificationResult verificationResult, java.lang.Boolean hadUnsyncedPurchasesBefore, java.lang.String errorMessage, java.lang.Integer errorCode, long responseTime) {
        kotlin.jvm.internal.m.e(cacheFetchPolicy, "cacheFetchPolicy");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GET_CUSTOMER_INFO_RESULT, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(FETCH_POLICY_KEY, cacheFetchPolicy.name()), new p070h6.k(VERIFICATION_RESULT_KEY, verificationResult != null ? verificationResult.name() : null), new p070h6.k(HAD_UNSYNCED_PURCHASES_BEFORE_KEY, hadUnsyncedPurchasesBefore), new p070h6.k(ERROR_MESSAGE_KEY, errorMessage), new p070h6.k(ERROR_CODE_KEY, errorCode), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))))));
    }

    public final void trackGetCustomerInfoStarted() {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GET_CUSTOMER_INFO_STARTED, p078i6.x.f23206h);
    }

    /* JADX INFO: renamed from: trackGetOfferingsResult-B8UsjHI, reason: not valid java name */
    public final void m140trackGetOfferingsResultB8UsjHI(java.util.Set<java.lang.String> requestedProductIds, java.util.Set<java.lang.String> notFoundProductIds, java.lang.String errorMessage, java.lang.Integer errorCode, java.lang.String verificationResult, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus cacheStatus, long responseTime) {
        kotlin.jvm.internal.m.e(cacheStatus, "cacheStatus");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GET_OFFERINGS_RESULT, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(REQUESTED_PRODUCT_IDS_KEY, requestedProductIds), new p070h6.k(NOT_FOUND_PRODUCT_IDS_KEY, notFoundProductIds), new p070h6.k(ERROR_MESSAGE_KEY, errorMessage), new p070h6.k(ERROR_CODE_KEY, errorCode), new p070h6.k(VERIFICATION_RESULT_KEY, verificationResult), new p070h6.k(CACHE_STATUS_KEY, cacheStatus.name()), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))))));
    }

    public final void trackGetOfferingsStarted() {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GET_OFFERINGS_STARTED, p078i6.x.f23206h);
    }

    /* JADX INFO: renamed from: trackGetProductsResult-9VgGkz4, reason: not valid java name */
    public final void m141trackGetProductsResult9VgGkz4(java.util.Set<java.lang.String> requestedProductIds, java.util.Set<java.lang.String> notFoundProductIds, java.lang.String errorMessage, java.lang.Integer errorCode, long responseTime) {
        kotlin.jvm.internal.m.e(requestedProductIds, "requestedProductIds");
        kotlin.jvm.internal.m.e(notFoundProductIds, "notFoundProductIds");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GET_PRODUCTS_RESULT, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(REQUESTED_PRODUCT_IDS_KEY, requestedProductIds), new p070h6.k(NOT_FOUND_PRODUCT_IDS_KEY, notFoundProductIds), new p070h6.k(ERROR_MESSAGE_KEY, errorMessage), new p070h6.k(ERROR_CODE_KEY, errorCode), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))))));
    }

    public final void trackGetProductsStarted(java.util.Set<java.lang.String> requestedProductIds) {
        kotlin.jvm.internal.m.e(requestedProductIds, "requestedProductIds");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GET_PRODUCTS_STARTED, p078i6.D.J0(new p070h6.k(REQUESTED_PRODUCT_IDS_KEY, requestedProductIds)));
    }

    public final void trackGoogleBillingServiceDisconnected() {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GOOGLE_BILLING_SERVICE_DISCONNECTED, p078i6.x.f23206h);
    }

    public final void trackGoogleBillingSetupFinished(int responseCode, java.lang.String debugMessage, int pendingRequestCount) {
        kotlin.jvm.internal.m.e(debugMessage, "debugMessage");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GOOGLE_BILLING_SETUP_FINISHED, p078i6.C.N0(new p070h6.k(BILLING_RESPONSE_CODE, java.lang.Integer.valueOf(responseCode)), new p070h6.k(BILLING_DEBUG_MESSAGE, debugMessage), new p070h6.k(PENDING_REQUEST_COUNT, java.lang.Integer.valueOf(pendingRequestCount))));
    }

    public final void trackGoogleBillingStartConnection() {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GOOGLE_BILLING_START_CONNECTION, p078i6.x.f23206h);
    }

    public final void trackGooglePurchaseStarted(java.lang.String productId, java.lang.String oldProductId, java.lang.Boolean hasIntroTrial, java.lang.Boolean hasIntroPrice) {
        kotlin.jvm.internal.m.e(productId, "productId");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GOOGLE_PURCHASE_STARTED, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(PRODUCT_ID_KEY, productId), new p070h6.k(OLD_PRODUCT_ID_KEY, oldProductId), new p070h6.k(HAS_INTRO_TRIAL_KEY, hasIntroTrial), new p070h6.k(HAS_INTRO_PRICE_KEY, hasIntroPrice))));
    }

    public final void trackGooglePurchaseUpdateReceived(java.util.List<java.lang.String> productIds, java.util.List<java.lang.String> purchaseStatuses, int billingResponseCode, java.lang.String billingDebugMessage) {
        kotlin.jvm.internal.m.e(billingDebugMessage, "billingDebugMessage");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GOOGLE_PURCHASES_UPDATE_RECEIVED, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(PRODUCT_IDS_KEY, productIds), new p070h6.k(PURCHASE_STATUSES_KEY, purchaseStatuses), new p070h6.k(BILLING_RESPONSE_CODE, java.lang.Integer.valueOf(billingResponseCode)), new p070h6.k(BILLING_DEBUG_MESSAGE, billingDebugMessage))));
    }

    /* JADX INFO: renamed from: trackGoogleQueryProductDetailsRequest-9VgGkz4, reason: not valid java name */
    public final void m142trackGoogleQueryProductDetailsRequest9VgGkz4(java.util.Set<java.lang.String> requestedProductIds, java.lang.String productType, int billingResponseCode, java.lang.String billingDebugMessage, long responseTime) {
        kotlin.jvm.internal.m.e(requestedProductIds, "requestedProductIds");
        kotlin.jvm.internal.m.e(productType, "productType");
        kotlin.jvm.internal.m.e(billingDebugMessage, "billingDebugMessage");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST, p078i6.C.N0(new p070h6.k(REQUESTED_PRODUCT_IDS_KEY, requestedProductIds), new p070h6.k(PRODUCT_TYPE_QUERIED_KEY, productType), new p070h6.k(BILLING_RESPONSE_CODE, java.lang.Integer.valueOf(billingResponseCode)), new p070h6.k(BILLING_DEBUG_MESSAGE, billingDebugMessage), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime)))));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m143trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(java.lang.String productType, int billingResponseCode, java.lang.String billingDebugMessage, long responseTime) {
        kotlin.jvm.internal.m.e(productType, "productType");
        kotlin.jvm.internal.m.e(billingDebugMessage, "billingDebugMessage");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST, p078i6.C.N0(new p070h6.k(PRODUCT_TYPE_QUERIED_KEY, productType), new p070h6.k(BILLING_RESPONSE_CODE, java.lang.Integer.valueOf(billingResponseCode)), new p070h6.k(BILLING_DEBUG_MESSAGE, billingDebugMessage), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime)))));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchasesRequest-zkXUZaI, reason: not valid java name */
    public final void m144trackGoogleQueryPurchasesRequestzkXUZaI(java.lang.String productType, int billingResponseCode, java.lang.String billingDebugMessage, long responseTime, java.util.List<java.lang.String> foundProductIds) {
        kotlin.jvm.internal.m.e(productType, "productType");
        kotlin.jvm.internal.m.e(billingDebugMessage, "billingDebugMessage");
        kotlin.jvm.internal.m.e(foundProductIds, "foundProductIds");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.GOOGLE_QUERY_PURCHASES_REQUEST, p078i6.C.N0(new p070h6.k(PRODUCT_TYPE_QUERIED_KEY, productType), new p070h6.k(BILLING_RESPONSE_CODE, java.lang.Integer.valueOf(billingResponseCode)), new p070h6.k(BILLING_DEBUG_MESSAGE, billingDebugMessage), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))), new p070h6.k(FOUND_PRODUCT_IDS_KEY, foundProductIds)));
    }

    /* JADX INFO: renamed from: trackHttpRequestPerformed--XzGXFE, reason: not valid java name */
    public final void m145trackHttpRequestPerformedXzGXFE(java.lang.String host, com.revenuecat.purchases.common.networking.Endpoint endpoint, long responseTime, boolean wasSuccessful, int responseCode, java.lang.Integer backendErrorCode, com.revenuecat.purchases.common.networking.HTTPResult.Origin resultOrigin, com.revenuecat.purchases.VerificationResult verificationResult, boolean isRetry, com.revenuecat.purchases.common.networking.ConnectionErrorReason connectionErrorReason) {
        kotlin.jvm.internal.m.e(host, "host");
        kotlin.jvm.internal.m.e(endpoint, "endpoint");
        kotlin.jvm.internal.m.e(verificationResult, "verificationResult");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.HTTP_REQUEST_PERFORMED, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(HOST_KEY, host), new p070h6.k(ENDPOINT_NAME_KEY, endpoint.getName()), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))), new p070h6.k(SUCCESSFUL_KEY, java.lang.Boolean.valueOf(wasSuccessful)), new p070h6.k(RESPONSE_CODE_KEY, java.lang.Integer.valueOf(responseCode)), new p070h6.k(BACKEND_ERROR_CODE_KEY, backendErrorCode), new p070h6.k(ETAG_HIT_KEY, java.lang.Boolean.valueOf(resultOrigin == com.revenuecat.purchases.common.networking.HTTPResult.Origin.CACHE)), new p070h6.k(VERIFICATION_RESULT_KEY, verificationResult.name()), new p070h6.k(IS_RETRY, java.lang.Boolean.valueOf(isRetry)), new p070h6.k(CONNECTION_ERROR_REASON_KEY, connectionErrorReason != null ? connectionErrorReason.name() : null))));
    }

    public final void trackMaxDiagnosticsSyncRetriesReached() {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.MAX_DIAGNOSTICS_SYNC_RETRIES_REACHED, p078i6.x.f23206h);
    }

    public final void trackMaxEventsStoredLimitReached(boolean useCurrentThread) {
        com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry diagnosticsEntry = new com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry(null, com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.MAX_EVENTS_STORED_LIMIT_REACHED, this.commonProperties, this.appSessionID, null, null, 49, null);
        if (useCurrentThread) {
            trackEventInCurrentThread$purchases_defaultsRelease(diagnosticsEntry);
        } else {
            trackEvent(diagnosticsEntry);
        }
    }

    public final void trackProductDetailsNotSupported(int billingResponseCode, java.lang.String billingDebugMessage) {
        kotlin.jvm.internal.m.e(billingDebugMessage, "billingDebugMessage");
        com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName diagnosticsEntryName = com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.PRODUCT_DETAILS_NOT_SUPPORTED;
        java.lang.String playStoreVersionName = this.appConfig.getPlayStoreVersionName();
        if (playStoreVersionName == null) {
            playStoreVersionName = "";
        }
        p070h6.k kVar = new p070h6.k("play_store_version", playStoreVersionName);
        java.lang.String playServicesVersionName = this.appConfig.getPlayServicesVersionName();
        trackEvent(diagnosticsEntryName, p078i6.C.N0(kVar, new p070h6.k("play_services_version", playServicesVersionName != null ? playServicesVersionName : ""), new p070h6.k(BILLING_RESPONSE_CODE, java.lang.Integer.valueOf(billingResponseCode)), new p070h6.k(BILLING_DEBUG_MESSAGE, billingDebugMessage)));
    }

    /* JADX INFO: renamed from: trackPurchaseResult-myKFqkg, reason: not valid java name */
    public final void m146trackPurchaseResultmyKFqkg(java.lang.String productId, com.revenuecat.purchases.ProductType productType, java.lang.Integer errorCode, java.lang.String errorMessage, long responseTime, com.revenuecat.purchases.VerificationResult verificationResult) {
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(productType, "productType");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.PURCHASE_RESULT, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(PRODUCT_ID_KEY, productId), new p070h6.k(PRODUCT_TYPE_KEY, com.revenuecat.purchases.common.diagnostics.DiagnosticsTrackerKt.getDiagnosticsName(productType)), new p070h6.k(ERROR_CODE_KEY, errorCode), new p070h6.k(ERROR_MESSAGE_KEY, errorMessage), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))), new p070h6.k(VERIFICATION_RESULT_KEY, verificationResult != null ? verificationResult.name() : null))));
    }

    public final void trackPurchaseStarted(java.lang.String productId, com.revenuecat.purchases.ProductType productType) {
        kotlin.jvm.internal.m.e(productId, "productId");
        kotlin.jvm.internal.m.e(productType, "productType");
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.PURCHASE_STARTED, p078i6.C.N0(new p070h6.k(PRODUCT_ID_KEY, productId), new p070h6.k(PRODUCT_TYPE_KEY, com.revenuecat.purchases.common.diagnostics.DiagnosticsTrackerKt.getDiagnosticsName(productType))));
    }

    /* JADX INFO: renamed from: trackRestorePurchasesResult-SxA4cEA, reason: not valid java name */
    public final void m147trackRestorePurchasesResultSxA4cEA(java.lang.Integer errorCode, java.lang.String errorMessage, long responseTime) {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.RESTORE_PURCHASES_RESULT, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(ERROR_CODE_KEY, errorCode), new p070h6.k(ERROR_MESSAGE_KEY, errorMessage), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))))));
    }

    public final void trackRestorePurchasesStarted() {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.RESTORE_PURCHASES_STARTED, p078i6.x.f23206h);
    }

    /* JADX INFO: renamed from: trackSyncPurchasesResult-SxA4cEA, reason: not valid java name */
    public final void m148trackSyncPurchasesResultSxA4cEA(java.lang.Integer errorCode, java.lang.String errorMessage, long responseTime) {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.SYNC_PURCHASES_RESULT, com.revenuecat.purchases.utils.MapExtensionsKt.filterNotNullValues(p078i6.C.N0(new p070h6.k(ERROR_CODE_KEY, errorCode), new p070h6.k(ERROR_MESSAGE_KEY, errorMessage), new p070h6.k(RESPONSE_TIME_MILLIS_KEY, java.lang.Long.valueOf(P7.b.d(responseTime))))));
    }

    public final void trackSyncPurchasesStarted() {
        trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntryName.SYNC_PURCHASES_STARTED, p078i6.x.f23206h);
    }

    public final void trackEvent(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry diagnosticsEntry) {
        kotlin.jvm.internal.m.e(diagnosticsEntry, "diagnosticsEntry");
        checkAndClearDiagnosticsFileIfTooBig(new com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.C20391(diagnosticsEntry));
    }

    public /* synthetic */ DiagnosticsTracker(com.revenuecat.purchases.common.AppConfig appConfig, com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper diagnosticsFileHelper, com.revenuecat.purchases.common.diagnostics.DiagnosticsHelper diagnosticsHelper, com.revenuecat.purchases.common.Dispatcher dispatcher, java.util.UUID uuid, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(appConfig, diagnosticsFileHelper, diagnosticsHelper, dispatcher, (i3 & 16) != 0 ? com.revenuecat.purchases.common.events.EventsManager.INSTANCE.getAppSessionID$purchases_defaultsRelease() : uuid);
    }
}
