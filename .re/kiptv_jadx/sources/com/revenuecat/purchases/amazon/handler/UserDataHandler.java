package com.revenuecat.purchases.amazon.handler;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\u000f*\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010\"\u001a\u00020\u000f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\r2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00190'8BX\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010+\u001a\u0004\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010\n8B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010.\u001a\u0004\u0018\u00010-2\b\u0010*\u001a\u0004\u0018\u00010-8B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/UserDataHandler;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/utils/TimestampProvider;", "timestampProvider", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Landroid/os/Handler;Lcom/revenuecat/purchases/utils/TimestampProvider;)V", "Lcom/amazon/device/iap/model/UserData;", "getCachedUserDataIfAvailable", "()Lcom/amazon/device/iap/model/UserData;", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lh6/A;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "", "message", "invokeWithStoreProblem", "(Lx6/j;Ljava/lang/String;)V", "Lcom/amazon/device/iap/model/RequestId;", "requestId", "addTimeoutToUserDataRequest", "(Lcom/amazon/device/iap/model/RequestId;)V", "Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "getRequest", "(Lcom/amazon/device/iap/model/RequestId;)Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "Lcom/amazon/device/iap/model/UserDataResponse;", io.sentry.protocol.Response.TYPE, "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "onSuccess", "onError", "getUserData", "(Lx6/j;Lx6/j;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/utils/TimestampProvider;", "", "requests", "Ljava/util/Map;", "<set-?>", "userDataCache", "Lcom/amazon/device/iap/model/UserData;", "", "lastUserDataRequestTimestamp", "Ljava/lang/Long;", "Companion", "Request", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UserDataHandler implements com.revenuecat.purchases.amazon.listener.UserDataResponseListener {
    private static final long CACHE_EXPIRATION_TIME_MILLIS = 300000;
    private static final long GET_USER_DATA_TIMEOUT_MILLIS = 10000;
    private java.lang.Long lastUserDataRequestTimestamp;
    private final android.os.Handler mainHandler;
    private final com.revenuecat.purchases.amazon.PurchasingServiceProvider purchasingServiceProvider;
    private final java.util.Map<com.amazon.device.iap.model.RequestId, com.revenuecat.purchases.amazon.handler.UserDataHandler.Request> requests;
    private final com.revenuecat.purchases.utils.TimestampProvider timestampProvider;
    private com.amazon.device.iap.model.UserData userDataCache;

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ@\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "", "Lkotlin/Function1;", "Lcom/amazon/device/iap/model/UserData;", "Lh6/A;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "<init>", "(Lx6/j;Lx6/j;)V", "component1", "()Lx6/j;", "component2", "copy", "(Lx6/j;Lx6/j;)Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lx6/j;", "getOnReceive", "getOnError", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Request {
        private final p194x6.j onError;
        private final p194x6.j onReceive;

        public Request(p194x6.j onReceive, p194x6.j onError) {
            kotlin.jvm.internal.m.e(onReceive, "onReceive");
            kotlin.jvm.internal.m.e(onError, "onError");
            this.onReceive = onReceive;
            this.onError = onError;
        }

        public static /* synthetic */ com.revenuecat.purchases.amazon.handler.UserDataHandler.Request copy$default(com.revenuecat.purchases.amazon.handler.UserDataHandler.Request request, p194x6.j jVar, p194x6.j jVar2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                jVar = request.onReceive;
            }
            if ((i3 & 2) != 0) {
                jVar2 = request.onError;
            }
            return request.copy(jVar, jVar2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final p194x6.j getOnReceive() {
            return this.onReceive;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final p194x6.j getOnError() {
            return this.onError;
        }

        public final com.revenuecat.purchases.amazon.handler.UserDataHandler.Request copy(p194x6.j onReceive, p194x6.j onError) {
            kotlin.jvm.internal.m.e(onReceive, "onReceive");
            kotlin.jvm.internal.m.e(onError, "onError");
            return new com.revenuecat.purchases.amazon.handler.UserDataHandler.Request(onReceive, onError);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.amazon.handler.UserDataHandler.Request)) {
                return false;
            }
            com.revenuecat.purchases.amazon.handler.UserDataHandler.Request request = (com.revenuecat.purchases.amazon.handler.UserDataHandler.Request) other;
            return kotlin.jvm.internal.m.a(this.onReceive, request.onReceive) && kotlin.jvm.internal.m.a(this.onError, request.onError);
        }

        public final p194x6.j getOnError() {
            return this.onError;
        }

        public final p194x6.j getOnReceive() {
            return this.onReceive;
        }

        public int hashCode() {
            return this.onError.hashCode() + (this.onReceive.hashCode() * 31);
        }

        public java.lang.String toString() {
            return "Request(onReceive=" + this.onReceive + ", onError=" + this.onError + ')';
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.amazon.device.iap.model.UserDataResponse.RequestStatus.values().length];
            try {
                iArr[com.amazon.device.iap.model.UserDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.device.iap.model.UserDataResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.device.iap.model.UserDataResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserDataHandler(com.revenuecat.purchases.amazon.PurchasingServiceProvider purchasingServiceProvider, android.os.Handler mainHandler, com.revenuecat.purchases.utils.TimestampProvider timestampProvider) {
        kotlin.jvm.internal.m.e(purchasingServiceProvider, "purchasingServiceProvider");
        kotlin.jvm.internal.m.e(mainHandler, "mainHandler");
        kotlin.jvm.internal.m.e(timestampProvider, "timestampProvider");
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.mainHandler = mainHandler;
        this.timestampProvider = timestampProvider;
        this.requests = new java.util.LinkedHashMap();
    }

    private final void addTimeoutToUserDataRequest(com.amazon.device.iap.model.RequestId requestId) {
        this.mainHandler.postDelayed(new com.revenuecat.purchases.amazon.handler.a(this, requestId, 1), 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addTimeoutToUserDataRequest$lambda$8(com.revenuecat.purchases.amazon.handler.UserDataHandler userDataHandler, com.amazon.device.iap.model.RequestId requestId) {
        com.revenuecat.purchases.amazon.handler.UserDataHandler.Request request = userDataHandler.getRequest(requestId);
        if (request == null) {
            return;
        }
        request.getOnError().invoke(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.UnknownError, com.revenuecat.purchases.amazon.AmazonStrings.ERROR_TIMEOUT_GETTING_USER_DATA));
    }

    private final synchronized com.amazon.device.iap.model.UserData getCachedUserDataIfAvailable() {
        java.lang.Long l2;
        com.amazon.device.iap.model.UserData userData = this.userDataCache;
        if (userData != null && (l2 = this.lastUserDataRequestTimestamp) != null) {
            if (this.timestampProvider.getCurrentTimeMillis() - l2.longValue() < 300000) {
                return userData;
            }
        }
        return null;
    }

    private final synchronized com.revenuecat.purchases.amazon.handler.UserDataHandler.Request getRequest(com.amazon.device.iap.model.RequestId requestId) {
        return this.requests.remove(requestId);
    }

    private final void invokeWithStoreProblem(p194x6.j jVar, java.lang.String str) {
        jVar.invoke(new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.StoreProblemError, str));
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void getUserData(p194x6.j onSuccess, p194x6.j onError) {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String strM;
        java.lang.String str;
        kotlin.jvm.internal.m.e(onSuccess, "onSuccess");
        kotlin.jvm.internal.m.e(onError, "onError");
        com.amazon.device.iap.model.UserData cachedUserDataIfAvailable = getCachedUserDataIfAvailable();
        if (cachedUserDataIfAvailable == null) {
            com.amazon.device.iap.model.RequestId userData = this.purchasingServiceProvider.getUserData();
            com.revenuecat.purchases.amazon.handler.UserDataHandler.Request request = new com.revenuecat.purchases.amazon.handler.UserDataHandler.Request(onSuccess, onError);
            synchronized (this) {
                this.requests.put(userData, request);
                addTimeoutToUserDataRequest(userData);
            }
            return;
        }
        com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
        com.revenuecat.purchases.amazon.handler.UserDataHandler$getUserData$lambda$4$$inlined$log$1 userDataHandler$getUserData$lambda$4$$inlined$log$1 = new com.revenuecat.purchases.amazon.handler.UserDataHandler$getUserData$lambda$4$$inlined$log$1(logIntent);
        switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 2:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke(), null);
                break;
            case 3:
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                }
                break;
            case 4:
                com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i(com.google.android.gms.internal.play_billing.M0.m(logLevel3, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                }
                break;
            case 5:
                com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel4, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 6:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke(), null);
                break;
            case 7:
                com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i(com.google.android.gms.internal.play_billing.M0.m(logLevel5, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                }
                break;
            case 8:
                com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel6, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 9:
                com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    strM = com.google.android.gms.internal.play_billing.M0.m(logLevel7, new java.lang.StringBuilder("[Purchases] - "));
                    str = (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke();
                    currentLogHandler.d(strM, str);
                }
                break;
            case 10:
                com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w(com.google.android.gms.internal.play_billing.M0.m(logLevel8, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                }
                break;
            case 11:
                com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w(com.google.android.gms.internal.play_billing.M0.m(logLevel9, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                }
                break;
            case 12:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke(), null);
                break;
            case 13:
                com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w(com.google.android.gms.internal.play_billing.M0.m(logLevel10, new java.lang.StringBuilder("[Purchases] - ")), (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke());
                }
                break;
            case 14:
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) userDataHandler$getUserData$lambda$4$$inlined$log$1.invoke(), null);
                break;
        }
        onSuccess.invoke(cachedUserDataIfAvailable);
    }

    public void onUserDataResponse(com.amazon.device.iap.model.UserDataResponse response) throws java.lang.Exception {
        com.revenuecat.purchases.LogHandler currentLogHandler;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.m.e(response, "response");
        try {
            com.revenuecat.purchases.common.LogIntent logIntent = com.revenuecat.purchases.common.LogIntent.DEBUG;
            com.revenuecat.purchases.amazon.handler.UserDataHandler$onUserDataResponse$$inlined$log$1 userDataHandler$onUserDataResponse$$inlined$log$1 = new com.revenuecat.purchases.amazon.handler.UserDataHandler$onUserDataResponse$$inlined$log$1(logIntent, response);
            switch (com.revenuecat.purchases.common.LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.DEBUG;
                    com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel.name(), (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 2:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler3 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.w("[Purchases] - " + logLevel2.name(), (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 4:
                    com.revenuecat.purchases.LogLevel logLevel3 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler4 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel3.name(), (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 5:
                    com.revenuecat.purchases.LogLevel logLevel4 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        str2 = (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onUserDataResponse", e);
                    throw e;
                case 6:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    com.revenuecat.purchases.LogLevel logLevel5 = com.revenuecat.purchases.LogLevel.INFO;
                    com.revenuecat.purchases.LogHandler currentLogHandler5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 8:
                    com.revenuecat.purchases.LogLevel logLevel6 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        str2 = (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onUserDataResponse", e);
                    throw e;
                case 9:
                    com.revenuecat.purchases.LogLevel logLevel7 = com.revenuecat.purchases.LogLevel.DEBUG;
                    currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        str2 = (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke();
                        currentLogHandler.d(str, str2);
                        break;
                    }
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onUserDataResponse", e);
                    throw e;
                case 10:
                    com.revenuecat.purchases.LogLevel logLevel8 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler6 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel8.name(), (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 11:
                    com.revenuecat.purchases.LogLevel logLevel9 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler7 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel9.name(), (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 12:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    com.revenuecat.purchases.LogLevel logLevel10 = com.revenuecat.purchases.LogLevel.WARN;
                    com.revenuecat.purchases.LogHandler currentLogHandler8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                    if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel10.name(), (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke());
                    }
                    break;
                case 14:
                    com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (java.lang.String) userDataHandler$onUserDataResponse$$inlined$log$1.invoke(), null);
                    break;
            }
            com.amazon.device.iap.model.RequestId requestId = response.getRequestId();
            kotlin.jvm.internal.m.d(requestId, "response.requestId");
            com.revenuecat.purchases.amazon.handler.UserDataHandler.Request request = getRequest(requestId);
            if (request == null) {
                return;
            }
            com.amazon.device.iap.model.UserDataResponse.RequestStatus requestStatus = response.getRequestStatus();
            int i3 = requestStatus == null ? -1 : com.revenuecat.purchases.amazon.handler.UserDataHandler.WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    invokeWithStoreProblem(request.getOnError(), com.revenuecat.purchases.amazon.AmazonStrings.ERROR_FAILED_USER_DATA);
                    return;
                } else if (i3 != 3) {
                    invokeWithStoreProblem(request.getOnError(), com.revenuecat.purchases.amazon.AmazonStrings.ERROR_USER_DATA_STORE_PROBLEM);
                    return;
                } else {
                    invokeWithStoreProblem(request.getOnError(), com.revenuecat.purchases.amazon.AmazonStrings.ERROR_UNSUPPORTED_USER_DATA);
                    return;
                }
            }
            synchronized (this) {
                this.lastUserDataRequestTimestamp = java.lang.Long.valueOf(this.timestampProvider.getCurrentTimeMillis());
                this.userDataCache = response.getUserData();
            }
            p194x6.j onReceive = request.getOnReceive();
            com.amazon.device.iap.model.UserData userData = response.getUserData();
            kotlin.jvm.internal.m.d(userData, "response.userData");
            onReceive.invoke(userData);
        } catch (java.lang.Exception e6) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception in onUserDataResponse", e6);
            throw e6;
        }
    }

    public /* synthetic */ UserDataHandler(com.revenuecat.purchases.amazon.PurchasingServiceProvider purchasingServiceProvider, android.os.Handler handler, com.revenuecat.purchases.utils.TimestampProvider timestampProvider, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(purchasingServiceProvider, handler, (i3 & 4) != 0 ? new com.revenuecat.purchases.utils.DefaultTimestampProvider() : timestampProvider);
    }
}
