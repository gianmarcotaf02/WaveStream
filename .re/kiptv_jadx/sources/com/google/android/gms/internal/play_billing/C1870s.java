package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1870s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f19381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f19382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f19383c;

    public C1870s(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f19381a = obj;
        this.f19382b = obj2;
        this.f19383c = obj3;
    }

    public final java.lang.IllegalArgumentException a() {
        java.lang.Object obj = this.f19381a;
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.f19382b);
        return new java.lang.IllegalArgumentException(B2.a.o(Y6.f.o("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), java.lang.String.valueOf(obj), "=", java.lang.String.valueOf(this.f19383c)));
    }
}
