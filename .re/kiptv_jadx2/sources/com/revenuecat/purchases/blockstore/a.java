package com.revenuecat.purchases.blockstore;

import kotlin.jvm.functions.Function0;
import p059g4.b;
import p059g4.c;
import p070h6.e;
import p194x6.j;

public final class a implements c, b {

    public final e f21038h;

    public a(e eVar) {
        this.f21038h = eVar;
    }

    @Override
    public void onFailure(Exception exc) {
        BlockstoreHelper.C20341.invokeSuspend$lambda$2((Function0) this.f21038h, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((j) this.f21038h).invoke(obj);
    }
}
