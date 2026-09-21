package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b \u0010!JC\u0010%\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\"\b\u0002\u0010\u001b\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b'\u0010!J?\u0010(\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0002¢\u0006\u0004\b(\u0010!J\u0019\u0010)\u001a\u0004\u0018\u00010#2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010/J/\u00105\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u000e2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00192\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\u00020\u001a2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001a07H\u0002¢\u0006\u0004\b9\u0010:JC\u0010=\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010;\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010<¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010CR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010FR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010G¨\u0006I"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoHelper;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "", "uiPreviewMode", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;ZLcom/revenuecat/purchases/common/DateProvider;Landroid/os/Handler;)V", "", "appUserID", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfoDataResult;", "Lh6/A;", "callback", "getCustomerInfoCacheOnly", "(Ljava/lang/String;Lx6/j;)V", "appInBackground", "allowSharingPlayStoreAccount", "postPendingPurchasesAndFetchCustomerInfo", "(Ljava/lang/String;ZZLx6/j;)V", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "getCustomerInfoFetchOnly", "(Ljava/lang/String;ZLx6/j;)V", "getCustomerInfoCachedOrFetched", "getCustomerInfoNotStaledCachedOrFetched", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "updateCachedCustomerInfoIfStale", "(Ljava/lang/String;ZZ)V", "trackDiagnostics", "trackGetCustomerInfoStartedIfNeeded", "(Z)V", "Ljava/util/Date;", "startTime", "customerInfoDataResult", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "cacheFetchPolicy", "trackGetCustomerInfoResultIfNeeded", "(ZLjava/util/Date;Lcom/revenuecat/purchases/CustomerInfoDataResult;Lcom/revenuecat/purchases/CacheFetchPolicy;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lkotlin/jvm/functions/Function0;)V", "fetchPolicy", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "retrieveCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CacheFetchPolicy;ZZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Z", "Lcom/revenuecat/purchases/common/DateProvider;", "Landroid/os/Handler;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfoHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.CustomerInfoHelper.Companion INSTANCE = new com.revenuecat.purchases.CustomerInfoHelper.Companion(null);
    private final com.revenuecat.purchases.common.Backend backend;
    private final com.revenuecat.purchases.CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final com.revenuecat.purchases.common.DateProvider dateProvider;
    private final com.revenuecat.purchases.common.caching.DeviceCache deviceCache;
    private final com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final android.os.Handler handler;
    private final com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager offlineEntitlementsManager;
    private final com.revenuecat.purchases.PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final boolean uiPreviewMode;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoHelper$Companion;", "", "()V", "createPreviewCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "createPreviewCustomerInfo$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.CustomerInfo createPreviewCustomerInfo$purchases_defaultsRelease() throws org.json.JSONException {
            java.util.Date date = new java.util.Date();
            p078i6.x xVar = p078i6.x.f23206h;
            com.revenuecat.purchases.EntitlementInfos entitlementInfos = new com.revenuecat.purchases.EntitlementInfos(xVar, com.revenuecat.purchases.VerificationResult.NOT_REQUESTED);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, new org.json.JSONObject());
            jSONObject2.put(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS, new org.json.JSONObject());
            jSONObject.put(com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys.SUBSCRIBER, jSONObject2);
            return new com.revenuecat.purchases.CustomerInfo(entitlementInfos, xVar, xVar, date, 3, date, com.revenuecat.purchases.identity.IdentityManager.UI_PREVIEW_MODE_APP_USER_ID, null, null, jSONObject);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.CacheFetchPolicy.values().length];
            try {
                iArr[com.revenuecat.purchases.CacheFetchPolicy.CACHE_ONLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.CacheFetchPolicy.FETCH_CURRENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.CacheFetchPolicy.CACHED_OR_FETCHED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.revenuecat.purchases.CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ com.revenuecat.purchases.CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ p194x6.j $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(p194x6.j jVar, com.revenuecat.purchases.CustomerInfo customerInfo) {
            super(0);
            this.$callback = jVar;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m26invoke();
            return p070h6.A.f22523a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m26invoke() {
            this.$callback.invoke(new com.revenuecat.purchases.CustomerInfoDataResult(new com.revenuecat.purchases.utils.Result.Success(this.$cachedCustomerInfo), null, 2, 0 == true ? 1 : 0));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$3, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ p194x6.j $callback;
        final /* synthetic */ com.revenuecat.purchases.PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(p194x6.j jVar, com.revenuecat.purchases.PurchasesError purchasesError) {
            super(0);
            this.$callback = jVar;
            this.$error = purchasesError;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m27invoke();
            return p070h6.A.f22523a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m27invoke() {
            this.$callback.invoke(new com.revenuecat.purchases.CustomerInfoDataResult(new com.revenuecat.purchases.utils.Result.Error(this.$error), null, 2, 0 == true ? 1 : 0));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C19692 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ com.revenuecat.purchases.CustomerInfo $cachedCustomerInfo;
        final /* synthetic */ p194x6.j $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19692(p194x6.j jVar, com.revenuecat.purchases.CustomerInfo customerInfo) {
            super(0);
            this.$callback = jVar;
            this.$cachedCustomerInfo = customerInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m28invoke();
            return p070h6.A.f22523a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m28invoke() {
            p194x6.j jVar = this.$callback;
            if (jVar != null) {
                jVar.invoke(new com.revenuecat.purchases.CustomerInfoDataResult(new com.revenuecat.purchases.utils.Result.Success(this.$cachedCustomerInfo), null, 2, 0 == true ? 1 : 0));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "info", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.j $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1$2, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            final /* synthetic */ p194x6.j $callback;
            final /* synthetic */ com.revenuecat.purchases.CustomerInfo $info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(p194x6.j jVar, com.revenuecat.purchases.CustomerInfo customerInfo) {
                super(0);
                this.$callback = jVar;
                this.$info = customerInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m29invoke();
                return p070h6.A.f22523a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m29invoke() {
                p194x6.j jVar = this.$callback;
                if (jVar != null) {
                    jVar.invoke(new com.revenuecat.purchases.utils.Result.Success(this.$info));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p194x6.j jVar) {
            super(1);
            this.$callback = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.CustomerInfo) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.CustomerInfo info) {
            com.revenuecat.purchases.LogHandler currentLogHandler;
            java.lang.String strM;
            java.lang.String str;
            kotlin.jvm.internal.m.e(info, "info");
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.RC_SUCCESS;
            com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1 customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1 = new com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1(logIntent);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoFetchOnly$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            com.revenuecat.purchases.CustomerInfoHelper.this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            com.revenuecat.purchases.CustomerInfoHelper.this.customerInfoUpdateHandler.cacheAndNotifyListeners(info);
            com.revenuecat.purchases.CustomerInfoHelper.this.dispatch(new com.revenuecat.purchases.CustomerInfoHelper.AnonymousClass1.AnonymousClass2(this.$callback, info));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "", "isServerError", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C19702 extends kotlin.jvm.internal.o implements p194x6.m {
        final /* synthetic */ java.lang.String $appUserID;
        final /* synthetic */ p194x6.j $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2, reason: invalid class name and collision with other inner class name */
        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "offlineComputedCustomerInfo", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00012 extends kotlin.jvm.internal.o implements p194x6.j {
            final /* synthetic */ p194x6.j $callback;
            final /* synthetic */ com.revenuecat.purchases.CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$2$1, reason: invalid class name */
            @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                final /* synthetic */ p194x6.j $callback;
                final /* synthetic */ com.revenuecat.purchases.CustomerInfo $offlineComputedCustomerInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(p194x6.j jVar, com.revenuecat.purchases.CustomerInfo customerInfo) {
                    super(0);
                    this.$callback = jVar;
                    this.$offlineComputedCustomerInfo = customerInfo;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m30invoke();
                    return p070h6.A.f22523a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m30invoke() {
                    p194x6.j jVar = this.$callback;
                    if (jVar != null) {
                        jVar.invoke(new com.revenuecat.purchases.utils.Result.Success(this.$offlineComputedCustomerInfo));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00012(com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper, p194x6.j jVar) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = jVar;
            }

            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.revenuecat.purchases.CustomerInfo) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(com.revenuecat.purchases.CustomerInfo offlineComputedCustomerInfo) {
                kotlin.jvm.internal.m.e(offlineComputedCustomerInfo, "offlineComputedCustomerInfo");
                this.this$0.customerInfoUpdateHandler.notifyListeners(offlineComputedCustomerInfo);
                this.this$0.dispatch(new com.revenuecat.purchases.CustomerInfoHelper.C19702.C00012.AnonymousClass1(this.$callback, offlineComputedCustomerInfo));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$3, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements p194x6.j {
            final /* synthetic */ com.revenuecat.purchases.PurchasesError $backendError;
            final /* synthetic */ p194x6.j $callback;
            final /* synthetic */ com.revenuecat.purchases.CustomerInfoHelper this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$3$1, reason: invalid class name */
            @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                final /* synthetic */ com.revenuecat.purchases.PurchasesError $backendError;
                final /* synthetic */ p194x6.j $callback;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(p194x6.j jVar, com.revenuecat.purchases.PurchasesError purchasesError) {
                    super(0);
                    this.$callback = jVar;
                    this.$backendError = purchasesError;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m31invoke();
                    return p070h6.A.f22523a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m31invoke() {
                    p194x6.j jVar = this.$callback;
                    if (jVar != null) {
                        jVar.invoke(new com.revenuecat.purchases.utils.Result.Error(this.$backendError));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper, p194x6.j jVar, com.revenuecat.purchases.PurchasesError purchasesError) {
                super(1);
                this.this$0 = customerInfoHelper;
                this.$callback = jVar;
                this.$backendError = purchasesError;
            }

            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.revenuecat.purchases.PurchasesError) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(com.revenuecat.purchases.PurchasesError it) {
                kotlin.jvm.internal.m.e(it, "it");
                this.this$0.dispatch(new com.revenuecat.purchases.CustomerInfoHelper.C19702.AnonymousClass3.AnonymousClass1(this.$callback, this.$backendError));
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoFetchOnly$2$4, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass4 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            final /* synthetic */ com.revenuecat.purchases.PurchasesError $backendError;
            final /* synthetic */ p194x6.j $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(p194x6.j jVar, com.revenuecat.purchases.PurchasesError purchasesError) {
                super(0);
                this.$callback = jVar;
                this.$backendError = purchasesError;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m32invoke();
                return p070h6.A.f22523a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m32invoke() {
                p194x6.j jVar = this.$callback;
                if (jVar != null) {
                    jVar.invoke(new com.revenuecat.purchases.utils.Result.Error(this.$backendError));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19702(java.lang.String str, p194x6.j jVar) {
            super(2);
            this.$appUserID = str;
            this.$callback = jVar;
        }

        @Override // p194x6.m
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke((com.revenuecat.purchases.PurchasesError) obj, ((java.lang.Boolean) obj2).booleanValue());
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError backendError, boolean z6) {
            kotlin.jvm.internal.m.e(backendError, "backendError");
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", java.lang.String.format(com.revenuecat.purchases.strings.CustomerInfoStrings.ERROR_FETCHING_CUSTOMER_INFO, java.util.Arrays.copyOf(new java.lang.Object[]{backendError}, 1)), null);
            com.revenuecat.purchases.CustomerInfoHelper.this.deviceCache.clearCustomerInfoCacheTimestamp$purchases_defaultsRelease(this.$appUserID);
            if (com.revenuecat.purchases.CustomerInfoHelper.this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(z6, this.$appUserID)) {
                com.revenuecat.purchases.CustomerInfoHelper.this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(this.$appUserID, new com.revenuecat.purchases.CustomerInfoHelper.C19702.C00012(com.revenuecat.purchases.CustomerInfoHelper.this, this.$callback), new com.revenuecat.purchases.CustomerInfoHelper.C19702.AnonymousClass3(com.revenuecat.purchases.CustomerInfoHelper.this, this.$callback, backendError));
            } else {
                com.revenuecat.purchases.CustomerInfoHelper.this.dispatch(new com.revenuecat.purchases.CustomerInfoHelper.C19702.AnonymousClass4(this.$callback, backendError));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/SyncPendingPurchaseResult;", "syncResult", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/SyncPendingPurchaseResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C19711 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ java.lang.String $appUserID;
        final /* synthetic */ p194x6.j $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$2, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            final /* synthetic */ p194x6.j $callback;
            final /* synthetic */ com.revenuecat.purchases.SyncPendingPurchaseResult $syncResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(p194x6.j jVar, com.revenuecat.purchases.SyncPendingPurchaseResult syncPendingPurchaseResult) {
                super(0);
                this.$callback = jVar;
                this.$syncResult = syncPendingPurchaseResult;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                m33invoke();
                return p070h6.A.f22523a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m33invoke() {
                p194x6.j jVar = this.$callback;
                if (jVar != null) {
                    jVar.invoke(new com.revenuecat.purchases.CustomerInfoDataResult(new com.revenuecat.purchases.utils.Result.Success(((com.revenuecat.purchases.SyncPendingPurchaseResult.Success) this.$syncResult).getCustomerInfo()), java.lang.Boolean.TRUE));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$3, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "result", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/utils/Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements p194x6.j {
            final /* synthetic */ p194x6.j $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(p194x6.j jVar) {
                super(1);
                this.$callback = jVar;
            }

            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError>) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError> result) {
                kotlin.jvm.internal.m.e(result, "result");
                p194x6.j jVar = this.$callback;
                if (jVar != null) {
                    jVar.invoke(new com.revenuecat.purchases.CustomerInfoDataResult(result, java.lang.Boolean.TRUE));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$4, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "result", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/utils/Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass4 extends kotlin.jvm.internal.o implements p194x6.j {
            final /* synthetic */ p194x6.j $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(p194x6.j jVar) {
                super(1);
                this.$callback = jVar;
            }

            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError>) obj);
                return p070h6.A.f22523a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError> result) {
                kotlin.jvm.internal.m.e(result, "result");
                p194x6.j jVar = this.$callback;
                if (jVar != null) {
                    jVar.invoke(new com.revenuecat.purchases.CustomerInfoDataResult(result, null, 2, 0 == true ? 1 : 0));
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$5, reason: invalid class name */
        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/PurchasesError;", "result", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/utils/Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class AnonymousClass5 extends kotlin.jvm.internal.o implements p194x6.j {
            final /* synthetic */ p194x6.j $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(p194x6.j jVar) {
                super(1);
                this.$callback = jVar;
            }

            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError>) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError> result) {
                kotlin.jvm.internal.m.e(result, "result");
                p194x6.j jVar = this.$callback;
                if (jVar != null) {
                    jVar.invoke(new com.revenuecat.purchases.CustomerInfoDataResult(result, java.lang.Boolean.FALSE));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19711(java.lang.String str, boolean z6, p194x6.j jVar) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z6;
            this.$callback = jVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.SyncPendingPurchaseResult) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.SyncPendingPurchaseResult syncResult) {
            com.revenuecat.purchases.LogHandler currentLogHandler;
            java.lang.String strM;
            java.lang.String str;
            kotlin.jvm.internal.m.e(syncResult, "syncResult");
            if (!(syncResult instanceof com.revenuecat.purchases.SyncPendingPurchaseResult.Success)) {
                if (syncResult instanceof com.revenuecat.purchases.SyncPendingPurchaseResult.Error) {
                    com.revenuecat.purchases.CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, new com.revenuecat.purchases.CustomerInfoHelper.C19711.AnonymousClass3(this.$callback));
                    return;
                } else if (syncResult instanceof com.revenuecat.purchases.SyncPendingPurchaseResult.AutoSyncDisabled) {
                    com.revenuecat.purchases.CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, new com.revenuecat.purchases.CustomerInfoHelper.C19711.AnonymousClass4(this.$callback));
                    return;
                } else {
                    if (syncResult instanceof com.revenuecat.purchases.SyncPendingPurchaseResult.NoPendingPurchasesToSync) {
                        com.revenuecat.purchases.CustomerInfoHelper.this.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, new com.revenuecat.purchases.CustomerInfoHelper.C19711.AnonymousClass5(this.$callback));
                        return;
                    }
                    return;
                }
            }
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.RC_SUCCESS;
            com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1 customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1 = new com.revenuecat.purchases.CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1(logIntent);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            com.revenuecat.purchases.CustomerInfoHelper.this.dispatch(new com.revenuecat.purchases.CustomerInfoHelper.C19711.AnonymousClass2(this.$callback, syncResult));
        }
    }

    public CustomerInfoHelper(com.revenuecat.purchases.common.caching.DeviceCache deviceCache, com.revenuecat.purchases.common.Backend backend, com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager offlineEntitlementsManager, com.revenuecat.purchases.CustomerInfoUpdateHandler customerInfoUpdateHandler, com.revenuecat.purchases.PostPendingTransactionsHelper postPendingTransactionsHelper, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, boolean z6, com.revenuecat.purchases.common.DateProvider dateProvider, android.os.Handler handler) {
        kotlin.jvm.internal.m.e(deviceCache, "deviceCache");
        kotlin.jvm.internal.m.e(backend, "backend");
        kotlin.jvm.internal.m.e(offlineEntitlementsManager, "offlineEntitlementsManager");
        kotlin.jvm.internal.m.e(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        kotlin.jvm.internal.m.e(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(handler, "handler");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.uiPreviewMode = z6;
        this.dateProvider = dateProvider;
        this.handler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(kotlin.jvm.functions.Function0 action) {
        if (kotlin.jvm.internal.m.a(java.lang.Thread.currentThread(), this.handler.getLooper().getThread())) {
            action.invoke();
        } else {
            this.handler.post(new com.revenuecat.purchases.a(0, action));
        }
    }

    private final com.revenuecat.purchases.CustomerInfo getCachedCustomerInfo(java.lang.String appUserID) {
        com.revenuecat.purchases.CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.get_offlineCustomerInfo();
        return offlineCustomerInfo == null ? this.deviceCache.getCachedCustomerInfo$purchases_defaultsRelease(appUserID) : offlineCustomerInfo;
    }

    private final void getCustomerInfoCacheOnly(java.lang.String appUserID, p194x6.j callback) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        if (callback == null) {
            return;
        }
        com.revenuecat.purchases.CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(appUserID);
        if (cachedCustomerInfo == null) {
            com.revenuecat.purchases.PurchasesError purchasesError = new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.CustomerInfoError, com.revenuecat.purchases.strings.CustomerInfoStrings.MISSING_CACHED_CUSTOMER_INFO);
            com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError);
            dispatch(new com.revenuecat.purchases.CustomerInfoHelper.AnonymousClass3(callback, purchasesError));
            return;
        }
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
        com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1 customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1 = new com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1(logIntent);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCacheOnly$$inlined$log$1.invoke(), null);
                break;
        }
        dispatch(new com.revenuecat.purchases.CustomerInfoHelper.AnonymousClass2(callback, cachedCustomerInfo));
    }

    private final void getCustomerInfoCachedOrFetched(java.lang.String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, p194x6.j callback) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        com.revenuecat.purchases.CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(appUserID);
        if (cachedCustomerInfo == null) {
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2 customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2 = new com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2(logIntent);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler5.d(com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler6.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler7.d(com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler8.d(com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler9.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler10.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler11 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler11.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$2.invoke(), null);
                    break;
            }
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
            return;
        }
        com.revenuecat.purchases.common.LogIntent logIntent2 = com.revenuecat.purchases.common.LogIntent.DEBUG;
        com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1 customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1 = new com.revenuecat.purchases.CustomerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1(logIntent2);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel11 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel11, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel12 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler12 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.w(com.google.android.gms.internal.play_billing.M0.m(logLevel12, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel13 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler13 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.i(com.google.android.gms.internal.play_billing.M0.m(logLevel13, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel14 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel14, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel15 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler14 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler14.i(com.google.android.gms.internal.play_billing.M0.m(logLevel15, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel16 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel16, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel17 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel17, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel18 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler15 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler15.w(com.google.android.gms.internal.play_billing.M0.m(logLevel18, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel19 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler16 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.w(com.google.android.gms.internal.play_billing.M0.m(logLevel19, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel20 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler17 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w(com.google.android.gms.internal.play_billing.M0.m(logLevel20, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$getCustomerInfoCachedOrFetched$$inlined$log$1.invoke(), null);
                break;
        }
        dispatch(new com.revenuecat.purchases.CustomerInfoHelper.C19692(callback, cachedCustomerInfo));
        updateCachedCustomerInfoIfStale(appUserID, appInBackground, allowSharingPlayStoreAccount);
    }

    public static /* synthetic */ void getCustomerInfoCachedOrFetched$default(com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper, java.lang.String str, boolean z6, boolean z9, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            jVar = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z6, z9, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getCustomerInfoFetchOnly(java.lang.String appUserID, boolean appInBackground, p194x6.j callback) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow$purchases_defaultsRelease(appUserID);
        this.backend.getCustomerInfo(appUserID, appInBackground, new com.revenuecat.purchases.CustomerInfoHelper.AnonymousClass1(callback), new com.revenuecat.purchases.CustomerInfoHelper.C19702(appUserID, callback));
    }

    public static /* synthetic */ void getCustomerInfoFetchOnly$default(com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper, java.lang.String str, boolean z6, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            jVar = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z6, jVar);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(java.lang.String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, p194x6.j callback) {
        if (this.deviceCache.isCustomerInfoCacheStale$purchases_defaultsRelease(appUserID, appInBackground)) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        } else {
            getCustomerInfoCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, callback);
        }
    }

    public static /* synthetic */ void getCustomerInfoNotStaledCachedOrFetched$default(com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper, java.lang.String str, boolean z6, boolean z9, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            jVar = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z6, z9, jVar);
    }

    private final void postPendingPurchasesAndFetchCustomerInfo(java.lang.String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount, p194x6.j callback) {
        this.postPendingTransactionsHelper.syncPendingPurchaseQueue(allowSharingPlayStoreAccount, new com.revenuecat.purchases.CustomerInfoHelper.C19711(appUserID, appInBackground, callback));
    }

    public static /* synthetic */ void postPendingPurchasesAndFetchCustomerInfo$default(com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper, java.lang.String str, boolean z6, boolean z9, p194x6.j jVar, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            jVar = null;
        }
        customerInfoHelper.postPendingPurchasesAndFetchCustomerInfo(str, z6, z9, jVar);
    }

    public static /* synthetic */ void retrieveCustomerInfo$default(com.revenuecat.purchases.CustomerInfoHelper customerInfoHelper, java.lang.String str, com.revenuecat.purchases.CacheFetchPolicy cacheFetchPolicy, boolean z6, boolean z9, boolean z10, com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i3 & 32) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z6, z9, z11, receiveCustomerInfoCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackGetCustomerInfoResultIfNeeded(boolean trackDiagnostics, java.util.Date startTime, com.revenuecat.purchases.CustomerInfoDataResult customerInfoDataResult, com.revenuecat.purchases.CacheFetchPolicy cacheFetchPolicy) {
        com.revenuecat.purchases.CustomerInfo customerInfo;
        com.revenuecat.purchases.PurchasesError purchasesError;
        com.revenuecat.purchases.PurchasesErrorCode code;
        com.revenuecat.purchases.EntitlementInfos entitlements;
        if (!trackDiagnostics || this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long jBetween = com.revenuecat.purchases.common.DurationExtensionsKt.between(P7.b.f8168i, startTime, this.dateProvider.getNow());
        com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError> result = customerInfoDataResult.getResult();
        java.lang.Integer numValueOf = null;
        if (result instanceof com.revenuecat.purchases.utils.Result.Success) {
            customerInfo = (com.revenuecat.purchases.CustomerInfo) ((com.revenuecat.purchases.utils.Result.Success) customerInfoDataResult.getResult()).getValue();
        } else {
            if (!(result instanceof com.revenuecat.purchases.utils.Result.Error)) {
                throw new I3.b();
            }
            customerInfo = null;
        }
        com.revenuecat.purchases.utils.Result<com.revenuecat.purchases.CustomerInfo, com.revenuecat.purchases.PurchasesError> result2 = customerInfoDataResult.getResult();
        if (result2 instanceof com.revenuecat.purchases.utils.Result.Success) {
            purchasesError = null;
        } else {
            if (!(result2 instanceof com.revenuecat.purchases.utils.Result.Error)) {
                throw new I3.b();
            }
            purchasesError = (com.revenuecat.purchases.PurchasesError) ((com.revenuecat.purchases.utils.Result.Error) customerInfoDataResult.getResult()).getValue();
        }
        com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        com.revenuecat.purchases.VerificationResult verification = (customerInfo == null || (entitlements = customerInfo.getEntitlements()) == null) ? null : entitlements.getVerification();
        java.lang.Boolean hadUnsyncedPurchasesBefore = customerInfoDataResult.getHadUnsyncedPurchasesBefore();
        java.lang.String message = purchasesError != null ? purchasesError.getMessage() : null;
        if (purchasesError != null && (code = purchasesError.getCode()) != null) {
            numValueOf = java.lang.Integer.valueOf(code.getCode());
        }
        diagnosticsTracker.m139trackGetCustomerInfoResult17CK4j0(cacheFetchPolicy, verification, hadUnsyncedPurchasesBefore, message, numValueOf, jBetween);
    }

    private final void trackGetCustomerInfoStartedIfNeeded(boolean trackDiagnostics) {
        com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker;
        if (!trackDiagnostics || (diagnosticsTracker = this.diagnosticsTrackerIfEnabled) == null) {
            return;
        }
        diagnosticsTracker.trackGetCustomerInfoStarted();
    }

    private final void updateCachedCustomerInfoIfStale(java.lang.String appUserID, boolean appInBackground, boolean allowSharingPlayStoreAccount) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        if (this.deviceCache.isCustomerInfoCacheStale$purchases_defaultsRelease(appUserID, appInBackground)) {
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.CustomerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1 customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1 = new com.revenuecat.purchases.CustomerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1(logIntent, appInBackground);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) customerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1.invoke(), null);
                    break;
            }
            postPendingPurchasesAndFetchCustomerInfo$default(this, appUserID, appInBackground, allowSharingPlayStoreAccount, null, 8, null);
        }
    }

    public final void retrieveCustomerInfo(java.lang.String appUserID, com.revenuecat.purchases.CacheFetchPolicy fetchPolicy, boolean appInBackground, boolean allowSharingPlayStoreAccount, boolean trackDiagnostics, com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback callback) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(fetchPolicy, "fetchPolicy");
        if (this.uiPreviewMode) {
            if (callback != null) {
                dispatch(new com.revenuecat.purchases.CustomerInfoHelper$retrieveCustomerInfo$1$1(callback));
                return;
            }
            return;
        }
        com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
        com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
        if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - ")), java.lang.String.format(com.revenuecat.purchases.strings.CustomerInfoStrings.RETRIEVING_CUSTOMER_INFO, java.util.Arrays.copyOf(new java.lang.Object[]{fetchPolicy}, 1)));
        }
        trackGetCustomerInfoStartedIfNeeded(trackDiagnostics);
        com.revenuecat.purchases.CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 = (callback != null || trackDiagnostics) ? new com.revenuecat.purchases.CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1(this, trackDiagnostics, this.dateProvider.getNow(), fetchPolicy, callback) : null;
        int i3 = com.revenuecat.purchases.CustomerInfoHelper.WhenMappings.$EnumSwitchMapping$0[fetchPolicy.ordinal()];
        if (i3 == 1) {
            getCustomerInfoCacheOnly(appUserID, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
            return;
        }
        if (i3 == 2) {
            postPendingPurchasesAndFetchCustomerInfo(appUserID, appInBackground, allowSharingPlayStoreAccount, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        } else if (i3 == 3) {
            getCustomerInfoCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        } else {
            if (i3 != 4) {
                return;
            }
            getCustomerInfoNotStaledCachedOrFetched(appUserID, appInBackground, allowSharingPlayStoreAccount, customerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1);
        }
    }

    public /* synthetic */ CustomerInfoHelper(com.revenuecat.purchases.common.caching.DeviceCache deviceCache, com.revenuecat.purchases.common.Backend backend, com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager offlineEntitlementsManager, com.revenuecat.purchases.CustomerInfoUpdateHandler customerInfoUpdateHandler, com.revenuecat.purchases.PostPendingTransactionsHelper postPendingTransactionsHelper, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, boolean z6, com.revenuecat.purchases.common.DateProvider dateProvider, android.os.Handler handler, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, diagnosticsTracker, (i3 & 64) != 0 ? false : z6, (i3 & 128) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider, (i3 & 256) != 0 ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler);
    }
}
