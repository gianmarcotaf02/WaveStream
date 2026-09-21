package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class U implements com.google.android.gms.internal.cast.T {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1799u0 f18822l = new com.google.android.gms.internal.cast.C1799u0(10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.V f18824i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile java.lang.Object f18825k;

    public U() {
        this.f18823h = 1;
        this.f18824i = new com.google.android.gms.internal.cast.V();
        this.j = com.google.android.gms.internal.cast.AbstractC1750h2.class.getName();
    }

    public java.util.logging.Logger a() {
        java.util.logging.Logger logger = (java.util.logging.Logger) this.f18825k;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f18824i) {
            try {
                java.util.logging.Logger logger2 = (java.util.logging.Logger) this.f18825k;
                if (logger2 != null) {
                    return logger2;
                }
                java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger((java.lang.String) this.j);
                this.f18825k = logger3;
                return logger3;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.T
    public java.lang.Object c() {
        com.google.android.gms.internal.cast.T t9 = (com.google.android.gms.internal.cast.T) this.f18825k;
        com.google.android.gms.internal.cast.C1799u0 c1799u0 = f18822l;
        if (t9 != c1799u0) {
            synchronized (this.f18824i) {
                try {
                    if (((com.google.android.gms.internal.cast.T) this.f18825k) != c1799u0) {
                        java.lang.Object objC = ((com.google.android.gms.internal.cast.T) this.f18825k).c();
                        this.j = objC;
                        this.f18825k = c1799u0;
                        return objC;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return this.j;
    }

    public java.lang.String toString() {
        switch (this.f18823h) {
            case 0:
                java.lang.Object objH = (com.google.android.gms.internal.cast.T) this.f18825k;
                if (objH == f18822l) {
                    objH = Y6.f.h("<supplier that returned ", java.lang.String.valueOf(this.j), ">");
                }
                return Y6.f.h("Suppliers.memoize(", java.lang.String.valueOf(objH), ")");
            default:
                return super.toString();
        }
    }

    public U(com.google.android.gms.internal.cast.C1799u0 c1799u0) {
        this.f18823h = 0;
        this.f18824i = new com.google.android.gms.internal.cast.V();
        this.f18825k = c1799u0;
    }
}
