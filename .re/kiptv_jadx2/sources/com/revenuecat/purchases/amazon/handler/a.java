package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.RequestId;

public final class a implements Runnable {

    public final int f21035h;

    public final RequestId f21036i;
    public final PurchasingListener j;

    public a(PurchasingListener purchasingListener, RequestId requestId, int i3) {
        this.f21035h = i3;
        this.j = purchasingListener;
        this.f21036i = requestId;
    }

    @Override
    public final void run() {
        switch (this.f21035h) {
            case 0:
                ProductDataHandler.addTimeoutToProductDataRequest$lambda$12((ProductDataHandler) this.j, this.f21036i);
                break;
            default:
                UserDataHandler.addTimeoutToUserDataRequest$lambda$8((UserDataHandler) this.j, this.f21036i);
                break;
        }
    }
}
