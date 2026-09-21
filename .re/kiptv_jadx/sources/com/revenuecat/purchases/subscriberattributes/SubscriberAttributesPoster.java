package com.revenuecat.purchases.subscriberattributes;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jk\u0010\u0013\u001a\u00020\u000b2 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/BackendHelper;)V", "", "", "attributes", "appUserID", "Lkotlin/Function0;", "Lh6/A;", "onSuccessHandler", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/PurchasesError;", "", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "onErrorHandler", "postSubscriberAttributes", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lx6/n;)V", "Lcom/revenuecat/purchases/common/BackendHelper;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriberAttributesPoster {
    private final com.revenuecat.purchases.common.BackendHelper backendHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        final /* synthetic */ p194x6.n $onErrorHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p194x6.n nVar) {
            super(1);
            this.$onErrorHandler = nVar;
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((com.revenuecat.purchases.PurchasesError) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError error) {
            kotlin.jvm.internal.m.e(error, "error");
            this.$onErrorHandler.invoke(error, java.lang.Boolean.FALSE, p078i6.w.f23205h);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "responseCode", "Lorg/json/JSONObject;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ILorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.n {
        final /* synthetic */ p194x6.n $onErrorHandler;
        final /* synthetic */ kotlin.jvm.functions.Function0 $onSuccessHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(kotlin.jvm.functions.Function0 function0, p194x6.n nVar) {
            super(3);
            this.$onSuccessHandler = function0;
            this.$onErrorHandler = nVar;
        }

        @Override // p194x6.n
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) throws org.json.JSONException {
            invoke((com.revenuecat.purchases.PurchasesError) obj, ((java.lang.Number) obj2).intValue(), (org.json.JSONObject) obj3);
            return p070h6.A.f22523a;
        }

        public final void invoke(com.revenuecat.purchases.PurchasesError purchasesError, int i3, org.json.JSONObject body) throws org.json.JSONException {
            p070h6.A a2;
            kotlin.jvm.internal.m.e(body, "body");
            if (purchasesError != null) {
                p194x6.n nVar = this.$onErrorHandler;
                boolean zIsServerError = com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.INSTANCE.isServerError(i3);
                boolean z6 = false;
                boolean z9 = i3 == 404;
                if (!zIsServerError && !z9) {
                    z6 = true;
                }
                java.lang.Object attributeErrors = p078i6.w.f23205h;
                if (purchasesError.getCode() == com.revenuecat.purchases.PurchasesErrorCode.InvalidSubscriberAttributesError) {
                    attributeErrors = com.revenuecat.purchases.subscriberattributes.BackendHelpersKt.getAttributeErrors(body);
                }
                nVar.invoke(purchasesError, java.lang.Boolean.valueOf(z6), attributeErrors);
                a2 = p070h6.A.f22523a;
            } else {
                a2 = null;
            }
            if (a2 == null) {
                this.$onSuccessHandler.invoke();
            }
        }
    }

    public SubscriberAttributesPoster(com.revenuecat.purchases.common.BackendHelper backendHelper) {
        kotlin.jvm.internal.m.e(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
    }

    public final void postSubscriberAttributes(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> attributes, java.lang.String appUserID, kotlin.jvm.functions.Function0 onSuccessHandler, p194x6.n onErrorHandler) {
        kotlin.jvm.internal.m.e(attributes, "attributes");
        kotlin.jvm.internal.m.e(appUserID, "appUserID");
        kotlin.jvm.internal.m.e(onSuccessHandler, "onSuccessHandler");
        kotlin.jvm.internal.m.e(onErrorHandler, "onErrorHandler");
        this.backendHelper.performRequest(new com.revenuecat.purchases.common.networking.Endpoint.PostAttributes(appUserID), p078i6.D.J0(new p070h6.k("attributes", attributes)), null, com.revenuecat.purchases.common.Delay.DEFAULT, new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster.AnonymousClass1(onErrorHandler), new com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster.AnonymousClass2(onSuccessHandler, onErrorHandler));
    }
}
