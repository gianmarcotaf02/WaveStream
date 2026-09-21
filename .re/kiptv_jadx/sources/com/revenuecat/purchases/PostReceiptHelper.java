package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001:\u0001lBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jg\u0010\"\u001a\u00020\u001f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00192\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\"\u0010#Jy\u00104\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0\u001e2$\u0010 \u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001f00j\u0002`3H\u0002¢\u0006\u0004\b4\u00105J+\u00107\u001a\u000206*\u00020\u00122\u0006\u0010&\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b7\u00108J\u0095\u0001\u0010@\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020'2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u001f0\u001e2$\u0010 \u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001f00j\u0002`3H\u0002¢\u0006\u0004\b@\u0010AJA\u0010D\u001a\u00020\u001f2\u0006\u0010B\u001a\u0002012\u0006\u0010%\u001a\u00020$2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0CH\u0002¢\u0006\u0004\bD\u0010EJ?\u0010F\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\bF\u0010GJi\u0010I\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010,\u001a\u00020+2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010'¢\u0006\u0004\bI\u0010JJ\u009f\u0001\u0010V\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020K2\b\u0010N\u001a\u0004\u0018\u00010M2\u0014\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020P\u0018\u00010O2\u0006\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010R\u001a\u00020'2\"\b\u0002\u0010!\u001a\u001c\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f\u0018\u00010Sj\u0004\u0018\u0001`T2\"\b\u0002\u0010 \u001a\u001c\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f\u0018\u00010Sj\u0004\u0018\u0001`U¢\u0006\u0004\bV\u0010WJa\u0010\\\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0006\u0010X\u001a\u00020'2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020$0Y2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001f0C2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001f0\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b\\\u0010]R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010^R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010_R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010`R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010dR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010fR\u0014\u0010i\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010>\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006m"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptHelper;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "paywallPresentedCache", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;", "localTransactionMetadataStore", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;)V", "", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "transactionMetadataToSync", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "results", "Lkotlin/Function1;", "Lh6/A;", "onError", "onSuccess", "callTransactionMetadataCompletionFromResults", "(Ljava/util/List;Ljava/util/concurrent/ConcurrentLinkedQueue;Lx6/j;Lx6/j;)V", "", "appUserID", "purchaseToken", "", "isRestore", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lcom/revenuecat/purchases/models/PurchaseState;", "purchaseState", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "postReceiptAndSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/revenuecat/purchases/models/PurchaseState;Lx6/j;Lx6/n;)V", "Lcom/revenuecat/purchases/PostReceiptHelper$CachedDataToPost;", "getOrPutDataToPost", "(Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/PostReceiptInitiationSource;)Lcom/revenuecat/purchases/PostReceiptHelper$CachedDataToPost;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "paywallData", "Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;", "workflowMetadata", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "hasCachedTransactionMetadata", "performPostReceipt", "(Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;ZLx6/j;Lx6/n;)V", "errorHandlingBehavior", "Lkotlin/Function0;", "useOfflineEntitlementsCustomerInfoIfNeeded", "(Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Ljava/lang/String;Lx6/j;Lkotlin/jvm/functions/Function0;)V", "calculateOfflineCustomerInfo", "(Ljava/lang/String;Lx6/j;Lx6/j;)V", "isAutoRenewing", "postTokenWithoutConsuming", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lx6/j;Lx6/j;Ljava/lang/Boolean;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchase", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOptionForProductIDs", "sdkOriginated", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "postTransactionAndConsumeIfNeeded", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/util/Map;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;ZLx6/m;Lx6/m;)V", "allowSharingPlayStoreAccount", "", "pendingTransactionsTokens", "onNoTransactionsToSync", "postRemainingCachedTransactionMetadata", "(Ljava/lang/String;ZLjava/util/Set;Lkotlin/jvm/functions/Function0;Lx6/j;Lx6/j;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadataStore;", "getFinishTransactions", "()Z", "finishTransactions", "getPurchasesAreCompletedBy", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "CachedDataToPost", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostReceiptHelper {
    private final com.revenuecat.purchases.common.AppConfig appConfig;
    private final com.revenuecat.purchases.common.Backend backend;
    private final com.revenuecat.purchases.common.BillingAbstract billing;
    private final com.revenuecat.purchases.CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final com.revenuecat.purchases.common.caching.DeviceCache deviceCache;
    private final com.revenuecat.purchases.common.caching.LocalTransactionMetadataStore localTransactionMetadataStore;
    private final com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager offlineEntitlementsManager;
    private final com.revenuecat.purchases.paywalls.PaywallPresentedCache paywallPresentedCache;
    private final com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager subscriberAttributesManager;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptHelper$CachedDataToPost;", "", "localTransactionMetadata", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "paywallEvent", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "didCacheData", "", "(Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;Z)V", "getDidCacheData", "()Z", "getLocalTransactionMetadata", "()Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "getPaywallEvent", "()Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "component1", "component2", "component3", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class CachedDataToPost {
        private final boolean didCacheData;
        private final com.revenuecat.purchases.common.caching.LocalTransactionMetadata localTransactionMetadata;
        private final com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent;

        public CachedDataToPost(com.revenuecat.purchases.common.caching.LocalTransactionMetadata localTransactionMetadata, com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent, boolean z6) {
            this.localTransactionMetadata = localTransactionMetadata;
            this.paywallEvent = paywallEvent;
            this.didCacheData = z6;
        }

        public static /* synthetic */ com.revenuecat.purchases.PostReceiptHelper.CachedDataToPost copy$default(com.revenuecat.purchases.PostReceiptHelper.CachedDataToPost cachedDataToPost, com.revenuecat.purchases.common.caching.LocalTransactionMetadata localTransactionMetadata, com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent, boolean z6, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                localTransactionMetadata = cachedDataToPost.localTransactionMetadata;
            }
            if ((i3 & 2) != 0) {
                paywallEvent = cachedDataToPost.paywallEvent;
            }
            if ((i3 & 4) != 0) {
                z6 = cachedDataToPost.didCacheData;
            }
            return cachedDataToPost.copy(localTransactionMetadata, paywallEvent, z6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.revenuecat.purchases.common.caching.LocalTransactionMetadata getLocalTransactionMetadata() {
            return this.localTransactionMetadata;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final com.revenuecat.purchases.paywalls.events.PaywallEvent getPaywallEvent() {
            return this.paywallEvent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getDidCacheData() {
            return this.didCacheData;
        }

        public final com.revenuecat.purchases.PostReceiptHelper.CachedDataToPost copy(com.revenuecat.purchases.common.caching.LocalTransactionMetadata localTransactionMetadata, com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent, boolean didCacheData) {
            return new com.revenuecat.purchases.PostReceiptHelper.CachedDataToPost(localTransactionMetadata, paywallEvent, didCacheData);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.PostReceiptHelper.CachedDataToPost)) {
                return false;
            }
            com.revenuecat.purchases.PostReceiptHelper.CachedDataToPost cachedDataToPost = (com.revenuecat.purchases.PostReceiptHelper.CachedDataToPost) other;
            return kotlin.jvm.internal.m.a(this.localTransactionMetadata, cachedDataToPost.localTransactionMetadata) && kotlin.jvm.internal.m.a(this.paywallEvent, cachedDataToPost.paywallEvent) && this.didCacheData == cachedDataToPost.didCacheData;
        }

        public final boolean getDidCacheData() {
            return this.didCacheData;
        }

        public final com.revenuecat.purchases.common.caching.LocalTransactionMetadata getLocalTransactionMetadata() {
            return this.localTransactionMetadata;
        }

        public final com.revenuecat.purchases.paywalls.events.PaywallEvent getPaywallEvent() {
            return this.paywallEvent;
        }

        public int hashCode() {
            com.revenuecat.purchases.common.caching.LocalTransactionMetadata localTransactionMetadata = this.localTransactionMetadata;
            int iHashCode = (localTransactionMetadata == null ? 0 : localTransactionMetadata.hashCode()) * 31;
            com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent = this.paywallEvent;
            return java.lang.Boolean.hashCode(this.didCacheData) + ((iHashCode + (paywallEvent != null ? paywallEvent.hashCode() : 0)) * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CachedDataToPost(localTransactionMetadata=");
            sb.append(this.localTransactionMetadata);
            sb.append(", paywallEvent=");
            sb.append(this.paywallEvent);
            sb.append(", didCacheData=");
            return v5.L.a(sb, this.didCacheData, ')');
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.j $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p194x6.j jVar) {
            super(1);
            this.$onSuccess = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.CustomerInfo) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.CustomerInfo customerInfo) {
            kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
            com.revenuecat.purchases.PostReceiptHelper.this.customerInfoUpdateHandler.notifyListeners(customerInfo);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.j $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(p194x6.j jVar) {
            super(1);
            this.$onError = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.PurchasesError) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError error) {
            kotlin.jvm.internal.m.e(error, "error");
            this.$onError.invoke(error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$performPostReceipt$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "unsyncedSubscriberAttributesByKey", "Lh6/A;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C19831 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ java.lang.String $appUserID;
        final /* synthetic */ boolean $hasCachedTransactionMetadata;
        final /* synthetic */ com.revenuecat.purchases.PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ p194x6.n $onError;
        final /* synthetic */ p194x6.j $onSuccess;
        final /* synthetic */ com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData $paywallData;
        final /* synthetic */ java.lang.String $purchaseToken;
        final /* synthetic */ com.revenuecat.purchases.PurchasesAreCompletedBy $purchasesAreCompletedBy;
        final /* synthetic */ com.revenuecat.purchases.common.ReceiptInfo $receiptInfo;
        final /* synthetic */ com.revenuecat.purchases.common.caching.WorkflowMetadata $workflowMetadata;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$performPostReceipt$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00041 extends kotlin.jvm.internal.o implements p194x6.j {
            final /* synthetic */ java.lang.String $appUserID;
            final /* synthetic */ boolean $hasCachedTransactionMetadata;
            final /* synthetic */ p194x6.j $onSuccess;
            final /* synthetic */ java.lang.String $purchaseToken;
            final /* synthetic */ java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ com.revenuecat.purchases.PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00041(boolean z6, com.revenuecat.purchases.PostReceiptHelper postReceiptHelper, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> map, p194x6.j jVar) {
                super(1);
                this.$hasCachedTransactionMetadata = z6;
                this.this$0 = postReceiptHelper;
                this.$purchaseToken = str;
                this.$appUserID = str2;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onSuccess = jVar;
            }

            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.revenuecat.purchases.common.networking.PostReceiptResponse) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(com.revenuecat.purchases.common.networking.PostReceiptResponse postReceiptResponse) {
                kotlin.jvm.internal.m.e(postReceiptResponse, "postReceiptResponse");
                if (this.$hasCachedTransactionMetadata) {
                    this.this$0.localTransactionMetadataStore.clearLocalTransactionMetadata(com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(this.$purchaseToken));
                }
                this.this$0.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, com.revenuecat.purchases.subscriberattributes.BackendHelpersKt.getAttributeErrors(postReceiptResponse.getBody()));
                this.this$0.customerInfoUpdateHandler.cacheAndNotifyListeners(postReceiptResponse.getCustomerInfo());
                this.$onSuccess.invoke(postReceiptResponse);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$performPostReceipt$1$2, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "responseBody", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.n {
            final /* synthetic */ java.lang.String $appUserID;
            final /* synthetic */ boolean $hasCachedTransactionMetadata;
            final /* synthetic */ p194x6.n $onError;
            final /* synthetic */ java.lang.String $purchaseToken;
            final /* synthetic */ java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ com.revenuecat.purchases.PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(boolean z6, com.revenuecat.purchases.PostReceiptHelper postReceiptHelper, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> map, p194x6.n nVar) {
                super(3);
                this.$hasCachedTransactionMetadata = z6;
                this.this$0 = postReceiptHelper;
                this.$purchaseToken = str;
                this.$appUserID = str2;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onError = nVar;
            }

            @Override // p194x6.n
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                invoke((com.revenuecat.purchases.PurchasesError) obj, (com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior) obj2, (org.json.JSONObject) obj3);
                return p070h6.A.f22523a;
            }

            public final void invoke(com.revenuecat.purchases.PurchasesError error, com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior errorHandlingBehavior, org.json.JSONObject jSONObject) {
                kotlin.jvm.internal.m.e(error, "error");
                kotlin.jvm.internal.m.e(errorHandlingBehavior, "errorHandlingBehavior");
                if (errorHandlingBehavior == com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                    if (this.$hasCachedTransactionMetadata) {
                        this.this$0.localTransactionMetadataStore.clearLocalTransactionMetadata(com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(this.$purchaseToken));
                    }
                    this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, com.revenuecat.purchases.subscriberattributes.BackendHelpersKt.getAttributeErrors(jSONObject));
                }
                this.$onError.invoke(error, errorHandlingBehavior, jSONObject);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19831(java.lang.String str, java.lang.String str2, boolean z6, com.revenuecat.purchases.common.ReceiptInfo receiptInfo, com.revenuecat.purchases.PostReceiptInitiationSource postReceiptInitiationSource, com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData, com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadata, com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z9, p194x6.j jVar, p194x6.n nVar) {
            super(1);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$isRestore = z6;
            this.$receiptInfo = receiptInfo;
            this.$initiationSource = postReceiptInitiationSource;
            this.$paywallData = paywallPostReceiptData;
            this.$workflowMetadata = workflowMetadata;
            this.$purchasesAreCompletedBy = purchasesAreCompletedBy;
            this.$hasCachedTransactionMetadata = z9;
            this.$onSuccess = jVar;
            this.$onError = nVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute>) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(java.util.Map<java.lang.String, com.revenuecat.purchases.subscriberattributes.SubscriberAttribute> unsyncedSubscriberAttributesByKey) {
            kotlin.jvm.internal.m.e(unsyncedSubscriberAttributesByKey, "unsyncedSubscriberAttributesByKey");
            com.revenuecat.purchases.PostReceiptHelper.this.backend.postReceiptData(this.$purchaseToken, this.$appUserID, this.$isRestore, com.revenuecat.purchases.PostReceiptHelper.this.getFinishTransactions(), com.revenuecat.purchases.subscriberattributes.BackendHelpersKt.toBackendMap(unsyncedSubscriberAttributesByKey), this.$receiptInfo, this.$initiationSource, this.$paywallData, this.$workflowMetadata, this.$purchasesAreCompletedBy, new com.revenuecat.purchases.PostReceiptHelper.C19831.C00041(this.$hasCachedTransactionMetadata, com.revenuecat.purchases.PostReceiptHelper.this, this.$purchaseToken, this.$appUserID, unsyncedSubscriberAttributesByKey, this.$onSuccess), new com.revenuecat.purchases.PostReceiptHelper.C19831.AnonymousClass2(this.$hasCachedTransactionMetadata, com.revenuecat.purchases.PostReceiptHelper.this, this.$purchaseToken, this.$appUserID, unsyncedSubscriberAttributesByKey, this.$onError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C19841 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ java.lang.Boolean $isAutoRenewing;
        final /* synthetic */ p194x6.j $onSuccess;
        final /* synthetic */ java.lang.String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19841(java.lang.String str, java.lang.Boolean bool, p194x6.j jVar) {
            super(1);
            this.$purchaseToken = str;
            this.$isAutoRenewing = bool;
            this.$onSuccess = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.common.networking.PostReceiptResponse) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.common.networking.PostReceiptResponse postReceiptResponse) {
            kotlin.jvm.internal.m.e(postReceiptResponse, "postReceiptResponse");
            com.revenuecat.purchases.PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken, this.$isAutoRenewing);
            this.$onSuccess.invoke(postReceiptResponse.getCustomerInfo());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C19852 extends kotlin.jvm.internal.o implements p194x6.n {
        final /* synthetic */ java.lang.String $appUserID;
        final /* synthetic */ java.lang.Boolean $isAutoRenewing;
        final /* synthetic */ p194x6.j $onError;
        final /* synthetic */ p194x6.j $onSuccess;
        final /* synthetic */ java.lang.String $purchaseToken;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$1, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
            final /* synthetic */ p194x6.j $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(p194x6.j jVar) {
                super(1);
                this.$onSuccess = jVar;
            }

            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.revenuecat.purchases.CustomerInfo) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(com.revenuecat.purchases.CustomerInfo it) {
                kotlin.jvm.internal.m.e(it, "it");
                this.$onSuccess.invoke(it);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$2, reason: invalid class name and collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00052 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            final /* synthetic */ com.revenuecat.purchases.PurchasesError $backendError;
            final /* synthetic */ p194x6.j $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00052(p194x6.j jVar, com.revenuecat.purchases.PurchasesError purchasesError) {
                super(0);
                this.$onError = jVar;
                this.$backendError = purchasesError;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m51invoke();
                return p070h6.A.f22523a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m51invoke() {
                this.$onError.invoke(this.$backendError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19852(java.lang.String str, java.lang.Boolean bool, java.lang.String str2, p194x6.j jVar, p194x6.j jVar2) {
            super(3);
            this.$purchaseToken = str;
            this.$isAutoRenewing = bool;
            this.$appUserID = str2;
            this.$onSuccess = jVar;
            this.$onError = jVar2;
        }

        @Override // p194x6.n
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            invoke((com.revenuecat.purchases.PurchasesError) obj, (com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior) obj2, (org.json.JSONObject) obj3);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError backendError, com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior errorHandlingBehavior, org.json.JSONObject jSONObject) {
            kotlin.jvm.internal.m.e(backendError, "backendError");
            kotlin.jvm.internal.m.e(errorHandlingBehavior, "errorHandlingBehavior");
            if (errorHandlingBehavior == com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                com.revenuecat.purchases.PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken, this.$isAutoRenewing);
            }
            com.revenuecat.purchases.PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(errorHandlingBehavior, this.$appUserID, new com.revenuecat.purchases.PostReceiptHelper.C19852.AnonymousClass1(this.$onSuccess), new com.revenuecat.purchases.PostReceiptHelper.C19852.C00052(this.$onError, backendError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C19861 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ com.revenuecat.purchases.PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ p194x6.m $onSuccess;
        final /* synthetic */ com.revenuecat.purchases.models.StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19861(com.revenuecat.purchases.models.StoreTransaction storeTransaction, com.revenuecat.purchases.PostReceiptInitiationSource postReceiptInitiationSource, p194x6.m mVar) {
            super(1);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$onSuccess = mVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.common.networking.PostReceiptResponse) obj);
            return p070h6.A.f22523a;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005d  */
        public final void invoke(com.revenuecat.purchases.common.networking.PostReceiptResponse postReceiptResponse) {
            boolean zBooleanValue;
            com.revenuecat.purchases.common.networking.PostReceiptProductInfo postReceiptProductInfo;
            java.lang.Boolean shouldConsume;
            kotlin.jvm.internal.m.e(postReceiptResponse, "postReceiptResponse");
            java.util.Map<java.lang.String, com.revenuecat.purchases.common.networking.PostReceiptProductInfo> productInfoByProductId = postReceiptResponse.getProductInfoByProductId();
            if (productInfoByProductId != null) {
                com.revenuecat.purchases.models.StoreTransaction storeTransaction = this.$purchase;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.common.networking.PostReceiptProductInfo> entry : productInfoByProductId.entrySet()) {
                    if (storeTransaction.getProductIds().contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.Collection collectionValues = linkedHashMap.values();
                if (collectionValues == null || (postReceiptProductInfo = (com.revenuecat.purchases.common.networking.PostReceiptProductInfo) p078i6.o.i1(collectionValues)) == null || (shouldConsume = postReceiptProductInfo.getShouldConsume()) == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = shouldConsume.booleanValue();
                }
            } else {
                zBooleanValue = false;
            }
            com.revenuecat.purchases.PostReceiptHelper.this.billing.consumeAndSave(com.revenuecat.purchases.PostReceiptHelper.this.getFinishTransactions(), this.$purchase, zBooleanValue, this.$initiationSource);
            p194x6.m mVar = this.$onSuccess;
            if (mVar != null) {
                mVar.invoke(this.$purchase, postReceiptResponse.getCustomerInfo());
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C19872 extends kotlin.jvm.internal.o implements p194x6.n {
        final /* synthetic */ java.lang.String $appUserID;
        final /* synthetic */ com.revenuecat.purchases.PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ p194x6.m $onError;
        final /* synthetic */ p194x6.m $onSuccess;
        final /* synthetic */ com.revenuecat.purchases.models.StoreTransaction $purchase;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$1, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
            final /* synthetic */ p194x6.m $onSuccess;
            final /* synthetic */ com.revenuecat.purchases.models.StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(p194x6.m mVar, com.revenuecat.purchases.models.StoreTransaction storeTransaction) {
                super(1);
                this.$onSuccess = mVar;
                this.$purchase = storeTransaction;
            }

            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.revenuecat.purchases.CustomerInfo) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(com.revenuecat.purchases.CustomerInfo customerInfo) {
                kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
                p194x6.m mVar = this.$onSuccess;
                if (mVar != null) {
                    mVar.invoke(this.$purchase, customerInfo);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$2, reason: invalid class name and collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00062 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            final /* synthetic */ com.revenuecat.purchases.PurchasesError $backendError;
            final /* synthetic */ p194x6.m $onError;
            final /* synthetic */ com.revenuecat.purchases.models.StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00062(p194x6.m mVar, com.revenuecat.purchases.models.StoreTransaction storeTransaction, com.revenuecat.purchases.PurchasesError purchasesError) {
                super(0);
                this.$onError = mVar;
                this.$purchase = storeTransaction;
                this.$backendError = purchasesError;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m52invoke();
                return p070h6.A.f22523a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m52invoke() {
                p194x6.m mVar = this.$onError;
                if (mVar != null) {
                    mVar.invoke(this.$purchase, this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19872(com.revenuecat.purchases.models.StoreTransaction storeTransaction, com.revenuecat.purchases.PostReceiptInitiationSource postReceiptInitiationSource, java.lang.String str, p194x6.m mVar, p194x6.m mVar2) {
            super(3);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$appUserID = str;
            this.$onSuccess = mVar;
            this.$onError = mVar2;
        }

        @Override // p194x6.n
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            invoke((com.revenuecat.purchases.PurchasesError) obj, (com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior) obj2, (org.json.JSONObject) obj3);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError backendError, com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior errorHandlingBehavior, org.json.JSONObject jSONObject) {
            kotlin.jvm.internal.m.e(backendError, "backendError");
            kotlin.jvm.internal.m.e(errorHandlingBehavior, "errorHandlingBehavior");
            if (errorHandlingBehavior == com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                com.revenuecat.purchases.PostReceiptHelper.this.billing.consumeAndSave(com.revenuecat.purchases.PostReceiptHelper.this.getFinishTransactions(), this.$purchase, false, this.$initiationSource);
            }
            com.revenuecat.purchases.PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(errorHandlingBehavior, this.$appUserID, new com.revenuecat.purchases.PostReceiptHelper.C19872.AnonymousClass1(this.$onSuccess, this.$purchase), new com.revenuecat.purchases.PostReceiptHelper.C19872.C00062(this.$onError, this.$purchase, backendError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$useOfflineEntitlementsCustomerInfoIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C19881 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ kotlin.jvm.functions.Function0 $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19881(kotlin.jvm.functions.Function0 function0) {
            super(1);
            this.$onError = function0;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.PurchasesError) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError it) {
            kotlin.jvm.internal.m.e(it, "it");
            this.$onError.invoke();
        }
    }

    public PostReceiptHelper(com.revenuecat.purchases.common.AppConfig appConfig, com.revenuecat.purchases.common.Backend backend, com.revenuecat.purchases.common.BillingAbstract billing, com.revenuecat.purchases.CustomerInfoUpdateHandler customerInfoUpdateHandler, com.revenuecat.purchases.common.caching.DeviceCache deviceCache, com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager subscriberAttributesManager, com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager offlineEntitlementsManager, com.revenuecat.purchases.paywalls.PaywallPresentedCache paywallPresentedCache, com.revenuecat.purchases.common.caching.LocalTransactionMetadataStore localTransactionMetadataStore) {
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        kotlin.jvm.internal.m.e(backend, "backend");
        kotlin.jvm.internal.m.e(billing, "billing");
        kotlin.jvm.internal.m.e(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        kotlin.jvm.internal.m.e(deviceCache, "deviceCache");
        kotlin.jvm.internal.m.e(subscriberAttributesManager, "subscriberAttributesManager");
        kotlin.jvm.internal.m.e(offlineEntitlementsManager, "offlineEntitlementsManager");
        kotlin.jvm.internal.m.e(paywallPresentedCache, "paywallPresentedCache");
        kotlin.jvm.internal.m.e(localTransactionMetadataStore, "localTransactionMetadataStore");
        this.appConfig = appConfig;
        this.backend = backend;
        this.billing = billing;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.deviceCache = deviceCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.paywallPresentedCache = paywallPresentedCache;
        this.localTransactionMetadataStore = localTransactionMetadataStore;
    }

    private final void calculateOfflineCustomerInfo(java.lang.String appUserID, p194x6.j onSuccess, p194x6.j onError) {
        this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(appUserID, new com.revenuecat.purchases.PostReceiptHelper.AnonymousClass1(onSuccess), new com.revenuecat.purchases.PostReceiptHelper.AnonymousClass2(onError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callTransactionMetadataCompletionFromResults(java.util.List<com.revenuecat.purchases.common.caching.LocalTransactionMetadata> transactionMetadataToSync, java.util.concurrent.ConcurrentLinkedQueue<com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError>> results, p194x6.j onError, p194x6.j onSuccess) {
        if (transactionMetadataToSync.size() == results.size()) {
            int i3 = 0;
            for (java.lang.Object obj : results) {
                int i9 = i3 + 1;
                if (i3 < 0) {
                    p078i6.p.H0();
                    throw null;
                }
                com.revenuecat.purchases.utils.Result result = (com.revenuecat.purchases.utils.Result) obj;
                if (result instanceof com.revenuecat.purchases.utils.Result.Error) {
                    if (onError != null) {
                        onError.invoke(((com.revenuecat.purchases.utils.Result.Error) result).getValue());
                        return;
                    }
                    return;
                } else {
                    if (i3 == results.size() - 1 && onSuccess != null) {
                        kotlin.jvm.internal.m.c(result, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        onSuccess.invoke(((com.revenuecat.purchases.utils.Result.Success) result).getValue());
                    }
                    i3 = i9;
                }
            }
        }
    }

    public static /* synthetic */ void callTransactionMetadataCompletionFromResults$default(com.revenuecat.purchases.PostReceiptHelper postReceiptHelper, java.util.List list, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, p194x6.j jVar, p194x6.j jVar2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            jVar = null;
        }
        if ((i3 & 8) != 0) {
            jVar2 = null;
        }
        postReceiptHelper.callTransactionMetadataCompletionFromResults(list, concurrentLinkedQueue, jVar, jVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    private final synchronized com.revenuecat.purchases.PostReceiptHelper.CachedDataToPost getOrPutDataToPost(com.revenuecat.purchases.common.caching.LocalTransactionMetadataStore localTransactionMetadataStore, java.lang.String str, com.revenuecat.purchases.common.ReceiptInfo receiptInfo, com.revenuecat.purchases.PostReceiptInitiationSource postReceiptInitiationSource) {
        com.revenuecat.purchases.common.caching.LocalTransactionMetadata localTransactionMetadata;
        boolean z6;
        com.revenuecat.purchases.paywalls.events.PaywallEvent andRemovePurchaseInitiatedEventIfNeeded;
        com.revenuecat.purchases.paywalls.events.PaywallEvent.Data data;
        com.revenuecat.purchases.paywalls.events.PaywallEvent.Data data2;
        try {
            localTransactionMetadata = localTransactionMetadataStore.getLocalTransactionMetadata(str);
            z6 = localTransactionMetadata == null && postReceiptInitiationSource == com.revenuecat.purchases.PostReceiptInitiationSource.PURCHASE;
            com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadataFrom = null;
            andRemovePurchaseInitiatedEventIfNeeded = localTransactionMetadata == null ? this.paywallPresentedCache.getAndRemovePurchaseInitiatedEventIfNeeded(receiptInfo.getProductIDs(), receiptInfo.getPurchaseTime()) : null;
            if (z6) {
                com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext = (andRemovePurchaseInitiatedEventIfNeeded == null || (data2 = andRemovePurchaseInitiatedEventIfNeeded.getData()) == null) ? null : data2.getPresentedOfferingContext();
                com.revenuecat.purchases.common.ReceiptInfo receiptInfoCopy$default = (receiptInfo.getPresentedOfferingContext() != null || presentedOfferingContext == null) ? receiptInfo : com.revenuecat.purchases.common.ReceiptInfo.copy$default(receiptInfo, null, null, presentedOfferingContext, null, null, null, null, null, null, null, false, null, null, 8187, null);
                com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData$purchases_defaultsRelease = andRemovePurchaseInitiatedEventIfNeeded != null ? andRemovePurchaseInitiatedEventIfNeeded.toPaywallPostReceiptData$purchases_defaultsRelease() : null;
                com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy = getPurchasesAreCompletedBy();
                if (andRemovePurchaseInitiatedEventIfNeeded != null && (data = andRemovePurchaseInitiatedEventIfNeeded.getData()) != null) {
                    workflowMetadataFrom = com.revenuecat.purchases.common.caching.WorkflowMetadata.INSTANCE.from(data.getWorkflowId(), data.getStepId());
                }
                localTransactionMetadataStore.cacheLocalTransactionMetadata(str, new com.revenuecat.purchases.common.caching.LocalTransactionMetadata(str, receiptInfoCopy$default, paywallPostReceiptData$purchases_defaultsRelease, purchasesAreCompletedBy, workflowMetadataFrom));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return new com.revenuecat.purchases.PostReceiptHelper.CachedDataToPost(localTransactionMetadata, andRemovePurchaseInitiatedEventIfNeeded, z6);
    }

    private final com.revenuecat.purchases.PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.appConfig.getPurchasesAreCompletedBy();
    }

    private final void performPostReceipt(java.lang.String appUserID, java.lang.String purchaseToken, boolean isRestore, com.revenuecat.purchases.common.ReceiptInfo receiptInfo, com.revenuecat.purchases.PostReceiptInitiationSource initiationSource, com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallData, com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadata, com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy, boolean hasCachedTransactionMetadata, p194x6.j onSuccess, p194x6.n onError) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(appUserID, new com.revenuecat.purchases.PostReceiptHelper.C19831(purchaseToken, appUserID, isRestore, receiptInfo, initiationSource, paywallData, workflowMetadata, purchasesAreCompletedBy, hasCachedTransactionMetadata, onSuccess, onError));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void postReceiptAndSubscriberAttributes(java.lang.String appUserID, java.lang.String purchaseToken, boolean isRestore, com.revenuecat.purchases.common.ReceiptInfo receiptInfo, com.revenuecat.purchases.PostReceiptInitiationSource initiationSource, com.revenuecat.purchases.models.PurchaseState purchaseState, p194x6.j onSuccess, p194x6.n onError) {
        com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData$purchases_defaultsRelease;
        com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadataFrom;
        com.revenuecat.purchases.paywalls.events.PaywallEvent.Data data;
        com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy;
        com.revenuecat.purchases.common.ReceiptInfo receiptInfo2;
        com.revenuecat.purchases.common.ReceiptInfo receiptInfo3 = receiptInfo;
        com.revenuecat.purchases.PostReceiptHelper.CachedDataToPost orPutDataToPost = getOrPutDataToPost(this.localTransactionMetadataStore, purchaseToken, receiptInfo3, initiationSource);
        com.revenuecat.purchases.common.caching.LocalTransactionMetadata localTransactionMetadata = orPutDataToPost.getLocalTransactionMetadata();
        com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent = orPutDataToPost.getPaywallEvent();
        boolean didCacheData = orPutDataToPost.getDidCacheData();
        java.lang.String str = null;
        java.lang.Object[] objArr = 0;
        if (localTransactionMetadata == null || (paywallPostReceiptData$purchases_defaultsRelease = localTransactionMetadata.getPaywallPostReceiptData()) == null) {
            paywallPostReceiptData$purchases_defaultsRelease = paywallEvent != null ? paywallEvent.toPaywallPostReceiptData$purchases_defaultsRelease() : null;
        }
        if (localTransactionMetadata == null || (workflowMetadataFrom = localTransactionMetadata.getWorkflowMetadata()) == null) {
            workflowMetadataFrom = (paywallEvent == null || (data = paywallEvent.getData()) == null) ? null : com.revenuecat.purchases.common.caching.WorkflowMetadata.INSTANCE.from(data.getWorkflowId(), data.getStepId());
        }
        if (localTransactionMetadata != null && (receiptInfo2 = localTransactionMetadata.getReceiptInfo()) != null) {
            receiptInfo3 = receiptInfo2;
        }
        if (localTransactionMetadata == null || (purchasesAreCompletedBy = localTransactionMetadata.getPurchasesAreCompletedBy()) == null) {
            purchasesAreCompletedBy = getPurchasesAreCompletedBy();
        }
        if (purchaseState != com.revenuecat.purchases.models.PurchaseState.PENDING) {
            performPostReceipt(appUserID, purchaseToken, isRestore, receiptInfo3, initiationSource, paywallPostReceiptData$purchases_defaultsRelease, workflowMetadataFrom, purchasesAreCompletedBy, localTransactionMetadata != null || didCacheData, onSuccess, onError);
            return;
        }
        com.revenuecat.purchases.PurchasesError purchasesError = new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.PaymentPendingError, str, 2, objArr == true ? 1 : 0);
        com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError);
        onError.invoke(purchasesError, com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useOfflineEntitlementsCustomerInfoIfNeeded(com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior errorHandlingBehavior, java.lang.String appUserID, p194x6.j onSuccess, kotlin.jvm.functions.Function0 onError) {
        if (this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInPostReceipt(errorHandlingBehavior == com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME)) {
            calculateOfflineCustomerInfo(appUserID, onSuccess, new com.revenuecat.purchases.PostReceiptHelper.C19881(onError));
        } else {
            onError.invoke();
        }
    }

    public final void postRemainingCachedTransactionMetadata(java.lang.String appUserID, boolean allowSharingPlayStoreAccount, java.util.Set<java.lang.String> pendingTransactionsTokens, kotlin.jvm.functions.Function0 onNoTransactionsToSync, p194x6.j onError, p194x6.j onSuccess) {
        java.lang.String appUserID2 = appUserID;
        kotlin.jvm.internal.m.e(appUserID2, "appUserID");
        kotlin.jvm.internal.m.e(pendingTransactionsTokens, "pendingTransactionsTokens");
        kotlin.jvm.internal.m.e(onNoTransactionsToSync, "onNoTransactionsToSync");
        p194x6.j onError2 = onError;
        kotlin.jvm.internal.m.e(onError2, "onError");
        p194x6.j onSuccess2 = onSuccess;
        kotlin.jvm.internal.m.e(onSuccess2, "onSuccess");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        com.revenuecat.purchases.PostReceiptHelper postReceiptHelper = this;
        java.util.List<com.revenuecat.purchases.common.caching.LocalTransactionMetadata> allLocalTransactionMetadata = postReceiptHelper.localTransactionMetadataStore.getAllLocalTransactionMetadata();
        java.util.ArrayList<com.revenuecat.purchases.common.caching.LocalTransactionMetadata> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allLocalTransactionMetadata) {
            if (!pendingTransactionsTokens.contains(((com.revenuecat.purchases.common.caching.LocalTransactionMetadata) obj).getToken())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            onNoTransactionsToSync.invoke();
            return;
        }
        for (com.revenuecat.purchases.common.caching.LocalTransactionMetadata localTransactionMetadata : arrayList) {
            performPostReceipt(appUserID2, localTransactionMetadata.getToken(), allowSharingPlayStoreAccount, localTransactionMetadata.getReceiptInfo(), com.revenuecat.purchases.PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, localTransactionMetadata.getPaywallPostReceiptData(), localTransactionMetadata.getWorkflowMetadata(), localTransactionMetadata.getPurchasesAreCompletedBy(), true, new com.revenuecat.purchases.PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1(concurrentLinkedQueue, postReceiptHelper, arrayList, onError2, onSuccess2), new com.revenuecat.purchases.PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2(concurrentLinkedQueue, this, arrayList, onError, onSuccess));
            postReceiptHelper = this;
            appUserID2 = appUserID;
            onError2 = onError;
            onSuccess2 = onSuccess;
            concurrentLinkedQueue = concurrentLinkedQueue;
            arrayList = arrayList;
        }
    }

    public final void postTokenWithoutConsuming(java.lang.String purchaseToken, com.revenuecat.purchases.common.ReceiptInfo receiptInfo, boolean isRestore, java.lang.String appUserID, com.revenuecat.purchases.PostReceiptInitiationSource initiationSource, p194x6.j onSuccess, p194x6.j onError, java.lang.Boolean isAutoRenewing) {
        kotlin.jvm.internal.m.e(purchaseToken, "purchaseToken");
        kotlin.jvm.internal.m.e(receiptInfo, "receiptInfo");
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(initiationSource, "initiationSource");
        kotlin.jvm.internal.m.e(onSuccess, "onSuccess");
        kotlin.jvm.internal.m.e(onError, "onError");
        postReceiptAndSubscriberAttributes(appUserID, purchaseToken, isRestore, receiptInfo, initiationSource, com.revenuecat.purchases.models.PurchaseState.UNSPECIFIED_STATE, new com.revenuecat.purchases.PostReceiptHelper.C19841(purchaseToken, isAutoRenewing, onSuccess), new com.revenuecat.purchases.PostReceiptHelper.C19852(purchaseToken, isAutoRenewing, appUserID, onSuccess, onError));
    }

    public final void postTransactionAndConsumeIfNeeded(com.revenuecat.purchases.models.StoreTransaction purchase, com.revenuecat.purchases.models.StoreProduct storeProduct, java.util.Map<java.lang.String, ? extends com.revenuecat.purchases.models.SubscriptionOption> subscriptionOptionForProductIDs, boolean isRestore, java.lang.String appUserID, com.revenuecat.purchases.PostReceiptInitiationSource initiationSource, boolean sdkOriginated, p194x6.m onSuccess, p194x6.m onError) {
        kotlin.jvm.internal.m.e(purchase, "purchase");
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(initiationSource, "initiationSource");
        postReceiptAndSubscriberAttributes(appUserID, purchase.getPurchaseToken(), isRestore, com.revenuecat.purchases.common.ReceiptInfo.INSTANCE.from(purchase, storeProduct, subscriptionOptionForProductIDs, sdkOriginated), initiationSource, purchase.getPurchaseState(), new com.revenuecat.purchases.PostReceiptHelper.C19861(purchase, initiationSource, onSuccess), new com.revenuecat.purchases.PostReceiptHelper.C19872(purchase, initiationSource, appUserID, onSuccess, onError));
    }
}
