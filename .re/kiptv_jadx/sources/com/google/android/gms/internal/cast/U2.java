package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class U2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.U2 f18826c = new com.google.android.gms.internal.cast.U2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f18828b = new java.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.N2 f18827a = new com.google.android.gms.internal.cast.N2();

    public final com.google.android.gms.internal.cast.X2 a(java.lang.Class cls) {
        com.google.android.gms.internal.cast.X2 x2K;
        java.nio.charset.Charset charset = com.google.android.gms.internal.cast.J2.f18779a;
        if (cls == null) {
            throw new java.lang.NullPointerException("messageType");
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f18828b;
        com.google.android.gms.internal.cast.X2 x9 = (com.google.android.gms.internal.cast.X2) concurrentHashMap.get(cls);
        if (x9 != null) {
            return x9;
        }
        com.google.android.gms.internal.cast.N2 n3 = this.f18827a;
        n3.getClass();
        com.google.android.gms.internal.cast.C1799u0 c1799u0 = com.google.android.gms.internal.cast.Y2.f18851a;
        com.google.android.gms.internal.cast.E2.class.isAssignableFrom(cls);
        com.google.android.gms.internal.cast.W2 w2A = ((com.google.android.gms.internal.cast.N2) n3.f18803h).a(cls);
        if ((w2A.f18843d & 2) == 2) {
            com.google.android.gms.internal.cast.C1799u0 c1799u1 = com.google.android.gms.internal.cast.Y2.f18851a;
            com.google.android.gms.internal.cast.C1799u0 c1799u2 = com.google.android.gms.internal.cast.B2.f18746a;
            x2K = new com.google.android.gms.internal.cast.S2(c1799u1, w2A.f18840a);
        } else {
            int i3 = com.google.android.gms.internal.cast.T2.f18821a;
            int i9 = com.google.android.gms.internal.cast.L2.f18794a;
            com.google.android.gms.internal.cast.C1799u0 c1799u3 = com.google.android.gms.internal.cast.Y2.f18851a;
            com.google.android.gms.internal.cast.C1799u0 c1799u4 = w2A.a() + (-1) != 1 ? com.google.android.gms.internal.cast.B2.f18746a : null;
            int i10 = com.google.android.gms.internal.cast.O2.f18804a;
            x2K = com.google.android.gms.internal.cast.R2.k(w2A, c1799u3, c1799u4);
        }
        com.google.android.gms.internal.cast.X2 x10 = (com.google.android.gms.internal.cast.X2) concurrentHashMap.putIfAbsent(cls, x2K);
        return x10 == null ? x2K : x10;
    }
}
