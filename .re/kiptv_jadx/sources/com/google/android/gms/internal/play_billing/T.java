package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.C1861n f19288a = new com.google.android.gms.internal.play_billing.C1861n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile java.util.logging.Logger f19290c;

    public T(java.lang.Class cls) {
        this.f19289b = cls.getName();
    }

    public final java.util.logging.Logger a() {
        java.util.logging.Logger logger = this.f19290c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f19288a) {
            try {
                java.util.logging.Logger logger2 = this.f19290c;
                if (logger2 != null) {
                    return logger2;
                }
                java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(this.f19289b);
                this.f19290c = logger3;
                return logger3;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
