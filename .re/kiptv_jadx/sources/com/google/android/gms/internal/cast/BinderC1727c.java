package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1727c extends com.google.android.gms.internal.cast.AbstractBinderC1743g {
    public static final B3.C0089b g = new B3.C0089b("AppVisibilityProxy", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18877h = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Set f18878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18879f;

    public BinderC1727c() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", 1);
        this.f18878e = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f18879f = f18877h;
    }
}
