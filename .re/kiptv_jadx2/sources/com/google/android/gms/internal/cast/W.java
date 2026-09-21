package com.google.android.gms.internal.cast;

import B3.C0089b;
import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class W {
    public static final C0089b j = new C0089b("ClientCastAnalytics", null);

    public static boolean f18831k = true;

    public final p191x3.g f18832a;

    public final C1794t f18833b;

    public final BinderC1727c f18834c;

    public Long f18836e;
    public E2.d g;

    public C1806w f18838h;

    public int f18839i = 1;

    public final String f18835d = UUID.randomUUID().toString();

    public final ExecutorService f18837f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public W(Context context, B3.x xVar, p191x3.g gVar, C1794t c1794t, BinderC1727c binderC1727c) {
        this.f18832a = gVar;
        this.f18833b = c1794t;
        this.f18834c = binderC1727c;
    }

    public final void a(L0 l2, int i3) {
        this.f18837f.execute(new android.support.v4.os.d(this, l2, i3, 2));
    }
}
