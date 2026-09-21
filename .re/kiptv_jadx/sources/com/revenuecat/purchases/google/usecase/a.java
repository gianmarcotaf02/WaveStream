package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Y2.r, Y2.InterfaceC1048s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revenuecat.purchases.google.usecase.BillingClientUseCase f21055a;

    public /* synthetic */ a(com.revenuecat.purchases.google.usecase.BillingClientUseCase billingClientUseCase) {
        this.f21055a = billingClientUseCase;
    }

    @Override // Y2.r
    public void a(Y2.C1040j c1040j, Y2.x xVar) {
        com.revenuecat.purchases.google.usecase.BillingClientUseCase.processResult$default((com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase) this.f21055a, c1040j, xVar, null, null, 12, null);
    }

    @Override // Y2.InterfaceC1048s
    public void b(Y2.C1040j c1040j, java.util.List list) {
        com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase.AnonymousClass1.invoke$lambda$1$lambda$0((com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase) this.f21055a, c1040j, list);
    }

    public void c(Y2.C1040j c1040j) {
        com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase.AnonymousClass1.invoke$lambda$0((com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase) this.f21055a, c1040j);
    }

    public void d(Y2.C1040j c1040j, java.lang.String str) {
        com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase.AnonymousClass1.invoke$lambda$0((com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase) this.f21055a, c1040j, str);
    }
}
