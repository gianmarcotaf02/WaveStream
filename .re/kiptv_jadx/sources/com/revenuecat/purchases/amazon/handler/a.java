package com.revenuecat.purchases.amazon.handler;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.amazon.device.iap.model.RequestId f21036i;
    public final /* synthetic */ com.amazon.device.iap.PurchasingListener j;

    public /* synthetic */ a(com.amazon.device.iap.PurchasingListener purchasingListener, com.amazon.device.iap.model.RequestId requestId, int i3) {
        this.f21035h = i3;
        this.j = purchasingListener;
        this.f21036i = requestId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21035h) {
            case 0:
                com.revenuecat.purchases.amazon.handler.ProductDataHandler.addTimeoutToProductDataRequest$lambda$12((com.revenuecat.purchases.amazon.handler.ProductDataHandler) this.j, this.f21036i);
                break;
            default:
                com.revenuecat.purchases.amazon.handler.UserDataHandler.addTimeoutToUserDataRequest$lambda$8((com.revenuecat.purchases.amazon.handler.UserDataHandler) this.j, this.f21036i);
                break;
        }
    }
}
