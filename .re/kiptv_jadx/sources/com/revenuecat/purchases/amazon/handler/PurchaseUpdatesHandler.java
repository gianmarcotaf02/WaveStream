package com.revenuecat.purchases.amazon.handler;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJK\u0010\u0015\u001a\u00020\b2\"\u0010\u0013\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u00122\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\\\u0010 \u001aJ\u0012\u0004\u0012\u00020\u001d\u0012@\u0012>\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0012\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t0\u001ej\u0002`\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/PurchaseUpdatesHandler;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;)V", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lh6/A;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "", "message", "invokeWithStoreProblem", "(Lx6/j;Ljava/lang/String;)V", "Lkotlin/Function2;", "", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "Lcom/revenuecat/purchases/amazon/handler/QueryPurchasesSuccessCallback;", "onSuccess", "onError", "queryPurchases", "(Lx6/m;Lx6/j;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", io.sentry.protocol.Response.TYPE, "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "", "Lcom/amazon/device/iap/model/RequestId;", "Lh6/k;", "Lcom/revenuecat/purchases/amazon/handler/QueryPurchasesCallbacks;", "requests", "Ljava/util/Map;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchaseUpdatesHandler implements com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener {
    private final com.revenuecat.purchases.amazon.PurchasingServiceProvider purchasingServiceProvider;
    private final java.util.Map<com.amazon.device.iap.model.RequestId, p070h6.k> requests;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.values().length];
            try {
                iArr[com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchaseUpdatesHandler(com.revenuecat.purchases.amazon.PurchasingServiceProvider purchasingServiceProvider) {
        kotlin.jvm.internal.m.e(purchasingServiceProvider, "purchasingServiceProvider");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.requests = new java.util.LinkedHashMap();
    }

    private final void invokeWithStoreProblem(p194x6.j jVar, java.lang.String str) {
        jVar.invoke(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.StoreProblemError, str));
    }

    public void onPurchaseUpdatesResponse(com.amazon.device.iap.model.PurchaseUpdatesResponse response) throws java.lang.Exception {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        p070h6.k kVarRemove;
        kotlin.jvm.internal.m.e(response, "response");
        try {
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1 purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1 = new com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1(logIntent, response);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onPurchaseUpdatesResponse", e);
                    throw e;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onPurchaseUpdatesResponse", e);
                    throw e;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onPurchaseUpdatesResponse", e);
                    throw e;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) purchaseUpdatesHandler$onPurchaseUpdatesResponse$$inlined$log$1.invoke(), null);
                    break;
            }
            com.amazon.device.iap.model.RequestId requestId = response.getRequestId();
            synchronized (this) {
                kVarRemove = this.requests.remove(requestId);
            }
            if (kVarRemove != null) {
                p194x6.m mVar = (p194x6.m) kVarRemove.f22539h;
                p194x6.j jVar = (p194x6.j) kVarRemove.f22540i;
                com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus requestStatus = response.getRequestStatus();
                int i3 = requestStatus == null ? -1 : com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler.WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
                if (i3 == -1) {
                    invokeWithStoreProblem(jVar, com.revenuecat.purchases.amazon.AmazonStrings.ERROR_PURCHASES_UPDATES_STORE_PROBLEM);
                    return;
                }
                if (i3 == 1) {
                    java.util.List receipts = response.getReceipts();
                    kotlin.jvm.internal.m.d(receipts, "response.receipts");
                    com.amazon.device.iap.model.UserData userData = response.getUserData();
                    kotlin.jvm.internal.m.d(userData, "response.userData");
                    mVar.invoke(receipts, userData);
                    return;
                }
                if (i3 == 2) {
                    invokeWithStoreProblem(jVar, com.revenuecat.purchases.amazon.AmazonStrings.ERROR_FAILED_PURCHASES_UPDATES);
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    invokeWithStoreProblem(jVar, com.revenuecat.purchases.amazon.AmazonStrings.ERROR_UNSUPPORTED_PURCHASES_UPDATES);
                }
            }
        } catch (java.lang.Exception e6) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onPurchaseUpdatesResponse", e6);
            throw e6;
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void queryPurchases(p194x6.m onSuccess, p194x6.j onError) {
        kotlin.jvm.internal.m.e(onSuccess, "onSuccess");
        kotlin.jvm.internal.m.e(onError, "onError");
        com.amazon.device.iap.model.RequestId purchaseUpdates = this.purchasingServiceProvider.getPurchaseUpdates(true);
        synchronized (this) {
            this.requests.put(purchaseUpdates, new p070h6.k(onSuccess, onError));
        }
    }
}
