package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1891f extends com.google.common.util.concurrent.AbstractC1887b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f19435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f19436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f19437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f19438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f19439e;

    public C1891f(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f19435a = atomicReferenceFieldUpdater;
        this.f19436b = atomicReferenceFieldUpdater2;
        this.f19437c = atomicReferenceFieldUpdater3;
        this.f19438d = atomicReferenceFieldUpdater4;
        this.f19439e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final boolean a(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, com.google.common.util.concurrent.C1890e c1890e, com.google.common.util.concurrent.C1890e c1890e2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19438d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1902q, c1890e, c1890e2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1902q) == c1890e);
        return false;
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final boolean b(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19439e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1902q, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1902q) == obj);
        return false;
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final boolean c(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, com.google.common.util.concurrent.C1901p c1901p, com.google.common.util.concurrent.C1901p c1901p2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19437c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1902q, c1901p, c1901p2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1902q) == c1901p);
        return false;
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final com.google.common.util.concurrent.C1890e d(com.google.common.util.concurrent.AbstractC1902q abstractC1902q) {
        return (com.google.common.util.concurrent.C1890e) this.f19438d.getAndSet(abstractC1902q, com.google.common.util.concurrent.C1890e.f19431d);
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final com.google.common.util.concurrent.C1901p e(com.google.common.util.concurrent.AbstractC1902q abstractC1902q) {
        return (com.google.common.util.concurrent.C1901p) this.f19437c.getAndSet(abstractC1902q, com.google.common.util.concurrent.C1901p.f19448c);
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final void f(com.google.common.util.concurrent.C1901p c1901p, com.google.common.util.concurrent.C1901p c1901p2) {
        this.f19436b.lazySet(c1901p, c1901p2);
    }

    @Override // com.google.common.util.concurrent.AbstractC1887b
    public final void g(com.google.common.util.concurrent.C1901p c1901p, java.lang.Thread thread) {
        this.f19435a.lazySet(c1901p, thread);
    }
}
