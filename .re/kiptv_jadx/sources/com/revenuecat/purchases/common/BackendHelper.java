package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0087\u0001\u0010\u001d\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e2\u001a\u0010\u0012\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152 \u0010\u001c\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/common/BackendHelper;", "", "", "apiKey", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/HTTPClient;", "httpClient", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/HTTPClient;)V", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "", "Lh6/k;", "postFieldsToSign", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lh6/A;", "onError", "Lkotlin/Function3;", "", "Lorg/json/JSONObject;", "onCompleted", "performRequest", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/common/Delay;Lx6/j;Lx6/n;)V", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "call", "enqueue", "(Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Delay;)V", "Ljava/lang/String;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/HTTPClient;", "authenticationHeaders", "Ljava/util/Map;", "getAuthenticationHeaders$purchases_defaultsRelease", "()Ljava/util/Map;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BackendHelper {
    private final java.lang.String apiKey;
    private final com.revenuecat.purchases.common.AppConfig appConfig;
    private final java.util.Map<java.lang.String, java.lang.String> authenticationHeaders;
    private final com.revenuecat.purchases.common.Dispatcher dispatcher;
    private final com.revenuecat.purchases.common.HTTPClient httpClient;

    public BackendHelper(java.lang.String apiKey, com.revenuecat.purchases.common.Dispatcher dispatcher, com.revenuecat.purchases.common.AppConfig appConfig, com.revenuecat.purchases.common.HTTPClient httpClient) {
        kotlin.jvm.internal.m.e(apiKey, "apiKey");
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        kotlin.jvm.internal.m.e(httpClient, "httpClient");
        this.apiKey = apiKey;
        this.dispatcher = dispatcher;
        this.appConfig = appConfig;
        this.httpClient = httpClient;
        this.authenticationHeaders = p078i6.D.J0(new p070h6.k("Authorization", p121o0.p.C("Bearer ", apiKey)));
    }

    public static /* synthetic */ void enqueue$default(com.revenuecat.purchases.common.BackendHelper backendHelper, com.revenuecat.purchases.common.Dispatcher.AsyncCall asyncCall, com.revenuecat.purchases.common.Dispatcher dispatcher, com.revenuecat.purchases.common.Delay delay, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            delay = com.revenuecat.purchases.common.Delay.NONE;
        }
        backendHelper.enqueue(asyncCall, dispatcher, delay);
    }

    public final void enqueue(com.revenuecat.purchases.common.Dispatcher.AsyncCall call, com.revenuecat.purchases.common.Dispatcher dispatcher, com.revenuecat.purchases.common.Delay delay) {
        kotlin.jvm.internal.m.e(call, "call");
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.m.e(delay, "delay");
        if (dispatcher.isClosed()) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Enqueuing operation in closed dispatcher.", null);
        } else {
            dispatcher.enqueue(call, delay);
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> getAuthenticationHeaders$purchases_defaultsRelease() {
        return this.authenticationHeaders;
    }

    public final void performRequest(final com.revenuecat.purchases.common.networking.Endpoint endpoint, final java.util.Map<java.lang.String, ? extends java.lang.Object> body, final java.util.List<p070h6.k> postFieldsToSign, com.revenuecat.purchases.common.Delay delay, final p194x6.j onError, final p194x6.n onCompleted) {
        kotlin.jvm.internal.m.e(endpoint, "endpoint");
        kotlin.jvm.internal.m.e(delay, "delay");
        kotlin.jvm.internal.m.e(onError, "onError");
        kotlin.jvm.internal.m.e(onCompleted, "onCompleted");
        enqueue(new com.revenuecat.purchases.common.Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.BackendHelper.performRequest.1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public com.revenuecat.purchases.common.networking.HTTPResult call() {
                return com.revenuecat.purchases.common.HTTPClient.performRequest$default(com.revenuecat.purchases.common.BackendHelper.this.httpClient, com.revenuecat.purchases.common.BackendHelper.this.appConfig.getBaseURL(), endpoint, body, postFieldsToSign, com.revenuecat.purchases.common.BackendHelper.this.getAuthenticationHeaders$purchases_defaultsRelease(), false, com.revenuecat.purchases.common.BackendHelper.this.appConfig.getFallbackBaseURLs(), 0, 160, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(com.revenuecat.purchases.common.networking.HTTPResult result) {
                com.revenuecat.purchases.PurchasesError purchasesError;
                kotlin.jvm.internal.m.e(result, "result");
                if (com.revenuecat.purchases.common.BackendHelperKt.isSuccessful(result)) {
                    purchasesError = null;
                } else {
                    purchasesError = com.revenuecat.purchases.common.ErrorsKt.toPurchasesError(result);
                    com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError);
                }
                onCompleted.invoke(purchasesError, java.lang.Integer.valueOf(result.getResponseCode()), result.getBody());
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(com.revenuecat.purchases.PurchasesError error) {
                kotlin.jvm.internal.m.e(error, "error");
                onError.invoke(error);
            }
        }, this.dispatcher, delay);
    }
}
