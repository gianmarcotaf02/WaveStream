package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class N extends com.google.common.util.concurrent.AbstractC1895j implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f19418h;

    public N(java.lang.Runnable runnable) {
        runnable.getClass();
        this.f19418h = runnable;
    }

    @Override // com.google.common.util.concurrent.AbstractC1902q
    public final java.lang.String pendingToString() {
        return "task=[" + this.f19418h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f19418h.run();
        } catch (java.lang.Throwable th) {
            setException(th);
            throw th;
        }
    }
}
