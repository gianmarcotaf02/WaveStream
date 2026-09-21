package com.revenuecat.purchases.common.diagnostics;

import O.c;
import P7.b;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.networking.ConnectionErrorReason;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p070h6.k;
import p078i6.C;
import p078i6.D;
import p078i6.x;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000  \u00012\u00020\u0001:\u0004¡\u0001 \u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJf\u0010#\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0004\b!\u0010\"J>\u0010+\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b)\u0010*J>\u00100\u001a\u00020 2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0,ø\u0001\u0000¢\u0006\u0004\b.\u0010/J0\u00103\u001a\u00020 2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u00020 ¢\u0006\u0004\b4\u00105J%\u00108\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u0016¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020 ¢\u0006\u0004\b:\u00105J3\u0010?\u001a\u00020 2\u0006\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u000e2\b\u0010=\u001a\u0004\u0018\u00010\u00142\b\u0010>\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b?\u0010@J=\u0010C\u001a\u00020 2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010,2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010,2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\bC\u0010DJ.\u0010G\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ0\u0010J\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010,ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ>\u0010P\u001a\u00020 2\u0006\u0010;\u001a\u00020\u000e2\b\u0010K\u001a\u0004\u0018\u00010\u000e2\b\u0010L\u001a\u0004\u0018\u00010\u00162\b\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020 2\b\b\u0002\u0010Q\u001a\u00020\u0014¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020 ¢\u0006\u0004\bT\u00105J\r\u0010U\u001a\u00020 ¢\u0006\u0004\bU\u00105J\u001d\u0010V\u001a\u00020 2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\bV\u0010WJ\u0015\u0010Z\u001a\u00020 2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\r\u0010\\\u001a\u00020 ¢\u0006\u0004\b\\\u00105J\u0015\u0010_\u001a\u00020 2\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020 ¢\u0006\u0004\ba\u00105J^\u0010g\u001a\u00020 2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010$2\u000e\u0010b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010$2\b\u0010M\u001a\u0004\u0018\u00010\u000e2\b\u0010L\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\be\u0010fJ\u001b\u0010h\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$¢\u0006\u0004\bh\u0010iJH\u0010l\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\b\u0010M\u001a\u0004\u0018\u00010\u000e2\b\u0010L\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ\r\u0010m\u001a\u00020 ¢\u0006\u0004\bm\u00105J,\u0010p\u001a\u00020 2\b\u0010L\u001a\u0004\u0018\u00010\u00162\b\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\bn\u0010oJ\r\u0010q\u001a\u00020 ¢\u0006\u0004\bq\u00105J,\u0010s\u001a\u00020 2\b\u0010L\u001a\u0004\u0018\u00010\u00162\b\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\br\u0010oJ\r\u0010t\u001a\u00020 ¢\u0006\u0004\bt\u00105JH\u0010z\u001a\u00020 2\u0006\u0010v\u001a\u00020u2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010w\u001a\u0004\u0018\u00010\u00142\b\u0010M\u001a\u0004\u0018\u00010\u000e2\b\u0010L\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\u001d\u0010|\u001a\u00020 2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020{¢\u0006\u0004\b|\u0010}JG\u0010\u0080\u0001\u001a\u00020 2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020{2\b\u0010L\u001a\u0004\u0018\u00010\u00162\b\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ\u001c\u0010\u0083\u0001\u001a\u00020 2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0007¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001c\u0010\u0086\u0001\u001a\u00020 2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0084\u0001J2\u0010\u0083\u0001\u001a\u00020 2\b\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0014\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u0089\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u008b\u0001J\"\u0010\u008e\u0001\u001a\u00020 2\u000e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u008c\u0001H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\"\u0010\u0091\u0001\u001a\u00020 2\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u008c\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u008f\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0092\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0093\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0094\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0095\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0096\u0001R$\u0010\u0097\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006¢\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "diagnosticsHelper", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "Ljava/util/UUID;", "appSessionID", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;Lcom/revenuecat/purchases/common/Dispatcher;Ljava/util/UUID;)V", "", DiagnosticsTracker.HOST_KEY, "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "LP7/b;", "responseTime", "", "wasSuccessful", "", "responseCode", "backendErrorCode", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "resultOrigin", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "isRetry", "Lcom/revenuecat/purchases/common/networking/ConnectionErrorReason;", "connectionErrorReason", "Lh6/A;", "trackHttpRequestPerformed--XzGXFE", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/networking/Endpoint;JZILjava/lang/Integer;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Lcom/revenuecat/purchases/VerificationResult;ZLcom/revenuecat/purchases/common/networking/ConnectionErrorReason;)V", "trackHttpRequestPerformed", "", "requestedProductIds", "productType", "billingResponseCode", "billingDebugMessage", "trackGoogleQueryProductDetailsRequest-9VgGkz4", "(Ljava/util/Set;Ljava/lang/String;ILjava/lang/String;J)V", "trackGoogleQueryProductDetailsRequest", "", "foundProductIds", "trackGoogleQueryPurchasesRequest-zkXUZaI", "(Ljava/lang/String;ILjava/lang/String;JLjava/util/List;)V", "trackGoogleQueryPurchasesRequest", "trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y", "(Ljava/lang/String;ILjava/lang/String;J)V", "trackGoogleQueryPurchaseHistoryRequest", "trackGoogleBillingStartConnection", "()V", "debugMessage", "pendingRequestCount", "trackGoogleBillingSetupFinished", "(ILjava/lang/String;I)V", "trackGoogleBillingServiceDisconnected", "productId", "oldProductId", "hasIntroTrial", "hasIntroPrice", "trackGooglePurchaseStarted", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "productIds", "purchaseStatuses", "trackGooglePurchaseUpdateReceived", "(Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V", "trackAmazonQueryProductDetailsRequest-KLykuaI", "(JZLjava/util/Set;)V", "trackAmazonQueryProductDetailsRequest", "trackAmazonQueryPurchasesRequest-KLykuaI", "(JZLjava/util/List;)V", "trackAmazonQueryPurchasesRequest", "requestStatus", "errorCode", "errorMessage", "trackAmazonPurchaseAttempt-9VgGkz4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)V", "trackAmazonPurchaseAttempt", "useCurrentThread", "trackMaxEventsStoredLimitReached", "(Z)V", "trackMaxDiagnosticsSyncRetriesReached", "trackClearingDiagnosticsAfterFailedSync", "trackProductDetailsNotSupported", "(ILjava/lang/String;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "trackCustomerInfoVerificationResultIfNeeded", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "trackEnteredOfflineEntitlementsMode", "Lcom/revenuecat/purchases/PurchasesError;", "error", "trackErrorEnteringOfflineEntitlementsMode", "(Lcom/revenuecat/purchases/PurchasesError;)V", "trackGetOfferingsStarted", "notFoundProductIds", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "cacheStatus", "trackGetOfferingsResult-B8UsjHI", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;J)V", "trackGetOfferingsResult", "trackGetProductsStarted", "(Ljava/util/Set;)V", "trackGetProductsResult-9VgGkz4", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Integer;J)V", "trackGetProductsResult", "trackSyncPurchasesStarted", "trackSyncPurchasesResult-SxA4cEA", "(Ljava/lang/Integer;Ljava/lang/String;J)V", "trackSyncPurchasesResult", "trackRestorePurchasesStarted", "trackRestorePurchasesResult-SxA4cEA", "trackRestorePurchasesResult", "trackGetCustomerInfoStarted", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "cacheFetchPolicy", "hadUnsyncedPurchasesBefore", "trackGetCustomerInfoResult-17CK4j0", "(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/VerificationResult;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;J)V", "trackGetCustomerInfoResult", "Lcom/revenuecat/purchases/ProductType;", "trackPurchaseStarted", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;)V", "trackPurchaseResult-myKFqkg", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/Integer;Ljava/lang/String;JLcom/revenuecat/purchases/VerificationResult;)V", "trackPurchaseResult", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "diagnosticsEntry", "trackEvent", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;)V", "trackEventInCurrentThread$purchases_defaultsRelease", "trackEventInCurrentThread", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;", "eventName", "", DiagnosticsEntry.PROPERTIES_KEY, "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntryName;Ljava/util/Map;)V", "Lkotlin/Function0;", "completion", "checkAndClearDiagnosticsFileIfTooBig", "(Lkotlin/jvm/functions/Function0;)V", "command", "enqueue", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsHelper;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Ljava/util/UUID;", "commonProperties", "Ljava/util/Map;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventTrackerListener;", "listener", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventTrackerListener;", "getListener", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventTrackerListener;", "setListener", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventTrackerListener;)V", "Companion", "CacheStatus", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DiagnosticsTracker {

    @Deprecated
    public static final String BACKEND_ERROR_CODE_KEY = "backend_error_code";

    @Deprecated
    public static final String BILLING_DEBUG_MESSAGE = "billing_debug_message";

    @Deprecated
    public static final String BILLING_RESPONSE_CODE = "billing_response_code";

    @Deprecated
    public static final String CACHE_STATUS_KEY = "cache_status";

    @Deprecated
    public static final String CONNECTION_ERROR_REASON_KEY = "connection_error_reason";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ENDPOINT_NAME_KEY = "endpoint_name";

    @Deprecated
    public static final String ERROR_CODE_KEY = "error_code";

    @Deprecated
    public static final String ERROR_MESSAGE_KEY = "error_message";

    @Deprecated
    public static final String ETAG_HIT_KEY = "etag_hit";

    @Deprecated
    public static final String FETCH_POLICY_KEY = "fetch_policy";

    @Deprecated
    public static final String FOUND_PRODUCT_IDS_KEY = "found_product_ids";

    @Deprecated
    public static final String HAD_UNSYNCED_PURCHASES_BEFORE_KEY = "had_unsynced_purchases_before";

    @Deprecated
    public static final String HAS_INTRO_PRICE_KEY = "has_intro_price";

    @Deprecated
    public static final String HAS_INTRO_TRIAL_KEY = "has_intro_trial";

    @Deprecated
    public static final String HOST_KEY = "host";

    @Deprecated
    public static final String IS_RETRY = "is_retry";

    @Deprecated
    public static final String NOT_FOUND_PRODUCT_IDS_KEY = "not_found_product_ids";

    @Deprecated
    public static final String OLD_PRODUCT_ID_KEY = "old_product_id";

    @Deprecated
    public static final String PENDING_REQUEST_COUNT = "pending_request_count";

    @Deprecated
    public static final String PRODUCT_IDS_KEY = "product_ids";

    @Deprecated
    public static final String PRODUCT_ID_KEY = "product_id";

    @Deprecated
    public static final String PRODUCT_TYPE_KEY = "product_type";

    @Deprecated
    public static final String PRODUCT_TYPE_QUERIED_KEY = "product_type_queried";

    @Deprecated
    public static final String PURCHASE_STATUSES_KEY = "purchase_statuses";

    @Deprecated
    public static final String REQUESTED_PRODUCT_IDS_KEY = "requested_product_ids";

    @Deprecated
    public static final String REQUEST_STATUS_KEY = "request_status";

    @Deprecated
    public static final String RESPONSE_CODE_KEY = "response_code";

    @Deprecated
    public static final String RESPONSE_TIME_MILLIS_KEY = "response_time_millis";

    @Deprecated
    public static final String SUCCESSFUL_KEY = "successful";

    @Deprecated
    public static final String VERIFICATION_RESULT_KEY = "verification_result";
    private final AppConfig appConfig;
    private final UUID appSessionID;
    private final Map<String, String> commonProperties;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsHelper diagnosticsHelper;
    private DiagnosticsEventTrackerListener listener;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "", "(Ljava/lang/String;I)V", "NOT_CHECKED", "NOT_FOUND", "STALE", "VALID", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum CacheStatus {
        NOT_CHECKED,
        NOT_FOUND,
        STALE,
        VALID
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$Companion;", "", "()V", "BACKEND_ERROR_CODE_KEY", "", "BILLING_DEBUG_MESSAGE", "BILLING_RESPONSE_CODE", "CACHE_STATUS_KEY", "CONNECTION_ERROR_REASON_KEY", "ENDPOINT_NAME_KEY", "ERROR_CODE_KEY", "ERROR_MESSAGE_KEY", "ETAG_HIT_KEY", "FETCH_POLICY_KEY", "FOUND_PRODUCT_IDS_KEY", "HAD_UNSYNCED_PURCHASES_BEFORE_KEY", "HAS_INTRO_PRICE_KEY", "HAS_INTRO_TRIAL_KEY", "HOST_KEY", "IS_RETRY", "NOT_FOUND_PRODUCT_IDS_KEY", "OLD_PRODUCT_ID_KEY", "PENDING_REQUEST_COUNT", "PRODUCT_IDS_KEY", "PRODUCT_ID_KEY", "PRODUCT_TYPE_KEY", "PRODUCT_TYPE_QUERIED_KEY", "PURCHASE_STATUSES_KEY", "REQUESTED_PRODUCT_IDS_KEY", "REQUEST_STATUS_KEY", "RESPONSE_CODE_KEY", "RESPONSE_TIME_MILLIS_KEY", "SUCCESSFUL_KEY", "VERIFICATION_RESULT_KEY", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements Function0 {
        final Function0 $completion;

        public AnonymousClass1(Function0 function0) {
            super(0);
            this.$completion = function0;
        }

        @Override
        public Object invoke() {
            m149invoke();
            return A.f22523a;
        }

        public final void m149invoke() {
            if (DiagnosticsTracker.this.diagnosticsFileHelper.isDiagnosticsFileTooBig()) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Diagnostics file is too big. Deleting it.");
                }
                DiagnosticsTracker.this.diagnosticsHelper.resetDiagnosticsStatus();
                DiagnosticsTracker.trackMaxEventsStoredLimitReached$default(DiagnosticsTracker.this, false, 1, null);
            }
            this.$completion.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20391 extends o implements Function0 {
        final DiagnosticsEntry $diagnosticsEntry;

        public C20391(DiagnosticsEntry diagnosticsEntry) {
            super(0);
            this.$diagnosticsEntry = diagnosticsEntry;
        }

        @Override
        public Object invoke() {
            m150invoke();
            return A.f22523a;
        }

        public final void m150invoke() {
            DiagnosticsTracker.this.trackEventInCurrentThread$purchases_defaultsRelease(this.$diagnosticsEntry);
        }
    }

    public DiagnosticsTracker(AppConfig appConfig, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsHelper diagnosticsHelper, Dispatcher diagnosticsDispatcher, UUID appSessionID) {
        m.e(appConfig, "appConfig");
        m.e(diagnosticsFileHelper, "diagnosticsFileHelper");
        m.e(diagnosticsHelper, "diagnosticsHelper");
        m.e(diagnosticsDispatcher, "diagnosticsDispatcher");
        m.e(appSessionID, "appSessionID");
        this.appConfig = appConfig;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsHelper = diagnosticsHelper;
        this.diagnosticsDispatcher = diagnosticsDispatcher;
        this.appSessionID = appSessionID;
        this.commonProperties = appConfig.getStore() == Store.PLAY_STORE ? MapExtensionsKt.filterNotNullValues(C.N0(new k("play_store_version", appConfig.getPlayStoreVersionName()), new k("play_services_version", appConfig.getPlayServicesVersionName()))) : x.f23206h;
    }

    private final void checkAndClearDiagnosticsFileIfTooBig(Function0 completion) {
        enqueue(new AnonymousClass1(completion));
    }

    private final void enqueue(Function0 command) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new c(3, command), null, 2, null);
    }

    private final void trackEvent(DiagnosticsEntryName eventName, Map<String, ? extends Object> properties) {
        trackEvent(new DiagnosticsEntry(null, eventName, C.R0(this.commonProperties, properties), this.appSessionID, null, null, 49, null));
    }

    public static void trackMaxEventsStoredLimitReached$default(DiagnosticsTracker diagnosticsTracker, boolean z6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        diagnosticsTracker.trackMaxEventsStoredLimitReached(z6);
    }

    public final DiagnosticsEventTrackerListener getListener() {
        return this.listener;
    }

    public final void setListener(DiagnosticsEventTrackerListener diagnosticsEventTrackerListener) {
        this.listener = diagnosticsEventTrackerListener;
    }

    public final void m136trackAmazonPurchaseAttempt9VgGkz4(String productId, String requestStatus, Integer errorCode, String errorMessage, long responseTime) {
        m.e(productId, "productId");
        trackEvent(DiagnosticsEntryName.AMAZON_PURCHASE_ATTEMPT, MapExtensionsKt.filterNotNullValues(C.N0(new k(PRODUCT_ID_KEY, productId), new k(REQUEST_STATUS_KEY, requestStatus), new k(ERROR_CODE_KEY, errorCode), new k(ERROR_MESSAGE_KEY, errorMessage), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))))));
    }

    public final void m137trackAmazonQueryProductDetailsRequestKLykuaI(long responseTime, boolean wasSuccessful, Set<String> requestedProductIds) {
        m.e(requestedProductIds, "requestedProductIds");
        trackEvent(DiagnosticsEntryName.AMAZON_QUERY_PRODUCT_DETAILS_REQUEST, C.N0(new k(SUCCESSFUL_KEY, Boolean.valueOf(wasSuccessful)), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))), new k(REQUESTED_PRODUCT_IDS_KEY, requestedProductIds)));
    }

    public final void m138trackAmazonQueryPurchasesRequestKLykuaI(long responseTime, boolean wasSuccessful, List<String> foundProductIds) {
        trackEvent(DiagnosticsEntryName.AMAZON_QUERY_PURCHASES_REQUEST, MapExtensionsKt.filterNotNullValues(C.N0(new k(SUCCESSFUL_KEY, Boolean.valueOf(wasSuccessful)), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))), new k(FOUND_PRODUCT_IDS_KEY, foundProductIds))));
    }

    public final void trackClearingDiagnosticsAfterFailedSync() {
        trackEvent(DiagnosticsEntryName.CLEARING_DIAGNOSTICS_AFTER_FAILED_SYNC, x.f23206h);
    }

    public final void trackCustomerInfoVerificationResultIfNeeded(CustomerInfo customerInfo) {
        m.e(customerInfo, "customerInfo");
        VerificationResult verification = customerInfo.getEntitlements().getVerification();
        if (verification == VerificationResult.NOT_REQUESTED) {
            return;
        }
        trackEvent(DiagnosticsEntryName.CUSTOMER_INFO_VERIFICATION_RESULT, D.J0(new k(VERIFICATION_RESULT_KEY, verification.name())));
    }

    public final void trackEnteredOfflineEntitlementsMode() {
        trackEvent(DiagnosticsEntryName.ENTERED_OFFLINE_ENTITLEMENTS_MODE, x.f23206h);
    }

    public final void trackErrorEnteringOfflineEntitlementsMode(PurchasesError error) {
        String str;
        m.e(error, "error");
        if (error.getCode() == PurchasesErrorCode.UnsupportedError && m.a(error.getUnderlyingErrorMessage(), OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES)) {
            str = "one_time_purchase_found";
        } else {
            str = (error.getCode() == PurchasesErrorCode.CustomerInfoError && m.a(error.getUnderlyingErrorMessage(), OfflineEntitlementsStrings.PRODUCT_ENTITLEMENT_MAPPING_REQUIRED)) ? "no_entitlement_mapping_available" : "unknown";
        }
        trackEvent(DiagnosticsEntryName.ERROR_ENTERING_OFFLINE_ENTITLEMENTS_MODE, C.N0(new k("offline_entitlement_error_reason", str), new k(ERROR_MESSAGE_KEY, error.getMessage() + " Underlying error: " + error.getUnderlyingErrorMessage())));
    }

    public final void trackEventInCurrentThread$purchases_defaultsRelease(DiagnosticsEntry diagnosticsEntry) {
        m.e(diagnosticsEntry, "diagnosticsEntry");
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v(M0.m(logLevel, new StringBuilder("[Purchases] - ")), "Tracking diagnostics entry: " + diagnosticsEntry);
        }
        try {
            this.diagnosticsFileHelper.appendEvent(diagnosticsEntry);
            DiagnosticsEventTrackerListener diagnosticsEventTrackerListener = this.listener;
            if (diagnosticsEventTrackerListener != null) {
                diagnosticsEventTrackerListener.onEventTracked();
            }
        } catch (IOException e6) {
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.v(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), "Error tracking diagnostics entry: " + e6);
            }
        }
    }

    public final void m139trackGetCustomerInfoResult17CK4j0(CacheFetchPolicy cacheFetchPolicy, VerificationResult verificationResult, Boolean hadUnsyncedPurchasesBefore, String errorMessage, Integer errorCode, long responseTime) {
        m.e(cacheFetchPolicy, "cacheFetchPolicy");
        trackEvent(DiagnosticsEntryName.GET_CUSTOMER_INFO_RESULT, MapExtensionsKt.filterNotNullValues(C.N0(new k(FETCH_POLICY_KEY, cacheFetchPolicy.name()), new k(VERIFICATION_RESULT_KEY, verificationResult != null ? verificationResult.name() : null), new k(HAD_UNSYNCED_PURCHASES_BEFORE_KEY, hadUnsyncedPurchasesBefore), new k(ERROR_MESSAGE_KEY, errorMessage), new k(ERROR_CODE_KEY, errorCode), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))))));
    }

    public final void trackGetCustomerInfoStarted() {
        trackEvent(DiagnosticsEntryName.GET_CUSTOMER_INFO_STARTED, x.f23206h);
    }

    public final void m140trackGetOfferingsResultB8UsjHI(Set<String> requestedProductIds, Set<String> notFoundProductIds, String errorMessage, Integer errorCode, String verificationResult, CacheStatus cacheStatus, long responseTime) {
        m.e(cacheStatus, "cacheStatus");
        trackEvent(DiagnosticsEntryName.GET_OFFERINGS_RESULT, MapExtensionsKt.filterNotNullValues(C.N0(new k(REQUESTED_PRODUCT_IDS_KEY, requestedProductIds), new k(NOT_FOUND_PRODUCT_IDS_KEY, notFoundProductIds), new k(ERROR_MESSAGE_KEY, errorMessage), new k(ERROR_CODE_KEY, errorCode), new k(VERIFICATION_RESULT_KEY, verificationResult), new k(CACHE_STATUS_KEY, cacheStatus.name()), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))))));
    }

    public final void trackGetOfferingsStarted() {
        trackEvent(DiagnosticsEntryName.GET_OFFERINGS_STARTED, x.f23206h);
    }

    public final void m141trackGetProductsResult9VgGkz4(Set<String> requestedProductIds, Set<String> notFoundProductIds, String errorMessage, Integer errorCode, long responseTime) {
        m.e(requestedProductIds, "requestedProductIds");
        m.e(notFoundProductIds, "notFoundProductIds");
        trackEvent(DiagnosticsEntryName.GET_PRODUCTS_RESULT, MapExtensionsKt.filterNotNullValues(C.N0(new k(REQUESTED_PRODUCT_IDS_KEY, requestedProductIds), new k(NOT_FOUND_PRODUCT_IDS_KEY, notFoundProductIds), new k(ERROR_MESSAGE_KEY, errorMessage), new k(ERROR_CODE_KEY, errorCode), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))))));
    }

    public final void trackGetProductsStarted(Set<String> requestedProductIds) {
        m.e(requestedProductIds, "requestedProductIds");
        trackEvent(DiagnosticsEntryName.GET_PRODUCTS_STARTED, D.J0(new k(REQUESTED_PRODUCT_IDS_KEY, requestedProductIds)));
    }

    public final void trackGoogleBillingServiceDisconnected() {
        trackEvent(DiagnosticsEntryName.GOOGLE_BILLING_SERVICE_DISCONNECTED, x.f23206h);
    }

    public final void trackGoogleBillingSetupFinished(int responseCode, String debugMessage, int pendingRequestCount) {
        m.e(debugMessage, "debugMessage");
        trackEvent(DiagnosticsEntryName.GOOGLE_BILLING_SETUP_FINISHED, C.N0(new k(BILLING_RESPONSE_CODE, Integer.valueOf(responseCode)), new k(BILLING_DEBUG_MESSAGE, debugMessage), new k(PENDING_REQUEST_COUNT, Integer.valueOf(pendingRequestCount))));
    }

    public final void trackGoogleBillingStartConnection() {
        trackEvent(DiagnosticsEntryName.GOOGLE_BILLING_START_CONNECTION, x.f23206h);
    }

    public final void trackGooglePurchaseStarted(String productId, String oldProductId, Boolean hasIntroTrial, Boolean hasIntroPrice) {
        m.e(productId, "productId");
        trackEvent(DiagnosticsEntryName.GOOGLE_PURCHASE_STARTED, MapExtensionsKt.filterNotNullValues(C.N0(new k(PRODUCT_ID_KEY, productId), new k(OLD_PRODUCT_ID_KEY, oldProductId), new k(HAS_INTRO_TRIAL_KEY, hasIntroTrial), new k(HAS_INTRO_PRICE_KEY, hasIntroPrice))));
    }

    public final void trackGooglePurchaseUpdateReceived(List<String> productIds, List<String> purchaseStatuses, int billingResponseCode, String billingDebugMessage) {
        m.e(billingDebugMessage, "billingDebugMessage");
        trackEvent(DiagnosticsEntryName.GOOGLE_PURCHASES_UPDATE_RECEIVED, MapExtensionsKt.filterNotNullValues(C.N0(new k(PRODUCT_IDS_KEY, productIds), new k(PURCHASE_STATUSES_KEY, purchaseStatuses), new k(BILLING_RESPONSE_CODE, Integer.valueOf(billingResponseCode)), new k(BILLING_DEBUG_MESSAGE, billingDebugMessage))));
    }

    public final void m142trackGoogleQueryProductDetailsRequest9VgGkz4(Set<String> requestedProductIds, String productType, int billingResponseCode, String billingDebugMessage, long responseTime) {
        m.e(requestedProductIds, "requestedProductIds");
        m.e(productType, "productType");
        m.e(billingDebugMessage, "billingDebugMessage");
        trackEvent(DiagnosticsEntryName.GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST, C.N0(new k(REQUESTED_PRODUCT_IDS_KEY, requestedProductIds), new k(PRODUCT_TYPE_QUERIED_KEY, productType), new k(BILLING_RESPONSE_CODE, Integer.valueOf(billingResponseCode)), new k(BILLING_DEBUG_MESSAGE, billingDebugMessage), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime)))));
    }

    public final void m143trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(String productType, int billingResponseCode, String billingDebugMessage, long responseTime) {
        m.e(productType, "productType");
        m.e(billingDebugMessage, "billingDebugMessage");
        trackEvent(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST, C.N0(new k(PRODUCT_TYPE_QUERIED_KEY, productType), new k(BILLING_RESPONSE_CODE, Integer.valueOf(billingResponseCode)), new k(BILLING_DEBUG_MESSAGE, billingDebugMessage), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime)))));
    }

    public final void m144trackGoogleQueryPurchasesRequestzkXUZaI(String productType, int billingResponseCode, String billingDebugMessage, long responseTime, List<String> foundProductIds) {
        m.e(productType, "productType");
        m.e(billingDebugMessage, "billingDebugMessage");
        m.e(foundProductIds, "foundProductIds");
        trackEvent(DiagnosticsEntryName.GOOGLE_QUERY_PURCHASES_REQUEST, C.N0(new k(PRODUCT_TYPE_QUERIED_KEY, productType), new k(BILLING_RESPONSE_CODE, Integer.valueOf(billingResponseCode)), new k(BILLING_DEBUG_MESSAGE, billingDebugMessage), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))), new k(FOUND_PRODUCT_IDS_KEY, foundProductIds)));
    }

    public final void m145trackHttpRequestPerformedXzGXFE(String host, Endpoint endpoint, long responseTime, boolean wasSuccessful, int responseCode, Integer backendErrorCode, HTTPResult.Origin resultOrigin, VerificationResult verificationResult, boolean isRetry, ConnectionErrorReason connectionErrorReason) {
        m.e(host, "host");
        m.e(endpoint, "endpoint");
        m.e(verificationResult, "verificationResult");
        trackEvent(DiagnosticsEntryName.HTTP_REQUEST_PERFORMED, MapExtensionsKt.filterNotNullValues(C.N0(new k(HOST_KEY, host), new k(ENDPOINT_NAME_KEY, endpoint.getName()), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))), new k(SUCCESSFUL_KEY, Boolean.valueOf(wasSuccessful)), new k(RESPONSE_CODE_KEY, Integer.valueOf(responseCode)), new k(BACKEND_ERROR_CODE_KEY, backendErrorCode), new k(ETAG_HIT_KEY, Boolean.valueOf(resultOrigin == HTTPResult.Origin.CACHE)), new k(VERIFICATION_RESULT_KEY, verificationResult.name()), new k(IS_RETRY, Boolean.valueOf(isRetry)), new k(CONNECTION_ERROR_REASON_KEY, connectionErrorReason != null ? connectionErrorReason.name() : null))));
    }

    public final void trackMaxDiagnosticsSyncRetriesReached() {
        trackEvent(DiagnosticsEntryName.MAX_DIAGNOSTICS_SYNC_RETRIES_REACHED, x.f23206h);
    }

    public final void trackMaxEventsStoredLimitReached(boolean useCurrentThread) {
        DiagnosticsEntry diagnosticsEntry = new DiagnosticsEntry(null, DiagnosticsEntryName.MAX_EVENTS_STORED_LIMIT_REACHED, this.commonProperties, this.appSessionID, null, null, 49, null);
        if (useCurrentThread) {
            trackEventInCurrentThread$purchases_defaultsRelease(diagnosticsEntry);
        } else {
            trackEvent(diagnosticsEntry);
        }
    }

    public final void trackProductDetailsNotSupported(int billingResponseCode, String billingDebugMessage) {
        m.e(billingDebugMessage, "billingDebugMessage");
        DiagnosticsEntryName diagnosticsEntryName = DiagnosticsEntryName.PRODUCT_DETAILS_NOT_SUPPORTED;
        String playStoreVersionName = this.appConfig.getPlayStoreVersionName();
        if (playStoreVersionName == null) {
            playStoreVersionName = "";
        }
        k kVar = new k("play_store_version", playStoreVersionName);
        String playServicesVersionName = this.appConfig.getPlayServicesVersionName();
        trackEvent(diagnosticsEntryName, C.N0(kVar, new k("play_services_version", playServicesVersionName != null ? playServicesVersionName : ""), new k(BILLING_RESPONSE_CODE, Integer.valueOf(billingResponseCode)), new k(BILLING_DEBUG_MESSAGE, billingDebugMessage)));
    }

    public final void m146trackPurchaseResultmyKFqkg(String productId, ProductType productType, Integer errorCode, String errorMessage, long responseTime, VerificationResult verificationResult) {
        m.e(productId, "productId");
        m.e(productType, "productType");
        trackEvent(DiagnosticsEntryName.PURCHASE_RESULT, MapExtensionsKt.filterNotNullValues(C.N0(new k(PRODUCT_ID_KEY, productId), new k(PRODUCT_TYPE_KEY, DiagnosticsTrackerKt.getDiagnosticsName(productType)), new k(ERROR_CODE_KEY, errorCode), new k(ERROR_MESSAGE_KEY, errorMessage), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))), new k(VERIFICATION_RESULT_KEY, verificationResult != null ? verificationResult.name() : null))));
    }

    public final void trackPurchaseStarted(String productId, ProductType productType) {
        m.e(productId, "productId");
        m.e(productType, "productType");
        trackEvent(DiagnosticsEntryName.PURCHASE_STARTED, C.N0(new k(PRODUCT_ID_KEY, productId), new k(PRODUCT_TYPE_KEY, DiagnosticsTrackerKt.getDiagnosticsName(productType))));
    }

    public final void m147trackRestorePurchasesResultSxA4cEA(Integer errorCode, String errorMessage, long responseTime) {
        trackEvent(DiagnosticsEntryName.RESTORE_PURCHASES_RESULT, MapExtensionsKt.filterNotNullValues(C.N0(new k(ERROR_CODE_KEY, errorCode), new k(ERROR_MESSAGE_KEY, errorMessage), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))))));
    }

    public final void trackRestorePurchasesStarted() {
        trackEvent(DiagnosticsEntryName.RESTORE_PURCHASES_STARTED, x.f23206h);
    }

    public final void m148trackSyncPurchasesResultSxA4cEA(Integer errorCode, String errorMessage, long responseTime) {
        trackEvent(DiagnosticsEntryName.SYNC_PURCHASES_RESULT, MapExtensionsKt.filterNotNullValues(C.N0(new k(ERROR_CODE_KEY, errorCode), new k(ERROR_MESSAGE_KEY, errorMessage), new k(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.d(responseTime))))));
    }

    public final void trackSyncPurchasesStarted() {
        trackEvent(DiagnosticsEntryName.SYNC_PURCHASES_STARTED, x.f23206h);
    }

    public final void trackEvent(DiagnosticsEntry diagnosticsEntry) {
        m.e(diagnosticsEntry, "diagnosticsEntry");
        checkAndClearDiagnosticsFileIfTooBig(new C20391(diagnosticsEntry));
    }

    public DiagnosticsTracker(AppConfig appConfig, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsHelper diagnosticsHelper, Dispatcher dispatcher, UUID uuid, int i3, AbstractC2541f abstractC2541f) {
        this(appConfig, diagnosticsFileHelper, diagnosticsHelper, dispatcher, (i3 & 16) != 0 ? EventsManager.INSTANCE.getAppSessionID$purchases_defaultsRelease() : uuid);
    }
}
