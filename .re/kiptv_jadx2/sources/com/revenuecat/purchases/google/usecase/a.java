package com.revenuecat.purchases.google.usecase;

import Y2.C1040j;
import Y2.InterfaceC1048s;
import Y2.r;
import Y2.x;
import java.util.List;

public final class a implements r, InterfaceC1048s {

    public final BillingClientUseCase f21055a;

    public a(BillingClientUseCase billingClientUseCase) {
        this.f21055a = billingClientUseCase;
    }

    @Override
    public void a(C1040j c1040j, x xVar) {
        BillingClientUseCase.processResult$default((QueryProductDetailsUseCase) this.f21055a, c1040j, xVar, null, null, 12, null);
    }

    @Override
    public void b(C1040j c1040j, List list) {
        QueryPurchasesByTypeUseCase.AnonymousClass1.invoke$lambda$1$lambda$0((QueryPurchasesByTypeUseCase) this.f21055a, c1040j, list);
    }

    public void c(C1040j c1040j) {
        AcknowledgePurchaseUseCase.AnonymousClass1.invoke$lambda$0((AcknowledgePurchaseUseCase) this.f21055a, c1040j);
    }

    public void d(C1040j c1040j, String str) {
        ConsumePurchaseUseCase.AnonymousClass1.invoke$lambda$0((ConsumePurchaseUseCase) this.f21055a, c1040j, str);
    }
}
