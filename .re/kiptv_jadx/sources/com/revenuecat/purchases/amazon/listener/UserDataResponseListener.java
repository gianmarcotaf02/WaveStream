package com.revenuecat.purchases.amazon.listener;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\rH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/amazon/device/iap/PurchasingListener;", "Lcom/amazon/device/iap/model/ProductDataResponse;", io.sentry.protocol.Response.TYPE, "Lh6/A;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Lkotlin/Function1;", "Lcom/amazon/device/iap/model/UserData;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getUserData", "(Lx6/j;Lx6/j;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface UserDataResponseListener extends com.amazon.device.iap.PurchasingListener {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onProductDataResponse(com.revenuecat.purchases.amazon.listener.UserDataResponseListener userDataResponseListener, com.amazon.device.iap.model.ProductDataResponse response) {
            kotlin.jvm.internal.m.e(response, "response");
            com.revenuecat.purchases.amazon.listener.UserDataResponseListener.super.onProductDataResponse(response);
        }

        @java.lang.Deprecated
        public static void onPurchaseResponse(com.revenuecat.purchases.amazon.listener.UserDataResponseListener userDataResponseListener, com.amazon.device.iap.model.PurchaseResponse response) {
            kotlin.jvm.internal.m.e(response, "response");
            com.revenuecat.purchases.amazon.listener.UserDataResponseListener.super.onPurchaseResponse(response);
        }

        @java.lang.Deprecated
        public static void onPurchaseUpdatesResponse(com.revenuecat.purchases.amazon.listener.UserDataResponseListener userDataResponseListener, com.amazon.device.iap.model.PurchaseUpdatesResponse response) {
            kotlin.jvm.internal.m.e(response, "response");
            com.revenuecat.purchases.amazon.listener.UserDataResponseListener.super.onPurchaseUpdatesResponse(response);
        }
    }

    void getUserData(p194x6.j onSuccess, p194x6.j onError);

    default void onProductDataResponse(com.amazon.device.iap.model.ProductDataResponse response) {
        kotlin.jvm.internal.m.e(response, "response");
    }

    default void onPurchaseResponse(com.amazon.device.iap.model.PurchaseResponse response) {
        kotlin.jvm.internal.m.e(response, "response");
    }

    default void onPurchaseUpdatesResponse(com.amazon.device.iap.model.PurchaseUpdatesResponse response) {
        kotlin.jvm.internal.m.e(response, "response");
    }
}
