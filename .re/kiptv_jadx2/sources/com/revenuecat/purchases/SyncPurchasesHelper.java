package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JE\u0010\"\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/SyncPurchasesHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "customerInfoHelper", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/CustomerInfoHelper;Lcom/revenuecat/purchases/PostReceiptHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "appUserID", "", "appInBackground", "isRestore", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lh6/A;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "retrieveCustomerInfo", "(Ljava/lang/String;ZZLx6/j;Lx6/j;)V", "error", "Ljava/util/Date;", "startTime", "trackSyncPurchasesResultIfNeeded", "(Lcom/revenuecat/purchases/PurchasesError;Ljava/util/Date;)V", "syncPurchases", "(ZZLx6/j;Lx6/j;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SyncPurchasesHelper {
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final IdentityManager identityManager;
    private final PostReceiptHelper postReceiptHelper;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "Lh6/A;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends o implements j {
        final boolean $appInBackground;
        final String $appUserID;
        final j $handleError;
        final j $handleSuccess;
        final boolean $isRestore;

        public AnonymousClass2(String str, boolean z6, boolean z9, j jVar, j jVar2) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z6;
            this.$isRestore = z9;
            this.$handleSuccess = jVar;
            this.$handleError = jVar2;
        }

        public static final void invoke$handleLastPurchase(List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z6, boolean z9, j jVar, j jVar2, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
            if (m.a(storeTransaction, storeTransaction2)) {
                if (!list.isEmpty()) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{list}, 1)), null);
                    jVar2.invoke(p078i6.o.h1(list));
                    return;
                }
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    M0.t(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, PurchaseStrings.SYNCED_PURCHASES_SUCCESSFULLY);
                }
                syncPurchasesHelper.retrieveCustomerInfo(str, z6, z9, jVar, jVar2);
            }
        }

        @Override
        public Object invoke(Object obj) {
            invoke((List<StoreTransaction>) obj);
            return A.f22523a;
        }

        public final void invoke(List<StoreTransaction> allPurchases) {
            m.e(allPurchases, "allPurchases");
            if (allPurchases.isEmpty()) {
                SyncPurchasesHelper.this.retrieveCustomerInfo(this.$appUserID, this.$appInBackground, this.$isRestore, this.$handleSuccess, this.$handleError);
                return;
            }
            StoreTransaction storeTransaction = (StoreTransaction) p078i6.o.q1(allPurchases);
            ArrayList arrayList = new ArrayList();
            SyncPurchasesHelper syncPurchasesHelper = SyncPurchasesHelper.this;
            boolean z6 = this.$isRestore;
            String str = this.$appUserID;
            boolean z9 = this.$appInBackground;
            j jVar = this.$handleSuccess;
            j jVar2 = this.$handleError;
            for (StoreTransaction storeTransaction2 : allPurchases) {
                ReceiptInfo receiptInfo = new ReceiptInfo(storeTransaction2.getProductIds(), Long.valueOf(storeTransaction2.getPurchaseTime()), null, null, null, null, null, null, null, null, false, storeTransaction2.getStoreUserID(), storeTransaction2.getMarketplace(), 2044, null);
                PostReceiptHelper postReceiptHelper = syncPurchasesHelper.postReceiptHelper;
                String purchaseToken = storeTransaction2.getPurchaseToken();
                PostReceiptInitiationSource postReceiptInitiationSource = PostReceiptInitiationSource.RESTORE;
                ArrayList arrayList2 = arrayList;
                SyncPurchasesHelper$syncPurchases$2$1$1 syncPurchasesHelper$syncPurchases$2$1$1 = new SyncPurchasesHelper$syncPurchases$2$1$1(storeTransaction2, storeTransaction, arrayList2, syncPurchasesHelper, str, z9, z6, jVar, jVar2);
                StoreTransaction storeTransaction3 = storeTransaction;
                SyncPurchasesHelper$syncPurchases$2$1$2 syncPurchasesHelper$syncPurchases$2$1$2 = new SyncPurchasesHelper$syncPurchases$2$1$2(arrayList2, storeTransaction2, storeTransaction3, syncPurchasesHelper, str, z9, z6, jVar, jVar2);
                storeTransaction = storeTransaction3;
                j jVar3 = jVar;
                j jVar4 = jVar2;
                boolean z10 = z6;
                String str2 = str;
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends o implements j {
        final j $handleError;

        public AnonymousClass3(j jVar) {
            super(1);
            this.$handleError = jVar;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return A.f22523a;
        }

        public final void invoke(PurchasesError it) {
            LogHandler currentLogHandler;
            String strM;
            String str;
            m.e(it, "it");
            LogIntent logIntent = LogIntent.RC_ERROR;
            SyncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1 syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1 = new SyncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1(logIntent, it);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                        str = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                        str = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                        str = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                        str = (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke();
                        currentLogHandler.d(strM, str);
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$3$invoke$$inlined$log$1.invoke(), null);
                    break;
            }
            this.$handleError.invoke(it);
        }
    }

    public SyncPurchasesHelper(BillingAbstract billing, IdentityManager identityManager, CustomerInfoHelper customerInfoHelper, PostReceiptHelper postReceiptHelper, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider) {
        m.e(billing, "billing");
        m.e(identityManager, "identityManager");
        m.e(customerInfoHelper, "customerInfoHelper");
        m.e(postReceiptHelper, "postReceiptHelper");
        m.e(dateProvider, "dateProvider");
        this.billing = billing;
        this.identityManager = identityManager;
        this.customerInfoHelper = customerInfoHelper;
        this.postReceiptHelper = postReceiptHelper;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
    }

    public final void retrieveCustomerInfo(String appUserID, boolean appInBackground, boolean isRestore, final j onSuccess, final j onError) {
        CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, appUserID, CacheFetchPolicy.CACHED_OR_FETCHED, appInBackground, isRestore, false, new ReceiveCustomerInfoCallback() {
            @Override
            public void onError(PurchasesError error) {
                m.e(error, "error");
                onError.invoke(error);
            }

            @Override
            public void onReceived(CustomerInfo customerInfo) {
                m.e(customerInfo, "customerInfo");
                onSuccess.invoke(customerInfo);
            }
        }, 16, null);
    }

    public final void trackSyncPurchasesResultIfNeeded(PurchasesError error, Date startTime) {
        PurchasesErrorCode code;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.m148trackSyncPurchasesResultSxA4cEA((error == null || (code = error.getCode()) == null) ? null : Integer.valueOf(code.getCode()), error != null ? error.getMessage() : null, DurationExtensionsKt.between(P7.b.f8168i, startTime, this.dateProvider.getNow()));
        }
    }

    public final void syncPurchases(boolean isRestore, boolean appInBackground, j onSuccess, j onError) {
        LogHandler currentLogHandler;
        String strM;
        String str;
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        SyncPurchasesHelper$syncPurchases$$inlined$log$1 syncPurchasesHelper$syncPurchases$$inlined$log$1 = new SyncPurchasesHelper$syncPurchases$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = M0.m(logLevel, new StringBuilder("[Purchases] - "));
                    str = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(M0.m(logLevel2, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(M0.m(logLevel3, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = M0.m(logLevel4, new StringBuilder("[Purchases] - "));
                    str = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(M0.m(logLevel5, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = M0.m(logLevel6, new StringBuilder("[Purchases] - "));
                    str = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = M0.m(logLevel7, new StringBuilder("[Purchases] - "));
                    str = (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(M0.m(logLevel8, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(M0.m(logLevel9, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(M0.m(logLevel10, new StringBuilder("[Purchases] - ")), (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke());
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) syncPurchasesHelper$syncPurchases$$inlined$log$1.invoke(), null);
                break;
        }
        Date now = this.dateProvider.getNow();
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackSyncPurchasesStarted();
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        SyncPurchasesHelper$syncPurchases$handleSuccess$1 syncPurchasesHelper$syncPurchases$handleSuccess$1 = new SyncPurchasesHelper$syncPurchases$handleSuccess$1(this, now, onSuccess);
        SyncPurchasesHelper$syncPurchases$handleError$1 syncPurchasesHelper$syncPurchases$handleError$1 = new SyncPurchasesHelper$syncPurchases$handleError$1(this, now, onError);
        this.billing.queryAllPurchases(currentAppUserID, new AnonymousClass2(currentAppUserID, appInBackground, isRestore, syncPurchasesHelper$syncPurchases$handleSuccess$1, syncPurchasesHelper$syncPurchases$handleError$1), new AnonymousClass3(syncPurchasesHelper$syncPurchases$handleError$1));
    }

    public SyncPurchasesHelper(BillingAbstract billingAbstract, IdentityManager identityManager, CustomerInfoHelper customerInfoHelper, PostReceiptHelper postReceiptHelper, DiagnosticsTracker diagnosticsTracker, DateProvider dateProvider, int i3, AbstractC2541f abstractC2541f) {
        this(billingAbstract, identityManager, customerInfoHelper, postReceiptHelper, diagnosticsTracker, (i3 & 32) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
