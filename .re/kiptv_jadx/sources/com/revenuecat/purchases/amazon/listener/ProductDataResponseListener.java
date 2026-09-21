package com.revenuecat.purchases.amazon.listener;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJS\u0010\u0017\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00040\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0011H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/amazon/device/iap/PurchasingListener;", "Lcom/amazon/device/iap/model/UserDataResponse;", io.sentry.protocol.Response.TYPE, "Lh6/A;", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "", "", "skus", "marketplace", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getProductData", "(Ljava/util/Set;Ljava/lang/String;Lx6/j;Lx6/j;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ProductDataResponseListener extends com.amazon.device.iap.PurchasingListener {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onPurchaseResponse(com.revenuecat.purchases.amazon.listener.ProductDataResponseListener productDataResponseListener, com.amazon.device.iap.model.PurchaseResponse response) {
            kotlin.jvm.internal.m.e(response, "response");
            com.revenuecat.purchases.amazon.listener.ProductDataResponseListener.super.onPurchaseResponse(response);
        }

        @java.lang.Deprecated
        public static void onPurchaseUpdatesResponse(com.revenuecat.purchases.amazon.listener.ProductDataResponseListener productDataResponseListener, com.amazon.device.iap.model.PurchaseUpdatesResponse response) {
            kotlin.jvm.internal.m.e(response, "response");
            com.revenuecat.purchases.amazon.listener.ProductDataResponseListener.super.onPurchaseUpdatesResponse(response);
        }

        @java.lang.Deprecated
        public static void onUserDataResponse(com.revenuecat.purchases.amazon.listener.ProductDataResponseListener productDataResponseListener, com.amazon.device.iap.model.UserDataResponse response) {
            kotlin.jvm.internal.m.e(response, "response");
            com.revenuecat.purchases.amazon.listener.ProductDataResponseListener.super.onUserDataResponse(response);
        }
    }

    void getProductData(java.util.Set<java.lang.String> skus, java.lang.String marketplace, p194x6.j onReceive, p194x6.j onError);

    default void onPurchaseResponse(com.amazon.device.iap.model.PurchaseResponse response) {
        kotlin.jvm.internal.m.e(response, "response");
    }

    default void onPurchaseUpdatesResponse(com.amazon.device.iap.model.PurchaseUpdatesResponse response) {
        kotlin.jvm.internal.m.e(response, "response");
    }

    default void onUserDataResponse(com.amazon.device.iap.model.UserDataResponse response) {
        kotlin.jvm.internal.m.e(response, "response");
    }
}
