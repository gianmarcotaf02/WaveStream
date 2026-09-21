package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class G extends java.util.concurrent.locks.AbstractOwnableSynchronizer implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.common.util.concurrent.H f19409h;

    public G(com.google.common.util.concurrent.H h9) {
        this.f19409h = h9;
    }

    public static void a(com.google.common.util.concurrent.G g, java.lang.Thread thread) {
        g.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final java.lang.String toString() {
        return this.f19409h.toString();
    }
}
