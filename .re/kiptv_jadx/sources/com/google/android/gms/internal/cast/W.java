package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class W {
    public static final B3.C0089b j = new B3.C0089b("ClientCastAnalytics", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f18831k = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p191x3.g f18832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.C1794t f18833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.BinderC1727c f18834c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Long f18836e;
    public E2.d g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.android.gms.internal.cast.C1806w f18838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18839i = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f18835d = java.util.UUID.randomUUID().toString();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f18837f = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool());

    public W(android.content.Context context, B3.x xVar, p191x3.g gVar, com.google.android.gms.internal.cast.C1794t c1794t, com.google.android.gms.internal.cast.BinderC1727c binderC1727c) {
        this.f18832a = gVar;
        this.f18833b = c1794t;
        this.f18834c = binderC1727c;
    }

    public final void a(com.google.android.gms.internal.cast.L0 l2, int i3) {
        this.f18837f.execute(new android.support.v4.os.d(this, l2, i3, 2));
    }
}
