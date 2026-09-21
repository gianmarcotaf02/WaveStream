package com.revenuecat.purchases.common.offerings;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(JM\u0010*\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b¢\u0006\u0004\b*\u0010+Js\u00101\u001a2\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d0/\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d0/0.2\u0006\u0010-\u001a\u00020,2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH\u0002¢\u0006\u0004\b1\u00102J[\u00106\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u00103\u001a\u0002002\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d0/2\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d0/H\u0002¢\u0006\u0004\b6\u00107JE\u00109\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH\u0002¢\u0006\u0004\b9\u0010:J_\u0010B\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020@2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH\u0002¢\u0006\u0004\bB\u0010CJ-\u0010E\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001c2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH\u0002¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\u001d2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001d0GH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u001dH\u0002¢\u0006\u0004\bK\u0010LJI\u0010P\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u00103\u001a\u0002002\b\u0010D\u001a\u0004\u0018\u00010\u001c2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010M2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010MH\u0002¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010RR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010TR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010UR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010WR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010XR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010YR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010ZR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010[R\u0014\u0010\\\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0013\u0010c\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0013\u00108\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006f"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "offeringsFactory", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "offeringImagePreDownloader", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "offeringFontPreDownloader", "", "uiPreviewMode", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/common/workflows/WorkflowManager;", "workflowManager", "<init>", "(Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;ZLcom/revenuecat/purchases/common/DateProvider;Landroid/os/Handler;Lcom/revenuecat/purchases/common/workflows/WorkflowManager;)V", "", "appUserID", "appInBackground", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lh6/A;", "onError", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "fetchCurrent", "getOfferings", "(Ljava/lang/String;ZLx6/j;Lx6/j;Z)V", "invalidateInFlightFetches", "clearInMemoryOfferingsCache", "(Z)V", "onAppForeground", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "fetchAndCacheOfferings", "(Ljava/lang/String;ZLx6/j;Lx6/j;)V", "Ljava/util/Date;", "startTime", "Lh6/k;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "createTrackedOfferingsCallbacks", "(Ljava/util/Date;Lx6/j;Lx6/j;)Lh6/k;", "cacheStatus", "onErrorTracked", "onSuccessTracked", "fetchOfferingsFromNetwork", "(Ljava/lang/String;ZLcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;Lx6/m;Lx6/m;)V", "cachedOfferings", "vendCachedOfferingsAndMaybeRefresh", "(Ljava/lang/String;ZLcom/revenuecat/purchases/Offerings;Ljava/util/Date;Lx6/j;)V", "Lorg/json/JSONObject;", "offeringsJSON", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "originalDataSource", "loadedFromDiskCache", "", "fetchGeneration", "createAndCacheOfferings", "(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;ZILx6/j;Lx6/j;)V", "error", "handleErrorFetchingOfferings", "(Lcom/revenuecat/purchases/PurchasesError;Lx6/j;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lkotlin/jvm/functions/Function0;)V", "trackGetOfferingsStartedIfNeeded", "()V", "", "requestedProductIds", "notFoundProductIds", "trackGetOfferingsResultIfNeeded", "(Ljava/util/Date;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Set;Ljava/util/Set;)V", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "Z", "Lcom/revenuecat/purchases/common/DateProvider;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/workflows/WorkflowManager;", "emptyOfferings", "Lcom/revenuecat/purchases/Offerings;", "Ljava/util/concurrent/atomic/AtomicInteger;", "cacheGeneration", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCachedCurrentOfferingIdentifier", "()Ljava/lang/String;", "cachedCurrentOfferingIdentifier", "getCachedOfferings", "()Lcom/revenuecat/purchases/Offerings;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OfferingsManager {
    private final com.revenuecat.purchases.common.Backend backend;
    private final java.util.concurrent.atomic.AtomicInteger cacheGeneration;
    private final com.revenuecat.purchases.common.DateProvider dateProvider;
    private final com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final com.revenuecat.purchases.Offerings emptyOfferings;
    private final android.os.Handler mainHandler;
    private final com.revenuecat.purchases.paywalls.OfferingFontPreDownloader offeringFontPreDownloader;
    private final com.revenuecat.purchases.utils.OfferingImagePreDownloader offeringImagePreDownloader;
    private final com.revenuecat.purchases.common.offerings.OfferingsCache offeringsCache;
    private final com.revenuecat.purchases.common.offerings.OfferingsFactory offeringsFactory;
    private final boolean uiPreviewMode;
    private final com.revenuecat.purchases.common.workflows.WorkflowManager workflowManager;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus.values().length];
            try {
                iArr[com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus.NOT_CHECKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus.NOT_FOUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.j $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p194x6.j jVar) {
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
            com.revenuecat.purchases.common.offerings.OfferingsManager.this.handleErrorFetchingOfferings(error, this.$onError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "offeringsResultData", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ int $fetchGeneration;
        final /* synthetic */ boolean $loadedFromDiskCache;
        final /* synthetic */ org.json.JSONObject $offeringsJSON;
        final /* synthetic */ p194x6.j $onError;
        final /* synthetic */ p194x6.j $onSuccess;
        final /* synthetic */ com.revenuecat.purchases.common.HTTPResponseOriginalSource $originalDataSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i3, org.json.JSONObject jSONObject, com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, p194x6.j jVar, p194x6.j jVar2) {
            super(1);
            this.$fetchGeneration = i3;
            this.$offeringsJSON = jSONObject;
            this.$originalDataSource = hTTPResponseOriginalSource;
            this.$loadedFromDiskCache = z6;
            this.$onError = jVar;
            this.$onSuccess = jVar2;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.common.offerings.OfferingsResultData) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.common.offerings.OfferingsResultData offeringsResultData) {
            com.revenuecat.purchases.LogHandler currentLogHandler;
            java.lang.String strM;
            java.lang.String str;
            kotlin.jvm.internal.m.e(offeringsResultData, "offeringsResultData");
            p070h6.A a2 = null;
            if (com.revenuecat.purchases.common.offerings.OfferingsManager.this.cacheGeneration.get() == this.$fetchGeneration) {
                com.revenuecat.purchases.Offering current = offeringsResultData.getOfferings().getCurrent();
                if (current != null) {
                    com.revenuecat.purchases.common.offerings.OfferingsManager.this.offeringImagePreDownloader.preDownloadOfferingImages(current);
                }
                com.revenuecat.purchases.common.offerings.OfferingsManager.this.offeringFontPreDownloader.preDownloadOfferingFontsIfNeeded(offeringsResultData.getOfferings());
                com.revenuecat.purchases.common.offerings.OfferingsManager.this.offeringsCache.cacheOfferings(offeringsResultData.getOfferings(), this.$offeringsJSON);
                com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$dispatchSuccess$1 offeringsManager$createAndCacheOfferings$2$dispatchSuccess$1 = new com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$dispatchSuccess$1(com.revenuecat.purchases.common.offerings.OfferingsManager.this, this.$onSuccess, offeringsResultData);
                com.revenuecat.purchases.common.workflows.WorkflowManager workflowManager = com.revenuecat.purchases.common.offerings.OfferingsManager.this.workflowManager;
                if (workflowManager != null) {
                    workflowManager.onPaywallConfigReady(offeringsManager$createAndCacheOfferings$2$dispatchSuccess$1);
                    a2 = p070h6.A.f22523a;
                }
                if (a2 == null) {
                    offeringsManager$createAndCacheOfferings$2$dispatchSuccess$1.invoke();
                    return;
                }
                return;
            }
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$invoke$$inlined$log$1 offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1 = new com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$invoke$$inlined$log$1(logIntent);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            com.revenuecat.purchases.common.offerings.OfferingsManager offeringsManager = com.revenuecat.purchases.common.offerings.OfferingsManager.this;
            offeringsManager.createAndCacheOfferings(this.$offeringsJSON, this.$originalDataSource, this.$loadedFromDiskCache, offeringsManager.cacheGeneration.get(), this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20461 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ p194x6.j $onSuccess;
        final /* synthetic */ com.revenuecat.purchases.common.offerings.OfferingsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20461(p194x6.j jVar, com.revenuecat.purchases.common.offerings.OfferingsManager offeringsManager) {
            super(0);
            this.$onSuccess = jVar;
            this.this$0 = offeringsManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m162invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m162invoke() {
            p194x6.j jVar = this.$onSuccess;
            if (jVar != null) {
                com.revenuecat.purchases.Offerings offerings = this.this$0.emptyOfferings;
                p078i6.y yVar = p078i6.y.f23207h;
                jVar.invoke(new com.revenuecat.purchases.common.offerings.OfferingsResultData(offerings, yVar, yVar));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$3, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/json/JSONObject;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "originalDataSource", "Lh6/A;", "invoke", "(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements p194x6.m {
        final /* synthetic */ int $fetchGeneration;
        final /* synthetic */ p194x6.j $onError;
        final /* synthetic */ p194x6.j $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i3, p194x6.j jVar, p194x6.j jVar2) {
            super(2);
            this.$fetchGeneration = i3;
            this.$onError = jVar;
            this.$onSuccess = jVar2;
        }

        @Override // p194x6.m
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke((org.json.JSONObject) obj, (com.revenuecat.purchases.common.HTTPResponseOriginalSource) obj2);
            return p070h6.A.f22523a;
        }

        public final void invoke(org.json.JSONObject body, com.revenuecat.purchases.common.HTTPResponseOriginalSource originalDataSource) {
            kotlin.jvm.internal.m.e(body, "body");
            kotlin.jvm.internal.m.e(originalDataSource, "originalDataSource");
            com.revenuecat.purchases.common.offerings.OfferingsManager.this.createAndCacheOfferings(body, originalDataSource, false, this.$fetchGeneration, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$4, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;", "errorBehavior", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass4 extends kotlin.jvm.internal.o implements p194x6.m {
        final /* synthetic */ int $fetchGeneration;
        final /* synthetic */ p194x6.j $onError;
        final /* synthetic */ p194x6.j $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$4$WhenMappings */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior.values().length];
                try {
                    iArr[com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior.SHOULD_NOT_FALLBACK.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(p194x6.j jVar, int i3, p194x6.j jVar2) {
            super(2);
            this.$onError = jVar;
            this.$fetchGeneration = i3;
            this.$onSuccess = jVar2;
        }

        @Override // p194x6.m
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke((com.revenuecat.purchases.PurchasesError) obj, (com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior) obj2);
            return p070h6.A.f22523a;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007e  */
        public final void invoke(com.revenuecat.purchases.PurchasesError backendError, com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior errorBehavior) {
            com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSourceValueOf;
            kotlin.jvm.internal.m.e(backendError, "backendError");
            kotlin.jvm.internal.m.e(errorBehavior, "errorBehavior");
            int i3 = com.revenuecat.purchases.common.offerings.OfferingsManager.AnonymousClass4.WhenMappings.$EnumSwitchMapping$0[errorBehavior.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                com.revenuecat.purchases.common.offerings.OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
                return;
            }
            org.json.JSONObject cachedOfferingsResponse = com.revenuecat.purchases.common.offerings.OfferingsManager.this.offeringsCache.getCachedOfferingsResponse();
            if (cachedOfferingsResponse == null) {
                com.revenuecat.purchases.common.offerings.OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
                return;
            }
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.WARN;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), com.revenuecat.purchases.strings.OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
            }
            java.lang.String strOptNullableString = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(cachedOfferingsResponse, com.revenuecat.purchases.common.offerings.OfferingsCache.ORIGINAL_SOURCE_KEY);
            if (strOptNullableString != null) {
                try {
                    hTTPResponseOriginalSourceValueOf = com.revenuecat.purchases.common.HTTPResponseOriginalSource.valueOf(strOptNullableString);
                } catch (java.lang.IllegalArgumentException e6) {
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Invalid original data source for cached offerings", e6);
                    hTTPResponseOriginalSourceValueOf = null;
                }
                if (hTTPResponseOriginalSourceValueOf == null) {
                    hTTPResponseOriginalSourceValueOf = com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN;
                }
            } else {
                hTTPResponseOriginalSourceValueOf = com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN;
            }
            com.revenuecat.purchases.common.offerings.OfferingsManager.this.createAndCacheOfferings(cachedOfferingsResponse, hTTPResponseOriginalSourceValueOf, true, this.$fetchGeneration, this.$onError, this.$onSuccess);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchOfferingsFromNetwork$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20472 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus $cacheStatus;
        final /* synthetic */ p194x6.m $onErrorTracked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20472(p194x6.m mVar, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus cacheStatus) {
            super(1);
            this.$onErrorTracked = mVar;
            this.$cacheStatus = cacheStatus;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.PurchasesError) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError it) {
            kotlin.jvm.internal.m.e(it, "it");
            this.$onErrorTracked.invoke(it, this.$cacheStatus);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$fetchOfferingsFromNetwork$3, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20483 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus $cacheStatus;
        final /* synthetic */ p194x6.m $onSuccessTracked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20483(p194x6.m mVar, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus cacheStatus) {
            super(1);
            this.$onSuccessTracked = mVar;
            this.$cacheStatus = cacheStatus;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.common.offerings.OfferingsResultData) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.common.offerings.OfferingsResultData it) {
            kotlin.jvm.internal.m.e(it, "it");
            this.$onSuccessTracked.invoke(it, this.$cacheStatus);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$getOfferings$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20491 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ p194x6.j $onSuccess;
        final /* synthetic */ com.revenuecat.purchases.common.offerings.OfferingsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20491(p194x6.j jVar, com.revenuecat.purchases.common.offerings.OfferingsManager offeringsManager) {
            super(0);
            this.$onSuccess = jVar;
            this.this$0 = offeringsManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m163invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m163invoke() {
            p194x6.j jVar = this.$onSuccess;
            if (jVar != null) {
                jVar.invoke(this.this$0.emptyOfferings);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20502 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        final /* synthetic */ com.revenuecat.purchases.PurchasesError $error;
        final /* synthetic */ p194x6.j $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20502(p194x6.j jVar, com.revenuecat.purchases.PurchasesError purchasesError) {
            super(0);
            this.$onError = jVar;
            this.$error = purchasesError;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            m164invoke();
            return p070h6.A.f22523a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m164invoke() {
            p194x6.j jVar = this.$onError;
            if (jVar != null) {
                jVar.invoke(this.$error);
            }
        }
    }

    public OfferingsManager(com.revenuecat.purchases.common.offerings.OfferingsCache offeringsCache, com.revenuecat.purchases.common.Backend backend, com.revenuecat.purchases.common.offerings.OfferingsFactory offeringsFactory, com.revenuecat.purchases.utils.OfferingImagePreDownloader offeringImagePreDownloader, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, com.revenuecat.purchases.paywalls.OfferingFontPreDownloader offeringFontPreDownloader, boolean z6, com.revenuecat.purchases.common.DateProvider dateProvider, android.os.Handler handler, com.revenuecat.purchases.common.workflows.WorkflowManager workflowManager) {
        kotlin.jvm.internal.m.e(offeringsCache, "offeringsCache");
        kotlin.jvm.internal.m.e(backend, "backend");
        kotlin.jvm.internal.m.e(offeringsFactory, "offeringsFactory");
        kotlin.jvm.internal.m.e(offeringImagePreDownloader, "offeringImagePreDownloader");
        kotlin.jvm.internal.m.e(offeringFontPreDownloader, "offeringFontPreDownloader");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.offeringImagePreDownloader = offeringImagePreDownloader;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.offeringFontPreDownloader = offeringFontPreDownloader;
        this.uiPreviewMode = z6;
        this.dateProvider = dateProvider;
        this.mainHandler = handler;
        this.workflowManager = workflowManager;
        this.emptyOfferings = new com.revenuecat.purchases.Offerings(null, p078i6.x.f23206h);
        this.cacheGeneration = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public static /* synthetic */ void clearInMemoryOfferingsCache$default(com.revenuecat.purchases.common.offerings.OfferingsManager offeringsManager, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        offeringsManager.clearInMemoryOfferingsCache(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createAndCacheOfferings(org.json.JSONObject offeringsJSON, com.revenuecat.purchases.common.HTTPResponseOriginalSource originalDataSource, boolean loadedFromDiskCache, int fetchGeneration, p194x6.j onError, p194x6.j onSuccess) {
        this.offeringsFactory.createOfferings(offeringsJSON, originalDataSource, loadedFromDiskCache, new com.revenuecat.purchases.common.offerings.OfferingsManager.AnonymousClass1(onError), new com.revenuecat.purchases.common.offerings.OfferingsManager.AnonymousClass2(fetchGeneration, offeringsJSON, originalDataSource, loadedFromDiskCache, onError, onSuccess));
    }

    public static /* synthetic */ void createAndCacheOfferings$default(com.revenuecat.purchases.common.offerings.OfferingsManager offeringsManager, org.json.JSONObject jSONObject, com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, int i3, p194x6.j jVar, p194x6.j jVar2, int i9, java.lang.Object obj) {
        if ((i9 & 16) != 0) {
            jVar = null;
        }
        if ((i9 & 32) != 0) {
            jVar2 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, hTTPResponseOriginalSource, z6, i3, jVar, jVar2);
    }

    private final p070h6.k createTrackedOfferingsCallbacks(java.util.Date startTime, p194x6.j onError, p194x6.j onSuccess) {
        return new p070h6.k(new com.revenuecat.purchases.common.offerings.OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1(this, startTime, onError), new com.revenuecat.purchases.common.offerings.OfferingsManager$createTrackedOfferingsCallbacks$onSuccessWithTracking$1(this, startTime, onSuccess));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(kotlin.jvm.functions.Function0 action) {
        if (kotlin.jvm.internal.m.a(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            action.invoke();
            return;
        }
        android.os.Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        handler.post(new O.c(5, action));
    }

    public static /* synthetic */ void fetchAndCacheOfferings$default(com.revenuecat.purchases.common.offerings.OfferingsManager offeringsManager, java.lang.String str, boolean z6, p194x6.j jVar, p194x6.j jVar2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            jVar = null;
        }
        if ((i3 & 8) != 0) {
            jVar2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z6, jVar, jVar2);
    }

    private final void fetchOfferingsFromNetwork(java.lang.String appUserID, boolean appInBackground, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus cacheStatus, p194x6.m onErrorTracked, p194x6.m onSuccessTracked) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
        com.revenuecat.purchases.common.offerings.OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1 offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1 = new com.revenuecat.purchases.common.offerings.OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1(logIntent, cacheStatus);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
        }
        fetchAndCacheOfferings(appUserID, appInBackground, new com.revenuecat.purchases.common.offerings.OfferingsManager.C20472(onErrorTracked, cacheStatus), new com.revenuecat.purchases.common.offerings.OfferingsManager.C20483(onSuccessTracked, cacheStatus));
    }

    public static /* synthetic */ void getOfferings$default(com.revenuecat.purchases.common.offerings.OfferingsManager offeringsManager, java.lang.String str, boolean z6, p194x6.j jVar, p194x6.j jVar2, boolean z9, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            jVar = null;
        }
        if ((i3 & 8) != 0) {
            jVar2 = null;
        }
        if ((i3 & 16) != 0) {
            z9 = false;
        }
        offeringsManager.getOfferings(str, z6, jVar, jVar2, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleErrorFetchingOfferings(com.revenuecat.purchases.PurchasesError error, p194x6.j onError) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        com.revenuecat.purchases.common.LogIntent logIntent = p078i6.m.F0(new com.revenuecat.purchases.PurchasesErrorCode[]{com.revenuecat.purchases.PurchasesErrorCode.ConfigurationError, com.revenuecat.purchases.PurchasesErrorCode.UnexpectedBackendResponseError}).contains(error.getCode()) ? com.revenuecat.purchases.common.LogIntent.RC_ERROR : com.revenuecat.purchases.common.LogIntent.GOOGLE_ERROR;
        com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1 offeringsManager$handleErrorFetchingOfferings$$inlined$log$1 = new com.revenuecat.purchases.common.offerings.OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1(logIntent, error);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        this.offeringsCache.forceCacheStale();
        dispatch(new com.revenuecat.purchases.common.offerings.OfferingsManager.C20502(onError, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackGetOfferingsResultIfNeeded(java.util.Date startTime, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus cacheStatus, com.revenuecat.purchases.PurchasesError error, java.util.Set<java.lang.String> requestedProductIds, java.util.Set<java.lang.String> notFoundProductIds) {
        com.revenuecat.purchases.PurchasesErrorCode code;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long jBetween = com.revenuecat.purchases.common.DurationExtensionsKt.between(P7.b.f8168i, startTime, this.dateProvider.getNow());
        com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        java.lang.Integer numValueOf = null;
        java.lang.String message = error != null ? error.getMessage() : null;
        if (error != null && (code = error.getCode()) != null) {
            numValueOf = java.lang.Integer.valueOf(code.getCode());
        }
        diagnosticsTracker.m140trackGetOfferingsResultB8UsjHI(requestedProductIds, notFoundProductIds, message, numValueOf, null, cacheStatus, jBetween);
    }

    private final void trackGetOfferingsStartedIfNeeded() {
        com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGetOfferingsStarted();
        }
    }

    private final void vendCachedOfferingsAndMaybeRefresh(java.lang.String appUserID, boolean appInBackground, com.revenuecat.purchases.Offerings cachedOfferings, java.util.Date startTime, p194x6.j onSuccess) {
        p070h6.A a2;
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
        com.revenuecat.purchases.common.offerings.OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1 offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1 = new com.revenuecat.purchases.common.offerings.OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1(logIntent);
        int[] iArr = com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
        }
        boolean zIsOfferingsCacheStale = this.offeringsCache.isOfferingsCacheStale(appInBackground);
        trackGetOfferingsResultIfNeeded(startTime, zIsOfferingsCacheStale ? com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus.STALE : com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus.VALID, null, null, null);
        com.revenuecat.purchases.common.offerings.OfferingsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1 offeringsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1 = new com.revenuecat.purchases.common.offerings.OfferingsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1(this, onSuccess, cachedOfferings);
        com.revenuecat.purchases.common.workflows.WorkflowManager workflowManager = this.workflowManager;
        if (workflowManager != null) {
            workflowManager.onPaywallConfigReady(offeringsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1);
            a2 = p070h6.A.f22523a;
        } else {
            a2 = null;
        }
        if (a2 == null) {
            offeringsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1.invoke();
        }
        if (zIsOfferingsCacheStale) {
            com.revenuecat.purchases.common.offerings.OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 = new com.revenuecat.purchases.common.offerings.OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2(logIntent, appInBackground);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel11 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d(com.google.android.gms.internal.play_billing.M0.m(logLevel11, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel12 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler9 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w(com.google.android.gms.internal.play_billing.M0.m(logLevel12, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel13 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler10 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i(com.google.android.gms.internal.play_billing.M0.m(logLevel13, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel14 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler11 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d(com.google.android.gms.internal.play_billing.M0.m(logLevel14, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel15 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler12 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i(com.google.android.gms.internal.play_billing.M0.m(logLevel15, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel16 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler13 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d(com.google.android.gms.internal.play_billing.M0.m(logLevel16, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel17 = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler14 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d(com.google.android.gms.internal.play_billing.M0.m(logLevel17, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel18 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler15 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w(com.google.android.gms.internal.play_billing.M0.m(logLevel18, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel19 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler16 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w(com.google.android.gms.internal.play_billing.M0.m(logLevel19, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel20 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler17 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w(com.google.android.gms.internal.play_billing.M0.m(logLevel20, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
            }
            fetchAndCacheOfferings$default(this, appUserID, appInBackground, null, null, 12, null);
        }
    }

    public final void clearInMemoryOfferingsCache(boolean invalidateInFlightFetches) {
        if (invalidateInFlightFetches) {
            this.cacheGeneration.incrementAndGet();
        }
        this.offeringsCache.clearInMemoryOfferingsCache();
    }

    public final void fetchAndCacheOfferings(java.lang.String appUserID, boolean appInBackground, p194x6.j onError, p194x6.j onSuccess) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        if (this.uiPreviewMode) {
            dispatch(new com.revenuecat.purchases.common.offerings.OfferingsManager.C20461(onSuccess, this));
            return;
        }
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.RC_SUCCESS;
        com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$$inlined$log$1 offeringsManager$fetchAndCacheOfferings$$inlined$log$1 = new com.revenuecat.purchases.common.offerings.OfferingsManager$fetchAndCacheOfferings$$inlined$log$1(logIntent);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        int i3 = this.cacheGeneration.get();
        this.backend.getOfferings(appUserID, appInBackground, new com.revenuecat.purchases.common.offerings.OfferingsManager.AnonymousClass3(i3, onError, onSuccess), new com.revenuecat.purchases.common.offerings.OfferingsManager.AnonymousClass4(onError, i3, onSuccess));
    }

    public final java.lang.String getCachedCurrentOfferingIdentifier() {
        com.revenuecat.purchases.Offering current;
        com.revenuecat.purchases.Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null || (current = cachedOfferings.getCurrent()) == null) {
            return null;
        }
        return current.getIdentifier();
    }

    public final com.revenuecat.purchases.Offerings getCachedOfferings() {
        return this.offeringsCache.getCachedOfferings();
    }

    public final void getOfferings(java.lang.String appUserID, boolean appInBackground, p194x6.j onError, p194x6.j onSuccess, boolean fetchCurrent) {
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        if (this.uiPreviewMode) {
            dispatch(new com.revenuecat.purchases.common.offerings.OfferingsManager.C20491(onSuccess, this));
            return;
        }
        trackGetOfferingsStartedIfNeeded();
        java.util.Date now = this.dateProvider.getNow();
        p070h6.k kVarCreateTrackedOfferingsCallbacks = createTrackedOfferingsCallbacks(now, onError, onSuccess);
        p194x6.m mVar = (p194x6.m) kVarCreateTrackedOfferingsCallbacks.f22539h;
        p194x6.m mVar2 = (p194x6.m) kVarCreateTrackedOfferingsCallbacks.f22540i;
        com.revenuecat.purchases.Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (fetchCurrent) {
            fetchOfferingsFromNetwork(appUserID, appInBackground, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus.NOT_CHECKED, mVar, mVar2);
        } else if (cachedOfferings == null) {
            fetchOfferingsFromNetwork(appUserID, appInBackground, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker.CacheStatus.NOT_FOUND, mVar, mVar2);
        } else {
            vendCachedOfferingsAndMaybeRefresh(appUserID, appInBackground, cachedOfferings, now, onSuccess);
        }
    }

    public final void onAppForeground(java.lang.String appUserID) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        if (!this.uiPreviewMode && this.offeringsCache.isOfferingsCacheStale(false)) {
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.common.offerings.OfferingsManager$onAppForeground$$inlined$log$1 offeringsManager$onAppForeground$$inlined$log$1 = new com.revenuecat.purchases.common.offerings.OfferingsManager$onAppForeground$$inlined$log$1(logIntent);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                        str = (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
            }
            fetchAndCacheOfferings$default(this, appUserID, false, null, null, 12, null);
        }
    }

    public /* synthetic */ OfferingsManager(com.revenuecat.purchases.common.offerings.OfferingsCache offeringsCache, com.revenuecat.purchases.common.Backend backend, com.revenuecat.purchases.common.offerings.OfferingsFactory offeringsFactory, com.revenuecat.purchases.utils.OfferingImagePreDownloader offeringImagePreDownloader, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker diagnosticsTracker, com.revenuecat.purchases.paywalls.OfferingFontPreDownloader offeringFontPreDownloader, boolean z6, com.revenuecat.purchases.common.DateProvider dateProvider, android.os.Handler handler, com.revenuecat.purchases.common.workflows.WorkflowManager workflowManager, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, diagnosticsTracker, offeringFontPreDownloader, (i3 & 64) != 0 ? false : z6, (i3 & 128) != 0 ? new com.revenuecat.purchases.common.DefaultDateProvider() : dateProvider, (i3 & 256) != 0 ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler, (i3 & 512) != 0 ? null : workflowManager);
    }
}
