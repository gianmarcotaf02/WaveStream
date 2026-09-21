package com.revenuecat.purchases.google;

public final class a implements Runnable {

    public final int f21050h;

    public final Object f21051i;

    public a(int i3, Object obj) {
        this.f21050h = i3;
        this.f21051i = obj;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21050h) {
            case 0:
                ((BillingWrapper) this.f21051i).performStartConnection();
                break;
            case 1:
                BillingWrapper.endConnection$lambda$16((BillingWrapper) this.f21051i);
                break;
            default:
                BillingWrapper.performStartConnection$lambda$12((Throwable) this.f21051i);
                break;
        }
    }
}
