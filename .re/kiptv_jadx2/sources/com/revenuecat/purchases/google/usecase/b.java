package com.revenuecat.purchases.google.usecase;

import Y2.C1035e;
import Y2.C1040j;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {

    public final AtomicBoolean f21056a;

    public final GetBillingConfigUseCase f21057b;

    public b(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase) {
        this.f21056a = atomicBoolean;
        this.f21057b = getBillingConfigUseCase;
    }

    public final void a(C1040j c1040j, C1035e c1035e) {
        GetBillingConfigUseCase.AnonymousClass1.invoke$lambda$1(this.f21056a, this.f21057b, c1040j, c1035e);
    }
}
