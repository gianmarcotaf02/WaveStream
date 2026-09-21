package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Y2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f21058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase f21059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f21060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Date f21062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y2.r f21063f;

    public /* synthetic */ c(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase queryProductDetailsUseCase, java.util.Set set, java.lang.String str, java.util.Date date, Y2.r rVar) {
        this.f21058a = atomicBoolean;
        this.f21059b = queryProductDetailsUseCase;
        this.f21060c = set;
        this.f21061d = str;
        this.f21062e = date;
        this.f21063f = rVar;
    }

    @Override // Y2.r
    public final void a(Y2.C1040j c1040j, Y2.x xVar) {
        com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$14(this.f21058a, this.f21059b, this.f21060c, this.f21061d, this.f21062e, this.f21063f, c1040j, xVar);
    }
}
