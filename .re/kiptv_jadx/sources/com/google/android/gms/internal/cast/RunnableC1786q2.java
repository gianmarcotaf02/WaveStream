package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1786q2 extends com.google.android.gms.internal.cast.AbstractC1750h2 implements java.lang.Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f19028r;

    public RunnableC1786q2(java.lang.Runnable runnable) {
        super(11);
        runnable.getClass();
        this.f19028r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f19028r.run();
        } catch (java.lang.Throwable th) {
            if (com.google.android.gms.internal.cast.AbstractC1750h2.f18920p.r(this, null, new com.google.android.gms.internal.cast.C1722a2(th))) {
                com.google.android.gms.internal.cast.AbstractC1750h2.x(this);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1750h2
    public final java.lang.String t() {
        return Y6.f.h("task=[", this.f19028r.toString(), "]");
    }
}
