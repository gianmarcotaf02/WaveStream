package com.revenuecat.purchases.blockstore;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p059g4.c, p059g4.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p070h6.e f21038h;

    public /* synthetic */ a(p070h6.e eVar) {
        this.f21038h = eVar;
    }

    @Override // p059g4.b
    public void onFailure(java.lang.Exception exc) {
        com.revenuecat.purchases.blockstore.BlockstoreHelper.C20341.invokeSuspend$lambda$2((kotlin.jvm.functions.Function0) this.f21038h, exc);
    }

    @Override // p059g4.c
    public void onSuccess(java.lang.Object obj) {
        ((p194x6.j) this.f21038h).invoke(obj);
    }
}
