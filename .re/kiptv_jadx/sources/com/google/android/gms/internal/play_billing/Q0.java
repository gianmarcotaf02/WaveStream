package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.Q0 f19276c = new com.google.android.gms.internal.play_billing.Q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f19278b = new java.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.G0 f19277a = new com.google.android.gms.internal.play_billing.G0();

    public final com.google.android.gms.internal.play_billing.T0 a(java.lang.Class cls) {
        com.google.android.gms.internal.play_billing.T0 t0U;
        java.nio.charset.Charset charset = com.google.android.gms.internal.play_billing.B0.f19193a;
        if (cls == null) {
            throw new java.lang.NullPointerException("messageType");
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f19278b;
        com.google.android.gms.internal.play_billing.T0 t9 = (com.google.android.gms.internal.play_billing.T0) concurrentHashMap.get(cls);
        if (t9 != null) {
            return t9;
        }
        com.google.android.gms.internal.play_billing.G0 g9 = this.f19277a;
        g9.getClass();
        com.google.android.gms.internal.play_billing.C1873t0 c1873t0 = com.google.android.gms.internal.play_billing.U0.f19291a;
        if (!com.google.android.gms.internal.play_billing.AbstractC1877v0.class.isAssignableFrom(cls)) {
            int i3 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
        }
        com.google.android.gms.internal.play_billing.S0 s0A = ((com.google.android.gms.internal.play_billing.G0) g9.f19215a).a(cls);
        if ((s0A.f19287d & 2) == 2) {
            int i9 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
            com.google.android.gms.internal.play_billing.C1873t0 c1873t1 = com.google.android.gms.internal.play_billing.U0.f19291a;
            com.google.android.gms.internal.play_billing.C1873t0 c1873t2 = com.google.android.gms.internal.play_billing.AbstractC1869r0.f19380a;
            t0U = new com.google.android.gms.internal.play_billing.O0(c1873t1, s0A.f19284a);
        } else {
            int i10 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
            int i11 = com.google.android.gms.internal.play_billing.P0.f19273a;
            int i12 = com.google.android.gms.internal.play_billing.F0.f19213a;
            com.google.android.gms.internal.play_billing.C1873t0 c1873t3 = com.google.android.gms.internal.play_billing.U0.f19291a;
            com.google.android.gms.internal.play_billing.C1873t0 c1873t4 = s0A.a() + (-1) != 1 ? com.google.android.gms.internal.play_billing.AbstractC1869r0.f19380a : null;
            int i13 = com.google.android.gms.internal.play_billing.I0.f19226a;
            t0U = com.google.android.gms.internal.play_billing.N0.u(s0A, c1873t3, c1873t4);
        }
        com.google.android.gms.internal.play_billing.T0 t10 = (com.google.android.gms.internal.play_billing.T0) concurrentHashMap.putIfAbsent(cls, t0U);
        return t10 != null ? t10 : t0U;
    }
}
