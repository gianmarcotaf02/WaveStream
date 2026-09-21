package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1892g implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.common.util.concurrent.AbstractC1902q f19440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.common.util.concurrent.J f19441i;

    public RunnableC1892g(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, com.google.common.util.concurrent.J j) {
        this.f19440h = abstractC1902q;
        this.f19441i = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.AbstractC1902q abstractC1902q = this.f19440h;
        if (abstractC1902q.value != this) {
            return;
        }
        if (com.google.common.util.concurrent.AbstractC1902q.ATOMIC_HELPER.b(abstractC1902q, this, com.google.common.util.concurrent.AbstractC1902q.g(this.f19441i))) {
            com.google.common.util.concurrent.AbstractC1902q.d(abstractC1902q, false);
        }
    }
}
