package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class T extends com.google.common.util.concurrent.A implements java.util.concurrent.RunnableFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile com.google.common.util.concurrent.S f19422h;

    public T(java.util.concurrent.Callable callable) {
        this.f19422h = new com.google.common.util.concurrent.S(this, callable);
    }

    @Override // com.google.common.util.concurrent.AbstractC1902q
    public final void afterDone() {
        com.google.common.util.concurrent.S s9;
        super.afterDone();
        if (wasInterrupted() && (s9 = this.f19422h) != null) {
            s9.c();
        }
        this.f19422h = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC1902q
    public final java.lang.String pendingToString() {
        com.google.common.util.concurrent.S s9 = this.f19422h;
        if (s9 == null) {
            return super.pendingToString();
        }
        return "task=[" + s9 + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.S s9 = this.f19422h;
        if (s9 != null) {
            s9.run();
        }
        this.f19422h = null;
    }
}
