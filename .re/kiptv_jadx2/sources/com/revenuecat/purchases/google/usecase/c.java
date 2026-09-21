package com.revenuecat.purchases.google.usecase;

import Y2.C1040j;
import Y2.r;
import Y2.x;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements r {

    public final AtomicBoolean f21058a;

    public final QueryProductDetailsUseCase f21059b;

    public final Set f21060c;

    public final String f21061d;

    public final Date f21062e;

    public final r f21063f;

    public c(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, Set set, String str, Date date, r rVar) {
        this.f21058a = atomicBoolean;
        this.f21059b = queryProductDetailsUseCase;
        this.f21060c = set;
        this.f21061d = str;
        this.f21062e = date;
        this.f21063f = rVar;
    }

    @Override
    public final void a(C1040j c1040j, x xVar) {
        QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$14(this.f21058a, this.f21059b, this.f21060c, this.f21061d, this.f21062e, this.f21063f, c1040j, xVar);
    }
}
