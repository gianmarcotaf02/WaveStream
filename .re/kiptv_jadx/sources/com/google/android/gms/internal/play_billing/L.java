package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public abstract class L extends com.google.android.gms.internal.play_billing.Y implements com.google.android.gms.internal.play_billing.U {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.lang.Object f19251k = new java.lang.Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.T f19252l = new com.google.android.gms.internal.play_billing.T(com.google.android.gms.internal.play_billing.X.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f19253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final R8.i f19254n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.Object f19255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.F f19256i;
    public volatile com.google.android.gms.internal.play_billing.K j;

    static {
        boolean z6;
        R8.i i3;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        try {
            z6 = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z6 = false;
        }
        f19253m = z6;
        java.lang.String property = java.lang.System.getProperty("java.runtime.name", "");
        java.lang.Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                i3 = new com.google.android.gms.internal.play_billing.J();
            } catch (java.lang.Error | java.lang.Exception e6) {
                try {
                    i3 = new com.google.android.gms.internal.play_billing.H();
                } catch (java.lang.Error | java.lang.Exception e9) {
                    th3 = e9;
                    i3 = new com.google.android.gms.internal.play_billing.I();
                }
                th = th3;
                th2 = e6;
            }
        } else {
            try {
                i3 = new com.google.android.gms.internal.play_billing.H();
            } catch (java.lang.NoClassDefFoundError unused2) {
                i3 = new com.google.android.gms.internal.play_billing.I();
            }
        }
        th = null;
        th2 = null;
        f19254n = i3;
        if (th != null) {
            com.google.android.gms.internal.play_billing.T t9 = f19252l;
            java.util.logging.Logger loggerA = t9.a();
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            t9.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void c(com.google.android.gms.internal.play_billing.K k9) {
        k9.f19244a = null;
        while (true) {
            com.google.android.gms.internal.play_billing.K k10 = this.j;
            if (k10 != com.google.android.gms.internal.play_billing.K.f19243c) {
                com.google.android.gms.internal.play_billing.K k11 = null;
                while (k10 != null) {
                    com.google.android.gms.internal.play_billing.K k12 = k10.f19245b;
                    if (k10.f19244a != null) {
                        k11 = k10;
                    } else if (k11 != null) {
                        k11.f19245b = k12;
                        if (k11.f19244a == null) {
                        }
                    } else if (!f19254n.N(this, k10, k12)) {
                    }
                    k10 = k12;
                }
                return;
            }
            return;
        }
    }
}
