package com.revenuecat.purchases.amazon.listener;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ]\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u0019H&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/amazon/device/iap/PurchasingListener;", "Lcom/amazon/device/iap/model/UserDataResponse;", io.sentry.protocol.Response.TYPE, "Lh6/A;", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Landroid/os/Handler;", "mainHandler", "Landroid/app/Activity;", "activity", "", "appUserID", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lkotlin/Function2;", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Lx6/m;Lx6/j;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface PurchaseResponseListener extends com.amazon.device.iap.PurchasingListener {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onProductDataResponse(com.revenuecat.purchases.amazon.listener.PurchaseResponseListener purchaseResponseListener, com.amazon.device.iap.model.ProductDataResponse response) {
            kotlin.jvm.internal.m.e(response, "response");
            com.revenuecat.purchases.amazon.listener.PurchaseResponseListener.super.onProductDataResponse(response);
        }

        @java.lang.Deprecated
        public static void onPurchaseUpdatesResponse(com.revenuecat.purchases.amazon.listener.PurchaseResponseListener purchaseResponseListener, com.amazon.device.iap.model.PurchaseUpdatesResponse response) {
            kotlin.jvm.internal.m.e(response, "response");
            com.revenuecat.purchases.amazon.listener.PurchaseResponseListener.super.onPurchaseUpdatesResponse(response);
        }

        @java.lang.Deprecated
        public static void onUserDataResponse(com.revenuecat.purchases.amazon.listener.PurchaseResponseListener purchaseResponseListener, com.amazon.device.iap.model.UserDataResponse response) {
            kotlin.jvm.internal.m.e(response, "response");
            com.revenuecat.purchases.amazon.listener.PurchaseResponseListener.super.onUserDataResponse(response);
        }
    }

    default void onProductDataResponse(com.amazon.device.iap.model.ProductDataResponse response) {
        kotlin.jvm.internal.m.e(response, "response");
    }

    default void onPurchaseUpdatesResponse(com.amazon.device.iap.model.PurchaseUpdatesResponse response) {
        kotlin.jvm.internal.m.e(response, "response");
    }

    default void onUserDataResponse(com.amazon.device.iap.model.UserDataResponse response) {
        kotlin.jvm.internal.m.e(response, "response");
    }

    void purchase(android.os.Handler mainHandler, android.app.Activity activity, java.lang.String appUserID, com.revenuecat.purchases.models.StoreProduct storeProduct, p194x6.m onSuccess, p194x6.j onError);
}
