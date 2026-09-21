package com.revenuecat.purchases.common.offerings;

import O.c;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior;
import com.revenuecat.purchases.common.HTTPResponseOriginalSource;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.workflows.WorkflowManager;
import com.revenuecat.purchases.paywalls.OfferingFontPreDownloader;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import p070h6.A;
import p070h6.k;
import p078i6.x;
import p078i6.y;
import p194x6.j;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001d2\b\b\u0002\u0010$\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(JM\u0010*\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b¢\u0006\u0004\b*\u0010+Js\u00101\u001a2\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d0/\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d0/0.2\u0006\u0010-\u001a\u00020,2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH\u0002¢\u0006\u0004\b1\u00102J[\u00106\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u00103\u001a\u0002002\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d0/2\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d0/H\u0002¢\u0006\u0004\b6\u00107JE\u00109\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH\u0002¢\u0006\u0004\b9\u0010:J_\u0010B\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020@2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH\u0002¢\u0006\u0004\bB\u0010CJ-\u0010E\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001c2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH\u0002¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\u001d2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001d0GH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u001dH\u0002¢\u0006\u0004\bK\u0010LJI\u0010P\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,2\u0006\u00103\u001a\u0002002\b\u0010D\u001a\u0004\u0018\u00010\u001c2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010M2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010MH\u0002¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010RR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010TR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010UR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010WR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010XR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010YR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010ZR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010[R\u0014\u0010\\\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0013\u0010c\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0013\u00108\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006f"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "offeringsFactory", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "offeringImagePreDownloader", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "offeringFontPreDownloader", "", "uiPreviewMode", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/common/workflows/WorkflowManager;", "workflowManager", "<init>", "(Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;ZLcom/revenuecat/purchases/common/DateProvider;Landroid/os/Handler;Lcom/revenuecat/purchases/common/workflows/WorkflowManager;)V", "", "appUserID", "appInBackground", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lh6/A;", "onError", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "fetchCurrent", "getOfferings", "(Ljava/lang/String;ZLx6/j;Lx6/j;Z)V", "invalidateInFlightFetches", "clearInMemoryOfferingsCache", "(Z)V", "onAppForeground", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "fetchAndCacheOfferings", "(Ljava/lang/String;ZLx6/j;Lx6/j;)V", "Ljava/util/Date;", "startTime", "Lh6/k;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "createTrackedOfferingsCallbacks", "(Ljava/util/Date;Lx6/j;Lx6/j;)Lh6/k;", "cacheStatus", "onErrorTracked", "onSuccessTracked", "fetchOfferingsFromNetwork", "(Ljava/lang/String;ZLcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;Lx6/m;Lx6/m;)V", "cachedOfferings", "vendCachedOfferingsAndMaybeRefresh", "(Ljava/lang/String;ZLcom/revenuecat/purchases/Offerings;Ljava/util/Date;Lx6/j;)V", "Lorg/json/JSONObject;", "offeringsJSON", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "originalDataSource", "loadedFromDiskCache", "", "fetchGeneration", "createAndCacheOfferings", "(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;ZILx6/j;Lx6/j;)V", "error", "handleErrorFetchingOfferings", "(Lcom/revenuecat/purchases/PurchasesError;Lx6/j;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lkotlin/jvm/functions/Function0;)V", "trackGetOfferingsStartedIfNeeded", "()V", "", "requestedProductIds", "notFoundProductIds", "trackGetOfferingsResultIfNeeded", "(Ljava/util/Date;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Set;Ljava/util/Set;)V", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/paywalls/OfferingFontPreDownloader;", "Z", "Lcom/revenuecat/purchases/common/DateProvider;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/workflows/WorkflowManager;", "emptyOfferings", "Lcom/revenuecat/purchases/Offerings;", "Ljava/util/concurrent/atomic/AtomicInteger;", "cacheGeneration", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCachedCurrentOfferingIdentifier", "()Ljava/lang/String;", "cachedCurrentOfferingIdentifier", "getCachedOfferings", "()Lcom/revenuecat/purchases/Offerings;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OfferingsManager {
    private final Backend backend;
    private final AtomicInteger cacheGeneration;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Offerings emptyOfferings;
    private final Handler mainHandler;
    private final OfferingFontPreDownloader offeringFontPreDownloader;
    private final OfferingImagePreDownloader offeringImagePreDownloader;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;
    private final boolean uiPreviewMode;
    private final WorkflowManager workflowManager;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiagnosticsTracker.CacheStatus.values().length];
            try {
                iArr[DiagnosticsTracker.CacheStatus.NOT_CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiagnosticsTracker.CacheStatus.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements j {
        final j $onError;

        public AnonymousClass1(j jVar) {
            super(1);
            this.$onError = jVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return A.f22523a;
        }

        public final void invoke(PurchasesError error) {
            m.e(error, "error");
            OfferingsManager.this.handleErrorFetchingOfferings(error, this.$onError);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "offeringsResultData", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends o implements j {
        final int $fetchGeneration;
        final boolean $loadedFromDiskCache;
        final JSONObject $offeringsJSON;
        final j $onError;
        final j $onSuccess;
        final HTTPResponseOriginalSource $originalDataSource;

        public AnonymousClass2(int i3, JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, j jVar, j jVar2) {
            super(1);
            this.$fetchGeneration = i3;
            this.$offeringsJSON = jSONObject;
            this.$originalDataSource = hTTPResponseOriginalSource;
            this.$loadedFromDiskCache = z6;
            this.$onError = jVar;
            this.$onSuccess = jVar2;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((OfferingsResultData) obj);
            return A.f22523a;
        }

        public final void invoke(OfferingsResultData offeringsResultData) {
            LogHandler currentLogHandler;
            String strM;
            String str;
            m.e(offeringsResultData, "offeringsResultData");
            A a2 = null;
            if (OfferingsManager.this.cacheGeneration.get() == this.$fetchGeneration) {
                Offering current = offeringsResultData.getOfferings().getCurrent();
                if (current != null) {
                    OfferingsManager.this.offeringImagePreDownloader.preDownloadOfferingImages(current);
                }
                OfferingsManager.this.offeringFontPreDownloader.preDownloadOfferingFontsIfNeeded(offeringsResultData.getOfferings());
                OfferingsManager.this.offeringsCache.cacheOfferings(offeringsResultData.getOfferings(), this.$offeringsJSON);
                OfferingsManager$createAndCacheOfferings$2$dispatchSuccess$1 offeringsManager$createAndCacheOfferings$2$dispatchSuccess$1 = new OfferingsManager$createAndCacheOfferings$2$dispatchSuccess$1(OfferingsManager.this, this.$onSuccess, offeringsResultData);
                WorkflowManager workflowManager = OfferingsManager.this.workflowManager;
                if (workflowManager != null) {
                    workflowManager.onPaywallConfigReady(offeringsManager$createAndCacheOfferings$2$dispatchSuccess$1);
                    a2 = A.f22523a;
                }
                if (a2 == null) {
                    offeringsManager$createAndCacheOfferings$2$dispatchSuccess$1.invoke();
                    return;
                }
                return;
            }
            LogIntent logIntent = LogIntent.DEBUG;
            OfferingsManager$createAndCacheOfferings$2$invoke$$inlined$log$1 offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1 = new OfferingsManager$createAndCacheOfferings$2$invoke$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$createAndCacheOfferings$2$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            OfferingsManager offeringsManager = OfferingsManager.this;
            offeringsManager.createAndCacheOfferings(this.$offeringsJSON, this.$originalDataSource, this.$loadedFromDiskCache, offeringsManager.cacheGeneration.get(), this.$onError, this.$onSuccess);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20461 extends o implements Function0 {
        final j $onSuccess;
        final OfferingsManager this$0;

        public C20461(j jVar, OfferingsManager offeringsManager) {
            super(0);
            this.$onSuccess = jVar;
            this.this$0 = offeringsManager;
        }

        @Override
        public Object invoke() {
            m162invoke();
            return A.f22523a;
        }

        public final void m162invoke() {
            j jVar = this.$onSuccess;
            if (jVar != null) {
                Offerings offerings = this.this$0.emptyOfferings;
                y yVar = y.f23207h;
                jVar.invoke(new OfferingsResultData(offerings, yVar, yVar));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/json/JSONObject;", TtmlNode.TAG_BODY, "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "originalDataSource", "Lh6/A;", "invoke", "(Lorg/json/JSONObject;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends o implements p194x6.m {
        final int $fetchGeneration;
        final j $onError;
        final j $onSuccess;

        public AnonymousClass3(int i3, j jVar, j jVar2) {
            super(2);
            this.$fetchGeneration = i3;
            this.$onError = jVar;
            this.$onSuccess = jVar2;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((JSONObject) obj, (HTTPResponseOriginalSource) obj2);
            return A.f22523a;
        }

        public final void invoke(JSONObject body, HTTPResponseOriginalSource originalDataSource) {
            m.e(body, "body");
            m.e(originalDataSource, "originalDataSource");
            OfferingsManager.this.createAndCacheOfferings(body, originalDataSource, false, this.$fetchGeneration, this.$onError, this.$onSuccess);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;", "errorBehavior", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass4 extends o implements p194x6.m {
        final int $fetchGeneration;
        final j $onError;
        final j $onSuccess;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GetOfferingsErrorHandlingBehavior.values().length];
                try {
                    iArr[GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GetOfferingsErrorHandlingBehavior.SHOULD_NOT_FALLBACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass4(j jVar, int i3, j jVar2) {
            super(2);
            this.$onError = jVar;
            this.$fetchGeneration = i3;
            this.$onSuccess = jVar2;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, (GetOfferingsErrorHandlingBehavior) obj2);
            return A.f22523a;
        }

        public final void invoke(PurchasesError backendError, GetOfferingsErrorHandlingBehavior errorBehavior) {
            HTTPResponseOriginalSource hTTPResponseOriginalSourceValueOf;
            m.e(backendError, "backendError");
            m.e(errorBehavior, "errorBehavior");
            int i3 = WhenMappings.$EnumSwitchMapping$0[errorBehavior.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
                return;
            }
            JSONObject cachedOfferingsResponse = OfferingsManager.this.offeringsCache.getCachedOfferingsResponse();
            if (cachedOfferingsResponse == null) {
                OfferingsManager.this.handleErrorFetchingOfferings(backendError, this.$onError);
                return;
            }
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
            }
            String strOptNullableString = JSONObjectExtensionsKt.optNullableString(cachedOfferingsResponse, OfferingsCache.ORIGINAL_SOURCE_KEY);
            if (strOptNullableString != null) {
                try {
                    hTTPResponseOriginalSourceValueOf = HTTPResponseOriginalSource.valueOf(strOptNullableString);
                } catch (IllegalArgumentException e6) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Invalid original data source for cached offerings", e6);
                    hTTPResponseOriginalSourceValueOf = null;
                }
                if (hTTPResponseOriginalSourceValueOf == null) {
                    hTTPResponseOriginalSourceValueOf = HTTPResponseOriginalSource.MAIN;
                }
            } else {
                hTTPResponseOriginalSourceValueOf = HTTPResponseOriginalSource.MAIN;
            }
            OfferingsManager.this.createAndCacheOfferings(cachedOfferingsResponse, hTTPResponseOriginalSourceValueOf, true, this.$fetchGeneration, this.$onError, this.$onSuccess);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20472 extends o implements j {
        final DiagnosticsTracker.CacheStatus $cacheStatus;
        final p194x6.m $onErrorTracked;

        public C20472(p194x6.m mVar, DiagnosticsTracker.CacheStatus cacheStatus) {
            super(1);
            this.$onErrorTracked = mVar;
            this.$cacheStatus = cacheStatus;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return A.f22523a;
        }

        public final void invoke(PurchasesError it) {
            m.e(it, "it");
            this.$onErrorTracked.invoke(it, this.$cacheStatus);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/common/offerings/OfferingsResultData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20483 extends o implements j {
        final DiagnosticsTracker.CacheStatus $cacheStatus;
        final p194x6.m $onSuccessTracked;

        public C20483(p194x6.m mVar, DiagnosticsTracker.CacheStatus cacheStatus) {
            super(1);
            this.$onSuccessTracked = mVar;
            this.$cacheStatus = cacheStatus;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((OfferingsResultData) obj);
            return A.f22523a;
        }

        public final void invoke(OfferingsResultData it) {
            m.e(it, "it");
            this.$onSuccessTracked.invoke(it, this.$cacheStatus);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20491 extends o implements Function0 {
        final j $onSuccess;
        final OfferingsManager this$0;

        public C20491(j jVar, OfferingsManager offeringsManager) {
            super(0);
            this.$onSuccess = jVar;
            this.this$0 = offeringsManager;
        }

        @Override
        public Object invoke() {
            m163invoke();
            return A.f22523a;
        }

        public final void m163invoke() {
            j jVar = this.$onSuccess;
            if (jVar != null) {
                jVar.invoke(this.this$0.emptyOfferings);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C20502 extends o implements Function0 {
        final PurchasesError $error;
        final j $onError;

        public C20502(j jVar, PurchasesError purchasesError) {
            super(0);
            this.$onError = jVar;
            this.$error = purchasesError;
        }

        @Override
        public Object invoke() {
            m164invoke();
            return A.f22523a;
        }

        public final void m164invoke() {
            j jVar = this.$onError;
            if (jVar != null) {
                jVar.invoke(this.$error);
            }
        }
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, DiagnosticsTracker diagnosticsTracker, OfferingFontPreDownloader offeringFontPreDownloader, boolean z6, DateProvider dateProvider, Handler handler, WorkflowManager workflowManager) {
        m.e(offeringsCache, "offeringsCache");
        m.e(backend, "backend");
        m.e(offeringsFactory, "offeringsFactory");
        m.e(offeringImagePreDownloader, "offeringImagePreDownloader");
        m.e(offeringFontPreDownloader, "offeringFontPreDownloader");
        m.e(dateProvider, "dateProvider");
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
        this.emptyOfferings = new Offerings(null, x.f23206h);
        this.cacheGeneration = new AtomicInteger(0);
    }

    public static void clearInMemoryOfferingsCache$default(OfferingsManager offeringsManager, boolean z6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        offeringsManager.clearInMemoryOfferingsCache(z6);
    }

    public final void createAndCacheOfferings(JSONObject offeringsJSON, HTTPResponseOriginalSource originalDataSource, boolean loadedFromDiskCache, int fetchGeneration, j onError, j onSuccess) {
        this.offeringsFactory.createOfferings(offeringsJSON, originalDataSource, loadedFromDiskCache, new AnonymousClass1(onError), new AnonymousClass2(fetchGeneration, offeringsJSON, originalDataSource, loadedFromDiskCache, onError, onSuccess));
    }

    public static void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, int i3, j jVar, j jVar2, int i9, Object obj) {
        if ((i9 & 16) != 0) {
            jVar = null;
        }
        if ((i9 & 32) != 0) {
            jVar2 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, hTTPResponseOriginalSource, z6, i3, jVar, jVar2);
    }

    private final k createTrackedOfferingsCallbacks(Date startTime, j onError, j onSuccess) {
        return new k(new OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1(this, startTime, onError), new OfferingsManager$createTrackedOfferingsCallbacks$onSuccessWithTracking$1(this, startTime, onSuccess));
    }

    public final void dispatch(Function0 action) {
        if (m.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            action.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new c(5, action));
    }

    public static void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z6, j jVar, j jVar2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            jVar = null;
        }
        if ((i3 & 8) != 0) {
            jVar2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z6, jVar, jVar2);
    }

    private final void fetchOfferingsFromNetwork(String appUserID, boolean appInBackground, DiagnosticsTracker.CacheStatus cacheStatus, p194x6.m onErrorTracked, p194x6.m onSuccessTracked) {
        LogHandler currentLogHandler;
        String strM;
        String str;
        LogIntent logIntent = LogIntent.DEBUG;
        OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1 offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1 = new OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1(logIntent, cacheStatus);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
        }
        fetchAndCacheOfferings(appUserID, appInBackground, new C20472(onErrorTracked, cacheStatus), new C20483(onSuccessTracked, cacheStatus));
    }

    public static void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z6, j jVar, j jVar2, boolean z9, int i3, Object obj) {
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

    public final void handleErrorFetchingOfferings(PurchasesError error, j onError) {
        LogHandler currentLogHandler;
        String strM;
        String str;
        LogIntent logIntent = p078i6.m.F0(new PurchasesErrorCode[]{PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError}).contains(error.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR;
        OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1 offeringsManager$handleErrorFetchingOfferings$$inlined$log$1 = new OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1(logIntent, error);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        this.offeringsCache.forceCacheStale();
        dispatch(new C20502(onError, error));
    }

    public final void trackGetOfferingsResultIfNeeded(Date startTime, DiagnosticsTracker.CacheStatus cacheStatus, PurchasesError error, Set<String> requestedProductIds, Set<String> notFoundProductIds) {
        PurchasesErrorCode code;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long jBetween = DurationExtensionsKt.between(P7.b.f8168i, startTime, this.dateProvider.getNow());
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        Integer numValueOf = null;
        String message = error != null ? error.getMessage() : null;
        if (error != null && (code = error.getCode()) != null) {
            numValueOf = Integer.valueOf(code.getCode());
        }
        diagnosticsTracker.m140trackGetOfferingsResultB8UsjHI(requestedProductIds, notFoundProductIds, message, numValueOf, null, cacheStatus, jBetween);
    }

    private final void trackGetOfferingsStartedIfNeeded() {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGetOfferingsStarted();
        }
    }

    private final void vendCachedOfferingsAndMaybeRefresh(String appUserID, boolean appInBackground, Offerings cachedOfferings, Date startTime, j onSuccess) {
        A a2;
        LogHandler currentLogHandler;
        String strM;
        String str;
        LogIntent logIntent = LogIntent.DEBUG;
        OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1 offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1 = new OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1(logIntent);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
        }
        boolean zIsOfferingsCacheStale = this.offeringsCache.isOfferingsCacheStale(appInBackground);
        trackGetOfferingsResultIfNeeded(startTime, zIsOfferingsCacheStale ? DiagnosticsTracker.CacheStatus.STALE : DiagnosticsTracker.CacheStatus.VALID, null, null, null);
        OfferingsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1 offeringsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1 = new OfferingsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1(this, onSuccess, cachedOfferings);
        WorkflowManager workflowManager = this.workflowManager;
        if (workflowManager != null) {
            workflowManager.onPaywallConfigReady(offeringsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1);
            a2 = A.f22523a;
        } else {
            a2 = null;
        }
        if (a2 == null) {
            offeringsManager$vendCachedOfferingsAndMaybeRefresh$dispatchSuccess$1.invoke();
        }
        if (zIsOfferingsCacheStale) {
            OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 = new OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2(logIntent, appInBackground);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d(M0.m(logLevel11, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w(M0.m(logLevel12, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i(M0.m(logLevel13, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d(M0.m(logLevel14, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i(M0.m(logLevel15, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d(M0.m(logLevel16, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d(M0.m(logLevel17, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w(M0.m(logLevel18, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w(M0.m(logLevel19, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w(M0.m(logLevel20, new StringBuilder("[Purchases] - ")), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
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

    public final void fetchAndCacheOfferings(String appUserID, boolean appInBackground, j onError, j onSuccess) {
        LogHandler currentLogHandler;
        String strM;
        String str;
        m.e(appUserID, "appUserID");
        if (this.uiPreviewMode) {
            dispatch(new C20461(onSuccess, this));
            return;
        }
        LogIntent logIntent = LogIntent.RC_SUCCESS;
        OfferingsManager$fetchAndCacheOfferings$$inlined$log$1 offeringsManager$fetchAndCacheOfferings$$inlined$log$1 = new OfferingsManager$fetchAndCacheOfferings$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        int i3 = this.cacheGeneration.get();
        this.backend.getOfferings(appUserID, appInBackground, new AnonymousClass3(i3, onError, onSuccess), new AnonymousClass4(onError, i3, onSuccess));
    }

    public final String getCachedCurrentOfferingIdentifier() {
        Offering current;
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null || (current = cachedOfferings.getCurrent()) == null) {
            return null;
        }
        return current.getIdentifier();
    }

    public final Offerings getCachedOfferings() {
        return this.offeringsCache.getCachedOfferings();
    }

    public final void getOfferings(String appUserID, boolean appInBackground, j onError, j onSuccess, boolean fetchCurrent) {
        m.e(appUserID, "appUserID");
        if (this.uiPreviewMode) {
            dispatch(new C20491(onSuccess, this));
            return;
        }
        trackGetOfferingsStartedIfNeeded();
        Date now = this.dateProvider.getNow();
        k kVarCreateTrackedOfferingsCallbacks = createTrackedOfferingsCallbacks(now, onError, onSuccess);
        p194x6.m mVar = (p194x6.m) kVarCreateTrackedOfferingsCallbacks.f22539h;
        p194x6.m mVar2 = (p194x6.m) kVarCreateTrackedOfferingsCallbacks.f22540i;
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (fetchCurrent) {
            fetchOfferingsFromNetwork(appUserID, appInBackground, DiagnosticsTracker.CacheStatus.NOT_CHECKED, mVar, mVar2);
        } else if (cachedOfferings == null) {
            fetchOfferingsFromNetwork(appUserID, appInBackground, DiagnosticsTracker.CacheStatus.NOT_FOUND, mVar, mVar2);
        } else {
            vendCachedOfferingsAndMaybeRefresh(appUserID, appInBackground, cachedOfferings, now, onSuccess);
        }
    }

    public final void onAppForeground(String appUserID) {
        LogHandler currentLogHandler;
        String strM;
        String str;
        m.e(appUserID, "appUserID");
        if (!this.uiPreviewMode && this.offeringsCache.isOfferingsCacheStale(false)) {
            LogIntent logIntent = LogIntent.DEBUG;
            OfferingsManager$onAppForeground$$inlined$log$1 offeringsManager$onAppForeground$$inlined$log$1 = new OfferingsManager$onAppForeground$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
            }
            fetchAndCacheOfferings$default(this, appUserID, false, null, null, 12, null);
        }
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, DiagnosticsTracker diagnosticsTracker, OfferingFontPreDownloader offeringFontPreDownloader, boolean z6, DateProvider dateProvider, Handler handler, WorkflowManager workflowManager, int i3, AbstractC2541f abstractC2541f) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, diagnosticsTracker, offeringFontPreDownloader, (i3 & 64) != 0 ? false : z6, (i3 & 128) != 0 ? new DefaultDateProvider() : dateProvider, (i3 & 256) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i3 & 512) != 0 ? null : workflowManager);
    }
}
