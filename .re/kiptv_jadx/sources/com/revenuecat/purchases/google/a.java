package com.revenuecat.purchases.google;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21051i;

    public /* synthetic */ a(int i3, java.lang.Object obj) {
        this.f21050h = i3;
        this.f21051i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        switch (this.f21050h) {
            case 0:
                ((com.revenuecat.purchases.google.BillingWrapper) this.f21051i).performStartConnection();
                break;
            case 1:
                com.revenuecat.purchases.google.BillingWrapper.endConnection$lambda$16((com.revenuecat.purchases.google.BillingWrapper) this.f21051i);
                break;
            default:
                com.revenuecat.purchases.google.BillingWrapper.performStartConnection$lambda$12((java.lang.Throwable) this.f21051i);
                break;
        }
    }
}
