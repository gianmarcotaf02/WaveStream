package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21034i;

    public /* synthetic */ a(int i3, java.lang.Object obj) {
        this.f21033h = i3;
        this.f21034i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21033h) {
            case 0:
                ((kotlin.jvm.functions.Function0) this.f21034i).invoke();
                break;
            case 1:
                ((kotlin.jvm.functions.Function0) this.f21034i).invoke();
                break;
            case 2:
                ((kotlin.jvm.functions.Function0) this.f21034i).invoke();
                break;
            case 3:
                ((kotlin.jvm.functions.Function0) this.f21034i).invoke();
                break;
            default:
                com.revenuecat.purchases.PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1((java.lang.Runnable) this.f21034i);
                break;
        }
    }
}
